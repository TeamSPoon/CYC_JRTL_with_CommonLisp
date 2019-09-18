package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_main extends SubLTranslatedFile {
    public static final SubLFile me = new pph_main();

    public static final String myName = "com.cyc.cycjava.cycl.pph_main";

    public static final String myFingerPrint = "a1507b530e31309a515598d18e257246c4b4ebad9dc56b5bfe356b5ab10ed4e7";

    // defconstant
    private static final SubLSymbol $pph_sbhl_spaces_to_resource$ = makeSymbol("*PPH-SBHL-SPACES-TO-RESOURCE*");



    // deflexical
    private static final SubLSymbol $pph_initializedP$ = makeSymbol("*PPH-INITIALIZED?*");



    // defparameter
    private static final SubLSymbol $pph_method_stack$ = makeSymbol("*PPH-METHOD-STACK*");

    // defparameter
    public static final SubLSymbol $pph_phrase_method_times$ = makeSymbol("*PPH-PHRASE-METHOD-TIMES*");

    // defparameter
    public static final SubLSymbol $currently_metered_pph_phrase_methods$ = makeSymbol("*CURRENTLY-METERED-PPH-PHRASE-METHODS*");







    public static final SubLSymbol $sym3$VALID_EXTERNAL_PPH_NL_PREDS_ = makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?");

    public static final SubLSymbol KEYWORD_OR_NIL_P = makeSymbol("KEYWORD-OR-NIL-P");

    public static final SubLSymbol $sym5$HLMT_ = makeSymbol("HLMT?");





    public static final SubLSymbol NON_NEGATIVE_INTEGER_OR_NIL_P = makeSymbol("NON-NEGATIVE-INTEGER-OR-NIL-P");



    public static final SubLList $list10 = list(new SubLObject[]{ makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NL-PREDS"), makeKeyword("DEFAULT")), list(makeSymbol("DETERMINER"), NIL), list(makeSymbol("LANGUAGE-MT"), makeSymbol("*PPH-LANGUAGE-MT*")), list(makeSymbol("DOMAIN-MT"), makeSymbol("*PPH-DOMAIN-MT*")), list(makeSymbol("MODE"), makeKeyword("TEXT")), list(makeSymbol("TOP"), NIL), list(makeSymbol("FOCUS-ARG"), NIL) });

    public static final SubLString $str11$_param_OBJECT__the_CycL_object_fo = makeString("@param OBJECT; the CycL object for which you want to generate English.\n@param NL-PREDS; a list of instances of #$SpeechPartPredicate.\n@param DETERMINER; a determiner keyword in *DETERMINER-KEYS*.\n@param LANGUAGE-MT; the microtheory from which to look for linguistic information.\n@param DOMAIN-MT; the microtheory from which to look for domain information.\n@return 0 STRINGP or NIL; a string representing our best attempt to paraphrase OBJECT\n into English with the given parameters.\n@return 1; pos-pred or NIL\n@return 2; LISTP of justifications\n@return 3; PPH-OUTPUT-LIST-P.");

    public static final SubLList $list12 = list(list(makeSymbol("OBJECT"), makeSymbol("CYCL-EXPRESSION-P")), list(makeSymbol("NL-PREDS"), makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?")), list(makeSymbol("DETERMINER"), makeSymbol("KEYWORD-OR-NIL-P")), list(makeSymbol("LANGUAGE-MT"), makeSymbol("HLMT?")), list(makeSymbol("DOMAIN-MT"), makeSymbol("HLMT?")), list(makeSymbol("MODE"), makeSymbol("KEYWORDP")), list(makeSymbol("TOP"), makeSymbol("BOOLEANP")), list(makeSymbol("FOCUS-ARG"), makeSymbol("NON-NEGATIVE-INTEGER-OR-NIL-P")));

    public static final SubLList $list13 = list(makeSymbol("STRING-OR-NIL-P"), makeSymbol("PREDICATE?-OR-NIL-P"), makeSymbol("LISTP"), makeSymbol("PPH-OUTPUT-LIST-P"));

    private static final SubLSymbol GENERATE_PHRASE_NO_CHECKS_MEMOIZED = makeSymbol("GENERATE-PHRASE-NO-CHECKS-MEMOIZED");



    private static final SubLSymbol $PPH_METHOD_FAILURE = makeKeyword("PPH-METHOD-FAILURE");

    public static final SubLString $str17$_PPH_error_level_ = makeString("(PPH error level ");

    public static final SubLString $str18$__ = makeString(") ");

    public static final SubLString $str19$Don_t_know_what_to_do_with_determ = makeString("Don't know what to do with determiner ~S passed to GENERATE-PHRASE.");





    private static final SubLString $str22$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");





    private static final SubLSymbol $sym25$PPH_PHRASE_NAUT_ = makeSymbol("PPH-PHRASE-NAUT?");

    private static final SubLSymbol $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_ = makeSymbol("VALID-PPH-LANGUAGE-MT-SPECIFIER?");



    public static final SubLSymbol GENERATE_PHRASE_FOR_JAVA = makeSymbol("GENERATE-PHRASE-FOR-JAVA");

    public static final SubLList $list29 = list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NL-PREDS"), makeKeyword("DEFAULT")), list(makeSymbol("FORCE"), makeKeyword("DEFAULT")), list(makeSymbol("LANGUAGE-MT"), makeSymbol("*PPH-LANGUAGE-MT*")), list(makeSymbol("DOMAIN-MT"), makeSymbol("*PPH-DOMAIN-MT*")), list(makeSymbol("MODE"), makeKeyword("HTML")));

    public static final SubLString $str30$Return_paraphrase_info_in_a_java_ = makeString("Return paraphrase info in a java-friendly format, one big list with no structures.\n@param OBJECT; the CycL object for which you want to generate English.\n@param NL-PREDS; VALID-EXTERNAL-PPH-NL-PREDS?.\n@param FORCE; PPH-FORCE-P.\n@param LANGUAGE-MT; the microtheory from which to look for linguistic information.\n@param DOMAIN-MT; the microtheory from which to look for domain information.\n@return 0 NIL or PPH-JAVALIST-P;\n@return 1 BOOLEANP; Use arg-positions strictly?\n@return 2 LISTP; of PPH supports.");

    public static final SubLList $list31 = list(list(makeSymbol("NL-PREDS"), makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?")), list(makeSymbol("LANGUAGE-MT"), makeSymbol("VALID-PPH-LANGUAGE-MT-SPECIFIER?")), list(makeSymbol("DOMAIN-MT"), makeSymbol("POSSIBLY-MT-P")));

    public static final SubLList $list32 = list(list(makeSymbol("NIL-OR"), makeSymbol("PPH-JAVALIST-P")), makeSymbol("BOOLEAN?"), makeSymbol("LISTP"));



    public static final SubLString $str34$Fallback_method__S_is_not_a_known = makeString("Fallback method ~S is not a known function.");

    public static final SubLString $str35$Couldn_t_generate_a_string_for__S = makeString("Couldn't generate a string for ~S (fallback method was ~S)");

    public static final SubLSymbol GENERATE_PHRASE_NO_CHECKS = makeSymbol("GENERATE-PHRASE-NO-CHECKS");

    public static final SubLString $str37$Duplicate_javalist_____S = makeString("Duplicate javalist:~% ~S");

    public static final SubLSymbol GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P = makeSymbol("GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P");

    private static final SubLObject $$genTemplate_QuerySentence = reader_make_constant_shell(makeString("genTemplate-QuerySentence"));



    public static final SubLSymbol LIST_OF_STRING_P = makeSymbol("LIST-OF-STRING-P");



    public static final SubLList $list43 = list(makeKeyword("REQUIRED"), makeKeyword("PREFERRED"), makeKeyword("DISALLOWED"));





    public static final SubLSymbol USE_CACHED_GENERATIONS_P = makeSymbol("USE-CACHED-GENERATIONS-P");

    public static final SubLList $list47 = list(makeKeyword("DEFAULT"), makeKeyword("NONE"));

    public static final SubLList $list48 = list(makeKeyword("PREFERRED"), makeKeyword("REQUIRED"));

    public static final SubLList $list49 = list(makeKeyword("ANY"), makeKeyword("DEFAULT"), list(reader_make_constant_shell(makeString("nonPlural-Generic"))));

    public static final SubLSymbol PPH_JAVALIST_STRING = makeSymbol("PPH-JAVALIST-STRING");



    public static final SubLSymbol GENERATE_DISAMBIGUATION_PHRASES_FOR_JAVA = makeSymbol("GENERATE-DISAMBIGUATION-PHRASES-FOR-JAVA");

    public static final SubLList $list53 = list(makeSymbol("OBJECTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("FORCE"), makeKeyword("DEFAULT")), list(makeSymbol("NL-PREDS"), makeKeyword("DEFAULT")), list(makeSymbol("LANGUAGE-MT"), makeSymbol("*PPH-LANGUAGE-MT*")), list(makeSymbol("DOMAIN-MT"), makeSymbol("*PPH-DOMAIN-MT*")), list(makeSymbol("FORBIDDEN-STRINGS"), NIL), list(makeSymbol("USE-CACHED-GENERATIONS"), makeKeyword("REQUIRED")));

    public static final SubLString $str54$_param_FORCE__pph_force_p__param_ = makeString("@param FORCE; pph-force-p\n@param FORBIDDEN-STRINGS; listp of strings to *not* use as a paraphrase for any member of OBJECTS.\n@param USE-CACHED-GENERATIONS; :required, :preferred, or :disallowed.  Required means that it will only\n  use cached generations.  :disallowed means that it will never use them (and will always generate fresh from\n  the KB, and :preferred means that it will use the cached generations unless they turn out ambiguous, at\n  which point fresh generations from the KB will be used.\n@return LISTP of PPH-JAVALIST-P objects, one for each item on OBJECTS.\nAn effort is made to have the paraphrase for each item be sufficiently distinct\nto distinguish it from the other items.\n@sideeffects: Calls *PARTIAL-RESULTS-NOTIFICATION-FN* with a dictionary of new INDEX -> JAVALIST mappings.");

    public static final SubLList $list55 = list(list(makeSymbol("OBJECTS"), makeSymbol("LISTP")), list(makeSymbol("FORCE"), makeSymbol("KEYWORDP")), list(makeSymbol("NL-PREDS"), makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?")), list(makeSymbol("LANGUAGE-MT"), makeSymbol("HLMT?")), list(makeSymbol("DOMAIN-MT"), makeSymbol("HLMT?")), list(makeSymbol("FORBIDDEN-STRINGS"), makeSymbol("LIST-OF-STRING-P")), list(makeSymbol("USE-CACHED-GENERATIONS"), makeSymbol("USE-CACHED-GENERATIONS-P")));

    public static final SubLList $list56 = list(makeSymbol("LISTP"));

    public static final SubLString $str57$ALPHABETIZE_PPH_JAVALISTS_passed_ = makeString("ALPHABETIZE-PPH-JAVALISTS passed ~S javalists, ~S objects.");

    public static final SubLSymbol PPH_FORCE_P = makeSymbol("PPH-FORCE-P");

    public static final SubLSymbol $sym59$VALID_PPH_BLACKLIST_ = makeSymbol("VALID-PPH-BLACKLIST?");

    public static final SubLString $str60$__Trying_default_precision___S___ = makeString("~&Trying default precision: ~S.~%");



    private static final SubLString $str62$__Working_on_dupe_list___S__ = makeString("~&Working on dupe list: ~S~%");

    private static final SubLString $str63$__Trying_to_reparaphrase__S___ = makeString("~&Trying to reparaphrase ~S.~%");

    private static final SubLString $str64$__Trying_targeted_precision__S_fo = makeString("~&Trying targeted precision ~S for ~S");



    private static final SubLString $str66$__New_paraphrase_with_precision__ = makeString("~&New paraphrase with precision ~S for ~S:~% ~S");

    private static final SubLString $str67$__Trying_full_precision_for__S = makeString("~&Trying full precision for ~S");

    private static final SubLString $str68$__New_paraphrase_with_full_precis = makeString("~&New paraphrase with full precision for ~S:~% ~S");

    private static final SubLString $str69$__Changing_output_list_for__S_fro = makeString("~&Changing output-list for ~S from~% ~S to~% ~S.~%");

    private static final SubLString $str70$Timed_out_generating_disambiguati = makeString("Timed out generating disambiguation phrases for~% ~S~%");

    private static final SubLList $list71 = list(reader_make_constant_shell(makeString("nonPlural-Generic")));







    private static final SubLSymbol $sym75$_EXIT = makeSymbol("%EXIT");





    private static final SubLSymbol $TOP_LEVEL_ONLY = makeKeyword("TOP-LEVEL-ONLY");

    private static final SubLString $str79$Setting_cycl_for__S_to__S_since_i = makeString("Setting cycl for ~S to ~S since it lacks a valid arg-position.");

    private static final SubLString $str80$Couldn_t_dereference_arg_position = makeString("Couldn't dereference arg-position ~S of ~S");

    private static final SubLString $str81$CycL_on__S_doesn_t_match_CycL__S = makeString("CycL on ~S doesn't match CycL ~S");



    private static final SubLSymbol $sym83$KEYWORD_OR_HLMT_ = makeSymbol("KEYWORD-OR-HLMT?");



    private static final SubLSymbol $sym85$GENERATE_TEXT_W_SENTENTIAL_FORCE = makeSymbol("GENERATE-TEXT-W/SENTENTIAL-FORCE");

    private static final SubLList $list86 = list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("FORCE"), makeKeyword("DEFAULT")), list(makeSymbol("NL-PREDS"), makeKeyword("DEFAULT")), list(makeSymbol("LANGUAGE-MT"), makeKeyword("DEFAULT")), list(makeSymbol("DOMAIN-MT"), makeKeyword("DEFAULT")), list(makeSymbol("MODE"), makeKeyword("TEXT")), list(makeSymbol("FOCUS-ARG"), NIL));

    private static final SubLString $str87$generates_text_for_a_given_object = makeString("generates text for a given object.  This is intended to be the\n  main gateway into the generation code for formulas.\n  @param OBJECT CYCL-EXPRESSION-P; the object for which text should be generated.\n  @param FORCE pph-force-p; the sentential force of the text to be generated.\n@return 0 STRINGP or NIL; the string corresponding to object.\n@return 1 pred\n@return 2 justification\n@return 3 pph-output-list-p\n@return 4 non-negative-integer-p -- number of demerits associated with this paraphrase\n@return 5 pph-phrase-p or NIL -- root phrase for the paraphrase");

    private static final SubLList $list88 = list(list(makeSymbol("OBJECT"), makeSymbol("CYCL-EXPRESSION-P")), list(makeSymbol("FORCE"), makeSymbol("PPH-FORCE-P")), list(makeSymbol("NL-PREDS"), makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?")), list(makeSymbol("LANGUAGE-MT"), makeSymbol("VALID-PPH-LANGUAGE-MT-SPECIFIER?")), list(makeSymbol("DOMAIN-MT"), makeSymbol("KEYWORD-OR-HLMT?")), list(makeSymbol("MODE"), makeSymbol("KEYWORDP")), list(makeSymbol("FOCUS-ARG"), list(makeSymbol("NIL-OR"), makeSymbol("NON-NEGATIVE-INTEGER-P"))));

    public static final SubLList $list89 = list(makeSymbol("STRING-OR-NIL-P"), makeSymbol("PREDICATE-OR-NIL-P"), makeSymbol("LISTP"), makeSymbol("PPH-OUTPUT-LIST-P"));

    private static final SubLSymbol $generate_text_bad_results$ = makeSymbol("*GENERATE-TEXT-BAD-RESULTS*");

    private static final SubLSymbol $sym91$_ = makeSymbol(">");

    private static final SubLString $str92$_tmp_ = makeString("/tmp/");



    private static final SubLString $str94$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str95$__Term_AForce_AParaphrase_ADemeri = makeString("~&Term~AForce~AParaphrase~ADemerits~ANL Preds~ALanguage Mt~ADomain Mt~AMode~AFocus Arg~%");

    private static final SubLList $list96 = cons(makeSymbol("KEY"), makeSymbol("DEMERITS"));

    private static final SubLList $list97 = list(makeSymbol("TERM"), makeSymbol("FORCE"), makeSymbol("NL-PREDS"), makeSymbol("LANGUAGE-MT"), makeSymbol("DOMAIN-MT"), makeSymbol("MODE"), makeSymbol("FOCUS-ARG"), makeSymbol("STRING"));

    private static final SubLString $str98$___A__ = makeString("~&~A~%");

    private static final SubLString $str99$Rechecking_generate_text_bad_resu = makeString("Rechecking generate-text bad results...");

    private static final SubLList $list100 = list(makeSymbol("OBJECT"), makeSymbol("FORCE"), makeSymbol("NL-PREDS"), makeSymbol("LANGUAGE-MT"), makeSymbol("DOMAIN-MT"), makeSymbol("MODE"), makeSymbol("FOCUS-ARG"), makeSymbol("STRING"));

    private static final SubLSymbol $sym101$INVALID_FORT_ = makeSymbol("INVALID-FORT?");

    private static final SubLString $str102$Took__S_seconds_to_paraphrase____ = makeString("Took ~S seconds to paraphrase~% ~S~%");

    private static final SubLString $str103$__Suspending_discourse_referent_t = makeString("~&Suspending discourse referent tracking for ~S~%");



    private static final SubLString $str105$__Making_new_phrase_with_cycl__S_ = makeString("~&Making new phrase with cycl ~S~%");

    private static final SubLSymbol $sym106$_PPH_INITIALIZED__ = makeSymbol("*PPH-INITIALIZED?*");



    private static final SubLString $str108$No_KB_loaded__Couldn_t_initialize = makeString("No KB loaded. Couldn't initialize paraphrase code.");

    private static final SubLSymbol $NO_KB_LOADED = makeKeyword("NO-KB-LOADED");

    private static final SubLSymbol $pph_recursion_limit$ = makeSymbol("*PPH-RECURSION-LIMIT*");



    private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    private static final SubLString $str113$__Entering_PPH_POSSIBLY_BINDING_V = makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");

    private static final SubLString $str114$__Using_mapped_string__S_for__S__ = makeString("~&Using mapped string ~S for ~S.~%");

    private static final SubLObject $$PossessivePhrase = reader_make_constant_shell(makeString("PossessivePhrase"));

    private static final SubLString $str116$Recursion_limit_exceeded_on__S_ = makeString("Recursion limit exceeded on ~S.");

    private static final SubLString $str117$__Paraphrasing__S_with_agr___S___ = makeString("~&Paraphrasing ~S with agr: ~S...~%");



    private static final SubLString $str119$Abandoning_unexpressed_negations_ = makeString("Abandoning unexpressed negations: ~S");

    private static final SubLString $str120$__PPH_PHRASE_GENERATE_Output_list = makeString("~&PPH-PHRASE-GENERATE Output list is ~S.~%");

    private static final SubLString $str121$__Leaving_PPH_POSSIBLY_BINDING_VA = makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");

    private static final SubLString $str122$______and__pph_var_types__are_now = makeString("~&... and *pph-var-types* are now ~S~%");

    private static final SubLString $str123$Repeating_sequence_in_paraphrase_ = makeString("Repeating sequence in paraphrase args: ~s");



    private static final SubLString $str125$Inside_operator_scope__S = makeString("Inside operator scope ~S");

    private static final SubLString $str126$Leaving_operator_scope__S = makeString("Leaving operator scope ~S");

    private static final SubLString $str127$Skipping__S___ = makeString("Skipping ~S.~%");



    private static final SubLSymbol $DONT_NEED_BACKUP_PHRASE = makeKeyword("DONT-NEED-BACKUP-PHRASE");

    private static final SubLSymbol PPH_PHRASE_TRY_METHODS = makeSymbol("PPH-PHRASE-TRY-METHODS");

    private static final SubLSymbol $NO_ZERO_DEMERIT_METHODS = makeKeyword("NO-ZERO-DEMERIT-METHODS");





    private static final SubLList $list134 = list(makeSymbol("METHOD-SYMBOL"), makeSymbol("METHOD-DEMERITS"));

    private static final SubLString $str135$_S_is_not_an_FBOUNDP_symbol_ = makeString("~S is not an FBOUNDP symbol.");

    private static final SubLString $str136$___S_demerits_exceeds_cutoff_of__ = makeString("~&~S demerits exceeds cutoff of ~S~% ~S from ~S,~% ~S from dtrs.~%");









    private static final SubLString $str141$__Trying__S___Remaining___S = makeString("~&Trying ~S~% Remaining: ~S");

    private static final SubLSymbol $TOO_MUCH_TIME = makeKeyword("TOO-MUCH-TIME");

    private static final SubLString $str143$Exceeded_timeout_on____S = makeString("Exceeded timeout on~% ~S");



    private static final SubLString $str145$Aborting_PPH_call___ = makeString("Aborting PPH call...");

    private static final SubLString $str146$Zero_demerit_methods_failed____In = makeString("Zero-demerit methods failed:~% Input: ~S~% Agr-preds: ~S~% Failed methods:");

    private static final SubLString $str147$_____S____Reported_Problems___S__ = makeString("~%  ~S~%  Reported Problems: ~S~%");

    private static final SubLString $str148$___Successful_method___S__demerit = makeString("~& Successful method: ~S (demerits ~S)~% Paraphrase: ~S~%");

    private static final SubLString $str149$__Context____Top_level_CycL___S__ = makeString("~&Context:~% Top-level CycL: ~S~% Language mt: ~S~% Domain mt: ~S~% Mode: ~S~%");

    private static final SubLString $str150$_Precision___S__ = makeString(" Precision: ~S~%");

    private static final SubLString $str151$__Trying__S_____ = makeString("~&Trying ~S...~%");

    private static final SubLString $str152$__Entering_PPH_SETTING_VAR_TYPES_ = makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");

    private static final SubLString $str153$__Adding__S_demerits_for__S____S = makeString("~&Adding ~S demerits for ~S~% ~S");

    private static final SubLString $str154$__PPH_phrase_immediately_before_c = makeString("~%PPH phrase immediately before calling ~S:~% ~S");

    private static final SubLString $str155$__PPH_phrase_immediately_after_ca = makeString("~%PPH phrase immediately after calling ~S:~% ~S");

    private static final SubLString $str156$_S_failed_ = makeString("~S failed.");

    private static final SubLString $str157$___S_demerits_exceeds_cutoff_of__ = makeString("~&~S demerits exceeds cutoff of ~S~% ~S");

    private static final SubLString $str158$___S_____S_demerits___S___ = makeString("~&~S -> ~S demerits: ~S.~%");

    private static final SubLString $str159$____S__S______S___S__ = makeString("~%(~S ~S):~% ~S (~S).");

    private static final SubLString $str160$____S__S______S = makeString("~%(~S ~S):~% ~S");

    private static final SubLString $str161$__Leaving_PPH_SETTING_VAR_TYPES_I = makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");

    private static final SubLString $str162$___Output_list___S__ = makeString("~& Output list: ~S~%");

    private static final SubLString $str163$___Setting__S_to____S = makeString("~& Setting ~S to~% ~S");

    private static final SubLString $str164$___Leaving__PPH_VAR_TYPES___S = makeString("~% Leaving *PPH-VAR-TYPES* ~S");

    private static final SubLString $str165$Can_t_use_foolproof_generation_wi = makeString("Can't use foolproof generation with demerit cutoff: ~S.~%");

    private static final SubLString $str166$Can_t_use_foolproof_generation_on = makeString("Can't use foolproof generation on unknown CycL.~%");

    private static final SubLString $$$the = makeString("the");

    private static final SubLString $$$of = makeString("of");

    private static final SubLString $str169$_s = makeString("'s");

    private static final SubLObject $$pronounStrings = reader_make_constant_shell(makeString("pronounStrings"));

    private static final SubLObject $$PossessivePronoun_Post = reader_make_constant_shell(makeString("PossessivePronoun-Post"));

    private static final SubLObject $$OrdinalPhrase = reader_make_constant_shell(makeString("OrdinalPhrase"));

    private static final SubLString $$$th = makeString("th");

    private static final SubLString $$$Java_Phrase_Supercategory = makeString("Java Phrase Supercategory");

    private static final SubLString $$$Output_List_Subcategory = makeString("Output List Subcategory");

    private static final SubLString $$$Java_Phrase_Test_Battery = makeString("Java Phrase Test Battery");

    private static final SubLString $$$Output_List_Test_Battery = makeString("Output List Test Battery");



    private static final SubLList $list179 = list(list(makeSymbol("*PPH-TMP-OUTPUT-LIST*"), list(makeSymbol("GENERATE-PPH-OUTPUT-LIST"), list(makeSymbol("PPH-NART-SUBSTITUTE"), makeSymbol("*PPH-TMP-TEST-OBJECT*")), makeKeyword("ANY"), list(makeSymbol("PPH-REGRESSION-ITEM-LANGUAGE-MT"), makeSymbol("*PPH-TMP-REGRESSION-ITEM*")), list(makeSymbol("PPH-REGRESSION-ITEM-DOMAIN-MT"), makeSymbol("*PPH-TMP-REGRESSION-ITEM*")), makeKeyword("TEXT"), makeSymbol("*PPH-TMP-FORCE*"))));

    private static final SubLList $list180 = list(list(makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("FORCES"), makeSymbol("DO-IMPERATIVE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list181 = list(makeKeyword("FORCES"), makeKeyword("DO-IMPERATIVE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol DO_PPH_REGRESSION_STORE = makeSymbol("DO-PPH-REGRESSION-STORE");

    public static final SubLList $list186 = list(makeKeyword("TEST-FUNC"), list(makeSymbol("FUNCTION"), makeSymbol("PPH-MAIN-REGRESSION-PRESCREENING")));

    private static final SubLSymbol DO_PPH_FORCES_LIST = makeSymbol("DO-PPH-FORCES-LIST");

    private static final SubLSymbol WITH_PPH_TEST_OBJECT = makeSymbol("WITH-PPH-TEST-OBJECT");

    private static final SubLSymbol WITH_OUTPUT_LIST = makeSymbol("WITH-OUTPUT-LIST");

    private static final SubLList $list190 = list(makeSymbol("PWHEN"), list(makeSymbol("EL-FORMULA-P"), makeSymbol("*PPH-TMP-TEST-OBJECT*")), list(makeSymbol("CALL-PPH-TEST-FUNCTION-INTELLIGENTLY"), list(makeSymbol("FUNCTION"), makeSymbol("TEST-NO-CONSECUTIVE-DUPLICATES"))), list(makeSymbol("CALL-PPH-TEST-FUNCTION-INTELLIGENTLY"), list(makeSymbol("FUNCTION"), makeSymbol("VERIFY-ARG-POSITIONS-FAITHFUL"))), list(makeSymbol("CALL-PPH-TEST-FUNCTION-INTELLIGENTLY"), list(makeSymbol("FUNCTION"), makeSymbol("VERIFY-ARG-POSITIONS-CORRECT"))), list(makeSymbol("CALL-PPH-TEST-FUNCTION-INTELLIGENTLY"), list(makeSymbol("FUNCTION"), makeSymbol("TEST-REALLY-SANE"))));







    private static final SubLList $list194 = list(makeSymbol("PPH-TEST-CASE-TABLES"));







    private static final SubLList $list198 = list(list(list(list(reader_make_constant_shell(makeString("elementTypesInFormula-List")), reader_make_constant_shell(makeString("Salt-NaCl")), list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("Sodium")), reader_make_constant_shell(makeString("Chlorine")))), makeKeyword("DECLARATIVE")), makeString("Sodium and chlorine are the complete list of elements in the chemical formula of sodium chloride.")), list(list(list(reader_make_constant_shell(makeString("elementTypesInFormula-List")), reader_make_constant_shell(makeString("Salt-NaCl")), list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("Sodium")), reader_make_constant_shell(makeString("Chlorine")))), makeKeyword("INTERROGATIVE")), makeString("Are sodium and chlorine the complete list of elements in the chemical formula of sodium chloride?")));

    private static final SubLSymbol GENERATE_DISAMBIGUATION_PHRASES_INT = makeSymbol("GENERATE-DISAMBIGUATION-PHRASES-INT");

    private static final SubLList $list200 = list(list(list(list(reader_make_constant_shell(makeString("Plotting"))), makeKeyword("DEFAULT"), list(reader_make_constant_shell(makeString("gerund-Plural")), reader_make_constant_shell(makeString("wordStrings")), reader_make_constant_shell(makeString("properNameStrings"))), list(reader_make_constant_shell(makeString("MtSpace")), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("CyclishParaphraseMt")), reader_make_constant_shell(makeString("MedicalLexicalMt")), reader_make_constant_shell(makeString("TechnicalEnglishLexicalMt"))), list(reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("Now")))), list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("CyclishParaphraseMt")), list(reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("Now")))), makeKeyword("TEXT"), makeKeyword("JAVALISTS"), NIL), list(list(makeString("plottings"), list(list(makeString("plottings"), reader_make_constant_shell(makeString("Plotting")), NIL, NIL, NIL, ZERO_INTEGER))))));

    public static SubLObject generate_phrase(final SubLObject v_object, SubLObject nl_preds, SubLObject determiner, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject top, SubLObject focus_arg) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (determiner == UNPROVIDED) {
            determiner = NIL;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (top == UNPROVIDED) {
            top = NIL;
        }
        if (focus_arg == UNPROVIDED) {
            focus_arg = NIL;
        }
        SubLSystemTrampolineFile.enforceType(v_object, CYCL_EXPRESSION_P);
        SubLSystemTrampolineFile.enforceType(nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_);
        SubLSystemTrampolineFile.enforceType(determiner, KEYWORD_OR_NIL_P);
        SubLSystemTrampolineFile.enforceType(language_mt, $sym5$HLMT_);
        SubLSystemTrampolineFile.enforceType(domain_mt, $sym5$HLMT_);
        SubLSystemTrampolineFile.enforceType(mode, KEYWORDP);
        SubLSystemTrampolineFile.enforceType(top, BOOLEANP);
        SubLSystemTrampolineFile.enforceType(focus_arg, NON_NEGATIVE_INTEGER_OR_NIL_P);
        SubLSystemTrampolineFile.enforceType(v_object, CYCL_EXPRESSION_P);
        SubLSystemTrampolineFile.enforceType(nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_);
        return generate_phrase_no_checks(v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg);
    }

    public static SubLObject generate_phrase_no_checks(final SubLObject v_object, SubLObject nl_preds, SubLObject determiner, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject top, SubLObject focus_arg) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (determiner == UNPROVIDED) {
            determiner = NIL;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        if (top == UNPROVIDED) {
            top = NIL;
        }
        if (focus_arg == UNPROVIDED) {
            focus_arg = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return generate_phrase_no_checks_memoized(v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg, pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread));
    }

    public static SubLObject generate_phrase_no_checks_memoized_internal(SubLObject v_object, SubLObject nl_preds, final SubLObject determiner, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, final SubLObject top, final SubLObject focus_arg, final SubLObject demerit_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        final SubLObject original = copy_expression(v_object);
        SubLObject ret_string = NIL;
        SubLObject pred = NIL;
        SubLObject justifications = NIL;
        SubLObject output_list = NIL;
        SubLObject demerits = NIL;
        SubLObject phrase = NIL;
        final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
        try {
            Errors.$continue_cerrorP$.bind(NIL, thread);
            pph_error.$pph_error_handling_onP$.bind(T, thread);
            if (NIL != pph_error.pph_break_on_errorP()) {
                final SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                try {
                    pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$2 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                    try {
                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                        final SubLObject reuseP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        try {
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$3 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                final SubLObject new_or_reused = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$4 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                    final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding(thread);
                                    try {
                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                        try {
                                            final SubLObject _prev_bind_0_$6 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$7 = pph_vars.$pph_cycls$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_demerit_cutoff$.bind(demerit_cutoff, thread);
                                                pph_vars.$pph_cycls$.bind(cons(pph_utilities.pph_hl_to_el(v_object), pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
                                                if ($DEFAULT == nl_preds) {
                                                    nl_preds = pph_utilities.pph_default_nl_preds(v_object, $NONE, language_mt, domain_mt);
                                                }
                                                final SubLObject top_levelP = pph_macros.handling_pph_method_failures_top_level_p();
                                                final SubLObject _prev_bind_0_$7 = pph_macros.$suspended_paraphrase_methods$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$8 = pph_macros.$handling_pph_method_failuresP$.currentBinding(thread);
                                                try {
                                                    pph_macros.$suspended_paraphrase_methods$.bind(NIL != top_levelP ? set.new_set(symbol_function(EQUAL), pph_macros.max_suspended_method_depth()) : pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                                                    pph_macros.$handling_pph_method_failuresP$.bind(T, thread);
                                                    for (SubLObject failed_method = NIL, tried_oneP = NIL; (NIL != failed_method) || (NIL == tried_oneP); tried_oneP = T) {
                                                        if (NIL != failed_method) {
                                                            pph_macros.note_suspended_paraphrase_method_plist(failed_method);
                                                            failed_method = NIL;
                                                        }
                                                        try {
                                                            thread.throwStack.push($PPH_METHOD_FAILURE);
                                                            final SubLObject _prev_bind_0_$8 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$9 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                                                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                                                try {
                                                                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                                    final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$10 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$14 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, $pph_sbhl_spaces_to_resource$.getGlobalValue()), thread);
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                        if (NIL != determiner) {
                                                                            final SubLObject new_format_string = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str19$Don_t_know_what_to_do_with_determ) });
                                                                            pph_error.pph_handle_error(new_format_string, list(determiner));
                                                                        }
                                                                        v_object = pph_utilities.do_tou_substitution(v_object);
                                                                        v_object = pph_utilities.pph_nart_substitute(v_object);
                                                                        final SubLObject _prev_bind_0_$10 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$11 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$pph_language_mt$.bind(language_mt, thread);
                                                                            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                            phrase = pph_phrase.new_pph_phrase_for_cycl(v_object, pph_utilities.pph_new_identity_map(), T);
                                                                            if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
                                                                                final SubLObject _prev_bind_0_$11 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$12 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$paraphrase_mode$.bind(mode, thread);
                                                                                    pph_vars.$pph_track_discourse_referentsP$.bind(makeBoolean((NIL != pph_vars.$pph_track_discourse_referentsP$.getDynamicValue(thread)) && (NIL == pph_discourse_referent_tracking_pointlessP(v_object))), thread);
                                                                                    pph_phrase.pph_phrase_update_agr_preds(phrase, nl_preds, UNPROVIDED);
                                                                                    pph_phrase.pph_phrase_set_focus_arg(phrase, focus_arg);
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject ret_string_$19 = generate_phrase_int(phrase, top);
                                                                                    final SubLObject pred_$20 = thread.secondMultipleValue();
                                                                                    final SubLObject justifications_$21 = thread.thirdMultipleValue();
                                                                                    final SubLObject output_list_$22 = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    ret_string = ret_string_$19;
                                                                                    pred = pred_$20;
                                                                                    justifications = justifications_$21;
                                                                                    output_list = output_list_$22;
                                                                                    demerits = pph_phrase.pph_phrase_demerits(phrase);
                                                                                } finally {
                                                                                    pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_1_$12, thread);
                                                                                    pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_$11, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_1_$11, thread);
                                                                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$10, thread);
                                                                        }
                                                                    } finally {
                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$14, thread);
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$10, thread);
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$9, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values = getValuesAsVector();
                                                                        pph_macros.destroy_new_pph_phrases();
                                                                        restoreValuesFromVector(_values);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                                                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$9, thread);
                                                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$8, thread);
                                                            }
                                                        } catch (final Throwable ccatch_env_var) {
                                                            failed_method = Errors.handleThrowable(ccatch_env_var, $PPH_METHOD_FAILURE);
                                                        } finally {
                                                            thread.throwStack.pop();
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$handling_pph_method_failuresP$.rebind(_prev_bind_1_$8, thread);
                                                    pph_macros.$suspended_paraphrase_methods$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            } finally {
                                                pph_vars.$pph_cycls$.rebind(_prev_bind_1_$7, thread);
                                                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$6, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
                                    }
                                } finally {
                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$4, thread);
                                }
                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                }
                            } finally {
                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                if (NIL == reuseP) {
                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                }
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                            }
                        }
                    } finally {
                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$1, thread);
                }
            } else {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject _prev_bind_0_$16 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                            try {
                                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$17 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                    final SubLObject reuseP2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    try {
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$18 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                            final SubLObject new_or_reused2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$19 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                final SubLObject local_state2 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                final SubLObject _prev_bind_0_$20 = memoization_state.$memoization_state$.currentBinding(thread);
                                                try {
                                                    memoization_state.$memoization_state$.bind(local_state2, thread);
                                                    final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                                                    try {
                                                        final SubLObject _prev_bind_0_$21 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$13 = pph_vars.$pph_cycls$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_demerit_cutoff$.bind(demerit_cutoff, thread);
                                                            pph_vars.$pph_cycls$.bind(cons(pph_utilities.pph_hl_to_el(v_object), pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
                                                            if ($DEFAULT == nl_preds) {
                                                                nl_preds = pph_utilities.pph_default_nl_preds(v_object, $NONE, language_mt, domain_mt);
                                                            }
                                                            final SubLObject top_levelP2 = pph_macros.handling_pph_method_failures_top_level_p();
                                                            final SubLObject _prev_bind_0_$22 = pph_macros.$suspended_paraphrase_methods$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$14 = pph_macros.$handling_pph_method_failuresP$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$suspended_paraphrase_methods$.bind(NIL != top_levelP2 ? set.new_set(symbol_function(EQUAL), pph_macros.max_suspended_method_depth()) : pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                                                                pph_macros.$handling_pph_method_failuresP$.bind(T, thread);
                                                                for (SubLObject failed_method2 = NIL, tried_oneP2 = NIL; (NIL != failed_method2) || (NIL == tried_oneP2); tried_oneP2 = T) {
                                                                    if (NIL != failed_method2) {
                                                                        pph_macros.note_suspended_paraphrase_method_plist(failed_method2);
                                                                        failed_method2 = NIL;
                                                                    }
                                                                    try {
                                                                        thread.throwStack.push($PPH_METHOD_FAILURE);
                                                                        final SubLObject _prev_bind_0_$23 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$15 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                                                                        try {
                                                                            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                                                            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                                                            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                                                            try {
                                                                                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                                                final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$16 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_2_$15 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, $pph_sbhl_spaces_to_resource$.getGlobalValue()), thread);
                                                                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                                                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                                    if (NIL != determiner) {
                                                                                        final SubLObject new_format_string2 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str19$Don_t_know_what_to_do_with_determ) });
                                                                                        pph_error.pph_handle_error(new_format_string2, list(determiner));
                                                                                    }
                                                                                    v_object = pph_utilities.do_tou_substitution(v_object);
                                                                                    v_object = pph_utilities.pph_nart_substitute(v_object);
                                                                                    final SubLObject _prev_bind_0_$25 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$17 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_vars.$pph_language_mt$.bind(language_mt, thread);
                                                                                        pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                        phrase = pph_phrase.new_pph_phrase_for_cycl(v_object, pph_utilities.pph_new_identity_map(), T);
                                                                                        if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
                                                                                            final SubLObject _prev_bind_0_$26 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$18 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
                                                                                            try {
                                                                                                pph_vars.$paraphrase_mode$.bind(mode, thread);
                                                                                                pph_vars.$pph_track_discourse_referentsP$.bind(makeBoolean((NIL != pph_vars.$pph_track_discourse_referentsP$.getDynamicValue(thread)) && (NIL == pph_discourse_referent_tracking_pointlessP(v_object))), thread);
                                                                                                pph_phrase.pph_phrase_update_agr_preds(phrase, nl_preds, UNPROVIDED);
                                                                                                pph_phrase.pph_phrase_set_focus_arg(phrase, focus_arg);
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject ret_string_$20 = generate_phrase_int(phrase, top);
                                                                                                final SubLObject pred_$21 = thread.secondMultipleValue();
                                                                                                final SubLObject justifications_$22 = thread.thirdMultipleValue();
                                                                                                final SubLObject output_list_$23 = thread.fourthMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                ret_string = ret_string_$20;
                                                                                                pred = pred_$21;
                                                                                                justifications = justifications_$22;
                                                                                                output_list = output_list_$23;
                                                                                                demerits = pph_phrase.pph_phrase_demerits(phrase);
                                                                                            } finally {
                                                                                                pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_1_$18, thread);
                                                                                                pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_$26, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_1_$17, thread);
                                                                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$25, thread);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$15, thread);
                                                                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$16, thread);
                                                                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$24, thread);
                                                                                }
                                                                            } finally {
                                                                                final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values4 = getValuesAsVector();
                                                                                    pph_macros.destroy_new_pph_phrases();
                                                                                    restoreValuesFromVector(_values4);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                                                                            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$15, thread);
                                                                            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$23, thread);
                                                                        }
                                                                    } catch (final Throwable ccatch_env_var2) {
                                                                        failed_method2 = Errors.handleThrowable(ccatch_env_var2, $PPH_METHOD_FAILURE);
                                                                    } finally {
                                                                        thread.throwStack.pop();
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$handling_pph_method_failuresP$.rebind(_prev_bind_1_$14, thread);
                                                                pph_macros.$suspended_paraphrase_methods$.rebind(_prev_bind_0_$22, thread);
                                                            }
                                                        } finally {
                                                            pph_vars.$pph_cycls$.rebind(_prev_bind_1_$13, thread);
                                                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$21, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values5 = getValuesAsVector();
                                                            memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                                            restoreValuesFromVector(_values5);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                                        }
                                                    }
                                                } finally {
                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            } finally {
                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$19, thread);
                                            }
                                            if ((new_or_reused2 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$18, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values6 = getValuesAsVector();
                                            if (NIL == reuseP2) {
                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                            }
                                            restoreValuesFromVector(_values6);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$17, thread);
                                }
                            } finally {
                                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$16, thread);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                    }
                } catch (final Throwable ccatch_env_var3) {
                    error_message = Errors.handleThrowable(ccatch_env_var3, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str22$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        } finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != error_message) {
            ret_string = string_utilities.str_by_type(v_object);
        }
        SubLObject any_changeP = NIL;
        thread.resetMultipleValues();
        final SubLObject output_list_$24 = pph_sanitize_output_list(output_list, original);
        final SubLObject any_changeP_$53 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        output_list = output_list_$24;
        any_changeP = any_changeP_$53;
        if (NIL != any_changeP) {
            ret_string = pph_phrase.pph_phrase_output_list_string(output_list, eq(mode, $HTML));
        }
        ret_string = pph_string.pph_string_if_non_null_to_output_format(ret_string, mode);
        if ((NIL != pph_data_structures.valid_pph_phrase_p(phrase)) && (!pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).equal(v_object))) {
            for (SubLObject curr = phrase; NIL != curr; curr = (ONE_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(curr))) ? pph_phrase.pph_phrase_nth_dtr(curr, ZERO_INTEGER) : NIL) {
                pph_phrase.pph_phrase_set_cycl(curr, v_object);
            }
        }
        return values(ret_string, pred, justifications, output_list, demerits, NIL != pph_data_structures.valid_pph_phrase_p(phrase) ? phrase : NIL);
    }

    public static SubLObject generate_phrase_no_checks_memoized(final SubLObject v_object, final SubLObject nl_preds, final SubLObject determiner, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, final SubLObject top, final SubLObject focus_arg, final SubLObject demerit_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return generate_phrase_no_checks_memoized_internal(v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg, demerit_cutoff);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PHRASE_NO_CHECKS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PHRASE_NO_CHECKS_MEMOIZED, NINE_INTEGER, $int$256, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GENERATE_PHRASE_NO_CHECKS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_9(v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg, demerit_cutoff);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_object.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_preds.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (determiner.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (language_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (domain_mt.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (mode.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (top.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (focus_arg.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && demerit_cutoff.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(generate_phrase_no_checks_memoized_internal(v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg, demerit_cutoff)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(new SubLObject[]{ v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg, demerit_cutoff }));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject generate_string_from_phrase_naut(final SubLObject phrase_naut, SubLObject language_mt, SubLObject domain_mt, SubLObject force) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (force == UNPROVIDED) {
            force = $NONE;
        }
        assert NIL != pph_types.pph_phrase_nautP(phrase_naut) : "pph_types.pph_phrase_nautP(phrase_naut) " + "CommonSymbols.NIL != pph_types.pph_phrase_nautP(phrase_naut) " + phrase_naut;
        SubLObject to_paraphrase = phrase_naut;
        SubLObject nl_preds = $DEFAULT;
        if (NIL != el_formula_with_operator_p(to_paraphrase, pph_functions.termparaphrasefn())) {
            to_paraphrase = cycl_utilities.nat_arg1(to_paraphrase, UNPROVIDED);
        } else
            if (NIL != el_formula_with_operator_p(to_paraphrase, pph_functions.termparaphrasefn_constrained())) {
                nl_preds = removal_modules_lexicon.preds_from_term_phrases_constraint(cycl_utilities.nat_arg1(to_paraphrase, UNPROVIDED));
                to_paraphrase = cycl_utilities.nat_arg2(to_paraphrase, UNPROVIDED);
            }

        return generate_text_wXsentential_force(to_paraphrase, force, nl_preds, language_mt, domain_mt, $TEXT, UNPROVIDED);
    }

    public static SubLObject generate_good_string_from_phrase_naut(final SubLObject phrase_naut, SubLObject language_mt, SubLObject domain_mt, SubLObject force) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (force == UNPROVIDED) {
            force = $NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        SubLObject string = NIL;
        final SubLObject _prev_bind_0 = pph_error.$pph_break_on_errorP$.currentBinding(thread);
        try {
            pph_error.$pph_break_on_errorP$.bind(T, thread);
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$54 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$55 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        try {
                            pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                            string = generate_string_from_phrase_naut(phrase_naut, language_mt, domain_mt, force);
                        } finally {
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$55, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$54, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            pph_error.$pph_break_on_errorP$.rebind(_prev_bind_0, thread);
        }
        return values(string, error_message);
    }

    public static SubLObject generate_phrase_for_java(final SubLObject v_object, SubLObject nl_preds, SubLObject force, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $HTML;
        }
        SubLSystemTrampolineFile.enforceType(nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_);
        SubLSystemTrampolineFile.enforceType(language_mt, $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_);
        SubLSystemTrampolineFile.enforceType(domain_mt, POSSIBLY_MT_P);
        return generate_phrase_for_java_no_checks(v_object, nl_preds, force, language_mt, domain_mt, mode);
    }

    public static SubLObject cached_paraphrase_for_java(final SubLObject v_object, SubLObject fallback_method) {
        if (fallback_method == UNPROVIDED) {
            fallback_method = PRINC_TO_STRING;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(v_object, CYCL_EXPRESSION_P);
        SubLObject string = NIL;
        SubLObject item = NIL;
        if (NIL != forts.fort_p(v_object)) {
            thread.resetMultipleValues();
            final SubLObject cached_string = pph_utilities.pph_fort_paraphrase_cache_lookup(v_object, UNPROVIDED, UNPROVIDED);
            final SubLObject agr_pred = thread.secondMultipleValue();
            final SubLObject demerits = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((cached_string.isString() && (NIL == pph_vars.pph_too_many_demerits_p(demerits, UNPROVIDED))) && ((NIL == pph_utilities.pph_name_string_predP(agr_pred)) || (NIL != pph_utilities.pph_genl_mtP(nl_generation_fort_cache.nl_generation_fort_cache_paraphrase_mt(UNPROVIDED), pph_vars.$pph_language_mt$.getDynamicValue(thread))))) {
                string = cached_string;
            }
        }
        if (NIL == cycl_string.cycl_string_p(string)) {
            if (NIL != fboundp(fallback_method)) {
                final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                try {
                    pph_vars.$paraphrase_mode$.bind($TEXT, thread);
                    pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
                    string = funcall(fallback_method, v_object);
                } finally {
                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                    pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
                }
            } else {
                Errors.error($str34$Fallback_method__S_is_not_a_known, fallback_method);
            }
        }
        if (NIL != cycl_string.cycl_string_p(string)) {
            item = pph_data_structures.new_pph_phrase_output_item(pph_string.pph_string_from_cycl_string(string), NIL, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            Errors.error($str35$Couldn_t_generate_a_string_for__S, v_object, fallback_method);
        }
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind($HTML, thread);
            pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(item, v_object);
        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        return list(pph_utilities.pph_output_list_to_javalist(list(item)), v_object);
    }

    public static SubLObject cached_disambiguation_paraphrases_for_java(final SubLObject objects, SubLObject fallback_method) {
        if (fallback_method == UNPROVIDED) {
            fallback_method = GENERATE_PHRASE_NO_CHECKS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject abortP = NIL;
        final SubLObject strings = set.new_set(symbol_function(EQUALP), UNPROVIDED);
        SubLObject javalists = NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
            SubLObject list_var = NIL;
            SubLObject v_object = NIL;
            SubLObject done_count = NIL;
            list_var = objects;
            v_object = list_var.first();
            for (done_count = ZERO_INTEGER; (NIL == abortP) && (NIL != list_var); list_var = list_var.rest() , v_object = list_var.first() , done_count = add(ONE_INTEGER, done_count)) {
                final SubLObject javalist = cached_paraphrase_for_java(v_object, fallback_method).first();
                final SubLObject string = pph_utilities.pph_javalist_string(javalist);
                if (NIL != set.set_memberP(string, strings)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str37$Duplicate_javalist_____S, javalist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_disambiguation.pph_note_ambiguous_string(string, v_object);
                    SubLObject list_var_$56 = NIL;
                    SubLObject javalist_$57 = NIL;
                    SubLObject i = NIL;
                    list_var_$56 = javalists;
                    javalist_$57 = list_var_$56.first();
                    for (i = ZERO_INTEGER; NIL != list_var_$56; list_var_$56 = list_var_$56.rest() , javalist_$57 = list_var_$56.first() , i = add(ONE_INTEGER, i)) {
                        if (pph_utilities.pph_javalist_string(javalist_$57).equalp(string)) {
                            final SubLObject n = number_utilities.f_1_(subtract(done_count, i));
                            final SubLObject other_cycl = nth(n, objects);
                            pph_disambiguation.pph_note_ambiguous_string(string, other_cycl);
                        }
                    }
                } else {
                    set.set_add(string, strings);
                }
                javalists = cons(javalist, javalists);
            }
            if (NIL == abortP) {
                SubLObject cdolist_list_var = javalists;
                SubLObject javalist2 = NIL;
                javalist2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == pph_disambiguation.pph_string_ambiguous_p(pph_utilities.pph_javalist_string(javalist2))) {
                        ans = cons(javalist2, ans);
                    } else {
                        ans = cons(pph_disambiguation.pph_try_to_clarify_javalist(javalist2, $NONE, $DEFAULT, UNPROVIDED, UNPROVIDED), ans);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    javalist2 = cdolist_list_var.first();
                } 
            }
        } finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject generate_phrase_for_java_no_checks(final SubLObject v_object, SubLObject nl_preds, SubLObject force, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $HTML;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(narts_high.nart_substitute(v_object), force, language_mt, domain_mt);
        }
        SubLObject ans = NIL;
        SubLObject error_message = NIL;
        SubLObject use_arg_positions_strictlyP = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
        try {
            Errors.$continue_cerrorP$.bind(NIL, thread);
            pph_error.$pph_error_handling_onP$.bind(T, thread);
            if (NIL != pph_error.pph_break_on_errorP()) {
                thread.resetMultipleValues();
                final SubLObject olist = generate_pph_output_list(narts_high.nart_substitute(v_object), nl_preds, language_mt, domain_mt, mode, force);
                final SubLObject pred = thread.secondMultipleValue();
                final SubLObject just = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                justification = just;
                use_arg_positions_strictlyP = list_utilities.sublisp_boolean(find_if(GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                final SubLObject _prev_bind_0_$58 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
                try {
                    pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(makeBoolean((NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P()) && (NIL == use_arg_positions_strictlyP)), thread);
                    ans = (NIL != olist) ? pph_utilities.pph_output_list_to_javalist(olist) : NIL;
                } finally {
                    pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0_$58, thread);
                }
            } else {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$59 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            thread.resetMultipleValues();
                            final SubLObject olist2 = generate_pph_output_list(narts_high.nart_substitute(v_object), nl_preds, language_mt, domain_mt, mode, force);
                            final SubLObject pred2 = thread.secondMultipleValue();
                            final SubLObject just2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            justification = just2;
                            use_arg_positions_strictlyP = list_utilities.sublisp_boolean(find_if(GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            final SubLObject _prev_bind_0_$60 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
                            try {
                                pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(makeBoolean((NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P()) && (NIL == use_arg_positions_strictlyP)), thread);
                                ans = (NIL != olist2) ? pph_utilities.pph_output_list_to_javalist(olist2) : NIL;
                            } finally {
                                pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0_$60, thread);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$59, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str22$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        } finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != error_message) {
            Errors.error(error_message);
        }
        return values(ans, use_arg_positions_strictlyP, justification);
    }

    public static SubLObject gen_template_query_sentence_assertion_p(final SubLObject v_object) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(v_object)) && (NIL != assertions_high.gaf_assertionP(v_object))) && assertions_high.gaf_arg0(v_object).eql($$genTemplate_QuerySentence));
    }

    public static SubLObject generate_phrase_int(final SubLObject phrase, final SubLObject top) {
        pph_utilities.pph_possibly_nartify_phrase(phrase);
        final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
        try {
            pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (NIL != top) {
            pph_vars.$last_pph_sentence$.setDynamicValue(phrase);
        }
        SubLObject string = NIL;
        SubLObject pred = NIL;
        SubLObject justification = NIL;
        SubLObject output_list = NIL;
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
            pred = pph_phrase.pph_phrase_agr_pred(phrase);
            justification = pph_phrase.pph_phrase_gather_supports(phrase);
            output_list = pph_phrase.pph_phrase_output_list(phrase);
        }
        return values(string, pred, justification, output_list);
    }

    public static SubLObject generate_disambiguation_phrase(final SubLObject v_object, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($DEFAULT == force) {
            force = pph_utilities.pph_default_force_for_term(v_object);
        }
        if ($DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(v_object, force, language_mt, domain_mt);
        }
        SubLObject paraphrase = NIL;
        SubLObject pred = NIL;
        SubLObject justification = NIL;
        SubLObject olist = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
        try {
            pph_vars.$use_parenthetical_disambiguationsP$.bind($TOP_LEVEL, thread);
            thread.resetMultipleValues();
            final SubLObject paraphrase_$61 = generate_text_wXsentential_force(v_object, force, nl_preds, language_mt, domain_mt, mode, UNPROVIDED);
            final SubLObject pred_$62 = thread.secondMultipleValue();
            final SubLObject justification_$63 = thread.thirdMultipleValue();
            final SubLObject olist_$64 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            paraphrase = paraphrase_$61;
            pred = pred_$62;
            justification = justification_$63;
            olist = olist_$64;
        } finally {
            pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_0, thread);
        }
        return values(paraphrase, pred, justification, olist);
    }

    public static SubLObject generate_disambiguation_phrases(final SubLObject objects, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject forbidden_strings) {
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (forbidden_strings == UNPROVIDED) {
            forbidden_strings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.list_of_string_p(forbidden_strings) : "string_utilities.list_of_string_p(forbidden_strings) " + "CommonSymbols.NIL != string_utilities.list_of_string_p(forbidden_strings) " + forbidden_strings;
        if ($DEFAULT == force) {
            force = pph_utilities.pph_default_force_for_term(objects.first());
        }
        if ($DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(objects.first(), force, language_mt, domain_mt);
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$65 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$66 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$67 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$68 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    result = generate_disambiguation_phrases_int(objects, force, nl_preds, language_mt, domain_mt, mode, $A_LIST, forbidden_strings);
                                } finally {
                                    final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$68, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$67, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$66, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$65, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject use_cached_generations_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, $list43, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_disambiguation_phrases_for_java(final SubLObject objects, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject forbidden_strings, SubLObject use_cached_generations) {
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (forbidden_strings == UNPROVIDED) {
            forbidden_strings = NIL;
        }
        if (use_cached_generations == UNPROVIDED) {
            use_cached_generations = $REQUIRED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(objects, LISTP);
        SubLSystemTrampolineFile.enforceType(force, KEYWORDP);
        SubLSystemTrampolineFile.enforceType(nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_);
        SubLSystemTrampolineFile.enforceType(language_mt, $sym5$HLMT_);
        SubLSystemTrampolineFile.enforceType(domain_mt, $sym5$HLMT_);
        SubLSystemTrampolineFile.enforceType(forbidden_strings, LIST_OF_STRING_P);
        SubLSystemTrampolineFile.enforceType(use_cached_generations, USE_CACHED_GENERATIONS_P);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$71 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$72 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$73 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$74 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    if (((NIL != subl_promotions.memberP(force, $list47, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(use_cached_generations, $list48, UNPROVIDED, UNPROVIDED))) && (NIL != subl_promotions.memberP(nl_preds, $list49, symbol_function(EQUAL), UNPROVIDED))) {
                                        final SubLObject result = cached_disambiguation_paraphrases_for_java(objects, UNPROVIDED);
                                        if ((use_cached_generations == $REQUIRED) || (NIL == list_utilities.duplicatesP(result, EQUAL, PPH_JAVALIST_STRING))) {
                                            ans = result;
                                        }
                                    }
                                    if (NIL == ans) {
                                        if ($DEFAULT == nl_preds) {
                                            nl_preds = pph_utilities.pph_default_nl_preds(objects.first(), force, language_mt, domain_mt);
                                        }
                                        nl_preds = pph_utilities.pph_convert_required_nl_preds_to_preferred(nl_preds);
                                        ans = generate_disambiguation_phrases_int(objects, force, nl_preds, language_mt, domain_mt, $HTML, $JAVALISTS, forbidden_strings);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$74, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$73, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$72, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$71, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject alphabetize_pph_javalists(final SubLObject javalists, final SubLObject objects, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(javalists) : "Types.listp(javalists) " + "CommonSymbols.NIL != Types.listp(javalists) " + javalists;
        assert NIL != listp(objects) : "Types.listp(objects) " + "CommonSymbols.NIL != Types.listp(objects) " + objects;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.same_length_p(javalists, objects))) {
            Errors.error($str57$ALPHABETIZE_PPH_JAVALISTS_passed_, length(javalists), length(objects));
        }
        final SubLObject annotated = pph_utilities.pph_annotate_javalists(javalists, objects);
        final SubLObject optimized = pph_utilities.possibly_optimize_pph_annotated_javalists_for_alphabetization(annotated);
        final SubLObject sorted = pph_utilities.sort_pph_annotated_javalists(optimized, case_sensitiveP);
        return pph_utilities.unannotate_pph_javalists(sorted);
    }

    public static SubLObject generate_disambiguation_phrases_int(final SubLObject objects, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject return_style, SubLObject forbidden_strings) {
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (return_style == UNPROVIDED) {
            return_style = $A_LIST;
        }
        if (forbidden_strings == UNPROVIDED) {
            forbidden_strings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != pph_speech_act.pph_force_p(force) : "pph_speech_act.pph_force_p(force) " + "CommonSymbols.NIL != pph_speech_act.pph_force_p(force) " + force;
        SubLObject output_lists = NIL;
        SubLObject timed_outP = NIL;
        SubLObject ans = NIL;
        final SubLObject blacklist = pph_blacklist_for_objects_and_strings(objects, forbidden_strings);
        final SubLObject resolved_domain_mt = date_utilities.possibly_bind_temporal_indexical_in_object(domain_mt);
        final SubLObject resolved_language_mt = date_utilities.possibly_bind_temporal_indexical_in_object(language_mt);
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                final SubLObject default_timeout = pph_macros.pph_timeout();
                final SubLObject timeout = (default_timeout.isNumber()) ? multiply(default_timeout, length(objects)) : NIL;
                assert NIL != pph_macros.valid_pph_blacklistP(blacklist) : "pph_macros.valid_pph_blacklistP(blacklist) " + "CommonSymbols.NIL != pph_macros.valid_pph_blacklistP(blacklist) " + blacklist;
                final SubLObject _prev_bind_0_$77 = pph_vars.$pph_term_paraphrase_blacklist$.currentBinding(thread);
                final SubLObject _prev_bind_1_$78 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                final SubLObject _prev_bind_2_$79 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                final SubLObject _prev_bind_4 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                try {
                    pph_vars.$pph_term_paraphrase_blacklist$.bind(blacklist, thread);
                    pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                    pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time(timeout), thread);
                    pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                    pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                    if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                        final SubLObject top_levelP = pph_macros.handling_pph_method_failures_top_level_p();
                        final SubLObject _prev_bind_0_$78 = pph_macros.$suspended_paraphrase_methods$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$79 = pph_macros.$handling_pph_method_failuresP$.currentBinding(thread);
                        try {
                            pph_macros.$suspended_paraphrase_methods$.bind(NIL != top_levelP ? set.new_set(symbol_function(EQUAL), pph_macros.max_suspended_method_depth()) : pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                            pph_macros.$handling_pph_method_failuresP$.bind(T, thread);
                            for (SubLObject failed_method = NIL, tried_oneP = NIL; (NIL != failed_method) || (NIL == tried_oneP); tried_oneP = T) {
                                if (NIL != failed_method) {
                                    pph_macros.note_suspended_paraphrase_method_plist(failed_method);
                                    failed_method = NIL;
                                }
                                try {
                                    thread.throwStack.push($PPH_METHOD_FAILURE);
                                    final SubLObject _prev_bind_0_$79 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                    try {
                                        pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$80 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                            final SubLObject reuseP = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            try {
                                                thread.resetMultipleValues();
                                                final SubLObject _prev_bind_0_$81 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                    final SubLObject new_or_reused = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    final SubLObject _prev_bind_0_$82 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                        final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                        final SubLObject _prev_bind_0_$83 = memoization_state.$memoization_state$.currentBinding(thread);
                                                        try {
                                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                            try {
                                                                SubLObject output_lists_$87 = NIL;
                                                                SubLObject abortP = NIL;
                                                                final SubLObject _prev_bind_0_$84 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                                                try {
                                                                    pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                                                    pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str60$__Trying_default_precision___S___, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED);
                                                                    SubLObject list_var = NIL;
                                                                    SubLObject v_object = NIL;
                                                                    SubLObject ignoreme = NIL;
                                                                    list_var = objects;
                                                                    v_object = list_var.first();
                                                                    for (ignoreme = ZERO_INTEGER; (NIL == abortP) && (NIL != list_var); list_var = list_var.rest() , v_object = list_var.first() , ignoreme = add(ONE_INTEGER, ignoreme)) {
                                                                        final SubLObject olist = generate_pph_output_list_no_checks(v_object, nl_preds, resolved_language_mt, resolved_domain_mt, mode, force);
                                                                        pph_disambiguation.note_pph_output_list_for_disambiguation(ignoreme, olist);
                                                                        if (NIL != pph_phrase.pph_phrase_output_list_p(olist)) {
                                                                            output_lists_$87 = cons(olist, output_lists_$87);
                                                                        } else {
                                                                            abortP = T;
                                                                        }
                                                                    }
                                                                    if (NIL != abortP) {
                                                                        output_lists = $FAILURE;
                                                                    } else {
                                                                        output_lists_$87 = nreverse(output_lists_$87);
                                                                        SubLObject cdolist_list_var;
                                                                        final SubLObject dupe_index_lists = cdolist_list_var = pph_disambiguation.pph_find_duplicates(output_lists_$87);
                                                                        SubLObject dupe_index_list = NIL;
                                                                        dupe_index_list = cdolist_list_var.first();
                                                                        while (NIL != cdolist_list_var) {
                                                                            pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str62$__Working_on_dupe_list___S__, dupe_index_list, UNPROVIDED, UNPROVIDED);
                                                                            final SubLObject dupe_objects = pph_disambiguation.pph_dereference_indexes(dupe_index_list, objects);
                                                                            SubLObject cdolist_list_var_$89 = dupe_index_list;
                                                                            SubLObject ignoreme2 = NIL;
                                                                            ignoreme2 = cdolist_list_var_$89.first();
                                                                            while (NIL != cdolist_list_var_$89) {
                                                                                final SubLObject v_object2 = nth(ignoreme2, objects);
                                                                                pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str63$__Trying_to_reparaphrase__S___, v_object2, UNPROVIDED, UNPROVIDED);
                                                                                final SubLObject new_precision = pph_utilities.pph_precision_for_object(v_object2, dupe_objects);
                                                                                final SubLObject new_demerit_cutoff = pph_disambiguation.pph_demerit_cutoff_from_olist(ignoreme2, output_lists_$87);
                                                                                SubLObject new_output_list = NIL;
                                                                                if (!new_precision.equal(pph_utilities.pph_current_precision())) {
                                                                                    pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str64$__Trying_targeted_precision__S_fo, new_precision, v_object2, UNPROVIDED);
                                                                                    assert NIL != pph_utilities.pph_precision_p(new_precision) : "pph_utilities.pph_precision_p(new_precision) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(new_precision) " + new_precision;
                                                                                    final SubLObject _prev_bind_0_$85 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$80 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_vars.$paraphrase_precision$.bind(new_precision, thread);
                                                                                        pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                                                        new_output_list = generate_pph_output_list_no_checks(v_object2, nl_preds, resolved_language_mt, resolved_domain_mt, mode, force);
                                                                                    } finally {
                                                                                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$80, thread);
                                                                                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$85, thread);
                                                                                    }
                                                                                    pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str66$__New_paraphrase_with_precision__, new_precision, v_object2, new_output_list);
                                                                                }
                                                                                if (new_precision.isList() && ((NIL == new_output_list) || (NIL != pph_disambiguation.pph_output_list_E(new_output_list, nth(ignoreme2, output_lists_$87))))) {
                                                                                    pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str67$__Trying_full_precision_for__S, v_object2, UNPROVIDED, UNPROVIDED);
                                                                                    assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
                                                                                    final SubLObject _prev_bind_0_$86 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$81 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_2_$80 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_vars.$paraphrase_precision$.bind(T, thread);
                                                                                        pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                                                                        pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                                                        new_output_list = generate_pph_output_list_no_checks(v_object2, nl_preds, resolved_language_mt, resolved_domain_mt, mode, force);
                                                                                    } finally {
                                                                                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2_$80, thread);
                                                                                        pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_1_$81, thread);
                                                                                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$86, thread);
                                                                                    }
                                                                                    pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str68$__New_paraphrase_with_full_precis, v_object2, new_output_list, UNPROVIDED);
                                                                                }
                                                                                if (NIL != pph_disambiguation.pph_new_olist_better_than_oldP(new_output_list, nth(ignoreme2, output_lists_$87), v_object2)) {
                                                                                    pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str69$__Changing_output_list_for__S_fro, v_object2, nth(ignoreme2, output_lists_$87), new_output_list);
                                                                                    set_nth(ignoreme2, output_lists_$87, new_output_list);
                                                                                    pph_disambiguation.note_pph_output_list_for_disambiguation(ignoreme2, new_output_list);
                                                                                }
                                                                                cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                                                                                ignoreme2 = cdolist_list_var_$89.first();
                                                                            } 
                                                                            cdolist_list_var = cdolist_list_var.rest();
                                                                            dupe_index_list = cdolist_list_var.first();
                                                                        } 
                                                                        SubLObject cdolist_list_var2 = objects;
                                                                        v_object = NIL;
                                                                        v_object = cdolist_list_var2.first();
                                                                        while (NIL != cdolist_list_var2) {
                                                                            pph_drs.pph_possibly_add_reference_marker(v_object);
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            v_object = cdolist_list_var2.first();
                                                                        } 
                                                                        output_lists = append(output_lists, output_lists_$87);
                                                                    }
                                                                } finally {
                                                                    pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_0_$84, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values = getValuesAsVector();
                                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                    restoreValuesFromVector(_values);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$83, thread);
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$82, thread);
                                                    }
                                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$81, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    if (NIL == reuseP) {
                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                    }
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                                                }
                                            }
                                        } finally {
                                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$80, thread);
                                        }
                                    } finally {
                                        pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$79, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    failed_method = Errors.handleThrowable(ccatch_env_var, $PPH_METHOD_FAILURE);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            }
                        } finally {
                            pph_macros.$handling_pph_method_failuresP$.rebind(_prev_bind_1_$79, thread);
                            pph_macros.$suspended_paraphrase_methods$.rebind(_prev_bind_0_$78, thread);
                        }
                    }
                    timed_outP = pph_macros.pph_timeout_time_reachedP();
                } finally {
                    pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_4, thread);
                    pph_macros.$pph_timeout_time$.rebind(_prev_bind_2_$79, thread);
                    pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_1_$78, thread);
                    pph_vars.$pph_term_paraphrase_blacklist$.rebind(_prev_bind_0_$77, thread);
                }
                if (((NIL != timed_outP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str70$Timed_out_generating_disambiguati, objects);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                if (output_lists.isList()) {
                    SubLObject output_list = NIL;
                    SubLObject output_list_$97 = NIL;
                    SubLObject cycl = NIL;
                    SubLObject cycl_$98 = NIL;
                    output_list = output_lists;
                    output_list_$97 = output_list.first();
                    cycl = objects;
                    cycl_$98 = cycl.first();
                    while ((NIL != cycl) || (NIL != output_list)) {
                        final SubLObject pcase_var = return_style;
                        if (pcase_var.eql($A_LIST)) {
                            final SubLObject string = pph_phrase.pph_phrase_output_list_string(output_list_$97, UNPROVIDED);
                            ans = cons(cons(cycl_$98, string), ans);
                        } else
                            if (pcase_var.eql($JAVALISTS)) {
                                ans = cons(pph_utilities.pph_output_list_to_javalist(output_list_$97), ans);
                            }

                        output_list = output_list.rest();
                        output_list_$97 = output_list.first();
                        cycl = cycl.rest();
                        cycl_$98 = cycl.first();
                    } 
                }
            } finally {
                final SubLObject _prev_bind_0_$89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return nreverse(ans);
    }

    public static SubLObject pph_blacklist_for_objects_and_strings(final SubLObject objects, final SubLObject forbidden_strings) {
        SubLObject blacklist = NIL;
        if (NIL != forbidden_strings) {
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = NIL;
            v_object = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                blacklist = list_utilities.alist_enter(blacklist, v_object, forbidden_strings, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_object = cdolist_list_var.first();
            } 
        }
        return blacklist;
    }

    public static SubLObject generate_disambiguation_phrases_and_types(final SubLObject objects, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject forbidden_strings) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $list71;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (forbidden_strings == UNPROVIDED) {
            forbidden_strings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.list_of_string_p(forbidden_strings) : "string_utilities.list_of_string_p(forbidden_strings) " + "CommonSymbols.NIL != string_utilities.list_of_string_p(forbidden_strings) " + forbidden_strings;
        SubLObject ans = NIL;
        final SubLObject types = pph_disambiguation.pph_disambiguating_generalizations(objects, domain_mt);
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$100 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$101 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$102 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$103 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$104 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                                    try {
                                        pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                        pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                        pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                        try {
                                            final SubLObject _prev_bind_0_$105 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
                                            try {
                                                pph_vars.$use_parenthetical_disambiguationsP$.bind($NEVER, thread);
                                                final SubLObject term_phrase_pairs = generate_disambiguation_phrases(objects, $NONE, nl_preds, language_mt, domain_mt, mode, forbidden_strings);
                                                final SubLObject type_phrase_pairs = generate_disambiguation_phrases(types, $NONE, $list71, language_mt, domain_mt, mode, forbidden_strings);
                                                SubLObject term_pair = NIL;
                                                SubLObject term_pair_$106 = NIL;
                                                SubLObject type_pair = NIL;
                                                SubLObject type_pair_$107 = NIL;
                                                term_pair = term_phrase_pairs;
                                                term_pair_$106 = term_pair.first();
                                                type_pair = type_phrase_pairs;
                                                type_pair_$107 = type_pair.first();
                                                while ((NIL != type_pair) || (NIL != term_pair)) {
                                                    ans = cons(append(list(term_pair_$106.first(), term_pair_$106.rest()), type_pair_$107), ans);
                                                    term_pair = term_pair.rest();
                                                    term_pair_$106 = term_pair.first();
                                                    type_pair = type_pair.rest();
                                                    type_pair_$107 = type_pair.first();
                                                } 
                                            } finally {
                                                pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_0_$105, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                pph_macros.destroy_new_pph_phrases();
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                                            }
                                        }
                                    } finally {
                                        pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                                        pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                                        pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$104, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$103, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$102, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$101, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$108 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$100, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return nreverse(ans);
    }

    public static SubLObject generate_assertion_output_list(final SubLObject assertion, SubLObject language_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        SubLObject olist = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind($NONE, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            olist = generate_pph_output_list(assertion, $DEFAULT, language_mt, assertions_high.assertion_mt(assertion), $HTML, $NONE);
        } finally {
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return pph_methods.pph_output_list_to_assertion_output_list(olist);
    }

    public static SubLObject generate_pph_output_list(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject force) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != pph_speech_act.pph_force_p(force) : "pph_speech_act.pph_force_p(force) " + "CommonSymbols.NIL != pph_speech_act.pph_force_p(force) " + force;
        if ($DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(narts_high.nart_substitute(v_object), force, language_mt, domain_mt);
        }
        if ($DEFAULT == language_mt) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue(thread);
        }
        if (language_mt.isString()) {
            language_mt = pph_utilities.pph_language_mt_from_code(language_mt);
        }
        language_mt = pph_utilities.pph_canonicalize_hlmt(language_mt);
        domain_mt = pph_utilities.pph_canonicalize_hlmt(domain_mt);
        nl_preds = pph_utilities.pph_convert_required_nl_preds_to_preferred(nl_preds);
        return generate_pph_output_list_internal(v_object, nl_preds, language_mt, domain_mt, mode, force, T);
    }

    public static SubLObject generate_pph_output_list_no_checks(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject force) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        return generate_pph_output_list_internal(v_object, nl_preds, language_mt, domain_mt, mode, force, NIL);
    }

    public static SubLObject generate_pph_output_list_internal(final SubLObject v_object, final SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, final SubLObject force, final SubLObject checksP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject pred = NIL;
        SubLObject justification = NIL;
        SubLObject output_list = NIL;
        if (NIL != checksP) {
            thread.resetMultipleValues();
            final SubLObject string_$111 = generate_text_wXsentential_force(v_object, force, nl_preds, language_mt, domain_mt, mode, UNPROVIDED);
            final SubLObject pred_$112 = thread.secondMultipleValue();
            final SubLObject justification_$113 = thread.thirdMultipleValue();
            final SubLObject output_list_$114 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            string = string_$111;
            pred = pred_$112;
            justification = justification_$113;
            output_list = output_list_$114;
        } else {
            thread.resetMultipleValues();
            final SubLObject string_$112 = generate_text_wXsentential_force_no_checks(v_object, force, nl_preds, language_mt, domain_mt, mode, UNPROVIDED);
            final SubLObject pred_$113 = thread.secondMultipleValue();
            final SubLObject justification_$114 = thread.thirdMultipleValue();
            final SubLObject output_list_$115 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            string = string_$112;
            pred = pred_$113;
            justification = justification_$114;
            output_list = output_list_$115;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(makeBoolean((NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P()) && (NIL == find_if(GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED))), thread);
            output_list = pph_sanitize_output_list(copy_list(output_list), v_object);
        } finally {
            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0, thread);
        }
        return values(output_list, pred, justification);
    }

    public static SubLObject generate_pph_output_lists_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject allow_morphological_variantsP, SubLObject allow_nested_variantsP, SubLObject force) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (allow_morphological_variantsP == UNPROVIDED) {
            allow_morphological_variantsP = pph_vars.pph_generate_morphological_alternativesP();
        }
        if (allow_nested_variantsP == UNPROVIDED) {
            allow_nested_variantsP = pph_vars.pph_generate_nested_alternativesP();
        }
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        SubLObject output_lists = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$119 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$120 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$121 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$122 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$123 = Errors.$continue_cerrorP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                                    try {
                                        Errors.$continue_cerrorP$.bind(NIL, thread);
                                        pph_error.$pph_error_handling_onP$.bind(T, thread);
                                        if (NIL != pph_error.pph_break_on_errorP()) {
                                            final SubLObject _prev_bind_0_$124 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$125 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                                            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                                            try {
                                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                                try {
                                                    thread.resetMultipleValues();
                                                    final SubLObject v_pph_phrase = pph_phrase_with_alternatives_for_term(v_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, force);
                                                    final SubLObject doneP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != doneP) {
                                                        SubLObject cdolist_list_var = pph_phrase.pph_phrase_all_output_lists(v_pph_phrase);
                                                        SubLObject output_list = NIL;
                                                        output_list = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            if ((NIL != pph_sentence.pph_sentence_p(v_pph_phrase)) && (NIL == pph_phrase_resolution.pph_phrase_output_list_has_sentential_forceP(output_list, force))) {
                                                                output_list = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(output_list, force);
                                                            }
                                                            final SubLObject item_var = output_list;
                                                            if (NIL == member(item_var, output_lists, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                                                output_lists = cons(item_var, output_lists);
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            output_list = cdolist_list_var.first();
                                                        } 
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$125 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        pph_macros.destroy_new_pph_phrases();
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$125, thread);
                                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$124, thread);
                                            }
                                        } else {
                                            try {
                                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                final SubLObject _prev_bind_0_$126 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        final SubLObject _prev_bind_0_$127 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$126 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                                                        final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                                            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                                            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                                            try {
                                                                thread.resetMultipleValues();
                                                                final SubLObject v_pph_phrase2 = pph_phrase_with_alternatives_for_term(v_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, force);
                                                                final SubLObject doneP2 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != doneP2) {
                                                                    SubLObject cdolist_list_var2 = pph_phrase.pph_phrase_all_output_lists(v_pph_phrase2);
                                                                    SubLObject output_list2 = NIL;
                                                                    output_list2 = cdolist_list_var2.first();
                                                                    while (NIL != cdolist_list_var2) {
                                                                        if ((NIL != pph_sentence.pph_sentence_p(v_pph_phrase2)) && (NIL == pph_phrase_resolution.pph_phrase_output_list_has_sentential_forceP(output_list2, force))) {
                                                                            output_list2 = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(output_list2, force);
                                                                        }
                                                                        final SubLObject item_var2 = output_list2;
                                                                        if (NIL == member(item_var2, output_lists, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                                                            output_lists = cons(item_var2, output_lists);
                                                                        }
                                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                                        output_list2 = cdolist_list_var2.first();
                                                                    } 
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values2 = getValuesAsVector();
                                                                    pph_macros.destroy_new_pph_phrases();
                                                                    restoreValuesFromVector(_values2);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                                                            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$126, thread);
                                                            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$127, thread);
                                                        }
                                                    } catch (final Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_$126, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var) {
                                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                            if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                                                Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str22$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                                            }
                                        }
                                    } finally {
                                        pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                                        Errors.$continue_cerrorP$.rebind(_prev_bind_0_$123, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$129 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$122, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$121, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$120, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$119, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return nreverse(output_lists);
    }

    public static SubLObject generate_pph_string_combo_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject allow_morphological_variantsP, SubLObject allow_nested_variantsP, SubLObject force) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (allow_morphological_variantsP == UNPROVIDED) {
            allow_morphological_variantsP = pph_vars.pph_generate_morphological_alternativesP();
        }
        if (allow_nested_variantsP == UNPROVIDED) {
            allow_nested_variantsP = pph_vars.pph_generate_nested_alternativesP();
        }
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$133 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$134 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$135 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$136 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$137 = Errors.$continue_cerrorP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                                    try {
                                        Errors.$continue_cerrorP$.bind(NIL, thread);
                                        pph_error.$pph_error_handling_onP$.bind(T, thread);
                                        if (NIL != pph_error.pph_break_on_errorP()) {
                                            final SubLObject _prev_bind_0_$138 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$139 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                                            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                                            try {
                                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                                try {
                                                    thread.resetMultipleValues();
                                                    final SubLObject v_pph_phrase = pph_phrase_with_alternatives_for_term(v_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, force);
                                                    final SubLObject doneP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    SubLObject combo = pph_string_combo.pph_phrase_string_combo(v_pph_phrase, UNPROVIDED);
                                                    if (((NIL != doneP) && (NIL != pph_sentence.pph_sentence_p(v_pph_phrase))) && (NIL == pph_string_combo.pph_string_combo_has_sentential_forceP(combo, force))) {
                                                        combo = pph_string_combo.pph_string_combo_add_sentential_force(combo, force);
                                                    }
                                                    return combo;
                                                } finally {
                                                    final SubLObject _prev_bind_0_$139 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        pph_macros.destroy_new_pph_phrases();
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$139, thread);
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$139, thread);
                                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$138, thread);
                                            }
                                        }
                                        try {
                                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$140 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    final SubLObject _prev_bind_0_$141 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$140 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                                        pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                                        pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                                        try {
                                                            thread.resetMultipleValues();
                                                            final SubLObject v_pph_phrase2 = pph_phrase_with_alternatives_for_term(v_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, force);
                                                            final SubLObject doneP2 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            SubLObject combo2 = pph_string_combo.pph_phrase_string_combo(v_pph_phrase2, UNPROVIDED);
                                                            if (((NIL != doneP2) && (NIL != pph_sentence.pph_sentence_p(v_pph_phrase2))) && (NIL == pph_string_combo.pph_string_combo_has_sentential_forceP(combo2, force))) {
                                                                combo2 = pph_string_combo.pph_string_combo_add_sentential_force(combo2, force);
                                                            }
                                                            return combo2;
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$142 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                pph_macros.destroy_new_pph_phrases();
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                                                        pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$140, thread);
                                                        pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$141, thread);
                                                    }
                                                } catch (final Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$140, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var) {
                                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                        if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                                            Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str22$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                                        }
                                    } finally {
                                        pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                                        Errors.$continue_cerrorP$.rebind(_prev_bind_0_$137, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$143 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$136, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$135, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$134, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$144 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$144, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$133, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject pph_phrase_with_alternatives_for_term(final SubLObject v_term, SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject allow_morphological_variantsP, final SubLObject allow_nested_variantsP, SubLObject force) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(v_term, $NONE, language_mt, domain_mt);
        }
        if ($DEFAULT == force) {
            force = pph_utilities.pph_default_force_for_term(v_term);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_alternative_phrase_generation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_search_limit$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_alternative_phrase_generation_level$.bind(NIL != allow_morphological_variantsP ? $ALL : NIL != allow_nested_variantsP ? $LEXICAL_ONLY : $TOP_LEVEL_ONLY, thread);
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            pph_vars.$pph_search_limit$.bind(ZERO_INTEGER, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            final SubLObject v_pph_phrase = (force.eql($NONE)) ? pph_phrase.new_pph_phrase_for_cycl(v_term, pph_utilities.pph_identity_map(), UNPROVIDED) : pph_sentence.new_pph_sentence(v_term, force, nl_preds);
            SubLObject doneP = NIL;
            if (NIL != pph_sentence.pph_sentence_p(v_pph_phrase)) {
                pph_sentence.pph_sentence_generate(v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                doneP = pph_sentence.pph_sentence_doneP(v_pph_phrase);
            } else {
                pph_phrase.pph_phrase_set_agr_preds(v_pph_phrase, nl_preds, UNPROVIDED);
                pph_phrase_generate(v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                doneP = pph_phrase.pph_phrase_doneP(v_pph_phrase);
            }
            return values(v_pph_phrase, doneP);
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_search_limit$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_alternative_phrase_generation_level$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_sanitize_output_list(SubLObject output_list, SubLObject input_cycl) {
        SubLObject any_changeP = NIL;
        input_cycl = cycl_utilities.hl_to_el(input_cycl);
        if (NIL != el_formula_p(input_cycl)) {
            SubLObject cdolist_list_var = output_list;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject changeP = pph_sanitize_output_item(item, input_cycl);
                if (NIL != changeP) {
                    any_changeP = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        }
        if (NIL != any_changeP) {
            output_list = pph_phrase.consolidate_same_arg_items(output_list);
        }
        return values(output_list, any_changeP);
    }

    public static SubLObject pph_sanitize_output_item(final SubLObject item, final SubLObject input_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
        final SubLObject output_item_cycl = pph_data_structures.pph_phrase_output_item_cycl(item);
        SubLObject changeP = NIL;
        if (NIL != pph_utilities.pph_unknown_arg_position_p(arg_position)) {
            if ((NIL == constant_p(output_item_cycl)) || (!constants_high.constant_name(output_item_cycl).equal(pph_data_structures.pph_phrase_output_item_string(item)))) {
                pph_phrase_output_item_strip_anchor_tags(item);
                if ((NIL == pph_phrase.pph_unknown_cycl_p(output_item_cycl)) && (NIL == pph_phrase.pph_empty_cycl_p(output_item_cycl))) {
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str79$Setting_cycl_for__S_to__S_since_i, item, pph_phrase.pph_empty_cycl());
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    pph_data_structures.pph_phrase_output_item_set_cycl(item, pph_phrase.pph_empty_cycl());
                }
                changeP = T;
            }
        } else {
            thread.resetMultipleValues();
            final SubLObject arg = pph_utilities.pph_dereference_arg_position(input_cycl, arg_position);
            final SubLObject errorP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != errorP) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str80$Couldn_t_dereference_arg_position, arg_position, output_item_cycl);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                pph_data_structures.pph_phrase_output_item_set_arg_position(item, pph_utilities.pph_unknown_arg_position());
                changeP = T;
            } else
                if (!function_terms.nart_to_naut(output_item_cycl).equal(function_terms.nart_to_naut(arg))) {
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str81$CycL_on__S_doesn_t_match_CycL__S, item, arg);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    final SubLObject conservativeP = T;
                    if (NIL != conservativeP) {
                        pph_data_structures.pph_phrase_output_item_set_arg_position(item, pph_utilities.pph_unknown_arg_position());
                        pph_phrase_output_item_strip_anchor_tags(item);
                        pph_data_structures.pph_phrase_output_item_set_cycl(item, pph_phrase.pph_unknown_cycl());
                    } else {
                        pph_data_structures.pph_phrase_output_item_set_cycl(item, arg);
                    }
                    changeP = T;
                }

        }
        return changeP;
    }

    public static SubLObject pph_phrase_output_item_strip_anchor_tags(final SubLObject item) {
        final SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
        final SubLObject new_open_tag = pph_strip_anchor_tags(open_tag);
        final SubLObject close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
        final SubLObject new_close_tag = pph_strip_anchor_tags(close_tag);
        pph_data_structures.pph_phrase_output_item_set_html_tags(item, new_open_tag, new_close_tag);
        return item;
    }

    public static SubLObject pph_strip_anchor_tags(final SubLObject tag) {
        final SubLObject stripped = pph_utilities.pph_remove_html_tags(tag, T);
        return NIL != string_utilities.non_empty_stringP(stripped) ? stripped : NIL;
    }

    public static SubLObject pph_string_for_arg_position(final SubLObject arg_position, final SubLObject output_list, SubLObject add_tagsP) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = T;
        }
        SubLObject arg_position_items = NIL;
        SubLObject cdolist_list_var = output_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_utilities.pph_arg_position_subsumesP(pph_data_structures.pph_phrase_output_item_arg_position(item), arg_position, UNPROVIDED)) {
                arg_position_items = cons(item, arg_position_items);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return pph_phrase.pph_phrase_output_list_string(nreverse(arg_position_items), add_tagsP);
    }

    public static SubLObject pph_output_list_arg_position_precedesP(final SubLObject output_list, final SubLObject arg_position1, final SubLObject arg_position2) {
        assert NIL != pph_phrase.pph_phrase_output_list_p(output_list) : "pph_phrase.pph_phrase_output_list_p(output_list) " + "CommonSymbols.NIL != pph_phrase.pph_phrase_output_list_p(output_list) " + output_list;
        SubLObject start_char_index = ZERO_INTEGER;
        SubLObject end_char_index = ZERO_INTEGER;
        final SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string(output_list, T);
        final SubLObject whole_string = pph_utilities.pph_remove_html_tags(whole_html_string, NIL);
        final SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator(output_list);
        while (NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p(iterator)) {
            final SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next(iterator);
            final SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
            start_char_index = pph_macros.pph_output_list_find_start_char(raw_item_string, whole_string, end_char_index);
            if (start_char_index.numG(end_char_index)) {
                final SubLObject string = pph_macros.pph_make_space_string(start_char_index, end_char_index);
                final SubLObject arg_position3 = pph_utilities.pph_unknown_arg_position();
                final SubLObject html_open_tag = NIL;
                final SubLObject html_close_tag = NIL;
                final SubLObject paranoid_arg = pph_phrase.pph_empty_cycl();
                final SubLObject output_item = pph_question.new_pph_phrase_filler_item(string);
                final SubLObject start_char_index_$147 = end_char_index;
                if (NIL != pph_utilities.pph_arg_position_subsumesP(arg_position3, arg_position1, UNPROVIDED)) {
                    return T;
                }
                if (NIL != pph_utilities.pph_arg_position_subsumesP(arg_position3, arg_position2, UNPROVIDED)) {
                    return NIL;
                }
            }
            end_char_index = pph_macros.pph_update_end_char_index(start_char_index, raw_item_string);
            final SubLObject string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
            final SubLObject arg_position3 = pph_data_structures.pph_phrase_output_item_arg_position(item);
            final SubLObject html_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
            final SubLObject html_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
            final SubLObject paranoid_arg = pph_data_structures.pph_phrase_output_item_cycl(item);
            final SubLObject output_item = item;
            if (NIL != pph_utilities.pph_arg_position_subsumesP(arg_position3, arg_position1, UNPROVIDED)) {
                return T;
            }
            if (NIL != pph_utilities.pph_arg_position_subsumesP(arg_position3, arg_position2, UNPROVIDED)) {
                return NIL;
            }
        } 
        return NIL;
    }

    public static SubLObject pph_agr_pred_for_arg_position(final SubLObject arg_position, final SubLObject output_list) {
        SubLObject agr_pred = NIL;
        if (NIL == agr_pred) {
            SubLObject csome_list_var = output_list;
            SubLObject item = NIL;
            item = csome_list_var.first();
            while ((NIL == agr_pred) && (NIL != csome_list_var)) {
                if (arg_position.equal(pph_data_structures.pph_phrase_output_item_arg_position(item))) {
                    agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred(item);
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            } 
        }
        return pph_utilities.pph_peer_agr_for_pred(agr_pred, UNPROVIDED);
    }

    public static SubLObject generate_text_wXsentential_force(final SubLObject v_object, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject focus_arg) {
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = $DEFAULT;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $DEFAULT;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (focus_arg == UNPROVIDED) {
            focus_arg = NIL;
        }
        SubLSystemTrampolineFile.enforceType(v_object, CYCL_EXPRESSION_P);
        SubLSystemTrampolineFile.enforceType(force, PPH_FORCE_P);
        SubLSystemTrampolineFile.enforceType(nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_);
        SubLSystemTrampolineFile.enforceType(language_mt, $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_);
        SubLSystemTrampolineFile.enforceType(domain_mt, $sym83$KEYWORD_OR_HLMT_);
        SubLSystemTrampolineFile.enforceType(mode, KEYWORDP);
        if (NIL != focus_arg) {
            SubLSystemTrampolineFile.enforceType(focus_arg, NON_NEGATIVE_INTEGER_P);
        }
        SubLSystemTrampolineFile.enforceType(v_object, CYCL_EXPRESSION_P);
        SubLSystemTrampolineFile.enforceType(force, PPH_FORCE_P);
        SubLSystemTrampolineFile.enforceType(nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_);
        SubLSystemTrampolineFile.enforceType(language_mt, $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_);
        return generate_text_wXsentential_force_no_checks(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg);
    }

    public static SubLObject valid_pph_language_mt_specifierP(final SubLObject obj) {
        return makeBoolean((NIL != pph_utilities.keyword_or_hlmtP(obj)) || (obj.isString() && (NIL != pph_utilities.get_pph_mt_for_code(obj))));
    }

    public static SubLObject maybe_note_bad_generate_text_result(final SubLObject v_object, final SubLObject force, final SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, final SubLObject focus_arg, final SubLObject string, final SubLObject demerits, SubLObject dict) {
        if (dict == UNPROVIDED) {
            dict = $generate_text_bad_results$.getGlobalValue();
        }
        if (demerits.isNumber() && (NIL != pph_vars.pph_too_many_demerits_p(demerits, pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue()))) {
            note_bad_generate_text_result(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg, string, demerits, dict);
        }
        return demerits;
    }

    public static SubLObject note_bad_generate_text_result(final SubLObject v_object, final SubLObject force, final SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, final SubLObject focus_arg, final SubLObject string, final SubLObject demerits, SubLObject dict) {
        if (dict == UNPROVIDED) {
            dict = $generate_text_bad_results$.getGlobalValue();
        }
        return dictionary.dictionary_enter(dict, list(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg, string), demerits);
    }

    public static SubLObject output_generate_text_bad_results() {
        recheck_generate_text_bad_results();
        dictionary_utilities.sort_dictionary_by_values($generate_text_bad_results$.getGlobalValue(), symbol_function($sym91$_));
        return NIL;
    }

    public static SubLObject output_generate_text_bad_results_to_tsv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        recheck_generate_text_bad_results();
        final SubLObject filename = file_utilities.make_unused_temp_filename($str92$_tmp_);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str94$Unable_to_open__S, filename);
            }
            final SubLObject stream_$148 = stream;
            format(stream_$148, $str95$__Term_AForce_AParaphrase_ADemeri, new SubLObject[]{ CHAR_tab, CHAR_tab, CHAR_tab, CHAR_tab, CHAR_tab, CHAR_tab, CHAR_tab, CHAR_tab });
            SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values($generate_text_bad_results$.getGlobalValue(), symbol_function($sym91$_));
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = NIL;
                SubLObject demerits = NIL;
                destructuring_bind_must_consp(current, datum, $list96);
                key = current.first();
                current = demerits = current.rest();
                SubLObject current_$150;
                final SubLObject datum_$149 = current_$150 = key;
                SubLObject v_term = NIL;
                SubLObject force = NIL;
                SubLObject nl_preds = NIL;
                SubLObject language_mt = NIL;
                SubLObject domain_mt = NIL;
                SubLObject mode = NIL;
                SubLObject focus_arg = NIL;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current_$150, datum_$149, $list97);
                v_term = current_$150.first();
                current_$150 = current_$150.rest();
                destructuring_bind_must_consp(current_$150, datum_$149, $list97);
                force = current_$150.first();
                current_$150 = current_$150.rest();
                destructuring_bind_must_consp(current_$150, datum_$149, $list97);
                nl_preds = current_$150.first();
                current_$150 = current_$150.rest();
                destructuring_bind_must_consp(current_$150, datum_$149, $list97);
                language_mt = current_$150.first();
                current_$150 = current_$150.rest();
                destructuring_bind_must_consp(current_$150, datum_$149, $list97);
                domain_mt = current_$150.first();
                current_$150 = current_$150.rest();
                destructuring_bind_must_consp(current_$150, datum_$149, $list97);
                mode = current_$150.first();
                current_$150 = current_$150.rest();
                destructuring_bind_must_consp(current_$150, datum_$149, $list97);
                focus_arg = current_$150.first();
                current_$150 = current_$150.rest();
                destructuring_bind_must_consp(current_$150, datum_$149, $list97);
                string = current_$150.first();
                current_$150 = current_$150.rest();
                if (NIL == current_$150) {
                    final SubLObject line = cconcatenate(format_nil.format_nil_s_no_copy(v_term), new SubLObject[]{ format_nil.format_nil_a_no_copy(CHAR_tab), format_nil.format_nil_s_no_copy(force), format_nil.format_nil_a_no_copy(CHAR_tab), format_nil.format_nil_s_no_copy(string), format_nil.format_nil_a_no_copy(CHAR_tab), format_nil.format_nil_d_no_copy(demerits), format_nil.format_nil_a_no_copy(CHAR_tab), format_nil.format_nil_s_no_copy(nl_preds), format_nil.format_nil_a_no_copy(CHAR_tab), format_nil.format_nil_s_no_copy(language_mt), format_nil.format_nil_a_no_copy(CHAR_tab), format_nil.format_nil_s_no_copy(domain_mt), format_nil.format_nil_a_no_copy(CHAR_tab), format_nil.format_nil_s_no_copy(mode), format_nil.format_nil_a_no_copy(CHAR_tab), format_nil.format_nil_s_no_copy(focus_arg) });
                    format(stream_$148, $str98$___A__, remove(CHAR_newline, remove(CHAR_return, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } else {
                    cdestructuring_bind_error(datum_$149, $list97);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }

    public static SubLObject recheck_generate_text_bad_results() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject total = dictionary.dictionary_length($generate_text_bad_results$.getGlobalValue());
        SubLObject done_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str99$Rechecking_generate_text_bad_resu);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_utilities.copy_dictionary($generate_text_bad_results$.getGlobalValue()))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject demerits = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject current;
                    final SubLObject datum = current = key;
                    SubLObject v_object = NIL;
                    SubLObject force = NIL;
                    SubLObject nl_preds = NIL;
                    SubLObject language_mt = NIL;
                    SubLObject domain_mt = NIL;
                    SubLObject mode = NIL;
                    SubLObject focus_arg = NIL;
                    SubLObject string = NIL;
                    destructuring_bind_must_consp(current, datum, $list100);
                    v_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list100);
                    force = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list100);
                    nl_preds = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list100);
                    language_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list100);
                    domain_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list100);
                    mode = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list100);
                    focus_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list100);
                    string = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((((NIL == cycl_utilities.expression_find_if($sym101$INVALID_FORT_, v_object, T, UNPROVIDED)) && (NIL == cycl_utilities.expression_find_if($sym101$INVALID_FORT_, language_mt, T, UNPROVIDED))) && (NIL == cycl_utilities.expression_find_if($sym101$INVALID_FORT_, domain_mt, T, UNPROVIDED))) && (NIL == assertions_high.invalid_assertionP(v_object, UNPROVIDED))) {
                            thread.resetMultipleValues();
                            final SubLObject new_string = generate_text_wXsentential_force_no_checks(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg);
                            final SubLObject pred = thread.secondMultipleValue();
                            final SubLObject just = thread.thirdMultipleValue();
                            final SubLObject olist = thread.fourthMultipleValue();
                            final SubLObject new_demerits = thread.fifthMultipleValue();
                            thread.resetMultipleValues();
                            maybe_note_bad_generate_text_result(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg, new_string, new_demerits, new_dictionary);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list100);
                    }
                    done_count = add(done_count, ONE_INTEGER);
                    note_percent_progress(done_count, total);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            } finally {
                final SubLObject _prev_bind_0_$151 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$151, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        $generate_text_bad_results$.setGlobalValue(new_dictionary);
        return $generate_text_bad_results$.getGlobalValue();
    }

    public static SubLObject generate_text_wXsentential_force_no_checks(final SubLObject v_object, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject focus_arg) {
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = $DEFAULT;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $DEFAULT;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (focus_arg == UNPROVIDED) {
            focus_arg = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($DEFAULT == language_mt) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue(thread);
        }
        if (language_mt.isString()) {
            language_mt = pph_utilities.pph_language_mt_from_code(language_mt);
        }
        if ($DEFAULT == domain_mt) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
        }
        if ($DEFAULT == force) {
            force = pph_utilities.pph_default_force_for_term(v_object);
        }
        if ($DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(v_object, force, language_mt, domain_mt);
        }
        SubLObject error_message = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_root_phrase$.currentBinding(thread);
        try {
            pph_vars.$pph_root_phrase$.bind(misc_utilities.uninitialized(), thread);
            SubLObject string = NIL;
            SubLObject pred = NIL;
            SubLObject just = NIL;
            SubLObject olist = NIL;
            SubLObject demerits = NIL;
            final SubLObject _prev_bind_0_$152 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind(NIL, thread);
                pph_error.$pph_error_handling_onP$.bind(T, thread);
                if (NIL != pph_error.pph_break_on_errorP()) {
                    final SubLObject _prev_bind_0_$153 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                    try {
                        pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$154 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            final SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$155 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    final SubLObject new_or_reused = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$156 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                        final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$157 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                            try {
                                                final SubLObject _prev_bind_0_$158 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
                                                try {
                                                    pph_vars.$pph_track_discourse_referentsP$.bind(makeBoolean((NIL != pph_vars.$pph_track_discourse_referentsP$.getDynamicValue(thread)) && (NIL == pph_discourse_referent_tracking_pointlessP(v_object))), thread);
                                                    SubLObject time = NIL;
                                                    final SubLObject time_var = get_internal_real_time();
                                                    if ($ANY == nl_preds) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject string_$159 = generate_text_wXsentential_force_int(v_object, force, $ANY, language_mt, domain_mt, mode, focus_arg);
                                                        final SubLObject pred_$160 = thread.secondMultipleValue();
                                                        final SubLObject just_$161 = thread.thirdMultipleValue();
                                                        final SubLObject olist_$162 = thread.fourthMultipleValue();
                                                        final SubLObject demerits_$163 = thread.fifthMultipleValue();
                                                        thread.resetMultipleValues();
                                                        string = string_$159;
                                                        pred = pred_$160;
                                                        just = just_$161;
                                                        olist = olist_$162;
                                                        demerits = demerits_$163;
                                                    } else {
                                                        final SubLObject _prev_bind_0_$159 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(TWO_INTEGER), thread);
                                                            thread.resetMultipleValues();
                                                            final SubLObject string_$160 = generate_text_wXsentential_force_int(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg);
                                                            final SubLObject pred_$161 = thread.secondMultipleValue();
                                                            final SubLObject just_$162 = thread.thirdMultipleValue();
                                                            final SubLObject olist_$163 = thread.fourthMultipleValue();
                                                            final SubLObject demerits_$164 = thread.fifthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            string = string_$160;
                                                            pred = pred_$161;
                                                            just = just_$162;
                                                            olist = olist_$163;
                                                            demerits = demerits_$164;
                                                        } finally {
                                                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$159, thread);
                                                        }
                                                        if ((NIL == string) && (NIL == number_utilities.potentially_infinite_number_LE(pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread), pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue()))) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject string_$161 = generate_text_wXsentential_force_int(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg);
                                                            final SubLObject pred_$162 = thread.secondMultipleValue();
                                                            final SubLObject just_$163 = thread.thirdMultipleValue();
                                                            final SubLObject olist_$164 = thread.fourthMultipleValue();
                                                            final SubLObject demerits_$165 = thread.fifthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            string = string_$161;
                                                            pred = pred_$162;
                                                            just = just_$163;
                                                            olist = olist_$164;
                                                            demerits = demerits_$165;
                                                        }
                                                    }
                                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                    if ((time.numG(ONE_INTEGER) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                                                        Errors.warn($str102$Took__S_seconds_to_paraphrase____, time, v_object);
                                                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_0_$158, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$160 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$160, thread);
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$157, thread);
                                        }
                                    } finally {
                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$156, thread);
                                    }
                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$155, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$161 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$161, thread);
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$154, thread);
                        }
                    } finally {
                        pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$153, thread);
                    }
                } else {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$162 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject _prev_bind_0_$163 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                try {
                                    pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$164 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                        final SubLObject reuseP2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$165 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                final SubLObject new_or_reused2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                final SubLObject _prev_bind_0_$166 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    final SubLObject local_state2 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    final SubLObject _prev_bind_0_$167 = memoization_state.$memoization_state$.currentBinding(thread);
                                                    try {
                                                        memoization_state.$memoization_state$.bind(local_state2, thread);
                                                        final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                                                        try {
                                                            final SubLObject _prev_bind_0_$168 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$pph_track_discourse_referentsP$.bind(makeBoolean((NIL != pph_vars.$pph_track_discourse_referentsP$.getDynamicValue(thread)) && (NIL == pph_discourse_referent_tracking_pointlessP(v_object))), thread);
                                                                SubLObject time2 = NIL;
                                                                final SubLObject time_var2 = get_internal_real_time();
                                                                if ($ANY == nl_preds) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject string_$162 = generate_text_wXsentential_force_int(v_object, force, $ANY, language_mt, domain_mt, mode, focus_arg);
                                                                    final SubLObject pred_$163 = thread.secondMultipleValue();
                                                                    final SubLObject just_$164 = thread.thirdMultipleValue();
                                                                    final SubLObject olist_$165 = thread.fourthMultipleValue();
                                                                    final SubLObject demerits_$166 = thread.fifthMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    string = string_$162;
                                                                    pred = pred_$163;
                                                                    just = just_$164;
                                                                    olist = olist_$165;
                                                                    demerits = demerits_$166;
                                                                } else {
                                                                    final SubLObject _prev_bind_0_$169 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                    try {
                                                                        pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(TWO_INTEGER), thread);
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject string_$163 = generate_text_wXsentential_force_int(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg);
                                                                        final SubLObject pred_$164 = thread.secondMultipleValue();
                                                                        final SubLObject just_$165 = thread.thirdMultipleValue();
                                                                        final SubLObject olist_$166 = thread.fourthMultipleValue();
                                                                        final SubLObject demerits_$167 = thread.fifthMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        string = string_$163;
                                                                        pred = pred_$164;
                                                                        just = just_$165;
                                                                        olist = olist_$166;
                                                                        demerits = demerits_$167;
                                                                    } finally {
                                                                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$169, thread);
                                                                    }
                                                                    if ((NIL == string) && (NIL == number_utilities.potentially_infinite_number_LE(pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread), pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue()))) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject string_$164 = generate_text_wXsentential_force_int(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg);
                                                                        final SubLObject pred_$165 = thread.secondMultipleValue();
                                                                        final SubLObject just_$166 = thread.thirdMultipleValue();
                                                                        final SubLObject olist_$167 = thread.fourthMultipleValue();
                                                                        final SubLObject demerits_$168 = thread.fifthMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        string = string_$164;
                                                                        pred = pred_$165;
                                                                        just = just_$166;
                                                                        olist = olist_$167;
                                                                        demerits = demerits_$168;
                                                                    }
                                                                }
                                                                time2 = divide(subtract(get_internal_real_time(), time_var2), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                if ((time2.numG(ONE_INTEGER) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                                                                    Errors.warn($str102$Took__S_seconds_to_paraphrase____, time2, v_object);
                                                                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_0_$168, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$170 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values3 = getValuesAsVector();
                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                                                restoreValuesFromVector(_values3);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$170, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$167, thread);
                                                    }
                                                } finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$166, thread);
                                                }
                                                if ((new_or_reused2 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$165, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$171 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values4 = getValuesAsVector();
                                                if (NIL == reuseP2) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                                restoreValuesFromVector(_values4);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$171, thread);
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$164, thread);
                                    }
                                } finally {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$163, thread);
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$162, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str22$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                    }
                }
            } finally {
                pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$152, thread);
            }
            maybe_note_bad_generate_text_result(v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg, string, demerits, UNPROVIDED);
            return values(string, pred, just, olist, demerits, NIL != pph_data_structures.valid_pph_phrase_p(pph_vars.$pph_root_phrase$.getDynamicValue(thread)) ? pph_vars.$pph_root_phrase$.getDynamicValue(thread) : NIL);
        } finally {
            pph_vars.$pph_root_phrase$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_discourse_referent_tracking_pointlessP(final SubLObject v_object) {
        if (pph_vars.current_generation_level().isPositive()) {
            return NIL;
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return NIL;
        }
        if (NIL != nart_handles.nart_p(v_object)) {
            return NIL;
        }
        if (NIL != el_formula_p(v_object)) {
            return NIL;
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str103$__Suspending_discourse_referent_t, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return T;
    }

    public static SubLObject generate_text_wXsentential_force_int(final SubLObject formula, final SubLObject force, final SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, SubLObject focus_arg) {
        if (focus_arg == UNPROVIDED) {
            focus_arg = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject result_agr_pred = NIL;
        SubLObject justification = NIL;
        SubLObject output_list = NIL;
        SubLObject demerits = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                final SubLObject hl_formula = pph_utilities.pph_nart_substitute(formula);
                final SubLObject v_pph_phrase = (force == $NONE) ? pph_data_structures.new_pph_phrase(NIL, hl_formula, UNPROVIDED) : pph_sentence.pph_sentence_copy(pph_sentence.new_pph_sentence(hl_formula, force, nl_preds), UNPROVIDED);
                final SubLObject _prev_bind_0_$202 = pph_vars.$pph_phrase_methods$.currentBinding(thread);
                try {
                    pph_vars.$pph_phrase_methods$.bind(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED), thread);
                    pph_vars.$pph_root_phrase$.setDynamicValue(v_pph_phrase, thread);
                    if (force == $NONE) {
                        pph_phrase.pph_phrase_set_agr_preds(v_pph_phrase, nl_preds, UNPROVIDED);
                        pph_phrase_generate(v_pph_phrase, language_mt, domain_mt, mode);
                    } else {
                        pph_phrase.pph_phrase_set_focus_arg(v_pph_phrase, focus_arg);
                        pph_sentence.pph_sentence_generate(v_pph_phrase, language_mt, domain_mt, mode);
                    }
                    if (NIL != pph_phrase.pph_phrase_doneP(v_pph_phrase)) {
                        string = pph_string.pph_string_if_non_null_to_output_format(pph_phrase.pph_phrase_string(v_pph_phrase, UNPROVIDED), mode);
                        result_agr_pred = pph_phrase.pph_phrase_agr_pred(v_pph_phrase);
                        justification = pph_phrase.pph_phrase_justification(v_pph_phrase);
                        output_list = pph_phrase.pph_phrase_output_list(v_pph_phrase);
                        demerits = pph_phrase.pph_phrase_demerits(v_pph_phrase);
                    }
                } finally {
                    pph_vars.$pph_phrase_methods$.rebind(_prev_bind_0_$202, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$203 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$203, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return values(string, result_agr_pred, justification, output_list, demerits);
    }

    public static SubLObject generate_text_wXsentential_force_and_focus_argnum(final SubLObject formula, final SubLObject focus_arg, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = $DEFAULT;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $DEFAULT;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        return generate_text_wXsentential_force(formula, force, nl_preds, language_mt, domain_mt, mode, focus_arg);
    }

    public static SubLObject generate_text(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject focus_arg) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (focus_arg == UNPROVIDED) {
            focus_arg = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != pph_utilities.valid_external_pph_nl_predsP(nl_preds) : "pph_utilities.valid_external_pph_nl_predsP(nl_preds) " + "CommonSymbols.NIL != pph_utilities.valid_external_pph_nl_predsP(nl_preds) " + nl_preds;
        thread.resetMultipleValues();
        final SubLObject forceless_string = generate_phrase_no_checks(v_object, nl_preds, NIL, language_mt, domain_mt, mode, T, focus_arg);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject just = thread.thirdMultipleValue();
        final SubLObject forceless_olist = thread.fourthMultipleValue();
        final SubLObject demerits = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject olist = copy_list(forceless_olist);
        if (NIL != forceless_string) {
            pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(olist, $DECLARATIVE);
        }
        final SubLObject string = pph_string.pph_string_if_non_null_to_output_format(pph_phrase.pph_phrase_output_list_string(olist, T), mode);
        return values(string, pred, just, olist, demerits);
    }

    public static SubLObject generate_poss(final SubLObject v_object, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject string = generate_phrase_no_checks(v_object, nl_preds, NIL, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), pph_vars.$paraphrase_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject pred = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return morphology.possessivize_string(string, pred);
    }

    public static SubLObject pph_phrase_generate_string_from_cycl(final SubLObject cycl, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject agr_pred = NIL;
        SubLObject justification = NIL;
        SubLObject output_list = NIL;
        if ($DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(cycl, $NONE, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                final SubLObject phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(cycl, arg_position_map, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str105$__Making_new_phrase_with_cycl__S_, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
                final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
                try {
                    pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0_$204 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$204, thread);
                    }
                }
                if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                    string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
                    agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                    justification = pph_phrase.pph_phrase_justification(phrase);
                    output_list = pph_phrase.pph_phrase_output_list(phrase);
                }
            } finally {
                final SubLObject _prev_bind_0_$205 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$205, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return values(string, agr_pred, justification, output_list);
    }

    public static SubLObject set_pph_initialized() {
        $pph_initializedP$.setGlobalValue($INITIALIZED);
        return $pph_initializedP$.getGlobalValue();
    }

    public static SubLObject pph_initializedP() {
        return list_utilities.sublisp_boolean($pph_initializedP$.getGlobalValue());
    }

    public static SubLObject ensure_pph_initialized() {
        if (NIL != pph_initializedP()) {
            return $INITIALIZED;
        }
        return initialize_paraphrase_cycl();
    }

    public static SubLObject initialize_paraphrase_cycl() {
        if (NIL != kb_loaded()) {
            pph_vars.initialize_pph_vars();
            pph_templates.initialize_gen_template_store();
            clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
            $pph_initializedP$.setGlobalValue(T);
            return $INITIALIZED;
        }
        final SubLObject new_format_string = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str108$No_KB_loaded__Couldn_t_initialize) });
        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        return $NO_KB_LOADED;
    }

    public static SubLObject clear_paraphrase_caches(SubLObject source, SubLObject assertion) {
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
        }
        pph_methods.clear_pph_methods_caches();
        pph_methods_formulas.clear_quant_over_arg_tuples();
        lexicon_accessors.clear_cached_lexical_access_functions();
        pph_methods_lexicon.clear_pph_arg_in_reln_preds();
        pph_utilities.clear_pph_english_contextP();
        pph_utilities.clear_pph_prefer_assertionP();
        pph_utilities.clear_pph_nl_generation_predP();
        pph_methods.clear_pph_enhanced_domain_mt();
        return NIL;
    }

    public static SubLObject pph_phrase_generate(SubLObject phrase, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == UNPROVIDED) {
            language_mt = (NIL != pph_vars.$pph_language_mt$.getDynamicValue()) ? pph_vars.$pph_language_mt$.getDynamicValue() : $$EnglishParaphraseMt;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = (NIL != pph_vars.$pph_domain_mt$.getDynamicValue()) ? pph_vars.$pph_domain_mt$.getDynamicValue() : $$EnglishParaphraseMt;
        }
        if (mode == UNPROVIDED) {
            mode = (NIL != pph_vars.$paraphrase_mode$.getDynamicValue()) ? pph_vars.$paraphrase_mode$.getDynamicValue() : $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = wff_utilities.$check_arityP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$generation_level$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_use_expansions_for_precisionP$.currentBinding(thread);
        try {
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            wff_utilities.$check_arityP$.bind(T, thread);
            pph_vars.$generation_level$.bind(number_utilities.f_1X(pph_vars.current_generation_level()), thread);
            pph_vars.$pph_use_expansions_for_precisionP$.bind(pph_vars.$pph_use_expansions_for_precisionP$.getDynamicValue(thread), thread);
            Object error_message = NIL;
            final SubLObject _prev_bind_0_$206 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_1_$207 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind(NIL, thread);
                pph_error.$pph_error_handling_onP$.bind(T, thread);
                SubLObject ccatch_env_var;
                SubLObject catch_var;
                SubLObject mapped_string;
                SubLObject _prev_bind_0_$244;
                SubLObject old_pph_vars;
                SubLObject _prev_bind_0_$245;
                SubLObject _prev_bind_1_$246;
                SubLObject _prev_bind_2_$247;
                SubLObject _prev_bind_0_$278;
                SubLObject _values;
                SubLObject local_vars;
                SubLObject _prev_bind_0_$250;
                SubLObject _prev_bind_1_$251;
                SubLObject _prev_bind_2_$252;
                SubLObject _prev_bind_3_$253;
                SubLObject _prev_bind_4_$254;
                SubLObject _prev_bind_0_$265;
                SubLObject _prev_bind_0_$276;
                SubLObject _values_$277;
                SubLObject new_format_string;
                SubLObject _prev_bind_0_$268;
                SubLObject reuseP;
                SubLObject _prev_bind_0_$274;
                SubLObject _values_$275;
                SubLObject _prev_bind_0_$270;
                SubLObject local_state;
                SubLObject _prev_bind_0_$271;
                SubLObject original_memoization_process;
                SubLObject _prev_bind_0_$272;
                if (NIL != pph_error.pph_break_on_errorP()) {
                    ccatch_env_var = pph_utilities.pph_phrase_rephrase_cycl(phrase, UNPROVIDED, UNPROVIDED);
                    catch_var = pph_macros.pph_mapped_string_for_term(ccatch_env_var);
                    mapped_string = pph_vars.$pph_var_types$.currentBinding(thread);
                    try {
                        pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                        _prev_bind_0_$244 = pph_variable_handling.pph_registered_vars();
                        old_pph_vars = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                        _prev_bind_0_$245 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                        _prev_bind_1_$246 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                        try {
                            pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                            pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                            pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str113$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            boolean arg10925 = false;
                            try {
                                arg10925 = true;
                                if (NIL != catch_var) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format_nil.force_format(T, $str114$__Using_mapped_string__S_for__S__, catch_var, ccatch_env_var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    pph_phrase.pph_phrase_set_string(phrase, catch_var);
                                    if (pph_phrase.pph_phrase_category(phrase, UNPROVIDED).eql($$PossessivePhrase)) {
                                        possessivize_pph_phrase(phrase);
                                        arg10925 = false;
                                    } else {
                                        arg10925 = false;
                                    }
                                } else
                                    if (pph_vars.current_generation_level().numG($pph_recursion_limit$.getGlobalValue())) {
                                        _prev_bind_2_$247 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str116$Recursion_limit_exceeded_on__S_) });
                                        pph_error.pph_handle_error(_prev_bind_2_$247, list(pph_vars.pph_top_level_cycl()));
                                        arg10925 = false;
                                    } else {
                                        pph_phrase.pph_phrase_set_absolute_agr_from_phrase(phrase);
                                        if (NIL == pph_phrase.pph_phrase_impossible_p(phrase, T)) {
                                            if ((NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                                                format_nil.force_format(T, $str117$__Paraphrasing__S_with_agr___S___, ccatch_env_var, pph_phrase.pph_phrase_agr(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            _prev_bind_2_$247 = pph_utilities.$pph_current_environment$.currentBinding(thread);
                                            try {
                                                pph_utilities.$pph_current_environment$.bind(pph_utilities.find_or_create_pph_context(), thread);
                                                pph_utilities.pph_push_environment($GENERATE);
                                                boolean arg19616 = false;
                                                try {
                                                    arg19616 = true;
                                                    pph_utilities.pph_phrase_maybe_mark_type_level_violation(phrase);
                                                    arg19616 = false;
                                                } finally {
                                                    if (arg19616) {
                                                        final SubLObject _prev_bind_0_$213 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values1 = getValuesAsVector();
                                                            final SubLObject _prev_bind_0_$214 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$215 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$216 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3_$217 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                                            final SubLObject _prev_bind_4_$218 = pph_vars.$pph_type_level_violations$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$pph_language_mt$.bind(language_mt, thread);
                                                                pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                                                                pph_vars.$paraphrase_mode$.bind(mode, thread);
                                                                pph_vars.$pph_type_level_violations$.bind(NIL != set.set_p(pph_vars.$pph_type_level_violations$.getDynamicValue(thread)) ? pph_vars.$pph_type_level_violations$.getDynamicValue(thread) : pph_utilities.pph_type_level_violations(ccatch_env_var), thread);
                                                                SubLObject _prev_bind_0_$229;
                                                                SubLObject _prev_bind_0_$2401;
                                                                SubLObject _values_$2411;
                                                                SubLObject new_format_string1;
                                                                SubLObject _prev_bind_0_$232;
                                                                SubLObject reuseP1;
                                                                SubLObject _prev_bind_0_$2381;
                                                                SubLObject _values_$2391;
                                                                SubLObject _prev_bind_0_$234;
                                                                SubLObject local_state1;
                                                                SubLObject _prev_bind_0_$235;
                                                                SubLObject original_memoization_process1;
                                                                SubLObject _prev_bind_0_$2361;
                                                                if (NIL != pph_macros.pph_discourse_context_initializedP()) {
                                                                    pph_drs.pph_ensure_discourse_participant_rms();
                                                                    _prev_bind_0_$229 = misc_utilities.initialized_p(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread));
                                                                    _prev_bind_0_$2401 = pph_vars.$pph_unexpressed_negations$.currentBinding(thread);
                                                                    try {
                                                                        pph_vars.$pph_unexpressed_negations$.bind(NIL != _prev_bind_0_$229 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                                                                        _values_$2411 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                                                        try {
                                                                            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                                                            thread.resetMultipleValues();
                                                                            new_format_string1 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                                            try {
                                                                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                                _prev_bind_0_$232 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                boolean arg18634 = false;
                                                                                try {
                                                                                    arg18634 = true;
                                                                                    thread.resetMultipleValues();
                                                                                    reuseP1 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                        _prev_bind_0_$2381 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        _values_$2391 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                        try {
                                                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                            _prev_bind_0_$234 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                            local_state1 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                            try {
                                                                                                memoization_state.$memoization_state$.bind(_prev_bind_0_$234, thread);
                                                                                                _prev_bind_0_$235 = memoization_state.memoization_state_original_process(_prev_bind_0_$234);
                                                                                                boolean arg19475 = false;
                                                                                                try {
                                                                                                    arg19475 = true;
                                                                                                    pph_phrase_generate_1(phrase);
                                                                                                    arg19475 = false;
                                                                                                } finally {
                                                                                                    if (arg19475) {
                                                                                                        final SubLObject _prev_bind_0_$2251 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            final SubLObject _values_$2261 = getValuesAsVector();
                                                                                                            memoization_state.memoization_state_possibly_clear_original_process(_prev_bind_0_$234, _prev_bind_0_$235);
                                                                                                            restoreValuesFromVector(_values_$2261);
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2251, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                original_memoization_process1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    _prev_bind_0_$2361 = getValuesAsVector();
                                                                                                    memoization_state.memoization_state_possibly_clear_original_process(_prev_bind_0_$234, _prev_bind_0_$235);
                                                                                                    restoreValuesFromVector(_prev_bind_0_$2361);
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(original_memoization_process1, thread);
                                                                                                }
                                                                                            } finally {
                                                                                                memoization_state.$memoization_state$.rebind(local_state1, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            pph_macros.$pph_external_memoization_state$.rebind(_values_$2391, thread);
                                                                                        }
                                                                                        if ((_prev_bind_0_$2381 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                        }
                                                                                    } finally {
                                                                                        pph_macros.$pph_memoization_state$.rebind(reuseP1, thread);
                                                                                    }
                                                                                    arg18634 = false;
                                                                                } finally {
                                                                                    if (arg18634) {
                                                                                        final SubLObject _prev_bind_0_$2271 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            final SubLObject _values_$2281 = getValuesAsVector();
                                                                                            if (NIL == _prev_bind_0_$232) {
                                                                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                            }
                                                                                            restoreValuesFromVector(_values_$2281);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2271, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                reuseP1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    _prev_bind_0_$2381 = getValuesAsVector();
                                                                                    if (NIL == _prev_bind_0_$232) {
                                                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                    }
                                                                                    restoreValuesFromVector(_prev_bind_0_$2381);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(reuseP1, thread);
                                                                                }
                                                                            } finally {
                                                                                pph_macros.$pph_problem_store_pointer$.rebind(new_format_string1, thread);
                                                                            }
                                                                        } finally {
                                                                            pph_macros.$free_pph_problem_store_pointers$.rebind(_values_$2411, thread);
                                                                        }
                                                                        if ((NIL == _prev_bind_0_$229) && (NIL == set.set_emptyP(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)))) {
                                                                            _values_$2411 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str119$Abandoning_unexpressed_negations_) });
                                                                            pph_error.pph_handle_error(_values_$2411, list(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)));
                                                                        }
                                                                    } finally {
                                                                        pph_vars.$pph_unexpressed_negations$.rebind(_prev_bind_0_$2401, thread);
                                                                    }
                                                                } else {
                                                                    _prev_bind_0_$229 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                                                                    try {
                                                                        pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                                                                        pph_macros.herald_new_discourse_context();
                                                                        boolean arg16111 = false;
                                                                        try {
                                                                            arg16111 = true;
                                                                            pph_drs.pph_ensure_discourse_participant_rms();
                                                                            _prev_bind_0_$2401 = misc_utilities.initialized_p(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread));
                                                                            _values_$2411 = pph_vars.$pph_unexpressed_negations$.currentBinding(thread);
                                                                            try {
                                                                                pph_vars.$pph_unexpressed_negations$.bind(NIL != _prev_bind_0_$2401 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                                                                                new_format_string1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                                                                try {
                                                                                    pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    _prev_bind_0_$232 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                                        reuseP1 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        boolean arg16952 = false;
                                                                                        try {
                                                                                            arg16952 = true;
                                                                                            thread.resetMultipleValues();
                                                                                            _prev_bind_0_$2381 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                                            try {
                                                                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                                _values_$2391 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                _prev_bind_0_$234 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                                try {
                                                                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                                    local_state1 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                                    _prev_bind_0_$235 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                                    try {
                                                                                                        memoization_state.$memoization_state$.bind(local_state1, thread);
                                                                                                        original_memoization_process1 = memoization_state.memoization_state_original_process(local_state1);
                                                                                                        boolean arg17793 = false;
                                                                                                        try {
                                                                                                            arg17793 = true;
                                                                                                            pph_phrase_generate_1(phrase);
                                                                                                            arg17793 = false;
                                                                                                        } finally {
                                                                                                            if (arg17793) {
                                                                                                                final SubLObject _prev_bind_0_$2362 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                    final SubLObject _values_$2372 = getValuesAsVector();
                                                                                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state1, original_memoization_process1);
                                                                                                                    restoreValuesFromVector(_values_$2372);
                                                                                                                } finally {
                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2362, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        _prev_bind_0_$2361 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            final SubLObject _values_$2371 = getValuesAsVector();
                                                                                                            memoization_state.memoization_state_possibly_clear_original_process(local_state1, original_memoization_process1);
                                                                                                            restoreValuesFromVector(_values_$2371);
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2361, thread);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$235, thread);
                                                                                                    }
                                                                                                } finally {
                                                                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$234, thread);
                                                                                                }
                                                                                                if ((_values_$2391 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                                }
                                                                                            } finally {
                                                                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$2381, thread);
                                                                                            }
                                                                                            arg16952 = false;
                                                                                        } finally {
                                                                                            if (arg16952) {
                                                                                                final SubLObject _prev_bind_0_$2382 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    final SubLObject _values_$2392 = getValuesAsVector();
                                                                                                    if (NIL == reuseP1) {
                                                                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                                    }
                                                                                                    restoreValuesFromVector(_values_$2392);
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2382, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        _prev_bind_0_$2381 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            _values_$2391 = getValuesAsVector();
                                                                                            if (NIL == reuseP1) {
                                                                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                            }
                                                                                            restoreValuesFromVector(_values_$2391);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2381, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$232, thread);
                                                                                    }
                                                                                } finally {
                                                                                    pph_macros.$free_pph_problem_store_pointers$.rebind(new_format_string1, thread);
                                                                                }
                                                                                if ((NIL == _prev_bind_0_$2401) && (NIL == set.set_emptyP(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)))) {
                                                                                    new_format_string1 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str119$Abandoning_unexpressed_negations_) });
                                                                                    pph_error.pph_handle_error(new_format_string1, list(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)));
                                                                                }
                                                                            } finally {
                                                                                pph_vars.$pph_unexpressed_negations$.rebind(_values_$2411, thread);
                                                                            }
                                                                            arg16111 = false;
                                                                        } finally {
                                                                            if (arg16111) {
                                                                                final SubLObject _prev_bind_0_$2402 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values_$2412 = getValuesAsVector();
                                                                                    pph_macros.herald_end_of_discourse_context();
                                                                                    pph_macros.clear_pph_discourse_context();
                                                                                    restoreValuesFromVector(_values_$2412);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2402, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        _prev_bind_0_$2401 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            _values_$2411 = getValuesAsVector();
                                                                            pph_macros.herald_end_of_discourse_context();
                                                                            pph_macros.clear_pph_discourse_context();
                                                                            restoreValuesFromVector(_values_$2411);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2401, thread);
                                                                        }
                                                                    } finally {
                                                                        pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$229, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_vars.$pph_type_level_violations$.rebind(_prev_bind_4_$218, thread);
                                                                pph_vars.$paraphrase_mode$.rebind(_prev_bind_3_$217, thread);
                                                                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_2_$216, thread);
                                                                pph_vars.$pph_domain_mt$.rebind(_prev_bind_1_$215, thread);
                                                                pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$214, thread);
                                                            }
                                                            pph_utilities.pph_pop_environment();
                                                            restoreValuesFromVector(_values1);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                                                        }
                                                    }
                                                }
                                                _prev_bind_0_$278 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    _values = getValuesAsVector();
                                                    local_vars = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                    _prev_bind_0_$250 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                    _prev_bind_1_$251 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                                                    _prev_bind_2_$252 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                                    _prev_bind_3_$253 = pph_vars.$pph_type_level_violations$.currentBinding(thread);
                                                    try {
                                                        pph_vars.$pph_language_mt$.bind(language_mt, thread);
                                                        pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                        lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                                                        pph_vars.$paraphrase_mode$.bind(mode, thread);
                                                        pph_vars.$pph_type_level_violations$.bind(NIL != set.set_p(pph_vars.$pph_type_level_violations$.getDynamicValue(thread)) ? pph_vars.$pph_type_level_violations$.getDynamicValue(thread) : pph_utilities.pph_type_level_violations(ccatch_env_var), thread);
                                                        if (NIL != pph_macros.pph_discourse_context_initializedP()) {
                                                            pph_drs.pph_ensure_discourse_participant_rms();
                                                            _prev_bind_4_$254 = misc_utilities.initialized_p(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread));
                                                            _prev_bind_0_$265 = pph_vars.$pph_unexpressed_negations$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$pph_unexpressed_negations$.bind(NIL != _prev_bind_4_$254 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                                                                _prev_bind_0_$276 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                                                try {
                                                                    pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                                                    thread.resetMultipleValues();
                                                                    _values_$277 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                                    try {
                                                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                        new_format_string = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        boolean arg14429 = false;
                                                                        try {
                                                                            arg14429 = true;
                                                                            thread.resetMultipleValues();
                                                                            _prev_bind_0_$268 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                            try {
                                                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                reuseP = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                _prev_bind_0_$274 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                try {
                                                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                    _values_$275 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                    _prev_bind_0_$270 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                    try {
                                                                                        memoization_state.$memoization_state$.bind(_values_$275, thread);
                                                                                        local_state = memoization_state.memoization_state_original_process(_values_$275);
                                                                                        boolean arg15270 = false;
                                                                                        try {
                                                                                            arg15270 = true;
                                                                                            pph_phrase_generate_1(phrase);
                                                                                            arg15270 = false;
                                                                                        } finally {
                                                                                            if (arg15270) {
                                                                                                final SubLObject _prev_bind_0_$225 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    final SubLObject _values_$226 = getValuesAsVector();
                                                                                                    memoization_state.memoization_state_possibly_clear_original_process(_values_$275, local_state);
                                                                                                    restoreValuesFromVector(_values_$226);
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$225, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        _prev_bind_0_$271 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            original_memoization_process = getValuesAsVector();
                                                                                            memoization_state.memoization_state_possibly_clear_original_process(_values_$275, local_state);
                                                                                            restoreValuesFromVector(original_memoization_process);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$271, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$270, thread);
                                                                                    }
                                                                                } finally {
                                                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$274, thread);
                                                                                }
                                                                                if ((reuseP == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                }
                                                                            } finally {
                                                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$268, thread);
                                                                            }
                                                                            arg14429 = false;
                                                                        } finally {
                                                                            if (arg14429) {
                                                                                final SubLObject _prev_bind_0_$227 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values_$228 = getValuesAsVector();
                                                                                    if (NIL == new_format_string) {
                                                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                    }
                                                                                    restoreValuesFromVector(_values_$228);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$227, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        _prev_bind_0_$268 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            reuseP = getValuesAsVector();
                                                                            if (NIL == new_format_string) {
                                                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                            }
                                                                            restoreValuesFromVector(reuseP);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$268, thread);
                                                                        }
                                                                    } finally {
                                                                        pph_macros.$pph_problem_store_pointer$.rebind(_values_$277, thread);
                                                                    }
                                                                } finally {
                                                                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$276, thread);
                                                                }
                                                                if ((NIL == _prev_bind_4_$254) && (NIL == set.set_emptyP(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)))) {
                                                                    _prev_bind_0_$276 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str119$Abandoning_unexpressed_negations_) });
                                                                    pph_error.pph_handle_error(_prev_bind_0_$276, list(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)));
                                                                }
                                                            } finally {
                                                                pph_vars.$pph_unexpressed_negations$.rebind(_prev_bind_0_$265, thread);
                                                            }
                                                        } else {
                                                            _prev_bind_4_$254 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                                                                pph_macros.herald_new_discourse_context();
                                                                boolean arg11906 = false;
                                                                try {
                                                                    arg11906 = true;
                                                                    pph_drs.pph_ensure_discourse_participant_rms();
                                                                    _prev_bind_0_$265 = misc_utilities.initialized_p(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread));
                                                                    _prev_bind_0_$276 = pph_vars.$pph_unexpressed_negations$.currentBinding(thread);
                                                                    try {
                                                                        pph_vars.$pph_unexpressed_negations$.bind(NIL != _prev_bind_0_$265 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                                                                        _values_$277 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                                                        try {
                                                                            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                                                            thread.resetMultipleValues();
                                                                            new_format_string = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                                            try {
                                                                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                                _prev_bind_0_$268 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                boolean arg12747 = false;
                                                                                try {
                                                                                    arg12747 = true;
                                                                                    thread.resetMultipleValues();
                                                                                    reuseP = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                        _prev_bind_0_$274 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        _values_$275 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                        try {
                                                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                            _prev_bind_0_$270 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                            local_state = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                            try {
                                                                                                memoization_state.$memoization_state$.bind(_prev_bind_0_$270, thread);
                                                                                                _prev_bind_0_$271 = memoization_state.memoization_state_original_process(_prev_bind_0_$270);
                                                                                                boolean arg13588 = false;
                                                                                                try {
                                                                                                    arg13588 = true;
                                                                                                    pph_phrase_generate_1(phrase);
                                                                                                    arg13588 = false;
                                                                                                } finally {
                                                                                                    if (arg13588) {
                                                                                                        final SubLObject _prev_bind_0_$236 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            final SubLObject _values_$237 = getValuesAsVector();
                                                                                                            memoization_state.memoization_state_possibly_clear_original_process(_prev_bind_0_$270, _prev_bind_0_$271);
                                                                                                            restoreValuesFromVector(_values_$237);
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$236, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                original_memoization_process = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    _prev_bind_0_$272 = getValuesAsVector();
                                                                                                    memoization_state.memoization_state_possibly_clear_original_process(_prev_bind_0_$270, _prev_bind_0_$271);
                                                                                                    restoreValuesFromVector(_prev_bind_0_$272);
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(original_memoization_process, thread);
                                                                                                }
                                                                                            } finally {
                                                                                                memoization_state.$memoization_state$.rebind(local_state, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            pph_macros.$pph_external_memoization_state$.rebind(_values_$275, thread);
                                                                                        }
                                                                                        if ((_prev_bind_0_$274 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                        }
                                                                                    } finally {
                                                                                        pph_macros.$pph_memoization_state$.rebind(reuseP, thread);
                                                                                    }
                                                                                    arg12747 = false;
                                                                                } finally {
                                                                                    if (arg12747) {
                                                                                        final SubLObject _prev_bind_0_$238 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            final SubLObject _values_$239 = getValuesAsVector();
                                                                                            if (NIL == _prev_bind_0_$268) {
                                                                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                            }
                                                                                            restoreValuesFromVector(_values_$239);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$238, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                reuseP = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    _prev_bind_0_$274 = getValuesAsVector();
                                                                                    if (NIL == _prev_bind_0_$268) {
                                                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                    }
                                                                                    restoreValuesFromVector(_prev_bind_0_$274);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(reuseP, thread);
                                                                                }
                                                                            } finally {
                                                                                pph_macros.$pph_problem_store_pointer$.rebind(new_format_string, thread);
                                                                            }
                                                                        } finally {
                                                                            pph_macros.$free_pph_problem_store_pointers$.rebind(_values_$277, thread);
                                                                        }
                                                                        if ((NIL == _prev_bind_0_$265) && (NIL == set.set_emptyP(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)))) {
                                                                            _values_$277 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str119$Abandoning_unexpressed_negations_) });
                                                                            pph_error.pph_handle_error(_values_$277, list(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)));
                                                                        }
                                                                    } finally {
                                                                        pph_vars.$pph_unexpressed_negations$.rebind(_prev_bind_0_$276, thread);
                                                                    }
                                                                    arg11906 = false;
                                                                } finally {
                                                                    if (arg11906) {
                                                                        final SubLObject _prev_bind_0_$240 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values_$241 = getValuesAsVector();
                                                                            pph_macros.herald_end_of_discourse_context();
                                                                            pph_macros.clear_pph_discourse_context();
                                                                            restoreValuesFromVector(_values_$241);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$240, thread);
                                                                        }
                                                                    }
                                                                }
                                                                _prev_bind_0_$265 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    _prev_bind_0_$276 = getValuesAsVector();
                                                                    pph_macros.herald_end_of_discourse_context();
                                                                    pph_macros.clear_pph_discourse_context();
                                                                    restoreValuesFromVector(_prev_bind_0_$276);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$265, thread);
                                                                }
                                                            } finally {
                                                                pph_vars.$pph_discourse_context$.rebind(_prev_bind_4_$254, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        pph_vars.$pph_type_level_violations$.rebind(_prev_bind_3_$253, thread);
                                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2_$252, thread);
                                                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_1_$251, thread);
                                                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$250, thread);
                                                        pph_vars.$pph_language_mt$.rebind(local_vars, thread);
                                                    }
                                                    pph_utilities.pph_pop_environment();
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$278, thread);
                                                }
                                            } finally {
                                                pph_utilities.$pph_current_environment$.rebind(_prev_bind_2_$247, thread);
                                            }
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str120$__PPH_PHRASE_GENERATE_Output_list, pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                arg10925 = false;
                                            } else {
                                                arg10925 = false;
                                            }
                                        } else {
                                            arg10925 = false;
                                        }
                                    }

                            } finally {
                                if (arg10925) {
                                    final SubLObject _prev_bind_0_$242 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        final SubLObject local_vars1 = set_difference(pph_variable_handling.pph_registered_vars(), _prev_bind_0_$244, UNPROVIDED, UNPROVIDED);
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                            format_nil.force_format(T, $str121$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        pph_macros.pph_handle_local_vars(local_vars1);
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                            format_nil.force_format(T, $str122$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$242, thread);
                                    }
                                }
                            }
                            _prev_bind_2_$247 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                _prev_bind_0_$278 = getValuesAsVector();
                                _values = set_difference(pph_variable_handling.pph_registered_vars(), _prev_bind_0_$244, UNPROVIDED, UNPROVIDED);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                    format_nil.force_format(T, $str121$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_macros.pph_handle_local_vars(_values);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                    format_nil.force_format(T, $str122$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                restoreValuesFromVector(_prev_bind_0_$278);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_2_$247, thread);
                            }
                        } finally {
                            pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_1_$246, thread);
                            pph_vars.$pph_noted_var_types$.rebind(_prev_bind_0_$245, thread);
                            pph_variable_handling.$pph_different_vars$.rebind(old_pph_vars, thread);
                        }
                    } finally {
                        pph_vars.$pph_var_types$.rebind(mapped_string, thread);
                    }
                } else {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        ccatch_env_var = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                catch_var = pph_utilities.pph_phrase_rephrase_cycl(phrase, UNPROVIDED, UNPROVIDED);
                                mapped_string = pph_macros.pph_mapped_string_for_term(catch_var);
                                _prev_bind_0_$244 = pph_vars.$pph_var_types$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                                    old_pph_vars = pph_variable_handling.pph_registered_vars();
                                    _prev_bind_0_$245 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                                    _prev_bind_1_$246 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                                    _prev_bind_2_$247 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                                    try {
                                        pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                                        pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                                        pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                            format_nil.force_format(T, $str113$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        boolean arg1533 = false;
                                        try {
                                            arg1533 = true;
                                            if (NIL != mapped_string) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format_nil.force_format(T, $str114$__Using_mapped_string__S_for__S__, mapped_string, catch_var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                                pph_phrase.pph_phrase_set_string(phrase, mapped_string);
                                                if (pph_phrase.pph_phrase_category(phrase, UNPROVIDED).eql($$PossessivePhrase)) {
                                                    possessivize_pph_phrase(phrase);
                                                    arg1533 = false;
                                                } else {
                                                    arg1533 = false;
                                                }
                                            } else
                                                if (pph_vars.current_generation_level().numG($pph_recursion_limit$.getGlobalValue())) {
                                                    _prev_bind_0_$278 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str116$Recursion_limit_exceeded_on__S_) });
                                                    pph_error.pph_handle_error(_prev_bind_0_$278, list(pph_vars.pph_top_level_cycl()));
                                                    arg1533 = false;
                                                } else {
                                                    pph_phrase.pph_phrase_set_absolute_agr_from_phrase(phrase);
                                                    if (NIL == pph_phrase.pph_phrase_impossible_p(phrase, T)) {
                                                        if ((NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                                                            format_nil.force_format(T, $str117$__Paraphrasing__S_with_agr___S___, catch_var, pph_phrase.pph_phrase_agr(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        _prev_bind_0_$278 = pph_utilities.$pph_current_environment$.currentBinding(thread);
                                                        try {
                                                            pph_utilities.$pph_current_environment$.bind(pph_utilities.find_or_create_pph_context(), thread);
                                                            pph_utilities.pph_push_environment($GENERATE);
                                                            boolean arg10224 = false;
                                                            try {
                                                                arg10224 = true;
                                                                pph_utilities.pph_phrase_maybe_mark_type_level_violation(phrase);
                                                                arg10224 = false;
                                                            } finally {
                                                                if (arg10224) {
                                                                    final SubLObject _prev_bind_0_$249 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values3 = getValuesAsVector();
                                                                        final SubLObject _prev_bind_0_$2501 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$2511 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_2_$2521 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_3_$2531 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_4_$2541 = pph_vars.$pph_type_level_violations$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$pph_language_mt$.bind(language_mt, thread);
                                                                            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                            lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                                                                            pph_vars.$paraphrase_mode$.bind(mode, thread);
                                                                            pph_vars.$pph_type_level_violations$.bind(NIL != set.set_p(pph_vars.$pph_type_level_violations$.getDynamicValue(thread)) ? pph_vars.$pph_type_level_violations$.getDynamicValue(thread) : pph_utilities.pph_type_level_violations(catch_var), thread);
                                                                            SubLObject _prev_bind_0_$2651;
                                                                            SubLObject _prev_bind_0_$2762;
                                                                            SubLObject _values_$2772;
                                                                            SubLObject new_format_string2;
                                                                            SubLObject _prev_bind_0_$2681;
                                                                            SubLObject reuseP2;
                                                                            SubLObject _prev_bind_0_$2742;
                                                                            SubLObject _values_$2752;
                                                                            SubLObject _prev_bind_0_$2701;
                                                                            SubLObject local_state2;
                                                                            SubLObject _prev_bind_0_$2711;
                                                                            SubLObject original_memoization_process2;
                                                                            SubLObject _prev_bind_0_$2722;
                                                                            if (NIL != pph_macros.pph_discourse_context_initializedP()) {
                                                                                pph_drs.pph_ensure_discourse_participant_rms();
                                                                                _prev_bind_0_$2651 = misc_utilities.initialized_p(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread));
                                                                                _prev_bind_0_$2762 = pph_vars.$pph_unexpressed_negations$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_unexpressed_negations$.bind(NIL != _prev_bind_0_$2651 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                                                                                    _values_$2772 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                                                                        thread.resetMultipleValues();
                                                                                        new_format_string2 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                                                        try {
                                                                                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                                            _prev_bind_0_$2681 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            boolean arg9242 = false;
                                                                                            try {
                                                                                                arg9242 = true;
                                                                                                thread.resetMultipleValues();
                                                                                                reuseP2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                                                try {
                                                                                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                                    _prev_bind_0_$2742 = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    _values_$2752 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                                    try {
                                                                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                                        _prev_bind_0_$2701 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                                        local_state2 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                                        try {
                                                                                                            memoization_state.$memoization_state$.bind(_prev_bind_0_$2701, thread);
                                                                                                            _prev_bind_0_$2711 = memoization_state.memoization_state_original_process(_prev_bind_0_$2701);
                                                                                                            boolean arg10083 = false;
                                                                                                            try {
                                                                                                                arg10083 = true;
                                                                                                                pph_phrase_generate_1(phrase);
                                                                                                                arg10083 = false;
                                                                                                            } finally {
                                                                                                                if (arg10083) {
                                                                                                                    final SubLObject _prev_bind_0_$2611 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                        final SubLObject _values_$2621 = getValuesAsVector();
                                                                                                                        memoization_state.memoization_state_possibly_clear_original_process(_prev_bind_0_$2701, _prev_bind_0_$2711);
                                                                                                                        restoreValuesFromVector(_values_$2621);
                                                                                                                    } finally {
                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2611, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            original_memoization_process2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                _prev_bind_0_$2722 = getValuesAsVector();
                                                                                                                memoization_state.memoization_state_possibly_clear_original_process(_prev_bind_0_$2701, _prev_bind_0_$2711);
                                                                                                                restoreValuesFromVector(_prev_bind_0_$2722);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(original_memoization_process2, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            memoization_state.$memoization_state$.rebind(local_state2, thread);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        pph_macros.$pph_external_memoization_state$.rebind(_values_$2752, thread);
                                                                                                    }
                                                                                                    if ((_prev_bind_0_$2742 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                                    }
                                                                                                } finally {
                                                                                                    pph_macros.$pph_memoization_state$.rebind(reuseP2, thread);
                                                                                                }
                                                                                                arg9242 = false;
                                                                                            } finally {
                                                                                                if (arg9242) {
                                                                                                    final SubLObject _prev_bind_0_$2631 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        final SubLObject _values_$2641 = getValuesAsVector();
                                                                                                        if (NIL == _prev_bind_0_$2681) {
                                                                                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                                        }
                                                                                                        restoreValuesFromVector(_values_$2641);
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2631, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            reuseP2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                _prev_bind_0_$2742 = getValuesAsVector();
                                                                                                if (NIL == _prev_bind_0_$2681) {
                                                                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                                }
                                                                                                restoreValuesFromVector(_prev_bind_0_$2742);
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(reuseP2, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            pph_macros.$pph_problem_store_pointer$.rebind(new_format_string2, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        pph_macros.$free_pph_problem_store_pointers$.rebind(_values_$2772, thread);
                                                                                    }
                                                                                    if ((NIL == _prev_bind_0_$2651) && (NIL == set.set_emptyP(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)))) {
                                                                                        _values_$2772 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str119$Abandoning_unexpressed_negations_) });
                                                                                        pph_error.pph_handle_error(_values_$2772, list(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)));
                                                                                    }
                                                                                } finally {
                                                                                    pph_vars.$pph_unexpressed_negations$.rebind(_prev_bind_0_$2762, thread);
                                                                                }
                                                                            } else {
                                                                                _prev_bind_0_$2651 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                                                                                    pph_macros.herald_new_discourse_context();
                                                                                    boolean arg6719 = false;
                                                                                    try {
                                                                                        arg6719 = true;
                                                                                        pph_drs.pph_ensure_discourse_participant_rms();
                                                                                        _prev_bind_0_$2762 = misc_utilities.initialized_p(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread));
                                                                                        _values_$2772 = pph_vars.$pph_unexpressed_negations$.currentBinding(thread);
                                                                                        try {
                                                                                            pph_vars.$pph_unexpressed_negations$.bind(NIL != _prev_bind_0_$2762 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                                                                                            new_format_string2 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                                                                            try {
                                                                                                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                                                                                thread.resetMultipleValues();
                                                                                                _prev_bind_0_$2681 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                                                                try {
                                                                                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                                                    reuseP2 = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    boolean arg7560 = false;
                                                                                                    try {
                                                                                                        arg7560 = true;
                                                                                                        thread.resetMultipleValues();
                                                                                                        _prev_bind_0_$2742 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                                                        try {
                                                                                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                                            _values_$2752 = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            _prev_bind_0_$2701 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                                            try {
                                                                                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                                                local_state2 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                                                _prev_bind_0_$2711 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    memoization_state.$memoization_state$.bind(local_state2, thread);
                                                                                                                    original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                                                                                                                    boolean arg8401 = false;
                                                                                                                    try {
                                                                                                                        arg8401 = true;
                                                                                                                        pph_phrase_generate_1(phrase);
                                                                                                                        arg8401 = false;
                                                                                                                    } finally {
                                                                                                                        if (arg8401) {
                                                                                                                            final SubLObject _prev_bind_0_$2723 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                final SubLObject _values_$2733 = getValuesAsVector();
                                                                                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                                                                                                                restoreValuesFromVector(_values_$2733);
                                                                                                                            } finally {
                                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2723, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    _prev_bind_0_$2722 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                        final SubLObject _values_$2732 = getValuesAsVector();
                                                                                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                                                                                                        restoreValuesFromVector(_values_$2732);
                                                                                                                    } finally {
                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2722, thread);
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$2711, thread);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$2701, thread);
                                                                                                            }
                                                                                                            if ((_values_$2752 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                                            }
                                                                                                        } finally {
                                                                                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$2742, thread);
                                                                                                        }
                                                                                                        arg7560 = false;
                                                                                                    } finally {
                                                                                                        if (arg7560) {
                                                                                                            final SubLObject _prev_bind_0_$2743 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                final SubLObject _values_$2753 = getValuesAsVector();
                                                                                                                if (NIL == reuseP2) {
                                                                                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                                                }
                                                                                                                restoreValuesFromVector(_values_$2753);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2743, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    _prev_bind_0_$2742 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        _values_$2752 = getValuesAsVector();
                                                                                                        if (NIL == reuseP2) {
                                                                                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                                        }
                                                                                                        restoreValuesFromVector(_values_$2752);
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2742, thread);
                                                                                                    }
                                                                                                } finally {
                                                                                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$2681, thread);
                                                                                                }
                                                                                            } finally {
                                                                                                pph_macros.$free_pph_problem_store_pointers$.rebind(new_format_string2, thread);
                                                                                            }
                                                                                            if ((NIL == _prev_bind_0_$2762) && (NIL == set.set_emptyP(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)))) {
                                                                                                new_format_string2 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str119$Abandoning_unexpressed_negations_) });
                                                                                                pph_error.pph_handle_error(new_format_string2, list(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)));
                                                                                            }
                                                                                        } finally {
                                                                                            pph_vars.$pph_unexpressed_negations$.rebind(_values_$2772, thread);
                                                                                        }
                                                                                        arg6719 = false;
                                                                                    } finally {
                                                                                        if (arg6719) {
                                                                                            final SubLObject _prev_bind_0_$2763 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                final SubLObject _values_$2773 = getValuesAsVector();
                                                                                                pph_macros.herald_end_of_discourse_context();
                                                                                                pph_macros.clear_pph_discourse_context();
                                                                                                restoreValuesFromVector(_values_$2773);
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2763, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    _prev_bind_0_$2762 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        _values_$2772 = getValuesAsVector();
                                                                                        pph_macros.herald_end_of_discourse_context();
                                                                                        pph_macros.clear_pph_discourse_context();
                                                                                        restoreValuesFromVector(_values_$2772);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2762, thread);
                                                                                    }
                                                                                } finally {
                                                                                    pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$2651, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            pph_vars.$pph_type_level_violations$.rebind(_prev_bind_4_$2541, thread);
                                                                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_3_$2531, thread);
                                                                            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_2_$2521, thread);
                                                                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_1_$2511, thread);
                                                                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$2501, thread);
                                                                        }
                                                                        pph_utilities.pph_pop_environment();
                                                                        restoreValuesFromVector(_values3);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$249, thread);
                                                                    }
                                                                }
                                                            }
                                                            _values = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                local_vars = getValuesAsVector();
                                                                _prev_bind_0_$250 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                                _prev_bind_1_$251 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                _prev_bind_2_$252 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                                                                _prev_bind_3_$253 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                                                _prev_bind_4_$254 = pph_vars.$pph_type_level_violations$.currentBinding(thread);
                                                                try {
                                                                    pph_vars.$pph_language_mt$.bind(language_mt, thread);
                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                    lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                                                                    pph_vars.$paraphrase_mode$.bind(mode, thread);
                                                                    pph_vars.$pph_type_level_violations$.bind(NIL != set.set_p(pph_vars.$pph_type_level_violations$.getDynamicValue(thread)) ? pph_vars.$pph_type_level_violations$.getDynamicValue(thread) : pph_utilities.pph_type_level_violations(catch_var), thread);
                                                                    if (NIL != pph_macros.pph_discourse_context_initializedP()) {
                                                                        pph_drs.pph_ensure_discourse_participant_rms();
                                                                        _prev_bind_0_$265 = misc_utilities.initialized_p(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread));
                                                                        _prev_bind_0_$276 = pph_vars.$pph_unexpressed_negations$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$pph_unexpressed_negations$.bind(NIL != _prev_bind_0_$265 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                                                                            _values_$277 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                                                            try {
                                                                                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                                                                thread.resetMultipleValues();
                                                                                new_format_string = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                                                try {
                                                                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                                    _prev_bind_0_$268 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    boolean arg5037 = false;
                                                                                    try {
                                                                                        arg5037 = true;
                                                                                        thread.resetMultipleValues();
                                                                                        reuseP = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                                        try {
                                                                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                            _prev_bind_0_$274 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            _values_$275 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                            try {
                                                                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                                _prev_bind_0_$270 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                                local_state = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                                try {
                                                                                                    memoization_state.$memoization_state$.bind(_prev_bind_0_$270, thread);
                                                                                                    _prev_bind_0_$271 = memoization_state.memoization_state_original_process(_prev_bind_0_$270);
                                                                                                    boolean arg5878 = false;
                                                                                                    try {
                                                                                                        arg5878 = true;
                                                                                                        pph_phrase_generate_1(phrase);
                                                                                                        arg5878 = false;
                                                                                                    } finally {
                                                                                                        if (arg5878) {
                                                                                                            final SubLObject _prev_bind_0_$261 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                final SubLObject _values_$262 = getValuesAsVector();
                                                                                                                memoization_state.memoization_state_possibly_clear_original_process(_prev_bind_0_$270, _prev_bind_0_$271);
                                                                                                                restoreValuesFromVector(_values_$262);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$261, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    original_memoization_process = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        _prev_bind_0_$272 = getValuesAsVector();
                                                                                                        memoization_state.memoization_state_possibly_clear_original_process(_prev_bind_0_$270, _prev_bind_0_$271);
                                                                                                        restoreValuesFromVector(_prev_bind_0_$272);
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(original_memoization_process, thread);
                                                                                                    }
                                                                                                } finally {
                                                                                                    memoization_state.$memoization_state$.rebind(local_state, thread);
                                                                                                }
                                                                                            } finally {
                                                                                                pph_macros.$pph_external_memoization_state$.rebind(_values_$275, thread);
                                                                                            }
                                                                                            if ((_prev_bind_0_$274 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                            }
                                                                                        } finally {
                                                                                            pph_macros.$pph_memoization_state$.rebind(reuseP, thread);
                                                                                        }
                                                                                        arg5037 = false;
                                                                                    } finally {
                                                                                        if (arg5037) {
                                                                                            final SubLObject _prev_bind_0_$263 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                final SubLObject _values_$264 = getValuesAsVector();
                                                                                                if (NIL == _prev_bind_0_$268) {
                                                                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                                }
                                                                                                restoreValuesFromVector(_values_$264);
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$263, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    reuseP = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        _prev_bind_0_$274 = getValuesAsVector();
                                                                                        if (NIL == _prev_bind_0_$268) {
                                                                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                        }
                                                                                        restoreValuesFromVector(_prev_bind_0_$274);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(reuseP, thread);
                                                                                    }
                                                                                } finally {
                                                                                    pph_macros.$pph_problem_store_pointer$.rebind(new_format_string, thread);
                                                                                }
                                                                            } finally {
                                                                                pph_macros.$free_pph_problem_store_pointers$.rebind(_values_$277, thread);
                                                                            }
                                                                            if ((NIL == _prev_bind_0_$265) && (NIL == set.set_emptyP(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)))) {
                                                                                _values_$277 = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str119$Abandoning_unexpressed_negations_) });
                                                                                pph_error.pph_handle_error(_values_$277, list(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)));
                                                                            }
                                                                        } finally {
                                                                            pph_vars.$pph_unexpressed_negations$.rebind(_prev_bind_0_$276, thread);
                                                                        }
                                                                    } else {
                                                                        _prev_bind_0_$265 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                                                                            pph_macros.herald_new_discourse_context();
                                                                            boolean arg2514 = false;
                                                                            try {
                                                                                arg2514 = true;
                                                                                pph_drs.pph_ensure_discourse_participant_rms();
                                                                                _prev_bind_0_$276 = misc_utilities.initialized_p(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread));
                                                                                _values_$277 = pph_vars.$pph_unexpressed_negations$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_unexpressed_negations$.bind(NIL != _prev_bind_0_$276 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                                                                                    new_format_string = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                                                                        thread.resetMultipleValues();
                                                                                        _prev_bind_0_$268 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                                                        try {
                                                                                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                                            reuseP = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            boolean arg3355 = false;
                                                                                            try {
                                                                                                arg3355 = true;
                                                                                                thread.resetMultipleValues();
                                                                                                _prev_bind_0_$274 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                                                try {
                                                                                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                                    _values_$275 = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    _prev_bind_0_$270 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                                    try {
                                                                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                                        local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                                        _prev_bind_0_$271 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                                        try {
                                                                                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                                                                                            original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                                                                            boolean arg4196 = false;
                                                                                                            try {
                                                                                                                arg4196 = true;
                                                                                                                pph_phrase_generate_1(phrase);
                                                                                                                arg4196 = false;
                                                                                                            } finally {
                                                                                                                if (arg4196) {
                                                                                                                    final SubLObject _prev_bind_0_$2721 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                        final SubLObject _values_$2731 = getValuesAsVector();
                                                                                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                                                                        restoreValuesFromVector(_values_$2731);
                                                                                                                    } finally {
                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2721, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            _prev_bind_0_$272 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                final SubLObject _values_$273 = getValuesAsVector();
                                                                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                                                                restoreValuesFromVector(_values_$273);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$272, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$271, thread);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$270, thread);
                                                                                                    }
                                                                                                    if ((_values_$275 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                                    }
                                                                                                } finally {
                                                                                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$274, thread);
                                                                                                }
                                                                                                arg3355 = false;
                                                                                            } finally {
                                                                                                if (arg3355) {
                                                                                                    final SubLObject _prev_bind_0_$2741 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        final SubLObject _values_$2751 = getValuesAsVector();
                                                                                                        if (NIL == reuseP) {
                                                                                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                                        }
                                                                                                        restoreValuesFromVector(_values_$2751);
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2741, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            _prev_bind_0_$274 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                _values_$275 = getValuesAsVector();
                                                                                                if (NIL == reuseP) {
                                                                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                                }
                                                                                                restoreValuesFromVector(_values_$275);
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$274, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$268, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        pph_macros.$free_pph_problem_store_pointers$.rebind(new_format_string, thread);
                                                                                    }
                                                                                    if ((NIL == _prev_bind_0_$276) && (NIL == set.set_emptyP(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)))) {
                                                                                        new_format_string = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str119$Abandoning_unexpressed_negations_) });
                                                                                        pph_error.pph_handle_error(new_format_string, list(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread)));
                                                                                    }
                                                                                } finally {
                                                                                    pph_vars.$pph_unexpressed_negations$.rebind(_values_$277, thread);
                                                                                }
                                                                                arg2514 = false;
                                                                            } finally {
                                                                                if (arg2514) {
                                                                                    final SubLObject _prev_bind_0_$2761 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        final SubLObject _values_$2771 = getValuesAsVector();
                                                                                        pph_macros.herald_end_of_discourse_context();
                                                                                        pph_macros.clear_pph_discourse_context();
                                                                                        restoreValuesFromVector(_values_$2771);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2761, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            _prev_bind_0_$276 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                _values_$277 = getValuesAsVector();
                                                                                pph_macros.herald_end_of_discourse_context();
                                                                                pph_macros.clear_pph_discourse_context();
                                                                                restoreValuesFromVector(_values_$277);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$276, thread);
                                                                            }
                                                                        } finally {
                                                                            pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$265, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    pph_vars.$pph_type_level_violations$.rebind(_prev_bind_4_$254, thread);
                                                                    pph_vars.$paraphrase_mode$.rebind(_prev_bind_3_$253, thread);
                                                                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_2_$252, thread);
                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_1_$251, thread);
                                                                    pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$250, thread);
                                                                }
                                                                pph_utilities.pph_pop_environment();
                                                                restoreValuesFromVector(local_vars);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_values, thread);
                                                            }
                                                        } finally {
                                                            pph_utilities.$pph_current_environment$.rebind(_prev_bind_0_$278, thread);
                                                        }
                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                            format_nil.force_format(T, $str120$__PPH_PHRASE_GENERATE_Output_list, pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            arg1533 = false;
                                                        } else {
                                                            arg1533 = false;
                                                        }
                                                    } else {
                                                        arg1533 = false;
                                                    }
                                                }

                                        } finally {
                                            if (arg1533) {
                                                final SubLObject _prev_bind_0_$2781 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    final SubLObject local_vars2 = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                        format_nil.force_format(T, $str121$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    pph_macros.pph_handle_local_vars(local_vars2);
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                        format_nil.force_format(T, $str122$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2781, thread);
                                                }
                                            }
                                        }
                                        _prev_bind_0_$278 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            _values = getValuesAsVector();
                                            local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                format_nil.force_format(T, $str121$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            pph_macros.pph_handle_local_vars(local_vars);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                format_nil.force_format(T, $str122$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$278, thread);
                                        }
                                    } finally {
                                        pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_2_$247, thread);
                                        pph_vars.$pph_noted_var_types$.rebind(_prev_bind_1_$246, thread);
                                        pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$245, thread);
                                    }
                                } finally {
                                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$244, thread);
                                }
                            } catch (final Throwable arg19740) {
                                Errors.handleThrowable(arg19740, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(ccatch_env_var, thread);
                        }
                    } catch (final Throwable arg19742) {
                        error_message = Errors.handleThrowable(arg19742, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (((SubLObject) (error_message)).isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(((SubLObject) (error_message))), $str22$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                    }
                }
            } finally {
                pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1_$207, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$206, thread);
            }
            if (NIL != error_message) {
                pph_phrase_possibly_generate_foolproof(phrase);
            }
        } finally {
            pph_vars.$pph_use_expansions_for_precisionP$.rebind(_prev_bind_13, thread);
            pph_vars.$generation_level$.rebind(_prev_bind_12, thread);
            wff_utilities.$check_arityP$.rebind(_prev_bind_11, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_generate_1(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_vars.$pph_cycls$.currentBinding(thread);
        try {
            pph_vars.$pph_cycls$.bind(cons(v_object, pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
            final SubLObject doneP = pph_phrase.pph_phrase_doneP(phrase);
            if (NIL == doneP) {
                if (NIL != list_utilities.list_starts_with_repeating_sequenceP(pph_vars.$pph_cycls$.getDynamicValue(thread), symbol_function(EQUAL), THREE_INTEGER, UNPROVIDED)) {
                    final SubLObject new_format_string = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str123$Repeating_sequence_in_paraphrase_) });
                    pph_error.pph_handle_error(new_format_string, list(pph_vars.$pph_cycls$.getDynamicValue(thread)));
                } else
                    if ((NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) || (NIL != pph_phrase.pph_cycl_phrase_p(phrase))) {
                        pph_methods_formulas.do_generate_phrase_from_template(phrase);
                    } else
                        if (pph_phrase.pph_phrase_category(phrase, UNPROVIDED).eql($$PossessivePhrase)) {
                            generate_poss_phrase(phrase);
                        } else
                            if (NIL != pph_ordinal_phrase_requiring_special_handlingP(phrase)) {
                                generate_ordinal_phrase(phrase);
                            } else
                                if (NIL == pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
                                    pph_phrase_resolution.pph_phrase_get_string(phrase, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (NIL != pph_methods_formulas.pph_negative_polarity_sentenceP(v_object)) {
                                        final SubLObject _prev_bind_0_$279 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_operator_scope_context$.bind(cons($NO, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread)), thread);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str125$Inside_operator_scope__S, $NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            pph_phrase_try_methods(phrase);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str126$Leaving_operator_scope__S, $NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0_$279, thread);
                                        }
                                    } else {
                                        pph_phrase_try_methods(phrase);
                                    }





            }
        } finally {
            pph_vars.$pph_cycls$.rebind(_prev_bind_0, thread);
        }
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            pph_phrase_possibly_generate_foolproof(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_skip_methodP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread)) && (NIL != pph_skip_methodP_internal($pph_method_stack$.getDynamicValue(thread))));
    }

    public static SubLObject pph_skip_methodP_internal(final SubLObject current) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_skip_methodP_internal_two(current, pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread));
    }

    public static SubLObject pph_skip_methodP_internal_two(final SubLObject current, final SubLObject suspended) {
        final SubLObject skipP = set.set_memberP(current, suspended);
        if ((NIL != skipP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str127$Skipping__S___, current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return skipP;
    }

    public static SubLObject pph_truncate_method_context(final SubLObject method, SubLObject leave_top) {
        if (leave_top == UNPROVIDED) {
            leave_top = ONE_INTEGER;
        }
        return pph_ntruncate_method_context(method, leave_top);
    }

    public static SubLObject pph_ntruncate_method_context(final SubLObject method, final SubLObject leave_top) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == getf(method, $CONTEXT, UNPROVIDED)) {
            return values(method, ZERO_INTEGER);
        }
        if (!leave_top.isPositive()) {
            return values(remf(method, $CONTEXT), ZERO_INTEGER);
        }
        final SubLObject matrix_method = getf(method, $CONTEXT, NIL);
        if (NIL == matrix_method) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject truncated_matrix_method = pph_ntruncate_method_context(matrix_method, leave_top);
        final SubLObject depth = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (leave_top.numG(depth)) {
            return values(putf(method, $CONTEXT, truncated_matrix_method), number_utilities.f_1X(depth));
        }
        return values(putf(method, $CONTEXT, getf(truncated_matrix_method, $CONTEXT, UNPROVIDED)), depth);
    }

    public static SubLObject pph_phrase_try_methods(final SubLObject phrase) {
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject v_methods = pph_types.get_paraphrase_methods(v_object);
        return pph_phrase_try_these_methods(phrase, v_methods);
    }

    public static SubLObject pph_phrase_try_these_methods(final SubLObject phrase, final SubLObject v_methods) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject successful_method = NIL;
        final SubLObject backup_phrase = ((NIL != pph_macros.handling_pph_method_failures_p()) && (NIL == pph_vars.pph_generate_alternative_phrasesP())) ? $DONT_NEED_BACKUP_PHRASE : pph_phrase.pph_phrase_create_backup(phrase);
        final SubLObject dtr_demerits = subtract(pph_phrase.pph_phrase_demerits(phrase), pph_phrase.pph_phrase_top_level_demerits(phrase));
        final SubLObject best_method = v_methods.first();
        final SubLObject minimum_demerits = second(best_method);
        SubLObject failed_zero_demerit_methods = NIL;
        if (!ZERO_INTEGER.eql(minimum_demerits)) {
            pph_phrase.pph_phrase_maybe_note_problem(phrase, PPH_PHRASE_TRY_METHODS, $NO_ZERO_DEMERIT_METHODS, list($CYCL, v_object, $BEST_METHOD, best_method));
        }
        SubLObject remaining;
        SubLObject method;
        SubLObject current;
        SubLObject datum;
        SubLObject method_symbol;
        SubLObject method_demerits;
        SubLObject timed_outP;
        SubLObject method_failure;
        SubLObject old_pph_method_stack;
        SubLObject _prev_bind_0;
        SubLObject current_phrase;
        SubLObject time;
        SubLObject time_var;
        SubLObject _prev_bind_0_$280;
        SubLObject _prev_bind_2;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_0_$281;
        for (remaining = NIL, remaining = v_methods; (NIL != remaining) && ((NIL == successful_method) || (NIL != pph_vars.pph_generate_alternative_phrasesP())); remaining = remaining.rest()) {
            method = remaining.first();
            datum = current = method;
            method_symbol = NIL;
            method_demerits = NIL;
            destructuring_bind_must_consp(current, datum, $list134);
            method_symbol = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list134);
            method_demerits = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL == misc_utilities.initialized_p(pph_vars.$pph_phrase_methods$.getDynamicValue(thread))) || (NIL == subl_promotions.memberP(method_symbol, dictionary.dictionary_lookup_without_values(pph_vars.$pph_phrase_methods$.getDynamicValue(thread), phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                    if (NIL != misc_utilities.initialized_p(pph_vars.$pph_phrase_methods$.getDynamicValue(thread))) {
                        dictionary_utilities.dictionary_push(pph_vars.$pph_phrase_methods$.getDynamicValue(thread), phrase, method_symbol);
                    }
                    if ((!method_symbol.isSymbol()) || (NIL == fboundp(method_symbol))) {
                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                            Errors.warn($str135$_S_is_not_an_FBOUNDP_symbol_, method_symbol);
                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                    } else
                        if (NIL != pph_vars.pph_too_many_demerits_p(add(dtr_demerits, method_demerits), UNPROVIDED)) {
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str136$___S_demerits_exceeds_cutoff_of__, new SubLObject[]{ add(dtr_demerits, method_demerits), pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread), method_demerits, method, dtr_demerits });
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                        } else {
                            timed_outP = NIL;
                            method_failure = NIL;
                            old_pph_method_stack = $pph_method_stack$.getDynamicValue(thread);
                            _prev_bind_0 = $pph_method_stack$.currentBinding(thread);
                            try {
                                $pph_method_stack$.bind(list(new SubLObject[]{ $METHOD, method_symbol, $CYCL, v_object, $AGR_PREDS, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), $CATEGORY, pph_phrase.pph_phrase_category(phrase, UNPROVIDED), $DEMERIT_CUTOFF, pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread) }), thread);
                                if (NIL != old_pph_method_stack) {
                                    $pph_method_stack$.setDynamicValue(pph_truncate_method_context(putf($pph_method_stack$.getDynamicValue(thread), $CONTEXT, old_pph_method_stack), UNPROVIDED), thread);
                                }
                                if (NIL == pph_skip_methodP()) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format_nil.force_format(T, $str141$__Trying__S___Remaining___S, method, remaining, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    current_phrase = (NIL != pph_phrase.pph_phrase_doneP(phrase)) ? pph_phrase.pph_phrase_copy(backup_phrase, NIL, NIL) : phrase;
                                    time = NIL;
                                    time_var = get_internal_real_time();
                                    _prev_bind_0_$280 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                                    _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                                    _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                        pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time(NIL), thread);
                                        pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                                        pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                                        if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                                            try {
                                                thread.throwStack.push($PPH_METHOD_FAILURE);
                                                _prev_bind_0_$281 = $currently_metered_pph_phrase_methods$.currentBinding(thread);
                                                try {
                                                    $currently_metered_pph_phrase_methods$.bind(cons(method_symbol, $currently_metered_pph_phrase_methods$.getDynamicValue(thread)), thread);
                                                    pph_phrase_try_method(current_phrase, method_symbol, method_demerits, backup_phrase);
                                                } finally {
                                                    $currently_metered_pph_phrase_methods$.rebind(_prev_bind_0_$281, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var) {
                                                method_failure = Errors.handleThrowable(ccatch_env_var, $PPH_METHOD_FAILURE);
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                        }
                                        timed_outP = pph_macros.pph_timeout_time_reachedP();
                                    } finally {
                                        pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_3, thread);
                                        pph_macros.$pph_timeout_time$.rebind(_prev_bind_2, thread);
                                        pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$280, thread);
                                    }
                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    if ((NIL != misc_utilities.initialized_p($pph_phrase_method_times$.getDynamicValue(thread))) && (NIL == subl_promotions.memberP(method_symbol, $currently_metered_pph_phrase_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                                        dictionary_utilities.dictionary_increment($pph_phrase_method_times$.getDynamicValue(thread), method_symbol, time);
                                    }
                                    if (current_phrase.eql(phrase) && (NIL != pph_phrase.pph_phrase_doneP(current_phrase))) {
                                        successful_method = method_symbol;
                                    } else
                                        if (NIL != pph_phrase.pph_phrase_doneP(current_phrase)) {
                                            pph_phrase.pph_phrase_add_alternative(phrase, current_phrase);
                                        } else
                                            if ((NIL != pph_vars.pph_problem_reporting_on_p()) && method_demerits.isZero()) {
                                                failed_zero_demerit_methods = cons(method_symbol, failed_zero_demerit_methods);
                                            }


                                    if (NIL != timed_outP) {
                                        pph_phrase.pph_phrase_maybe_note_problem(phrase, PPH_PHRASE_TRY_METHODS, $TOO_MUCH_TIME, UNPROVIDED);
                                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                            Errors.warn($str143$Exceeded_timeout_on____S, current_phrase);
                                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                        }
                                        pph_abort();
                                    }
                                    if ((NIL != method_failure) && (NIL != remaining)) {
                                        pph_macros.throw_pph_method_failure(method_failure);
                                    }
                                }
                            } finally {
                                $pph_method_stack$.rebind(_prev_bind_0, thread);
                            }
                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list134);
            }
        }
        if ((($VERBOSE == pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread)) && ((NIL == pph_phrase.pph_phrase_doneP(phrase)) || pph_phrase.pph_phrase_top_level_demerits(phrase).isPositive())) && (NIL != failed_zero_demerit_methods)) {
            pph_phrase_report_problems(phrase, failed_zero_demerit_methods, successful_method);
        }
        pph_phrase.pph_phrase_maybe_dump_problem_reports(phrase, UNPROVIDED);
        return values(pph_phrase.pph_phrase_output_list(phrase), successful_method);
    }

    public static SubLObject pph_abort() {
        final SubLObject new_format_string = cconcatenate($str17$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str18$__, format_nil.format_nil_a_no_copy($str145$Aborting_PPH_call___) });
        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        return NIL;
    }

    public static SubLObject pph_phrase_report_problems(final SubLObject phrase, final SubLObject failed_zero_demerit_methods, final SubLObject successful_method) {
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if (((NIL == pph_phrase.pph_phrase_doneP(phrase)) || pph_phrase.pph_phrase_top_level_demerits(phrase).isPositive()) && (NIL != failed_zero_demerit_methods)) {
            Errors.warn($str146$Zero_demerit_methods_failed____In, v_object, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED));
            SubLObject cdolist_list_var = failed_zero_demerit_methods;
            SubLObject failed_method = NIL;
            failed_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject problems = pph_phrase.pph_phrase_reporter_problems(phrase, failed_method);
                format(T, $str147$_____S____Reported_Problems___S__, failed_method, problems);
                cdolist_list_var = cdolist_list_var.rest();
                failed_method = cdolist_list_var.first();
            } 
            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                format(T, $str148$___Successful_method___S__demerit, new SubLObject[]{ successful_method, pph_phrase.pph_phrase_top_level_demerits(phrase), pph_phrase.pph_phrase_string(phrase, UNPROVIDED) });
            }
            pph_print_context(UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_print_context(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str149$__Context____Top_level_CycL___S__, new SubLObject[]{ pph_vars.pph_top_level_cycl(), pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), pph_vars.$paraphrase_mode$.getDynamicValue(thread) });
        if (NIL != pph_vars.$paraphrase_precision$.getDynamicValue(thread)) {
            format(stream, $str150$_Precision___S__, pph_vars.$paraphrase_precision$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject pph_phrase_try_method(final SubLObject phrase, final SubLObject method_symbol, final SubLObject method_demerits, final SubLObject backup_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str151$__Trying__S_____, $pph_method_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject var_types_shadow = dictionary_utilities.copy_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$pph_var_types_counter$.currentBinding(thread);
        try {
            pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
            pph_macros.$pph_var_types_counter$.bind(number_utilities.f_1X(pph_macros.$pph_var_types_counter$.getDynamicValue(thread)), thread);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str152$__Entering_PPH_SETTING_VAR_TYPES_, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            try {
                final SubLObject _prev_bind_0_$282 = pph_vars.$pph_var_types$.currentBinding(thread);
                try {
                    pph_vars.$pph_var_types$.bind(var_types_shadow, thread);
                    final SubLObject _prev_bind_0_$283 = Errors.$continue_cerrorP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$284 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                    try {
                        Errors.$continue_cerrorP$.bind(NIL, thread);
                        pph_error.$pph_error_handling_onP$.bind(T, thread);
                        if (NIL != pph_error.pph_break_on_errorP()) {
                            if (method_demerits.isPositive()) {
                                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                    Errors.warn($str153$__Adding__S_demerits_for__S____S, method_demerits, method_symbol, phrase);
                                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                }
                                pph_phrase.pph_phrase_set_top_level_demerits(phrase, add(pph_phrase.pph_phrase_demerits(NIL != pph_phrase.pph_phrase_p(backup_phrase, UNPROVIDED) ? backup_phrase : phrase), method_demerits), method_symbol);
                            }
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                format_nil.force_format(T, $str154$__PPH_phrase_immediately_before_c, method_symbol, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            pph_methods.funcall_pph_method(method_symbol, phrase);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                format_nil.force_format(T, $str155$__PPH_phrase_immediately_after_ca, method_symbol, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (((NIL == pph_phrase.pph_phrase_doneP(phrase)) || error_message.isString()) || (NIL != pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), UNPROVIDED))) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str156$_S_failed_, method_symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                if (NIL != pph_macros.handling_pph_method_failures_p()) {
                                    pph_macros.throw_pph_method_failure($pph_method_stack$.getDynamicValue(thread));
                                } else {
                                    pph_phrase.pph_phrase_revert_to_backup(phrase, backup_phrase);
                                }
                            }
                        } else {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$284 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (method_demerits.isPositive()) {
                                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                                Errors.warn($str153$__Adding__S_demerits_for__S____S, method_demerits, method_symbol, phrase);
                                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                            }
                                            pph_phrase.pph_phrase_set_top_level_demerits(phrase, add(pph_phrase.pph_phrase_demerits(NIL != pph_phrase.pph_phrase_p(backup_phrase, UNPROVIDED) ? backup_phrase : phrase), method_demerits), method_symbol);
                                        }
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                            format_nil.force_format(T, $str154$__PPH_phrase_immediately_before_c, method_symbol, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        pph_methods.funcall_pph_method(method_symbol, phrase);
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                            format_nil.force_format(T, $str155$__PPH_phrase_immediately_after_ca, method_symbol, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        if (((NIL == pph_phrase.pph_phrase_doneP(phrase)) || error_message.isString()) || (NIL != pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), UNPROVIDED))) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str156$_S_failed_, method_symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (NIL != pph_macros.handling_pph_method_failures_p()) {
                                                pph_macros.throw_pph_method_failure($pph_method_stack$.getDynamicValue(thread));
                                            } else {
                                                pph_phrase.pph_phrase_revert_to_backup(phrase, backup_phrase);
                                            }
                                        }
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$284, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str22$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                            }
                        }
                    } finally {
                        pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1_$284, thread);
                        Errors.$continue_cerrorP$.rebind(_prev_bind_0_$283, thread);
                    }
                    final SubLObject total_demerits = pph_phrase.pph_phrase_demerits(phrase);
                    if (NIL == error_message) {
                        if (NIL != pph_vars.pph_too_many_demerits_p(total_demerits, UNPROVIDED)) {
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str157$___S_demerits_exceeds_cutoff_of__, total_demerits, pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread), phrase);
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                        } else
                            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                if ((NIL != subl_promotions.positive_integer_p(total_demerits)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                                    format_nil.force_format(T, $str158$___S_____S_demerits___S___, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), pph_phrase.pph_phrase_output_list(phrase), total_demerits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_phrase.pph_phrase_add_justification(phrase, pph_phrase.pph_code_justification(method_symbol, UNPROVIDED));
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str159$____S__S______S___S__, method_symbol, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), pph_phrase.pph_phrase_output_list(phrase), pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } else
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                    format_nil.force_format(T, $str160$____S__S______S, method_symbol, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }


                    }
                } finally {
                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$282, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$285 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str161$__Leaving_PPH_SETTING_VAR_TYPES_I, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str162$___Output_list___S__, pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str163$___Setting__S_to____S, pph_vars.$pph_var_types$.getDynamicValue(thread), dictionary.dictionary_values(var_types_shadow), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        pph_macros.pph_reset_var_types(var_types_shadow);
                    } else
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str164$___Leaving__PPH_VAR_TYPES___S, dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }

                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$285, thread);
                }
            }
        } finally {
            pph_macros.$pph_var_types_counter$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_noted_var_types$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_possibly_generate_foolproof(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread).isInteger()) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str165$Can_t_use_foolproof_generation_wi, pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread));
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
        } else
            if (NIL == pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str166$Can_t_use_foolproof_generation_on);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
            } else {
                pph_phrase.pph_phrase_set_string(phrase, string_utilities.str_by_type(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
            }

        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_poss_phrase(final SubLObject phrase) {
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            return phrase;
        }
        pph_phrase.pph_phrase_set_category_to_np(phrase);
        pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            possessivize_pph_phrase(phrase);
        }
        return phrase;
    }

    public static SubLObject possessivize_pph_phrase(final SubLObject phrase) {
        final SubLObject output_list = pph_phrase.pph_phrase_output_list(phrase);
        SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(list_utilities.last_one(output_list));
        SubLObject doneP = NIL;
        final SubLObject the_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject use_possessive_pronounP = NIL;
        if ((NIL != pph_phrase.pph_known_cycl_p(the_cycl)) && (NIL != list_utilities.singletonP(output_list))) {
            final SubLObject binders_of_phrase = pph_phrase_resolution.pph_phrase_could_bind_possessive_here(phrase);
            final SubLObject binders_cycls = pph_phrase.pph_phrase_cycls_of_phrases(binders_of_phrase);
            use_possessive_pronounP = subl_promotions.memberP(the_cycl, binders_cycls, UNPROVIDED, UNPROVIDED);
        }
        if (((((((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_mother(phrase))) && (NIL != pph_phrase.pph_phrase_npP(pph_phrase.pph_phrase_mother(phrase)))) && TWO_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(pph_phrase.pph_phrase_mother(phrase)))) && phrase.eql(pph_phrase.pph_phrase_nth_dtr(pph_phrase.pph_phrase_mother(phrase), ZERO_INTEGER))) && (NIL != pph_phrase.pph_phrase_nbarP(pph_phrase.pph_phrase_nth_dtr(pph_phrase.pph_phrase_mother(phrase), ONE_INTEGER)))) && ((NIL != pph_phrase.pph_heavy_npP(phrase)) || (ONE_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(phrase)) && (NIL != pph_phrase.pph_heavy_npP(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER)))))) {
            pph_phrase.set_pph_phrase_dtrs_from_list(pph_phrase.pph_phrase_mother(phrase), list(pph_data_structures.new_pph_phrase($$$the, UNPROVIDED, UNPROVIDED), pph_phrase.pph_phrase_nth_dtr(pph_phrase.pph_phrase_mother(phrase), ONE_INTEGER), pph_data_structures.new_pph_phrase($$$of, UNPROVIDED, UNPROVIDED), pph_phrase.pph_phrase_nth_dtr(pph_phrase.pph_phrase_mother(phrase), ZERO_INTEGER)), UNPROVIDED);
            doneP = T;
        } else
            if (NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(new_item)) {
                final SubLObject apostrophe_item = pph_question.new_pph_phrase_filler_item($str169$_s);
                final SubLObject existing_olists = pph_data_structures.pph_phrase_output_item_nospace_group_items(new_item);
                pph_data_structures.pph_phrase_output_item_nospace_group_set_items(new_item, append(existing_olists, list(list(apostrophe_item))));
            } else
                if (NIL != use_possessive_pronounP) {
                    final SubLObject string = pph_possessive_pronoun_for_cycl(the_cycl);
                    if (NIL != pph_string.pph_string_p(string)) {
                        pph_data_structures.pph_phrase_output_item_set_string(new_item, string);
                        pph_data_structures.pph_phrase_output_item_set_agr_pred(new_item, $$pronounStrings);
                    }
                } else {
                    new_item = pph_methods_formulas.pph_possessivize_output_item(new_item);
                }


        if (NIL == doneP) {
            pph_phrase.pph_phrase_set_output_list(phrase, list_utilities.replace_last(output_list, new_item), UNPROVIDED);
        }
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_alternatives(phrase);
        SubLObject alternative = NIL;
        alternative = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            possessivize_pph_phrase(alternative);
            cdolist_list_var = cdolist_list_var.rest();
            alternative = cdolist_list_var.first();
        } 
        pph_phrase.pph_phrase_set_category(phrase, $$PossessivePhrase, UNPROVIDED);
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_possessive_pronoun_for_cycl(final SubLObject the_cycl) {
        final SubLObject person = pph_methods.pph_person(the_cycl);
        final SubLObject number = pph_methods.pph_number(the_cycl);
        final SubLObject gender = pph_methods.pph_gender(the_cycl);
        final SubLObject pronoun_nart = pph_methods_lexicon.pph_pronoun_nart(pph_methods_lexicon.new_pph_pronoun_agr(person, number, gender), $$PossessivePronoun_Post);
        return generate_phrase_no_checks(pronoun_nart, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_ordinal_phrase_requiring_special_handlingP(final SubLObject phrase) {
        return makeBoolean((NIL != pph_phrase.pph_ordinal_phraseP(phrase)) && (!pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isNumber()));
    }

    public static SubLObject generate_ordinal_phrase(final SubLObject phrase) {
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            return phrase;
        }
        pph_phrase.pph_phrase_set_category(phrase, pph_utilities.pph_nbar_category(), UNPROVIDED);
        pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            ordinalize_pph_phrase(phrase);
        }
        return phrase;
    }

    public static SubLObject ordinalize_pph_phrase(final SubLObject phrase) {
        pph_phrase.pph_phrase_set_category(phrase, $$OrdinalPhrase, UNPROVIDED);
        final SubLObject output_list = pph_phrase.pph_phrase_output_list(phrase);
        final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(list_utilities.last_one(output_list));
        if (NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(new_item)) {
            final SubLObject suffix_item = pph_question.new_pph_phrase_filler_item($$$th);
            final SubLObject existing_olists = pph_data_structures.pph_phrase_output_item_nospace_group_items(new_item);
            pph_data_structures.pph_phrase_output_item_nospace_group_set_items(new_item, append(existing_olists, list(list(suffix_item))));
        } else {
            final SubLObject ordinalized_string = pph_methods_formulas.ordinal_form(pph_data_structures.pph_phrase_output_item_string(new_item));
            pph_data_structures.pph_phrase_output_item_set_string(new_item, ordinalized_string);
        }
        pph_phrase.pph_phrase_set_output_list(phrase, list_utilities.replace_last(output_list, new_item), UNPROVIDED);
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject with_output_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list179, append(body, NIL));
    }

    public static SubLObject do_output_list_test_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list180);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_set = NIL;
        destructuring_bind_must_consp(current, datum, $list180);
        v_set = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$287 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list180);
            current_$287 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list180);
            if (NIL == member(current_$287, $list181, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$287 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list180);
        }
        final SubLObject forces_tail = property_list_member($FORCES, current);
        final SubLObject forces = (NIL != forces_tail) ? cadr(forces_tail) : NIL;
        final SubLObject do_imperative_tail = property_list_member($DO_IMPERATIVE, current);
        final SubLObject do_imperative = (NIL != do_imperative_tail) ? cadr(do_imperative_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_PPH_REGRESSION_STORE, bq_cons(v_set, $list186), list(DO_PPH_FORCES_LIST, list($FORCES, forces, $DO_IMPERATIVE, do_imperative), list(WITH_PPH_TEST_OBJECT, bq_cons(WITH_OUTPUT_LIST, append(body, NIL)))));
    }

    public static SubLObject do_core_output_list_regression(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return $list190;
    }

    public static SubLObject declare_pph_main_file() {
        declareFunction(me, "generate_phrase", "GENERATE-PHRASE", 1, 7, false);
        declareFunction(me, "generate_phrase_no_checks", "GENERATE-PHRASE-NO-CHECKS", 1, 7, false);
        declareFunction(me, "generate_phrase_no_checks_memoized_internal", "GENERATE-PHRASE-NO-CHECKS-MEMOIZED-INTERNAL", 9, 0, false);
        declareFunction(me, "generate_phrase_no_checks_memoized", "GENERATE-PHRASE-NO-CHECKS-MEMOIZED", 9, 0, false);
        declareFunction(me, "generate_string_from_phrase_naut", "GENERATE-STRING-FROM-PHRASE-NAUT", 1, 3, false);
        declareFunction(me, "generate_good_string_from_phrase_naut", "GENERATE-GOOD-STRING-FROM-PHRASE-NAUT", 1, 3, false);
        declareFunction(me, "generate_phrase_for_java", "GENERATE-PHRASE-FOR-JAVA", 1, 5, false);
        declareFunction(me, "cached_paraphrase_for_java", "CACHED-PARAPHRASE-FOR-JAVA", 1, 1, false);
        declareFunction(me, "cached_disambiguation_paraphrases_for_java", "CACHED-DISAMBIGUATION-PARAPHRASES-FOR-JAVA", 1, 1, false);
        declareFunction(me, "generate_phrase_for_java_no_checks", "GENERATE-PHRASE-FOR-JAVA-NO-CHECKS", 1, 5, false);
        declareFunction(me, "gen_template_query_sentence_assertion_p", "GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P", 1, 0, false);
        declareFunction(me, "generate_phrase_int", "GENERATE-PHRASE-INT", 2, 0, false);
        declareFunction(me, "generate_disambiguation_phrase", "GENERATE-DISAMBIGUATION-PHRASE", 1, 5, false);
        declareFunction(me, "generate_disambiguation_phrases", "GENERATE-DISAMBIGUATION-PHRASES", 1, 6, false);
        declareFunction(me, "use_cached_generations_p", "USE-CACHED-GENERATIONS-P", 1, 0, false);
        declareFunction(me, "generate_disambiguation_phrases_for_java", "GENERATE-DISAMBIGUATION-PHRASES-FOR-JAVA", 1, 6, false);
        declareFunction(me, "alphabetize_pph_javalists", "ALPHABETIZE-PPH-JAVALISTS", 2, 1, false);
        declareFunction(me, "generate_disambiguation_phrases_int", "GENERATE-DISAMBIGUATION-PHRASES-INT", 1, 7, false);
        declareFunction(me, "pph_blacklist_for_objects_and_strings", "PPH-BLACKLIST-FOR-OBJECTS-AND-STRINGS", 2, 0, false);
        declareFunction(me, "generate_disambiguation_phrases_and_types", "GENERATE-DISAMBIGUATION-PHRASES-AND-TYPES", 1, 5, false);
        declareFunction(me, "generate_assertion_output_list", "GENERATE-ASSERTION-OUTPUT-LIST", 1, 1, false);
        declareFunction(me, "generate_pph_output_list", "GENERATE-PPH-OUTPUT-LIST", 1, 5, false);
        declareFunction(me, "generate_pph_output_list_no_checks", "GENERATE-PPH-OUTPUT-LIST-NO-CHECKS", 1, 5, false);
        declareFunction(me, "generate_pph_output_list_internal", "GENERATE-PPH-OUTPUT-LIST-INTERNAL", 7, 0, false);
        declareFunction(me, "generate_pph_output_lists_for_term", "GENERATE-PPH-OUTPUT-LISTS-FOR-TERM", 1, 6, false);
        declareFunction(me, "generate_pph_string_combo_for_term", "GENERATE-PPH-STRING-COMBO-FOR-TERM", 1, 6, false);
        declareFunction(me, "pph_phrase_with_alternatives_for_term", "PPH-PHRASE-WITH-ALTERNATIVES-FOR-TERM", 7, 0, false);
        declareFunction(me, "pph_sanitize_output_list", "PPH-SANITIZE-OUTPUT-LIST", 2, 0, false);
        declareFunction(me, "pph_sanitize_output_item", "PPH-SANITIZE-OUTPUT-ITEM", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_strip_anchor_tags", "PPH-PHRASE-OUTPUT-ITEM-STRIP-ANCHOR-TAGS", 1, 0, false);
        declareFunction(me, "pph_strip_anchor_tags", "PPH-STRIP-ANCHOR-TAGS", 1, 0, false);
        declareFunction(me, "pph_string_for_arg_position", "PPH-STRING-FOR-ARG-POSITION", 2, 1, false);
        declareFunction(me, "pph_output_list_arg_position_precedesP", "PPH-OUTPUT-LIST-ARG-POSITION-PRECEDES?", 3, 0, false);
        declareFunction(me, "pph_agr_pred_for_arg_position", "PPH-AGR-PRED-FOR-ARG-POSITION", 2, 0, false);
        declareFunction(me, "generate_text_wXsentential_force", "GENERATE-TEXT-W/SENTENTIAL-FORCE", 1, 6, false);
        declareFunction(me, "valid_pph_language_mt_specifierP", "VALID-PPH-LANGUAGE-MT-SPECIFIER?", 1, 0, false);
        declareFunction(me, "maybe_note_bad_generate_text_result", "MAYBE-NOTE-BAD-GENERATE-TEXT-RESULT", 9, 1, false);
        declareFunction(me, "note_bad_generate_text_result", "NOTE-BAD-GENERATE-TEXT-RESULT", 9, 1, false);
        declareFunction(me, "output_generate_text_bad_results", "OUTPUT-GENERATE-TEXT-BAD-RESULTS", 0, 0, false);
        declareFunction(me, "output_generate_text_bad_results_to_tsv", "OUTPUT-GENERATE-TEXT-BAD-RESULTS-TO-TSV", 0, 0, false);
        declareFunction(me, "recheck_generate_text_bad_results", "RECHECK-GENERATE-TEXT-BAD-RESULTS", 0, 0, false);
        declareFunction(me, "generate_text_wXsentential_force_no_checks", "GENERATE-TEXT-W/SENTENTIAL-FORCE-NO-CHECKS", 1, 6, false);
        declareFunction(me, "pph_discourse_referent_tracking_pointlessP", "PPH-DISCOURSE-REFERENT-TRACKING-POINTLESS?", 1, 0, false);
        declareFunction(me, "generate_text_wXsentential_force_int", "GENERATE-TEXT-W/SENTENTIAL-FORCE-INT", 6, 1, false);
        declareFunction(me, "generate_text_wXsentential_force_and_focus_argnum", "GENERATE-TEXT-W/SENTENTIAL-FORCE-AND-FOCUS-ARGNUM", 2, 5, false);
        declareFunction(me, "generate_text", "GENERATE-TEXT", 1, 5, false);
        declareFunction(me, "generate_poss", "GENERATE-POSS", 1, 1, false);
        declareFunction(me, "pph_phrase_generate_string_from_cycl", "PPH-PHRASE-GENERATE-STRING-FROM-CYCL", 1, 2, false);
        declareFunction(me, "set_pph_initialized", "SET-PPH-INITIALIZED", 0, 0, false);
        declareFunction(me, "pph_initializedP", "PPH-INITIALIZED?", 0, 0, false);
        declareFunction(me, "ensure_pph_initialized", "ENSURE-PPH-INITIALIZED", 0, 0, false);
        declareFunction(me, "initialize_paraphrase_cycl", "INITIALIZE-PARAPHRASE-CYCL", 0, 0, false);
        declareFunction(me, "clear_paraphrase_caches", "CLEAR-PARAPHRASE-CACHES", 0, 2, false);
        declareFunction(me, "pph_phrase_generate", "PPH-PHRASE-GENERATE", 1, 3, false);
        declareFunction(me, "pph_phrase_generate_1", "PPH-PHRASE-GENERATE-1", 1, 0, false);
        declareFunction(me, "pph_skip_methodP", "PPH-SKIP-METHOD?", 0, 0, false);
        declareFunction(me, "pph_skip_methodP_internal", "PPH-SKIP-METHOD?-INTERNAL", 1, 0, false);
        declareFunction(me, "pph_skip_methodP_internal_two", "PPH-SKIP-METHOD?-INTERNAL-TWO", 2, 0, false);
        declareFunction(me, "pph_truncate_method_context", "PPH-TRUNCATE-METHOD-CONTEXT", 1, 1, false);
        declareFunction(me, "pph_ntruncate_method_context", "PPH-NTRUNCATE-METHOD-CONTEXT", 2, 0, false);
        declareFunction(me, "pph_phrase_try_methods", "PPH-PHRASE-TRY-METHODS", 1, 0, false);
        declareFunction(me, "pph_phrase_try_these_methods", "PPH-PHRASE-TRY-THESE-METHODS", 2, 0, false);
        declareFunction(me, "pph_abort", "PPH-ABORT", 0, 0, false);
        declareFunction(me, "pph_phrase_report_problems", "PPH-PHRASE-REPORT-PROBLEMS", 3, 0, false);
        declareFunction(me, "pph_print_context", "PPH-PRINT-CONTEXT", 0, 1, false);
        declareFunction(me, "pph_phrase_try_method", "PPH-PHRASE-TRY-METHOD", 4, 0, false);
        declareFunction(me, "pph_phrase_possibly_generate_foolproof", "PPH-PHRASE-POSSIBLY-GENERATE-FOOLPROOF", 1, 0, false);
        declareFunction(me, "generate_poss_phrase", "GENERATE-POSS-PHRASE", 1, 0, false);
        declareFunction(me, "possessivize_pph_phrase", "POSSESSIVIZE-PPH-PHRASE", 1, 0, false);
        declareFunction(me, "pph_possessive_pronoun_for_cycl", "PPH-POSSESSIVE-PRONOUN-FOR-CYCL", 1, 0, false);
        declareFunction(me, "pph_ordinal_phrase_requiring_special_handlingP", "PPH-ORDINAL-PHRASE-REQUIRING-SPECIAL-HANDLING?", 1, 0, false);
        declareFunction(me, "generate_ordinal_phrase", "GENERATE-ORDINAL-PHRASE", 1, 0, false);
        declareFunction(me, "ordinalize_pph_phrase", "ORDINALIZE-PPH-PHRASE", 1, 0, false);
        declareMacro(me, "with_output_list", "WITH-OUTPUT-LIST");
        declareMacro(me, "do_output_list_test_method", "DO-OUTPUT-LIST-TEST-METHOD");
        declareMacro(me, "do_core_output_list_regression", "DO-CORE-OUTPUT-LIST-REGRESSION");
        return NIL;
    }

    public static SubLObject init_pph_main_file() {
        defconstant("*PPH-SBHL-SPACES-TO-RESOURCE*", SIX_INTEGER);
        deflexical("*GENERATE-TEXT-BAD-RESULTS*", SubLSystemTrampolineFile.maybeDefault($generate_text_bad_results$, $generate_text_bad_results$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*PPH-INITIALIZED?*", SubLSystemTrampolineFile.maybeDefault($sym106$_PPH_INITIALIZED__, $pph_initializedP$, NIL));
        deflexical("*PPH-RECURSION-LIMIT*", SubLSystemTrampolineFile.maybeDefault($pph_recursion_limit$, $pph_recursion_limit$, $int$100));
        defparameter("*PPH-METHOD-STACK*", NIL);
        defparameter("*PPH-PHRASE-METHOD-TIMES*", misc_utilities.uninitialized());
        defparameter("*CURRENTLY-METERED-PPH-PHRASE-METHODS*", NIL);
        return NIL;
    }

    public static SubLObject setup_pph_main_file() {
        register_cyc_api_function(GENERATE_PHRASE, $list10, $str11$_param_OBJECT__the_CycL_object_fo, $list12, $list13);
        memoization_state.note_memoized_function(GENERATE_PHRASE_NO_CHECKS_MEMOIZED);
        register_cyc_api_function(GENERATE_PHRASE_FOR_JAVA, $list29, $str30$Return_paraphrase_info_in_a_java_, $list31, $list32);
        register_cyc_api_function(GENERATE_DISAMBIGUATION_PHRASES_FOR_JAVA, $list53, $str54$_param_FORCE__pph_force_p__param_, $list55, $list56);
        register_cyc_api_function($sym85$GENERATE_TEXT_W_SENTENTIAL_FORCE, $list86, $str87$generates_text_for_a_given_object, $list88, $list89);
        declare_defglobal($generate_text_bad_results$);
        declare_defglobal($sym106$_PPH_INITIALIZED__);
        declare_defglobal($pph_recursion_limit$);
        sunit_external.define_test_category($$$Java_Phrase_Supercategory, UNPROVIDED);
        sunit_external.define_test_category($$$Output_List_Subcategory, list($$$Java_Phrase_Supercategory));
        sunit_external.define_test_suite($$$Java_Phrase_Test_Battery, list($$$Java_Phrase_Supercategory), UNPROVIDED, UNPROVIDED);
        sunit_external.define_test_suite($$$Output_List_Test_Battery, list($$$Output_List_Subcategory), UNPROVIDED, UNPROVIDED);
        define_test_case_table_int($sym85$GENERATE_TEXT_W_SENTENTIAL_FORCE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list194, $KB, $FULL, $WORKING_, T }), $list198);
        define_test_case_table_int(GENERATE_DISAMBIGUATION_PHRASES_INT, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list194, $KB, $FULL, $WORKING_, T }), $list200);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_main_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_main_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_main_file();
    }

    
}

/**
 * Total time: 6762 ms language_mt language_mt domain_mt domain_mt mode mode
 * phrase phrase phrase phrase phrase phrase phrase phrase phrase language_mt
 * domain_mt mode phrase phrase language_mt domain_mt mode phrase phrase phrase
 * phrase phrase phrase phrase phrase phrase phrase phrase phrase language_mt
 * domain_mt mode phrase phrase language_mt domain_mt mode phrase phrase phrase
 * phrase phrase
 */
