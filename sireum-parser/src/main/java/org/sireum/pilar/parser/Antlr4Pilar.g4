grammar Antlr4Pilar;

modelFile : model EOF;

annotationFile : annotation EOF;

locationFile : location EOF;

transformationFile : transformation EOF;

actionFile : action EOF;

jumpFile : jump EOF;

expFile : exp EOF;

typeFile : type EOF;


model
  : annotation* modelElement*
  ;

annotation
  : '@' ID annotationParams?
  ;

annotationParams
  : '(' annotationParam ( ',' annotationParam )* ')' #AnnotationParamsA
  | exp+                                             #AnnotationParamsE
  ;

annotationParam
  : ID '=' annotation #AnnotationParamIA
  | ID '=' exp        #AnnotationParamIE
  | annotation        #AnnotationParamA
  | exp               #AnnotationParamE
  ;

modelElement
  : constDeclaration
  | enumDeclaration
  | recordDeclaration
  | globalVarsDeclaration
  | procedureDeclaration
  | funDeclaration
  | extDeclaration
  ;

constDeclaration
  : 'const' ID annotation* '{' constElement* '}'
  ;

constElement
  : ID '=' constant annotation* ';'
  ;

enumDeclaration
  : 'enum' ID annotation* '{' ( enumElement ( ',' enumElement )* )? '}'
  ;

enumElement
  : ID annotation*
  ;

typealiasDeclaration
  : 'typealias' ID typeVarTuple? annotation*  '='  type ';'
  ;

typeVarTuple
  : '[' typeVar ( ',' typeVar )* ']'
  ;

typeVar
  : ID annotation*
  ;

recordDeclaration
  : 'record' ID typeVarTuple? annotation* extendClauses? '{' field* '}'
  ;

extendClauses
  : 'extends' extendClause ( ',' extendClause )*
  ;

extendClause
  : ID typeTuple? annotation*
  ;

typeTuple
  : '<' type ( ',' type )* '>'
  ;

field
  : fieldFragment ( ',' fieldFragment )* ':' type ';'
  | type? fieldFragment ( ',' fieldFragment )* ';'
  ;

fieldFragment
  : ID annotation*
  ;

globalVarsDeclaration
  : 'global' globalVarDeclaration+
  ;

globalVarDeclaration
  : globalVarFragment ( ',' globalVarFragment )* ':' type ';'
  | type? globalVarFragment ( ',' globalVarFragment )* ';'
  ;

globalVarFragment
  : GID annotation*
  ;

procedureDeclaration
  : 'procedure' typeVarTuple?
    ( ID ( '(' ( paramVar ( ',' paramVar )* )? ')' )? ':' type
      annotation* body
    | type?  ID ( '(' ( paramVar ( ',' paramVar )* )? ')' )?
      annotation* body
    )
  ;

paramVar
  : ID annotation* ':' type
  | type? ID annotation*
  ;

funDeclaration
  : 'fun' typeVarTuple?
    ( ID ( '(' ( paramVar ( ',' paramVar )* )? ')' )?
      annotation* ':' type '=' exp ';'
    | type? ID ( '(' ( paramVar ( ',' paramVar )* )? ')' )?
      annotation* '=' exp ';'
    )
  ;

extDeclaration
  : 'extension' typeVarTuple? ID annotation* '{' extElement* '}'
  ;

extElement
  : 'typedef'   typeVarTuple? ID annotation* extendClauses? ';'                   #TypeExtension
  | 'actiondef' typeVarTuple? ID ( '(' extParams? ')' )? annotation* ';'          #ActionExtension
  | 'expdef'    typeVarTuple? ID ( '(' extParams? ')' )? annotation* ':' type ';' #ExpExtension
  | 'expdef'    typeVarTuple? type? ID ( '(' extParams? ')' )? annotation* ';'    #ExpExtension
  | 'procdef'   typeVarTuple? ID ( '(' extParams? ')' )? annotation* ':' type ';' #ProcedureExtension
  | 'procdef'   typeVarTuple? type? ID ( '(' extParams? ')' )? annotation* ';'    #ProcedureExtension
  ;

extParams
  : extParam ( ',' extParam )* ( ',' extParamVariable )?
  | extParamVariable
  ;

extParam
  : ID annotation* ':' type
  | type ID? annotation*
  ;

extParamVariable
  : ID '...' annotation* ':' type
  | type '...' ID? annotation*
  ;

body
  : '{'
    localVarsDeclaration?
    location*
    catchClause*
    '}'                   #ImplementedBody
  | ';'                   #EmptyBody
  ;

localVarsDeclaration
  : localVarDeclaration+
  ;

localVarDeclaration
  : localVarFragment ( ',' localVarFragment )* ':' type ';'
  | type? localVarFragment ( ',' localVarFragment )* ';'
  ;

localVarFragment
  : ID annotation*
  ;

location
  : LID annotation*
    ( transformation ( '|' transformation )* )?
  ;

transformation
  : guard? 'call'
      ( clhs+=ID ( ',' clhs+=ID )* AssignOP )? p=ID
      tupleExp
      ( cans+=annotation )*
      gotoj? ( tanns+=annotation )*                 #CallTransformation
  | guard? action* jump?
      ( tanns+=annotation )*                        #BlockTransformation
  ;

guard
  : exp annotation* '+>' # ExpGuard
  | 'else' annotation*   # ElseGuard
  ;

action
  : 'assert' exp ( ',' exp )? annotation* ';'       #Assert
  | 'assume' exp ( ',' exp )? annotation* ';'       #Assume
  | 'throw'  exp annotation* ';'                    #Throw
  | 'start' typeTuple? ID ( '[' n=exp ']' )?
      tupleExp annotation* ';'                      #Start
  | ID typeTuple? tupleExp
    annotation* ';'                                 #ActionExtCall
  | lhss AssignOP rhs ( ',' rhs )* annotation* ';'  #Assign
  ;

lhss
  : lhs ( ',' lhs )*
  ;

lhs
  : exp annotation*
  ;

rhs
  : annotation* exp
  ;

jump
  : gotoj                                                           #GotoJump
  | 'return' ( exp ( ',' exp )* )? annotation* ';'                  #ReturnJump
  | ifThenJump ( 'else' ifThenJump )* ifElseJump? annotation* ';'   #IfJump
  | 'switch' exp switchCaseJump* switchDefaultJump? annotation* ';' #SwitchJump
  ;

gotoj
  : 'goto' ID annotation* ';'
  ;

ifThenJump
  : 'if' exp 'then' annotation* 'goto' ID
  ;

ifElseJump
  : 'else' annotation* 'goto' ID
  ;

switchCaseJump
  : '|' constant '=>' annotation* 'goto' ID
  ;

switchDefaultJump
  : '|' 'else' '=>' annotation* 'goto' ID
  ;

catchClause
  : 'catch' annotation*
    ( var=ID? ':' type | type? var=ID? )
    '@' '[' from=ID '..' to=ID ']' gotoj
  ;

exp
  : primary primarySuffix*                    #PrimaryExp
  | '(' type ')' exp                          #CastExp
  | op=( UnaryOP | AddOP | MulOP | ID ) exp   #UnaryExp
  | exp op=ID exp                             #BinaryExp
  | exp op=MulOP exp                          #BinaryExp
  | exp op=AddOP exp                          #BinaryExp
  | exp op=ShiftOP exp                        #BinaryExp
  | exp op=( RelOP | '<' | '>' ) exp          #BinaryExp
  | exp op=EqOP exp                           #BinaryExp
  | exp op=AndOP exp                          #BinaryExp
  | exp op=XorOP exp                          #BinaryExp
  | exp op=OrOP exp                           #BinaryExp
  | exp op=CondAndOP exp                      #BinaryExp
  | exp op=CondOrOP exp                       #BinaryExp
  | exp op=( '==>' | '<==' ) exp              #BinaryExp
  | ifThenExp ( 'else' ifThenExp )* ifElseExp #IfExp
  ;

ifThenExp
  : 'if' exp 'then' annotation* exp
  ;

ifElseExp
  : 'else' annotation* exp
  ;


primarySuffix
  : '[' exp ( ',' exp )* ']' #IndexingSuffix
  | '.' ID                   #AccessSuffix
  | typeTuple? tupleExp      #CallSuffix
  ;

primary
  : ID                                                   #NameExp
  | GID                                                  #GlobalNameExp
  | constant                                             #ConstantLit
  | tupleExp                                             #PTupleExp
  | 'let' binding ( ',' binding )* 'in' exp              #LetExp
  | newK '[' exp '..' exp ']'                            #RangedListExp
  | newK '[' ( exp ( ',' exp )* )? ']'                   #ListExp
  | newK '{' ( exp ( ',' exp )* )? '}'                   #SetExp
  | newK '{' ( '->' | mapping ( ',' mapping )* ) '}'     #MapExp
  | newK '['
    ( newMultiSeqFragment
      ( ',' newMultiSeqFragment )* )? ']'                #MultiSeqExp
  | newK '{' matching ( '|' matching )* '}'              #ClosureExp
  | newK ID typeTuple?
    '{' ( fieldInit ( ',' fieldInit )* )? '}'            #RecordExp
  | newK baseType newMultiSeqTypeFragment* typeFragment* #ArrayExp
  | '^' type                                             #TypeExp
  ;

tupleExp
  : '(' ( annExp ( ',' annExp )* )? ')'
  ;

annExp
  : exp annotation*
  ;

newK
  : '^' | 'new'
  ;

binding
  : ID ( ',' ID )? '=' exp
  ;

mapping
  : exp '->' exp
  ;

newMultiSeqFragment
  : '[' ( newMultiSeqFragmentE
        ( ',' newMultiSeqFragmentE )* )? ']'
  ;

newMultiSeqFragmentE
  : newMultiSeqFragment #NewMultiSeqFragmentENew
  | exp                 #NewMultiSeqFragmentEExp
  ;

matching
  : ( paramVar ( ',' paramVar )* )? '=>' exp
  ;

fieldInit
  : ID '=' exp
  ;

newMultiSeqTypeFragment
  : '[' exp ( ',' exp )* ']'
  ;

type
  : baseType typeFragment*
  ;

typeFragment
  : '[' ']'                            #SeqFragment
  | '[' constant ']'                   #StaticSeqFragment
  | '[' ( rank+=',' )+ ']'             #MultiSeqFragment
  | '[' constant ( ',' constant )+ ']' #StaticMultiSeqFragment
  | '{' '}'                            #SetFragment
  ;

constant
  : 'true'  #TrueConstant
  | 'false' #FalseConstant
  | 'null'  #NullConstant
  | ID      #IdConstant
  | CHAR    #CharConstant
  | HEX     #HexConstant
  | OCT     #OctConstant
  | DEC     #DecConstant
  | BIN     #BinConstant
  | FLOAT   #FloatConstant
  | STRING  #StringConstant
  | MSTRING #MultilineStringConstant
  ;

baseType
  : ID typeTuple?                                             #NamedType
  | '(' typeParam ( ',' typeParam )* '->' annotatedType? ')'  #ClosureType
	| '(' typeParam ( ',' typeParam )* '-!>' annotatedType? ')' #ProcedureType
  | '(' typeParam ( ',' typeParam)* ')'                       #TupleType
  | '{' typeParam ( ',' typeParam )* '->' annotatedType '}'   #MapType
  | '{' typeParam ( ',' typeParam )+ '}'                      #RelationType
  ;

typeParam
	: ID annotation* ':' type
  | type ID? annotation*
	;

annotatedType
	: type annotation*
	;

ID
	: IDFragment '\''*
	| '`' ( ~( '\n' | '\r' | '\t' | '\u000C' | '`' ) )* '`'
	;

GID
	: '@@' IDFragment
	;

LID
  : '#' ( ID '.'? )?
  ;

MSTRING
  : '"""' .*? '"""'
  ;

CondAndOP
	: '&' OPSuffix
	;

CondOrOP
	: '||' OPSuffix
	;

AndOP	: '^&' OPSuffix
	;

XorOP	: '^~' OPSuffix
	;

OrOP	: '^|' OPSuffix
	;

EqOP: ( '==' | '!=' ) OPSuffix
	;

RelOP
	: '<' OPCharMLT OPSuffix
	| '>' OPCharMGT OPSuffix
	;

ShiftOP
	: '^<' | '^>>' OPSuffix
	| '^>' ( OPCharMGT OPSuffix )?
	;

AddOP
	: ( '+' | '-' ) OPSuffix
	;

MulOP
	: ( '/' | '%' | '*' ) OPSuffix
	;

UnaryOP
	: ( '!' | '~' ) OPSuffix
	;

AssignOP
  :	':' OPChar+ '='
  ;

fragment
OPSuffix
	: OPChar* ( '_' IDFragment )?
	;

fragment
OPChar
	: ( '+' | '-' | '/' | '\\' | '*' | '%' | '&' | '|' | '?' | '>' | '<' | '=' | '~' )
	;

fragment
OPCharMGT
	: ( '+' | '-' | '/' | '\\' | '*' | '%' | '&' | '|' | '?' | '<' | '=' | '~' )
	;

fragment
OPCharMLT
	: ( '+' | '-' | '/' | '\\' | '*' | '%' | '&' | '|' | '?' | '>' | '=' | '~' )
	;

fragment
IDFragment
	: LETTER ( LETTER | DIGIT )*
	;

HEX
  : '0' ('x'|'X')
    HexDigits
    IntegerTypeSuffix?
  ;

DEC
  : ( '0' | '1'..'9' ('_'* Digit)* ) IntegerTypeSuffix?
  ;

OCT
  : '0' ('_'* '0'..'7')+ IntegerTypeSuffix?
  ;

BIN
  : '0' ('b'|'B')
    BinaryDigit ('_'* BinaryDigit)*
    IntegerTypeSuffix?
  ;

fragment
BinaryDigit : ('0'|'1') ;

fragment
HexDigits : HexDigit ('_'* HexDigit)* ;

fragment
HexDigit : (Digit|'a'..'f'|'A'..'F') ;

fragment
Digits : Digit ('_'* Digit)* ;

fragment
Digit : '0'..'9' ;

fragment
IntegerTypeSuffix : 'l' | 'L' | 'i'| 'I';

FLOAT
  : Digits '.' Digits? Exponent? FloatTypeSuffix?
  | '.' Digits Exponent? FloatTypeSuffix?
  | Digits Exponent FloatTypeSuffix?
  | Digits FloatTypeSuffix

    // Hex float literal
  | ('0x' | '0X')
    HexDigits? ('.' HexDigits?)?
    ( 'p' | 'P' ) ( '+' | '-' )? Digits // note decimal exponent
    FloatTypeSuffix?
  ;

fragment
Exponent : ('e'|'E') ('+'|'-')? Digits ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

CHAR
  : '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
  ;

STRING
  :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
  ;

fragment
EscapeSequence
  : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
  | UnicodeEscape
  | OctalEscape
  ;

fragment
OctalEscape
  : '\\' ('0'..'3') ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7')
  ;

fragment
UnicodeEscape
  : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
  ;

// From JavaCC's grammar
fragment
LETTER
  : '\u0024'                 // $
  | '\u0041'..'\u005a'       // A-Z
  | '\u005f'                 // _
  | '\u0061'..'\u007a'       // a-z
  | '\u00c0'..'\u00d6'       // Latin Capital LETTER A with grave - Latin Capital letter O with diaeresis
  | '\u00d8'..'\u00f6'       // Latin Capital letter O with stroke - Latin Small LETTER O with diaeresis
  | '\u00f8'..'\u00ff'       // Latin Small LETTER O with stroke - Latin Small LETTER Y with diaeresis
  | '\u0100'..'\u1fff'       // Latin Capital LETTER A with macron - Latin Small LETTER O with stroke and acute
  | '\u3040'..'\u318f'       // Hiragana
  | '\u3300'..'\u337f'       // CJK compatibility
  | '\u3400'..'\u3d2d'       // CJK compatibility
  | '\u4e00'..'\u9fff'       // CJK compatibility
  | '\uf900'..'\ufaff'       // CJK compatibility
  ;

fragment
DIGIT
  : '\u0030'..'\u0039'       // 0-9
  | '\u0660'..'\u0669'       // Arabic-Indic Digit 0-9
  | '\u06f0'..'\u06f9'       // Extended Arabic-Indic Digit 0-9
  | '\u0966'..'\u096f'       // Devanagari 0-9
  | '\u09e6'..'\u09ef'       // Bengali 0-9
  | '\u0a66'..'\u0a6f'       // Gurmukhi 0-9
  | '\u0ae6'..'\u0aef'       // Gujarati 0-9
  | '\u0b66'..'\u0b6f'       // Oriya 0-9
  | '\u0be7'..'\u0bef'       // Tami 0-9
  | '\u0c66'..'\u0c6f'       // Telugu 0-9
  | '\u0ce6'..'\u0cef'       // Kannada 0-9
  | '\u0d66'..'\u0d6f'       // Malayala 0-9
  | '\u0e50'..'\u0e59'       // Thai 0-9
  | '\u0ed0'..'\u0ed9'       // Lao 0-9
  | '\u1040'..'\u1049'       // Myanmar 0-9?
  ;

WS
  : [ \r\t\u000C\n]+ -> channel(HIDDEN)
  ;

COMMENT
  : '/*' .*? '*/'    -> channel(2)
  ;

LINE_COMMENT
  : '//' ~[\r\n]*    -> channel(2)
  ;
