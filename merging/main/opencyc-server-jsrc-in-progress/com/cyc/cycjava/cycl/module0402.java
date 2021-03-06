package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0402 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0402";
    public static final String myFingerPrint = "a968dbea0ccf648eea80a793f2da6668ca8bf8212446260e9b8ad66f9a6b683d";
    private static SubLSymbol $g3292$;
    private static SubLSymbol $g3293$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    
    public static SubLObject f28279(final SubLObject var1) {
        final SubLObject var2 = module0387.f27544();
        final SubLObject var3 = module0398.f28153(var2);
        module0367.f25070(var1, var3);
        return var1;
    }
    
    public static SubLObject f28280(final SubLObject var1) {
        final SubLObject var2 = module0398.f28156(var1);
        return module0387.f27546(var2);
    }
    
    public static SubLObject f28281(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0398.f28156(var1);
        SubLObject var4 = (SubLObject)NIL;
        while (NIL == var4) {
            if (NIL != module0387.f27546(var3)) {
                return (SubLObject)NIL;
            }
            var2.resetMultipleValues();
            final SubLObject var5 = module0387.f27548(var3);
            final SubLObject var6 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (NIL != module0387.f27529(var5)) {
                module0387.f27549(var3);
            }
            else {
                final SubLObject var7 = f28282(var1, var5);
                if (module0018.$g630$.getDynamicValue(var2).numGE((SubLObject)TWO_INTEGER)) {
                    module0006.f218((SubLObject)T, (SubLObject)$ic3$, var1, var5, var6, var7, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                }
                if (NIL != module0387.f27538(var7, var6)) {
                    module0387.f27549(var3);
                    module0387.f27547(var3, var7, var5);
                }
                else {
                    var4 = var5;
                }
            }
        }
        return var4;
    }
    
    public static SubLObject f28283(final SubLObject var1) {
        final SubLObject var2 = module0398.f28156(var1);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = Vectors.aref(var2, (SubLObject)ZERO_INTEGER);
        final SubLObject var5 = Vectors.aref(var2, (SubLObject)ONE_INTEGER);
        SubLObject var6 = module0055.f4071(var5);
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            final SubLObject var8 = Hashtables.gethash_without_values(var7, var4, (SubLObject)UNPROVIDED);
            SubLObject var13_15 = module0054.f3978(var8);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var13_15.first();
            while (NIL != var13_15) {
                if (NIL == module0387.f27529(var9)) {
                    final SubLObject var10 = f28282(var1, var9);
                    var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var9, var10), var3);
                }
                var13_15 = var13_15.rest();
                var9 = var13_15.first();
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        module0387.f27545(var2);
        SubLObject var11 = var3;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic4$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic4$);
            var16 = var14.first();
            var14 = var14.rest();
            if (NIL == var14) {
                module0387.f27547(var2, var16, var15);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic4$);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28284(final SubLObject var1) {
        assert NIL != module0398.f28152(var1) : var1;
        final SubLObject var2 = module0387.f27550(module0398.f28156(var1));
        return var2;
    }
    
    public static SubLObject f28285(final SubLObject var1, final SubLObject var22) {
        final SubLObject var23 = module0398.f28156(var1);
        final SubLObject var24 = f28282(var1, var22);
        module0387.f27547(var23, var24, var22);
        return (SubLObject)T;
    }
    
    public static SubLObject f28286(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0398.f28156(var1);
        var2.resetMultipleValues();
        final SubLObject var4 = module0387.f27549(var3);
        final SubLObject var5 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        return var4;
    }
    
    public static SubLObject f28287(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic8$);
        final SubLObject var27 = var26.rest();
        var26 = var26.first();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic8$);
        var28 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic8$);
        var29 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic8$);
        var30 = var26.first();
        var26 = var26.rest();
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = var26;
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34_35 = (SubLObject)NIL;
        while (NIL != var32) {
            cdestructuring_bind.destructuring_bind_must_consp(var32, var25, (SubLObject)$ic8$);
            var34_35 = var32.first();
            var32 = var32.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var32, var25, (SubLObject)$ic8$);
            if (NIL == conses_high.member(var34_35, (SubLObject)$ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var33 = (SubLObject)T;
            }
            if (var34_35 == $ic10$) {
                var31 = var32.first();
            }
            var32 = var32.rest();
        }
        if (NIL != var33 && NIL == var31) {
            cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic8$);
        }
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var26);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var26);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
        final SubLObject var38;
        var26 = (var38 = var27);
        return (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var28, var29, var30, (SubLObject)$ic14$, var35, (SubLObject)$ic12$, var37), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var28), ConsesLow.append(var38, (SubLObject)NIL)));
    }
    
    public static SubLObject f28288(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic17$);
        final SubLObject var27 = var26.rest();
        var26 = var26.first();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic17$);
        var28 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic17$);
        var29 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic17$);
        var30 = var26.first();
        var26 = var26.rest();
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = var26;
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var47_48 = (SubLObject)NIL;
        while (NIL != var32) {
            cdestructuring_bind.destructuring_bind_must_consp(var32, var25, (SubLObject)$ic17$);
            var47_48 = var32.first();
            var32 = var32.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var32, var25, (SubLObject)$ic17$);
            if (NIL == conses_high.member(var47_48, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var33 = (SubLObject)T;
            }
            if (var47_48 == $ic10$) {
                var31 = var32.first();
            }
            var32 = var32.rest();
        }
        if (NIL != var33 && NIL == var31) {
            cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic17$);
        }
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var26);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var26);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
        final SubLObject var38;
        var26 = (var38 = var27);
        return (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var28, var29, var30, (SubLObject)$ic14$, var35, (SubLObject)$ic12$, var37), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)$ic20$, var28), ConsesLow.append(var38, (SubLObject)NIL)));
    }
    
    public static SubLObject f28289(final SubLObject var28) {
        return module0077.f5320(var28, $g3292$.getGlobalValue());
    }
    
    public static SubLObject f28290(final SubLObject var28) {
        return module0077.f5320(var28, $g3293$.getGlobalValue());
    }
    
    public static SubLObject f28291(final SubLObject var28) {
        return (SubLObject)((NIL != f28289(var28)) ? module0077.f5326(var28, $g3292$.getGlobalValue()) : NIL);
    }
    
    public static SubLObject f28292(final SubLObject var28) {
        return (SubLObject)((NIL != f28289(var28)) ? module0077.f5327(var28, $g3292$.getGlobalValue()) : NIL);
    }
    
    public static SubLObject f28293(final SubLObject var28) {
        return (SubLObject)((NIL != f28290(var28)) ? module0077.f5326(var28, $g3293$.getGlobalValue()) : NIL);
    }
    
    public static SubLObject f28294(final SubLObject var28) {
        return (SubLObject)((NIL != f28290(var28)) ? module0077.f5327(var28, $g3293$.getGlobalValue()) : NIL);
    }
    
    public static SubLObject f28295(final SubLObject var52, final SubLObject var1) {
        assert NIL != module0377.f26771(var52) : var52;
        assert NIL != module0398.f28152(var1) : var1;
        return f28296(var52, var1);
    }
    
    public static SubLObject f28297(final SubLObject var53, final SubLObject var1) {
        assert NIL != module0377.f26746(var53) : var53;
        assert NIL != module0398.f28152(var1) : var1;
        final SubLObject var54 = module0377.f26752(var53);
        return f28295(var54, var1);
    }
    
    public static SubLObject f28298(final SubLObject var54, final SubLObject var1) {
        assert NIL != module0373.f26163(var54) : var54;
        assert NIL != module0398.f28152(var1) : var1;
        return f28296(var54, var1);
    }
    
    public static SubLObject f28296(final SubLObject var37, final SubLObject var1) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        assert NIL != module0365.f24819(var37) : var37;
        assert NIL != module0398.f28152(var1) : var1;
        SubLObject var39 = (SubLObject)ZERO_INTEGER;
        SubLObject var40;
        for (var40 = module0066.f4838(module0067.f4891(module0389.f27601())); NIL == module0066.f4841(var40); var40 = module0066.f4840(var40)) {
            var38.resetMultipleValues();
            final SubLObject var41 = module0066.f4839(var40);
            final SubLObject var42 = var38.secondMultipleValue();
            var38.resetMultipleValues();
            final SubLObject var43 = module0389.f27609(var41);
            final SubLObject var44 = module0389.f27610(var41);
            final SubLObject var45 = module0389.f27614(var41);
            if (NIL != module0389.f27603(var37, var45) && NIL != f28289(var41)) {
                final SubLObject var46 = f28299(var1, var41, var43, var37, var44);
                var39 = module0048.f3364(var39, var46);
            }
        }
        module0066.f4842(var40);
        final SubLObject var47 = module0365.f24850(var37);
        SubLObject var48;
        for (var48 = module0066.f4838(module0067.f4891(module0389.f27601())); NIL == module0066.f4841(var48); var48 = module0066.f4840(var48)) {
            var38.resetMultipleValues();
            final SubLObject var49 = module0066.f4839(var48);
            final SubLObject var50 = var38.secondMultipleValue();
            var38.resetMultipleValues();
            final SubLObject var51 = module0389.f27609(var49);
            final SubLObject var52 = module0389.f27610(var49);
            final SubLObject var53 = module0389.f27614(var49);
            if (NIL != module0389.f27603((SubLObject)NIL, var53) && NIL != f28290(var49)) {
                final SubLObject var54 = f28299(var1, var49, var51, var47, var52);
                var39 = module0048.f3364(var39, var54);
            }
        }
        module0066.f4842(var48);
        return var39;
    }
    
    public static SubLObject f28299(final SubLObject var1, final SubLObject var28, final SubLObject var29, final SubLObject var16, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = Functions.funcall(var29, var1, var16);
        final SubLObject var33 = module0048.f3366(var32, var30);
        if (!var33.eql((SubLObject)ZERO_INTEGER) && module0018.$g630$.getDynamicValue(var31).numGE((SubLObject)THREE_INTEGER)) {
            module0006.f218((SubLObject)T, (SubLObject)$ic27$, var1, var16, var28, var33, var32, var30, (SubLObject)NIL, (SubLObject)NIL);
        }
        return var33;
    }
    
    public static SubLObject f28282(final SubLObject var1, final SubLObject var61) {
        assert NIL != module0398.f28152(var1) : var1;
        assert NIL != module0387.f27526(var61) : var61;
        if (NIL != module0377.f26771(var61)) {
            return f28295(var61, var1);
        }
        if (NIL != module0373.f26163(var61)) {
            return f28298(var61, var1);
        }
        if (NIL != module0377.f26746(var61)) {
            return f28297(var61, var1);
        }
        return Errors.error((SubLObject)$ic29$, var61);
    }
    
    public static SubLObject f28300(final SubLObject var1) {
        return module0398.f28156(var1);
    }
    
    public static SubLObject f28301(final SubLObject var1, final SubLObject var61) {
        SubLObject var62 = (SubLObject)NIL;
        if (NIL != module0365.f24819(var61)) {
            var62 = var61;
        }
        else if (NIL != module0377.f26746(var61)) {
            var62 = module0377.f26752(var61);
        }
        else {
            Errors.error((SubLObject)$ic30$, var61);
        }
        final SubLObject var63 = module0389.f27693(var1, var62, $g3292$.getGlobalValue());
        final SubLObject var64 = module0389.f27693(var1, module0365.f24850(var62), $g3293$.getGlobalValue());
        final SubLObject var65 = ConsesLow.append(var63, var64);
        return Sort.sort(var65, (SubLObject)$ic31$, Symbols.symbol_function((SubLObject)$ic32$));
    }
    
    public static SubLObject f28302() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28279", "S#31404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28280", "S#31388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28281", "S#31391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28283", "S#31390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28284", "S#31405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28285", "S#31264", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28286", "S#31389", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0402", "f28287", "S#31406");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0402", "f28288", "S#31407");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28289", "S#31408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28290", "S#31409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28291", "S#30698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28292", "S#30699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28293", "S#31410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28294", "S#31411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28295", "S#31412", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28297", "S#31413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28298", "S#31414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28296", "S#31415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28299", "S#31416", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28282", "S#31417", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28300", "S#31418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0402", "f28301", "S#31419", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28303() {
        $g3292$ = SubLFiles.deflexical("S#31420", module0078.f5367((SubLObject)$ic6$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3293$ = SubLFiles.deflexical("S#31421", module0078.f5367((SubLObject)$ic7$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28304() {
        module0387.f27534((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0012.f419((SubLObject)$ic2$);
        module0002.f50((SubLObject)$ic16$, (SubLObject)$ic21$);
        module0002.f50((SubLObject)$ic20$, (SubLObject)$ic22$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28302();
    }
    
    public void initializeVariables() {
        f28303();
    }
    
    public void runTopLevelForms() {
        f28304();
    }
    
    static {
        me = (SubLFile)new module0402();
        $g3292$ = null;
        $g3293$ = null;
        $ic0$ = makeKeyword("TRANSFORMATION");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("The TRANSFORMATION Tactician"), makeKeyword("COMMENT"), makeString("The TRANSFORMATION Tactician needs no introduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("S#31404", "CYC"), makeKeyword("DONE?"), makeSymbol("S#31392", "CYC"), makeKeyword("DO-ONE-STEP"), makeSymbol("S#31393", "CYC"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("S#31366", "CYC"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("S#31396", "CYC"), makeKeyword("EXECUTE-STRATEGEM"), makeSymbol("S#31398", "CYC"), makeKeyword("RECONSIDER-SET-ASIDES"), makeSymbol("S#31354", "CYC"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("S#31351", "CYC"), makeKeyword("QUIESCE"), makeSymbol("S#31397", "CYC"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("S#31373", "CYC"), makeKeyword("NEW-TACTIC"), makeSymbol("S#31376", "CYC"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("S#31377", "CYC"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("S#31383", "CYC"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("S#31386", "CYC"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("S#31312", "CYC"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("S#31321", "CYC"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("S#31316", "CYC"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("S#31325", "CYC"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("BULL"), makeKeyword("HAPPINESS-TABLE"), makeSymbol("S#31418", "CYC"), makeKeyword("MOTIVATE-STRATEGEM"), makeSymbol("S#31364", "CYC"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("S#31290", "CYC") });
        $ic2$ = makeSymbol("S#31404", "CYC");
        $ic3$ = makeString("~a happiness: ~a ~a ~a~%");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#31422", "CYC"));
        $ic5$ = makeSymbol("S#30356", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("COMPLETENESS"), (SubLObject)makeKeyword("OCCAMS-RAZOR-TACTIC"), (SubLObject)makeKeyword("MAGIC-WAND"), (SubLObject)makeKeyword("BACKTRACKING-CONSIDERED-HARMFUL"), (SubLObject)makeKeyword("BACKCHAIN-REQUIRED"), (SubLObject)makeKeyword("RULE-A-PRIORI-UTILITY"), (SubLObject)makeKeyword("RULE-HISTORICAL-UTILITY"), (SubLObject)makeKeyword("RULE-LITERAL-COUNT"));
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("SHALLOW-AND-CHEAP"), (SubLObject)makeKeyword("RELEVANT-TERM"), (SubLObject)makeKeyword("LITERAL-COUNT"), (SubLObject)makeKeyword("SKOLEM-COUNT"));
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30806", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#30807", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#24101", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("TACTIC"), (SubLObject)makeKeyword("DONE"));
        $ic10$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic11$ = makeKeyword("TACTIC");
        $ic12$ = makeKeyword("DONE");
        $ic13$ = makeSymbol("S#30703", "CYC");
        $ic14$ = makeKeyword("OBJECT");
        $ic15$ = makeSymbol("PWHEN");
        $ic16$ = makeSymbol("S#31408", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30806", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#30807", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)makeKeyword("PROBLEM"), (SubLObject)makeKeyword("DONE"));
        $ic19$ = makeKeyword("PROBLEM");
        $ic20$ = makeSymbol("S#31409", "CYC");
        $ic21$ = makeSymbol("S#31406", "CYC");
        $ic22$ = makeSymbol("S#31407", "CYC");
        $ic23$ = makeSymbol("S#27340", "CYC");
        $ic24$ = makeSymbol("S#27817", "CYC");
        $ic25$ = makeSymbol("S#27346", "CYC");
        $ic26$ = makeSymbol("S#26790", "CYC");
        $ic27$ = makeString("  ~a heuristic: ~a ~s: ~a = ~a * ~a~%");
        $ic28$ = makeSymbol("S#30616", "CYC");
        $ic29$ = makeString("~S is not a transformation strategem");
        $ic30$ = makeString("Cannot find a tactic to analyze for ~S");
        $ic31$ = makeSymbol("S#3711", "CYC");
        $ic32$ = makeSymbol("FOURTH");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 161 ms
	
	Decompiled with Procyon 0.5.32.
*/