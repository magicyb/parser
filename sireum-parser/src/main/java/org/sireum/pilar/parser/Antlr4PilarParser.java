// Generated from /Users/robby/Repositories/sireum-parser/sireum-parser/src/main/java/org/sireum/pilar/parser/Antlr4Pilar.g4 by ANTLR 4.1
package org.sireum.pilar.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class Antlr4PilarParser extends Parser {
  public static class AccessSuffixContext extends PrimarySuffixContext {
    public AccessSuffixContext(final PrimarySuffixContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAccessSuffix(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAccessSuffix(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAccessSuffix(this);
      }
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class ActionContext extends ParserRuleContext {
    public ActionContext() {
    }

    public ActionContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final ActionContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_action;
    }
  }

  public static class ActionExtCallContext extends ActionContext {
    public ActionExtCallContext(final ActionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitActionExtCall(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterActionExtCall(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitActionExtCall(this);
      }
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TupleExpContext tupleExp() {
      return getRuleContext(TupleExpContext.class, 0);
    }

    public TypeTupleContext typeTuple() {
      return getRuleContext(TypeTupleContext.class, 0);
    }
  }

  public static class ActionExtensionContext extends ExtElementContext {
    public ActionExtensionContext(final ExtElementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitActionExtension(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterActionExtension(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitActionExtension(this);
      }
    }

    public ExtParamsContext extParams() {
      return getRuleContext(ExtParamsContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class ActionFileContext extends ParserRuleContext {
    public ActionFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitActionFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public ActionContext action() {
      return getRuleContext(ActionContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterActionFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitActionFile(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_actionFile;
    }
  }

  public static class AnnExpContext extends ParserRuleContext {
    public AnnExpContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitAnnExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnExp(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_annExp;
    }
  }

  public static class AnnotatedTypeContext extends ParserRuleContext {
    public AnnotatedTypeContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotatedType(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotatedType(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotatedType(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_annotatedType;
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class AnnotationContext extends ParserRuleContext {
    public AnnotationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotation(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public AnnotationParamsContext annotationParams() {
      return getRuleContext(AnnotationParamsContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotation(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotation(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_annotation;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class AnnotationFileContext extends ParserRuleContext {
    public AnnotationFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotationFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public AnnotationContext annotation() {
      return getRuleContext(AnnotationContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotationFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotationFile(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_annotationFile;
    }
  }

  public static class AnnotationParamAContext extends AnnotationParamContext {
    public AnnotationParamAContext(final AnnotationParamContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotationParamA(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public AnnotationContext annotation() {
      return getRuleContext(AnnotationContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotationParamA(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotationParamA(this);
      }
    }
  }

  public static class AnnotationParamContext extends ParserRuleContext {
    public AnnotationParamContext() {
    }

    public AnnotationParamContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final AnnotationParamContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_annotationParam;
    }
  }

  public static class AnnotationParamEContext extends AnnotationParamContext {
    public AnnotationParamEContext(final AnnotationParamContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotationParamE(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotationParamE(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotationParamE(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }
  }

  public static class AnnotationParamIAContext extends AnnotationParamContext {
    public AnnotationParamIAContext(final AnnotationParamContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotationParamIA(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public AnnotationContext annotation() {
      return getRuleContext(AnnotationContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotationParamIA(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotationParamIA(this);
      }
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class AnnotationParamIEContext extends AnnotationParamContext {
    public AnnotationParamIEContext(final AnnotationParamContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotationParamIE(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotationParamIE(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotationParamIE(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class AnnotationParamsAContext extends AnnotationParamsContext {
    public AnnotationParamsAContext(final AnnotationParamsContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotationParamsA(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationParamContext> annotationParam() {
      return getRuleContexts(AnnotationParamContext.class);
    }

    public AnnotationParamContext annotationParam(final int i) {
      return getRuleContext(AnnotationParamContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotationParamsA(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotationParamsA(this);
      }
    }
  }

  public static class AnnotationParamsContext extends ParserRuleContext {
    public AnnotationParamsContext() {
    }

    public AnnotationParamsContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final AnnotationParamsContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_annotationParams;
    }
  }

  public static class AnnotationParamsEContext extends AnnotationParamsContext {
    public AnnotationParamsEContext(final AnnotationParamsContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitAnnotationParamsE(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAnnotationParamsE(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAnnotationParamsE(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }
  }

  public static class ArrayExpContext extends PrimaryContext {
    public ArrayExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitArrayExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public BaseTypeContext baseType() {
      return getRuleContext(BaseTypeContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterArrayExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitArrayExp(this);
      }
    }

    public NewKContext newK() {
      return getRuleContext(NewKContext.class, 0);
    }

    public List<NewMultiSeqTypeFragmentContext> newMultiSeqTypeFragment() {
      return getRuleContexts(NewMultiSeqTypeFragmentContext.class);
    }

    public NewMultiSeqTypeFragmentContext newMultiSeqTypeFragment(final int i) {
      return getRuleContext(NewMultiSeqTypeFragmentContext.class, i);
    }

    public List<TypeFragmentContext> typeFragment() {
      return getRuleContexts(TypeFragmentContext.class);
    }

    public TypeFragmentContext typeFragment(final int i) {
      return getRuleContext(TypeFragmentContext.class, i);
    }
  }

  public static class AssertContext extends ActionContext {
    public AssertContext(final ActionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitAssert(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAssert(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAssert(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }
  }

  public static class AssignContext extends ActionContext {
    public AssignContext(final ActionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitAssign(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    public TerminalNode AssignOP() {
      return getToken(Antlr4PilarParser.AssignOP, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAssign(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAssign(this);
      }
    }

    public LhssContext lhss() {
      return getRuleContext(LhssContext.class, 0);
    }

    public List<RhsContext> rhs() {
      return getRuleContexts(RhsContext.class);
    }

    public RhsContext rhs(final int i) {
      return getRuleContext(RhsContext.class, i);
    }
  }

  public static class AssumeContext extends ActionContext {
    public AssumeContext(final ActionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitAssume(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterAssume(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitAssume(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }
  }

  public static class BaseTypeContext extends ParserRuleContext {
    public BaseTypeContext() {
    }

    public BaseTypeContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final BaseTypeContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_baseType;
    }
  }

  public static class BinaryExpContext extends ExpContext {
    public Token op;

    public BinaryExpContext(final ExpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitBinaryExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterBinaryExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitBinaryExp(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }
  }

  public static class BinConstantContext extends ConstantContext {
    public BinConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitBinConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public TerminalNode BIN() {
      return getToken(Antlr4PilarParser.BIN, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterBinConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitBinConstant(this);
      }
    }
  }

  public static class BindingContext extends ParserRuleContext {
    public BindingContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitBinding(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterBinding(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitBinding(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_binding;
    }

    public List<TerminalNode> ID() {
      return getTokens(Antlr4PilarParser.ID);
    }

    public TerminalNode ID(final int i) {
      return getToken(Antlr4PilarParser.ID, i);
    }
  }

  public static class BlockTransformationContext extends TransformationContext {
    public AnnotationContext annotation;
    public List<AnnotationContext> tanns = new ArrayList<AnnotationContext>();

    public BlockTransformationContext(final TransformationContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitBlockTransformation(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<ActionContext> action() {
      return getRuleContexts(ActionContext.class);
    }

    public ActionContext action(final int i) {
      return getRuleContext(ActionContext.class, i);
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterBlockTransformation(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitBlockTransformation(this);
      }
    }

    public GuardContext guard() {
      return getRuleContext(GuardContext.class, 0);
    }

    public JumpContext jump() {
      return getRuleContext(JumpContext.class, 0);
    }
  }

  public static class BodyContext extends ParserRuleContext {
    public BodyContext() {
    }

    public BodyContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final BodyContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_body;
    }
  }

  public static class CallSuffixContext extends PrimarySuffixContext {
    public CallSuffixContext(final PrimarySuffixContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitCallSuffix(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterCallSuffix(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitCallSuffix(this);
      }
    }

    public TupleExpContext tupleExp() {
      return getRuleContext(TupleExpContext.class, 0);
    }

    public TypeTupleContext typeTuple() {
      return getRuleContext(TypeTupleContext.class, 0);
    }
  }

  public static class CallTransformationContext extends TransformationContext {
    public Token ID;
    public List<Token> clhs = new ArrayList<Token>();
    public Token p;
    public AnnotationContext annotation;
    public List<AnnotationContext> cans = new ArrayList<AnnotationContext>();
    public List<AnnotationContext> tanns = new ArrayList<AnnotationContext>();

    public CallTransformationContext(final TransformationContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitCallTransformation(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    public TerminalNode AssignOP() {
      return getToken(Antlr4PilarParser.AssignOP, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterCallTransformation(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitCallTransformation(this);
      }
    }

    public GotojContext gotoj() {
      return getRuleContext(GotojContext.class, 0);
    }

    public GuardContext guard() {
      return getRuleContext(GuardContext.class, 0);
    }

    public List<TerminalNode> ID() {
      return getTokens(Antlr4PilarParser.ID);
    }

    public TerminalNode ID(final int i) {
      return getToken(Antlr4PilarParser.ID, i);
    }

    public TupleExpContext tupleExp() {
      return getRuleContext(TupleExpContext.class, 0);
    }
  }

  public static class CastExpContext extends ExpContext {
    public CastExpContext(final ExpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitCastExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterCastExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitCastExp(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class CatchClauseContext extends ParserRuleContext {
    public Token var;
    public Token from;
    public Token to;

    public CatchClauseContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitCatchClause(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterCatchClause(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitCatchClause(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_catchClause;
    }

    public GotojContext gotoj() {
      return getRuleContext(GotojContext.class, 0);
    }

    public List<TerminalNode> ID() {
      return getTokens(Antlr4PilarParser.ID);
    }

    public TerminalNode ID(final int i) {
      return getToken(Antlr4PilarParser.ID, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class CharConstantContext extends ConstantContext {
    public CharConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitCharConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public TerminalNode CHAR() {
      return getToken(Antlr4PilarParser.CHAR, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterCharConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitCharConstant(this);
      }
    }
  }

  public static class ClosureExpContext extends PrimaryContext {
    public ClosureExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitClosureExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterClosureExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitClosureExp(this);
      }
    }

    public List<MatchingContext> matching() {
      return getRuleContexts(MatchingContext.class);
    }

    public MatchingContext matching(final int i) {
      return getRuleContext(MatchingContext.class, i);
    }

    public NewKContext newK() {
      return getRuleContext(NewKContext.class, 0);
    }
  }

  public static class ClosureTypeContext extends BaseTypeContext {
    public ClosureTypeContext(final BaseTypeContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitClosureType(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public AnnotatedTypeContext annotatedType() {
      return getRuleContext(AnnotatedTypeContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterClosureType(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitClosureType(this);
      }
    }

    public List<TypeParamContext> typeParam() {
      return getRuleContexts(TypeParamContext.class);
    }

    public TypeParamContext typeParam(final int i) {
      return getRuleContext(TypeParamContext.class, i);
    }
  }

  public static class ConstantContext extends ParserRuleContext {
    public ConstantContext() {
    }

    public ConstantContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final ConstantContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_constant;
    }
  }

  public static class ConstantLitContext extends PrimaryContext {
    public ConstantLitContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitConstantLit(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public ConstantContext constant() {
      return getRuleContext(ConstantContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterConstantLit(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitConstantLit(this);
      }
    }
  }

  public static class ConstDeclarationContext extends ParserRuleContext {
    public ConstDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitConstDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    public List<ConstElementContext> constElement() {
      return getRuleContexts(ConstElementContext.class);
    }

    public ConstElementContext constElement(final int i) {
      return getRuleContext(ConstElementContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterConstDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitConstDeclaration(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_constDeclaration;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class ConstElementContext extends ParserRuleContext {
    public ConstElementContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitConstElement(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    public ConstantContext constant() {
      return getRuleContext(ConstantContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterConstElement(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitConstElement(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_constElement;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class DecConstantContext extends ConstantContext {
    public DecConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitDecConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public TerminalNode DEC() {
      return getToken(Antlr4PilarParser.DEC, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterDecConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitDecConstant(this);
      }
    }
  }

  public static class ElseGuardContext extends GuardContext {
    public ElseGuardContext(final GuardContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitElseGuard(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterElseGuard(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitElseGuard(this);
      }
    }
  }

  public static class EmptyBodyContext extends BodyContext {
    public EmptyBodyContext(final BodyContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitEmptyBody(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterEmptyBody(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitEmptyBody(this);
      }
    }
  }

  public static class EnumDeclarationContext extends ParserRuleContext {
    public EnumDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitEnumDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterEnumDeclaration(this);
      }
    }

    public List<EnumElementContext> enumElement() {
      return getRuleContexts(EnumElementContext.class);
    }

    public EnumElementContext enumElement(final int i) {
      return getRuleContext(EnumElementContext.class, i);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitEnumDeclaration(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_enumDeclaration;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class EnumElementContext extends ParserRuleContext {
    public EnumElementContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitEnumElement(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterEnumElement(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitEnumElement(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_enumElement;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class ExpContext extends ParserRuleContext {
    public int _p;

    public ExpContext() {
    }

    public ExpContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    public ExpContext(final ParserRuleContext parent, final int invokingState,
        final int _p) {
      super(parent, invokingState);
      this._p = _p;
    }

    public void copyFrom(final ExpContext ctx) {
      super.copyFrom(ctx);
      this._p = ctx._p;
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_exp;
    }
  }

  public static class ExpExtensionContext extends ExtElementContext {
    public ExpExtensionContext(final ExtElementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitExpExtension(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExpExtension(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExpExtension(this);
      }
    }

    public ExtParamsContext extParams() {
      return getRuleContext(ExtParamsContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class ExpFileContext extends ParserRuleContext {
    public ExpFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitExpFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExpFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExpFile(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_expFile;
    }
  }

  public static class ExpGuardContext extends GuardContext {
    public ExpGuardContext(final GuardContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitExpGuard(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExpGuard(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExpGuard(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }
  }

  public static class ExtDeclarationContext extends ParserRuleContext {
    public ExtDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitExtDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExtDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExtDeclaration(this);
      }
    }

    public List<ExtElementContext> extElement() {
      return getRuleContexts(ExtElementContext.class);
    }

    public ExtElementContext extElement(final int i) {
      return getRuleContext(ExtElementContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_extDeclaration;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class ExtElementContext extends ParserRuleContext {
    public ExtElementContext() {
    }

    public ExtElementContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final ExtElementContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_extElement;
    }
  }

  public static class ExtendClauseContext extends ParserRuleContext {
    public ExtendClauseContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitExtendClause(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExtendClause(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExtendClause(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_extendClause;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeTupleContext typeTuple() {
      return getRuleContext(TypeTupleContext.class, 0);
    }
  }

  public static class ExtendClausesContext extends ParserRuleContext {
    public ExtendClausesContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitExtendClauses(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExtendClauses(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExtendClauses(this);
      }
    }

    public List<ExtendClauseContext> extendClause() {
      return getRuleContexts(ExtendClauseContext.class);
    }

    public ExtendClauseContext extendClause(final int i) {
      return getRuleContext(ExtendClauseContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_extendClauses;
    }
  }

  public static class ExtParamContext extends ParserRuleContext {
    public ExtParamContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitExtParam(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExtParam(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExtParam(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_extParam;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class ExtParamsContext extends ParserRuleContext {
    public ExtParamsContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitExtParams(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExtParams(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExtParams(this);
      }
    }

    public List<ExtParamContext> extParam() {
      return getRuleContexts(ExtParamContext.class);
    }

    public ExtParamContext extParam(final int i) {
      return getRuleContext(ExtParamContext.class, i);
    }

    public ExtParamVariableContext extParamVariable() {
      return getRuleContext(ExtParamVariableContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_extParams;
    }
  }

  public static class ExtParamVariableContext extends ParserRuleContext {
    public ExtParamVariableContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitExtParamVariable(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterExtParamVariable(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitExtParamVariable(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_extParamVariable;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class FalseConstantContext extends ConstantContext {
    public FalseConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitFalseConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterFalseConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitFalseConstant(this);
      }
    }
  }

  public static class FieldContext extends ParserRuleContext {
    public FieldContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitField(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterField(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitField(this);
      }
    }

    public List<FieldFragmentContext> fieldFragment() {
      return getRuleContexts(FieldFragmentContext.class);
    }

    public FieldFragmentContext fieldFragment(final int i) {
      return getRuleContext(FieldFragmentContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_field;
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class FieldFragmentContext extends ParserRuleContext {
    public FieldFragmentContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitFieldFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterFieldFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitFieldFragment(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_fieldFragment;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class FieldInitContext extends ParserRuleContext {
    public FieldInitContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitFieldInit(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterFieldInit(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitFieldInit(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_fieldInit;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class FloatConstantContext extends ConstantContext {
    public FloatConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitFloatConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterFloatConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitFloatConstant(this);
      }
    }

    public TerminalNode FLOAT() {
      return getToken(Antlr4PilarParser.FLOAT, 0);
    }
  }

  public static class FunDeclarationContext extends ParserRuleContext {
    public FunDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitFunDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterFunDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitFunDeclaration(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_funDeclaration;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public List<ParamVarContext> paramVar() {
      return getRuleContexts(ParamVarContext.class);
    }

    public ParamVarContext paramVar(final int i) {
      return getRuleContext(ParamVarContext.class, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class GlobalNameExpContext extends PrimaryContext {
    public GlobalNameExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitGlobalNameExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterGlobalNameExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitGlobalNameExp(this);
      }
    }

    public TerminalNode GID() {
      return getToken(Antlr4PilarParser.GID, 0);
    }
  }

  public static class GlobalVarDeclarationContext extends ParserRuleContext {
    public GlobalVarDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitGlobalVarDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterGlobalVarDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitGlobalVarDeclaration(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_globalVarDeclaration;
    }

    public List<GlobalVarFragmentContext> globalVarFragment() {
      return getRuleContexts(GlobalVarFragmentContext.class);
    }

    public GlobalVarFragmentContext globalVarFragment(final int i) {
      return getRuleContext(GlobalVarFragmentContext.class, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class GlobalVarFragmentContext extends ParserRuleContext {
    public GlobalVarFragmentContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitGlobalVarFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterGlobalVarFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitGlobalVarFragment(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_globalVarFragment;
    }

    public TerminalNode GID() {
      return getToken(Antlr4PilarParser.GID, 0);
    }
  }

  public static class GlobalVarsDeclarationContext extends ParserRuleContext {
    public GlobalVarsDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitGlobalVarsDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterGlobalVarsDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitGlobalVarsDeclaration(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_globalVarsDeclaration;
    }

    public List<GlobalVarDeclarationContext> globalVarDeclaration() {
      return getRuleContexts(GlobalVarDeclarationContext.class);
    }

    public GlobalVarDeclarationContext globalVarDeclaration(final int i) {
      return getRuleContext(GlobalVarDeclarationContext.class, i);
    }
  }

  public static class GotojContext extends ParserRuleContext {
    public GotojContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitGotoj(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterGotoj(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitGotoj(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_gotoj;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class GotoJumpContext extends JumpContext {
    public GotoJumpContext(final JumpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitGotoJump(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterGotoJump(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitGotoJump(this);
      }
    }

    public GotojContext gotoj() {
      return getRuleContext(GotojContext.class, 0);
    }
  }

  public static class GuardContext extends ParserRuleContext {
    public GuardContext() {
    }

    public GuardContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final GuardContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_guard;
    }
  }

  public static class HexConstantContext extends ConstantContext {
    public HexConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitHexConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterHexConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitHexConstant(this);
      }
    }

    public TerminalNode HEX() {
      return getToken(Antlr4PilarParser.HEX, 0);
    }
  }

  public static class IdConstantContext extends ConstantContext {
    public IdConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitIdConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterIdConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitIdConstant(this);
      }
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class IfElseExpContext extends ParserRuleContext {
    public IfElseExpContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitIfElseExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterIfElseExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitIfElseExp(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_ifElseExp;
    }
  }

  public static class IfElseJumpContext extends ParserRuleContext {
    public IfElseJumpContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitIfElseJump(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterIfElseJump(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitIfElseJump(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_ifElseJump;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class IfExpContext extends ExpContext {
    public IfExpContext(final ExpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitIfExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterIfExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitIfExp(this);
      }
    }

    public IfElseExpContext ifElseExp() {
      return getRuleContext(IfElseExpContext.class, 0);
    }

    public List<IfThenExpContext> ifThenExp() {
      return getRuleContexts(IfThenExpContext.class);
    }

    public IfThenExpContext ifThenExp(final int i) {
      return getRuleContext(IfThenExpContext.class, i);
    }
  }

  public static class IfJumpContext extends JumpContext {
    public IfJumpContext(final JumpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitIfJump(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterIfJump(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitIfJump(this);
      }
    }

    public IfElseJumpContext ifElseJump() {
      return getRuleContext(IfElseJumpContext.class, 0);
    }

    public List<IfThenJumpContext> ifThenJump() {
      return getRuleContexts(IfThenJumpContext.class);
    }

    public IfThenJumpContext ifThenJump(final int i) {
      return getRuleContext(IfThenJumpContext.class, i);
    }
  }

  public static class IfThenExpContext extends ParserRuleContext {
    public IfThenExpContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitIfThenExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterIfThenExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitIfThenExp(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_ifThenExp;
    }
  }

  public static class IfThenJumpContext extends ParserRuleContext {
    public IfThenJumpContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitIfThenJump(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterIfThenJump(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitIfThenJump(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_ifThenJump;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class ImplementedBodyContext extends BodyContext {
    public ImplementedBodyContext(final BodyContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitImplementedBody(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<CatchClauseContext> catchClause() {
      return getRuleContexts(CatchClauseContext.class);
    }

    public CatchClauseContext catchClause(final int i) {
      return getRuleContext(CatchClauseContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterImplementedBody(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitImplementedBody(this);
      }
    }

    public LocalVarsDeclarationContext localVarsDeclaration() {
      return getRuleContext(LocalVarsDeclarationContext.class, 0);
    }

    public List<LocationContext> location() {
      return getRuleContexts(LocationContext.class);
    }

    public LocationContext location(final int i) {
      return getRuleContext(LocationContext.class, i);
    }
  }

  public static class IndexingSuffixContext extends PrimarySuffixContext {
    public IndexingSuffixContext(final PrimarySuffixContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitIndexingSuffix(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterIndexingSuffix(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitIndexingSuffix(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }
  }

  public static class JumpContext extends ParserRuleContext {
    public JumpContext() {
    }

    public JumpContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final JumpContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_jump;
    }
  }

  public static class JumpFileContext extends ParserRuleContext {
    public JumpFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitJumpFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterJumpFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitJumpFile(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_jumpFile;
    }

    public JumpContext jump() {
      return getRuleContext(JumpContext.class, 0);
    }
  }

  public static class LetExpContext extends PrimaryContext {
    public LetExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitLetExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<BindingContext> binding() {
      return getRuleContexts(BindingContext.class);
    }

    public BindingContext binding(final int i) {
      return getRuleContext(BindingContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterLetExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitLetExp(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }
  }

  public static class LhsContext extends ParserRuleContext {
    public LhsContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitLhs(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterLhs(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitLhs(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_lhs;
    }
  }

  public static class LhssContext extends ParserRuleContext {
    public LhssContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitLhss(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterLhss(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitLhss(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_lhss;
    }

    public List<LhsContext> lhs() {
      return getRuleContexts(LhsContext.class);
    }

    public LhsContext lhs(final int i) {
      return getRuleContext(LhsContext.class, i);
    }
  }

  public static class ListExpContext extends PrimaryContext {
    public ListExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitListExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterListExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitListExp(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }

    public NewKContext newK() {
      return getRuleContext(NewKContext.class, 0);
    }
  }

  public static class LocalVarDeclarationContext extends ParserRuleContext {
    public LocalVarDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitLocalVarDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterLocalVarDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitLocalVarDeclaration(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_localVarDeclaration;
    }

    public List<LocalVarFragmentContext> localVarFragment() {
      return getRuleContexts(LocalVarFragmentContext.class);
    }

    public LocalVarFragmentContext localVarFragment(final int i) {
      return getRuleContext(LocalVarFragmentContext.class, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class LocalVarFragmentContext extends ParserRuleContext {
    public LocalVarFragmentContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitLocalVarFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterLocalVarFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitLocalVarFragment(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_localVarFragment;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class LocalVarsDeclarationContext extends ParserRuleContext {
    public LocalVarsDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitLocalVarsDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterLocalVarsDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitLocalVarsDeclaration(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_localVarsDeclaration;
    }

    public List<LocalVarDeclarationContext> localVarDeclaration() {
      return getRuleContexts(LocalVarDeclarationContext.class);
    }

    public LocalVarDeclarationContext localVarDeclaration(final int i) {
      return getRuleContext(LocalVarDeclarationContext.class, i);
    }
  }

  public static class LocationContext extends ParserRuleContext {
    public LocationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitLocation(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterLocation(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitLocation(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_location;
    }

    public TerminalNode LID() {
      return getToken(Antlr4PilarParser.LID, 0);
    }

    public List<TransformationContext> transformation() {
      return getRuleContexts(TransformationContext.class);
    }

    public TransformationContext transformation(final int i) {
      return getRuleContext(TransformationContext.class, i);
    }
  }

  public static class LocationFileContext extends ParserRuleContext {
    public LocationFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitLocationFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterLocationFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitLocationFile(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_locationFile;
    }

    public LocationContext location() {
      return getRuleContext(LocationContext.class, 0);
    }
  }

  public static class MapExpContext extends PrimaryContext {
    public MapExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitMapExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterMapExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitMapExp(this);
      }
    }

    public List<MappingContext> mapping() {
      return getRuleContexts(MappingContext.class);
    }

    public MappingContext mapping(final int i) {
      return getRuleContext(MappingContext.class, i);
    }

    public NewKContext newK() {
      return getRuleContext(NewKContext.class, 0);
    }
  }

  public static class MappingContext extends ParserRuleContext {
    public MappingContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitMapping(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterMapping(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitMapping(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_mapping;
    }
  }

  public static class MapTypeContext extends BaseTypeContext {
    public MapTypeContext(final BaseTypeContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitMapType(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public AnnotatedTypeContext annotatedType() {
      return getRuleContext(AnnotatedTypeContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterMapType(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitMapType(this);
      }
    }

    public List<TypeParamContext> typeParam() {
      return getRuleContexts(TypeParamContext.class);
    }

    public TypeParamContext typeParam(final int i) {
      return getRuleContext(TypeParamContext.class, i);
    }
  }

  public static class MatchingContext extends ParserRuleContext {
    public MatchingContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitMatching(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterMatching(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitMatching(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_matching;
    }

    public List<ParamVarContext> paramVar() {
      return getRuleContexts(ParamVarContext.class);
    }

    public ParamVarContext paramVar(final int i) {
      return getRuleContext(ParamVarContext.class, i);
    }
  }

  public static class ModelContext extends ParserRuleContext {
    public ModelContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitModel(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterModel(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitModel(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_model;
    }

    public List<ModelElementContext> modelElement() {
      return getRuleContexts(ModelElementContext.class);
    }

    public ModelElementContext modelElement(final int i) {
      return getRuleContext(ModelElementContext.class, i);
    }
  }

  public static class ModelElementContext extends ParserRuleContext {
    public ModelElementContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitModelElement(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public ConstDeclarationContext constDeclaration() {
      return getRuleContext(ConstDeclarationContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterModelElement(this);
      }
    }

    public EnumDeclarationContext enumDeclaration() {
      return getRuleContext(EnumDeclarationContext.class, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitModelElement(this);
      }
    }

    public ExtDeclarationContext extDeclaration() {
      return getRuleContext(ExtDeclarationContext.class, 0);
    }

    public FunDeclarationContext funDeclaration() {
      return getRuleContext(FunDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_modelElement;
    }

    public GlobalVarsDeclarationContext globalVarsDeclaration() {
      return getRuleContext(GlobalVarsDeclarationContext.class, 0);
    }

    public ProcedureDeclarationContext procedureDeclaration() {
      return getRuleContext(ProcedureDeclarationContext.class, 0);
    }

    public RecordDeclarationContext recordDeclaration() {
      return getRuleContext(RecordDeclarationContext.class, 0);
    }
  }

  public static class ModelFileContext extends ParserRuleContext {
    public ModelFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitModelFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterModelFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitModelFile(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_modelFile;
    }

    public ModelContext model() {
      return getRuleContext(ModelContext.class, 0);
    }
  }

  public static class MultilineStringConstantContext extends ConstantContext {
    public MultilineStringConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitMultilineStringConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterMultilineStringConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitMultilineStringConstant(this);
      }
    }

    public TerminalNode MSTRING() {
      return getToken(Antlr4PilarParser.MSTRING, 0);
    }
  }

  public static class MultiSeqExpContext extends PrimaryContext {
    public MultiSeqExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitMultiSeqExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterMultiSeqExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitMultiSeqExp(this);
      }
    }

    public NewKContext newK() {
      return getRuleContext(NewKContext.class, 0);
    }

    public List<NewMultiSeqFragmentContext> newMultiSeqFragment() {
      return getRuleContexts(NewMultiSeqFragmentContext.class);
    }

    public NewMultiSeqFragmentContext newMultiSeqFragment(final int i) {
      return getRuleContext(NewMultiSeqFragmentContext.class, i);
    }
  }

  public static class MultiSeqFragmentContext extends TypeFragmentContext {
    public Token s28;
    public List<Token> rank = new ArrayList<Token>();

    public MultiSeqFragmentContext(final TypeFragmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitMultiSeqFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterMultiSeqFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitMultiSeqFragment(this);
      }
    }
  }

  public static class NamedTypeContext extends BaseTypeContext {
    public NamedTypeContext(final BaseTypeContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitNamedType(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterNamedType(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitNamedType(this);
      }
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeTupleContext typeTuple() {
      return getRuleContext(TypeTupleContext.class, 0);
    }
  }

  public static class NameExpContext extends PrimaryContext {
    public NameExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitNameExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterNameExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitNameExp(this);
      }
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class NewKContext extends ParserRuleContext {
    public NewKContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitNewK(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterNewK(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitNewK(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_newK;
    }
  }

  public static class NewMultiSeqFragmentContext extends ParserRuleContext {
    public NewMultiSeqFragmentContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitNewMultiSeqFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterNewMultiSeqFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitNewMultiSeqFragment(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_newMultiSeqFragment;
    }

    public List<NewMultiSeqFragmentEContext> newMultiSeqFragmentE() {
      return getRuleContexts(NewMultiSeqFragmentEContext.class);
    }

    public NewMultiSeqFragmentEContext newMultiSeqFragmentE(final int i) {
      return getRuleContext(NewMultiSeqFragmentEContext.class, i);
    }
  }

  public static class NewMultiSeqFragmentEContext extends ParserRuleContext {
    public NewMultiSeqFragmentEContext() {
    }

    public NewMultiSeqFragmentEContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final NewMultiSeqFragmentEContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_newMultiSeqFragmentE;
    }
  }

  public static class NewMultiSeqFragmentEExpContext extends
      NewMultiSeqFragmentEContext {
    public NewMultiSeqFragmentEExpContext(final NewMultiSeqFragmentEContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitNewMultiSeqFragmentEExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterNewMultiSeqFragmentEExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitNewMultiSeqFragmentEExp(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }
  }

  public static class NewMultiSeqFragmentENewContext extends
      NewMultiSeqFragmentEContext {
    public NewMultiSeqFragmentENewContext(final NewMultiSeqFragmentEContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitNewMultiSeqFragmentENew(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterNewMultiSeqFragmentENew(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitNewMultiSeqFragmentENew(this);
      }
    }

    public NewMultiSeqFragmentContext newMultiSeqFragment() {
      return getRuleContext(NewMultiSeqFragmentContext.class, 0);
    }
  }

  public static class NewMultiSeqTypeFragmentContext extends ParserRuleContext {
    public NewMultiSeqTypeFragmentContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitNewMultiSeqTypeFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterNewMultiSeqTypeFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitNewMultiSeqTypeFragment(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_newMultiSeqTypeFragment;
    }
  }

  public static class NullConstantContext extends ConstantContext {
    public NullConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitNullConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterNullConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitNullConstant(this);
      }
    }
  }

  public static class OctConstantContext extends ConstantContext {
    public OctConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitOctConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterOctConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitOctConstant(this);
      }
    }

    public TerminalNode OCT() {
      return getToken(Antlr4PilarParser.OCT, 0);
    }
  }

  public static class ParamVarContext extends ParserRuleContext {
    public ParamVarContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitParamVar(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterParamVar(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitParamVar(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_paramVar;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class PrimaryContext extends ParserRuleContext {
    public PrimaryContext() {
    }

    public PrimaryContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final PrimaryContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_primary;
    }
  }

  public static class PrimaryExpContext extends ExpContext {
    public PrimaryExpContext(final ExpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitPrimaryExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterPrimaryExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitPrimaryExp(this);
      }
    }

    public PrimaryContext primary() {
      return getRuleContext(PrimaryContext.class, 0);
    }

    public List<PrimarySuffixContext> primarySuffix() {
      return getRuleContexts(PrimarySuffixContext.class);
    }

    public PrimarySuffixContext primarySuffix(final int i) {
      return getRuleContext(PrimarySuffixContext.class, i);
    }
  }

  public static class PrimarySuffixContext extends ParserRuleContext {
    public PrimarySuffixContext() {
    }

    public PrimarySuffixContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final PrimarySuffixContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_primarySuffix;
    }
  }

  public static class ProcedureDeclarationContext extends ParserRuleContext {
    public ProcedureDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitProcedureDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    public BodyContext body() {
      return getRuleContext(BodyContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterProcedureDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitProcedureDeclaration(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_procedureDeclaration;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public List<ParamVarContext> paramVar() {
      return getRuleContexts(ParamVarContext.class);
    }

    public ParamVarContext paramVar(final int i) {
      return getRuleContext(ParamVarContext.class, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class ProcedureExtensionContext extends ExtElementContext {
    public ProcedureExtensionContext(final ExtElementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitProcedureExtension(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterProcedureExtension(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitProcedureExtension(this);
      }
    }

    public ExtParamsContext extParams() {
      return getRuleContext(ExtParamsContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class ProcedureTypeContext extends BaseTypeContext {
    public ProcedureTypeContext(final BaseTypeContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitProcedureType(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public AnnotatedTypeContext annotatedType() {
      return getRuleContext(AnnotatedTypeContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterProcedureType(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitProcedureType(this);
      }
    }

    public List<TypeParamContext> typeParam() {
      return getRuleContexts(TypeParamContext.class);
    }

    public TypeParamContext typeParam(final int i) {
      return getRuleContext(TypeParamContext.class, i);
    }
  }

  public static class PTupleExpContext extends PrimaryContext {
    public PTupleExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitPTupleExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterPTupleExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitPTupleExp(this);
      }
    }

    public TupleExpContext tupleExp() {
      return getRuleContext(TupleExpContext.class, 0);
    }
  }

  public static class RangedListExpContext extends PrimaryContext {
    public RangedListExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitRangedListExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterRangedListExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitRangedListExp(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }

    public NewKContext newK() {
      return getRuleContext(NewKContext.class, 0);
    }
  }

  public static class RecordDeclarationContext extends ParserRuleContext {
    public RecordDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitRecordDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterRecordDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitRecordDeclaration(this);
      }
    }

    public ExtendClausesContext extendClauses() {
      return getRuleContext(ExtendClausesContext.class, 0);
    }

    public List<FieldContext> field() {
      return getRuleContexts(FieldContext.class);
    }

    public FieldContext field(final int i) {
      return getRuleContext(FieldContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_recordDeclaration;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class RecordExpContext extends PrimaryContext {
    public RecordExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitRecordExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterRecordExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitRecordExp(this);
      }
    }

    public List<FieldInitContext> fieldInit() {
      return getRuleContexts(FieldInitContext.class);
    }

    public FieldInitContext fieldInit(final int i) {
      return getRuleContext(FieldInitContext.class, i);
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public NewKContext newK() {
      return getRuleContext(NewKContext.class, 0);
    }

    public TypeTupleContext typeTuple() {
      return getRuleContext(TypeTupleContext.class, 0);
    }
  }

  public static class RelationTypeContext extends BaseTypeContext {
    public RelationTypeContext(final BaseTypeContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitRelationType(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterRelationType(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitRelationType(this);
      }
    }

    public List<TypeParamContext> typeParam() {
      return getRuleContexts(TypeParamContext.class);
    }

    public TypeParamContext typeParam(final int i) {
      return getRuleContext(TypeParamContext.class, i);
    }
  }

  public static class ReturnJumpContext extends JumpContext {
    public ReturnJumpContext(final JumpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitReturnJump(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterReturnJump(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitReturnJump(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }
  }

  public static class RhsContext extends ParserRuleContext {
    public RhsContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitRhs(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterRhs(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitRhs(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_rhs;
    }
  }

  public static class SeqFragmentContext extends TypeFragmentContext {
    public SeqFragmentContext(final TypeFragmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitSeqFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterSeqFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitSeqFragment(this);
      }
    }
  }

  public static class SetExpContext extends PrimaryContext {
    public SetExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitSetExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterSetExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitSetExp(this);
      }
    }

    public List<ExpContext> exp() {
      return getRuleContexts(ExpContext.class);
    }

    public ExpContext exp(final int i) {
      return getRuleContext(ExpContext.class, i);
    }

    public NewKContext newK() {
      return getRuleContext(NewKContext.class, 0);
    }
  }

  public static class SetFragmentContext extends TypeFragmentContext {
    public SetFragmentContext(final TypeFragmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitSetFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterSetFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitSetFragment(this);
      }
    }
  }

  public static class StartContext extends ActionContext {
    public ExpContext n;

    public StartContext(final ActionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitStart(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterStart(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitStart(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TupleExpContext tupleExp() {
      return getRuleContext(TupleExpContext.class, 0);
    }

    public TypeTupleContext typeTuple() {
      return getRuleContext(TypeTupleContext.class, 0);
    }
  }

  public static class StaticMultiSeqFragmentContext extends TypeFragmentContext {
    public StaticMultiSeqFragmentContext(final TypeFragmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitStaticMultiSeqFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<ConstantContext> constant() {
      return getRuleContexts(ConstantContext.class);
    }

    public ConstantContext constant(final int i) {
      return getRuleContext(ConstantContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterStaticMultiSeqFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitStaticMultiSeqFragment(this);
      }
    }
  }

  public static class StaticSeqFragmentContext extends TypeFragmentContext {
    public StaticSeqFragmentContext(final TypeFragmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitStaticSeqFragment(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public ConstantContext constant() {
      return getRuleContext(ConstantContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterStaticSeqFragment(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitStaticSeqFragment(this);
      }
    }
  }

  public static class StringConstantContext extends ConstantContext {
    public StringConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitStringConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterStringConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitStringConstant(this);
      }
    }

    public TerminalNode STRING() {
      return getToken(Antlr4PilarParser.STRING, 0);
    }
  }

  public static class SwitchCaseJumpContext extends ParserRuleContext {
    public SwitchCaseJumpContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitSwitchCaseJump(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    public ConstantContext constant() {
      return getRuleContext(ConstantContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterSwitchCaseJump(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitSwitchCaseJump(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_switchCaseJump;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class SwitchDefaultJumpContext extends ParserRuleContext {
    public SwitchDefaultJumpContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitSwitchDefaultJump(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterSwitchDefaultJump(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitSwitchDefaultJump(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_switchDefaultJump;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class SwitchJumpContext extends JumpContext {
    public SwitchJumpContext(final JumpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitSwitchJump(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterSwitchJump(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitSwitchJump(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    public List<SwitchCaseJumpContext> switchCaseJump() {
      return getRuleContexts(SwitchCaseJumpContext.class);
    }

    public SwitchCaseJumpContext switchCaseJump(final int i) {
      return getRuleContext(SwitchCaseJumpContext.class, i);
    }

    public SwitchDefaultJumpContext switchDefaultJump() {
      return getRuleContext(SwitchDefaultJumpContext.class, 0);
    }
  }

  public static class ThrowContext extends ActionContext {
    public ThrowContext(final ActionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitThrow(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterThrow(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitThrow(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }
  }

  public static class TransformationContext extends ParserRuleContext {
    public TransformationContext() {
    }

    public TransformationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final TransformationContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_transformation;
    }
  }

  public static class TransformationFileContext extends ParserRuleContext {
    public TransformationFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitTransformationFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTransformationFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTransformationFile(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_transformationFile;
    }

    public TransformationContext transformation() {
      return getRuleContext(TransformationContext.class, 0);
    }
  }

  public static class TrueConstantContext extends ConstantContext {
    public TrueConstantContext(final ConstantContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitTrueConstant(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTrueConstant(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTrueConstant(this);
      }
    }
  }

  public static class TupleExpContext extends ParserRuleContext {
    public TupleExpContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitTupleExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnExpContext> annExp() {
      return getRuleContexts(AnnExpContext.class);
    }

    public AnnExpContext annExp(final int i) {
      return getRuleContext(AnnExpContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTupleExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTupleExp(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_tupleExp;
    }
  }

  public static class TupleTypeContext extends BaseTypeContext {
    public TupleTypeContext(final BaseTypeContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitTupleType(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTupleType(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTupleType(this);
      }
    }

    public List<TypeParamContext> typeParam() {
      return getRuleContexts(TypeParamContext.class);
    }

    public TypeParamContext typeParam(final int i) {
      return getRuleContext(TypeParamContext.class, i);
    }
  }

  public static class TypealiasDeclarationContext extends ParserRuleContext {
    public TypealiasDeclarationContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitTypealiasDeclaration(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTypealiasDeclaration(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTypealiasDeclaration(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_typealiasDeclaration;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class TypeContext extends ParserRuleContext {
    public TypeContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitType(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public BaseTypeContext baseType() {
      return getRuleContext(BaseTypeContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterType(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitType(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_type;
    }

    public List<TypeFragmentContext> typeFragment() {
      return getRuleContexts(TypeFragmentContext.class);
    }

    public TypeFragmentContext typeFragment(final int i) {
      return getRuleContext(TypeFragmentContext.class, i);
    }
  }

  public static class TypeExpContext extends PrimaryContext {
    public TypeExpContext(final PrimaryContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitTypeExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTypeExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTypeExp(this);
      }
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class TypeExtensionContext extends ExtElementContext {
    public TypeExtensionContext(final ExtElementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitTypeExtension(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTypeExtension(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTypeExtension(this);
      }
    }

    public ExtendClausesContext extendClauses() {
      return getRuleContext(ExtendClausesContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeVarTupleContext typeVarTuple() {
      return getRuleContext(TypeVarTupleContext.class, 0);
    }
  }

  public static class TypeFileContext extends ParserRuleContext {
    public TypeFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitTypeFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTypeFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTypeFile(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_typeFile;
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class TypeFragmentContext extends ParserRuleContext {
    public TypeFragmentContext() {
    }

    public TypeFragmentContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    public void copyFrom(final TypeFragmentContext ctx) {
      super.copyFrom(ctx);
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_typeFragment;
    }
  }

  public static class TypeParamContext extends ParserRuleContext {
    public TypeParamContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitTypeParam(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTypeParam(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTypeParam(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_typeParam;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }
  }

  public static class TypeTupleContext extends ParserRuleContext {
    public TypeTupleContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitTypeTuple(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTypeTuple(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTypeTuple(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_typeTuple;
    }

    public List<TypeContext> type() {
      return getRuleContexts(TypeContext.class);
    }

    public TypeContext type(final int i) {
      return getRuleContext(TypeContext.class, i);
    }
  }

  public static class TypeVarContext extends ParserRuleContext {
    public TypeVarContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitTypeVar(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(final int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTypeVar(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTypeVar(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_typeVar;
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }
  }

  public static class TypeVarTupleContext extends ParserRuleContext {
    public TypeVarTupleContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor)
            .visitTypeVarTuple(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterTypeVarTuple(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitTypeVarTuple(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_typeVarTuple;
    }

    public List<TypeVarContext> typeVar() {
      return getRuleContexts(TypeVarContext.class);
    }

    public TypeVarContext typeVar(final int i) {
      return getRuleContext(TypeVarContext.class, i);
    }
  }

  public static class UnaryExpContext extends ExpContext {
    public Token op;

    public UnaryExpContext(final ExpContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitUnaryExp(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public TerminalNode AddOP() {
      return getToken(Antlr4PilarParser.AddOP, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterUnaryExp(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitUnaryExp(this);
      }
    }

    public ExpContext exp() {
      return getRuleContext(ExpContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(Antlr4PilarParser.ID, 0);
    }

    public TerminalNode MulOP() {
      return getToken(Antlr4PilarParser.MulOP, 0);
    }

    public TerminalNode UnaryOP() {
      return getToken(Antlr4PilarParser.UnaryOP, 0);
    }
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int T__54 = 1, T__53 = 2, T__52 = 3, T__51 = 4,
      T__50 = 5, T__49 = 6, T__48 = 7, T__47 = 8, T__46 = 9, T__45 = 10,
      T__44 = 11, T__43 = 12, T__42 = 13, T__41 = 14, T__40 = 15, T__39 = 16,
      T__38 = 17, T__37 = 18, T__36 = 19, T__35 = 20, T__34 = 21, T__33 = 22,
      T__32 = 23, T__31 = 24, T__30 = 25, T__29 = 26, T__28 = 27, T__27 = 28,
      T__26 = 29, T__25 = 30, T__24 = 31, T__23 = 32, T__22 = 33, T__21 = 34,
      T__20 = 35, T__19 = 36, T__18 = 37, T__17 = 38, T__16 = 39, T__15 = 40,
      T__14 = 41, T__13 = 42, T__12 = 43, T__11 = 44, T__10 = 45, T__9 = 46,
      T__8 = 47, T__7 = 48, T__6 = 49, T__5 = 50, T__4 = 51, T__3 = 52,
      T__2 = 53, T__1 = 54, T__0 = 55, ID = 56, GID = 57, LID = 58,
      MSTRING = 59, CondAndOP = 60, CondOrOP = 61, AndOP = 62, XorOP = 63,
      OrOP = 64, EqOP = 65, RelOP = 66, ShiftOP = 67, AddOP = 68, MulOP = 69,
      UnaryOP = 70, AssignOP = 71, HEX = 72, DEC = 73, OCT = 74, BIN = 75,
      FLOAT = 76, CHAR = 77, STRING = 78, WS = 79, COMMENT = 80,
      LINE_COMMENT = 81;
  public static final String[] tokenNames = { "<INVALID>", "'record'", "'['",
      "'<'", "'false'", "'}'", "'->'", "')'", "'throw'", "'@'", "'global'",
      "'='", "'goto'", "'fun'", "'const'", "'null'", "'call'", "'-!>'",
      "'new'", "'+>'", "'assert'", "'|'", "'..'", "'enum'", "']'", "'assume'",
      "'in'", "'expdef'", "','", "'<=='", "'==>'", "'('", "':'", "'if'",
      "'typealias'", "'...'", "'{'", "'let'", "'extends'", "'catch'", "'else'",
      "'true'", "'^'", "'.'", "'=>'", "'procedure'", "'return'", "'typedef'",
      "'start'", "'actiondef'", "';'", "'extension'", "'>'", "'then'",
      "'switch'", "'procdef'", "ID", "GID", "LID", "MSTRING", "CondAndOP",
      "CondOrOP", "AndOP", "XorOP", "OrOP", "EqOP", "RelOP", "ShiftOP",
      "AddOP", "MulOP", "UnaryOP", "AssignOP", "HEX", "DEC", "OCT", "BIN",
      "FLOAT", "CHAR", "STRING", "WS", "COMMENT", "LINE_COMMENT" };

  public static final int RULE_modelFile = 0, RULE_annotationFile = 1,
      RULE_locationFile = 2, RULE_transformationFile = 3, RULE_actionFile = 4,
      RULE_jumpFile = 5, RULE_expFile = 6, RULE_typeFile = 7, RULE_model = 8,
      RULE_annotation = 9, RULE_annotationParams = 10,
      RULE_annotationParam = 11, RULE_modelElement = 12,
      RULE_constDeclaration = 13, RULE_constElement = 14,
      RULE_enumDeclaration = 15, RULE_enumElement = 16,
      RULE_typealiasDeclaration = 17, RULE_typeVarTuple = 18,
      RULE_typeVar = 19, RULE_recordDeclaration = 20, RULE_extendClauses = 21,
      RULE_extendClause = 22, RULE_typeTuple = 23, RULE_field = 24,
      RULE_fieldFragment = 25, RULE_globalVarsDeclaration = 26,
      RULE_globalVarDeclaration = 27, RULE_globalVarFragment = 28,
      RULE_procedureDeclaration = 29, RULE_paramVar = 30,
      RULE_funDeclaration = 31, RULE_extDeclaration = 32, RULE_extElement = 33,
      RULE_extParams = 34, RULE_extParam = 35, RULE_extParamVariable = 36,
      RULE_body = 37, RULE_localVarsDeclaration = 38,
      RULE_localVarDeclaration = 39, RULE_localVarFragment = 40,
      RULE_location = 41, RULE_transformation = 42, RULE_guard = 43,
      RULE_action = 44, RULE_lhss = 45, RULE_lhs = 46, RULE_rhs = 47,
      RULE_jump = 48, RULE_gotoj = 49, RULE_ifThenJump = 50,
      RULE_ifElseJump = 51, RULE_switchCaseJump = 52,
      RULE_switchDefaultJump = 53, RULE_catchClause = 54, RULE_exp = 55,
      RULE_ifThenExp = 56, RULE_ifElseExp = 57, RULE_primarySuffix = 58,
      RULE_primary = 59, RULE_tupleExp = 60, RULE_annExp = 61, RULE_newK = 62,
      RULE_binding = 63, RULE_mapping = 64, RULE_newMultiSeqFragment = 65,
      RULE_newMultiSeqFragmentE = 66, RULE_matching = 67, RULE_fieldInit = 68,
      RULE_newMultiSeqTypeFragment = 69, RULE_type = 70,
      RULE_typeFragment = 71, RULE_constant = 72, RULE_baseType = 73,
      RULE_typeParam = 74, RULE_annotatedType = 75;

  public static final String[] ruleNames = { "modelFile", "annotationFile",
      "locationFile", "transformationFile", "actionFile", "jumpFile",
      "expFile", "typeFile", "model", "annotation", "annotationParams",
      "annotationParam", "modelElement", "constDeclaration", "constElement",
      "enumDeclaration", "enumElement", "typealiasDeclaration", "typeVarTuple",
      "typeVar", "recordDeclaration", "extendClauses", "extendClause",
      "typeTuple", "field", "fieldFragment", "globalVarsDeclaration",
      "globalVarDeclaration", "globalVarFragment", "procedureDeclaration",
      "paramVar", "funDeclaration", "extDeclaration", "extElement",
      "extParams", "extParam", "extParamVariable", "body",
      "localVarsDeclaration", "localVarDeclaration", "localVarFragment",
      "location", "transformation", "guard", "action", "lhss", "lhs", "rhs",
      "jump", "gotoj", "ifThenJump", "ifElseJump", "switchCaseJump",
      "switchDefaultJump", "catchClause", "exp", "ifThenExp", "ifElseExp",
      "primarySuffix", "primary", "tupleExp", "annExp", "newK", "binding",
      "mapping", "newMultiSeqFragment", "newMultiSeqFragmentE", "matching",
      "fieldInit", "newMultiSeqTypeFragment", "type", "typeFragment",
      "constant", "baseType", "typeParam", "annotatedType" };

  public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3S\u0675\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
      + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
      + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
      + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
      + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
      + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
      + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"
      + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3"
      + "\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\7\n\u00b4\n"
      + "\n\f\n\16\n\u00b7\13\n\3\n\7\n\u00ba\n\n\f\n\16\n\u00bd\13\n\3\13\3\13"
      + "\3\13\5\13\u00c2\n\13\3\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb\13"
      + "\f\3\f\3\f\3\f\6\f\u00d0\n\f\r\f\16\f\u00d1\5\f\u00d4\n\f\3\r\3\r\3\r"
      + "\3\r\3\r\3\r\3\r\3\r\5\r\u00de\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"
      + "\5\16\u00e7\n\16\3\17\3\17\3\17\7\17\u00ec\n\17\f\17\16\17\u00ef\13\17"
      + "\3\17\3\17\7\17\u00f3\n\17\f\17\16\17\u00f6\13\17\3\17\3\17\3\20\3\20"
      + "\3\20\3\20\7\20\u00fe\n\20\f\20\16\20\u0101\13\20\3\20\3\20\3\21\3\21"
      + "\3\21\7\21\u0108\n\21\f\21\16\21\u010b\13\21\3\21\3\21\3\21\3\21\7\21"
      + "\u0111\n\21\f\21\16\21\u0114\13\21\5\21\u0116\n\21\3\21\3\21\3\22\3\22"
      + "\7\22\u011c\n\22\f\22\16\22\u011f\13\22\3\23\3\23\3\23\5\23\u0124\n\23"
      + "\3\23\7\23\u0127\n\23\f\23\16\23\u012a\13\23\3\23\3\23\3\23\3\23\3\24"
      + "\3\24\3\24\3\24\7\24\u0134\n\24\f\24\16\24\u0137\13\24\3\24\3\24\3\25"
      + "\3\25\7\25\u013d\n\25\f\25\16\25\u0140\13\25\3\26\3\26\3\26\5\26\u0145"
      + "\n\26\3\26\7\26\u0148\n\26\f\26\16\26\u014b\13\26\3\26\5\26\u014e\n\26"
      + "\3\26\3\26\7\26\u0152\n\26\f\26\16\26\u0155\13\26\3\26\3\26\3\27\3\27"
      + "\3\27\3\27\7\27\u015d\n\27\f\27\16\27\u0160\13\27\3\30\3\30\5\30\u0164"
      + "\n\30\3\30\7\30\u0167\n\30\f\30\16\30\u016a\13\30\3\31\3\31\3\31\3\31"
      + "\7\31\u0170\n\31\f\31\16\31\u0173\13\31\3\31\3\31\3\32\3\32\3\32\7\32"
      + "\u017a\n\32\f\32\16\32\u017d\13\32\3\32\3\32\3\32\3\32\3\32\5\32\u0184"
      + "\n\32\3\32\3\32\3\32\7\32\u0189\n\32\f\32\16\32\u018c\13\32\3\32\3\32"
      + "\5\32\u0190\n\32\3\33\3\33\7\33\u0194\n\33\f\33\16\33\u0197\13\33\3\34"
      + "\3\34\6\34\u019b\n\34\r\34\16\34\u019c\3\35\3\35\3\35\7\35\u01a2\n\35"
      + "\f\35\16\35\u01a5\13\35\3\35\3\35\3\35\3\35\3\35\5\35\u01ac\n\35\3\35"
      + "\3\35\3\35\7\35\u01b1\n\35\f\35\16\35\u01b4\13\35\3\35\3\35\5\35\u01b8"
      + "\n\35\3\36\3\36\7\36\u01bc\n\36\f\36\16\36\u01bf\13\36\3\37\3\37\5\37"
      + "\u01c3\n\37\3\37\3\37\3\37\3\37\3\37\7\37\u01ca\n\37\f\37\16\37\u01cd"
      + "\13\37\5\37\u01cf\n\37\3\37\5\37\u01d2\n\37\3\37\3\37\3\37\7\37\u01d7"
      + "\n\37\f\37\16\37\u01da\13\37\3\37\3\37\3\37\5\37\u01df\n\37\3\37\3\37"
      + "\3\37\3\37\3\37\7\37\u01e6\n\37\f\37\16\37\u01e9\13\37\5\37\u01eb\n\37"
      + "\3\37\5\37\u01ee\n\37\3\37\7\37\u01f1\n\37\f\37\16\37\u01f4\13\37\3\37"
      + "\5\37\u01f7\n\37\3 \3 \7 \u01fb\n \f \16 \u01fe\13 \3 \3 \3 \5 \u0203"
      + "\n \3 \3 \7 \u0207\n \f \16 \u020a\13 \5 \u020c\n \3!\3!\5!\u0210\n!\3"
      + "!\3!\3!\3!\3!\7!\u0217\n!\f!\16!\u021a\13!\5!\u021c\n!\3!\5!\u021f\n!"
      + "\3!\7!\u0222\n!\f!\16!\u0225\13!\3!\3!\3!\3!\3!\3!\3!\5!\u022e\n!\3!\3"
      + "!\3!\3!\3!\7!\u0235\n!\f!\16!\u0238\13!\5!\u023a\n!\3!\5!\u023d\n!\3!"
      + "\7!\u0240\n!\f!\16!\u0243\13!\3!\3!\3!\3!\5!\u0249\n!\3\"\3\"\5\"\u024d"
      + "\n\"\3\"\3\"\7\"\u0251\n\"\f\"\16\"\u0254\13\"\3\"\3\"\7\"\u0258\n\"\f"
      + "\"\16\"\u025b\13\"\3\"\3\"\3#\3#\5#\u0261\n#\3#\3#\7#\u0265\n#\f#\16#"
      + "\u0268\13#\3#\5#\u026b\n#\3#\3#\3#\5#\u0270\n#\3#\3#\3#\5#\u0275\n#\3"
      + "#\5#\u0278\n#\3#\7#\u027b\n#\f#\16#\u027e\13#\3#\3#\3#\5#\u0283\n#\3#"
      + "\3#\3#\5#\u0288\n#\3#\5#\u028b\n#\3#\7#\u028e\n#\f#\16#\u0291\13#\3#\3"
      + "#\3#\3#\3#\3#\5#\u0299\n#\3#\5#\u029c\n#\3#\3#\3#\5#\u02a1\n#\3#\5#\u02a4"
      + "\n#\3#\7#\u02a7\n#\f#\16#\u02aa\13#\3#\3#\3#\5#\u02af\n#\3#\3#\3#\5#\u02b4"
      + "\n#\3#\5#\u02b7\n#\3#\7#\u02ba\n#\f#\16#\u02bd\13#\3#\3#\3#\3#\3#\3#\5"
      + "#\u02c5\n#\3#\5#\u02c8\n#\3#\3#\3#\5#\u02cd\n#\3#\5#\u02d0\n#\3#\7#\u02d3"
      + "\n#\f#\16#\u02d6\13#\3#\5#\u02d9\n#\3$\3$\3$\7$\u02de\n$\f$\16$\u02e1"
      + "\13$\3$\3$\5$\u02e5\n$\3$\5$\u02e8\n$\3%\3%\7%\u02ec\n%\f%\16%\u02ef\13"
      + "%\3%\3%\3%\3%\5%\u02f5\n%\3%\7%\u02f8\n%\f%\16%\u02fb\13%\5%\u02fd\n%"
      + "\3&\3&\3&\7&\u0302\n&\f&\16&\u0305\13&\3&\3&\3&\3&\3&\5&\u030c\n&\3&\7"
      + "&\u030f\n&\f&\16&\u0312\13&\5&\u0314\n&\3\'\3\'\5\'\u0318\n\'\3\'\7\'"
      + "\u031b\n\'\f\'\16\'\u031e\13\'\3\'\7\'\u0321\n\'\f\'\16\'\u0324\13\'\3"
      + "\'\3\'\5\'\u0328\n\'\3(\6(\u032b\n(\r(\16(\u032c\3)\3)\3)\7)\u0332\n)"
      + "\f)\16)\u0335\13)\3)\3)\3)\3)\3)\5)\u033c\n)\3)\3)\3)\7)\u0341\n)\f)\16"
      + ")\u0344\13)\3)\3)\5)\u0348\n)\3*\3*\7*\u034c\n*\f*\16*\u034f\13*\3+\3"
      + "+\7+\u0353\n+\f+\16+\u0356\13+\3+\3+\3+\7+\u035b\n+\f+\16+\u035e\13+\5"
      + "+\u0360\n+\3,\5,\u0363\n,\3,\3,\3,\3,\7,\u0369\n,\f,\16,\u036c\13,\3,"
      + "\5,\u036f\n,\3,\3,\3,\7,\u0374\n,\f,\16,\u0377\13,\3,\5,\u037a\n,\3,\7"
      + ",\u037d\n,\f,\16,\u0380\13,\3,\5,\u0383\n,\3,\7,\u0386\n,\f,\16,\u0389"
      + "\13,\3,\5,\u038c\n,\3,\7,\u038f\n,\f,\16,\u0392\13,\5,\u0394\n,\3-\3-"
      + "\7-\u0398\n-\f-\16-\u039b\13-\3-\3-\3-\3-\7-\u03a1\n-\f-\16-\u03a4\13"
      + "-\5-\u03a6\n-\3.\3.\3.\3.\5.\u03ac\n.\3.\7.\u03af\n.\f.\16.\u03b2\13."
      + "\3.\3.\3.\3.\3.\3.\5.\u03ba\n.\3.\7.\u03bd\n.\f.\16.\u03c0\13.\3.\3.\3"
      + ".\3.\3.\7.\u03c7\n.\f.\16.\u03ca\13.\3.\3.\3.\3.\5.\u03d0\n.\3.\3.\3."
      + "\3.\3.\5.\u03d7\n.\3.\3.\7.\u03db\n.\f.\16.\u03de\13.\3.\3.\3.\3.\5.\u03e4"
      + "\n.\3.\3.\7.\u03e8\n.\f.\16.\u03eb\13.\3.\3.\3.\3.\3.\3.\3.\7.\u03f4\n"
      + ".\f.\16.\u03f7\13.\3.\7.\u03fa\n.\f.\16.\u03fd\13.\3.\3.\5.\u0401\n.\3"
      + "/\3/\3/\7/\u0406\n/\f/\16/\u0409\13/\3\60\3\60\7\60\u040d\n\60\f\60\16"
      + "\60\u0410\13\60\3\61\7\61\u0413\n\61\f\61\16\61\u0416\13\61\3\61\3\61"
      + "\3\62\3\62\3\62\3\62\3\62\7\62\u041f\n\62\f\62\16\62\u0422\13\62\5\62"
      + "\u0424\n\62\3\62\7\62\u0427\n\62\f\62\16\62\u042a\13\62\3\62\3\62\3\62"
      + "\3\62\7\62\u0430\n\62\f\62\16\62\u0433\13\62\3\62\5\62\u0436\n\62\3\62"
      + "\7\62\u0439\n\62\f\62\16\62\u043c\13\62\3\62\3\62\3\62\3\62\3\62\7\62"
      + "\u0443\n\62\f\62\16\62\u0446\13\62\3\62\5\62\u0449\n\62\3\62\7\62\u044c"
      + "\n\62\f\62\16\62\u044f\13\62\3\62\3\62\5\62\u0453\n\62\3\63\3\63\3\63"
      + "\7\63\u0458\n\63\f\63\16\63\u045b\13\63\3\63\3\63\3\64\3\64\3\64\3\64"
      + "\7\64\u0463\n\64\f\64\16\64\u0466\13\64\3\64\3\64\3\64\3\65\3\65\7\65"
      + "\u046d\n\65\f\65\16\65\u0470\13\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"
      + "\7\66\u0479\n\66\f\66\16\66\u047c\13\66\3\66\3\66\3\66\3\67\3\67\3\67"
      + "\3\67\7\67\u0485\n\67\f\67\16\67\u0488\13\67\3\67\3\67\3\67\38\38\78\u048f"
      + "\n8\f8\168\u0492\138\38\58\u0495\n8\38\38\38\58\u049a\n8\38\58\u049d\n"
      + "8\58\u049f\n8\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\7"
      + "9\u04b3\n9\f9\169\u04b6\139\39\39\39\79\u04bb\n9\f9\169\u04be\139\39\3"
      + "9\59\u04c2\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"
      + "9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\79\u04e8\n9\f9\16"
      + "9\u04eb\139\3:\3:\3:\3:\7:\u04f1\n:\f:\16:\u04f4\13:\3:\3:\3;\3;\7;\u04fa"
      + "\n;\f;\16;\u04fd\13;\3;\3;\3<\3<\3<\3<\7<\u0505\n<\f<\16<\u0508\13<\3"
      + "<\3<\3<\3<\3<\5<\u050f\n<\3<\5<\u0512\n<\3=\3=\3=\3=\3=\3=\3=\3=\7=\u051c"
      + "\n=\f=\16=\u051f\13=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u0530"
      + "\n=\f=\16=\u0533\13=\5=\u0535\n=\3=\3=\3=\3=\3=\3=\3=\7=\u053e\n=\f=\16"
      + "=\u0541\13=\5=\u0543\n=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u054d\n=\f=\16=\u0550"
      + "\13=\5=\u0552\n=\3=\3=\3=\3=\3=\3=\3=\7=\u055b\n=\f=\16=\u055e\13=\5="
      + "\u0560\n=\3=\3=\3=\3=\3=\3=\3=\7=\u0569\n=\f=\16=\u056c\13=\3=\3=\3=\3"
      + "=\3=\5=\u0573\n=\3=\3=\3=\3=\7=\u0579\n=\f=\16=\u057c\13=\5=\u057e\n="
      + "\3=\3=\3=\3=\3=\7=\u0585\n=\f=\16=\u0588\13=\3=\7=\u058b\n=\f=\16=\u058e"
      + "\13=\3=\3=\5=\u0592\n=\3>\3>\3>\3>\7>\u0598\n>\f>\16>\u059b\13>\5>\u059d"
      + "\n>\3>\3>\3?\3?\7?\u05a3\n?\f?\16?\u05a6\13?\3@\3@\3A\3A\3A\5A\u05ad\n"
      + "A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\7C\u05ba\nC\fC\16C\u05bd\13C\5C\u05bf"
      + "\nC\3C\3C\3D\3D\5D\u05c5\nD\3E\3E\3E\7E\u05ca\nE\fE\16E\u05cd\13E\5E\u05cf"
      + "\nE\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\7G\u05dc\nG\fG\16G\u05df\13G\3G\3"
      + "G\3H\3H\7H\u05e5\nH\fH\16H\u05e8\13H\3I\3I\3I\3I\3I\3I\3I\3I\6I\u05f2"
      + "\nI\rI\16I\u05f3\3I\3I\3I\3I\3I\6I\u05fb\nI\rI\16I\u05fc\3I\3I\3I\3I\5"
      + "I\u0603\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0611\nJ\3K\3K\5K\u0615"
      + "\nK\3K\3K\3K\3K\7K\u061b\nK\fK\16K\u061e\13K\3K\3K\5K\u0622\nK\3K\3K\3"
      + "K\3K\3K\3K\7K\u062a\nK\fK\16K\u062d\13K\3K\3K\5K\u0631\nK\3K\3K\3K\3K"
      + "\3K\3K\7K\u0639\nK\fK\16K\u063c\13K\3K\3K\3K\3K\3K\3K\7K\u0644\nK\fK\16"
      + "K\u0647\13K\3K\3K\3K\3K\3K\3K\3K\3K\6K\u0651\nK\rK\16K\u0652\3K\3K\5K"
      + "\u0657\nK\3L\3L\7L\u065b\nL\fL\16L\u065e\13L\3L\3L\3L\3L\5L\u0664\nL\3"
      + "L\7L\u0667\nL\fL\16L\u066a\13L\5L\u066c\nL\3M\3M\7M\u0670\nM\fM\16M\u0673"
      + "\13M\3M\2N\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"
      + "8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"
      + "\u008c\u008e\u0090\u0092\u0094\u0096\u0098\2\6\4\2::FH\5\2\5\5\66\66D"
      + "D\3\2\37 \4\2\24\24,,\u0741\2\u009a\3\2\2\2\4\u009d\3\2\2\2\6\u00a0\3"
      + "\2\2\2\b\u00a3\3\2\2\2\n\u00a6\3\2\2\2\f\u00a9\3\2\2\2\16\u00ac\3\2\2"
      + "\2\20\u00af\3\2\2\2\22\u00b5\3\2\2\2\24\u00be\3\2\2\2\26\u00d3\3\2\2\2"
      + "\30\u00dd\3\2\2\2\32\u00e6\3\2\2\2\34\u00e8\3\2\2\2\36\u00f9\3\2\2\2 "
      + "\u0104\3\2\2\2\"\u0119\3\2\2\2$\u0120\3\2\2\2&\u012f\3\2\2\2(\u013a\3"
      + "\2\2\2*\u0141\3\2\2\2,\u0158\3\2\2\2.\u0161\3\2\2\2\60\u016b\3\2\2\2\62"
      + "\u018f\3\2\2\2\64\u0191\3\2\2\2\66\u0198\3\2\2\28\u01b7\3\2\2\2:\u01b9"
      + "\3\2\2\2<\u01c0\3\2\2\2>\u020b\3\2\2\2@\u020d\3\2\2\2B\u024a\3\2\2\2D"
      + "\u02d8\3\2\2\2F\u02e7\3\2\2\2H\u02fc\3\2\2\2J\u0313\3\2\2\2L\u0327\3\2"
      + "\2\2N\u032a\3\2\2\2P\u0347\3\2\2\2R\u0349\3\2\2\2T\u0350\3\2\2\2V\u0393"
      + "\3\2\2\2X\u03a5\3\2\2\2Z\u0400\3\2\2\2\\\u0402\3\2\2\2^\u040a\3\2\2\2"
      + "`\u0414\3\2\2\2b\u0452\3\2\2\2d\u0454\3\2\2\2f\u045e\3\2\2\2h\u046a\3"
      + "\2\2\2j\u0474\3\2\2\2l\u0480\3\2\2\2n\u048c\3\2\2\2p\u04c1\3\2\2\2r\u04ec"
      + "\3\2\2\2t\u04f7\3\2\2\2v\u0511\3\2\2\2x\u0591\3\2\2\2z\u0593\3\2\2\2|"
      + "\u05a0\3\2\2\2~\u05a7\3\2\2\2\u0080\u05a9\3\2\2\2\u0082\u05b1\3\2\2\2"
      + "\u0084\u05b5\3\2\2\2\u0086\u05c4\3\2\2\2\u0088\u05ce\3\2\2\2\u008a\u05d3"
      + "\3\2\2\2\u008c\u05d7\3\2\2\2\u008e\u05e2\3\2\2\2\u0090\u0602\3\2\2\2\u0092"
      + "\u0610\3\2\2\2\u0094\u0656\3\2\2\2\u0096\u066b\3\2\2\2\u0098\u066d\3\2"
      + "\2\2\u009a\u009b\5\22\n\2\u009b\u009c\7\2\2\3\u009c\3\3\2\2\2\u009d\u009e"
      + "\5\24\13\2\u009e\u009f\7\2\2\3\u009f\5\3\2\2\2\u00a0\u00a1\5T+\2\u00a1"
      + "\u00a2\7\2\2\3\u00a2\7\3\2\2\2\u00a3\u00a4\5V,\2\u00a4\u00a5\7\2\2\3\u00a5"
      + "\t\3\2\2\2\u00a6\u00a7\5Z.\2\u00a7\u00a8\7\2\2\3\u00a8\13\3\2\2\2\u00a9"
      + "\u00aa\5b\62\2\u00aa\u00ab\7\2\2\3\u00ab\r\3\2\2\2\u00ac\u00ad\5p9\2\u00ad"
      + "\u00ae\7\2\2\3\u00ae\17\3\2\2\2\u00af\u00b0\5\u008eH\2\u00b0\u00b1\7\2"
      + "\2\3\u00b1\21\3\2\2\2\u00b2\u00b4\5\24\13\2\u00b3\u00b2\3\2\2\2\u00b4"
      + "\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bb\3\2"
      + "\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\5\32\16\2\u00b9\u00b8\3\2\2\2\u00ba"
      + "\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\23\3\2\2"
      + "\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c1\7:\2\2\u00c0\u00c2"
      + "\5\26\f\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\25\3\2\2\2\u00c3"
      + "\u00c4\7!\2\2\u00c4\u00c9\5\30\r\2\u00c5\u00c6\7\36\2\2\u00c6\u00c8\5"
      + "\30\r\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"
      + "\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\t"
      + "\2\2\u00cd\u00d4\3\2\2\2\u00ce\u00d0\5p9\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1"
      + "\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"
      + "\u00c3\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\27\3\2\2\2\u00d5\u00d6\7:\2\2"
      + "\u00d6\u00d7\7\r\2\2\u00d7\u00de\5\24\13\2\u00d8\u00d9\7:\2\2\u00d9\u00da"
      + "\7\r\2\2\u00da\u00de\5p9\2\u00db\u00de\5\24\13\2\u00dc\u00de\5p9\2\u00dd"
      + "\u00d5\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2"
      + "\2\2\u00de\31\3\2\2\2\u00df\u00e7\5\34\17\2\u00e0\u00e7\5 \21\2\u00e1"
      + "\u00e7\5*\26\2\u00e2\u00e7\5\66\34\2\u00e3\u00e7\5<\37\2\u00e4\u00e7\5"
      + "@!\2\u00e5\u00e7\5B\"\2\u00e6\u00df\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6"
      + "\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2"
      + "\2\2\u00e6\u00e5\3\2\2\2\u00e7\33\3\2\2\2\u00e8\u00e9\7\20\2\2\u00e9\u00ed"
      + "\7:\2\2\u00ea\u00ec\5\24\13\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2"
      + "\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed"
      + "\3\2\2\2\u00f0\u00f4\7&\2\2\u00f1\u00f3\5\36\20\2\u00f2\u00f1\3\2\2\2"
      + "\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"
      + "\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\7\2\2\u00f8\35\3\2\2\2\u00f9"
      + "\u00fa\7:\2\2\u00fa\u00fb\7\r\2\2\u00fb\u00ff\5\u0092J\2\u00fc\u00fe\5"
      + "\24\13\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"
      + "\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\64"
      + "\2\2\u0103\37\3\2\2\2\u0104\u0105\7\31\2\2\u0105\u0109\7:\2\2\u0106\u0108"
      + "\5\24\13\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2"
      + "\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0115"
      + "\7&\2\2\u010d\u0112\5\"\22\2\u010e\u010f\7\36\2\2\u010f\u0111\5\"\22\2"
      + "\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"
      + "\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u010d\3\2\2\2\u0115"
      + "\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\7\2\2\u0118!\3\2\2\2"
      + "\u0119\u011d\7:\2\2\u011a\u011c\5\24\13\2\u011b\u011a\3\2\2\2\u011c\u011f"
      + "\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e#\3\2\2\2\u011f"
      + "\u011d\3\2\2\2\u0120\u0121\7$\2\2\u0121\u0123\7:\2\2\u0122\u0124\5&\24"
      + "\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128\3\2\2\2\u0125\u0127"
      + "\5\24\13\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2"
      + "\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c"
      + "\7\r\2\2\u012c\u012d\5\u008eH\2\u012d\u012e\7\64\2\2\u012e%\3\2\2\2\u012f"
      + "\u0130\7\4\2\2\u0130\u0135\5(\25\2\u0131\u0132\7\36\2\2\u0132\u0134\5"
      + "(\25\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"
      + "\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\32"
      + "\2\2\u0139\'\3\2\2\2\u013a\u013e\7:\2\2\u013b\u013d\5\24\13\2\u013c\u013b"
      + "\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"
      + ")\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\3\2\2\u0142\u0144\7:\2\2\u0143"
      + "\u0145\5&\24\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0149\3\2"
      + "\2\2\u0146\u0148\5\24\13\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"
      + "\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"
      + "\2\2\u014c\u014e\5,\27\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"
      + "\u014f\3\2\2\2\u014f\u0153\7&\2\2\u0150\u0152\5\62\32\2\u0151\u0150\3"
      + "\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"
      + "\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\7\2\2\u0157+\3\2\2\2"
      + "\u0158\u0159\7(\2\2\u0159\u015e\5.\30\2\u015a\u015b\7\36\2\2\u015b\u015d"
      + "\5.\30\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"
      + "\u015f\3\2\2\2\u015f-\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\7:\2\2\u0162"
      + "\u0164\5\60\31\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0168\3"
      + "\2\2\2\u0165\u0167\5\24\13\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168"
      + "\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169/\3\2\2\2\u016a\u0168\3\2\2\2"
      + "\u016b\u016c\7\5\2\2\u016c\u0171\5\u008eH\2\u016d\u016e\7\36\2\2\u016e"
      + "\u0170\5\u008eH\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f"
      + "\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174"
      + "\u0175\7\66\2\2\u0175\61\3\2\2\2\u0176\u017b\5\64\33\2\u0177\u0178\7\36"
      + "\2\2\u0178\u017a\5\64\33\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b"
      + "\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2"
      + "\2\2\u017e\u017f\7\"\2\2\u017f\u0180\5\u008eH\2\u0180\u0181\7\64\2\2\u0181"
      + "\u0190\3\2\2\2\u0182\u0184\5\u008eH\2\u0183\u0182\3\2\2\2\u0183\u0184"
      + "\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u018a\5\64\33\2\u0186\u0187\7\36\2"
      + "\2\u0187\u0189\5\64\33\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a"
      + "\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2"
      + "\2\2\u018d\u018e\7\64\2\2\u018e\u0190\3\2\2\2\u018f\u0176\3\2\2\2\u018f"
      + "\u0183\3\2\2\2\u0190\63\3\2\2\2\u0191\u0195\7:\2\2\u0192\u0194\5\24\13"
      + "\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196"
      + "\3\2\2\2\u0196\65\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7\f\2\2\u0199"
      + "\u019b\58\35\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2"
      + "\2\2\u019c\u019d\3\2\2\2\u019d\67\3\2\2\2\u019e\u01a3\5:\36\2\u019f\u01a0"
      + "\7\36\2\2\u01a0\u01a2\5:\36\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2"
      + "\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3"
      + "\3\2\2\2\u01a6\u01a7\7\"\2\2\u01a7\u01a8\5\u008eH\2\u01a8\u01a9\7\64\2"
      + "\2\u01a9\u01b8\3\2\2\2\u01aa\u01ac\5\u008eH\2\u01ab\u01aa\3\2\2\2\u01ab"
      + "\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b2\5:\36\2\u01ae\u01af\7\36"
      + "\2\2\u01af\u01b1\5:\36\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"
      + "\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2"
      + "\2\2\u01b5\u01b6\7\64\2\2\u01b6\u01b8\3\2\2\2\u01b7\u019e\3\2\2\2\u01b7"
      + "\u01ab\3\2\2\2\u01b89\3\2\2\2\u01b9\u01bd\7;\2\2\u01ba\u01bc\5\24\13\2"
      + "\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be"
      + "\3\2\2\2\u01be;\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2\7/\2\2\u01c1\u01c3"
      + "\5&\24\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01f6\3\2\2\2\u01c4"
      + "\u01d1\7:\2\2\u01c5\u01ce\7!\2\2\u01c6\u01cb\5> \2\u01c7\u01c8\7\36\2"
      + "\2\u01c8\u01ca\5> \2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9"
      + "\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"
      + "\u01c6\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\7\t"
      + "\2\2\u01d1\u01c5\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"
      + "\u01d4\7\"\2\2\u01d4\u01d8\5\u008eH\2\u01d5\u01d7\5\24\13\2\u01d6\u01d5"
      + "\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"
      + "\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\5L\'\2\u01dc\u01f7\3\2"
      + "\2\2\u01dd\u01df\5\u008eH\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df"
      + "\u01e0\3\2\2\2\u01e0\u01ed\7:\2\2\u01e1\u01ea\7!\2\2\u01e2\u01e7\5> \2"
      + "\u01e3\u01e4\7\36\2\2\u01e4\u01e6\5> \2\u01e5\u01e3\3\2\2\2\u01e6\u01e9"
      + "\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"
      + "\u01e7\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2"
      + "\2\2\u01ec\u01ee\7\t\2\2\u01ed\u01e1\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"
      + "\u01f2\3\2\2\2\u01ef\u01f1\5\24\13\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3"
      + "\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4"
      + "\u01f2\3\2\2\2\u01f5\u01f7\5L\'\2\u01f6\u01c4\3\2\2\2\u01f6\u01de\3\2"
      + "\2\2\u01f7=\3\2\2\2\u01f8\u01fc\7:\2\2\u01f9\u01fb\5\24\13\2\u01fa\u01f9"
      + "\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"
      + "\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7\"\2\2\u0200\u020c\5\u008e"
      + "H\2\u0201\u0203\5\u008eH\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203"
      + "\u0204\3\2\2\2\u0204\u0208\7:\2\2\u0205\u0207\5\24\13\2\u0206\u0205\3"
      + "\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"
      + "\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u01f8\3\2\2\2\u020b\u0202\3\2"
      + "\2\2\u020c?\3\2\2\2\u020d\u020f\7\17\2\2\u020e\u0210\5&\24\2\u020f\u020e"
      + "\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0248\3\2\2\2\u0211\u021e\7:\2\2\u0212"
      + "\u021b\7!\2\2\u0213\u0218\5> \2\u0214\u0215\7\36\2\2\u0215\u0217\5> \2"
      + "\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219"
      + "\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u0213\3\2\2\2\u021b"
      + "\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\7\t\2\2\u021e\u0212\3\2"
      + "\2\2\u021e\u021f\3\2\2\2\u021f\u0223\3\2\2\2\u0220\u0222\5\24\13\2\u0221"
      + "\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"
      + "\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7\"\2\2\u0227"
      + "\u0228\5\u008eH\2\u0228\u0229\7\r\2\2\u0229\u022a\5p9\2\u022a\u022b\7"
      + "\64\2\2\u022b\u0249\3\2\2\2\u022c\u022e\5\u008eH\2\u022d\u022c\3\2\2\2"
      + "\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u023c\7:\2\2\u0230\u0239"
      + "\7!\2\2\u0231\u0236\5> \2\u0232\u0233\7\36\2\2\u0233\u0235\5> \2\u0234"
      + "\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2"
      + "\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u0231\3\2\2\2\u0239"
      + "\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\7\t\2\2\u023c\u0230\3\2"
      + "\2\2\u023c\u023d\3\2\2\2\u023d\u0241\3\2\2\2\u023e\u0240\5\24\13\2\u023f"
      + "\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2"
      + "\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245\7\r\2\2\u0245"
      + "\u0246\5p9\2\u0246\u0247\7\64\2\2\u0247\u0249\3\2\2\2\u0248\u0211\3\2"
      + "\2\2\u0248\u022d\3\2\2\2\u0249A\3\2\2\2\u024a\u024c\7\65\2\2\u024b\u024d"
      + "\5&\24\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e"
      + "\u0252\7:\2\2\u024f\u0251\5\24\13\2\u0250\u024f\3\2\2\2\u0251\u0254\3"
      + "\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254"
      + "\u0252\3\2\2\2\u0255\u0259\7&\2\2\u0256\u0258\5D#\2\u0257\u0256\3\2\2"
      + "\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c"
      + "\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\7\7\2\2\u025dC\3\2\2\2\u025e"
      + "\u0260\7\61\2\2\u025f\u0261\5&\24\2\u0260\u025f\3\2\2\2\u0260\u0261\3"
      + "\2\2\2\u0261\u0262\3\2\2\2\u0262\u0266\7:\2\2\u0263\u0265\5\24\13\2\u0264"
      + "\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"
      + "\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026b\5,\27\2\u026a"
      + "\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u02d9\7\64"
      + "\2\2\u026d\u026f\7\63\2\2\u026e\u0270\5&\24\2\u026f\u026e\3\2\2\2\u026f"
      + "\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0277\7:\2\2\u0272\u0274\7!\2"
      + "\2\u0273\u0275\5F$\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276"
      + "\3\2\2\2\u0276\u0278\7\t\2\2\u0277\u0272\3\2\2\2\u0277\u0278\3\2\2\2\u0278"
      + "\u027c\3\2\2\2\u0279\u027b\5\24\13\2\u027a\u0279\3\2\2\2\u027b\u027e\3"
      + "\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e"
      + "\u027c\3\2\2\2\u027f\u02d9\7\64\2\2\u0280\u0282\7\35\2\2\u0281\u0283\5"
      + "&\24\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284"
      + "\u028a\7:\2\2\u0285\u0287\7!\2\2\u0286\u0288\5F$\2\u0287\u0286\3\2\2\2"
      + "\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\7\t\2\2\u028a\u0285"
      + "\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028f\3\2\2\2\u028c\u028e\5\24\13\2"
      + "\u028d\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290"
      + "\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\7\"\2\2\u0293"
      + "\u0294\5\u008eH\2\u0294\u0295\7\64\2\2\u0295\u02d9\3\2\2\2\u0296\u0298"
      + "\7\35\2\2\u0297\u0299\5&\24\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2"
      + "\u0299\u029b\3\2\2\2\u029a\u029c\5\u008eH\2\u029b\u029a\3\2\2\2\u029b"
      + "\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a3\7:\2\2\u029e\u02a0\7!\2"
      + "\2\u029f\u02a1\5F$\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2"
      + "\3\2\2\2\u02a2\u02a4\7\t\2\2\u02a3\u029e\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"
      + "\u02a8\3\2\2\2\u02a5\u02a7\5\24\13\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3"
      + "\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa"
      + "\u02a8\3\2\2\2\u02ab\u02d9\7\64\2\2\u02ac\u02ae\79\2\2\u02ad\u02af\5&"
      + "\24\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"
      + "\u02b6\7:\2\2\u02b1\u02b3\7!\2\2\u02b2\u02b4\5F$\2\u02b3\u02b2\3\2\2\2"
      + "\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\7\t\2\2\u02b6\u02b1"
      + "\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02bb\3\2\2\2\u02b8\u02ba\5\24\13\2"
      + "\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc"
      + "\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7\"\2\2\u02bf"
      + "\u02c0\5\u008eH\2\u02c0\u02c1\7\64\2\2\u02c1\u02d9\3\2\2\2\u02c2\u02c4"
      + "\79\2\2\u02c3\u02c5\5&\24\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"
      + "\u02c7\3\2\2\2\u02c6\u02c8\5\u008eH\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8"
      + "\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cf\7:\2\2\u02ca\u02cc\7!\2\2\u02cb"
      + "\u02cd\5F$\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2"
      + "\2\u02ce\u02d0\7\t\2\2\u02cf\u02ca\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d4"
      + "\3\2\2\2\u02d1\u02d3\5\24\13\2\u02d2\u02d1\3\2\2\2\u02d3\u02d6\3\2\2\2"
      + "\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4"
      + "\3\2\2\2\u02d7\u02d9\7\64\2\2\u02d8\u025e\3\2\2\2\u02d8\u026d\3\2\2\2"
      + "\u02d8\u0280\3\2\2\2\u02d8\u0296\3\2\2\2\u02d8\u02ac\3\2\2\2\u02d8\u02c2"
      + "\3\2\2\2\u02d9E\3\2\2\2\u02da\u02df\5H%\2\u02db\u02dc\7\36\2\2\u02dc\u02de"
      + "\5H%\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"
      + "\u02e0\3\2\2\2\u02e0\u02e4\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\7\36"
      + "\2\2\u02e3\u02e5\5J&\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e8"
      + "\3\2\2\2\u02e6\u02e8\5J&\2\u02e7\u02da\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8"
      + "G\3\2\2\2\u02e9\u02ed\7:\2\2\u02ea\u02ec\5\24\13\2\u02eb\u02ea\3\2\2\2"
      + "\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0"
      + "\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\7\"\2\2\u02f1\u02fd\5\u008eH"
      + "\2\u02f2\u02f4\5\u008eH\2\u02f3\u02f5\7:\2\2\u02f4\u02f3\3\2\2\2\u02f4"
      + "\u02f5\3\2\2\2\u02f5\u02f9\3\2\2\2\u02f6\u02f8\5\24\13\2\u02f7\u02f6\3"
      + "\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"
      + "\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02e9\3\2\2\2\u02fc\u02f2\3\2"
      + "\2\2\u02fdI\3\2\2\2\u02fe\u02ff\7:\2\2\u02ff\u0303\7%\2\2\u0300\u0302"
      + "\5\24\13\2\u0301\u0300\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2"
      + "\u0303\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307"
      + "\7\"\2\2\u0307\u0314\5\u008eH\2\u0308\u0309\5\u008eH\2\u0309\u030b\7%"
      + "\2\2\u030a\u030c\7:\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c"
      + "\u0310\3\2\2\2\u030d\u030f\5\24\13\2\u030e\u030d\3\2\2\2\u030f\u0312\3"
      + "\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0314\3\2\2\2\u0312"
      + "\u0310\3\2\2\2\u0313\u02fe\3\2\2\2\u0313\u0308\3\2\2\2\u0314K\3\2\2\2"
      + "\u0315\u0317\7&\2\2\u0316\u0318\5N(\2\u0317\u0316\3\2\2\2\u0317\u0318"
      + "\3\2\2\2\u0318\u031c\3\2\2\2\u0319\u031b\5T+\2\u031a\u0319\3\2\2\2\u031b"
      + "\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0322\3\2"
      + "\2\2\u031e\u031c\3\2\2\2\u031f\u0321\5n8\2\u0320\u031f\3\2\2\2\u0321\u0324"
      + "\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324"
      + "\u0322\3\2\2\2\u0325\u0328\7\7\2\2\u0326\u0328\7\64\2\2\u0327\u0315\3"
      + "\2\2\2\u0327\u0326\3\2\2\2\u0328M\3\2\2\2\u0329\u032b\5P)\2\u032a\u0329"
      + "\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"
      + "O\3\2\2\2\u032e\u0333\5R*\2\u032f\u0330\7\36\2\2\u0330\u0332\5R*\2\u0331"
      + "\u032f\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2"
      + "\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\7\"\2\2\u0337"
      + "\u0338\5\u008eH\2\u0338\u0339\7\64\2\2\u0339\u0348\3\2\2\2\u033a\u033c"
      + "\5\u008eH\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2"
      + "\2\u033d\u0342\5R*\2\u033e\u033f\7\36\2\2\u033f\u0341\5R*\2\u0340\u033e"
      + "\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343"
      + "\u0345\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0346\7\64\2\2\u0346\u0348\3"
      + "\2\2\2\u0347\u032e\3\2\2\2\u0347\u033b\3\2\2\2\u0348Q\3\2\2\2\u0349\u034d"
      + "\7:\2\2\u034a\u034c\5\24\13\2\u034b\u034a\3\2\2\2\u034c\u034f\3\2\2\2"
      + "\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034eS\3\2\2\2\u034f\u034d\3"
      + "\2\2\2\u0350\u0354\7<\2\2\u0351\u0353\5\24\13\2\u0352\u0351\3\2\2\2\u0353"
      + "\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u035f\3\2"
      + "\2\2\u0356\u0354\3\2\2\2\u0357\u035c\5V,\2\u0358\u0359\7\27\2\2\u0359"
      + "\u035b\5V,\2\u035a\u0358\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2"
      + "\2\u035c\u035d\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0357"
      + "\3\2\2\2\u035f\u0360\3\2\2\2\u0360U\3\2\2\2\u0361\u0363\5X-\2\u0362\u0361"
      + "\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u036e\7\22\2\2"
      + "\u0365\u036a\7:\2\2\u0366\u0367\7\36\2\2\u0367\u0369\7:\2\2\u0368\u0366"
      + "\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"
      + "\u036d\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036f\7I\2\2\u036e\u0365\3\2"
      + "\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\7:\2\2\u0371"
      + "\u0375\5z>\2\u0372\u0374\5\24\13\2\u0373\u0372\3\2\2\2\u0374\u0377\3\2"
      + "\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0379\3\2\2\2\u0377"
      + "\u0375\3\2\2\2\u0378\u037a\5d\63\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2"
      + "\2\2\u037a\u037e\3\2\2\2\u037b\u037d\5\24\13\2\u037c\u037b\3\2\2\2\u037d"
      + "\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0394\3\2"
      + "\2\2\u0380\u037e\3\2\2\2\u0381\u0383\5X-\2\u0382\u0381\3\2\2\2\u0382\u0383"
      + "\3\2\2\2\u0383\u0387\3\2\2\2\u0384\u0386\5Z.\2\u0385\u0384\3\2\2\2\u0386"
      + "\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038b\3\2"
      + "\2\2\u0389\u0387\3\2\2\2\u038a\u038c\5b\62\2\u038b\u038a\3\2\2\2\u038b"
      + "\u038c\3\2\2\2\u038c\u0390\3\2\2\2\u038d\u038f\5\24\13\2\u038e\u038d\3"
      + "\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391"
      + "\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0362\3\2\2\2\u0393\u0382\3\2"
      + "\2\2\u0394W\3\2\2\2\u0395\u0399\5p9\2\u0396\u0398\5\24\13\2\u0397\u0396"
      + "\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"
      + "\u039c\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039d\7\25\2\2\u039d\u03a6\3"
      + "\2\2\2\u039e\u03a2\7*\2\2\u039f\u03a1\5\24\13\2\u03a0\u039f\3\2\2\2\u03a1"
      + "\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a6\3\2"
      + "\2\2\u03a4\u03a2\3\2\2\2\u03a5\u0395\3\2\2\2\u03a5\u039e\3\2\2\2\u03a6"
      + "Y\3\2\2\2\u03a7\u03a8\7\26\2\2\u03a8\u03ab\5p9\2\u03a9\u03aa\7\36\2\2"
      + "\u03aa\u03ac\5p9\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b0"
      + "\3\2\2\2\u03ad\u03af\5\24\13\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3\2\2\2"
      + "\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b0"
      + "\3\2\2\2\u03b3\u03b4\7\64\2\2\u03b4\u0401\3\2\2\2\u03b5\u03b6\7\33\2\2"
      + "\u03b6\u03b9\5p9\2\u03b7\u03b8\7\36\2\2\u03b8\u03ba\5p9\2\u03b9\u03b7"
      + "\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03be\3\2\2\2\u03bb\u03bd\5\24\13\2"
      + "\u03bc\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf"
      + "\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2\7\64\2\2"
      + "\u03c2\u0401\3\2\2\2\u03c3\u03c4\7\n\2\2\u03c4\u03c8\5p9\2\u03c5\u03c7"
      + "\5\24\13\2\u03c6\u03c5\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2"
      + "\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cc"
      + "\7\64\2\2\u03cc\u0401\3\2\2\2\u03cd\u03cf\7\62\2\2\u03ce\u03d0\5\60\31"
      + "\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d6"
      + "\7:\2\2\u03d2\u03d3\7\4\2\2\u03d3\u03d4\5p9\2\u03d4\u03d5\7\32\2\2\u03d5"
      + "\u03d7\3\2\2\2\u03d6\u03d2\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2"
      + "\2\2\u03d8\u03dc\5z>\2\u03d9\u03db\5\24\13\2\u03da\u03d9\3\2\2\2\u03db"
      + "\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2"
      + "\2\2\u03de\u03dc\3\2\2\2\u03df\u03e0\7\64\2\2\u03e0\u0401\3\2\2\2\u03e1"
      + "\u03e3\7:\2\2\u03e2\u03e4\5\60\31\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3"
      + "\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e9\5z>\2\u03e6\u03e8\5\24\13\2\u03e7"
      + "\u03e6\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2"
      + "\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ed\7\64\2\2\u03ed"
      + "\u0401\3\2\2\2\u03ee\u03ef\5\\/\2\u03ef\u03f0\7I\2\2\u03f0\u03f5\5`\61"
      + "\2\u03f1\u03f2\7\36\2\2\u03f2\u03f4\5`\61\2\u03f3\u03f1\3\2\2\2\u03f4"
      + "\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03fb\3\2"
      + "\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03fa\5\24\13\2\u03f9\u03f8\3\2\2\2\u03fa"
      + "\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\3\2"
      + "\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff\7\64\2\2\u03ff\u0401\3\2\2\2\u0400"
      + "\u03a7\3\2\2\2\u0400\u03b5\3\2\2\2\u0400\u03c3\3\2\2\2\u0400\u03cd\3\2"
      + "\2\2\u0400\u03e1\3\2\2\2\u0400\u03ee\3\2\2\2\u0401[\3\2\2\2\u0402\u0407"
      + "\5^\60\2\u0403\u0404\7\36\2\2\u0404\u0406\5^\60\2\u0405\u0403\3\2\2\2"
      + "\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408]\3"
      + "\2\2\2\u0409\u0407\3\2\2\2\u040a\u040e\5p9\2\u040b\u040d\5\24\13\2\u040c"
      + "\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2"
      + "\2\2\u040f_\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0413\5\24\13\2\u0412\u0411"
      + "\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"
      + "\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0418\5p9\2\u0418a\3\2\2\2\u0419"
      + "\u0453\5d\63\2\u041a\u0423\7\60\2\2\u041b\u0420\5p9\2\u041c\u041d\7\36"
      + "\2\2\u041d\u041f\5p9\2\u041e\u041c\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e"
      + "\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0423"
      + "\u041b\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0428\3\2\2\2\u0425\u0427\5\24"
      + "\13\2\u0426\u0425\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428"
      + "\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u0453\7\64"
      + "\2\2\u042c\u0431\5f\64\2\u042d\u042e\7*\2\2\u042e\u0430\5f\64\2\u042f"
      + "\u042d\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2"
      + "\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0436\5h\65\2\u0435"
      + "\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u043a\3\2\2\2\u0437\u0439\5\24"
      + "\13\2\u0438\u0437\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a"
      + "\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e\7\64"
      + "\2\2\u043e\u0453\3\2\2\2\u043f\u0440\78\2\2\u0440\u0444\5p9\2\u0441\u0443"
      + "\5j\66\2\u0442\u0441\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444"
      + "\u0445\3\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0449\5l"
      + "\67\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044d\3\2\2\2\u044a"
      + "\u044c\5\24\13\2\u044b\u044a\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3"
      + "\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u044d\3\2\2\2\u0450"
      + "\u0451\7\64\2\2\u0451\u0453\3\2\2\2\u0452\u0419\3\2\2\2\u0452\u041a\3"
      + "\2\2\2\u0452\u042c\3\2\2\2\u0452\u043f\3\2\2\2\u0453c\3\2\2\2\u0454\u0455"
      + "\7\16\2\2\u0455\u0459\7:\2\2\u0456\u0458\5\24\13\2\u0457\u0456\3\2\2\2"
      + "\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c"
      + "\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045d\7\64\2\2\u045de\3\2\2\2\u045e"
      + "\u045f\7#\2\2\u045f\u0460\5p9\2\u0460\u0464\7\67\2\2\u0461\u0463\5\24"
      + "\13\2\u0462\u0461\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2\2\2\u0464"
      + "\u0465\3\2\2\2\u0465\u0467\3\2\2\2\u0466\u0464\3\2\2\2\u0467\u0468\7\16"
      + "\2\2\u0468\u0469\7:\2\2\u0469g\3\2\2\2\u046a\u046e\7*\2\2\u046b\u046d"
      + "\5\24\13\2\u046c\u046b\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2\2\2"
      + "\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470\u046e\3\2\2\2\u0471\u0472"
      + "\7\16\2\2\u0472\u0473\7:\2\2\u0473i\3\2\2\2\u0474\u0475\7\27\2\2\u0475"
      + "\u0476\5\u0092J\2\u0476\u047a\7.\2\2\u0477\u0479\5\24\13\2\u0478\u0477"
      + "\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b"
      + "\u047d\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e\7\16\2\2\u047e\u047f\7"
      + ":\2\2\u047fk\3\2\2\2\u0480\u0481\7\27\2\2\u0481\u0482\7*\2\2\u0482\u0486"
      + "\7.\2\2\u0483\u0485\5\24\13\2\u0484\u0483\3\2\2\2\u0485\u0488\3\2\2\2"
      + "\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\3\2\2\2\u0488\u0486"
      + "\3\2\2\2\u0489\u048a\7\16\2\2\u048a\u048b\7:\2\2\u048bm\3\2\2\2\u048c"
      + "\u0490\7)\2\2\u048d\u048f\5\24\13\2\u048e\u048d\3\2\2\2\u048f\u0492\3"
      + "\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u049e\3\2\2\2\u0492"
      + "\u0490\3\2\2\2\u0493\u0495\7:\2\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2"
      + "\2\2\u0495\u0496\3\2\2\2\u0496\u0497\7\"\2\2\u0497\u049f\5\u008eH\2\u0498"
      + "\u049a\5\u008eH\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c"
      + "\3\2\2\2\u049b\u049d\7:\2\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d"
      + "\u049f\3\2\2\2\u049e\u0494\3\2\2\2\u049e\u0499\3\2\2\2\u049f\u04a0\3\2"
      + "\2\2\u04a0\u04a1\7\13\2\2\u04a1\u04a2\7\4\2\2\u04a2\u04a3\7:\2\2\u04a3"
      + "\u04a4\7\30\2\2\u04a4\u04a5\7:\2\2\u04a5\u04a6\7\32\2\2\u04a6\u04a7\5"
      + "d\63\2\u04a7o\3\2\2\2\u04a8\u04a9\b9\1\2\u04a9\u04aa\7!\2\2\u04aa\u04ab"
      + "\5\u008eH\2\u04ab\u04ac\7\t\2\2\u04ac\u04ad\5p9\2\u04ad\u04c2\3\2\2\2"
      + "\u04ae\u04af\t\2\2\2\u04af\u04c2\5p9\2\u04b0\u04b4\5x=\2\u04b1\u04b3\5"
      + "v<\2\u04b2\u04b1\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4"
      + "\u04b5\3\2\2\2\u04b5\u04c2\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04bc\5r"
      + ":\2\u04b8\u04b9\7*\2\2\u04b9\u04bb\5r:\2\u04ba\u04b8\3\2\2\2\u04bb\u04be"
      + "\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04bf\3\2\2\2\u04be"
      + "\u04bc\3\2\2\2\u04bf\u04c0\5t;\2\u04c0\u04c2\3\2\2\2\u04c1\u04a8\3\2\2"
      + "\2\u04c1\u04ae\3\2\2\2\u04c1\u04b0\3\2\2\2\u04c1\u04b7\3\2\2\2\u04c2\u04e9"
      + "\3\2\2\2\u04c3\u04c4\69\2\3\u04c4\u04c5\7:\2\2\u04c5\u04e8\5p9\2\u04c6"
      + "\u04c7\69\3\3\u04c7\u04c8\7G\2\2\u04c8\u04e8\5p9\2\u04c9\u04ca\69\4\3"
      + "\u04ca\u04cb\7F\2\2\u04cb\u04e8\5p9\2\u04cc\u04cd\69\5\3\u04cd\u04ce\7"
      + "E\2\2\u04ce\u04e8\5p9\2\u04cf\u04d0\69\6\3\u04d0\u04d1\t\3\2\2\u04d1\u04e8"
      + "\5p9\2\u04d2\u04d3\69\7\3\u04d3\u04d4\7C\2\2\u04d4\u04e8\5p9\2\u04d5\u04d6"
      + "\69\b\3\u04d6\u04d7\7@\2\2\u04d7\u04e8\5p9\2\u04d8\u04d9\69\t\3\u04d9"
      + "\u04da\7A\2\2\u04da\u04e8\5p9\2\u04db\u04dc\69\n\3\u04dc\u04dd\7B\2\2"
      + "\u04dd\u04e8\5p9\2\u04de\u04df\69\13\3\u04df\u04e0\7>\2\2\u04e0\u04e8"
      + "\5p9\2\u04e1\u04e2\69\f\3\u04e2\u04e3\7?\2\2\u04e3\u04e8\5p9\2\u04e4\u04e5"
      + "\69\r\3\u04e5\u04e6\t\4\2\2\u04e6\u04e8\5p9\2\u04e7\u04c3\3\2\2\2\u04e7"
      + "\u04c6\3\2\2\2\u04e7\u04c9\3\2\2\2\u04e7\u04cc\3\2\2\2\u04e7\u04cf\3\2"
      + "\2\2\u04e7\u04d2\3\2\2\2\u04e7\u04d5\3\2\2\2\u04e7\u04d8\3\2\2\2\u04e7"
      + "\u04db\3\2\2\2\u04e7\u04de\3\2\2\2\u04e7\u04e1\3\2\2\2\u04e7\u04e4\3\2"
      + "\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea"
      + "q\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04ed\7#\2\2\u04ed\u04ee\5p9\2\u04ee"
      + "\u04f2\7\67\2\2\u04ef\u04f1\5\24\13\2\u04f0\u04ef\3\2\2\2\u04f1\u04f4"
      + "\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4"
      + "\u04f2\3\2\2\2\u04f5\u04f6\5p9\2\u04f6s\3\2\2\2\u04f7\u04fb\7*\2\2\u04f8"
      + "\u04fa\5\24\13\2\u04f9\u04f8\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3"
      + "\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe"
      + "\u04ff\5p9\2\u04ffu\3\2\2\2\u0500\u0501\7\4\2\2\u0501\u0506\5p9\2\u0502"
      + "\u0503\7\36\2\2\u0503\u0505\5p9\2\u0504\u0502\3\2\2\2\u0505\u0508\3\2"
      + "\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\3\2\2\2\u0508"
      + "\u0506\3\2\2\2\u0509\u050a\7\32\2\2\u050a\u0512\3\2\2\2\u050b\u050c\7"
      + "-\2\2\u050c\u0512\7:\2\2\u050d\u050f\5\60\31\2\u050e\u050d\3\2\2\2\u050e"
      + "\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\5z>\2\u0511\u0500\3\2\2"
      + "\2\u0511\u050b\3\2\2\2\u0511\u050e\3\2\2\2\u0512w\3\2\2\2\u0513\u0592"
      + "\7:\2\2\u0514\u0592\7;\2\2\u0515\u0592\5\u0092J\2\u0516\u0592\5z>\2\u0517"
      + "\u0518\7\'\2\2\u0518\u051d\5\u0080A\2\u0519\u051a\7\36\2\2\u051a\u051c"
      + "\5\u0080A\2\u051b\u0519\3\2\2\2\u051c\u051f\3\2\2\2\u051d\u051b\3\2\2"
      + "\2\u051d\u051e\3\2\2\2\u051e\u0520\3\2\2\2\u051f\u051d\3\2\2\2\u0520\u0521"
      + "\7\34\2\2\u0521\u0522\5p9\2\u0522\u0592\3\2\2\2\u0523\u0524\5~@\2\u0524"
      + "\u0525\7\4\2\2\u0525\u0526\5p9\2\u0526\u0527\7\30\2\2\u0527\u0528\5p9"
      + "\2\u0528\u0529\7\32\2\2\u0529\u0592\3\2\2\2\u052a\u052b\5~@\2\u052b\u0534"
      + "\7\4\2\2\u052c\u0531\5p9\2\u052d\u052e\7\36\2\2\u052e\u0530\5p9\2\u052f"
      + "\u052d\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2"
      + "\2\2\u0532\u0535\3\2\2\2\u0533\u0531\3\2\2\2\u0534\u052c\3\2\2\2\u0534"
      + "\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\7\32\2\2\u0537\u0592\3"
      + "\2\2\2\u0538\u0539\5~@\2\u0539\u0542\7&\2\2\u053a\u053f\5p9\2\u053b\u053c"
      + "\7\36\2\2\u053c\u053e\5p9\2\u053d\u053b\3\2\2\2\u053e\u0541\3\2\2\2\u053f"
      + "\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2"
      + "\2\2\u0542\u053a\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\3\2\2\2\u0544"
      + "\u0545\7\7\2\2\u0545\u0592\3\2\2\2\u0546\u0547\5~@\2\u0547\u0551\7&\2"
      + "\2\u0548\u0552\7\b\2\2\u0549\u054e\5\u0082B\2\u054a\u054b\7\36\2\2\u054b"
      + "\u054d\5\u0082B\2\u054c\u054a\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c"
      + "\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0551"
      + "\u0548\3\2\2\2\u0551\u0549\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\7\7"
      + "\2\2\u0554\u0592\3\2\2\2\u0555\u0556\5~@\2\u0556\u055f\7\4\2\2\u0557\u055c"
      + "\5\u0084C\2\u0558\u0559\7\36\2\2\u0559\u055b\5\u0084C\2\u055a\u0558\3"
      + "\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055d\3\2\2\2\u055d"
      + "\u0560\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0557\3\2\2\2\u055f\u0560\3\2"
      + "\2\2\u0560\u0561\3\2\2\2\u0561\u0562\7\32\2\2\u0562\u0592\3\2\2\2\u0563"
      + "\u0564\5~@\2\u0564\u0565\7&\2\2\u0565\u056a\5\u0088E\2\u0566\u0567\7\27"
      + "\2\2\u0567\u0569\5\u0088E\2\u0568\u0566\3\2\2\2\u0569\u056c\3\2\2\2\u056a"
      + "\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056a\3\2"
      + "\2\2\u056d\u056e\7\7\2\2\u056e\u0592\3\2\2\2\u056f\u0570\5~@\2\u0570\u0572"
      + "\7:\2\2\u0571\u0573\5\60\31\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2"
      + "\u0573\u0574\3\2\2\2\u0574\u057d\7&\2\2\u0575\u057a\5\u008aF\2\u0576\u0577"
      + "\7\36\2\2\u0577\u0579\5\u008aF\2\u0578\u0576\3\2\2\2\u0579\u057c\3\2\2"
      + "\2\u057a\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057a"
      + "\3\2\2\2\u057d\u0575\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2\u057f"
      + "\u0580\7\7\2\2\u0580\u0592\3\2\2\2\u0581\u0582\5~@\2\u0582\u0586\5\u0094"
      + "K\2\u0583\u0585\5\u008cG\2\u0584\u0583\3\2\2\2\u0585\u0588\3\2\2\2\u0586"
      + "\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u058c\3\2\2\2\u0588\u0586\3\2"
      + "\2\2\u0589\u058b\5\u0090I\2\u058a\u0589\3\2\2\2\u058b\u058e\3\2\2\2\u058c"
      + "\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u0592\3\2\2\2\u058e\u058c\3\2"
      + "\2\2\u058f\u0590\7,\2\2\u0590\u0592\5\u008eH\2\u0591\u0513\3\2\2\2\u0591"
      + "\u0514\3\2\2\2\u0591\u0515\3\2\2\2\u0591\u0516\3\2\2\2\u0591\u0517\3\2"
      + "\2\2\u0591\u0523\3\2\2\2\u0591\u052a\3\2\2\2\u0591\u0538\3\2\2\2\u0591"
      + "\u0546\3\2\2\2\u0591\u0555\3\2\2\2\u0591\u0563\3\2\2\2\u0591\u056f\3\2"
      + "\2\2\u0591\u0581\3\2\2\2\u0591\u058f\3\2\2\2\u0592y\3\2\2\2\u0593\u059c"
      + "\7!\2\2\u0594\u0599\5|?\2\u0595\u0596\7\36\2\2\u0596\u0598\5|?\2\u0597"
      + "\u0595\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2"
      + "\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059c\u0594\3\2\2\2\u059c"
      + "\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\7\t\2\2\u059f{\3\2\2\2"
      + "\u05a0\u05a4\5p9\2\u05a1\u05a3\5\24\13\2\u05a2\u05a1\3\2\2\2\u05a3\u05a6"
      + "\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5}\3\2\2\2\u05a6"
      + "\u05a4\3\2\2\2\u05a7\u05a8\t\5\2\2\u05a8\177\3\2\2\2\u05a9\u05ac\7:\2"
      + "\2\u05aa\u05ab\7\36\2\2\u05ab\u05ad\7:\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad"
      + "\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\7\r\2\2\u05af\u05b0\5p9\2\u05b0"
      + "\u0081\3\2\2\2\u05b1\u05b2\5p9\2\u05b2\u05b3\7\b\2\2\u05b3\u05b4\5p9\2"
      + "\u05b4\u0083\3\2\2\2\u05b5\u05be\7\4\2\2\u05b6\u05bb\5\u0086D\2\u05b7"
      + "\u05b8\7\36\2\2\u05b8\u05ba\5\u0086D\2\u05b9\u05b7\3\2\2\2\u05ba\u05bd"
      + "\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd"
      + "\u05bb\3\2\2\2\u05be\u05b6\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2"
      + "\2\2\u05c0\u05c1\7\32\2\2\u05c1\u0085\3\2\2\2\u05c2\u05c5\5\u0084C\2\u05c3"
      + "\u05c5\5p9\2\u05c4\u05c2\3\2\2\2\u05c4\u05c3\3\2\2\2\u05c5\u0087\3\2\2"
      + "\2\u05c6\u05cb\5> \2\u05c7\u05c8\7\36\2\2\u05c8\u05ca\5> \2\u05c9\u05c7"
      + "\3\2\2\2\u05ca\u05cd\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc"
      + "\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05ce\u05c6\3\2\2\2\u05ce\u05cf\3\2"
      + "\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\7.\2\2\u05d1\u05d2\5p9\2\u05d2\u0089"
      + "\3\2\2\2\u05d3\u05d4\7:\2\2\u05d4\u05d5\7\r\2\2\u05d5\u05d6\5p9\2\u05d6"
      + "\u008b\3\2\2\2\u05d7\u05d8\7\4\2\2\u05d8\u05dd\5p9\2\u05d9\u05da\7\36"
      + "\2\2\u05da\u05dc\5p9\2\u05db\u05d9\3\2\2\2\u05dc\u05df\3\2\2\2\u05dd\u05db"
      + "\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0\3\2\2\2\u05df\u05dd\3\2\2\2\u05e0"
      + "\u05e1\7\32\2\2\u05e1\u008d\3\2\2\2\u05e2\u05e6\5\u0094K\2\u05e3\u05e5"
      + "\5\u0090I\2\u05e4\u05e3\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e4\3\2\2"
      + "\2\u05e6\u05e7\3\2\2\2\u05e7\u008f\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e9\u05ea"
      + "\7\4\2\2\u05ea\u0603\7\32\2\2\u05eb\u05ec\7\4\2\2\u05ec\u05ed\5\u0092"
      + "J\2\u05ed\u05ee\7\32\2\2\u05ee\u0603\3\2\2\2\u05ef\u05f1\7\4\2\2\u05f0"
      + "\u05f2\7\36\2\2\u05f1\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f1\3"
      + "\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u0603\7\32\2\2\u05f6"
      + "\u05f7\7\4\2\2\u05f7\u05fa\5\u0092J\2\u05f8\u05f9\7\36\2\2\u05f9\u05fb"
      + "\5\u0092J\2\u05fa\u05f8\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fa\3\2\2"
      + "\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\7\32\2\2\u05ff"
      + "\u0603\3\2\2\2\u0600\u0601\7&\2\2\u0601\u0603\7\7\2\2\u0602\u05e9\3\2"
      + "\2\2\u0602\u05eb\3\2\2\2\u0602\u05ef\3\2\2\2\u0602\u05f6\3\2\2\2\u0602"
      + "\u0600\3\2\2\2\u0603\u0091\3\2\2\2\u0604\u0611\7+\2\2\u0605\u0611\7\6"
      + "\2\2\u0606\u0611\7\21\2\2\u0607\u0611\7:\2\2\u0608\u0611\7O\2\2\u0609"
      + "\u0611\7J\2\2\u060a\u0611\7L\2\2\u060b\u0611\7K\2\2\u060c\u0611\7M\2\2"
      + "\u060d\u0611\7N\2\2\u060e\u0611\7P\2\2\u060f\u0611\7=\2\2\u0610\u0604"
      + "\3\2\2\2\u0610\u0605\3\2\2\2\u0610\u0606\3\2\2\2\u0610\u0607\3\2\2\2\u0610"
      + "\u0608\3\2\2\2\u0610\u0609\3\2\2\2\u0610\u060a\3\2\2\2\u0610\u060b\3\2"
      + "\2\2\u0610\u060c\3\2\2\2\u0610\u060d\3\2\2\2\u0610\u060e\3\2\2\2\u0610"
      + "\u060f\3\2\2\2\u0611\u0093\3\2\2\2\u0612\u0614\7:\2\2\u0613\u0615\5\60"
      + "\31\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0657\3\2\2\2\u0616"
      + "\u0617\7!\2\2\u0617\u061c\5\u0096L\2\u0618\u0619\7\36\2\2\u0619\u061b"
      + "\5\u0096L\2\u061a\u0618\3\2\2\2\u061b\u061e\3\2\2\2\u061c\u061a\3\2\2"
      + "\2\u061c\u061d\3\2\2\2\u061d\u061f\3\2\2\2\u061e\u061c\3\2\2\2\u061f\u0621"
      + "\7\b\2\2\u0620\u0622\5\u0098M\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2"
      + "\2\u0622\u0623\3\2\2\2\u0623\u0624\7\t\2\2\u0624\u0657\3\2\2\2\u0625\u0626"
      + "\7!\2\2\u0626\u062b\5\u0096L\2\u0627\u0628\7\36\2\2\u0628\u062a\5\u0096"
      + "L\2\u0629\u0627\3\2\2\2\u062a\u062d\3\2\2\2\u062b\u0629\3\2\2\2\u062b"
      + "\u062c\3\2\2\2\u062c\u062e\3\2\2\2\u062d\u062b\3\2\2\2\u062e\u0630\7\23"
      + "\2\2\u062f\u0631\5\u0098M\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631"
      + "\u0632\3\2\2\2\u0632\u0633\7\t\2\2\u0633\u0657\3\2\2\2\u0634\u0635\7!"
      + "\2\2\u0635\u063a\5\u0096L\2\u0636\u0637\7\36\2\2\u0637\u0639\5\u0096L"
      + "\2\u0638\u0636\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2\2\2\u063a\u063b"
      + "\3\2\2\2\u063b\u063d\3\2\2\2\u063c\u063a\3\2\2\2\u063d\u063e\7\t\2\2\u063e"
      + "\u0657\3\2\2\2\u063f\u0640\7&\2\2\u0640\u0645\5\u0096L\2\u0641\u0642\7"
      + "\36\2\2\u0642\u0644\5\u0096L\2\u0643\u0641\3\2\2\2\u0644\u0647\3\2\2\2"
      + "\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u0645"
      + "\3\2\2\2\u0648\u0649\7\b\2\2\u0649\u064a\5\u0098M\2\u064a\u064b\7\7\2"
      + "\2\u064b\u0657\3\2\2\2\u064c\u064d\7&\2\2\u064d\u0650\5\u0096L\2\u064e"
      + "\u064f\7\36\2\2\u064f\u0651\5\u0096L\2\u0650\u064e\3\2\2\2\u0651\u0652"
      + "\3\2\2\2\u0652\u0650\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654"
      + "\u0655\7\7\2\2\u0655\u0657\3\2\2\2\u0656\u0612\3\2\2\2\u0656\u0616\3\2"
      + "\2\2\u0656\u0625\3\2\2\2\u0656\u0634\3\2\2\2\u0656\u063f\3\2\2\2\u0656"
      + "\u064c\3\2\2\2\u0657\u0095\3\2\2\2\u0658\u065c\7:\2\2\u0659\u065b\5\24"
      + "\13\2\u065a\u0659\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065c"
      + "\u065d\3\2\2\2\u065d\u065f\3\2\2\2\u065e\u065c\3\2\2\2\u065f\u0660\7\""
      + "\2\2\u0660\u066c\5\u008eH\2\u0661\u0663\5\u008eH\2\u0662\u0664\7:\2\2"
      + "\u0663\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0668\3\2\2\2\u0665\u0667"
      + "\5\24\13\2\u0666\u0665\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2"
      + "\u0668\u0669\3\2\2\2\u0669\u066c\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u0658"
      + "\3\2\2\2\u066b\u0661\3\2\2\2\u066c\u0097\3\2\2\2\u066d\u0671\5\u008eH"
      + "\2\u066e\u0670\5\24\13\2\u066f\u066e\3\2\2\2\u0670\u0673\3\2\2\2\u0671"
      + "\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0099\3\2\2\2\u0673\u0671\3\2"
      + "\2\2\u00e0\u00b5\u00bb\u00c1\u00c9\u00d1\u00d3\u00dd\u00e6\u00ed\u00f4"
      + "\u00ff\u0109\u0112\u0115\u011d\u0123\u0128\u0135\u013e\u0144\u0149\u014d"
      + "\u0153\u015e\u0163\u0168\u0171\u017b\u0183\u018a\u018f\u0195\u019c\u01a3"
      + "\u01ab\u01b2\u01b7\u01bd\u01c2\u01cb\u01ce\u01d1\u01d8\u01de\u01e7\u01ea"
      + "\u01ed\u01f2\u01f6\u01fc\u0202\u0208\u020b\u020f\u0218\u021b\u021e\u0223"
      + "\u022d\u0236\u0239\u023c\u0241\u0248\u024c\u0252\u0259\u0260\u0266\u026a"
      + "\u026f\u0274\u0277\u027c\u0282\u0287\u028a\u028f\u0298\u029b\u02a0\u02a3"
      + "\u02a8\u02ae\u02b3\u02b6\u02bb\u02c4\u02c7\u02cc\u02cf\u02d4\u02d8\u02df"
      + "\u02e4\u02e7\u02ed\u02f4\u02f9\u02fc\u0303\u030b\u0310\u0313\u0317\u031c"
      + "\u0322\u0327\u032c\u0333\u033b\u0342\u0347\u034d\u0354\u035c\u035f\u0362"
      + "\u036a\u036e\u0375\u0379\u037e\u0382\u0387\u038b\u0390\u0393\u0399\u03a2"
      + "\u03a5\u03ab\u03b0\u03b9\u03be\u03c8\u03cf\u03d6\u03dc\u03e3\u03e9\u03f5"
      + "\u03fb\u0400\u0407\u040e\u0414\u0420\u0423\u0428\u0431\u0435\u043a\u0444"
      + "\u0448\u044d\u0452\u0459\u0464\u046e\u047a\u0486\u0490\u0494\u0499\u049c"
      + "\u049e\u04b4\u04bc\u04c1\u04e7\u04e9\u04f2\u04fb\u0506\u050e\u0511\u051d"
      + "\u0531\u0534\u053f\u0542\u054e\u0551\u055c\u055f\u056a\u0572\u057a\u057d"
      + "\u0586\u058c\u0591\u0599\u059c\u05a4\u05ac\u05bb\u05be\u05c4\u05cb\u05ce"
      + "\u05dd\u05e6\u05f3\u05fc\u0602\u0610\u0614\u061c\u0621\u062b\u0630\u063a"
      + "\u0645\u0652\u0656\u065c\u0663\u0668\u066b\u0671";

  public static final ATN _ATN = ATNSimulator
      .deserialize(Antlr4PilarParser._serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[Antlr4PilarParser._ATN.getNumberOfDecisions()];
    for (int i = 0; i < Antlr4PilarParser._ATN.getNumberOfDecisions(); i++) {
      Antlr4PilarParser._decisionToDFA[i] = new DFA(
          Antlr4PilarParser._ATN.getDecisionState(i), i);
    }
  }

  public Antlr4PilarParser(final TokenStream input) {
    super(input);
    this._interp = new ParserATNSimulator(this, Antlr4PilarParser._ATN,
        Antlr4PilarParser._decisionToDFA, Antlr4PilarParser._sharedContextCache);
  }

  public final ActionContext action() throws RecognitionException {
    ActionContext _localctx = new ActionContext(this._ctx, getState());
    enterRule(_localctx, 88, Antlr4PilarParser.RULE_action);
    int _la;
    try {
      setState(1022);
      switch (getInterpreter().adaptivePredict(this._input, 143, this._ctx)) {
        case 1:
          _localctx = new AssertContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(933);
            match(20);
            setState(934);
            exp(0);
            setState(937);
            _la = this._input.LA(1);
            if (_la == 28) {
              {
                setState(935);
                match(28);
                setState(936);
                exp(0);
              }
            }

            setState(942);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(939);
                  annotation();
                }
              }
              setState(944);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(945);
            match(50);
          }
          break;

        case 2:
          _localctx = new AssumeContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(947);
            match(25);
            setState(948);
            exp(0);
            setState(951);
            _la = this._input.LA(1);
            if (_la == 28) {
              {
                setState(949);
                match(28);
                setState(950);
                exp(0);
              }
            }

            setState(956);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(953);
                  annotation();
                }
              }
              setState(958);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(959);
            match(50);
          }
          break;

        case 3:
          _localctx = new ThrowContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(961);
            match(8);
            setState(962);
            exp(0);
            setState(966);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(963);
                  annotation();
                }
              }
              setState(968);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(969);
            match(50);
          }
          break;

        case 4:
          _localctx = new StartContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(971);
            match(48);
            setState(973);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(972);
                typeTuple();
              }
            }

            setState(975);
            match(Antlr4PilarParser.ID);
            setState(980);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(976);
                match(2);
                setState(977);
                ((StartContext) _localctx).n = exp(0);
                setState(978);
                match(24);
              }
            }

            setState(982);
            tupleExp();
            setState(986);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(983);
                  annotation();
                }
              }
              setState(988);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(989);
            match(50);
          }
          break;

        case 5:
          _localctx = new ActionExtCallContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(991);
            match(Antlr4PilarParser.ID);
            setState(993);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(992);
                typeTuple();
              }
            }

            setState(995);
            tupleExp();
            setState(999);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(996);
                  annotation();
                }
              }
              setState(1001);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1002);
            match(50);
          }
          break;

        case 6:
          _localctx = new AssignContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(1004);
            lhss();
            setState(1005);
            match(Antlr4PilarParser.AssignOP);
            setState(1006);
            rhs();
            setState(1011);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1007);
                  match(28);
                  setState(1008);
                  rhs();
                }
              }
              setState(1013);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1017);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1014);
                  annotation();
                }
              }
              setState(1019);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1020);
            match(50);
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ActionFileContext actionFile() throws RecognitionException {
    final ActionFileContext _localctx = new ActionFileContext(this._ctx,
        getState());
    enterRule(_localctx, 8, Antlr4PilarParser.RULE_actionFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(164);
        action();
        setState(165);
        match(Recognizer.EOF);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnExpContext annExp() throws RecognitionException {
    final AnnExpContext _localctx = new AnnExpContext(this._ctx, getState());
    enterRule(_localctx, 122, Antlr4PilarParser.RULE_annExp);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1438);
        exp(0);
        setState(1442);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1439);
              annotation();
            }
          }
          setState(1444);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotatedTypeContext annotatedType() throws RecognitionException {
    final AnnotatedTypeContext _localctx = new AnnotatedTypeContext(this._ctx,
        getState());
    enterRule(_localctx, 150, Antlr4PilarParser.RULE_annotatedType);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1643);
        type();
        setState(1647);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1644);
              annotation();
            }
          }
          setState(1649);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationContext annotation() throws RecognitionException {
    final AnnotationContext _localctx = new AnnotationContext(this._ctx,
        getState());
    enterRule(_localctx, 18, Antlr4PilarParser.RULE_annotation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(188);
        match(9);
        setState(189);
        match(Antlr4PilarParser.ID);
        setState(191);
        switch (getInterpreter().adaptivePredict(this._input, 2, this._ctx)) {
          case 1: {
            setState(190);
            annotationParams();
          }
            break;
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationFileContext annotationFile()
      throws RecognitionException {
    final AnnotationFileContext _localctx = new AnnotationFileContext(
        this._ctx, getState());
    enterRule(_localctx, 2, Antlr4PilarParser.RULE_annotationFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(155);
        annotation();
        setState(156);
        match(Recognizer.EOF);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationParamContext annotationParam()
      throws RecognitionException {
    AnnotationParamContext _localctx = new AnnotationParamContext(this._ctx,
        getState());
    enterRule(_localctx, 22, Antlr4PilarParser.RULE_annotationParam);
    try {
      setState(219);
      switch (getInterpreter().adaptivePredict(this._input, 6, this._ctx)) {
        case 1:
          _localctx = new AnnotationParamIAContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(211);
            match(Antlr4PilarParser.ID);
            setState(212);
            match(11);
            setState(213);
            annotation();
          }
          break;

        case 2:
          _localctx = new AnnotationParamIEContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(214);
            match(Antlr4PilarParser.ID);
            setState(215);
            match(11);
            setState(216);
            exp(0);
          }
          break;

        case 3:
          _localctx = new AnnotationParamAContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(217);
            annotation();
          }
          break;

        case 4:
          _localctx = new AnnotationParamEContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(218);
            exp(0);
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationParamsContext annotationParams()
      throws RecognitionException {
    AnnotationParamsContext _localctx = new AnnotationParamsContext(this._ctx,
        getState());
    enterRule(_localctx, 20, Antlr4PilarParser.RULE_annotationParams);
    int _la;
    try {
      int _alt;
      setState(209);
      switch (getInterpreter().adaptivePredict(this._input, 5, this._ctx)) {
        case 1:
          _localctx = new AnnotationParamsAContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(193);
            match(31);
            setState(194);
            annotationParam();
            setState(199);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(195);
                  match(28);
                  setState(196);
                  annotationParam();
                }
              }
              setState(201);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(202);
            match(7);
          }
          break;

        case 2:
          _localctx = new AnnotationParamsEContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(205);
            this._errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(this._input, 4, this._ctx);
            do {
              switch (_alt) {
                case 1: {
                  {
                    setState(204);
                    exp(0);
                  }
                }
                  break;
                default:
                  throw new NoViableAltException(this);
              }
              setState(207);
              this._errHandler.sync(this);
              _alt = getInterpreter()
                  .adaptivePredict(this._input, 4, this._ctx);
            } while ((_alt != 2) && (_alt != -1));
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final BaseTypeContext baseType() throws RecognitionException {
    BaseTypeContext _localctx = new BaseTypeContext(this._ctx, getState());
    enterRule(_localctx, 146, Antlr4PilarParser.RULE_baseType);
    int _la;
    try {
      setState(1620);
      switch (getInterpreter().adaptivePredict(this._input, 216, this._ctx)) {
        case 1:
          _localctx = new NamedTypeContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1552);
            match(Antlr4PilarParser.ID);
            setState(1554);
            switch (getInterpreter().adaptivePredict(
                this._input,
                208,
                this._ctx)) {
              case 1: {
                setState(1553);
                typeTuple();
              }
                break;
            }
          }
          break;

        case 2:
          _localctx = new ClosureTypeContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1556);
            match(31);
            setState(1557);
            typeParam();
            setState(1562);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1558);
                  match(28);
                  setState(1559);
                  typeParam();
                }
              }
              setState(1564);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1565);
            match(6);
            setState(1567);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(1566);
                annotatedType();
              }
            }

            setState(1569);
            match(7);
          }
          break;

        case 3:
          _localctx = new ProcedureTypeContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1571);
            match(31);
            setState(1572);
            typeParam();
            setState(1577);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1573);
                  match(28);
                  setState(1574);
                  typeParam();
                }
              }
              setState(1579);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1580);
            match(17);
            setState(1582);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(1581);
                annotatedType();
              }
            }

            setState(1584);
            match(7);
          }
          break;

        case 4:
          _localctx = new TupleTypeContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1586);
            match(31);
            setState(1587);
            typeParam();
            setState(1592);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1588);
                  match(28);
                  setState(1589);
                  typeParam();
                }
              }
              setState(1594);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1595);
            match(7);
          }
          break;

        case 5:
          _localctx = new MapTypeContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1597);
            match(36);
            setState(1598);
            typeParam();
            setState(1603);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1599);
                  match(28);
                  setState(1600);
                  typeParam();
                }
              }
              setState(1605);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1606);
            match(6);
            setState(1607);
            annotatedType();
            setState(1608);
            match(5);
          }
          break;

        case 6:
          _localctx = new RelationTypeContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(1610);
            match(36);
            setState(1611);
            typeParam();
            setState(1614);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            do {
              {
                {
                  setState(1612);
                  match(28);
                  setState(1613);
                  typeParam();
                }
              }
              setState(1616);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            } while (_la == 28);
            setState(1618);
            match(5);
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final BindingContext binding() throws RecognitionException {
    final BindingContext _localctx = new BindingContext(this._ctx, getState());
    enterRule(_localctx, 126, Antlr4PilarParser.RULE_binding);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1447);
        match(Antlr4PilarParser.ID);
        setState(1450);
        _la = this._input.LA(1);
        if (_la == 28) {
          {
            setState(1448);
            match(28);
            setState(1449);
            match(Antlr4PilarParser.ID);
          }
        }

        setState(1452);
        match(11);
        setState(1453);
        exp(0);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(this._ctx, getState());
    enterRule(_localctx, 74, Antlr4PilarParser.RULE_body);
    int _la;
    try {
      setState(805);
      switch (this._input.LA(1)) {
        case 36:
          _localctx = new ImplementedBodyContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(787);
            match(36);
            setState(789);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(788);
                localVarsDeclaration();
              }
            }

            setState(794);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == Antlr4PilarParser.LID) {
              {
                {
                  setState(791);
                  location();
                }
              }
              setState(796);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(800);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 39) {
              {
                {
                  setState(797);
                  catchClause();
                }
              }
              setState(802);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(803);
            match(5);
          }
          break;
        case 50:
          _localctx = new EmptyBodyContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(804);
            match(50);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CatchClauseContext catchClause() throws RecognitionException {
    final CatchClauseContext _localctx = new CatchClauseContext(this._ctx,
        getState());
    enterRule(_localctx, 108, Antlr4PilarParser.RULE_catchClause);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1162);
        match(39);
        setState(1166);
        this._errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(this._input, 162, this._ctx);
        while ((_alt != 2) && (_alt != -1)) {
          if (_alt == 1) {
            {
              {
                setState(1163);
                annotation();
              }
            }
          }
          setState(1168);
          this._errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(this._input, 162, this._ctx);
        }
        setState(1180);
        switch (getInterpreter().adaptivePredict(this._input, 166, this._ctx)) {
          case 1: {
            setState(1170);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(1169);
                _localctx.var = match(Antlr4PilarParser.ID);
              }
            }

            setState(1172);
            match(32);
            setState(1173);
            type();
          }
            break;

          case 2: {
            setState(1175);
            switch (getInterpreter().adaptivePredict(
                this._input,
                164,
                this._ctx)) {
              case 1: {
                setState(1174);
                type();
              }
                break;
            }
            setState(1178);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(1177);
                _localctx.var = match(Antlr4PilarParser.ID);
              }
            }

          }
            break;
        }
        setState(1182);
        match(9);
        setState(1183);
        match(2);
        setState(1184);
        _localctx.from = match(Antlr4PilarParser.ID);
        setState(1185);
        match(22);
        setState(1186);
        _localctx.to = match(Antlr4PilarParser.ID);
        setState(1187);
        match(24);
        setState(1188);
        gotoj();
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ConstantContext constant() throws RecognitionException {
    ConstantContext _localctx = new ConstantContext(this._ctx, getState());
    enterRule(_localctx, 144, Antlr4PilarParser.RULE_constant);
    try {
      setState(1550);
      switch (this._input.LA(1)) {
        case 41:
          _localctx = new TrueConstantContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1538);
            match(41);
          }
          break;
        case 4:
          _localctx = new FalseConstantContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1539);
            match(4);
          }
          break;
        case 15:
          _localctx = new NullConstantContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1540);
            match(15);
          }
          break;
        case ID:
          _localctx = new IdConstantContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1541);
            match(Antlr4PilarParser.ID);
          }
          break;
        case CHAR:
          _localctx = new CharConstantContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1542);
            match(Antlr4PilarParser.CHAR);
          }
          break;
        case HEX:
          _localctx = new HexConstantContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(1543);
            match(Antlr4PilarParser.HEX);
          }
          break;
        case OCT:
          _localctx = new OctConstantContext(_localctx);
          enterOuterAlt(_localctx, 7);
          {
            setState(1544);
            match(Antlr4PilarParser.OCT);
          }
          break;
        case DEC:
          _localctx = new DecConstantContext(_localctx);
          enterOuterAlt(_localctx, 8);
          {
            setState(1545);
            match(Antlr4PilarParser.DEC);
          }
          break;
        case BIN:
          _localctx = new BinConstantContext(_localctx);
          enterOuterAlt(_localctx, 9);
          {
            setState(1546);
            match(Antlr4PilarParser.BIN);
          }
          break;
        case FLOAT:
          _localctx = new FloatConstantContext(_localctx);
          enterOuterAlt(_localctx, 10);
          {
            setState(1547);
            match(Antlr4PilarParser.FLOAT);
          }
          break;
        case STRING:
          _localctx = new StringConstantContext(_localctx);
          enterOuterAlt(_localctx, 11);
          {
            setState(1548);
            match(Antlr4PilarParser.STRING);
          }
          break;
        case MSTRING:
          _localctx = new MultilineStringConstantContext(_localctx);
          enterOuterAlt(_localctx, 12);
          {
            setState(1549);
            match(Antlr4PilarParser.MSTRING);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ConstDeclarationContext constDeclaration()
      throws RecognitionException {
    final ConstDeclarationContext _localctx = new ConstDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 26, Antlr4PilarParser.RULE_constDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(230);
        match(14);
        setState(231);
        match(Antlr4PilarParser.ID);
        setState(235);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(232);
              annotation();
            }
          }
          setState(237);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(238);
        match(36);
        setState(242);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == Antlr4PilarParser.ID) {
          {
            {
              setState(239);
              constElement();
            }
          }
          setState(244);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(245);
        match(5);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ConstElementContext constElement() throws RecognitionException {
    final ConstElementContext _localctx = new ConstElementContext(this._ctx,
        getState());
    enterRule(_localctx, 28, Antlr4PilarParser.RULE_constElement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(247);
        match(Antlr4PilarParser.ID);
        setState(248);
        match(11);
        setState(249);
        constant();
        setState(253);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(250);
              annotation();
            }
          }
          setState(255);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(256);
        match(50);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final EnumDeclarationContext enumDeclaration()
      throws RecognitionException {
    final EnumDeclarationContext _localctx = new EnumDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 30, Antlr4PilarParser.RULE_enumDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(258);
        match(23);
        setState(259);
        match(Antlr4PilarParser.ID);
        setState(263);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(260);
              annotation();
            }
          }
          setState(265);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(266);
        match(36);
        setState(275);
        _la = this._input.LA(1);
        if (_la == Antlr4PilarParser.ID) {
          {
            setState(267);
            enumElement();
            setState(272);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(268);
                  match(28);
                  setState(269);
                  enumElement();
                }
              }
              setState(274);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
        }

        setState(277);
        match(5);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final EnumElementContext enumElement() throws RecognitionException {
    final EnumElementContext _localctx = new EnumElementContext(this._ctx,
        getState());
    enterRule(_localctx, 32, Antlr4PilarParser.RULE_enumElement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(279);
        match(Antlr4PilarParser.ID);
        setState(283);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(280);
              annotation();
            }
          }
          setState(285);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExpContext exp(final int _p) throws RecognitionException {
    final ParserRuleContext _parentctx = this._ctx;
    final int _parentState = getState();
    ExpContext _localctx = new ExpContext(this._ctx, _parentState, _p);
    final int _startState = 110;
    enterRecursionRule(_localctx, Antlr4PilarParser.RULE_exp);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1215);
        switch (getInterpreter().adaptivePredict(this._input, 169, this._ctx)) {
          case 1: {
            _localctx = new CastExpContext(_localctx);
            this._ctx = _localctx;
            setState(1191);
            match(31);
            setState(1192);
            type();
            setState(1193);
            match(7);
            setState(1194);
            exp(15);
          }
            break;

          case 2: {
            _localctx = new UnaryExpContext(_localctx);
            this._ctx = _localctx;
            setState(1196);
            ((UnaryExpContext) _localctx).op = this._input.LT(1);
            _la = this._input.LA(1);
            if (!((((((_la - 56)) & ~0x3f) == 0) && (((1L << (_la - 56)) & ((1L << (Antlr4PilarParser.ID - 56))
                | (1L << (Antlr4PilarParser.AddOP - 56))
                | (1L << (Antlr4PilarParser.MulOP - 56)) | (1L << (Antlr4PilarParser.UnaryOP - 56)))) != 0)))) {
              ((UnaryExpContext) _localctx).op = this._errHandler
                  .recoverInline(this);
            }
            consume();
            setState(1197);
            exp(14);
          }
            break;

          case 3: {
            _localctx = new PrimaryExpContext(_localctx);
            this._ctx = _localctx;
            setState(1198);
            primary();
            setState(1202);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 167, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1199);
                    primarySuffix();
                  }
                }
              }
              setState(1204);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  167,
                  this._ctx);
            }
          }
            break;

          case 4: {
            _localctx = new IfExpContext(_localctx);
            this._ctx = _localctx;
            setState(1205);
            ifThenExp();
            setState(1210);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 168, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1206);
                    match(40);
                    setState(1207);
                    ifThenExp();
                  }
                }
              }
              setState(1212);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  168,
                  this._ctx);
            }
            setState(1213);
            ifElseExp();
          }
            break;
        }
        this._ctx.stop = this._input.LT(-1);
        setState(1255);
        this._errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(this._input, 171, this._ctx);
        while ((_alt != 2) && (_alt != -1)) {
          if (_alt == 1) {
            if (this._parseListeners != null) {
              triggerExitRuleEvent();
            }
            {
              setState(1253);
              switch (getInterpreter().adaptivePredict(
                  this._input,
                  170,
                  this._ctx)) {
                case 1: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1217);
                  if (!(13 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "13 >= $_p");
                  }
                  setState(1218);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.ID);
                  setState(1219);
                  exp(14);
                }
                  break;

                case 2: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1220);
                  if (!(12 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "12 >= $_p");
                  }
                  setState(1221);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.MulOP);
                  setState(1222);
                  exp(13);
                }
                  break;

                case 3: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1223);
                  if (!(11 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "11 >= $_p");
                  }
                  setState(1224);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.AddOP);
                  setState(1225);
                  exp(12);
                }
                  break;

                case 4: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1226);
                  if (!(10 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "10 >= $_p");
                  }
                  setState(1227);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.ShiftOP);
                  setState(1228);
                  exp(11);
                }
                  break;

                case 5: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1229);
                  if (!(9 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "9 >= $_p");
                  }
                  setState(1230);
                  ((BinaryExpContext) _localctx).op = this._input.LT(1);
                  _la = this._input.LA(1);
                  if (!((((((_la - 3)) & ~0x3f) == 0) && (((1L << (_la - 3)) & ((1L << (3 - 3))
                      | (1L << (52 - 3)) | (1L << (Antlr4PilarParser.RelOP - 3)))) != 0)))) {
                    ((BinaryExpContext) _localctx).op = this._errHandler
                        .recoverInline(this);
                  }
                  consume();
                  setState(1231);
                  exp(10);
                }
                  break;

                case 6: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1232);
                  if (!(8 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "8 >= $_p");
                  }
                  setState(1233);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.EqOP);
                  setState(1234);
                  exp(9);
                }
                  break;

                case 7: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1235);
                  if (!(7 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "7 >= $_p");
                  }
                  setState(1236);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.AndOP);
                  setState(1237);
                  exp(8);
                }
                  break;

                case 8: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1238);
                  if (!(6 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "6 >= $_p");
                  }
                  setState(1239);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.XorOP);
                  setState(1240);
                  exp(7);
                }
                  break;

                case 9: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1241);
                  if (!(5 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "5 >= $_p");
                  }
                  setState(1242);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.OrOP);
                  setState(1243);
                  exp(6);
                }
                  break;

                case 10: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1244);
                  if (!(4 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "4 >= $_p");
                  }
                  setState(1245);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.CondAndOP);
                  setState(1246);
                  exp(5);
                }
                  break;

                case 11: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1247);
                  if (!(3 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "3 >= $_p");
                  }
                  setState(1248);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.CondOrOP);
                  setState(1249);
                  exp(4);
                }
                  break;

                case 12: {
                  _localctx = new BinaryExpContext(new ExpContext(_parentctx,
                      _parentState, _p));
                  pushNewRecursionContext(
                      _localctx,
                      _startState,
                      Antlr4PilarParser.RULE_exp);
                  setState(1250);
                  if (!(2 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "2 >= $_p");
                  }
                  setState(1251);
                  ((BinaryExpContext) _localctx).op = this._input.LT(1);
                  _la = this._input.LA(1);
                  if (!((_la == 29) || (_la == 30))) {
                    ((BinaryExpContext) _localctx).op = this._errHandler
                        .recoverInline(this);
                  }
                  consume();
                  setState(1252);
                  exp(3);
                }
                  break;
              }
            }
          }
          setState(1257);
          this._errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(this._input, 171, this._ctx);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  private boolean exp_sempred(final ExpContext _localctx, final int predIndex) {
    switch (predIndex) {
      case 0:
        return 13 >= _localctx._p;

      case 1:
        return 12 >= _localctx._p;

      case 2:
        return 11 >= _localctx._p;

      case 3:
        return 10 >= _localctx._p;

      case 4:
        return 9 >= _localctx._p;

      case 5:
        return 8 >= _localctx._p;

      case 6:
        return 7 >= _localctx._p;

      case 7:
        return 6 >= _localctx._p;

      case 8:
        return 5 >= _localctx._p;

      case 9:
        return 4 >= _localctx._p;

      case 10:
        return 3 >= _localctx._p;

      case 11:
        return 2 >= _localctx._p;
    }
    return true;
  }

  public final ExpFileContext expFile() throws RecognitionException {
    final ExpFileContext _localctx = new ExpFileContext(this._ctx, getState());
    enterRule(_localctx, 12, Antlr4PilarParser.RULE_expFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(170);
        exp(0);
        setState(171);
        match(Recognizer.EOF);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExtDeclarationContext extDeclaration()
      throws RecognitionException {
    final ExtDeclarationContext _localctx = new ExtDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 64, Antlr4PilarParser.RULE_extDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(584);
        match(51);
        setState(586);
        _la = this._input.LA(1);
        if (_la == 2) {
          {
            setState(585);
            typeVarTuple();
          }
        }

        setState(588);
        match(Antlr4PilarParser.ID);
        setState(592);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(589);
              annotation();
            }
          }
          setState(594);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(595);
        match(36);
        setState(599);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 27)
            | (1L << 47) | (1L << 49) | (1L << 55))) != 0))) {
          {
            {
              setState(596);
              extElement();
            }
          }
          setState(601);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(602);
        match(5);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExtElementContext extElement() throws RecognitionException {
    ExtElementContext _localctx = new ExtElementContext(this._ctx, getState());
    enterRule(_localctx, 66, Antlr4PilarParser.RULE_extElement);
    int _la;
    try {
      setState(726);
      switch (getInterpreter().adaptivePredict(this._input, 92, this._ctx)) {
        case 1:
          _localctx = new TypeExtensionContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(604);
            match(47);
            setState(606);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(605);
                typeVarTuple();
              }
            }

            setState(608);
            match(Antlr4PilarParser.ID);
            setState(612);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(609);
                  annotation();
                }
              }
              setState(614);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(616);
            _la = this._input.LA(1);
            if (_la == 38) {
              {
                setState(615);
                extendClauses();
              }
            }

            setState(618);
            match(50);
          }
          break;

        case 2:
          _localctx = new ActionExtensionContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(619);
            match(49);
            setState(621);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(620);
                typeVarTuple();
              }
            }

            setState(623);
            match(Antlr4PilarParser.ID);
            setState(629);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(624);
                match(31);
                setState(626);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(625);
                    extParams();
                  }
                }

                setState(628);
                match(7);
              }
            }

            setState(634);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(631);
                  annotation();
                }
              }
              setState(636);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(637);
            match(50);
          }
          break;

        case 3:
          _localctx = new ExpExtensionContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(638);
            match(27);
            setState(640);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(639);
                typeVarTuple();
              }
            }

            setState(642);
            match(Antlr4PilarParser.ID);
            setState(648);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(643);
                match(31);
                setState(645);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(644);
                    extParams();
                  }
                }

                setState(647);
                match(7);
              }
            }

            setState(653);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(650);
                  annotation();
                }
              }
              setState(655);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(656);
            match(32);
            setState(657);
            type();
            setState(658);
            match(50);
          }
          break;

        case 4:
          _localctx = new ExpExtensionContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(660);
            match(27);
            setState(662);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(661);
                typeVarTuple();
              }
            }

            setState(665);
            switch (getInterpreter()
                .adaptivePredict(this._input, 79, this._ctx)) {
              case 1: {
                setState(664);
                type();
              }
                break;
            }
            setState(667);
            match(Antlr4PilarParser.ID);
            setState(673);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(668);
                match(31);
                setState(670);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(669);
                    extParams();
                  }
                }

                setState(672);
                match(7);
              }
            }

            setState(678);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(675);
                  annotation();
                }
              }
              setState(680);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(681);
            match(50);
          }
          break;

        case 5:
          _localctx = new ProcedureExtensionContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(682);
            match(55);
            setState(684);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(683);
                typeVarTuple();
              }
            }

            setState(686);
            match(Antlr4PilarParser.ID);
            setState(692);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(687);
                match(31);
                setState(689);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(688);
                    extParams();
                  }
                }

                setState(691);
                match(7);
              }
            }

            setState(697);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(694);
                  annotation();
                }
              }
              setState(699);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(700);
            match(32);
            setState(701);
            type();
            setState(702);
            match(50);
          }
          break;

        case 6:
          _localctx = new ProcedureExtensionContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(704);
            match(55);
            setState(706);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(705);
                typeVarTuple();
              }
            }

            setState(709);
            switch (getInterpreter()
                .adaptivePredict(this._input, 88, this._ctx)) {
              case 1: {
                setState(708);
                type();
              }
                break;
            }
            setState(711);
            match(Antlr4PilarParser.ID);
            setState(717);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(712);
                match(31);
                setState(714);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(713);
                    extParams();
                  }
                }

                setState(716);
                match(7);
              }
            }

            setState(722);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(719);
                  annotation();
                }
              }
              setState(724);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(725);
            match(50);
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExtendClauseContext extendClause() throws RecognitionException {
    final ExtendClauseContext _localctx = new ExtendClauseContext(this._ctx,
        getState());
    enterRule(_localctx, 44, Antlr4PilarParser.RULE_extendClause);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(351);
        match(Antlr4PilarParser.ID);
        setState(353);
        _la = this._input.LA(1);
        if (_la == 3) {
          {
            setState(352);
            typeTuple();
          }
        }

        setState(358);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(355);
              annotation();
            }
          }
          setState(360);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExtendClausesContext extendClauses() throws RecognitionException {
    final ExtendClausesContext _localctx = new ExtendClausesContext(this._ctx,
        getState());
    enterRule(_localctx, 42, Antlr4PilarParser.RULE_extendClauses);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(342);
        match(38);
        setState(343);
        extendClause();
        setState(348);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 28) {
          {
            {
              setState(344);
              match(28);
              setState(345);
              extendClause();
            }
          }
          setState(350);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExtParamContext extParam() throws RecognitionException {
    final ExtParamContext _localctx = new ExtParamContext(this._ctx, getState());
    enterRule(_localctx, 70, Antlr4PilarParser.RULE_extParam);
    int _la;
    try {
      setState(762);
      switch (getInterpreter().adaptivePredict(this._input, 99, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(743);
            match(Antlr4PilarParser.ID);
            setState(747);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(744);
                  annotation();
                }
              }
              setState(749);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(750);
            match(32);
            setState(751);
            type();
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(752);
            type();
            setState(754);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(753);
                match(Antlr4PilarParser.ID);
              }
            }

            setState(759);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(756);
                  annotation();
                }
              }
              setState(761);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExtParamsContext extParams() throws RecognitionException {
    final ExtParamsContext _localctx = new ExtParamsContext(this._ctx,
        getState());
    enterRule(_localctx, 68, Antlr4PilarParser.RULE_extParams);
    int _la;
    try {
      int _alt;
      setState(741);
      switch (getInterpreter().adaptivePredict(this._input, 95, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(728);
            extParam();
            setState(733);
            this._errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(this._input, 93, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(729);
                    match(28);
                    setState(730);
                    extParam();
                  }
                }
              }
              setState(735);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  93,
                  this._ctx);
            }
            setState(738);
            _la = this._input.LA(1);
            if (_la == 28) {
              {
                setState(736);
                match(28);
                setState(737);
                extParamVariable();
              }
            }

          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(740);
            extParamVariable();
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExtParamVariableContext extParamVariable()
      throws RecognitionException {
    final ExtParamVariableContext _localctx = new ExtParamVariableContext(
        this._ctx, getState());
    enterRule(_localctx, 72, Antlr4PilarParser.RULE_extParamVariable);
    int _la;
    try {
      setState(785);
      switch (getInterpreter().adaptivePredict(this._input, 103, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(764);
            match(Antlr4PilarParser.ID);
            setState(765);
            match(35);
            setState(769);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(766);
                  annotation();
                }
              }
              setState(771);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(772);
            match(32);
            setState(773);
            type();
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(774);
            type();
            setState(775);
            match(35);
            setState(777);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(776);
                match(Antlr4PilarParser.ID);
              }
            }

            setState(782);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(779);
                  annotation();
                }
              }
              setState(784);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FieldContext field() throws RecognitionException {
    final FieldContext _localctx = new FieldContext(this._ctx, getState());
    enterRule(_localctx, 48, Antlr4PilarParser.RULE_field);
    int _la;
    try {
      setState(397);
      switch (getInterpreter().adaptivePredict(this._input, 30, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(372);
            fieldFragment();
            setState(377);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(373);
                  match(28);
                  setState(374);
                  fieldFragment();
                }
              }
              setState(379);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(380);
            match(32);
            setState(381);
            type();
            setState(382);
            match(50);
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(385);
            switch (getInterpreter()
                .adaptivePredict(this._input, 28, this._ctx)) {
              case 1: {
                setState(384);
                type();
              }
                break;
            }
            setState(387);
            fieldFragment();
            setState(392);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(388);
                  match(28);
                  setState(389);
                  fieldFragment();
                }
              }
              setState(394);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(395);
            match(50);
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FieldFragmentContext fieldFragment() throws RecognitionException {
    final FieldFragmentContext _localctx = new FieldFragmentContext(this._ctx,
        getState());
    enterRule(_localctx, 50, Antlr4PilarParser.RULE_fieldFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(399);
        match(Antlr4PilarParser.ID);
        setState(403);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(400);
              annotation();
            }
          }
          setState(405);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FieldInitContext fieldInit() throws RecognitionException {
    final FieldInitContext _localctx = new FieldInitContext(this._ctx,
        getState());
    enterRule(_localctx, 136, Antlr4PilarParser.RULE_fieldInit);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1489);
        match(Antlr4PilarParser.ID);
        setState(1490);
        match(11);
        setState(1491);
        exp(0);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FunDeclarationContext funDeclaration()
      throws RecognitionException {
    final FunDeclarationContext _localctx = new FunDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 62, Antlr4PilarParser.RULE_funDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(523);
        match(13);
        setState(525);
        _la = this._input.LA(1);
        if (_la == 2) {
          {
            setState(524);
            typeVarTuple();
          }
        }

        setState(582);
        switch (getInterpreter().adaptivePredict(this._input, 63, this._ctx)) {
          case 1: {
            setState(527);
            match(Antlr4PilarParser.ID);
            setState(540);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(528);
                match(31);
                setState(537);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(529);
                    paramVar();
                    setState(534);
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    while (_la == 28) {
                      {
                        {
                          setState(530);
                          match(28);
                          setState(531);
                          paramVar();
                        }
                      }
                      setState(536);
                      this._errHandler.sync(this);
                      _la = this._input.LA(1);
                    }
                  }
                }

                setState(539);
                match(7);
              }
            }

            setState(545);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(542);
                  annotation();
                }
              }
              setState(547);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(548);
            match(32);
            setState(549);
            type();
            setState(550);
            match(11);
            setState(551);
            exp(0);
            setState(552);
            match(50);
          }
            break;

          case 2: {
            setState(555);
            switch (getInterpreter()
                .adaptivePredict(this._input, 58, this._ctx)) {
              case 1: {
                setState(554);
                type();
              }
                break;
            }
            setState(557);
            match(Antlr4PilarParser.ID);
            setState(570);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(558);
                match(31);
                setState(567);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(559);
                    paramVar();
                    setState(564);
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    while (_la == 28) {
                      {
                        {
                          setState(560);
                          match(28);
                          setState(561);
                          paramVar();
                        }
                      }
                      setState(566);
                      this._errHandler.sync(this);
                      _la = this._input.LA(1);
                    }
                  }
                }

                setState(569);
                match(7);
              }
            }

            setState(575);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(572);
                  annotation();
                }
              }
              setState(577);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(578);
            match(11);
            setState(579);
            exp(0);
            setState(580);
            match(50);
          }
            break;
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @Override
  public ATN getATN() {
    return Antlr4PilarParser._ATN;
  }

  @Override
  public String getGrammarFileName() {
    return "Antlr4Pilar.g4";
  }

  @Override
  public String[] getRuleNames() {
    return Antlr4PilarParser.ruleNames;
  }

  @Override
  public String[] getTokenNames() {
    return Antlr4PilarParser.tokenNames;
  }

  public final GlobalVarDeclarationContext globalVarDeclaration()
      throws RecognitionException {
    final GlobalVarDeclarationContext _localctx = new GlobalVarDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 54, Antlr4PilarParser.RULE_globalVarDeclaration);
    int _la;
    try {
      setState(437);
      switch (getInterpreter().adaptivePredict(this._input, 36, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(412);
            globalVarFragment();
            setState(417);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(413);
                  match(28);
                  setState(414);
                  globalVarFragment();
                }
              }
              setState(419);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(420);
            match(32);
            setState(421);
            type();
            setState(422);
            match(50);
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(425);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(424);
                type();
              }
            }

            setState(427);
            globalVarFragment();
            setState(432);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(428);
                  match(28);
                  setState(429);
                  globalVarFragment();
                }
              }
              setState(434);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(435);
            match(50);
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final GlobalVarFragmentContext globalVarFragment()
      throws RecognitionException {
    final GlobalVarFragmentContext _localctx = new GlobalVarFragmentContext(
        this._ctx, getState());
    enterRule(_localctx, 56, Antlr4PilarParser.RULE_globalVarFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(439);
        match(Antlr4PilarParser.GID);
        setState(443);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(440);
              annotation();
            }
          }
          setState(445);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final GlobalVarsDeclarationContext globalVarsDeclaration()
      throws RecognitionException {
    final GlobalVarsDeclarationContext _localctx = new GlobalVarsDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 52, Antlr4PilarParser.RULE_globalVarsDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(406);
        match(10);
        setState(408);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
          {
            {
              setState(407);
              globalVarDeclaration();
            }
          }
          setState(410);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        } while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
            | (1L << 36) | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.GID))) != 0)));
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final GotojContext gotoj() throws RecognitionException {
    final GotojContext _localctx = new GotojContext(this._ctx, getState());
    enterRule(_localctx, 98, Antlr4PilarParser.RULE_gotoj);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1106);
        match(12);
        setState(1107);
        match(Antlr4PilarParser.ID);
        setState(1111);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1108);
              annotation();
            }
          }
          setState(1113);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1114);
        match(50);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final GuardContext guard() throws RecognitionException {
    GuardContext _localctx = new GuardContext(this._ctx, getState());
    enterRule(_localctx, 86, Antlr4PilarParser.RULE_guard);
    int _la;
    try {
      int _alt;
      setState(931);
      switch (this._input.LA(1)) {
        case 4:
        case 15:
        case 18:
        case 31:
        case 33:
        case 37:
        case 41:
        case 42:
        case ID:
        case GID:
        case MSTRING:
        case AddOP:
        case MulOP:
        case UnaryOP:
        case HEX:
        case DEC:
        case OCT:
        case BIN:
        case FLOAT:
        case CHAR:
        case STRING:
          _localctx = new ExpGuardContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(915);
            exp(0);
            setState(919);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(916);
                  annotation();
                }
              }
              setState(921);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(922);
            match(19);
          }
          break;
        case 40:
          _localctx = new ElseGuardContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(924);
            match(40);
            setState(928);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 129, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(925);
                    annotation();
                  }
                }
              }
              setState(930);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  129,
                  this._ctx);
            }
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final IfElseExpContext ifElseExp() throws RecognitionException {
    final IfElseExpContext _localctx = new IfElseExpContext(this._ctx,
        getState());
    enterRule(_localctx, 114, Antlr4PilarParser.RULE_ifElseExp);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1269);
        match(40);
        setState(1273);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1270);
              annotation();
            }
          }
          setState(1275);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1276);
        exp(0);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final IfElseJumpContext ifElseJump() throws RecognitionException {
    final IfElseJumpContext _localctx = new IfElseJumpContext(this._ctx,
        getState());
    enterRule(_localctx, 102, Antlr4PilarParser.RULE_ifElseJump);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1128);
        match(40);
        setState(1132);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1129);
              annotation();
            }
          }
          setState(1134);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1135);
        match(12);
        setState(1136);
        match(Antlr4PilarParser.ID);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final IfThenExpContext ifThenExp() throws RecognitionException {
    final IfThenExpContext _localctx = new IfThenExpContext(this._ctx,
        getState());
    enterRule(_localctx, 112, Antlr4PilarParser.RULE_ifThenExp);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1258);
        match(33);
        setState(1259);
        exp(0);
        setState(1260);
        match(53);
        setState(1264);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1261);
              annotation();
            }
          }
          setState(1266);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1267);
        exp(0);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final IfThenJumpContext ifThenJump() throws RecognitionException {
    final IfThenJumpContext _localctx = new IfThenJumpContext(this._ctx,
        getState());
    enterRule(_localctx, 100, Antlr4PilarParser.RULE_ifThenJump);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1116);
        match(33);
        setState(1117);
        exp(0);
        setState(1118);
        match(53);
        setState(1122);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1119);
              annotation();
            }
          }
          setState(1124);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1125);
        match(12);
        setState(1126);
        match(Antlr4PilarParser.ID);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final JumpContext jump() throws RecognitionException {
    JumpContext _localctx = new JumpContext(this._ctx, getState());
    enterRule(_localctx, 96, Antlr4PilarParser.RULE_jump);
    int _la;
    try {
      int _alt;
      setState(1104);
      switch (this._input.LA(1)) {
        case 12:
          _localctx = new GotoJumpContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1047);
            gotoj();
          }
          break;
        case 46:
          _localctx = new ReturnJumpContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1048);
            match(46);
            setState(1057);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4)
                | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33)
                | (1L << 37) | (1L << 41) | (1L << 42)
                | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
                || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (Antlr4PilarParser.AddOP - 68))
                    | (1L << (Antlr4PilarParser.MulOP - 68))
                    | (1L << (Antlr4PilarParser.UnaryOP - 68))
                    | (1L << (Antlr4PilarParser.HEX - 68))
                    | (1L << (Antlr4PilarParser.DEC - 68))
                    | (1L << (Antlr4PilarParser.OCT - 68))
                    | (1L << (Antlr4PilarParser.BIN - 68))
                    | (1L << (Antlr4PilarParser.FLOAT - 68))
                    | (1L << (Antlr4PilarParser.CHAR - 68)) | (1L << (Antlr4PilarParser.STRING - 68)))) != 0))) {
              {
                setState(1049);
                exp(0);
                setState(1054);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 28) {
                  {
                    {
                      setState(1050);
                      match(28);
                      setState(1051);
                      exp(0);
                    }
                  }
                  setState(1056);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1062);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1059);
                  annotation();
                }
              }
              setState(1064);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1065);
            match(50);
          }
          break;
        case 33:
          _localctx = new IfJumpContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1066);
            ifThenJump();
            setState(1071);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 150, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1067);
                    match(40);
                    setState(1068);
                    ifThenJump();
                  }
                }
              }
              setState(1073);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  150,
                  this._ctx);
            }
            setState(1075);
            _la = this._input.LA(1);
            if (_la == 40) {
              {
                setState(1074);
                ifElseJump();
              }
            }

            setState(1080);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1077);
                  annotation();
                }
              }
              setState(1082);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1083);
            match(50);
          }
          break;
        case 54:
          _localctx = new SwitchJumpContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1085);
            match(54);
            setState(1086);
            exp(0);
            setState(1090);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 153, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1087);
                    switchCaseJump();
                  }
                }
              }
              setState(1092);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  153,
                  this._ctx);
            }
            setState(1094);
            _la = this._input.LA(1);
            if (_la == 21) {
              {
                setState(1093);
                switchDefaultJump();
              }
            }

            setState(1099);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1096);
                  annotation();
                }
              }
              setState(1101);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1102);
            match(50);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final JumpFileContext jumpFile() throws RecognitionException {
    final JumpFileContext _localctx = new JumpFileContext(this._ctx, getState());
    enterRule(_localctx, 10, Antlr4PilarParser.RULE_jumpFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(167);
        jump();
        setState(168);
        match(Recognizer.EOF);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LhsContext lhs() throws RecognitionException {
    final LhsContext _localctx = new LhsContext(this._ctx, getState());
    enterRule(_localctx, 92, Antlr4PilarParser.RULE_lhs);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1032);
        exp(0);
        setState(1036);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1033);
              annotation();
            }
          }
          setState(1038);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LhssContext lhss() throws RecognitionException {
    final LhssContext _localctx = new LhssContext(this._ctx, getState());
    enterRule(_localctx, 90, Antlr4PilarParser.RULE_lhss);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1024);
        lhs();
        setState(1029);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 28) {
          {
            {
              setState(1025);
              match(28);
              setState(1026);
              lhs();
            }
          }
          setState(1031);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LocalVarDeclarationContext localVarDeclaration()
      throws RecognitionException {
    final LocalVarDeclarationContext _localctx = new LocalVarDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 78, Antlr4PilarParser.RULE_localVarDeclaration);
    int _la;
    try {
      setState(837);
      switch (getInterpreter().adaptivePredict(this._input, 112, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(812);
            localVarFragment();
            setState(817);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(813);
                  match(28);
                  setState(814);
                  localVarFragment();
                }
              }
              setState(819);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(820);
            match(32);
            setState(821);
            type();
            setState(822);
            match(50);
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(825);
            switch (getInterpreter().adaptivePredict(
                this._input,
                110,
                this._ctx)) {
              case 1: {
                setState(824);
                type();
              }
                break;
            }
            setState(827);
            localVarFragment();
            setState(832);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(828);
                  match(28);
                  setState(829);
                  localVarFragment();
                }
              }
              setState(834);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(835);
            match(50);
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LocalVarFragmentContext localVarFragment()
      throws RecognitionException {
    final LocalVarFragmentContext _localctx = new LocalVarFragmentContext(
        this._ctx, getState());
    enterRule(_localctx, 80, Antlr4PilarParser.RULE_localVarFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(839);
        match(Antlr4PilarParser.ID);
        setState(843);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(840);
              annotation();
            }
          }
          setState(845);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LocalVarsDeclarationContext localVarsDeclaration()
      throws RecognitionException {
    final LocalVarsDeclarationContext _localctx = new LocalVarsDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 76, Antlr4PilarParser.RULE_localVarsDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(808);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
          {
            {
              setState(807);
              localVarDeclaration();
            }
          }
          setState(810);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        } while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
            | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0)));
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LocationContext location() throws RecognitionException {
    final LocationContext _localctx = new LocationContext(this._ctx, getState());
    enterRule(_localctx, 82, Antlr4PilarParser.RULE_location);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(846);
        match(Antlr4PilarParser.LID);
        setState(850);
        this._errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(this._input, 114, this._ctx);
        while ((_alt != 2) && (_alt != -1)) {
          if (_alt == 1) {
            {
              {
                setState(847);
                annotation();
              }
            }
          }
          setState(852);
          this._errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(this._input, 114, this._ctx);
        }
        setState(861);
        switch (getInterpreter().adaptivePredict(this._input, 116, this._ctx)) {
          case 1: {
            setState(853);
            transformation();
            setState(858);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 21) {
              {
                {
                  setState(854);
                  match(21);
                  setState(855);
                  transformation();
                }
              }
              setState(860);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
            break;
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LocationFileContext locationFile() throws RecognitionException {
    final LocationFileContext _localctx = new LocationFileContext(this._ctx,
        getState());
    enterRule(_localctx, 4, Antlr4PilarParser.RULE_locationFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(158);
        location();
        setState(159);
        match(Recognizer.EOF);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final MappingContext mapping() throws RecognitionException {
    final MappingContext _localctx = new MappingContext(this._ctx, getState());
    enterRule(_localctx, 128, Antlr4PilarParser.RULE_mapping);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1455);
        exp(0);
        setState(1456);
        match(6);
        setState(1457);
        exp(0);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final MatchingContext matching() throws RecognitionException {
    final MatchingContext _localctx = new MatchingContext(this._ctx, getState());
    enterRule(_localctx, 134, Antlr4PilarParser.RULE_matching);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1484);
        _la = this._input.LA(1);
        if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31) | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
          {
            setState(1476);
            paramVar();
            setState(1481);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1477);
                  match(28);
                  setState(1478);
                  paramVar();
                }
              }
              setState(1483);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
        }

        setState(1486);
        match(44);
        setState(1487);
        exp(0);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ModelContext model() throws RecognitionException {
    final ModelContext _localctx = new ModelContext(this._ctx, getState());
    enterRule(_localctx, 16, Antlr4PilarParser.RULE_model);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(179);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(176);
              annotation();
            }
          }
          setState(181);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(185);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 1)
            | (1L << 10) | (1L << 13) | (1L << 14) | (1L << 23) | (1L << 45) | (1L << 51))) != 0))) {
          {
            {
              setState(182);
              modelElement();
            }
          }
          setState(187);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ModelElementContext modelElement() throws RecognitionException {
    final ModelElementContext _localctx = new ModelElementContext(this._ctx,
        getState());
    enterRule(_localctx, 24, Antlr4PilarParser.RULE_modelElement);
    try {
      setState(228);
      switch (this._input.LA(1)) {
        case 14:
          enterOuterAlt(_localctx, 1);
          {
            setState(221);
            constDeclaration();
          }
          break;
        case 23:
          enterOuterAlt(_localctx, 2);
          {
            setState(222);
            enumDeclaration();
          }
          break;
        case 1:
          enterOuterAlt(_localctx, 3);
          {
            setState(223);
            recordDeclaration();
          }
          break;
        case 10:
          enterOuterAlt(_localctx, 4);
          {
            setState(224);
            globalVarsDeclaration();
          }
          break;
        case 45:
          enterOuterAlt(_localctx, 5);
          {
            setState(225);
            procedureDeclaration();
          }
          break;
        case 13:
          enterOuterAlt(_localctx, 6);
          {
            setState(226);
            funDeclaration();
          }
          break;
        case 51:
          enterOuterAlt(_localctx, 7);
          {
            setState(227);
            extDeclaration();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ModelFileContext modelFile() throws RecognitionException {
    final ModelFileContext _localctx = new ModelFileContext(this._ctx,
        getState());
    enterRule(_localctx, 0, Antlr4PilarParser.RULE_modelFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(152);
        model();
        setState(153);
        match(Recognizer.EOF);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final NewKContext newK() throws RecognitionException {
    final NewKContext _localctx = new NewKContext(this._ctx, getState());
    enterRule(_localctx, 124, Antlr4PilarParser.RULE_newK);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1445);
        _la = this._input.LA(1);
        if (!((_la == 18) || (_la == 42))) {
          this._errHandler.recoverInline(this);
        }
        consume();
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final NewMultiSeqFragmentContext newMultiSeqFragment()
      throws RecognitionException {
    final NewMultiSeqFragmentContext _localctx = new NewMultiSeqFragmentContext(
        this._ctx, getState());
    enterRule(_localctx, 130, Antlr4PilarParser.RULE_newMultiSeqFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1459);
        match(2);
        setState(1468);
        _la = this._input.LA(1);
        if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 2) | (1L << 4)
            | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33) | (1L << 37)
            | (1L << 41) | (1L << 42) | (1L << Antlr4PilarParser.ID)
            | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
            || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (Antlr4PilarParser.AddOP - 68))
                | (1L << (Antlr4PilarParser.MulOP - 68))
                | (1L << (Antlr4PilarParser.UnaryOP - 68))
                | (1L << (Antlr4PilarParser.HEX - 68))
                | (1L << (Antlr4PilarParser.DEC - 68))
                | (1L << (Antlr4PilarParser.OCT - 68))
                | (1L << (Antlr4PilarParser.BIN - 68))
                | (1L << (Antlr4PilarParser.FLOAT - 68))
                | (1L << (Antlr4PilarParser.CHAR - 68)) | (1L << (Antlr4PilarParser.STRING - 68)))) != 0))) {
          {
            setState(1460);
            newMultiSeqFragmentE();
            setState(1465);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1461);
                  match(28);
                  setState(1462);
                  newMultiSeqFragmentE();
                }
              }
              setState(1467);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
        }

        setState(1470);
        match(24);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final NewMultiSeqFragmentEContext newMultiSeqFragmentE()
      throws RecognitionException {
    NewMultiSeqFragmentEContext _localctx = new NewMultiSeqFragmentEContext(
        this._ctx, getState());
    enterRule(_localctx, 132, Antlr4PilarParser.RULE_newMultiSeqFragmentE);
    try {
      setState(1474);
      switch (this._input.LA(1)) {
        case 2:
          _localctx = new NewMultiSeqFragmentENewContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1472);
            newMultiSeqFragment();
          }
          break;
        case 4:
        case 15:
        case 18:
        case 31:
        case 33:
        case 37:
        case 41:
        case 42:
        case ID:
        case GID:
        case MSTRING:
        case AddOP:
        case MulOP:
        case UnaryOP:
        case HEX:
        case DEC:
        case OCT:
        case BIN:
        case FLOAT:
        case CHAR:
        case STRING:
          _localctx = new NewMultiSeqFragmentEExpContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1473);
            exp(0);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final NewMultiSeqTypeFragmentContext newMultiSeqTypeFragment()
      throws RecognitionException {
    final NewMultiSeqTypeFragmentContext _localctx = new NewMultiSeqTypeFragmentContext(
        this._ctx, getState());
    enterRule(_localctx, 138, Antlr4PilarParser.RULE_newMultiSeqTypeFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1493);
        match(2);
        setState(1494);
        exp(0);
        setState(1499);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 28) {
          {
            {
              setState(1495);
              match(28);
              setState(1496);
              exp(0);
            }
          }
          setState(1501);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1502);
        match(24);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ParamVarContext paramVar() throws RecognitionException {
    final ParamVarContext _localctx = new ParamVarContext(this._ctx, getState());
    enterRule(_localctx, 60, Antlr4PilarParser.RULE_paramVar);
    int _la;
    try {
      setState(521);
      switch (getInterpreter().adaptivePredict(this._input, 52, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(502);
            match(Antlr4PilarParser.ID);
            setState(506);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(503);
                  annotation();
                }
              }
              setState(508);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(509);
            match(32);
            setState(510);
            type();
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(512);
            switch (getInterpreter()
                .adaptivePredict(this._input, 50, this._ctx)) {
              case 1: {
                setState(511);
                type();
              }
                break;
            }
            setState(514);
            match(Antlr4PilarParser.ID);
            setState(518);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(515);
                  annotation();
                }
              }
              setState(520);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final PrimaryContext primary() throws RecognitionException {
    PrimaryContext _localctx = new PrimaryContext(this._ctx, getState());
    enterRule(_localctx, 118, Antlr4PilarParser.RULE_primary);
    int _la;
    try {
      int _alt;
      setState(1423);
      switch (getInterpreter().adaptivePredict(this._input, 192, this._ctx)) {
        case 1:
          _localctx = new NameExpContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1297);
            match(Antlr4PilarParser.ID);
          }
          break;

        case 2:
          _localctx = new GlobalNameExpContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1298);
            match(Antlr4PilarParser.GID);
          }
          break;

        case 3:
          _localctx = new ConstantLitContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1299);
            constant();
          }
          break;

        case 4:
          _localctx = new PTupleExpContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1300);
            tupleExp();
          }
          break;

        case 5:
          _localctx = new LetExpContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1301);
            match(37);
            setState(1302);
            binding();
            setState(1307);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1303);
                  match(28);
                  setState(1304);
                  binding();
                }
              }
              setState(1309);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1310);
            match(26);
            setState(1311);
            exp(0);
          }
          break;

        case 6:
          _localctx = new RangedListExpContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(1313);
            newK();
            setState(1314);
            match(2);
            setState(1315);
            exp(0);
            setState(1316);
            match(22);
            setState(1317);
            exp(0);
            setState(1318);
            match(24);
          }
          break;

        case 7:
          _localctx = new ListExpContext(_localctx);
          enterOuterAlt(_localctx, 7);
          {
            setState(1320);
            newK();
            setState(1321);
            match(2);
            setState(1330);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4)
                | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33)
                | (1L << 37) | (1L << 41) | (1L << 42)
                | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
                || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (Antlr4PilarParser.AddOP - 68))
                    | (1L << (Antlr4PilarParser.MulOP - 68))
                    | (1L << (Antlr4PilarParser.UnaryOP - 68))
                    | (1L << (Antlr4PilarParser.HEX - 68))
                    | (1L << (Antlr4PilarParser.DEC - 68))
                    | (1L << (Antlr4PilarParser.OCT - 68))
                    | (1L << (Antlr4PilarParser.BIN - 68))
                    | (1L << (Antlr4PilarParser.FLOAT - 68))
                    | (1L << (Antlr4PilarParser.CHAR - 68)) | (1L << (Antlr4PilarParser.STRING - 68)))) != 0))) {
              {
                setState(1322);
                exp(0);
                setState(1327);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 28) {
                  {
                    {
                      setState(1323);
                      match(28);
                      setState(1324);
                      exp(0);
                    }
                  }
                  setState(1329);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1332);
            match(24);
          }
          break;

        case 8:
          _localctx = new SetExpContext(_localctx);
          enterOuterAlt(_localctx, 8);
          {
            setState(1334);
            newK();
            setState(1335);
            match(36);
            setState(1344);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4)
                | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33)
                | (1L << 37) | (1L << 41) | (1L << 42)
                | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
                || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (Antlr4PilarParser.AddOP - 68))
                    | (1L << (Antlr4PilarParser.MulOP - 68))
                    | (1L << (Antlr4PilarParser.UnaryOP - 68))
                    | (1L << (Antlr4PilarParser.HEX - 68))
                    | (1L << (Antlr4PilarParser.DEC - 68))
                    | (1L << (Antlr4PilarParser.OCT - 68))
                    | (1L << (Antlr4PilarParser.BIN - 68))
                    | (1L << (Antlr4PilarParser.FLOAT - 68))
                    | (1L << (Antlr4PilarParser.CHAR - 68)) | (1L << (Antlr4PilarParser.STRING - 68)))) != 0))) {
              {
                setState(1336);
                exp(0);
                setState(1341);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 28) {
                  {
                    {
                      setState(1337);
                      match(28);
                      setState(1338);
                      exp(0);
                    }
                  }
                  setState(1343);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1346);
            match(5);
          }
          break;

        case 9:
          _localctx = new MapExpContext(_localctx);
          enterOuterAlt(_localctx, 9);
          {
            setState(1348);
            newK();
            setState(1349);
            match(36);
            setState(1359);
            switch (this._input.LA(1)) {
              case 6: {
                setState(1350);
                match(6);
              }
                break;
              case 4:
              case 15:
              case 18:
              case 31:
              case 33:
              case 37:
              case 41:
              case 42:
              case ID:
              case GID:
              case MSTRING:
              case AddOP:
              case MulOP:
              case UnaryOP:
              case HEX:
              case DEC:
              case OCT:
              case BIN:
              case FLOAT:
              case CHAR:
              case STRING: {
                setState(1351);
                mapping();
                setState(1356);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 28) {
                  {
                    {
                      setState(1352);
                      match(28);
                      setState(1353);
                      mapping();
                    }
                  }
                  setState(1358);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
                break;
              default:
                throw new NoViableAltException(this);
            }
            setState(1361);
            match(5);
          }
          break;

        case 10:
          _localctx = new MultiSeqExpContext(_localctx);
          enterOuterAlt(_localctx, 10);
          {
            setState(1363);
            newK();
            setState(1364);
            match(2);
            setState(1373);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(1365);
                newMultiSeqFragment();
                setState(1370);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 28) {
                  {
                    {
                      setState(1366);
                      match(28);
                      setState(1367);
                      newMultiSeqFragment();
                    }
                  }
                  setState(1372);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1375);
            match(24);
          }
          break;

        case 11:
          _localctx = new ClosureExpContext(_localctx);
          enterOuterAlt(_localctx, 11);
          {
            setState(1377);
            newK();
            setState(1378);
            match(36);
            setState(1379);
            matching();
            setState(1384);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 21) {
              {
                {
                  setState(1380);
                  match(21);
                  setState(1381);
                  matching();
                }
              }
              setState(1386);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1387);
            match(5);
          }
          break;

        case 12:
          _localctx = new RecordExpContext(_localctx);
          enterOuterAlt(_localctx, 12);
          {
            setState(1389);
            newK();
            setState(1390);
            match(Antlr4PilarParser.ID);
            setState(1392);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(1391);
                typeTuple();
              }
            }

            setState(1394);
            match(36);
            setState(1403);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(1395);
                fieldInit();
                setState(1400);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 28) {
                  {
                    {
                      setState(1396);
                      match(28);
                      setState(1397);
                      fieldInit();
                    }
                  }
                  setState(1402);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1405);
            match(5);
          }
          break;

        case 13:
          _localctx = new ArrayExpContext(_localctx);
          enterOuterAlt(_localctx, 13);
          {
            setState(1407);
            newK();
            setState(1408);
            baseType();
            setState(1412);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 190, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1409);
                    newMultiSeqTypeFragment();
                  }
                }
              }
              setState(1414);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  190,
                  this._ctx);
            }
            setState(1418);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 191, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1415);
                    typeFragment();
                  }
                }
              }
              setState(1420);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  191,
                  this._ctx);
            }
          }
          break;

        case 14:
          _localctx = new TypeExpContext(_localctx);
          enterOuterAlt(_localctx, 14);
          {
            setState(1421);
            match(42);
            setState(1422);
            type();
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final PrimarySuffixContext primarySuffix() throws RecognitionException {
    PrimarySuffixContext _localctx = new PrimarySuffixContext(this._ctx,
        getState());
    enterRule(_localctx, 116, Antlr4PilarParser.RULE_primarySuffix);
    int _la;
    try {
      setState(1295);
      switch (this._input.LA(1)) {
        case 2:
          _localctx = new IndexingSuffixContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1278);
            match(2);
            setState(1279);
            exp(0);
            setState(1284);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1280);
                  match(28);
                  setState(1281);
                  exp(0);
                }
              }
              setState(1286);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1287);
            match(24);
          }
          break;
        case 43:
          _localctx = new AccessSuffixContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1289);
            match(43);
            setState(1290);
            match(Antlr4PilarParser.ID);
          }
          break;
        case 3:
        case 31:
          _localctx = new CallSuffixContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1292);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(1291);
                typeTuple();
              }
            }

            setState(1294);
            tupleExp();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ProcedureDeclarationContext procedureDeclaration()
      throws RecognitionException {
    final ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 58, Antlr4PilarParser.RULE_procedureDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(446);
        match(45);
        setState(448);
        _la = this._input.LA(1);
        if (_la == 2) {
          {
            setState(447);
            typeVarTuple();
          }
        }

        setState(500);
        switch (getInterpreter().adaptivePredict(this._input, 48, this._ctx)) {
          case 1: {
            setState(450);
            match(Antlr4PilarParser.ID);
            setState(463);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(451);
                match(31);
                setState(460);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(452);
                    paramVar();
                    setState(457);
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    while (_la == 28) {
                      {
                        {
                          setState(453);
                          match(28);
                          setState(454);
                          paramVar();
                        }
                      }
                      setState(459);
                      this._errHandler.sync(this);
                      _la = this._input.LA(1);
                    }
                  }
                }

                setState(462);
                match(7);
              }
            }

            setState(465);
            match(32);
            setState(466);
            type();
            setState(470);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(467);
                  annotation();
                }
              }
              setState(472);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(473);
            body();
          }
            break;

          case 2: {
            setState(476);
            switch (getInterpreter()
                .adaptivePredict(this._input, 43, this._ctx)) {
              case 1: {
                setState(475);
                type();
              }
                break;
            }
            setState(478);
            match(Antlr4PilarParser.ID);
            setState(491);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(479);
                match(31);
                setState(488);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(480);
                    paramVar();
                    setState(485);
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    while (_la == 28) {
                      {
                        {
                          setState(481);
                          match(28);
                          setState(482);
                          paramVar();
                        }
                      }
                      setState(487);
                      this._errHandler.sync(this);
                      _la = this._input.LA(1);
                    }
                  }
                }

                setState(490);
                match(7);
              }
            }

            setState(496);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(493);
                  annotation();
                }
              }
              setState(498);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(499);
            body();
          }
            break;
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final RecordDeclarationContext recordDeclaration()
      throws RecognitionException {
    final RecordDeclarationContext _localctx = new RecordDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 40, Antlr4PilarParser.RULE_recordDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(319);
        match(1);
        setState(320);
        match(Antlr4PilarParser.ID);
        setState(322);
        _la = this._input.LA(1);
        if (_la == 2) {
          {
            setState(321);
            typeVarTuple();
          }
        }

        setState(327);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(324);
              annotation();
            }
          }
          setState(329);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(331);
        _la = this._input.LA(1);
        if (_la == 38) {
          {
            setState(330);
            extendClauses();
          }
        }

        setState(333);
        match(36);
        setState(337);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
            | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
          {
            {
              setState(334);
              field();
            }
          }
          setState(339);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(340);
        match(5);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final RhsContext rhs() throws RecognitionException {
    final RhsContext _localctx = new RhsContext(this._ctx, getState());
    enterRule(_localctx, 94, Antlr4PilarParser.RULE_rhs);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1042);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1039);
              annotation();
            }
          }
          setState(1044);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1045);
        exp(0);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @Override
  public boolean sempred(final RuleContext _localctx, final int ruleIndex,
      final int predIndex) {
    switch (ruleIndex) {
      case 55:
        return exp_sempred((ExpContext) _localctx, predIndex);
    }
    return true;
  }

  public final SwitchCaseJumpContext switchCaseJump()
      throws RecognitionException {
    final SwitchCaseJumpContext _localctx = new SwitchCaseJumpContext(
        this._ctx, getState());
    enterRule(_localctx, 104, Antlr4PilarParser.RULE_switchCaseJump);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1138);
        match(21);
        setState(1139);
        constant();
        setState(1140);
        match(44);
        setState(1144);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1141);
              annotation();
            }
          }
          setState(1146);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1147);
        match(12);
        setState(1148);
        match(Antlr4PilarParser.ID);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SwitchDefaultJumpContext switchDefaultJump()
      throws RecognitionException {
    final SwitchDefaultJumpContext _localctx = new SwitchDefaultJumpContext(
        this._ctx, getState());
    enterRule(_localctx, 106, Antlr4PilarParser.RULE_switchDefaultJump);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1150);
        match(21);
        setState(1151);
        match(40);
        setState(1152);
        match(44);
        setState(1156);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1153);
              annotation();
            }
          }
          setState(1158);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1159);
        match(12);
        setState(1160);
        match(Antlr4PilarParser.ID);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TransformationContext transformation()
      throws RecognitionException {
    TransformationContext _localctx = new TransformationContext(this._ctx,
        getState());
    enterRule(_localctx, 84, Antlr4PilarParser.RULE_transformation);
    int _la;
    try {
      int _alt;
      setState(913);
      switch (getInterpreter().adaptivePredict(this._input, 127, this._ctx)) {
        case 1:
          _localctx = new CallTransformationContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(864);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4)
                | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33)
                | (1L << 37) | (1L << 40) | (1L << 41) | (1L << 42)
                | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
                || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (Antlr4PilarParser.AddOP - 68))
                    | (1L << (Antlr4PilarParser.MulOP - 68))
                    | (1L << (Antlr4PilarParser.UnaryOP - 68))
                    | (1L << (Antlr4PilarParser.HEX - 68))
                    | (1L << (Antlr4PilarParser.DEC - 68))
                    | (1L << (Antlr4PilarParser.OCT - 68))
                    | (1L << (Antlr4PilarParser.BIN - 68))
                    | (1L << (Antlr4PilarParser.FLOAT - 68))
                    | (1L << (Antlr4PilarParser.CHAR - 68)) | (1L << (Antlr4PilarParser.STRING - 68)))) != 0))) {
              {
                setState(863);
                guard();
              }
            }

            setState(866);
            match(16);
            setState(876);
            switch (getInterpreter().adaptivePredict(
                this._input,
                119,
                this._ctx)) {
              case 1: {
                setState(867);
                ((CallTransformationContext) _localctx).ID = match(Antlr4PilarParser.ID);
                ((CallTransformationContext) _localctx).clhs
                    .add(((CallTransformationContext) _localctx).ID);
                setState(872);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 28) {
                  {
                    {
                      setState(868);
                      match(28);
                      setState(869);
                      ((CallTransformationContext) _localctx).ID = match(Antlr4PilarParser.ID);
                      ((CallTransformationContext) _localctx).clhs
                          .add(((CallTransformationContext) _localctx).ID);
                    }
                  }
                  setState(874);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
                setState(875);
                match(Antlr4PilarParser.AssignOP);
              }
                break;
            }
            setState(878);
            ((CallTransformationContext) _localctx).p = match(Antlr4PilarParser.ID);
            setState(879);
            tupleExp();
            setState(883);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 120, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(880);
                    ((CallTransformationContext) _localctx).annotation = annotation();
                    ((CallTransformationContext) _localctx).cans
                        .add(((CallTransformationContext) _localctx).annotation);
                  }
                }
              }
              setState(885);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  120,
                  this._ctx);
            }
            setState(887);
            _la = this._input.LA(1);
            if (_la == 12) {
              {
                setState(886);
                gotoj();
              }
            }

            setState(892);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(889);
                  ((CallTransformationContext) _localctx).annotation = annotation();
                  ((CallTransformationContext) _localctx).tanns
                      .add(((CallTransformationContext) _localctx).annotation);
                }
              }
              setState(894);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
          break;

        case 2:
          _localctx = new BlockTransformationContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(896);
            switch (getInterpreter().adaptivePredict(
                this._input,
                123,
                this._ctx)) {
              case 1: {
                setState(895);
                guard();
              }
                break;
            }
            setState(901);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 124, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(898);
                    action();
                  }
                }
              }
              setState(903);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  124,
                  this._ctx);
            }
            setState(905);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 12)
                | (1L << 33) | (1L << 46) | (1L << 54))) != 0))) {
              {
                setState(904);
                jump();
              }
            }

            setState(910);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(907);
                  ((BlockTransformationContext) _localctx).annotation = annotation();
                  ((BlockTransformationContext) _localctx).tanns
                      .add(((BlockTransformationContext) _localctx).annotation);
                }
              }
              setState(912);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TransformationFileContext transformationFile()
      throws RecognitionException {
    final TransformationFileContext _localctx = new TransformationFileContext(
        this._ctx, getState());
    enterRule(_localctx, 6, Antlr4PilarParser.RULE_transformationFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(161);
        transformation();
        setState(162);
        match(Recognizer.EOF);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TupleExpContext tupleExp() throws RecognitionException {
    final TupleExpContext _localctx = new TupleExpContext(this._ctx, getState());
    enterRule(_localctx, 120, Antlr4PilarParser.RULE_tupleExp);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1425);
        match(31);
        setState(1434);
        _la = this._input.LA(1);
        if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4) | (1L << 15)
            | (1L << 18) | (1L << 31) | (1L << 33) | (1L << 37) | (1L << 41)
            | (1L << 42) | (1L << Antlr4PilarParser.ID)
            | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
            || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (Antlr4PilarParser.AddOP - 68))
                | (1L << (Antlr4PilarParser.MulOP - 68))
                | (1L << (Antlr4PilarParser.UnaryOP - 68))
                | (1L << (Antlr4PilarParser.HEX - 68))
                | (1L << (Antlr4PilarParser.DEC - 68))
                | (1L << (Antlr4PilarParser.OCT - 68))
                | (1L << (Antlr4PilarParser.BIN - 68))
                | (1L << (Antlr4PilarParser.FLOAT - 68))
                | (1L << (Antlr4PilarParser.CHAR - 68)) | (1L << (Antlr4PilarParser.STRING - 68)))) != 0))) {
          {
            setState(1426);
            annExp();
            setState(1431);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 28) {
              {
                {
                  setState(1427);
                  match(28);
                  setState(1428);
                  annExp();
                }
              }
              setState(1433);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
        }

        setState(1436);
        match(7);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeContext type() throws RecognitionException {
    final TypeContext _localctx = new TypeContext(this._ctx, getState());
    enterRule(_localctx, 140, Antlr4PilarParser.RULE_type);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1504);
        baseType();
        setState(1508);
        this._errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(this._input, 203, this._ctx);
        while ((_alt != 2) && (_alt != -1)) {
          if (_alt == 1) {
            {
              {
                setState(1505);
                typeFragment();
              }
            }
          }
          setState(1510);
          this._errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(this._input, 203, this._ctx);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypealiasDeclarationContext typealiasDeclaration()
      throws RecognitionException {
    final TypealiasDeclarationContext _localctx = new TypealiasDeclarationContext(
        this._ctx, getState());
    enterRule(_localctx, 34, Antlr4PilarParser.RULE_typealiasDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(286);
        match(34);
        setState(287);
        match(Antlr4PilarParser.ID);
        setState(289);
        _la = this._input.LA(1);
        if (_la == 2) {
          {
            setState(288);
            typeVarTuple();
          }
        }

        setState(294);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(291);
              annotation();
            }
          }
          setState(296);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(297);
        match(11);
        setState(298);
        type();
        setState(299);
        match(50);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeFileContext typeFile() throws RecognitionException {
    final TypeFileContext _localctx = new TypeFileContext(this._ctx, getState());
    enterRule(_localctx, 14, Antlr4PilarParser.RULE_typeFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(173);
        type();
        setState(174);
        match(Recognizer.EOF);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeFragmentContext typeFragment() throws RecognitionException {
    TypeFragmentContext _localctx = new TypeFragmentContext(this._ctx,
        getState());
    enterRule(_localctx, 142, Antlr4PilarParser.RULE_typeFragment);
    int _la;
    try {
      setState(1536);
      switch (getInterpreter().adaptivePredict(this._input, 206, this._ctx)) {
        case 1:
          _localctx = new SeqFragmentContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1511);
            match(2);
            setState(1512);
            match(24);
          }
          break;

        case 2:
          _localctx = new StaticSeqFragmentContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1513);
            match(2);
            setState(1514);
            constant();
            setState(1515);
            match(24);
          }
          break;

        case 3:
          _localctx = new MultiSeqFragmentContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1517);
            match(2);
            setState(1519);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            do {
              {
                {
                  setState(1518);
                  ((MultiSeqFragmentContext) _localctx).s28 = match(28);
                  ((MultiSeqFragmentContext) _localctx).rank
                      .add(((MultiSeqFragmentContext) _localctx).s28);
                }
              }
              setState(1521);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            } while (_la == 28);
            setState(1523);
            match(24);
          }
          break;

        case 4:
          _localctx = new StaticMultiSeqFragmentContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1524);
            match(2);
            setState(1525);
            constant();
            setState(1528);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            do {
              {
                {
                  setState(1526);
                  match(28);
                  setState(1527);
                  constant();
                }
              }
              setState(1530);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            } while (_la == 28);
            setState(1532);
            match(24);
          }
          break;

        case 5:
          _localctx = new SetFragmentContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1534);
            match(36);
            setState(1535);
            match(5);
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeParamContext typeParam() throws RecognitionException {
    final TypeParamContext _localctx = new TypeParamContext(this._ctx,
        getState());
    enterRule(_localctx, 148, Antlr4PilarParser.RULE_typeParam);
    int _la;
    try {
      setState(1641);
      switch (getInterpreter().adaptivePredict(this._input, 220, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(1622);
            match(Antlr4PilarParser.ID);
            setState(1626);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1623);
                  annotation();
                }
              }
              setState(1628);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1629);
            match(32);
            setState(1630);
            type();
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(1631);
            type();
            setState(1633);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(1632);
                match(Antlr4PilarParser.ID);
              }
            }

            setState(1638);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1635);
                  annotation();
                }
              }
              setState(1640);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
          break;
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeTupleContext typeTuple() throws RecognitionException {
    final TypeTupleContext _localctx = new TypeTupleContext(this._ctx,
        getState());
    enterRule(_localctx, 46, Antlr4PilarParser.RULE_typeTuple);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(361);
        match(3);
        setState(362);
        type();
        setState(367);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 28) {
          {
            {
              setState(363);
              match(28);
              setState(364);
              type();
            }
          }
          setState(369);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(370);
        match(52);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeVarContext typeVar() throws RecognitionException {
    final TypeVarContext _localctx = new TypeVarContext(this._ctx, getState());
    enterRule(_localctx, 38, Antlr4PilarParser.RULE_typeVar);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(312);
        match(Antlr4PilarParser.ID);
        setState(316);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(313);
              annotation();
            }
          }
          setState(318);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeVarTupleContext typeVarTuple() throws RecognitionException {
    final TypeVarTupleContext _localctx = new TypeVarTupleContext(this._ctx,
        getState());
    enterRule(_localctx, 36, Antlr4PilarParser.RULE_typeVarTuple);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(301);
        match(2);
        setState(302);
        typeVar();
        setState(307);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 28) {
          {
            {
              setState(303);
              match(28);
              setState(304);
              typeVar();
            }
          }
          setState(309);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(310);
        match(24);
      }
    } catch (final RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }
}
