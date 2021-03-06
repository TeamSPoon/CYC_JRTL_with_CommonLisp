package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0564 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0564";
    public static final String myFingerPrint = "8782fbf57599ba0e8ee00b50b9716d0796b2acd7bae8f9948820c39a112efc3f";
    private static SubLSymbol $g4120$;
    private static SubLSymbol $g4121$;
    private static SubLSymbol $g4122$;
    private static SubLSymbol $g4123$;
    private static SubLSymbol $g4124$;
    public static SubLSymbol $g4125$;
    private static SubLSymbol $g4126$;
    private static SubLSymbol $g4127$;
    private static SubLSymbol $g4128$;
    private static SubLSymbol $g4129$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLList $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLObject $ic65$;
    
    public static SubLObject f34802() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = module0139.f9019((SubLObject)TEN_INTEGER);
        final SubLObject var3 = module0139.$g1632$.currentBinding(var1);
        final SubLObject var4 = module0139.$g1630$.currentBinding(var1);
        final SubLObject var5 = module0139.$g1631$.currentBinding(var1);
        try {
            module0139.$g1632$.bind(var2, var1);
            module0139.$g1630$.bind((SubLObject)T, var1);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var1)), var1);
            module0565.f34855();
            final SubLObject var6 = f34803();
            f34804(var6);
            var2 = module0139.$g1632$.getDynamicValue(var1);
        }
        finally {
            module0139.$g1631$.rebind(var5, var1);
            module0139.$g1630$.rebind(var4, var1);
            module0139.$g1632$.rebind(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34805() {
        f34806();
        f34807();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34808() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = module0139.f9019((SubLObject)TEN_INTEGER);
        final SubLObject var3 = module0139.$g1632$.currentBinding(var1);
        final SubLObject var4 = module0139.$g1630$.currentBinding(var1);
        final SubLObject var5 = module0139.$g1631$.currentBinding(var1);
        try {
            module0139.$g1632$.bind(var2, var1);
            module0139.$g1630$.bind((SubLObject)T, var1);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var1)), var1);
            f34809();
            f34810();
            var2 = module0139.$g1632$.getDynamicValue(var1);
        }
        finally {
            module0139.$g1631$.rebind(var5, var1);
            module0139.$g1630$.rebind(var4, var1);
            module0139.$g1632$.rebind(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34803() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f34811();
        final SubLObject var2 = module0563.f34731();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        final SubLObject var4 = var2;
        module0012.$g82$.setDynamicValue((SubLObject)$ic0$, var1);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
        module0012.$g83$.setDynamicValue(Sequences.length(var4), var1);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var1);
        final SubLObject var5 = module0012.$g75$.currentBinding(var1);
        final SubLObject var6 = module0012.$g76$.currentBinding(var1);
        final SubLObject var7 = module0012.$g77$.currentBinding(var1);
        final SubLObject var8 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(module0012.$g82$.getDynamicValue(var1));
            SubLObject var9 = var4;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)ONE_INTEGER), var1);
                final SubLObject var11 = f34812(var10);
                if (NIL != var11) {
                    var3 = Numbers.add(var3, Sequences.length(var11));
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var8, var1);
            module0012.$g77$.rebind(var7, var1);
            module0012.$g76$.rebind(var6, var1);
            module0012.$g75$.rebind(var5, var1);
        }
        return var3;
    }
    
    public static SubLObject f34804(SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0563.f34731();
        final SubLObject var17 = var14.isInteger() ? Sequences.cconcatenate((SubLObject)$ic1$, new SubLObject[] { module0006.f203(var14), $ic2$, module0006.f203(Sequences.length(var16)), $ic3$ }) : Sequences.cconcatenate((SubLObject)$ic4$, new SubLObject[] { module0006.f203(Sequences.length(var16)), $ic3$ });
        final SubLObject var18 = var16;
        module0012.$g82$.setDynamicValue(var17, var15);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var15);
        module0012.$g83$.setDynamicValue(Sequences.length(var18), var15);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var15);
        final SubLObject var19 = module0012.$g75$.currentBinding(var15);
        final SubLObject var20 = module0012.$g76$.currentBinding(var15);
        final SubLObject var21 = module0012.$g77$.currentBinding(var15);
        final SubLObject var22 = module0012.$g78$.currentBinding(var15);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var15);
            module0012.$g76$.bind((SubLObject)NIL, var15);
            module0012.$g77$.bind((SubLObject)T, var15);
            module0012.$g78$.bind(Time.get_universal_time(), var15);
            module0012.f478(module0012.$g82$.getDynamicValue(var15));
            SubLObject var23 = var18;
            SubLObject var24 = (SubLObject)NIL;
            var24 = var23.first();
            while (NIL != var23) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var15), module0012.$g83$.getDynamicValue(var15));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var15), (SubLObject)ONE_INTEGER), var15);
                f34813(var24);
                var23 = var23.rest();
                var24 = var23.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var22, var15);
            module0012.$g77$.rebind(var21, var15);
            module0012.$g76$.rebind(var20, var15);
            module0012.$g75$.rebind(var19, var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34813(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = f34812(var12);
        final SubLObject var15 = (SubLObject)((NIL != $g4121$.getDynamicValue(var13)) ? $ic5$ : NIL);
        SubLObject var16 = var14;
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            SubLObject var19;
            final SubLObject var18 = var19 = var17;
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic6$);
            var20 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic6$);
            var21 = var19.first();
            var19 = var19.rest();
            if (NIL == var19) {
                SubLObject var22 = (SubLObject)NIL;
                try {
                    var13.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var23 = Errors.$error_handler$.currentBinding(var13);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic7$, var13);
                        try {
                            module0540.f33517(var20, var21, var15);
                            module0565.f34854(module0288.f19338(var20, var21));
                        }
                        catch (Throwable var24) {
                            Errors.handleThrowable(var24, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var23, var13);
                    }
                }
                catch (Throwable var25) {
                    var22 = Errors.handleThrowable(var25, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var13.throwStack.pop();
                }
                if (var22.isString()) {
                    Errors.warn((SubLObject)$ic8$, var22);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic6$);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return Sequences.length(var14);
    }
    
    public static SubLObject f34814(SubLObject var26, SubLObject var27) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)ZERO_INTEGER;
        final SubLObject var30 = assertion_handles_oc.f11010();
        final SubLObject var31 = (SubLObject)$ic9$;
        final SubLObject var30_31 = module0065.f4733(var30);
        SubLObject var32 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var31) : var31;
        final SubLObject var33 = module0012.$g75$.currentBinding(var28);
        final SubLObject var34 = module0012.$g76$.currentBinding(var28);
        final SubLObject var35 = module0012.$g77$.currentBinding(var28);
        final SubLObject var36 = module0012.$g78$.currentBinding(var28);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var28);
            module0012.$g76$.bind((SubLObject)NIL, var28);
            module0012.$g77$.bind((SubLObject)T, var28);
            module0012.$g78$.bind(Time.get_universal_time(), var28);
            module0012.f478(var31);
            final SubLObject var33_34 = var30;
            if (NIL == module0065.f4772(var33_34, (SubLObject)$ic11$)) {
                final SubLObject var35_36 = var33_34;
                if (NIL == module0065.f4775(var35_36, (SubLObject)$ic11$)) {
                    final SubLObject var37 = module0065.f4740(var35_36);
                    final SubLObject var38 = (SubLObject)NIL;
                    SubLObject var39;
                    SubLObject var40;
                    SubLObject var41;
                    SubLObject var42;
                    SubLObject var43;
                    SubLObject var44;
                    SubLObject var45;
                    SubLObject var3_46;
                    SubLObject var46;
                    SubLObject var3_47;
                    SubLObject var3_48;
                    for (var39 = Sequences.length(var37), var40 = (SubLObject)NIL, var40 = (SubLObject)ZERO_INTEGER; var40.numL(var39); var40 = Numbers.add(var40, (SubLObject)ONE_INTEGER)) {
                        var41 = ((NIL != var38) ? Numbers.subtract(var39, var40, (SubLObject)ONE_INTEGER) : var40);
                        var42 = Vectors.aref(var37, var41);
                        if (NIL == module0065.f4749(var42) || NIL == module0065.f4773((SubLObject)$ic11$)) {
                            if (NIL != module0065.f4749(var42)) {
                                var42 = (SubLObject)$ic11$;
                            }
                            module0012.note_percent_progress(var32, var30_31);
                            var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11284(var42) && NIL != module0178.f11312(var42)) {
                                var43 = module0178.f11332(var42);
                                if (NIL != Sequences.find(var43, $g4122$.getDynamicValue(var28), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic12$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    var44 = (SubLObject)NIL;
                                    if (NIL != var26) {
                                        var45 = module0003.f61();
                                        try {
                                            var28.throwStack.push(var45);
                                            var3_46 = module0003.$g4$.currentBinding(var28);
                                            try {
                                                module0003.$g4$.bind((SubLObject)T, var28);
                                                var46 = (SubLObject)NIL;
                                                try {
                                                    var3_47 = module0003.$g5$.currentBinding(var28);
                                                    try {
                                                        module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var28)), var28);
                                                        var46 = module0003.f62(var26, var45);
                                                        if (NIL != var27) {
                                                            print_high.print(var42, StreamsLow.$standard_output$.getDynamicValue(var28));
                                                            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var28));
                                                        }
                                                        module0543.f33642(var42, module0178.f11293(var42), (SubLObject)$ic13$);
                                                        var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER);
                                                    }
                                                    finally {
                                                        module0003.$g5$.rebind(var3_47, var28);
                                                    }
                                                }
                                                finally {
                                                    var3_48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var28);
                                                        module0003.f64(var46);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_48, var28);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0003.$g4$.rebind(var3_46, var28);
                                            }
                                        }
                                        catch (Throwable var47) {
                                            var44 = Errors.handleThrowable(var47, var45);
                                        }
                                        finally {
                                            var28.throwStack.pop();
                                        }
                                    }
                                    else {
                                        if (NIL != var27) {
                                            print_high.print(var42, StreamsLow.$standard_output$.getDynamicValue(var28));
                                            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var28));
                                        }
                                        module0543.f33642(var42, module0178.f11293(var42), (SubLObject)$ic13$);
                                        var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var50_51 = var33_34;
                if (NIL == module0065.f4777(var50_51) || NIL == module0065.f4773((SubLObject)$ic11$)) {
                    final SubLObject var48 = module0065.f4738(var50_51);
                    SubLObject var49 = module0065.f4739(var50_51);
                    final SubLObject var50 = module0065.f4734(var50_51);
                    final SubLObject var51 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic11$)) ? NIL : $ic11$);
                    while (var49.numL(var50)) {
                        final SubLObject var52 = Hashtables.gethash_without_values(var49, var48, var51);
                        if (NIL == module0065.f4773((SubLObject)$ic11$) || NIL == module0065.f4749(var52)) {
                            module0012.note_percent_progress(var32, var30_31);
                            var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11284(var52) && NIL != module0178.f11312(var52)) {
                                final SubLObject var53 = module0178.f11332(var52);
                                if (NIL != Sequences.find(var53, $g4122$.getDynamicValue(var28), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic12$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    SubLObject var54 = (SubLObject)NIL;
                                    if (NIL != var26) {
                                        final SubLObject var55 = module0003.f61();
                                        try {
                                            var28.throwStack.push(var55);
                                            final SubLObject var3_49 = module0003.$g4$.currentBinding(var28);
                                            try {
                                                module0003.$g4$.bind((SubLObject)T, var28);
                                                SubLObject var56 = (SubLObject)NIL;
                                                try {
                                                    final SubLObject var3_50 = module0003.$g5$.currentBinding(var28);
                                                    try {
                                                        module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var28)), var28);
                                                        var56 = module0003.f62(var26, var55);
                                                        if (NIL != var27) {
                                                            print_high.print(var52, StreamsLow.$standard_output$.getDynamicValue(var28));
                                                            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var28));
                                                        }
                                                        module0543.f33642(var52, module0178.f11293(var52), (SubLObject)$ic13$);
                                                        var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER);
                                                    }
                                                    finally {
                                                        module0003.$g5$.rebind(var3_50, var28);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var3_51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var28);
                                                        module0003.f64(var56);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_51, var28);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0003.$g4$.rebind(var3_49, var28);
                                            }
                                        }
                                        catch (Throwable var57) {
                                            var54 = Errors.handleThrowable(var57, var55);
                                        }
                                        finally {
                                            var28.throwStack.pop();
                                        }
                                    }
                                    else {
                                        if (NIL != var27) {
                                            print_high.print(var52, StreamsLow.$standard_output$.getDynamicValue(var28));
                                            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var28));
                                        }
                                        module0543.f33642(var52, module0178.f11293(var52), (SubLObject)$ic13$);
                                        var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var36, var28);
            module0012.$g77$.rebind(var35, var28);
            module0012.$g76$.rebind(var34, var28);
            module0012.$g75$.rebind(var33, var28);
        }
        return var29;
    }
    
    public static SubLObject f34811() {
        final SubLObject var58 = $g4124$.getGlobalValue();
        if (NIL != var58) {
            module0034.f1818(var58);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34815(final SubLObject var12) {
        return module0034.f1829($g4124$.getGlobalValue(), (SubLObject)ConsesLow.list(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34816(final SubLObject var12) {
        return f34817(var12);
    }
    
    public static SubLObject f34812(final SubLObject var12) {
        SubLObject var13 = $g4124$.getGlobalValue();
        if (NIL == var13) {
            var13 = module0034.f1934((SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)$ic18$);
        }
        SubLObject var14 = module0034.f1814(var13, var12, (SubLObject)$ic19$);
        if (var14 == $ic19$) {
            var14 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34816(var12)));
            module0034.f1816(var13, var12, var14, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var14);
    }
    
    public static SubLObject f34817(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13580(var12)) {
            return (SubLObject)NIL;
        }
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = $g4122$.getDynamicValue(var13);
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            SubLObject var19;
            final SubLObject var18 = var19 = var17;
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic20$);
            var20 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic20$);
            var21 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic20$);
            var22 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic20$);
            var23 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic20$);
            var24 = var19.first();
            var19 = var19.rest();
            if (NIL == var19) {
                SubLObject var25 = (SubLObject)NIL;
                final SubLObject var26 = module0147.$g2094$.currentBinding(var13);
                final SubLObject var27 = module0147.$g2095$.currentBinding(var13);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic21$, var13);
                    module0147.$g2095$.bind($ic22$, var13);
                    var25 = module0269.f17697(var12, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var27, var13);
                    module0147.$g2094$.rebind(var26, var13);
                }
                if (module0217.f14221(var12, (SubLObject)ONE_INTEGER, var20, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                    SubLObject var17_72;
                    final SubLObject var28 = var17_72 = module0217.f14228(var12, (SubLObject)ONE_INTEGER, var20);
                    SubLObject var29 = (SubLObject)NIL;
                    var29 = var17_72.first();
                    while (NIL != var17_72) {
                        final SubLObject var30 = module0220.f14563(var12, var20, var29, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic23$);
                        final SubLObject var31 = f34818(var12, var29, var30, var20, var21, var22, var23, var24);
                        if (NIL == var15 && var20.eql($ic24$) && NIL != var30 && NIL == var15) {
                            SubLObject var32 = var30;
                            SubLObject var33 = (SubLObject)NIL;
                            var33 = var32.first();
                            while (NIL == var15 && NIL != var32) {
                                if (NIL != module0563.f34732(var33)) {
                                    var15 = (SubLObject)T;
                                }
                                var32 = var32.rest();
                                var33 = var32.first();
                            }
                        }
                        if (NIL != var31) {
                            SubLObject var17_73 = var31;
                            SubLObject var34 = (SubLObject)NIL;
                            var34 = var17_73.first();
                            while (NIL != var17_73) {
                                SubLObject var80_81;
                                final SubLObject var78_79 = var80_81 = var34;
                                SubLObject var35 = (SubLObject)NIL;
                                SubLObject var36 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var80_81, var78_79, (SubLObject)$ic25$);
                                var35 = var80_81.first();
                                var80_81 = var80_81.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var80_81, var78_79, (SubLObject)$ic25$);
                                var36 = var80_81.first();
                                var80_81 = var80_81.rest();
                                if (NIL == var80_81) {
                                    if (NIL == module0035.f2169(var36, var25)) {
                                        final SubLObject var38;
                                        final SubLObject var37 = var38 = f34819(var20, var12, var36, var35);
                                        if (NIL != var38) {
                                            var14 = (SubLObject)ConsesLow.cons(var38, var14);
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var78_79, (SubLObject)$ic25$);
                                }
                                var17_73 = var17_73.rest();
                                var34 = var17_73.first();
                            }
                        }
                        var17_72 = var17_72.rest();
                        var29 = var17_72.first();
                    }
                    if (NIL == var14 && NIL == var15) {
                        if (NIL == var25) {
                            var25 = (SubLObject)ConsesLow.list($ic26$);
                        }
                        SubLObject var17_74 = var25;
                        SubLObject var39 = (SubLObject)NIL;
                        var39 = var17_74.first();
                        while (NIL != var17_74) {
                            var14 = (SubLObject)ConsesLow.cons(f34820($ic24$, var12, var39, $ic27$), var14);
                            var17_74 = var17_74.rest();
                            var39 = var17_74.first();
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic20$);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        var16 = $g4123$.getDynamicValue(var13);
        var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            SubLObject var41;
            final SubLObject var40 = var41 = var17;
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic20$);
            var20 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic20$);
            var21 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic20$);
            var22 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic20$);
            var23 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic20$);
            var24 = var41.first();
            var41 = var41.rest();
            if (NIL == var41) {
                if (module0217.f14221(var12, (SubLObject)TWO_INTEGER, var20, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                    SubLObject var17_75;
                    final SubLObject var42 = var17_75 = module0217.f14228(var12, (SubLObject)TWO_INTEGER, var20);
                    SubLObject var43 = (SubLObject)NIL;
                    var43 = var17_75.first();
                    while (NIL != var17_75) {
                        final SubLObject var44 = module0220.f14563(var12, var20, var43, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic23$);
                        final SubLObject var45 = f34818(var12, var43, var44, var20, var21, var22, var23, var24);
                        if (NIL != var45) {
                            SubLObject var17_76 = var45;
                            SubLObject var46 = (SubLObject)NIL;
                            var46 = var17_76.first();
                            while (NIL != var17_76) {
                                SubLObject var93_94;
                                final SubLObject var91_92 = var93_94 = var46;
                                SubLObject var47 = (SubLObject)NIL;
                                SubLObject var48 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)$ic25$);
                                var47 = var93_94.first();
                                var93_94 = var93_94.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)$ic25$);
                                var48 = var93_94.first();
                                var93_94 = var93_94.rest();
                                if (NIL == var93_94) {
                                    final SubLObject var50;
                                    final SubLObject var49 = var50 = f34819(var20, var48, var12, var47);
                                    if (NIL != var50) {
                                        var14 = (SubLObject)ConsesLow.cons(var50, var14);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var91_92, (SubLObject)$ic25$);
                                }
                                var17_76 = var17_76.rest();
                                var46 = var17_76.first();
                            }
                        }
                        var17_75 = var17_75.rest();
                        var43 = var17_75.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)$ic20$);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        if (NIL != var14) {
            var14 = Sequences.nreverse(var14);
            if (NIL != $g4120$.getDynamicValue(var13)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic28$);
                var16 = var14;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var16.first();
                while (NIL != var16) {
                    SubLObject var53;
                    final SubLObject var52 = var53 = var51;
                    SubLObject var54 = (SubLObject)NIL;
                    SubLObject var55 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)$ic6$);
                    var54 = var53.first();
                    var53 = var53.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)$ic6$);
                    var55 = var53.first();
                    var53 = var53.rest();
                    if (NIL == var53) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic29$, var54, var55);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic6$);
                    }
                    var16 = var16.rest();
                    var51 = var16.first();
                }
            }
        }
        return var14;
    }
    
    public static SubLObject f34818(final SubLObject var12, final SubLObject var22, final SubLObject var97, final SubLObject var65, final SubLObject var66, final SubLObject var67, final SubLObject var68, final SubLObject var69) {
        if (NIL == module0563.f34732(var22)) {
            return (SubLObject)NIL;
        }
        SubLObject var98 = (SubLObject)NIL;
        if (NIL == var98) {
            SubLObject var99 = var97;
            SubLObject var100 = (SubLObject)NIL;
            var100 = var99.first();
            while (NIL == var98 && NIL != var99) {
                if (NIL != module0563.f34771(module0217.f14421((SubLObject)ConsesLow.list(var65, var12, var100), var22))) {
                    var98 = (SubLObject)T;
                }
                var99 = var99.rest();
                var100 = var99.first();
            }
        }
        if (NIL == var98) {
            return (SubLObject)NIL;
        }
        final SubLObject var101 = f34821(var12, var22, var97, var65, var66, var67, var68, var69);
        final SubLObject var102 = conses_high.nset_difference(var101, var97, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var103 = (SubLObject)NIL;
        SubLObject var104 = var102;
        SubLObject var105 = (SubLObject)NIL;
        var105 = var104.first();
        while (NIL != var104) {
            var103 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var22, var105), var103);
            var104 = var104.rest();
            var105 = var104.first();
        }
        return var103;
    }
    
    public static SubLObject f34821(final SubLObject var12, final SubLObject var22, final SubLObject var97, final SubLObject var65, final SubLObject var66, final SubLObject var67, final SubLObject var68, final SubLObject var69) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        SubLObject var99 = (SubLObject)NIL;
        final SubLObject var100 = module0147.f9540(var22);
        final SubLObject var101 = module0147.$g2095$.currentBinding(var98);
        final SubLObject var102 = module0147.$g2094$.currentBinding(var98);
        final SubLObject var103 = module0147.$g2096$.currentBinding(var98);
        try {
            module0147.$g2095$.bind(module0147.f9545(var100), var98);
            module0147.$g2094$.bind(module0147.f9546(var100), var98);
            module0147.$g2096$.bind(module0147.f9549(var100), var98);
            SubLObject var104 = var97;
            SubLObject var105 = (SubLObject)NIL;
            var105 = var104.first();
            while (NIL != var104) {
                var99 = conses_high.nunion(var99, (SubLObject)((NIL != module0173.f10955(var105)) ? Functions.funcall(var66, var105) : NIL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var104 = var104.rest();
                var105 = var104.first();
            }
            var99 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic30$), var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var99 = f34822(var99, var65);
            SubLObject var106 = (SubLObject)NIL;
            if (NIL != var69) {
                var99 = Sequences.delete(var12, var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var106 = f34823(var12, var99, var67);
                if (NIL != var106) {
                    if (NIL != $g4120$.getDynamicValue(var98)) {
                        Errors.warn((SubLObject)$ic31$, var67, var12, var106);
                    }
                    var99 = conses_high.nset_difference(var99, var106, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            var99 = ((NIL != var68) ? ((var68 == $ic32$) ? module0256.f16529(var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : ((var68 == $ic33$) ? module0260.f17085(var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : ((var68 == $ic34$) ? module0262.f17364(var99, (SubLObject)UNPROVIDED) : Functions.funcall(var68, var99)))) : module0035.f2462(var99, var67, (SubLObject)UNPROVIDED));
            if (NIL != var106 && (NIL == $g4125$.getDynamicValue(var98) || Sequences.length(var106).numLE($g4125$.getDynamicValue(var98)))) {
                var99 = conses_high.nunion(var106, var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != $g4120$.getDynamicValue(var98)) {
                    Errors.warn((SubLObject)$ic35$, var97, var99);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var103, var98);
            module0147.$g2094$.rebind(var102, var98);
            module0147.$g2095$.rebind(var101, var98);
        }
        return var99;
    }
    
    public static SubLObject f34822(final SubLObject var103, final SubLObject var65) {
        final SubLObject var104 = module0563.f34751(var65);
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = var103;
        SubLObject var107 = (SubLObject)NIL;
        var107 = var106.first();
        while (NIL != var106) {
            final SubLObject var108 = module0563.f34745(var107);
            if (NIL == var108 || NIL != module0004.f104(var108, var104, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var105 = (SubLObject)ConsesLow.cons(var107, var105);
            }
            var106 = var106.rest();
            var107 = var106.first();
        }
        return var105;
    }
    
    public static SubLObject f34823(final SubLObject var12, final SubLObject var103, final SubLObject var67) {
        assert NIL != module0173.f10955(var12) : var12;
        SubLObject var104 = (SubLObject)NIL;
        SubLObject var105 = var103;
        SubLObject var106 = (SubLObject)NIL;
        var106 = var105.first();
        while (NIL != var105) {
            if (NIL != module0173.f10955(var106) && NIL != Functions.funcall(var67, var106, var12)) {
                var104 = (SubLObject)ConsesLow.cons(var106, var104);
            }
            var105 = var105.rest();
            var106 = var105.first();
        }
        return var104;
    }
    
    public static SubLObject f34819(final SubLObject var43, final SubLObject var111, final SubLObject var112, final SubLObject var22) {
        if (var43.eql($ic24$)) {
            if (NIL != module0268.f17611(var112)) {
                return (SubLObject)NIL;
            }
        }
        else if (var43.eql($ic37$)) {
            if (NIL != module0305.f20423(var112, var111, var22)) {
                return (SubLObject)NIL;
            }
        }
        else if (var43.eql($ic38$) && NIL != module0268.f17612(var112)) {
            return (SubLObject)NIL;
        }
        return f34820(var43, var111, var112, var22);
    }
    
    public static SubLObject f34820(final SubLObject var43, final SubLObject var111, final SubLObject var112, final SubLObject var22) {
        return (SubLObject)ConsesLow.list(module0202.f12768(var43, var111, var112), var22);
    }
    
    public static SubLObject f34824() {
        return $g4126$.getGlobalValue();
    }
    
    public static SubLObject f34806() {
        final SubLObject var114 = module0083.f5708((SubLObject)UNPROVIDED);
        final SubLObject var115 = module0078.f5367(f34825(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f34826(var115, var114);
        $g4126$.setGlobalValue(module0083.f5700(var114, (SubLObject)UNPROVIDED));
        return module0083.f5695(var114);
    }
    
    public static SubLObject f34826(final SubLObject var116, final SubLObject var114) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = module0322.$g2823$.currentBinding(var117);
        try {
            module0322.$g2823$.bind((SubLObject)T, var117);
            final SubLObject var119 = Sequences.cconcatenate((SubLObject)$ic40$, new SubLObject[] { module0006.f203(module0077.f5311(var116)), $ic41$ });
            module0322.f21766();
            final SubLObject var121;
            final SubLObject var120 = var121 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var3_119 = module0034.$g879$.currentBinding(var117);
            try {
                module0034.$g879$.bind(var121, var117);
                SubLObject var122 = (SubLObject)NIL;
                if (NIL != var121 && NIL == module0034.f1842(var121)) {
                    var122 = module0034.f1869(var121);
                    final SubLObject var123 = Threads.current_process();
                    if (NIL == var122) {
                        module0034.f1873(var121, var123);
                    }
                    else if (!var122.eql(var123)) {
                        Errors.error((SubLObject)$ic42$);
                    }
                }
                try {
                    final SubLObject var122_123 = var119;
                    final SubLObject var124 = module0173.f10962();
                    SubLObject var125 = (SubLObject)ZERO_INTEGER;
                    final SubLObject var3_120 = module0012.$g75$.currentBinding(var117);
                    final SubLObject var126 = module0012.$g76$.currentBinding(var117);
                    final SubLObject var127 = module0012.$g77$.currentBinding(var117);
                    final SubLObject var128 = module0012.$g78$.currentBinding(var117);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var117);
                        module0012.$g76$.bind((SubLObject)NIL, var117);
                        module0012.$g77$.bind((SubLObject)T, var117);
                        module0012.$g78$.bind(Time.get_universal_time(), var117);
                        module0012.f478(var122_123);
                        SubLObject var129 = module0173.f10961();
                        SubLObject var130 = (SubLObject)NIL;
                        var130 = var129.first();
                        while (NIL != var129) {
                            final SubLObject var131 = var130;
                            if (NIL == module0065.f4772(var131, (SubLObject)$ic11$)) {
                                final SubLObject var35_128 = var131;
                                if (NIL == module0065.f4775(var35_128, (SubLObject)$ic11$)) {
                                    final SubLObject var132 = module0065.f4740(var35_128);
                                    final SubLObject var133 = (SubLObject)NIL;
                                    SubLObject var134;
                                    SubLObject var135;
                                    SubLObject var136;
                                    SubLObject var137;
                                    for (var134 = Sequences.length(var132), var135 = (SubLObject)NIL, var135 = (SubLObject)ZERO_INTEGER; var135.numL(var134); var135 = Numbers.add(var135, (SubLObject)ONE_INTEGER)) {
                                        var136 = ((NIL != var133) ? Numbers.subtract(var134, var135, (SubLObject)ONE_INTEGER) : var135);
                                        var137 = Vectors.aref(var132, var136);
                                        if (NIL == module0065.f4749(var137) || NIL == module0065.f4773((SubLObject)$ic11$)) {
                                            if (NIL != module0065.f4749(var137)) {
                                                var137 = (SubLObject)$ic11$;
                                            }
                                            var125 = Numbers.add(var125, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var125, var124);
                                            if (NIL != module0077.f5320(var137, var116)) {
                                                module0083.f5699(var114, f34827(var137));
                                            }
                                        }
                                    }
                                }
                                final SubLObject var50_129 = var131;
                                if (NIL == module0065.f4777(var50_129) || NIL == module0065.f4773((SubLObject)$ic11$)) {
                                    final SubLObject var138 = module0065.f4738(var50_129);
                                    SubLObject var139 = module0065.f4739(var50_129);
                                    final SubLObject var140 = module0065.f4734(var50_129);
                                    final SubLObject var141 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic11$)) ? NIL : $ic11$);
                                    while (var139.numL(var140)) {
                                        final SubLObject var142 = Hashtables.gethash_without_values(var139, var138, var141);
                                        if (NIL == module0065.f4773((SubLObject)$ic11$) || NIL == module0065.f4749(var142)) {
                                            var125 = Numbers.add(var125, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var125, var124);
                                            if (NIL != module0077.f5320(var142, var116)) {
                                                module0083.f5699(var114, f34827(var142));
                                            }
                                        }
                                        var139 = Numbers.add(var139, (SubLObject)ONE_INTEGER);
                                    }
                                }
                            }
                            var129 = var129.rest();
                            var130 = var129.first();
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var128, var117);
                        module0012.$g77$.rebind(var127, var117);
                        module0012.$g76$.rebind(var126, var117);
                        module0012.$g75$.rebind(var3_120, var117);
                    }
                }
                finally {
                    final SubLObject var3_121 = Threads.$is_thread_performing_cleanupP$.currentBinding(var117);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var117);
                        if (NIL != var121 && NIL == var122) {
                            module0034.f1873(var121, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_121, var117);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var3_119, var117);
            }
        }
        finally {
            module0322.$g2823$.rebind(var118, var117);
        }
        module0006.f218((SubLObject)T, (SubLObject)$ic43$, module0051.f3574(module0322.f21767(), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0083.f5695(var114);
    }
    
    public static SubLObject f34825() {
        return module0035.remove_if_not((SubLObject)$ic44$, module0563.f34731(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34828(final SubLObject var12) {
        if (NIL == module0173.f10955(var12)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0205.f13145((SubLObject)$ic45$, var12, (SubLObject)T, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f34829(final SubLObject var131, final SubLObject var114) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        final SubLObject var133 = module0322.$g2823$.currentBinding(var132);
        try {
            module0322.$g2823$.bind((SubLObject)T, var132);
            final SubLObject var134 = (SubLObject)$ic46$;
            module0322.f21766();
            final SubLObject var136;
            final SubLObject var135 = var136 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var3_133 = module0034.$g879$.currentBinding(var132);
            try {
                module0034.$g879$.bind(var136, var132);
                SubLObject var137 = (SubLObject)NIL;
                if (NIL != var136 && NIL == module0034.f1842(var136)) {
                    var137 = module0034.f1869(var136);
                    final SubLObject var138 = Threads.current_process();
                    if (NIL == var137) {
                        module0034.f1873(var136, var138);
                    }
                    else if (!var137.eql(var138)) {
                        Errors.error((SubLObject)$ic42$);
                    }
                }
                try {
                    final SubLObject var139 = var134;
                    final SubLObject var3_134 = module0012.$g73$.currentBinding(var132);
                    final SubLObject var140 = module0012.$g65$.currentBinding(var132);
                    final SubLObject var141 = module0012.$g67$.currentBinding(var132);
                    final SubLObject var142 = module0012.$g68$.currentBinding(var132);
                    final SubLObject var143 = module0012.$g66$.currentBinding(var132);
                    final SubLObject var144 = module0012.$g69$.currentBinding(var132);
                    final SubLObject var145 = module0012.$g70$.currentBinding(var132);
                    final SubLObject var146 = module0012.$silent_progressP$.currentBinding(var132);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var132);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var132), var132);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var132);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var132);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var132);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var132);
                        module0012.$g70$.bind((SubLObject)T, var132);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var139) ? module0012.$silent_progressP$.getDynamicValue(var132) : T), var132);
                        module0012.f474(var139);
                        SubLObject var149;
                        for (SubLObject var147 = (SubLObject)NIL; NIL == var147; var147 = (SubLObject)makeBoolean(NIL == var149)) {
                            var132.resetMultipleValues();
                            final SubLObject var148 = module0052.f3693(var131);
                            var149 = var132.secondMultipleValue();
                            var132.resetMultipleValues();
                            if (NIL != var149) {
                                module0083.f5699(var114, f34827(var148));
                            }
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var146, var132);
                        module0012.$g70$.rebind(var145, var132);
                        module0012.$g69$.rebind(var144, var132);
                        module0012.$g66$.rebind(var143, var132);
                        module0012.$g68$.rebind(var142, var132);
                        module0012.$g67$.rebind(var141, var132);
                        module0012.$g65$.rebind(var140, var132);
                        module0012.$g73$.rebind(var3_134, var132);
                    }
                }
                finally {
                    final SubLObject var3_135 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var132);
                        if (NIL != var136 && NIL == var137) {
                            module0034.f1873(var136, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_135, var132);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var3_133, var132);
            }
            module0006.f215(module0034.f1878(var135), StreamsLow.$standard_output$.getDynamicValue(var132));
        }
        finally {
            module0322.$g2823$.rebind(var133, var132);
        }
        module0006.f218((SubLObject)T, (SubLObject)$ic43$, module0051.f3574(module0322.f21767(), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0083.f5695(var114);
    }
    
    public static SubLObject f34827(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        module0322.f21764($ic47$, (SubLObject)ONE_INTEGER);
        final SubLObject var15 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var16 = module0147.$g2095$.currentBinding(var13);
        try {
            module0147.$g2094$.bind((SubLObject)$ic48$, var13);
            module0147.$g2095$.bind($ic49$, var13);
            SubLObject var17 = module0322.f21725(var12, $ic47$, (SubLObject)ONE_INTEGER, (SubLObject)T);
            SubLObject var18 = (SubLObject)NIL;
            var18 = var17.first();
            while (NIL != var17) {
                SubLObject var20;
                final SubLObject var19 = var20 = var18;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic50$);
                var21 = var20.first();
                var20 = (var22 = var20.rest());
                if ((NIL == module0563.f34731() || NIL != module0563.f34732(var21)) && NIL == module0205.f13145((SubLObject)$ic45$, var21, (SubLObject)T, (SubLObject)UNPROVIDED) && !var12.eql(var21)) {
                    final SubLObject var23 = (SubLObject)((NIL != Sequences.find((SubLObject)$ic51$, var22, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic52$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? $ic51$ : $ic53$);
                    final SubLObject var24 = f34830(var22, var12);
                    if (NIL != module0161.f10481(var24)) {
                        var14 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0202.f12768($ic54$, var12, var21), var24, var23), var14);
                    }
                }
                var17 = var17.rest();
                var18 = var17.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var16, var13);
            module0147.$g2094$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f34830(final SubLObject var148, final SubLObject var150) {
        SubLObject var151 = (SubLObject)NIL;
        if (NIL == var151) {
            SubLObject var152;
            SubLObject var153;
            for (var152 = var148, var153 = (SubLObject)NIL, var153 = var152.first(); NIL == var151 && NIL != var152; var151 = f34831(var153, var150), var152 = var152.rest(), var153 = var152.first()) {}
        }
        return var151;
    }
    
    public static SubLObject f34831(final SubLObject var151, final SubLObject var150) {
        final SubLThread var152 = SubLProcess.currentSubLThread();
        if (NIL != conses_high.member(var151, $g4127$.getDynamicValue(var152), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != assertion_handles_oc.f11035(var151)) {
            return (SubLObject)((NIL != module0205.f13220(var150, var151, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0205.f13145((SubLObject)$ic45$, module0191.f11976(var151), (SubLObject)T, (SubLObject)UNPROVIDED)) ? module0191.f11976(var151) : NIL);
        }
        if (NIL != module0191.f11952(var151)) {
            SubLObject var153 = (SubLObject)NIL;
            final SubLObject var154 = $g4127$.currentBinding(var152);
            try {
                $g4127$.bind((SubLObject)ConsesLow.cons(var151, $g4127$.getDynamicValue(var152)), var152);
                var153 = f34830(module0333.f22428(var151), var150);
            }
            finally {
                $g4127$.rebind(var154, var152);
            }
            return var153;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34832() {
        final SubLObject var58 = $g4128$.getGlobalValue();
        if (NIL != var58) {
            module0034.f1818(var58);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34833() {
        return module0034.f1829($g4128$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34834() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic21$, var1);
            module0147.$g2095$.bind($ic22$, var1);
            var2 = module0260.f17036($ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var4, var1);
            module0147.$g2094$.rebind(var3, var1);
        }
        return var2;
    }
    
    public static SubLObject f34835() {
        SubLObject var59 = $g4128$.getGlobalValue();
        if (NIL == var59) {
            var59 = module0034.f1934((SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var60 = module0034.f1810(var59, (SubLObject)UNPROVIDED);
        if (var60 == $ic19$) {
            var60 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34834()));
            module0034.f1812(var59, var60, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var60);
    }
    
    public static SubLObject f34807() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = f34824();
        final SubLObject var3 = Sequences.cconcatenate((SubLObject)$ic1$, new SubLObject[] { module0006.f203(Sequences.length(var2)), $ic57$ });
        final SubLObject var4 = var2;
        module0012.$g82$.setDynamicValue(var3, var1);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
        module0012.$g83$.setDynamicValue(Sequences.length(var4), var1);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var1);
        final SubLObject var5 = module0012.$g75$.currentBinding(var1);
        final SubLObject var6 = module0012.$g76$.currentBinding(var1);
        final SubLObject var7 = module0012.$g77$.currentBinding(var1);
        final SubLObject var8 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(module0012.$g82$.getDynamicValue(var1));
            SubLObject var9 = var4;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)ONE_INTEGER), var1);
                f34836(var10);
                var9 = var9.rest();
                var10 = var9.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var8, var1);
            module0012.$g77$.rebind(var7, var1);
            module0012.$g76$.rebind(var6, var1);
            module0012.$g75$.rebind(var5, var1);
        }
        return Sequences.length(var2);
    }
    
    public static SubLObject f34837(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)ZERO_INTEGER;
        final SubLObject var134 = (SubLObject)$ic58$;
        final SubLObject var135 = module0012.$g73$.currentBinding(var132);
        final SubLObject var136 = module0012.$g65$.currentBinding(var132);
        final SubLObject var137 = module0012.$g67$.currentBinding(var132);
        final SubLObject var138 = module0012.$g68$.currentBinding(var132);
        final SubLObject var139 = module0012.$g66$.currentBinding(var132);
        final SubLObject var140 = module0012.$g69$.currentBinding(var132);
        final SubLObject var141 = module0012.$g70$.currentBinding(var132);
        final SubLObject var142 = module0012.$silent_progressP$.currentBinding(var132);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var132);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var132), var132);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var132);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var132);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var132);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var132);
            module0012.$g70$.bind((SubLObject)T, var132);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var134) ? module0012.$silent_progressP$.getDynamicValue(var132) : T), var132);
            module0012.f474(var134);
            SubLObject var145;
            for (SubLObject var143 = (SubLObject)NIL; NIL == var143; var143 = (SubLObject)makeBoolean(NIL == var145)) {
                var132.resetMultipleValues();
                final SubLObject var144 = module0052.f3693(var131);
                var145 = var132.secondMultipleValue();
                var132.resetMultipleValues();
                if (NIL != var145) {
                    f34836(var144);
                    var133 = Numbers.add(var133, (SubLObject)ONE_INTEGER);
                }
            }
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var142, var132);
            module0012.$g70$.rebind(var141, var132);
            module0012.$g69$.rebind(var140, var132);
            module0012.$g66$.rebind(var139, var132);
            module0012.$g68$.rebind(var138, var132);
            module0012.$g67$.rebind(var137, var132);
            module0012.$g65$.rebind(var136, var132);
            module0012.$g73$.rebind(var135, var132);
        }
        return var133;
    }
    
    public static SubLObject f34836(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0131.$g1531$.currentBinding(var19);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var19);
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var18, (SubLObject)$ic59$);
            var21 = var18.first();
            SubLObject var24 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var24, var18, (SubLObject)$ic59$);
            var22 = var24.first();
            var24 = var24.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var24, var18, (SubLObject)$ic59$);
            var23 = var24.first();
            var24 = var24.rest();
            if (NIL == var24) {
                SubLObject var25 = (SubLObject)NIL;
                try {
                    var19.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var3_154 = Errors.$error_handler$.currentBinding(var19);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic7$, var19);
                        try {
                            module0540.f33517(var21, var22, (SubLObject)ConsesLow.list((SubLObject)$ic60$, var23));
                        }
                        catch (Throwable var26) {
                            Errors.handleThrowable(var26, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var3_154, var19);
                    }
                }
                catch (Throwable var27) {
                    var25 = Errors.handleThrowable(var27, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var19.throwStack.pop();
                }
                if (var25.isString()) {
                    Errors.warn((SubLObject)$ic8$, var25);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic59$);
            }
        }
        finally {
            module0131.$g1531$.rebind(var20, var19);
        }
        return var18;
    }
    
    public static SubLObject f34838() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4129$.getDynamicValue(var1);
    }
    
    public static SubLObject f34809() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        $g4129$.setDynamicValue((SubLObject)NIL, var1);
        final SubLObject var3;
        final SubLObject var2 = var3 = module0076.f5287(module0563.f34761());
        module0012.$g82$.setDynamicValue((SubLObject)$ic61$, var1);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
        module0012.$g83$.setDynamicValue(Sequences.length(var3), var1);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var1);
        final SubLObject var4 = module0012.$g75$.currentBinding(var1);
        final SubLObject var5 = module0012.$g76$.currentBinding(var1);
        final SubLObject var6 = module0012.$g77$.currentBinding(var1);
        final SubLObject var7 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(module0012.$g82$.getDynamicValue(var1));
            SubLObject var8 = var3;
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)ONE_INTEGER), var1);
                if (NIL == module0178.f11375(var9) && NIL != module0178.f11376(var9)) {
                    final SubLObject var10 = module0178.f11299(var9);
                    if (NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)$ic62$), var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        if (NIL != $g4120$.getDynamicValue(var1)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic63$);
                            PrintLow.format((SubLObject)T, (SubLObject)$ic29$, module0538.f33367(var9, (SubLObject)UNPROVIDED), module0178.f11287(var9));
                        }
                        $g4129$.setDynamicValue((SubLObject)ConsesLow.cons(var9, $g4129$.getDynamicValue(var1)), var1);
                    }
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var7, var1);
            module0012.$g77$.rebind(var6, var1);
            module0012.$g76$.rebind(var5, var1);
            module0012.$g75$.rebind(var4, var1);
        }
        return Sequences.length($g4129$.getDynamicValue(var1));
    }
    
    public static SubLObject f34810() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = f34838();
        final SubLObject var3 = Sequences.cconcatenate((SubLObject)$ic1$, new SubLObject[] { module0006.f203(Sequences.length(var2)), $ic64$ });
        final SubLObject var4 = var2;
        module0012.$g82$.setDynamicValue(var3, var1);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
        module0012.$g83$.setDynamicValue(Sequences.length(var4), var1);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var1);
        final SubLObject var5 = module0012.$g75$.currentBinding(var1);
        final SubLObject var6 = module0012.$g76$.currentBinding(var1);
        final SubLObject var7 = module0012.$g77$.currentBinding(var1);
        final SubLObject var8 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(module0012.$g82$.getDynamicValue(var1));
            SubLObject var9 = var4;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)ONE_INTEGER), var1);
                final SubLObject var11 = module0178.f11292(var10);
                final SubLObject var12 = module0178.f11293(var10);
                SubLObject var13 = (SubLObject)NIL;
                try {
                    var1.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var3_159 = Errors.$error_handler$.currentBinding(var1);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic7$, var1);
                        try {
                            assertions_interface_oc.f11097(var10, var11, var12);
                        }
                        catch (Throwable var14) {
                            Errors.handleThrowable(var14, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var3_159, var1);
                    }
                }
                catch (Throwable var15) {
                    var13 = Errors.handleThrowable(var15, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var1.throwStack.pop();
                }
                if (var13.isString()) {
                    Errors.warn((SubLObject)$ic8$, var13);
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var8, var1);
            module0012.$g77$.rebind(var7, var1);
            module0012.$g76$.rebind(var6, var1);
            module0012.$g75$.rebind(var5, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34839(final SubLObject var12, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = var22;
        final SubLObject var26 = module0147.$g2094$.currentBinding(var23);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var23);
        try {
            module0147.$g2094$.bind(module0147.f9531(var25), var23);
            module0147.$g2095$.bind(module0147.f9534(var25), var23);
            var24 = module0440.f30718($ic65$, var12);
        }
        finally {
            module0147.$g2095$.rebind(var27, var23);
            module0147.$g2094$.rebind(var26, var23);
        }
        return var24;
    }
    
    public static SubLObject f34840(final SubLObject var161, final SubLObject var162, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        return module0440.f30711($ic65$, var162, var161, var22, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34841() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34802", "S#37946", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34805", "S#38175", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34808", "S#37950", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34803", "S#38176", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34804", "S#38177", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34813", "S#38178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34814", "S#38179", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34811", "S#38180", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34815", "S#38181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34816", "S#38182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34812", "S#38183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34817", "S#38073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34818", "S#38184", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34821", "S#38185", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34822", "S#38186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34823", "S#38187", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34819", "S#38188", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34820", "S#38189", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34824", "S#38190", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34806", "S#38191", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34826", "S#38192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34825", "S#37965", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34828", "S#38193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34829", "S#37961", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34827", "S#38194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34830", "S#38195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34831", "S#38196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34832", "S#38197", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34833", "S#38198", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34834", "S#38199", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34835", "S#38200", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34807", "S#38201", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34837", "S#37960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34836", "S#38202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34838", "S#38203", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34809", "S#38204", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34810", "S#38205", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34839", "S#38206", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0564", "f34840", "S#38207", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34842() {
        $g4120$ = SubLFiles.defparameter("S#38208", (SubLObject)NIL);
        $g4121$ = SubLFiles.defparameter("S#38209", (SubLObject)NIL);
        $g4122$ = SubLFiles.defparameter("S#38210", (SubLObject)$ic14$);
        $g4123$ = SubLFiles.defparameter("S#38211", (SubLObject)$ic15$);
        $g4124$ = SubLFiles.deflexical("S#38212", (SubLObject)NIL);
        $g4125$ = SubLFiles.defparameter("S#38213", (SubLObject)TWENTY_INTEGER);
        $g4126$ = SubLFiles.deflexical("S#38214", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic39$)) ? $g4126$.getGlobalValue() : NIL));
        $g4127$ = SubLFiles.defparameter("S#38215", (SubLObject)NIL);
        $g4128$ = SubLFiles.deflexical("S#38216", (SubLObject)NIL);
        $g4129$ = SubLFiles.defparameter("S#38217", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34843() {
        module0034.f1909((SubLObject)$ic16$);
        module0003.f57((SubLObject)$ic39$);
        module0034.f1909((SubLObject)$ic55$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34841();
    }
    
    public void initializeVariables() {
        f34842();
    }
    
    public void runTopLevelForms() {
        f34843();
    }
    
    static {
        me = (SubLFile)new module0564();
        $g4120$ = null;
        $g4121$ = null;
        $g4122$ = null;
        $g4123$ = null;
        $g4124$ = null;
        $g4125$ = null;
        $g4126$ = null;
        $g4127$ = null;
        $g4128$ = null;
        $g4129$ = null;
        $ic0$ = makeString("Computing additional redundant definitional info");
        $ic1$ = makeString("Adding ");
        $ic2$ = makeString(" additional redundant definitional info assertions for ");
        $ic3$ = makeString(" FORTs");
        $ic4$ = makeString("Adding additional redundant definitional info for ");
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("BACKWARD"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic7$ = makeSymbol("S#38", "CYC");
        $ic8$ = makeString("~A");
        $ic9$ = makeString("Turning backward GAFs forward");
        $ic10$ = makeSymbol("STRINGP");
        $ic11$ = makeKeyword("SKIP");
        $ic12$ = makeSymbol("FIRST");
        $ic13$ = makeKeyword("FORWARD");
        $ic14$ = ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)T), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg2Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg3Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg3Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg4Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg4Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg5Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg5Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg6Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg6Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argsIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argsQuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argsGenl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("resultIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("resultGenl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeSymbol("S#19647", "CYC"), (SubLObject)makeSymbol("S#15517", "CYC"), (SubLObject)makeSymbol("MIN-PREDICATES"), (SubLObject)T), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeSymbol("S#19647", "CYC"), (SubLObject)makeSymbol("S#15517", "CYC"), (SubLObject)makeSymbol("MIN-PREDICATES"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)makeSymbol("S#19859", "CYC"), (SubLObject)makeSymbol("GENL-MT?"), (SubLObject)makeSymbol("S#13271", "CYC"), (SubLObject)T), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg2QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg3QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg4QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg5QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg6QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)makeSymbol("MIN-COLS"), (SubLObject)NIL) });
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("geographicalSubRegions")), (SubLObject)makeSymbol("S#38206", "CYC"), (SubLObject)makeSymbol("S#38207", "CYC"), (SubLObject)NIL, (SubLObject)T));
        $ic16$ = makeSymbol("S#38183", "CYC");
        $ic17$ = makeSymbol("S#38212", "CYC");
        $ic18$ = makeInteger(2000);
        $ic19$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#37936", "CYC"), (SubLObject)makeSymbol("S#37937", "CYC"), (SubLObject)makeSymbol("S#38218", "CYC"), (SubLObject)makeSymbol("S#37938", "CYC"));
        $ic21$ = makeSymbol("S#12274", "CYC");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic23$ = makeKeyword("TRUE");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#38219", "CYC"), (SubLObject)makeSymbol("S#38220", "CYC"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("Individual"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic28$ = makeString("~%Additions :");
        $ic29$ = makeString("~%  ~S in ~S");
        $ic30$ = makeSymbol("S#37969", "CYC");
        $ic31$ = makeString("~%Cycle: ~S ~S ~S");
        $ic32$ = makeSymbol("MIN-COLS");
        $ic33$ = makeSymbol("MIN-PREDICATES");
        $ic34$ = makeSymbol("S#13271", "CYC");
        $ic35$ = makeString("~%Given: ~S~%Minimal: ~S");
        $ic36$ = makeSymbol("FORT-P");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic39$ = makeSymbol("S#38214", "CYC");
        $ic40$ = makeString("Computing #$broaderTerm additions for ");
        $ic41$ = makeString(" terms");
        $ic42$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic43$ = makeString("Spent ~A computing spec-preds and inverses.~%");
        $ic44$ = makeSymbol("S#38193", "CYC");
        $ic45$ = makeSymbol("SKOLEM-NART?");
        $ic46$ = makeString("Computing #$broaderTerm additions");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("broaderTerm-NonTaxonomic"));
        $ic48$ = makeSymbol("S#12275", "CYC");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic50$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#38221", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic51$ = makeKeyword("DEFAULT");
        $ic52$ = makeSymbol("SUPPORT-STRENGTH");
        $ic53$ = makeKeyword("MONOTONIC");
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("broaderTerm"));
        $ic55$ = makeSymbol("S#38200", "CYC");
        $ic56$ = makeSymbol("S#38216", "CYC");
        $ic57$ = makeString(" #$broaderTerm assertions");
        $ic58$ = makeString("Adding some #$broaderTerm assertions");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13918", "CYC"));
        $ic60$ = makeKeyword("STRENGTH");
        $ic61$ = makeString("Computing additional redundant asserted arguments");
        $ic62$ = makeSymbol("S#38135", "CYC");
        $ic63$ = makeString("~%Addition :");
        $ic64$ = makeString(" additional redundant asserted arguments");
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("geographicalSubRegions"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 799 ms
	
	Decompiled with Procyon 0.5.32.
*/