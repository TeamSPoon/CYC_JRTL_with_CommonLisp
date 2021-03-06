package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0310 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0310";
    public static final String myFingerPrint = "57d94bed5c205b8c13c1a589b5401ffebe74aecc181ea7ec6f6572f9a8173bdd";
    private static SubLSymbol $g2798$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLInteger $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    
    public static SubLObject f21091(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        final SubLObject var6 = cdestructuring_bind.property_list_member((SubLObject)$ic0$, var5);
        final SubLObject var7 = (SubLObject)((NIL != var6) ? conses_high.cadr(var6) : NIL);
        final SubLObject var8 = cdestructuring_bind.property_list_member((SubLObject)$ic1$, var5);
        final SubLObject var9 = (SubLObject)((NIL != var8) ? conses_high.cadr(var8) : NIL);
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic2$, var5);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var5);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = f21092(var1, var2);
        final SubLObject var15 = f21093(var1, var2);
        final SubLObject var16 = f21094(var1, var2);
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)ZERO_INTEGER);
        SubLObject var19 = var14;
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            if (NIL != f21095(var20, var9)) {
                final SubLObject var21 = $ic4$;
                if (NIL != module0158.f10010(var20, (SubLObject)THREE_INTEGER, var21)) {
                    final SubLObject var22 = module0158.f10011(var20, (SubLObject)THREE_INTEGER, var21);
                    SubLObject var23 = (SubLObject)NIL;
                    final SubLObject var24 = (SubLObject)NIL;
                    while (NIL == var23) {
                        final SubLObject var25 = module0052.f3695(var22, var24);
                        final SubLObject var26 = (SubLObject)makeBoolean(!var24.eql(var25));
                        if (NIL != var26) {
                            SubLObject var27 = (SubLObject)NIL;
                            try {
                                var27 = module0158.f10316(var25, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)NIL);
                                SubLObject var23_28 = (SubLObject)NIL;
                                final SubLObject var24_29 = (SubLObject)NIL;
                                while (NIL == var23_28) {
                                    final SubLObject var28 = module0052.f3695(var27, var24_29);
                                    final SubLObject var26_31 = (SubLObject)makeBoolean(!var24_29.eql(var28));
                                    if (NIL != var26_31) {
                                        final SubLObject var29 = module0178.f11334(var28);
                                        if (NIL != f21096(var29, var7, var2) && NIL != f21097(var29, var13)) {
                                            final SubLObject var30 = module0178.f11335(var28);
                                            SubLObject var31 = (SubLObject)NIL;
                                            SubLObject var32 = (SubLObject)NIL;
                                            SubLObject var33 = (SubLObject)NIL;
                                            final SubLObject var21_37 = $ic7$;
                                            if (NIL != module0158.f10010(var29, (SubLObject)ONE_INTEGER, var21_37)) {
                                                final SubLObject var22_38 = module0158.f10011(var29, (SubLObject)ONE_INTEGER, var21_37);
                                                SubLObject var23_29 = var33;
                                                final SubLObject var24_30 = (SubLObject)NIL;
                                                while (NIL == var23_29) {
                                                    final SubLObject var25_41 = module0052.f3695(var22_38, var24_30);
                                                    final SubLObject var26_32 = (SubLObject)makeBoolean(!var24_30.eql(var25_41));
                                                    if (NIL != var26_32) {
                                                        SubLObject var27_43 = (SubLObject)NIL;
                                                        try {
                                                            var27_43 = module0158.f10316(var25_41, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)NIL);
                                                            SubLObject var23_30 = var33;
                                                            final SubLObject var24_31 = (SubLObject)NIL;
                                                            while (NIL == var23_30) {
                                                                final SubLObject var34 = module0052.f3695(var27_43, var24_31);
                                                                final SubLObject var26_33 = (SubLObject)makeBoolean(!var24_31.eql(var34));
                                                                if (NIL != var26_33 && var30.numE(module0178.f11335(var34))) {
                                                                    var31 = (SubLObject)T;
                                                                    final SubLObject var35 = module0178.f11336(var34);
                                                                    if (NIL != f21095(var35, var11)) {
                                                                        var32 = (SubLObject)T;
                                                                    }
                                                                    if (NIL == module0077.f5320(var35, var15)) {
                                                                        var33 = (SubLObject)$ic8$;
                                                                    }
                                                                }
                                                                var23_30 = (SubLObject)makeBoolean(NIL == var26_33 || NIL != var33);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var36 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                                            try {
                                                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                                                if (NIL != var27_43) {
                                                                    module0158.f10319(var27_43);
                                                                }
                                                            }
                                                            finally {
                                                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var36);
                                                            }
                                                        }
                                                    }
                                                    var23_29 = (SubLObject)makeBoolean(NIL == var26_32 || NIL != var33);
                                                }
                                            }
                                            final SubLObject var21_38 = $ic9$;
                                            if (NIL != module0158.f10010(var29, (SubLObject)ONE_INTEGER, var21_38)) {
                                                final SubLObject var22_39 = module0158.f10011(var29, (SubLObject)ONE_INTEGER, var21_38);
                                                SubLObject var23_31 = var33;
                                                final SubLObject var24_32 = (SubLObject)NIL;
                                                while (NIL == var23_31) {
                                                    final SubLObject var25_42 = module0052.f3695(var22_39, var24_32);
                                                    final SubLObject var26_34 = (SubLObject)makeBoolean(!var24_32.eql(var25_42));
                                                    if (NIL != var26_34) {
                                                        SubLObject var27_44 = (SubLObject)NIL;
                                                        try {
                                                            var27_44 = module0158.f10316(var25_42, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)NIL);
                                                            SubLObject var23_32 = var33;
                                                            final SubLObject var24_33 = (SubLObject)NIL;
                                                            while (NIL == var23_32) {
                                                                final SubLObject var37 = module0052.f3695(var27_44, var24_33);
                                                                final SubLObject var26_35 = (SubLObject)makeBoolean(!var24_33.eql(var37));
                                                                if (NIL != var26_35 && var30.numE(module0178.f11335(var37))) {
                                                                    final SubLObject var38 = module0178.f11336(var37);
                                                                    if (NIL == module0077.f5320(var38, var16)) {
                                                                        var33 = (SubLObject)$ic10$;
                                                                    }
                                                                }
                                                                var23_32 = (SubLObject)makeBoolean(NIL == var26_35 || NIL != var33);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var39 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                                            try {
                                                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                                                if (NIL != var27_44) {
                                                                    module0158.f10319(var27_44);
                                                                }
                                                            }
                                                            finally {
                                                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var39);
                                                            }
                                                        }
                                                    }
                                                    var23_31 = (SubLObject)makeBoolean(NIL == var26_34 || NIL != var33);
                                                }
                                            }
                                            if (NIL != var31 && NIL == var32) {
                                                var33 = (SubLObject)$ic11$;
                                            }
                                            if (NIL == var33 && NIL != module0077.f5326(var29, var18)) {
                                                var17 = (SubLObject)ConsesLow.cons(var29, var17);
                                            }
                                        }
                                    }
                                    var23_28 = (SubLObject)makeBoolean(NIL == var26_31);
                                }
                            }
                            finally {
                                final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var27) {
                                        module0158.f10319(var27);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                                }
                            }
                        }
                        var23 = (SubLObject)makeBoolean(NIL == var26);
                    }
                }
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f21098(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        var3 = conses_high.copy_list(var3);
        var3 = conses_high.putf(var3, (SubLObject)$ic0$, $ic12$);
        return f21091(var1, var2, var3);
    }
    
    public static SubLObject f21099(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        var3 = conses_high.copy_list(var3);
        var3 = conses_high.putf(var3, (SubLObject)$ic0$, $ic13$);
        return f21091(var1, var2, var3);
    }
    
    public static SubLObject f21095(final SubLObject var62, final SubLObject var63) {
        if (NIL == var63) {
            return (SubLObject)T;
        }
        return module0549.f33910(var62, var63);
    }
    
    public static SubLObject f21096(final SubLObject var32, final SubLObject var7, final SubLObject var2) {
        if (NIL == var7) {
            return (SubLObject)T;
        }
        if (var7.eql($ic12$)) {
            return module0269.f17706(var32);
        }
        if (var7.eql($ic13$)) {
            return module0269.f17708(var32);
        }
        return module0259.f16854(var32, var7, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21097(final SubLObject var32, final SubLObject var64) {
        if (NIL == var64) {
            return (SubLObject)T;
        }
        if (NIL != module0269.f17706(var32)) {
            return Numbers.numGE(module0217.f14247(var32, (SubLObject)UNPROVIDED), var64);
        }
        return Numbers.numGE(module0217.f14357(var32), var64);
    }
    
    public static SubLObject f21092(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var1)) {
            var3 = module0259.f16840(var1, var2, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0206.f13453(var1)) {
            var3 = module0259.f16840(var1, var2, (SubLObject)UNPROVIDED);
        }
        else {
            var3 = module0306.f20661(var1, var2);
        }
        return module0549.f33908(var3, (SubLObject)$ic14$);
    }
    
    public static SubLObject f21093(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != module0269.f17713(var1, var2)) {
            var3 = module0256.f16531(var1, var2, (SubLObject)UNPROVIDED);
        }
        return module0078.f5367(var3, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21094(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var1)) {
            var3 = module0259.f16990(var1, var2, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0206.f13453(var1)) {
            var3 = module0259.f16990(var1, var2, (SubLObject)UNPROVIDED);
        }
        else {
            var3 = module0306.f20660(var1, var2);
        }
        return module0078.f5367(var3, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21100(final SubLObject var66, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.consp(var66) : var66;
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var66, var66, (SubLObject)$ic16$);
        var67 = var66.first();
        final SubLObject var69 = var68 = var66.rest();
        SubLObject var70 = f21098(var67, var2, var3);
        SubLObject var71 = module0031.f1685(Sequences.length(var70), Symbols.symbol_function((SubLObject)EQ));
        SubLObject var72 = var68;
        SubLObject var73 = (SubLObject)NIL;
        var73 = var72.first();
        while (NIL != var72) {
            final SubLObject var74 = f21098(var73, var2, var3);
            var71 = f21101(var71, var74);
            var70 = Sequences.delete(var71, var70, Symbols.symbol_function((SubLObject)$ic17$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var72 = var72.rest();
            var73 = var72.first();
        }
        return var70;
    }
    
    public static SubLObject f21102(final SubLObject var66, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var67 = f21103(var66, var2, var3);
        final SubLObject var68 = conses_high.getf(var3, (SubLObject)$ic18$, (SubLObject)NIL);
        return f21104(var66, var67, var2, var68);
    }
    
    public static SubLObject f21104(final SubLObject var66, final SubLObject var73, SubLObject var2, SubLObject var75) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)ZERO_INTEGER;
        SubLObject var79 = (SubLObject)NIL;
        final SubLObject var80 = module0152.$g2102$.currentBinding(var76);
        try {
            module0152.$g2102$.bind(module0151.f9695(), var76);
            final SubLObject var81 = module0152.$g2102$.getDynamicValue(var76);
            final SubLObject var49_81 = module0034.$g879$.currentBinding(var76);
            try {
                module0034.$g879$.bind(var81, var76);
                SubLObject var82 = (SubLObject)NIL;
                if (NIL != var81 && NIL == module0034.f1842(var81)) {
                    var82 = module0034.f1869(var81);
                    final SubLObject var83 = Threads.current_process();
                    if (NIL == var82) {
                        module0034.f1873(var81, var83);
                    }
                    else if (!var82.eql(var83)) {
                        Errors.error((SubLObject)$ic19$);
                    }
                }
                try {
                    if (NIL == module0151.f9690()) {
                        module0274.f18061();
                    }
                }
                finally {
                    final SubLObject var49_82 = Threads.$is_thread_performing_cleanupP$.currentBinding(var76);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var76);
                        final SubLObject var84 = module0139.$g1630$.getDynamicValue(var76);
                        final SubLObject var49_83 = module0139.$g1631$.currentBinding(var76);
                        final SubLObject var85 = module0139.$g1632$.currentBinding(var76);
                        final SubLObject var86 = module0139.$g1630$.currentBinding(var76);
                        try {
                            module0139.$g1631$.bind(module0139.f9015(var84, (SubLObject)TWELVE_INTEGER), var76);
                            module0139.$g1632$.bind(module0139.f9016(var84), var76);
                            module0139.$g1630$.bind((SubLObject)T, var76);
                            module0012.$g82$.setDynamicValue((SubLObject)$ic20$, var76);
                            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var76);
                            module0012.$g83$.setDynamicValue(Sequences.length(var73), var76);
                            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var76);
                            final SubLObject var49_84 = module0012.$g75$.currentBinding(var76);
                            final SubLObject var87_91 = module0012.$g76$.currentBinding(var76);
                            final SubLObject var88_92 = module0012.$g77$.currentBinding(var76);
                            final SubLObject var87 = module0012.$g78$.currentBinding(var76);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var76);
                                module0012.$g76$.bind((SubLObject)NIL, var76);
                                module0012.$g77$.bind((SubLObject)T, var76);
                                module0012.$g78$.bind(Time.get_universal_time(), var76);
                                module0012.f478(module0012.$g82$.getDynamicValue(var76));
                                SubLObject var88 = var73;
                                SubLObject var89 = (SubLObject)NIL;
                                var89 = var88.first();
                                while (NIL != var88) {
                                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var76), module0012.$g83$.getDynamicValue(var76));
                                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var76), (SubLObject)ONE_INTEGER), var76);
                                    if (NIL == var79) {
                                        final SubLObject var90 = f21105(var66, var89, var2);
                                        var78 = Numbers.add(var78, Sequences.length(var90));
                                        if (NIL != var75) {
                                            var79 = (SubLObject)makeBoolean(NIL != var75 && var78.numGE(var75));
                                        }
                                        var77 = conses_high.nreconc(var90, var77);
                                    }
                                    var88 = var88.rest();
                                    var89 = var88.first();
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var87, var76);
                                module0012.$g77$.rebind(var88_92, var76);
                                module0012.$g76$.rebind(var87_91, var76);
                                module0012.$g75$.rebind(var49_84, var76);
                            }
                        }
                        finally {
                            module0139.$g1630$.rebind(var86, var76);
                            module0139.$g1632$.rebind(var85, var76);
                            module0139.$g1631$.rebind(var49_83, var76);
                        }
                        if (NIL != var81 && NIL == var82) {
                            module0034.f1873(var81, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var49_82, var76);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var49_81, var76);
            }
        }
        finally {
            module0152.$g2102$.rebind(var80, var76);
        }
        var77 = Sequences.nreverse(var77);
        if (NIL != var75) {
            var77 = module0035.f2124(var75, var77);
        }
        return var77;
    }
    
    public static SubLObject f21105(final SubLObject var66, final SubLObject var95, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var96 = (SubLObject)NIL;
        SubLObject var97 = module0035.f2475(var66, (SubLObject)UNPROVIDED);
        SubLObject var98 = (SubLObject)NIL;
        var98 = var97.first();
        while (NIL != var97) {
            final SubLObject var99 = module0202.f12720(var95, var98, (SubLObject)UNPROVIDED);
            if (NIL != module0274.f18060(var99, var2, (SubLObject)UNPROVIDED)) {
                var96 = (SubLObject)ConsesLow.cons(var99, var96);
            }
            var97 = var97.rest();
            var98 = var97.first();
        }
        return Sequences.nreverse(var96);
    }
    
    public static SubLObject f21103(final SubLObject var66, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var67 = f21100(var66, var2, var3);
        final SubLObject var68 = Sequences.length(var66);
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = var67;
        SubLObject var71 = (SubLObject)NIL;
        var71 = var70.first();
        while (NIL != var70) {
            if (module0225.f14739(var71).eql(var68)) {
                var69 = (SubLObject)ConsesLow.cons(var71, var69);
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        var69 = f21106(var69);
        return var69;
    }
    
    public static SubLObject f21107(final SubLObject var66, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var67 = f21103(var66, var2, var3);
        return module0052.f3709(var67);
    }
    
    public static SubLObject f21108(final SubLObject var66, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0052.f3689(f21109(var66, var2, var3), (SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21109(final SubLObject var66, final SubLObject var2, final SubLObject var3) {
        final SubLObject var67 = module0055.f4017();
        final SubLObject var68 = f21107(var66, var2, var3);
        final SubLObject var69 = (SubLObject)ZERO_INTEGER;
        final SubLObject var70 = conses_high.getf(var3, (SubLObject)$ic18$, (SubLObject)NIL);
        final SubLObject var71 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var72 = module0139.f9019((SubLObject)TWELVE_INTEGER);
        final SubLObject var73 = module0147.f9552(var2);
        final SubLObject var74 = (SubLObject)ConsesLow.list(var67, var68, var69, var70, var71, var72, var66, var73);
        return var74;
    }
    
    public static SubLObject f21110(final SubLObject var104) {
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        SubLObject var108 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var104, (SubLObject)$ic23$);
        var105 = var104.first();
        SubLObject var109 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var109, var104, (SubLObject)$ic23$);
        var106 = var109.first();
        var109 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var109, var104, (SubLObject)$ic23$);
        var107 = var109.first();
        var109 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var109, var104, (SubLObject)$ic23$);
        var108 = var109.first();
        final SubLObject var110;
        var109 = (var110 = var109.rest());
        return (SubLObject)makeBoolean((NIL != module0055.f4019(var105) && NIL != module0052.f3687(var106)) || (NIL != var108 && var107.numGE(var108)));
    }
    
    public static SubLObject f21111(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var104, (SubLObject)$ic24$);
        var106 = var104.first();
        SubLObject var114 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var104, (SubLObject)$ic24$);
        var107 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var104, (SubLObject)$ic24$);
        var108 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var104, (SubLObject)$ic24$);
        var109 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var104, (SubLObject)$ic24$);
        var110 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var104, (SubLObject)$ic24$);
        var111 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var104, (SubLObject)$ic24$);
        var112 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var104, (SubLObject)$ic24$);
        var113 = var114.first();
        var114 = var114.rest();
        if (NIL != var114) {
            cdestructuring_bind.cdestructuring_bind_error(var104, (SubLObject)$ic24$);
            return (SubLObject)NIL;
        }
        while (NIL != module0055.f4019(var106) && NIL == module0052.f3687(var107)) {
            final SubLObject var115 = module0052.f3693(var107);
            final SubLObject var116 = module0152.$g2102$.currentBinding(var105);
            try {
                module0152.$g2102$.bind(var110, var105);
                final SubLObject var117 = module0152.$g2102$.getDynamicValue(var105);
                final SubLObject var49_110 = module0034.$g879$.currentBinding(var105);
                try {
                    module0034.$g879$.bind(var117, var105);
                    SubLObject var118 = (SubLObject)NIL;
                    if (NIL != var117 && NIL == module0034.f1842(var117)) {
                        var118 = module0034.f1869(var117);
                        final SubLObject var119 = Threads.current_process();
                        if (NIL == var118) {
                            module0034.f1873(var117, var119);
                        }
                        else if (!var118.eql(var119)) {
                            Errors.error((SubLObject)$ic19$);
                        }
                    }
                    try {
                        if (NIL == module0151.f9690()) {
                            module0274.f18061();
                        }
                    }
                    finally {
                        final SubLObject var49_111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var105);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var105);
                            final SubLObject var49_112 = module0139.$g1632$.currentBinding(var105);
                            final SubLObject var120 = module0139.$g1630$.currentBinding(var105);
                            final SubLObject var121 = module0139.$g1631$.currentBinding(var105);
                            try {
                                module0139.$g1632$.bind(var111, var105);
                                module0139.$g1630$.bind((SubLObject)T, var105);
                                module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var105)), var105);
                                if (NIL != module0147.f9491(var113, (SubLObject)$ic25$)) {
                                    final SubLObject var49_113 = module0147.$g2094$.currentBinding(var105);
                                    final SubLObject var87_114 = module0147.$g2095$.currentBinding(var105);
                                    try {
                                        module0147.$g2094$.bind((SubLObject)$ic25$, var105);
                                        module0147.$g2095$.bind($ic26$, var105);
                                        SubLObject var123;
                                        final SubLObject var122 = var123 = f21105(var112, var115, (SubLObject)UNPROVIDED);
                                        SubLObject var124 = (SubLObject)NIL;
                                        var124 = var123.first();
                                        while (NIL != var123) {
                                            module0055.f4021(var124, var106);
                                            var123 = var123.rest();
                                            var124 = var123.first();
                                        }
                                    }
                                    finally {
                                        module0147.$g2095$.rebind(var87_114, var105);
                                        module0147.$g2094$.rebind(var49_113, var105);
                                    }
                                }
                                else if (NIL != module0147.f9491(var113, (SubLObject)$ic27$)) {
                                    final SubLObject var49_114 = module0147.$g2094$.currentBinding(var105);
                                    final SubLObject var87_115 = module0147.$g2095$.currentBinding(var105);
                                    try {
                                        module0147.$g2094$.bind((SubLObject)$ic27$, var105);
                                        module0147.$g2095$.bind($ic28$, var105);
                                        SubLObject var123;
                                        final SubLObject var122 = var123 = f21105(var112, var115, (SubLObject)UNPROVIDED);
                                        SubLObject var124 = (SubLObject)NIL;
                                        var124 = var123.first();
                                        while (NIL != var123) {
                                            module0055.f4021(var124, var106);
                                            var123 = var123.rest();
                                            var124 = var123.first();
                                        }
                                    }
                                    finally {
                                        module0147.$g2095$.rebind(var87_115, var105);
                                        module0147.$g2094$.rebind(var49_114, var105);
                                    }
                                }
                                else if (NIL != module0161.f10488(var113)) {
                                    final SubLObject var49_115 = module0147.$g2094$.currentBinding(var105);
                                    final SubLObject var87_116 = module0147.$g2096$.currentBinding(var105);
                                    try {
                                        module0147.$g2094$.bind((SubLObject)$ic29$, var105);
                                        module0147.$g2096$.bind(module0161.f10522(var113), var105);
                                        SubLObject var123;
                                        final SubLObject var122 = var123 = f21105(var112, var115, (SubLObject)UNPROVIDED);
                                        SubLObject var124 = (SubLObject)NIL;
                                        var124 = var123.first();
                                        while (NIL != var123) {
                                            module0055.f4021(var124, var106);
                                            var123 = var123.rest();
                                            var124 = var123.first();
                                        }
                                    }
                                    finally {
                                        module0147.$g2096$.rebind(var87_116, var105);
                                        module0147.$g2094$.rebind(var49_115, var105);
                                    }
                                }
                                else {
                                    final SubLObject var49_116 = module0147.$g2094$.currentBinding(var105);
                                    final SubLObject var87_117 = module0147.$g2095$.currentBinding(var105);
                                    try {
                                        module0147.$g2094$.bind((SubLObject)$ic30$, var105);
                                        module0147.$g2095$.bind(var113, var105);
                                        SubLObject var123;
                                        final SubLObject var122 = var123 = f21105(var112, var115, (SubLObject)UNPROVIDED);
                                        SubLObject var124 = (SubLObject)NIL;
                                        var124 = var123.first();
                                        while (NIL != var123) {
                                            module0055.f4021(var124, var106);
                                            var123 = var123.rest();
                                            var124 = var123.first();
                                        }
                                    }
                                    finally {
                                        module0147.$g2095$.rebind(var87_117, var105);
                                        module0147.$g2094$.rebind(var49_116, var105);
                                    }
                                }
                                var111 = module0139.$g1632$.getDynamicValue(var105);
                            }
                            finally {
                                module0139.$g1631$.rebind(var121, var105);
                                module0139.$g1630$.rebind(var120, var105);
                                module0139.$g1632$.rebind(var49_112, var105);
                            }
                            if (NIL != var117 && NIL == var118) {
                                module0034.f1873(var117, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var49_111, var105);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var49_110, var105);
                }
            }
            finally {
                module0152.$g2102$.rebind(var116, var105);
            }
        }
        if (NIL == module0055.f4019(var106)) {
            final SubLObject var125 = module0055.f4023(var106);
            ConsesLow.set_nth((SubLObject)TWO_INTEGER, var104, Numbers.add(ConsesLow.nth((SubLObject)TWO_INTEGER, var104), (SubLObject)ONE_INTEGER));
            return Values.values(var125, var104, (SubLObject)NIL);
        }
        return Values.values((SubLObject)NIL, var104, (SubLObject)T);
    }
    
    public static SubLObject f21106(final SubLObject var73) {
        return Sort.sort(var73, Symbols.symbol_function((SubLObject)$ic31$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21112(final SubLObject var124, final SubLObject var125) {
        return Numbers.numL(module0550.f33966(var124), module0550.f33966(var125));
    }
    
    public static SubLObject f21113(final SubLObject var95) {
        return Numbers.subtract(module0550.f33966(var95), f21114(var95));
    }
    
    public static SubLObject f21114(final SubLObject var95) {
        if (NIL == module0173.f10955(var95)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return f21115(var95);
    }
    
    public static SubLObject f21116() {
        final SubLObject var126 = $g2798$.getGlobalValue();
        if (NIL != var126) {
            module0034.f1818(var126);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21117(final SubLObject var95) {
        return module0034.f1829($g2798$.getGlobalValue(), (SubLObject)ConsesLow.list(var95), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21118(final SubLObject var95) {
        final SubLObject var96 = module0217.f14247(var95, (SubLObject)UNPROVIDED);
        if (!var96.isPositive()) {
            return (SubLObject)ZERO_INTEGER;
        }
        return Values.values(Numbers.truncate(Numbers.multiply((SubLObject)$ic33$, Numbers.log(var96, (SubLObject)TWO_INTEGER)), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f21115(final SubLObject var95) {
        SubLObject var96 = $g2798$.getGlobalValue();
        if (NIL == var96) {
            var96 = module0034.f1934((SubLObject)$ic32$, (SubLObject)$ic34$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)$ic35$);
        }
        SubLObject var97 = module0034.f1814(var96, var95, (SubLObject)$ic36$);
        if (var97 == $ic36$) {
            var97 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21118(var95)));
            module0034.f1816(var96, var95, var97, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var97);
    }
    
    public static SubLObject f21101(final SubLObject var71, final SubLObject var130) {
        assert NIL != module0031.f1646(var71) : var71;
        module0031.f1686(var71);
        SubLObject var131 = var130;
        SubLObject var132 = (SubLObject)NIL;
        var132 = var131.first();
        while (NIL != var131) {
            module0031.f1690(var132, var71);
            var131 = var131.rest();
            var132 = var131.first();
        }
        return var71;
    }
    
    public static SubLObject f21119(final SubLObject var71, final SubLObject var132) {
        return (SubLObject)makeBoolean(NIL == module0031.f1688(var132, var71));
    }
    
    public static SubLObject f21120() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21091", "S#23703", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21098", "S#23704", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21099", "S#23705", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21095", "S#23706", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21096", "S#23707", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21097", "S#23708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21092", "S#23709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21093", "S#23710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21094", "S#23711", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21100", "S#23712", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21102", "S#23713", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21104", "S#23714", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21105", "S#23715", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21103", "S#23716", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21107", "S#23717", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21108", "S#23718", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21109", "S#23719", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21110", "S#23720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21111", "S#23721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21106", "S#23722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21112", "S#23723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21113", "S#23724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21114", "S#23725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21116", "S#23726", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21117", "S#23727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21118", "S#23728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21115", "S#23729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21101", "S#23730", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0310", "f21119", "S#23731", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21121() {
        $g2798$ = SubLFiles.deflexical("S#23732", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21122() {
        module0034.f1909((SubLObject)$ic32$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21120();
    }
    
    public void initializeVariables() {
        f21121();
    }
    
    public void runTopLevelForms() {
        f21122();
    }
    
    static {
        me = (SubLFile)new module0310();
        $g2798$ = null;
        $ic0$ = makeKeyword("DOMAIN");
        $ic1$ = makeKeyword("ISA-HORIZON");
        $ic2$ = makeKeyword("GENLS-HORIZON");
        $ic3$ = makeKeyword("USAGE-THRESHOLD");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("argIsa"));
        $ic5$ = makeKeyword("GAF");
        $ic6$ = makeKeyword("TRUE");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("argGenl"));
        $ic8$ = makeKeyword("ARG-GENL");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("argQuotedIsa"));
        $ic10$ = makeKeyword("ARG-QUOTED-ISA");
        $ic11$ = makeKeyword("ARG-GENL-HORIZON");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("Predicate"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("Function-Denotational"));
        $ic14$ = makeKeyword("ASCENDING");
        $ic15$ = makeSymbol("CONSP");
        $ic16$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#23733", "CYC"));
        $ic17$ = makeSymbol("S#23731", "CYC");
        $ic18$ = makeKeyword("MAX-NUMBER");
        $ic19$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic20$ = makeString("Considering predicates");
        $ic21$ = makeSymbol("S#23720", "CYC");
        $ic22$ = makeSymbol("S#23721", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#23734", "CYC"), (SubLObject)makeSymbol("S#23735", "CYC"), (SubLObject)makeSymbol("S#702", "CYC"), (SubLObject)makeSymbol("S#23736", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#23737", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#23734", "CYC"), (SubLObject)makeSymbol("S#23735", "CYC"), (SubLObject)makeSymbol("S#702", "CYC"), (SubLObject)makeSymbol("S#23736", "CYC"), (SubLObject)makeSymbol("S#3043", "CYC"), (SubLObject)makeSymbol("S#23738", "CYC"), (SubLObject)makeSymbol("S#13098", "CYC"), (SubLObject)makeSymbol("S#12316", "CYC"));
        $ic25$ = makeSymbol("S#12274", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic27$ = makeSymbol("S#12275", "CYC");
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic29$ = makeSymbol("S#12280", "CYC");
        $ic30$ = makeSymbol("S#12278", "CYC");
        $ic31$ = makeSymbol("S#23723", "CYC");
        $ic32$ = makeSymbol("S#23729", "CYC");
        $ic33$ = makeInteger(1000);
        $ic34$ = makeSymbol("S#23732", "CYC");
        $ic35$ = makeInteger(100);
        $ic36$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic37$ = makeSymbol("S#2881", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 697 ms
	
	Decompiled with Procyon 0.5.32.
*/