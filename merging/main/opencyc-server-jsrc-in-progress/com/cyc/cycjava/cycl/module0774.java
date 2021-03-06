package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0774 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0774";
    public static final String myFingerPrint = "e33fa429b71565580724a83f61f7b22865718382e8f94ec0e2513f174db4b404";
    private static SubLSymbol $g6209$;
    public static SubLSymbol $g6210$;
    public static SubLSymbol $g6211$;
    private static SubLSymbol $g6212$;
    private static SubLSymbol $g6213$;
    private static SubLSymbol $g6214$;
    private static SubLSymbol $g6215$;
    private static SubLSymbol $g6216$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLInteger $ic59$;
    private static final SubLList $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLFloat $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLFloat $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLString $ic73$;
    private static final SubLList $ic74$;
    private static final SubLInteger $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    
    public static SubLObject f49627(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic0$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic2$, assertion_handles_oc.f11025(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f49628(final SubLObject var6) {
        final SubLObject var7 = module0656.f39970(var6);
        if (NIL == assertion_handles_oc.f11035(var7)) {
            module0656.f39789((SubLObject)$ic5$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var8 = f49629(var7);
        final SubLObject var9 = module0775.f49679(var8).first();
        return f49630(var9, var8, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49629(final SubLObject var1) {
        SubLObject var2 = f49631(var1);
        if (NIL == inference_datastructures_inference_oc.f25730(var2)) {
            f49632(var1);
            var2 = f49631(var1);
        }
        return var2;
    }
    
    public static SubLObject f49633() {
        final SubLObject var9 = $g6209$.getGlobalValue();
        if (NIL != var9) {
            module0034.f1818(var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49632(final SubLObject var1) {
        return module0034.f1829($g6209$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49634(final SubLObject var1) {
        final SubLObject var2 = module0289.f19396(var1);
        final SubLObject var3 = module0178.f11287(var1);
        final SubLObject var4 = module0409.f28515(var2, var3, (SubLObject)UNPROVIDED);
        module0409.f28521(var4, (SubLObject)$ic8$);
        return inference_datastructures_inference_oc.f25618(var4);
    }
    
    public static SubLObject f49631(final SubLObject var1) {
        SubLObject var2 = $g6209$.getGlobalValue();
        if (NIL == var2) {
            var2 = module0034.f1934((SubLObject)$ic7$, (SubLObject)$ic9$, (SubLObject)SIXTEEN_INTEGER, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)$ic10$);
        if (var3 == $ic10$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49634(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f49635(final SubLObject var8, final SubLObject var15, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert NIL != module0366.f24916(var8) : var8;
        assert NIL != inference_datastructures_inference_oc.f25684(var15) : var15;
        if (NIL == var2) {
            var2 = Sequences.cconcatenate((SubLObject)$ic13$, new SubLObject[] { module0006.f203(module0361.f23996(module0366.f24936(var8))), $ic14$, module0006.f203(module0366.f24935(var8)), $ic15$ });
        }
        final SubLObject var17 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var16), (SubLObject)$ic16$, new SubLObject[] { module0361.f23996(module0366.f24936(var8)), module0366.f24935(var8), inference_datastructures_inference_oc.f25422(inference_datastructures_inference_oc.f25732(var15)), inference_datastructures_inference_oc.f25629(var15) });
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var17) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0015.$g533$.currentBinding(var16);
        try {
            module0015.$g533$.bind((SubLObject)T, var16);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39019(var2);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var18, var16);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var8;
    }
    
    public static SubLObject f49636(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0081.f5563($g6210$.getDynamicValue(var17));
        SubLObject var19 = (SubLObject)NIL;
        try {
            var19 = ReadWriteLocks.rw_lock_seize_write_lock(var18);
            SubLObject var20 = module0079.f5416($g6210$.getDynamicValue(var17), var16, (SubLObject)UNPROVIDED);
            if (NIL == module0034.f1839(var20)) {
                final SubLObject var21 = print_high.princ_to_string(var16);
                var20 = module0034.f1854(var21, ReadWriteLocks.new_rw_lock(var21), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0079.f5412($g6210$.getDynamicValue(var17), var16, var20);
            }
            return var20;
        }
        finally {
            if (NIL != var19) {
                ReadWriteLocks.rw_lock_release_write_lock(var18);
            }
        }
    }
    
    public static SubLObject f49637(final SubLObject var21, final SubLObject var22) {
        module0773.f49306(var21, f49636(var22));
        return var22;
    }
    
    public static SubLObject f49638(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f49639(var6);
        final SubLObject var9 = var7.secondMultipleValue();
        final SubLObject var10 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        var7.resetMultipleValues();
        final SubLObject var11 = f49640(var8, var9, (SubLObject)UNPROVIDED);
        final SubLObject var12 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var12) {
            final SubLObject var13 = module0642.f39104((SubLObject)$ic21$, var10);
            if (NIL != var13) {
                f49637(var11, var13);
            }
            if (NIL != module0642.f39104((SubLObject)$ic22$, var10)) {
                module0773.f49324(var11, (SubLObject)NIL);
            }
            module0773.f49330(var11, module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic23$, var10)));
            if (NIL != module0642.f39104((SubLObject)$ic24$, var10)) {
                module0773.f49327(var11, (SubLObject)NIL);
            }
            if (NIL != module0642.f39104((SubLObject)$ic25$, var10)) {
                module0773.f49328(var11, (SubLObject)NIL);
            }
            if (NIL != module0642.f39104((SubLObject)$ic26$, var10)) {
                module0773.f49345(var11, (SubLObject)T);
            }
            if (NIL != module0642.f39104((SubLObject)$ic27$, var10)) {
                module0773.f49347(var11, (SubLObject)T);
            }
            if (NIL != module0642.f39104((SubLObject)$ic28$, var10)) {
                module0773.f49351(var11, (SubLObject)T);
            }
            if (NIL != module0642.f39104((SubLObject)$ic29$, var10)) {
                module0773.f49349(var11, (SubLObject)T);
            }
            if (NIL != module0642.f39104((SubLObject)$ic30$, var10)) {
                module0773.f49356(var11, (SubLObject)NIL);
                module0773.f49354(var11, (SubLObject)NIL);
            }
            f49641(var11);
        }
        return f49630(var8, var9, module0773.f49355(var11));
    }
    
    public static SubLObject f49639(final SubLObject var6) {
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)$ic32$);
        var7 = var6.first();
        SubLObject var11 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var6, (SubLObject)$ic32$);
        var8 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var6, (SubLObject)$ic32$);
        var9 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var6, (SubLObject)$ic32$);
        var10 = var11.first();
        final SubLObject var12;
        var11 = (var12 = var11.rest());
        final SubLObject var13 = reader.read_from_string_ignoring_errors(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = reader.read_from_string_ignoring_errors(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var15 = reader.read_from_string_ignoring_errors(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var16 = reader.read_from_string_ignoring_errors(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        assert NIL != Types.integerp(var13) : var13;
        assert NIL != Types.integerp(var14) : var14;
        assert NIL != Types.integerp(var15) : var15;
        assert NIL != Types.integerp(var16) : var16;
        final SubLObject var17 = module0361.f23997(var13);
        assert NIL != module0361.f24009(var17) : var17;
        final SubLObject var18 = module0361.f24319(var17, var14);
        assert NIL != module0366.f24916(var18) : var18;
        final SubLObject var19 = module0361.f24194(var17, var15);
        assert NIL != inference_datastructures_inference_oc.f25275(var19) : var19;
        final SubLObject var20 = inference_datastructures_inference_oc.f25616(var19, var16);
        assert NIL != inference_datastructures_inference_oc.f25684(var20) : var20;
        return Values.values(var18, var20, var12);
    }
    
    public static SubLObject f49642(final SubLObject var21, SubLObject var2, SubLObject var36) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)$ic1$;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        assert NIL != module0773.f49270(var21) : var21;
        final SubLObject var38 = module0773.f49296(var21);
        if (NIL == var2) {
            var2 = Sequences.cconcatenate((SubLObject)$ic37$, new SubLObject[] { module0006.f203(var38), $ic15$ });
        }
        final SubLObject var39 = module0656.f39832(var36);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var37), (SubLObject)$ic38$, var38);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var39) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var39);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0015.$g533$.currentBinding(var37);
        try {
            module0015.$g533$.bind((SubLObject)T, var37);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39019(var2);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var40, var37);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var21;
    }
    
    public static SubLObject f49643(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)$ic41$);
        var8 = var6.first();
        final SubLObject var9 = var6.rest();
        if (NIL == var9) {
            final SubLObject var10 = module0773.f49287(module0038.f2642(var8));
            if (NIL != var10) {
                final SubLObject var11 = (SubLObject)NIL;
                final SubLObject var12 = module0015.$g538$.currentBinding(var7);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var7))) ? module0015.$g538$.getDynamicValue(var7) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var7);
                    module0642.f39020((SubLObject)$ic42$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
                    final SubLObject var13 = module0014.f672((SubLObject)$ic43$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic44$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var13) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var13);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic45$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var11) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var11);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var5_42 = module0015.$g535$.currentBinding(var7);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var7);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var7)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var7)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic48$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_43 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic49$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_44 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic50$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic51$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic52$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_44, var7);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var11) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var11);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            f49644(var10);
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_43, var7);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var5_42, var7);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var12, var7);
                }
            }
            else {
                module0656.f39789((SubLObject)$ic53$, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic41$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49645(final SubLObject var8, final SubLObject var7) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0067.f4885($g6211$.getDynamicValue(var9), (SubLObject)ConsesLow.list(var8, var7), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49646(final SubLObject var8, final SubLObject var7, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        return module0067.f4886($g6211$.getDynamicValue(var22), (SubLObject)ConsesLow.list(var8, var7), var21);
    }
    
    public static SubLObject f49647(final SubLObject var8, final SubLObject var7) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0067.f4887($g6211$.getDynamicValue(var9), (SubLObject)ConsesLow.list(var8, var7));
    }
    
    public static SubLObject f49641(final SubLObject var21) {
        return module0059.f4332((SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)ConsesLow.list(var21));
    }
    
    public static SubLObject f49648(final SubLObject var21) {
        return module0084.f5775($g6212$.getGlobalValue(), var21, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49649(final SubLObject var21) {
        return module0067.f4885($g6212$.getGlobalValue(), var21, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f49650(final SubLObject var21) {
        module0773.f49491(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var22 = module0773.f49310(var21);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            module0773.f49439(var23);
            f49648(var21);
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f49640(final SubLObject var8, final SubLObject var7, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)T;
        }
        SubLObject var48 = f49645(var8, var7);
        SubLObject var49 = (SubLObject)NIL;
        if (NIL == var48 && NIL != var47) {
            var48 = module0773.f49504();
            var49 = (SubLObject)T;
            module0773.f49505(var48, var8);
            module0773.f49506(var48, var7);
            module0773.f49359(var48, module0677.f41312());
            module0773.f49354(var48, (SubLObject)T);
            f49646(var8, var7, var48);
        }
        return Values.values(var48, var49);
    }
    
    public static SubLObject f49651(final SubLObject var8, final SubLObject var7) {
        final SubLObject var9 = f49640(var8, var7, (SubLObject)NIL);
        return (SubLObject)((NIL != var9) ? f49652(var9) : ZERO_INTEGER);
    }
    
    public static SubLObject f49652(final SubLObject var21) {
        final SubLObject var22 = Sequences.length(module0773.f49310(var21));
        final SubLObject var23 = Numbers.integerDivide((SubLObject)$ic59$, module0048.f_1X($g6213$.getGlobalValue()));
        SubLObject var24 = (SubLObject)(ZERO_INTEGER.eql(var22) ? ZERO_INTEGER : var23);
        final SubLObject var25 = f49649(var21);
        if (var25.isPositive()) {
            var24 = Numbers.add(var24, Numbers.truncate(Numbers.multiply(Numbers.subtract((SubLObject)$ic59$, var23), var25), var22));
        }
        return var24;
    }
    
    public static SubLObject f49630(final SubLObject var8, final SubLObject var7, SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)T;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        assert NIL != module0366.f24916(var8) : var8;
        assert NIL != inference_datastructures_inference_oc.f25684(var7) : var7;
        var53.resetMultipleValues();
        final SubLObject var54 = f49640(var8, var7, (SubLObject)UNPROVIDED);
        final SubLObject var55 = var53.secondMultipleValue();
        var53.resetMultipleValues();
        final SubLObject var56 = f49652(var54);
        if (var56.numL((SubLObject)$ic59$)) {
            if (NIL != var55) {
                f49641(var54);
            }
            f49653(var54, var56);
        }
        else {
            f49647(var8, var7);
            module0773.f49356(var54, var52);
            final SubLObject var57 = (SubLObject)NIL;
            final SubLObject var58 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic42$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var59 = module0014.f672((SubLObject)$ic43$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic44$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var59) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var59);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic45$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var57) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var57);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var5_53 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic48$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_54 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic49$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_55 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic50$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic51$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic52$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_55, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var57) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var57);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        f49644(var54);
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_54, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var5_53, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var58, var53);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49654(final SubLObject var21, final SubLObject var50, final SubLObject var56, SubLObject var57) {
        if (var57 == UNPROVIDED) {
            var57 = Time.get_universal_time();
        }
        $g6214$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var21, var50, var56, var57), $g6214$.getGlobalValue()));
        return var56;
    }
    
    public static SubLObject f49655(final SubLObject var21, SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = Time.get_universal_time();
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (NIL != module0075.f5218($g6215$.getGlobalValue())) {
            SubLObject var60 = (SubLObject)NIL;
            try {
                final SubLObject var61 = stream_macros.$stream_requires_locking$.currentBinding(var59);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var59);
                    var60 = compatibility.open_text($g6215$.getGlobalValue(), (SubLObject)$ic63$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var61, var59);
                }
                if (!var60.isStream()) {
                    Errors.error((SubLObject)$ic64$, $g6215$.getGlobalValue());
                }
                final SubLObject var60_61 = var60;
                final SubLObject var62 = conses_high.copy_list($g6214$.getGlobalValue());
                $g6214$.setGlobalValue(Sequences.delete(var21, $g6214$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic65$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                SubLObject var63 = var62;
                SubLObject var64 = (SubLObject)NIL;
                var64 = var63.first();
                while (NIL != var63) {
                    if (var21.eql(var64.first())) {
                        SubLObject var66;
                        final SubLObject var65 = var66 = var64.rest();
                        SubLObject var67 = (SubLObject)NIL;
                        SubLObject var56_65 = (SubLObject)NIL;
                        SubLObject var68 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)$ic66$);
                        var67 = var66.first();
                        var66 = var66.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)$ic66$);
                        var56_65 = var66.first();
                        var66 = var66.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)$ic66$);
                        var68 = var66.first();
                        var66 = var66.rest();
                        if (NIL == var66) {
                            final SubLObject var69 = Numbers.subtract(var58, var68);
                            f49656(var67, var56_65, var69, var60_61);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var65, (SubLObject)$ic66$);
                        }
                    }
                    var63 = var63.rest();
                    var64 = var63.first();
                }
            }
            finally {
                final SubLObject var70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var59);
                    if (var60.isStream()) {
                        streams_high.close(var60, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var70, var59);
                }
            }
        }
        return var21;
    }
    
    public static SubLObject f49656(final SubLObject var50, final SubLObject var56, final SubLObject var66, final SubLObject var60) {
        streams_high.write_line(module0038.f2761(Mapping.mapcar((SubLObject)$ic67$, (SubLObject)ConsesLow.list(var50, var56, var66)), (SubLObject)Characters.CHAR_tab), var60, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49657(final SubLObject var21, SubLObject var50) {
        SubLObject var51 = (SubLObject)(var50.numGE((SubLObject)$ic59$) ? ZERO_INTEGER : module0107.f7627());
        if (NIL != var21 && NIL != module0107.f7628(var51)) {
            SubLObject var52;
            SubLObject var53;
            for (var52 = module0773.f49363(var21), var53 = module0004.f102(var52, (SubLObject)UNPROVIDED); var53.isZero(); var53 = module0004.f102(var52, (SubLObject)UNPROVIDED), var50 = f49652(var21)) {
                Threads.sleep((SubLObject)$ic68$);
            }
            final SubLObject var54 = Numbers.integerDivide(Numbers.multiply(var53, (SubLObject)$ic59$), var50);
            var51 = Numbers.subtract(var54, var53);
        }
        f49654(var21, var50, var51, (SubLObject)UNPROVIDED);
        return Values.values(f49658(var51, var50), var50);
    }
    
    public static SubLObject f49659() {
        final SubLObject var9 = $g6216$.getGlobalValue();
        if (NIL != var9) {
            module0034.f1818(var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49660() {
        return module0034.f1829($g6216$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49661() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)ConsesLow.make_list((SubLObject)FIVE_INTEGER, (SubLObject)$ic70$);
        if (NIL != module0075.f5218($g6215$.getGlobalValue())) {
            final SubLObject var5 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var6 = $g6215$.getGlobalValue();
            SubLObject var7 = (SubLObject)NIL;
            try {
                final SubLObject var8 = stream_macros.$stream_requires_locking$.currentBinding(var3);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var3);
                    var7 = compatibility.open_text(var6, (SubLObject)$ic71$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var8, var3);
                }
                if (!var7.isStream()) {
                    Errors.error((SubLObject)$ic64$, var6);
                }
                final SubLObject var9 = var7;
                if (var9.isStream()) {
                    final SubLObject var76_77 = var9;
                    SubLObject var10 = (SubLObject)NIL;
                    SubLObject var11 = (SubLObject)NIL;
                    var10 = (SubLObject)ZERO_INTEGER;
                    for (var11 = module0075.f5202(var76_77); NIL != var11; var11 = module0075.f5202(var76_77)) {
                        final SubLObject var12 = module0038.f2738(var11, (SubLObject)$ic72$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic73$, (SubLObject)$ic73$)), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)UNPROVIDED);
                        SubLObject var14;
                        final SubLObject var13 = var14 = var12;
                        SubLObject var15 = (SubLObject)NIL;
                        SubLObject var16 = (SubLObject)NIL;
                        SubLObject var17 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic74$);
                        var15 = var14.first();
                        var14 = var14.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic74$);
                        var16 = var14.first();
                        var14 = var14.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic74$);
                        var17 = var14.first();
                        var14 = var14.rest();
                        if (NIL == var14) {
                            if (NIL != module0038.f2727(var16)) {
                                final SubLObject var18 = Numbers.integerDivide(reader.parse_integer(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic75$);
                                module0084.f5762(var5, var18, Numbers.divide(reader.parse_integer(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), reader.parse_integer(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic74$);
                        }
                        var10 = module0048.f_1X(var10);
                    }
                }
            }
            finally {
                final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                    if (var7.isStream()) {
                        streams_high.close(var7, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var19, var3);
                }
            }
            SubLObject var20;
            for (var20 = module0066.f4838(module0067.f4891(var5)); NIL == module0066.f4841(var20); var20 = module0066.f4840(var20)) {
                var3.resetMultipleValues();
                final SubLObject var21 = module0066.f4839(var20);
                final SubLObject var22 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                ConsesLow.set_nth(var21, var4, module0048.f3387(var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            module0066.f4842(var20);
        }
        return var4;
    }
    
    public static SubLObject f49662() {
        SubLObject var13 = $g6216$.getGlobalValue();
        if (NIL == var13) {
            var13 = module0034.f1934((SubLObject)$ic69$, (SubLObject)$ic76$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var14 = module0034.f1810(var13, (SubLObject)UNPROVIDED);
        if (var14 == $ic10$) {
            var14 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49661()));
            module0034.f1812(var13, var14, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var14);
    }
    
    public static SubLObject f49658(final SubLObject var67, final SubLObject var50) {
        final SubLObject var68 = Numbers.integerDivide(var50, (SubLObject)$ic75$);
        final SubLObject var69 = ConsesLow.nth(var68, f49662());
        return var69.isPositive() ? Numbers.floor(Numbers.divide(var67, var69), (SubLObject)UNPROVIDED) : var67;
    }
    
    public static SubLObject f49653(final SubLObject var21, final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        var51.resetMultipleValues();
        final SubLObject var52 = f49657(var21, var50);
        final SubLObject var53 = var51.secondMultipleValue();
        var51.resetMultipleValues();
        final SubLObject var54 = (SubLObject)NIL;
        final SubLObject var55 = module0015.$g538$.currentBinding(var51);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var51))) ? module0015.$g538$.getDynamicValue(var51) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var51);
            module0642.f39020((SubLObject)$ic42$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var51), module0655.$g5142$.getDynamicValue(var51));
            final SubLObject var56 = module0014.f672((SubLObject)$ic43$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic44$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var56) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var56);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic45$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var54) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var54);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var5_89 = module0015.$g535$.currentBinding(var51);
            try {
                module0015.$g535$.bind((SubLObject)T, var51);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var51)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var51)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic48$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_90 = module0015.$g533$.currentBinding(var51);
                try {
                    module0015.$g533$.bind((SubLObject)T, var51);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic49$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_91 = module0015.$g533$.currentBinding(var51);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var51);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic50$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic51$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic52$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_91, var51);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var54) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var54);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var51), module0655.$g5142$.getDynamicValue(var51));
                    final SubLObject var57 = module0014.f672((SubLObject)$ic43$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic44$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var57) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var57);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic45$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39055((SubLObject)TWO_INTEGER);
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var5_92 = module0015.$g535$.currentBinding(var51);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var51);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_93 = module0015.$g533$.currentBinding(var51);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var51);
                            module0642.f39021((SubLObject)$ic77$);
                            if (var53.isPositive()) {
                                module0642.f39028((SubLObject)UNPROVIDED);
                                module0642.f39093(var53, (SubLObject)$ic59$, (SubLObject)$ic59$, module0015.$g521$.getGlobalValue(), module0015.$g520$.getGlobalValue());
                                if (var52.isPositive()) {
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var51), (SubLObject)$ic78$, module0051.f3574(var52, (SubLObject)ZERO_INTEGER));
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    f49642(var21, (SubLObject)$ic79$, (SubLObject)$ic80$);
                                }
                            }
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_93, var51);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var5_92, var51);
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_90, var51);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_89, var51);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var55, var51);
        }
        return var21;
    }
    
    public static SubLObject f49644(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = module0014.f672((SubLObject)$ic81$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic44$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var23) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var23);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic45$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var23 = module0014.f672((SubLObject)$ic82$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic44$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var23) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var23);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic45$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var23 = module0014.f672((SubLObject)$ic83$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic44$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var23) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var23);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic45$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0644.f39197();
        module0016.f892();
        module0016.f895();
        SubLObject var24 = module0014.f657((SubLObject)$ic84$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var24);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic47$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var25 = module0015.$g533$.currentBinding(var22);
        try {
            module0015.$g533$.bind((SubLObject)T, var22);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var25, var22);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var24 = module0014.f657((SubLObject)$ic85$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var24);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic47$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var25 = module0015.$g533$.currentBinding(var22);
        try {
            module0015.$g533$.bind((SubLObject)T, var22);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var25, var22);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var24 = module0014.f657((SubLObject)$ic81$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var24);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic47$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var25 = module0015.$g533$.currentBinding(var22);
        try {
            module0015.$g533$.bind((SubLObject)T, var22);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var25, var22);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var24 = module0014.f657((SubLObject)$ic83$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var24);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic47$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var25 = module0015.$g533$.currentBinding(var22);
        try {
            module0015.$g533$.bind((SubLObject)T, var22);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var25, var22);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        final SubLObject var26 = module0773.f49307(var21, (SubLObject)$ic86$, (SubLObject)UNPROVIDED);
        if (NIL != module0038.f2653(var26)) {
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g183$.getGlobalValue());
            module0642.f39020(var26);
            module0642.f39020(module0015.$g184$.getGlobalValue());
        }
        module0775.f49900(var21, (SubLObject)UNPROVIDED);
        if (NIL == module0773.f49329(var21)) {
            module0773.f49295(var21);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49663(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f49639(var6);
        final SubLObject var9 = var7.secondMultipleValue();
        final SubLObject var10 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        var7.resetMultipleValues();
        final SubLObject var11 = f49640(var8, var9, (SubLObject)UNPROVIDED);
        final SubLObject var12 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var12) {
            f49637(var11, (SubLObject)$ic87$);
            final SubLObject var13 = module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic23$, var10));
            final SubLObject var14 = module0642.f39104((SubLObject)$ic88$, var10);
            final SubLObject var15 = module0642.f39104((SubLObject)$ic89$, var10);
            module0773.f49330(var11, var13);
            if (NIL != var14) {
                module0773.f49308(var11, (SubLObject)$ic90$, var14);
            }
            if (NIL != var15) {
                module0773.f49308(var11, (SubLObject)$ic91$, var15);
            }
            f49664(var11);
            module0773.f49308(var11, (SubLObject)$ic86$, (SubLObject)$ic92$);
            f49641(var11);
        }
        return f49630(var8, var9, module0773.f49355(var11));
    }
    
    public static SubLObject f49664(final SubLObject var21) {
        module0773.f49324(var21, (SubLObject)NIL);
        module0773.f49327(var21, (SubLObject)T);
        module0773.f49328(var21, (SubLObject)NIL);
        module0773.f49345(var21, (SubLObject)T);
        module0773.f49356(var21, (SubLObject)NIL);
        module0773.f49354(var21, (SubLObject)NIL);
        module0773.f49308(var21, (SubLObject)$ic94$, (SubLObject)$ic95$);
        return var21;
    }
    
    public static SubLObject f49665(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0773.f49441(var46);
        final SubLObject var49 = module0773.f49261(var46);
        final SubLObject var50 = module0773.f49307(var49, (SubLObject)$ic90$, (SubLObject)$ic96$);
        final SubLObject var51 = module0773.f49307(var49, (SubLObject)$ic91$, (SubLObject)$ic96$);
        if (NIL != module0038.f2653(var48) && NIL != module0038.f2653(var50)) {
            SubLObject var52 = (SubLObject)NIL;
            SubLObject var53 = (SubLObject)NIL;
            try {
                var53 = streams_high.make_private_string_output_stream();
                final SubLObject var54 = module0015.$g131$.currentBinding(var47);
                try {
                    module0015.$g131$.bind(var53, var47);
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic97$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_102 = module0015.$g533$.currentBinding(var47);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var47);
                        module0642.f39020(var48);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        final SubLObject var55 = Sequences.cconcatenate(module0006.f203(var50), new SubLObject[] { $ic98$, module0006.f203(module0589.f35898(var51, (SubLObject)UNPROVIDED)), $ic99$, module0006.f203(module0589.f35898(module0773.f49408(var46), (SubLObject)UNPROVIDED)), $ic15$ });
                        final SubLObject var56 = Sequences.cconcatenate((SubLObject)$ic100$, new SubLObject[] { module0006.f203(var55), $ic101$ });
                        module0642.f39020(module0015.$g149$.getGlobalValue());
                        if (NIL != var56) {
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var56);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic102$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_103 = module0015.$g533$.currentBinding(var47);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var47);
                            module0642.f39020(module0015.$g431$.getGlobalValue());
                            module0642.f39020(module0015.$g440$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic103$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_104 = module0015.$g533$.currentBinding(var47);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var47);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_104, var47);
                            }
                            module0642.f39020(module0015.$g432$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_103, var47);
                        }
                        module0642.f39020(module0015.$g150$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_102, var47);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                }
                finally {
                    module0015.$g131$.rebind(var54, var47);
                }
                var52 = streams_high.get_output_stream_string(var53);
            }
            finally {
                final SubLObject var57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                    streams_high.close(var53, (SubLObject)UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var57, var47);
                }
            }
            return var52;
        }
        return var48;
    }
    
    public static SubLObject f49666() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49627", "S#54144", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49628", "CB-ASSERTION-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49629", "S#54145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49633", "S#54146", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49632", "S#54147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49634", "S#54148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49631", "S#54149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49635", "S#54150", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49636", "S#54151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49637", "S#54152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49638", "CB-SIMPLE-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49639", "S#54153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49642", "S#54154", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49643", "CB-SHOW-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49645", "S#54155", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49646", "S#54156", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49647", "S#54157", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49641", "S#54158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49648", "S#54159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49649", "S#54160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49650", "S#54161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49640", "S#54162", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49651", "S#54163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49652", "S#54164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49630", "S#54165", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49654", "S#54166", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49655", "S#54167", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49656", "S#54168", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49657", "S#54169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49659", "S#54170", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49660", "S#54171", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49661", "S#54172", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49662", "S#54173", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49658", "S#54174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49653", "S#54175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49644", "S#54176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49663", "DREAMCATCHER-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49664", "S#54177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0774", "f49665", "S#54178", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49667() {
        $g6209$ = SubLFiles.deflexical("S#54179", (SubLObject)NIL);
        $g6210$ = SubLFiles.defparameter("S#54180", module0081.f5548(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)));
        $g6211$ = SubLFiles.defparameter("S#54181", module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g6212$ = SubLFiles.deflexical("S#54182", (NIL != Symbols.boundp((SubLObject)$ic58$)) ? $g6212$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g6213$ = SubLFiles.deflexical("S#54183", (SubLObject)SEVEN_INTEGER);
        $g6214$ = SubLFiles.deflexical("S#54184", (SubLObject)NIL);
        $g6215$ = SubLFiles.deflexical("S#54185", module0075.f5175((SubLObject)$ic60$, (SubLObject)$ic61$, (SubLObject)$ic62$));
        $g6216$ = SubLFiles.deflexical("S#54186", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49668() {
        module0656.f39840((SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic6$);
        module0034.f1909((SubLObject)$ic7$);
        module0656.f39840((SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)THREE_INTEGER);
        module0012.f441((SubLObject)$ic19$);
        module0015.f873((SubLObject)$ic31$);
        module0656.f39840((SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic54$);
        module0012.f441((SubLObject)$ic55$);
        module0003.f57((SubLObject)$ic58$);
        module0034.f1909((SubLObject)$ic69$);
        module0015.f873((SubLObject)$ic93$);
        module0012.f419((SubLObject)$ic95$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f49666();
    }
    
    public void initializeVariables() {
        f49667();
    }
    
    public void runTopLevelForms() {
        f49668();
    }
    
    static {
        me = (SubLFile)new module0774();
        $g6209$ = null;
        $g6210$ = null;
        $g6211$ = null;
        $g6212$ = null;
        $g6213$ = null;
        $g6214$ = null;
        $g6215$ = null;
        $g6216$ = null;
        $ic0$ = makeString("[Proof View]");
        $ic1$ = makeKeyword("MAIN");
        $ic2$ = makeString("cb-assertion-proof-view&~A");
        $ic3$ = makeKeyword("ASSERTION-PROOF-VIEW");
        $ic4$ = makeSymbol("S#54144", "CYC");
        $ic5$ = makeString("~A does not specify an assertion");
        $ic6$ = makeSymbol("CB-ASSERTION-PROOF-VIEW");
        $ic7$ = makeSymbol("S#54149", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("MINIMAL"));
        $ic9$ = makeSymbol("S#54179", "CYC");
        $ic10$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic11$ = makeSymbol("S#26816", "CYC");
        $ic12$ = makeSymbol("INFERENCE-ANSWER-P");
        $ic13$ = makeString("[Proof ");
        $ic14$ = makeString(".");
        $ic15$ = makeString("]");
        $ic16$ = makeString("cb-simple-proof-view&~A&~A&~A&~A");
        $ic17$ = makeKeyword("SIMPLE-PROOF-VIEW");
        $ic18$ = makeSymbol("S#54150", "CYC");
        $ic19$ = makeSymbol("S#54180", "CYC");
        $ic20$ = makeSymbol("S#5859", "CYC");
        $ic21$ = makeString("memoization-state");
        $ic22$ = makeString("suppress-summary");
        $ic23$ = makeString("debug");
        $ic24$ = makeString("suppress-detailed");
        $ic25$ = makeString("suppress-linear");
        $ic26$ = makeString("suppress-bookkeeping");
        $ic27$ = makeString("suppress-cyclists");
        $ic28$ = makeString("suppress-assertion-dates");
        $ic29$ = makeString("suppress-cyclist-employers");
        $ic30$ = makeString("suppress-links-in-nl");
        $ic31$ = makeSymbol("CB-SIMPLE-PROOF-VIEW");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#54187", "CYC"), (SubLObject)makeSymbol("S#54188", "CYC"), (SubLObject)makeSymbol("S#54189", "CYC"), (SubLObject)makeSymbol("S#54190", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#54191", "CYC"));
        $ic33$ = makeSymbol("INTEGERP");
        $ic34$ = makeSymbol("S#26782", "CYC");
        $ic35$ = makeSymbol("INFERENCE-P");
        $ic36$ = makeSymbol("S#53713", "CYC");
        $ic37$ = makeString("[Proof View ");
        $ic38$ = makeString("cb-show-proof-view&~A");
        $ic39$ = makeKeyword("SHOW-PROOF-VIEW");
        $ic40$ = makeSymbol("S#54154", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#54192", "CYC"));
        $ic42$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic43$ = makeKeyword("CB-CYC");
        $ic44$ = makeString("stylesheet");
        $ic45$ = makeString("text/css");
        $ic46$ = makeKeyword("SHA1");
        $ic47$ = makeString("text/javascript");
        $ic48$ = makeString("yui-skin-sam");
        $ic49$ = makeString("reloadFrameButton");
        $ic50$ = makeString("button");
        $ic51$ = makeString("reload");
        $ic52$ = makeString("Refresh Frames");
        $ic53$ = makeString("~S does not identify an existing proof view.");
        $ic54$ = makeSymbol("CB-SHOW-PROOF-VIEW");
        $ic55$ = makeSymbol("S#54181", "CYC");
        $ic56$ = makeString("CB Proof View Preparer");
        $ic57$ = makeSymbol("S#54161", "CYC");
        $ic58$ = makeSymbol("S#54182", "CYC");
        $ic59$ = makeInteger(100);
        $ic60$ = ConsesLow.list((SubLObject)makeString("data"));
        $ic61$ = makeString("cb-proof-view-time-estimates");
        $ic62$ = makeString("log");
        $ic63$ = makeKeyword("APPEND");
        $ic64$ = makeString("Unable to open ~S");
        $ic65$ = makeSymbol("FIRST");
        $ic66$ = ConsesLow.list((SubLObject)makeSymbol("S#54193", "CYC"), (SubLObject)makeSymbol("S#54194", "CYC"), (SubLObject)makeSymbol("S#54195", "CYC"));
        $ic67$ = makeSymbol("PRINC-TO-STRING");
        $ic68$ = (SubLFloat)makeDouble(0.5);
        $ic69$ = makeSymbol("S#54173", "CYC");
        $ic70$ = (SubLFloat)makeDouble(1.0);
        $ic71$ = makeKeyword("INPUT");
        $ic72$ = ConsesLow.list((SubLObject)Characters.CHAR_tab);
        $ic73$ = makeString("\"");
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#48170", "CYC"), (SubLObject)makeSymbol("S#54194", "CYC"), (SubLObject)makeSymbol("S#40635", "CYC"));
        $ic75$ = makeInteger(25);
        $ic76$ = makeSymbol("S#54186", "CYC");
        $ic77$ = makeString("Generating proof view...");
        $ic78$ = makeString("Estimated time remaining: ~A");
        $ic79$ = makeString("[Display in-progress proof view now]");
        $ic80$ = makeKeyword("SELF");
        $ic81$ = makeKeyword("TABVIEW");
        $ic82$ = makeKeyword("FONTS");
        $ic83$ = makeKeyword("CONTAINER");
        $ic84$ = makeKeyword("YAHOO-DOM-EVENT");
        $ic85$ = makeKeyword("ELEMENT");
        $ic86$ = makeKeyword("STYLE");
        $ic87$ = makeString("DreamCatcher");
        $ic88$ = makeString("furl");
        $ic89$ = makeString("context");
        $ic90$ = makeKeyword("FEEDBACK-URL");
        $ic91$ = makeKeyword("FEEDBACK-CONTEXT");
        $ic92$ = makeString(".entryText:hover .feedback { visibility: visible; cursor: pointer;}\n\t\t\t\t  .feedback                  { visibility: hidden; }");
        $ic93$ = makeSymbol("DREAMCATCHER-JUSTIFY");
        $ic94$ = makeKeyword("ENTRY-PARAPHRASE-FN");
        $ic95$ = makeSymbol("S#54178", "CYC");
        $ic96$ = makeString("");
        $ic97$ = makeString("entryText");
        $ic98$ = makeString("&application=justify&context=");
        $ic99$ = makeString("[");
        $ic100$ = makeString("window.open('");
        $ic101$ = makeString("','Feedback');");
        $ic102$ = makeString("feedback");
        $ic103$ = makeString("/cycdoc/img/speechbubble.png");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 555 ms
	
	Decompiled with Procyon 0.5.32.
*/