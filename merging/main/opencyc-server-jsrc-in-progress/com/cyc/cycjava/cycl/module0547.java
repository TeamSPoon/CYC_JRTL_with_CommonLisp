package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0547 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0547";
    public static final String myFingerPrint = "c21291beddb0343cf4f27e1779ce4dd77bffeb3478992d78eaf8c3826680952a";
    public static SubLSymbol $g3975$;
    private static SubLSymbol $g3976$;
    private static SubLSymbol $g3977$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
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
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLInteger $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLList $ic110$;
    private static final SubLInteger $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLInteger $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    
    public static SubLObject f33768(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10_11 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic0$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var10_11, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var10_11 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        if (NIL != var15) {
            final SubLObject var19 = (SubLObject)$ic7$;
            final SubLObject var20 = (SubLObject)$ic8$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var15), (SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var13, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var19, (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic13$, var6, var11, var20), ConsesLow.append(var18, (SubLObject)NIL))));
        }
        final SubLObject var21 = (SubLObject)$ic14$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var21, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var21))), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var6), ConsesLow.append(var18, (SubLObject)NIL))));
    }
    
    public static SubLObject f33769(final SubLObject var24, final SubLObject var13, final SubLObject var25) {
        final SubLObject var26 = Numbers.subtract(constants_high_oc.f10749(var24), var13);
        return module0012.note_percent_progress(var26, var25);
    }
    
    public static SubLObject f33770(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic19$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic19$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var34_35 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic19$);
            var34_35 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic19$);
            if (NIL == conses_high.member(var34_35, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var34_35 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic19$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        if (NIL != var15) {
            final SubLObject var19 = (SubLObject)$ic20$;
            final SubLObject var20 = (SubLObject)$ic21$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var15), (SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var13, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var19, (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic23$, var6, var11, var20), ConsesLow.append(var18, (SubLObject)NIL))));
        }
        final SubLObject var21 = (SubLObject)$ic24$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var21, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic25$, var21))), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic26$, var6), ConsesLow.append(var18, (SubLObject)NIL))));
    }
    
    public static SubLObject f33771(final SubLObject var40, final SubLObject var13, final SubLObject var25) {
        final SubLObject var41 = Numbers.subtract(module0167.f10803(var40), var13);
        return module0012.note_percent_progress(var41, var25);
    }
    
    public static SubLObject f33772(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var48_49 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic27$);
            var48_49 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic27$);
            if (NIL == conses_high.member(var48_49, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var48_49 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic27$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        if (NIL != var15) {
            final SubLObject var19 = (SubLObject)$ic28$;
            final SubLObject var20 = (SubLObject)$ic29$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var15), (SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var13, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var19, (SubLObject)ConsesLow.listS((SubLObject)$ic30$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic31$, var6, var11, var20), ConsesLow.append(var18, (SubLObject)NIL))));
        }
        final SubLObject var21 = (SubLObject)$ic32$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var21, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic33$, var21))), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic34$, var6), ConsesLow.append(var18, (SubLObject)NIL))));
    }
    
    public static SubLObject f33773(final SubLObject var54, final SubLObject var13, final SubLObject var25) {
        final SubLObject var55 = Numbers.subtract(assertion_handles_oc.f11025(var54), var13);
        return module0012.note_percent_progress(var55, var25);
    }
    
    public static SubLObject f33774(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var62_63 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic35$);
            var62_63 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic35$);
            if (NIL == conses_high.member(var62_63, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var62_63 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic35$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        if (NIL != var15) {
            final SubLObject var19 = (SubLObject)$ic36$;
            final SubLObject var20 = (SubLObject)$ic37$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var15), (SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var13, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var19, (SubLObject)ConsesLow.listS((SubLObject)$ic38$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic39$, var6, var11, var20), ConsesLow.append(var18, (SubLObject)NIL))));
        }
        final SubLObject var21 = (SubLObject)$ic40$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var21, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var21))), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var6), ConsesLow.append(var18, (SubLObject)NIL))));
    }
    
    public static SubLObject f33775(final SubLObject var68, final SubLObject var13, final SubLObject var25) {
        final SubLObject var69 = Numbers.subtract(deduction_handles_oc.f11649(var68), var13);
        return module0012.note_percent_progress(var69, var25);
    }
    
    public static SubLObject f33776(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic43$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic43$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var76_77 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic43$);
            var76_77 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic43$);
            if (NIL == conses_high.member(var76_77, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var76_77 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic43$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        if (NIL != var15) {
            final SubLObject var19 = (SubLObject)$ic44$;
            final SubLObject var20 = (SubLObject)$ic45$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var15), (SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var13, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var19, (SubLObject)ConsesLow.listS((SubLObject)$ic46$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic47$, var6, var11, var20), ConsesLow.append(var18, (SubLObject)NIL))));
        }
        final SubLObject var21 = (SubLObject)$ic48$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var21, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var21))), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var6), ConsesLow.append(var18, (SubLObject)NIL))));
    }
    
    public static SubLObject f33777(final SubLObject var82, final SubLObject var13, final SubLObject var25) {
        final SubLObject var83 = Numbers.subtract(module0179.f11415(var82), var13);
        return module0012.note_percent_progress(var83, var25);
    }
    
    public static SubLObject f33778(SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)TEN_INTEGER;
        }
        return f33779(var83, (SubLObject)$ic51$, (SubLObject)$ic16$, (SubLObject)$ic52$);
    }
    
    public static SubLObject f33780(SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)TEN_INTEGER;
        }
        return f33779(var83, (SubLObject)$ic53$, (SubLObject)$ic25$, (SubLObject)$ic54$);
    }
    
    public static SubLObject f33781(SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)TEN_INTEGER;
        }
        return f33779(var83, (SubLObject)$ic55$, (SubLObject)$ic33$, (SubLObject)$ic56$);
    }
    
    public static SubLObject f33782(SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)TEN_INTEGER;
        }
        return f33779(var83, (SubLObject)$ic57$, (SubLObject)$ic41$, (SubLObject)$ic58$);
    }
    
    public static SubLObject f33783(SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)TEN_INTEGER;
        }
        return f33779(var83, (SubLObject)$ic59$, (SubLObject)$ic49$, (SubLObject)$ic60$);
    }
    
    public static SubLObject f33779(final SubLObject var83, final SubLObject var84, final SubLObject var85, final SubLObject var86) {
        assert NIL != module0004.f106(var83) : var83;
        SubLObject var87 = (SubLObject)NIL;
        SubLObject var88 = (SubLObject)ZERO_INTEGER;
        final SubLObject var89 = Functions.funcall(var84);
        SubLObject var90 = Numbers.numGE(var88, var83);
        if (NIL == var90) {
            SubLObject var91 = (SubLObject)NIL;
            var91 = var89;
            while (NIL == var90) {
                final SubLObject var92 = Functions.funcall(var85, var91);
                if (NIL != Functions.funcall(var86, var92)) {
                    var87 = (SubLObject)ConsesLow.cons(var92, var87);
                    var88 = Numbers.add(var88, (SubLObject)ONE_INTEGER);
                    var90 = Numbers.numGE(var88, var83);
                }
                var91 = Numbers.add(var91, (SubLObject)MINUS_ONE_INTEGER);
            }
        }
        return Sequences.nreverse(var87);
    }
    
    public static SubLObject f33784() {
        final SubLObject var91 = module0164.f10677();
        final SubLObject var92 = module0170.f10882();
        final SubLObject var93 = assertion_manager_oc.f11115();
        final SubLObject var94 = module0181.f11473();
        final SubLObject var95 = module0186.f11709();
        return f33785(var91, var92, var93, var94, var95);
    }
    
    public static SubLObject f33786() {
        final SubLObject var91 = constant_handles_oc.f8435();
        final SubLObject var92 = module0167.f10798();
        final SubLObject var93 = assertion_handles_oc.f11021();
        final SubLObject var94 = module0179.f11411();
        final SubLObject var95 = deduction_handles_oc.f11645();
        return f33785(var91, var92, var93, var94, var95);
    }
    
    public static SubLObject f33785(final SubLObject var91, final SubLObject var92, final SubLObject var93, final SubLObject var94, final SubLObject var95) {
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic62$, var91, $ic63$, var92, $ic64$, var93, $ic65$, var94, $ic66$, var95 });
    }
    
    public static SubLObject f33787(final SubLObject var96) {
        final SubLObject var97 = cdestructuring_bind.property_list_member((SubLObject)$ic62$, var96);
        final SubLObject var98 = (SubLObject)((NIL != var97) ? conses_high.cadr(var97) : NIL);
        final SubLObject var99 = cdestructuring_bind.property_list_member((SubLObject)$ic63$, var96);
        final SubLObject var100 = (SubLObject)((NIL != var99) ? conses_high.cadr(var99) : NIL);
        final SubLObject var101 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var96);
        final SubLObject var102 = (SubLObject)((NIL != var101) ? conses_high.cadr(var101) : NIL);
        final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var96);
        final SubLObject var104 = (SubLObject)((NIL != var103) ? conses_high.cadr(var103) : NIL);
        final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)$ic65$, var96);
        final SubLObject var106 = (SubLObject)((NIL != var105) ? conses_high.cadr(var105) : NIL);
        return Values.values(var98, var100, var102, var106, var104);
    }
    
    public static SubLObject f33788(SubLObject var104, SubLObject var105) {
        if (var104 == UNPROVIDED) {
            var104 = f33784();
        }
        if (var105 == UNPROVIDED) {
            var105 = f33786();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic10$), Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33787(var105))), new SubLObject[] { Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33787(var104))) });
    }
    
    public static SubLObject f33789(final SubLObject var106, SubLObject var107, SubLObject var108) {
        if (var107 == UNPROVIDED) {
            var107 = f33784();
        }
        if (var108 == UNPROVIDED) {
            var108 = f33786();
        }
        final SubLObject var109 = (SubLObject)ConsesLow.list((SubLObject)$ic67$, var107, (SubLObject)$ic68$, var108);
        return f33790(var106, var109);
    }
    
    public static SubLObject f33790(final SubLObject var106, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var110);
        final SubLObject var113 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var110);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)$ic69$, var110);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var110), var110);
            SubLObject var114 = (SubLObject)NIL;
            try {
                final SubLObject var112_115 = stream_macros.$stream_requires_locking$.currentBinding(var110);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var110);
                    var114 = compatibility.open_binary(var106, (SubLObject)$ic70$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var112_115, var110);
                }
                if (!var114.isStream()) {
                    Errors.error((SubLObject)$ic71$, var106);
                }
                final SubLObject var116_117 = var114;
                var111 = f33791(var116_117, var109);
            }
            finally {
                final SubLObject var112_116 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var110);
                    if (var114.isStream()) {
                        streams_high.close(var114, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var112_116, var110);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var113, var110);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var112, var110);
        }
        return var111;
    }
    
    public static SubLObject f33792(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        SubLObject var108 = (SubLObject)ZERO_INTEGER;
        SubLObject var109 = (SubLObject)ZERO_INTEGER;
        SubLObject var110 = (SubLObject)NIL;
        final SubLObject var111 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var107);
        final SubLObject var112 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var107);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)$ic69$, var107);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var107), var107);
            SubLObject var113 = (SubLObject)NIL;
            try {
                final SubLObject var112_123 = stream_macros.$stream_requires_locking$.currentBinding(var107);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var107);
                    var113 = compatibility.open_binary(var106, (SubLObject)$ic72$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var112_123, var107);
                }
                if (!var113.isStream()) {
                    Errors.error((SubLObject)$ic71$, var106);
                }
                SubLObject var116_124 = var113;
                var116_124 = module0075.f5283(var116_124);
                final SubLObject var112_124 = module0021.$g789$.currentBinding(var107);
                try {
                    module0021.$g789$.bind(module0021.f1184(), var107);
                    var110 = streams_high.file_length(var116_124);
                    final SubLObject var112_125 = module0131.$g1531$.currentBinding(var107);
                    final SubLObject var113_127 = module0012.$g75$.currentBinding(var107);
                    final SubLObject var114 = module0012.$g76$.currentBinding(var107);
                    final SubLObject var115 = module0012.$g77$.currentBinding(var107);
                    final SubLObject var116 = module0012.$g78$.currentBinding(var107);
                    try {
                        module0131.$g1531$.bind((SubLObject)NIL, var107);
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var107);
                        module0012.$g76$.bind((SubLObject)NIL, var107);
                        module0012.$g77$.bind((SubLObject)T, var107);
                        module0012.$g78$.bind(Time.get_universal_time(), var107);
                        module0012.f478((SubLObject)$ic73$);
                        SubLObject var117 = f33793(var116_124);
                        SubLObject var118 = streams_high.file_position(var116_124, (SubLObject)UNPROVIDED);
                        while ($ic74$ != var117) {
                            module0012.note_percent_progress(var118, var110);
                            var108 = Numbers.add(var108, (SubLObject)ONE_INTEGER);
                            f33794(var117);
                            var109 = Numbers.add(var109, (SubLObject)ONE_INTEGER);
                            var117 = f33793(var116_124);
                            var118 = streams_high.file_position(var116_124, (SubLObject)UNPROVIDED);
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var116, var107);
                        module0012.$g77$.rebind(var115, var107);
                        module0012.$g76$.rebind(var114, var107);
                        module0012.$g75$.rebind(var113_127, var107);
                        module0131.$g1531$.rebind(var112_125, var107);
                    }
                }
                finally {
                    module0021.$g789$.rebind(var112_124, var107);
                }
            }
            finally {
                final SubLObject var112_126 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var107);
                    if (var113.isStream()) {
                        streams_high.close(var113, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var112_126, var107);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var112, var107);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var111, var107);
        }
        return Values.values(var108, Numbers.subtract(var108, var109));
    }
    
    public static SubLObject f33795(final SubLObject var106, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)ZERO_INTEGER;
        final SubLObject var136 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var134);
        final SubLObject var137 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var134);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)$ic69$, var134);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var134), var134);
            SubLObject var138 = (SubLObject)NIL;
            try {
                final SubLObject var112_135 = stream_macros.$stream_requires_locking$.currentBinding(var134);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var134);
                    var138 = compatibility.open_binary(var106, (SubLObject)$ic72$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var112_135, var134);
                }
                if (!var138.isStream()) {
                    Errors.error((SubLObject)$ic71$, var106);
                }
                SubLObject var139 = var138;
                var139 = module0075.f5283(var139);
                final SubLObject var112_136 = module0021.$g789$.currentBinding(var134);
                try {
                    module0021.$g789$.bind(module0021.f1184(), var134);
                    for (SubLObject var140 = f33793(var139); $ic74$ != var140; var140 = f33793(var139)) {
                        f33796(var140, var133);
                        var135 = Numbers.add(var135, (SubLObject)ONE_INTEGER);
                    }
                }
                finally {
                    module0021.$g789$.rebind(var112_136, var134);
                }
            }
            finally {
                final SubLObject var112_137 = Threads.$is_thread_performing_cleanupP$.currentBinding(var134);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var134);
                    if (var138.isStream()) {
                        streams_high.close(var138, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var112_137, var134);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var137, var134);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var136, var134);
        }
        return var135;
    }
    
    public static SubLObject f33797(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic75$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic75$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var145_146 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic75$);
            var145_146 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic75$);
            if (NIL == conses_high.member(var145_146, (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var145_146 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic75$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic77$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12;
        var4 = (var12 = var5);
        final SubLObject var13 = (SubLObject)$ic78$;
        final SubLObject var14 = (SubLObject)$ic79$;
        final SubLObject var15 = (SubLObject)$ic80$;
        final SubLObject var16 = (SubLObject)$ic81$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, var11), (SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic82$, var13)), (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic83$, var14, var14)), (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic84$, (SubLObject)$ic85$, (SubLObject)T, (SubLObject)$ic86$, var15))), (SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var16), ConsesLow.append(var12, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic88$, (SubLObject)$ic89$, var6));
    }
    
    public static SubLObject f33791(final SubLObject var116, final SubLObject var109) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        if (NIL != $g3975$.getDynamicValue(var117)) {
            final SubLObject var119 = f33798(var109);
            final SubLObject var120 = ConsesLow.append(var119, var119);
            final SubLObject var121 = (SubLObject)ConsesLow.list((SubLObject)$ic85$, (SubLObject)T, (SubLObject)$ic86$, var120);
            final SubLObject var122 = module0068.$g1096$.currentBinding(var117);
            final SubLObject var123 = module0068.$g1098$.currentBinding(var117);
            final SubLObject var124 = module0068.$g1097$.currentBinding(var117);
            try {
                module0068.$g1096$.bind(var121, var117);
                module0068.$g1098$.bind(module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
                module0068.$g1097$.bind(module0068.f4920(var116), var117);
                module0068.f4921(var116);
                var118 = f33799(var116, var109);
                module0068.f4924(var116);
            }
            finally {
                module0068.$g1097$.rebind(var124, var117);
                module0068.$g1098$.rebind(var123, var117);
                module0068.$g1096$.rebind(var122, var117);
            }
            f33800((SubLObject)$ic90$, var116);
        }
        else {
            var118 = f33799(var116, var109);
        }
        return var118;
    }
    
    public static SubLObject f33799(final SubLObject var116, final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        final SubLObject var158 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var156);
        final SubLObject var159 = (SubLObject)((NIL != var158) ? conses_high.cadr(var158) : NIL);
        final SubLObject var160 = cdestructuring_bind.property_list_member((SubLObject)$ic68$, var156);
        final SubLObject var161 = (SubLObject)((NIL != var160) ? conses_high.cadr(var160) : NIL);
        final SubLObject var162 = cdestructuring_bind.property_list_member((SubLObject)$ic91$, var156);
        final SubLObject var163 = (SubLObject)((NIL != var162) ? conses_high.cadr(var162) : NIL);
        final SubLObject var164 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var156);
        final SubLObject var165 = (SubLObject)((NIL != var164) ? conses_high.cadr(var164) : NIL);
        final SubLObject var166 = cdestructuring_bind.property_list_member((SubLObject)$ic93$, var156);
        final SubLObject var167 = (SubLObject)((NIL != var166) ? conses_high.cadr(var166) : NIL);
        final SubLObject var168 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var156);
        final SubLObject var169 = (SubLObject)((NIL != var168) ? conses_high.cadr(var168) : NIL);
        final SubLObject var170 = cdestructuring_bind.property_list_member((SubLObject)$ic95$, var156);
        final SubLObject var171 = (SubLObject)((NIL != var170) ? conses_high.cadr(var170) : NIL);
        final SubLObject var172 = (SubLObject)makeBoolean(NIL != var159 && NIL != var161);
        SubLObject var173 = (SubLObject)NIL;
        SubLObject var174 = (SubLObject)NIL;
        SubLObject var175 = (SubLObject)NIL;
        SubLObject var176 = (SubLObject)NIL;
        SubLObject var177 = (SubLObject)NIL;
        SubLObject var178 = (SubLObject)NIL;
        SubLObject var179 = (SubLObject)NIL;
        SubLObject var180 = (SubLObject)NIL;
        SubLObject var181 = (SubLObject)NIL;
        SubLObject var182 = (SubLObject)NIL;
        SubLObject var183 = (SubLObject)ZERO_INTEGER;
        SubLObject var184 = (SubLObject)ZERO_INTEGER;
        SubLObject var185 = (SubLObject)ZERO_INTEGER;
        SubLObject var186 = (SubLObject)ZERO_INTEGER;
        SubLObject var187 = (SubLObject)ZERO_INTEGER;
        SubLObject var188 = (SubLObject)NIL;
        if (NIL != var172) {
            var157.resetMultipleValues();
            final SubLObject var187_188 = f33787(var159);
            final SubLObject var189_190 = var157.secondMultipleValue();
            final SubLObject var191_192 = var157.thirdMultipleValue();
            final SubLObject var193_194 = var157.fourthMultipleValue();
            final SubLObject var195_196 = var157.fifthMultipleValue();
            var157.resetMultipleValues();
            var173 = var187_188;
            var174 = var189_190;
            var175 = var191_192;
            var176 = var193_194;
            var177 = var195_196;
            var157.resetMultipleValues();
            final SubLObject var197_198 = f33787(var161);
            final SubLObject var199_200 = var157.secondMultipleValue();
            final SubLObject var201_202 = var157.thirdMultipleValue();
            final SubLObject var203_204 = var157.fourthMultipleValue();
            final SubLObject var205_206 = var157.fifthMultipleValue();
            var157.resetMultipleValues();
            var178 = var197_198;
            var179 = var199_200;
            var180 = var201_202;
            var181 = var203_204;
            var182 = var205_206;
        }
        if (NIL != var172) {
            final SubLObject var189 = (SubLObject)$ic96$;
            final SubLObject var190 = Numbers.subtract(var178, var173);
            final SubLObject var191 = module0012.$g75$.currentBinding(var157);
            final SubLObject var192 = module0012.$g76$.currentBinding(var157);
            final SubLObject var193 = module0012.$g77$.currentBinding(var157);
            final SubLObject var194 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var189);
                SubLObject var195;
                SubLObject var196;
                SubLObject var197;
                for (var195 = var178, var196 = (SubLObject)NIL, var196 = var173; !var196.numGE(var195); var196 = module0048.f_1X(var196)) {
                    var197 = constants_high_oc.f10752(var196);
                    if (NIL != constant_handles_oc.f8449(var197)) {
                        f33769(var197, var173, var190);
                        f33801(var197, var116);
                        var183 = Numbers.add(var183, (SubLObject)ONE_INTEGER);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var194, var157);
                module0012.$g77$.rebind(var193, var157);
                module0012.$g76$.rebind(var192, var157);
                module0012.$g75$.rebind(var191, var157);
            }
        }
        if (NIL != var163) {
            final SubLObject var198 = (SubLObject)$ic96$;
            final SubLObject var199 = var163;
            SubLObject var200 = (SubLObject)ZERO_INTEGER;
            final SubLObject var201 = Sequences.length(var199);
            final SubLObject var202 = module0012.$g75$.currentBinding(var157);
            final SubLObject var203 = module0012.$g76$.currentBinding(var157);
            final SubLObject var204 = module0012.$g77$.currentBinding(var157);
            final SubLObject var205 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var198);
                SubLObject var206 = var199;
                SubLObject var207 = (SubLObject)NIL;
                var207 = var206.first();
                while (NIL != var206) {
                    module0012.note_percent_progress(var200, var201);
                    var200 = Numbers.add(var200, (SubLObject)ONE_INTEGER);
                    f33801(var207, var116);
                    var183 = Numbers.add(var183, (SubLObject)ONE_INTEGER);
                    var206 = var206.rest();
                    var207 = var206.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var205, var157);
                module0012.$g77$.rebind(var204, var157);
                module0012.$g76$.rebind(var203, var157);
                module0012.$g75$.rebind(var202, var157);
            }
        }
        if (NIL != var172) {
            final SubLObject var208 = (SubLObject)$ic97$;
            final SubLObject var209 = Numbers.subtract(var179, var174);
            final SubLObject var191 = module0012.$g75$.currentBinding(var157);
            final SubLObject var192 = module0012.$g76$.currentBinding(var157);
            final SubLObject var193 = module0012.$g77$.currentBinding(var157);
            final SubLObject var194 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var208);
                SubLObject var195;
                SubLObject var210;
                SubLObject var211;
                for (var195 = var179, var210 = (SubLObject)NIL, var210 = var174; !var210.numGE(var195); var210 = module0048.f_1X(var210)) {
                    var211 = module0167.f10832(var210);
                    if (NIL != module0167.f10813(var211)) {
                        f33771(var211, var174, var209);
                        f33802(var211, var116);
                        var184 = Numbers.add(var184, (SubLObject)ONE_INTEGER);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var194, var157);
                module0012.$g77$.rebind(var193, var157);
                module0012.$g76$.rebind(var192, var157);
                module0012.$g75$.rebind(var191, var157);
            }
        }
        if (NIL != var165) {
            final SubLObject var198 = (SubLObject)$ic97$;
            final SubLObject var199 = var165;
            SubLObject var200 = (SubLObject)ZERO_INTEGER;
            final SubLObject var201 = Sequences.length(var199);
            final SubLObject var202 = module0012.$g75$.currentBinding(var157);
            final SubLObject var203 = module0012.$g76$.currentBinding(var157);
            final SubLObject var204 = module0012.$g77$.currentBinding(var157);
            final SubLObject var205 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var198);
                SubLObject var206 = var199;
                SubLObject var212 = (SubLObject)NIL;
                var212 = var206.first();
                while (NIL != var206) {
                    module0012.note_percent_progress(var200, var201);
                    var200 = Numbers.add(var200, (SubLObject)ONE_INTEGER);
                    f33802(var212, var116);
                    var184 = Numbers.add(var184, (SubLObject)ONE_INTEGER);
                    var206 = var206.rest();
                    var212 = var206.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var205, var157);
                module0012.$g77$.rebind(var204, var157);
                module0012.$g76$.rebind(var203, var157);
                module0012.$g75$.rebind(var202, var157);
            }
        }
        if (NIL != var172) {
            final SubLObject var213 = (SubLObject)$ic98$;
            final SubLObject var214 = Numbers.subtract(var180, var175);
            final SubLObject var191 = module0012.$g75$.currentBinding(var157);
            final SubLObject var192 = module0012.$g76$.currentBinding(var157);
            final SubLObject var193 = module0012.$g77$.currentBinding(var157);
            final SubLObject var194 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var213);
                SubLObject var195;
                SubLObject var215;
                SubLObject var216;
                for (var195 = var180, var215 = (SubLObject)NIL, var215 = var175; !var215.numGE(var195); var215 = module0048.f_1X(var215)) {
                    var216 = assertion_handles_oc.f11053(var215);
                    if (NIL != assertion_handles_oc.f11035(var216)) {
                        f33773(var216, var175, var214);
                        f33803(var216, var116);
                        var185 = Numbers.add(var185, (SubLObject)ONE_INTEGER);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var194, var157);
                module0012.$g77$.rebind(var193, var157);
                module0012.$g76$.rebind(var192, var157);
                module0012.$g75$.rebind(var191, var157);
            }
        }
        if (NIL != var167) {
            final SubLObject var198 = (SubLObject)$ic98$;
            final SubLObject var199 = var167;
            SubLObject var200 = (SubLObject)ZERO_INTEGER;
            final SubLObject var201 = Sequences.length(var199);
            final SubLObject var202 = module0012.$g75$.currentBinding(var157);
            final SubLObject var203 = module0012.$g76$.currentBinding(var157);
            final SubLObject var204 = module0012.$g77$.currentBinding(var157);
            final SubLObject var205 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var198);
                SubLObject var206 = var199;
                SubLObject var217 = (SubLObject)NIL;
                var217 = var206.first();
                while (NIL != var206) {
                    module0012.note_percent_progress(var200, var201);
                    var200 = Numbers.add(var200, (SubLObject)ONE_INTEGER);
                    f33803(var217, var116);
                    var185 = Numbers.add(var185, (SubLObject)ONE_INTEGER);
                    var206 = var206.rest();
                    var217 = var206.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var205, var157);
                module0012.$g77$.rebind(var204, var157);
                module0012.$g76$.rebind(var203, var157);
                module0012.$g75$.rebind(var202, var157);
            }
        }
        if (NIL != var172) {
            final SubLObject var218 = (SubLObject)$ic99$;
            final SubLObject var219 = Numbers.subtract(var181, var176);
            final SubLObject var191 = module0012.$g75$.currentBinding(var157);
            final SubLObject var192 = module0012.$g76$.currentBinding(var157);
            final SubLObject var193 = module0012.$g77$.currentBinding(var157);
            final SubLObject var194 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var218);
                SubLObject var195;
                SubLObject var220;
                SubLObject var221;
                for (var195 = var181, var220 = (SubLObject)NIL, var220 = var176; !var220.numGE(var195); var220 = module0048.f_1X(var220)) {
                    var221 = module0179.f11443(var220);
                    if (NIL != module0179.f11424(var221)) {
                        f33777(var221, var176, var219);
                        f33804(var221, var116);
                        var186 = Numbers.add(var186, (SubLObject)ONE_INTEGER);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var194, var157);
                module0012.$g77$.rebind(var193, var157);
                module0012.$g76$.rebind(var192, var157);
                module0012.$g75$.rebind(var191, var157);
            }
        }
        if (NIL != var169) {
            final SubLObject var198 = (SubLObject)$ic99$;
            final SubLObject var199 = var169;
            SubLObject var200 = (SubLObject)ZERO_INTEGER;
            final SubLObject var201 = Sequences.length(var199);
            final SubLObject var202 = module0012.$g75$.currentBinding(var157);
            final SubLObject var203 = module0012.$g76$.currentBinding(var157);
            final SubLObject var204 = module0012.$g77$.currentBinding(var157);
            final SubLObject var205 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var198);
                SubLObject var206 = var199;
                SubLObject var222 = (SubLObject)NIL;
                var222 = var206.first();
                while (NIL != var206) {
                    module0012.note_percent_progress(var200, var201);
                    var200 = Numbers.add(var200, (SubLObject)ONE_INTEGER);
                    f33804(var222, var116);
                    var186 = Numbers.add(var186, (SubLObject)ONE_INTEGER);
                    var206 = var206.rest();
                    var222 = var206.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var205, var157);
                module0012.$g77$.rebind(var204, var157);
                module0012.$g76$.rebind(var203, var157);
                module0012.$g75$.rebind(var202, var157);
            }
        }
        if (NIL != var172) {
            final SubLObject var223 = (SubLObject)$ic100$;
            final SubLObject var224 = Numbers.subtract(var182, var177);
            final SubLObject var191 = module0012.$g75$.currentBinding(var157);
            final SubLObject var192 = module0012.$g76$.currentBinding(var157);
            final SubLObject var193 = module0012.$g77$.currentBinding(var157);
            final SubLObject var194 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var223);
                SubLObject var195;
                SubLObject var225;
                SubLObject var226;
                for (var195 = var182, var225 = (SubLObject)NIL, var225 = var177; !var225.numGE(var195); var225 = module0048.f_1X(var225)) {
                    var226 = deduction_handles_oc.f11675(var225);
                    if (NIL != deduction_handles_oc.f11659(var226)) {
                        f33775(var226, var177, var224);
                        f33805(var226, var116);
                        var187 = Numbers.add(var187, (SubLObject)ONE_INTEGER);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var194, var157);
                module0012.$g77$.rebind(var193, var157);
                module0012.$g76$.rebind(var192, var157);
                module0012.$g75$.rebind(var191, var157);
            }
        }
        if (NIL != var171) {
            final SubLObject var198 = (SubLObject)$ic100$;
            final SubLObject var199 = var171;
            SubLObject var200 = (SubLObject)ZERO_INTEGER;
            final SubLObject var201 = Sequences.length(var199);
            final SubLObject var202 = module0012.$g75$.currentBinding(var157);
            final SubLObject var203 = module0012.$g76$.currentBinding(var157);
            final SubLObject var204 = module0012.$g77$.currentBinding(var157);
            final SubLObject var205 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)NIL, var157);
                module0012.$g77$.bind((SubLObject)T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var198);
                SubLObject var206 = var199;
                SubLObject var227 = (SubLObject)NIL;
                var227 = var206.first();
                while (NIL != var206) {
                    module0012.note_percent_progress(var200, var201);
                    var200 = Numbers.add(var200, (SubLObject)ONE_INTEGER);
                    f33805(var227, var116);
                    var187 = Numbers.add(var187, (SubLObject)ONE_INTEGER);
                    var206 = var206.rest();
                    var227 = var206.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var205, var157);
                module0012.$g77$.rebind(var204, var157);
                module0012.$g76$.rebind(var203, var157);
                module0012.$g75$.rebind(var202, var157);
            }
        }
        var188 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic101$, var183, $ic102$, var184, $ic103$, var185, $ic104$, var186, $ic105$, var187 });
        return var188;
    }
    
    public static SubLObject f33800(final SubLObject var131, final SubLObject var116) {
        return module0021.f1040(var131, var116);
    }
    
    public static SubLObject f33793(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        final SubLObject var119 = module0018.$g574$.currentBinding(var117);
        try {
            module0018.$g574$.bind((SubLObject)T, var117);
            var118 = module0021.f1060(var116, (SubLObject)NIL, (SubLObject)$ic74$);
        }
        finally {
            module0018.$g574$.rebind(var119, var117);
        }
        return var118;
    }
    
    public static SubLObject f33794(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var131, var131, (SubLObject)$ic106$);
        var132 = var131.first();
        final SubLObject var134 = var133 = var131.rest();
        if (var132 == $ic107$) {
            var132 = (SubLObject)$ic108$;
        }
        return Functions.apply(var132, var133);
    }
    
    public static SubLObject f33796(final SubLObject var131, final SubLObject var116) {
        print_high.print(var131, var116);
        return var131;
    }
    
    public static SubLObject f33798(final SubLObject var109) {
        final SubLObject var110 = f33806(var109, (SubLObject)TWO_INTEGER);
        final SubLObject var111 = module0035.f2062(var110);
        final SubLObject var112 = ConsesLow.append($g3976$.getGlobalValue(), var111, $g3977$.getGlobalValue());
        return var112;
    }
    
    public static SubLObject f33807(SubLObject var107, SubLObject var108) {
        if (var107 == UNPROVIDED) {
            var107 = f33784();
        }
        if (var108 == UNPROVIDED) {
            var108 = f33786();
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        var109.resetMultipleValues();
        final SubLObject var110 = f33787(var107);
        final SubLObject var111 = var109.secondMultipleValue();
        final SubLObject var112 = var109.thirdMultipleValue();
        final SubLObject var113 = var109.fourthMultipleValue();
        final SubLObject var114 = var109.fifthMultipleValue();
        var109.resetMultipleValues();
        var109.resetMultipleValues();
        final SubLObject var115 = f33787(var108);
        final SubLObject var116 = var109.secondMultipleValue();
        final SubLObject var117 = var109.thirdMultipleValue();
        final SubLObject var118 = var109.fourthMultipleValue();
        final SubLObject var119 = var109.fifthMultipleValue();
        var109.resetMultipleValues();
        SubLObject var120 = (SubLObject)NIL;
        SubLObject var121 = (SubLObject)NIL;
        SubLObject var122 = (SubLObject)NIL;
        SubLObject var123 = (SubLObject)NIL;
        SubLObject var124 = (SubLObject)NIL;
        SubLObject var125;
        SubLObject var126;
        SubLObject var127;
        for (var125 = var115, var126 = (SubLObject)NIL, var126 = var110; !var126.numGE(var125); var126 = module0048.f_1X(var126)) {
            var127 = constants_high_oc.f10752(var126);
            if (NIL != constant_handles_oc.f8449(var127)) {
                var120 = (SubLObject)ConsesLow.cons(var127, var120);
            }
        }
        SubLObject var128;
        SubLObject var129;
        for (var125 = var116, var128 = (SubLObject)NIL, var128 = var111; !var128.numGE(var125); var128 = module0048.f_1X(var128)) {
            var129 = module0167.f10832(var128);
            if (NIL != module0167.f10813(var129)) {
                var121 = (SubLObject)ConsesLow.cons(var129, var121);
            }
        }
        SubLObject var130;
        SubLObject var131;
        for (var125 = var117, var130 = (SubLObject)NIL, var130 = var112; !var130.numGE(var125); var130 = module0048.f_1X(var130)) {
            var131 = assertion_handles_oc.f11053(var130);
            if (NIL != assertion_handles_oc.f11035(var131)) {
                var122 = (SubLObject)ConsesLow.cons(var131, var122);
            }
        }
        SubLObject var132;
        SubLObject var133;
        for (var125 = var118, var132 = (SubLObject)NIL, var132 = var113; !var132.numGE(var125); var132 = module0048.f_1X(var132)) {
            var133 = module0179.f11443(var132);
            if (NIL != module0179.f11424(var133)) {
                var123 = (SubLObject)ConsesLow.cons(var133, var123);
            }
        }
        SubLObject var134;
        SubLObject var135;
        for (var125 = var119, var134 = (SubLObject)NIL, var134 = var114; !var134.numGE(var125); var134 = module0048.f_1X(var134)) {
            var135 = deduction_handles_oc.f11675(var134);
            if (NIL != deduction_handles_oc.f11659(var135)) {
                var124 = (SubLObject)ConsesLow.cons(var135, var124);
            }
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic91$, var120, $ic92$, var121, $ic93$, var122, $ic94$, var123, $ic95$, var124 });
    }
    
    public static SubLObject f33806(final SubLObject var156, SubLObject var234) {
        if (var234 == UNPROVIDED) {
            var234 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var235 = SubLProcess.currentSubLThread();
        final SubLObject var236 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var156);
        final SubLObject var237 = (SubLObject)((NIL != var236) ? conses_high.cadr(var236) : NIL);
        final SubLObject var238 = cdestructuring_bind.property_list_member((SubLObject)$ic68$, var156);
        final SubLObject var239 = (SubLObject)((NIL != var238) ? conses_high.cadr(var238) : NIL);
        final SubLObject var240 = cdestructuring_bind.property_list_member((SubLObject)$ic91$, var156);
        final SubLObject var241 = (SubLObject)((NIL != var240) ? conses_high.cadr(var240) : NIL);
        final SubLObject var242 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var156);
        final SubLObject var243 = (SubLObject)((NIL != var242) ? conses_high.cadr(var242) : NIL);
        final SubLObject var244 = cdestructuring_bind.property_list_member((SubLObject)$ic93$, var156);
        final SubLObject var245 = (SubLObject)((NIL != var244) ? conses_high.cadr(var244) : NIL);
        final SubLObject var246 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var156);
        final SubLObject var247 = (SubLObject)((NIL != var246) ? conses_high.cadr(var246) : NIL);
        final SubLObject var248 = cdestructuring_bind.property_list_member((SubLObject)$ic95$, var156);
        final SubLObject var249 = (SubLObject)((NIL != var248) ? conses_high.cadr(var248) : NIL);
        final SubLObject var250 = (SubLObject)makeBoolean(NIL != var237 && NIL != var239);
        SubLObject var251 = (SubLObject)NIL;
        SubLObject var252 = (SubLObject)NIL;
        SubLObject var253 = (SubLObject)NIL;
        SubLObject var254 = (SubLObject)NIL;
        SubLObject var255 = (SubLObject)NIL;
        SubLObject var256 = (SubLObject)NIL;
        SubLObject var257 = (SubLObject)NIL;
        SubLObject var258 = (SubLObject)NIL;
        SubLObject var259 = (SubLObject)NIL;
        SubLObject var260 = (SubLObject)NIL;
        SubLObject var261 = (SubLObject)NIL;
        if (NIL != var250) {
            var235.resetMultipleValues();
            final SubLObject var244_245 = f33787(var237);
            final SubLObject var246_247 = var235.secondMultipleValue();
            final SubLObject var248_249 = var235.thirdMultipleValue();
            final SubLObject var250_251 = var235.fourthMultipleValue();
            final SubLObject var252_253 = var235.fifthMultipleValue();
            var235.resetMultipleValues();
            var251 = var244_245;
            var252 = var246_247;
            var253 = var248_249;
            var254 = var250_251;
            var255 = var252_253;
            var235.resetMultipleValues();
            final SubLObject var254_255 = f33787(var239);
            final SubLObject var256_257 = var235.secondMultipleValue();
            final SubLObject var258_259 = var235.thirdMultipleValue();
            final SubLObject var260_261 = var235.fourthMultipleValue();
            final SubLObject var262_263 = var235.fifthMultipleValue();
            var235.resetMultipleValues();
            var256 = var254_255;
            var257 = var256_257;
            var258 = var258_259;
            var259 = var260_261;
            var260 = var262_263;
        }
        final SubLObject var262 = module0018.$g587$.currentBinding(var235);
        try {
            module0018.$g587$.bind(Hashtables.make_hash_table((SubLObject)$ic111$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var235);
            if (NIL != var250) {
                SubLObject var263;
                SubLObject var264;
                SubLObject var265;
                for (var263 = var256, var264 = (SubLObject)NIL, var264 = var251; !var264.numGE(var263); var264 = module0048.f_1X(var264)) {
                    var265 = constants_high_oc.f10752(var264);
                    if (NIL != constant_handles_oc.f8449(var265)) {
                        f33808(var265);
                    }
                }
            }
            SubLObject var266 = var241;
            SubLObject var267 = (SubLObject)NIL;
            var267 = var266.first();
            while (NIL != var266) {
                f33808(var267);
                var266 = var266.rest();
                var267 = var266.first();
            }
            if (NIL != var250) {
                SubLObject var263;
                SubLObject var268;
                SubLObject var269;
                for (var263 = var257, var268 = (SubLObject)NIL, var268 = var252; !var268.numGE(var263); var268 = module0048.f_1X(var268)) {
                    var269 = module0167.f10832(var268);
                    if (NIL != module0167.f10813(var269)) {
                        module0205.f13231((SubLObject)$ic112$, var269, (SubLObject)T, (SubLObject)UNPROVIDED);
                    }
                }
            }
            var266 = var243;
            SubLObject var270 = (SubLObject)NIL;
            var270 = var266.first();
            while (NIL != var266) {
                module0205.f13231((SubLObject)$ic112$, var270, (SubLObject)T, (SubLObject)UNPROVIDED);
                var266 = var266.rest();
                var270 = var266.first();
            }
            if (NIL != var250) {
                SubLObject var263;
                SubLObject var271;
                SubLObject var272;
                for (var263 = var258, var271 = (SubLObject)NIL, var271 = var253; !var271.numGE(var263); var271 = module0048.f_1X(var271)) {
                    var272 = assertion_handles_oc.f11053(var271);
                    if (NIL != assertion_handles_oc.f11035(var272)) {
                        module0205.f13230((SubLObject)$ic112$, var272, (SubLObject)T, (SubLObject)UNPROVIDED);
                    }
                }
            }
            var266 = var245;
            SubLObject var273 = (SubLObject)NIL;
            var273 = var266.first();
            while (NIL != var266) {
                module0205.f13230((SubLObject)$ic112$, var273, (SubLObject)T, (SubLObject)UNPROVIDED);
                var266 = var266.rest();
                var273 = var266.first();
            }
            if (NIL != var250) {
                SubLObject var263;
                SubLObject var274;
                SubLObject var275;
                for (var263 = var259, var274 = (SubLObject)NIL, var274 = var254; !var274.numGE(var263); var274 = module0048.f_1X(var274)) {
                    var275 = module0179.f11443(var274);
                    if (NIL != module0179.f11424(var275)) {
                        f33809((SubLObject)$ic112$, var275, (SubLObject)T, (SubLObject)UNPROVIDED);
                    }
                }
            }
            var266 = var247;
            SubLObject var276 = (SubLObject)NIL;
            var276 = var266.first();
            while (NIL != var266) {
                f33809((SubLObject)$ic112$, var276, (SubLObject)T, (SubLObject)UNPROVIDED);
                var266 = var266.rest();
                var276 = var266.first();
            }
            if (NIL != var250) {
                SubLObject var263;
                SubLObject var277;
                SubLObject var278;
                for (var263 = var260, var277 = (SubLObject)NIL, var277 = var255; !var277.numGE(var263); var277 = module0048.f_1X(var277)) {
                    var278 = deduction_handles_oc.f11675(var277);
                    if (NIL != deduction_handles_oc.f11659(var278)) {
                        f33810((SubLObject)$ic112$, var278, (SubLObject)T, (SubLObject)UNPROVIDED);
                    }
                }
            }
            var266 = var249;
            SubLObject var279 = (SubLObject)NIL;
            var279 = var266.first();
            while (NIL != var266) {
                f33810((SubLObject)$ic112$, var279, (SubLObject)T, (SubLObject)UNPROVIDED);
                var266 = var266.rest();
                var279 = var266.first();
            }
            var261 = module0030.f1630(module0018.$g587$.getDynamicValue(var235));
        }
        finally {
            module0018.$g587$.rebind(var262, var235);
        }
        if (var234.numG((SubLObject)ONE_INTEGER)) {
            var261 = Sequences.delete(var234, var261, Symbols.symbol_function((SubLObject)$ic113$), Symbols.symbol_function((SubLObject)$ic114$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var261 = Sort.sort(var261, Symbols.symbol_function((SubLObject)$ic113$), Symbols.symbol_function((SubLObject)$ic114$));
        return var261;
    }
    
    public static SubLObject f33808(final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        if (NIL != constant_handles_oc.f8449(var90) || (var90.isString() && NIL != module0035.f2000(var90, (SubLObject)$ic115$, (SubLObject)UNPROVIDED))) {
            Hashtables.sethash(var90, module0018.$g587$.getDynamicValue(var91), Numbers.add(Hashtables.gethash_without_values(var90, module0018.$g587$.getDynamicValue(var91), (SubLObject)ZERO_INTEGER), (SubLObject)ONE_INTEGER));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33810(final SubLObject var264, final SubLObject var68, SubLObject var265, SubLObject var266) {
        if (var265 == UNPROVIDED) {
            var265 = (SubLObject)NIL;
        }
        if (var266 == UNPROVIDED) {
            var266 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != deduction_handles_oc.f11659(var68) : var68;
        final SubLObject var267 = module0188.f11781(var68);
        final SubLObject var268 = module0188.f11770(var68);
        f33811(var264, var267, var265, var266);
        SubLObject var269 = var268;
        SubLObject var270 = (SubLObject)NIL;
        var270 = var269.first();
        while (NIL != var269) {
            f33811(var264, var270, var265, var266);
            var269 = var269.rest();
            var270 = var269.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33809(final SubLObject var264, final SubLObject var82, SubLObject var265, SubLObject var266) {
        if (var265 == UNPROVIDED) {
            var265 = (SubLObject)NIL;
        }
        if (var266 == UNPROVIDED) {
            var266 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0179.f11424(var82) : var82;
        final SubLObject var267 = module0183.f11557(var82);
        final SubLObject var268 = module0183.f11558(var82);
        f33811(var264, var267, var265, var266);
        SubLObject var269 = var268;
        SubLObject var270 = (SubLObject)NIL;
        var270 = var269.first();
        while (NIL != var269) {
            f33811(var264, var270, var265, var266);
            var269 = var269.rest();
            var270 = var269.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33811(final SubLObject var264, final SubLObject var90, SubLObject var265, SubLObject var266) {
        if (var265 == UNPROVIDED) {
            var265 = (SubLObject)NIL;
        }
        if (var266 == UNPROVIDED) {
            var266 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (NIL != assertion_handles_oc.f11035(var90)) {
            module0205.f13230(var264, var90, var265, var266);
        }
        else if (NIL != module0179.f11424(var90)) {
            f33809(var264, var90, var265, var266);
        }
        else if (NIL != module0191.f11952(var90)) {
            module0205.f13228(var264, module0191.f11967(var90), var265, var266);
            module0205.f13228(var264, module0191.f11976(var90), var265, var266);
        }
        else {
            Errors.error((SubLObject)$ic116$, var90);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33801(final SubLObject var24, final SubLObject var116) {
        final SubLObject var117 = constants_high_oc.f10743(var24);
        final SubLObject var118 = constants_high_oc.f10757(var24);
        final SubLObject var119 = (SubLObject)ConsesLow.list((SubLObject)$ic117$, var117, var118);
        f33800(var119, var116);
        return var24;
    }
    
    public static SubLObject f33802(final SubLObject var40, final SubLObject var116) {
        final SubLObject var117 = module0172.f10915(var40);
        final SubLObject var118 = (SubLObject)ConsesLow.list((SubLObject)$ic108$, var117);
        f33800(var118, var116);
        return var40;
    }
    
    public static SubLObject f33812(final SubLObject var274) {
        final SubLThread var275 = SubLProcess.currentSubLThread();
        SubLObject var276 = (SubLObject)NIL;
        final SubLObject var277 = module0018.$g574$.currentBinding(var275);
        try {
            module0018.$g574$.bind((SubLObject)T, var275);
            var276 = module0285.f18996(var274);
        }
        finally {
            module0018.$g574$.rebind(var277, var275);
        }
        return var276;
    }
    
    public static SubLObject f33803(final SubLObject var54, final SubLObject var116) {
        final SubLObject var117 = module0178.f11282(var54);
        final SubLObject var118 = module0178.f11287(var54);
        final SubLObject var119 = module0178.f11294(var54);
        final SubLObject var120 = module0178.f11291(var54);
        final SubLObject var121 = module0178.f11292(var54);
        final SubLObject var122 = module0178.f11293(var54);
        final SubLObject var123 = module0178.f11378(var54);
        final SubLObject var124 = (SubLObject)ConsesLow.list((SubLObject)$ic118$, var117, var118, var119, var120, var121, var122, var123);
        f33800(var124, var116);
        if (NIL != module0178.f11375(var54)) {
            final SubLObject var125 = module0539.f33495(var54);
            final SubLObject var126 = (NIL != module0178.f11284(var54)) ? module0178.f11304(var54) : module0289.f19396(var54);
            final SubLObject var273_284 = (SubLObject)ConsesLow.list((SubLObject)$ic119$, var126, var118, var122, var120, var125);
            f33800(var273_284, var116);
        }
        return var54;
    }
    
    public static SubLObject f33813(final SubLObject var283, final SubLObject var276, final SubLObject var280, final SubLObject var278, final SubLObject var282) {
        final SubLThread var284 = SubLProcess.currentSubLThread();
        final SubLObject var285 = (SubLObject)ConsesLow.list((SubLObject)$ic120$, var280, (SubLObject)$ic121$, var278, (SubLObject)$ic122$, (SubLObject)NIL, (SubLObject)$ic123$, (SubLObject)NIL);
        SubLObject var286 = (SubLObject)NIL;
        final SubLObject var287 = module0539.$g3936$.currentBinding(var284);
        try {
            module0539.$g3936$.bind(var282, var284);
            var286 = module0540.f33516(var283, var276, var285);
        }
        finally {
            module0539.$g3936$.rebind(var287, var284);
        }
        return var286;
    }
    
    public static SubLObject f33804(final SubLObject var82, final SubLObject var116) {
        final SubLObject var117 = module0183.f11557(var82);
        SubLObject var119;
        final SubLObject var118 = var119 = module0183.f11558(var82);
        SubLObject var120 = (SubLObject)NIL;
        var120 = var119.first();
        while (NIL != var119) {
            if (NIL != module0179.f11424(var120) && module0179.f11415(var120).numG(module0179.f11415(var82))) {
                f33804(var120, var116);
            }
            var119 = var119.rest();
            var120 = var119.first();
        }
        final SubLObject var121 = (SubLObject)ConsesLow.list((SubLObject)$ic124$, var117, var118);
        f33800(var121, var116);
        return var82;
    }
    
    public static SubLObject f33805(final SubLObject var68, final SubLObject var116) {
        final SubLObject var117 = module0188.f11781(var68);
        if (NIL != assertion_handles_oc.f11035(var117)) {
            final SubLObject var118 = module0188.f11770(var68);
            final SubLObject var119 = module0188.f11789(var68);
            final SubLObject var120 = (SubLObject)ConsesLow.list((SubLObject)$ic125$, var117, var118, var119);
            f33800(var120, var116);
        }
        return var68;
    }
    
    public static SubLObject f33814() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0547", "f33768", "S#37165");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33769", "S#37166", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0547", "f33770", "S#37167");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33771", "S#37168", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0547", "f33772", "S#37169");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33773", "S#37170", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0547", "f33774", "S#37171");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33775", "S#37172", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0547", "f33776", "S#37173");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33777", "S#37174", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33778", "S#37175", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33780", "S#37176", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33781", "S#37177", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33782", "S#37178", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33783", "S#37179", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33779", "S#37180", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33784", "S#37181", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33786", "S#37182", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33785", "S#37183", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33787", "S#37184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33788", "S#37185", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33789", "S#37186", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33790", "S#37187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33792", "S#37188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33795", "S#37189", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0547", "f33797", "S#37190");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33791", "S#37191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33799", "S#37192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33800", "S#37193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33793", "S#37194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33794", "S#37195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33796", "S#37196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33798", "S#37197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33807", "S#37198", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33806", "S#37199", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33808", "S#37200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33810", "S#37201", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33809", "S#37202", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33811", "S#37203", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33801", "S#37204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33802", "S#37205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33812", "S#37206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33803", "S#37207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33813", "S#37208", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33804", "S#37209", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0547", "f33805", "S#37210", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33815() {
        $g3975$ = SubLFiles.defparameter("S#37211", (SubLObject)T);
        $g3976$ = SubLFiles.deflexical("S#37212", (SubLObject)$ic109$);
        $g3977$ = SubLFiles.deflexical("S#37213", (SubLObject)$ic110$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33816() {
        module0002.f50((SubLObject)$ic13$, (SubLObject)$ic12$);
        module0002.f50((SubLObject)$ic23$, (SubLObject)$ic22$);
        module0002.f50((SubLObject)$ic31$, (SubLObject)$ic30$);
        module0002.f50((SubLObject)$ic39$, (SubLObject)$ic38$);
        module0002.f50((SubLObject)$ic47$, (SubLObject)$ic46$);
        module0012.f419((SubLObject)$ic112$);
        module0012.f419((SubLObject)$ic108$);
        module0012.f419((SubLObject)$ic119$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33814();
    }
    
    public void initializeVariables() {
        f33815();
    }
    
    public void runTopLevelForms() {
        f33816();
    }
    
    static {
        me = (SubLFile)new module0547();
        $g3975$ = null;
        $g3976$ = null;
        $g3977$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37214", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("START"), (SubLObject)makeKeyword("END"), (SubLObject)makeKeyword("PROGRESS-MESSAGE"), (SubLObject)makeKeyword("DONE"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("START");
        $ic4$ = makeKeyword("END");
        $ic5$ = makeKeyword("PROGRESS-MESSAGE");
        $ic6$ = makeKeyword("DONE");
        $ic7$ = makeUninternedSymbol("US#7B8B1E7");
        $ic8$ = makeUninternedSymbol("US#3FDC407");
        $ic9$ = makeSymbol("CLET");
        $ic10$ = makeSymbol("-");
        $ic11$ = makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic12$ = makeSymbol("S#37165", "CYC");
        $ic13$ = makeSymbol("S#37166", "CYC");
        $ic14$ = makeUninternedSymbol("US#306E856");
        $ic15$ = makeSymbol("DO-NUMBERS");
        $ic16$ = makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $ic17$ = makeSymbol("PWHEN");
        $ic18$ = makeSymbol("CONSTANT-P");
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13104", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic20$ = makeUninternedSymbol("US#7B8B1E7");
        $ic21$ = makeUninternedSymbol("US#3FDC407");
        $ic22$ = makeSymbol("S#37167", "CYC");
        $ic23$ = makeSymbol("S#37168", "CYC");
        $ic24$ = makeUninternedSymbol("US#306E856");
        $ic25$ = makeSymbol("FIND-NART-BY-ID");
        $ic26$ = makeSymbol("NART-P");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic28$ = makeUninternedSymbol("US#7B8B1E7");
        $ic29$ = makeUninternedSymbol("US#3FDC407");
        $ic30$ = makeSymbol("S#37169", "CYC");
        $ic31$ = makeSymbol("S#37170", "CYC");
        $ic32$ = makeUninternedSymbol("US#306E856");
        $ic33$ = makeSymbol("FIND-ASSERTION-BY-ID");
        $ic34$ = makeSymbol("ASSERTION-P");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14182", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic36$ = makeUninternedSymbol("US#7B8B1E7");
        $ic37$ = makeUninternedSymbol("US#3FDC407");
        $ic38$ = makeSymbol("S#37171", "CYC");
        $ic39$ = makeSymbol("S#37172", "CYC");
        $ic40$ = makeUninternedSymbol("US#306E856");
        $ic41$ = makeSymbol("FIND-DEDUCTION-BY-ID");
        $ic42$ = makeSymbol("DEDUCTION-P");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37215", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic44$ = makeUninternedSymbol("US#7B8B1E7");
        $ic45$ = makeUninternedSymbol("US#3FDC407");
        $ic46$ = makeSymbol("S#37173", "CYC");
        $ic47$ = makeSymbol("S#37174", "CYC");
        $ic48$ = makeUninternedSymbol("US#306E856");
        $ic49$ = makeSymbol("S#14249", "CYC");
        $ic50$ = makeSymbol("KB-HL-SUPPORT-P");
        $ic51$ = makeSymbol("S#10542", "CYC");
        $ic52$ = makeSymbol("VALID-CONSTANT?");
        $ic53$ = makeSymbol("S#13615", "CYC");
        $ic54$ = makeSymbol("S#13637", "CYC");
        $ic55$ = makeSymbol("S#13823", "CYC");
        $ic56$ = makeSymbol("VALID-ASSERTION?");
        $ic57$ = makeSymbol("S#14463", "CYC");
        $ic58$ = makeSymbol("S#14306", "CYC");
        $ic59$ = makeSymbol("S#14218", "CYC");
        $ic60$ = makeSymbol("S#14241", "CYC");
        $ic61$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic62$ = makeKeyword("CONSTANT");
        $ic63$ = makeKeyword("NART");
        $ic64$ = makeKeyword("ASSERTION");
        $ic65$ = makeKeyword("KB-HL-SUPPORT");
        $ic66$ = makeKeyword("DEDUCTION");
        $ic67$ = makeKeyword("START-CHECKPOINT");
        $ic68$ = makeKeyword("END-CHECKPOINT");
        $ic69$ = makeInteger(4000000);
        $ic70$ = makeKeyword("OUTPUT");
        $ic71$ = makeString("Unable to open ~S");
        $ic72$ = makeKeyword("INPUT");
        $ic73$ = makeString("Loading HL Transcript");
        $ic74$ = makeKeyword("EOF");
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#37216", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic76$ = ConsesLow.list((SubLObject)makeKeyword("MODIFICATION-SPEC"));
        $ic77$ = makeKeyword("MODIFICATION-SPEC");
        $ic78$ = makeUninternedSymbol("US#309193F");
        $ic79$ = makeUninternedSymbol("US#14ED3F6");
        $ic80$ = makeUninternedSymbol("US#1DBFE90");
        $ic81$ = makeUninternedSymbol("US#487CE3");
        $ic82$ = makeSymbol("S#37197", "CYC");
        $ic83$ = makeSymbol("APPEND");
        $ic84$ = makeSymbol("LIST");
        $ic85$ = makeKeyword("EXTERNALIZED?");
        $ic86$ = makeKeyword("ANALYZE");
        $ic87$ = makeSymbol("S#6486", "CYC");
        $ic88$ = makeSymbol("S#37193", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("IGNORE")));
        $ic90$ = ConsesLow.list((SubLObject)makeSymbol("IGNORE"));
        $ic91$ = makeKeyword("NEW-CONSTANTS");
        $ic92$ = makeKeyword("NEW-NARTS");
        $ic93$ = makeKeyword("NEW-ASSERTIONS");
        $ic94$ = makeKeyword("NEW-KB-HL-SUPPORTS");
        $ic95$ = makeKeyword("NEW-DEDUCTIONS");
        $ic96$ = makeString("saving constants");
        $ic97$ = makeString("saving NARTs");
        $ic98$ = makeString("saving assertions");
        $ic99$ = makeString("saving KB HL supports");
        $ic100$ = makeString("saving deductions");
        $ic101$ = makeKeyword("CONSTANTS");
        $ic102$ = makeKeyword("NARTS");
        $ic103$ = makeKeyword("ASSERTIONS");
        $ic104$ = makeKeyword("KB-HL-SUPPORTS");
        $ic105$ = makeKeyword("DEDUCTIONS");
        $ic106$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#37217", "CYC"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic107$ = makeSymbol("S#21568", "CYC");
        $ic108$ = makeSymbol("S#37206", "CYC");
        $ic109$ = ConsesLow.list(new SubLObject[] { makeKeyword("FORWARD"), makeKeyword("BACKWARD"), makeKeyword("TRUE"), makeKeyword("FALSE"), makeKeyword("DEFAULT"), makeKeyword("MONOTONIC"), makeKeyword("ASSERTED-TRUE-DEF"), makeKeyword("ASSERTED-TRUE-MON"), makeSymbol("CYC-FIND-OR-CREATE"), makeSymbol("S#37206", "CYC"), makeSymbol("FIND-OR-CREATE-ASSERTION"), makeSymbol("S#37208", "CYC"), makeSymbol("S#14370", "CYC"), makeSymbol("S#25851", "CYC") });
        $ic110$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), constant_handles_oc.f8479((SubLObject)makeString("implies")), constant_handles_oc.f8479((SubLObject)makeString("thereExists")), constant_handles_oc.f8479((SubLObject)makeString("forAll")));
        $ic111$ = makeInteger(500);
        $ic112$ = makeSymbol("S#37200", "CYC");
        $ic113$ = makeSymbol(">");
        $ic114$ = makeSymbol("CDR");
        $ic115$ = makeInteger(32);
        $ic116$ = makeString("~S was not a support-p");
        $ic117$ = makeSymbol("CYC-FIND-OR-CREATE");
        $ic118$ = makeSymbol("FIND-OR-CREATE-ASSERTION");
        $ic119$ = makeSymbol("S#37208", "CYC");
        $ic120$ = makeKeyword("STRENGTH");
        $ic121$ = makeKeyword("DIRECTION");
        $ic122$ = makeKeyword("CHECK-WFF?");
        $ic123$ = makeKeyword("FORWARD-RULES");
        $ic124$ = makeSymbol("S#14370", "CYC");
        $ic125$ = makeSymbol("S#25851", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 995 ms
	
	Decompiled with Procyon 0.5.32.
*/