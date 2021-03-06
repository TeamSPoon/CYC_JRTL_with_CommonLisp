package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0496 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0496";
    public static final String myFingerPrint = "bfa3d0455a9d09616288e903030491f6c2dd5fa749d4bad3b3bb2d11568bf79b";
    private static SubLSymbol $g3772$;
    public static SubLSymbol $g3773$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    
    public static SubLObject f32152(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12589(var1, $ic0$) && NIL != module0202.f12734(var1, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32153(final SubLObject var2) {
        assert NIL != f32152(var2) : var2;
        final SubLObject var3 = module0055.f4017();
        final SubLObject var4 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        module0055.f4021(var2, var3);
        module0077.f5326(var2, var4);
        while (NIL == module0055.f4019(var3)) {
            final SubLObject var6 = module0055.f4023(var3);
            final SubLObject var7 = f32154(var6);
            var5 = (SubLObject)ConsesLow.cons(var6, var5);
            SubLObject var8 = var7;
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                if (NIL == module0077.f5320(var9, var4)) {
                    module0055.f4021(var9, var3);
                    module0077.f5326(var9, var4);
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        var5 = module0213.f13926(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f32155(final SubLObject var2) {
        final SubLObject var3 = f32153(var2);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (NIL != f32156(var6)) {
                var4 = (SubLObject)ConsesLow.cons(var6, var4);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        var4 = module0213.f13926(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f32157(final SubLObject var2, final SubLObject var11) {
        assert NIL != f32152(var2) : var2;
        assert NIL != f32152(var11) : var11;
        return (SubLObject)makeBoolean(NIL != f32156(var11) && NIL != module0035.f2171(var11, f32155(var2)));
    }
    
    public static SubLObject f32156(final SubLObject var11) {
        if (NIL == f32152(var11)) {
            return (SubLObject)NIL;
        }
        final SubLObject var12 = module0205.f13203(var11, (SubLObject)UNPROVIDED);
        if (var12.isNumber()) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean((NIL == module0202.f12590(var12) || NIL == f32158(module0205.f13136(var12))) && NIL == module0205.f13220(var12, module0205.f13204(var11, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32154(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic3$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic3$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic3$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var3, $ic0$);
            SubLObject var7 = (SubLObject)NIL;
            if (NIL != module0202.f12590(var4)) {
                final SubLObject var9;
                final SubLObject var8 = var9 = module0205.f13136(var4);
                if (var9.eql($ic4$)) {
                    var7 = f32159(var4, var5);
                }
                else if (var9.eql($ic5$)) {
                    var7 = f32160(var4, var5);
                }
                else if (var9.eql($ic6$)) {
                    var7 = f32161(var4, var5);
                }
                else if (var9.eql($ic7$)) {
                    var7 = f32162(var4, var5);
                }
                else if (var9.eql($ic8$)) {
                    var7 = f32163(var4, var5);
                }
                else if (var9.eql($ic9$)) {
                    var7 = f32164(var4, var5);
                }
                else if (var9.eql($ic10$)) {}
            }
            var7 = (SubLObject)ConsesLow.cons(f32165(var5, var4), var7);
            return var7;
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32158(final SubLObject var1) {
        return module0004.f104(var1, $g3772$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32159(final SubLObject var21, final SubLObject var22) {
        module0035.f2503(var21, $ic4$);
        final SubLObject var23 = module0205.f13207(var21, (SubLObject)UNPROVIDED);
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        var25 = var23;
        var26 = var25.first();
        for (var27 = (SubLObject)ZERO_INTEGER; NIL != var25; var25 = var25.rest(), var26 = var25.first(), var27 = Numbers.add((SubLObject)ONE_INTEGER, var27)) {
            final SubLObject var28 = module0035.f2131(var27, var23);
            final SubLObject var29 = (NIL != module0035.f1997(var28)) ? var28.first() : f32166(var28);
            final SubLObject var30 = f32167(var22, var29);
            final SubLObject var31 = f32165(var26, var30);
            var24 = (SubLObject)ConsesLow.cons(var31, var24);
        }
        return Sequences.nreverse(var24);
    }
    
    public static SubLObject f32160(final SubLObject var30, final SubLObject var22) {
        module0035.f2503(var30, $ic5$);
        SubLObject var32;
        final SubLObject var31 = var32 = module0205.f13207(var30, (SubLObject)UNPROVIDED);
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic12$);
        var33 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic12$);
        var34 = var32.first();
        var32 = var32.rest();
        if (NIL == var32) {
            final SubLObject var35 = f32166((SubLObject)ConsesLow.list(var22, var34));
            final SubLObject var36 = f32167(var33, var22);
            final SubLObject var37 = f32165(var33, var35);
            final SubLObject var38 = f32165(var34, var36);
            return (SubLObject)ConsesLow.list(var37, var38);
        }
        cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32161(final SubLObject var39, final SubLObject var22) {
        module0035.f2503(var39, $ic6$);
        final SubLObject var40 = module0205.f13207(var39, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var44 = (SubLObject)NIL;
        var42 = var40;
        var43 = var42.first();
        for (var44 = (SubLObject)ZERO_INTEGER; NIL != var42; var42 = var42.rest(), var43 = var42.first(), var44 = Numbers.add((SubLObject)ONE_INTEGER, var44)) {
            final SubLObject var45 = module0035.f2131(var44, var40);
            final SubLObject var46 = (NIL != module0035.f1997(var45)) ? var45.first() : f32168(var45);
            final SubLObject var47 = f32169(var22, var46);
            final SubLObject var48 = f32165(var43, var47);
            var41 = (SubLObject)ConsesLow.cons(var48, var41);
        }
        return Sequences.nreverse(var41);
    }
    
    public static SubLObject f32162(final SubLObject var40, final SubLObject var22) {
        module0035.f2503(var40, $ic7$);
        SubLObject var42;
        final SubLObject var41 = var42 = module0205.f13207(var40, (SubLObject)UNPROVIDED);
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var44 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic13$);
        var43 = var42.first();
        var42 = var42.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic13$);
        var44 = var42.first();
        var42 = var42.rest();
        if (NIL == var42) {
            final SubLObject var45 = f32168((SubLObject)ConsesLow.list(var22, var44));
            final SubLObject var46 = f32169(var43, var22);
            final SubLObject var47 = f32165(var43, var45);
            final SubLObject var48 = f32165(var44, var46);
            return (SubLObject)ConsesLow.list(var47, var48);
        }
        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32163(final SubLObject var45, final SubLObject var22) {
        module0035.f2503(var45, $ic8$);
        final SubLObject var46 = module0205.f13203(var45, (SubLObject)ONE_INTEGER);
        final SubLObject var47 = module0202.f12643($ic9$, var22);
        final SubLObject var48 = f32165(var46, var47);
        return (SubLObject)ConsesLow.list(var48);
    }
    
    public static SubLObject f32164(final SubLObject var48, final SubLObject var22) {
        module0035.f2503(var48, $ic9$);
        final SubLObject var49 = module0205.f13203(var48, (SubLObject)ONE_INTEGER);
        final SubLObject var50 = module0202.f12643($ic8$, var22);
        final SubLObject var51 = f32165(var49, var50);
        return (SubLObject)ConsesLow.list(var51);
    }
    
    public static SubLObject f32165(final SubLObject var16, final SubLObject var17) {
        return module0202.f12768($ic0$, var16, var17);
    }
    
    public static SubLObject f32170(final SubLObject var49, SubLObject var50) {
        var50 = module0213.f13926(var50, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0202.f12720(var49, var50, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32171(final SubLObject var49, final SubLObject var12, final SubLObject var51) {
        return f32170(var49, (SubLObject)ConsesLow.list(var12, var51));
    }
    
    public static SubLObject f32172(final SubLObject var19, final SubLObject var50) {
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = var50;
        SubLObject var53 = (SubLObject)NIL;
        var53 = var52.first();
        while (NIL != var52) {
            if (NIL != module0202.f12589(var53, var19)) {
                SubLObject var8_55;
                final SubLObject var54 = var8_55 = module0205.f13207(var53, (SubLObject)UNPROVIDED);
                SubLObject var55 = (SubLObject)NIL;
                var55 = var8_55.first();
                while (NIL != var8_55) {
                    var51 = (SubLObject)ConsesLow.cons(var55, var51);
                    var8_55 = var8_55.rest();
                    var55 = var8_55.first();
                }
            }
            else {
                var51 = (SubLObject)ConsesLow.cons(var53, var51);
            }
            var52 = var52.rest();
            var53 = var52.first();
        }
        if (NIL != module0035.f1997(var51)) {
            return var51.first();
        }
        return f32170(var19, var51);
    }
    
    public static SubLObject f32173(final SubLObject var19, final SubLObject var12, final SubLObject var51, final SubLObject var57) {
        if (NIL != module0202.f12589(var12, var19)) {
            final SubLObject var58 = module0205.f13203(var12, (SubLObject)UNPROVIDED);
            final SubLObject var59 = module0205.f13204(var12, (SubLObject)UNPROVIDED);
            final SubLObject var60 = Functions.funcall(var57, (SubLObject)ConsesLow.list(var59, var51));
            return f32173(var19, var58, var60, var57);
        }
        return module0202.f12768(var19, var12, var51);
    }
    
    public static SubLObject f32166(final SubLObject var23) {
        return f32172($ic4$, var23);
    }
    
    public static SubLObject f32168(final SubLObject var61) {
        return f32172($ic6$, var61);
    }
    
    public static SubLObject f32167(final SubLObject var33, final SubLObject var34) {
        return f32173($ic5$, var33, var34, (SubLObject)$ic14$);
    }
    
    public static SubLObject f32169(final SubLObject var43, final SubLObject var44) {
        return f32173($ic7$, var43, var44, (SubLObject)$ic15$);
    }
    
    public static SubLObject f32174() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32152", "S#35542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32153", "S#35543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32155", "S#35544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32157", "S#35545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32156", "S#35546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32154", "S#35547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32158", "S#35548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32159", "S#35549", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32160", "S#35550", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32161", "S#35551", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32162", "S#35552", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32163", "S#35553", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32164", "S#35554", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32165", "S#35555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32170", "S#35556", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32171", "S#35557", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32172", "S#35558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32173", "S#35559", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32166", "S#35560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32168", "S#35561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32167", "S#35562", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0496", "f32169", "S#35563", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32175() {
        $g3772$ = SubLFiles.deflexical("S#35564", (SubLObject)$ic11$);
        $g3773$ = SubLFiles.deflexical("S#35565", (NIL != Symbols.boundp((SubLObject)$ic18$)) ? $g3773$.getGlobalValue() : $ic19$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32176() {
        module0012.f419((SubLObject)$ic2$);
        module0340.f22938($ic16$);
        module0358.f23773((SubLObject)$ic17$, $ic16$);
        module0003.f57((SubLObject)$ic18$);
        module0132.f8593((SubLObject)$ic18$, $ic16$);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32174();
    }
    
    public void initializeVariables() {
        f32175();
    }
    
    public void runTopLevelForms() {
        f32176();
    }
    
    static {
        me = (SubLFile)new module0496();
        $g3772$ = null;
        $g3773$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("numericallyEquals"));
        $ic1$ = makeSymbol("S#35542", "CYC");
        $ic2$ = makeSymbol("S#35546", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#35566", "CYC"), (SubLObject)makeSymbol("S#35567", "CYC"), (SubLObject)makeSymbol("S#35568", "CYC"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("PlusFn"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("DifferenceFn"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("TimesFn"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("QuotientFn"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("LogFn"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("ExpFn"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("The"));
        $ic11$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PlusFn")), constant_handles_oc.f8479((SubLObject)makeString("DifferenceFn")), constant_handles_oc.f8479((SubLObject)makeString("TimesFn")), constant_handles_oc.f8479((SubLObject)makeString("QuotientFn")), constant_handles_oc.f8479((SubLObject)makeString("LogFn")), constant_handles_oc.f8479((SubLObject)makeString("ExpFn")));
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#35569", "CYC"), (SubLObject)makeSymbol("S#35570", "CYC"));
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("NUMERATOR"), (SubLObject)makeSymbol("DENOMINATOR"));
        $ic14$ = makeSymbol("S#35560", "CYC");
        $ic15$ = makeSymbol("S#35561", "CYC");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("equationPermutations"));
        $ic17$ = makeKeyword("POS");
        $ic18$ = makeSymbol("S#35565", "CYC");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic20$ = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-CHECK");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("numericallyEquals")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("numericallyEquals")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35571", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35572", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35571", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35572", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35571", "CYC"), (SubLObject)makeSymbol("S#35572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35573", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35571", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35572", "CYC")))), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35565", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equationPermutations \n  (#$numericallyEquals <bound> <bound>)\n  (#$numericallyEquals <bound> <bound>))"), makeKeyword("EXAMPLE"), makeString("(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))") });
        $ic22$ = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-ARG1-UNIFY");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("numericallyEquals")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), TWENTY_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35571", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35571", "CYC"))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35546", "CYC")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35543", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35571", "CYC"))), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35565", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equationPermutations  <whatever> (#$numericallyEquals <bound> <bound>))"), makeKeyword("EXAMPLE"), makeString("(#$equationPermutations \n  ?EQUATION \n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))") });
        $ic24$ = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-ARG2-UNIFY");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("numericallyEquals")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35571", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35571", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35544", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equationPermutations")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35571", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35565", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equationPermutations (#$numericallyEquals <bound> <bound>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  ?PERMUTED)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 163 ms
	
	Decompiled with Procyon 0.5.32.
*/