package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0010 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0010";
    public static final String myFingerPrint = "9a88f0ef7570cfbf27438d2100c885eb2e6d1585516a23d0a70d769f2fe481ed";
    public static SubLSymbol $g19$;
    public static SubLSymbol $g20$;
    public static SubLSymbol $g21$;
    public static SubLSymbol $g22$;
    public static SubLSymbol $g23$;
    public static SubLSymbol $g24$;
    public static SubLSymbol $g25$;
    public static SubLSymbol $g26$;
    public static SubLSymbol $g27$;
    public static SubLSymbol $g28$;
    public static SubLSymbol $g29$;
    public static SubLSymbol $g30$;
    public static SubLSymbol $g31$;
    public static SubLSymbol $g32$;
    public static SubLSymbol $g33$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    
    public static SubLObject f323() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f324() {
        $g19$ = SubLFiles.defparameter("S#314", (SubLObject)$ic0$);
        $g20$ = SubLFiles.defparameter("S#315", (SubLObject)TEN_INTEGER);
        $g21$ = SubLFiles.defparameter("S#316", module0009.f318(module0009.f317($g19$.getDynamicValue()), $g20$.getDynamicValue()));
        $g22$ = SubLFiles.defparameter("S#317", module0009.f319($g21$.getDynamicValue()));
        $g23$ = SubLFiles.defparameter("S#318", (SubLObject)$ic1$);
        $g24$ = SubLFiles.defparameter("S#319", (SubLObject)$ic2$);
        $g25$ = SubLFiles.defparameter("S#320", (SubLObject)$ic3$);
        $g26$ = SubLFiles.defparameter("S#321", (SubLObject)$ic4$);
        $g27$ = SubLFiles.defparameter("S#322", (SubLObject)$ic5$);
        $g28$ = SubLFiles.defparameter("S#323", (SubLObject)$ic6$);
        $g29$ = SubLFiles.defparameter("S#324", (SubLObject)$ic7$);
        $g30$ = SubLFiles.defparameter("S#325", (SubLObject)$ic8$);
        $g31$ = SubLFiles.defparameter("S#326", (SubLObject)$ic9$);
        $g32$ = SubLFiles.defparameter("S#327", (SubLObject)$ic10$);
        $g33$ = SubLFiles.defparameter("S#328", (SubLObject)$ic11$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f325() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f323();
    }
    
    public void initializeVariables() {
        f324();
    }
    
    public void runTopLevelForms() {
        f325();
    }
    
    static {
        me = (SubLFile)new module0010();
        $g19$ = null;
        $g20$ = null;
        $g21$ = null;
        $g22$ = null;
        $g23$ = null;
        $g24$ = null;
        $g25$ = null;
        $g26$ = null;
        $g27$ = null;
        $g28$ = null;
        $g29$ = null;
        $g30$ = null;
        $g31$ = null;
        $g32$ = null;
        $g33$ = null;
        $ic0$ = makeString("$Revision: 140388 $");
        $ic1$ = makeString("1.269");
        $ic2$ = makeString("1.555");
        $ic3$ = makeString("1.69");
        $ic4$ = makeString("1.391");
        $ic5$ = makeString("1.1767");
        $ic6$ = makeString("1.319");
        $ic7$ = makeString("1.907");
        $ic8$ = makeString("1.437");
        $ic9$ = makeString("1.277");
        $ic10$ = makeString("1.652");
        $ic11$ = makeString("");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 16 ms
	
	Decompiled with Procyon 0.5.32.
*/