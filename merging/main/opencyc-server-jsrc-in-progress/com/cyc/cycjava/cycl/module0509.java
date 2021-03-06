package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0509 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0509";
    public static final String myFingerPrint = "efae72f8f77143e2b7d587957ec170eec753a7f1712b066ca67bfcd5e13dc62e";
    private static SubLSymbol $g3828$;
    private static SubLSymbol $g3829$;
    private static SubLSymbol $g3830$;
    private static SubLSymbol $g3831$;
    private static SubLSymbol $g3832$;
    private static SubLSymbol $g3833$;
    private static SubLSymbol $g3834$;
    private static SubLSymbol $g3835$;
    private static SubLSymbol $g3836$;
    private static SubLSymbol $g3837$;
    private static SubLSymbol $g3838$;
    private static SubLSymbol $g3839$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLList $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLObject $ic85$;
    
    public static SubLObject f32444(final SubLObject var1) {
        return f32445(var1);
    }
    
    public static SubLObject f32446(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Numbers.divide(Sequences.length(module0259.f16848($ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f32447(final SubLObject var1) {
        return f32448(var1);
    }
    
    public static SubLObject f32449(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Numbers.divide(Sequences.length(module0259.f16848($ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f32450(final SubLObject var4) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32451(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return (SubLObject)TEN_INTEGER;
    }
    
    public static SubLObject f32452(final SubLObject var1) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32453(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return (SubLObject)TEN_INTEGER;
    }
    
    public static SubLObject f32445(final SubLObject var1) {
        if (var1.eql($ic25$)) {
            return module0259.f16848($ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var1.eql($ic26$)) {
            return (SubLObject)$ic27$;
        }
        if (NIL != module0615.f37696(var1)) {
            return f32454(var1);
        }
        return f32455(var1);
    }
    
    public static SubLObject f32448(final SubLObject var1) {
        if (var1.eql($ic25$)) {
            return (SubLObject)$ic28$;
        }
        if (var1.eql($ic26$)) {
            return module0259.f16848($ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0615.f37696(var1)) {
            return f32456(var1);
        }
        return f32457(var1);
    }
    
    public static SubLObject f32458(final SubLObject var1) {
        return (SubLObject)ConsesLow.list(var1);
    }
    
    public static SubLObject f32459(final SubLObject var4) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32454(final SubLObject var1) {
        final SubLObject var2 = module0259.f16848($ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != module0267.f17565(var1, var5)) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var3;
    }
    
    public static SubLObject f32455(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0145.$g1942$.currentBinding(var2);
        try {
            module0145.$g1942$.bind((SubLObject)T, var2);
            var3 = module0315.f21275($ic29$, var1, (SubLObject)UNPROVIDED);
        }
        finally {
            module0145.$g1942$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f32456(final SubLObject var1) {
        final SubLObject var2 = module0259.f16848($ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != module0267.f17565(var5, var1)) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var3;
    }
    
    public static SubLObject f32457(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0145.$g1942$.currentBinding(var2);
        try {
            module0145.$g1942$.bind((SubLObject)T, var2);
            var3 = module0315.f21277($ic29$, var1, (SubLObject)UNPROVIDED);
        }
        finally {
            module0145.$g1942$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f32460() {
        return module0333.f22439((SubLObject)$ic33$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32461() {
        return module0333.f22439((SubLObject)$ic36$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32462() {
        return module0333.f22439((SubLObject)$ic39$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32463() {
        return module0333.f22439((SubLObject)$ic42$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32464() {
        return module0333.f22439((SubLObject)$ic45$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32465() {
        return module0333.f22439((SubLObject)$ic48$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32466(final SubLObject var11, final SubLObject var12) {
        return f32467(var11, var12);
    }
    
    public static SubLObject f32467(final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (var11.equal(var12)) {
            return (SubLObject)ConsesLow.list($g3833$.getDynamicValue(var13));
        }
        if (var11.eql($ic25$)) {
            return (SubLObject)ConsesLow.list($g3832$.getDynamicValue(var13));
        }
        if (var12.eql($ic26$)) {
            return (SubLObject)ConsesLow.list($g3831$.getDynamicValue(var13));
        }
        if (NIL != module0615.f37696(var11) && NIL != module0615.f37696(var12)) {
            return f32468(var12, var11);
        }
        if (NIL != module0615.f37681(var11) && NIL != module0615.f37696(var12)) {
            return f32469(var11, var12);
        }
        if (NIL != module0615.f37696(var11) && NIL != module0615.f37681(var12)) {
            return f32470(var11, var12);
        }
        return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic49$, (SubLObject)ConsesLow.list($ic29$, var11, var12), $ic50$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32468(final SubLObject var12, final SubLObject var11) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0615.f37697(var12);
        final SubLObject var15 = module0615.f37697(var11);
        final SubLObject var16 = module0615.f37698(var12);
        final SubLObject var17 = module0615.f37698(var11);
        if (var14.eql(var15)) {
            return (SubLObject)ConsesLow.list($g3834$.getDynamicValue(var13), $g3835$.getDynamicValue(var13), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic52$, var16, var17), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0615.f37706(var14, var15)) {
            final SubLObject var18 = module0615.f37709(var14, var15, (SubLObject)UNPROVIDED);
            final SubLObject var19 = Numbers.multiply(var18, var17);
            return (SubLObject)ConsesLow.list($g3834$.getDynamicValue(var13), $g3835$.getDynamicValue(var13), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic53$, var18, (SubLObject)ConsesLow.list($ic54$, reader.bq_cons(var15, (SubLObject)$ic55$), reader.bq_cons(var14, (SubLObject)$ic55$))), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic53$, (SubLObject)ConsesLow.list(var14, var19), (SubLObject)ConsesLow.list($ic56$, (SubLObject)ConsesLow.list(var14, var18), var17)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic52$, var16, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        final SubLObject var18 = module0615.f37709(var15, var14, (SubLObject)UNPROVIDED);
        final SubLObject var19 = Numbers.multiply(var18, var16);
        return (SubLObject)ConsesLow.list($g3834$.getDynamicValue(var13), $g3835$.getDynamicValue(var13), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic53$, var18, (SubLObject)ConsesLow.list($ic54$, reader.bq_cons(var14, (SubLObject)$ic55$), reader.bq_cons(var15, (SubLObject)$ic55$))), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic53$, (SubLObject)ConsesLow.list(var15, var19), (SubLObject)ConsesLow.list($ic56$, (SubLObject)ConsesLow.list(var15, var18), var16)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic52$, var19, var17), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32469(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0267.$g2527$.currentBinding(var21);
        final SubLObject var24 = module0145.$g1942$.currentBinding(var21);
        try {
            module0267.$g2527$.bind(var20, var21);
            module0145.$g1942$.bind((SubLObject)T, var21);
            var22 = module0315.f21313($ic29$, var19, (SubLObject)$ic57$, $ic50$);
        }
        finally {
            module0145.$g1942$.rebind(var24, var21);
            module0267.$g2527$.rebind(var23, var21);
        }
        if (NIL != var22) {
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic49$, (SubLObject)ConsesLow.list($ic29$, var19, var22), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic58$, (SubLObject)ConsesLow.list($ic29$, var22, var20), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32471(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (NIL != module0615.f37696(var23) && NIL != module0267.f17567(module0267.$g2527$.getDynamicValue(var24), var23)) {
            return var23;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32470(final SubLObject var20, final SubLObject var19) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != module0615.f37684(var19)) {
            final SubLObject var22 = module0267.f17570(var19);
            SubLObject var23 = (SubLObject)NIL;
            if (NIL != module0267.f17567(var22, var20)) {
                final SubLObject var24 = module0615.f37691(var19);
                final SubLObject var25 = module0615.f37687(var19);
                var23 = (SubLObject)ConsesLow.list($g3836$.getDynamicValue(var21), module0191.f11990((SubLObject)$ic59$, (SubLObject)ConsesLow.listS($ic60$, var20, (SubLObject)$ic61$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic62$, (SubLObject)ConsesLow.list($ic63$, var19, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic62$, (SubLObject)ConsesLow.list($ic64$, var19, var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic53$, module0615.f37699(var22), (SubLObject)ConsesLow.list($ic65$, var24, var25)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                if (!var22.equal(var20)) {
                    var23 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic58$, (SubLObject)ConsesLow.list($ic29$, var20, var22), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var23);
                }
                return var23;
            }
        }
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = module0267.$g2527$.currentBinding(var21);
        final SubLObject var28 = module0145.$g1942$.currentBinding(var21);
        try {
            module0267.$g2527$.bind(var20, var21);
            module0145.$g1942$.bind((SubLObject)T, var21);
            var26 = module0315.f21311($ic29$, var19, (SubLObject)$ic66$, $ic50$);
        }
        finally {
            module0145.$g1942$.rebind(var28, var21);
            module0267.$g2527$.rebind(var27, var21);
        }
        if (NIL != var26) {
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic49$, (SubLObject)ConsesLow.list($ic29$, var26, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic58$, (SubLObject)ConsesLow.list($ic29$, var20, var26), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32472(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (NIL != module0615.f37696(var23) && NIL != module0267.f17567(var23, module0267.$g2527$.getDynamicValue(var24))) {
            return var23;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32473() {
        return module0333.f22439((SubLObject)$ic69$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32474() {
        return module0333.f22439((SubLObject)$ic72$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32475() {
        return module0333.f22439((SubLObject)$ic75$, module0267.$g2526$.getGlobalValue());
    }
    
    public static SubLObject f32476(final SubLObject var4, final SubLObject var1) {
        return f32477(var4, var1);
    }
    
    public static SubLObject f32477(final SubLObject var4, final SubLObject var1) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (var4.eql($ic76$)) {
            return (SubLObject)ConsesLow.list($g3837$.getDynamicValue(var5));
        }
        if (var1.eql($ic26$)) {
            return (SubLObject)ConsesLow.list($g3838$.getDynamicValue(var5));
        }
        if (NIL != module0614.f37617(var4)) {
            return f32478(var4, var1);
        }
        return f32479(var4, var1);
    }
    
    public static SubLObject f32478(final SubLObject var4, final SubLObject var1) {
        final SubLObject var5 = module0615.f37717(var4, var1, (SubLObject)ZERO_INTEGER);
        return (SubLObject)(var5.equal(var4) ? ConsesLow.list(module0191.f11990((SubLObject)$ic59$, (SubLObject)ConsesLow.list($ic60$, var5, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : ConsesLow.list(module0191.f11990((SubLObject)$ic59$, (SubLObject)ConsesLow.list($ic60$, var5, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic58$, (SubLObject)ConsesLow.list($ic77$, var4, var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f32480(final SubLObject var1, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0615.f37716(var1);
        final SubLObject var7 = module0615.f37722(var4);
        return (SubLObject)((NIL != var6 && NIL != var7) ? ConsesLow.list(f32481(var1, var4), module0191.f11990((SubLObject)$ic62$, (SubLObject)ConsesLow.list($ic64$, var1, var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic78$, (SubLObject)ConsesLow.list($ic79$, var4, var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic51$, (SubLObject)ConsesLow.list($ic52$, var6, var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), $g3839$.getDynamicValue(var5)) : NIL);
    }
    
    public static SubLObject f32481(final SubLObject var1, final SubLObject var4) {
        return module0191.f11990((SubLObject)$ic78$, (SubLObject)ConsesLow.list($ic80$, (SubLObject)$ic81$, (SubLObject)ConsesLow.list($ic82$, (SubLObject)ConsesLow.list($ic60$, (SubLObject)$ic81$, var1), (SubLObject)ConsesLow.list($ic83$, (SubLObject)$ic81$, var4))), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32479(final SubLObject var4, final SubLObject var1) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0266.f17523($ic77$, var4, module0134.f8799(), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic84$, (SubLObject)UNPROVIDED);
        SubLObject var10;
        for (SubLObject var8 = var6; NIL == var8; var8 = (SubLObject)makeBoolean(NIL == var10 || NIL != var6)) {
            var5.resetMultipleValues();
            final SubLObject var9 = module0052.f3693(var7);
            var10 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            if (NIL != var10 && NIL != module0267.f17578(var6, var1)) {
                var6 = var9;
            }
        }
        if (NIL == var6) {
            return (SubLObject)NIL;
        }
        if (NIL != module0614.f37617(var6)) {
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic49$, (SubLObject)ConsesLow.list($ic77$, var4, var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic58$, (SubLObject)ConsesLow.list($ic85$, var6, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic49$, (SubLObject)ConsesLow.list($ic77$, var4, var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0288.f19338((SubLObject)ConsesLow.list($ic85$, var4, var6), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32482() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32444", "S#35867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32446", "S#35868", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32447", "S#35869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32449", "S#35870", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32450", "S#35871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32451", "S#35872", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32452", "S#35873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32453", "S#35874", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32445", "S#35875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32448", "S#35876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32458", "S#35877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32459", "S#35878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32454", "S#35879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32455", "S#35880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32456", "S#35881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32457", "S#35882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32460", "S#35883", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32461", "S#35884", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32462", "S#35885", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32463", "S#35886", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32464", "S#35887", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32465", "S#35888", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32466", "S#24967", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32467", "S#35889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32468", "S#35890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32469", "S#35891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32471", "S#35892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32470", "S#35893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32472", "S#35894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32473", "S#35895", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32474", "S#35896", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32475", "S#35897", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32476", "S#24968", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32477", "S#35898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32478", "S#35899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32480", "S#35900", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32481", "S#35901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0509", "f32479", "S#35902", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32483() {
        $g3828$ = SubLFiles.defparameter("S#35903", (SubLObject)ONE_INTEGER);
        $g3829$ = SubLFiles.defparameter("S#35904", (SubLObject)ONE_INTEGER);
        $g3830$ = SubLFiles.defparameter("S#35905", (SubLObject)ONE_INTEGER);
        $g3831$ = SubLFiles.defvar("S#35906", (SubLObject)$ic30$);
        $g3832$ = SubLFiles.defvar("S#35907", (SubLObject)$ic30$);
        $g3833$ = SubLFiles.defvar("S#35908", (SubLObject)$ic30$);
        $g3834$ = SubLFiles.defvar("S#35909", (SubLObject)$ic30$);
        $g3835$ = SubLFiles.defvar("S#35910", (SubLObject)$ic30$);
        $g3836$ = SubLFiles.defvar("S#35911", (SubLObject)$ic30$);
        $g3837$ = SubLFiles.defvar("S#35912", (SubLObject)$ic30$);
        $g3838$ = SubLFiles.defvar("S#35913", (SubLObject)$ic30$);
        $g3839$ = SubLFiles.defvar("S#35914", (SubLObject)$ic30$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32484() {
        module0358.f23730((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0358.f23730((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0358.f23730((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0358.f23730((SubLObject)$ic13$, (SubLObject)$ic14$);
        module0340.f22941((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22941((SubLObject)$ic19$, (SubLObject)$ic20$);
        module0340.f22938($ic21$);
        module0358.f23773((SubLObject)$ic22$, $ic21$);
        module0340.f22941((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0012.f581((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0012.f581((SubLObject)$ic34$, (SubLObject)$ic35$);
        module0012.f581((SubLObject)$ic37$, (SubLObject)$ic38$);
        module0012.f581((SubLObject)$ic40$, (SubLObject)$ic41$);
        module0012.f581((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0012.f581((SubLObject)$ic46$, (SubLObject)$ic47$);
        module0012.f581((SubLObject)$ic67$, (SubLObject)$ic68$);
        module0012.f581((SubLObject)$ic70$, (SubLObject)$ic71$);
        module0012.f581((SubLObject)$ic73$, (SubLObject)$ic74$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32482();
    }
    
    public void initializeVariables() {
        f32483();
    }
    
    public void runTopLevelForms() {
        f32484();
    }
    
    static {
        me = (SubLFile)new module0509();
        $g3828$ = null;
        $g3829$ = null;
        $g3830$ = null;
        $g3831$ = null;
        $g3832$ = null;
        $g3833$ = null;
        $g3834$ = null;
        $g3835$ = null;
        $g3836$ = null;
        $g3837$ = null;
        $g3838$ = null;
        $g3839$ = null;
        $ic0$ = makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-DELAY-POS");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISALLOWED"));
        $ic2$ = makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE-POS");
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic4$ = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35903", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35915", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35916", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35915", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35916", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35915", "CYC"), (SubLObject)makeSymbol("S#35916", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18229", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35915", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35916", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE1 TYPE2)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay #$CalendarHour)") });
        $ic6$ = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35868", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35915", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35915", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35867", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35915", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE ?X)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay ?WHAT) ->\n    #$CalendarHour, #$CalendarMinute, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 1)), etc ") });
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("TimeParameter"));
        $ic9$ = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-GENERATE");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35870", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35916", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35916", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35869", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35916", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType ?X TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType ?WHAT #$CalendarDay) ->\n    #$CalendarWeek, #$CalendarMonth, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 2)), etc") });
        $ic11$ = makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-DELAY-POS");
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISALLOWED"));
        $ic13$ = makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-POS");
        $ic14$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic15$ = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-CHECK");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35904", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24567", "CYC"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18228", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 #$CalendarYear)") });
        $ic17$ = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35872", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35871", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType Interval ?X)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 ?WHAT) ->\n    #$CalendarYear, #$CalendarDay, (#$SameLengthTimeIntervalTypeFn (#$YearsDuration 1)), etc") });
        $ic19$ = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS");
        $ic20$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35874", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35873", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType ?WHAT TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType ?WHAT #$CalendarDay) ->\n    #$TheYear2000, (#$DayFn 4 (#$MonthFn #$July (#$YearFn 1776))), etc") });
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumedBy-InsType"));
        $ic22$ = makeKeyword("POS");
        $ic23$ = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK");
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumedBy-InsType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumedBy-InsType")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35905", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumedBy-InsType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24567", "CYC"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#20132", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumedBy-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumedBy-InsType #$TheYear2000 #$CalendarYear)") });
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("TimePoint"));
        $ic27$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimePoint")));
        $ic28$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter")));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType"));
        $ic30$ = makeKeyword("UNINITIALIZED");
        $ic31$ = makeSymbol("S#35906", "CYC");
        $ic32$ = makeSymbol("S#35883", "CYC");
        $ic33$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("TimeParameter"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("different")), constant_handles_oc.f8479((SubLObject)makeString("TimePoint")), (SubLObject)makeSymbol("?X"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("TimePoint"))));
        $ic34$ = makeSymbol("S#35907", "CYC");
        $ic35$ = makeSymbol("S#35884", "CYC");
        $ic36$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("TimeParameter"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("different")), constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter")), (SubLObject)makeSymbol("?X"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter")), (SubLObject)makeSymbol("?X")));
        $ic37$ = makeSymbol("S#35908", "CYC");
        $ic38$ = makeSymbol("S#35885", "CYC");
        $ic39$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), constant_handles_oc.f8479((SubLObject)makeString("ReflexiveBinaryPredicate")));
        $ic40$ = makeSymbol("S#35909", "CYC");
        $ic41$ = makeSymbol("S#35886", "CYC");
        $ic42$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllExists")), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeSymbol("?LONGER-TYPE"), (SubLObject)makeSymbol("?SHORTER-TYPE")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)makeSymbol("?LONGER-TYPE"), (SubLObject)makeSymbol("?SHORTER-TYPE")));
        $ic43$ = makeSymbol("S#35910", "CYC");
        $ic44$ = makeSymbol("S#35887", "CYC");
        $ic45$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?INT1"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SameLengthTimeIntervalTypeFn")), (SubLObject)makeSymbol("?DUR1"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?INT2"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SameLengthTimeIntervalTypeFn")), (SubLObject)makeSymbol("?DUR2"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lessThanOrEqualTo")), (SubLObject)makeSymbol("?DUR1"), (SubLObject)makeSymbol("?DUR2"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeSymbol("?INT2"), (SubLObject)makeSymbol("?INT1")));
        $ic46$ = makeSymbol("S#35911", "CYC");
        $ic47$ = makeSymbol("S#35888", "CYC");
        $ic48$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?TYPE"), constant_handles_oc.f8479((SubLObject)makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("periodOfTimeIntervalSeries")), (SubLObject)makeSymbol("?TYPE"), (SubLObject)makeSymbol("?DURATION1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("durationOfType")), (SubLObject)makeSymbol("?TYPE"), (SubLObject)makeSymbol("?DURATION2"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SameLengthTimeIntervalTypeFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PlusFn")), (SubLObject)makeSymbol("?DURATION1"), (SubLObject)makeSymbol("?DURATION2"))), (SubLObject)makeSymbol("?TYPE")));
        $ic49$ = makeKeyword("TRANSITIVITY");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic51$ = makeKeyword("EVAL");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("lessThanOrEqualTo"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)makeString("evaluate"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("QuotientFn"));
        $ic55$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("TimesFn"));
        $ic57$ = makeSymbol("S#35892", "CYC");
        $ic58$ = makeKeyword("TIME");
        $ic59$ = makeKeyword("ISA");
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic61$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")));
        $ic62$ = makeKeyword("QUERY");
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("periodOfTimeIntervalSeries"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("durationOfType"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("PlusFn"));
        $ic66$ = makeSymbol("S#35894", "CYC");
        $ic67$ = makeSymbol("S#35912", "CYC");
        $ic68$ = makeSymbol("S#35895", "CYC");
        $ic69$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceAll")), constant_handles_oc.f8479((SubLObject)makeString("timeSlices")), constant_handles_oc.f8479((SubLObject)makeString("Always-TimeInterval")), constant_handles_oc.f8479((SubLObject)makeString("TimeInterval")));
        $ic70$ = makeSymbol("S#35913", "CYC");
        $ic71$ = makeSymbol("S#35896", "CYC");
        $ic72$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance")), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), constant_handles_oc.f8479((SubLObject)makeString("TimeInterval")), constant_handles_oc.f8479((SubLObject)makeString("TimePoint")));
        $ic73$ = makeSymbol("S#35914", "CYC");
        $ic74$ = makeSymbol("S#35897", "CYC");
        $ic75$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?INTERVAL1"), constant_handles_oc.f8479((SubLObject)makeString("TimeInterval"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?INTERVAL2"), constant_handles_oc.f8479((SubLObject)makeString("TimeInterval"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("duration")), (SubLObject)makeSymbol("?INTERVAL1"), (SubLObject)makeSymbol("?DUR1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("duration")), (SubLObject)makeSymbol("?INTERVAL2"), (SubLObject)makeSymbol("?DUR2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lessThanOrEqualTo")), (SubLObject)makeSymbol("?DUR2"), (SubLObject)makeSymbol("?DUR1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)makeSymbol("?INTERVAL1"), (SubLObject)makeSymbol("?INTERVAL2"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeSymbol("?INTERVAL1"), (SubLObject)makeSymbol("?INTERVAL2")));
        $ic76$ = constant_handles_oc.f8479((SubLObject)makeString("Always-TimeInterval"));
        $ic77$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes"));
        $ic78$ = makeKeyword("OPAQUE");
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("duration"));
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic81$ = makeSymbol("?INTERVAL");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating"));
        $ic84$ = makeKeyword("DEPTH-FIRST");
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 252 ms
	
	Decompiled with Procyon 0.5.32.
*/