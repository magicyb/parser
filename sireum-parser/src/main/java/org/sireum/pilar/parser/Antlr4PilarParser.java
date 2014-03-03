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
    public BodyContext(final ParserRuleContext parent, final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitBody(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    public EmptyBodyContext emptyBody() {
      return getRuleContext(EmptyBodyContext.class, 0);
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterBody(this);
      }
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitBody(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_body;
    }

    public ImplementedBodyContext implementedBody() {
      return getRuleContext(ImplementedBodyContext.class, 0);
    }
  }

  public static class BodyFileContext extends ParserRuleContext {
    public BodyFileContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof Antlr4PilarVisitor) {
        return ((Antlr4PilarVisitor<? extends T>) visitor).visitBodyFile(this);
      } else {
        return visitor.visitChildren(this);
      }
    }

    @Override
    public void enterRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).enterBodyFile(this);
      }
    }

    public TerminalNode EOF() {
      return getToken(Recognizer.EOF, 0);
    }

    @Override
    public void exitRule(final ParseTreeListener listener) {
      if (listener instanceof Antlr4PilarListener) {
        ((Antlr4PilarListener) listener).exitBodyFile(this);
      }
    }

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_bodyFile;
    }

    public ImplementedBodyContext implementedBody() {
      return getRuleContext(ImplementedBodyContext.class, 0);
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

  public static class EmptyBodyContext extends ParserRuleContext {
    public EmptyBodyContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
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

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_emptyBody;
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

  public static class ImplementedBodyContext extends ParserRuleContext {
    public ImplementedBodyContext(final ParserRuleContext parent,
        final int invokingState) {
      super(parent, invokingState);
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

    @Override
    public int getRuleIndex() {
      return Antlr4PilarParser.RULE_implementedBody;
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

    public TypealiasDeclarationContext typealiasDeclaration() {
      return getRuleContext(TypealiasDeclarationContext.class, 0);
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
    public Token s27;
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
      T__2 = 53, T__1 = 54, T__0 = 55, GID = 56, ID = 57, LID = 58,
      MSTRING = 59, WS = 60, COMMENT = 61, LINE_COMMENT = 62, AssignOP = 63,
      CondAndOP = 64, CondOrOP = 65, AndOP = 66, XorOP = 67, OrOP = 68,
      EqOP = 69, RelOP = 70, ShiftOP = 71, AddOP = 72, MulOP = 73,
      UnaryOP = 74, HEX = 75, DEC = 76, OCT = 77, BIN = 78, FLOAT = 79,
      CHAR = 80, STRING = 81, ErrorChar = 82;
  public static final String[] tokenNames = { "<INVALID>", "'record'", "'['",
      "'<'", "'false'", "'}'", "'->'", "')'", "'throw'", "'@'", "'global'",
      "'='", "'goto'", "'fun'", "'const'", "'null'", "'call'", "'-!>'",
      "'new'", "'+>'", "'assert'", "'|'", "'..'", "'enum'", "']'", "'assume'",
      "'in'", "','", "'expdef'", "'<=='", "'==>'", "'('", "':'", "'if'",
      "'typealias'", "'...'", "'{'", "'let'", "'extends'", "'catch'", "'else'",
      "'true'", "'^'", "'.'", "'=>'", "'procedure'", "'return'", "'typedef'",
      "'start'", "'actiondef'", "';'", "'extension'", "'>'", "'then'",
      "'switch'", "'procdef'", "GID", "ID", "LID", "MSTRING", "WS", "COMMENT",
      "LINE_COMMENT", "AssignOP", "CondAndOP", "CondOrOP", "AndOP", "XorOP",
      "OrOP", "EqOP", "RelOP", "ShiftOP", "AddOP", "MulOP", "UnaryOP", "HEX",
      "DEC", "OCT", "BIN", "FLOAT", "CHAR", "STRING", "ErrorChar" };
  public static final int RULE_modelFile = 0, RULE_annotationFile = 1,
      RULE_bodyFile = 2, RULE_locationFile = 3, RULE_transformationFile = 4,
      RULE_actionFile = 5, RULE_jumpFile = 6, RULE_expFile = 7,
      RULE_typeFile = 8, RULE_model = 9, RULE_annotation = 10,
      RULE_annotationParams = 11, RULE_annotationParam = 12,
      RULE_modelElement = 13, RULE_constDeclaration = 14,
      RULE_constElement = 15, RULE_enumDeclaration = 16, RULE_enumElement = 17,
      RULE_typealiasDeclaration = 18, RULE_typeVarTuple = 19,
      RULE_typeVar = 20, RULE_recordDeclaration = 21, RULE_extendClauses = 22,
      RULE_extendClause = 23, RULE_typeTuple = 24, RULE_field = 25,
      RULE_fieldFragment = 26, RULE_globalVarsDeclaration = 27,
      RULE_globalVarDeclaration = 28, RULE_globalVarFragment = 29,
      RULE_procedureDeclaration = 30, RULE_paramVar = 31,
      RULE_funDeclaration = 32, RULE_extDeclaration = 33, RULE_extElement = 34,
      RULE_extParams = 35, RULE_extParam = 36, RULE_extParamVariable = 37,
      RULE_body = 38, RULE_implementedBody = 39, RULE_emptyBody = 40,
      RULE_localVarsDeclaration = 41, RULE_localVarDeclaration = 42,
      RULE_localVarFragment = 43, RULE_location = 44, RULE_transformation = 45,
      RULE_guard = 46, RULE_action = 47, RULE_lhss = 48, RULE_lhs = 49,
      RULE_rhs = 50, RULE_jump = 51, RULE_gotoj = 52, RULE_ifThenJump = 53,
      RULE_ifElseJump = 54, RULE_switchCaseJump = 55,
      RULE_switchDefaultJump = 56, RULE_catchClause = 57, RULE_exp = 58,
      RULE_ifThenExp = 59, RULE_ifElseExp = 60, RULE_primarySuffix = 61,
      RULE_primary = 62, RULE_tupleExp = 63, RULE_annExp = 64, RULE_newK = 65,
      RULE_binding = 66, RULE_mapping = 67, RULE_newMultiSeqFragment = 68,
      RULE_newMultiSeqFragmentE = 69, RULE_matching = 70, RULE_fieldInit = 71,
      RULE_newMultiSeqTypeFragment = 72, RULE_type = 73,
      RULE_typeFragment = 74, RULE_constant = 75, RULE_baseType = 76,
      RULE_typeParam = 77, RULE_annotatedType = 78;
  public static final String[] ruleNames = { "modelFile", "annotationFile",
      "bodyFile", "locationFile", "transformationFile", "actionFile",
      "jumpFile", "expFile", "typeFile", "model", "annotation",
      "annotationParams", "annotationParam", "modelElement",
      "constDeclaration", "constElement", "enumDeclaration", "enumElement",
      "typealiasDeclaration", "typeVarTuple", "typeVar", "recordDeclaration",
      "extendClauses", "extendClause", "typeTuple", "field", "fieldFragment",
      "globalVarsDeclaration", "globalVarDeclaration", "globalVarFragment",
      "procedureDeclaration", "paramVar", "funDeclaration", "extDeclaration",
      "extElement", "extParams", "extParam", "extParamVariable", "body",
      "implementedBody", "emptyBody", "localVarsDeclaration",
      "localVarDeclaration", "localVarFragment", "location", "transformation",
      "guard", "action", "lhss", "lhs", "rhs", "jump", "gotoj", "ifThenJump",
      "ifElseJump", "switchCaseJump", "switchDefaultJump", "catchClause",
      "exp", "ifThenExp", "ifElseExp", "primarySuffix", "primary", "tupleExp",
      "annExp", "newK", "binding", "mapping", "newMultiSeqFragment",
      "newMultiSeqFragmentE", "matching", "fieldInit",
      "newMultiSeqTypeFragment", "type", "typeFragment", "constant",
      "baseType", "typeParam", "annotatedType" };
  public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3T\u0685\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
      + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
      + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
      + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
      + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
      + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
      + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"
      + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\3\3\3\3\3"
      + "\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"
      + "\t\3\n\3\n\3\n\3\13\7\13\u00bd\n\13\f\13\16\13\u00c0\13\13\3\13\7\13\u00c3"
      + "\n\13\f\13\16\13\u00c6\13\13\3\f\3\f\3\f\5\f\u00cb\n\f\3\r\3\r\3\r\3\r"
      + "\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\r\3\r\3\r\6\r\u00d9\n\r\r\r\16\r"
      + "\u00da\5\r\u00dd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e7"
      + "\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f1\n\17\3\20\3\20"
      + "\3\20\7\20\u00f6\n\20\f\20\16\20\u00f9\13\20\3\20\3\20\7\20\u00fd\n\20"
      + "\f\20\16\20\u0100\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0108\n\21"
      + "\f\21\16\21\u010b\13\21\3\21\3\21\3\22\3\22\3\22\7\22\u0112\n\22\f\22"
      + "\16\22\u0115\13\22\3\22\3\22\3\22\3\22\7\22\u011b\n\22\f\22\16\22\u011e"
      + "\13\22\5\22\u0120\n\22\3\22\3\22\3\23\3\23\7\23\u0126\n\23\f\23\16\23"
      + "\u0129\13\23\3\24\3\24\3\24\5\24\u012e\n\24\3\24\7\24\u0131\n\24\f\24"
      + "\16\24\u0134\13\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u013e"
      + "\n\25\f\25\16\25\u0141\13\25\3\25\3\25\3\26\3\26\7\26\u0147\n\26\f\26"
      + "\16\26\u014a\13\26\3\27\3\27\3\27\5\27\u014f\n\27\3\27\7\27\u0152\n\27"
      + "\f\27\16\27\u0155\13\27\3\27\5\27\u0158\n\27\3\27\3\27\7\27\u015c\n\27"
      + "\f\27\16\27\u015f\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0167\n\30"
      + "\f\30\16\30\u016a\13\30\3\31\3\31\5\31\u016e\n\31\3\31\7\31\u0171\n\31"
      + "\f\31\16\31\u0174\13\31\3\32\3\32\3\32\3\32\7\32\u017a\n\32\f\32\16\32"
      + "\u017d\13\32\3\32\3\32\3\33\3\33\3\33\7\33\u0184\n\33\f\33\16\33\u0187"
      + "\13\33\3\33\3\33\3\33\3\33\3\33\5\33\u018e\n\33\3\33\3\33\3\33\7\33\u0193"
      + "\n\33\f\33\16\33\u0196\13\33\3\33\3\33\5\33\u019a\n\33\3\34\3\34\7\34"
      + "\u019e\n\34\f\34\16\34\u01a1\13\34\3\35\3\35\6\35\u01a5\n\35\r\35\16\35"
      + "\u01a6\3\36\3\36\3\36\7\36\u01ac\n\36\f\36\16\36\u01af\13\36\3\36\3\36"
      + "\3\36\3\36\3\36\5\36\u01b6\n\36\3\36\3\36\3\36\7\36\u01bb\n\36\f\36\16"
      + "\36\u01be\13\36\3\36\3\36\5\36\u01c2\n\36\3\37\3\37\7\37\u01c6\n\37\f"
      + "\37\16\37\u01c9\13\37\3 \3 \5 \u01cd\n \3 \3 \3 \3 \3 \7 \u01d4\n \f "
      + "\16 \u01d7\13 \5 \u01d9\n \3 \5 \u01dc\n \3 \3 \3 \7 \u01e1\n \f \16 "
      + "\u01e4\13 \3 \3 \3 \5 \u01e9\n \3 \3 \3 \3 \3 \7 \u01f0\n \f \16 \u01f3"
      + "\13 \5 \u01f5\n \3 \5 \u01f8\n \3 \7 \u01fb\n \f \16 \u01fe\13 \3 \5 "
      + "\u0201\n \3!\3!\7!\u0205\n!\f!\16!\u0208\13!\3!\3!\3!\5!\u020d\n!\3!\3"
      + "!\7!\u0211\n!\f!\16!\u0214\13!\5!\u0216\n!\3\"\3\"\5\"\u021a\n\"\3\"\3"
      + "\"\3\"\3\"\3\"\7\"\u0221\n\"\f\"\16\"\u0224\13\"\5\"\u0226\n\"\3\"\5\""
      + "\u0229\n\"\3\"\7\"\u022c\n\"\f\"\16\"\u022f\13\"\3\"\3\"\3\"\3\"\3\"\3"
      + "\"\3\"\5\"\u0238\n\"\3\"\3\"\3\"\3\"\3\"\7\"\u023f\n\"\f\"\16\"\u0242"
      + "\13\"\5\"\u0244\n\"\3\"\5\"\u0247\n\"\3\"\7\"\u024a\n\"\f\"\16\"\u024d"
      + "\13\"\3\"\3\"\3\"\3\"\5\"\u0253\n\"\3#\3#\5#\u0257\n#\3#\3#\7#\u025b\n"
      + "#\f#\16#\u025e\13#\3#\3#\7#\u0262\n#\f#\16#\u0265\13#\3#\3#\3$\3$\5$\u026b"
      + "\n$\3$\3$\7$\u026f\n$\f$\16$\u0272\13$\3$\5$\u0275\n$\3$\3$\3$\5$\u027a"
      + "\n$\3$\3$\3$\5$\u027f\n$\3$\5$\u0282\n$\3$\7$\u0285\n$\f$\16$\u0288\13"
      + "$\3$\3$\3$\5$\u028d\n$\3$\3$\3$\5$\u0292\n$\3$\5$\u0295\n$\3$\7$\u0298"
      + "\n$\f$\16$\u029b\13$\3$\3$\3$\3$\3$\3$\5$\u02a3\n$\3$\5$\u02a6\n$\3$\3"
      + "$\3$\5$\u02ab\n$\3$\5$\u02ae\n$\3$\7$\u02b1\n$\f$\16$\u02b4\13$\3$\3$"
      + "\3$\5$\u02b9\n$\3$\3$\3$\5$\u02be\n$\3$\5$\u02c1\n$\3$\7$\u02c4\n$\f$"
      + "\16$\u02c7\13$\3$\3$\3$\3$\3$\3$\5$\u02cf\n$\3$\5$\u02d2\n$\3$\3$\3$\5"
      + "$\u02d7\n$\3$\5$\u02da\n$\3$\7$\u02dd\n$\f$\16$\u02e0\13$\3$\5$\u02e3"
      + "\n$\3%\3%\3%\7%\u02e8\n%\f%\16%\u02eb\13%\3%\3%\5%\u02ef\n%\3%\5%\u02f2"
      + "\n%\3&\3&\7&\u02f6\n&\f&\16&\u02f9\13&\3&\3&\3&\3&\5&\u02ff\n&\3&\7&\u0302"
      + "\n&\f&\16&\u0305\13&\5&\u0307\n&\3\'\3\'\3\'\7\'\u030c\n\'\f\'\16\'\u030f"
      + "\13\'\3\'\3\'\3\'\3\'\3\'\5\'\u0316\n\'\3\'\7\'\u0319\n\'\f\'\16\'\u031c"
      + "\13\'\5\'\u031e\n\'\3(\3(\5(\u0322\n(\3)\3)\5)\u0326\n)\3)\7)\u0329\n"
      + ")\f)\16)\u032c\13)\3)\7)\u032f\n)\f)\16)\u0332\13)\3)\3)\3*\3*\3+\6+\u0339"
      + "\n+\r+\16+\u033a\3,\3,\3,\7,\u0340\n,\f,\16,\u0343\13,\3,\3,\3,\3,\3,"
      + "\5,\u034a\n,\3,\3,\3,\7,\u034f\n,\f,\16,\u0352\13,\3,\3,\5,\u0356\n,\3"
      + "-\3-\7-\u035a\n-\f-\16-\u035d\13-\3.\3.\7.\u0361\n.\f.\16.\u0364\13.\3"
      + ".\3.\3.\7.\u0369\n.\f.\16.\u036c\13.\5.\u036e\n.\3/\5/\u0371\n/\3/\3/"
      + "\3/\3/\7/\u0377\n/\f/\16/\u037a\13/\3/\5/\u037d\n/\3/\3/\3/\7/\u0382\n"
      + "/\f/\16/\u0385\13/\3/\3/\5/\u0389\n/\3/\7/\u038c\n/\f/\16/\u038f\13/\3"
      + "/\5/\u0392\n/\3/\7/\u0395\n/\f/\16/\u0398\13/\3/\5/\u039b\n/\3/\7/\u039e"
      + "\n/\f/\16/\u03a1\13/\5/\u03a3\n/\3\60\3\60\7\60\u03a7\n\60\f\60\16\60"
      + "\u03aa\13\60\3\60\3\60\3\60\3\60\7\60\u03b0\n\60\f\60\16\60\u03b3\13\60"
      + "\5\60\u03b5\n\60\3\61\3\61\3\61\3\61\5\61\u03bb\n\61\3\61\7\61\u03be\n"
      + "\61\f\61\16\61\u03c1\13\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u03c9\n"
      + "\61\3\61\7\61\u03cc\n\61\f\61\16\61\u03cf\13\61\3\61\3\61\3\61\3\61\3"
      + "\61\7\61\u03d6\n\61\f\61\16\61\u03d9\13\61\3\61\3\61\3\61\3\61\5\61\u03df"
      + "\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u03e6\n\61\3\61\3\61\7\61\u03ea\n"
      + "\61\f\61\16\61\u03ed\13\61\3\61\3\61\3\61\3\61\5\61\u03f3\n\61\3\61\3"
      + "\61\7\61\u03f7\n\61\f\61\16\61\u03fa\13\61\3\61\3\61\3\61\3\61\3\61\3"
      + "\61\3\61\7\61\u0403\n\61\f\61\16\61\u0406\13\61\3\61\7\61\u0409\n\61\f"
      + "\61\16\61\u040c\13\61\3\61\3\61\5\61\u0410\n\61\3\62\3\62\3\62\7\62\u0415"
      + "\n\62\f\62\16\62\u0418\13\62\3\63\3\63\7\63\u041c\n\63\f\63\16\63\u041f"
      + "\13\63\3\64\7\64\u0422\n\64\f\64\16\64\u0425\13\64\3\64\3\64\3\65\3\65"
      + "\3\65\3\65\3\65\7\65\u042e\n\65\f\65\16\65\u0431\13\65\5\65\u0433\n\65"
      + "\3\65\7\65\u0436\n\65\f\65\16\65\u0439\13\65\3\65\3\65\3\65\3\65\7\65"
      + "\u043f\n\65\f\65\16\65\u0442\13\65\3\65\5\65\u0445\n\65\3\65\7\65\u0448"
      + "\n\65\f\65\16\65\u044b\13\65\3\65\3\65\3\65\3\65\3\65\7\65\u0452\n\65"
      + "\f\65\16\65\u0455\13\65\3\65\5\65\u0458\n\65\3\65\7\65\u045b\n\65\f\65"
      + "\16\65\u045e\13\65\3\65\3\65\5\65\u0462\n\65\3\66\3\66\3\66\7\66\u0467"
      + "\n\66\f\66\16\66\u046a\13\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0472"
      + "\n\67\f\67\16\67\u0475\13\67\3\67\3\67\3\67\38\38\78\u047c\n8\f8\168\u047f"
      + "\138\38\38\38\39\39\39\39\79\u0488\n9\f9\169\u048b\139\39\39\39\3:\3:"
      + "\3:\3:\7:\u0494\n:\f:\16:\u0497\13:\3:\3:\3:\3;\3;\7;\u049e\n;\f;\16;"
      + "\u04a1\13;\3;\5;\u04a4\n;\3;\3;\3;\5;\u04a9\n;\3;\5;\u04ac\n;\5;\u04ae"
      + "\n;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u04c2\n<"
      + "\f<\16<\u04c5\13<\3<\3<\3<\7<\u04ca\n<\f<\16<\u04cd\13<\3<\3<\5<\u04d1"
      + "\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"
      + "\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u04f7\n<\f<\16<\u04fa\13"
      + "<\3=\3=\3=\3=\7=\u0500\n=\f=\16=\u0503\13=\3=\3=\3>\3>\7>\u0509\n>\f>"
      + "\16>\u050c\13>\3>\3>\3?\3?\3?\3?\7?\u0514\n?\f?\16?\u0517\13?\3?\3?\3"
      + "?\3?\3?\5?\u051e\n?\3?\5?\u0521\n?\3@\3@\3@\3@\3@\3@\3@\3@\7@\u052b\n"
      + "@\f@\16@\u052e\13@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u053f"
      + "\n@\f@\16@\u0542\13@\5@\u0544\n@\3@\3@\3@\3@\3@\3@\3@\7@\u054d\n@\f@\16"
      + "@\u0550\13@\5@\u0552\n@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u055c\n@\f@\16@\u055f"
      + "\13@\5@\u0561\n@\3@\3@\3@\3@\3@\3@\3@\7@\u056a\n@\f@\16@\u056d\13@\5@"
      + "\u056f\n@\3@\3@\3@\3@\3@\5@\u0576\n@\3@\3@\3@\3@\7@\u057c\n@\f@\16@\u057f"
      + "\13@\5@\u0581\n@\3@\3@\3@\3@\3@\7@\u0588\n@\f@\16@\u058b\13@\3@\7@\u058e"
      + "\n@\f@\16@\u0591\13@\3@\3@\3@\3@\3@\3@\7@\u0599\n@\f@\16@\u059c\13@\3"
      + "@\3@\5@\u05a0\n@\3A\3A\3A\3A\7A\u05a6\nA\fA\16A\u05a9\13A\5A\u05ab\nA"
      + "\3A\3A\3B\3B\7B\u05b1\nB\fB\16B\u05b4\13B\3C\3C\3D\3D\3D\5D\u05bb\nD\3"
      + "D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\7F\u05c8\nF\fF\16F\u05cb\13F\5F\u05cd"
      + "\nF\3F\3F\3G\3G\5G\u05d3\nG\3H\3H\3H\7H\u05d8\nH\fH\16H\u05db\13H\5H\u05dd"
      + "\nH\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\7J\u05ea\nJ\fJ\16J\u05ed\13J\3J\3"
      + "J\3K\3K\7K\u05f3\nK\fK\16K\u05f6\13K\3L\3L\3L\3L\3L\3L\3L\3L\6L\u0600"
      + "\nL\rL\16L\u0601\3L\3L\3L\3L\3L\6L\u0609\nL\rL\16L\u060a\3L\3L\3L\3L\5"
      + "L\u0611\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u061f\nM\3N\3N\5N\u0623"
      + "\nN\3N\3N\3N\3N\7N\u0629\nN\fN\16N\u062c\13N\5N\u062e\nN\3N\3N\5N\u0632"
      + "\nN\3N\3N\3N\3N\3N\7N\u0639\nN\fN\16N\u063c\13N\5N\u063e\nN\3N\3N\5N\u0642"
      + "\nN\3N\3N\3N\3N\3N\7N\u0649\nN\fN\16N\u064c\13N\3N\3N\3N\3N\3N\3N\7N\u0654"
      + "\nN\fN\16N\u0657\13N\3N\3N\3N\3N\3N\3N\3N\3N\6N\u0661\nN\rN\16N\u0662"
      + "\3N\3N\5N\u0667\nN\3O\3O\7O\u066b\nO\fO\16O\u066e\13O\3O\3O\3O\3O\5O\u0674"
      + "\nO\3O\7O\u0677\nO\fO\16O\u067a\13O\5O\u067c\nO\3P\3P\7P\u0680\nP\fP\16"
      + "P\u0683\13P\3P\2Q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"
      + "\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"
      + "\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\6"
      + "\4\2;;JL\5\2\5\5\66\66HH\3\2\37 \4\2\24\24,,\u0751\2\u00a0\3\2\2\2\4\u00a3"
      + "\3\2\2\2\6\u00a6\3\2\2\2\b\u00a9\3\2\2\2\n\u00ac\3\2\2\2\f\u00af\3\2\2"
      + "\2\16\u00b2\3\2\2\2\20\u00b5\3\2\2\2\22\u00b8\3\2\2\2\24\u00be\3\2\2\2"
      + "\26\u00c7\3\2\2\2\30\u00dc\3\2\2\2\32\u00e6\3\2\2\2\34\u00f0\3\2\2\2\36"
      + "\u00f2\3\2\2\2 \u0103\3\2\2\2\"\u010e\3\2\2\2$\u0123\3\2\2\2&\u012a\3"
      + "\2\2\2(\u0139\3\2\2\2*\u0144\3\2\2\2,\u014b\3\2\2\2.\u0162\3\2\2\2\60"
      + "\u016b\3\2\2\2\62\u0175\3\2\2\2\64\u0199\3\2\2\2\66\u019b\3\2\2\28\u01a2"
      + "\3\2\2\2:\u01c1\3\2\2\2<\u01c3\3\2\2\2>\u01ca\3\2\2\2@\u0215\3\2\2\2B"
      + "\u0217\3\2\2\2D\u0254\3\2\2\2F\u02e2\3\2\2\2H\u02f1\3\2\2\2J\u0306\3\2"
      + "\2\2L\u031d\3\2\2\2N\u0321\3\2\2\2P\u0323\3\2\2\2R\u0335\3\2\2\2T\u0338"
      + "\3\2\2\2V\u0355\3\2\2\2X\u0357\3\2\2\2Z\u035e\3\2\2\2\\\u03a2\3\2\2\2"
      + "^\u03b4\3\2\2\2`\u040f\3\2\2\2b\u0411\3\2\2\2d\u0419\3\2\2\2f\u0423\3"
      + "\2\2\2h\u0461\3\2\2\2j\u0463\3\2\2\2l\u046d\3\2\2\2n\u0479\3\2\2\2p\u0483"
      + "\3\2\2\2r\u048f\3\2\2\2t\u049b\3\2\2\2v\u04d0\3\2\2\2x\u04fb\3\2\2\2z"
      + "\u0506\3\2\2\2|\u0520\3\2\2\2~\u059f\3\2\2\2\u0080\u05a1\3\2\2\2\u0082"
      + "\u05ae\3\2\2\2\u0084\u05b5\3\2\2\2\u0086\u05b7\3\2\2\2\u0088\u05bf\3\2"
      + "\2\2\u008a\u05c3\3\2\2\2\u008c\u05d2\3\2\2\2\u008e\u05dc\3\2\2\2\u0090"
      + "\u05e1\3\2\2\2\u0092\u05e5\3\2\2\2\u0094\u05f0\3\2\2\2\u0096\u0610\3\2"
      + "\2\2\u0098\u061e\3\2\2\2\u009a\u0666\3\2\2\2\u009c\u067b\3\2\2\2\u009e"
      + "\u067d\3\2\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7\2\2\3\u00a2\3\3\2\2"
      + "\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\2\2\3\u00a5\5\3\2\2\2\u00a6\u00a7"
      + "\5P)\2\u00a7\u00a8\7\2\2\3\u00a8\7\3\2\2\2\u00a9\u00aa\5Z.\2\u00aa\u00ab"
      + "\7\2\2\3\u00ab\t\3\2\2\2\u00ac\u00ad\5\\/\2\u00ad\u00ae\7\2\2\3\u00ae"
      + "\13\3\2\2\2\u00af\u00b0\5`\61\2\u00b0\u00b1\7\2\2\3\u00b1\r\3\2\2\2\u00b2"
      + "\u00b3\5h\65\2\u00b3\u00b4\7\2\2\3\u00b4\17\3\2\2\2\u00b5\u00b6\5v<\2"
      + "\u00b6\u00b7\7\2\2\3\u00b7\21\3\2\2\2\u00b8\u00b9\5\u0094K\2\u00b9\u00ba"
      + "\7\2\2\3\u00ba\23\3\2\2\2\u00bb\u00bd\5\26\f\2\u00bc\u00bb\3\2\2\2\u00bd"
      + "\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c4\3\2"
      + "\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00c1\3\2\2\2\u00c3"
      + "\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\25\3\2\2"
      + "\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00ca\7;\2\2\u00c9\u00cb"
      + "\5\30\r\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\27\3\2\2\2\u00cc"
      + "\u00cd\7!\2\2\u00cd\u00d2\5\32\16\2\u00ce\u00cf\7\35\2\2\u00cf\u00d1\5"
      + "\32\16\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"
      + "\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\t"
      + "\2\2\u00d6\u00dd\3\2\2\2\u00d7\u00d9\5v<\2\u00d8\u00d7\3\2\2\2\u00d9\u00da"
      + "\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"
      + "\u00cc\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\31\3\2\2\2\u00de\u00df\7;\2\2"
      + "\u00df\u00e0\7\r\2\2\u00e0\u00e7\5\26\f\2\u00e1\u00e2\7;\2\2\u00e2\u00e3"
      + "\7\r\2\2\u00e3\u00e7\5v<\2\u00e4\u00e7\5\26\f\2\u00e5\u00e7\5v<\2\u00e6"
      + "\u00de\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2"
      + "\2\2\u00e7\33\3\2\2\2\u00e8\u00f1\5\36\20\2\u00e9\u00f1\5\"\22\2\u00ea"
      + "\u00f1\5,\27\2\u00eb\u00f1\58\35\2\u00ec\u00f1\5> \2\u00ed\u00f1\5B\""
      + "\2\u00ee\u00f1\5D#\2\u00ef\u00f1\5&\24\2\u00f0\u00e8\3\2\2\2\u00f0\u00e9"
      + "\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0"
      + "\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\35\3\2\2"
      + "\2\u00f2\u00f3\7\20\2\2\u00f3\u00f7\7;\2\2\u00f4\u00f6\5\26\f\2\u00f5"
      + "\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"
      + "\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe\7&\2\2\u00fb"
      + "\u00fd\5 \21\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"
      + "\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"
      + "\u0102\7\7\2\2\u0102\37\3\2\2\2\u0103\u0104\7;\2\2\u0104\u0105\7\r\2\2"
      + "\u0105\u0109\5\u0098M\2\u0106\u0108\5\26\f\2\u0107\u0106\3\2\2\2\u0108"
      + "\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"
      + "\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\64\2\2\u010d!\3\2\2\2\u010e\u010f"
      + "\7\31\2\2\u010f\u0113\7;\2\2\u0110\u0112\5\26\f\2\u0111\u0110\3\2\2\2"
      + "\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116"
      + "\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011f\7&\2\2\u0117\u011c\5$\23\2\u0118"
      + "\u0119\7\35\2\2\u0119\u011b\5$\23\2\u011a\u0118\3\2\2\2\u011b\u011e\3"
      + "\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e"
      + "\u011c\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"
      + "\2\2\u0121\u0122\7\7\2\2\u0122#\3\2\2\2\u0123\u0127\7;\2\2\u0124\u0126"
      + "\5\26\f\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2"
      + "\u0127\u0128\3\2\2\2\u0128%\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7"
      + "$\2\2\u012b\u012d\7;\2\2\u012c\u012e\5(\25\2\u012d\u012c\3\2\2\2\u012d"
      + "\u012e\3\2\2\2\u012e\u0132\3\2\2\2\u012f\u0131\5\26\f\2\u0130\u012f\3"
      + "\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"
      + "\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\r\2\2\u0136\u0137\5\u0094"
      + "K\2\u0137\u0138\7\64\2\2\u0138\'\3\2\2\2\u0139\u013a\7\5\2\2\u013a\u013f"
      + "\5*\26\2\u013b\u013c\7\35\2\2\u013c\u013e\5*\26\2\u013d\u013b\3\2\2\2"
      + "\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142"
      + "\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7\66\2\2\u0143)\3\2\2\2\u0144"
      + "\u0148\7;\2\2\u0145\u0147\5\26\f\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2"
      + "\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149+\3\2\2\2\u014a\u0148"
      + "\3\2\2\2\u014b\u014c\7\3\2\2\u014c\u014e\7;\2\2\u014d\u014f\5(\25\2\u014e"
      + "\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0153\3\2\2\2\u0150\u0152\5\26"
      + "\f\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"
      + "\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\5."
      + "\30\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"
      + "\u015d\7&\2\2\u015a\u015c\5\64\33\2\u015b\u015a\3\2\2\2\u015c\u015f\3"
      + "\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"
      + "\u015d\3\2\2\2\u0160\u0161\7\7\2\2\u0161-\3\2\2\2\u0162\u0163\7(\2\2\u0163"
      + "\u0168\5\60\31\2\u0164\u0165\7\35\2\2\u0165\u0167\5\60\31\2\u0166\u0164"
      + "\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"
      + "/\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\7;\2\2\u016c\u016e\5\62\32\2"
      + "\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0172\3\2\2\2\u016f\u0171"
      + "\5\26\f\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2"
      + "\u0172\u0173\3\2\2\2\u0173\61\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176"
      + "\7\5\2\2\u0176\u017b\5\u0094K\2\u0177\u0178\7\35\2\2\u0178\u017a\5\u0094"
      + "K\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"
      + "\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\66"
      + "\2\2\u017f\63\3\2\2\2\u0180\u0185\5\66\34\2\u0181\u0182\7\35\2\2\u0182"
      + "\u0184\5\66\34\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3"
      + "\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188"
      + "\u0189\7\"\2\2\u0189\u018a\5\u0094K\2\u018a\u018b\7\64\2\2\u018b\u019a"
      + "\3\2\2\2\u018c\u018e\5\u0094K\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2"
      + "\2\u018e\u018f\3\2\2\2\u018f\u0194\5\66\34\2\u0190\u0191\7\35\2\2\u0191"
      + "\u0193\5\66\34\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3"
      + "\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197"
      + "\u0198\7\64\2\2\u0198\u019a\3\2\2\2\u0199\u0180\3\2\2\2\u0199\u018d\3"
      + "\2\2\2\u019a\65\3\2\2\2\u019b\u019f\7;\2\2\u019c\u019e\5\26\f\2\u019d"
      + "\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"
      + "\2\2\u01a0\67\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\7\f\2\2\u01a3\u01a5"
      + "\5:\36\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"
      + "\u01a7\3\2\2\2\u01a79\3\2\2\2\u01a8\u01ad\5<\37\2\u01a9\u01aa\7\35\2\2"
      + "\u01aa\u01ac\5<\37\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab"
      + "\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"
      + "\u01b1\7\"\2\2\u01b1\u01b2\5\u0094K\2\u01b2\u01b3\7\64\2\2\u01b3\u01c2"
      + "\3\2\2\2\u01b4\u01b6\5\u0094K\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2"
      + "\2\u01b6\u01b7\3\2\2\2\u01b7\u01bc\5<\37\2\u01b8\u01b9\7\35\2\2\u01b9"
      + "\u01bb\5<\37\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2"
      + "\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"
      + "\u01c0\7\64\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01a8\3\2\2\2\u01c1\u01b5\3"
      + "\2\2\2\u01c2;\3\2\2\2\u01c3\u01c7\7:\2\2\u01c4\u01c6\5\26\f\2\u01c5\u01c4"
      + "\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"
      + "=\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\7/\2\2\u01cb\u01cd\5(\25\2\u01cc"
      + "\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u0200\3\2\2\2\u01ce\u01db\7;"
      + "\2\2\u01cf\u01d8\7!\2\2\u01d0\u01d5\5@!\2\u01d1\u01d2\7\35\2\2\u01d2\u01d4"
      + "\5@!\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"
      + "\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d0\3\2"
      + "\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\7\t\2\2\u01db"
      + "\u01cf\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7\""
      + "\2\2\u01de\u01e2\5\u0094K\2\u01df\u01e1\5\26\f\2\u01e0\u01df\3\2\2\2\u01e1"
      + "\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2"
      + "\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\5N(\2\u01e6\u0201\3\2\2\2\u01e7\u01e9"
      + "\5\u0094K\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2"
      + "\2\u01ea\u01f7\7;\2\2\u01eb\u01f4\7!\2\2\u01ec\u01f1\5@!\2\u01ed\u01ee"
      + "\7\35\2\2\u01ee\u01f0\5@!\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1"
      + "\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2"
      + "\2\2\u01f4\u01ec\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"
      + "\u01f8\7\t\2\2\u01f7\u01eb\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fc\3\2"
      + "\2\2\u01f9\u01fb\5\26\f\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc"
      + "\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2"
      + "\2\2\u01ff\u0201\5N(\2\u0200\u01ce\3\2\2\2\u0200\u01e8\3\2\2\2\u0201?"
      + "\3\2\2\2\u0202\u0206\7;\2\2\u0203\u0205\5\26\f\2\u0204\u0203\3\2\2\2\u0205"
      + "\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2"
      + "\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7\"\2\2\u020a\u0216\5\u0094K\2\u020b"
      + "\u020d\5\u0094K\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e"
      + "\3\2\2\2\u020e\u0212\7;\2\2\u020f\u0211\5\26\f\2\u0210\u020f\3\2\2\2\u0211"
      + "\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0216\3\2"
      + "\2\2\u0214\u0212\3\2\2\2\u0215\u0202\3\2\2\2\u0215\u020c\3\2\2\2\u0216"
      + "A\3\2\2\2\u0217\u0219\7\17\2\2\u0218\u021a\5(\25\2\u0219\u0218\3\2\2\2"
      + "\u0219\u021a\3\2\2\2\u021a\u0252\3\2\2\2\u021b\u0228\7;\2\2\u021c\u0225"
      + "\7!\2\2\u021d\u0222\5@!\2\u021e\u021f\7\35\2\2\u021f\u0221\5@!\2\u0220"
      + "\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2"
      + "\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u021d\3\2\2\2\u0225"
      + "\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\7\t\2\2\u0228\u021c\3\2"
      + "\2\2\u0228\u0229\3\2\2\2\u0229\u022d\3\2\2\2\u022a\u022c\5\26\f\2\u022b"
      + "\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2"
      + "\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7\"\2\2\u0231"
      + "\u0232\5\u0094K\2\u0232\u0233\7\r\2\2\u0233\u0234\5v<\2\u0234\u0235\7"
      + "\64\2\2\u0235\u0253\3\2\2\2\u0236\u0238\5\u0094K\2\u0237\u0236\3\2\2\2"
      + "\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0246\7;\2\2\u023a\u0243"
      + "\7!\2\2\u023b\u0240\5@!\2\u023c\u023d\7\35\2\2\u023d\u023f\5@!\2\u023e"
      + "\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2"
      + "\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u023b\3\2\2\2\u0243"
      + "\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\7\t\2\2\u0246\u023a\3\2"
      + "\2\2\u0246\u0247\3\2\2\2\u0247\u024b\3\2\2\2\u0248\u024a\5\26\f\2\u0249"
      + "\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2"
      + "\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u024f\7\r\2\2\u024f"
      + "\u0250\5v<\2\u0250\u0251\7\64\2\2\u0251\u0253\3\2\2\2\u0252\u021b\3\2"
      + "\2\2\u0252\u0237\3\2\2\2\u0253C\3\2\2\2\u0254\u0256\7\65\2\2\u0255\u0257"
      + "\5(\25\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258"
      + "\u025c\7;\2\2\u0259\u025b\5\26\f\2\u025a\u0259\3\2\2\2\u025b\u025e\3\2"
      + "\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e"
      + "\u025c\3\2\2\2\u025f\u0263\7&\2\2\u0260\u0262\5F$\2\u0261\u0260\3\2\2"
      + "\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266"
      + "\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7\7\2\2\u0267E\3\2\2\2\u0268"
      + "\u026a\7\61\2\2\u0269\u026b\5(\25\2\u026a\u0269\3\2\2\2\u026a\u026b\3"
      + "\2\2\2\u026b\u026c\3\2\2\2\u026c\u0270\7;\2\2\u026d\u026f\5\26\f\2\u026e"
      + "\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2"
      + "\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275\5.\30\2\u0274"
      + "\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u02e3\7\64"
      + "\2\2\u0277\u0279\7\63\2\2\u0278\u027a\5(\25\2\u0279\u0278\3\2\2\2\u0279"
      + "\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0281\7;\2\2\u027c\u027e\7!\2"
      + "\2\u027d\u027f\5H%\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280"
      + "\3\2\2\2\u0280\u0282\7\t\2\2\u0281\u027c\3\2\2\2\u0281\u0282\3\2\2\2\u0282"
      + "\u0286\3\2\2\2\u0283\u0285\5\26\f\2\u0284\u0283\3\2\2\2\u0285\u0288\3"
      + "\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288"
      + "\u0286\3\2\2\2\u0289\u02e3\7\64\2\2\u028a\u028c\7\36\2\2\u028b\u028d\5"
      + "(\25\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e"
      + "\u0294\7;\2\2\u028f\u0291\7!\2\2\u0290\u0292\5H%\2\u0291\u0290\3\2\2\2"
      + "\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\7\t\2\2\u0294\u028f"
      + "\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0299\3\2\2\2\u0296\u0298\5\26\f\2"
      + "\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a"
      + "\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7\"\2\2\u029d"
      + "\u029e\5\u0094K\2\u029e\u029f\7\64\2\2\u029f\u02e3\3\2\2\2\u02a0\u02a2"
      + "\7\36\2\2\u02a1\u02a3\5(\25\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2"
      + "\u02a3\u02a5\3\2\2\2\u02a4\u02a6\5\u0094K\2\u02a5\u02a4\3\2\2\2\u02a5"
      + "\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02ad\7;\2\2\u02a8\u02aa\7!\2"
      + "\2\u02a9\u02ab\5H%\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac"
      + "\3\2\2\2\u02ac\u02ae\7\t\2\2\u02ad\u02a8\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"
      + "\u02b2\3\2\2\2\u02af\u02b1\5\26\f\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3"
      + "\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4"
      + "\u02b2\3\2\2\2\u02b5\u02e3\7\64\2\2\u02b6\u02b8\79\2\2\u02b7\u02b9\5("
      + "\25\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"
      + "\u02c0\7;\2\2\u02bb\u02bd\7!\2\2\u02bc\u02be\5H%\2\u02bd\u02bc\3\2\2\2"
      + "\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\7\t\2\2\u02c0\u02bb"
      + "\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c5\3\2\2\2\u02c2\u02c4\5\26\f\2"
      + "\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6"
      + "\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7\"\2\2\u02c9"
      + "\u02ca\5\u0094K\2\u02ca\u02cb\7\64\2\2\u02cb\u02e3\3\2\2\2\u02cc\u02ce"
      + "\79\2\2\u02cd\u02cf\5(\25\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"
      + "\u02d1\3\2\2\2\u02d0\u02d2\5\u0094K\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2"
      + "\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d9\7;\2\2\u02d4\u02d6\7!\2\2\u02d5"
      + "\u02d7\5H%\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2"
      + "\2\u02d8\u02da\7\t\2\2\u02d9\u02d4\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02de"
      + "\3\2\2\2\u02db\u02dd\5\26\f\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2"
      + "\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de"
      + "\3\2\2\2\u02e1\u02e3\7\64\2\2\u02e2\u0268\3\2\2\2\u02e2\u0277\3\2\2\2"
      + "\u02e2\u028a\3\2\2\2\u02e2\u02a0\3\2\2\2\u02e2\u02b6\3\2\2\2\u02e2\u02cc"
      + "\3\2\2\2\u02e3G\3\2\2\2\u02e4\u02e9\5J&\2\u02e5\u02e6\7\35\2\2\u02e6\u02e8"
      + "\5J&\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9"
      + "\u02ea\3\2\2\2\u02ea\u02ee\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7\35"
      + "\2\2\u02ed\u02ef\5L\'\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"
      + "\u02f2\3\2\2\2\u02f0\u02f2\5L\'\2\u02f1\u02e4\3\2\2\2\u02f1\u02f0\3\2"
      + "\2\2\u02f2I\3\2\2\2\u02f3\u02f7\7;\2\2\u02f4\u02f6\5\26\f\2\u02f5\u02f4"
      + "\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"
      + "\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\7\"\2\2\u02fb\u0307\5\u0094"
      + "K\2\u02fc\u02fe\5\u0094K\2\u02fd\u02ff\7;\2\2\u02fe\u02fd\3\2\2\2\u02fe"
      + "\u02ff\3\2\2\2\u02ff\u0303\3\2\2\2\u0300\u0302\5\26\f\2\u0301\u0300\3"
      + "\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304"
      + "\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u02f3\3\2\2\2\u0306\u02fc\3\2"
      + "\2\2\u0307K\3\2\2\2\u0308\u0309\7;\2\2\u0309\u030d\7%\2\2\u030a\u030c"
      + "\5\26\f\2\u030b\u030a\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2"
      + "\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311"
      + "\7\"\2\2\u0311\u031e\5\u0094K\2\u0312\u0313\5\u0094K\2\u0313\u0315\7%"
      + "\2\2\u0314\u0316\7;\2\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316"
      + "\u031a\3\2\2\2\u0317\u0319\5\26\f\2\u0318\u0317\3\2\2\2\u0319\u031c\3"
      + "\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031e\3\2\2\2\u031c"
      + "\u031a\3\2\2\2\u031d\u0308\3\2\2\2\u031d\u0312\3\2\2\2\u031eM\3\2\2\2"
      + "\u031f\u0322\5P)\2\u0320\u0322\5R*\2\u0321\u031f\3\2\2\2\u0321\u0320\3"
      + "\2\2\2\u0322O\3\2\2\2\u0323\u0325\7&\2\2\u0324\u0326\5T+\2\u0325\u0324"
      + "\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u032a\3\2\2\2\u0327\u0329\5Z.\2\u0328"
      + "\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2"
      + "\2\2\u032b\u0330\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032f\5t;\2\u032e\u032d"
      + "\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"
      + "\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\7\7\2\2\u0334Q\3\2\2\2"
      + "\u0335\u0336\7\64\2\2\u0336S\3\2\2\2\u0337\u0339\5V,\2\u0338\u0337\3\2"
      + "\2\2\u0339\u033a\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b"
      + "U\3\2\2\2\u033c\u0341\5X-\2\u033d\u033e\7\35\2\2\u033e\u0340\5X-\2\u033f"
      + "\u033d\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2"
      + "\2\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0345\7\"\2\2\u0345"
      + "\u0346\5\u0094K\2\u0346\u0347\7\64\2\2\u0347\u0356\3\2\2\2\u0348\u034a"
      + "\5\u0094K\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2"
      + "\2\u034b\u0350\5X-\2\u034c\u034d\7\35\2\2\u034d\u034f\5X-\2\u034e\u034c"
      + "\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351"
      + "\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7\64\2\2\u0354\u0356\3"
      + "\2\2\2\u0355\u033c\3\2\2\2\u0355\u0349\3\2\2\2\u0356W\3\2\2\2\u0357\u035b"
      + "\7;\2\2\u0358\u035a\5\26\f\2\u0359\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b"
      + "\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035cY\3\2\2\2\u035d\u035b\3\2\2\2"
      + "\u035e\u0362\7<\2\2\u035f\u0361\5\26\f\2\u0360\u035f\3\2\2\2\u0361\u0364"
      + "\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u036d\3\2\2\2\u0364"
      + "\u0362\3\2\2\2\u0365\u036a\5\\/\2\u0366\u0367\7\27\2\2\u0367\u0369\5\\"
      + "/\2\u0368\u0366\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a"
      + "\u036b\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u0365\3\2"
      + "\2\2\u036d\u036e\3\2\2\2\u036e[\3\2\2\2\u036f\u0371\5^\60\2\u0370\u036f"
      + "\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u037c\7\22\2\2"
      + "\u0373\u0378\7;\2\2\u0374\u0375\7\35\2\2\u0375\u0377\7;\2\2\u0376\u0374"
      + "\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379"
      + "\u037b\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037d\7A\2\2\u037c\u0373\3\2"
      + "\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\7;\2\2\u037f"
      + "\u0383\5\u0080A\2\u0380\u0382\5\26\f\2\u0381\u0380\3\2\2\2\u0382\u0385"
      + "\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0388\3\2\2\2\u0385"
      + "\u0383\3\2\2\2\u0386\u0389\5j\66\2\u0387\u0389\7\64\2\2\u0388\u0386\3"
      + "\2\2\2\u0388\u0387\3\2\2\2\u0389\u038d\3\2\2\2\u038a\u038c\5\26\f\2\u038b"
      + "\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2"
      + "\2\2\u038e\u03a3\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0392\5^\60\2\u0391"
      + "\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0396\3\2\2\2\u0393\u0395\5`"
      + "\61\2\u0394\u0393\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396"
      + "\u0397\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039b\5h"
      + "\65\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039f\3\2\2\2\u039c"
      + "\u039e\5\26\f\2\u039d\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3"
      + "\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2"
      + "\u0370\3\2\2\2\u03a2\u0391\3\2\2\2\u03a3]\3\2\2\2\u03a4\u03a8\5v<\2\u03a5"
      + "\u03a7\5\26\f\2\u03a6\u03a5\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3"
      + "\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab"
      + "\u03ac\7\25\2\2\u03ac\u03b5\3\2\2\2\u03ad\u03b1\7*\2\2\u03ae\u03b0\5\26"
      + "\f\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"
      + "\u03b2\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03a4\3\2"
      + "\2\2\u03b4\u03ad\3\2\2\2\u03b5_\3\2\2\2\u03b6\u03b7\7\26\2\2\u03b7\u03ba"
      + "\5v<\2\u03b8\u03b9\7\35\2\2\u03b9\u03bb\5v<\2\u03ba\u03b8\3\2\2\2\u03ba"
      + "\u03bb\3\2\2\2\u03bb\u03bf\3\2\2\2\u03bc\u03be\5\26\f\2\u03bd\u03bc\3"
      + "\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0"
      + "\u03c2\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03c3\7\64\2\2\u03c3\u0410\3"
      + "\2\2\2\u03c4\u03c5\7\33\2\2\u03c5\u03c8\5v<\2\u03c6\u03c7\7\35\2\2\u03c7"
      + "\u03c9\5v<\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cd\3\2\2"
      + "\2\u03ca\u03cc\5\26\f\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd"
      + "\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03cd\3\2"
      + "\2\2\u03d0\u03d1\7\64\2\2\u03d1\u0410\3\2\2\2\u03d2\u03d3\7\n\2\2\u03d3"
      + "\u03d7\5v<\2\u03d4\u03d6\5\26\f\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9\3\2"
      + "\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9"
      + "\u03d7\3\2\2\2\u03da\u03db\7\64\2\2\u03db\u0410\3\2\2\2\u03dc\u03de\7"
      + "\62\2\2\u03dd\u03df\5\62\32\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2"
      + "\u03df\u03e0\3\2\2\2\u03e0\u03e5\7;\2\2\u03e1\u03e2\7\4\2\2\u03e2\u03e3"
      + "\5v<\2\u03e3\u03e4\7\32\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03e1\3\2\2\2\u03e5"
      + "\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03eb\5\u0080A\2\u03e8\u03ea"
      + "\5\26\f\2\u03e9\u03e8\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2"
      + "\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03ef"
      + "\7\64\2\2\u03ef\u0410\3\2\2\2\u03f0\u03f2\7;\2\2\u03f1\u03f3\5\62\32\2"
      + "\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f8"
      + "\5\u0080A\2\u03f5\u03f7\5\26\f\2\u03f6\u03f5\3\2\2\2\u03f7\u03fa\3\2\2"
      + "\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03f8"
      + "\3\2\2\2\u03fb\u03fc\7\64\2\2\u03fc\u0410\3\2\2\2\u03fd\u03fe\5b\62\2"
      + "\u03fe\u03ff\7A\2\2\u03ff\u0404\5f\64\2\u0400\u0401\7\35\2\2\u0401\u0403"
      + "\5f\64\2\u0402\u0400\3\2\2\2\u0403\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404"
      + "\u0405\3\2\2\2\u0405\u040a\3\2\2\2\u0406\u0404\3\2\2\2\u0407\u0409\5\26"
      + "\f\2\u0408\u0407\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a"
      + "\u040b\3\2\2\2\u040b\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u040e\7\64"
      + "\2\2\u040e\u0410\3\2\2\2\u040f\u03b6\3\2\2\2\u040f\u03c4\3\2\2\2\u040f"
      + "\u03d2\3\2\2\2\u040f\u03dc\3\2\2\2\u040f\u03f0\3\2\2\2\u040f\u03fd\3\2"
      + "\2\2\u0410a\3\2\2\2\u0411\u0416\5d\63\2\u0412\u0413\7\35\2\2\u0413\u0415"
      + "\5d\63\2\u0414\u0412\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416"
      + "\u0417\3\2\2\2\u0417c\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041d\5v<\2\u041a"
      + "\u041c\5\26\f\2\u041b\u041a\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3"
      + "\2\2\2\u041d\u041e\3\2\2\2\u041ee\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0422"
      + "\5\26\f\2\u0421\u0420\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2"
      + "\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427"
      + "\5v<\2\u0427g\3\2\2\2\u0428\u0462\5j\66\2\u0429\u0432\7\60\2\2\u042a\u042f"
      + "\5v<\2\u042b\u042c\7\35\2\2\u042c\u042e\5v<\2\u042d\u042b\3\2\2\2\u042e"
      + "\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0433\3\2"
      + "\2\2\u0431\u042f\3\2\2\2\u0432\u042a\3\2\2\2\u0432\u0433\3\2\2\2\u0433"
      + "\u0437\3\2\2\2\u0434\u0436\5\26\f\2\u0435\u0434\3\2\2\2\u0436\u0439\3"
      + "\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439"
      + "\u0437\3\2\2\2\u043a\u0462\7\64\2\2\u043b\u0440\5l\67\2\u043c\u043d\7"
      + "*\2\2\u043d\u043f\5l\67\2\u043e\u043c\3\2\2\2\u043f\u0442\3\2\2\2\u0440"
      + "\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2"
      + "\2\2\u0443\u0445\5n8\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0449"
      + "\3\2\2\2\u0446\u0448\5\26\f\2\u0447\u0446\3\2\2\2\u0448\u044b\3\2\2\2"
      + "\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b\u0449"
      + "\3\2\2\2\u044c\u044d\7\64\2\2\u044d\u0462\3\2\2\2\u044e\u044f\78\2\2\u044f"
      + "\u0453\5v<\2\u0450\u0452\5p9\2\u0451\u0450\3\2\2\2\u0452\u0455\3\2\2\2"
      + "\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453"
      + "\3\2\2\2\u0456\u0458\5r:\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458"
      + "\u045c\3\2\2\2\u0459\u045b\5\26\f\2\u045a\u0459\3\2\2\2\u045b\u045e\3"
      + "\2\2\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e"
      + "\u045c\3\2\2\2\u045f\u0460\7\64\2\2\u0460\u0462\3\2\2\2\u0461\u0428\3"
      + "\2\2\2\u0461\u0429\3\2\2\2\u0461\u043b\3\2\2\2\u0461\u044e\3\2\2\2\u0462"
      + "i\3\2\2\2\u0463\u0464\7\16\2\2\u0464\u0468\7;\2\2\u0465\u0467\5\26\f\2"
      + "\u0466\u0465\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469"
      + "\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u046c\7\64\2\2"
      + "\u046ck\3\2\2\2\u046d\u046e\7#\2\2\u046e\u046f\5v<\2\u046f\u0473\7\67"
      + "\2\2\u0470\u0472\5\26\f\2\u0471\u0470\3\2\2\2\u0472\u0475\3\2\2\2\u0473"
      + "\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0476\3\2\2\2\u0475\u0473\3\2"
      + "\2\2\u0476\u0477\7\16\2\2\u0477\u0478\7;\2\2\u0478m\3\2\2\2\u0479\u047d"
      + "\7*\2\2\u047a\u047c\5\26\f\2\u047b\u047a\3\2\2\2\u047c\u047f\3\2\2\2\u047d"
      + "\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0480\3\2\2\2\u047f\u047d\3\2"
      + "\2\2\u0480\u0481\7\16\2\2\u0481\u0482\7;\2\2\u0482o\3\2\2\2\u0483\u0484"
      + "\7\27\2\2\u0484\u0485\5\u0098M\2\u0485\u0489\7.\2\2\u0486\u0488\5\26\f"
      + "\2\u0487\u0486\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2\2\2\u0489\u048a"
      + "\3\2\2\2\u048a\u048c\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u048d\7\16\2\2"
      + "\u048d\u048e\7;\2\2\u048eq\3\2\2\2\u048f\u0490\7\27\2\2\u0490\u0491\7"
      + "*\2\2\u0491\u0495\7.\2\2\u0492\u0494\5\26\f\2\u0493\u0492\3\2\2\2\u0494"
      + "\u0497\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3\2"
      + "\2\2\u0497\u0495\3\2\2\2\u0498\u0499\7\16\2\2\u0499\u049a\7;\2\2\u049a"
      + "s\3\2\2\2\u049b\u049f\7)\2\2\u049c\u049e\5\26\f\2\u049d\u049c\3\2\2\2"
      + "\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04ad"
      + "\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u04a4\7;\2\2\u04a3\u04a2\3\2\2\2\u04a3"
      + "\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\7\"\2\2\u04a6\u04ae\5\u0094"
      + "K\2\u04a7\u04a9\5\u0094K\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"
      + "\u04ab\3\2\2\2\u04aa\u04ac\7;\2\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2"
      + "\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04a3\3\2\2\2\u04ad\u04a8\3\2\2\2\u04ae"
      + "\u04af\3\2\2\2\u04af\u04b0\7\13\2\2\u04b0\u04b1\7\4\2\2\u04b1\u04b2\7"
      + ";\2\2\u04b2\u04b3\7\30\2\2\u04b3\u04b4\7;\2\2\u04b4\u04b5\7\32\2\2\u04b5"
      + "\u04b6\5j\66\2\u04b6u\3\2\2\2\u04b7\u04b8\b<\1\2\u04b8\u04b9\7!\2\2\u04b9"
      + "\u04ba\5\u0094K\2\u04ba\u04bb\7\t\2\2\u04bb\u04bc\5v<\2\u04bc\u04d1\3"
      + "\2\2\2\u04bd\u04be\t\2\2\2\u04be\u04d1\5v<\2\u04bf\u04c3\5~@\2\u04c0\u04c2"
      + "\5|?\2\u04c1\u04c0\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c3"
      + "\u04c4\3\2\2\2\u04c4\u04d1\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c6\u04cb\5x"
      + "=\2\u04c7\u04c8\7*\2\2\u04c8\u04ca\5x=\2\u04c9\u04c7\3\2\2\2\u04ca\u04cd"
      + "\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd"
      + "\u04cb\3\2\2\2\u04ce\u04cf\5z>\2\u04cf\u04d1\3\2\2\2\u04d0\u04b7\3\2\2"
      + "\2\u04d0\u04bd\3\2\2\2\u04d0\u04bf\3\2\2\2\u04d0\u04c6\3\2\2\2\u04d1\u04f8"
      + "\3\2\2\2\u04d2\u04d3\6<\2\3\u04d3\u04d4\7;\2\2\u04d4\u04f7\5v<\2\u04d5"
      + "\u04d6\6<\3\3\u04d6\u04d7\7K\2\2\u04d7\u04f7\5v<\2\u04d8\u04d9\6<\4\3"
      + "\u04d9\u04da\7J\2\2\u04da\u04f7\5v<\2\u04db\u04dc\6<\5\3\u04dc\u04dd\7"
      + "I\2\2\u04dd\u04f7\5v<\2\u04de\u04df\6<\6\3\u04df\u04e0\t\3\2\2\u04e0\u04f7"
      + "\5v<\2\u04e1\u04e2\6<\7\3\u04e2\u04e3\7G\2\2\u04e3\u04f7\5v<\2\u04e4\u04e5"
      + "\6<\b\3\u04e5\u04e6\7D\2\2\u04e6\u04f7\5v<\2\u04e7\u04e8\6<\t\3\u04e8"
      + "\u04e9\7E\2\2\u04e9\u04f7\5v<\2\u04ea\u04eb\6<\n\3\u04eb\u04ec\7F\2\2"
      + "\u04ec\u04f7\5v<\2\u04ed\u04ee\6<\13\3\u04ee\u04ef\7B\2\2\u04ef\u04f7"
      + "\5v<\2\u04f0\u04f1\6<\f\3\u04f1\u04f2\7C\2\2\u04f2\u04f7\5v<\2\u04f3\u04f4"
      + "\6<\r\3\u04f4\u04f5\t\4\2\2\u04f5\u04f7\5v<\2\u04f6\u04d2\3\2\2\2\u04f6"
      + "\u04d5\3\2\2\2\u04f6\u04d8\3\2\2\2\u04f6\u04db\3\2\2\2\u04f6\u04de\3\2"
      + "\2\2\u04f6\u04e1\3\2\2\2\u04f6\u04e4\3\2\2\2\u04f6\u04e7\3\2\2\2\u04f6"
      + "\u04ea\3\2\2\2\u04f6\u04ed\3\2\2\2\u04f6\u04f0\3\2\2\2\u04f6\u04f3\3\2"
      + "\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"
      + "w\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04fc\7#\2\2\u04fc\u04fd\5v<\2\u04fd"
      + "\u0501\7\67\2\2\u04fe\u0500\5\26\f\2\u04ff\u04fe\3\2\2\2\u0500\u0503\3"
      + "\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3\2\2\2\u0503"
      + "\u0501\3\2\2\2\u0504\u0505\5v<\2\u0505y\3\2\2\2\u0506\u050a\7*\2\2\u0507"
      + "\u0509\5\26\f\2\u0508\u0507\3\2\2\2\u0509\u050c\3\2\2\2\u050a\u0508\3"
      + "\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u050a\3\2\2\2\u050d"
      + "\u050e\5v<\2\u050e{\3\2\2\2\u050f\u0510\7\4\2\2\u0510\u0515\5v<\2\u0511"
      + "\u0512\7\35\2\2\u0512\u0514\5v<\2\u0513\u0511\3\2\2\2\u0514\u0517\3\2"
      + "\2\2\u0515\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517"
      + "\u0515\3\2\2\2\u0518\u0519\7\32\2\2\u0519\u0521\3\2\2\2\u051a\u051b\7"
      + "-\2\2\u051b\u0521\7;\2\2\u051c\u051e\5\62\32\2\u051d\u051c\3\2\2\2\u051d"
      + "\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0521\5\u0080A\2\u0520\u050f"
      + "\3\2\2\2\u0520\u051a\3\2\2\2\u0520\u051d\3\2\2\2\u0521}\3\2\2\2\u0522"
      + "\u05a0\7;\2\2\u0523\u05a0\7:\2\2\u0524\u05a0\5\u0098M\2\u0525\u05a0\5"
      + "\u0080A\2\u0526\u0527\7\'\2\2\u0527\u052c\5\u0086D\2\u0528\u0529\7\35"
      + "\2\2\u0529\u052b\5\u0086D\2\u052a\u0528\3\2\2\2\u052b\u052e\3\2\2\2\u052c"
      + "\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2\2\u052e\u052c\3\2"
      + "\2\2\u052f\u0530\7\34\2\2\u0530\u0531\5v<\2\u0531\u05a0\3\2\2\2\u0532"
      + "\u0533\5\u0084C\2\u0533\u0534\7\4\2\2\u0534\u0535\5v<\2\u0535\u0536\7"
      + "\30\2\2\u0536\u0537\5v<\2\u0537\u0538\7\32\2\2\u0538\u05a0\3\2\2\2\u0539"
      + "\u053a\5\u0084C\2\u053a\u0543\7\4\2\2\u053b\u0540\5v<\2\u053c\u053d\7"
      + "\35\2\2\u053d\u053f\5v<\2\u053e\u053c\3\2\2\2\u053f\u0542\3\2\2\2\u0540"
      + "\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2"
      + "\2\2\u0543\u053b\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545"
      + "\u0546\7\32\2\2\u0546\u05a0\3\2\2\2\u0547\u0548\5\u0084C\2\u0548\u0551"
      + "\7&\2\2\u0549\u054e\5v<\2\u054a\u054b\7\35\2\2\u054b\u054d\5v<\2\u054c"
      + "\u054a\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2"
      + "\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u0549\3\2\2\2\u0551"
      + "\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\7\7\2\2\u0554\u05a0\3\2"
      + "\2\2\u0555\u0556\5\u0084C\2\u0556\u0560\7&\2\2\u0557\u0561\7\b\2\2\u0558"
      + "\u055d\5\u0088E\2\u0559\u055a\7\35\2\2\u055a\u055c\5\u0088E\2\u055b\u0559"
      + "\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e"
      + "\u0561\3\2\2\2\u055f\u055d\3\2\2\2\u0560\u0557\3\2\2\2\u0560\u0558\3\2"
      + "\2\2\u0561\u0562\3\2\2\2\u0562\u0563\7\7\2\2\u0563\u05a0\3\2\2\2\u0564"
      + "\u0565\5\u0084C\2\u0565\u056e\7\4\2\2\u0566\u056b\5\u008aF\2\u0567\u0568"
      + "\7\35\2\2\u0568\u056a\5\u008aF\2\u0569\u0567\3\2\2\2\u056a\u056d\3\2\2"
      + "\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b"
      + "\3\2\2\2\u056e\u0566\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570"
      + "\u0571\7\32\2\2\u0571\u05a0\3\2\2\2\u0572\u0573\5\u0084C\2\u0573\u0575"
      + "\7;\2\2\u0574\u0576\5\62\32\2\u0575\u0574\3\2\2\2\u0575\u0576\3\2\2\2"
      + "\u0576\u0577\3\2\2\2\u0577\u0580\7&\2\2\u0578\u057d\5\u0090I\2\u0579\u057a"
      + "\7\35\2\2\u057a\u057c\5\u0090I\2\u057b\u0579\3\2\2\2\u057c\u057f\3\2\2"
      + "\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d"
      + "\3\2\2\2\u0580\u0578\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582"
      + "\u0583\7\7\2\2\u0583\u05a0\3\2\2\2\u0584\u0585\5\u0084C\2\u0585\u0589"
      + "\5\u009aN\2\u0586\u0588\5\u0092J\2\u0587\u0586\3\2\2\2\u0588\u058b\3\2"
      + "\2\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058f\3\2\2\2\u058b"
      + "\u0589\3\2\2\2\u058c\u058e\5\u0096L\2\u058d\u058c\3\2\2\2\u058e\u0591"
      + "\3\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u05a0\3\2\2\2\u0591"
      + "\u058f\3\2\2\2\u0592\u0593\7,\2\2\u0593\u05a0\5\u0094K\2\u0594\u0595\7"
      + "&\2\2\u0595\u059a\5\u008eH\2\u0596\u0597\7\27\2\2\u0597\u0599\5\u008e"
      + "H\2\u0598\u0596\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a"
      + "\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u059a\3\2\2\2\u059d\u059e\7\7"
      + "\2\2\u059e\u05a0\3\2\2\2\u059f\u0522\3\2\2\2\u059f\u0523\3\2\2\2\u059f"
      + "\u0524\3\2\2\2\u059f\u0525\3\2\2\2\u059f\u0526\3\2\2\2\u059f\u0532\3\2"
      + "\2\2\u059f\u0539\3\2\2\2\u059f\u0547\3\2\2\2\u059f\u0555\3\2\2\2\u059f"
      + "\u0564\3\2\2\2\u059f\u0572\3\2\2\2\u059f\u0584\3\2\2\2\u059f\u0592\3\2"
      + "\2\2\u059f\u0594\3\2\2\2\u05a0\177\3\2\2\2\u05a1\u05aa\7!\2\2\u05a2\u05a7"
      + "\5\u0082B\2\u05a3\u05a4\7\35\2\2\u05a4\u05a6\5\u0082B\2\u05a5\u05a3\3"
      + "\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8"
      + "\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u05a2\3\2\2\2\u05aa\u05ab\3\2"
      + "\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\7\t\2\2\u05ad\u0081\3\2\2\2\u05ae"
      + "\u05b2\5v<\2\u05af\u05b1\5\26\f\2\u05b0\u05af\3\2\2\2\u05b1\u05b4\3\2"
      + "\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u0083\3\2\2\2\u05b4"
      + "\u05b2\3\2\2\2\u05b5\u05b6\t\5\2\2\u05b6\u0085\3\2\2\2\u05b7\u05ba\7;"
      + "\2\2\u05b8\u05b9\7\35\2\2\u05b9\u05bb\7;\2\2\u05ba\u05b8\3\2\2\2\u05ba"
      + "\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\7\r\2\2\u05bd\u05be\5v"
      + "<\2\u05be\u0087\3\2\2\2\u05bf\u05c0\5v<\2\u05c0\u05c1\7\b\2\2\u05c1\u05c2"
      + "\5v<\2\u05c2\u0089\3\2\2\2\u05c3\u05cc\7\4\2\2\u05c4\u05c9\5\u008cG\2"
      + "\u05c5\u05c6\7\35\2\2\u05c6\u05c8\5\u008cG\2\u05c7\u05c5\3\2\2\2\u05c8"
      + "\u05cb\3\2\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cd\3\2"
      + "\2\2\u05cb\u05c9\3\2\2\2\u05cc\u05c4\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"
      + "\u05ce\3\2\2\2\u05ce\u05cf\7\32\2\2\u05cf\u008b\3\2\2\2\u05d0\u05d3\5"
      + "\u008aF\2\u05d1\u05d3\5v<\2\u05d2\u05d0\3\2\2\2\u05d2\u05d1\3\2\2\2\u05d3"
      + "\u008d\3\2\2\2\u05d4\u05d9\5@!\2\u05d5\u05d6\7\35\2\2\u05d6\u05d8\5@!"
      + "\2\u05d7\u05d5\3\2\2\2\u05d8\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05da"
      + "\3\2\2\2\u05da\u05dd\3\2\2\2\u05db\u05d9\3\2\2\2\u05dc\u05d4\3\2\2\2\u05dc"
      + "\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\7.\2\2\u05df\u05e0\5v<"
      + "\2\u05e0\u008f\3\2\2\2\u05e1\u05e2\7;\2\2\u05e2\u05e3\7\r\2\2\u05e3\u05e4"
      + "\5v<\2\u05e4\u0091\3\2\2\2\u05e5\u05e6\7\4\2\2\u05e6\u05eb\5v<\2\u05e7"
      + "\u05e8\7\35\2\2\u05e8\u05ea\5v<\2\u05e9\u05e7\3\2\2\2\u05ea\u05ed\3\2"
      + "\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed"
      + "\u05eb\3\2\2\2\u05ee\u05ef\7\32\2\2\u05ef\u0093\3\2\2\2\u05f0\u05f4\5"
      + "\u009aN\2\u05f1\u05f3\5\u0096L\2\u05f2\u05f1\3\2\2\2\u05f3\u05f6\3\2\2"
      + "\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u0095\3\2\2\2\u05f6\u05f4"
      + "\3\2\2\2\u05f7\u05f8\7\4\2\2\u05f8\u0611\7\32\2\2\u05f9\u05fa\7\4\2\2"
      + "\u05fa\u05fb\5\u0098M\2\u05fb\u05fc\7\32\2\2\u05fc\u0611\3\2\2\2\u05fd"
      + "\u05ff\7\4\2\2\u05fe\u0600\7\35\2\2\u05ff\u05fe\3\2\2\2\u0600\u0601\3"
      + "\2\2\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\3\2\2\2\u0603"
      + "\u0611\7\32\2\2\u0604\u0605\7\4\2\2\u0605\u0608\5\u0098M\2\u0606\u0607"
      + "\7\35\2\2\u0607\u0609\5\u0098M\2\u0608\u0606\3\2\2\2\u0609\u060a\3\2\2"
      + "\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d"
      + "\7\32\2\2\u060d\u0611\3\2\2\2\u060e\u060f\7&\2\2\u060f\u0611\7\7\2\2\u0610"
      + "\u05f7\3\2\2\2\u0610\u05f9\3\2\2\2\u0610\u05fd\3\2\2\2\u0610\u0604\3\2"
      + "\2\2\u0610\u060e\3\2\2\2\u0611\u0097\3\2\2\2\u0612\u061f\7+\2\2\u0613"
      + "\u061f\7\6\2\2\u0614\u061f\7\21\2\2\u0615\u061f\7;\2\2\u0616\u061f\7R"
      + "\2\2\u0617\u061f\7M\2\2\u0618\u061f\7O\2\2\u0619\u061f\7N\2\2\u061a\u061f"
      + "\7P\2\2\u061b\u061f\7Q\2\2\u061c\u061f\7S\2\2\u061d\u061f\7=\2\2\u061e"
      + "\u0612\3\2\2\2\u061e\u0613\3\2\2\2\u061e\u0614\3\2\2\2\u061e\u0615\3\2"
      + "\2\2\u061e\u0616\3\2\2\2\u061e\u0617\3\2\2\2\u061e\u0618\3\2\2\2\u061e"
      + "\u0619\3\2\2\2\u061e\u061a\3\2\2\2\u061e\u061b\3\2\2\2\u061e\u061c\3\2"
      + "\2\2\u061e\u061d\3\2\2\2\u061f\u0099\3\2\2\2\u0620\u0622\7;\2\2\u0621"
      + "\u0623\5\62\32\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0667\3"
      + "\2\2\2\u0624\u062d\7!\2\2\u0625\u062a\5\u009cO\2\u0626\u0627\7\35\2\2"
      + "\u0627\u0629\5\u009cO\2\u0628\u0626\3\2\2\2\u0629\u062c\3\2\2\2\u062a"
      + "\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2"
      + "\2\2\u062d\u0625\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f"
      + "\u0631\7\b\2\2\u0630\u0632\5\u009eP\2\u0631\u0630\3\2\2\2\u0631\u0632"
      + "\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0667\7\t\2\2\u0634\u063d\7!\2\2\u0635"
      + "\u063a\5\u009cO\2\u0636\u0637\7\35\2\2\u0637\u0639\5\u009cO\2\u0638\u0636"
      + "\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063b"
      + "\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063d\u0635\3\2\2\2\u063d\u063e\3\2"
      + "\2\2\u063e\u063f\3\2\2\2\u063f\u0641\7\23\2\2\u0640\u0642\5\u009eP\2\u0641"
      + "\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0667\7\t"
      + "\2\2\u0644\u0645\7!\2\2\u0645\u064a\5\u009cO\2\u0646\u0647\7\35\2\2\u0647"
      + "\u0649\5\u009cO\2\u0648\u0646\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u0648"
      + "\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064d\3\2\2\2\u064c\u064a\3\2\2\2\u064d"
      + "\u064e\7\t\2\2\u064e\u0667\3\2\2\2\u064f\u0650\7&\2\2\u0650\u0655\5\u009c"
      + "O\2\u0651\u0652\7\35\2\2\u0652\u0654\5\u009cO\2\u0653\u0651\3\2\2\2\u0654"
      + "\u0657\3\2\2\2\u0655\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0658\3\2"
      + "\2\2\u0657\u0655\3\2\2\2\u0658\u0659\7\b\2\2\u0659\u065a\5\u009eP\2\u065a"
      + "\u065b\7\7\2\2\u065b\u0667\3\2\2\2\u065c\u065d\7&\2\2\u065d\u0660\5\u009c"
      + "O\2\u065e\u065f\7\35\2\2\u065f\u0661\5\u009cO\2\u0660\u065e\3\2\2\2\u0661"
      + "\u0662\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0664\3\2"
      + "\2\2\u0664\u0665\7\7\2\2\u0665\u0667\3\2\2\2\u0666\u0620\3\2\2\2\u0666"
      + "\u0624\3\2\2\2\u0666\u0634\3\2\2\2\u0666\u0644\3\2\2\2\u0666\u064f\3\2"
      + "\2\2\u0666\u065c\3\2\2\2\u0667\u009b\3\2\2\2\u0668\u066c\7;\2\2\u0669"
      + "\u066b\5\26\f\2\u066a\u0669\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a\3"
      + "\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\3\2\2\2\u066e\u066c\3\2\2\2\u066f"
      + "\u0670\7\"\2\2\u0670\u067c\5\u0094K\2\u0671\u0673\5\u0094K\2\u0672\u0674"
      + "\7;\2\2\u0673\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0678\3\2\2\2\u0675"
      + "\u0677\5\26\f\2\u0676\u0675\3\2\2\2\u0677\u067a\3\2\2\2\u0678\u0676\3"
      + "\2\2\2\u0678\u0679\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678\3\2\2\2\u067b"
      + "\u0668\3\2\2\2\u067b\u0671\3\2\2\2\u067c\u009d\3\2\2\2\u067d\u0681\5\u0094"
      + "K\2\u067e\u0680\5\26\f\2\u067f\u067e\3\2\2\2\u0680\u0683\3\2\2\2\u0681"
      + "\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u009f\3\2\2\2\u0683\u0681\3\2"
      + "\2\2\u00e2\u00be\u00c4\u00ca\u00d2\u00da\u00dc\u00e6\u00f0\u00f7\u00fe"
      + "\u0109\u0113\u011c\u011f\u0127\u012d\u0132\u013f\u0148\u014e\u0153\u0157"
      + "\u015d\u0168\u016d\u0172\u017b\u0185\u018d\u0194\u0199\u019f\u01a6\u01ad"
      + "\u01b5\u01bc\u01c1\u01c7\u01cc\u01d5\u01d8\u01db\u01e2\u01e8\u01f1\u01f4"
      + "\u01f7\u01fc\u0200\u0206\u020c\u0212\u0215\u0219\u0222\u0225\u0228\u022d"
      + "\u0237\u0240\u0243\u0246\u024b\u0252\u0256\u025c\u0263\u026a\u0270\u0274"
      + "\u0279\u027e\u0281\u0286\u028c\u0291\u0294\u0299\u02a2\u02a5\u02aa\u02ad"
      + "\u02b2\u02b8\u02bd\u02c0\u02c5\u02ce\u02d1\u02d6\u02d9\u02de\u02e2\u02e9"
      + "\u02ee\u02f1\u02f7\u02fe\u0303\u0306\u030d\u0315\u031a\u031d\u0321\u0325"
      + "\u032a\u0330\u033a\u0341\u0349\u0350\u0355\u035b\u0362\u036a\u036d\u0370"
      + "\u0378\u037c\u0383\u0388\u038d\u0391\u0396\u039a\u039f\u03a2\u03a8\u03b1"
      + "\u03b4\u03ba\u03bf\u03c8\u03cd\u03d7\u03de\u03e5\u03eb\u03f2\u03f8\u0404"
      + "\u040a\u040f\u0416\u041d\u0423\u042f\u0432\u0437\u0440\u0444\u0449\u0453"
      + "\u0457\u045c\u0461\u0468\u0473\u047d\u0489\u0495\u049f\u04a3\u04a8\u04ab"
      + "\u04ad\u04c3\u04cb\u04d0\u04f6\u04f8\u0501\u050a\u0515\u051d\u0520\u052c"
      + "\u0540\u0543\u054e\u0551\u055d\u0560\u056b\u056e\u0575\u057d\u0580\u0589"
      + "\u058f\u059a\u059f\u05a7\u05aa\u05b2\u05ba\u05c9\u05cc\u05d2\u05d9\u05dc"
      + "\u05eb\u05f4\u0601\u060a\u0610\u061e\u0622\u062a\u062d\u0631\u063a\u063d"
      + "\u0641\u064a\u0655\u0662\u0666\u066c\u0673\u0678\u067b\u0681";

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
    enterRule(_localctx, 94, Antlr4PilarParser.RULE_action);
    int _la;
    try {
      setState(1037);
      switch (getInterpreter().adaptivePredict(this._input, 143, this._ctx)) {
        case 1:
          _localctx = new AssertContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(948);
            match(20);
            setState(949);
            exp(0);
            setState(952);
            _la = this._input.LA(1);
            if (_la == 27) {
              {
                setState(950);
                match(27);
                setState(951);
                exp(0);
              }
            }

            setState(957);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(954);
                  annotation();
                }
              }
              setState(959);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(960);
            match(50);
          }
          break;

        case 2:
          _localctx = new AssumeContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(962);
            match(25);
            setState(963);
            exp(0);
            setState(966);
            _la = this._input.LA(1);
            if (_la == 27) {
              {
                setState(964);
                match(27);
                setState(965);
                exp(0);
              }
            }

            setState(971);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(968);
                  annotation();
                }
              }
              setState(973);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(974);
            match(50);
          }
          break;

        case 3:
          _localctx = new ThrowContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(976);
            match(8);
            setState(977);
            exp(0);
            setState(981);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(978);
                  annotation();
                }
              }
              setState(983);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(984);
            match(50);
          }
          break;

        case 4:
          _localctx = new StartContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(986);
            match(48);
            setState(988);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(987);
                typeTuple();
              }
            }

            setState(990);
            match(Antlr4PilarParser.ID);
            setState(995);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(991);
                match(2);
                setState(992);
                ((StartContext) _localctx).n = exp(0);
                setState(993);
                match(24);
              }
            }

            setState(997);
            tupleExp();
            setState(1001);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(998);
                  annotation();
                }
              }
              setState(1003);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1004);
            match(50);
          }
          break;

        case 5:
          _localctx = new ActionExtCallContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1006);
            match(Antlr4PilarParser.ID);
            setState(1008);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(1007);
                typeTuple();
              }
            }

            setState(1010);
            tupleExp();
            setState(1014);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1011);
                  annotation();
                }
              }
              setState(1016);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1017);
            match(50);
          }
          break;

        case 6:
          _localctx = new AssignContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(1019);
            lhss();
            setState(1020);
            match(Antlr4PilarParser.AssignOP);
            setState(1021);
            rhs();
            setState(1026);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(1022);
                  match(27);
                  setState(1023);
                  rhs();
                }
              }
              setState(1028);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1032);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1029);
                  annotation();
                }
              }
              setState(1034);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1035);
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
    enterRule(_localctx, 10, Antlr4PilarParser.RULE_actionFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(173);
        action();
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

  public final AnnExpContext annExp() throws RecognitionException {
    final AnnExpContext _localctx = new AnnExpContext(this._ctx, getState());
    enterRule(_localctx, 128, Antlr4PilarParser.RULE_annExp);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1452);
        exp(0);
        setState(1456);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1453);
              annotation();
            }
          }
          setState(1458);
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
    enterRule(_localctx, 156, Antlr4PilarParser.RULE_annotatedType);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1659);
        type();
        setState(1663);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1660);
              annotation();
            }
          }
          setState(1665);
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
    enterRule(_localctx, 20, Antlr4PilarParser.RULE_annotation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(197);
        match(9);
        setState(198);
        match(Antlr4PilarParser.ID);
        setState(200);
        switch (getInterpreter().adaptivePredict(this._input, 2, this._ctx)) {
          case 1: {
            setState(199);
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
        setState(161);
        annotation();
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

  public final AnnotationParamContext annotationParam()
      throws RecognitionException {
    AnnotationParamContext _localctx = new AnnotationParamContext(this._ctx,
        getState());
    enterRule(_localctx, 24, Antlr4PilarParser.RULE_annotationParam);
    try {
      setState(228);
      switch (getInterpreter().adaptivePredict(this._input, 6, this._ctx)) {
        case 1:
          _localctx = new AnnotationParamIAContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(220);
            match(Antlr4PilarParser.ID);
            setState(221);
            match(11);
            setState(222);
            annotation();
          }
          break;

        case 2:
          _localctx = new AnnotationParamIEContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(223);
            match(Antlr4PilarParser.ID);
            setState(224);
            match(11);
            setState(225);
            exp(0);
          }
          break;

        case 3:
          _localctx = new AnnotationParamAContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(226);
            annotation();
          }
          break;

        case 4:
          _localctx = new AnnotationParamEContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(227);
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
    enterRule(_localctx, 22, Antlr4PilarParser.RULE_annotationParams);
    int _la;
    try {
      int _alt;
      setState(218);
      switch (getInterpreter().adaptivePredict(this._input, 5, this._ctx)) {
        case 1:
          _localctx = new AnnotationParamsAContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(202);
            match(31);
            setState(203);
            annotationParam();
            setState(208);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(204);
                  match(27);
                  setState(205);
                  annotationParam();
                }
              }
              setState(210);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(211);
            match(7);
          }
          break;

        case 2:
          _localctx = new AnnotationParamsEContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(214);
            this._errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(this._input, 4, this._ctx);
            do {
              switch (_alt) {
                case 1: {
                  {
                    setState(213);
                    exp(0);
                  }
                }
                  break;
                default:
                  throw new NoViableAltException(this);
              }
              setState(216);
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
    enterRule(_localctx, 152, Antlr4PilarParser.RULE_baseType);
    int _la;
    try {
      setState(1636);
      switch (getInterpreter().adaptivePredict(this._input, 218, this._ctx)) {
        case 1:
          _localctx = new NamedTypeContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1566);
            match(Antlr4PilarParser.ID);
            setState(1568);
            switch (getInterpreter().adaptivePredict(
                this._input,
                208,
                this._ctx)) {
              case 1: {
                setState(1567);
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
            setState(1570);
            match(31);
            setState(1579);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(1571);
                typeParam();
                setState(1576);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(1572);
                      match(27);
                      setState(1573);
                      typeParam();
                    }
                  }
                  setState(1578);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1581);
            match(6);
            setState(1583);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(1582);
                annotatedType();
              }
            }

            setState(1585);
            match(7);
          }
          break;

        case 3:
          _localctx = new ProcedureTypeContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1586);
            match(31);
            setState(1595);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(1587);
                typeParam();
                setState(1592);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(1588);
                      match(27);
                      setState(1589);
                      typeParam();
                    }
                  }
                  setState(1594);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1597);
            match(17);
            setState(1599);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(1598);
                annotatedType();
              }
            }

            setState(1601);
            match(7);
          }
          break;

        case 4:
          _localctx = new TupleTypeContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1602);
            match(31);
            setState(1603);
            typeParam();
            setState(1608);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(1604);
                  match(27);
                  setState(1605);
                  typeParam();
                }
              }
              setState(1610);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1611);
            match(7);
          }
          break;

        case 5:
          _localctx = new MapTypeContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1613);
            match(36);
            setState(1614);
            typeParam();
            setState(1619);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(1615);
                  match(27);
                  setState(1616);
                  typeParam();
                }
              }
              setState(1621);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1622);
            match(6);
            setState(1623);
            annotatedType();
            setState(1624);
            match(5);
          }
          break;

        case 6:
          _localctx = new RelationTypeContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(1626);
            match(36);
            setState(1627);
            typeParam();
            setState(1630);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            do {
              {
                {
                  setState(1628);
                  match(27);
                  setState(1629);
                  typeParam();
                }
              }
              setState(1632);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            } while (_la == 27);
            setState(1634);
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
    enterRule(_localctx, 132, Antlr4PilarParser.RULE_binding);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1461);
        match(Antlr4PilarParser.ID);
        setState(1464);
        _la = this._input.LA(1);
        if (_la == 27) {
          {
            setState(1462);
            match(27);
            setState(1463);
            match(Antlr4PilarParser.ID);
          }
        }

        setState(1466);
        match(11);
        setState(1467);
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
    final BodyContext _localctx = new BodyContext(this._ctx, getState());
    enterRule(_localctx, 76, Antlr4PilarParser.RULE_body);
    try {
      setState(799);
      switch (this._input.LA(1)) {
        case 36:
          enterOuterAlt(_localctx, 1);
          {
            setState(797);
            implementedBody();
          }
          break;
        case 50:
          enterOuterAlt(_localctx, 2);
          {
            setState(798);
            emptyBody();
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

  public final BodyFileContext bodyFile() throws RecognitionException {
    final BodyFileContext _localctx = new BodyFileContext(this._ctx, getState());
    enterRule(_localctx, 4, Antlr4PilarParser.RULE_bodyFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(164);
        implementedBody();
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

  public final CatchClauseContext catchClause() throws RecognitionException {
    final CatchClauseContext _localctx = new CatchClauseContext(this._ctx,
        getState());
    enterRule(_localctx, 114, Antlr4PilarParser.RULE_catchClause);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1177);
        match(39);
        setState(1181);
        this._errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(this._input, 162, this._ctx);
        while ((_alt != 2) && (_alt != -1)) {
          if (_alt == 1) {
            {
              {
                setState(1178);
                annotation();
              }
            }
          }
          setState(1183);
          this._errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(this._input, 162, this._ctx);
        }
        setState(1195);
        switch (getInterpreter().adaptivePredict(this._input, 166, this._ctx)) {
          case 1: {
            setState(1185);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(1184);
                _localctx.var = match(Antlr4PilarParser.ID);
              }
            }

            setState(1187);
            match(32);
            setState(1188);
            type();
          }
            break;

          case 2: {
            setState(1190);
            switch (getInterpreter().adaptivePredict(
                this._input,
                164,
                this._ctx)) {
              case 1: {
                setState(1189);
                type();
              }
                break;
            }
            setState(1193);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(1192);
                _localctx.var = match(Antlr4PilarParser.ID);
              }
            }

          }
            break;
        }
        setState(1197);
        match(9);
        setState(1198);
        match(2);
        setState(1199);
        _localctx.from = match(Antlr4PilarParser.ID);
        setState(1200);
        match(22);
        setState(1201);
        _localctx.to = match(Antlr4PilarParser.ID);
        setState(1202);
        match(24);
        setState(1203);
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
    enterRule(_localctx, 150, Antlr4PilarParser.RULE_constant);
    try {
      setState(1564);
      switch (this._input.LA(1)) {
        case 41:
          _localctx = new TrueConstantContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1552);
            match(41);
          }
          break;
        case 4:
          _localctx = new FalseConstantContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1553);
            match(4);
          }
          break;
        case 15:
          _localctx = new NullConstantContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1554);
            match(15);
          }
          break;
        case ID:
          _localctx = new IdConstantContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1555);
            match(Antlr4PilarParser.ID);
          }
          break;
        case CHAR:
          _localctx = new CharConstantContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1556);
            match(Antlr4PilarParser.CHAR);
          }
          break;
        case HEX:
          _localctx = new HexConstantContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(1557);
            match(Antlr4PilarParser.HEX);
          }
          break;
        case OCT:
          _localctx = new OctConstantContext(_localctx);
          enterOuterAlt(_localctx, 7);
          {
            setState(1558);
            match(Antlr4PilarParser.OCT);
          }
          break;
        case DEC:
          _localctx = new DecConstantContext(_localctx);
          enterOuterAlt(_localctx, 8);
          {
            setState(1559);
            match(Antlr4PilarParser.DEC);
          }
          break;
        case BIN:
          _localctx = new BinConstantContext(_localctx);
          enterOuterAlt(_localctx, 9);
          {
            setState(1560);
            match(Antlr4PilarParser.BIN);
          }
          break;
        case FLOAT:
          _localctx = new FloatConstantContext(_localctx);
          enterOuterAlt(_localctx, 10);
          {
            setState(1561);
            match(Antlr4PilarParser.FLOAT);
          }
          break;
        case STRING:
          _localctx = new StringConstantContext(_localctx);
          enterOuterAlt(_localctx, 11);
          {
            setState(1562);
            match(Antlr4PilarParser.STRING);
          }
          break;
        case MSTRING:
          _localctx = new MultilineStringConstantContext(_localctx);
          enterOuterAlt(_localctx, 12);
          {
            setState(1563);
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
    enterRule(_localctx, 28, Antlr4PilarParser.RULE_constDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(240);
        match(14);
        setState(241);
        match(Antlr4PilarParser.ID);
        setState(245);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(242);
              annotation();
            }
          }
          setState(247);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(248);
        match(36);
        setState(252);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == Antlr4PilarParser.ID) {
          {
            {
              setState(249);
              constElement();
            }
          }
          setState(254);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(255);
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
    enterRule(_localctx, 30, Antlr4PilarParser.RULE_constElement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(257);
        match(Antlr4PilarParser.ID);
        setState(258);
        match(11);
        setState(259);
        constant();
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

  public final EmptyBodyContext emptyBody() throws RecognitionException {
    final EmptyBodyContext _localctx = new EmptyBodyContext(this._ctx,
        getState());
    enterRule(_localctx, 80, Antlr4PilarParser.RULE_emptyBody);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(819);
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
    enterRule(_localctx, 32, Antlr4PilarParser.RULE_enumDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(268);
        match(23);
        setState(269);
        match(Antlr4PilarParser.ID);
        setState(273);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(270);
              annotation();
            }
          }
          setState(275);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(276);
        match(36);
        setState(285);
        _la = this._input.LA(1);
        if (_la == Antlr4PilarParser.ID) {
          {
            setState(277);
            enumElement();
            setState(282);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(278);
                  match(27);
                  setState(279);
                  enumElement();
                }
              }
              setState(284);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
        }

        setState(287);
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
    enterRule(_localctx, 34, Antlr4PilarParser.RULE_enumElement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(289);
        match(Antlr4PilarParser.ID);
        setState(293);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(290);
              annotation();
            }
          }
          setState(295);
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
    final int _startState = 116;
    enterRecursionRule(_localctx, Antlr4PilarParser.RULE_exp);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1230);
        switch (getInterpreter().adaptivePredict(this._input, 169, this._ctx)) {
          case 1: {
            _localctx = new CastExpContext(_localctx);
            this._ctx = _localctx;
            setState(1206);
            match(31);
            setState(1207);
            type();
            setState(1208);
            match(7);
            setState(1209);
            exp(15);
          }
            break;

          case 2: {
            _localctx = new UnaryExpContext(_localctx);
            this._ctx = _localctx;
            setState(1211);
            ((UnaryExpContext) _localctx).op = this._input.LT(1);
            _la = this._input.LA(1);
            if (!((((((_la - 57)) & ~0x3f) == 0) && (((1L << (_la - 57)) & ((1L << (Antlr4PilarParser.ID - 57))
                | (1L << (Antlr4PilarParser.AddOP - 57))
                | (1L << (Antlr4PilarParser.MulOP - 57)) | (1L << (Antlr4PilarParser.UnaryOP - 57)))) != 0)))) {
              ((UnaryExpContext) _localctx).op = this._errHandler
                  .recoverInline(this);
            }
            consume();
            setState(1212);
            exp(14);
          }
            break;

          case 3: {
            _localctx = new PrimaryExpContext(_localctx);
            this._ctx = _localctx;
            setState(1213);
            primary();
            setState(1217);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 167, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1214);
                    primarySuffix();
                  }
                }
              }
              setState(1219);
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
            setState(1220);
            ifThenExp();
            setState(1225);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 168, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1221);
                    match(40);
                    setState(1222);
                    ifThenExp();
                  }
                }
              }
              setState(1227);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  168,
                  this._ctx);
            }
            setState(1228);
            ifElseExp();
          }
            break;
        }
        this._ctx.stop = this._input.LT(-1);
        setState(1270);
        this._errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(this._input, 171, this._ctx);
        while ((_alt != 2) && (_alt != -1)) {
          if (_alt == 1) {
            if (this._parseListeners != null) {
              triggerExitRuleEvent();
            }
            {
              setState(1268);
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
                  setState(1232);
                  if (!(13 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "13 >= $_p");
                  }
                  setState(1233);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.ID);
                  setState(1234);
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
                  setState(1235);
                  if (!(12 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "12 >= $_p");
                  }
                  setState(1236);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.MulOP);
                  setState(1237);
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
                  setState(1238);
                  if (!(11 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "11 >= $_p");
                  }
                  setState(1239);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.AddOP);
                  setState(1240);
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
                  setState(1241);
                  if (!(10 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "10 >= $_p");
                  }
                  setState(1242);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.ShiftOP);
                  setState(1243);
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
                  setState(1244);
                  if (!(9 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "9 >= $_p");
                  }
                  setState(1245);
                  ((BinaryExpContext) _localctx).op = this._input.LT(1);
                  _la = this._input.LA(1);
                  if (!((_la == 3) || (_la == 52) || (_la == Antlr4PilarParser.RelOP))) {
                    ((BinaryExpContext) _localctx).op = this._errHandler
                        .recoverInline(this);
                  }
                  consume();
                  setState(1246);
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
                  setState(1247);
                  if (!(8 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "8 >= $_p");
                  }
                  setState(1248);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.EqOP);
                  setState(1249);
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
                  setState(1250);
                  if (!(7 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "7 >= $_p");
                  }
                  setState(1251);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.AndOP);
                  setState(1252);
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
                  setState(1253);
                  if (!(6 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "6 >= $_p");
                  }
                  setState(1254);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.XorOP);
                  setState(1255);
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
                  setState(1256);
                  if (!(5 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "5 >= $_p");
                  }
                  setState(1257);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.OrOP);
                  setState(1258);
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
                  setState(1259);
                  if (!(4 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "4 >= $_p");
                  }
                  setState(1260);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.CondAndOP);
                  setState(1261);
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
                  setState(1262);
                  if (!(3 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "3 >= $_p");
                  }
                  setState(1263);
                  ((BinaryExpContext) _localctx).op = match(Antlr4PilarParser.CondOrOP);
                  setState(1264);
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
                  setState(1265);
                  if (!(2 >= _localctx._p)) {
                    throw new FailedPredicateException(this, "2 >= $_p");
                  }
                  setState(1266);
                  ((BinaryExpContext) _localctx).op = this._input.LT(1);
                  _la = this._input.LA(1);
                  if (!((_la == 29) || (_la == 30))) {
                    ((BinaryExpContext) _localctx).op = this._errHandler
                        .recoverInline(this);
                  }
                  consume();
                  setState(1267);
                  exp(3);
                }
                  break;
              }
            }
          }
          setState(1272);
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
    enterRule(_localctx, 14, Antlr4PilarParser.RULE_expFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(179);
        exp(0);
        setState(180);
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
    enterRule(_localctx, 66, Antlr4PilarParser.RULE_extDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(594);
        match(51);
        setState(596);
        _la = this._input.LA(1);
        if (_la == 3) {
          {
            setState(595);
            typeVarTuple();
          }
        }

        setState(598);
        match(Antlr4PilarParser.ID);
        setState(602);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(599);
              annotation();
            }
          }
          setState(604);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(605);
        match(36);
        setState(609);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 28)
            | (1L << 47) | (1L << 49) | (1L << 55))) != 0))) {
          {
            {
              setState(606);
              extElement();
            }
          }
          setState(611);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(612);
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
    enterRule(_localctx, 68, Antlr4PilarParser.RULE_extElement);
    int _la;
    try {
      setState(736);
      switch (getInterpreter().adaptivePredict(this._input, 92, this._ctx)) {
        case 1:
          _localctx = new TypeExtensionContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(614);
            match(47);
            setState(616);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(615);
                typeVarTuple();
              }
            }

            setState(618);
            match(Antlr4PilarParser.ID);
            setState(622);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(619);
                  annotation();
                }
              }
              setState(624);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(626);
            _la = this._input.LA(1);
            if (_la == 38) {
              {
                setState(625);
                extendClauses();
              }
            }

            setState(628);
            match(50);
          }
          break;

        case 2:
          _localctx = new ActionExtensionContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(629);
            match(49);
            setState(631);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(630);
                typeVarTuple();
              }
            }

            setState(633);
            match(Antlr4PilarParser.ID);
            setState(639);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(634);
                match(31);
                setState(636);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(635);
                    extParams();
                  }
                }

                setState(638);
                match(7);
              }
            }

            setState(644);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(641);
                  annotation();
                }
              }
              setState(646);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(647);
            match(50);
          }
          break;

        case 3:
          _localctx = new ExpExtensionContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(648);
            match(28);
            setState(650);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(649);
                typeVarTuple();
              }
            }

            setState(652);
            match(Antlr4PilarParser.ID);
            setState(658);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(653);
                match(31);
                setState(655);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(654);
                    extParams();
                  }
                }

                setState(657);
                match(7);
              }
            }

            setState(663);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(660);
                  annotation();
                }
              }
              setState(665);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(666);
            match(32);
            setState(667);
            type();
            setState(668);
            match(50);
          }
          break;

        case 4:
          _localctx = new ExpExtensionContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(670);
            match(28);
            setState(672);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(671);
                typeVarTuple();
              }
            }

            setState(675);
            switch (getInterpreter()
                .adaptivePredict(this._input, 79, this._ctx)) {
              case 1: {
                setState(674);
                type();
              }
                break;
            }
            setState(677);
            match(Antlr4PilarParser.ID);
            setState(683);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(678);
                match(31);
                setState(680);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(679);
                    extParams();
                  }
                }

                setState(682);
                match(7);
              }
            }

            setState(688);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(685);
                  annotation();
                }
              }
              setState(690);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(691);
            match(50);
          }
          break;

        case 5:
          _localctx = new ProcedureExtensionContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(692);
            match(55);
            setState(694);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(693);
                typeVarTuple();
              }
            }

            setState(696);
            match(Antlr4PilarParser.ID);
            setState(702);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(697);
                match(31);
                setState(699);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(698);
                    extParams();
                  }
                }

                setState(701);
                match(7);
              }
            }

            setState(707);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(704);
                  annotation();
                }
              }
              setState(709);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(710);
            match(32);
            setState(711);
            type();
            setState(712);
            match(50);
          }
          break;

        case 6:
          _localctx = new ProcedureExtensionContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(714);
            match(55);
            setState(716);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(715);
                typeVarTuple();
              }
            }

            setState(719);
            switch (getInterpreter()
                .adaptivePredict(this._input, 88, this._ctx)) {
              case 1: {
                setState(718);
                type();
              }
                break;
            }
            setState(721);
            match(Antlr4PilarParser.ID);
            setState(727);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(722);
                match(31);
                setState(724);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(723);
                    extParams();
                  }
                }

                setState(726);
                match(7);
              }
            }

            setState(732);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(729);
                  annotation();
                }
              }
              setState(734);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(735);
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
    enterRule(_localctx, 46, Antlr4PilarParser.RULE_extendClause);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(361);
        match(Antlr4PilarParser.ID);
        setState(363);
        _la = this._input.LA(1);
        if (_la == 3) {
          {
            setState(362);
            typeTuple();
          }
        }

        setState(368);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(365);
              annotation();
            }
          }
          setState(370);
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
    enterRule(_localctx, 44, Antlr4PilarParser.RULE_extendClauses);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(352);
        match(38);
        setState(353);
        extendClause();
        setState(358);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 27) {
          {
            {
              setState(354);
              match(27);
              setState(355);
              extendClause();
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

  public final ExtParamContext extParam() throws RecognitionException {
    final ExtParamContext _localctx = new ExtParamContext(this._ctx, getState());
    enterRule(_localctx, 72, Antlr4PilarParser.RULE_extParam);
    int _la;
    try {
      setState(772);
      switch (getInterpreter().adaptivePredict(this._input, 99, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(753);
            match(Antlr4PilarParser.ID);
            setState(757);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(754);
                  annotation();
                }
              }
              setState(759);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(760);
            match(32);
            setState(761);
            type();
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(762);
            type();
            setState(764);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(763);
                match(Antlr4PilarParser.ID);
              }
            }

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
    enterRule(_localctx, 70, Antlr4PilarParser.RULE_extParams);
    int _la;
    try {
      int _alt;
      setState(751);
      switch (getInterpreter().adaptivePredict(this._input, 95, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(738);
            extParam();
            setState(743);
            this._errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(this._input, 93, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(739);
                    match(27);
                    setState(740);
                    extParam();
                  }
                }
              }
              setState(745);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  93,
                  this._ctx);
            }
            setState(748);
            _la = this._input.LA(1);
            if (_la == 27) {
              {
                setState(746);
                match(27);
                setState(747);
                extParamVariable();
              }
            }

          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(750);
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
    enterRule(_localctx, 74, Antlr4PilarParser.RULE_extParamVariable);
    int _la;
    try {
      setState(795);
      switch (getInterpreter().adaptivePredict(this._input, 103, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(774);
            match(Antlr4PilarParser.ID);
            setState(775);
            match(35);
            setState(779);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(776);
                  annotation();
                }
              }
              setState(781);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(782);
            match(32);
            setState(783);
            type();
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(784);
            type();
            setState(785);
            match(35);
            setState(787);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(786);
                match(Antlr4PilarParser.ID);
              }
            }

            setState(792);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(789);
                  annotation();
                }
              }
              setState(794);
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
    enterRule(_localctx, 50, Antlr4PilarParser.RULE_field);
    int _la;
    try {
      setState(407);
      switch (getInterpreter().adaptivePredict(this._input, 30, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(382);
            fieldFragment();
            setState(387);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(383);
                  match(27);
                  setState(384);
                  fieldFragment();
                }
              }
              setState(389);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(390);
            match(32);
            setState(391);
            type();
            setState(392);
            match(50);
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(395);
            switch (getInterpreter()
                .adaptivePredict(this._input, 28, this._ctx)) {
              case 1: {
                setState(394);
                type();
              }
                break;
            }
            setState(397);
            fieldFragment();
            setState(402);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(398);
                  match(27);
                  setState(399);
                  fieldFragment();
                }
              }
              setState(404);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(405);
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
    enterRule(_localctx, 52, Antlr4PilarParser.RULE_fieldFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(409);
        match(Antlr4PilarParser.ID);
        setState(413);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(410);
              annotation();
            }
          }
          setState(415);
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
    enterRule(_localctx, 142, Antlr4PilarParser.RULE_fieldInit);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1503);
        match(Antlr4PilarParser.ID);
        setState(1504);
        match(11);
        setState(1505);
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
    enterRule(_localctx, 64, Antlr4PilarParser.RULE_funDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(533);
        match(13);
        setState(535);
        _la = this._input.LA(1);
        if (_la == 3) {
          {
            setState(534);
            typeVarTuple();
          }
        }

        setState(592);
        switch (getInterpreter().adaptivePredict(this._input, 63, this._ctx)) {
          case 1: {
            setState(537);
            match(Antlr4PilarParser.ID);
            setState(550);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(538);
                match(31);
                setState(547);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(539);
                    paramVar();
                    setState(544);
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    while (_la == 27) {
                      {
                        {
                          setState(540);
                          match(27);
                          setState(541);
                          paramVar();
                        }
                      }
                      setState(546);
                      this._errHandler.sync(this);
                      _la = this._input.LA(1);
                    }
                  }
                }

                setState(549);
                match(7);
              }
            }

            setState(555);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(552);
                  annotation();
                }
              }
              setState(557);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(558);
            match(32);
            setState(559);
            type();
            setState(560);
            match(11);
            setState(561);
            exp(0);
            setState(562);
            match(50);
          }
            break;

          case 2: {
            setState(565);
            switch (getInterpreter()
                .adaptivePredict(this._input, 58, this._ctx)) {
              case 1: {
                setState(564);
                type();
              }
                break;
            }
            setState(567);
            match(Antlr4PilarParser.ID);
            setState(580);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(568);
                match(31);
                setState(577);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(569);
                    paramVar();
                    setState(574);
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    while (_la == 27) {
                      {
                        {
                          setState(570);
                          match(27);
                          setState(571);
                          paramVar();
                        }
                      }
                      setState(576);
                      this._errHandler.sync(this);
                      _la = this._input.LA(1);
                    }
                  }
                }

                setState(579);
                match(7);
              }
            }

            setState(585);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(582);
                  annotation();
                }
              }
              setState(587);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(588);
            match(11);
            setState(589);
            exp(0);
            setState(590);
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
    enterRule(_localctx, 56, Antlr4PilarParser.RULE_globalVarDeclaration);
    int _la;
    try {
      setState(447);
      switch (getInterpreter().adaptivePredict(this._input, 36, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(422);
            globalVarFragment();
            setState(427);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(423);
                  match(27);
                  setState(424);
                  globalVarFragment();
                }
              }
              setState(429);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(430);
            match(32);
            setState(431);
            type();
            setState(432);
            match(50);
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(435);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
              {
                setState(434);
                type();
              }
            }

            setState(437);
            globalVarFragment();
            setState(442);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(438);
                  match(27);
                  setState(439);
                  globalVarFragment();
                }
              }
              setState(444);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(445);
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
    enterRule(_localctx, 58, Antlr4PilarParser.RULE_globalVarFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(449);
        match(Antlr4PilarParser.GID);
        setState(453);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(450);
              annotation();
            }
          }
          setState(455);
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
    enterRule(_localctx, 54, Antlr4PilarParser.RULE_globalVarsDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(416);
        match(10);
        setState(418);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
          {
            {
              setState(417);
              globalVarDeclaration();
            }
          }
          setState(420);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        } while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
            | (1L << 36) | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.ID))) != 0)));
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
    enterRule(_localctx, 104, Antlr4PilarParser.RULE_gotoj);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1121);
        match(12);
        setState(1122);
        match(Antlr4PilarParser.ID);
        setState(1126);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1123);
              annotation();
            }
          }
          setState(1128);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1129);
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
    enterRule(_localctx, 92, Antlr4PilarParser.RULE_guard);
    int _la;
    try {
      int _alt;
      setState(946);
      switch (this._input.LA(1)) {
        case 4:
        case 15:
        case 18:
        case 31:
        case 33:
        case 36:
        case 37:
        case 41:
        case 42:
        case GID:
        case ID:
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
            setState(930);
            exp(0);
            setState(934);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(931);
                  annotation();
                }
              }
              setState(936);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(937);
            match(19);
          }
          break;
        case 40:
          _localctx = new ElseGuardContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(939);
            match(40);
            setState(943);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 129, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(940);
                    annotation();
                  }
                }
              }
              setState(945);
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
    enterRule(_localctx, 120, Antlr4PilarParser.RULE_ifElseExp);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1284);
        match(40);
        setState(1288);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1285);
              annotation();
            }
          }
          setState(1290);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1291);
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
    enterRule(_localctx, 108, Antlr4PilarParser.RULE_ifElseJump);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1143);
        match(40);
        setState(1147);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1144);
              annotation();
            }
          }
          setState(1149);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1150);
        match(12);
        setState(1151);
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
    enterRule(_localctx, 118, Antlr4PilarParser.RULE_ifThenExp);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1273);
        match(33);
        setState(1274);
        exp(0);
        setState(1275);
        match(53);
        setState(1279);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1276);
              annotation();
            }
          }
          setState(1281);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1282);
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
    enterRule(_localctx, 106, Antlr4PilarParser.RULE_ifThenJump);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1131);
        match(33);
        setState(1132);
        exp(0);
        setState(1133);
        match(53);
        setState(1137);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1134);
              annotation();
            }
          }
          setState(1139);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1140);
        match(12);
        setState(1141);
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

  public final ImplementedBodyContext implementedBody()
      throws RecognitionException {
    final ImplementedBodyContext _localctx = new ImplementedBodyContext(
        this._ctx, getState());
    enterRule(_localctx, 78, Antlr4PilarParser.RULE_implementedBody);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(801);
        match(36);
        setState(803);
        _la = this._input.LA(1);
        if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31) | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
          {
            setState(802);
            localVarsDeclaration();
          }
        }

        setState(808);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == Antlr4PilarParser.LID) {
          {
            {
              setState(805);
              location();
            }
          }
          setState(810);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(814);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 39) {
          {
            {
              setState(811);
              catchClause();
            }
          }
          setState(816);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(817);
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

  public final JumpContext jump() throws RecognitionException {
    JumpContext _localctx = new JumpContext(this._ctx, getState());
    enterRule(_localctx, 102, Antlr4PilarParser.RULE_jump);
    int _la;
    try {
      int _alt;
      setState(1119);
      switch (this._input.LA(1)) {
        case 12:
          _localctx = new GotoJumpContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1062);
            gotoj();
          }
          break;
        case 46:
          _localctx = new ReturnJumpContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1063);
            match(46);
            setState(1072);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4)
                | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33)
                | (1L << 36) | (1L << 37) | (1L << 41) | (1L << 42)
                | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
                || (((((_la - 72)) & ~0x3f) == 0) && (((1L << (_la - 72)) & ((1L << (Antlr4PilarParser.AddOP - 72))
                    | (1L << (Antlr4PilarParser.MulOP - 72))
                    | (1L << (Antlr4PilarParser.UnaryOP - 72))
                    | (1L << (Antlr4PilarParser.HEX - 72))
                    | (1L << (Antlr4PilarParser.DEC - 72))
                    | (1L << (Antlr4PilarParser.OCT - 72))
                    | (1L << (Antlr4PilarParser.BIN - 72))
                    | (1L << (Antlr4PilarParser.FLOAT - 72))
                    | (1L << (Antlr4PilarParser.CHAR - 72)) | (1L << (Antlr4PilarParser.STRING - 72)))) != 0))) {
              {
                setState(1064);
                exp(0);
                setState(1069);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(1065);
                      match(27);
                      setState(1066);
                      exp(0);
                    }
                  }
                  setState(1071);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1077);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1074);
                  annotation();
                }
              }
              setState(1079);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1080);
            match(50);
          }
          break;
        case 33:
          _localctx = new IfJumpContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1081);
            ifThenJump();
            setState(1086);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 150, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1082);
                    match(40);
                    setState(1083);
                    ifThenJump();
                  }
                }
              }
              setState(1088);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  150,
                  this._ctx);
            }
            setState(1090);
            _la = this._input.LA(1);
            if (_la == 40) {
              {
                setState(1089);
                ifElseJump();
              }
            }

            setState(1095);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1092);
                  annotation();
                }
              }
              setState(1097);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1098);
            match(50);
          }
          break;
        case 54:
          _localctx = new SwitchJumpContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1100);
            match(54);
            setState(1101);
            exp(0);
            setState(1105);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 153, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1102);
                    switchCaseJump();
                  }
                }
              }
              setState(1107);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  153,
                  this._ctx);
            }
            setState(1109);
            _la = this._input.LA(1);
            if (_la == 21) {
              {
                setState(1108);
                switchDefaultJump();
              }
            }

            setState(1114);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1111);
                  annotation();
                }
              }
              setState(1116);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1117);
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
    enterRule(_localctx, 12, Antlr4PilarParser.RULE_jumpFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(176);
        jump();
        setState(177);
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
    enterRule(_localctx, 98, Antlr4PilarParser.RULE_lhs);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1047);
        exp(0);
        setState(1051);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1048);
              annotation();
            }
          }
          setState(1053);
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
    enterRule(_localctx, 96, Antlr4PilarParser.RULE_lhss);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1039);
        lhs();
        setState(1044);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 27) {
          {
            {
              setState(1040);
              match(27);
              setState(1041);
              lhs();
            }
          }
          setState(1046);
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
    enterRule(_localctx, 84, Antlr4PilarParser.RULE_localVarDeclaration);
    int _la;
    try {
      setState(851);
      switch (getInterpreter().adaptivePredict(this._input, 112, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(826);
            localVarFragment();
            setState(831);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(827);
                  match(27);
                  setState(828);
                  localVarFragment();
                }
              }
              setState(833);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(834);
            match(32);
            setState(835);
            type();
            setState(836);
            match(50);
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(839);
            switch (getInterpreter().adaptivePredict(
                this._input,
                110,
                this._ctx)) {
              case 1: {
                setState(838);
                type();
              }
                break;
            }
            setState(841);
            localVarFragment();
            setState(846);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(842);
                  match(27);
                  setState(843);
                  localVarFragment();
                }
              }
              setState(848);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(849);
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
    enterRule(_localctx, 86, Antlr4PilarParser.RULE_localVarFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(853);
        match(Antlr4PilarParser.ID);
        setState(857);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(854);
              annotation();
            }
          }
          setState(859);
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
    enterRule(_localctx, 82, Antlr4PilarParser.RULE_localVarsDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(822);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
          {
            {
              setState(821);
              localVarDeclaration();
            }
          }
          setState(824);
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
    enterRule(_localctx, 88, Antlr4PilarParser.RULE_location);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(860);
        match(Antlr4PilarParser.LID);
        setState(864);
        this._errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(this._input, 114, this._ctx);
        while ((_alt != 2) && (_alt != -1)) {
          if (_alt == 1) {
            {
              {
                setState(861);
                annotation();
              }
            }
          }
          setState(866);
          this._errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(this._input, 114, this._ctx);
        }
        setState(875);
        switch (getInterpreter().adaptivePredict(this._input, 116, this._ctx)) {
          case 1: {
            setState(867);
            transformation();
            setState(872);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 21) {
              {
                {
                  setState(868);
                  match(21);
                  setState(869);
                  transformation();
                }
              }
              setState(874);
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
    enterRule(_localctx, 6, Antlr4PilarParser.RULE_locationFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(167);
        location();
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

  public final MappingContext mapping() throws RecognitionException {
    final MappingContext _localctx = new MappingContext(this._ctx, getState());
    enterRule(_localctx, 134, Antlr4PilarParser.RULE_mapping);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1469);
        exp(0);
        setState(1470);
        match(6);
        setState(1471);
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
    enterRule(_localctx, 140, Antlr4PilarParser.RULE_matching);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1498);
        _la = this._input.LA(1);
        if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31) | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
          {
            setState(1490);
            paramVar();
            setState(1495);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(1491);
                  match(27);
                  setState(1492);
                  paramVar();
                }
              }
              setState(1497);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
        }

        setState(1500);
        match(44);
        setState(1501);
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
    enterRule(_localctx, 18, Antlr4PilarParser.RULE_model);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(188);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(185);
              annotation();
            }
          }
          setState(190);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(194);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 1)
            | (1L << 10) | (1L << 13) | (1L << 14) | (1L << 23) | (1L << 34)
            | (1L << 45) | (1L << 51))) != 0))) {
          {
            {
              setState(191);
              modelElement();
            }
          }
          setState(196);
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
    enterRule(_localctx, 26, Antlr4PilarParser.RULE_modelElement);
    try {
      setState(238);
      switch (this._input.LA(1)) {
        case 14:
          enterOuterAlt(_localctx, 1);
          {
            setState(230);
            constDeclaration();
          }
          break;
        case 23:
          enterOuterAlt(_localctx, 2);
          {
            setState(231);
            enumDeclaration();
          }
          break;
        case 1:
          enterOuterAlt(_localctx, 3);
          {
            setState(232);
            recordDeclaration();
          }
          break;
        case 10:
          enterOuterAlt(_localctx, 4);
          {
            setState(233);
            globalVarsDeclaration();
          }
          break;
        case 45:
          enterOuterAlt(_localctx, 5);
          {
            setState(234);
            procedureDeclaration();
          }
          break;
        case 13:
          enterOuterAlt(_localctx, 6);
          {
            setState(235);
            funDeclaration();
          }
          break;
        case 51:
          enterOuterAlt(_localctx, 7);
          {
            setState(236);
            extDeclaration();
          }
          break;
        case 34:
          enterOuterAlt(_localctx, 8);
          {
            setState(237);
            typealiasDeclaration();
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
        setState(158);
        model();
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

  public final NewKContext newK() throws RecognitionException {
    final NewKContext _localctx = new NewKContext(this._ctx, getState());
    enterRule(_localctx, 130, Antlr4PilarParser.RULE_newK);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1459);
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
    enterRule(_localctx, 136, Antlr4PilarParser.RULE_newMultiSeqFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1473);
        match(2);
        setState(1482);
        _la = this._input.LA(1);
        if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 2) | (1L << 4)
            | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33) | (1L << 36)
            | (1L << 37) | (1L << 41) | (1L << 42)
            | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
            || (((((_la - 72)) & ~0x3f) == 0) && (((1L << (_la - 72)) & ((1L << (Antlr4PilarParser.AddOP - 72))
                | (1L << (Antlr4PilarParser.MulOP - 72))
                | (1L << (Antlr4PilarParser.UnaryOP - 72))
                | (1L << (Antlr4PilarParser.HEX - 72))
                | (1L << (Antlr4PilarParser.DEC - 72))
                | (1L << (Antlr4PilarParser.OCT - 72))
                | (1L << (Antlr4PilarParser.BIN - 72))
                | (1L << (Antlr4PilarParser.FLOAT - 72))
                | (1L << (Antlr4PilarParser.CHAR - 72)) | (1L << (Antlr4PilarParser.STRING - 72)))) != 0))) {
          {
            setState(1474);
            newMultiSeqFragmentE();
            setState(1479);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(1475);
                  match(27);
                  setState(1476);
                  newMultiSeqFragmentE();
                }
              }
              setState(1481);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
        }

        setState(1484);
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
    enterRule(_localctx, 138, Antlr4PilarParser.RULE_newMultiSeqFragmentE);
    try {
      setState(1488);
      switch (this._input.LA(1)) {
        case 2:
          _localctx = new NewMultiSeqFragmentENewContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1486);
            newMultiSeqFragment();
          }
          break;
        case 4:
        case 15:
        case 18:
        case 31:
        case 33:
        case 36:
        case 37:
        case 41:
        case 42:
        case GID:
        case ID:
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
            setState(1487);
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
    enterRule(_localctx, 144, Antlr4PilarParser.RULE_newMultiSeqTypeFragment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1507);
        match(2);
        setState(1508);
        exp(0);
        setState(1513);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 27) {
          {
            {
              setState(1509);
              match(27);
              setState(1510);
              exp(0);
            }
          }
          setState(1515);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1516);
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
    enterRule(_localctx, 62, Antlr4PilarParser.RULE_paramVar);
    int _la;
    try {
      setState(531);
      switch (getInterpreter().adaptivePredict(this._input, 52, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(512);
            match(Antlr4PilarParser.ID);
            setState(516);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(513);
                  annotation();
                }
              }
              setState(518);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(519);
            match(32);
            setState(520);
            type();
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(522);
            switch (getInterpreter()
                .adaptivePredict(this._input, 50, this._ctx)) {
              case 1: {
                setState(521);
                type();
              }
                break;
            }
            setState(524);
            match(Antlr4PilarParser.ID);
            setState(528);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(525);
                  annotation();
                }
              }
              setState(530);
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
    enterRule(_localctx, 124, Antlr4PilarParser.RULE_primary);
    int _la;
    try {
      int _alt;
      setState(1437);
      switch (getInterpreter().adaptivePredict(this._input, 192, this._ctx)) {
        case 1:
          _localctx = new NameExpContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1312);
            match(Antlr4PilarParser.ID);
          }
          break;

        case 2:
          _localctx = new GlobalNameExpContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1313);
            match(Antlr4PilarParser.GID);
          }
          break;

        case 3:
          _localctx = new ConstantLitContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1314);
            constant();
          }
          break;

        case 4:
          _localctx = new PTupleExpContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1315);
            tupleExp();
          }
          break;

        case 5:
          _localctx = new LetExpContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1316);
            match(37);
            setState(1317);
            binding();
            setState(1322);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(1318);
                  match(27);
                  setState(1319);
                  binding();
                }
              }
              setState(1324);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1325);
            match(26);
            setState(1326);
            exp(0);
          }
          break;

        case 6:
          _localctx = new RangedListExpContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(1328);
            newK();
            setState(1329);
            match(2);
            setState(1330);
            exp(0);
            setState(1331);
            match(22);
            setState(1332);
            exp(0);
            setState(1333);
            match(24);
          }
          break;

        case 7:
          _localctx = new ListExpContext(_localctx);
          enterOuterAlt(_localctx, 7);
          {
            setState(1335);
            newK();
            setState(1336);
            match(2);
            setState(1345);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4)
                | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33)
                | (1L << 36) | (1L << 37) | (1L << 41) | (1L << 42)
                | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
                || (((((_la - 72)) & ~0x3f) == 0) && (((1L << (_la - 72)) & ((1L << (Antlr4PilarParser.AddOP - 72))
                    | (1L << (Antlr4PilarParser.MulOP - 72))
                    | (1L << (Antlr4PilarParser.UnaryOP - 72))
                    | (1L << (Antlr4PilarParser.HEX - 72))
                    | (1L << (Antlr4PilarParser.DEC - 72))
                    | (1L << (Antlr4PilarParser.OCT - 72))
                    | (1L << (Antlr4PilarParser.BIN - 72))
                    | (1L << (Antlr4PilarParser.FLOAT - 72))
                    | (1L << (Antlr4PilarParser.CHAR - 72)) | (1L << (Antlr4PilarParser.STRING - 72)))) != 0))) {
              {
                setState(1337);
                exp(0);
                setState(1342);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(1338);
                      match(27);
                      setState(1339);
                      exp(0);
                    }
                  }
                  setState(1344);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1347);
            match(24);
          }
          break;

        case 8:
          _localctx = new SetExpContext(_localctx);
          enterOuterAlt(_localctx, 8);
          {
            setState(1349);
            newK();
            setState(1350);
            match(36);
            setState(1359);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4)
                | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33)
                | (1L << 36) | (1L << 37) | (1L << 41) | (1L << 42)
                | (1L << Antlr4PilarParser.GID) | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
                || (((((_la - 72)) & ~0x3f) == 0) && (((1L << (_la - 72)) & ((1L << (Antlr4PilarParser.AddOP - 72))
                    | (1L << (Antlr4PilarParser.MulOP - 72))
                    | (1L << (Antlr4PilarParser.UnaryOP - 72))
                    | (1L << (Antlr4PilarParser.HEX - 72))
                    | (1L << (Antlr4PilarParser.DEC - 72))
                    | (1L << (Antlr4PilarParser.OCT - 72))
                    | (1L << (Antlr4PilarParser.BIN - 72))
                    | (1L << (Antlr4PilarParser.FLOAT - 72))
                    | (1L << (Antlr4PilarParser.CHAR - 72)) | (1L << (Antlr4PilarParser.STRING - 72)))) != 0))) {
              {
                setState(1351);
                exp(0);
                setState(1356);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(1352);
                      match(27);
                      setState(1353);
                      exp(0);
                    }
                  }
                  setState(1358);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1361);
            match(5);
          }
          break;

        case 9:
          _localctx = new MapExpContext(_localctx);
          enterOuterAlt(_localctx, 9);
          {
            setState(1363);
            newK();
            setState(1364);
            match(36);
            setState(1374);
            switch (this._input.LA(1)) {
              case 6: {
                setState(1365);
                match(6);
              }
                break;
              case 4:
              case 15:
              case 18:
              case 31:
              case 33:
              case 36:
              case 37:
              case 41:
              case 42:
              case GID:
              case ID:
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
                setState(1366);
                mapping();
                setState(1371);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(1367);
                      match(27);
                      setState(1368);
                      mapping();
                    }
                  }
                  setState(1373);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
                break;
              default:
                throw new NoViableAltException(this);
            }
            setState(1376);
            match(5);
          }
          break;

        case 10:
          _localctx = new MultiSeqExpContext(_localctx);
          enterOuterAlt(_localctx, 10);
          {
            setState(1378);
            newK();
            setState(1379);
            match(2);
            setState(1388);
            _la = this._input.LA(1);
            if (_la == 2) {
              {
                setState(1380);
                newMultiSeqFragment();
                setState(1385);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(1381);
                      match(27);
                      setState(1382);
                      newMultiSeqFragment();
                    }
                  }
                  setState(1387);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1390);
            match(24);
          }
          break;

        case 11:
          _localctx = new RecordExpContext(_localctx);
          enterOuterAlt(_localctx, 11);
          {
            setState(1392);
            newK();
            setState(1393);
            match(Antlr4PilarParser.ID);
            setState(1395);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(1394);
                typeTuple();
              }
            }

            setState(1397);
            match(36);
            setState(1406);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(1398);
                fieldInit();
                setState(1403);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(1399);
                      match(27);
                      setState(1400);
                      fieldInit();
                    }
                  }
                  setState(1405);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
              }
            }

            setState(1408);
            match(5);
          }
          break;

        case 12:
          _localctx = new ArrayExpContext(_localctx);
          enterOuterAlt(_localctx, 12);
          {
            setState(1410);
            newK();
            setState(1411);
            baseType();
            setState(1415);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 189, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1412);
                    newMultiSeqTypeFragment();
                  }
                }
              }
              setState(1417);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  189,
                  this._ctx);
            }
            setState(1421);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 190, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(1418);
                    typeFragment();
                  }
                }
              }
              setState(1423);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  190,
                  this._ctx);
            }
          }
          break;

        case 13:
          _localctx = new TypeExpContext(_localctx);
          enterOuterAlt(_localctx, 13);
          {
            setState(1424);
            match(42);
            setState(1425);
            type();
          }
          break;

        case 14:
          _localctx = new ClosureExpContext(_localctx);
          enterOuterAlt(_localctx, 14);
          {
            setState(1426);
            match(36);
            setState(1427);
            matching();
            setState(1432);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 21) {
              {
                {
                  setState(1428);
                  match(21);
                  setState(1429);
                  matching();
                }
              }
              setState(1434);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1435);
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

  public final PrimarySuffixContext primarySuffix() throws RecognitionException {
    PrimarySuffixContext _localctx = new PrimarySuffixContext(this._ctx,
        getState());
    enterRule(_localctx, 122, Antlr4PilarParser.RULE_primarySuffix);
    int _la;
    try {
      setState(1310);
      switch (this._input.LA(1)) {
        case 2:
          _localctx = new IndexingSuffixContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1293);
            match(2);
            setState(1294);
            exp(0);
            setState(1299);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(1295);
                  match(27);
                  setState(1296);
                  exp(0);
                }
              }
              setState(1301);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1302);
            match(24);
          }
          break;
        case 43:
          _localctx = new AccessSuffixContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1304);
            match(43);
            setState(1305);
            match(Antlr4PilarParser.ID);
          }
          break;
        case 3:
        case 31:
          _localctx = new CallSuffixContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1307);
            _la = this._input.LA(1);
            if (_la == 3) {
              {
                setState(1306);
                typeTuple();
              }
            }

            setState(1309);
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
    enterRule(_localctx, 60, Antlr4PilarParser.RULE_procedureDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(456);
        match(45);
        setState(458);
        _la = this._input.LA(1);
        if (_la == 3) {
          {
            setState(457);
            typeVarTuple();
          }
        }

        setState(510);
        switch (getInterpreter().adaptivePredict(this._input, 48, this._ctx)) {
          case 1: {
            setState(460);
            match(Antlr4PilarParser.ID);
            setState(473);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(461);
                match(31);
                setState(470);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(462);
                    paramVar();
                    setState(467);
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    while (_la == 27) {
                      {
                        {
                          setState(463);
                          match(27);
                          setState(464);
                          paramVar();
                        }
                      }
                      setState(469);
                      this._errHandler.sync(this);
                      _la = this._input.LA(1);
                    }
                  }
                }

                setState(472);
                match(7);
              }
            }

            setState(475);
            match(32);
            setState(476);
            type();
            setState(480);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(477);
                  annotation();
                }
              }
              setState(482);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(483);
            body();
          }
            break;

          case 2: {
            setState(486);
            switch (getInterpreter()
                .adaptivePredict(this._input, 43, this._ctx)) {
              case 1: {
                setState(485);
                type();
              }
                break;
            }
            setState(488);
            match(Antlr4PilarParser.ID);
            setState(501);
            _la = this._input.LA(1);
            if (_la == 31) {
              {
                setState(489);
                match(31);
                setState(498);
                _la = this._input.LA(1);
                if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
                    | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
                  {
                    setState(490);
                    paramVar();
                    setState(495);
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    while (_la == 27) {
                      {
                        {
                          setState(491);
                          match(27);
                          setState(492);
                          paramVar();
                        }
                      }
                      setState(497);
                      this._errHandler.sync(this);
                      _la = this._input.LA(1);
                    }
                  }
                }

                setState(500);
                match(7);
              }
            }

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
    enterRule(_localctx, 42, Antlr4PilarParser.RULE_recordDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(329);
        match(1);
        setState(330);
        match(Antlr4PilarParser.ID);
        setState(332);
        _la = this._input.LA(1);
        if (_la == 3) {
          {
            setState(331);
            typeVarTuple();
          }
        }

        setState(337);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(334);
              annotation();
            }
          }
          setState(339);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(341);
        _la = this._input.LA(1);
        if (_la == 38) {
          {
            setState(340);
            extendClauses();
          }
        }

        setState(343);
        match(36);
        setState(347);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 31)
            | (1L << 36) | (1L << Antlr4PilarParser.ID))) != 0))) {
          {
            {
              setState(344);
              field();
            }
          }
          setState(349);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(350);
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
    enterRule(_localctx, 100, Antlr4PilarParser.RULE_rhs);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1057);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1054);
              annotation();
            }
          }
          setState(1059);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1060);
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
      case 58:
        return exp_sempred((ExpContext) _localctx, predIndex);
    }
    return true;
  }

  public final SwitchCaseJumpContext switchCaseJump()
      throws RecognitionException {
    final SwitchCaseJumpContext _localctx = new SwitchCaseJumpContext(
        this._ctx, getState());
    enterRule(_localctx, 110, Antlr4PilarParser.RULE_switchCaseJump);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1153);
        match(21);
        setState(1154);
        constant();
        setState(1155);
        match(44);
        setState(1159);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1156);
              annotation();
            }
          }
          setState(1161);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1162);
        match(12);
        setState(1163);
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
    enterRule(_localctx, 112, Antlr4PilarParser.RULE_switchDefaultJump);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1165);
        match(21);
        setState(1166);
        match(40);
        setState(1167);
        match(44);
        setState(1171);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(1168);
              annotation();
            }
          }
          setState(1173);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(1174);
        match(12);
        setState(1175);
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
    enterRule(_localctx, 90, Antlr4PilarParser.RULE_transformation);
    int _la;
    try {
      int _alt;
      setState(928);
      switch (getInterpreter().adaptivePredict(this._input, 127, this._ctx)) {
        case 1:
          _localctx = new CallTransformationContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(878);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4)
                | (1L << 15) | (1L << 18) | (1L << 31) | (1L << 33)
                | (1L << 36) | (1L << 37) | (1L << 40) | (1L << 41)
                | (1L << 42) | (1L << Antlr4PilarParser.GID)
                | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
                || (((((_la - 72)) & ~0x3f) == 0) && (((1L << (_la - 72)) & ((1L << (Antlr4PilarParser.AddOP - 72))
                    | (1L << (Antlr4PilarParser.MulOP - 72))
                    | (1L << (Antlr4PilarParser.UnaryOP - 72))
                    | (1L << (Antlr4PilarParser.HEX - 72))
                    | (1L << (Antlr4PilarParser.DEC - 72))
                    | (1L << (Antlr4PilarParser.OCT - 72))
                    | (1L << (Antlr4PilarParser.BIN - 72))
                    | (1L << (Antlr4PilarParser.FLOAT - 72))
                    | (1L << (Antlr4PilarParser.CHAR - 72)) | (1L << (Antlr4PilarParser.STRING - 72)))) != 0))) {
              {
                setState(877);
                guard();
              }
            }

            setState(880);
            match(16);
            setState(890);
            switch (getInterpreter().adaptivePredict(
                this._input,
                119,
                this._ctx)) {
              case 1: {
                setState(881);
                ((CallTransformationContext) _localctx).ID = match(Antlr4PilarParser.ID);
                ((CallTransformationContext) _localctx).clhs
                    .add(((CallTransformationContext) _localctx).ID);
                setState(886);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while (_la == 27) {
                  {
                    {
                      setState(882);
                      match(27);
                      setState(883);
                      ((CallTransformationContext) _localctx).ID = match(Antlr4PilarParser.ID);
                      ((CallTransformationContext) _localctx).clhs
                          .add(((CallTransformationContext) _localctx).ID);
                    }
                  }
                  setState(888);
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                }
                setState(889);
                match(Antlr4PilarParser.AssignOP);
              }
                break;
            }
            setState(892);
            ((CallTransformationContext) _localctx).p = match(Antlr4PilarParser.ID);
            setState(893);
            tupleExp();
            setState(897);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(894);
                  ((CallTransformationContext) _localctx).annotation = annotation();
                  ((CallTransformationContext) _localctx).cans
                      .add(((CallTransformationContext) _localctx).annotation);
                }
              }
              setState(899);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(902);
            switch (this._input.LA(1)) {
              case 12: {
                setState(900);
                gotoj();
              }
                break;
              case 50: {
                setState(901);
                match(50);
              }
                break;
              default:
                throw new NoViableAltException(this);
            }
            setState(907);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(904);
                  ((CallTransformationContext) _localctx).annotation = annotation();
                  ((CallTransformationContext) _localctx).tanns
                      .add(((CallTransformationContext) _localctx).annotation);
                }
              }
              setState(909);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
          break;

        case 2:
          _localctx = new BlockTransformationContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(911);
            switch (getInterpreter().adaptivePredict(
                this._input,
                123,
                this._ctx)) {
              case 1: {
                setState(910);
                guard();
              }
                break;
            }
            setState(916);
            this._errHandler.sync(this);
            _alt = getInterpreter()
                .adaptivePredict(this._input, 124, this._ctx);
            while ((_alt != 2) && (_alt != -1)) {
              if (_alt == 1) {
                {
                  {
                    setState(913);
                    action();
                  }
                }
              }
              setState(918);
              this._errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(
                  this._input,
                  124,
                  this._ctx);
            }
            setState(920);
            _la = this._input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 12)
                | (1L << 33) | (1L << 46) | (1L << 54))) != 0))) {
              {
                setState(919);
                jump();
              }
            }

            setState(925);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(922);
                  ((BlockTransformationContext) _localctx).annotation = annotation();
                  ((BlockTransformationContext) _localctx).tanns
                      .add(((BlockTransformationContext) _localctx).annotation);
                }
              }
              setState(927);
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
    enterRule(_localctx, 8, Antlr4PilarParser.RULE_transformationFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(170);
        transformation();
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

  public final TupleExpContext tupleExp() throws RecognitionException {
    final TupleExpContext _localctx = new TupleExpContext(this._ctx, getState());
    enterRule(_localctx, 126, Antlr4PilarParser.RULE_tupleExp);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1439);
        match(31);
        setState(1448);
        _la = this._input.LA(1);
        if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << 4) | (1L << 15)
            | (1L << 18) | (1L << 31) | (1L << 33) | (1L << 36) | (1L << 37)
            | (1L << 41) | (1L << 42) | (1L << Antlr4PilarParser.GID)
            | (1L << Antlr4PilarParser.ID) | (1L << Antlr4PilarParser.MSTRING))) != 0))
            || (((((_la - 72)) & ~0x3f) == 0) && (((1L << (_la - 72)) & ((1L << (Antlr4PilarParser.AddOP - 72))
                | (1L << (Antlr4PilarParser.MulOP - 72))
                | (1L << (Antlr4PilarParser.UnaryOP - 72))
                | (1L << (Antlr4PilarParser.HEX - 72))
                | (1L << (Antlr4PilarParser.DEC - 72))
                | (1L << (Antlr4PilarParser.OCT - 72))
                | (1L << (Antlr4PilarParser.BIN - 72))
                | (1L << (Antlr4PilarParser.FLOAT - 72))
                | (1L << (Antlr4PilarParser.CHAR - 72)) | (1L << (Antlr4PilarParser.STRING - 72)))) != 0))) {
          {
            setState(1440);
            annExp();
            setState(1445);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 27) {
              {
                {
                  setState(1441);
                  match(27);
                  setState(1442);
                  annExp();
                }
              }
              setState(1447);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
          }
        }

        setState(1450);
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
    enterRule(_localctx, 146, Antlr4PilarParser.RULE_type);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1518);
        baseType();
        setState(1522);
        this._errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(this._input, 203, this._ctx);
        while ((_alt != 2) && (_alt != -1)) {
          if (_alt == 1) {
            {
              {
                setState(1519);
                typeFragment();
              }
            }
          }
          setState(1524);
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
    enterRule(_localctx, 36, Antlr4PilarParser.RULE_typealiasDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(296);
        match(34);
        setState(297);
        match(Antlr4PilarParser.ID);
        setState(299);
        _la = this._input.LA(1);
        if (_la == 3) {
          {
            setState(298);
            typeVarTuple();
          }
        }

        setState(304);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(301);
              annotation();
            }
          }
          setState(306);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(307);
        match(11);
        setState(308);
        type();
        setState(309);
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
    enterRule(_localctx, 16, Antlr4PilarParser.RULE_typeFile);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(182);
        type();
        setState(183);
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
    enterRule(_localctx, 148, Antlr4PilarParser.RULE_typeFragment);
    int _la;
    try {
      setState(1550);
      switch (getInterpreter().adaptivePredict(this._input, 206, this._ctx)) {
        case 1:
          _localctx = new SeqFragmentContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(1525);
            match(2);
            setState(1526);
            match(24);
          }
          break;

        case 2:
          _localctx = new StaticSeqFragmentContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(1527);
            match(2);
            setState(1528);
            constant();
            setState(1529);
            match(24);
          }
          break;

        case 3:
          _localctx = new MultiSeqFragmentContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(1531);
            match(2);
            setState(1533);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            do {
              {
                {
                  setState(1532);
                  ((MultiSeqFragmentContext) _localctx).s27 = match(27);
                  ((MultiSeqFragmentContext) _localctx).rank
                      .add(((MultiSeqFragmentContext) _localctx).s27);
                }
              }
              setState(1535);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            } while (_la == 27);
            setState(1537);
            match(24);
          }
          break;

        case 4:
          _localctx = new StaticMultiSeqFragmentContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(1538);
            match(2);
            setState(1539);
            constant();
            setState(1542);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            do {
              {
                {
                  setState(1540);
                  match(27);
                  setState(1541);
                  constant();
                }
              }
              setState(1544);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            } while (_la == 27);
            setState(1546);
            match(24);
          }
          break;

        case 5:
          _localctx = new SetFragmentContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(1548);
            match(36);
            setState(1549);
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
    enterRule(_localctx, 154, Antlr4PilarParser.RULE_typeParam);
    int _la;
    try {
      setState(1657);
      switch (getInterpreter().adaptivePredict(this._input, 222, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(1638);
            match(Antlr4PilarParser.ID);
            setState(1642);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1639);
                  annotation();
                }
              }
              setState(1644);
              this._errHandler.sync(this);
              _la = this._input.LA(1);
            }
            setState(1645);
            match(32);
            setState(1646);
            type();
          }
          break;

        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(1647);
            type();
            setState(1649);
            _la = this._input.LA(1);
            if (_la == Antlr4PilarParser.ID) {
              {
                setState(1648);
                match(Antlr4PilarParser.ID);
              }
            }

            setState(1654);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while (_la == 9) {
              {
                {
                  setState(1651);
                  annotation();
                }
              }
              setState(1656);
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
    enterRule(_localctx, 48, Antlr4PilarParser.RULE_typeTuple);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(371);
        match(3);
        setState(372);
        type();
        setState(377);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 27) {
          {
            {
              setState(373);
              match(27);
              setState(374);
              type();
            }
          }
          setState(379);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(380);
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
    enterRule(_localctx, 40, Antlr4PilarParser.RULE_typeVar);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(322);
        match(Antlr4PilarParser.ID);
        setState(326);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 9) {
          {
            {
              setState(323);
              annotation();
            }
          }
          setState(328);
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
    enterRule(_localctx, 38, Antlr4PilarParser.RULE_typeVarTuple);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(311);
        match(3);
        setState(312);
        typeVar();
        setState(317);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while (_la == 27) {
          {
            {
              setState(313);
              match(27);
              setState(314);
              typeVar();
            }
          }
          setState(319);
          this._errHandler.sync(this);
          _la = this._input.LA(1);
        }
        setState(320);
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
}
