package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_sksi extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sksi";
	public static String myFingerPrint = "627e0be01d9f35acc392823e0f8595b634e484e1e9a180e8b062d9f6bfab6358";
	private static SubLObject $const0$sksiEqualsAny;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$REMOVAL_SKSIEQUALSANY_CHECK;
	private static SubLList $list3;

	public static SubLObject declare_removal_modules_sksi_file() {
		return NIL;
	}

	public static SubLObject init_removal_modules_sksi_file() {
		return NIL;
	}

	public static SubLObject setup_removal_modules_sksi_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$sksiEqualsAny);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$sksiEqualsAny, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_SKSIEQUALSANY_CHECK, $list3);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_sksi_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_sksi_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_sksi_file();
	}

	static {
		me = new removal_modules_sksi();
		$const0$sksiEqualsAny = constant_handles.reader_make_constant_shell(makeString("sksiEqualsAny"));
		$kw$POS = makeKeyword("POS");
		$kw$REMOVAL_SKSIEQUALSANY_CHECK = makeKeyword("REMOVAL-SKSIEQUALSANY-CHECK");
		$list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("sksiEqualsAny")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("sksiEqualsAny")),
						makeKeyword("FULLY-BOUND"),
						cons(constant_handles.reader_make_constant_shell(makeString("TheSet")),
								makeKeyword("FULLY-BOUND"))),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-CHECK-EXPAND"),
				makeKeyword("DOCUMENTATION"), makeString("(#$sksiEqualsAny <fully-bound> (#$TheSet . <fully-bound>))"),
				makeKeyword("EXAMPLE"), makeString("(#$sksiEqualsAny #$Dog (#$TheSet #$Dog #$Cat))") });
	}
}
/*
 *
 * Total time: 63 ms
 *
 */