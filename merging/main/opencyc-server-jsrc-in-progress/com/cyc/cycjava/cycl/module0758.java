package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0758 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0758";
    public static final String myFingerPrint = "d0f045cc57515b06e39a18be33b0f2cbdaf211074f0d869a208c1a41ef250f7f";
    private static SubLSymbol $g6084$;
    private static SubLSymbol $g6085$;
    private static SubLSymbol $g6086$;
    private static SubLSymbol $g6087$;
    private static SubLSymbol $g6088$;
    private static SubLSymbol $g6089$;
    private static SubLSymbol $g6090$;
    private static SubLSymbol $g6091$;
    private static SubLSymbol $g6092$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLList $ic108$;
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLList $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLInteger $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLString $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLObject $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLObject $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLObject $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLString $ic175$;
    private static final SubLObject $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLString $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLObject $ic191$;
    private static final SubLString $ic192$;
    private static final SubLList $ic193$;
    private static final SubLList $ic194$;
    private static final SubLList $ic195$;
    private static final SubLString $ic196$;
    private static final SubLObject $ic197$;
    private static final SubLList $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLObject $ic200$;
    private static final SubLObject $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLObject $ic203$;
    private static final SubLString $ic204$;
    private static final SubLObject $ic205$;
    private static final SubLObject $ic206$;
    private static final SubLObject $ic207$;
    private static final SubLObject $ic208$;
    private static final SubLObject $ic209$;
    private static final SubLObject $ic210$;
    private static final SubLString $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLObject $ic218$;
    private static final SubLObject $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLList $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLString $ic229$;
    
    public static SubLObject f47876(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic0$;
        }
        if (NIL != module0756.f47478(var1)) {
            f47877(var1);
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic1$, var2, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47877(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var1).isVector()) {
            final SubLObject var3 = module0743.f45996(var1);
            final SubLObject var4 = (SubLObject)NIL;
            SubLObject var5;
            SubLObject var6;
            SubLObject var7;
            SubLObject var8;
            for (var5 = Sequences.length(var3), var6 = (SubLObject)NIL, var6 = (SubLObject)ZERO_INTEGER; var6.numL(var5); var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER)) {
                var7 = ((NIL != var4) ? Numbers.subtract(var5, var6, (SubLObject)ONE_INTEGER) : var6);
                var8 = Vectors.aref(var3, var7);
                f47877(var8);
                if (NIL == module0756.f47479(var8)) {
                    f47876(var8, (SubLObject)$ic2$);
                }
                var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
            }
        }
        return var1;
    }
    
    public static SubLObject f47878(final SubLObject var1, SubLObject var10, SubLObject var11) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)$ic4$;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = $g6084$.currentBinding(var12);
        try {
            $g6084$.bind(module0048.f_1X($g6084$.getDynamicValue(var12)), var12);
            if ($g6084$.getDynamicValue(var12).numG($g6085$.getDynamicValue(var12))) {
                final SubLObject var14 = Sequences.cconcatenate((SubLObject)$ic5$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic6$, module0006.f203((SubLObject)$ic7$) });
                module0578.f35476(var14, (SubLObject)ConsesLow.list($g6085$.getDynamicValue(var12), var1));
            }
            if ($ic4$ == var10) {
                var10 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
            }
            module0756.f47799(var1, (SubLObject)UNPROVIDED);
            if (NIL == module0756.f47479(var1)) {
                if (NIL != module0756.f47519(var1)) {
                    f47879(var1, var10, var11);
                    if (NIL == module0756.f47519(var1)) {
                        final SubLObject var15 = f47878(var1, var10, var11);
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic8$, var15, module0756.f47482(var1));
                        }
                    }
                }
                else if (NIL != module0756.f47547(var1)) {
                    f47876(var1, (SubLObject)UNPROVIDED);
                }
                else if (NIL != module0756.f47538(var1)) {
                    final SubLObject var10_16 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
                    if (NIL != module0756.f47476(var10_16)) {
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)$ic9$, var1);
                        }
                        module0756.f47525(var1);
                        final SubLObject var16 = f47878(var1, var10_16, var11);
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic10$, var16);
                        }
                    }
                    else if (NIL != module0201.f12546(var10_16)) {
                        final SubLObject var17 = module0767.f48799(var10_16, (SubLObject)NIL, var1);
                        module0756.f47501(var1, var17, (SubLObject)UNPROVIDED);
                        module0756.f47608(var1);
                    }
                    else {
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic11$, var10_16);
                        }
                        module0756.f47723(var1, print_high.prin1_to_string(module0228.f15230(var10_16)));
                        module0756.f47715(var1);
                    }
                }
                else if (NIL != f47880(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic12$, var10);
                    }
                    if (NIL != f47881(var1)) {
                        module0756.f47723(var1, module0764.f48497(module0756.f47487(var1, (SubLObject)UNPROVIDED)));
                    }
                    else {
                        module0764.f48494(var1);
                    }
                }
                else if (NIL != module0756.f47551(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic13$, var10);
                    }
                    final SubLObject var18 = module0756.f47633(var1);
                    final SubLObject var19 = (SubLObject)makeBoolean(NIL != module0756.f47497(var18, (SubLObject)UNPROVIDED) || module0579.f35487().numG(module0579.$g4239$.getDynamicValue(var12)));
                    final SubLObject var20 = (SubLObject)makeBoolean(NIL != module0579.$g4238$.getDynamicValue(var12) && NIL == var19);
                    final SubLObject var13_21 = module0579.$g4238$.currentBinding(var12);
                    try {
                        module0579.$g4238$.bind((SubLObject)makeBoolean(NIL != module0579.$g4238$.getDynamicValue(var12) && NIL != var19), var12);
                        if (NIL != var20 && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic14$, var1);
                        }
                        f47882(var1, var10);
                        if (NIL != var20 && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic15$);
                        }
                    }
                    finally {
                        module0579.$g4238$.rebind(var13_21, var12);
                    }
                }
                else if (NIL != module0756.f47572(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic16$);
                    }
                    f47883(var1);
                }
                else if (NIL != module0756.f47528(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic17$);
                    }
                    f47884(var1, var10);
                }
                else if (NIL != module0756.f47536(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic18$, module0756.f47487(var1, (SubLObject)UNPROVIDED));
                    }
                    f47885(var1);
                }
                else if (NIL != module0756.f47544(var1) && NIL != module0581.f35648(module0756.f47487(var1, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic19$, module0756.f47487(var1, (SubLObject)UNPROVIDED));
                    }
                    module0756.f47723(var1, module0006.f204(module0756.f47487(var1, (SubLObject)UNPROVIDED)));
                }
                else if (NIL != module0756.f47540(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic20$);
                    }
                    final SubLObject var21 = module0756.f47590(var1, (SubLObject)ZERO_INTEGER);
                    final SubLObject var10_17 = module0756.f47487(var21, (SubLObject)UNPROVIDED);
                    final SubLObject var22 = module0751.f47032(var10_17);
                    module0756.f47784(var21, var22, (SubLObject)UNPROVIDED);
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic21$, var22, var10_17);
                    }
                    final SubLObject var13_22 = module0579.$g4293$.currentBinding(var12);
                    try {
                        module0579.$g4293$.bind((SubLObject)NIL, var12);
                        f47878(var21, var10_17, var11);
                        if (NIL != module0756.f47479(var21) && NIL == module0038.f2684(module0756.f47480(var21, (SubLObject)NIL), constant_reader_oc.f8495())) {
                            final SubLObject var23 = module0751.f47036(var10_17);
                            final SubLObject var24 = module0756.f47467(var21);
                            final SubLObject var25 = module0756.f47713(f47886(var24, var23), (SubLObject)NIL);
                            module0756.f47723(var1, module0581.f35665(module0581.f35665((SubLObject)$ic22$, var25), (SubLObject)$ic22$));
                            module0756.f47715(var1);
                        }
                    }
                    finally {
                        module0579.$g4293$.rebind(var13_22, var12);
                    }
                }
                else if (NIL != module0756.f47550(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic23$, var1);
                    }
                    final SubLObject var21 = module0756.f47590(var1, (SubLObject)ZERO_INTEGER);
                    f47878(var21, var10, var11);
                    module0756.f47508(var1, module0756.f47482(var21), (SubLObject)NIL);
                    module0756.f47723(var1, module0756.f47480(var21, (SubLObject)UNPROVIDED));
                    module0756.f47501(var1, f47887(var21), (SubLObject)UNPROVIDED);
                    module0756.f47715(var1);
                    module0756.f47608(var1);
                }
                else if (NIL != module0756.f47548(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic24$, module0756.f47487(var1, (SubLObject)UNPROVIDED));
                    }
                    final SubLObject var21 = module0756.f47590(var1, (SubLObject)ZERO_INTEGER);
                    final SubLObject var13_23 = module0579.$g4255$.currentBinding(var12);
                    try {
                        module0579.$g4255$.bind((SubLObject)T, var12);
                        f47878(var21, var10, var11);
                    }
                    finally {
                        module0579.$g4255$.rebind(var13_23, var12);
                    }
                    module0756.f47508(var1, module0756.f47482(var21), (SubLObject)NIL);
                    module0756.f47723(var1, module0756.f47480(var21, (SubLObject)UNPROVIDED));
                    module0756.f47715(var1);
                }
                else if (NIL != module0756.f47549(var1)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic25$, module0756.f47487(var1, (SubLObject)UNPROVIDED));
                    }
                    final SubLObject var21 = module0756.f47590(var1, (SubLObject)ZERO_INTEGER);
                    assert NIL != module0751.f46598((SubLObject)T) : T;
                    final SubLObject var13_24 = module0579.$g4254$.currentBinding(var12);
                    final SubLObject var26 = module0579.$g4237$.currentBinding(var12);
                    try {
                        module0579.$g4254$.bind((SubLObject)T, var12);
                        module0579.$g4237$.bind((NIL != module0579.$g4237$.getDynamicValue(var12)) ? module0579.$g4237$.getDynamicValue(var12) : module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED), var12);
                        f47878(var21, var10, var11);
                    }
                    finally {
                        module0579.$g4237$.rebind(var26, var12);
                        module0579.$g4254$.rebind(var13_24, var12);
                    }
                    module0756.f47508(var1, module0756.f47482(var21), (SubLObject)NIL);
                    module0756.f47723(var1, module0756.f47480(var21, (SubLObject)UNPROVIDED));
                    module0756.f47715(var1);
                }
                else if (NIL != module0756.f47478(var1)) {
                    f47888(var1, var10);
                }
                else {
                    if (NIL != module0756.f47476(var10) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)$ic27$, var1);
                    }
                    final SubLObject var27 = (SubLObject)((NIL != module0202.f12590(var10) && NIL == module0751.f46614(var10)) ? Sequences.position(module0228.f15230(module0756.f47487(var1, (SubLObject)UNPROVIDED)), var10, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                    assert NIL != module0751.f46598(module0751.f46607(var27, var10)) : module0751.f46607(var27, var10);
                    final SubLObject var13_25 = module0579.$g4254$.currentBinding(var12);
                    try {
                        module0579.$g4254$.bind(module0751.f46607(var27, var10), var12);
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic28$, module0751.f46599());
                        }
                        f47889(var1, var11);
                    }
                    finally {
                        module0579.$g4254$.rebind(var13_25, var12);
                    }
                }
            }
        }
        finally {
            $g6084$.rebind(var13, var12);
        }
        module0755.f47456(var1);
        f47890(var1);
        return Values.values(module0756.f47480(var1, (SubLObject)UNPROVIDED), var1);
    }
    
    public static SubLObject f47890(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0107.f7629(module0579.$g4297$.getDynamicValue(var2)) && NIL != module0756.f47479(var1)) {
            SubLObject var3 = module0756.f47698(var1, (SubLObject)NIL);
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                f47891(module0756.f47487(var1, (SubLObject)UNPROVIDED), var4, module0756.f47488(var1, (SubLObject)UNPROVIDED), module0756.f47690(var1));
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47891(final SubLObject var32, final SubLObject var15, final SubLObject var23, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f2013(var33) && NIL != module0107.f7629(module0579.$g4297$.getDynamicValue(var34))) {
            SubLObject var36;
            final SubLObject var35 = var36 = module0579.$g4297$.getDynamicValue(var34);
            SubLObject var37 = (SubLObject)NIL;
            SubLObject var38 = (SubLObject)NIL;
            SubLObject var39 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic29$);
            var37 = var36.first();
            var36 = var36.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic29$);
            var38 = var36.first();
            var36 = var36.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic29$);
            var39 = var36.first();
            var36 = var36.rest();
            if (NIL == var36) {
                if (var15.equal(var38) && var32.equal(var37) && NIL != module0751.f47099(var39, var23, (SubLObject)UNPROVIDED)) {
                    Dynamic.sublisp_throw((SubLObject)$ic30$, var33);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic29$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47887(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var9).isVector()) {
            final SubLObject var12 = module0743.f45996(var9);
            final SubLObject var13 = (SubLObject)NIL;
            SubLObject var14;
            SubLObject var15;
            SubLObject var16;
            SubLObject var17;
            for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                var17 = Vectors.aref(var12, var16);
                var10 = (SubLObject)ConsesLow.cons(module0756.f47467(var17), var10);
                var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
            }
        }
        return (SubLObject)ConsesLow.list(module0749.f46485(Sequences.nreverse(var10)));
    }
    
    public static SubLObject f47888(final SubLObject var1, final SubLObject var42) {
        module0756.f47639(var1);
        final SubLObject var43 = module0756.f47595(var1);
        if (NIL != var43) {
            module0756.f47786(var1, var43);
        }
        final SubLObject var44 = f47892(var1, var42);
        if (var44 == $ic31$) {
            f47893(var1);
            if (module0756.f47481(var1, (SubLObject)UNPROVIDED).eql($ic32$)) {
                module0770.f49103(var1);
            }
            module0756.f47608(var1);
        }
        return Values.values(module0756.f47480(var1, (SubLObject)UNPROVIDED), var1);
    }
    
    public static SubLObject f47892(final SubLObject var1, final SubLObject var42) {
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var44 = (SubLObject)NIL;
        final SubLObject var45 = f47894(var1, var42);
        if (NIL == var45) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic33$, var1);
            }
            var43 = (SubLObject)T;
        }
        if (NIL == var43) {
            SubLObject var46 = (SubLObject)NIL;
            SubLObject var47 = (SubLObject)ZERO_INTEGER;
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic34$, module0756.f47475(var1));
            }
            SubLObject var48;
            SubLObject var49;
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            for (var48 = (SubLObject)NIL, var48 = module0756.f47819(var1); NIL == var43 && !var48.isZero() && !var46.eql(var48); var48 = module0756.f47819(var1)) {
                var46 = var48;
                if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic35$, var46, module0756.f47588(var1));
                }
                var49 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var1).isVector()) {
                    var50 = module0743.f45996(var1);
                    var51 = (SubLObject)NIL;
                    for (var52 = Sequences.length(var50), var53 = (SubLObject)NIL, var53 = (SubLObject)ZERO_INTEGER; var53.numL(var52); var53 = Numbers.add(var53, (SubLObject)ONE_INTEGER)) {
                        var54 = ((NIL != var51) ? Numbers.subtract(var52, var53, (SubLObject)ONE_INTEGER) : var53);
                        var55 = Vectors.aref(var50, var54);
                        if (NIL == var43) {
                            if (NIL != module0756.f47800(var55, (SubLObject)UNPROVIDED)) {
                                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                    Errors.warn((SubLObject)$ic36$, var55);
                                }
                                var43 = (SubLObject)T;
                            }
                            else {
                                f47895(var55, var49, var42, var1);
                            }
                        }
                        var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                    }
                }
                var47 = Numbers.add(var47, (SubLObject)ONE_INTEGER);
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic37$, new SubLObject[] { var47, module0756.f47819(var1), module0756.f47588(var1) });
                }
            }
            var44 = Numbers.zerop(var48);
            if (NIL == var44) {
                SubLObject var56 = (SubLObject)NIL;
                SubLObject var57 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var1).isVector()) {
                    final SubLObject var58 = module0743.f45996(var1);
                    final SubLObject var59 = (SubLObject)NIL;
                    SubLObject var60;
                    SubLObject var61;
                    SubLObject var62;
                    SubLObject var63;
                    for (var60 = Sequences.length(var58), var61 = (SubLObject)NIL, var61 = (SubLObject)ZERO_INTEGER; var61.numL(var60); var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER)) {
                        var62 = ((NIL != var59) ? Numbers.subtract(var60, var61, (SubLObject)ONE_INTEGER) : var61);
                        var63 = Vectors.aref(var58, var62);
                        if (NIL == module0756.f47479(var63)) {
                            var56 = (SubLObject)ConsesLow.cons(var63, var56);
                        }
                        var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER);
                    }
                }
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic38$, var1, var56);
                }
                f47876(var1, (SubLObject)UNPROVIDED);
            }
        }
        if (NIL != var44) {
            return (SubLObject)$ic31$;
        }
        return (SubLObject)$ic39$;
    }
    
    public static SubLObject f47894(final SubLObject var1, final SubLObject var42) {
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var44 = (SubLObject)NIL;
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var1).isVector()) {
            final SubLObject var47 = module0743.f45996(var1);
            final SubLObject var48 = (SubLObject)NIL;
            SubLObject var49;
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            for (var49 = Sequences.length(var47), var50 = (SubLObject)NIL, var50 = (SubLObject)ZERO_INTEGER; var50.numL(var49); var50 = Numbers.add(var50, (SubLObject)ONE_INTEGER)) {
                var51 = ((NIL != var48) ? Numbers.subtract(var49, var50, (SubLObject)ONE_INTEGER) : var50);
                var52 = Vectors.aref(var47, var51);
                if (NIL == var45) {
                    if (NIL == module0756.f47552(var52)) {
                        var43 = (SubLObject)ConsesLow.cons(var52, var43);
                    }
                    else {
                        var44 = (SubLObject)T;
                        module0756.f47464(var52, module0756.f47511(var1));
                        var53 = f47896(var52, var42);
                        if (NIL != module0035.f2495((SubLObject)$ic40$, var53)) {
                            var54 = var53;
                            var55 = (SubLObject)NIL;
                            var55 = var54.first();
                            while (NIL != var54) {
                                var43 = (SubLObject)ConsesLow.cons(var55, var43);
                                var54 = var54.rest();
                                var55 = var54.first();
                            }
                        }
                        else {
                            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                Errors.warn((SubLObject)$ic41$, var52);
                            }
                            var45 = (SubLObject)T;
                        }
                    }
                }
                var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
            }
        }
        if (NIL != var44) {
            module0756.f47507(var1, Sequences.nreverse(var43), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)makeBoolean(NIL == var45);
    }
    
    public static SubLObject f47896(final SubLObject var57, final SubLObject var42) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12590(var42)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic42$, var42);
            }
            return (SubLObject)ConsesLow.list(var57);
        }
        final SubLObject var59 = module0756.f47590(var57, (SubLObject)ZERO_INTEGER);
        final SubLObject var60 = module0756.f47487(var59, (SubLObject)UNPROVIDED);
        final SubLObject var61 = (SubLObject)makeBoolean(NIL != module0756.f47479(var59) && NIL != module0751.f46819(var60));
        SubLObject var62 = (SubLObject)NIL;
        if (NIL != var61) {
            var62 = f47897(var59, var42);
        }
        else {
            final SubLObject var63 = $g6086$.currentBinding(var58);
            try {
                $g6086$.bind((SubLObject)NIL, var58);
                final SubLObject var64 = module0756.f47596(var57);
                final SubLObject var65 = module0035.f2114(var64);
                final SubLObject var66 = module0751.f46604(var64);
                final SubLObject var67 = module0205.f13144((NIL != module0035.f2002(var64, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) ? module0205.f13394(var42, conses_high.butlast(var64, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED) : var42);
                final SubLObject var68 = module0202.f12725(var67, (SubLObject)UNPROVIDED);
                if (!var68.isInteger()) {
                    var62 = (SubLObject)ConsesLow.cons(var59, var62);
                }
                else if (var65.numLE(var68)) {
                    var62 = (SubLObject)ConsesLow.cons(var59, var62);
                    SubLObject var69;
                    SubLObject var70;
                    SubLObject var71;
                    SubLObject var72;
                    for (var69 = (SubLObject)NIL, var69 = module0048.f_1X(var65); !var69.numG(var68); var69 = module0048.f_1X(var69)) {
                        var70 = module0756.f47484(var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        var71 = module0035.f2152(var64, var69);
                        var72 = module0751.f46604(var71);
                        module0756.f47754(var72, var66, var70, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                        if (module0756.f47487(var70, (SubLObject)UNPROVIDED).equal(module0756.f47487(var59, (SubLObject)UNPROVIDED)) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)$ic43$, var70);
                        }
                        var62 = (SubLObject)ConsesLow.cons(var70, var62);
                    }
                    var62 = Sequences.nreverse(var62);
                }
                SubLObject var73 = var62;
                SubLObject var74 = (SubLObject)NIL;
                var74 = var73.first();
                while (NIL != var73) {
                    final SubLObject var13_71 = module0579.$g4331$.currentBinding(var58);
                    try {
                        module0579.$g4331$.bind((SubLObject)T, var58);
                        final SubLObject var75 = module0756.f47511(var57);
                        f47898(var74, var42, var75);
                    }
                    finally {
                        module0579.$g4331$.rebind(var13_71, var58);
                    }
                    f47899(var74);
                    f47900();
                    var73 = var73.rest();
                    var74 = var73.first();
                }
            }
            finally {
                $g6086$.rebind(var63, var58);
            }
        }
        return var62;
    }
    
    public static SubLObject f47897(final SubLObject var58, final SubLObject var42) {
        SubLObject var59 = (SubLObject)NIL;
        module0756.f47723(var58, Sequences.cconcatenate(module0756.f47480(var58, (SubLObject)NIL), (SubLObject)$ic44$));
        var59 = (SubLObject)ConsesLow.cons(var58, var59);
        return var59;
    }
    
    public static SubLObject f47901(final SubLObject var73, final SubLObject var74) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        if (NIL == f47902(var73)) {
            final SubLObject var76 = Sequences.cconcatenate((SubLObject)$ic5$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic6$, module0006.f203((SubLObject)$ic45$) });
            module0578.f35476(var76, (SubLObject)ConsesLow.list(var73));
            return (SubLObject)NIL;
        }
        final SubLObject var77 = (SubLObject)ZERO_INTEGER;
        SubLObject var78 = f47903(var73);
        if ($ic46$ == var78) {
            var78 = var77;
            $g6086$.setDynamicValue(module0035.f2063($g6086$.getDynamicValue(var75), var73, var78, (SubLObject)UNPROVIDED), var75);
        }
        return ConsesLow.nth(Numbers.add(var78, var74), module0205.f13207(var73, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47903(final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        return module0035.f2293($g6086$.getDynamicValue(var74), var73, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic46$);
    }
    
    public static SubLObject f47902(final SubLObject var77) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var77) && NIL != module0337.f22630(var77, (SubLObject)$ic47$));
    }
    
    public static SubLObject f47899(final SubLObject var1) {
        if (NIL == module0756.f47479(var1) && NIL == module0756.f47552(var1)) {
            final SubLObject var2 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
            final SubLObject var3 = f47904(var2);
            module0756.f47465(var1, var3);
            module0756.f47468(var1, var3);
            if (NIL != module0756.f47519(var1)) {
                final SubLObject var4 = module0756.f47575(var1);
                final SubLObject var5 = f47904(var4);
                module0756.f47576(var1, var5);
                if (!var4.equal(var5) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic48$, new SubLObject[] { var4, var5, module0756.f47575(var1) });
                }
            }
            if (NIL != module0756.f47478(var1)) {
                SubLObject var6 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var1).isVector()) {
                    final SubLObject var7 = module0743.f45996(var1);
                    final SubLObject var8 = (SubLObject)NIL;
                    SubLObject var9;
                    SubLObject var10;
                    SubLObject var11;
                    SubLObject var12;
                    for (var9 = Sequences.length(var7), var10 = (SubLObject)NIL, var10 = (SubLObject)ZERO_INTEGER; var10.numL(var9); var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER)) {
                        var11 = ((NIL != var8) ? Numbers.subtract(var9, var10, (SubLObject)ONE_INTEGER) : var10);
                        var12 = Vectors.aref(var7, var11);
                        f47899(var12);
                        var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                    }
                }
            }
        }
        return var1;
    }
    
    public static SubLObject f47904(final SubLObject var82) {
        return module0205.f13147(var82, (SubLObject)$ic49$, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47905(final SubLObject var77) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var77) && NIL != module0337.f22630(var77, (SubLObject)$ic51$));
    }
    
    public static SubLObject f47906(final SubLObject var84) {
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var87;
        final SubLObject var86 = var87 = module0205.f13304(var84, (SubLObject)UNPROVIDED);
        SubLObject var88 = (SubLObject)NIL;
        SubLObject var89 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var87, var86, (SubLObject)$ic52$);
        var88 = var87.first();
        var87 = var87.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87, var86, (SubLObject)$ic52$);
        var89 = var87.first();
        var87 = var87.rest();
        if (NIL == var87) {
            var85 = f47901(var88, var89);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var86, (SubLObject)$ic52$);
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic53$, var84, var85);
        }
        return var85;
    }
    
    public static SubLObject f47900() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = $g6086$.getDynamicValue(var12);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            SubLObject var17;
            final SubLObject var16 = var17 = var15;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic54$);
            var18 = var17.first();
            var17 = (var19 = var17.rest());
            var13 = module0035.f2063(var13, var18, module0048.f_1X(var19), (SubLObject)UNPROVIDED);
            var14 = var14.rest();
            var15 = var14.first();
        }
        $g6086$.setDynamicValue(var13, var12);
        return $g6086$.getDynamicValue(var12);
    }
    
    public static SubLObject f47895(final SubLObject var9, final SubLObject var3, final SubLObject var42, final SubLObject var1) {
        if (NIL != module0756.f47519(var9)) {
            f47879(var9, var42, var1);
        }
        if (NIL == module0756.f47519(var9)) {
            f47907(var9, var3, var1);
            f47908(var9, var3, var1);
            if (NIL != module0756.f47530(var9)) {
                if (NIL != f47909(var9, var1, (SubLObject)UNPROVIDED)) {
                    f47910(var9, var3, var1, var42);
                }
                else {
                    module0756.f47535(var9);
                    f47876(var9, (SubLObject)UNPROVIDED);
                }
            }
            else if (NIL != module0756.f47479(var9)) {
                f47911(var9, module0756.f47511(var1));
                module0756.f47715(var9);
                if (NIL != module0756.f47827(var1, var3)) {
                    f47912(var1, var9);
                }
            }
            else if (NIL != f47909(var9, var1, (SubLObject)UNPROVIDED)) {
                f47913(var9, var3, var1, var42);
            }
            else {
                f47876(var9, (SubLObject)UNPROVIDED);
            }
        }
        return module0756.f47467(var9);
    }
    
    public static SubLObject f47910(final SubLObject var9, final SubLObject var3, final SubLObject var1, final SubLObject var42) {
        final SubLObject var43 = f47914(var9, var1);
        final SubLObject var44 = module0756.f47487(var43, (SubLObject)UNPROVIDED);
        final SubLObject var45 = module0756.f47480(var43, (SubLObject)UNPROVIDED);
        if (NIL != f47915(var45, var44)) {
            module0756.f47608(var9);
        }
        else {
            module0756.f47723(var9, (SubLObject)$ic55$);
        }
        return var9;
    }
    
    public static SubLObject f47908(final SubLObject var9, final SubLObject var3, final SubLObject var1) {
        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic56$, module0756.f47482(var1));
        }
        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic57$, var3, module0756.f47481(var9, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic58$, var3, module0756.f47488(var9, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47907(final SubLObject var9, final SubLObject var3, final SubLObject var1) {
        final SubLObject var10 = module0756.f47482(var9);
        final SubLObject var11 = module0749.f46376(var10);
        final SubLObject var12 = (SubLObject)((NIL != module0751.f47165(var11)) ? module0751.f47170(var11) : NIL);
        final SubLObject var13 = (SubLObject)((NIL != module0751.f47158(var12)) ? module0756.f47781(var9, var12) : NIL);
        f47916(var9, var1);
        if (NIL != f47909(var9, var1, (SubLObject)UNPROVIDED)) {
            if (NIL != var13 && !module0756.f47781(var9, var12).equal(var13) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic59$, var3, module0756.f47801(var9, var12));
            }
            if (NIL != module0756.f47827(var1, var3)) {
                f47912(var1, var9);
                if (NIL != var13 && !var13.equal(module0756.f47781(var9, var12)) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic60$, module0756.f47781(var9, var12));
                }
            }
        }
        return var9;
    }
    
    public static SubLObject f47913(final SubLObject var9, final SubLObject var3, final SubLObject var1, final SubLObject var42) {
        f47878(var9, var42, var1);
        if (NIL != module0756.f47479(var9)) {
            f47911(var9, module0756.f47511(var1));
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic61$, var9, module0756.f47588(var9));
            }
            if (NIL != module0756.f47827(var1, var3)) {
                module0756.f47508(var1, module0756.f47482(var9), (SubLObject)UNPROVIDED);
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic62$, module0756.f47482(var1));
                }
            }
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic63$, module0756.f47819(var1));
            }
        }
        else {
            f47876(var9, (SubLObject)UNPROVIDED);
        }
        return module0756.f47467(var9);
    }
    
    public static SubLObject f47911(final SubLObject var1, SubLObject var98) {
        if (var98 == UNPROVIDED) {
            var98 = module0751.f46691();
        }
        f47917(var1, var98);
        if (NIL != module0756.f47478(var1)) {
            SubLObject var99 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var1).isVector()) {
                final SubLObject var100 = module0743.f45996(var1);
                final SubLObject var101 = (SubLObject)NIL;
                SubLObject var102;
                SubLObject var103;
                SubLObject var104;
                SubLObject var105;
                for (var102 = Sequences.length(var100), var103 = (SubLObject)NIL, var103 = (SubLObject)ZERO_INTEGER; var103.numL(var102); var103 = Numbers.add(var103, (SubLObject)ONE_INTEGER)) {
                    var104 = ((NIL != var101) ? Numbers.subtract(var102, var103, (SubLObject)ONE_INTEGER) : var103);
                    var105 = Vectors.aref(var100, var104);
                    f47911(var105, module0756.f47511(var1));
                    var99 = Numbers.add(var99, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var1;
    }
    
    public static SubLObject f47917(final SubLObject var9, SubLObject var98) {
        if (var98 == UNPROVIDED) {
            var98 = module0751.f46691();
        }
        if (NIL != module0756.f47479(var9) && NIL != module0579.f35497() && NIL != f47918(var9)) {
            final SubLObject var99 = f47919(var9);
            final SubLObject var100 = f47920(var9);
            SubLObject var101 = module0751.f46982(var100, var98);
            if (NIL != module0751.f46829(var101)) {
                var101 = module0756.f47773();
            }
            if (NIL != module0751.f46943(var101) && NIL == module0756.f47476(var99)) {
                f47921(var9, var99, var101);
            }
        }
        return module0756.f47467(var9);
    }
    
    public static SubLObject f47921(final SubLObject var9, final SubLObject var99, final SubLObject var102) {
        module0756.f47469(var9, var102);
        if (NIL == module0756.f47487(var9, (SubLObject)UNPROVIDED)) {
            module0756.f47465(var9, var99);
        }
        module0756.f47624(var9, var99);
        module0756.f47468(var9, var99);
        module0756.f47715(var9);
        return module0756.f47467(var9);
    }
    
    public static SubLObject f47922(final SubLObject var1) {
        return Types.sublisp_null(module0749.f46376(module0756.f47482(var1)));
    }
    
    public static SubLObject f47909(final SubLObject var1, final SubLObject var18, SubLObject var103) {
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)NIL;
        }
        if (NIL != f47922(var1)) {
            return (SubLObject)T;
        }
        final SubLObject var104 = f47914(var1, var18);
        if (NIL != module0756.f47479(var104)) {
            return (SubLObject)T;
        }
        if (var104 == $ic64$) {
            if (NIL != var103) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic65$, var104);
                }
                return (SubLObject)NIL;
            }
            return (SubLObject)T;
        }
        else {
            if (var1.eql(var104)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic66$);
                }
                return (SubLObject)T;
            }
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic67$, var104);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f47893(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var1).isVector()) {
            final SubLObject var4 = module0743.f45996(var1);
            final SubLObject var5 = (SubLObject)NIL;
            SubLObject var6;
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            SubLObject var10;
            SubLObject var11;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                var9 = Vectors.aref(var4, var8);
                if (NIL == module0756.f47479(var9)) {
                    var10 = Sequences.cconcatenate((SubLObject)$ic5$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic6$, module0006.f203((SubLObject)$ic68$) });
                    module0578.f35476(var10, (SubLObject)ConsesLow.list(module0756.f47487(var9, (SubLObject)UNPROVIDED), var9));
                }
                var11 = module0756.f47467(var9);
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic69$, var3, var11);
                }
                var12 = var11;
                var13 = (SubLObject)NIL;
                var13 = var12.first();
                while (NIL != var12) {
                    if (NIL != var2 && NIL != module0751.f46718(module0749.f46455(var13)) && NIL != module0751.f46966(var2.first())) {
                        var14 = (SubLObject)((NIL != module0751.f46964(conses_high.second(var2))) ? TWO_INTEGER : ONE_INTEGER);
                        var2 = module0035.f2139(var13, var2, var14);
                    }
                    else {
                        var2 = (SubLObject)ConsesLow.cons(var13, var2);
                    }
                    var12 = var12.rest();
                    var13 = var12.first();
                }
                if (NIL != module0756.f47827(var1, var3)) {
                    module0756.f47784(var1, module0756.f47488(var9, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                }
                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
            }
        }
        module0756.f47501(var1, Sequences.nreverse(Sequences.delete_if((SubLObject)$ic70$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
        module0756.f47608(var1);
        return module0756.f47467(var1);
    }
    
    public static SubLObject f47923(final SubLObject var109) {
        return (SubLObject)makeBoolean(NIL != module0035.f1995(module0749.f46455(var109), (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED) && NIL == module0038.f2653(module0749.f46474(var109)) && NIL == module0038.f2653(module0749.f46476(var109)) && NIL == module0756.f47694(module0749.f46466(var109)));
    }
    
    public static SubLObject f47924(final SubLObject var99, final SubLObject var110, SubLObject var100) {
        if (var100 == UNPROVIDED) {
            var100 = (SubLObject)$ic71$;
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        if (NIL != var100 && NIL != module0579.$g4304$.getDynamicValue(var111) && NIL != module0769.f49012(var99)) {
            var111.resetMultipleValues();
            final SubLObject var113_114 = module0769.f49014(var99);
            final SubLObject var115_116 = var111.secondMultipleValue();
            var111.resetMultipleValues();
            var112 = var113_114;
            var113 = var115_116;
        }
        final SubLObject var114 = module0749.f46446(module0751.f46722(var110, (SubLObject)UNPROVIDED), var100, var99, var112, var113, (SubLObject)UNPROVIDED);
        return var114;
    }
    
    public static SubLObject f47925(final SubLObject var118, final SubLObject var32) {
        return module0769.f49022(module0751.f46722(var118, (SubLObject)UNPROVIDED), var32);
    }
    
    public static SubLObject f47926(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var1).isVector()) {
            final SubLObject var4 = module0743.f45996(var1);
            final SubLObject var5 = (SubLObject)NIL;
            SubLObject var6;
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                var9 = Vectors.aref(var4, var8);
                if (NIL != f47927(var9)) {
                    var2 = (SubLObject)ConsesLow.cons(var3, var2);
                }
                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f47927(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        if (NIL == var2) {
            SubLObject var3 = module0756.f47467(var1);
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL == var2 && NIL != var3) {
                final SubLObject var5 = module0749.f46462(var4);
                var2 = (SubLObject)makeBoolean(NIL != var5 && !var5.equal((SubLObject)$ic71$));
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        if (NIL != var2) {
            return (SubLObject)T;
        }
        if (NIL != module0756.f47478(var1)) {
            SubLObject var6 = (SubLObject)NIL;
            SubLObject var7 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var1).isVector()) {
                final SubLObject var8 = module0743.f45996(var1);
                final SubLObject var9 = (SubLObject)NIL;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                for (var10 = Sequences.length(var8), var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER)) {
                    var12 = ((NIL != var9) ? Numbers.subtract(var10, var11, (SubLObject)ONE_INTEGER) : var11);
                    var13 = Vectors.aref(var8, var12);
                    var6 = (SubLObject)makeBoolean(NIL != var6 || NIL != f47927(var13));
                    var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                }
            }
            return var6;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47928(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        if (NIL == var2) {
            SubLObject var3;
            SubLObject var4;
            for (var3 = module0756.f47467(var1), var4 = (SubLObject)NIL, var4 = var3.first(); NIL == var2 && NIL != var3; var2 = Equality.equal((SubLObject)$ic71$, module0749.f46462(var4)), var3 = var3.rest(), var4 = var3.first()) {}
        }
        if (NIL != var2) {
            return (SubLObject)T;
        }
        if (NIL != module0756.f47478(var1)) {
            SubLObject var5 = (SubLObject)NIL;
            SubLObject var6 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var1).isVector()) {
                final SubLObject var7 = module0743.f45996(var1);
                final SubLObject var8 = (SubLObject)NIL;
                SubLObject var9;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                for (var9 = Sequences.length(var7), var10 = (SubLObject)NIL, var10 = (SubLObject)ZERO_INTEGER; var10.numL(var9); var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER)) {
                    var11 = ((NIL != var8) ? Numbers.subtract(var9, var10, (SubLObject)ONE_INTEGER) : var10);
                    var12 = Vectors.aref(var7, var11);
                    var5 = (SubLObject)makeBoolean(NIL != var5 || NIL != f47928(var12));
                    var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                }
            }
            return var5;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47879(final SubLObject var1, final SubLObject var42, final SubLObject var11) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = module0756.f47575(var1);
        final SubLObject var45 = f47929(var44, var42, var11);
        if (NIL != module0205.f13145((SubLObject)$ic72$, var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic73$, var45);
            }
            return var1;
        }
        final SubLObject var46 = module0751.f46848(var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic74$, var45, (SubLObject)((NIL != var46) ? $ic75$ : $ic76$));
        }
        final SubLObject var47 = (NIL != var46) ? module0756.f47577(var1).first() : conses_high.second(module0756.f47577(var1));
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic77$, var47, module0756.f47488(var47, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0756.f47519(var47)) {
            f47879(var47, var42, var11);
        }
        final SubLObject var48 = module0579.$g4339$.currentBinding(var43);
        try {
            module0579.$g4339$.bind((SubLObject)T, var43);
            final SubLObject var49 = module0756.f47633(var1);
            module0756.f47484(var47, var1, (SubLObject)UNPROVIDED);
            module0756.f47623(var1, var49);
        }
        finally {
            module0579.$g4339$.rebind(var48, var43);
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic78$, var1, module0756.f47488(var1, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic79$, module0756.f47588(var1));
        }
        return var1;
    }
    
    public static SubLObject f47930(final SubLObject var126) {
        return (SubLObject)makeBoolean(NIL != module0756.f47497(var126, (SubLObject)UNPROVIDED) && NIL == module0756.f47479(var126));
    }
    
    public static SubLObject f47929(SubLObject var127, final SubLObject var42, final SubLObject var1) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12590(var42) && NIL != module0751.f46788(var127)) {
            var127 = module0751.f46672(var127, var42);
        }
        var127 = module0751.f46762(var127, (SubLObject)UNPROVIDED);
        final SubLObject var129 = $g6086$.currentBinding(var128);
        try {
            $g6086$.bind((SubLObject)NIL, var128);
            var127 = f47904(var127);
        }
        finally {
            $g6086$.rebind(var129, var128);
        }
        if (NIL != module0205.f13145((SubLObject)$ic80$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var127 = f47931(var127, var1);
        }
        return var127;
    }
    
    public static SubLObject f47932(final SubLObject var126) {
        if (NIL != module0202.f12656(var126)) {
            final SubLObject var127 = module0763.f48259(var126);
            return module0337.f22630(var127, (SubLObject)$ic81$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47931(final SubLObject var127, final SubLObject var1) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        SubLObject var129 = (SubLObject)NIL;
        final SubLObject var130 = $g6087$.currentBinding(var128);
        try {
            $g6087$.bind(var1, var128);
            var129 = module0205.f13147(var127, (SubLObject)$ic80$, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            $g6087$.rebind(var130, var128);
        }
        return var129;
    }
    
    public static SubLObject f47933(final SubLObject var129) {
        final SubLThread var130 = SubLProcess.currentSubLThread();
        final SubLObject var131 = module0763.f48259(var129);
        final SubLObject var132 = module0205.f13368(var131, (SubLObject)UNPROVIDED);
        final SubLObject var133 = module0048.f_1_(var132);
        return (SubLObject)(module0756.f47588($g6087$.getDynamicValue(var130)).numG(var133) ? module0756.f47590($g6087$.getDynamicValue(var130), var133) : NIL);
    }
    
    public static SubLObject f47916(final SubLObject var1, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = f47914(var1, var11);
        SubLObject var14 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0756.f47497(var13, (SubLObject)UNPROVIDED) && NIL != module0756.f47479(var13) && NIL != module0035.f2012(module0756.f47673(var1))) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic83$, var13, var1);
            }
            final SubLObject var15 = module0055.f4017();
            SubLObject var16 = (SubLObject)ZERO_INTEGER;
            module0055.f4021(var13, var15);
            while (NIL == module0055.f4019(var15)) {
                final SubLObject var17 = module0055.f4023(var15);
                SubLObject var18 = module0756.f47673(var17);
                SubLObject var19 = (SubLObject)NIL;
                var19 = var18.first();
                while (NIL != var18) {
                    final SubLObject var20 = module0756.f47484(var1, (SubLObject)NIL, (SubLObject)NIL);
                    module0756.f47798(var20, var19);
                    f47934(var20, var11);
                    module0756.f47675(var1, var20);
                    var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER);
                    var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER);
                    if (var16.numGE(module0756.$g6076$.getDynamicValue(var12))) {
                        final SubLObject var21 = Sequences.cconcatenate((SubLObject)$ic5$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic6$, module0006.f203((SubLObject)$ic84$) });
                        module0578.f35476(var21, (SubLObject)ConsesLow.list(var16, var13));
                    }
                    module0055.f4021(var19, var15);
                    var18 = var18.rest();
                    var19 = var18.first();
                }
            }
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic85$, var14);
            }
        }
        return f47934(var1, var11);
    }
    
    public static SubLObject f47934(final SubLObject var1, final SubLObject var11) {
        if (NIL != module0756.f47780(var1, (SubLObject)$ic86$)) {
            f47935(var1, var11);
        }
        else if (NIL != module0756.f47780(var1, (SubLObject)$ic87$)) {
            f47936(var1, var11);
        }
        else if (NIL != module0756.f47780(var1, (SubLObject)$ic88$)) {
            f47937(var1, var11);
        }
        else if (NIL != module0756.f47780(var1, (SubLObject)$ic89$)) {
            f47938(var1, var11);
        }
        return module0756.f47482(var1);
    }
    
    public static SubLObject f47889(final SubLObject var1, final SubLObject var11) {
        f47916(var1, var11);
        if (NIL == module0756.f47479(var1)) {
            if (NIL != module0762.f48200(module0756.f47606(var1, (SubLObject)UNPROVIDED))) {
                module0764.f48507(var1, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0756.f47520(var1)) {
                module0751.f46741(var1);
                module0751.f46742(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var12 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
                if (NIL != module0206.f13497(var12)) {
                    module0765.f48568(var12, (SubLObject)UNPROVIDED);
                }
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic90$, var12, module0756.f47488(var1, (SubLObject)UNPROVIDED));
                }
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic91$, module0756.f47467(var1));
                }
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic92$, module0756.f47511(var1));
                }
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic93$, module0756.f47475(var1));
                }
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic94$, module0756.f47588(var1));
                }
                module0770.f49065(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic95$, var1);
            }
        }
        return module0756.f47467(var1);
    }
    
    public static SubLObject f47880(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != module0579.$g4249$.getDynamicValue(var2) && NIL == module0579.f35485() && NIL != module0756.f47497(var1, (SubLObject)UNPROVIDED) && NIL != module0756.f47520(var1)) {
            final SubLObject var4 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
            var3 = (SubLObject)makeBoolean(NIL != module0755.f47386(var4) && NIL == module0580.f35520(var4) && (NIL == module0201.f12546(var4) || NIL == module0754.f47336(var4)) && NIL != module0751.f47080(var4, (SubLObject)T) && NIL != module0755.f47458(var1) && (NIL == module0756.f47685(var1, module0751.f47118()) || $ic32$.eql(module0756.f47481(var1, (SubLObject)UNPROVIDED))) && NIL == module0764.f48499(var4) && NIL != f47939(module0756.f47481(var1, (SubLObject)UNPROVIDED)));
        }
        return var3;
    }
    
    public static SubLObject f47939(final SubLObject var139) {
        return (SubLObject)makeBoolean($ic96$ == var139 || NIL != module0751.f47119(var139) || $ic32$.eql(var139));
    }
    
    public static SubLObject f47881(final SubLObject var1) {
        if (NIL != module0756.f47497(var1, (SubLObject)UNPROVIDED)) {
            final SubLObject var2 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
            if (NIL == module0751.f47080(var2, (SubLObject)T)) {
                return (SubLObject)NIL;
            }
            if ($ic32$.eql(module0756.f47481(var1, (SubLObject)UNPROVIDED))) {
                return (SubLObject)NIL;
            }
            final SubLObject var3 = module0755.f47395(var2);
            final SubLObject var4 = f47940(var1);
            SubLObject var5 = var3;
            SubLObject var6 = (SubLObject)NIL;
            var6 = var5.first();
            while (NIL != var5) {
                if (!var1.eql(var6) && NIL != module0749.f46509(var6)) {
                    if ((NIL == module0756.f47497(var6, (SubLObject)UNPROVIDED) || !module0756.f47487(var6, (SubLObject)UNPROVIDED).equal(var2)) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)$ic97$, module0756.f47487(var6, (SubLObject)UNPROVIDED), var2);
                    }
                    if (NIL != f47941(var6, var4)) {
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic98$, var1, var6);
                        }
                        return (SubLObject)T;
                    }
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47942(final SubLObject var1, SubLObject var143) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        return module0749.f46418(var1, (SubLObject)$ic99$, var143);
    }
    
    public static SubLObject f47943(final SubLObject var1, final SubLObject var144) {
        return module0749.f46424(var1, (SubLObject)$ic99$, var144);
    }
    
    public static SubLObject f47898(final SubLObject var1, final SubLObject var42, SubLObject var98) {
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)NIL;
        }
        if (NIL == module0756.f47552(var1)) {
            f47944(var1, var42, var98);
            f47945(var1, var42, var98);
        }
        return module0756.f47487(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47944(final SubLObject var1, final SubLObject var42, final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
        final SubLObject var101 = (SubLObject)makeBoolean(!var100.equal(var42) && NIL != module0751.f46788(var100));
        SubLObject var102 = var100;
        if (NIL != var101) {
            var102 = module0751.f46672(var100, var42);
        }
        if (NIL != module0756.f47519(var1)) {
            f47946(var1, var42);
        }
        else if (NIL != module0756.f47547(var1)) {
            f47947(var1, var42);
        }
        if (NIL != module0751.f46819(var100) && NIL == f47948(var1)) {
            f47949(var1, var100, var102, var98);
        }
        else if (NIL != module0751.f46788(var100) && (NIL == module0579.$g4331$.getDynamicValue(var99) || NIL == module0751.f46788(var42))) {
            module0756.f47818(var1, var98);
        }
        else if (NIL != module0751.f46924(module0751.f46982((SubLObject)$ic71$, var98)) && NIL != module0756.f47476(var100) && NIL != f47918(var1)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic100$, var1, module0579.$g4333$.getDynamicValue(var99));
            }
            final SubLObject var103 = module0751.f46982((SubLObject)$ic71$, var98);
            final SubLObject var104 = module0579.$g4333$.getDynamicValue(var99);
            final SubLObject var105 = module0205.f13132(var104);
            module0756.f47469(var1, var103);
            module0756.f47465(var1, var105);
            module0756.f47468(var1, var105);
            final SubLObject var106 = module0751.f46693(var98, (SubLObject)$ic101$);
            module0756.f47464(var1, var106);
        }
        else if (NIL == module0756.f47478(var1)) {
            module0756.f47464(var1, module0751.f46691());
        }
        else if (NIL != module0751.f47199(module0756.f47511(var1))) {
            module0756.f47464(var1, var98);
        }
        if (NIL == f47948(var1) && NIL == module0756.f47476(var100)) {
            module0756.f47465(var1, var102);
        }
        module0756.f47724(var1);
        return Values.values(module0756.f47487(var1, (SubLObject)UNPROVIDED), module0756.f47467(var1), module0756.f47511(var1));
    }
    
    public static SubLObject f47946(final SubLObject var1, final SubLObject var42) {
        final SubLObject var43 = module0756.f47575(var1);
        final SubLObject var44 = module0751.f46672(var43, var42);
        if (!var43.equal(var44)) {
            module0756.f47576(var1, var44);
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic102$, module0756.f47575(var1));
            }
            if (NIL == module0751.f46788(var42) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic103$, module0756.f47575(var1), var42);
            }
        }
        return var44;
    }
    
    public static SubLObject f47947(final SubLObject var1, final SubLObject var42) {
        final SubLObject var43 = module0756.f47555(var1);
        final SubLObject var44 = module0751.f46672(var43, var42);
        if (!var43.equal(var44)) {
            module0756.f47557(var1, var44);
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic104$, var44);
            }
            if (NIL == module0751.f46788(var42) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic105$, var44, var42);
            }
        }
        return var44;
    }
    
    public static SubLObject f47949(final SubLObject var1, final SubLObject var145, final SubLObject var79, final SubLObject var98) {
        final SubLObject var146 = module0751.f46825(var145);
        final SubLObject var147 = module0751.f46982(var146, var98);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic106$, var145, var79);
        }
        module0756.f47469(var1, var147);
        module0756.f47465(var1, var79);
        module0756.f47468(var1, var79);
        final SubLObject var148 = module0751.f46693(var98, var145);
        module0756.f47464(var1, var148);
        return var148;
    }
    
    public static SubLObject f47948(final SubLObject var1) {
        final SubLObject var2 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != module0304.f20296(var2) && module0756.f47480(var1, (SubLObject)NIL).equal(module0751.f46728(var2)));
    }
    
    public static SubLObject f47918(final SubLObject var1) {
        final SubLObject var2 = module0756.f47480(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = (SubLObject)makeBoolean(NIL != f47950(var1) && NIL != module0751.f46829(module0756.f47711(var1)) && NIL != module0035.f1993(module0756.f47467(var1), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && (NIL != module0756.f47606(var1, (SubLObject)UNPROVIDED) || (NIL != module0581.f35686(var2) && NIL == module0751.f46718(var2))));
        return var3;
    }
    
    public static SubLObject f47945(final SubLObject var1, final SubLObject var42, final SubLObject var98) {
        SubLObject var100;
        final SubLObject var99 = var100 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0762.f48210(var100)) {
            final SubLObject var101 = module0756.f47481(var1, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0756.f47691(var1);
            SubLObject var103 = module0756.f47511(var1);
            if (NIL != var102) {
                var100 = (SubLObject)ConsesLow.list($ic107$, var102, var100);
                var103 = module0751.f46695((SubLObject)$ic108$, var103);
            }
            if (NIL != var101) {
                var100 = (SubLObject)ConsesLow.list($ic107$, var101, var100);
                var103 = module0751.f46695((SubLObject)$ic108$, var103);
            }
            final SubLObject var104 = module0756.f47463(var100, var103, (SubLObject)UNPROVIDED);
            if (NIL != module0756.f47497(var104, (SubLObject)UNPROVIDED)) {
                module0756.f47484(var104, var1, (SubLObject)UNPROVIDED);
            }
            if (var101.eql($ic32$) && NIL != module0751.f47119(module0756.f47481(var1, (SubLObject)UNPROVIDED))) {
                module0756.f47503(var1, var101, (SubLObject)UNPROVIDED);
            }
            else if (NIL != var101 && NIL == module0756.f47743(var101, module0756.f47481(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) {
                final SubLObject var105 = Sequences.cconcatenate((SubLObject)$ic5$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic6$, module0006.f203((SubLObject)$ic109$) });
                module0578.f35476(var105, (SubLObject)ConsesLow.list(var101, module0756.f47481(var1, (SubLObject)UNPROVIDED)));
            }
        }
        else {
            SubLObject var106 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var1).isVector()) {
                final SubLObject var107 = module0743.f45996(var1);
                final SubLObject var108 = (SubLObject)NIL;
                SubLObject var109;
                SubLObject var110;
                SubLObject var111;
                SubLObject var112;
                for (var109 = Sequences.length(var107), var110 = (SubLObject)NIL, var110 = (SubLObject)ZERO_INTEGER; var110.numL(var109); var110 = Numbers.add(var110, (SubLObject)ONE_INTEGER)) {
                    var111 = ((NIL != var108) ? Numbers.subtract(var109, var110, (SubLObject)ONE_INTEGER) : var110);
                    var112 = Vectors.aref(var107, var111);
                    f47898(var112, var42, var98);
                    var106 = Numbers.add(var106, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return Values.values((NIL != module0756.f47520(var1)) ? module0756.f47487(var1, (SubLObject)UNPROVIDED) : module0756.f47481(var1, (SubLObject)UNPROVIDED), module0756.f47511(var1));
    }
    
    public static SubLObject f47951(final SubLObject var1) {
        final SubLObject var2 = module0756.f47771();
        final SubLObject var3 = module0756.f47773();
        SubLObject var4 = (SubLObject)$ic110$;
        if (NIL != module0756.f47476(var2)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic111$, var1);
            }
            var4 = (SubLObject)$ic112$;
        }
        else {
            var4 = f47952(var1, var2, var3);
        }
        return var4;
    }
    
    public static SubLObject f47953(final SubLObject var1, final SubLObject var158, final SubLObject var159, final SubLObject var98) {
        f47954(var1, var158, var159, var98);
        return var1;
    }
    
    public static SubLObject f47954(final SubLObject var1, final SubLObject var158, final SubLObject var159, final SubLObject var98) {
        if (f47919(var1).equal(var158)) {
            final SubLObject var160 = f47920(var1);
            final SubLObject var161 = module0751.f46982(var160, var98);
            f47952(var1, var159, var161);
        }
        SubLObject var162 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var1).isVector()) {
            final SubLObject var163 = module0743.f45996(var1);
            final SubLObject var164 = (SubLObject)NIL;
            SubLObject var165;
            SubLObject var166;
            SubLObject var167;
            SubLObject var168;
            for (var165 = Sequences.length(var163), var166 = (SubLObject)NIL, var166 = (SubLObject)ZERO_INTEGER; var166.numL(var165); var166 = Numbers.add(var166, (SubLObject)ONE_INTEGER)) {
                var167 = ((NIL != var164) ? Numbers.subtract(var165, var166, (SubLObject)ONE_INTEGER) : var166);
                var168 = Vectors.aref(var163, var167);
                f47954(var168, var158, var159, var98);
                var162 = Numbers.add(var162, (SubLObject)ONE_INTEGER);
            }
        }
        return var1;
    }
    
    public static SubLObject f47952(final SubLObject var1, final SubLObject var99, final SubLObject var100) {
        final SubLObject var101 = (SubLObject)ConsesLow.cons(var99, var100);
        module0749.f46426(var1, (SubLObject)$ic113$, (SubLObject)ONE_INTEGER, var101);
        return var101;
    }
    
    public static SubLObject f47919(final SubLObject var1) {
        final SubLObject var2 = f47955(var1);
        return var2.isCons() ? var2.first() : module0756.f47746();
    }
    
    public static SubLObject f47955(final SubLObject var1) {
        return module0749.f46420(var1, (SubLObject)$ic113$, (SubLObject)ONE_INTEGER, (SubLObject)NIL);
    }
    
    public static SubLObject f47920(final SubLObject var1) {
        final SubLObject var2 = f47955(var1);
        return var2.isCons() ? var2.rest() : module0751.f46705();
    }
    
    public static SubLObject f47950(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == module0756.f47476(f47919(var1)));
    }
    
    public static SubLObject f47883(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var1).isVector()) {
            final SubLObject var5 = module0743.f45996(var1);
            final SubLObject var6 = (SubLObject)NIL;
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            SubLObject var10;
            SubLObject var11;
            for (var7 = Sequences.length(var5), var8 = (SubLObject)NIL, var8 = (SubLObject)ZERO_INTEGER; var8.numL(var7); var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER)) {
                var9 = ((NIL != var6) ? Numbers.subtract(var7, var8, (SubLObject)ONE_INTEGER) : var8);
                var10 = Vectors.aref(var5, var9);
                var11 = var4;
                if (var11.eql((SubLObject)ZERO_INTEGER)) {
                    var2 = module0756.f47487(var10, (SubLObject)UNPROVIDED);
                }
                else if (var11.eql((SubLObject)ONE_INTEGER)) {
                    var3 = module0756.f47487(var10, (SubLObject)UNPROVIDED);
                }
                var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
            }
        }
        final SubLObject var12 = f47956(var2, var3);
        module0756.f47501(var1, (SubLObject)ConsesLow.list(var12), (SubLObject)UNPROVIDED);
        module0756.f47608(var1);
        return module0756.f47467(var1);
    }
    
    public static SubLObject f47956(final SubLObject var161, final SubLObject var162) {
        final SubLThread var163 = SubLProcess.currentSubLThread();
        SubLObject var164 = (SubLObject)NIL;
        SubLObject var165 = (SubLObject)makeBoolean(NIL == module0202.f12674(var161) || NIL == module0202.f12674(var162) || NIL == module0035.f2004(module0202.f12751(var161), module0202.f12751(var162)));
        if (NIL == var165) {
            SubLObject var166 = (SubLObject)NIL;
            SubLObject var165_166 = (SubLObject)NIL;
            SubLObject var167 = (SubLObject)NIL;
            SubLObject var168_169 = (SubLObject)NIL;
            var166 = module0205.f13207(var161, (SubLObject)UNPROVIDED);
            var165_166 = var166.first();
            var167 = module0205.f13207(var162, (SubLObject)UNPROVIDED);
            var168_169 = var167.first();
            while (NIL == var165 && (NIL != var167 || NIL != var166)) {
                final SubLObject var168 = f47957(var165_166);
                if (var168.isString()) {
                    var164 = (SubLObject)ConsesLow.cons(module0749.f46446(var168, (SubLObject)NIL, var165_166, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var164);
                }
                else {
                    var165 = (SubLObject)T;
                }
                if (var168_169.isInteger() && var168_169.numG((SubLObject)ONE_INTEGER)) {
                    final SubLObject var169 = module0749.f46446(print_high.princ_to_string(var168_169), (SubLObject)NIL, var168_169, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (module0579.$g4259$.getDynamicValue(var163) == $ic114$) {
                        module0769.f49043(var169);
                    }
                    var164 = (SubLObject)ConsesLow.cons(var169, var164);
                }
                var166 = var166.rest();
                var165_166 = var166.first();
                var167 = var167.rest();
                var168_169 = var167.first();
            }
        }
        return (SubLObject)((NIL != var165) ? NIL : module0749.f46484(Sequences.nreverse(var164)));
    }
    
    public static SubLObject f47957(final SubLObject var165) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        return module0751.f46770((SubLObject)$ic115$, (SubLObject)ConsesLow.listS($ic116$, var165, (SubLObject)$ic117$), module0579.$g4260$.getDynamicValue(var166), (SubLObject)NIL, (SubLObject)ONE_INTEGER).first();
    }
    
    public static SubLObject f47885(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0749.f46418(var1, (SubLObject)$ic118$, (SubLObject)UNPROVIDED);
        final SubLObject var4 = f47958(var3);
        if (NIL != module0581.f35648(var4)) {
            module0756.f47723(var1, var4);
            module0756.f47783(var1, $ic119$, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0004.f104(var1, $g6088$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0767.f48924(var1);
        }
        else {
            final SubLObject var5 = $g6088$.currentBinding(var2);
            try {
                $g6088$.bind((SubLObject)ConsesLow.cons(var1, $g6088$.getDynamicValue(var2)), var2);
                module0756.f47503(var1, (SubLObject)$ic120$, (SubLObject)NIL);
                module0756.f47465(var1, var3);
                module0770.f49065(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                $g6088$.rebind(var5, var2);
            }
        }
        return module0756.f47467(var1);
    }
    
    public static SubLObject f47958(final SubLObject var172) {
        final SubLThread var173 = SubLProcess.currentSubLThread();
        if (NIL == module0212.f13762(var172)) {
            return module0770.f49050(var172, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var174 = module0751.f46770((SubLObject)$ic121$, (SubLObject)ConsesLow.listS($ic122$, var172, (SubLObject)$ic123$), module0579.$g4260$.getDynamicValue(var173), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
        if (!var174.isString()) {
            var174 = module0751.f46770((SubLObject)$ic121$, (SubLObject)ConsesLow.listS($ic124$, var172, (SubLObject)$ic123$), module0579.$g4260$.getDynamicValue(var173), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
        }
        if (!var174.isString()) {
            var174 = module0764.f48462(var172, $ic125$, module0579.$g4260$.getDynamicValue(var173));
        }
        if (var174.isString() && NIL != module0039.f3012(var174)) {
            return module0039.f3043(var174);
        }
        return module0581.f35652(var174);
    }
    
    public static SubLObject f47886(final SubLObject var17, final SubLObject var25) {
        if (var25.eql((SubLObject)$ic126$)) {
            f47959(var17);
            f47960(var17);
        }
        else if (var25.eql((SubLObject)$ic127$) || var25.eql((SubLObject)$ic128$)) {
            f47959(var17);
            f47961(var17);
        }
        return var17;
    }
    
    public static SubLObject f47962(final SubLObject var15, final SubLObject var25) {
        if (var25.eql((SubLObject)$ic126$) || var25.eql((SubLObject)$ic127$) || var25.eql((SubLObject)$ic128$)) {
            return module0751.f46730(var15);
        }
        return var15;
    }
    
    public static SubLObject f47963(final SubLObject var15, final SubLObject var25) {
        if (var25.eql((SubLObject)$ic126$)) {
            return f47964(var15, (SubLObject)$ic129$);
        }
        if (var25.eql((SubLObject)$ic127$) || var25.eql((SubLObject)$ic128$)) {
            return f47964(var15, (SubLObject)$ic130$);
        }
        return var15;
    }
    
    public static SubLObject f47965(final SubLObject var17, final SubLObject var25) {
        final SubLObject var26 = module0756.f47713(var17, (SubLObject)NIL);
        if (var25.eql((SubLObject)$ic126$)) {
            return (SubLObject)makeBoolean(NIL != f47966(var26) && NIL != f47967(var26));
        }
        if (var25.eql((SubLObject)$ic127$) || var25.eql((SubLObject)$ic128$)) {
            return (SubLObject)makeBoolean(NIL != f47966(var26) && NIL != f47968(var26));
        }
        if (var25.eql((SubLObject)$ic131$)) {
            return (SubLObject)makeBoolean(NIL == f47966(var26));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47969(final SubLObject var15, final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f47970(var15, var25) && NIL != f47971(var15, var25));
    }
    
    public static SubLObject f47970(final SubLObject var15, final SubLObject var25) {
        if (var25.eql((SubLObject)$ic126$)) {
            return f47966(var15);
        }
        if (var25.eql((SubLObject)$ic127$) || var25.eql((SubLObject)$ic128$)) {
            return f47966(var15);
        }
        if (var25.eql((SubLObject)$ic131$)) {
            return (SubLObject)makeBoolean(NIL == f47966(var15));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47971(final SubLObject var15, final SubLObject var25) {
        if (var25.eql((SubLObject)$ic126$)) {
            return f47967(var15);
        }
        if (var25.eql((SubLObject)$ic127$) || var25.eql((SubLObject)$ic128$)) {
            return f47968(var15);
        }
        if (var25.eql((SubLObject)$ic131$)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47959(final SubLObject var17) {
        if (NIL == var17) {
            return Values.values(var17, (SubLObject)NIL);
        }
        final SubLObject var18 = Sequences.find_if((SubLObject)$ic132$, var17, (SubLObject)$ic133$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var18) {
            return Values.values(var17, (SubLObject)NIL);
        }
        final SubLObject var19 = f47972(var18);
        final SubLObject var20 = Sequences.position(var18, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0035.f2044(var20, var19, var17);
        return Values.values(var17, (SubLObject)T);
    }
    
    public static SubLObject f47972(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (NIL != module0749.f46448(var109)) {
            final SubLObject var111 = module0749.f46459(var109);
            SubLObject var112 = (SubLObject)NIL;
            SubLObject var113 = (SubLObject)NIL;
            SubLObject var114 = (SubLObject)ZERO_INTEGER;
            SubLObject var115 = (SubLObject)NIL;
            if (NIL == var115) {
                SubLObject var116 = var111;
                SubLObject var117 = (SubLObject)NIL;
                var117 = var116.first();
                while (NIL == var115 && NIL != var116) {
                    var110.resetMultipleValues();
                    final SubLObject var118 = f47959(var117);
                    final SubLObject var119 = var110.secondMultipleValue();
                    var110.resetMultipleValues();
                    if (NIL != var119) {
                        var113 = var118;
                        var115 = var114;
                    }
                    var114 = Numbers.add(var114, (SubLObject)ONE_INTEGER);
                    var116 = var116.rest();
                    var117 = var116.first();
                }
            }
            if (NIL != var115) {
                var112 = module0035.f2151(var115, var113, var111);
                module0749.f46460(var109, var112);
            }
            return var109;
        }
        final SubLObject var120 = module0749.f46447(var109);
        final SubLObject var121 = module0581.f35658(module0749.f46455(var120));
        final SubLObject var122 = module0751.f46730(var121);
        module0749.f46457(var120, var122);
        return var120;
    }
    
    public static SubLObject f47966(final SubLObject var15) {
        if (NIL != Characters.upper_case_p(module0581.f35671(var15, (SubLObject)ZERO_INTEGER))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47967(final SubLObject var15) {
        return f47973(var15, (SubLObject)$ic129$);
    }
    
    public static SubLObject f47968(final SubLObject var15) {
        return f47973(var15, (SubLObject)$ic130$);
    }
    
    public static SubLObject f47973(final SubLObject var15, final SubLObject var185) {
        if (NIL != module0581.f35656(var15, var185, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47960(final SubLObject var17) {
        return f47974(var17, (SubLObject)$ic129$);
    }
    
    public static SubLObject f47961(final SubLObject var17) {
        return f47974(var17, (SubLObject)$ic130$);
    }
    
    public static SubLObject f47974(final SubLObject var17, final SubLObject var185) {
        final SubLObject var186 = f47975(var17);
        if (NIL != var186) {
            SubLObject var188;
            final SubLObject var187 = var188 = var186;
            SubLObject var189 = (SubLObject)NIL;
            SubLObject var190 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var188, var187, (SubLObject)$ic134$);
            var189 = var188.first();
            var188 = (var190 = var188.rest());
            final SubLObject var191 = module0749.f46455(var189);
            if (NIL != module0751.f46727(var191, var185)) {
                final SubLObject var192 = module0772.f49212(var185);
                ConsesLow.rplacd(var186, (SubLObject)ConsesLow.cons(var192, var190));
            }
        }
        return var17;
    }
    
    public static SubLObject f47964(final SubLObject var15, final SubLObject var185) {
        if (NIL != module0751.f46727(var15, var185)) {
            return module0581.f35665(var15, var185);
        }
        return var15;
    }
    
    public static SubLObject f47975(final SubLObject var17) {
        SubLObject var18 = (SubLObject)NIL;
        if (NIL == var18) {
            SubLObject var19;
            SubLObject var20;
            SubLObject var21;
            for (var19 = module0048.f_1X(Sequences.length(var17)), var20 = (SubLObject)NIL, var20 = (SubLObject)ONE_INTEGER; NIL == var18 && !var20.numGE(var19); var20 = module0048.f_1X(var20)) {
                var21 = conses_high.last(var17, var20);
                if (NIL != module0581.f35686(module0749.f46455(var21.first()))) {
                    var18 = var21;
                }
            }
        }
        return var18;
    }
    
    public static SubLObject f47884(final SubLObject var1, final SubLObject var193) {
        final SubLThread var194 = SubLProcess.currentSubLThread();
        final SubLObject var195 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
        if (var195.isNumber()) {
            module0756.f47465(var1, Numbers.multiply((SubLObject)$ic135$, var195));
            final SubLObject var196 = f47976(var195);
            final SubLObject var197 = module0035.remove_if_not((SubLObject)$ic136$, (SubLObject)ConsesLow.list(var196, module0579.$g4291$.getDynamicValue(var194)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var198 = module0579.$g4291$.currentBinding(var194);
            try {
                module0579.$g4291$.bind((SubLObject)((NIL != var197) ? module0048.f3382(var197, (SubLObject)UNPROVIDED) : NIL), var194);
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic137$, module0579.$g4291$.getDynamicValue(var194), module0756.f47487(var1, (SubLObject)UNPROVIDED));
                }
                module0767.f48915(var1);
            }
            finally {
                module0579.$g4291$.rebind(var198, var194);
            }
            final SubLObject var199 = module0756.f47467(var1);
            final SubLObject var200 = f47974(var199, (SubLObject)$ic138$);
            module0756.f47501(var1, var200, (SubLObject)UNPROVIDED);
            module0756.f47608(var1);
        }
        else {
            module0756.f47525(var1);
            f47878(var1, var193, module0756.f47678(var1));
        }
        return module0756.f47467(var1);
    }
    
    public static SubLObject f47976(final SubLObject var198) {
        final SubLObject var199 = print_high.princ_to_string(var198);
        final SubLObject var200 = Sequences.remove((SubLObject)Characters.CHAR_period, var199, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var201 = Strings.string_left_trim((SubLObject)$ic139$, var200);
        final SubLObject var202 = Sequences.position_if((SubLObject)$ic140$, var201, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var203 = (NIL != var202) ? var202 : Sequences.length(var201);
        return (SubLObject)((NIL != module0004.f105(var203)) ? var203 : NIL);
    }
    
    public static SubLObject f47882(final SubLObject var1, final SubLObject var193) {
        final SubLThread var194 = SubLProcess.currentSubLThread();
        SubLObject var195 = (SubLObject)NIL;
        if (NIL != f47977(var1) && NIL != module0756.f47497(module0756.f47633(var1), (SubLObject)UNPROVIDED) && NIL != module0756.f47497(module0756.f47633(module0756.f47633(var1)), (SubLObject)UNPROVIDED)) {
            final SubLObject var196 = f47978(var1, var193);
            if (NIL == var196) {
                var195 = (SubLObject)T;
            }
        }
        if (NIL == var195) {
            final SubLObject var197 = $g6089$.currentBinding(var194);
            try {
                $g6089$.bind(module0048.f_1X($g6089$.getDynamicValue(var194)), var194);
                if ($g6089$.getDynamicValue(var194).numG($g6090$.getDynamicValue(var194))) {
                    final SubLObject var198 = Sequences.cconcatenate((SubLObject)$ic5$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic6$, module0006.f203((SubLObject)$ic141$) });
                    module0578.f35476(var198, (SubLObject)ConsesLow.list($g6090$.getDynamicValue(var194)));
                }
                else {
                    f47979(var1, var193);
                }
            }
            finally {
                $g6089$.rebind(var197, var194);
            }
        }
        return module0756.f47467(var1);
    }
    
    public static SubLObject f47979(final SubLObject var1, final SubLObject var193) {
        final SubLObject var194 = f47892(var1, var193);
        if (var194 == $ic31$) {
            SubLObject var196;
            final SubLObject var195 = var196 = module0756.f47481(var1, (SubLObject)NIL).rest();
            SubLObject var197 = (SubLObject)NIL;
            SubLObject var198 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)$ic142$);
            var197 = var196.first();
            var196 = var196.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)$ic142$);
            var198 = var196.first();
            var196 = var196.rest();
            if (NIL == var196) {
                if (var197.eql((SubLObject)$ic143$) && NIL != f47980(module0756.f47679(var1))) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic144$);
                    }
                    var197 = (SubLObject)$ic145$;
                }
                final SubLObject var199 = (SubLObject)((NIL != module0756.f47476(var193)) ? NIL : f47981(var1, var193));
                final SubLObject var200 = module0756.f47760(var1);
                final SubLObject var201 = module0765.f48524(var200, var197, var199, var198);
                module0756.f47501(var1, var201, (SubLObject)UNPROVIDED);
                module0756.f47608(var1);
                module0756.f47503(var1, module0756.f47481(module0756.f47590(var1, (SubLObject)ZERO_INTEGER), (SubLObject)UNPROVIDED), (SubLObject)NIL);
                module0756.f47508(var1, module0749.f46388(module0756.f47482(module0756.f47590(var1, (SubLObject)ZERO_INTEGER)), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                if ($ic143$ == var197 && NIL != module0751.f46640(module0751.f47113(module0756.f47481(module0756.f47590(var1, (SubLObject)ZERO_INTEGER), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), $ic146$, (SubLObject)UNPROVIDED)) {
                    final SubLObject var202 = module0756.f47588(var1).numG((SubLObject)ONE_INTEGER) ? $ic147$ : $ic148$;
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic149$, module0756.f47480(var1, (SubLObject)NIL), var202);
                    }
                    module0756.f47783(var1, var202, (SubLObject)UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var195, (SubLObject)$ic142$);
            }
        }
        return var1;
    }
    
    public static SubLObject f47980(final SubLObject var1) {
        return f47982(f47914(var1, module0756.f47678(var1)));
    }
    
    public static SubLObject f47982(final SubLObject var77) {
        return (SubLObject)makeBoolean(NIL != module0756.f47497(var77, (SubLObject)NIL) && NIL != module0756.f47591(var77) && TWO_INTEGER.eql(module0756.f47588(var77)) && (NIL != f47983(module0756.f47590(var77, (SubLObject)ZERO_INTEGER)) || NIL != f47984(module0756.f47590(var77, (SubLObject)ZERO_INTEGER))) && $ic150$.eql(f47985(module0756.f47590(var77, (SubLObject)ZERO_INTEGER), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f47981(final SubLObject var1, final SubLObject var193) {
        final SubLObject var194 = module0205.f13132(var193);
        final SubLObject var195 = module0756.f47511(var1);
        final SubLObject var196 = module0751.f46982((SubLObject)$ic71$, var195);
        final SubLObject var197 = module0749.f46446(module0038.$g916$.getGlobalValue(), var196, var194, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0756.f47719(var197, var194);
        return var197;
    }
    
    public static SubLObject f47977(final SubLObject var1) {
        return module0751.f47126(module0756.f47481(var1, (SubLObject)T));
    }
    
    public static SubLObject f47978(final SubLObject var1, final SubLObject var193) {
        final SubLObject var194 = module0756.f47633(var1);
        final SubLObject var195 = (NIL != module0756.f47591(var194)) ? var194 : module0756.f47633(var194);
        SubLObject var196 = (SubLObject)makeBoolean(NIL == module0756.f47591(var195));
        final SubLObject var197 = (SubLObject)((NIL != var196) ? NIL : module0756.f47590(var195, (SubLObject)ZERO_INTEGER));
        if (NIL == var196 && TWO_INTEGER.eql(module0756.f47588(var195)) && NIL != module0751.f46640(module0751.f47113(module0756.f47481(var197, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), $ic151$, (SubLObject)UNPROVIDED)) {
            module0756.f47543(var195, var1);
            module0756.f47533(var195, (SubLObject)ZERO_INTEGER);
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic152$);
            }
            final SubLObject var198 = f47894(var1, var193);
            if (NIL != var198) {
                SubLObject var199 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var1).isVector()) {
                    final SubLObject var200 = module0743.f45996(var1);
                    final SubLObject var201 = (SubLObject)NIL;
                    SubLObject var202;
                    SubLObject var203;
                    SubLObject var204;
                    SubLObject var205;
                    SubLObject var206;
                    SubLObject var207;
                    SubLObject var208;
                    for (var202 = Sequences.length(var200), var203 = (SubLObject)NIL, var203 = (SubLObject)ZERO_INTEGER; var203.numL(var202); var203 = Numbers.add(var203, (SubLObject)ONE_INTEGER)) {
                        var204 = ((NIL != var201) ? Numbers.subtract(var202, var203, (SubLObject)ONE_INTEGER) : var203);
                        var205 = Vectors.aref(var200, var204);
                        var206 = module0756.f47484(var205, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        var207 = module0756.f47484(var197, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        var208 = module0756.f47484(var205, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0756.f47798(var207, var208);
                        module0756.f47532(var206);
                        module0756.f47507(var206, (SubLObject)ConsesLow.list(var207, var208), (SubLObject)UNPROVIDED);
                        module0756.f47830(var1, var199, var206);
                        var199 = Numbers.add(var199, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            else {
                var196 = (SubLObject)T;
            }
        }
        return (SubLObject)makeBoolean(NIL == var196);
    }
    
    public static SubLObject f47935(final SubLObject var219, final SubLObject var11) {
        final SubLObject var220 = module0756.f47781(var219, (SubLObject)$ic86$);
        final SubLObject var221 = module0751.f47087(var220);
        SubLObject var222 = (SubLObject)((NIL != var221) ? NIL : var220);
        if (NIL != var221) {
            final SubLObject var223 = Sequences.cconcatenate((SubLObject)$ic5$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic6$, module0006.f203((SubLObject)$ic153$) });
            module0578.f35476(var223, (SubLObject)ConsesLow.list(var220));
            var222 = module0756.f47590(var11, module0751.f47088(var220));
        }
        if (NIL == module0756.f47479(var222)) {
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic154$);
            }
            return var219;
        }
        final SubLObject var224 = (SubLObject)((NIL != module0756.f47680(var219, var11)) ? module0756.f47779(var11) : $ic155$);
        final SubLObject var225 = module0751.f47099(var224, module0756.f47779(var219), (SubLObject)UNPROVIDED);
        final SubLObject var226 = module0751.f47099(var225, module0731.f44659($ic156$), (SubLObject)UNPROVIDED);
        SubLObject var227 = (SubLObject)NIL;
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic157$, var226);
        }
        if (!var226.equal(var225) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic158$, var225);
        }
        var227 = f47986(var222, var226);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic159$, var227);
        }
        module0756.f47784(var219, var227, (SubLObject)UNPROVIDED);
        return module0756.f47488(var219, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47987() {
        final SubLObject var227 = f47988(module0751.$g5993$.getGlobalValue(), (SubLObject)UNPROVIDED);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic160$, var227);
        }
        return var227;
    }
    
    public static SubLObject f47937(final SubLObject var1, final SubLObject var11) {
        final SubLObject var12 = f47914(var1, var11);
        SubLObject var13 = module0756.f47691(var12);
        if (NIL != module0751.f46684(module0756.f47487(var12, (SubLObject)UNPROVIDED), $ic161$, (SubLObject)UNPROVIDED)) {
            var13 = $ic148$;
        }
        if (NIL != module0751.f46661((SubLObject)UNPROVIDED) && NIL != module0751.f47030(module0756.f47691(var1)) && NIL != module0751.f46658(module0756.f47691(var1), $ic162$, (SubLObject)UNPROVIDED)) {
            if (NIL == module0751.f46640(module0756.f47481(var1, (SubLObject)UNPROVIDED), $ic163$, (SubLObject)UNPROVIDED) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic164$, module0756.f47691(var1), module0756.f47481(var1, (SubLObject)UNPROVIDED), var1);
            }
            module0756.f47783(var1, module0756.f47691(var1), (SubLObject)UNPROVIDED);
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic165$, module0756.f47691(var1));
            }
        }
        else if (NIL != module0751.f46658(module0756.f47691(var1), $ic166$, (SubLObject)UNPROVIDED)) {
            module0756.f47783(var1, module0756.f47691(var1), (SubLObject)UNPROVIDED);
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic167$, module0756.f47691(var1));
            }
        }
        else if (NIL != var13) {
            module0756.f47783(var1, module0751.f47031(var13, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic168$, module0756.f47691(var1));
            }
        }
        else {
            module0756.f47783(var1, module0751.$g5993$.getGlobalValue(), (SubLObject)UNPROVIDED);
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic169$, module0751.$g5993$.getGlobalValue());
            }
        }
        return var1;
    }
    
    public static SubLObject f47938(final SubLObject var1, final SubLObject var11) {
        SubLObject var12 = (SubLObject)$ic155$;
        final SubLObject var13 = module0756.f47488(var11.eql((SubLObject)$ic64$) ? module0756.f47633(var1) : var11, (SubLObject)UNPROVIDED);
        if (NIL != module0751.f47038(var13)) {
            SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL != module0751.f46658(var15, $ic170$, (SubLObject)UNPROVIDED)) {
                    var12 = module0751.f47099(var12, (SubLObject)ConsesLow.list(var15), (SubLObject)UNPROVIDED);
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        if (NIL != module0751.f47038(var12)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic171$, var12);
            }
            module0756.f47784(var1, module0751.f47099(var12, module0756.f47488(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        return var1;
    }
    
    public static SubLObject f47989(final SubLObject var1, final SubLObject var11) {
        final SubLObject var12 = f47914(var1, var11);
        final SubLObject var13 = module0756.f47487(var12, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0756.f47480(var12, (SubLObject)UNPROVIDED);
        if (NIL != module0206.f13438(var13) && NIL != f47915(var14, var13)) {
            module0756.f47723(var1, (SubLObject)$ic55$);
        }
        else {
            module0756.f47608(var1);
        }
        return var1;
    }
    
    public static SubLObject f47915(final SubLObject var15, final SubLObject var10) {
        return (SubLObject)makeBoolean(var15.equal(PrintLow.format((SubLObject)NIL, (SubLObject)$ic172$, var10)) || var15.equal(module0579.$g4315$.getGlobalValue()));
    }
    
    public static SubLObject f47914(final SubLObject var1, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        if (NIL != module0756.f47519(var1)) {
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            SubLObject var14 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var1).isVector()) {
                final SubLObject var15 = module0743.f45996(var1);
                final SubLObject var16 = (SubLObject)NIL;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                for (var17 = Sequences.length(var15), var18 = (SubLObject)NIL, var18 = (SubLObject)ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER)) {
                    var19 = ((NIL != var16) ? Numbers.subtract(var17, var18, (SubLObject)ONE_INTEGER) : var18);
                    var20 = Vectors.aref(var15, var19);
                    if (NIL == var13) {
                        var13 = f47914(var20, var11);
                    }
                    else if (!var13.equal(f47914(var20, var11))) {
                        var12 = (SubLObject)T;
                    }
                    var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER);
                }
            }
            return (SubLObject)((NIL != var12) ? NIL : var13);
        }
        if (NIL != module0756.f47497(var11, (SubLObject)NIL)) {
            SubLObject var21 = f47990(var1);
            if (NIL != module0751.f47087(var21)) {
                final SubLObject var22 = module0751.f47088(var21);
                var21 = module0756.f47590(var11, var22);
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic173$, var22, var21);
                }
            }
            return var21;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47990(final SubLObject var1) {
        final SubLObject var2 = module0756.f47482(var1);
        final SubLObject var3 = module0749.f46376(var2);
        final SubLObject var4 = (SubLObject)((NIL != var3) ? module0751.f47173(var3) : NIL);
        return var4;
    }
    
    public static SubLObject f47936(final SubLObject var1, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = f47914(var1, var11);
        final SubLObject var14 = Equality.eq(module0751.f47113(module0756.f47481(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), $ic151$);
        final SubLObject var15 = (NIL != var14) ? var1 : var13;
        final SubLObject var16 = (NIL != var14) ? var13 : var1;
        final SubLObject var17 = (SubLObject)((NIL != var14 && NIL != module0756.f47479(var16)) ? module0756.f47691(var16) : NIL);
        final SubLObject var18 = (SubLObject)((NIL == var14 && NIL != module0756.f47479(var15)) ? module0756.f47691(var15) : NIL);
        final SubLObject var19 = module0756.f47606(var15, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0584.$g4396$.currentBinding(var12);
        try {
            module0584.$g4396$.bind(module0579.$g4260$.getDynamicValue(var12), var12);
            final SubLObject var21 = (NIL != module0756.f47497(var11, (SubLObject)UNPROVIDED)) ? module0756.f47487(var11, (SubLObject)UNPROVIDED) : module0756.f47746();
            final SubLObject var22 = f47985(var15, var21);
            if (NIL != var14 && module0756.f47487(var15, (SubLObject)UNPROVIDED).eql($ic174$)) {
                module0756.f47723(var15, module0038.$g916$.getGlobalValue());
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic175$);
                }
            }
            else if (NIL != var14 && NIL != module0756.f47479(var16) && NIL != module0756.f47605(var15) && NIL != module0751.f46661((SubLObject)UNPROVIDED)) {
                f47991(var15, var16);
            }
            else if (NIL != var14 && NIL != module0756.f47479(var16) && NIL != module0754.f47343(module0038.f2738(module0581.f35680(module0756.f47480(var16, (SubLObject)NIL)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first(), $ic176$, (SubLObject)$ic177$, (SubLObject)UNPROVIDED)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic178$);
                }
                module0756.f47723(var15, module0038.$g916$.getGlobalValue());
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic179$);
                }
            }
            else if (NIL != var14 && NIL != module0756.f47611(var1, (SubLObject)UNPROVIDED)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic180$);
                }
                module0756.f47783(var16, $ic147$, (SubLObject)UNPROVIDED);
            }
            else if (NIL != var14 && NIL != var17) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic181$, var17);
                }
                module0756.f47783(var15, var17, (SubLObject)UNPROVIDED);
            }
            else if (NIL == var14 && NIL != module0731.f44867(var19)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic182$, var18);
                }
                module0756.f47783(var16, module0731.f44867(var19), (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0205.f13145((SubLObject)$ic183$, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic184$);
                }
                module0756.f47783(var1, $ic185$, (SubLObject)UNPROVIDED);
                if (NIL == module0756.f47479(var13)) {
                    module0756.f47783(var13, module0751.f46682(var22), (SubLObject)UNPROVIDED);
                }
            }
            else if (NIL != module0751.f46683(var22)) {
                final SubLObject var23 = module0751.f46682(var22);
                if (NIL != var23) {
                    final SubLObject var24 = module0751.f47099((SubLObject)ConsesLow.list(var23), module0756.f47488(var16, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic186$, var24);
                    }
                    module0756.f47784(var1, var24, (SubLObject)UNPROVIDED);
                    if (NIL == module0756.f47479(var13)) {
                        module0756.f47784(var13, var24, (SubLObject)UNPROVIDED);
                    }
                }
            }
            else if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic187$, var1, var22);
            }
        }
        finally {
            module0584.$g4396$.rebind(var20, var12);
        }
        return var1;
    }
    
    public static SubLObject f47985(final SubLObject var1, SubLObject var241) {
        if (var241 == UNPROVIDED) {
            var241 = (SubLObject)NIL;
        }
        SubLObject var242 = module0756.f47736(var1);
        if (NIL != module0202.f12590(var241)) {
            while (NIL != module0756.f47519(var242)) {
                f47879(var242, var241, module0756.f47633(var242));
                var242 = module0756.f47736(var242);
            }
        }
        return module0756.f47487(var242, var241);
    }
    
    public static SubLObject f47941(final SubLObject var246, final SubLObject var247) {
        if (NIL != module0004.f104(var246, module0756.f47515(var247), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL == module0756.f47497(var247, (SubLObject)UNPROVIDED)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic188$, var246, var247);
            }
            return (SubLObject)NIL;
        }
        SubLObject var248 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var247).isVector()) {
            final SubLObject var249 = module0743.f45996(var247);
            final SubLObject var250 = (SubLObject)NIL;
            SubLObject var251;
            SubLObject var252;
            SubLObject var253;
            SubLObject var254;
            for (var251 = Sequences.length(var249), var252 = (SubLObject)NIL, var252 = (SubLObject)ZERO_INTEGER; var252.numL(var251); var252 = Numbers.add(var252, (SubLObject)ONE_INTEGER)) {
                var253 = ((NIL != var250) ? Numbers.subtract(var251, var252, (SubLObject)ONE_INTEGER) : var252);
                var254 = Vectors.aref(var249, var253);
                if (NIL != module0756.f47478(var254)) {
                    return f47941(var246, var254);
                }
                var248 = Numbers.add(var248, (SubLObject)ONE_INTEGER);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47992(final SubLObject var1) {
        final SubLObject var2 = module0756.f47633(var1);
        final SubLObject var3 = (SubLObject)((NIL != var2) ? module0756.f47649(var2) : NIL);
        if (NIL == var2) {
            return (SubLObject)NIL;
        }
        if (NIL == var3) {
            return f47992(var2);
        }
        return var3;
    }
    
    public static SubLObject f47940(final SubLObject var1) {
        final SubLObject var2 = module0756.f47633(var1);
        final SubLObject var3 = (SubLObject)((NIL != var2) ? module0756.f47649(var2) : NIL);
        if (NIL == var2) {
            return var1;
        }
        if (NIL != module0756.f47652(var2)) {
            return var2;
        }
        if (NIL == var3) {
            return f47940(var2);
        }
        if (NIL == module0755.f47391(module0756.f47487(var3, (SubLObject)UNPROVIDED))) {
            return f47940(var2);
        }
        return var2;
    }
    
    public static SubLObject f47993(final SubLObject var1, SubLObject var250, SubLObject var251, SubLObject var252) {
        if (var250 == UNPROVIDED) {
            var250 = (SubLObject)T;
        }
        if (var251 == UNPROVIDED) {
            var251 = (SubLObject)NIL;
        }
        if (var252 == UNPROVIDED) {
            var252 = (SubLObject)T;
        }
        final SubLObject var253 = module0756.f47633(var1);
        return (SubLObject)((NIL != var253) ? f47994(var1, var253, var1, var250, var251, var252) : NIL);
    }
    
    public static SubLObject f47994(final SubLObject var1, final SubLObject var254, final SubLObject var255, final SubLObject var250, final SubLObject var251, final SubLObject var256) {
        if (NIL == module0756.f47497(var254, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var257 = module0756.f47649(var254);
        SubLObject var258 = (SubLObject)NIL;
        SubLObject var259 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var254).isVector()) {
            final SubLObject var260 = module0743.f45996(var254);
            final SubLObject var261 = (SubLObject)NIL;
            SubLObject var262;
            SubLObject var263;
            SubLObject var264;
            SubLObject var265;
            for (var262 = Sequences.length(var260), var263 = (SubLObject)NIL, var263 = (SubLObject)ZERO_INTEGER; var263.numL(var262); var263 = Numbers.add(var263, (SubLObject)ONE_INTEGER)) {
                var264 = ((NIL != var261) ? Numbers.subtract(var262, var263, (SubLObject)ONE_INTEGER) : var263);
                var265 = Vectors.aref(var260, var264);
                if (!var265.eql(var255)) {
                    if (var265.eql(var257)) {
                        if (NIL != var250) {
                            var258 = (SubLObject)ConsesLow.cons(var265, var258);
                        }
                    }
                    else if (NIL != module0756.f47591(var265) && NIL != var251) {
                        var258 = (SubLObject)ConsesLow.cons(var265, var258);
                    }
                }
                var259 = Numbers.add(var259, (SubLObject)ONE_INTEGER);
            }
        }
        if (NIL != var257 && NIL != var256) {
            return var258;
        }
        final SubLObject var266 = module0756.f47633(var254);
        final SubLObject var267 = (SubLObject)((NIL != var266) ? f47994(var1, var266, var254, var250, var251, var256) : NIL);
        if (NIL != var258 && NIL != var267) {
            return module0035.f2119((SubLObject)ConsesLow.list(var258, var267));
        }
        return (NIL != var267) ? var267 : var258;
    }
    
    public static SubLObject f47995(final SubLObject var1) {
        return f47993(var1, (SubLObject)T, (SubLObject)T, (SubLObject)NIL);
    }
    
    public static SubLObject f47996(final SubLObject var1) {
        return f47993(var1, (SubLObject)T, (SubLObject)T, (SubLObject)T);
    }
    
    public static SubLObject f47991(final SubLObject var236, final SubLObject var237) {
        final SubLObject var238 = module0756.f47691(var237);
        final SubLObject var239 = module0756.f47480(var237, (SubLObject)UNPROVIDED);
        final SubLObject var240 = module0581.f35655(var239, (SubLObject)$ic189$, (SubLObject)UNPROVIDED);
        final SubLObject var241 = (SubLObject)((NIL != var238) ? f47997(var238) : NIL);
        if (NIL != f47998(var236, var237)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic190$, var237);
            }
        }
        else if (module0756.f47691(var236).eql(module0751.$g5993$.getGlobalValue())) {
            module0756.f47723(var236, module0038.$g916$.getGlobalValue());
        }
        else if (NIL != var240) {
            module0756.f47723(var236, module0038.$g916$.getGlobalValue());
        }
        else if (NIL != var241) {
            module0756.f47723(var236, f47999(var239));
        }
        else if (NIL != module0035.f2002(var239, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0581.f35655(var239, constant_reader_oc.f8495(), (SubLObject)UNPROVIDED) && (NIL == module0269.f17710(module0756.f47487(var237, (SubLObject)UNPROVIDED)) || NIL == module0751.f46684(module0756.f47487(var237, (SubLObject)UNPROVIDED), $ic191$, (SubLObject)UNPROVIDED))) {
            module0756.f47723(var236, f47999(module0581.f35679(var239, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)));
        }
        else {
            module0756.f47723(var236, module0038.$g916$.getGlobalValue());
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic192$, module0756.f47480(var236, (SubLObject)NIL), module0756.f47480(var237, (SubLObject)NIL));
        }
        return module0756.f47467(var236);
    }
    
    public static SubLObject f47998(final SubLObject var236, final SubLObject var237) {
        final SubLObject var238 = (NIL != module0756.f47478(var237)) ? module0756.f47648(var237) : var237;
        SubLObject var239 = (SubLObject)NIL;
        if (NIL != module0756.f47497(var238, (SubLObject)UNPROVIDED) && NIL != module0756.f47479(var237) && NIL != module0756.f47809(var237, (SubLObject)$ic194$) && (NIL == module0756.f47497(module0756.f47633(var237), (SubLObject)UNPROVIDED) || NIL == f48000(module0756.f47633(var237)))) {
            final SubLObject var240 = module0756.f47487(var238, (SubLObject)UNPROVIDED);
            SubLObject var241;
            SubLObject var242;
            SubLObject var244;
            SubLObject var243;
            SubLObject var245;
            SubLObject var246;
            for (var241 = (SubLObject)NIL, var241 = $g6091$.getGlobalValue(); NIL == var239 && NIL != var241; var241 = var241.rest()) {
                var242 = var241.first();
                var243 = (var244 = var242);
                var245 = (SubLObject)NIL;
                var246 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var244, var243, (SubLObject)$ic195$);
                var245 = var244.first();
                var244 = (var246 = var244.rest());
                if (var240.eql(var245)) {
                    module0756.f47723(var236, module0038.$g916$.getGlobalValue());
                    module0756.f47723(var238, var246);
                    module0756.f47784(var238, (SubLObject)$ic194$, (SubLObject)UNPROVIDED);
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic196$, module0756.f47480(var237, (SubLObject)NIL), module0756.f47467(var237));
                    }
                    if (!var237.eql(var238)) {
                        f47893(var237);
                    }
                    var239 = (SubLObject)T;
                }
            }
        }
        return var239;
    }
    
    public static SubLObject f48000(final SubLObject var272) {
        final SubLObject var273 = (SubLObject)((NIL != module0756.f47591(var272)) ? module0756.f47633(var272) : NIL);
        SubLObject var274 = (SubLObject)NIL;
        if (NIL != module0756.f47497(var273, (SubLObject)UNPROVIDED) && var272.eql(module0756.f47590(var273, (SubLObject)TWO_INTEGER)) && NIL != module0756.f47732(module0756.f47590(var273, (SubLObject)ONE_INTEGER))) {
            var274 = (SubLObject)T;
        }
        return var274;
    }
    
    public static SubLObject f48001(final SubLObject var274, SubLObject var275) {
        if (var275 == UNPROVIDED) {
            var275 = module0579.$g4260$.getDynamicValue();
        }
        return module0751.f46658(var274, $ic197$, var275);
    }
    
    public static SubLObject f47997(final SubLObject var274) {
        return module0751.f46658(var274, $ic148$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48002(final SubLObject var274) {
        return module0751.f46658(var274, $ic185$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47999(final SubLObject var37) {
        return module0751.f46638((SubLObject)$ic198$, var37, $ic148$);
    }
    
    public static SubLObject f48003(final SubLObject var276) {
        if (NIL == var276 || var276 == $ic155$) {
            return module0751.f47043();
        }
        return module0751.f47099(module0751.f47043(), var276, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48004(final SubLObject var276) {
        if (NIL == var276 || var276 == $ic155$) {
            return module0751.f47040();
        }
        final SubLObject var277 = module0751.f47137(var276);
        SubLObject var278 = module0751.f47137((SubLObject)ConsesLow.list(var277, module0751.f47040()));
        if (NIL == var278) {
            var278 = module0751.f47137((SubLObject)ConsesLow.list(var277, module0751.f47041()));
        }
        if (NIL == var278) {
            var278 = module0751.f47137((SubLObject)ConsesLow.list(var277, module0751.f47042()));
        }
        return (NIL != var278) ? var278 : var277;
    }
    
    public static SubLObject f48005(final SubLObject var278) {
        final SubLThread var279 = SubLProcess.currentSubLThread();
        final SubLObject var280 = f48006(var278, (SubLObject)UNPROVIDED);
        SubLObject var281 = (SubLObject)NIL;
        final SubLObject var282 = module0147.f9540(module0579.$g4260$.getDynamicValue(var279));
        final SubLObject var283 = module0147.$g2095$.currentBinding(var279);
        final SubLObject var284 = module0147.$g2094$.currentBinding(var279);
        final SubLObject var285 = module0147.$g2096$.currentBinding(var279);
        try {
            module0147.$g2095$.bind(module0147.f9545(var282), var279);
            module0147.$g2094$.bind(module0147.f9546(var282), var279);
            module0147.$g2096$.bind(module0147.f9549(var282), var279);
            final SubLObject var286 = module0260.f17086(var280, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var281 = ((NIL != var286) ? var286.first() : var280.first());
        }
        finally {
            module0147.$g2096$.rebind(var285, var279);
            module0147.$g2094$.rebind(var284, var279);
            module0147.$g2095$.rebind(var283, var279);
        }
        return var281;
    }
    
    public static SubLObject f47986(final SubLObject var222, SubLObject var282) {
        if (var282 == UNPROVIDED) {
            var282 = (SubLObject)NIL;
        }
        var282 = f48007(var282);
        final SubLObject var283 = module0749.f46418(var222, (SubLObject)$ic199$, (SubLObject)UNPROVIDED);
        if (NIL != module0764.f48477(var283)) {
            return f48008(var222, var282);
        }
        return f48009(var222, var282);
    }
    
    public static SubLObject f48010(final SubLObject var222, SubLObject var282) {
        if (var282 == UNPROVIDED) {
            var282 = (SubLObject)NIL;
        }
        var282 = f48007(var282);
        if (NIL != module0751.f46640(module0756.f47481(var222, (SubLObject)UNPROVIDED), $ic200$, (SubLObject)UNPROVIDED)) {
            return f48011(var222, var282);
        }
        return f48012(var222, var282);
    }
    
    public static SubLObject f48007(final SubLObject var282) {
        SubLObject var283 = f48013(var282);
        if (NIL == module0579.f35488() && (!var283.isList() || NIL != f48014((SubLObject)ConsesLow.list(var283.first())))) {
            var283 = f48015(var283);
        }
        return var283;
    }
    
    public static SubLObject f48014(final SubLObject var283) {
        return module0035.sublisp_boolean(f48015(var283));
    }
    
    public static SubLObject f48015(final SubLObject var283) {
        return module0751.f47099(var283, (SubLObject)ConsesLow.list(module0751.f47040()), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48013(final SubLObject var282) {
        final SubLObject var283 = Sequences.remove($ic201$, var282, (SubLObject)$ic202$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != var283) ? var283 : $ic155$);
    }
    
    public static SubLObject f48009(final SubLObject var222, final SubLObject var282) {
        if (NIL != module0751.f46684(module0756.f47487(var222, (SubLObject)UNPROVIDED), $ic161$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list($ic203$);
        }
        SubLObject var283 = (SubLObject)NIL;
        final SubLObject var284 = module0756.f47488(var222, (SubLObject)UNPROVIDED);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic204$, var284);
        }
        var283 = f48006(var284, var282);
        return (SubLObject)((NIL != var283) ? var283 : ConsesLow.list(f47987()));
    }
    
    public static SubLObject f48012(final SubLObject var222, final SubLObject var282) {
        SubLObject var283 = (SubLObject)NIL;
        final SubLObject var284 = module0756.f47691(var222);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic204$, var284);
        }
        var283 = f47988(var284, var282);
        return (NIL != var283) ? var283 : f47987();
    }
    
    public static SubLObject f48008(final SubLObject var222, final SubLObject var282) {
        final SubLObject var283 = module0756.f47487(var222, (SubLObject)UNPROVIDED);
        if (NIL == module0751.f46661((SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0755.f47386(var283) && module0755.f47390(var283).eql($ic205$)) {
            final SubLObject var284 = module0751.f47099(var282, (SubLObject)ConsesLow.list($ic206$), (SubLObject)UNPROVIDED);
            return (SubLObject)((NIL != var284) ? var284 : ConsesLow.list($ic207$));
        }
        if (NIL != module0755.f47386(var283) && module0755.f47390(var283).eql($ic208$)) {
            final SubLObject var284 = module0751.f47099(var282, (SubLObject)ConsesLow.list($ic209$), (SubLObject)UNPROVIDED);
            return (SubLObject)((NIL != var284) ? var284 : ConsesLow.list($ic210$));
        }
        return f48009(var222, var282);
    }
    
    public static SubLObject f48011(final SubLObject var222, final SubLObject var282) {
        final SubLObject var283 = module0756.f47487(var222, (SubLObject)UNPROVIDED);
        if (NIL == module0751.f46661((SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0755.f47386(var283) && module0755.f47390(var283).eql($ic205$)) {
            final SubLObject var284 = module0751.f47099(var282, (SubLObject)ConsesLow.list($ic206$), (SubLObject)UNPROVIDED);
            return (NIL != var284) ? var284.first() : $ic207$;
        }
        if (NIL != module0755.f47386(var283) && module0755.f47390(var283).eql($ic208$)) {
            final SubLObject var284 = module0751.f47099(var282, (SubLObject)ConsesLow.list($ic209$), (SubLObject)UNPROVIDED);
            return (NIL != var284) ? var284.first() : $ic210$;
        }
        return f48012(var222, var282);
    }
    
    public static SubLObject f48006(final SubLObject var278, SubLObject var282) {
        if (var282 == UNPROVIDED) {
            var282 = (SubLObject)NIL;
        }
        final SubLObject var283 = f48003(var282);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic211$, var283);
        }
        final SubLObject var284 = module0751.f47026(var278, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f2012(var278)) {
            return f48016(var283);
        }
        if (NIL != module0035.f2012(Sequences.find_if(Symbols.symbol_function((SubLObject)$ic212$), var283, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
            return var283;
        }
        if (NIL != module0035.f2012(module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic213$), var284, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
            return f48016(var283);
        }
        if (NIL != module0035.f2012(module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic214$), var284, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
            return f48017(var283);
        }
        if (NIL != module0035.f2012(module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic215$), var283, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
            return var283;
        }
        if (var278.equal((SubLObject)ConsesLow.list(module0751.$g5993$.getGlobalValue()))) {
            return f48016(var283);
        }
        return f48006((SubLObject)ConsesLow.list(module0751.$g5993$.getGlobalValue()), var283);
    }
    
    public static SubLObject f47988(final SubLObject var292, SubLObject var282) {
        if (var282 == UNPROVIDED) {
            var282 = (SubLObject)NIL;
        }
        final SubLObject var293 = f48004(var282);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic216$, var293);
        }
        final SubLObject var294 = module0751.f47031(var292, (SubLObject)UNPROVIDED);
        if (NIL == var292) {
            return f48018(var293);
        }
        if (NIL == f48019(var293)) {
            return var293;
        }
        if (NIL != f48020(var294)) {
            return f48018(var293);
        }
        if (NIL != f48021(var294)) {
            return f48022(var293);
        }
        if (NIL != f48023(var293)) {
            return f48022(var293);
        }
        if (var292.eql(module0751.$g5993$.getGlobalValue())) {
            return f48018(var293);
        }
        return f47988(module0751.$g5993$.getGlobalValue(), (SubLObject)ConsesLow.list(var293));
    }
    
    public static SubLObject f48019(final SubLObject var295) {
        return module0751.f46658(var295, $ic170$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48020(final SubLObject var274) {
        final SubLThread var275 = SubLProcess.currentSubLThread();
        return module0751.f46658(var274, $ic217$, module0579.$g4260$.getDynamicValue(var275));
    }
    
    public static SubLObject f48021(final SubLObject var274) {
        final SubLThread var275 = SubLProcess.currentSubLThread();
        return module0751.f46658(var274, $ic147$, module0579.$g4260$.getDynamicValue(var275));
    }
    
    public static SubLObject f48023(final SubLObject var274) {
        final SubLThread var275 = SubLProcess.currentSubLThread();
        return module0751.f46658(var274, $ic218$, module0579.$g4260$.getDynamicValue(var275));
    }
    
    public static SubLObject f48016(final SubLObject var290) {
        return module0751.f47099((SubLObject)ConsesLow.list($ic219$), var290, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48018(final SubLObject var293) {
        return module0751.f47138($ic219$, var293);
    }
    
    public static SubLObject f48017(final SubLObject var290) {
        return module0751.f47099((SubLObject)ConsesLow.list($ic218$), var290, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48022(final SubLObject var293) {
        return module0751.f47138($ic218$, var293);
    }
    
    public static SubLObject f47912(final SubLObject var296, final SubLObject var297) {
        final SubLThread var298 = SubLProcess.currentSubLThread();
        final SubLObject var299 = module0756.f47488(var296, (SubLObject)UNPROVIDED);
        final SubLObject var300 = module0756.f47488(var297, (SubLObject)UNPROVIDED);
        if (!var299.equal(var300)) {
            final SubLObject var301 = module0147.f9540(module0579.$g4260$.getDynamicValue(var298));
            final SubLObject var302 = module0147.$g2095$.currentBinding(var298);
            final SubLObject var303 = module0147.$g2094$.currentBinding(var298);
            final SubLObject var304 = module0147.$g2096$.currentBinding(var298);
            try {
                module0147.$g2095$.bind(module0147.f9545(var301), var298);
                module0147.$g2094$.bind(module0147.f9546(var301), var298);
                module0147.$g2096$.bind(module0147.f9549(var301), var298);
                final SubLObject var305 = module0751.f47099(var299, var300, (SubLObject)UNPROVIDED);
                if (NIL != var305) {
                    if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic220$, new SubLObject[] { var299, var300, var305 });
                    }
                    module0756.f47797(var296, var300, (SubLObject)UNPROVIDED);
                    module0756.f47797(var297, var299, (SubLObject)UNPROVIDED);
                }
                else if (NIL != module0756.f47479(var296) && NIL != module0756.f47680(var296, var297)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)$ic221$, var299, var296, var297);
                    }
                    module0756.f47784(var297, var299, (SubLObject)UNPROVIDED);
                }
                else if (NIL != module0756.f47479(var297) && NIL != module0756.f47680(var297, var296)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)$ic221$, var300, var297, var296);
                    }
                    module0756.f47784(var296, var300, (SubLObject)UNPROVIDED);
                }
                else if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic222$, var299, var300);
                }
            }
            finally {
                module0147.$g2096$.rebind(var304, var298);
                module0147.$g2094$.rebind(var303, var298);
                module0147.$g2095$.rebind(var302, var298);
            }
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic223$, module0756.f47482(var296), module0756.f47482(var297));
            }
        }
        return Values.values(module0756.f47482(var296), module0756.f47482(var297));
    }
    
    public static SubLObject f48024(final SubLObject var1) {
        if (NIL == module0756.f47478(var1)) {
            return (SubLObject)NIL;
        }
        final SubLObject var2 = module0756.f47590(var1, (SubLObject)ZERO_INTEGER);
        return f47983(var2);
    }
    
    public static SubLObject f48025(final SubLObject var1) {
        if (NIL == module0756.f47478(var1)) {
            return (SubLObject)NIL;
        }
        final SubLObject var2 = module0756.f47590(var1, (SubLObject)ZERO_INTEGER);
        return f47984(var2);
    }
    
    public static SubLObject f47984(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0751.f46640(module0756.f47481(var1, (SubLObject)T), $ic151$, module0579.$g4260$.getDynamicValue(var2));
    }
    
    public static SubLObject f47983(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0751.f47114(module0756.f47481(var1, (SubLObject)T), f48026(), module0579.$g4260$.getDynamicValue(var2));
    }
    
    public static SubLObject f48026() {
        final SubLObject var302 = f48027();
        if (NIL == module0167.f10813(var302)) {
            f48028();
        }
        return var302;
    }
    
    public static SubLObject f48028() {
        final SubLObject var303 = $g6092$.getGlobalValue();
        if (NIL != var303) {
            module0034.f1818(var303);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48029() {
        return module0034.f1829($g6092$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48030() {
        return module0172.f10921((SubLObject)$ic225$);
    }
    
    public static SubLObject f48027() {
        SubLObject var304 = $g6092$.getGlobalValue();
        if (NIL == var304) {
            var304 = module0034.f1934((SubLObject)$ic224$, (SubLObject)$ic226$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var305 = module0034.f1810(var304, (SubLObject)UNPROVIDED);
        if (var305 == $ic227$) {
            var305 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48030()));
            module0034.f1812(var304, var305, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var305);
    }
    
    public static SubLObject f48031(final SubLObject var1) {
        if (NIL == module0756.f47520(var1)) {
            f48032(var1);
        }
        return var1;
    }
    
    public static SubLObject f48032(final SubLObject var1) {
        final SubLObject var2 = module0756.f47480(var1, (SubLObject)UNPROVIDED);
        if (NIL != var2 && NIL != f48033(var2) && NIL == module0731.f44750(var2, (SubLObject)UNPROVIDED)) {
            final SubLObject var3 = module0731.f44726(var2, $ic146$);
            if (NIL != var3) {
                final SubLObject var4 = module0731.f44728(var2, var3, $ic146$);
                module0756.f47625(var1, var3);
                module0756.f47503(var1, var4, (SubLObject)UNPROVIDED);
            }
        }
        return var1;
    }
    
    public static SubLObject f48033(final SubLObject var15) {
        return module0754.f47343(var15, $ic146$, (SubLObject)$ic228$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48034(final SubLObject var1) {
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic229$, var1);
        }
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var1).isVector()) {
            final SubLObject var3 = module0743.f45996(var1);
            final SubLObject var4 = (SubLObject)NIL;
            SubLObject var5;
            SubLObject var6;
            SubLObject var7;
            SubLObject var8;
            for (var5 = Sequences.length(var3), var6 = (SubLObject)NIL, var6 = (SubLObject)ZERO_INTEGER; var6.numL(var5); var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER)) {
                var7 = ((NIL != var4) ? Numbers.subtract(var5, var6, (SubLObject)ONE_INTEGER) : var6);
                var8 = Vectors.aref(var3, var7);
                if (NIL != module0756.f47478(var8)) {
                    f48034(var8);
                }
                else {
                    module0756.f47465(var8, module0751.f47150(module0756.f47487(var8, (SubLObject)UNPROVIDED)));
                }
                var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
            }
        }
        return var1;
    }
    
    public static SubLObject f48035() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47876", "S#52362", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47877", "S#52363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47878", "S#39105", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47890", "S#51937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47891", "S#51942", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47887", "S#52364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47888", "S#52365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47892", "S#52366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47894", "S#52367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47896", "S#52368", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47897", "S#52369", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47901", "S#52370", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47903", "S#52371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47902", "S#52372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47899", "S#50955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47904", "S#52373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47905", "S#52347", 1, 0, false);
        new $f47905$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47906", "S#52374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47900", "S#52375", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47895", "S#52376", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47910", "S#52377", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47908", "S#52378", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47907", "S#52379", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47913", "S#52380", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47911", "S#52381", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47917", "S#52382", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47921", "S#52383", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47922", "S#52384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47909", "S#52385", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47893", "S#39094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47923", "S#52348", 1, 0, false);
        new $f47923$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47924", "S#52386", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47925", "S#52387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47926", "S#52388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47927", "S#52389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47928", "S#52390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47879", "S#51950", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47930", "S#52391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47929", "S#52392", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47932", "S#52351", 1, 0, false);
        new $f47932$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47931", "S#52393", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47933", "S#52394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47916", "S#52395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47934", "S#52396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47889", "S#52397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47880", "S#52398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47939", "S#51849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47881", "S#52399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47942", "S#52400", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47943", "S#51938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47898", "S#51949", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47944", "S#52401", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47946", "S#52402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47947", "S#52403", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47949", "S#52404", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47948", "S#52405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47918", "S#52406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47945", "S#52407", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47951", "S#51930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47953", "S#52408", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47954", "S#52409", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47952", "S#52410", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47919", "S#52411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47955", "S#52412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47920", "S#52413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47950", "S#52414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47883", "S#52415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47956", "S#52416", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47957", "S#52417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47885", "S#52418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47958", "PPH-SYMBOL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47886", "S#52419", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47962", "S#52314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47963", "S#52315", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47965", "S#52420", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47969", "S#52421", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47970", "S#52312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47971", "S#52313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47959", "S#52422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47972", "S#52423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47966", "S#52424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47967", "S#52425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47968", "S#52426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47973", "S#52427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47960", "S#52428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47961", "S#52429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47974", "S#52430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47964", "S#52431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47975", "S#52432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47884", "S#52433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47976", "S#52434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47882", "S#52435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47979", "S#52436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47980", "S#52437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47982", "S#52438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47981", "S#52439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47977", "S#52440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47978", "S#52441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47935", "S#52442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47987", "S#52443", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47937", "S#52444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47938", "S#52445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47989", "S#52446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47915", "S#52447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47914", "S#51939", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47990", "S#51940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47936", "S#52448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47985", "S#52449", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47941", "S#52450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47992", "S#52451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47940", "S#52452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47993", "S#52453", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47994", "S#52454", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47995", "S#52455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47996", "S#52456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47991", "S#52457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47998", "S#52458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48000", "S#52459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48001", "S#51002", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47997", "S#52460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48002", "S#52461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47999", "S#52462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48003", "S#52463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48004", "S#52464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48005", "S#52465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47986", "S#52466", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48010", "S#52467", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48007", "S#52468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48014", "S#52469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48015", "S#52470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48013", "S#52471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48009", "S#52472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48012", "S#52473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48008", "S#52474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48011", "S#52475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48006", "S#52476", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47988", "S#52477", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48019", "S#52360", 1, 0, false);
        new $f48019$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48020", "S#52361", 1, 0, false);
        new $f48020$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48021", "S#52478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48023", "S#52479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48016", "S#52480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48018", "S#52481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48017", "S#52482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48022", "S#52483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47912", "S#52484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48024", "S#51951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48025", "S#51952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47984", "S#52485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f47983", "S#52486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48026", "S#52487", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48028", "S#52488", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48029", "S#52489", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48030", "S#52490", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48027", "S#52491", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48031", "S#52492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48032", "S#52493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48033", "S#52494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0758", "f48034", "S#52495", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48036() {
        $g6084$ = SubLFiles.defparameter("S#52496", (SubLObject)ZERO_INTEGER);
        $g6085$ = SubLFiles.defparameter("S#52497", (SubLObject)$ic3$);
        $g6086$ = SubLFiles.defparameter("S#52498", (SubLObject)NIL);
        $g6087$ = SubLFiles.defparameter("S#52499", (SubLObject)NIL);
        $g6088$ = SubLFiles.defparameter("S#52500", (SubLObject)NIL);
        $g6089$ = SubLFiles.defvar("S#52501", (SubLObject)ZERO_INTEGER);
        $g6090$ = SubLFiles.defparameter("S#52502", (SubLObject)TEN_INTEGER);
        $g6091$ = SubLFiles.deflexical("S#52503", (SubLObject)$ic193$);
        $g6092$ = SubLFiles.deflexical("S#52504", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48037() {
        module0034.f1909((SubLObject)$ic224$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f48035();
    }
    
    public void initializeVariables() {
        f48036();
    }
    
    public void runTopLevelForms() {
        f48037();
    }
    
    static {
        me = (SubLFile)new module0758();
        $g6084$ = null;
        $g6085$ = null;
        $g6086$ = null;
        $g6087$ = null;
        $g6088$ = null;
        $g6089$ = null;
        $g6090$ = null;
        $g6091$ = null;
        $g6092$ = null;
        $ic0$ = makeString("Unable to finish");
        $ic1$ = makeString("~&~A ~S~%");
        $ic2$ = makeString("Unfinished dtr");
        $ic3$ = makeInteger(99);
        $ic4$ = makeKeyword("PHRASE-CYCL");
        $ic5$ = makeString("(PPH error level ");
        $ic6$ = makeString(") ");
        $ic7$ = makeString("~&Exceeded PPH-PHRASE-GET-STRING max depth of ~S.~% Phrase: ~S~%");
        $ic8$ = makeString("~&Resolved conditional phrase to ~S ~S.");
        $ic9$ = makeString("Tried to generating CycL phrase with unknown CycL. Trying again as regular phrase:~% ~S");
        $ic10$ = makeString("Resolved formerly CycL phrase with unknown CycL to ~S");
        $ic11$ = makeString("~&Using CycL for object: ~S.~%");
        $ic12$ = makeString("~&Doing anaphor paraphrase with formula ~S.~%");
        $ic13$ = makeString("~&Doing coordination paraphrase with formula ~S.~%");
        $ic14$ = makeString("~&Suspending bullet use for~% ~S~%");
        $ic15$ = makeString("~&Turning bullet use back on.~%");
        $ic16$ = makeString("~&Doing chemical-formula-from-lists paraphrase.~%");
        $ic17$ = makeString("~&Doing percent paraphrase.~%");
        $ic18$ = makeString("~&Generating symbol paraphrase of ~S.~%");
        $ic19$ = makeString("~&Using quoted string for string: ~S.~%");
        $ic20$ = makeString("~&Using quoted paraphrase for term.~%");
        $ic21$ = makeString("Using ~S for quoted paraphrase of ~S");
        $ic22$ = makeString("\"");
        $ic23$ = makeString("~&Using nospace paraphrase for ~S~%");
        $ic24$ = makeString("~&Using terse paraphrase for ~S~%");
        $ic25$ = makeString("~&Using precise paraphrase for ~S~%");
        $ic26$ = makeSymbol("PPH-PRECISION-P");
        $ic27$ = makeString("~&Unknown cycl for ~S.~%");
        $ic28$ = makeString("~&Using precision ~S~%");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#52505", "CYC"), (SubLObject)makeSymbol("S#52506", "CYC"), (SubLObject)makeSymbol("S#52507", "CYC"));
        $ic30$ = makeKeyword("PPH-HL-SUPPORTS-FOUND");
        $ic31$ = makeKeyword("RESOLVED");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("PossessivePhrase"));
        $ic33$ = makeString("Couldn't resolve repeated dtrs for ~S");
        $ic34$ = makeString("~&Starting dtr resolution for phrase ~D");
        $ic35$ = makeString("~&~D of ~D daughters unfinished.");
        $ic36$ = makeString("Can't resolve mother due to impossible dtr:~% ~S");
        $ic37$ = makeString("~&Finished ~S iteration(s): ~D of ~D daughters unfinished.");
        $ic38$ = makeString("Couldn't finish ~S~% because of unfinished dtrs:~% ~S~%");
        $ic39$ = makeKeyword("NOT-RESOLVED");
        $ic40$ = makeSymbol("S#39064", "CYC");
        $ic41$ = makeString("Problem expanding repeated phrase~% ~S");
        $ic42$ = makeString("PPH-REPEATED-PHRASE-EXPANSION got non-formula ~S");
        $ic43$ = makeString("Repeating phrase ~S");
        $ic44$ = makeString(", etc.");
        $ic45$ = makeString("Can't get current list item from ~S");
        $ic46$ = makeKeyword("UNSPECIFIED");
        $ic47$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeKeyword("ANYTHING"));
        $ic48$ = makeString("Updating ~S to~% ~S.~% Result: ~S~%");
        $ic49$ = makeSymbol("S#52347", "CYC");
        $ic50$ = makeSymbol("S#52374", "CYC");
        $ic51$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CurrentListItemFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#52372", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P")));
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#714", "CYC"), (SubLObject)makeSymbol("S#35177", "CYC"));
        $ic53$ = makeString("~&Resolving ~S to ~S~%");
        $ic54$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#714", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"));
        $ic55$ = makeString("");
        $ic56$ = makeString("~&Phrase agr: ~S~%");
        $ic57$ = makeString("~& Dtr ~D category is ~S.~%");
        $ic58$ = makeString("~& Dtr ~D agr is ~S.~%");
        $ic59$ = makeString("~&Set agr of dtr #~D to ~S.~%");
        $ic60$ = makeString("~& Set head agr to ~S.~%");
        $ic61$ = makeString("~&Finished ~S~% (with ~D dtrs).~%");
        $ic62$ = makeString("~& Set phrase agr to ~S based on head dtr.~%");
        $ic63$ = makeString("~& Dtrs left unfinished: ~D.~%");
        $ic64$ = makeKeyword("MOTHER");
        $ic65$ = makeString("~&Agr target (mother) not resolved: ~S.~%");
        $ic66$ = makeString("~&Phrase agrees with itself(!)~%");
        $ic67$ = makeString("~&Agr target not resolved: ~S.~%");
        $ic68$ = makeString("Setting mother's output list from unfinished dtr with CycL ~S:~% ~S~%");
        $ic69$ = makeString("~Dth dtr output list: ~S");
        $ic70$ = makeSymbol("S#52348", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic72$ = makeSymbol("S#52391", "CYC");
        $ic73$ = makeString("~&Test has unresolved indexical phrases. Postponing: ~S.~%");
        $ic74$ = makeString("~&Ran conditional test:~% ~S~% Result: ~S.~%");
        $ic75$ = makeString("Pass");
        $ic76$ = makeString("Fail");
        $ic77$ = makeString("~& Initial winning phrase:~% ~S~% with agr preds ~S");
        $ic78$ = makeString("~& New phrase: ~S~% with agr preds ~S");
        $ic79$ = makeString("~& Phrase has ~D daughters.~%");
        $ic80$ = makeSymbol("S#52351", "CYC");
        $ic81$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheNthFn")), constant_handles_oc.f8479((SubLObject)makeString("SententialConstituent")), (SubLObject)makeKeyword("ANYTHING"));
        $ic82$ = makeSymbol("S#52394", "CYC");
        $ic83$ = makeString("Adding alternatives for agr target~% ~S~% to ~S");
        $ic84$ = makeString("Done ~S alternatives of ~S");
        $ic85$ = makeString("Added ~D alternatives.");
        $ic86$ = makeKeyword("SUBJECT-VERB");
        $ic87$ = makeKeyword("DET-NBAR");
        $ic88$ = makeKeyword("PEER");
        $ic89$ = makeKeyword("TENSE");
        $ic90$ = makeString("~&Paraphrasing ~S with agreement ~S.~%");
        $ic91$ = makeString("~& Output list is~% ~S.~%");
        $ic92$ = makeString("~& Arg-position map is ~S.~%");
        $ic93$ = makeString("~& SUID is ~S.~%");
        $ic94$ = makeString("~& # of dtrs: ~S.~%");
        $ic95$ = makeString("Can't resolve string of ~S");
        $ic96$ = makeKeyword("CYCL-PHRASE");
        $ic97$ = makeString("Sanity check failed: rm cycl ~S is not equal to phrase cycl ~S");
        $ic98$ = makeString("Must use reflexive for~% ~S~% due to~% ~S");
        $ic99$ = makeKeyword("SOURCE-POS");
        $ic100$ = makeString("~&Using arg0 for ~S with formula ~S~%");
        $ic101$ = makeKeyword("ARG0");
        $ic102$ = makeString("Updated conditional test to ~S~%");
        $ic103$ = makeString("Updated test to~% ~S using non-template~% ~S~%");
        $ic104$ = makeString("Updated variable bindings query-template to ~S~%");
        $ic105$ = makeString("Updated variable bindings query-template to~% ~S using non-template~% ~S~%");
        $ic106$ = makeString("~&Replacing ~S with ~S.~%");
        $ic107$ = constant_handles_oc.f8479((SubLObject)makeString("PhraseFormFn"));
        $ic108$ = ConsesLow.list((SubLObject)TWO_INTEGER);
        $ic109$ = makeString("Can't reconcile ~S and ~S.");
        $ic110$ = makeKeyword("NO-ACTION");
        $ic111$ = makeString("No current arg0 to reserve for ~S");
        $ic112$ = makeKeyword("NO-CURRENT-ARG0");
        $ic113$ = makeKeyword("RESERVED-FOR-MATRIX-ARG0");
        $ic114$ = makeKeyword("HTML");
        $ic115$ = makeSymbol("?SYMBOL");
        $ic116$ = constant_handles_oc.f8479((SubLObject)makeString("atomicSymbol"));
        $ic117$ = ConsesLow.list((SubLObject)makeSymbol("?SYMBOL"));
        $ic118$ = makeKeyword("SYMBOL");
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("nameString"));
        $ic120$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PhraseFn-Bar1")), constant_handles_oc.f8479((SubLObject)makeString("Noun")));
        $ic121$ = makeSymbol("?CODE");
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("htmlGlyphCode"));
        $ic123$ = ConsesLow.list((SubLObject)makeSymbol("?CODE"));
        $ic124$ = constant_handles_oc.f8479((SubLObject)makeString("htmlStringVersionOfCharacter"));
        $ic125$ = constant_handles_oc.f8479((SubLObject)makeString("termStrings"));
        $ic126$ = makeKeyword("DECLARATIVE");
        $ic127$ = makeKeyword("INTERROGATIVE");
        $ic128$ = makeKeyword("QUESTION");
        $ic129$ = makeString(".");
        $ic130$ = makeString("?");
        $ic131$ = makeKeyword("NONE");
        $ic132$ = makeSymbol("S#39357", "CYC");
        $ic133$ = makeSymbol("S#50691", "CYC");
        $ic134$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#52508", "CYC"), (SubLObject)makeSymbol("S#52509", "CYC"));
        $ic135$ = makeInteger(100);
        $ic136$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic137$ = makeString("Using significant digits cutoff of ~S for ~S");
        $ic138$ = makeString("%");
        $ic139$ = ConsesLow.list((SubLObject)Characters.CHAR_0);
        $ic140$ = makeSymbol("ALPHA-CHAR-P");
        $ic141$ = makeString("~&Recursion limit (~S) exceeded in PPH-COORDINATION-PHRASE-GET-STRING.");
        $ic142$ = ConsesLow.list((SubLObject)makeSymbol("S#52510", "CYC"), (SubLObject)makeSymbol("S#52511", "CYC"));
        $ic143$ = makeKeyword("AND");
        $ic144$ = makeString("Changing coordination to :OR, based on :NO determiner");
        $ic145$ = makeKeyword("OR");
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("Noun"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("plural-Generic"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)makeString("singular-Generic"));
        $ic149$ = makeString("~&Setting conjunctive agr of ~S to ~S");
        $ic150$ = constant_handles_oc.f8479((SubLObject)makeString("No-NLAttr"));
        $ic151$ = constant_handles_oc.f8479((SubLObject)makeString("Determiner"));
        $ic152$ = makeString("Removed det-sister from mother.");
        $ic153$ = makeString("subject pointer is nth phrase: ~S");
        $ic154$ = makeString("~&Not setting subject verb agreement because subject dtr is not finished.~%");
        $ic155$ = makeKeyword("ANY");
        $ic156$ = constant_handles_oc.f8479((SubLObject)makeString("Verb"));
        $ic157$ = makeString("~&Using internal constraints: ~S~%");
        $ic158$ = makeString("...filtered from ~S.~%");
        $ic159$ = makeString("~&Setting verb agreement to ~S.~%");
        $ic160$ = makeString("Using default verb form: ~S.");
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("MeasurableQuantity"));
        $ic162$ = constant_handles_oc.f8479((SubLObject)makeString("adjStrings"));
        $ic163$ = constant_handles_oc.f8479((SubLObject)makeString("Adjective"));
        $ic164$ = makeString("~&This phrase's agr-pred is ~S but its category is ~S:~%~S");
        $ic165$ = makeString("~&Set adjective peer agreement to ~S.~%");
        $ic166$ = constant_handles_oc.f8479((SubLObject)makeString("untensed"));
        $ic167$ = makeString("~&Set untensed peer agreement to ~S.~%");
        $ic168$ = makeString("~&Set peer agreement to ~S.~%");
        $ic169$ = makeString("~&Set peer agreement to default: ~S.~%");
        $ic170$ = constant_handles_oc.f8479((SubLObject)makeString("tensed"));
        $ic171$ = makeString("~&Incorporating tense agreement ~S.~%");
        $ic172$ = makeString("~S");
        $ic173$ = makeString("~&Using daughter ~D as agreement target:~% ~S");
        $ic174$ = constant_handles_oc.f8479((SubLObject)makeString("BareForm-NLAttr"));
        $ic175$ = makeString("~&Using hard-coded null determiner hack for #$BareForm-NLAttr.~%");
        $ic176$ = constant_handles_oc.f8479((SubLObject)makeString("PossessivePronoun-Pre"));
        $ic177$ = makeKeyword("NEVER");
        $ic178$ = makeString("~&Setting det-nbar agreement for possessive.~%");
        $ic179$ = makeString("~&Using null determiner for possessive nbar.~%");
        $ic180$ = makeString("~&Setting det-nbar agreement for ranged phrase.~%");
        $ic181$ = makeString("~&Setting determiner's agr-pred from nbar to ~S.");
        $ic182$ = makeString("~&Setting agr-pred from determiner to ~S.");
        $ic183$ = makeSymbol("EL-VAR?");
        $ic184$ = makeString("~&Setting determiner-nbar agreement based on variable determiner.");
        $ic185$ = constant_handles_oc.f8479((SubLObject)makeString("nonSingular-Generic"));
        $ic186$ = makeString("~&Setting determiner-nbar agreement to ~S based on number-denoting determiner.");
        $ic187$ = makeString("Couldn't determine agreement information: ~S~% DET-HEAD-CYCL: ~S~%");
        $ic188$ = makeString("PPH-PHRASE-DTR-NESTED-WITHIN? looking for dtr ~S in non-PPH-PHRASE ~S~%");
        $ic189$ = makeString("some");
        $ic190$ = makeString("~&Nbar is now ~S~%");
        $ic191$ = constant_handles_oc.f8479((SubLObject)makeString("ExistingStuffType"));
        $ic192$ = makeString("~&Using English-specific indefinite determiner hack: ~S with Nbar ~S.~%");
        $ic193$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Thing")), (SubLObject)makeString("something")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Person")), (SubLObject)makeString("someone")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Place")), (SubLObject)makeString("someplace")));
        $ic194$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("singular")));
        $ic195$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("STRING"));
        $ic196$ = makeString("Nbar string is ~S. Output list: ~S");
        $ic197$ = constant_handles_oc.f8479((SubLObject)makeString("nounStrings"));
        $ic198$ = ConsesLow.list((SubLObject)makeKeyword("A"), (SubLObject)NIL);
        $ic199$ = makeKeyword("INDEX");
        $ic200$ = constant_handles_oc.f8479((SubLObject)makeString("Pronoun"));
        $ic201$ = constant_handles_oc.f8479((SubLObject)makeString("verbStrings"));
        $ic202$ = makeSymbol("S#48593", "CYC");
        $ic203$ = constant_handles_oc.f8479((SubLObject)makeString("singularVerb-Generic"));
        $ic204$ = makeString("~&Subject agr: ~S~%");
        $ic205$ = constant_handles_oc.f8479((SubLObject)makeString("SecondPerson-NLAttr"));
        $ic206$ = constant_handles_oc.f8479((SubLObject)makeString("secondPersonSg-Generic"));
        $ic207$ = constant_handles_oc.f8479((SubLObject)makeString("secondPersonSg-Present"));
        $ic208$ = constant_handles_oc.f8479((SubLObject)makeString("FirstPerson-NLAttr"));
        $ic209$ = constant_handles_oc.f8479((SubLObject)makeString("firstPersonSg-Generic"));
        $ic210$ = constant_handles_oc.f8479((SubLObject)makeString("firstPersonSg-Present"));
        $ic211$ = makeString("~&Using tenses ~S~%");
        $ic212$ = makeSymbol("S#52360", "CYC");
        $ic213$ = makeSymbol("S#52361", "CYC");
        $ic214$ = makeSymbol("S#52478", "CYC");
        $ic215$ = makeSymbol("S#52479", "CYC");
        $ic216$ = makeString("~&Using tense ~S~%");
        $ic217$ = constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)makeString("pluralVerb-Generic"));
        $ic219$ = constant_handles_oc.f8479((SubLObject)makeString("thirdPersonSg-Generic"));
        $ic220$ = makeString("~&Unifying ~S and ~S to ~S.~%");
        $ic221$ = makeString("Using agr preds ~S from done head dtr~% ~S~% for ~S.");
        $ic222$ = makeString("Couldn't unify ~S and ~S.~%");
        $ic223$ = makeString("~&AGRs are now~% ~S and~% ~S.~%");
        $ic224$ = makeSymbol("S#52491", "CYC");
        $ic225$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PhraseFn")), constant_handles_oc.f8479((SubLObject)makeString("Determiner")));
        $ic226$ = makeSymbol("S#52504", "CYC");
        $ic227$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic228$ = makeKeyword("AS-FALLBACK");
        $ic229$ = makeString("~&Switching arg1 and arg2 in ~S~%");
    }
    
    public static final class $f47905$UnaryFunction extends UnaryFunction
    {
        public $f47905$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52347"));
        }
        
        public SubLObject processItem(final SubLObject var83) {
            return f47905(var83);
        }
    }
    
    public static final class $f47923$UnaryFunction extends UnaryFunction
    {
        public $f47923$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52348"));
        }
        
        public SubLObject processItem(final SubLObject var83) {
            return f47923(var83);
        }
    }
    
    public static final class $f47932$UnaryFunction extends UnaryFunction
    {
        public $f47932$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52351"));
        }
        
        public SubLObject processItem(final SubLObject var83) {
            return f47932(var83);
        }
    }
    
    public static final class $f48019$UnaryFunction extends UnaryFunction
    {
        public $f48019$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52360"));
        }
        
        public SubLObject processItem(final SubLObject var83) {
            return f48019(var83);
        }
    }
    
    public static final class $f48020$UnaryFunction extends UnaryFunction
    {
        public $f48020$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52361"));
        }
        
        public SubLObject processItem(final SubLObject var83) {
            return f48020(var83);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1220 ms
	
	Decompiled with Procyon 0.5.32.
*/