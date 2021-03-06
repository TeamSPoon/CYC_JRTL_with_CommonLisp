package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0267 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0267";
    public static final String myFingerPrint = "a62ee9bc91d721e2d42bd16fcfc0083d716ddf659ac917ce54e5cbd2d4ab70de";
    public static SubLSymbol $g2526$;
    public static SubLSymbol $g2527$;
    public static SubLSymbol $g2528$;
    public static SubLSymbol $g2529$;
    public static SubLSymbol $g2530$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLSymbol $ic34$;
    
    public static SubLObject f17553(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0161.f10557(var1);
        final SubLObject var5 = module0161.f10557(var2);
        SubLObject var6 = (SubLObject)NIL;
        if (NIL != module0262.f17337(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = var4;
            final SubLObject var8 = module0147.$g2095$.currentBinding(var3);
            final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var10 = module0147.$g2096$.currentBinding(var3);
            try {
                module0147.$g2095$.bind(module0147.f9545(var7), var3);
                module0147.$g2094$.bind(module0147.f9546(var7), var3);
                module0147.$g2096$.bind(module0147.f9549(var7), var3);
                if (NIL != f17554(var1, var2)) {
                    var6 = (SubLObject)T;
                }
            }
            finally {
                module0147.$g2096$.rebind(var10, var3);
                module0147.$g2094$.rebind(var9, var3);
                module0147.$g2095$.rebind(var8, var3);
            }
        }
        return var6;
    }
    
    public static SubLObject f17554(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0161.f10590(var2)) {
            return (SubLObject)T;
        }
        if (NIL != module0161.f10590(var1)) {
            return f17555(var2, var1);
        }
        return f17556(var1, var2);
    }
    
    public static SubLObject f17557(final SubLObject var1, final SubLObject var2, SubLObject var11, SubLObject var12, SubLObject var13) {
        if (var11 == UNPROVIDED) {
            var11 = module0132.$g1548$.getGlobalValue();
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0161.f10557(var1);
        final SubLObject var16 = module0161.f10557(var2);
        final SubLObject var17 = module0262.f17355(var15, var16, var11, var12, var13);
        SubLObject var18 = (SubLObject)NIL;
        if (NIL != var17) {
            final SubLObject var19 = var15;
            final SubLObject var20 = module0147.$g2095$.currentBinding(var14);
            final SubLObject var21 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var22 = module0147.$g2096$.currentBinding(var14);
            try {
                module0147.$g2095$.bind(module0147.f9545(var19), var14);
                module0147.$g2094$.bind(module0147.f9546(var19), var14);
                module0147.$g2096$.bind(module0147.f9549(var19), var14);
                var14.resetMultipleValues();
                final SubLObject var23 = f17558(var1, var2);
                final SubLObject var24 = var14.secondMultipleValue();
                var14.resetMultipleValues();
                if (NIL != var24) {
                    var18 = ConsesLow.append(var17, var23);
                }
            }
            finally {
                module0147.$g2096$.rebind(var22, var14);
                module0147.$g2094$.rebind(var21, var14);
                module0147.$g2095$.rebind(var20, var14);
            }
        }
        return var18;
    }
    
    public static SubLObject f17558(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0161.f10590(var2)) {
            return Values.values((SubLObject)NIL, (SubLObject)T);
        }
        if (NIL != module0161.f10590(var1)) {
            final SubLObject var3 = f17559(var2, var1);
            return Values.values(var3, module0035.sublisp_boolean(var3));
        }
        final SubLObject var3 = f17560(var1, var2);
        return Values.values(var3, module0035.sublisp_boolean(var3));
    }
    
    public static SubLObject f17555(final SubLObject var2, final SubLObject var1) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0161.$g2160$.getGlobalValue();
        final SubLObject var5 = module0161.$g2159$.getGlobalValue();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        var3.resetMultipleValues();
        final SubLObject var22_23 = module0161.f10612(var2, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var24_25 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        var6 = var22_23;
        var7 = var24_25;
        return f17561(var4, var6, var5, var7);
    }
    
    public static SubLObject f17556(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        var3.resetMultipleValues();
        final SubLObject var26_27 = module0161.f10612(var1, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var28_29 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        var4 = var26_27;
        var5 = var28_29;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        var3.resetMultipleValues();
        final SubLObject var30_31 = module0161.f10612(var2, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var32_33 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        var6 = var30_31;
        var7 = var32_33;
        return f17561(var4, var6, var5, var7);
    }
    
    public static SubLObject f17559(final SubLObject var2, final SubLObject var1) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0161.$g2160$.getGlobalValue();
        final SubLObject var5 = module0161.$g2159$.getGlobalValue();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        var3.resetMultipleValues();
        final SubLObject var34_35 = module0161.f10612(var2, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var36_37 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        var6 = var34_35;
        var7 = var36_37;
        return f17562(var4, var6, var5, var7);
    }
    
    public static SubLObject f17560(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        var3.resetMultipleValues();
        final SubLObject var38_39 = module0161.f10612(var1, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var40_41 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        var4 = var38_39;
        var5 = var40_41;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        var3.resetMultipleValues();
        final SubLObject var42_43 = module0161.f10612(var2, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var44_45 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        var6 = var42_43;
        var7 = var44_45;
        return f17562(var4, var6, var5, var7);
    }
    
    public static SubLObject f17563(final SubLObject var2, final SubLObject var1) {
        SubLObject var3 = module0161.f10608(var1);
        SubLObject var4 = module0161.f10608(var2);
        var3 = module0612.f37519(var3);
        var4 = module0612.f37519(var4);
        return f17564(var3, var4);
    }
    
    public static SubLObject f17561(SubLObject var48, SubLObject var49, final SubLObject var50, final SubLObject var51) {
        var48 = module0612.f37519(var48);
        var49 = module0612.f37519(var49);
        return (SubLObject)makeBoolean(NIL != f17564(var48, var49) && NIL != f17565(var50, var51) && (var48.equal(var49) || NIL != f17566(var48, var51)));
    }
    
    public static SubLObject f17562(SubLObject var48, SubLObject var49, final SubLObject var50, final SubLObject var51) {
        SubLObject var52 = (SubLObject)NIL;
        var48 = module0612.f37519(var48);
        var49 = module0612.f37519(var49);
        if (NIL != f17564(var48, var49)) {
            final SubLObject var53 = module0191.f11990((SubLObject)$ic2$, module0202.f12768($ic3$, var49, var48), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != f17565(var50, var51)) {
                final SubLObject var54 = module0191.f11990((SubLObject)$ic2$, module0202.f12768($ic4$, var50, var51), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var48.equal(var49)) {
                    var52 = (SubLObject)ConsesLow.list(var53, var54);
                }
                else if (NIL != f17566(var48, var51)) {
                    final SubLObject var55 = module0191.f11990((SubLObject)$ic2$, module0202.f12768($ic5$, var48, var51), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var52 = (SubLObject)ConsesLow.list(var53, var54, var55);
                }
            }
        }
        return var52;
    }
    
    public static SubLObject f17564(final SubLObject var55, final SubLObject var56) {
        if (NIL != module0612.f37390(var56)) {
            return (SubLObject)T;
        }
        if (NIL != module0612.f37390(var55)) {
            return (SubLObject)NIL;
        }
        if (var55.equal(var56)) {
            return (SubLObject)T;
        }
        if (NIL != module0614.f37617(var55) && NIL != module0614.f37617(var56)) {
            return module0614.f37628(var56, var55);
        }
        return module0328.f22205(var56, var55, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17565(final SubLObject var56, final SubLObject var55) {
        if (var56.eql($ic6$)) {
            return (SubLObject)T;
        }
        if (var55.eql($ic6$)) {
            return (SubLObject)NIL;
        }
        if (var55.eql($ic7$)) {
            return (SubLObject)T;
        }
        if (var56.eql($ic7$)) {
            return (SubLObject)NIL;
        }
        if (var56.equal(var55)) {
            return (SubLObject)T;
        }
        if (NIL != module0615.f37696(var56) && NIL != module0615.f37696(var55)) {
            return f17567(var55, var56);
        }
        if (NIL != module0615.f37681(var56) && NIL != module0615.f37696(var55)) {
            return f17568(var56, var55);
        }
        if (NIL != module0615.f37696(var56) && NIL != module0615.f37681(var55)) {
            return f17569(var56, var55);
        }
        return module0266.f17536($ic4$, var56, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17567(final SubLObject var57, final SubLObject var58) {
        final SubLObject var59 = module0615.f37697(var57);
        final SubLObject var60 = module0615.f37697(var58);
        final SubLObject var61 = module0615.f37698(var57);
        final SubLObject var62 = module0615.f37698(var58);
        if (var59.eql(var60)) {
            return Numbers.numLE(var61, var62);
        }
        if (NIL != module0615.f37706(var59, var60)) {
            return Numbers.numLE(var61, Numbers.multiply(module0615.f37709(var59, var60, (SubLObject)UNPROVIDED), var62));
        }
        return Numbers.numLE(Numbers.multiply(var61, module0615.f37709(var60, var59, (SubLObject)UNPROVIDED)), var62);
    }
    
    public static SubLObject f17568(final SubLObject var63, final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66 = (SubLObject)NIL;
        final SubLObject var67 = $g2527$.currentBinding(var65);
        final SubLObject var68 = module0145.$g1942$.currentBinding(var65);
        try {
            $g2527$.bind(var64, var65);
            module0145.$g1942$.bind((SubLObject)T, var65);
            var66 = module0315.f21313($ic4$, var63, (SubLObject)$ic8$, (SubLObject)UNPROVIDED);
        }
        finally {
            module0145.$g1942$.rebind(var68, var65);
            $g2527$.rebind(var67, var65);
        }
        return var66;
    }
    
    public static SubLObject f17569(final SubLObject var64, final SubLObject var63) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (NIL != module0615.f37684(var63)) {
            final SubLObject var66 = f17570(var63);
            return (SubLObject)((NIL != var66) ? f17567(var66, var64) : NIL);
        }
        SubLObject var67 = (SubLObject)NIL;
        final SubLObject var68 = $g2527$.currentBinding(var65);
        final SubLObject var69 = module0145.$g1942$.currentBinding(var65);
        try {
            $g2527$.bind(var64, var65);
            module0145.$g1942$.bind((SubLObject)T, var65);
            var67 = module0315.f21311($ic4$, var63, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        }
        finally {
            module0145.$g1942$.rebind(var69, var65);
            $g2527$.rebind(var68, var65);
        }
        return var67;
    }
    
    public static SubLObject f17571(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0615.f37696(var67)) ? f17567(var67, $g2527$.getDynamicValue(var68)) : NIL);
    }
    
    public static SubLObject f17572(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0615.f37696(var67)) ? f17567($g2527$.getDynamicValue(var68), var67) : NIL);
    }
    
    public static SubLObject f17566(final SubLObject var68, final SubLObject var69) {
        if (NIL != module0612.f37390(var68)) {
            return (SubLObject)T;
        }
        if (NIL != module0612.f37393(var68)) {
            return (SubLObject)NIL;
        }
        if (var69.eql($ic6$)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0615.f37680(var69)) {
            return (SubLObject)T;
        }
        if (NIL != module0614.f37617(var68)) {
            return module0615.f37714(var68, var69);
        }
        return f17573(var68, var69);
    }
    
    public static SubLObject f17574(final SubLObject var68, final SubLObject var69) {
        if (NIL != module0614.f37617(var68)) {
            return module0615.f37718(var68, var69);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17573(final SubLObject var68, final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        final SubLObject var71 = f17575(var68, (SubLObject)UNPROVIDED);
        final SubLObject var72 = f17576(var68, (SubLObject)UNPROVIDED);
        if (NIL != var71 && NIL != var72) {
            return module0615.f37714(f17577(var71, var72), var69);
        }
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = module0266.f17523($ic3$, var68, module0134.f8799(), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
        SubLObject var77;
        for (SubLObject var75 = var73; NIL == var75; var75 = (SubLObject)makeBoolean(NIL == var77 || NIL != var73)) {
            var70.resetMultipleValues();
            final SubLObject var76 = module0052.f3693(var74);
            var77 = var70.secondMultipleValue();
            var70.resetMultipleValues();
            if (NIL != var77 && NIL != f17578(var76, var69)) {
                var73 = (SubLObject)T;
            }
        }
        return var73;
    }
    
    public static SubLObject f17578(final SubLObject var68, final SubLObject var69) {
        return (SubLObject)makeBoolean((NIL != module0614.f37617(var68) && NIL != module0615.f37714(var68, var69)) || NIL != module0305.f20438(var68, var69, (SubLObject)UNPROVIDED) || (NIL != module0212.f13762(var68) && NIL != module0035.f2171(var69, module0220.f14562(var68, $ic5$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic11$))) || (NIL != module0212.f13762(var69) && NIL != module0035.f2171(var68, module0220.f14562(var69, $ic5$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic11$))));
    }
    
    public static SubLObject f17575(final SubLObject var68, SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var78 = module0410.f28544(module0202.f12768($ic12$, var68, (SubLObject)$ic13$), var77, (SubLObject)UNPROVIDED);
        final SubLObject var79 = Mapping.mapcar((SubLObject)$ic14$, var78);
        final SubLObject var80 = module0035.f2378(var79, (SubLObject)$ic15$, (SubLObject)UNPROVIDED);
        return var80;
    }
    
    public static SubLObject f17576(final SubLObject var68, SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var78 = module0410.f28544(module0202.f12768($ic16$, var68, (SubLObject)$ic13$), var77, (SubLObject)UNPROVIDED);
        final SubLObject var79 = Mapping.mapcar((SubLObject)$ic14$, var78);
        final SubLObject var80 = module0035.f2378(var79, (SubLObject)$ic17$, (SubLObject)UNPROVIDED);
        return var80;
    }
    
    public static SubLObject f17579(final SubLObject var81, SubLObject var82, SubLObject var11, SubLObject var83) {
        if (var82 == UNPROVIDED) {
            var82 = (SubLObject)NIL;
        }
        if (var11 == UNPROVIDED) {
            var11 = module0132.$g1548$.getGlobalValue();
        }
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)NIL;
        }
        if (NIL == var81) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var81)) {
            return (NIL != var82) ? module0076.f5290(var81, var82, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var81;
        }
        final SubLObject var84 = f17580(var81);
        final SubLObject var85 = (SubLObject)((NIL != var84) ? f17581(var81) : NIL);
        final SubLObject var86 = (SubLObject)((NIL != var85) ? f17582(var81, var11, var83) : NIL);
        SubLObject var87 = (SubLObject)NIL;
        if (NIL != var86) {
            SubLObject var88 = var85;
            SubLObject var89 = (SubLObject)NIL;
            var89 = var88.first();
            while (NIL != var88) {
                SubLObject var87_89 = var86;
                SubLObject var90 = (SubLObject)NIL;
                var90 = var87_89.first();
                while (NIL != var87_89) {
                    var87 = (SubLObject)ConsesLow.cons(module0161.f10526(var90, var84, var89), var87);
                    var87_89 = var87_89.rest();
                    var90 = var87_89.first();
                }
                var88 = var88.rest();
                var89 = var88.first();
            }
        }
        return (NIL != var82) ? module0076.f5290(var87, var82, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var87;
    }
    
    public static SubLObject f17580(SubLObject var81) {
        SubLObject var82 = Mapping.mapcar((SubLObject)$ic18$, var81);
        var82 = Sequences.remove_if((SubLObject)$ic19$, var82, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f2369((SubLObject)$ic20$, var81, (SubLObject)UNPROVIDED) && NIL == module0035.f2370((SubLObject)$ic20$, var81, (SubLObject)UNPROVIDED)) {
            var81 = module0612.f37521(var81);
        }
        final SubLObject var83 = Sequences.length(var82);
        if (var83.eql((SubLObject)ZERO_INTEGER)) {
            return $ic21$;
        }
        if (var83.eql((SubLObject)ONE_INTEGER)) {
            return var82.first();
        }
        final SubLObject var84 = Mapping.mapcar((SubLObject)$ic22$, var82);
        final SubLObject var85 = Mapping.mapcar((SubLObject)$ic23$, var82);
        final SubLObject var86 = module0612.f37518(var84);
        final SubLObject var87 = module0612.f37516(var85);
        return (SubLObject)((NIL == var86 || NIL == var87 || NIL != module0328.f22184(var86, var87, (SubLObject)UNPROVIDED)) ? NIL : f17577(var86, var87));
    }
    
    public static SubLObject f17581(final SubLObject var81) {
        final SubLObject var82 = Mapping.mapcar((SubLObject)$ic24$, var81);
        SubLObject var83 = var82.first();
        SubLObject var84 = (SubLObject)NIL;
        if (NIL == var84) {
            SubLObject var85 = var82.rest();
            SubLObject var86 = (SubLObject)NIL;
            var86 = var85.first();
            while (NIL == var84 && NIL != var85) {
                var83 = f17583(var83, var86);
                if (NIL == var83) {
                    var84 = (SubLObject)T;
                }
                var85 = var85.rest();
                var86 = var85.first();
            }
        }
        return (SubLObject)ConsesLow.list(var83);
    }
    
    public static SubLObject f17582(final SubLObject var81, final SubLObject var11, final SubLObject var83) {
        return (NIL != var83) ? module0262.f17378(Mapping.mapcar((SubLObject)$ic25$, var81), (SubLObject)NIL, var11) : module0262.f17372(Mapping.mapcar((SubLObject)$ic25$, var81), (SubLObject)NIL, var11);
    }
    
    public static SubLObject f17584(final SubLObject var101) {
        return module0035.sublisp_boolean(f17585(var101));
    }
    
    public static SubLObject f17586(final SubLObject var102, final SubLObject var103) {
        return module0035.sublisp_boolean(f17587(var102, var103));
    }
    
    public static SubLObject f17585(final SubLObject var101) {
        return (NIL == var101) ? module0161.f10543($ic21$, $ic7$) : f17587(var101.first(), f17585(var101.rest()));
    }
    
    public static SubLObject f17587(final SubLObject var102, final SubLObject var103) {
        if (NIL == var102 || NIL == var103) {
            return (SubLObject)NIL;
        }
        if (NIL != module0161.f10514(var102, var103)) {
            return var102;
        }
        final SubLObject var104 = module0161.f10609(var102);
        final SubLObject var105 = module0161.f10610(var102);
        final SubLObject var106 = module0161.f10609(var103);
        final SubLObject var107 = module0161.f10610(var103);
        final SubLObject var108 = f17588(var104, var106);
        if (NIL == var108 || NIL != module0612.f37393(var108)) {
            return (SubLObject)NIL;
        }
        if (var105.eql($ic6$)) {
            if (NIL == f17564(var104, var108)) {
                return (SubLObject)NIL;
            }
        }
        else if (NIL == f17566(var108, var105)) {
            return (SubLObject)NIL;
        }
        if (var107.eql($ic6$)) {
            if (NIL == f17564(var106, var108)) {
                return (SubLObject)NIL;
            }
        }
        else if (NIL == f17566(var108, var107)) {
            return (SubLObject)NIL;
        }
        return module0161.f10543(var108, (NIL != f17565(var105, var107)) ? var105 : var107);
    }
    
    public static SubLObject f17589(final SubLObject var109) {
        return (NIL == var109) ? $ic21$ : f17588(var109.first(), f17589(var109.rest()));
    }
    
    public static SubLObject f17588(final SubLObject var48, final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        if (NIL != module0004.f104((SubLObject)ConsesLow.list(var48, var49), $g2528$.getDynamicValue(var50), (SubLObject)EQUAL, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var51 = $g2528$.currentBinding(var50);
        try {
            $g2528$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var48, var49), $g2528$.getDynamicValue(var50)), var50);
            return f17590(var48, var49);
        }
        finally {
            $g2528$.rebind(var51, var50);
        }
    }
    
    public static SubLObject f17590(final SubLObject var48, final SubLObject var49) {
        if (NIL != f17564(var49, var48)) {
            return var49;
        }
        if (NIL != f17564(var48, var49)) {
            return var48;
        }
        if (NIL != f17591(var48, var49)) {
            return $ic27$;
        }
        final SubLObject var50 = module0614.f37640(var48);
        final SubLObject var51 = module0614.f37640(var49);
        final SubLObject var52 = module0614.f37641(var48);
        final SubLObject var53 = module0614.f37641(var49);
        if (NIL == var50 || NIL == var51 || NIL == var52 || NIL == var53) {
            return (SubLObject)NIL;
        }
        if (NIL != module0612.f37485(var50, var51)) {
            return f17577(var51, var52);
        }
        return f17577(var50, var53);
    }
    
    public static SubLObject f17591(final SubLObject var48, final SubLObject var49) {
        if (NIL != module0612.f37393(var48) || NIL != module0612.f37393(var49)) {
            return (SubLObject)T;
        }
        if (NIL != module0614.f37617(var48) && NIL != module0614.f37617(var49)) {
            return (SubLObject)makeBoolean(NIL == module0614.f37634(var48, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0328.f22226(var48, var49, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17577(final SubLObject var114, final SubLObject var115) {
        final SubLObject var116 = module0612.f37472(var114);
        final SubLObject var117 = module0612.f37474(var115);
        SubLObject var118 = (SubLObject)NIL;
        if (var116.equal(var117)) {
            return var116;
        }
        if (NIL != module0612.f37389(var116) && NIL != module0612.f37388(var117)) {
            return $ic21$;
        }
        if (NIL != module0612.f37389(var116)) {
            var118 = module0202.f12643($ic28$, var117);
        }
        else if (NIL != module0612.f37388(var117)) {
            var118 = module0202.f12643($ic29$, var116);
        }
        else {
            var118 = module0202.f12768($ic30$, var116, var117);
        }
        return module0614.f37647(var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17583(final SubLObject var105, final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        if (var105.equal(var107)) {
            return var107;
        }
        if (NIL != f17565(var105, var107)) {
            return var105;
        }
        if (NIL != f17565(var107, var105)) {
            return var107;
        }
        if (NIL != module0615.f37681(var105) && NIL != module0615.f37681(var107)) {
            SubLObject var109 = (SubLObject)NIL;
            final SubLObject var110 = module0145.$g1942$.currentBinding(var108);
            try {
                module0145.$g1942$.bind((SubLObject)T, var108);
                var109 = module0315.f21330($ic4$, (SubLObject)ConsesLow.list(var105, var107), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0145.$g1942$.rebind(var110, var108);
            }
            return var109;
        }
        if (NIL != module0615.f37696(var105) && NIL != module0615.f37696(var107)) {
            Errors.error((SubLObject)$ic31$, var105, var107);
            return (SubLObject)NIL;
        }
        final SubLObject var111 = (NIL != module0615.f37681(var105)) ? var105 : var107;
        final SubLObject var112 = var111.eql(var107) ? var105 : var107;
        if (NIL != module0615.f37684(var111)) {
            return f17592(var112, var111);
        }
        return f17593(var112, var111);
    }
    
    public static SubLObject f17592(final SubLObject var64, final SubLObject var119) {
        final SubLThread var120 = SubLProcess.currentSubLThread();
        SubLObject var121 = (SubLObject)NIL;
        final SubLObject var122 = $g2530$.currentBinding(var120);
        final SubLObject var123 = $g2527$.currentBinding(var120);
        final SubLObject var124 = $g2529$.currentBinding(var120);
        try {
            $g2530$.bind(f17570(var119), var120);
            $g2527$.bind(var64, var120);
            $g2529$.bind((SubLObject)NIL, var120);
            final SubLObject var8_120 = module0145.$g1942$.currentBinding(var120);
            try {
                module0145.$g1942$.bind((SubLObject)T, var120);
                module0315.f21289($ic4$, var119, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0145.$g1942$.rebind(var8_120, var120);
            }
            var121 = $g2529$.getDynamicValue(var120);
            if (NIL == var121) {
                var121 = $g2530$.getDynamicValue(var120);
            }
        }
        finally {
            $g2529$.rebind(var124, var120);
            $g2527$.rebind(var123, var120);
            $g2530$.rebind(var122, var120);
        }
        return var121;
    }
    
    public static SubLObject f17570(final SubLObject var69) {
        final SubLObject var70 = module0615.f37687(var69);
        final SubLObject var71 = module0615.f37691(var69);
        if (NIL != module0615.f37703(var70) && NIL != module0615.f37703(var71)) {
            return module0615.f37700(module0615.f37712(var70, var71));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17594(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = module0145.$g1925$.currentBinding(var124);
        final SubLObject var126 = module0145.$g1924$.currentBinding(var124);
        try {
            module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var124), var124);
            module0145.$g1924$.bind((SubLObject)NIL, var124);
            module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var124);
            if (NIL == f17565(var123, $g2530$.getDynamicValue(var124))) {
                final SubLObject var8_124 = module0145.$g1925$.currentBinding(var124);
                final SubLObject var9_125 = module0145.$g1924$.currentBinding(var124);
                try {
                    module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var124), var124);
                    module0145.$g1924$.bind((SubLObject)NIL, var124);
                    module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var124);
                    final SubLObject var8_125 = module0145.$g1942$.currentBinding(var124);
                    try {
                        module0145.$g1942$.bind((SubLObject)T, var124);
                        SubLObject var127 = (SubLObject)NIL;
                        try {
                            var124.throwStack.push($ic34$);
                            if (NIL != module0315.f21313($ic4$, var123, (SubLObject)$ic8$, (SubLObject)UNPROVIDED)) {
                                $g2529$.setDynamicValue(var123, var124);
                            }
                            module0314.f21182((SubLObject)T);
                        }
                        catch (Throwable var128) {
                            var127 = Errors.handleThrowable(var128, (SubLObject)$ic34$);
                        }
                        finally {
                            var124.throwStack.pop();
                        }
                    }
                    finally {
                        module0145.$g1942$.rebind(var8_125, var124);
                    }
                }
                finally {
                    module0145.$g1924$.rebind(var9_125, var124);
                    module0145.$g1925$.rebind(var8_124, var124);
                }
            }
        }
        finally {
            module0145.$g1924$.rebind(var126, var124);
            module0145.$g1925$.rebind(var125, var124);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17593(final SubLObject var64, final SubLObject var63) {
        return module0615.f37700((SubLObject)ConsesLow.list(module0615.f37683(var63), (SubLObject)TWO_INTEGER));
    }
    
    public static SubLObject f17595() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17553", "S#19845", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17554", "S#20119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17557", "S#19847", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17558", "S#20120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17555", "S#20121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17556", "S#20122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17559", "S#20123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17560", "S#20124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17563", "S#20125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17561", "S#18226", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17562", "S#20126", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17564", "S#18227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17565", "S#18229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17567", "S#20127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17568", "S#20128", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17569", "S#20129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17571", "S#20130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17572", "S#20131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17566", "S#18228", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17574", "S#20132", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17573", "S#20133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17578", "S#20134", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17575", "S#20135", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17576", "S#20136", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17579", "S#19848", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17580", "S#20137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17581", "S#20138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17582", "S#20139", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17584", "S#20140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17586", "S#12262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17585", "S#20141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17587", "S#20142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17589", "S#20143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17588", "S#20144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17590", "S#20145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17591", "S#20146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17577", "S#20147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17583", "S#20148", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17592", "S#20149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17570", "S#20150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17594", "S#20151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0267", "f17593", "S#20152", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17596() {
        $g2526$ = SubLFiles.deflexical("S#20153", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2526$.getGlobalValue() : $ic1$);
        $g2527$ = SubLFiles.defparameter("S#20154", (SubLObject)NIL);
        $g2528$ = SubLFiles.defparameter("S#20155", (SubLObject)NIL);
        $g2529$ = SubLFiles.defparameter("S#20156", (SubLObject)NIL);
        $g2530$ = SubLFiles.defparameter("S#20157", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17597() {
        module0003.f57((SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17595();
    }
    
    public void initializeVariables() {
        f17596();
    }
    
    public void runTopLevelForms() {
        f17597();
    }
    
    static {
        me = (SubLFile)new module0267();
        $g2526$ = null;
        $g2527$ = null;
        $g2528$ = null;
        $g2529$ = null;
        $g2530$ = null;
        $ic0$ = makeSymbol("S#20153", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic2$ = makeKeyword("TIME");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("TimePoint"));
        $ic8$ = makeSymbol("S#20131", "CYC");
        $ic9$ = makeSymbol("S#20130", "CYC");
        $ic10$ = makeKeyword("DEPTH-FIRST");
        $ic11$ = makeKeyword("TRUE");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("startingDate"));
        $ic13$ = makeSymbol("?X");
        $ic14$ = makeSymbol("CDAR");
        $ic15$ = makeSymbol("S#20158", "CYC");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("endingDate"));
        $ic17$ = makeSymbol("S#20159", "CYC");
        $ic18$ = makeSymbol("S#13385", "CYC");
        $ic19$ = makeSymbol("S#13438", "CYC");
        $ic20$ = makeSymbol("S#20160", "CYC");
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("Always-TimeInterval"));
        $ic22$ = makeSymbol("S#20161", "CYC");
        $ic23$ = makeSymbol("S#20162", "CYC");
        $ic24$ = makeSymbol("S#13386", "CYC");
        $ic25$ = makeSymbol("HLMT-MONAD-MT");
        $ic26$ = makeSymbol("S#5859", "CYC");
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptyTimeInterval"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn-Inclusive"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn-Inclusive"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn"));
        $ic31$ = makeString("One same length duration parameter should subsume another ~a ~a~%");
        $ic32$ = makeSymbol("S#20151", "CYC");
        $ic33$ = makeInteger(128);
        $ic34$ = makeKeyword("MAPPING-DONE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 241 ms
	
	Decompiled with Procyon 0.5.32.
*/