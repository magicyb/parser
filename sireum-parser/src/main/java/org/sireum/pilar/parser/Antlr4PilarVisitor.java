// Generated from /Users/robby/Repositories/sireum-parser/sireum-parser/src/main/java/org/sireum/pilar/parser/Antlr4Pilar.g4 by ANTLR 4.1
package org.sireum.pilar.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Antlr4PilarParser}.
 * 
 * @param <T>
 *          The return type of the visit operation. Use {@link Void} for
 *          operations with no return type.
 */
public interface Antlr4PilarVisitor<T>
    extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#AccessSuffix}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAccessSuffix(@NotNull Antlr4PilarParser.AccessSuffixContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ActionExtCall}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitActionExtCall(@NotNull Antlr4PilarParser.ActionExtCallContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ActionExtension}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitActionExtension(@NotNull Antlr4PilarParser.ActionExtensionContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#actionFile}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitActionFile(@NotNull Antlr4PilarParser.ActionFileContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#annExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnExp(@NotNull Antlr4PilarParser.AnnExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#annotatedType}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotatedType(@NotNull Antlr4PilarParser.AnnotatedTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#annotation}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotation(@NotNull Antlr4PilarParser.AnnotationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#annotationFile}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotationFile(@NotNull Antlr4PilarParser.AnnotationFileContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#AnnotationParamA}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotationParamA(@NotNull Antlr4PilarParser.AnnotationParamAContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#AnnotationParamE}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotationParamE(@NotNull Antlr4PilarParser.AnnotationParamEContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#AnnotationParamIA}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotationParamIA(
      @NotNull Antlr4PilarParser.AnnotationParamIAContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#AnnotationParamIE}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotationParamIE(
      @NotNull Antlr4PilarParser.AnnotationParamIEContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#AnnotationParamsA}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotationParamsA(
      @NotNull Antlr4PilarParser.AnnotationParamsAContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#AnnotationParamsE}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnnotationParamsE(
      @NotNull Antlr4PilarParser.AnnotationParamsEContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ArrayExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitArrayExp(@NotNull Antlr4PilarParser.ArrayExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#Assert}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAssert(@NotNull Antlr4PilarParser.AssertContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#Assign}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAssign(@NotNull Antlr4PilarParser.AssignContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#Assume}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAssume(@NotNull Antlr4PilarParser.AssumeContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#BinaryExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBinaryExp(@NotNull Antlr4PilarParser.BinaryExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#BinConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBinConstant(@NotNull Antlr4PilarParser.BinConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#binding}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBinding(@NotNull Antlr4PilarParser.BindingContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#BlockTransformation}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBlockTransformation(
      @NotNull Antlr4PilarParser.BlockTransformationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#CallSuffix}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitCallSuffix(@NotNull Antlr4PilarParser.CallSuffixContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#CallTransformation}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitCallTransformation(
      @NotNull Antlr4PilarParser.CallTransformationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#CastExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitCastExp(@NotNull Antlr4PilarParser.CastExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#catchClause}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitCatchClause(@NotNull Antlr4PilarParser.CatchClauseContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#CharConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitCharConstant(@NotNull Antlr4PilarParser.CharConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ClosureExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitClosureExp(@NotNull Antlr4PilarParser.ClosureExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ClosureType}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitClosureType(@NotNull Antlr4PilarParser.ClosureTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ConstantLit}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitConstantLit(@NotNull Antlr4PilarParser.ConstantLitContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#constDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitConstDeclaration(@NotNull Antlr4PilarParser.ConstDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#constElement}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitConstElement(@NotNull Antlr4PilarParser.ConstElementContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#DecConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitDecConstant(@NotNull Antlr4PilarParser.DecConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ElseGuard}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElseGuard(@NotNull Antlr4PilarParser.ElseGuardContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#EmptyBody}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitEmptyBody(@NotNull Antlr4PilarParser.EmptyBodyContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#enumDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitEnumDeclaration(@NotNull Antlr4PilarParser.EnumDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#enumElement}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitEnumElement(@NotNull Antlr4PilarParser.EnumElementContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ExpExtension}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExpExtension(@NotNull Antlr4PilarParser.ExpExtensionContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#expFile}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExpFile(@NotNull Antlr4PilarParser.ExpFileContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ExpGuard}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExpGuard(@NotNull Antlr4PilarParser.ExpGuardContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#extDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExtDeclaration(@NotNull Antlr4PilarParser.ExtDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#extendClause}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExtendClause(@NotNull Antlr4PilarParser.ExtendClauseContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#extendClauses}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExtendClauses(@NotNull Antlr4PilarParser.ExtendClausesContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#extParam}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExtParam(@NotNull Antlr4PilarParser.ExtParamContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#extParams}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExtParams(@NotNull Antlr4PilarParser.ExtParamsContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#extParamVariable}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExtParamVariable(@NotNull Antlr4PilarParser.ExtParamVariableContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#FalseConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFalseConstant(@NotNull Antlr4PilarParser.FalseConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#field}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitField(@NotNull Antlr4PilarParser.FieldContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#fieldFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFieldFragment(@NotNull Antlr4PilarParser.FieldFragmentContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#fieldInit}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFieldInit(@NotNull Antlr4PilarParser.FieldInitContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#FloatConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFloatConstant(@NotNull Antlr4PilarParser.FloatConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#funDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFunDeclaration(@NotNull Antlr4PilarParser.FunDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#GlobalNameExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGlobalNameExp(@NotNull Antlr4PilarParser.GlobalNameExpContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#globalVarDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGlobalVarDeclaration(
      @NotNull Antlr4PilarParser.GlobalVarDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#globalVarFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGlobalVarFragment(
      @NotNull Antlr4PilarParser.GlobalVarFragmentContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#globalVarsDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGlobalVarsDeclaration(
      @NotNull Antlr4PilarParser.GlobalVarsDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#gotoj}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGotoj(@NotNull Antlr4PilarParser.GotojContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#GotoJump}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGotoJump(@NotNull Antlr4PilarParser.GotoJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#HexConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitHexConstant(@NotNull Antlr4PilarParser.HexConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#IdConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIdConstant(@NotNull Antlr4PilarParser.IdConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ifElseExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIfElseExp(@NotNull Antlr4PilarParser.IfElseExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ifElseJump}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIfElseJump(@NotNull Antlr4PilarParser.IfElseJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#IfExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIfExp(@NotNull Antlr4PilarParser.IfExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#IfJump}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIfJump(@NotNull Antlr4PilarParser.IfJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ifThenExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIfThenExp(@NotNull Antlr4PilarParser.IfThenExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ifThenJump}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIfThenJump(@NotNull Antlr4PilarParser.IfThenJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ImplementedBody}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitImplementedBody(@NotNull Antlr4PilarParser.ImplementedBodyContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#IndexingSuffix}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIndexingSuffix(@NotNull Antlr4PilarParser.IndexingSuffixContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#jumpFile}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitJumpFile(@NotNull Antlr4PilarParser.JumpFileContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#LetExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLetExp(@NotNull Antlr4PilarParser.LetExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#lhs}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLhs(@NotNull Antlr4PilarParser.LhsContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#lhss}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLhss(@NotNull Antlr4PilarParser.LhssContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ListExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitListExp(@NotNull Antlr4PilarParser.ListExpContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#localVarDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLocalVarDeclaration(
      @NotNull Antlr4PilarParser.LocalVarDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#localVarFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLocalVarFragment(@NotNull Antlr4PilarParser.LocalVarFragmentContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#localVarsDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLocalVarsDeclaration(
      @NotNull Antlr4PilarParser.LocalVarsDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#location}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLocation(@NotNull Antlr4PilarParser.LocationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#locationFile}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLocationFile(@NotNull Antlr4PilarParser.LocationFileContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#MapExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMapExp(@NotNull Antlr4PilarParser.MapExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#mapping}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMapping(@NotNull Antlr4PilarParser.MappingContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#MapType}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMapType(@NotNull Antlr4PilarParser.MapTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#matching}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMatching(@NotNull Antlr4PilarParser.MatchingContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#model}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitModel(@NotNull Antlr4PilarParser.ModelContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#modelElement}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitModelElement(@NotNull Antlr4PilarParser.ModelElementContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#modelFile}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitModelFile(@NotNull Antlr4PilarParser.ModelFileContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#MultilineStringConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMultilineStringConstant(
      @NotNull Antlr4PilarParser.MultilineStringConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#MultiSeqExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMultiSeqExp(@NotNull Antlr4PilarParser.MultiSeqExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#MultiSeqFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMultiSeqFragment(@NotNull Antlr4PilarParser.MultiSeqFragmentContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#NamedType}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNamedType(@NotNull Antlr4PilarParser.NamedTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#NameExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNameExp(@NotNull Antlr4PilarParser.NameExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#newK}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNewK(@NotNull Antlr4PilarParser.NewKContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#newMultiSeqFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNewMultiSeqFragment(
      @NotNull Antlr4PilarParser.NewMultiSeqFragmentContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#NewMultiSeqFragmentEExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNewMultiSeqFragmentEExp(
      @NotNull Antlr4PilarParser.NewMultiSeqFragmentEExpContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#NewMultiSeqFragmentENew}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNewMultiSeqFragmentENew(
      @NotNull Antlr4PilarParser.NewMultiSeqFragmentENewContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#newMultiSeqTypeFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNewMultiSeqTypeFragment(
      @NotNull Antlr4PilarParser.NewMultiSeqTypeFragmentContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#NullConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNullConstant(@NotNull Antlr4PilarParser.NullConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#OctConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitOctConstant(@NotNull Antlr4PilarParser.OctConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#paramVar}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitParamVar(@NotNull Antlr4PilarParser.ParamVarContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#PrimaryExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitPrimaryExp(@NotNull Antlr4PilarParser.PrimaryExpContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#procedureDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitProcedureDeclaration(
      @NotNull Antlr4PilarParser.ProcedureDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ProcedureExtension}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitProcedureExtension(
      @NotNull Antlr4PilarParser.ProcedureExtensionContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ProcedureType}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitProcedureType(@NotNull Antlr4PilarParser.ProcedureTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#PTupleExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitPTupleExp(@NotNull Antlr4PilarParser.PTupleExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#RangedListExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRangedListExp(@NotNull Antlr4PilarParser.RangedListExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#recordDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRecordDeclaration(
      @NotNull Antlr4PilarParser.RecordDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#RecordExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRecordExp(@NotNull Antlr4PilarParser.RecordExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#RelationType}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRelationType(@NotNull Antlr4PilarParser.RelationTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#ReturnJump}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitReturnJump(@NotNull Antlr4PilarParser.ReturnJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#rhs}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRhs(@NotNull Antlr4PilarParser.RhsContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#SeqFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitSeqFragment(@NotNull Antlr4PilarParser.SeqFragmentContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#SetExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitSetExp(@NotNull Antlr4PilarParser.SetExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#SetFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitSetFragment(@NotNull Antlr4PilarParser.SetFragmentContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#Start}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitStart(@NotNull Antlr4PilarParser.StartContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#StaticMultiSeqFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitStaticMultiSeqFragment(
      @NotNull Antlr4PilarParser.StaticMultiSeqFragmentContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#StaticSeqFragment}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitStaticSeqFragment(
      @NotNull Antlr4PilarParser.StaticSeqFragmentContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#StringConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitStringConstant(@NotNull Antlr4PilarParser.StringConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#switchCaseJump}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitSwitchCaseJump(@NotNull Antlr4PilarParser.SwitchCaseJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#switchDefaultJump}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitSwitchDefaultJump(
      @NotNull Antlr4PilarParser.SwitchDefaultJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#SwitchJump}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitSwitchJump(@NotNull Antlr4PilarParser.SwitchJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#Throw}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitThrow(@NotNull Antlr4PilarParser.ThrowContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#transformationFile}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTransformationFile(
      @NotNull Antlr4PilarParser.TransformationFileContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#TrueConstant}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTrueConstant(@NotNull Antlr4PilarParser.TrueConstantContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#tupleExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTupleExp(@NotNull Antlr4PilarParser.TupleExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#TupleType}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTupleType(@NotNull Antlr4PilarParser.TupleTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#type}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitType(@NotNull Antlr4PilarParser.TypeContext ctx);

  /**
   * Visit a parse tree produced by
   * {@link Antlr4PilarParser#typealiasDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypealiasDeclaration(
      @NotNull Antlr4PilarParser.TypealiasDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#TypeExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypeExp(@NotNull Antlr4PilarParser.TypeExpContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#TypeExtension}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypeExtension(@NotNull Antlr4PilarParser.TypeExtensionContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#typeFile}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypeFile(@NotNull Antlr4PilarParser.TypeFileContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#typeParam}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypeParam(@NotNull Antlr4PilarParser.TypeParamContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#typeTuple}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypeTuple(@NotNull Antlr4PilarParser.TypeTupleContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#typeVar}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypeVar(@NotNull Antlr4PilarParser.TypeVarContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#typeVarTuple}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypeVarTuple(@NotNull Antlr4PilarParser.TypeVarTupleContext ctx);

  /**
   * Visit a parse tree produced by {@link Antlr4PilarParser#UnaryExp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUnaryExp(@NotNull Antlr4PilarParser.UnaryExpContext ctx);
}
