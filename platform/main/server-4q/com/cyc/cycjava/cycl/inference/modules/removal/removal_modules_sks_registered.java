package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_sks_registered extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sks_registered";
	public static String myFingerPrint = "c311cc18147476e0224b980fea02bde503dcc3d77612f84d0f7a3956bbdd41a6";
	private static SubLObject $const0$sksRegistered;
	private static SubLSymbol $kw$REMOVAL_SKS_REGISTERED_CHECK_POS;
	private static SubLList $list2;
	private static SubLSymbol $kw$REMOVAL_SKS_REGISTERED_CHECK_NEG;
	private static SubLList $list4;
	private static SubLSymbol $kw$REMOVAL_SKS_REGISTERED_UNIFY_POS;
	private static SubLList $list6;

	public static SubLObject declare_removal_modules_sks_registered_file() {
		return NIL;
	}

	public static SubLObject init_removal_modules_sks_registered_file() {
		return NIL;
	}

	public static SubLObject setup_removal_modules_sks_registered_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$sksRegistered);
		inference_modules.inference_removal_module($kw$REMOVAL_SKS_REGISTERED_CHECK_POS, $list2);
		inference_modules.inference_removal_module($kw$REMOVAL_SKS_REGISTERED_CHECK_NEG, $list4);
		inference_modules.inference_removal_module($kw$REMOVAL_SKS_REGISTERED_UNIFY_POS, $list6);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_sks_registered_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_sks_registered_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_sks_registered_file();
	}

	static {
		me = new removal_modules_sks_registered();
		$const0$sksRegistered = constant_handles.reader_make_constant_shell(makeString("sksRegistered"));
		$kw$REMOVAL_SKS_REGISTERED_CHECK_POS = makeKeyword("REMOVAL-SKS-REGISTERED-CHECK-POS");
		$list2 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("sksRegistered")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("sksRegistered")),
						makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("sksRegistered")),
								list(makeKeyword("BIND"), makeSymbol("SOURCE"))),
						list(makeKeyword("VALUE"), makeSymbol("SOURCE"))),
				makeKeyword("OUTPUT-CHECK-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?"), makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("INPUT")),
				makeKeyword("DOCUMENTATION"), makeString("(#$sksRegistered <fully-bound>)"), makeKeyword("EXAMPLE"),
				makeString("(#$sksRegistered #$BLN-Example1-KS)") });
		$kw$REMOVAL_SKS_REGISTERED_CHECK_NEG = makeKeyword("REMOVAL-SKS-REGISTERED-CHECK-NEG");
		$list4 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("sksRegistered")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("sksRegistered")),
						makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("sksRegistered")),
								list(makeKeyword("BIND"), makeSymbol("SOURCE"))),
						list(makeKeyword("VALUE"), makeSymbol("SOURCE"))),
				makeKeyword("OUTPUT-CHECK-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"),
						list(makeKeyword("CALL"), makeSymbol("EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?"),
								makeKeyword("INPUT"))),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("INPUT")),
				makeKeyword("DOCUMENTATION"), makeString("(#$not (#$sksRegistered <fully-bound>))"),
				makeKeyword("EXAMPLE"), makeString("(#$not (#$sksRegistered #$BLN-Example1-KS))") });
		$kw$REMOVAL_SKS_REGISTERED_UNIFY_POS = makeKeyword("REMOVAL-SKS-REGISTERED-UNIFY-POS");
		$list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("sksRegistered")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("sksRegistered")),
						makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("NUMBER-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE")),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-GENERATE-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("LIST-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("INPUT")),
				makeKeyword("DOCUMENTATION"), makeString("(#$sksRegistered <not-fully-bound>)"), makeKeyword("EXAMPLE"),
				makeString("(#$sksRegistered ?SOURCE)") });
	}
}
/*
 *
 * Total time: 69 ms
 *
 */