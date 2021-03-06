package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0244 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0244";
    public static final String myFingerPrint = "9b08827aff7eed9c1103401ff8faec1123031ac86b08a27d567e9554e06b5485";
    private static SubLSymbol $g2461$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    
    public static SubLObject f15724(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0173.f10955(var1) : var1;
        final SubLObject var3 = module0137.f8913(var1);
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            final SubLObject var6 = var5.first();
            final SubLObject var7 = conses_high.second(var5);
            module0137.f8914(var3, var6, var7);
            var4 = var4.rest();
            var5 = var4.first();
        }
        f15725(var3);
        module0137.f8932(var1, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15726() {
        final SubLObject var8 = $g2461$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15727() {
        return module0034.f1829($g2461$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15728() {
        return module0137.f8936();
    }
    
    public static SubLObject f15729() {
        SubLObject var9 = $g2461$.getGlobalValue();
        if (NIL == var9) {
            var9 = module0034.f1934((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var10 = module0034.f1810(var9, (SubLObject)UNPROVIDED);
        if (var10 == $ic3$) {
            var10 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f15728()));
            module0034.f1812(var9, var10, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var10);
    }
    
    public static SubLObject f15730(final SubLObject var11) {
        return module0004.f104(var11, f15729(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15731(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != module0137.f8885(var11) || NIL != f15730(var11));
    }
    
    public static SubLObject f15732(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != module0137.f8885(var11) && NIL == f15733(var11));
    }
    
    public static SubLObject f15734(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != f15730(var11) && NIL == f15733(module0137.f8955(var11)));
    }
    
    public static SubLObject f15735(final SubLObject var12) {
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        SubLObject var17;
        SubLObject var16;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var13 = (SubLObject)NIL, var14 = (SubLObject)NIL, var14 = module0137.f8931(); NIL == var13 && NIL != var14; var14 = var14.rest()) {
            var15 = var14.first();
            var16 = (var17 = var15);
            var18 = (SubLObject)NIL;
            var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic4$);
            var18 = var17.first();
            var17 = (var19 = var17.rest());
            var20 = module0137.f8919(var19);
            if (var12.eql(var20)) {
                var13 = (SubLObject)T;
            }
        }
        return var13;
    }
    
    public static SubLObject f15736(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8917(var3);
    }
    
    public static SubLObject f15737(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8920(var3);
    }
    
    public static SubLObject f15738(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8916(var3, (SubLObject)$ic6$);
    }
    
    public static SubLObject f15739(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8922(var3);
    }
    
    public static SubLObject f15740(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8924(var3);
    }
    
    public static SubLObject f15741(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8925(var3);
    }
    
    public static SubLObject f15742(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8926(var3);
    }
    
    public static SubLObject f15743(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8916(var3, (SubLObject)$ic7$);
    }
    
    public static SubLObject f15744(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8921(var3);
    }
    
    public static SubLObject f15745(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return Numbers.subtract((SubLObject)THREE_INTEGER, f15744(var3));
    }
    
    public static SubLObject f15746(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8916(var3, (SubLObject)$ic8$);
    }
    
    public static SubLObject f15747(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8916(var3, (SubLObject)$ic9$);
    }
    
    public static SubLObject f15748(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8923(var3);
    }
    
    public static SubLObject f15749(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8916(var3, (SubLObject)$ic10$);
    }
    
    public static SubLObject f15750(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8916(var3, (SubLObject)$ic11$);
    }
    
    public static SubLObject f15751(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8918(var3);
    }
    
    public static SubLObject f15752(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8916(var3, (SubLObject)$ic12$);
    }
    
    public static SubLObject f15753(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = module0137.f8931();
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            SubLObject var25;
            final SubLObject var24 = var25 = var23;
            SubLObject var26 = (SubLObject)NIL;
            SubLObject var27 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic4$);
            var26 = var25.first();
            var25 = (var27 = var25.rest());
            if (NIL != module0242.f15664(var20, var27)) {
                var21 = (SubLObject)ConsesLow.cons(f15736(var27), var21);
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f15754() {
        return module0137.f8941(module0141.f9189());
    }
    
    public static SubLObject f15755() {
        return module0137.f8942(module0141.f9189());
    }
    
    public static SubLObject f15756(final SubLObject var20, final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return Equality.eql(var20, f15749(var3));
    }
    
    public static SubLObject f15757(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        SubLObject var4 = (SubLObject)NIL;
        var4 = f15758(var3);
        if (NIL != var4) {
            return var4;
        }
        var4 = f15759(var3);
        if (NIL != var4) {
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15760(final SubLObject var25, final SubLObject var26, final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        if (NIL != module0141.f9279(var26) && NIL != module0138.f8972(var25)) {
            return f15738(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15761(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return (SubLObject)makeBoolean(NIL != module0137.f8938(f15739(var3)) || NIL != module0137.f8939(f15739(var3)));
    }
    
    public static SubLObject f15733(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8942(f15739(var3));
    }
    
    public static SubLObject f15762(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8943(f15739(var3));
    }
    
    public static SubLObject f15763(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0035.sublisp_boolean(f15759(var3));
    }
    
    public static SubLObject f15764(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        SubLObject var4 = (SubLObject)NIL;
        var4 = f15758(var3);
        if (NIL != var4) {
            return var4;
        }
        return f15759(var3);
    }
    
    public static SubLObject f15758(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        SubLObject var4 = module0137.f8916(var3, (SubLObject)$ic13$);
        if (NIL != module0137.f8885(var4)) {
            return var4;
        }
        if (NIL == var4) {
            return (SubLObject)NIL;
        }
        if (NIL != f15730(var4)) {
            var4 = module0137.f8955(var4);
            module0137.f8914(var3, (SubLObject)$ic13$, var4);
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15759(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        SubLObject var4 = module0137.f8916(var3, (SubLObject)$ic14$);
        if (NIL != module0137.f8885(var4)) {
            return var4;
        }
        if (NIL == var4) {
            return (SubLObject)NIL;
        }
        if (NIL != f15730(var4)) {
            var4 = module0137.f8955(var4);
            module0137.f8914(var3, (SubLObject)$ic14$, var4);
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15765(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8916(var3, (SubLObject)$ic15$);
    }
    
    public static SubLObject f15725(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        final SubLObject var4 = module0242.f15646();
        module0137.f8914(var3, (SubLObject)$ic16$, var4);
        return var3;
    }
    
    public static SubLObject f15766(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8919(var3);
    }
    
    public static SubLObject f15767() {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = module0137.f8931();
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            SubLObject var25;
            final SubLObject var24 = var25 = var23;
            SubLObject var26 = (SubLObject)NIL;
            SubLObject var27 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic4$);
            var26 = var25.first();
            var25 = (var27 = var25.rest());
            final SubLObject var28 = f15766(var27);
            if (NIL != var28) {
                var21 = (SubLObject)ConsesLow.cons(var28, var21);
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f15768(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8941(f15739(var3));
    }
    
    public static SubLObject f15769(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        SubLObject var4 = module0137.f8916(var3, (SubLObject)$ic17$);
        if (NIL != module0137.f8885(var4)) {
            return var4;
        }
        if (NIL == var4) {
            return (SubLObject)NIL;
        }
        if (NIL != f15730(var4)) {
            var4 = module0137.f8955(var4);
            module0137.f8914(var3, (SubLObject)$ic17$, var4);
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15770(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8940(f15739(var3));
    }
    
    public static SubLObject f15771(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        SubLObject var4 = module0137.f8916(var3, (SubLObject)$ic18$);
        if (NIL != module0137.f8885(var4)) {
            return var4;
        }
        if (NIL == var4) {
            return (SubLObject)NIL;
        }
        if (NIL != f15730(var4)) {
            var4 = module0137.f8955(var4);
            module0137.f8914(var3, (SubLObject)$ic18$, var4);
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15772(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8938(f15739(var3));
    }
    
    public static SubLObject f15773(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return (NIL != f15768(var3)) ? f15771(var3) : var3;
    }
    
    public static SubLObject f15774(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        final SubLObject var4 = f15771(var3);
        final SubLObject var5 = (NIL != var3) ? var3 : module0141.f9188();
        if (NIL != var4) {
            return var4;
        }
        if (module0137.f8917(var5).eql($ic19$)) {
            return module0137.f8955($ic20$);
        }
        return var5;
    }
    
    public static SubLObject f15775(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return (NIL != f15768(var3)) ? f15771(var3) : var3;
    }
    
    public static SubLObject f15776(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0141.f9207(var25) || NIL != module0141.f9209(var25));
    }
    
    public static SubLObject f15777(final SubLObject var25, final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return Equality.eq(var25, f15778(var3));
    }
    
    public static SubLObject f15778(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return (NIL != f15779(var3)) ? module0138.f8971() : module0138.f8977();
    }
    
    public static SubLObject f15780(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return (NIL != f15779(var3)) ? module0138.f8974() : module0138.f8977();
    }
    
    public static SubLObject f15781(SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = (NIL != var25) ? var25 : module0141.f9211();
        if (NIL != module0141.f9207(var27)) {
            return module0141.f9210();
        }
        if (NIL != module0141.f9209(var27)) {
            return module0141.f9208();
        }
        if (NIL != module0136.f8864() && NIL == f15776(var27)) {
            final SubLObject var28 = module0136.$g1591$.getDynamicValue(var26);
            if (var28.eql((SubLObject)$ic21$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic22$, var27, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var28.eql((SubLObject)$ic24$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic25$, (SubLObject)$ic22$, var27, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var28.eql((SubLObject)$ic26$)) {
                Errors.warn((SubLObject)$ic22$, var27, (SubLObject)$ic23$);
            }
            else {
                Errors.warn((SubLObject)$ic27$, module0136.$g1591$.getDynamicValue(var26));
                Errors.cerror((SubLObject)$ic25$, (SubLObject)$ic22$, var27, (SubLObject)$ic23$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15779(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return module0137.f8958(f15737(var3));
    }
    
    public static SubLObject f15782(final SubLObject var25, final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        if (NIL != module0141.f9207(var25)) {
            return f15778(var3);
        }
        if (NIL != module0141.f9209(var25)) {
            return f15780(var3);
        }
        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic28$, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15783(final SubLObject var25, final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        if (NIL != module0141.f9207(var25)) {
            return f15780(var3);
        }
        if (NIL != module0141.f9209(var25)) {
            return f15778(var3);
        }
        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic28$, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15784(final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return (NIL != module0138.f8979() && NIL != var3) ? module0138.f8981() : ((NIL != f15779(var3)) ? module0138.f8970() : module0138.f8978());
    }
    
    public static SubLObject f15785(final SubLObject var3, final SubLObject var20) {
        assert NIL != module0137.f8885(var3) : var3;
        if (NIL == module0138.f8992(var20)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return module0549.f33899(var20);
    }
    
    public static SubLObject f15786(final SubLObject var3, final SubLObject var20) {
        assert NIL != module0137.f8885(var3) : var3;
        if (NIL == module0138.f8992(var20)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return module0549.f33901(var20);
    }
    
    public static SubLObject f15787(final SubLObject var3) {
        return f15788(module0137.f8917(var3));
    }
    
    public static SubLObject f15788(final SubLObject var37) {
        assert NIL != f15730(var37) : var37;
        if (var37.eql($ic30$)) {
            return (SubLObject)$ic31$;
        }
        if (var37.eql($ic32$) || var37.eql($ic33$)) {
            return (SubLObject)$ic34$;
        }
        if (var37.eql($ic20$) || var37.eql($ic19$)) {
            return (SubLObject)$ic35$;
        }
        if (var37.eql($ic36$) || var37.eql($ic37$)) {
            return (SubLObject)$ic38$;
        }
        if (var37.eql($ic39$)) {
            return (SubLObject)$ic40$;
        }
        if (var37.eql($ic41$) || var37.eql($ic42$)) {
            return (SubLObject)$ic43$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15789(final SubLObject var25, final SubLObject var37) {
        assert NIL != f15730(var37) : var37;
        final SubLObject var38 = module0137.f8955(var37);
        if (var37.eql($ic32$)) {
            return (SubLObject)$ic34$;
        }
        if (NIL != f15768(var38)) {
            return (SubLObject)$ic44$;
        }
        if (f15778(var38).eql(var25)) {
            return (SubLObject)$ic45$;
        }
        if (f15780(var38).eql(var25)) {
            return (SubLObject)$ic46$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15790(final SubLObject var37) {
        assert NIL != f15730(var37) : var37;
        if (var37.eql($ic30$)) {
            return (SubLObject)$ic31$;
        }
        if (var37.eql($ic32$)) {
            return (SubLObject)$ic34$;
        }
        if (var37.eql($ic33$)) {
            return (SubLObject)$ic34$;
        }
        if (var37.eql($ic20$)) {
            return (SubLObject)$ic35$;
        }
        if (var37.eql($ic19$)) {
            return (SubLObject)$ic35$;
        }
        if (var37.eql($ic36$)) {
            return (SubLObject)$ic38$;
        }
        if (var37.eql($ic39$)) {
            return (SubLObject)$ic40$;
        }
        if (var37.eql($ic41$)) {
            return (SubLObject)$ic43$;
        }
        if (var37.eql($ic42$)) {
            return (SubLObject)$ic43$;
        }
        if (var37.eql($ic37$)) {
            return (SubLObject)$ic38$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15791(final SubLObject var37) {
        return f15790(var37);
    }
    
    public static SubLObject f15792(final SubLObject var38) {
        if (var38.eql((SubLObject)$ic31$)) {
            return $ic30$;
        }
        if (var38.eql((SubLObject)$ic38$)) {
            return $ic36$;
        }
        if (var38.eql((SubLObject)$ic35$)) {
            return $ic20$;
        }
        if (var38.eql((SubLObject)$ic34$)) {
            return $ic32$;
        }
        if (var38.eql((SubLObject)$ic40$)) {
            return $ic39$;
        }
        if (var38.eql((SubLObject)$ic43$)) {
            return $ic41$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15793(final SubLObject var39) {
        if (var39.eql($ic47$)) {
            return $ic30$;
        }
        if (var39.eql($ic48$)) {
            return $ic20$;
        }
        if (var39.eql($ic49$)) {
            return $ic36$;
        }
        return $ic32$;
    }
    
    public static SubLObject f15794(final SubLObject var20, final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        return f15795(var20, var3);
    }
    
    public static SubLObject f15796(final SubLObject var20, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        return f15793(module0269.f17701(var20, var40));
    }
    
    public static SubLObject f15797(final SubLObject var20, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        return module0137.f8955(f15793(module0269.f17701(var20, var40)));
    }
    
    public static SubLObject f15798(final SubLObject var41, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var41) || !$ic32$.eql(f15796(var41, var40)));
    }
    
    public static SubLObject f15799(final SubLObject var41) {
        return (SubLObject)makeBoolean(NIL != module0245.f15830(var41, $ic32$) || NIL != module0269.f17710(var41) || NIL != module0269.f17716(var41) || NIL != module0269.f17731(var41));
    }
    
    public static SubLObject f15800(final SubLObject var20) {
        return module0269.f17713(module0228.f15229(var20), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15801(final SubLObject var20) {
        return module0269.f17732(module0228.f15229(var20), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15802(final SubLObject var20) {
        return module0269.f17718(module0228.f15229(var20), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15795(final SubLObject var20, final SubLObject var3) {
        assert NIL != module0137.f8885(var3) : var3;
        final SubLObject var21 = f15748(var3);
        if (NIL == var21) {
            return (SubLObject)T;
        }
        final SubLObject var22 = var21;
        if (var22.eql((SubLObject)$ic50$)) {
            return f15800(var20);
        }
        if (var22.eql((SubLObject)$ic51$)) {
            return f15801(var20);
        }
        if (var22.eql((SubLObject)$ic52$)) {
            return f15802(var20);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15803(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var3) : var3;
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)NIL, var6 = module0066.f4838(module0067.f4891(module0137.f8949())); NIL == var5 && NIL == module0066.f4841(var6); var6 = module0066.f4840(var6)) {
            var4.resetMultipleValues();
            final SubLObject var7 = module0066.f4839(var6);
            final SubLObject var8 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            final SubLObject var9 = module0137.f8916(var3, var7);
            if (NIL != var9) {
                if (NIL != Functions.funcall(var8, var9)) {
                    final SubLObject var10 = var8;
                    if (var10.eql((SubLObject)$ic53$)) {
                        module0012.f416(var9);
                    }
                    else if (var10.eql((SubLObject)$ic54$)) {
                        SubLObject var11 = var9;
                        SubLObject var12 = (SubLObject)NIL;
                        var12 = var11.first();
                        while (NIL != var11) {
                            module0012.f416(var12);
                            var11 = var11.rest();
                            var12 = var11.first();
                        }
                    }
                }
                else {
                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic55$, var9, var7, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var5 = (SubLObject)T;
                }
            }
        }
        module0066.f4842(var6);
        SubLObject var13;
        SubLObject var14;
        for (var13 = (SubLObject)NIL, var13 = module0137.f8952(); NIL == var5 && NIL != var13; var13 = var13.rest()) {
            var14 = var13.first();
            if (NIL == module0137.f8916(var3, var14)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic56$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var5 = (SubLObject)T;
            }
        }
        return (SubLObject)makeBoolean(NIL == var5);
    }
    
    public static SubLObject f15804() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15724", "S#18502", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15726", "S#11100", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15727", "S#18503", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15728", "S#18504", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15729", "S#15372", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15730", "S#16712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15731", "S#11209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15732", "S#18505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15734", "S#18506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15735", "S#18507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15736", "S#11101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15737", "S#18508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15738", "S#18509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15739", "S#11670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15740", "S#18510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15741", "S#18511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15742", "S#18512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15743", "S#18513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15744", "S#11673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15745", "S#11674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15746", "S#11671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15747", "S#18514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15748", "S#15375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15749", "S#18515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15750", "S#18516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15751", "S#11721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15752", "S#11449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15753", "S#18517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15754", "S#18518", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15755", "S#11666", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15756", "S#18519", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15757", "S#18520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15760", "S#11724", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15761", "S#11206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15733", "S#11207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15762", "S#18521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15763", "S#18522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15764", "S#18523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15758", "S#18524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15759", "S#18525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15765", "S#18526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15725", "S#18527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15766", "S#11104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15767", "S#18528", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15768", "S#18529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15769", "S#18530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15770", "S#15388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15771", "S#15383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15772", "S#18531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15773", "S#18532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15774", "S#18533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15775", "S#18534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15776", "S#18535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15777", "S#15363", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15778", "S#11267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15780", "S#11268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15781", "S#18536", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15779", "S#18392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15782", "S#15391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15783", "S#18537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15784", "S#15378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15785", "S#18390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15786", "S#18388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15787", "S#18538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15788", "S#18350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15789", "S#18539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15790", "S#18540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15791", "S#18541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15792", "S#18542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15793", "S#18543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15794", "S#18387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15796", "S#18544", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15797", "S#18545", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15798", "S#18546", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15799", "S#18547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15800", "S#18548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15801", "S#18549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15802", "S#18550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15795", "S#15374", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0244", "f15803", "S#18551", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15805() {
        $g2461$ = SubLFiles.deflexical("S#18552", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15806() {
        module0034.f1909((SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15804();
    }
    
    public void initializeVariables() {
        f15805();
    }
    
    public void runTopLevelForms() {
        f15806();
    }
    
    static {
        me = (SubLFile)new module0244();
        $g2461$ = null;
        $ic0$ = makeSymbol("FORT-P");
        $ic1$ = makeSymbol("S#15372", "CYC");
        $ic2$ = makeSymbol("S#18552", "CYC");
        $ic3$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic4$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#205", "CYC"));
        $ic5$ = makeSymbol("S#11099", "CYC");
        $ic6$ = makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");
        $ic7$ = makeKeyword("MARKING-INCREMENT");
        $ic8$ = makeKeyword("ADD-NODE-TO-RESULT-TEST");
        $ic9$ = makeKeyword("ADD-UNMARKED-NODE-TO-RESULT-TEST");
        $ic10$ = makeKeyword("ROOT");
        $ic11$ = makeKeyword("TRANSFERS-VIA-ARG");
        $ic12$ = makeKeyword("PREDICATE-SEARCH-P");
        $ic13$ = makeKeyword("MODULE-INVERTS-ARGUMENTS");
        $ic14$ = makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");
        $ic15$ = makeKeyword("MODULE-TAG");
        $ic16$ = makeKeyword("GRAPH");
        $ic17$ = makeKeyword("DISJOINS-MODULE");
        $ic18$ = makeKeyword("TRANSFERS-THROUGH-MODULE");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic21$ = makeKeyword("ERROR");
        $ic22$ = makeString("~A is not a ~A");
        $ic23$ = makeSymbol("S#18535", "CYC");
        $ic24$ = makeKeyword("CERROR");
        $ic25$ = makeString("continue anyway");
        $ic26$ = makeKeyword("WARN");
        $ic27$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic28$ = makeString("invalid sbhl-search-direction ~a");
        $ic29$ = makeSymbol("S#16712", "CYC");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic31$ = makeKeyword("GENLS");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic34$ = makeKeyword("ISA");
        $ic35$ = makeKeyword("GENLPREDS");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("negationMt"));
        $ic38$ = makeKeyword("GENLMT");
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("disjointWith"));
        $ic40$ = makeKeyword("DISJOINTWITH");
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("negationPreds"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("negationInverse"));
        $ic43$ = makeKeyword("NEGATIONPREDS");
        $ic44$ = makeKeyword("NEGATION");
        $ic45$ = makeKeyword("SUPERIOR");
        $ic46$ = makeKeyword("INFERIOR");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("Predicate"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic50$ = makeSymbol("COLLECTION-P");
        $ic51$ = makeSymbol("S#16717", "CYC");
        $ic52$ = makeSymbol("PREDICATE-P");
        $ic53$ = makeSymbol("S#73", "CYC");
        $ic54$ = makeSymbol("S#3795", "CYC");
        $ic55$ = makeString("Data, ~a, associated with property, ~a, does not satisfy data test, ~a");
        $ic56$ = makeString("No data associated with required property ~a");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 214 ms
	
	Decompiled with Procyon 0.5.32.
*/