package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_templates
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_templates";
  public static final String myFingerPrint = "43ea588dec239bb4bbe3afdee693be3510a067f94afb232c6f116b57e2b7e5a9";
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 847L)
  private static SubLSymbol $within_initialize_gen_template_storeP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
  private static SubLSymbol $pph_kappa_justification_template_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
  private static SubLSymbol $rephrase_gen_template_for_kappa_pred_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 14545L)
  private static SubLSymbol $pph_template_bound_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
  private static SubLSymbol $phrase_naut_arg_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
  private static SubLSymbol $pph_dnf_clausal_form_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
  private static SubLSymbol $gen_template_verbosity_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 95446L)
  private static SubLSymbol $phrase_naut_deepening_inference_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 96776L)
  private static SubLSymbol $do_pph_expand_phrase_nauts_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 104723L)
  private static SubLSymbol $meta_template_null$;
  private static final SubLString $str0$_PPH_error_level_;
  private static final SubLString $str1$__;
  private static final SubLString $str2$Recursive_call_to_INITIALIZE_GEN_;
  private static final SubLSymbol $kw3$NEW;
  private static final SubLSymbol $kw4$INITIALIZED;
  private static final SubLString $str5$gen_template_store_length_of__S_i;
  private static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const7$EverythingPSC;
  private static final SubLObject $const8$NLTemplateGenerationPredicate;
  private static final SubLObject $const9$isa;
  private static final SubLSymbol $kw10$BREADTH;
  private static final SubLSymbol $kw11$QUEUE;
  private static final SubLSymbol $kw12$STACK;
  private static final SubLSymbol $sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw14$ERROR;
  private static final SubLString $str15$_A_is_not_a__A;
  private static final SubLSymbol $sym16$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw17$CERROR;
  private static final SubLString $str18$continue_anyway;
  private static final SubLSymbol $kw19$WARN;
  private static final SubLString $str20$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str21$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str22$attempting_to_bind_direction_link;
  private static final SubLList $list23;
  private static final SubLString $str24$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLString $str25$gen_template_store_length__S_is_i;
  private static final SubLString $str26$gen_template_store_length__S_is_u;
  private static final SubLObject $const27$Relation;
  private static final SubLSymbol $sym28$SPEC_;
  private static final SubLSymbol $kw29$DONE;
  private static final SubLString $str30$Initializing__S___;
  private static final SubLSymbol $kw31$GAF;
  private static final SubLSymbol $kw32$OFF;
  private static final SubLSymbol $kw33$FAST;
  private static final SubLSymbol $sym34$ADD_GEN_TEMPLATE;
  private static final SubLSymbol $kw35$TRUE;
  private static final SubLString $str36$Unable_to_add_assertion_to_gen_te;
  private static final SubLSymbol $sym37$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str38$___Top_level_CycL___S;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$PPH_KAPPA_JUSTIFICATION_TEMPLATE;
  private static final SubLSymbol $sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED;
  private static final SubLSymbol $kw42$ANYTHING;
  private static final SubLSymbol $sym43$_PPH_KAPPA_JUSTIFICATION_TEMPLATE_CACHING_STATE_;
  private static final SubLObject $const44$Kappa;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$TEMPLATE;
  private static final SubLSymbol $sym47$VARS;
  private static final SubLSymbol $sym48$_REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED_CACHING_STATE_;
  private static final SubLInteger $int49$1024;
  private static final SubLString $str50$kappaGenTemplateRuleForArity;
  private static final SubLSymbol $sym51$_RULE;
  private static final SubLList $list52;
  private static final SubLObject $const53$InferencePSC;
  private static final SubLSymbol $sym54$ASSERTION_P;
  private static final SubLSymbol $kw55$REINITIALIZED;
  private static final SubLSymbol $sym56$REMOVE_GEN_TEMPLATE;
  private static final SubLString $str57$PPH_PHRASE_FROM_ASSERTION_passed_;
  private static final SubLString $str58$PPH_PHRASE_FROM_ASSERTION_passed_;
  private static final SubLSymbol $kw59$SLOW;
  private static final SubLSymbol $sym60$EL_FORMULA_P;
  private static final SubLString $str61$______expanded_template_for__S___;
  private static final SubLSymbol $sym62$REPEATED_ARGS_PHRASE_NAUT_P;
  private static final SubLSymbol $sym63$GENERIC_ARG_P;
  private static final SubLSymbol $sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_;
  private static final SubLObject $const65$TheNthFn;
  private static final SubLString $str66$_S_can_t_begin_a___GenTemplateRec;
  private static final SubLSymbol $kw67$IGNORE;
  private static final SubLString $str68$Wf_problem_with__S;
  private static final SubLString $str69$_S_expects_a_closed_formula_for_i;
  private static final SubLString $str70$_S_expects_a_cycl_sentence_askabl;
  private static final SubLObject $const71$SententialConstituent;
  private static final SubLSymbol $sym72$PPH_SPEC_;
  private static final SubLObject $const73$LexicalWord;
  private static final SubLString $str74$_S_is_required_to_be_a___LexicalW;
  private static final SubLString $str75$_S_exceeds_the_maxArity___S__allo;
  private static final SubLObject $const76$argIsa;
  private static final SubLObject $const77$GeneralLexiconMt;
  private static final SubLList $list78;
  private static final SubLObject $const79$Thing;
  private static final SubLString $str80$_S_isn_t_a__S_w_r_t___S;
  private static final SubLString $str81$__Self_referential___genTemplate_;
  private static final SubLString $str82$__Bad_generic_arg_keyword___S__in;
  private static final SubLObject $const83$genTemplate;
  private static final SubLObject $const84$genTemplate_QuerySentence;
  private static final SubLObject $const85$genTemplate_Constrained;
  private static final SubLObject $const86$detailedIsaParaphrase;
  private static final SubLString $str87$_non_wf__needs_instructions_for_i;
  private static final SubLSymbol $sym88$PHRASE_NAUT_ARG;
  private static final SubLString $str89$_S_has_no_known_arity___;
  private static final SubLSymbol $sym90$_PHRASE_NAUT_ARG_CACHING_STATE_;
  private static final SubLInteger $int91$128;
  private static final SubLList $list92;
  private static final SubLString $str93$_S_is_not_a_well_formed_genTempla;
  private static final SubLString $str94$PPH_PHRASE_FROM_GENTEMPLATE_PHRAS;
  private static final SubLList $list95;
  private static final SubLSymbol $kw96$ARG1;
  private static final SubLSymbol $sym97$PPH_ARG_POSITION_SPECIFIER_;
  private static final SubLObject $const98$PossessivePhrase;
  private static final SubLString $str99$Don_t_know_how_to_make_a_PPH_PHRA;
  private static final SubLString $str100$Couldn_t_make_PPH_phrase_from__S;
  private static final SubLSymbol $kw101$SUBJECT_VERB;
  private static final SubLString $str102$Bad_Nth_phrase___S__Dtr_count_is_;
  private static final SubLString $str103$Phrase_specified_to_agree_with_it;
  private static final SubLString $str104$Can_t_dereference__S_in____S;
  private static final SubLString $str105$Potentially_recursive_agr___S____;
  private static final SubLString $str106$Dereferenced__S_to__S;
  private static final SubLSymbol $sym107$PPH_HEAD_DTR_NAUT_;
  private static final SubLSymbol $kw108$ARG2;
  private static final SubLString $str109$Incompatible_constraint__S_on__S;
  private static final SubLString $str110$NthPhraseAgrFn;
  private static final SubLSymbol $kw111$PEER;
  private static final SubLString $str112$__Warning__null_constraint_on__S_;
  private static final SubLString $str113$Don_t_know_what_to_do_with__S_con;
  private static final SubLObject $const114$Verb;
  private static final SubLList $list115;
  private static final SubLObject $const116$Determiner;
  private static final SubLList $list117;
  private static final SubLList $list118;
  private static final SubLSymbol $kw119$DET_NBAR;
  private static final SubLSymbol $kw120$ANY;
  private static final SubLSymbol $kw121$NL_PREDS;
  private static final SubLSymbol $kw122$POS_PRED;
  private static final SubLString $str123$__Agr_preds_for_the_determiner__S;
  private static final SubLString $str124$Using_default_agr_preds__S_for__S;
  private static final SubLSymbol $sym125$PPH_AGR_PREDS_FOR_DET_CYCL;
  private static final SubLList $list126;
  private static final SubLObject $const127$denotation;
  private static final SubLSymbol $sym128$PPH_GENL_POS_PRED_;
  private static final SubLObject $const129$genFormat_ArgFixed;
  private static final SubLObject $const130$equals;
  private static final SubLSymbol $sym131$PPH_DNF_CLAUSAL_FORM_CACHED;
  private static final SubLSymbol $sym132$_PPH_DNF_CLAUSAL_FORM_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym133$PPH_DNF_CLAUSAL_FORM;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$FORT_P;
  private static final SubLSymbol $sym136$GENERALITY_ESTIMATE;
  private static final SubLList $list137;
  private static final SubLString $str138$Don_t_know_how_to_convert__S_to__;
  private static final SubLObject $const139$Determiner_Indefinite;
  private static final SubLSymbol $kw140$INDEFINITE;
  private static final SubLObject $const141$Determiner_Definite;
  private static final SubLSymbol $kw142$DEFINITE;
  private static final SubLObject $const143$nounStrings;
  private static final SubLObject $const144$plural_Generic;
  private static final SubLObject $const145$nonSingular_Generic;
  private static final SubLObject $const146$nonPlural_Generic;
  private static final SubLSymbol $sym147$GENTEMPLATE_PHRASE_FROM_PPH_PHRASE_INT;
  private static final SubLObject $const148$verbStrings;
  private static final SubLSymbol $sym149$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER;
  private static final SubLSymbol $sym150$DO_PPH_PHRASES_FOR_FORMULA;
  private static final SubLSymbol $kw151$UNSPECIFIED;
  private static final SubLList $list152;
  private static final SubLString $str153$__Found_PPH_PHRASE_for__S_____S__;
  private static final SubLSymbol $sym154$GENERATE_PHRASE_FROM_TEMPLATE;
  private static final SubLSymbol $sym155$_;
  private static final SubLSymbol $sym156$PPH_PHRASE_TOP_LEVEL_DEMERITS;
  private static final SubLSymbol $kw157$RANDOM;
  private static final SubLSymbol $sym158$_;
  private static final SubLSymbol $sym159$GEN_TEMPLATE_VERBOSITY;
  private static final SubLSymbol $sym160$GET_GEN_TEMPLATE_ASSERTION;
  private static final SubLSymbol $kw161$GEN_FORMAT;
  private static final SubLString $str162$Couldn_t_use_gen_template_____S__;
  private static final SubLString $str163$Expected_gen_template__got__S__;
  private static final SubLString $str164$Skipping_forbidden_lexical_assert;
  private static final SubLSymbol $kw165$INVERSE;
  private static final SubLString $str166$__Reinitializing_relns_to_use___;
  private static final SubLObject $const167$genlPreds;
  private static final SubLSymbol $kw168$DEPTH;
  private static final SubLObject $const169$True_JustificationTruth;
  private static final SubLString $str170$Inverting_templates_for__S;
  private static final SubLSymbol $sym171$PPH_GENL_RELATION_;
  private static final SubLString $str172$Relns_to_use___S__;
  private static final SubLSymbol $sym173$PPH_GENL_PREDS_DISTANCE;
  private static final SubLObject $const174$genlInverse;
  private static final SubLSymbol $kw175$ASSERTION;
  private static final SubLString $str176$__Using_inferior_templates___;
  private static final SubLSymbol $sym177$GENERATION_TEMPLATE_P;
  private static final SubLString $str178$__Head_of_queue_____S__;
  private static final SubLString $str179$Sending_inferior_templates_to_end;
  private static final SubLString $str180$Couldn_t_use_any_gen_templates_fr;
  private static final SubLString $str181$__Reverting_to___genFormat_for__S;
  private static final SubLSymbol $kw182$INFERIOR;
  private static final SubLString $str183$__Populating_gen_template_sets_wi;
  private static final SubLSymbol $kw184$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym185$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str186$Adding__GEN_FORMAT_at_end_of_queu;
  private static final SubLSymbol $sym187$CAND;
  private static final SubLList $list188;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$RELEVANT_PRED_IS_EVERYTHING;
  private static final SubLList $list191;
  private static final SubLString $str192$__Couldn_t_find_paraphrase_templa;
  private static final SubLString $str193$Infinite_recursion_for__S_using__;
  private static final SubLSymbol $sym194$PPH_GFAF_ASSERTIONS_FOR_RELN;
  private static final SubLInteger $int195$250;
  private static final SubLSymbol $sym196$CAR;
  private static final SubLObject $const197$genFormat_Precise;
  private static final SubLString $str198$Template_doesn_t_apply_to_input_f;
  private static final SubLString $str199$___S_is_a_symmetric_binary_predic;
  private static final SubLString $str200$__Switching_arg1_and_arg2_in_phra;
  private static final SubLString $str201$wrong_focal_argnum__wanted__S_;
  private static final SubLString $str202$Template_has_wrong_scope_for__S;
  private static final SubLSymbol $sym203$_GEN_TEMPLATE_VERBOSITY_CACHING_STATE_;
  private static final SubLInteger $int204$10000;
  private static final SubLString $str205$Couldn_t_swtich_arg1_and_arg2___i;
  private static final SubLString $str206$Gen_template_mt__S_not_visible_fr;
  private static final SubLString $str207$Gen_template_preds__S_not_compati;
  private static final SubLList $list208;
  private static final SubLSymbol $kw209$UNKNOWN;
  private static final SubLString $str210$__Checking_precision_of__S_vs___S;
  private static final SubLString $str211$Not_using___genTemplate_because_o;
  private static final SubLString $str212$__Template_judged_imprecise_becau;
  private static final SubLList $list213;
  private static final SubLList $list214;
  private static final SubLString $str215$Deepened____S___to__S;
  private static final SubLObject $const216$deeperGenTemplateRecipe;
  private static final SubLList $list217;
  private static final SubLSymbol $kw218$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw219$MAX_NUMBER;
  private static final SubLSymbol $kw220$MAX_TIME;
  private static final SubLSymbol $kw221$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $kw222$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw223$HL;
  private static final SubLSymbol $kw224$CONTINUABLE_;
  private static final SubLSymbol $kw225$RETURN;
  private static final SubLList $list226;
  private static final SubLSymbol $kw227$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw228$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw229$COMPUTE_INTERSECTION;
  private static final SubLSymbol $kw230$PROBLEM_STORE;
  private static final SubLSymbol $kw231$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw232$NONE;
  private static final SubLString $str233$__Phrasifying__S___;
  private static final SubLList $list234;
  private static final SubLSymbol $kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT;
  private static final SubLString $str236$__Expanded_form_is__S___;
  private static final SubLSymbol $sym237$_EXIT;
  private static final SubLString $str238$Recursion_limit_exceeded_expandin;
  private static final SubLInteger $int239$50;
  private static final SubLString $str240$Already_expanded__S;
  private static final SubLSymbol $sym241$DO_PPH_EXPAND_PHRASE_NAUTS;
  private static final SubLSymbol $sym242$PPH_IDENTITY_TEMPLATE_P;
  private static final SubLString $str243$Expansions_that_refer_to__S_tend_;
  private static final SubLString $str244$Checking__gen_template_store____;
  private static final SubLList $list245;
  private static final SubLString $str246$checking__S;
  private static final SubLString $str247$non_wff_template__S___S;
  private static final SubLString $str248$Checking_the_misc__extent_of___Be;
  private static final SubLString $str249$____;
  private static final SubLObject $const250$Function;
  private static final SubLSymbol $sym251$CONSTANT_P;
  private static final SubLString $str252$Searching___genTemplate_Constrain;
  private static final SubLSymbol $kw253$NULL;
  private static final SubLSymbol $sym254$META_GEN_TEMPLATE_P;
  private static final SubLSymbol $sym255$UPDATE_TEMPLATE_OPERATOR;
  private static final SubLObject $const256$metaGenTemplate_QuerySentence;
  private static final SubLSymbol $kw257$OR;
  private static final SubLSymbol $sym258$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym259$MTEMPLATE_DISJUNCTION_P;
  private static final SubLSymbol $kw260$AND;
  private static final SubLString $str261$dependent_disjunction__a_has_vary;
  private static final SubLString $str262$PPH_Template_Supercategory;
  private static final SubLString $str263$Gen_Template_Subcategory;
  private static final SubLString $str264$Gen_Template_Recipe_Test_Battery;

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 963L)
  public static SubLObject initialize_gen_template_store()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $within_initialize_gen_template_storeP$.getDynamicValue( thread ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
          $str2$Recursive_call_to_INITIALIZE_GEN_ )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ) );
    }
    final SubLObject _prev_bind_0 = $within_initialize_gen_template_storeP$.currentBinding( thread );
    try
    {
      $within_initialize_gen_template_storeP$.bind( T, thread );
      final SubLObject halt_agenda_during_initializationP = makeBoolean( NIL != agenda.agenda_running() && NIL == agenda.current_process_is_agenda() );
      if( NIL != halt_agenda_during_initializationP )
      {
        agenda.halt_agenda( TWO_INTEGER );
      }
      try
      {
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( pph_vars.$gen_template_store_lock$.getGlobalValue() );
          pph_data_structures.clear_gen_template_store();
          pph_functions.initialize_pph_phrase_fns();
          final SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
          try
          {
            pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$2 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
            try
            {
              pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
              final SubLObject reuseP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              try
              {
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$3 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                try
                {
                  pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                  final SubLObject new_or_reused = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$4 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                    final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding( thread );
                    try
                    {
                      memoization_state.$memoization_state$.bind( local_state, thread );
                      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                      try
                      {
                        do_initialize_gen_template_store();
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                        }
                      }
                    }
                    finally
                    {
                      memoization_state.$memoization_state$.rebind( _prev_bind_0_$5, thread );
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$4, thread );
                  }
                  if( new_or_reused == $kw3$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                  {
                    memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                  }
                }
                finally
                {
                  pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$3, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL == reuseP )
                  {
                    pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                }
              }
            }
            finally
            {
              pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( pph_vars.$gen_template_store_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          if( NIL != halt_agenda_during_initializationP )
          {
            agenda.start_agenda( UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
        }
      }
    }
    finally
    {
      $within_initialize_gen_template_storeP$.rebind( _prev_bind_0, thread );
    }
    pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
    pph_data_structures.note_gen_template_store_initialized();
    return $kw4$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 1825L)
  public static SubLObject gen_template_store_length_saneP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject num_templates_in_kb = ZERO_INTEGER;
    final SubLObject length = pph_data_structures.gen_template_store_length();
    if( NIL == subl_promotions.positive_integer_p( length ) )
    {
      Errors.warn( $str5$gen_template_store_length_of__S_i, length );
      return NIL;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
      final SubLObject node_var = $const8$NLTemplateGenerationPredicate;
      final SubLObject _prev_bind_0_$9 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      final SubLObject _prev_bind_1_$10 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const9$isa ), thread );
        sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          SubLObject node_var_$11 = node_var;
          final SubLObject deck_type = $kw12$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw14$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw17$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str18$continue_anyway, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw19$WARN ) )
                  {
                    Errors.warn( $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str18$continue_anyway, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ) ),
                      thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const9$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$13 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$11, UNPROVIDED );
                      while ( NIL != node_var_$11)
                      {
                        final SubLObject tt_node_var = node_var_$11;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const9$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$14 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$23;
                                        for( iteration_state_$23 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$23 ); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next( iteration_state_$23 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$23 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject pred;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  pred = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred ) )
                                                    {
                                                      num_templates_in_kb = Numbers.add( num_templates_in_kb, kb_indexing.num_predicate_extent_index( pred, UNPROVIDED ) );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject pred2 = NIL;
                                                pred2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred2 ) )
                                                    {
                                                      num_templates_in_kb = Numbers.add( num_templates_in_kb, kb_indexing.num_predicate_extent_index( pred2, UNPROVIDED ) );
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  pred2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$16, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$23 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$15, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str22$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                SubLObject instance_tuple = NIL;
                                instance_tuple = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  SubLObject current;
                                  final SubLObject datum = current = instance_tuple;
                                  SubLObject link_node = NIL;
                                  SubLObject mt2 = NIL;
                                  SubLObject tv2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                  mt2 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                  tv2 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                    {
                                      final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject pred;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                pred = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( pred ) )
                                                  {
                                                    num_templates_in_kb = Numbers.add( num_templates_in_kb, kb_indexing.num_predicate_extent_index( pred, UNPROVIDED ) );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$27 = sol;
                                              SubLObject pred2 = NIL;
                                              pred2 = csome_list_var_$27.first();
                                              while ( NIL != csome_list_var_$27)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( pred2 ) )
                                                  {
                                                    num_templates_in_kb = Numbers.add( num_templates_in_kb, kb_indexing.num_predicate_extent_index( pred2, UNPROVIDED ) );
                                                  }
                                                }
                                                csome_list_var_$27 = csome_list_var_$27.rest();
                                                pred2 = csome_list_var_$27.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$18, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$17, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$28;
                              final SubLObject new_list = cdolist_list_var_$28 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$28.first();
                              while ( NIL != cdolist_list_var_$28)
                              {
                                final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject pred3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      pred3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, pred3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( pred3 ) )
                                        {
                                          num_templates_in_kb = Numbers.add( num_templates_in_kb, kb_indexing.num_predicate_extent_index( pred3, UNPROVIDED ) );
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject pred4 = NIL;
                                    pred4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( pred4 ) )
                                        {
                                          num_templates_in_kb = Numbers.add( num_templates_in_kb, kb_indexing.num_predicate_extent_index( pred4, UNPROVIDED ) );
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      pred4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$19, thread );
                                }
                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                generating_fn = cdolist_list_var_$28.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$14, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$14, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const9$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$11 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                            {
                              final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link2 )
                              {
                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links2 )
                                {
                                  SubLObject iteration_state2;
                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                    {
                                      final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                        SubLObject iteration_state_$24;
                                        for( iteration_state_$24 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$24 ); iteration_state_$24 = dictionary_contents.do_dictionary_contents_next( iteration_state_$24 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$24 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol3 = link_nodes4;
                                              if( NIL != set.set_p( sol3 ) )
                                              {
                                                final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node;
                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                    set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol3.isList() )
                                              {
                                                SubLObject csome_list_var4 = sol3;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var4.first();
                                                while ( NIL != csome_list_var4)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var4 = csome_list_var4.rest();
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$22, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$24 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$21, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str22$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$29;
                              final SubLObject new_list2 = cdolist_list_var_$29 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$29.first();
                              while ( NIL != cdolist_list_var_$29)
                              {
                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                  final SubLObject sol4;
                                  final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                  if( NIL != set.set_p( sol4 ) )
                                  {
                                    final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                    SubLObject basis_object4;
                                    SubLObject state4;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                        set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol4.isList() )
                                  {
                                    SubLObject csome_list_var5 = sol4;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var5.first();
                                    while ( NIL != csome_list_var5)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var5 = csome_list_var5.rest();
                                      node_vars_link_node4 = csome_list_var5.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$23, thread );
                                }
                                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                generating_fn2 = cdolist_list_var_$29.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$15, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$20, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$11 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$19, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$13, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$13, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str24$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$12, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$12, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$11, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$11, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$10, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$10, thread );
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$9, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    final SubLObject ratio = Numbers.divide( num_templates_in_kb, length );
    if( ratio.numL( ONE_INTEGER ) )
    {
      Errors.warn( $str25$gen_template_store_length__S_is_i, length, num_templates_in_kb );
      return NIL;
    }
    if( ratio.numG( TEN_INTEGER ) )
    {
      Errors.warn( $str26$gen_template_store_length__S_is_u, length, num_templates_in_kb );
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 2658L)
  public static SubLObject do_initialize_gen_template_store()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
      final SubLObject node_var = $const8$NLTemplateGenerationPredicate;
      final SubLObject _prev_bind_0_$39 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      final SubLObject _prev_bind_1_$40 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const9$isa ), thread );
        sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          SubLObject node_var_$41 = node_var;
          final SubLObject deck_type = $kw12$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$40 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw14$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw17$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str18$continue_anyway, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw19$WARN ) )
                  {
                    Errors.warn( $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str18$continue_anyway, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ) ),
                      thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const9$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$41, UNPROVIDED );
                      while ( NIL != node_var_$41)
                      {
                        final SubLObject tt_node_var = node_var_$41;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const9$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$44 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$53;
                                        for( iteration_state_$53 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$53 ); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next( iteration_state_$53 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$53 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject pred;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  pred = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred ) && NIL != subl_promotions.memberP( $const27$Relation, kb_accessors.arg1_isa( pred, UNPROVIDED ), $sym28$SPEC_, UNPROVIDED ) )
                                                    {
                                                      initialize_gen_templates_for_pred( pred );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject pred2 = NIL;
                                                pred2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred2 ) && NIL != subl_promotions.memberP( $const27$Relation, kb_accessors.arg1_isa( pred2, UNPROVIDED ), $sym28$SPEC_, UNPROVIDED ) )
                                                    {
                                                      initialize_gen_templates_for_pred( pred2 );
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  pred2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$46, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$53 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$45, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str22$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                SubLObject instance_tuple = NIL;
                                instance_tuple = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  SubLObject current;
                                  final SubLObject datum = current = instance_tuple;
                                  SubLObject link_node = NIL;
                                  SubLObject mt2 = NIL;
                                  SubLObject tv2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                  mt2 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                  tv2 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                    {
                                      final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject pred;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                pred = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( pred ) && NIL != subl_promotions.memberP( $const27$Relation, kb_accessors.arg1_isa( pred, UNPROVIDED ), $sym28$SPEC_, UNPROVIDED ) )
                                                  {
                                                    initialize_gen_templates_for_pred( pred );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$57 = sol;
                                              SubLObject pred2 = NIL;
                                              pred2 = csome_list_var_$57.first();
                                              while ( NIL != csome_list_var_$57)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( pred2 ) && NIL != subl_promotions.memberP( $const27$Relation, kb_accessors.arg1_isa( pred2, UNPROVIDED ), $sym28$SPEC_, UNPROVIDED ) )
                                                  {
                                                    initialize_gen_templates_for_pred( pred2 );
                                                  }
                                                }
                                                csome_list_var_$57 = csome_list_var_$57.rest();
                                                pred2 = csome_list_var_$57.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$48, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$47, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$58;
                              final SubLObject new_list = cdolist_list_var_$58 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$58.first();
                              while ( NIL != cdolist_list_var_$58)
                              {
                                final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject pred3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      pred3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, pred3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( pred3 ) && NIL != subl_promotions.memberP( $const27$Relation, kb_accessors.arg1_isa( pred3, UNPROVIDED ), $sym28$SPEC_, UNPROVIDED ) )
                                        {
                                          initialize_gen_templates_for_pred( pred3 );
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject pred4 = NIL;
                                    pred4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( pred4 ) && NIL != subl_promotions.memberP( $const27$Relation, kb_accessors.arg1_isa( pred4, UNPROVIDED ), $sym28$SPEC_, UNPROVIDED ) )
                                        {
                                          initialize_gen_templates_for_pred( pred4 );
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      pred4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$49, thread );
                                }
                                cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                generating_fn = cdolist_list_var_$58.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$44, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$44, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const9$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$50 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$41 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                            {
                              final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link2 )
                              {
                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links2 )
                                {
                                  SubLObject iteration_state2;
                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                    {
                                      final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                        SubLObject iteration_state_$54;
                                        for( iteration_state_$54 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$54 ); iteration_state_$54 = dictionary_contents.do_dictionary_contents_next( iteration_state_$54 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$54 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol3 = link_nodes4;
                                              if( NIL != set.set_p( sol3 ) )
                                              {
                                                final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node;
                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                    set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol3.isList() )
                                              {
                                                SubLObject csome_list_var4 = sol3;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var4.first();
                                                while ( NIL != csome_list_var4)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var4 = csome_list_var4.rest();
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$52, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$54 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$51, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str22$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$59;
                              final SubLObject new_list2 = cdolist_list_var_$59 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$59.first();
                              while ( NIL != cdolist_list_var_$59)
                              {
                                final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                  final SubLObject sol4;
                                  final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                  if( NIL != set.set_p( sol4 ) )
                                  {
                                    final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                    SubLObject basis_object4;
                                    SubLObject state4;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                        set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol4.isList() )
                                  {
                                    SubLObject csome_list_var5 = sol4;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var5.first();
                                    while ( NIL != csome_list_var5)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var5 = csome_list_var5.rest();
                                      node_vars_link_node4 = csome_list_var5.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$53, thread );
                                }
                                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                                generating_fn2 = cdolist_list_var_$59.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$45, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$50, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$41 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$49, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$43, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$43, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str24$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$42, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$42, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$41, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$41, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$54, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$40, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$55, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$40, thread );
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$39, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    pph_data_structures.optimize_pph_phrase_id_index( UNPROVIDED );
    return $kw29$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 2975L)
  public static SubLObject initialize_gen_templates_for_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject progress_note = PrintLow.format( NIL, $str30$Initializing__S___, pred );
    final SubLObject total = kb_indexing.num_predicate_extent_index( pred, UNPROVIDED );
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( progress_note );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$69 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$70 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$71 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_3_$72 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw31$GAF, NIL, NIL );
                  SubLObject done_var_$73 = NIL;
                  final SubLObject token_var_$74 = NIL;
                  while ( NIL == done_var_$73)
                  {
                    final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$74 );
                    final SubLObject valid_$75 = makeBoolean( !token_var_$74.eql( as ) );
                    if( NIL != valid_$75 )
                    {
                      final SubLObject wff_checking_mode = $kw32$OFF;
                      add_gen_template_int( as, wff_checking_mode );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    done_var_$73 = makeBoolean( NIL == valid_$75 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$70, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$72, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$71, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$70, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$69, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$71, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return $kw4$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 3398L)
  public static SubLObject add_gen_template(final SubLObject argument, final SubLObject assertion, SubLObject reinit_phrase_fnsP, SubLObject wff_checking_mode, SubLObject clear_paraphrase_cachesP)
  {
    if( reinit_phrase_fnsP == UNPROVIDED )
    {
      reinit_phrase_fnsP = T;
    }
    if( wff_checking_mode == UNPROVIDED )
    {
      wff_checking_mode = $kw33$FAST;
    }
    if( clear_paraphrase_cachesP == UNPROVIDED )
    {
      clear_paraphrase_cachesP = T;
    }
    if( NIL != list_utilities.singletonP( assertions_high.assertion_arguments( assertion ) ) )
    {
      if( NIL != wff_utilities.non_wff_cached_p( assertion ) )
      {
        wff_utilities.wff_check_assertion( assertion );
      }
      if( NIL == wff_utilities.non_wff_cached_p( assertion ) )
      {
        final SubLObject reln = assertions_high.gaf_arg1( assertion );
        lexicon_utilities.remove_cached_lexifications_for_term( reln, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        lexicon_utilities.remove_cached_lexifications_for_term( reln, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != reinit_phrase_fnsP )
        {
          pph_functions.initialize_pph_phrase_fns();
        }
        if( NIL != clear_paraphrase_cachesP )
        {
          pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
        }
        add_gen_template_int( assertion, wff_checking_mode );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 4424L)
  public static SubLObject add_gen_template_int(final SubLObject assertion, final SubLObject wff_checking_mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( assertions_high.assertion_truth( assertion ) != $kw35$TRUE )
    {
      return NIL;
    }
    final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_macros.$creating_permanent_pph_phraseP$.currentBinding( thread );
    try
    {
      pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
      pph_macros.$new_pph_phrase_count$.bind( ZERO_INTEGER, thread );
      pph_macros.$creating_permanent_pph_phraseP$.bind( T, thread );
      SubLObject error_message = NIL;
      final SubLObject _prev_bind_0_$78 = Errors.$continue_cerrorP$.currentBinding( thread );
      final SubLObject _prev_bind_1_$79 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
      try
      {
        Errors.$continue_cerrorP$.bind( NIL, thread );
        pph_error.$pph_error_handling_onP$.bind( T, thread );
        if( NIL != pph_error.pph_break_on_errorP() )
        {
          final SubLObject new_gen_template = new_gen_template_from_assertion( assertion, wff_checking_mode );
          if( NIL != new_gen_template )
          {
            final SubLObject reln = assertions_high.gaf_arg1( assertion );
            final SubLObject existing_sets = gen_template_sets_for_reln( reln, NIL );
            final SubLObject new_sets = add_gen_template_to_sets( new_gen_template, existing_sets );
            if( NIL != new_sets )
            {
              pph_data_structures.set_gen_template_store_value( reln, new_sets );
            }
          }
          else
          {
            final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( TWO_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
                $str36$Unable_to_add_assertion_to_gen_te )
            } );
            pph_error.pph_handle_error( new_format_string, ConsesLow.list( assertion ) );
          }
        }
        else
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$79 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym37$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                final SubLObject new_gen_template2 = new_gen_template_from_assertion( assertion, wff_checking_mode );
                if( NIL != new_gen_template2 )
                {
                  final SubLObject reln2 = assertions_high.gaf_arg1( assertion );
                  final SubLObject existing_sets2 = gen_template_sets_for_reln( reln2, NIL );
                  final SubLObject new_sets2 = add_gen_template_to_sets( new_gen_template2, existing_sets2 );
                  if( NIL != new_sets2 )
                  {
                    pph_data_structures.set_gen_template_store_value( reln2, new_sets2 );
                  }
                }
                else
                {
                  final SubLObject new_format_string2 = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( TWO_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
                      $str36$Unable_to_add_assertion_to_gen_te )
                  } );
                  pph_error.pph_handle_error( new_format_string2, ConsesLow.list( assertion ) );
                }
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$79, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str38$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
          }
        }
      }
      finally
      {
        pph_error.$pph_error_handling_onP$.rebind( _prev_bind_1_$79, thread );
        Errors.$continue_cerrorP$.rebind( _prev_bind_0_$78, thread );
      }
    }
    finally
    {
      pph_macros.$creating_permanent_pph_phraseP$.rebind( _prev_bind_3, thread );
      pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_2, thread );
      pph_macros.$new_pph_phrases$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5134L)
  public static SubLObject gen_template_sets_for_reln(final SubLObject reln, SubLObject check_initializedP)
  {
    if( check_initializedP == UNPROVIDED )
    {
      check_initializedP = T;
    }
    SubLObject ans = pph_data_structures.gen_template_sets_for_reln_from_store( reln, check_initializedP );
    if( NIL != formula_pattern_match.formula_matches_pattern( reln, $list39 ) )
    {
      ans = add_gen_template_to_sets( rephrase_gen_template_for_kappa_pred( reln ), ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
  public static SubLObject clear_pph_kappa_justification_template()
  {
    final SubLObject cs = $pph_kappa_justification_template_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
  public static SubLObject remove_pph_kappa_justification_template()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $pph_kappa_justification_template_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
  public static SubLObject pph_kappa_justification_template_internal()
  {
    final SubLObject template = pph_phrase.pph_code_justification( $sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED, UNPROVIDED );
    ConsesLow.rplacd( conses_high.nthcdr( ONE_INTEGER, template ), $kw42$ANYTHING );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5611L)
  public static SubLObject pph_kappa_justification_template()
  {
    SubLObject caching_state = $pph_kappa_justification_template_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym40$PPH_KAPPA_JUSTIFICATION_TEMPLATE, $sym43$_PPH_KAPPA_JUSTIFICATION_TEMPLATE_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_kappa_justification_template_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 5836L)
  public static SubLObject rephrase_gen_template_for_kappa_predP(final SubLObject gen_template)
  {
    SubLObject cdolist_list_var = pph_phrase.pph_phrase_justification( pph_data_structures.get_gen_template_phrase( gen_template ) );
    SubLObject just = NIL;
    just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != looks_like_kappa_rephrase_ruleP( just ) || NIL != pattern_match.tree_matches_pattern( just, pph_kappa_justification_template() ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      just = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6142L)
  public static SubLObject looks_like_kappa_rephrase_ruleP(final SubLObject just)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( just ) && NIL != assertions_high.rule_assertionP( just ) && NIL != cycl_utilities.expression_find( $const44$Kappa, just, T, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
  public static SubLObject clear_rephrase_gen_template_for_kappa_pred()
  {
    final SubLObject cs = $rephrase_gen_template_for_kappa_pred_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
  public static SubLObject remove_rephrase_gen_template_for_kappa_pred(final SubLObject reln)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rephrase_gen_template_for_kappa_pred_caching_state$.getGlobalValue(), ConsesLow.list( reln ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
  public static SubLObject rephrase_gen_template_for_kappa_pred_internal(final SubLObject reln)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject gen_template = NIL;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( reln, $list45 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject template = list_utilities.alist_lookup_without_values( v_bindings, $sym46$TEMPLATE, UNPROVIDED, UNPROVIDED );
      final SubLObject vars = list_utilities.alist_lookup_without_values( v_bindings, $sym47$VARS, UNPROVIDED, UNPROVIDED );
      SubLObject pph_template = el_utilities.copy_expression( template );
      SubLObject list_var = NIL;
      SubLObject var = NIL;
      SubLObject i = NIL;
      list_var = vars;
      var = list_var.first();
      for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), var = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
      {
        final SubLObject generic_arg = at_utilities.get_generic_arg( number_utilities.f_1X( i ) );
        pph_template = cycl_utilities.formula_nsubst( generic_arg, var, pph_template, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject phrase_naut = ConsesLow.list( pph_functions.termparaphrasefn(), pph_template );
      final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding( thread );
      try
      {
        pph_vars.$pph_current_arg0$.bind( reln, thread );
        final SubLObject justification_as = kappa_gen_template_rule_for_arity( Sequences.length( vars ) );
        SubLObject v_pph_phrase = NIL;
        final SubLObject _prev_bind_0_$81 = pph_macros.$new_pph_phrases$.currentBinding( thread );
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
        final SubLObject _prev_bind_3 = pph_macros.$creating_permanent_pph_phraseP$.currentBinding( thread );
        try
        {
          pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
          pph_macros.$new_pph_phrase_count$.bind( ZERO_INTEGER, thread );
          pph_macros.$creating_permanent_pph_phraseP$.bind( T, thread );
          v_pph_phrase = pph_phrasify_phrase_naut( phrase_naut, pph_utilities.pph_new_empty_map() );
        }
        finally
        {
          pph_macros.$creating_permanent_pph_phraseP$.rebind( _prev_bind_3, thread );
          pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_2, thread );
          pph_macros.$new_pph_phrases$.rebind( _prev_bind_0_$81, thread );
        }
        if( NIL != justification_as )
        {
          pph_phrase.pph_phrase_add_justification( v_pph_phrase, justification_as );
        }
        pph_phrase.pph_phrase_add_justification( v_pph_phrase, pph_phrase.pph_code_justification( $sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED, ConsesLow.list( reln ) ) );
        gen_template = pph_data_structures.new_gen_template( v_pph_phrase, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$pph_current_arg0$.rebind( _prev_bind_0, thread );
      }
    }
    return gen_template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 6301L)
  public static SubLObject rephrase_gen_template_for_kappa_pred(final SubLObject reln)
  {
    SubLObject caching_state = $rephrase_gen_template_for_kappa_pred_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED, $sym48$_REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED_CACHING_STATE_, $int49$1024, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, reln, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rephrase_gen_template_for_kappa_pred_internal( reln ) ) );
      memoization_state.caching_state_put( caching_state, reln, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 7482L)
  public static SubLObject kappa_gen_template_rule_for_arity(final SubLObject v_arity)
  {
    final SubLObject pred = constants_high.find_constant( $str50$kappaGenTemplateRuleForArity );
    SubLObject as = NIL;
    if( NIL != constant_handles.valid_constantP( pred, UNPROVIDED ) )
    {
      as = pph_utilities.pph_removal_ask_variable( $sym51$_RULE, ConsesLow.listS( pred, v_arity, $list52 ), $const53$InferencePSC, UNPROVIDED ).first();
    }
    return as;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 7768L)
  public static SubLObject new_gen_template_from_assertion(final SubLObject assertion, SubLObject wff_checking_mode)
  {
    if( wff_checking_mode == UNPROVIDED )
    {
      wff_checking_mode = $kw33$FAST;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject phrase = pph_phrase_from_assertion( assertion, wff_checking_mode );
    if( NIL != phrase )
    {
      final SubLObject constraint = pph_template_constraint_from_assertion( assertion );
      final SubLObject new_gen_template = pph_data_structures.new_gen_template( phrase, constraint, assertion );
      return new_gen_template;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 8188L)
  public static SubLObject reinitialize_gen_templates_for_reln(final SubLObject reln, SubLObject assertions_to_omit)
  {
    if( assertions_to_omit == UNPROVIDED )
    {
      assertions_to_omit = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( pph_vars.$gen_template_store_lock$.getGlobalValue() );
      pph_data_structures.clear_gen_template_store_value( reln );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
        final SubLObject node_var = $const8$NLTemplateGenerationPredicate;
        final SubLObject _prev_bind_0_$82 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
        final SubLObject _prev_bind_1_$83 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
        try
        {
          sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const9$isa ), thread );
          sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            SubLObject node_var_$84 = node_var;
            final SubLObject deck_type = $kw12$STACK;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            final SubLObject _prev_bind_0_$83 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$84 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw14$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw17$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str18$continue_anyway, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw19$WARN ) )
                    {
                      Errors.warn( $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str18$continue_anyway, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$85 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const9$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const9$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$86 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$86 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const9$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$84, UNPROVIDED );
                        while ( NIL != node_var_$84)
                        {
                          final SubLObject tt_node_var = node_var_$84;
                          SubLObject cdolist_list_var;
                          final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const9$isa ) );
                          SubLObject module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject _prev_bind_0_$87 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ),
                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    SubLObject iteration_state;
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      final SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        final SubLObject _prev_bind_0_$88 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          SubLObject iteration_state_$96;
                                          for( iteration_state_$96 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$96 ); iteration_state_$96 = dictionary_contents.do_dictionary_contents_next( iteration_state_$96 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$96 );
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              final SubLObject _prev_bind_0_$89 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                final SubLObject sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject state;
                                                  SubLObject pred;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    pred = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred ) )
                                                      {
                                                        initialize_gen_templates_for_relnXpred( reln, pred, assertions_to_omit );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var = sol;
                                                  SubLObject pred2 = NIL;
                                                  pred2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred2 ) )
                                                      {
                                                        initialize_gen_templates_for_relnXpred( reln, pred2, assertions_to_omit );
                                                      }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    pred2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$89, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$96 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$88, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str22$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                {
                                  SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  SubLObject instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = instance_tuple;
                                    SubLObject link_node = NIL;
                                    SubLObject mt2 = NIL;
                                    SubLObject tv2 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                    mt2 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
                                    tv2 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$90 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$91 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol;
                                              final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject pred;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  pred = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred ) )
                                                    {
                                                      initialize_gen_templates_for_relnXpred( reln, pred, assertions_to_omit );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var_$100 = sol;
                                                SubLObject pred2 = NIL;
                                                pred2 = csome_list_var_$100.first();
                                                while ( NIL != csome_list_var_$100)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred2 ) )
                                                    {
                                                      initialize_gen_templates_for_relnXpred( reln, pred2, assertions_to_omit );
                                                    }
                                                  }
                                                  csome_list_var_$100 = csome_list_var_$100.rest();
                                                  pred2 = csome_list_var_$100.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$91, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$90, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$101;
                                final SubLObject new_list = cdolist_list_var_$101 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ), sbhl_search_vars.$sbhl_tv$
                                        .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const9$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$101.first();
                                while ( NIL != cdolist_list_var_$101)
                                {
                                  final SubLObject _prev_bind_0_$92 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    final SubLObject sol2;
                                    final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                      SubLObject basis_object2;
                                      SubLObject state2;
                                      SubLObject pred3;
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        pred3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, pred3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred3,
                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred3 ) )
                                          {
                                            initialize_gen_templates_for_relnXpred( reln, pred3, assertions_to_omit );
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      SubLObject csome_list_var3 = sol2;
                                      SubLObject pred4 = NIL;
                                      pred4 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred4 ) )
                                          {
                                            initialize_gen_templates_for_relnXpred( reln, pred4, assertions_to_omit );
                                          }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        pred4 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$92, thread );
                                  }
                                  cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                                  generating_fn = cdolist_list_var_$101.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$87, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$87, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                          SubLObject cdolist_list_var2;
                          final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const9$isa ) ) );
                          SubLObject module_var2 = NIL;
                          module_var2 = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            final SubLObject _prev_bind_0_$93 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node2 = function_terms.naut_to_nart( node_var_$84 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    SubLObject iteration_state2;
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      final SubLObject tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                      {
                                        final SubLObject _prev_bind_0_$94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                          SubLObject iteration_state_$97;
                                          for( iteration_state_$97 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$97 ); iteration_state_$97 = dictionary_contents.do_dictionary_contents_next( iteration_state_$97 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$97 );
                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                  SubLObject basis_object3;
                                                  SubLObject state3;
                                                  SubLObject node_vars_link_node;
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol3.isList() )
                                                {
                                                  SubLObject csome_list_var4 = sol3;
                                                  SubLObject node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                  while ( NIL != csome_list_var4)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                    csome_list_var4 = csome_list_var4.rest();
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$95, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$97 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$94, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str22$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$102;
                                final SubLObject new_list2 = cdolist_list_var_$102 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn2 = NIL;
                                generating_fn2 = cdolist_list_var_$102.first();
                                while ( NIL != cdolist_list_var_$102)
                                {
                                  final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    final SubLObject sol4;
                                    final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                      SubLObject basis_object4;
                                      SubLObject state4;
                                      SubLObject node_vars_link_node3;
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol4.isList() )
                                    {
                                      SubLObject csome_list_var5 = sol4;
                                      SubLObject node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var5.first();
                                      while ( NIL != csome_list_var5)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                        }
                                        csome_list_var5 = csome_list_var5.rest();
                                        node_vars_link_node4 = csome_list_var5.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$96, thread );
                                  }
                                  cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                                  generating_fn2 = cdolist_list_var_$102.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$88, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$93, thread );
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            module_var2 = cdolist_list_var2.first();
                          }
                          node_var_$84 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$92, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$86, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$86, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str24$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$85, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$85, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$84, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$84, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$83, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$98 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$98, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$83, thread );
          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$82, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( pph_vars.$gen_template_store_lock$.getGlobalValue() );
      }
    }
    remove_rephrase_gen_template_for_kappa_pred( reln );
    return $kw55$REINITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 8690L)
  public static SubLObject reinitialize_gen_templates_referencing_phrase_fn(final SubLObject phrase_fn)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject relns = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
      if( NIL != kb_mapping_macros.do_other_index_key_validator( phrase_fn, $kw31$GAF ) )
      {
        final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec( phrase_fn );
        SubLObject final_index_iterator = NIL;
        try
        {
          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw31$GAF, NIL, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( as ) );
            if( NIL != valid && NIL != kb_mapping_macros.do_other_index_assertion_match_p( as ) )
            {
              final SubLObject reln = assertions_high.gaf_arg1( as );
              if( NIL != kb_accessors.relationP( reln ) )
              {
                reinitialize_gen_templates_for_reln( reln, UNPROVIDED );
                relns = ConsesLow.cons( reln, relns );
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL != final_index_iterator )
            {
              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$112, thread );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return relns;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 9068L)
  public static SubLObject initialize_gen_templates_for_relnXpred(final SubLObject reln, final SubLObject pred, final SubLObject assertions_to_omit)
  {
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( reln, ONE_INTEGER, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( reln, ONE_INTEGER, pred );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw31$GAF, NIL, NIL );
            SubLObject done_var_$113 = NIL;
            final SubLObject token_var_$114 = NIL;
            while ( NIL == done_var_$113)
            {
              final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$114 );
              final SubLObject valid_$115 = makeBoolean( !token_var_$114.eql( as ) );
              if( NIL != valid_$115 && NIL == subl_promotions.memberP( as, assertions_to_omit, UNPROVIDED, UNPROVIDED ) )
              {
                add_gen_template_int( as, $kw32$OFF );
              }
              done_var_$113 = makeBoolean( NIL == valid_$115 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return reln;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 9308L)
  public static SubLObject remove_gen_template(final SubLObject argument, final SubLObject assertion, SubLObject reinit_phrase_fnsP)
  {
    if( reinit_phrase_fnsP == UNPROVIDED )
    {
      reinit_phrase_fnsP = T;
    }
    if( NIL == kb_accessors.assertion_still_thereP( assertion, $kw35$TRUE ) && NIL != pph_data_structures.gen_template_store_initializedP() )
    {
      if( NIL != reinit_phrase_fnsP )
      {
        pph_functions.initialize_pph_phrase_fns();
      }
      pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
      final SubLObject reln = assertions_high.gaf_arg1( assertion );
      lexicon_utilities.remove_cached_lexifications_for_term( reln, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      lexicon_utilities.remove_cached_lexifications_for_term( reln, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      reinitialize_gen_templates_for_reln( reln, ConsesLow.list( assertion ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 10035L)
  public static SubLObject pph_phrase_from_assertion(final SubLObject as, SubLObject wff_checking_mode)
  {
    if( wff_checking_mode == UNPROVIDED )
    {
      wff_checking_mode = $kw33$FAST;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject error_message = NIL;
    final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
    try
    {
      Errors.$continue_cerrorP$.bind( NIL, thread );
      pph_error.$pph_error_handling_onP$.bind( T, thread );
      if( NIL != pph_error.pph_break_on_errorP() )
      {
        if( NIL == assertions_high.gaf_assertionP( as ) )
        {
          final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
              $str57$PPH_PHRASE_FROM_ASSERTION_passed_ )
          } );
          pph_error.pph_handle_error( new_format_string, ConsesLow.list( as ) );
        }
        else if( NIL != pph_template_non_wfP( as, wff_checking_mode ) )
        {
          final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
              $str58$PPH_PHRASE_FROM_ASSERTION_passed_ )
          } );
          pph_error.pph_handle_error( new_format_string, ConsesLow.list( as ) );
        }
        else
        {
          final SubLObject phrase_naut = phrase_naut_from_as( as );
          final SubLObject arg_position_map = pph_utilities.pph_new_empty_map();
          final SubLObject _prev_bind_0_$116 = pph_vars.$pph_current_arg0$.currentBinding( thread );
          try
          {
            pph_vars.$pph_current_arg0$.bind( assertions_high.gaf_arg1( as ), thread );
            if( NIL != phrase_naut )
            {
              final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
              final SubLObject _prev_bind_0_$117 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$118 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                ans = pph_phrasify_phrase_naut( phrase_naut, arg_position_map );
                if( NIL != pph_phrase.pph_phrase_p( ans, UNPROVIDED ) )
                {
                  pph_phrase.pph_phrase_add_justification( ans, as );
                  if( NIL != pph_phrase.pph_unknown_cycl_p( pph_phrase.pph_phrase_cycl( ans, UNPROVIDED ) ) )
                  {
                    pph_phrase.pph_phrase_set_cycl( ans, pph_dummy_cycl_from_as( as ) );
                  }
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$118, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$117, thread );
              }
            }
          }
          finally
          {
            pph_vars.$pph_current_arg0$.rebind( _prev_bind_0_$116, thread );
          }
        }
      }
      else
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$118 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym37$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              if( NIL == assertions_high.gaf_assertionP( as ) )
              {
                final SubLObject new_format_string2 = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
                    $str57$PPH_PHRASE_FROM_ASSERTION_passed_ )
                } );
                pph_error.pph_handle_error( new_format_string2, ConsesLow.list( as ) );
              }
              else if( NIL != pph_template_non_wfP( as, wff_checking_mode ) )
              {
                final SubLObject new_format_string2 = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
                    $str58$PPH_PHRASE_FROM_ASSERTION_passed_ )
                } );
                pph_error.pph_handle_error( new_format_string2, ConsesLow.list( as ) );
              }
              else
              {
                final SubLObject phrase_naut2 = phrase_naut_from_as( as );
                final SubLObject arg_position_map2 = pph_utilities.pph_new_empty_map();
                final SubLObject _prev_bind_0_$119 = pph_vars.$pph_current_arg0$.currentBinding( thread );
                try
                {
                  pph_vars.$pph_current_arg0$.bind( assertions_high.gaf_arg1( as ), thread );
                  if( NIL != phrase_naut2 )
                  {
                    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
                    final SubLObject _prev_bind_0_$120 = mt_relevance_macros.$mt$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$119 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                    try
                    {
                      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
                      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
                      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
                      ans = pph_phrasify_phrase_naut( phrase_naut2, arg_position_map2 );
                      if( NIL != pph_phrase.pph_phrase_p( ans, UNPROVIDED ) )
                      {
                        pph_phrase.pph_phrase_add_justification( ans, as );
                        if( NIL != pph_phrase.pph_unknown_cycl_p( pph_phrase.pph_phrase_cycl( ans, UNPROVIDED ) ) )
                        {
                          pph_phrase.pph_phrase_set_cycl( ans, pph_dummy_cycl_from_as( as ) );
                        }
                      }
                    }
                    finally
                    {
                      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_4, thread );
                      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$119, thread );
                      mt_relevance_macros.$mt$.rebind( _prev_bind_0_$120, thread );
                    }
                  }
                }
                finally
                {
                  pph_vars.$pph_current_arg0$.rebind( _prev_bind_0_$119, thread );
                }
              }
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$118, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
        {
          Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str38$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
        }
      }
    }
    finally
    {
      pph_error.$pph_error_handling_onP$.rebind( _prev_bind_2, thread );
      Errors.$continue_cerrorP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 11125L)
  public static SubLObject pph_dummy_cycl_from_as(final SubLObject as)
  {
    if( NIL != assertions_high.gaf_assertionP( as ) )
    {
      final SubLObject reln = assertions_high.gaf_arg1( as );
      final SubLObject dummy_formula = pph_utilities.pph_dummy_formula( reln, UNPROVIDED );
      return dummy_formula;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 11690L)
  public static SubLObject gen_template_recipe_p(final SubLObject candidate, SubLObject predicate, SubLObject wff_checking_mode, SubLObject constraint)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    if( wff_checking_mode == UNPROVIDED )
    {
      wff_checking_mode = $kw33$FAST;
    }
    if( constraint == UNPROVIDED )
    {
      constraint = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != el_utilities.el_formula_p( candidate ) )
    {
      final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
      try
      {
        pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0_$123 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
        try
        {
          pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
          final SubLObject reuseP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          try
          {
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$124 = pph_macros.$pph_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
              final SubLObject new_or_reused = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$125 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
              try
              {
                pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                final SubLObject _prev_bind_0_$126 = memoization_state.$memoization_state$.currentBinding( thread );
                try
                {
                  memoization_state.$memoization_state$.bind( local_state, thread );
                  final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                  try
                  {
                    final SubLObject post_expansion = pph_expand_phrase_nauts( candidate );
                    ans = ( ( wff_checking_mode == $kw59$SLOW ) ? pph_expanded_template_formula_wfP( post_expansion, predicate, constraint ) : pph_expanded_template_formula_wfP_fast( post_expansion, predicate ) );
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$127, thread );
                    }
                  }
                }
                finally
                {
                  memoization_state.$memoization_state$.rebind( _prev_bind_0_$126, thread );
                }
              }
              finally
              {
                pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$125, thread );
              }
              if( new_or_reused == $kw3$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
              {
                memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$124, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL == reuseP )
              {
                pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$128, thread );
            }
          }
        }
        finally
        {
          pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$123, thread );
        }
      }
      finally
      {
        pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 12617L)
  public static SubLObject pph_expanded_template_formula_wfP(final SubLObject candidate, SubLObject predicate, SubLObject constraint)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    if( constraint == UNPROVIDED )
    {
      constraint = NIL;
    }
    assert NIL != el_utilities.el_formula_p( candidate ) : candidate;
    final SubLObject gaps = pph_find_generic_arg_gaps( candidate, pph_utilities.pph_arity( predicate ), constraint );
    if( NIL == set.empty_set_p( gaps ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
          $str61$______expanded_template_for__S___ )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( predicate, candidate, set.set_element_list( gaps ) ) );
    }
    if( NIL != pph_expanded_template_formula_wfP_fast_problemP( candidate, pph_utilities.pph_arity( predicate ) ) )
    {
      return NIL;
    }
    return list_utilities.sublisp_boolean( pph_phrase_from_gentemplate_phrase( candidate, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 13181L)
  public static SubLObject pph_find_generic_arg_gaps(final SubLObject formula, final SubLObject v_arity, SubLObject check_constraint)
  {
    if( check_constraint == UNPROVIDED )
    {
      check_constraint = NIL;
    }
    final SubLObject gaps = set.new_set( UNPROVIDED, UNPROVIDED );
    if( NIL != v_arity )
    {
      SubLObject stopP = NIL;
      final SubLObject repeated_args_phrase_nauts = cycl_utilities.expression_gather( formula, $sym62$REPEATED_ARGS_PHRASE_NAUT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject repeated_generic_args = list_utilities.tree_gather( repeated_args_phrase_nauts, $sym63$GENERIC_ARG_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == stopP )
      {
        SubLObject end_var;
        SubLObject i;
        SubLObject gen_arg;
        for( end_var = number_utilities.f_1X( v_arity ), i = NIL, i = ONE_INTEGER; NIL == stopP && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
        {
          gen_arg = at_utilities.get_generic_arg( i );
          if( NIL != Sequences.find( gen_arg, repeated_generic_args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            stopP = T;
          }
          else if( NIL == cycl_utilities.formula_find( gen_arg, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL == check_constraint || NIL == cycl_utilities.formula_find( gen_arg, check_constraint, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              set.set_add( gen_arg, gaps );
            }
          }
        }
      }
    }
    return gaps;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 13951L)
  public static SubLObject repeated_args_phrase_naut_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.possibly_naut_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( pph_functions.repeatforsubsequentargsfn() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 14195L)
  public static SubLObject pph_expanded_template_formula_wfP_fast(final SubLObject candidate, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    assert NIL != el_utilities.el_formula_p( candidate ) : candidate;
    return makeBoolean( NIL == pph_expanded_template_formula_wfP_fast_problemP( candidate, pph_utilities.pph_arity( predicate ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 14598L)
  public static SubLObject pph_non_template_bound_el_varP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != cycl_variables.el_varP( v_object ) && NIL == subl_promotions.memberP( v_object, $pph_template_bound_vars$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 14752L)
  public static SubLObject pph_template_bound_vars(final SubLObject formula)
  {
    if( NIL != formula_pattern_match.formula_matches_pattern( formula, reader.bq_cons( pph_functions.bestbindingsphrasefn(), $kw42$ANYTHING ) ) )
    {
      return el_utilities.sentence_free_variables( cycl_utilities.formula_arg1( formula, UNPROVIDED ), NIL, $sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 15004L)
  public static SubLObject pph_expanded_template_formula_wfP_fast_problemP(final SubLObject candidate, final SubLObject arity_known)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject this_func = cycl_utilities.formula_arg0( candidate );
    SubLObject problemP = makeBoolean( NIL == pph_functions.pph_phrase_fnP( this_func, UNPROVIDED ) && !this_func.eql( $const65$TheNthFn ) );
    if( NIL != problemP )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
      {
        Errors.warn( $str66$_S_can_t_begin_a___GenTemplateRec, this_func );
        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = $pph_template_bound_vars$.currentBinding( thread );
      try
      {
        $pph_template_bound_vars$.bind( ConsesLow.append( pph_template_bound_vars( candidate ), $pph_template_bound_vars$.getDynamicValue( thread ) ), thread );
        SubLObject this_arg_num = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args( candidate, $kw67$IGNORE );
        SubLObject rest;
        SubLObject this_arg;
        for( rest = NIL, rest = args; NIL == problemP && NIL != rest; rest = rest.rest() )
        {
          this_arg = rest.first();
          this_arg_num = Numbers.add( this_arg_num, ONE_INTEGER );
          if( NIL != pph_expanded_template_formula_arg_wfP_fast_problemP( this_arg, this_arg_num, this_func, arity_known ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
            {
              Errors.warn( $str68$Wf_problem_with__S, this_arg );
              streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
            }
            problemP = T;
          }
        }
      }
      finally
      {
        $pph_template_bound_vars$.rebind( _prev_bind_0, thread );
      }
    }
    return problemP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 15946L)
  public static SubLObject pph_expanded_template_formula_arg_wfP_fast_problemP(SubLObject this_arg, final SubLObject this_arg_num, final SubLObject this_func, final SubLObject arity_known)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != canon_tl.tl_varP( this_arg ) )
    {
      this_arg = cycl_variables.make_el_var( cycl_utilities.formula_arg2( this_arg, UNPROVIDED ) );
    }
    SubLObject problemP = NIL;
    if( this_arg_num.numE( ONE_INTEGER ) && ( this_func.equalp( pph_functions.conditionalphrasefn() ) || this_func.equalp( pph_functions.bestbindingsphrasefn() ) ) )
    {
      if( NIL != collection_defns.cycl_sentence_askableP( this_arg ) )
      {
        final SubLObject closedP = el_utilities.closedP( this_arg, $sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_ );
        if( NIL != kb_utilities.kbeq( this_func, pph_functions.conditionalphrasefn() ) && NIL == closedP )
        {
          final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
              $str69$_S_expects_a_closed_formula_for_i )
          } );
          pph_error.pph_handle_error( new_format_string, ConsesLow.list( this_func, this_arg ) );
          problemP = T;
        }
      }
      else
      {
        final SubLObject new_format_string2 = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
            $str70$_S_expects_a_cycl_sentence_askabl )
        } );
        pph_error.pph_handle_error( new_format_string2, ConsesLow.list( this_func, this_arg_num, this_arg ) );
        problemP = T;
      }
    }
    else if( !this_arg_num.numE( ONE_INTEGER ) || !this_func.equalp( pph_functions.repeatforsubsequentargsfn() ) )
    {
      if( !this_arg_num.numE( ONE_INTEGER ) || !this_func.equalp( pph_functions.phraseformfn() ) || NIL == el_utilities.el_formula_p( this_arg ) )
      {
        if( NIL != el_utilities.el_formula_p( this_arg ) && NIL != subl_promotions.memberP( $const71$SententialConstituent, kb_accessors.argn_isa( this_func, this_arg_num, UNPROVIDED ), $sym72$PPH_SPEC_, UNPROVIDED ) )
        {
          if( !this_func.equalp( pph_functions.termparaphrasefn() ) )
          {
            problemP = pph_expanded_template_formula_wfP_fast_problemP( this_arg, arity_known );
          }
        }
        else if( NIL == cycl_grammar.cycl_variable_p( this_arg ) && NIL == pph_utilities.pph_arg_position_specifierP( this_arg ) && NIL == pph_phrase.pph_phrase_wu_p( function_terms.naut_to_nart( this_arg ) )
            && NIL != subl_promotions.memberP( $const73$LexicalWord, kb_accessors.argn_isa( this_func, this_arg_num, UNPROVIDED ), $sym72$PPH_SPEC_, UNPROVIDED ) )
        {
          final SubLObject new_format_string2 = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
              $str74$_S_is_required_to_be_a___LexicalW )
          } );
          pph_error.pph_handle_error( new_format_string2, ConsesLow.list( this_arg ) );
          problemP = T;
        }
        else if( NIL != at_admitted.generic_arg_p( this_arg ) )
        {
          if( NIL != arity_known && arity_known.numG( ZERO_INTEGER ) && at_utilities.generic_arg_num( this_arg ).numG( arity_known ) )
          {
            final SubLObject new_format_string2 = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
                $str75$_S_exceeds_the_maxArity___S__allo )
            } );
            pph_error.pph_handle_error( new_format_string2, ConsesLow.list( at_utilities.generic_arg_num( this_arg ), arity_known ) );
            problemP = T;
          }
        }
        else if( NIL != constant_handles.constant_p( this_arg ) )
        {
          SubLObject cdolist_list_var;
          final SubLObject gafs = cdolist_list_var = kb_mapping.gather_gaf_arg_index_with_predicate( this_func, ONE_INTEGER, $const76$argIsa, $const77$GeneralLexiconMt, UNPROVIDED );
          SubLObject this_gaf = NIL;
          this_gaf = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = assertions_high.assertion_formula( this_gaf );
            SubLObject foo = NIL;
            SubLObject bar = NIL;
            SubLObject argn = NIL;
            SubLObject coll = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
            foo = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
            bar = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
            argn = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
            coll = current.first();
            current = current.rest();
            if( NIL == current )
            {
              final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
              final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                if( ( argn.numE( ZERO_INTEGER ) || argn.numE( this_arg_num ) ) && !coll.equalp( $const79$Thing ) && NIL == isa.isaP( this_arg, coll, UNPROVIDED, UNPROVIDED ) )
                {
                  final SubLObject new_format_string3 = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
                      $str80$_S_isn_t_a__S_w_r_t___S )
                  } );
                  pph_error.pph_handle_error( new_format_string3, ConsesLow.list( this_arg, coll, pph_vars.$pph_language_mt$.getDynamicValue( thread ) ) );
                  problemP = T;
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_gaf = cdolist_list_var.first();
          }
        }
      }
    }
    return problemP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 19308L)
  public static SubLObject pph_template_non_wfP(final SubLObject as, SubLObject wff_checking_mode)
  {
    if( wff_checking_mode == UNPROVIDED )
    {
      wff_checking_mode = $kw33$FAST;
    }
    return pph_template_formula_non_wfP( assertions_high.gaf_formula( as ), wff_checking_mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 19497L)
  public static SubLObject pph_template_formula_non_wfP(final SubLObject formula, SubLObject wff_checking_mode)
  {
    if( wff_checking_mode == UNPROVIDED )
    {
      wff_checking_mode = $kw33$FAST;
    }
    if( wff_checking_mode == $kw32$OFF )
    {
      return NIL;
    }
    if( NIL != self_referential_gen_template_formulaP( formula ) )
    {
      Errors.warn( $str81$__Self_referential___genTemplate_, formula );
      return T;
    }
    if( NIL != bad_generic_arg_in_gen_template_formula( formula ) )
    {
      Errors.warn( $str82$__Bad_generic_arg_keyword___S__in, bad_generic_arg_in_gen_template_formula( formula ), formula );
      return T;
    }
    if( cycl_utilities.formula_arg0( formula ).equalp( $const83$genTemplate ) )
    {
      return makeBoolean( NIL == gen_template_recipe_p( cycl_utilities.formula_arg( formula, TWO_INTEGER, UNPROVIDED ), cycl_utilities.formula_arg( formula, ONE_INTEGER, UNPROVIDED ), wff_checking_mode, UNPROVIDED ) );
    }
    if( cycl_utilities.formula_arg0( formula ).equalp( $const84$genTemplate_QuerySentence ) )
    {
      return makeBoolean( NIL == gen_template_recipe_p( cycl_utilities.formula_arg( formula, TWO_INTEGER, UNPROVIDED ), NIL, wff_checking_mode, UNPROVIDED ) );
    }
    if( cycl_utilities.formula_arg0( formula ).equalp( $const85$genTemplate_Constrained ) )
    {
      return makeBoolean( NIL == gen_template_recipe_p( cycl_utilities.formula_arg( formula, THREE_INTEGER, UNPROVIDED ), cycl_utilities.formula_arg( formula, ONE_INTEGER, UNPROVIDED ), wff_checking_mode, cycl_utilities
          .formula_arg( formula, TWO_INTEGER, UNPROVIDED ) ) );
    }
    if( cycl_utilities.formula_arg0( formula ).equalp( $const86$detailedIsaParaphrase ) )
    {
      return makeBoolean( NIL == gen_template_recipe_p( cycl_utilities.formula_arg( formula, TWO_INTEGER, UNPROVIDED ), cycl_utilities.formula_arg( formula, ONE_INTEGER, UNPROVIDED ), wff_checking_mode, UNPROVIDED ) );
    }
    final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
        $str87$_non_wf__needs_instructions_for_i )
    } );
    pph_error.pph_handle_error( new_format_string, ConsesLow.list( cycl_utilities.formula_arg0( formula ) ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 20990L)
  public static SubLObject self_referential_gen_template_formulaP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject reln = cycl_utilities.formula_operator( formula );
    final SubLObject phrase_naut = phrase_naut_from_formula( formula );
    SubLObject okP = NIL;
    if( !cycl_utilities.formula_arg0( phrase_naut ).eql( pph_functions.termparaphrasefn() ) || !cycl_utilities.formula_arg0( cycl_utilities.formula_arg1( phrase_naut, UNPROVIDED ) ).eql( reln ) )
    {
      return NIL;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
      if( NIL == okP )
      {
        SubLObject end_var;
        SubLObject i;
        for( end_var = number_utilities.f_1X( pph_utilities.pph_arity( reln ) ), i = NIL, i = ONE_INTEGER; NIL == okP && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
        {
          if( !cycl_utilities.formula_arg( cycl_utilities.formula_arg1( phrase_naut, UNPROVIDED ), i, UNPROVIDED ).eql( at_utilities.get_generic_arg( i ) ) )
          {
            okP = T;
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 21617L)
  public static SubLObject bad_generic_arg_in_gen_template_formula(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bad = NIL;
    SubLObject v_arity = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
      v_arity = arity.max_arity( cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( v_arity.isInteger() && NIL == bad )
    {
      SubLObject csome_list_var = cycl_utilities.expression_gather( formula, $sym63$GENERIC_ARG_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject arg = NIL;
      arg = csome_list_var.first();
      while ( NIL == bad && NIL != csome_list_var)
      {
        if( at_utilities.generic_arg_num( arg ).numG( v_arity ) )
        {
          bad = arg;
        }
        csome_list_var = csome_list_var.rest();
        arg = csome_list_var.first();
      }
    }
    return bad;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22024L)
  public static SubLObject assertion_has_phrase_naut_argP(final SubLObject as)
  {
    return pph_types.pph_phrase_nautP( phrase_naut_from_as( as ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22134L)
  public static SubLObject phrase_naut_from_as(final SubLObject as)
  {
    return phrase_naut_from_formula( assertions_high.gaf_formula( as ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22302L)
  public static SubLObject phrase_naut_from_formula(final SubLObject formula)
  {
    final SubLObject phrase_naut_arg = phrase_naut_arg( cycl_utilities.formula_operator( formula ) );
    return ( NIL != phrase_naut_arg ) ? cycl_utilities.formula_arg( formula, phrase_naut_arg, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
  public static SubLObject clear_phrase_naut_arg()
  {
    final SubLObject cs = $phrase_naut_arg_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
  public static SubLObject remove_phrase_naut_arg(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $phrase_naut_arg_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
  public static SubLObject phrase_naut_arg_internal(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
      final SubLObject pred_arity = pph_utilities.pph_arity( pred );
      if( pred_arity.isInteger() )
      {
        if( NIL == ans )
        {
          SubLObject end_var;
          SubLObject n;
          SubLObject csome_list_var;
          SubLObject type;
          for( end_var = number_utilities.f_1X( pred_arity ), n = NIL, n = ONE_INTEGER; NIL == ans && !n.numGE( end_var ); n = number_utilities.f_1X( n ) )
          {
            if( NIL == ans )
            {
              csome_list_var = kb_accessors.argn_isa( pred, n, UNPROVIDED );
              type = NIL;
              type = csome_list_var.first();
              while ( NIL == ans && NIL != csome_list_var)
              {
                if( NIL != nl_phrase_typeP( type ) )
                {
                  ans = n;
                }
                csome_list_var = csome_list_var.rest();
                type = csome_list_var.first();
              }
            }
          }
        }
      }
      else
      {
        final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
            $str89$_S_has_no_known_arity___ )
        } );
        pph_error.pph_handle_error( new_format_string, ConsesLow.list( pred ) );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22505L)
  public static SubLObject phrase_naut_arg(final SubLObject pred)
  {
    SubLObject caching_state = $phrase_naut_arg_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym88$PHRASE_NAUT_ARG, $sym90$_PHRASE_NAUT_ARG_CACHING_STATE_, $int91$128, EQL, ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( phrase_naut_arg_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 22988L)
  public static SubLObject nl_phrase_typeP(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return pph_utilities.pph_genlP( type, $const71$SententialConstituent, pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 23098L)
  public static SubLObject strip_generic_arg_hall_passes(final SubLObject cycl_phrase)
  {
    if( !cycl_utilities.formula_arg0( cycl_phrase ).equal( pph_functions.gentemplaterecipeomitsargfn() ) )
    {
      return cycl_phrase;
    }
    SubLObject pred = NIL;
    SubLObject gen_arg = NIL;
    SubLObject remainder = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( cycl_phrase, cycl_phrase, $list92 );
    pred = cycl_phrase.first();
    SubLObject current = cycl_phrase.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, cycl_phrase, $list92 );
    gen_arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, cycl_phrase, $list92 );
    remainder = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return strip_generic_arg_hall_passes( remainder );
    }
    cdestructuring_bind.cdestructuring_bind_error( cycl_phrase, $list92 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 23398L)
  public static SubLObject pph_phrase_from_gentemplate_phrase(final SubLObject phrase_naut, SubLObject arg_position_map)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = pph_utilities.pph_new_empty_map();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_admitted.generic_arg_p( phrase_naut ) )
    {
      return pph_phrase.pph_phrase_copy( pph_phrase.new_pph_phrase_for_cycl( phrase_naut, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    final SubLObject phrase_naut_with_narts = narts_high.nart_substitute( phrase_naut );
    SubLObject v_pph_phrase = NIL;
    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        if( NIL != el_utilities.el_formula_p( phrase_naut_with_narts ) && NIL == wff.memoized_syntactically_wf_formulaP( phrase_naut_with_narts ) )
        {
          final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
              $str93$_S_is_not_a_well_formed_genTempla )
          } );
          pph_error.pph_handle_error( new_format_string, ConsesLow.list( phrase_naut_with_narts ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$129, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    final SubLObject raw_phrase_naut = strip_generic_arg_hall_passes( phrase_naut_with_narts );
    final SubLObject plist = pph_plist_for_phrase_naut( raw_phrase_naut );
    thread.resetMultipleValues();
    final SubLObject expanded_phrase_naut = pph_expand_phrase_nauts_top_level( raw_phrase_naut, arg_position_map );
    final SubLObject new_arg_position_map = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == pph_types.pph_phrase_nautP( expanded_phrase_naut ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
      {
        Errors.warn( $str94$PPH_PHRASE_FROM_GENTEMPLATE_PHRAS, phrase_naut, expanded_phrase_naut );
        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
      }
      return NIL;
    }
    final SubLObject fn = cycl_utilities.nat_function( expanded_phrase_naut );
    if( NIL != kb_utilities.kbeq( fn, pph_functions.typeclarifyingphrasefn() ) )
    {
      final SubLObject ans = pph_phrase.new_pph_type_clarifying_phrase( expanded_phrase_naut, UNPROVIDED );
      final SubLObject arg_position = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      pph_phrase.pph_phrase_set_arg_position( ans, arg_position );
      v_pph_phrase = ans;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestsymbolphrasefn() ) )
    {
      final SubLObject ans = pph_phrase.new_pph_symbol_phrase( expanded_phrase_naut );
      final SubLObject arg_position = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      pph_phrase.pph_phrase_set_arg_position( ans, arg_position );
      v_pph_phrase = ans;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.percentparaphrasefn() ) )
    {
      final SubLObject ans = pph_phrase.new_pph_percent_phrase( expanded_phrase_naut );
      final SubLObject arg_position = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      pph_phrase.pph_phrase_set_arg_position( ans, arg_position );
      v_pph_phrase = ans;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestcyclphrasefn() ) )
    {
      final SubLObject ans = pph_phrase.new_pph_cycl_phrase( expanded_phrase_naut );
      final SubLObject arg_position = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      pph_phrase.pph_phrase_set_arg_position( ans, arg_position );
      v_pph_phrase = ans;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestbindingsphrasefn() ) )
    {
      final SubLObject ans = pph_phrase.new_pph_variable_binding_phrase( expanded_phrase_naut );
      final SubLObject arg_position = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      pph_phrase.pph_phrase_set_arg_position( ans, arg_position );
      v_pph_phrase = ans;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.concatenatephrasesfn() ) )
    {
      v_pph_phrase = pph_phrase_from_concatenate_phrases_naut( expanded_phrase_naut, new_arg_position_map );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.concatenatephrasesfn_nospaces() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_nospace_phrase( expanded_phrase_naut, new_arg_position_map );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestnlphraseofstringfn() ) )
    {
      final SubLObject string_arg = cycl_utilities.nat_arg1( expanded_phrase_naut, UNPROVIDED );
      final SubLObject string_specifiedP = cycl_string.cycl_string_p( string_arg );
      final SubLObject arg_position_specifiedP = pph_utilities.pph_arg_position_specifierP( string_arg );
      final SubLObject string = ( NIL != string_specifiedP ) ? pph_string.pph_string_from_cycl_string( string_arg ) : NIL;
      final SubLObject cycl = ( NIL != arg_position_specifiedP ) ? string_arg : pph_phrase.pph_unknown_cycl();
      final SubLObject arg_position2 = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      final SubLObject ans2 = pph_data_structures.new_pph_phrase( string, cycl, UNPROVIDED );
      pph_phrase.pph_phrase_set_arg_position( ans2, arg_position2 );
      if( NIL == arg_position_specifiedP )
      {
        pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl( ans2 );
      }
      if( NIL != string_utilities.non_empty_stringP( string ) )
      {
        pph_phrase.pph_phrase_note_done( ans2 );
      }
      v_pph_phrase = ans2;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.stringmentionfn() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_string_mention_phrase( expanded_phrase_naut );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.quotedparaphrasefn() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_quoted_paraphrase_phrase( expanded_phrase_naut );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.terseparaphrasefn() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_terse_phrase( expanded_phrase_naut );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.preciseparaphrasefn() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_precise_phrase( expanded_phrase_naut, new_arg_position_map );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.phraseformfn() ) )
    {
      v_pph_phrase = pph_phrase_from_phrase_form_naut( expanded_phrase_naut, new_arg_position_map );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.phrasecyclfn() ) )
    {
      v_pph_phrase = pph_phrase_from_phrase_cycl_fn_naut( expanded_phrase_naut, new_arg_position_map );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.termparaphrasefn() ) )
    {
      final SubLObject denot = cycl_utilities.nat_arg1( expanded_phrase_naut, UNPROVIDED );
      final SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map( new_arg_position_map, $kw96$ARG1 );
      final SubLObject ans3 = pph_phrase.pph_phrase_copy( pph_phrase.new_pph_phrase_for_cycl( denot, new_map, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      if( NIL == cycl_utilities.expression_find_if( $sym97$PPH_ARG_POSITION_SPECIFIER_, denot, UNPROVIDED, UNPROVIDED ) )
      {
        pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl( ans3 );
      }
      v_pph_phrase = ans3;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.termparaphrasefn_possessive() ) )
    {
      final SubLObject cycl2 = cycl_utilities.nat_arg1( expanded_phrase_naut, UNPROVIDED );
      final SubLObject ans4 = pph_phrase.pph_phrase_copy( pph_phrase.new_pph_phrase_for_cycl( cycl2, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      final SubLObject arg_position3 = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      final SubLObject new_map2 = pph_utilities.pph_figure_new_arg_position_map( new_arg_position_map, $kw96$ARG1 );
      pph_phrase.pph_phrase_set_arg_position( ans4, arg_position3 );
      pph_phrase.pph_phrase_set_arg_position_map( ans4, new_map2 );
      if( NIL != pph_phrase.pph_phrase_doneP( ans4 ) )
      {
        pph_main.possessivize_pph_phrase( ans4 );
      }
      else
      {
        pph_phrase.pph_phrase_update_category( ans4, $const98$PossessivePhrase, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == pph_utilities.pph_arg_position_specifierP( cycl2 ) )
      {
        pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl( ans4 );
      }
      v_pph_phrase = ans4;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestverbformforsubjectfn() ) )
    {
      v_pph_phrase = pph_phrase_from_best_verb_form_for_subject_naut( expanded_phrase_naut );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestnlwordformoflexemefn() ) )
    {
      final SubLObject ans = pph_data_structures.new_pph_phrase( UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject arg_position = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      pph_phrase.pph_phrase_set_arg_position( ans, arg_position );
      pph_phrase.pph_phrase_set_wu( ans, function_terms.naut_to_nart( cycl_utilities.nat_arg1( expanded_phrase_naut, UNPROVIDED ) ) );
      pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl( ans );
      v_pph_phrase = ans;
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.conditionalphrasefn() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_conditional_phrase( expanded_phrase_naut, arg_position_map );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.nlconjunctionfn() ) || NIL != kb_utilities.kbeq( fn, pph_functions.nlconjunctionfn_but() ) || NIL != kb_utilities.kbeq( fn, pph_functions.nldisjunctionfn() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_coordination_phrase( expanded_phrase_naut );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestnumberedlistparaphrasefn_constrained() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_numbered_list_phrase( expanded_phrase_naut );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestchemicalformulafn() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_chemical_formula_from_lists_phrase( expanded_phrase_naut );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.repeatforsubsequentargsfn() ) )
    {
      v_pph_phrase = pph_phrase.new_pph_repeated_phrase( expanded_phrase_naut );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.bestdetnbarfn() ) )
    {
      v_pph_phrase = pph_phrase_from_best_det_nbar_naut( expanded_phrase_naut, new_arg_position_map );
    }
    else if( NIL != kb_utilities.kbeq( fn, pph_functions.headwordofphrasefn() ) )
    {
      final SubLObject ans = pph_phrase_from_gentemplate_phrase( cycl_utilities.nat_arg1( expanded_phrase_naut, UNPROVIDED ), UNPROVIDED );
      final SubLObject arg_position = pph_utilities.pph_arg_position_lookup( $list95, new_arg_position_map );
      pph_phrase.pph_phrase_set_arg_position( ans, arg_position );
      v_pph_phrase = ans;
    }
    else if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str99$Don_t_know_how_to_make_a_PPH_PHRA, expanded_phrase_naut );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    if( NIL != pph_phrase.pph_phrase_p( v_pph_phrase, UNPROVIDED ) )
    {
      SubLObject remainder;
      SubLObject property;
      SubLObject value;
      for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        property = remainder.first();
        value = conses_high.cadr( remainder );
        pph_data_structures.pph_phrase_info_set( v_pph_phrase, property, value );
      }
    }
    if( NIL != pph_phrase.pph_phrase_p( v_pph_phrase, UNPROVIDED ) )
    {
      pph_phrase.pph_phrase_set_cases_recursively( v_pph_phrase );
    }
    return Values.values( v_pph_phrase, ( NIL != pph_phrase.pph_phrase_p( v_pph_phrase, UNPROVIDED ) ) ? pph_data_structures.pph_phrase_plist( v_pph_phrase ) : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 30992L)
  public static SubLObject pph_phrase_from_concatenate_phrases_naut(final SubLObject phrase_naut, SubLObject arg_position_map)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = NIL;
    }
    final SubLObject phrase = pph_data_structures.new_pph_phrase( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject head_dtr_num = NIL;
    SubLObject new_dtrs = NIL;
    SubLObject list_var = NIL;
    SubLObject sub_phrase_cycl = NIL;
    SubLObject i = NIL;
    list_var = cycl_utilities.nat_args( phrase_naut, UNPROVIDED );
    sub_phrase_cycl = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), sub_phrase_cycl = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL != pph_head_dtr_nautP( sub_phrase_cycl ) )
      {
        sub_phrase_cycl = pph_remove_head_dtr_marker( sub_phrase_cycl );
        head_dtr_num = i;
      }
      final SubLObject dtr_map = pph_utilities.pph_figure_new_arg_position_map( arg_position_map, at_utilities.get_generic_arg( number_utilities.f_1X( i ) ) );
      final SubLObject nth_dtr = pph_phrase_from_gentemplate_phrase( sub_phrase_cycl, dtr_map );
      final SubLObject dtr_num = number_utilities.f_1X( i );
      final SubLObject local_arg_position = ConsesLow.list( dtr_num );
      final SubLObject arg_position = pph_utilities.pph_arg_position_lookup( local_arg_position, arg_position_map );
      if( NIL == nth_dtr )
      {
        final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
            $str100$Couldn_t_make_PPH_phrase_from__S )
        } );
        pph_error.pph_handle_error( new_format_string, ConsesLow.list( sub_phrase_cycl ) );
      }
      pph_phrase.pph_phrase_set_arg_position( nth_dtr, arg_position );
      new_dtrs = ConsesLow.cons( nth_dtr, new_dtrs );
    }
    pph_phrase.set_pph_phrase_dtrs_from_list( phrase, Sequences.nreverse( new_dtrs ), head_dtr_num );
    pph_phrase_sanity_check_agr( phrase );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 32088L)
  public static SubLObject pph_phrase_sanity_check_agr(final SubLObject phrase)
  {
    final SubLObject dtr_count = pph_phrase.pph_phrase_dtr_count( phrase );
    SubLObject dtr_num = ZERO_INTEGER;
    if( document.sign_constituents( phrase ).isVector() )
    {
      final SubLObject vector_var = document.sign_constituents( phrase );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject dtr;
      SubLObject subj_verb_constraint;
      SubLObject new_format_string;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        dtr = Vectors.aref( vector_var, element_num );
        subj_verb_constraint = pph_phrase.pph_phrase_agr_constraint_of_type( dtr, $kw101$SUBJECT_VERB );
        if( NIL != pph_utilities.pph_agr_constraint_p( subj_verb_constraint ) && NIL == pph_phrase.pph_conditional_phrase_p( phrase ) && NIL != pph_utilities.pph_nth_phrase_p( pph_utilities.pph_agr_constraint_target(
            subj_verb_constraint ) ) && NIL != pph_bad_nth_phraseP( pph_utilities.pph_agr_constraint_target( subj_verb_constraint ), dtr_count ) )
        {
          new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
              $str102$Bad_Nth_phrase___S__Dtr_count_is_ )
          } );
          pph_error.pph_handle_error( new_format_string, ConsesLow.list( subj_verb_constraint, dtr_count ) );
        }
        if( NIL != pph_phrase.pph_phrase_has_dtrsP( dtr ) )
        {
          pph_phrase_sanity_check_agr( dtr );
        }
        dtr_num = Numbers.add( dtr_num, ONE_INTEGER );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 32828L)
  public static SubLObject pph_bad_nth_phraseP(final SubLObject nth_phrase, final SubLObject dtr_count)
  {
    return Numbers.numGE( pph_utilities.pph_nth_phrase_num( nth_phrase ), dtr_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 33036L)
  public static SubLObject pph_phrase_dereference_nth_phrases(final SubLObject phrase)
  {
    SubLObject dtr_num = ZERO_INTEGER;
    if( document.sign_constituents( phrase ).isVector() )
    {
      final SubLObject vector_var = document.sign_constituents( phrase );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject dtr;
      SubLObject phrase_agr;
      SubLObject relative_constraint;
      SubLObject logical_mother;
      SubLObject agr_target;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        dtr = Vectors.aref( vector_var, element_num );
        phrase_agr = pph_phrase.pph_phrase_agr( dtr );
        if( NIL != pph_data_structures.pph_phrase_agr_p( phrase_agr ) )
        {
          relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint( phrase_agr );
          logical_mother = pph_phrase.pph_phrase_logical_mother( dtr );
          if( NIL != pph_phrase.pph_phrase_p( logical_mother, UNPROVIDED ) && NIL != pph_utilities.pph_agr_constraint_p( relative_constraint ) )
          {
            agr_target = pph_utilities.pph_agr_constraint_target( relative_constraint );
            if( NIL != pph_utilities.pph_nth_phrase_p( agr_target ) )
            {
              pph_phrase_dereference_nth_phrase( dtr, phrase, agr_target, logical_mother, relative_constraint );
            }
          }
        }
        if( NIL != pph_phrase.pph_phrase_has_dtrsP( dtr ) )
        {
          pph_phrase_dereference_nth_phrases( dtr );
        }
        dtr_num = Numbers.add( dtr_num, ONE_INTEGER );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 33873L)
  public static SubLObject pph_phrase_dereference_nth_phrase(final SubLObject dtr, final SubLObject phrase, final SubLObject agr_target, SubLObject logical_mother, final SubLObject relative_constraint)
  {
    if( $kw101$SUBJECT_VERB == pph_utilities.pph_agr_constraint_type( relative_constraint ) )
    {
      logical_mother = pph_phrase.pph_verb_find_sentential_mother( dtr );
    }
    final SubLObject absolute_constraints = pph_utilities.pph_nth_phrase_constraints( agr_target );
    final SubLObject dereferenced_agr_target = pph_phrase.pph_phrase_nth_dtr( logical_mother, pph_utilities.pph_nth_phrase_num( agr_target ) );
    if( dereferenced_agr_target.eql( dtr ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
          $str103$Phrase_specified_to_agree_with_it )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( dtr ) );
    }
    else if( NIL == pph_phrase.pph_phrase_p( dereferenced_agr_target, UNPROVIDED ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( TWO_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
          $str104$Can_t_dereference__S_in____S )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( agr_target, phrase ) );
    }
    else if( NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p( dereferenced_agr_target, pph_utilities.pph_agr_constraint_type( relative_constraint ) ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
          $str105$Potentially_recursive_agr___S____ )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( pph_phrase.pph_phrase_agr( dtr ), dereferenced_agr_target ) );
    }
    else
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str106$Dereferenced__S_to__S, agr_target, dereferenced_agr_target, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      pph_phrase.pph_phrase_set_relative_agr_target( dtr, dereferenced_agr_target );
      pph_phrase.pph_phrase_add_agr_preds( dtr, absolute_constraints, UNPROVIDED );
    }
    return dtr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 35048L)
  public static SubLObject pph_head_dtr_nautP(SubLObject sub_phrase_cycl)
  {
    if( NIL == term.nautP( sub_phrase_cycl, UNPROVIDED ) )
    {
      return NIL;
    }
    sub_phrase_cycl = pph_expand_phrase_nauts_top_level( sub_phrase_cycl, UNPROVIDED );
    final SubLObject fn = cycl_utilities.nat_functor( sub_phrase_cycl );
    if( NIL != kb_utilities.kbeq( fn, pph_functions.headwordofphrasefn() ) )
    {
      return T;
    }
    if( NIL != kb_utilities.kbeq( fn, pph_functions.phraseformfn() ) || NIL != kb_utilities.kbeq( fn, pph_functions.phrasecyclfn() ) )
    {
      return pph_head_dtr_nautP( cycl_utilities.nat_arg2( sub_phrase_cycl, UNPROVIDED ) );
    }
    if( NIL != kb_utilities.kbeq( fn, pph_functions.conditionalphrasefn() ) )
    {
      return Types.sublisp_null( list_utilities.find_if_not( $sym107$PPH_HEAD_DTR_NAUT_, cycl_utilities.nat_args( sub_phrase_cycl, UNPROVIDED ).rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != kb_utilities.kbeq( fn, pph_functions.nlconjunctionfn() ) || NIL != kb_utilities.kbeq( fn, pph_functions.nldisjunctionfn() ) )
    {
      return Types.sublisp_null( list_utilities.find_if_not( $sym107$PPH_HEAD_DTR_NAUT_, cycl_utilities.nat_args( sub_phrase_cycl, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 35848L)
  public static SubLObject pph_remove_head_dtr_marker(SubLObject sub_phrase_cycl)
  {
    sub_phrase_cycl = pph_expand_phrase_nauts_top_level( sub_phrase_cycl, UNPROVIDED );
    final SubLObject fn = cycl_utilities.nat_function( sub_phrase_cycl );
    if( NIL != kb_utilities.kbeq( fn, pph_functions.headwordofphrasefn() ) )
    {
      return pph_remove_head_dtr_marker( cycl_utilities.nat_arg1( sub_phrase_cycl, UNPROVIDED ) );
    }
    if( NIL != kb_utilities.kbeq( fn, pph_functions.phraseformfn() ) )
    {
      return ConsesLow.list( fn, cycl_utilities.nat_arg1( sub_phrase_cycl, UNPROVIDED ), pph_remove_head_dtr_marker( cycl_utilities.nat_arg2( sub_phrase_cycl, UNPROVIDED ) ) );
    }
    return sub_phrase_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 36324L)
  public static SubLObject pph_phrase_from_phrase_form_naut(final SubLObject phrase_naut, SubLObject arg_position_map)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraint = cycl_utilities.nat_arg1( phrase_naut, UNPROVIDED );
    final SubLObject kernel_arg_position_map = pph_utilities.pph_figure_new_arg_position_map( arg_position_map, $kw108$ARG2 );
    SubLObject phrase = pph_phrase_from_gentemplate_phrase( cycl_utilities.nat_arg2( phrase_naut, UNPROVIDED ), kernel_arg_position_map );
    if( NIL == phrase )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
          $str100$Couldn_t_make_PPH_phrase_from__S )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( cycl_utilities.nat_arg2( phrase_naut, UNPROVIDED ) ) );
    }
    else
    {
      if( NIL != pph_phrase.pph_cycl_phrase_p( phrase ) )
      {
        return phrase;
      }
      if( NIL != pph_utilities.pph_speech_partP( constraint ) || NIL != pph_utilities.pph_collectionP( constraint ) )
      {
        pph_phrase.pph_phrase_update_category( phrase, constraint, T, NIL );
        if( NIL == pph_utilities.pph_genl_categoryP( pph_phrase.pph_phrase_category( phrase, NIL ), constraint, UNPROVIDED ) && NIL == pph_utilities.pph_genl_categoryP( pph_phrase.pph_phrase_category( phrase, T ),
            constraint, UNPROVIDED ) )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( $str109$Incompatible_constraint__S_on__S, constraint, phrase );
            streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
          }
          phrase = NIL;
        }
      }
      else if( NIL != pph_utilities.pph_speech_part_predP( constraint ) || NIL != pph_utilities.pph_name_string_predP( constraint ) )
      {
        pph_phrase.pph_phrase_add_agr_pred( phrase, constraint );
      }
      else if( NIL != term.nautP( constraint, UNPROVIDED ) && cycl_utilities.nat_function( constraint ).eql( constants_high.find_constant( $str110$NthPhraseAgrFn ) ) )
      {
        final SubLObject new_agr_target = pph_utilities.new_pph_nth_phrase( number_utilities.f_1_( cycl_utilities.nat_arg1( constraint, UNPROVIDED ) ), UNPROVIDED );
        final SubLObject new_agr = pph_utilities.new_pph_agr_constraint( $kw111$PEER, new_agr_target );
        pph_phrase.pph_phrase_set_agr_constraint( phrase, new_agr, UNPROVIDED );
      }
      else
      {
        if( NIL == constraint )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( $str112$__Warning__null_constraint_on__S_, phrase_naut );
            streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
          }
          return phrase;
        }
        final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
            $str113$Don_t_know_what_to_do_with__S_con )
        } );
        pph_error.pph_handle_error( new_format_string, ConsesLow.list( constraint ) );
      }
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 38136L)
  public static SubLObject pph_phrase_from_phrase_cycl_fn_naut(final SubLObject phrase_naut, SubLObject arg_position_map)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = NIL;
    }
    final SubLObject cycl = cycl_utilities.nat_arg1( phrase_naut, UNPROVIDED );
    final SubLObject kernel_arg_position_map = pph_utilities.pph_figure_new_arg_position_map( arg_position_map, $kw108$ARG2 );
    final SubLObject phrase = pph_phrase_from_gentemplate_phrase( cycl_utilities.nat_arg2( phrase_naut, UNPROVIDED ), kernel_arg_position_map );
    pph_phrase.pph_phrase_set_cycl( phrase, cycl );
    pph_phrase.pph_phrase_set_output_list_cycl( phrase, cycl );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 38618L)
  public static SubLObject pph_phrase_from_best_verb_form_for_subject_naut(final SubLObject phrase_naut)
  {
    final SubLObject phrase = pph_data_structures.new_pph_phrase( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    pph_phrase.pph_phrase_set_wu( phrase, cycl_utilities.nat_arg1( phrase_naut, UNPROVIDED ) );
    pph_phrase.pph_phrase_set_category( phrase, $const114$Verb, UNPROVIDED );
    pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl( phrase );
    final SubLObject subj_phrase = pph_expand_phrase_nauts_top_level( cycl_utilities.nat_arg2( phrase_naut, UNPROVIDED ), UNPROVIDED );
    final SubLObject nth_phrase_agrP = nth_phrase_naut_p( subj_phrase );
    final SubLObject agr_target = ( NIL != nth_phrase_agrP ) ? pph_utilities.new_pph_nth_phrase( number_utilities.f_1_( cycl_utilities.nat_arg2( subj_phrase, UNPROVIDED ) ), UNPROVIDED )
        : pph_phrase_from_gentemplate_phrase( subj_phrase, UNPROVIDED );
    final SubLObject agr_constraint = pph_utilities.new_pph_agr_constraint( $kw101$SUBJECT_VERB, agr_target );
    pph_phrase.pph_phrase_set_agr_constraint( phrase, agr_constraint, UNPROVIDED );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 39384L)
  public static SubLObject nth_phrase_naut_p(final SubLObject phrase_naut)
  {
    final SubLObject expanded_phrase = pph_expand_phrase_nauts_top_level( phrase_naut, UNPROVIDED );
    return makeBoolean( cycl_utilities.nat_function( expanded_phrase ).eql( $const65$TheNthFn ) && cycl_utilities.nat_arg1( expanded_phrase, UNPROVIDED ).eql( $const71$SententialConstituent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 39639L)
  public static SubLObject pph_phrase_from_best_det_nbar_naut(final SubLObject phrase_naut, SubLObject arg_position_map)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = NIL;
    }
    final SubLObject det_dtr = pph_phrase_from_gentemplate_phrase( el_utilities.make_binary_formula( pph_functions.phraseformfn(), czer_main.canonicalize_term( $list115, UNPROVIDED ), cycl_utilities.nat_arg1(
        phrase_naut, UNPROVIDED ) ), UNPROVIDED );
    final SubLObject nbar_arg_position_map = pph_utilities.pph_figure_new_arg_position_map( arg_position_map, $kw108$ARG2 );
    final SubLObject nbar_dtr = pph_phrasify_phrase_naut( cycl_utilities.nat_arg2( phrase_naut, UNPROVIDED ), nbar_arg_position_map );
    return pph_new_np_from_det_and_nbar( det_dtr, nbar_dtr, arg_position_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 40227L)
  public static SubLObject pph_new_np_from_det_and_nbar(final SubLObject det_dtr, final SubLObject nbar_dtr, SubLObject arg_position_map)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = NIL;
    }
    final SubLObject phrase = pph_data_structures.new_pph_phrase( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    pph_phrase.pph_phrase_set_arg_position_map( phrase, arg_position_map );
    pph_phrase.pph_phrase_set_category_to_np( phrase );
    pph_phrase.pph_phrase_set_head_dtr_num( phrase, ONE_INTEGER );
    pph_phrase.pph_phrase_maybe_reserve_for_arg0( det_dtr );
    pph_phrase.pph_phrase_maybe_reserve_for_arg0( nbar_dtr );
    pph_phrase.pph_phrase_update_category( det_dtr, $const116$Determiner, UNPROVIDED, UNPROVIDED );
    pph_phrase.pph_phrase_update_category( nbar_dtr, narts_high.find_nart( $list117 ), UNPROVIDED, UNPROVIDED );
    if( NIL != pph_phrase.pph_phrase_doneP( det_dtr ) )
    {
      final SubLObject det_string_agr_preds = pph_agr_of_det_string( pph_phrase.pph_phrase_string( det_dtr, UNPROVIDED ) );
      final SubLObject agr_preds = ( NIL != det_string_agr_preds ) ? det_string_agr_preds : $list118;
      pph_phrase.pph_phrase_update_agr_preds( nbar_dtr, agr_preds, T );
      pph_phrase.pph_phrase_set_agr_constraint( det_dtr, pph_utilities.new_pph_agr_constraint( $kw119$DET_NBAR, pph_utilities.new_pph_nth_phrase( ONE_INTEGER, UNPROVIDED ) ), UNPROVIDED );
    }
    else if( NIL == pph_utilities.pph_dont_care_agr_constraint_p( pph_data_structures.pph_phrase_agr_absolute_constraint( pph_phrase.pph_phrase_agr( det_dtr ) ) ) )
    {
      pph_phrase.pph_phrase_set_agr_constraint( nbar_dtr, pph_utilities.new_pph_agr_constraint( $kw119$DET_NBAR, pph_utilities.new_pph_nth_phrase( ZERO_INTEGER, UNPROVIDED ) ), UNPROVIDED );
    }
    else
    {
      pph_phrase.pph_phrase_set_agr_constraint( det_dtr, pph_utilities.new_pph_agr_constraint( $kw119$DET_NBAR, pph_utilities.new_pph_nth_phrase( ONE_INTEGER, UNPROVIDED ) ), UNPROVIDED );
      if( NIL == cycl_grammar.el_variable_p( pph_phrase.pph_phrase_cycl( nbar_dtr, UNPROVIDED ) ) && !pph_phrase.pph_phrase_cycl( nbar_dtr, UNPROVIDED ).isKeyword() )
      {
        final SubLObject det_dtr_agr_preds = pph_det_phrase_agr_preds( det_dtr );
        pph_phrase.pph_phrase_set_agr_preds( nbar_dtr, pph_utilities.pph_filter_preds( det_dtr_agr_preds, pph_phrase.pph_phrase_agr_preds( nbar_dtr, UNPROVIDED ), UNPROVIDED ), UNPROVIDED );
      }
    }
    pph_phrase.set_pph_phrase_dtrs_from_list( phrase, ConsesLow.list( det_dtr, nbar_dtr ), UNPROVIDED );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 41979L)
  public static SubLObject pph_agr_of_det_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject agr = NIL;
    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        agr = lexicon_accessors.agr_of_det_string( string );
      }
      finally
      {
        final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$130, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return agr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 42168L)
  public static SubLObject pph_det_phrase_agr_preds(final SubLObject det_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject phrase_agr = pph_phrase.pph_phrase_agr( det_phrase );
    final SubLObject absolute_constraint = pph_data_structures.pph_phrase_agr_absolute_constraint( phrase_agr );
    SubLObject agr_preds = $kw120$ANY;
    if( NIL == pph_utilities.pph_dont_care_agr_constraint_p( absolute_constraint ) )
    {
      final SubLObject pcase_var = pph_utilities.pph_agr_constraint_type( absolute_constraint );
      if( pcase_var.eql( $kw121$NL_PREDS ) )
      {
        agr_preds = pph_utilities.pph_agr_constraint_target( absolute_constraint );
      }
      else if( pcase_var.eql( $kw122$POS_PRED ) )
      {
        agr_preds = ConsesLow.list( pph_utilities.pph_agr_constraint_target( absolute_constraint ) );
      }
      return agr_preds;
    }
    final SubLObject wu = pph_phrase.pph_phrase_wu( det_phrase, UNPROVIDED );
    final SubLObject wu_preds = ( NIL != wu ) ? lexicon_accessors.agreement_lookup( wu ) : NIL;
    if( NIL != wu )
    {
      return ( NIL != wu_preds ) ? wu_preds : $list118;
    }
    final SubLObject cycl = pph_phrase.pph_phrase_cycl( det_phrase, UNPROVIDED );
    if( NIL != pph_phrase.pph_known_cycl_p( cycl ) && NIL == pph_utilities.pph_arg_position_specifierP( cycl ) )
    {
      final SubLObject preds = pph_agr_preds_for_det_cycl( cycl );
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str123$__Agr_preds_for_the_determiner__S, cycl, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return preds;
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str124$Using_default_agr_preds__S_for__S, agr_preds, det_phrase );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    return agr_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 43299L)
  public static SubLObject pph_agr_preds_for_det_cycl_internal(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cycl.isNumber() )
    {
      return ConsesLow.list( pph_utilities.numeric_det_agr_pred( cycl ) );
    }
    if( NIL != subl_promotions.memberP( cycl_utilities.nat_function( cycl ), $list126, UNPROVIDED, UNPROVIDED ) )
    {
      return pph_agr_preds_for_det_cycl( cycl_utilities.nat_arg1( cycl, UNPROVIDED ) );
    }
    SubLObject preds = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index_with_predicate( cycl, FOUR_INTEGER, $const127$denotation, UNPROVIDED, UNPROVIDED );
      SubLObject denotation_assertion = NIL;
      denotation_assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != pph_utilities.pph_genl_posP( assertions_high.gaf_arg2( denotation_assertion ), $const116$Determiner, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var_$131 = lexicon_accessors.agreement_lookup( assertions_high.gaf_arg1( denotation_assertion ) );
          SubLObject pred = NIL;
          pred = cdolist_list_var_$131.first();
          while ( NIL != cdolist_list_var_$131)
          {
            final SubLObject item_var = pred;
            if( NIL == conses_high.member( item_var, preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              preds = ConsesLow.cons( item_var, preds );
            }
            cdolist_list_var_$131 = cdolist_list_var_$131.rest();
            pred = cdolist_list_var_$131.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        denotation_assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return remove_spec_preds( preds, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 43299L)
  public static SubLObject pph_agr_preds_for_det_cycl(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_agr_preds_for_det_cycl_internal( cycl );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym125$PPH_AGR_PREDS_FOR_DET_CYCL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym125$PPH_AGR_PREDS_FOR_DET_CYCL, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym125$PPH_AGR_PREDS_FOR_DET_CYCL, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_agr_preds_for_det_cycl_internal( cycl ) ) );
      memoization_state.caching_state_put( caching_state, cycl, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 43965L)
  public static SubLObject remove_spec_preds(final SubLObject preds, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( !preds.isList() )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = preds;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject others = Sequences.remove( pred, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == subl_promotions.memberP( Functions.funcall( key, pred ), others, $sym128$PPH_GENL_POS_PRED_, key ) )
      {
        ans = ConsesLow.cons( pred, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 44349L)
  public static SubLObject pph_template_constraint_from_assertion(final SubLObject as)
  {
    SubLObject constraint_formula = NIL;
    final SubLObject pcase_var = assertions_high.gaf_arg0( as );
    if( pcase_var.eql( $const129$genFormat_ArgFixed ) )
    {
      final SubLObject constrained_arg_num = assertions_high.gaf_arg2( as );
      final SubLObject constrained_arg_key = at_utilities.get_generic_arg( constrained_arg_num );
      final SubLObject target = assertions_high.gaf_arg3( as );
      constraint_formula = ConsesLow.list( $const130$equals, constrained_arg_key, target );
    }
    else if( pcase_var.eql( $const85$genTemplate_Constrained ) )
    {
      constraint_formula = assertions_high.gaf_arg2( as );
    }
    return constraint_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 44925L)
  public static SubLObject add_gen_template_to_sets(final SubLObject gen_template, final SubLObject sets)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_sets = NIL;
    thread.resetMultipleValues();
    final SubLObject set_num = place_gen_template_in_sets( gen_template, sets );
    final SubLObject new_setP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( set_num ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      new_sets = ConsesLow.cons( ConsesLow.nth( i, sets ), new_sets );
    }
    if( NIL != new_setP )
    {
      final SubLObject new_set = set.new_set( EQUAL, UNPROVIDED );
      set.set_add( gen_template, new_set );
      new_sets = ConsesLow.cons( new_set, new_sets );
    }
    else
    {
      set.set_add( gen_template, ConsesLow.nth( set_num, sets ) );
    }
    SubLObject cdolist_list_var = Sequences.subseq( sets, set_num, UNPROVIDED );
    SubLObject v_set = NIL;
    v_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      new_sets = ConsesLow.cons( v_set, new_sets );
      cdolist_list_var = cdolist_list_var.rest();
      v_set = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 45495L)
  public static SubLObject remove_gen_template_as_from_sets(final SubLObject gen_template_as, final SubLObject sets)
  {
    SubLObject cdolist_list_var = sets;
    SubLObject v_set = NIL;
    v_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject gen_templates_to_remove = NIL;
      final SubLObject set_contents_var = set.do_set_internal( v_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject gen_template;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        gen_template = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, gen_template ) && gen_template_as.eql( pph_data_structures.get_gen_template_assertion( gen_template ) ) )
        {
          gen_templates_to_remove = ConsesLow.cons( gen_template, gen_templates_to_remove );
        }
      }
      SubLObject cdolist_list_var_$132 = gen_templates_to_remove;
      SubLObject gen_template2 = NIL;
      gen_template2 = cdolist_list_var_$132.first();
      while ( NIL != cdolist_list_var_$132)
      {
        set.set_remove( gen_template2, v_set );
        cdolist_list_var_$132 = cdolist_list_var_$132.rest();
        gen_template2 = cdolist_list_var_$132.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_set = cdolist_list_var.first();
    }
    return sets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 45958L)
  public static SubLObject place_gen_template_in_sets(final SubLObject gen_template, final SubLObject sets)
  {
    SubLObject new_setP = Types.sublisp_null( sets );
    SubLObject set_num = ( NIL != new_setP ) ? ZERO_INTEGER : NIL;
    SubLObject list_var = NIL;
    SubLObject v_set = NIL;
    SubLObject i = NIL;
    list_var = sets;
    v_set = list_var.first();
    for( i = ZERO_INTEGER; NIL == set_num && NIL != list_var; list_var = list_var.rest(), v_set = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL == gen_template_too_broadP( gen_template, v_set ) )
      {
        if( NIL != gen_template_too_specificP( gen_template, v_set ) )
        {
          set_num = i;
          new_setP = T;
        }
        else if( NIL == gen_template_dispreferredP( gen_template, v_set ) )
        {
          if( NIL != gen_template_preferredP( gen_template, v_set ) )
          {
            set_num = i;
            new_setP = T;
          }
          else
          {
            set_num = i;
          }
        }
      }
    }
    if( !set_num.isInteger() )
    {
      set_num = Sequences.length( sets );
      new_setP = T;
    }
    return Values.values( set_num, new_setP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 47046L)
  public static SubLObject gen_template_too_specificP(final SubLObject gen_template, final SubLObject v_set)
  {
    SubLObject doneP = NIL;
    SubLObject ans = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject elem;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      elem = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, elem ) )
      {
        ans = gen_template_more_specificP( gen_template, elem );
        doneP = T;
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 47355L)
  public static SubLObject gen_template_too_broadP(final SubLObject gen_template, final SubLObject v_set)
  {
    SubLObject doneP = NIL;
    SubLObject ans = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject elem;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      elem = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, elem ) )
      {
        ans = gen_template_more_specificP( elem, gen_template );
        doneP = T;
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 47661L)
  public static SubLObject gen_template_more_specificP(final SubLObject t1, final SubLObject t2)
  {
    final SubLObject c1 = pph_data_structures.get_gen_template_constraint( t1 );
    final SubLObject c2 = pph_data_structures.get_gen_template_constraint( t2 );
    return gen_template_constraint_more_specificP( c1, c2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 47917L)
  public static SubLObject gen_template_preferredP(final SubLObject gen_template, final SubLObject v_set)
  {
    SubLObject doneP = NIL;
    SubLObject ans = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject elem;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      elem = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, elem ) )
      {
        ans = gen_template_assertion_preferredP( gen_template, elem );
        doneP = T;
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 48225L)
  public static SubLObject gen_template_dispreferredP(final SubLObject gen_template, final SubLObject v_set)
  {
    SubLObject doneP = NIL;
    SubLObject ans = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject elem;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      elem = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, elem ) )
      {
        ans = gen_template_assertion_preferredP( elem, gen_template );
        doneP = T;
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 48537L)
  public static SubLObject gen_template_assertion_preferredP(final SubLObject t1, final SubLObject t2)
  {
    final SubLObject as1 = pph_data_structures.get_gen_template_assertion( t1 );
    final SubLObject as2 = pph_data_structures.get_gen_template_assertion( t2 );
    return pph_utilities.pph_prefer_assertionP( as1, as2, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 48798L)
  public static SubLObject gen_template_constraint_more_specificP(final SubLObject c1, final SubLObject c2)
  {
    if( NIL != c1 && NIL == c2 )
    {
      return T;
    }
    if( NIL == c1 )
    {
      return NIL;
    }
    if( gen_template_constraint_generality_estimate( c1 ).numL( gen_template_constraint_generality_estimate( c2 ) ) )
    {
      return T;
    }
    if( gen_template_constraint_generality_estimate( c2 ).numL( gen_template_constraint_generality_estimate( c1 ) ) )
    {
      return NIL;
    }
    return pph_dnf_has_more_clausesP( pph_dnf_clausal_form_cached( c1 ), pph_dnf_clausal_form_cached( c2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
  public static SubLObject clear_pph_dnf_clausal_form_cached()
  {
    final SubLObject cs = $pph_dnf_clausal_form_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
  public static SubLObject remove_pph_dnf_clausal_form_cached(final SubLObject expression)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $pph_dnf_clausal_form_cached_caching_state$.getGlobalValue(), ConsesLow.list( expression ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
  public static SubLObject pph_dnf_clausal_form_cached_internal(final SubLObject expression)
  {
    return get_pph_dnf_clausal_form( expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49311L)
  public static SubLObject pph_dnf_clausal_form_cached(final SubLObject expression)
  {
    SubLObject caching_state = $pph_dnf_clausal_form_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym131$PPH_DNF_CLAUSAL_FORM_CACHED, $sym132$_PPH_DNF_CLAUSAL_FORM_CACHED_CACHING_STATE_, $int49$1024, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, expression, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_dnf_clausal_form_cached_internal( expression ) ) );
      memoization_state.caching_state_put( caching_state, expression, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49546L)
  public static SubLObject pph_dnf_clausal_form_internal(final SubLObject expression)
  {
    return get_pph_dnf_clausal_form( expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49546L)
  public static SubLObject pph_dnf_clausal_form(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_dnf_clausal_form_internal( expression );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym133$PPH_DNF_CLAUSAL_FORM, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym133$PPH_DNF_CLAUSAL_FORM, ONE_INTEGER, $int49$1024, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym133$PPH_DNF_CLAUSAL_FORM, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, expression, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_dnf_clausal_form_internal( expression ) ) );
      memoization_state.caching_state_put( caching_state, expression, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 49678L)
  public static SubLObject get_pph_dnf_clausal_form(final SubLObject expression)
  {
    SubLObject v_clauses = NIL;
    if( NIL != el_utilities.el_conjunction_p( expression ) )
    {
      SubLObject neg_lits = NIL;
      SubLObject pos_lits = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( expression, $kw67$IGNORE );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$133 = pph_dnf_clausal_form( conjunct );
        SubLObject conjunct_clause = NIL;
        conjunct_clause = cdolist_list_var_$133.first();
        while ( NIL != cdolist_list_var_$133)
        {
          SubLObject cdolist_list_var_$134 = clauses.neg_lits( conjunct_clause );
          SubLObject neg_lit = NIL;
          neg_lit = cdolist_list_var_$134.first();
          while ( NIL != cdolist_list_var_$134)
          {
            neg_lits = ConsesLow.cons( neg_lit, neg_lits );
            cdolist_list_var_$134 = cdolist_list_var_$134.rest();
            neg_lit = cdolist_list_var_$134.first();
          }
          SubLObject cdolist_list_var_$135 = clauses.pos_lits( conjunct_clause );
          SubLObject pos_lit = NIL;
          pos_lit = cdolist_list_var_$135.first();
          while ( NIL != cdolist_list_var_$135)
          {
            pos_lits = ConsesLow.cons( pos_lit, pos_lits );
            cdolist_list_var_$135 = cdolist_list_var_$135.rest();
            pos_lit = cdolist_list_var_$135.first();
          }
          cdolist_list_var_$133 = cdolist_list_var_$133.rest();
          conjunct_clause = cdolist_list_var_$133.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      v_clauses = ConsesLow.cons( clauses.make_clause( neg_lits, pos_lits ), v_clauses );
    }
    else if( NIL != el_utilities.el_disjunction_p( expression ) )
    {
      SubLObject cdolist_list_var2;
      final SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args( expression, $kw67$IGNORE );
      SubLObject disjunct = NIL;
      disjunct = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject neg_lits2 = NIL;
        SubLObject pos_lits2 = NIL;
        SubLObject cdolist_list_var_$136 = pph_dnf_clausal_form( disjunct );
        SubLObject disjunct_clause = NIL;
        disjunct_clause = cdolist_list_var_$136.first();
        while ( NIL != cdolist_list_var_$136)
        {
          SubLObject cdolist_list_var_$137 = clauses.neg_lits( disjunct_clause );
          SubLObject neg_lit = NIL;
          neg_lit = cdolist_list_var_$137.first();
          while ( NIL != cdolist_list_var_$137)
          {
            neg_lits2 = ConsesLow.cons( neg_lit, neg_lits2 );
            cdolist_list_var_$137 = cdolist_list_var_$137.rest();
            neg_lit = cdolist_list_var_$137.first();
          }
          SubLObject cdolist_list_var_$138 = clauses.pos_lits( disjunct_clause );
          SubLObject pos_lit = NIL;
          pos_lit = cdolist_list_var_$138.first();
          while ( NIL != cdolist_list_var_$138)
          {
            pos_lits2 = ConsesLow.cons( pos_lit, pos_lits2 );
            cdolist_list_var_$138 = cdolist_list_var_$138.rest();
            pos_lit = cdolist_list_var_$138.first();
          }
          cdolist_list_var_$136 = cdolist_list_var_$136.rest();
          disjunct_clause = cdolist_list_var_$136.first();
        }
        v_clauses = ConsesLow.cons( clauses.make_clause( neg_lits2, pos_lits2 ), v_clauses );
        cdolist_list_var2 = cdolist_list_var2.rest();
        disjunct = cdolist_list_var2.first();
      }
    }
    else if( NIL != el_utilities.el_negation_p( expression ) )
    {
      final SubLObject negated = cycl_utilities.formula_arg1( expression, UNPROVIDED );
      final SubLObject negated_clauses = pph_dnf_clausal_form( negated );
      SubLObject neg_lits3 = NIL;
      SubLObject pos_lits3 = NIL;
      SubLObject cdolist_list_var3 = negated_clauses;
      SubLObject negated_clause = NIL;
      negated_clause = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        SubLObject current;
        final SubLObject datum = current = negated_clause;
        SubLObject negated_neg_lits = NIL;
        SubLObject negated_pos_lits = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
        negated_neg_lits = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
        negated_pos_lits = current.first();
        current = current.rest();
        if( NIL == current )
        {
          pos_lits3 = ConsesLow.append( pos_lits3, negated_neg_lits );
          neg_lits3 = ConsesLow.append( neg_lits3, negated_pos_lits );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list134 );
        }
        cdolist_list_var3 = cdolist_list_var3.rest();
        negated_clause = cdolist_list_var3.first();
      }
      v_clauses = ConsesLow.cons( clauses.make_clause( neg_lits3, pos_lits3 ), v_clauses );
    }
    else
    {
      final SubLObject neg_lits = NIL;
      final SubLObject pos_lits = ConsesLow.list( expression );
      v_clauses = ConsesLow.cons( clauses.make_clause( neg_lits, pos_lits ), v_clauses );
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 51190L)
  public static SubLObject gen_template_constraint_generality_estimate(final SubLObject constraint)
  {
    final SubLObject all_forts = cycl_utilities.expression_gather( constraint, $sym135$FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject all_generality_estimates = Mapping.mapcar( $sym136$GENERALITY_ESTIMATE, all_forts );
    final SubLObject non_zero_generality_estimates = Sequences.remove( ZERO_INTEGER, all_generality_estimates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL == non_zero_generality_estimates ) ? ZERO_INTEGER : number_utilities.minimum( non_zero_generality_estimates, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 51564L)
  public static SubLObject pph_dnf_has_more_clausesP(final SubLObject dnf1, final SubLObject dnf2)
  {
    return Numbers.numG( dnf_clause_count( dnf1 ), dnf_clause_count( dnf2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 51683L)
  public static SubLObject dnf_clause_count(final SubLObject dnf)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = dnf;
    SubLObject disjunct = NIL;
    disjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = disjunct;
      SubLObject neglits = NIL;
      SubLObject poslits = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
      neglits = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
      poslits = current.first();
      current = current.rest();
      if( NIL == current )
      {
        count = Numbers.add( count, Sequences.length( neglits ) );
        count = Numbers.add( count, Sequences.length( poslits ) );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list137 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      disjunct = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 51907L)
  public static SubLObject gentemplate_phrase_from_pph_phrase(final SubLObject rel, final SubLObject v_pph_phrase)
  {
    return pph_tersify_gentemplate_formula( ConsesLow.list( $const83$genTemplate, rel, pph_deepen_phrase_naut( gentemplate_phrase_from_pph_phrase_int( v_pph_phrase ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 52193L)
  public static SubLObject gentemplate_phrase_from_pph_phrase_int(final SubLObject v_pph_phrase)
  {
    if( NIL != pph_phrase.pph_conditional_phrase_p( v_pph_phrase ) )
    {
      return pph_conditional_phrase_to_gentemplate( v_pph_phrase );
    }
    if( NIL != pph_phrase.pph_det_nbarP( v_pph_phrase ) )
    {
      return pph_det_nbar_to_gentemplate( v_pph_phrase );
    }
    if( NIL != pph_phrase.pph_quoted_paraphrase_phrase_p( v_pph_phrase ) )
    {
      return pph_quoted_phrase_to_gentemplate( v_pph_phrase );
    }
    if( NIL != pph_phrase.pph_phrase_has_dtrsP( v_pph_phrase ) )
    {
      return pph_phrase_to_concatenate_phrases( v_pph_phrase );
    }
    if( NIL != pph_phrase.pph_phrase_head_verbP( v_pph_phrase ) )
    {
      return pph_verb_to_gentemplate( v_pph_phrase );
    }
    if( NIL != pph_phrase.pph_phrase_has_known_cyclP( v_pph_phrase ) )
    {
      return pph_phrase_wXcycl_to_term_paraphrase( v_pph_phrase );
    }
    if( NIL != pph_phrase.pph_phrase_has_stringP( v_pph_phrase ) )
    {
      return pph_phrase_wXstring_only_to_gentemplate( v_pph_phrase );
    }
    if( NIL != pph_phrase.pph_phrase_has_wu_onlyP( v_pph_phrase ) )
    {
      return pph_phrase_wXwu_only_to_gentemplate( v_pph_phrase );
    }
    final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
        $str138$Don_t_know_how_to_convert__S_to__ )
    } );
    pph_error.pph_handle_error( new_format_string, ConsesLow.list( v_pph_phrase ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 53216L)
  public static SubLObject pph_conditional_phrase_to_gentemplate(final SubLObject phrase)
  {
    return ConsesLow.list( pph_functions.conditionalphrasefn(), pph_phrase.pph_conditional_phrase_test( phrase ), gentemplate_phrase_from_pph_phrase_int( pph_phrase.pph_phrase_nth_dtr( phrase, ZERO_INTEGER ) ),
        gentemplate_phrase_from_pph_phrase_int( pph_phrase.pph_phrase_nth_dtr( phrase, ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 53552L)
  public static SubLObject pph_quoted_phrase_to_gentemplate(final SubLObject phrase)
  {
    return ConsesLow.list( pph_functions.quotedparaphrasefn(), gentemplate_phrase_from_pph_phrase_int( pph_phrase.pph_phrase_nth_dtr( phrase, ZERO_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 54030L)
  public static SubLObject pph_det_nbar_to_gentemplate(final SubLObject phrase)
  {
    final SubLObject det_dtr = pph_phrase.pph_phrase_nth_dtr( phrase, ZERO_INTEGER );
    final SubLObject det_string = pph_phrase.pph_phrase_string( det_dtr, UNPROVIDED );
    final SubLObject definiteness = det_string.isString() ? ( ( NIL != lexicon_accessors.string_is_posP( det_string, $const139$Determiner_Indefinite, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? $kw140$INDEFINITE
        : ( ( NIL != lexicon_accessors.string_is_posP( det_string, $const141$Determiner_Definite, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? $kw142$DEFINITE : NIL ) ) : NIL;
    final SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr( phrase, ONE_INTEGER );
    final SubLObject det_dtr_template = ( NIL != definiteness ) ? NIL
        : ( ( NIL != pph_phrase.pph_phrase_has_known_cyclP( det_dtr ) ) ? ConsesLow.list( pph_functions.termparaphrasefn(), pph_phrase.pph_phrase_cycl( det_dtr, UNPROVIDED ) )
            : ConsesLow.list( pph_functions.bestnlphraseofstringfn(), det_string ) );
    final SubLObject real_nbar_cycl = pph_phrase.pph_phrase_cycl( nbar_dtr, UNPROVIDED );
    final SubLObject nbar_cycl = ( NIL != real_nbar_cycl ) ? real_nbar_cycl : pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject nbar_agr = pph_phrase.pph_phrase_absolute_agr_preds( nbar_dtr );
    final SubLObject mother_agr = pph_phrase.pph_phrase_absolute_agr_preds( phrase );
    final SubLObject det_agr = pph_phrase.pph_phrase_absolute_agr_preds( det_dtr );
    final SubLObject filtered_preds = pph_utilities.pph_filter_preds( pph_utilities.pph_filter_preds( nbar_agr, det_agr, UNPROVIDED ), mother_agr, UNPROVIDED );
    final SubLObject unified_pred = generic_nominal_agr_pred( ( NIL != list_utilities.singletonP( filtered_preds ) ) ? filtered_preds.first() : NIL );
    final SubLObject nbar_dtr_template = ( NIL != unified_pred ) ? ConsesLow.list( pph_functions.phraseformfn(), unified_pred, ConsesLow.list( pph_functions.termparaphrasefn(), nbar_cycl ) )
        : ConsesLow.list( pph_functions.termparaphrasefn(), nbar_cycl );
    final SubLObject pcase_var = definiteness;
    if( pcase_var.eql( $kw140$INDEFINITE ) )
    {
      return ConsesLow.list( pph_functions.bestdetnbarfn_indefinite(), nbar_dtr_template );
    }
    if( pcase_var.eql( $kw142$DEFINITE ) )
    {
      return ConsesLow.list( pph_functions.bestdetnbarfn_definite(), nbar_dtr_template );
    }
    return ConsesLow.list( pph_functions.bestdetnbarfn(), det_dtr_template, nbar_dtr_template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 55752L)
  public static SubLObject generic_nominal_agr_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == pph_utilities.pph_genl_predicateP( pred, $const143$nounStrings, pph_vars.$pph_language_mt$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    if( NIL != pph_utilities.pph_genl_predicateP( pred, $const144$plural_Generic, pph_vars.$pph_language_mt$.getDynamicValue( thread ) ) )
    {
      return $const145$nonSingular_Generic;
    }
    return $const146$nonPlural_Generic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 56029L)
  public static SubLObject pph_phrase_to_concatenate_phrases(final SubLObject phrase)
  {
    final SubLObject nospaceP = pph_phrase.pph_nospace_phrase_p( phrase );
    final SubLObject dtr_phrases = ( NIL != nospaceP ) ? pph_phrase.pph_phrase_dtr_list( pph_phrase.pph_phrase_nth_dtr( phrase, ZERO_INTEGER ) ) : pph_phrase.pph_phrase_dtr_list( phrase );
    final SubLObject fn = ( NIL != nospaceP ) ? pph_functions.concatenatephrasesfn_nospaces() : pph_functions.concatenatephrasesfn();
    return el_utilities.make_formula( fn, Mapping.mapcar( $sym147$GENTEMPLATE_PHRASE_FROM_PPH_PHRASE_INT, dtr_phrases ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 56505L)
  public static SubLObject pph_verb_to_gentemplate(final SubLObject phrase)
  {
    final SubLObject verb = pph_phrase.pph_phrase_wu( phrase, UNPROVIDED );
    final SubLObject agr_pred = pph_phrase.pph_phrase_agr_pred( phrase );
    final SubLObject subject_phrase = pph_phrase.pph_phrase_agr_target_of_type( phrase, $kw101$SUBJECT_VERB );
    final SubLObject mother = pph_phrase.pph_phrase_mother( phrase );
    SubLObject ans = NIL;
    if( NIL != pph_phrase.pph_phrase_p( subject_phrase, UNPROVIDED ) && NIL != pph_phrase.pph_phrase_p( mother, UNPROVIDED ) )
    {
      final SubLObject zero_indexed_subject_num = Sequences.position( subject_phrase, pph_phrase.pph_phrase_dtr_list( mother ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( ZERO_INTEGER.eql( zero_indexed_subject_num ) )
      {
        ans = ConsesLow.list( pph_functions.bestheadverbforinitialsubjectfn(), verb );
      }
      else if( zero_indexed_subject_num.isInteger() )
      {
        final SubLObject subject_num = number_utilities.f_1X( zero_indexed_subject_num );
        ans = ConsesLow.list( pph_functions.headwordofphrasefn(), ConsesLow.list( pph_functions.bestverbformforsubjectfn(), verb, ConsesLow.list( pph_functions.nthphrasefn(), subject_num ) ) );
      }
    }
    if( NIL == ans )
    {
      ans = ConsesLow.list( pph_functions.bestnlwordformoflexemefn_constrained(), $const114$Verb, verb );
    }
    if( NIL == list_utilities.sublisp_boolean( subject_phrase ) && NIL == pph_utilities.pph_genl_pos_predP( $const148$verbStrings, agr_pred, UNPROVIDED ) && NIL != agr_pred )
    {
      ans = ConsesLow.list( pph_functions.phraseformfn(), agr_pred, ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 57593L)
  public static SubLObject pph_phrase_wXcycl_to_term_paraphrase(final SubLObject phrase)
  {
    if( NIL != pph_phrase.pph_phrase_agr_pred( phrase ) )
    {
      return ConsesLow.list( pph_functions.termparaphrasefn_constrained(), pph_phrase.pph_phrase_agr_pred( phrase ), pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) );
    }
    if( NIL != kb_indexing_datastructures.indexed_term_p( pph_phrase.pph_phrase_category( phrase, T ) ) )
    {
      return ConsesLow.list( pph_functions.termparaphrasefn_constrained(), pph_phrase.pph_phrase_category( phrase, T ), pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) );
    }
    return ConsesLow.list( pph_functions.termparaphrasefn(), pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 58072L)
  public static SubLObject pph_phrase_wXstring_only_to_gentemplate(final SubLObject phrase)
  {
    return pph_types.pph_phrase_naut_for_string( pph_phrase.pph_phrase_string( phrase, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 58251L)
  public static SubLObject pph_phrase_wXwu_only_to_gentemplate(final SubLObject phrase)
  {
    SubLObject cycl = ConsesLow.list( pph_functions.bestnlwordformoflexemefn(), pph_phrase.pph_phrase_wu( phrase, UNPROVIDED ) );
    final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED );
    SubLObject agr_info = NIL;
    if( NIL != list_utilities.singletonP( agr_preds ) )
    {
      agr_info = agr_preds.first();
    }
    else if( NIL != kb_indexing_datastructures.indexed_term_p( pph_phrase.pph_phrase_category( phrase, T ) ) )
    {
      agr_info = pph_phrase.pph_phrase_category( phrase, T );
    }
    if( NIL != agr_info )
    {
      cycl = ConsesLow.list( pph_functions.phraseformfn(), agr_info, cycl );
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 58776L)
  public static SubLObject pph_template_best_pph_phrase_for_formula(final SubLObject formula, SubLObject wide_scope_arg, SubLObject arg_position_map, SubLObject nl_preds)
  {
    if( wide_scope_arg == UNPROVIDED )
    {
      wide_scope_arg = NIL;
    }
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = NIL;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw120$ANY;
    }
    final SubLObject ans = pph_phrase_template_for_formula( formula, wide_scope_arg, nl_preds );
    return pph_template_customize_template_for_formula( ans, formula, arg_position_map, nl_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 59270L)
  public static SubLObject pph_customize_template_macro_helper(final SubLObject template, final SubLObject formula, final SubLObject arg_position_map, final SubLObject nl_preds)
  {
    return pph_template_customize_template_for_formula( template, formula, arg_position_map, nl_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 59509L)
  public static SubLObject pph_template_customize_template_for_formula(final SubLObject template, final SubLObject formula, final SubLObject arg_position_map, final SubLObject nl_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject formula_template = ( NIL != pph_phrase.pph_phrase_p( template, UNPROVIDED ) ) ? pph_phrase.pph_phrase_cycl( template, UNPROVIDED ) : NIL;
    final SubLObject formula_arg0 = cycl_utilities.formula_arg0( formula );
    if( NIL != pph_template_formula_rephraseP( template ) )
    {
      final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding( thread );
      try
      {
        pph_vars.$pph_current_arg0$.bind( ( NIL != pph_macros.pph_ok_arg0_for_linkingP( formula_arg0 ) ) ? formula_arg0 : $kw151$UNSPECIFIED, thread );
        final SubLObject new_template_phrase = pph_template_phrase_from_arg0( formula, formula_template, arg_position_map );
        final SubLObject justs = pph_phrase.pph_phrase_justification( template );
        if( NIL != pph_phrase.pph_phrase_p( new_template_phrase, UNPROVIDED ) )
        {
          pph_phrase.pph_phrase_copy( new_template_phrase, template, UNPROVIDED );
          SubLObject cdolist_list_var = justs;
          SubLObject just = NIL;
          just = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            pph_phrase.pph_phrase_add_justification( template, just );
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        pph_vars.$pph_current_arg0$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != pph_phrase.pph_phrase_p( template, UNPROVIDED ) )
    {
      if( !formula_arg0.equal( pph_phrase.pph_current_arg0() ) && NIL == pph_utilities.pph_arg_position_lookup( $list152, arg_position_map ) )
      {
        pph_phrase_resolution.pph_phrase_reset_arg0_reservations( template, formula_arg0, pph_vars.$pph_current_arg0$.getDynamicValue( thread ), arg_position_map );
      }
      pph_variable_handling.pph_register_scoped_vars( formula_template );
      final SubLObject formula_is_templateP = NIL;
      pph_template_phrase_set_cycl( template, formula, arg_position_map, formula_is_templateP );
      pph_phrase.pph_phrase_update_agr_preds( template, nl_preds, UNPROVIDED );
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str153$__Found_PPH_PHRASE_for__S_____S__, formula, template, pph_phrase.pph_phrase_justification( template ), template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 61039L)
  public static SubLObject pph_template_phrase_from_arg0(final SubLObject formula, final SubLObject formula_template, final SubLObject arg_position_map)
  {
    final SubLObject formula_template_args = cycl_utilities.formula_args( formula_template, UNPROVIDED );
    final SubLObject arg0_template = cycl_utilities.formula_arg0( formula_template );
    final SubLObject arg0 = pph_utilities.pph_apply_template( arg0_template, formula );
    final SubLObject dummy_formula = el_utilities.make_el_formula( arg0, formula_template_args, UNPROVIDED );
    final SubLObject revised_formula = pph_utilities.pph_apply_template( dummy_formula, formula );
    final SubLObject best_phrase = pph_phrase_template_for_formula( revised_formula, NIL, UNPROVIDED );
    if( NIL != pph_phrase.pph_phrase_p( best_phrase, UNPROVIDED ) )
    {
      final SubLObject temp_arg_position_map = pph_utilities.pph_figure_new_arg_position_map( arg_position_map, formula_template );
      pph_template_phrase_set_cycl( best_phrase, formula_template, temp_arg_position_map, T );
      return best_phrase;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 62036L)
  public static SubLObject pph_template_formula_rephraseP(final SubLObject phrase)
  {
    return makeBoolean( NIL != pph_phrase.pph_phrase_p( phrase, UNPROVIDED ) && NIL == pph_phrase.pph_phrase_has_dtrsP( phrase ) && NIL != pph_arg0_rephrase_templateP( pph_phrase.pph_phrase_cycl( phrase,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 62247L)
  public static SubLObject pph_arg0_rephrase_templateP(final SubLObject cycl)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( cycl ) && NIL != at_admitted.generic_arg_p( cycl_utilities.formula_arg0( cycl ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 62379L)
  public static SubLObject expanded_gen_template_sets_for_reln(SubLObject reln, final SubLObject arg_position_map, SubLObject used_relns)
  {
    if( used_relns == UNPROVIDED )
    {
      used_relns = NIL;
    }
    reln = function_terms.naut_to_nart( reln );
    used_relns = ConsesLow.cons( reln, used_relns );
    final SubLObject raw_sets = gen_template_sets_for_reln( reln, UNPROVIDED );
    return pph_expand_gen_template_sets( raw_sets, used_relns, arg_position_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 62904L)
  public static SubLObject pph_expand_gen_template_sets(final SubLObject sets, final SubLObject used_relns, final SubLObject arg_position_map)
  {
    SubLObject expanded = NIL;
    SubLObject cdolist_list_var = sets;
    SubLObject v_set = NIL;
    v_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$139 = pph_expand_gen_template_set( v_set, used_relns, arg_position_map );
      SubLObject expanded_set = NIL;
      expanded_set = cdolist_list_var_$139.first();
      while ( NIL != cdolist_list_var_$139)
      {
        expanded = ConsesLow.cons( expanded_set, expanded );
        cdolist_list_var_$139 = cdolist_list_var_$139.rest();
        expanded_set = cdolist_list_var_$139.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_set = cdolist_list_var.first();
    }
    return Sequences.nreverse( expanded );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 63205L)
  public static SubLObject pph_expand_gen_template_set(final SubLObject v_set, final SubLObject used_relns, final SubLObject arg_position_map)
  {
    SubLObject expanded = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject gen_template;
    SubLObject cdolist_list_var;
    SubLObject new_template;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      gen_template = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, gen_template ) )
      {
        cdolist_list_var = pph_expand_gen_template( gen_template, used_relns, arg_position_map );
        new_template = NIL;
        new_template = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          expanded = add_gen_template_to_sets( new_template, expanded );
          cdolist_list_var = cdolist_list_var.rest();
          new_template = cdolist_list_var.first();
        }
      }
    }
    return expanded;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 63603L)
  public static SubLObject pph_expand_gen_template(final SubLObject gen_template, final SubLObject used_relns, final SubLObject arg_position_map)
  {
    final SubLObject phrase = pph_data_structures.get_gen_template_phrase( gen_template );
    SubLObject recursiveP = NIL;
    SubLObject expanded = NIL;
    if( NIL != pph_phrase.pph_phrase_p( phrase, UNPROVIDED ) )
    {
      final SubLObject phrase_cycl = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
      final SubLObject constraint = pph_data_structures.get_gen_template_constraint( gen_template );
      if( NIL == pph_phrase.pph_phrase_has_dtrsP( phrase ) && NIL != el_utilities.el_formula_p( phrase_cycl ) && NIL == pph_variable_handling.pph_formula_free_variables( phrase_cycl, UNPROVIDED ) )
      {
        final SubLObject original_arg0 = list_utilities.last_one( used_relns );
        final SubLObject new_arg0 = cycl_utilities.formula_arg0( phrase_cycl );
        if( NIL == subl_promotions.memberP( new_arg0, used_relns, UNPROVIDED, UNPROVIDED ) && NIL == fort_types_interface.variable_arity_relation_p( new_arg0 ) && $sym154$GENERATE_PHRASE_FROM_TEMPLATE.eql( pph_types
            .get_paraphrase_methods( phrase_cycl ).first().first() ) )
        {
          SubLObject cdolist_list_var = expanded_gen_template_sets_for_reln( new_arg0, arg_position_map, used_relns );
          SubLObject v_set = NIL;
          v_set = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject set_contents_var = set.do_set_internal( v_set );
            SubLObject basis_object;
            SubLObject state;
            SubLObject expanded_gen_template;
            SubLObject rephrased_template;
            SubLObject rephrased_template_phrase;
            SubLObject new_new_arg0;
            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
            {
              expanded_gen_template = set_contents.do_set_contents_next( basis_object, state );
              if( NIL != set_contents.do_set_contents_element_validP( state, expanded_gen_template ) )
              {
                rephrased_template = pph_rephrase_expanded_gen_template( expanded_gen_template, phrase_cycl );
                rephrased_template_phrase = pph_data_structures.get_gen_template_phrase( rephrased_template );
                new_new_arg0 = cycl_utilities.formula_arg0( pph_phrase.pph_phrase_cycl( rephrased_template_phrase, UNPROVIDED ) );
                if( NIL != conses_high.member( new_new_arg0, used_relns, UNPROVIDED, UNPROVIDED ) )
                {
                  recursiveP = T;
                }
                else
                {
                  pph_phrase_resolution.pph_phrase_reset_arg0_reservations( rephrased_template_phrase, new_arg0, original_arg0, arg_position_map );
                  if( NIL != constraint )
                  {
                    gen_template_add_constraint( rephrased_template, constraint );
                  }
                  expanded = ConsesLow.cons( rephrased_template, expanded );
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
          }
        }
      }
    }
    if( NIL != list_utilities.empty_list_p( expanded ) && NIL == recursiveP )
    {
      expanded = ConsesLow.list( gen_template );
    }
    return expanded;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 65684L)
  public static SubLObject gen_template_add_constraint(final SubLObject gen_template, SubLObject constraint)
  {
    if( NIL != clauses.clauses_p( constraint ) )
    {
      constraint = clauses.dnf_formula_from_clauses( constraint );
    }
    final SubLObject existing_el_constraint = pph_data_structures.gen_template_el_constraint( gen_template );
    if( NIL == el_utilities.el_formula_p( existing_el_constraint ) )
    {
      pph_data_structures.gen_template_set_constraint( gen_template, constraint );
    }
    else if( NIL != el_utilities.el_formula_p( constraint ) )
    {
      pph_data_structures.gen_template_set_constraint( gen_template, simplifier.conjoin( existing_el_constraint, constraint ) );
    }
    return pph_data_structures.get_gen_template_constraint( gen_template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 66270L)
  public static SubLObject pph_rephrase_expanded_gen_template(final SubLObject gen_template, final SubLObject formula)
  {
    final SubLObject phrase = pph_phrase.pph_phrase_copy( pph_data_structures.get_gen_template_phrase( gen_template ), UNPROVIDED, UNPROVIDED );
    final SubLObject dummy_cycl = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject constraint = pph_data_structures.get_gen_template_constraint( gen_template );
    final SubLObject assertion = pph_data_structures.get_gen_template_assertion( gen_template );
    pph_phrase.pph_phrase_set_cycl( phrase, formula );
    pph_phrase.pph_phrase_reset_cycl( phrase, dummy_cycl );
    final SubLObject new_constraint = pph_utilities.pph_apply_template( constraint, formula );
    return pph_data_structures.new_gen_template( phrase, new_constraint, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 66921L)
  public static SubLObject pph_phrase_templates_for_formula_wXreln(final SubLObject formula, final SubLObject reln, final SubLObject arg_position_map, SubLObject inverseP, SubLObject wide_scope_argnum,
      SubLObject nl_preds)
  {
    if( inverseP == UNPROVIDED )
    {
      inverseP = NIL;
    }
    if( wide_scope_argnum == UNPROVIDED )
    {
      wide_scope_argnum = NIL;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw120$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_formula_for_generic_arg_replacement$.currentBinding( thread );
    try
    {
      pph_vars.$pph_formula_for_generic_arg_replacement$.bind( formula, thread );
      final SubLObject sets = expanded_gen_template_sets_for_reln( reln, arg_position_map, UNPROVIDED );
      SubLObject imprecise_templates = NIL;
      SubLObject cdolist_list_var = sets;
      SubLObject v_set = NIL;
      v_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$140;
        final SubLObject templates = cdolist_list_var_$140 = pph_sort_gen_templates_by_verbosity( set.set_element_list( v_set ) );
        SubLObject template = NIL;
        template = cdolist_list_var_$140.first();
        while ( NIL != cdolist_list_var_$140)
        {
          if( NIL != pph_template_not_precise_enoughP( template, formula ) )
          {
            imprecise_templates = ConsesLow.cons( template, imprecise_templates );
          }
          else
          {
            final SubLObject phrase_or_problem_string = pph_phrase_from_gen_template_satisfying_constraints( template, formula, inverseP, wide_scope_argnum, nl_preds );
            if( NIL != pph_phrase.pph_phrase_p( phrase_or_problem_string, UNPROVIDED ) )
            {
              ans = ConsesLow.cons( phrase_or_problem_string, ans );
            }
            else if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
            {
              Errors.warn( phrase_or_problem_string );
              streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
            }
          }
          cdolist_list_var_$140 = cdolist_list_var_$140.rest();
          template = cdolist_list_var_$140.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_set = cdolist_list_var.first();
      }
      cdolist_list_var = Sequences.nreverse( imprecise_templates );
      SubLObject template2 = NIL;
      template2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject phrase_or_problem_string2 = pph_phrase_from_gen_template_satisfying_constraints( template2, formula, inverseP, wide_scope_argnum, nl_preds );
        if( NIL != pph_phrase.pph_phrase_p( phrase_or_problem_string2, UNPROVIDED ) )
        {
          ans = ConsesLow.cons( phrase_or_problem_string2, ans );
        }
        else if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
        {
          Errors.warn( phrase_or_problem_string2 );
          streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        template2 = cdolist_list_var.first();
      }
    }
    finally
    {
      pph_vars.$pph_formula_for_generic_arg_replacement$.rebind( _prev_bind_0, thread );
    }
    return Sort.stable_sort( Sequences.nreverse( Sequences.remove( NIL, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), Symbols.symbol_function( $sym155$_ ), $sym156$PPH_PHRASE_TOP_LEVEL_DEMERITS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 68395L)
  public static SubLObject pph_sort_gen_templates_by_verbosity(final SubLObject templates)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject maybe_randomized = ( $kw157$RANDOM == pph_vars.$pph_ceteris_paribus_choice_method$.getDynamicValue( thread ) ) ? list_utilities.randomize_list( templates ) : templates;
    SubLObject sorted = Sort.stable_sort( maybe_randomized, ( NIL != pph_utilities.pph_precise_in_argP( ZERO_INTEGER ) ) ? Symbols.symbol_function( $sym158$_ ) : Symbols.symbol_function( $sym155$_ ),
        $sym159$GEN_TEMPLATE_VERBOSITY );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      sorted = pph_utilities.pph_stable_sort_assertions( sorted, $sym160$GET_GEN_TEMPLATE_ASSERTION, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return sorted;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 68855L)
  public static SubLObject pph_phrase_template_generator_next(final SubLObject generator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_data_structures.pph_phrase_template_generator_done_p( generator ) )
    {
      return $kw29$DONE;
    }
    SubLObject ans = NIL;
    SubLObject inverseP = NIL;
    while ( NIL == ans)
    {
      thread.resetMultipleValues();
      final SubLObject gen_template = pph_phrase_template_generator_next_gen_template( generator );
      final SubLObject this_inverseP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == gen_template )
      {
        ans = $kw29$DONE;
      }
      else if( $kw161$GEN_FORMAT == gen_template )
      {
        ans = $kw161$GEN_FORMAT;
      }
      else if( NIL != pph_data_structures.generation_template_p( gen_template ) )
      {
        final SubLObject formula = pph_data_structures.pph_phrase_template_generator_formula( generator );
        final SubLObject focus_arg = pph_data_structures.pph_phrase_template_generator_focus_arg( generator );
        final SubLObject nl_preds = pph_data_structures.pph_phrase_template_generator_nl_preds( generator );
        ans = pph_phrase_from_gen_template_satisfying_constraints( gen_template, formula, this_inverseP, focus_arg, nl_preds );
        inverseP = this_inverseP;
        if( NIL != pph_phrase.pph_phrase_p( ans, UNPROVIDED ) || NIL == pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          continue;
        }
        format_nil.force_format( T, $str162$Couldn_t_use_gen_template_____S__, gen_template, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
            $str163$Expected_gen_template__got__S__ )
        } );
        pph_error.pph_handle_error( new_format_string, ConsesLow.list( gen_template ) );
      }
    }
    return Values.values( ans, inverseP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 70008L)
  public static SubLObject pph_phrase_template_generator_next_gen_template(final SubLObject generator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject ans = pph_phrase_template_generator_next_gen_template_internal( generator );
    SubLObject inverseP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    while ( NIL != pph_data_structures.generation_template_p( ans ) && NIL != pph_vars.pph_forbidden_lexical_assertionP( pph_data_structures.get_gen_template_assertion( ans ) ))
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str164$Skipping_forbidden_lexical_assert, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      thread.resetMultipleValues();
      final SubLObject ans_$141 = pph_phrase_template_generator_next_gen_template_internal( generator );
      final SubLObject inverseP_$142 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      ans = ans_$141;
      inverseP = inverseP_$142;
    }
    if( NIL == pph_data_structures.generation_template_p( ans ) )
    {
      pph_data_structures._csetf_pph_phrase_template_generator_doneP( generator, T );
    }
    return Values.values( ans, inverseP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 70698L)
  public static SubLObject pph_phrase_template_generator_next_gen_template_internal(final SubLObject generator)
  {
    SubLObject ans = queues.dequeue( pph_phrase_template_generator_gen_template_queue( generator ) );
    SubLObject inverseP = NIL;
    if( ans.isList() && $kw165$INVERSE == ans.first() )
    {
      ans = conses_high.second( ans );
      inverseP = T;
    }
    return Values.values( ans, inverseP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 71021L)
  public static SubLObject pph_phrase_template_generator_initialize_queues(final SubLObject generator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject specified_reln = pph_data_structures.pph_phrase_template_generator_specified_reln( generator );
    final SubLObject formula = pph_data_structures.pph_phrase_template_generator_formula( generator );
    final SubLObject mt = pph_data_structures.pph_phrase_template_generator_mt( generator );
    final SubLObject actual_reln = function_terms.naut_to_nart( cycl_utilities.formula_operator( formula ) );
    final SubLObject relns_to_use = pph_data_structures.pph_phrase_template_generator_relns_to_use( generator );
    queues.clear_queue( relns_to_use );
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str166$__Reinitializing_relns_to_use___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != specified_reln )
    {
      queues.enqueue( specified_reln, relns_to_use );
    }
    else
    {
      queues.enqueue( actual_reln, relns_to_use );
      final SubLObject search_limit = pph_data_structures.pph_phrase_template_generator_search_limit( generator );
      SubLObject enoughP = makeBoolean( NIL == number_utilities.positive_number_p( search_limit ) );
      if( NIL == enoughP )
      {
        if( NIL != fort_types_interface.predicate_in_any_mtP( actual_reln ) )
        {
          SubLObject cdolist_list_var = Sequences.remove( actual_reln, pph_utilities.pph_typed_genl_preds( actual_reln, mt ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject tgp = NIL;
          tgp = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            queues.enqueue( tgp, relns_to_use );
            cdolist_list_var = cdolist_list_var.rest();
            tgp = cdolist_list_var.first();
          }
          if( NIL == enoughP )
          {
            final SubLObject module = sbhl_module_vars.get_sbhl_module( $const167$genlPreds );
            final SubLObject node_var = actual_reln;
            final SubLObject deck_type = ( $kw10$BREADTH == $kw168$DEPTH ) ? $kw12$STACK : $kw11$QUEUE;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$143 = mt_relevance_macros.$mt$.currentBinding( thread );
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                try
                {
                  mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                  mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                  mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                  final SubLObject tv_var = $const169$True_JustificationTruth;
                  final SubLObject _prev_bind_0_$144 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$145 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                    if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                    {
                      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                      if( pcase_var.eql( $kw14$ERROR ) )
                      {
                        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      else if( pcase_var.eql( $kw17$CERROR ) )
                      {
                        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str18$continue_anyway, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      else if( pcase_var.eql( $kw19$WARN ) )
                      {
                        Errors.warn( $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P );
                      }
                      else
                      {
                        Errors.warn( $str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                        Errors.cerror( $str18$continue_anyway, $str15$_A_is_not_a__A, tv_var, $sym16$SBHL_TRUE_TV_P );
                      }
                    }
                    final SubLObject _prev_bind_0_$145 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$146 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$148 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
                      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_module_vars.$sbhl_module$.bind( module, thread );
                      if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( actual_reln, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                      {
                        final SubLObject _prev_bind_0_$146 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$147 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                        final SubLObject _prev_bind_2_$149 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                          sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), module ), thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                          sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                          for( node_and_predicate_mode = ConsesLow.list( actual_reln, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode && NIL == enoughP; node_and_predicate_mode = deck.deck_pop(
                              recur_deck ) )
                          {
                            final SubLObject node_var_$152 = node_and_predicate_mode.first();
                            final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                            SubLObject pred = node_var_$152;
                            final SubLObject _prev_bind_0_$147 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                              final SubLObject inverseP = predicate_mode;
                              final SubLObject distance = pph_genl_preds_distance( actual_reln, pred, inverseP, UNPROVIDED );
                              if( NIL != distance && distance.numG( search_limit ) )
                              {
                                enoughP = T;
                              }
                              else if( NIL == queues.queue_find( pred, relns_to_use, UNPROVIDED, UNPROVIDED ) )
                              {
                                if( NIL != inverseP )
                                {
                                  if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                                  {
                                    format_nil.force_format( T, $str170$Inverting_templates_for__S, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                  pred = ConsesLow.list( $kw165$INVERSE, pred );
                                }
                                queues.enqueue( pred, relns_to_use );
                              }
                              final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( module );
                              SubLObject rest;
                              SubLObject module_var;
                              SubLObject _prev_bind_0_$148;
                              SubLObject _prev_bind_1_$148;
                              SubLObject node;
                              SubLObject d_link;
                              SubLObject mt_links;
                              SubLObject iteration_state;
                              SubLObject mt_$156;
                              SubLObject tv_links;
                              SubLObject _prev_bind_0_$149;
                              SubLObject iteration_state_$158;
                              SubLObject tv;
                              SubLObject link_nodes;
                              SubLObject _prev_bind_0_$150;
                              SubLObject sol;
                              SubLObject set_contents_var;
                              SubLObject basis_object;
                              SubLObject state;
                              SubLObject node_vars_link_node;
                              SubLObject csome_list_var;
                              SubLObject node_vars_link_node2;
                              SubLObject new_list;
                              SubLObject rest_$160;
                              SubLObject generating_fn;
                              SubLObject _prev_bind_0_$151;
                              SubLObject sol2;
                              SubLObject link_nodes2;
                              SubLObject set_contents_var2;
                              SubLObject basis_object2;
                              SubLObject state2;
                              SubLObject node_vars_link_node3;
                              SubLObject csome_list_var2;
                              SubLObject node_vars_link_node4;
                              for( rest = NIL, rest = accessible_modules; NIL == enoughP && NIL != rest; rest = rest.rest() )
                              {
                                module_var = rest.first();
                                _prev_bind_0_$148 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                _prev_bind_1_$148 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                      .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                  node = function_terms.naut_to_nart( node_var_$152 );
                                  if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                  {
                                    d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != d_link )
                                    {
                                      mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                      if( NIL != mt_links )
                                      {
                                        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == enoughP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                        {
                                          thread.resetMultipleValues();
                                          mt_$156 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                          tv_links = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != mt_relevance_macros.relevant_mtP( mt_$156 ) )
                                          {
                                            _prev_bind_0_$149 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.bind( mt_$156, thread );
                                              for( iteration_state_$158 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == enoughP && NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state_$158 ); iteration_state_$158 = dictionary_contents.do_dictionary_contents_next( iteration_state_$158 ) )
                                              {
                                                thread.resetMultipleValues();
                                                tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$158 );
                                                link_nodes = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                {
                                                  _prev_bind_0_$150 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                    sol = link_nodes;
                                                    if( NIL != set.set_p( sol ) )
                                                    {
                                                      set_contents_var = set.do_set_internal( sol );
                                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                          set_contents_var ); NIL == enoughP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state(
                                                              state ) )
                                                      {
                                                        node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                        if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                            node_vars_link_node, UNPROVIDED ) )
                                                        {
                                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                          deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                        }
                                                      }
                                                    }
                                                    else if( sol.isList() )
                                                    {
                                                      if( NIL == enoughP )
                                                      {
                                                        csome_list_var = sol;
                                                        node_vars_link_node2 = NIL;
                                                        node_vars_link_node2 = csome_list_var.first();
                                                        while ( NIL == enoughP && NIL != csome_list_var)
                                                        {
                                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                          {
                                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                            deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                          }
                                                          csome_list_var = csome_list_var.rest();
                                                          node_vars_link_node2 = csome_list_var.first();
                                                        }
                                                      }
                                                    }
                                                    else
                                                    {
                                                      Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$150, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state_$158 );
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$149, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                      }
                                    }
                                    else
                                    {
                                      sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str22$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                    }
                                  }
                                  else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                  {
                                    new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                        .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                        : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                            sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                    for( rest_$160 = NIL, rest_$160 = new_list; NIL == enoughP && NIL != rest_$160; rest_$160 = rest_$160.rest() )
                                    {
                                      generating_fn = rest_$160.first();
                                      _prev_bind_0_$151 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                        link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                        if( NIL != set.set_p( sol2 ) )
                                        {
                                          set_contents_var2 = set.do_set_internal( sol2 );
                                          for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                              set_contents_var2 ); NIL == enoughP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                          {
                                            node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                            if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                                UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                              deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                            }
                                          }
                                        }
                                        else if( sol2.isList() )
                                        {
                                          if( NIL == enoughP )
                                          {
                                            csome_list_var2 = sol2;
                                            node_vars_link_node4 = NIL;
                                            node_vars_link_node4 = csome_list_var2.first();
                                            while ( NIL == enoughP && NIL != csome_list_var2)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var2 = csome_list_var2.rest();
                                              node_vars_link_node4 = csome_list_var2.first();
                                            }
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str21$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$151, thread );
                                      }
                                    }
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$148, thread );
                                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$148, thread );
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$147, thread );
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$149, thread );
                          sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$147, thread );
                          sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$146, thread );
                        }
                      }
                      else
                      {
                        sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str24$Node__a_does_not_pass_sbhl_type_t, actual_reln, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                            UNPROVIDED, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$148, thread );
                      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$146, thread );
                      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$145, thread );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$145, thread );
                    sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$144, thread );
                  }
                }
                finally
                {
                  mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                  mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
                  mt_relevance_macros.$mt$.rebind( _prev_bind_0_$143, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$152 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$152, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
            }
          }
        }
        else
        {
          final SubLObject genl_funcs = Sort.sort( pph_utilities.pph_all_genl_relations( actual_reln ), $sym171$PPH_GENL_RELATION_, UNPROVIDED );
          if( NIL == enoughP )
          {
            SubLObject csome_list_var3 = genl_funcs;
            SubLObject reln = NIL;
            reln = csome_list_var3.first();
            while ( NIL == enoughP && NIL != csome_list_var3)
            {
              if( NIL == queues.queue_find( reln, relns_to_use, UNPROVIDED, UNPROVIDED ) )
              {
                queues.enqueue( reln, relns_to_use );
                if( queues.queue_size( relns_to_use ).numGE( search_limit ) )
                {
                  enoughP = T;
                }
              }
              csome_list_var3 = csome_list_var3.rest();
              reln = csome_list_var3.first();
            }
          }
        }
      }
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str172$Relns_to_use___S__, queues.queue_elements( relns_to_use ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    queues.clear_queue( pph_data_structures.pph_phrase_template_generator_gen_template_sets( generator ) );
    pph_phrase_template_generator_populate_gen_template_sets_queue( generator );
    queues.clear_queue( pph_data_structures.pph_phrase_template_generator_gen_templates( generator ) );
    pph_phrase_template_generator_populate_gen_template_queue( generator );
    return generator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 73254L)
  public static SubLObject pph_genl_preds_distance_internal(final SubLObject sub, final SubLObject v_super, final SubLObject inverseP, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    final SubLObject pred = ( NIL != inverseP ) ? $const174$genlInverse : $const167$genlPreds;
    final SubLObject supports = sbhl_search_methods.why_sbhl_relationP( sbhl_module_vars.get_sbhl_module( pred ), sub, v_super, mt, $const169$True_JustificationTruth, $kw175$ASSERTION );
    SubLObject distance = ZERO_INTEGER;
    if( NIL == supports )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = supports;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( pred.eql( cycl_utilities.formula_arg0( arguments.support_sentence( support ) ) ) )
      {
        distance = Numbers.add( distance, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return distance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 73254L)
  public static SubLObject pph_genl_preds_distance(final SubLObject sub, final SubLObject v_super, final SubLObject inverseP, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_genl_preds_distance_internal( sub, v_super, inverseP, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym173$PPH_GENL_PREDS_DISTANCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym173$PPH_GENL_PREDS_DISTANCE, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym173$PPH_GENL_PREDS_DISTANCE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( sub, v_super, inverseP, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( sub.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( v_super.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( inverseP.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_genl_preds_distance_internal( sub, v_super, inverseP, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sub, v_super, inverseP, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 73736L)
  public static SubLObject pph_phrase_template_generator_populate_gen_template_queue(final SubLObject generator)
  {
    final SubLObject sets_queue = pph_phrase_template_generator_gen_template_sets_queue( generator );
    SubLObject head = queues.dequeue( sets_queue );
    final SubLObject formula = pph_data_structures.pph_phrase_template_generator_formula( generator );
    final SubLObject inferior_setP = pph_inferior_template_set_p( head );
    final SubLObject inferior_templates = ( NIL != inferior_setP ) ? NIL : new_pph_inferior_template_set();
    final SubLObject gen_templates_queue = pph_data_structures.pph_phrase_template_generator_gen_templates( generator );
    SubLObject inverseP = NIL;
    if( head.isList() && $kw165$INVERSE == head.first() )
    {
      inverseP = T;
      head = conses_high.second( head );
    }
    if( NIL != inferior_setP && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str176$__Using_inferior_templates___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != set.set_p( head ) )
    {
      final SubLObject sorted_gen_templates = pph_sort_gen_templates_by_verbosity( list_utilities.remove_if_not( $sym177$GENERATION_TEMPLATE_P, set.set_element_list( head ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) );
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str178$__Head_of_queue_____S__, sorted_gen_templates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      SubLObject cdolist_list_var = sorted_gen_templates;
      SubLObject gen_template = NIL;
      gen_template = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == inferior_setP && ( NIL != pph_template_not_precise_enoughP( gen_template, formula ) || NIL == pph_methods_formulas.pph_phrase_has_focal_argnumP( pph_data_structures.get_gen_template_phrase(
            gen_template ), pph_data_structures.pph_phrase_template_generator_focus_arg( generator ) ) ) )
        {
          set.set_add( gen_template, inferior_templates );
        }
        else
        {
          queues.enqueue( ( NIL != inverseP ) ? ConsesLow.list( $kw165$INVERSE, gen_template ) : gen_template, gen_templates_queue );
        }
        cdolist_list_var = cdolist_list_var.rest();
        gen_template = cdolist_list_var.first();
      }
      if( NIL == inferior_setP && NIL == pph_inferior_template_set_emptyP( inferior_templates ) )
      {
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str179$Sending_inferior_templates_to_end, set.set_element_list( inferior_templates ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        queues.enqueue( inferior_templates, sets_queue );
      }
      if( NIL != queues.queue_empty_p( gen_templates_queue ) )
      {
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str180$Couldn_t_use_any_gen_templates_fr, set.set_element_list( head ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        pph_phrase_template_generator_populate_gen_template_queue( generator );
      }
    }
    else if( $kw161$GEN_FORMAT == head )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str181$__Reverting_to___genFormat_for__S, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      queues.enqueue( $kw161$GEN_FORMAT, gen_templates_queue );
    }
    return gen_templates_queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 75889L)
  public static SubLObject new_pph_inferior_template_set()
  {
    return set_utilities.new_singleton_set( $kw182$INFERIOR, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 75978L)
  public static SubLObject pph_inferior_template_set_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != set.set_p( v_object ) && NIL != set.set_memberP( $kw182$INFERIOR, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 76100L)
  public static SubLObject pph_inferior_template_set_emptyP(final SubLObject inferior_templates)
  {
    return Numbers.numLE( set.set_size( inferior_templates ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 76217L)
  public static SubLObject pph_phrase_template_generator_populate_gen_template_sets_queue(final SubLObject generator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject next_reln = queues.dequeue( pph_phrase_template_generator_relns_to_use_queue( generator ) );
    final SubLObject gen_template_sets_queue = pph_data_structures.pph_phrase_template_generator_gen_template_sets( generator );
    SubLObject inverseP = NIL;
    if( NIL != next_reln )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str183$__Populating_gen_template_sets_wi, next_reln, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( next_reln.isList() && $kw165$INVERSE == next_reln.first() )
      {
        inverseP = T;
        next_reln = conses_high.second( next_reln );
      }
      final SubLObject formula = pph_data_structures.pph_phrase_template_generator_formula( generator );
      final SubLObject _prev_bind_0 = pph_vars.$pph_formula_for_generic_arg_replacement$.currentBinding( thread );
      try
      {
        pph_vars.$pph_formula_for_generic_arg_replacement$.bind( formula, thread );
        SubLObject arg_position_map = NIL;
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw184$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0_$163 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym185$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              arg_position_map = pph_data_structures.pph_phrase_template_generator_arg_position_map( generator );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$163, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw184$IGNORE_ERRORS_TARGET );
        }
        finally
        {
          thread.throwStack.pop();
        }
        SubLObject cdolist_list_var = expanded_gen_template_sets_for_reln( next_reln, arg_position_map, UNPROVIDED );
        SubLObject v_set = NIL;
        v_set = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          queues.enqueue( ( NIL != inverseP ) ? ConsesLow.list( $kw165$INVERSE, v_set ) : v_set, gen_template_sets_queue );
          cdolist_list_var = cdolist_list_var.rest();
          v_set = cdolist_list_var.first();
        }
        if( NIL != genformat_availableP( next_reln, formula, pph_data_structures.pph_phrase_template_generator_nl_preds( generator ) ) )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str186$Adding__GEN_FORMAT_at_end_of_queu, next_reln, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          queues.enqueue( $kw161$GEN_FORMAT, gen_template_sets_queue );
        }
      }
      finally
      {
        pph_vars.$pph_formula_for_generic_arg_replacement$.rebind( _prev_bind_0, thread );
      }
    }
    return generator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 77580L)
  public static SubLObject pph_phrase_template_generator_gen_template_queue(final SubLObject generator)
  {
    final SubLObject queue = pph_data_structures.pph_phrase_template_generator_gen_templates( generator );
    if( NIL != queues.queue_empty_p( queue ) )
    {
      pph_phrase_template_generator_populate_gen_template_queue( generator );
      return pph_data_structures.pph_phrase_template_generator_gen_templates( generator );
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 78286L)
  public static SubLObject pph_phrase_template_generator_gen_template_sets_queue(final SubLObject generator)
  {
    final SubLObject queue = pph_data_structures.pph_phrase_template_generator_gen_template_sets( generator );
    if( NIL != queues.queue_empty_p( queue ) )
    {
      pph_phrase_template_generator_populate_gen_template_sets_queue( generator );
      return pph_data_structures.pph_phrase_template_generator_gen_template_sets( generator );
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 78814L)
  public static SubLObject pph_phrase_template_generator_relns_to_use_queue(final SubLObject generator)
  {
    return pph_data_structures.pph_phrase_template_generator_relns_to_use( generator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 79020L)
  public static SubLObject pph_phrase_templates_for_formula(final SubLObject formula, SubLObject wide_scope_arg, SubLObject best_onlyP, SubLObject nl_preds)
  {
    if( wide_scope_arg == UNPROVIDED )
    {
      wide_scope_arg = NIL;
    }
    if( best_onlyP == UNPROVIDED )
    {
      best_onlyP = NIL;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw120$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject templates = NIL;
    SubLObject ans = NIL;
    SubLObject doneP = NIL;
    final SubLObject generator = pph_data_structures.get_pph_phrase_template_generator( formula, wide_scope_arg, NIL, nl_preds, NIL, UNPROVIDED );
    while ( NIL == doneP && NIL == pph_data_structures.pph_phrase_template_generator_done_p( generator ))
    {
      thread.resetMultipleValues();
      final SubLObject template = pph_phrase_template_generator_next( generator );
      final SubLObject ignore_me = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != pph_phrase.pph_phrase_p( template, UNPROVIDED ) )
      {
        if( template == $kw161$GEN_FORMAT )
        {
          ans = $kw161$GEN_FORMAT;
          doneP = T;
        }
        else if( NIL != best_onlyP )
        {
          ans = ConsesLow.list( template );
          doneP = T;
        }
        else
        {
          templates = ConsesLow.cons( template, templates );
        }
      }
    }
    pph_data_structures.free_pph_phrase_template_generator( generator );
    if( NIL != doneP )
    {
      return ans;
    }
    return Sequences.nreverse( templates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 79741L)
  public static SubLObject pph_phrase_template_for_formula(final SubLObject formula, SubLObject wide_scope_arg, SubLObject nl_preds)
  {
    if( wide_scope_arg == UNPROVIDED )
    {
      wide_scope_arg = NIL;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw120$ANY;
    }
    final SubLObject pcase_var;
    final SubLObject result = pcase_var = pph_phrase_templates_for_formula( formula, wide_scope_arg, T, nl_preds );
    if( pcase_var.eql( $kw161$GEN_FORMAT ) || pcase_var.eql( NIL ) )
    {
      return result;
    }
    if( pcase_var.eql( $sym187$CAND ) || pcase_var.eql( $list188 ) || pcase_var.eql( $list189 ) )
    {
      return pph_phrase_templates_for_formula( formula, wide_scope_arg, NIL, UNPROVIDED );
    }
    return result.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 80350L)
  public static SubLObject pph_best_phrase_template_for_formula_wXreln(final SubLObject formula, final SubLObject reln, final SubLObject arg_position_map, SubLObject inverseP, SubLObject wide_scope_argnum)
  {
    if( inverseP == UNPROVIDED )
    {
      inverseP = NIL;
    }
    if( wide_scope_argnum == UNPROVIDED )
    {
      wide_scope_argnum = NIL;
    }
    SubLObject result = pph_phrase_templates_for_formula_wXreln( formula, reln, arg_position_map, inverseP, wide_scope_argnum, UNPROVIDED );
    if( NIL == result && NIL != genformat_availableP( reln, formula, UNPROVIDED ) )
    {
      result = $kw161$GEN_FORMAT;
    }
    return result.isList() ? result.first() : result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 80923L)
  public static SubLObject genformat_availableP(final SubLObject reln, SubLObject formula, SubLObject nl_preds)
  {
    if( formula == UNPROVIDED )
    {
      formula = NIL;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw120$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( reln ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL == ans )
        {
          SubLObject csome_list_var = $list191;
          SubLObject gf_pred = NIL;
          gf_pred = csome_list_var.first();
          while ( NIL == ans && NIL != csome_list_var)
          {
            final SubLObject _prev_bind_0_$164 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
            try
            {
              pred_relevance_macros.$relevant_pred_function$.bind( $sym190$RELEVANT_PRED_IS_EVERYTHING, thread );
              final SubLObject pred_var = gf_pred;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( reln, NIL, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( reln, NIL, pred_var );
                SubLObject done_var = ans;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw31$GAF, $kw35$TRUE, NIL );
                      SubLObject done_var_$165 = ans;
                      final SubLObject token_var_$166 = NIL;
                      while ( NIL == done_var_$165)
                      {
                        final SubLObject gf_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$166 );
                        final SubLObject valid_$167 = makeBoolean( !token_var_$166.eql( gf_gaf ) );
                        if( NIL != valid_$167 )
                        {
                          ans = makeBoolean( NIL == formula || NIL != pph_methods_formulas.genformat_assertion_fits_formulaP( gf_gaf, formula, nl_preds ) );
                        }
                        done_var_$165 = makeBoolean( NIL == valid_$167 || NIL != ans );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$165 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$165, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid || NIL != ans );
                }
              }
            }
            finally
            {
              pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$164, thread );
            }
            csome_list_var = csome_list_var.rest();
            gf_pred = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 81526L)
  public static SubLObject pph_template_phrase_set_cycl(final SubLObject phrase, final SubLObject formula, SubLObject arg_position_map, SubLObject formula_is_templateP)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = NIL;
    }
    if( formula_is_templateP == UNPROVIDED )
    {
      formula_is_templateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == pph_phrase.pph_phrase_p( phrase, UNPROVIDED ) )
    {
      return phrase;
    }
    if( NIL != pph_phrase.pph_phrase_has_dtrsP( phrase ) )
    {
      pph_phrase.pph_phrase_set_arg_position_map( phrase, arg_position_map );
      if( NIL == formula_is_templateP )
      {
        pph_phrase.pph_phrase_set_cycl( phrase, formula );
        pph_phrase.pph_phrase_try_to_resolve_binding_phrases( phrase, UNPROVIDED );
      }
      final SubLObject _prev_bind_0 = pph_vars.$pph_keep_generic_argsP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_formula_for_generic_arg_replacement$.currentBinding( thread );
      try
      {
        pph_vars.$pph_keep_generic_argsP$.bind( makeBoolean( NIL == formula_is_templateP ), thread );
        pph_vars.$pph_formula_for_generic_arg_replacement$.bind( formula, thread );
        pph_phrase_resolution.pph_phrase_replace_generic_args( phrase, formula, arg_position_map );
      }
      finally
      {
        pph_vars.$pph_formula_for_generic_arg_replacement$.rebind( _prev_bind_2, thread );
        pph_vars.$pph_keep_generic_argsP$.rebind( _prev_bind_0, thread );
      }
      pph_phrase.pph_phrase_sanity_check_cycl( phrase );
    }
    else
    {
      final SubLObject template_cycl = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
      if( NIL == pph_types.pph_phrase_nautP( template_cycl ) )
      {
        pph_utilities.pph_reset_precision( template_cycl );
      }
      pph_phrase.pph_phrase_set_cycl( phrase, formula );
      pph_phrase.pph_phrase_set_arg_position_map( phrase, arg_position_map );
      pph_phrase.pph_phrase_try_to_resolve_binding_phrases( phrase, UNPROVIDED );
      pph_phrase.pph_phrase_reset_cycl( phrase, template_cycl );
      if( NIL != formula_is_templateP )
      {
        pph_phrase_check_for_infinite_recursion( phrase, formula );
      }
    }
    return pph_phrase.pph_phrase_arg_position_map( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 82931L)
  public static SubLObject pph_template_note_reln_used(final SubLObject formula, final SubLObject reln_used)
  {
    final SubLObject actual_reln = function_terms.naut_to_nart( cycl_utilities.formula_operator( formula ) );
    if( NIL != reln_used && !reln_used.eql( actual_reln ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str192$__Couldn_t_find_paraphrase_templa, actual_reln, reln_used, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 83322L)
  public static SubLObject pph_phrase_check_for_infinite_recursion(final SubLObject phrase, final SubLObject formula)
  {
    if( formula.equal( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
          $str193$Infinite_recursion_for__S_using__ )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( formula, pph_phrase.pph_phrase_justification( phrase ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 83641L)
  public static SubLObject pph_formula_has_gf_arg_fixedP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject csome_list_var = pph_gfaf_assertions_for_reln( cycl_utilities.formula_operator( formula ), pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    SubLObject as = NIL;
    as = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      if( NIL != pph_utilities.genformat_arg_fixed_matches_argsP( as, cycl_utilities.formula_args( formula, UNPROVIDED ) ) && NIL != genformat_arg_fixed_precision_okP( as ) )
      {
        return T;
      }
      csome_list_var = csome_list_var.rest();
      as = csome_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 83944L)
  public static SubLObject pph_gfaf_assertions_for_reln_internal(final SubLObject reln, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = kb_mapping.gather_gaf_arg_index_with_predicate( reln, ONE_INTEGER, $const129$genFormat_ArgFixed, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 83944L)
  public static SubLObject pph_gfaf_assertions_for_reln(final SubLObject reln, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_gfaf_assertions_for_reln_internal( reln, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym194$PPH_GFAF_ASSERTIONS_FOR_RELN, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym194$PPH_GFAF_ASSERTIONS_FOR_RELN, TWO_INTEGER, $int195$250, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym194$PPH_GFAF_ASSERTIONS_FOR_RELN, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( reln, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( reln.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_gfaf_assertions_for_reln_internal( reln, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( reln, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 84182L)
  public static SubLObject genformat_arg_fixed_precision_okP(final SubLObject as)
  {
    final SubLObject precision = pph_utilities.pph_current_precision();
    SubLObject badP = NIL;
    if( NIL != precision )
    {
      SubLObject arg_order_list = Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), pph_methods_formulas.get_genformat_string_and_list( as ) );
      final SubLObject reln = assertions_high.gaf_arg1( as );
      final SubLObject v_arity = pph_utilities.pph_arity( reln );
      arg_order_list = pph_methods_formulas.regularize_genformat_arglist( arg_order_list, v_arity );
      SubLObject argnum;
      for( argnum = NIL, argnum = ONE_INTEGER; !argnum.numG( v_arity ) && NIL == badP; argnum = number_utilities.f_1X( argnum ) )
      {
      }
      if( NIL == subl_promotions.memberP( argnum, arg_order_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym196$CAR ) ) )
      {
        badP = T;
      }
    }
    return makeBoolean( NIL == badP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 84717L)
  public static SubLObject pph_relation_has_gf_preciseP(final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = kb_mapping_utilities.some_pred_value( relation, $const197$genFormat_Precise, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 84915L)
  public static SubLObject pph_phrase_from_gen_template_satisfying_constraints(final SubLObject template, final SubLObject formula, final SubLObject inverseP, final SubLObject focus_argnum, final SubLObject nl_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == pph_template_appliesP( template, formula, inverseP, nl_preds ) )
    {
      return $str198$Template_doesn_t_apply_to_input_f;
    }
    final SubLObject phrase = pph_phrase_from_gen_template( template, inverseP );
    if( NIL != pph_methods_formulas.pph_phrase_has_focal_argnumP( phrase, focus_argnum ) )
    {
      return phrase;
    }
    if( NIL == focus_argnum || NIL == fort_types_interface.symmetric_binary_predicate_p( cycl_utilities.formula_arg0( formula ) ) )
    {
      pph_phrase.pph_phrase_increment_top_level_demerits( phrase, TWO_INTEGER, PrintLow.format( NIL, $str201$wrong_focal_argnum__wanted__S_, focus_argnum ) );
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
      {
        Errors.warn( $str202$Template_has_wrong_scope_for__S, focus_argnum );
        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
      }
      return phrase;
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str199$___S_is_a_symmetric_binary_predic, cycl_utilities.formula_arg0( formula ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject switched = pph_phrase_from_gen_template( template, makeBoolean( NIL == inverseP ) );
    if( NIL != pph_methods_formulas.pph_phrase_has_focal_argnumP( switched, focus_argnum ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
      {
        format_nil.force_format( T, $str200$__Switching_arg1_and_arg2_in_phra, cycl_utilities.formula_arg0( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED );
      }
      return switched;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
  public static SubLObject clear_gen_template_verbosity()
  {
    final SubLObject cs = $gen_template_verbosity_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
  public static SubLObject remove_gen_template_verbosity(final SubLObject template)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $gen_template_verbosity_caching_state$.getGlobalValue(), ConsesLow.list( template ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
  public static SubLObject gen_template_verbosity_internal(final SubLObject template)
  {
    return pph_phrase.pph_phrase_verbosity( pph_data_structures.get_gen_template_phrase( template ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86299L)
  public static SubLObject gen_template_verbosity(final SubLObject template)
  {
    SubLObject caching_state = $gen_template_verbosity_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym159$GEN_TEMPLATE_VERBOSITY, $sym203$_GEN_TEMPLATE_VERBOSITY_CACHING_STATE_, $int204$10000, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, template, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( gen_template_verbosity_internal( template ) ) );
      memoization_state.caching_state_put( caching_state, template, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86453L)
  public static SubLObject pph_template_has_constraintP(final SubLObject template)
  {
    return list_utilities.sublisp_boolean( pph_data_structures.get_gen_template_constraint( template ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 86570L)
  public static SubLObject pph_phrase_from_gen_template(final SubLObject template, final SubLObject inverseP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_phrase = pph_data_structures.get_gen_template_phrase( template );
    SubLObject new_phrase = NIL;
    if( NIL != pph_phrase.pph_phrase_p( old_phrase, UNPROVIDED ) )
    {
      new_phrase = pph_phrase.pph_phrase_copy( old_phrase, NIL, T );
      if( NIL != inverseP )
      {
        final SubLObject successP = pph_phrase_resolution.pph_phrase_switch_arg1_and_arg2_in_dtrs( new_phrase );
        if( NIL == successP )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( $str205$Couldn_t_swtich_arg1_and_arg2___i, new_phrase );
            streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
          }
          new_phrase = NIL;
        }
      }
      pph_phrase.pph_phrase_check_impossible( old_phrase, UNPROVIDED );
    }
    return new_phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 87099L)
  public static SubLObject pph_template_appliesP(final SubLObject template, final SubLObject formula, final SubLObject inverseP, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw120$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject phrase = pph_data_structures.get_gen_template_phrase( template );
    if( NIL == pph_utilities.pph_genl_mtP( pph_vars.$pph_language_mt$.getDynamicValue( thread ), pph_data_structures.get_gen_template_mt( template ) ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str206$Gen_template_mt__S_not_visible_fr, pph_data_structures.get_gen_template_mt( template ), pph_vars.$pph_language_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return NIL;
    }
    if( NIL == pph_template_phrase_ok_for_predsP( phrase, nl_preds ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str207$Gen_template_preds__S_not_compati, pph_phrase.pph_phrase_compatible_agr_preds( phrase ), nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return NIL;
    }
    if( NIL == pph_template_has_constraintP( template ) )
    {
      return T;
    }
    return gen_template_constraint_passesP( template, formula, inverseP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 87953L)
  public static SubLObject pph_template_phrase_ok_for_predsP(final SubLObject phrase, final SubLObject nl_preds)
  {
    if( $kw120$ANY.eql( nl_preds ) )
    {
      return T;
    }
    if( NIL != pph_phrase_resolution.pph_phrase_determinerP( phrase ) || NIL != pph_phrase_resolution.pph_phrase_detpP( phrase ) )
    {
      return makeBoolean( NIL != pph_utilities.pph_filter_preds( pph_phrase.pph_phrase_compatible_agr_preds( phrase ), $list208, UNPROVIDED ) );
    }
    return makeBoolean( NIL != pph_utilities.pph_filter_preds( pph_phrase.pph_phrase_compatible_agr_preds( phrase ), nl_preds, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 88374L)
  public static SubLObject gen_template_constraint_passesP(final SubLObject template, final SubLObject formula, final SubLObject inverseP)
  {
    final SubLObject constraint_template = pph_data_structures.get_gen_template_constraint( template );
    return gen_template_constraint_passesP_internal( constraint_template, formula, inverseP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 88690L)
  public static SubLObject gen_template_constraint_passesP_internal(final SubLObject constraint_template, final SubLObject formula, final SubLObject inverseP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constraint = pph_utilities.pph_apply_template( constraint_template, formula );
    if( NIL != inverseP )
    {
      constraint = pph_utilities.pph_switch_arg1_and_arg2( constraint );
    }
    final SubLObject test_result = ( NIL != clauses.clauses_p( constraint ) ) ? pph_utilities.pph_test_dnf( constraint )
        : ( ( NIL != pph_utilities.pph_ask_boolean( constraint, pph_vars.$pph_domain_mt$.getDynamicValue( thread ), UNPROVIDED ) ) ? $kw35$TRUE : $kw209$UNKNOWN );
    return Equality.eq( test_result, $kw35$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 89140L)
  public static SubLObject pph_template_not_precise_enoughP(final SubLObject template, final SubLObject formula)
  {
    if( NIL != pph_utilities.pph_current_precision() && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str210$__Checking_precision_of__S_vs___S, pph_phrase.pph_phrase_justification( pph_data_structures.get_gen_template_phrase( template ) ), pph_utilities.pph_current_precision(),
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != pph_formula_has_gf_arg_fixedP( formula ) && NIL == pph_template_has_constraintP( template ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str211$Not_using___genTemplate_because_o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return T;
    }
    if( NIL == formula || ( NIL == pph_utilities.pph_current_precision() && NIL == pph_vars.pph_maximize_linksP() ) )
    {
      return NIL;
    }
    final SubLObject phrase = pph_data_structures.get_gen_template_phrase( template );
    if( NIL != pph_utilities.pph_precise_in_argP( ZERO_INTEGER ) || NIL != pph_vars.pph_maximize_linksP() )
    {
      return makeBoolean( NIL == pph_phrase_references_all_argsP( phrase, formula ) );
    }
    return makeBoolean( NIL == pph_phrase_references_precise_argsP( phrase, formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 90026L)
  public static SubLObject pph_phrase_references_all_argsP(final SubLObject phrase, final SubLObject formula)
  {
    return pph_phrase_references_argsP( phrase, formula, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 90150L)
  public static SubLObject pph_phrase_references_precise_argsP(final SubLObject phrase, final SubLObject formula)
  {
    return pph_phrase_references_argsP( phrase, formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 90280L)
  public static SubLObject pph_phrase_references_argsP(final SubLObject phrase, final SubLObject formula, final SubLObject allP)
  {
    SubLObject i = NIL;
    SubLObject curr_arg = NIL;
    i = ONE_INTEGER;
    curr_arg = at_utilities.get_generic_arg( i );
    while ( !i.numG( el_utilities.formula_arity( formula, UNPROVIDED ) ))
    {
      final SubLObject skipP = makeBoolean( NIL == allP && NIL == pph_utilities.pph_precise_in_argP( i ) );
      final SubLObject okP = makeBoolean( NIL != skipP || NIL != pph_phrase_references_argP( phrase, curr_arg ) );
      if( NIL == okP )
      {
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str212$__Template_judged_imprecise_becau, curr_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return NIL;
      }
      i = number_utilities.f_1X( i );
      curr_arg = at_utilities.get_generic_arg( i );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 90798L)
  public static SubLObject pph_phrase_references_argP(final SubLObject phrase, final SubLObject arg)
  {
    SubLObject okP = NIL;
    if( NIL != pph_phrase.pph_repeated_phrase_p( phrase ) )
    {
      okP = pph_phrase.pph_repeated_phrase_references_argP( phrase, arg );
    }
    else if( NIL != pph_phrase.pph_phrase_has_dtrsP( phrase ) )
    {
      SubLObject dtr_num = ZERO_INTEGER;
      if( document.sign_constituents( phrase ).isVector() )
      {
        final SubLObject vector_var = document.sign_constituents( phrase );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject dtr;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          dtr = Vectors.aref( vector_var, element_num );
          if( NIL == okP )
          {
            if( NIL == pph_phrase.pph_phrase_equal( dtr, phrase ) )
            {
              okP = pph_phrase_references_argP( dtr, arg );
            }
          }
          dtr_num = Numbers.add( dtr_num, ONE_INTEGER );
        }
      }
    }
    else if( NIL != cycl_utilities.expression_find( arg, pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ), NIL, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      okP = T;
    }
    else if( NIL != pph_utilities.pph_cycl_template_p( arg ) && NIL != pph_phrase_references_arg_positionP( phrase, pph_utilities.pph_arg_position_from_template( arg ) ) )
    {
      okP = T;
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 91565L)
  public static SubLObject pph_phrase_references_arg_positionP(final SubLObject phrase, final SubLObject arg_position)
  {
    SubLObject cdolist_list_var;
    final SubLObject olist = cdolist_list_var = pph_phrase.pph_phrase_output_list( phrase );
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg_position.equal( pph_data_structures.pph_phrase_output_item_arg_position( item ) ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 91818L)
  public static SubLObject formula_has_gen_template_constrainedP(final SubLObject formula)
  {
    final SubLObject reln = cycl_utilities.formula_arg0( formula );
    SubLObject ans = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var = gen_template_sets_for_reln( reln, UNPROVIDED );
      SubLObject v_set = NIL;
      v_set = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        final SubLObject set_contents_var = set.do_set_internal( v_set );
        SubLObject basis_object;
        SubLObject state;
        SubLObject template;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == ans
            && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          template = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, template ) )
          {
            ans = makeBoolean( NIL != pph_template_has_constraintP( template ) && NIL != pph_template_appliesP( template, formula, NIL, UNPROVIDED ) );
          }
        }
        csome_list_var = csome_list_var.rest();
        v_set = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 92903L)
  public static SubLObject pph_tersify(final SubLObject original)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return reformulator_hub.reformulate_cycl( original, pph_vars.$pph_language_mt$.getDynamicValue( thread ), $list213 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 94235L)
  public static SubLObject pph_tersify_gentemplate_formula(final SubLObject original)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_new = pph_tersify( original );
    final SubLObject history = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ( NIL == history || NIL != pph_template_formula_non_wfP( v_new, UNPROVIDED ) ) ? Values.values( original, NIL ) : Values.values( v_new, history );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 94565L)
  public static SubLObject pph_deepen_phrase_naut(final SubLObject phrase_naut)
  {
    SubLObject deepest = phrase_naut;
    SubLObject history = NIL;
    SubLObject store = NIL;
    try
    {
      for( store = inference_datastructures_problem_store.new_problem_store( $list214 ); NIL == Sequences.find( deepest, history, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED ); history = ConsesLow.cons( deepest, history ), deepest = pph_deepen_phrase_naut_once( deepest, store ) )
      {
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        inference_datastructures_problem_store.destroy_problem_store( store );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return deepest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 94891L)
  public static SubLObject pph_deepen_phrase_naut_once(final SubLObject phrase_naut, SubLObject problem_store)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject deeper = pph_phrase_naut_deepening_candidates( phrase_naut, pph_vars.$pph_language_mt$.getDynamicValue( thread ), problem_store ).first();
    if( NIL != deeper )
    {
      Errors.warn( $str215$Deepened____S___to__S, phrase_naut, deeper );
    }
    return ( NIL != deeper ) ? deeper : phrase_naut;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 95191L)
  public static SubLObject pph_phrase_naut_deepening_candidates(final SubLObject phrase_naut, SubLObject mt, SubLObject problem_store)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( problem_store == UNPROVIDED )
    {
      problem_store = NIL;
    }
    return pph_utilities.pph_query( ConsesLow.listS( $const216$deeperGenTemplateRecipe, phrase_naut, $list217 ), mt, phrase_naut_deepening_inference_properties( problem_store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 95857L)
  public static SubLObject phrase_naut_deepening_inference_properties(final SubLObject problem_store)
  {
    SubLObject v_properties = conses_high.copy_list( $phrase_naut_deepening_inference_properties$.getGlobalValue() );
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( problem_store ) )
    {
      v_properties = conses_high.putf( v_properties, $kw230$PROBLEM_STORE, problem_store );
    }
    else
    {
      v_properties = conses_high.putf( v_properties, $kw231$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw232$NONE );
    }
    return v_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 96209L)
  public static SubLObject pph_phrasify_phrase_naut(final SubLObject phrase_naut, SubLObject arg_position_map)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = pph_utilities.pph_new_empty_map();
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str233$__Phrasifying__S___, phrase_naut, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject v_pph_phrase = pph_phrase_from_gentemplate_phrase( phrase_naut, arg_position_map );
    if( NIL != pph_phrase.pph_phrase_p( v_pph_phrase, UNPROVIDED ) )
    {
      pph_phrase_dereference_nth_phrases( v_pph_phrase );
    }
    return v_pph_phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 96584L)
  public static SubLObject pph_plist_for_phrase_naut(final SubLObject phrase_naut)
  {
    if( NIL != kb_utilities.kbeq( cycl_utilities.nat_functor( phrase_naut ), pph_functions.termparaphrasefn_temporallocation() ) )
    {
      return $list234;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 96838L)
  public static SubLObject pph_expand_phrase_nauts(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans_var = NIL;
    try
    {
      thread.throwStack.push( $kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT );
      final SubLObject expanded = do_pph_expand_phrase_nauts( cycl );
      if( !cycl.equal( expanded ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str236$__Expanded_form_is__S___, expanded, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return expanded;
    }
    catch( final Throwable ccatch_env_var )
    {
      ans_var = Errors.handleThrowable( ccatch_env_var, $kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT );
      thread.throwStack.pop();
      if( NIL != ans_var )
      {
        final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
            $str238$Recursion_limit_exceeded_expandin )
        } );
        pph_error.pph_handle_error( new_format_string, ConsesLow.list( cycl, ans_var ) );
      }
      return cycl;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 97293L)
  public static SubLObject do_pph_expand_phrase_nauts(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cycl.isAtom() )
    {
      return cycl;
    }
    final SubLObject expanded_cycl = pph_expand_phrase_nauts_top_level( cycl, UNPROVIDED );
    if( NIL != list_utilities.lengthGE( $do_pph_expand_phrase_nauts_stack$.getDynamicValue( thread ), $int239$50, UNPROVIDED ) )
    {
      Dynamic.sublisp_throw( $kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT, expanded_cycl );
      return NIL;
    }
    if( NIL != subl_promotions.memberP( cycl, $do_pph_expand_phrase_nauts_stack$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str240$Already_expanded__S, expanded_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return cycl;
    }
    if( NIL != el_utilities.el_formula_p( expanded_cycl ) )
    {
      final SubLObject _prev_bind_0 = $do_pph_expand_phrase_nauts_stack$.currentBinding( thread );
      try
      {
        $do_pph_expand_phrase_nauts_stack$.bind( ConsesLow.cons( cycl, $do_pph_expand_phrase_nauts_stack$.getDynamicValue( thread ) ), thread );
        return el_utilities.map_formula_terms( $sym241$DO_PPH_EXPAND_PHRASE_NAUTS, expanded_cycl, UNPROVIDED );
      }
      finally
      {
        $do_pph_expand_phrase_nauts_stack$.rebind( _prev_bind_0, thread );
      }
    }
    return expanded_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 98018L)
  public static SubLObject pph_expand_phrase_nauts_top_level(SubLObject cycl, SubLObject arg_position_map)
  {
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = pph_utilities.pph_new_empty_map();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stopP = NIL;
    while ( NIL == stopP && NIL != pph_types.pph_expandible_phrase_nautP( cycl, pph_vars.$pph_language_mt$.getDynamicValue( thread ) ))
    {
      final SubLObject expansion_template = pph_utilities.find_el_macro_expansion( cycl, pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
      if( NIL != cycl_utilities.expression_find_if( $sym242$PPH_IDENTITY_TEMPLATE_P, expansion_template, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject new_format_string = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
            $str243$Expansions_that_refer_to__S_tend_ )
        } );
        pph_error.pph_handle_error( new_format_string, ConsesLow.list( pph_utilities.pph_identity_template(), cycl, expansion_template ) );
      }
      else if( NIL != pph_utilities.pph_cycl_template_p( expansion_template ) )
      {
        final SubLObject _prev_bind_0 = pph_vars.$pph_error_on_bad_templatesP$.currentBinding( thread );
        try
        {
          pph_vars.$pph_error_on_bad_templatesP$.bind( T, thread );
          SubLObject error_message = NIL;
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$169 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym37$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                final SubLObject expanded = cycl = pph_utilities.pph_apply_template( expansion_template, cycl );
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$169, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( error_message.isString() )
          {
            stopP = T;
            final SubLObject new_format_string2 = Sequences.cconcatenate( $str0$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str1$__, format_nil.format_nil_a_no_copy(
                error_message )
            } );
            pph_error.pph_handle_error( new_format_string2, ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ) );
          }
          else
          {
            arg_position_map = pph_utilities.pph_figure_new_arg_position_map( arg_position_map, expansion_template );
          }
        }
        finally
        {
          pph_vars.$pph_error_on_bad_templatesP$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        stopP = T;
      }
    }
    return Values.values( cycl, arg_position_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 99116L)
  public static SubLObject gen_template_store_proof(SubLObject verboseP, SubLObject do_wffP, SubLObject do_recipeP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( do_wffP == UNPROVIDED )
    {
      do_wffP = T;
    }
    if( do_recipeP == UNPROVIDED )
    {
      do_recipeP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject errors = ZERO_INTEGER;
    final SubLObject total_preds = pph_data_structures.gen_template_store_length();
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( PrintLow.format( NIL, $str244$Checking__gen_template_store____ ) );
        final SubLObject iterator_var = pph_data_structures.new_gen_template_store_iterator();
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject the_entry = iteration.iteration_next( iterator_var );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            errors = Numbers.add( errors, gen_template_store_proof_int( the_entry, verboseP, do_wffP, do_recipeP ) );
            sofar = Numbers.add( sofar, ONE_INTEGER );
            utilities_macros.note_percent_progress( sofar, total_preds );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$170 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$170, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return errors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 99990L)
  public static SubLObject gen_template_store_proof_int(final SubLObject the_entry, final SubLObject verboseP, final SubLObject do_wffP, final SubLObject do_recipeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject the_reln = NIL;
    SubLObject all_its_templates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( the_entry, the_entry, $list245 );
    the_reln = the_entry.first();
    SubLObject current = the_entry.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, the_entry, $list245 );
    all_its_templates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str246$checking__S, the_reln );
      }
      SubLObject cdolist_list_var = all_its_templates;
      SubLObject all_of_this_kind = NIL;
      all_of_this_kind = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject iterator_var = set.new_set_iterator( all_of_this_kind );
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject the_template = iteration.iteration_next( iterator_var );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            final SubLObject the_assertion = pph_data_structures.get_gen_template_assertion( the_template );
            final SubLObject the_formula = assertions_high.assertion_formula( the_assertion );
            final SubLObject the_mt = assertions_high.assertion_mt( the_assertion );
            final SubLObject the_explanation = ( NIL != do_wffP ) ? wff.explanation_of_why_not_wff( the_formula, the_mt, UNPROVIDED ) : NIL;
            SubLObject errors = ZERO_INTEGER;
            if( NIL != the_explanation )
            {
              Errors.warn( $str247$non_wff_template__S___S, the_formula, the_explanation );
              errors = Numbers.add( errors, ONE_INTEGER );
            }
            else if( NIL != do_recipeP && NIL != pph_template_formula_non_wfP( the_formula, $kw59$SLOW ) )
            {
              errors = Numbers.add( errors, ONE_INTEGER );
            }
            return errors;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        all_of_this_kind = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( the_entry, $list245 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 100984L)
  public static SubLObject gen_template_store_grep(final SubLObject the_string, SubLObject get_gafsP, SubLObject any_substringP)
  {
    if( get_gafsP == UNPROVIDED )
    {
      get_gafsP = NIL;
    }
    if( any_substringP == UNPROVIDED )
    {
      any_substringP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject the_refs = kb_mapping.gather_other_index( pph_functions.bestnlphraseofstringfn() );
    final SubLObject total_refs = Sequences.length( the_refs );
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject the_matches = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( PrintLow.format( NIL, $str248$Checking_the_misc__extent_of___Be ) );
        SubLObject cdolist_list_var = the_refs;
        SubLObject this_ref = NIL;
        this_ref = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject the_formula = assertions_high.assertion_formula( this_ref );
          if( NIL != pph_utilities.pph_isaP( cycl_utilities.formula_arg0( the_formula ), $const8$NLTemplateGenerationPredicate, UNPROVIDED ) && NIL != gen_template_store_grep_int( cycl_utilities.formula_arg2(
              the_formula, UNPROVIDED ), the_string, any_substringP ) )
          {
            set.set_add( ( NIL != get_gafsP ) ? the_formula : cycl_utilities.formula_arg1( the_formula, UNPROVIDED ), the_matches );
          }
          sofar = Numbers.add( sofar, ONE_INTEGER );
          utilities_macros.note_percent_progress( sofar, total_refs );
          cdolist_list_var = cdolist_list_var.rest();
          this_ref = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$171 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$171, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( the_matches );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 102554L)
  public static SubLObject gen_template_store_grep_int(final SubLObject fragment, final SubLObject the_string, final SubLObject any_substringP)
  {
    if( cycl_utilities.formula_arg0( fragment ).equal( pph_functions.bestnlphraseofstringfn() ) && NIL == cycl_variables.el_varP( cycl_utilities.formula_arg1( fragment, UNPROVIDED ) )
        && NIL != ( ( NIL != any_substringP ) ? string_utilities.substringP( the_string, cycl_utilities.formula_arg1( fragment, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED )
            : string_utilities.subwordP( the_string, cycl_utilities.formula_arg1( fragment, UNPROVIDED ), $str249$____, UNPROVIDED ) ) )
    {
      return T;
    }
    if( NIL != pph_utilities.pph_isaP( cycl_utilities.formula_arg0( fragment ), $const250$Function, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = fragment;
    SubLObject this_item = NIL;
    this_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( this_item.isList() && NIL != gen_template_store_grep_int( this_item, the_string, any_substringP ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_item = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 103651L)
  public static SubLObject gen_template_store_get_constraints_mentioning(final SubLObject the_term, SubLObject get_gafsP)
  {
    if( get_gafsP == UNPROVIDED )
    {
      get_gafsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != constant_handles.constant_p( the_term ) : the_term;
    final SubLObject total = kb_indexing.num_predicate_extent_index( $const85$genTemplate_Constrained, UNPROVIDED );
    SubLObject sofar = ZERO_INTEGER;
    SubLObject the_matches = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( PrintLow.format( NIL, $str252$Searching___genTemplate_Constrain ) );
        final SubLObject _prev_bind_0_$172 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$173 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
          final SubLObject pred_var = $const85$genTemplate_Constrained;
          if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
          {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0_$173 = utilities_macros.$progress_start_time$.currentBinding( thread );
            final SubLObject _prev_bind_1_$174 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
            final SubLObject _prev_bind_2_$176 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
            final SubLObject _prev_bind_3_$177 = utilities_macros.$progress_notification_count$.currentBinding( thread );
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
            try
            {
              utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
              utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
              utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
              utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
              utilities_macros.$is_noting_progressP$.bind( T, thread );
              utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
              utilities_macros.noting_progress_preamble( str );
              final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
              SubLObject done_var = NIL;
              final SubLObject token_var = NIL;
              while ( NIL == done_var)
              {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                if( NIL != valid )
                {
                  utilities_macros.note_progress();
                  SubLObject final_index_iterator = NIL;
                  try
                  {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw31$GAF, NIL, NIL );
                    SubLObject done_var_$178 = NIL;
                    final SubLObject token_var_$179 = NIL;
                    while ( NIL == done_var_$178)
                    {
                      final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$179 );
                      final SubLObject valid_$180 = makeBoolean( !token_var_$179.eql( as ) );
                      if( NIL != valid_$180 )
                      {
                        final SubLObject the_formula = assertions_high.assertion_formula( as );
                        final SubLObject the_constraint = cycl_utilities.formula_arg2( the_formula, UNPROVIDED );
                        if( NIL != cycl_utilities.formula_find( the_term, the_constraint, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                        {
                          the_matches = ConsesLow.cons( ( NIL != get_gafsP ) ? the_formula : the_constraint, the_matches );
                        }
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                      }
                      done_var_$178 = makeBoolean( NIL == valid_$180 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$174 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      if( NIL != final_index_iterator )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                      }
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$174, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
              utilities_macros.noting_progress_postamble();
            }
            finally
            {
              utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
              utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
              utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
              utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$177, thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$176, thread );
              utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$174, thread );
              utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$173, thread );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$173, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$172, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$175 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$175, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return the_matches;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 105012L)
  public static SubLObject expand_meta_template(final SubLObject mtemplate)
  {
    assert NIL != meta_gen_template_p( mtemplate ) : mtemplate;
    final SubLObject dependent_disjunctions = gather_dependent_disjunction_info( mtemplate );
    SubLObject partial_templates = ConsesLow.list( mtemplate );
    SubLObject new_partial_templates = NIL;
    SubLObject name = NIL;
    SubLObject v_arity = NIL;
    SubLObject cdolist_list_var = dependent_disjunctions;
    SubLObject dd = NIL;
    dd = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      name = dd.first();
      v_arity = dd.rest();
      SubLObject cdolist_list_var_$183 = partial_templates;
      SubLObject pt = NIL;
      pt = cdolist_list_var_$183.first();
      while ( NIL != cdolist_list_var_$183)
      {
        SubLObject alternative;
        for( alternative = NIL, alternative = ZERO_INTEGER; alternative.numL( v_arity ); alternative = Numbers.add( alternative, ONE_INTEGER ) )
        {
          new_partial_templates = ConsesLow.cons( expand_meta_template_disjunction( pt, name, alternative ), new_partial_templates );
        }
        cdolist_list_var_$183 = cdolist_list_var_$183.rest();
        pt = cdolist_list_var_$183.first();
      }
      partial_templates = new_partial_templates;
      new_partial_templates = NIL;
      cdolist_list_var = cdolist_list_var.rest();
      dd = cdolist_list_var.first();
    }
    return simplifier.conjoin( Mapping.mapcar( $sym255$UPDATE_TEMPLATE_OPERATOR, partial_templates ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 105791L)
  public static SubLObject meta_gen_template_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && cycl_utilities.formula_operator( v_object ).eql( $const256$metaGenTemplate_QuerySentence ) && NIL != el_utilities.el_binary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106051L)
  public static SubLObject mtemplate_special_form_p(final SubLObject v_object, final SubLObject operator)
  {
    return makeBoolean( v_object.isList() && v_object.first().eql( operator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106227L)
  public static SubLObject mtemplate_special_form_operator(final SubLObject mtsf)
  {
    return mtsf.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106360L)
  public static SubLObject mtemplate_disjunction_name(final SubLObject mtd)
  {
    return conses_high.second( mtd );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106485L)
  public static SubLObject mtemplate_disjunction_arg(final SubLObject mtd, final SubLObject arg)
  {
    return ConsesLow.nth( Numbers.add( arg, TWO_INTEGER ), mtd );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106653L)
  public static SubLObject mtemplate_disjunction_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != mtemplate_special_form_p( v_object, $kw257$OR ) && NIL != subl_promotions.non_negative_integer_p( conses_high.second( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 106860L)
  public static SubLObject update_template_operator(final SubLObject mt)
  {
    return ConsesLow.cons( $const84$genTemplate_QuerySentence, mt.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 107094L)
  public static SubLObject expand_meta_template_disjunction(final SubLObject mtemplate, final SubLObject name, final SubLObject alternative)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( name ) : name;
    assert NIL != subl_promotions.non_negative_integer_p( alternative ) : alternative;
    SubLObject substitutions = NIL;
    SubLObject new_mtemplate = mtemplate;
    SubLObject old = NIL;
    SubLObject v_new = NIL;
    SubLObject cdolist_list_var = list_utilities.tree_gather( mtemplate, $sym259$MTEMPLATE_DISJUNCTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject mtd = NIL;
    mtd = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( mtemplate_disjunction_name( mtd ).eql( name ) )
      {
        substitutions = ConsesLow.cons( ConsesLow.cons( mtd, mtemplate_disjunction_arg( mtd, alternative ) ), substitutions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mtd = cdolist_list_var.first();
    }
    cdolist_list_var = substitutions;
    SubLObject subs = NIL;
    subs = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      old = subs.first();
      v_new = subs.rest();
      if( v_new.eql( $meta_template_null$.getDynamicValue( thread ) ) )
      {
        new_mtemplate = list_utilities.tree_delete( old, conses_high.copy_tree( new_mtemplate ), EQUAL, UNPROVIDED );
      }
      else if( v_new.first().eql( $kw260$AND ) )
      {
        new_mtemplate = list_utilities.tree_splice( new_mtemplate, old, v_new.rest() );
      }
      else
      {
        new_mtemplate = list_utilities.tree_substitute( new_mtemplate, old, v_new );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subs = cdolist_list_var.first();
    }
    return new_mtemplate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-templates.lisp", position = 108129L)
  public static SubLObject gather_dependent_disjunction_info(final SubLObject mtemplate)
  {
    SubLObject infos = NIL;
    SubLObject name = NIL;
    SubLObject v_arity = NIL;
    SubLObject previous = NIL;
    SubLObject cdolist_list_var = list_utilities.tree_gather( mtemplate, $sym259$MTEMPLATE_DISJUNCTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject disjunction = NIL;
    disjunction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      name = conses_high.second( disjunction );
      v_arity = Numbers.subtract( Sequences.length( disjunction ), TWO_INTEGER );
      previous = conses_high.assoc( name, infos, EQL, UNPROVIDED );
      if( NIL != previous )
      {
        if( !previous.rest().numE( v_arity ) )
        {
          Errors.error( $str261$dependent_disjunction__a_has_vary, name, mtemplate );
        }
      }
      else
      {
        infos = ConsesLow.cons( ConsesLow.cons( conses_high.second( disjunction ), Numbers.subtract( Sequences.length( disjunction ), TWO_INTEGER ) ), infos );
      }
      cdolist_list_var = cdolist_list_var.rest();
      disjunction = cdolist_list_var.first();
    }
    return infos;
  }

  public static SubLObject declare_pph_templates_file()
  {
    SubLFiles.declareFunction( me, "initialize_gen_template_store", "INITIALIZE-GEN-TEMPLATE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_length_saneP", "GEN-TEMPLATE-STORE-LENGTH-SANE?", 0, 0, false );
    SubLFiles.declareFunction( me, "do_initialize_gen_template_store", "DO-INITIALIZE-GEN-TEMPLATE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_gen_templates_for_pred", "INITIALIZE-GEN-TEMPLATES-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "add_gen_template", "ADD-GEN-TEMPLATE", 2, 3, false );
    SubLFiles.declareFunction( me, "add_gen_template_int", "ADD-GEN-TEMPLATE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_sets_for_reln", "GEN-TEMPLATE-SETS-FOR-RELN", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_pph_kappa_justification_template", "CLEAR-PPH-KAPPA-JUSTIFICATION-TEMPLATE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_kappa_justification_template", "REMOVE-PPH-KAPPA-JUSTIFICATION-TEMPLATE", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_kappa_justification_template_internal", "PPH-KAPPA-JUSTIFICATION-TEMPLATE-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_kappa_justification_template", "PPH-KAPPA-JUSTIFICATION-TEMPLATE", 0, 0, false );
    SubLFiles.declareFunction( me, "rephrase_gen_template_for_kappa_predP", "REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "looks_like_kappa_rephrase_ruleP", "LOOKS-LIKE-KAPPA-REPHRASE-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_rephrase_gen_template_for_kappa_pred", "CLEAR-REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rephrase_gen_template_for_kappa_pred", "REMOVE-REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "rephrase_gen_template_for_kappa_pred_internal", "REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rephrase_gen_template_for_kappa_pred", "REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "kappa_gen_template_rule_for_arity", "KAPPA-GEN-TEMPLATE-RULE-FOR-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "new_gen_template_from_assertion", "NEW-GEN-TEMPLATE-FROM-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "reinitialize_gen_templates_for_reln", "REINITIALIZE-GEN-TEMPLATES-FOR-RELN", 1, 1, false );
    SubLFiles.declareFunction( me, "reinitialize_gen_templates_referencing_phrase_fn", "REINITIALIZE-GEN-TEMPLATES-REFERENCING-PHRASE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_gen_templates_for_relnXpred", "INITIALIZE-GEN-TEMPLATES-FOR-RELN&PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_gen_template", "REMOVE-GEN-TEMPLATE", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_assertion", "PPH-PHRASE-FROM-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_dummy_cycl_from_as", "PPH-DUMMY-CYCL-FROM-AS", 1, 0, false );
    SubLFiles.declareFunction( me, "gen_template_recipe_p", "GEN-TEMPLATE-RECIPE-P", 1, 3, false );
    SubLFiles.declareFunction( me, "pph_expanded_template_formula_wfP", "PPH-EXPANDED-TEMPLATE-FORMULA-WF?", 1, 2, false );
    SubLFiles.declareFunction( me, "pph_find_generic_arg_gaps", "PPH-FIND-GENERIC-ARG-GAPS", 2, 1, false );
    SubLFiles.declareFunction( me, "repeated_args_phrase_naut_p", "REPEATED-ARGS-PHRASE-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_expanded_template_formula_wfP_fast", "PPH-EXPANDED-TEMPLATE-FORMULA-WF?-FAST", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_non_template_bound_el_varP", "PPH-NON-TEMPLATE-BOUND-EL-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_template_bound_vars", "PPH-TEMPLATE-BOUND-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_expanded_template_formula_wfP_fast_problemP", "PPH-EXPANDED-TEMPLATE-FORMULA-WF?-FAST-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_expanded_template_formula_arg_wfP_fast_problemP", "PPH-EXPANDED-TEMPLATE-FORMULA-ARG-WF?-FAST-PROBLEM?", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_template_non_wfP", "PPH-TEMPLATE-NON-WF?", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_template_formula_non_wfP", "PPH-TEMPLATE-FORMULA-NON-WF?", 1, 1, false );
    SubLFiles.declareFunction( me, "self_referential_gen_template_formulaP", "SELF-REFERENTIAL-GEN-TEMPLATE-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "bad_generic_arg_in_gen_template_formula", "BAD-GENERIC-ARG-IN-GEN-TEMPLATE-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_has_phrase_naut_argP", "ASSERTION-HAS-PHRASE-NAUT-ARG?", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_naut_from_as", "PHRASE-NAUT-FROM-AS", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_naut_from_formula", "PHRASE-NAUT-FROM-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_phrase_naut_arg", "CLEAR-PHRASE-NAUT-ARG", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_phrase_naut_arg", "REMOVE-PHRASE-NAUT-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_naut_arg_internal", "PHRASE-NAUT-ARG-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_naut_arg", "PHRASE-NAUT-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_phrase_typeP", "NL-PHRASE-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_generic_arg_hall_passes", "STRIP-GENERIC-ARG-HALL-PASSES", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_gentemplate_phrase", "PPH-PHRASE-FROM-GENTEMPLATE-PHRASE", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_concatenate_phrases_naut", "PPH-PHRASE-FROM-CONCATENATE-PHRASES-NAUT", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_sanity_check_agr", "PPH-PHRASE-SANITY-CHECK-AGR", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_bad_nth_phraseP", "PPH-BAD-NTH-PHRASE?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_dereference_nth_phrases", "PPH-PHRASE-DEREFERENCE-NTH-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_dereference_nth_phrase", "PPH-PHRASE-DEREFERENCE-NTH-PHRASE", 5, 0, false );
    SubLFiles.declareFunction( me, "pph_head_dtr_nautP", "PPH-HEAD-DTR-NAUT?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_remove_head_dtr_marker", "PPH-REMOVE-HEAD-DTR-MARKER", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_phrase_form_naut", "PPH-PHRASE-FROM-PHRASE-FORM-NAUT", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_phrase_cycl_fn_naut", "PPH-PHRASE-FROM-PHRASE-CYCL-FN-NAUT", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_best_verb_form_for_subject_naut", "PPH-PHRASE-FROM-BEST-VERB-FORM-FOR-SUBJECT-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "nth_phrase_naut_p", "NTH-PHRASE-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_best_det_nbar_naut", "PPH-PHRASE-FROM-BEST-DET-NBAR-NAUT", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_new_np_from_det_and_nbar", "PPH-NEW-NP-FROM-DET-AND-NBAR", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_agr_of_det_string", "PPH-AGR-OF-DET-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_det_phrase_agr_preds", "PPH-DET-PHRASE-AGR-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_agr_preds_for_det_cycl_internal", "PPH-AGR-PREDS-FOR-DET-CYCL-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_agr_preds_for_det_cycl", "PPH-AGR-PREDS-FOR-DET-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_spec_preds", "REMOVE-SPEC-PREDS", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_template_constraint_from_assertion", "PPH-TEMPLATE-CONSTRAINT-FROM-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "add_gen_template_to_sets", "ADD-GEN-TEMPLATE-TO-SETS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_gen_template_as_from_sets", "REMOVE-GEN-TEMPLATE-AS-FROM-SETS", 2, 0, false );
    SubLFiles.declareFunction( me, "place_gen_template_in_sets", "PLACE-GEN-TEMPLATE-IN-SETS", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_too_specificP", "GEN-TEMPLATE-TOO-SPECIFIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_too_broadP", "GEN-TEMPLATE-TOO-BROAD?", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_more_specificP", "GEN-TEMPLATE-MORE-SPECIFIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_preferredP", "GEN-TEMPLATE-PREFERRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_dispreferredP", "GEN-TEMPLATE-DISPREFERRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_assertion_preferredP", "GEN-TEMPLATE-ASSERTION-PREFERRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_constraint_more_specificP", "GEN-TEMPLATE-CONSTRAINT-MORE-SPECIFIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_pph_dnf_clausal_form_cached", "CLEAR-PPH-DNF-CLAUSAL-FORM-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_dnf_clausal_form_cached", "REMOVE-PPH-DNF-CLAUSAL-FORM-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_dnf_clausal_form_cached_internal", "PPH-DNF-CLAUSAL-FORM-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_dnf_clausal_form_cached", "PPH-DNF-CLAUSAL-FORM-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_dnf_clausal_form_internal", "PPH-DNF-CLAUSAL-FORM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_dnf_clausal_form", "PPH-DNF-CLAUSAL-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "get_pph_dnf_clausal_form", "GET-PPH-DNF-CLAUSAL-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "gen_template_constraint_generality_estimate", "GEN-TEMPLATE-CONSTRAINT-GENERALITY-ESTIMATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_dnf_has_more_clausesP", "PPH-DNF-HAS-MORE-CLAUSES?", 2, 0, false );
    SubLFiles.declareFunction( me, "dnf_clause_count", "DNF-CLAUSE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "gentemplate_phrase_from_pph_phrase", "GENTEMPLATE-PHRASE-FROM-PPH-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "gentemplate_phrase_from_pph_phrase_int", "GENTEMPLATE-PHRASE-FROM-PPH-PHRASE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_conditional_phrase_to_gentemplate", "PPH-CONDITIONAL-PHRASE-TO-GENTEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_quoted_phrase_to_gentemplate", "PPH-QUOTED-PHRASE-TO-GENTEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_det_nbar_to_gentemplate", "PPH-DET-NBAR-TO-GENTEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_nominal_agr_pred", "GENERIC-NOMINAL-AGR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_to_concatenate_phrases", "PPH-PHRASE-TO-CONCATENATE-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_verb_to_gentemplate", "PPH-VERB-TO-GENTEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_wXcycl_to_term_paraphrase", "PPH-PHRASE-W/CYCL-TO-TERM-PARAPHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_wXstring_only_to_gentemplate", "PPH-PHRASE-W/STRING-ONLY-TO-GENTEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_wXwu_only_to_gentemplate", "PPH-PHRASE-W/WU-ONLY-TO-GENTEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_template_best_pph_phrase_for_formula", "PPH-TEMPLATE-BEST-PPH-PHRASE-FOR-FORMULA", 1, 3, false );
    SubLFiles.declareFunction( me, "pph_customize_template_macro_helper", "PPH-CUSTOMIZE-TEMPLATE-MACRO-HELPER", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_template_customize_template_for_formula", "PPH-TEMPLATE-CUSTOMIZE-TEMPLATE-FOR-FORMULA", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_template_phrase_from_arg0", "PPH-TEMPLATE-PHRASE-FROM-ARG0", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_template_formula_rephraseP", "PPH-TEMPLATE-FORMULA-REPHRASE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_arg0_rephrase_templateP", "PPH-ARG0-REPHRASE-TEMPLATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "expanded_gen_template_sets_for_reln", "EXPANDED-GEN-TEMPLATE-SETS-FOR-RELN", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_expand_gen_template_sets", "PPH-EXPAND-GEN-TEMPLATE-SETS", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_expand_gen_template_set", "PPH-EXPAND-GEN-TEMPLATE-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_expand_gen_template", "PPH-EXPAND-GEN-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "gen_template_add_constraint", "GEN-TEMPLATE-ADD-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_rephrase_expanded_gen_template", "PPH-REPHRASE-EXPANDED-GEN-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_templates_for_formula_wXreln", "PPH-PHRASE-TEMPLATES-FOR-FORMULA-W/RELN", 3, 3, false );
    SubLFiles.declareFunction( me, "pph_sort_gen_templates_by_verbosity", "PPH-SORT-GEN-TEMPLATES-BY-VERBOSITY", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_next", "PPH-PHRASE-TEMPLATE-GENERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_next_gen_template", "PPH-PHRASE-TEMPLATE-GENERATOR-NEXT-GEN-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_next_gen_template_internal", "PPH-PHRASE-TEMPLATE-GENERATOR-NEXT-GEN-TEMPLATE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_initialize_queues", "PPH-PHRASE-TEMPLATE-GENERATOR-INITIALIZE-QUEUES", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_genl_preds_distance_internal", "PPH-GENL-PREDS-DISTANCE-INTERNAL", 3, 1, false );
    SubLFiles.declareFunction( me, "pph_genl_preds_distance", "PPH-GENL-PREDS-DISTANCE", 3, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_populate_gen_template_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-POPULATE-GEN-TEMPLATE-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_pph_inferior_template_set", "NEW-PPH-INFERIOR-TEMPLATE-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_inferior_template_set_p", "PPH-INFERIOR-TEMPLATE-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_inferior_template_set_emptyP", "PPH-INFERIOR-TEMPLATE-SET-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_populate_gen_template_sets_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-POPULATE-GEN-TEMPLATE-SETS-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_gen_template_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_gen_template_sets_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_generator_relns_to_use_queue", "PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_templates_for_formula", "PPH-PHRASE-TEMPLATES-FOR-FORMULA", 1, 3, false );
    SubLFiles.declareFunction( me, "pph_phrase_template_for_formula", "PPH-PHRASE-TEMPLATE-FOR-FORMULA", 1, 2, false );
    SubLFiles.declareFunction( me, "pph_best_phrase_template_for_formula_wXreln", "PPH-BEST-PHRASE-TEMPLATE-FOR-FORMULA-W/RELN", 3, 2, false );
    SubLFiles.declareFunction( me, "genformat_availableP", "GENFORMAT-AVAILABLE?", 1, 2, false );
    SubLFiles.declareFunction( me, "pph_template_phrase_set_cycl", "PPH-TEMPLATE-PHRASE-SET-CYCL", 2, 2, false );
    SubLFiles.declareFunction( me, "pph_template_note_reln_used", "PPH-TEMPLATE-NOTE-RELN-USED", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_check_for_infinite_recursion", "PPH-PHRASE-CHECK-FOR-INFINITE-RECURSION", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_formula_has_gf_arg_fixedP", "PPH-FORMULA-HAS-GF-ARG-FIXED?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_gfaf_assertions_for_reln_internal", "PPH-GFAF-ASSERTIONS-FOR-RELN-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_gfaf_assertions_for_reln", "PPH-GFAF-ASSERTIONS-FOR-RELN", 2, 0, false );
    SubLFiles.declareFunction( me, "genformat_arg_fixed_precision_okP", "GENFORMAT-ARG-FIXED-PRECISION-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_relation_has_gf_preciseP", "PPH-RELATION-HAS-GF-PRECISE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_gen_template_satisfying_constraints", "PPH-PHRASE-FROM-GEN-TEMPLATE-SATISFYING-CONSTRAINTS", 5, 0, false );
    SubLFiles.declareFunction( me, "clear_gen_template_verbosity", "CLEAR-GEN-TEMPLATE-VERBOSITY", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_gen_template_verbosity", "REMOVE-GEN-TEMPLATE-VERBOSITY", 1, 0, false );
    SubLFiles.declareFunction( me, "gen_template_verbosity_internal", "GEN-TEMPLATE-VERBOSITY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "gen_template_verbosity", "GEN-TEMPLATE-VERBOSITY", 1, 0, false );
    new $gen_template_verbosity$UnaryFunction();
    SubLFiles.declareFunction( me, "pph_template_has_constraintP", "PPH-TEMPLATE-HAS-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_from_gen_template", "PPH-PHRASE-FROM-GEN-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_template_appliesP", "PPH-TEMPLATE-APPLIES?", 3, 1, false );
    SubLFiles.declareFunction( me, "pph_template_phrase_ok_for_predsP", "PPH-TEMPLATE-PHRASE-OK-FOR-PREDS?", 2, 0, false );
    SubLFiles.declareFunction( me, "gen_template_constraint_passesP", "GEN-TEMPLATE-CONSTRAINT-PASSES?", 3, 0, false );
    SubLFiles.declareFunction( me, "gen_template_constraint_passesP_internal", "GEN-TEMPLATE-CONSTRAINT-PASSES?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_template_not_precise_enoughP", "PPH-TEMPLATE-NOT-PRECISE-ENOUGH?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_references_all_argsP", "PPH-PHRASE-REFERENCES-ALL-ARGS?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_references_precise_argsP", "PPH-PHRASE-REFERENCES-PRECISE-ARGS?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_references_argsP", "PPH-PHRASE-REFERENCES-ARGS?", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_references_argP", "PPH-PHRASE-REFERENCES-ARG?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_references_arg_positionP", "PPH-PHRASE-REFERENCES-ARG-POSITION?", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_has_gen_template_constrainedP", "FORMULA-HAS-GEN-TEMPLATE-CONSTRAINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_tersify", "PPH-TERSIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_tersify_gentemplate_formula", "PPH-TERSIFY-GENTEMPLATE-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_deepen_phrase_naut", "PPH-DEEPEN-PHRASE-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_deepen_phrase_naut_once", "PPH-DEEPEN-PHRASE-NAUT-ONCE", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_naut_deepening_candidates", "PPH-PHRASE-NAUT-DEEPENING-CANDIDATES", 1, 2, false );
    SubLFiles.declareFunction( me, "phrase_naut_deepening_inference_properties", "PHRASE-NAUT-DEEPENING-INFERENCE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrasify_phrase_naut", "PPH-PHRASIFY-PHRASE-NAUT", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_plist_for_phrase_naut", "PPH-PLIST-FOR-PHRASE-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_expand_phrase_nauts", "PPH-EXPAND-PHRASE-NAUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "do_pph_expand_phrase_nauts", "DO-PPH-EXPAND-PHRASE-NAUTS", 1, 0, false );
    new $do_pph_expand_phrase_nauts$UnaryFunction();
    SubLFiles.declareFunction( me, "pph_expand_phrase_nauts_top_level", "PPH-EXPAND-PHRASE-NAUTS-TOP-LEVEL", 1, 1, false );
    SubLFiles.declareFunction( me, "gen_template_store_proof", "GEN-TEMPLATE-STORE-PROOF", 0, 3, false );
    SubLFiles.declareFunction( me, "gen_template_store_proof_int", "GEN-TEMPLATE-STORE-PROOF-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_grep", "GEN-TEMPLATE-STORE-GREP", 1, 2, false );
    SubLFiles.declareFunction( me, "gen_template_store_grep_int", "GEN-TEMPLATE-STORE-GREP-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_get_constraints_mentioning", "GEN-TEMPLATE-STORE-GET-CONSTRAINTS-MENTIONING", 1, 1, false );
    SubLFiles.declareFunction( me, "expand_meta_template", "EXPAND-META-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_gen_template_p", "META-GEN-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mtemplate_special_form_p", "MTEMPLATE-SPECIAL-FORM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "mtemplate_special_form_operator", "MTEMPLATE-SPECIAL-FORM-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "mtemplate_disjunction_name", "MTEMPLATE-DISJUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "mtemplate_disjunction_arg", "MTEMPLATE-DISJUNCTION-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "mtemplate_disjunction_p", "MTEMPLATE-DISJUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "update_template_operator", "UPDATE-TEMPLATE-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_meta_template_disjunction", "EXPAND-META-TEMPLATE-DISJUNCTION", 3, 0, false );
    SubLFiles.declareFunction( me, "gather_dependent_disjunction_info", "GATHER-DEPENDENT-DISJUNCTION-INFO", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_templates_file()
  {
    $within_initialize_gen_template_storeP$ = SubLFiles.defparameter( "*WITHIN-INITIALIZE-GEN-TEMPLATE-STORE?*", NIL );
    $pph_kappa_justification_template_caching_state$ = SubLFiles.deflexical( "*PPH-KAPPA-JUSTIFICATION-TEMPLATE-CACHING-STATE*", NIL );
    $rephrase_gen_template_for_kappa_pred_caching_state$ = SubLFiles.deflexical( "*REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED-CACHING-STATE*", NIL );
    $pph_template_bound_vars$ = SubLFiles.defparameter( "*PPH-TEMPLATE-BOUND-VARS*", NIL );
    $phrase_naut_arg_caching_state$ = SubLFiles.deflexical( "*PHRASE-NAUT-ARG-CACHING-STATE*", NIL );
    $pph_dnf_clausal_form_cached_caching_state$ = SubLFiles.deflexical( "*PPH-DNF-CLAUSAL-FORM-CACHED-CACHING-STATE*", NIL );
    $gen_template_verbosity_caching_state$ = SubLFiles.deflexical( "*GEN-TEMPLATE-VERBOSITY-CACHING-STATE*", NIL );
    $phrase_naut_deepening_inference_properties$ = SubLFiles.deflexical( "*PHRASE-NAUT-DEEPENING-INFERENCE-PROPERTIES*", ConsesLow.list( new SubLObject[] { $kw218$MAX_TRANSFORMATION_DEPTH, TWO_INTEGER, $kw219$MAX_NUMBER,
      ONE_INTEGER, $kw220$MAX_TIME, TEN_INTEGER, $kw221$CACHE_INFERENCE_RESULTS_, NIL, $kw222$ANSWER_LANGUAGE, $kw223$HL, $kw224$CONTINUABLE_, NIL, $kw225$RETURN, $list226, $kw227$ALLOW_INDETERMINATE_RESULTS_, T,
      $kw228$DISJUNCTION_FREE_EL_VARS_POLICY, $kw229$COMPUTE_INTERSECTION
    } ) );
    $do_pph_expand_phrase_nauts_stack$ = SubLFiles.defparameter( "*DO-PPH-EXPAND-PHRASE-NAUTS-STACK*", NIL );
    $meta_template_null$ = SubLFiles.defparameter( "*META-TEMPLATE-NULL*", $kw253$NULL );
    return NIL;
  }

  public static SubLObject setup_pph_templates_file()
  {
    utilities_macros.register_kb_function( $sym34$ADD_GEN_TEMPLATE );
    memoization_state.note_globally_cached_function( $sym40$PPH_KAPPA_JUSTIFICATION_TEMPLATE );
    memoization_state.note_globally_cached_function( $sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED );
    utilities_macros.register_kb_function( $sym56$REMOVE_GEN_TEMPLATE );
    utilities_macros.note_funcall_helper_function( $sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_ );
    memoization_state.note_globally_cached_function( $sym88$PHRASE_NAUT_ARG );
    memoization_state.note_memoized_function( $sym125$PPH_AGR_PREDS_FOR_DET_CYCL );
    memoization_state.note_globally_cached_function( $sym131$PPH_DNF_CLAUSAL_FORM_CACHED );
    memoization_state.note_memoized_function( $sym133$PPH_DNF_CLAUSAL_FORM );
    access_macros.register_macro_helper( $sym149$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER, $sym150$DO_PPH_PHRASES_FOR_FORMULA );
    memoization_state.note_memoized_function( $sym173$PPH_GENL_PREDS_DISTANCE );
    memoization_state.note_memoized_function( $sym194$PPH_GFAF_ASSERTIONS_FOR_RELN );
    memoization_state.note_globally_cached_function( $sym159$GEN_TEMPLATE_VERBOSITY );
    sunit_external.define_test_category( $str262$PPH_Template_Supercategory, UNPROVIDED );
    sunit_external.define_test_category( $str263$Gen_Template_Subcategory, ConsesLow.list( $str262$PPH_Template_Supercategory ) );
    sunit_external.define_test_suite( $str264$Gen_Template_Recipe_Test_Battery, ConsesLow.list( $str263$Gen_Template_Subcategory ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_templates_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_templates_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_templates_file();
  }
  static
  {
    me = new pph_templates();
    $within_initialize_gen_template_storeP$ = null;
    $pph_kappa_justification_template_caching_state$ = null;
    $rephrase_gen_template_for_kappa_pred_caching_state$ = null;
    $pph_template_bound_vars$ = null;
    $phrase_naut_arg_caching_state$ = null;
    $pph_dnf_clausal_form_cached_caching_state$ = null;
    $gen_template_verbosity_caching_state$ = null;
    $phrase_naut_deepening_inference_properties$ = null;
    $do_pph_expand_phrase_nauts_stack$ = null;
    $meta_template_null$ = null;
    $str0$_PPH_error_level_ = makeString( "(PPH error level " );
    $str1$__ = makeString( ") " );
    $str2$Recursive_call_to_INITIALIZE_GEN_ = makeString( "Recursive call to INITIALIZE-GEN-TEMPLATE-STORE." );
    $kw3$NEW = makeKeyword( "NEW" );
    $kw4$INITIALIZED = makeKeyword( "INITIALIZED" );
    $str5$gen_template_store_length_of__S_i = makeString( "gen-template-store length of ~S is not good." );
    $sym6$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const7$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const8$NLTemplateGenerationPredicate = constant_handles.reader_make_constant_shell( makeString( "NLTemplateGenerationPredicate" ) );
    $const9$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw10$BREADTH = makeKeyword( "BREADTH" );
    $kw11$QUEUE = makeKeyword( "QUEUE" );
    $kw12$STACK = makeKeyword( "STACK" );
    $sym13$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw14$ERROR = makeKeyword( "ERROR" );
    $str15$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym16$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw17$CERROR = makeKeyword( "CERROR" );
    $str18$continue_anyway = makeString( "continue anyway" );
    $kw19$WARN = makeKeyword( "WARN" );
    $str20$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str21$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str22$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list23 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str24$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $str25$gen_template_store_length__S_is_i = makeString( "gen-template-store length ~S is implausibly large, compared to only ~S relevant assertions in the KB." );
    $str26$gen_template_store_length__S_is_u = makeString( "gen-template-store length ~S is unsettlingly small, compared to only ~S relevant assertions in the KB." );
    $const27$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $sym28$SPEC_ = makeSymbol( "SPEC?" );
    $kw29$DONE = makeKeyword( "DONE" );
    $str30$Initializing__S___ = makeString( "Initializing ~S..." );
    $kw31$GAF = makeKeyword( "GAF" );
    $kw32$OFF = makeKeyword( "OFF" );
    $kw33$FAST = makeKeyword( "FAST" );
    $sym34$ADD_GEN_TEMPLATE = makeSymbol( "ADD-GEN-TEMPLATE" );
    $kw35$TRUE = makeKeyword( "TRUE" );
    $str36$Unable_to_add_assertion_to_gen_te = makeString( "Unable to add assertion to gen-template store:~% ~S~%" );
    $sym37$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str38$___Top_level_CycL___S = makeString( "~% Top-level CycL: ~S" );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Kappa" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) );
    $sym40$PPH_KAPPA_JUSTIFICATION_TEMPLATE = makeSymbol( "PPH-KAPPA-JUSTIFICATION-TEMPLATE" );
    $sym41$REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED = makeSymbol( "REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED" );
    $kw42$ANYTHING = makeKeyword( "ANYTHING" );
    $sym43$_PPH_KAPPA_JUSTIFICATION_TEMPLATE_CACHING_STATE_ = makeSymbol( "*PPH-KAPPA-JUSTIFICATION-TEMPLATE-CACHING-STATE*" );
    $const44$Kappa = constant_handles.reader_make_constant_shell( makeString( "Kappa" ) );
    $list45 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Kappa" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VARS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
        "TEMPLATE" ) ) );
    $sym46$TEMPLATE = makeSymbol( "TEMPLATE" );
    $sym47$VARS = makeSymbol( "VARS" );
    $sym48$_REPHRASE_GEN_TEMPLATE_FOR_KAPPA_PRED_CACHING_STATE_ = makeSymbol( "*REPHRASE-GEN-TEMPLATE-FOR-KAPPA-PRED-CACHING-STATE*" );
    $int49$1024 = makeInteger( 1024 );
    $str50$kappaGenTemplateRuleForArity = makeString( "kappaGenTemplateRuleForArity" );
    $sym51$_RULE = makeSymbol( "?RULE" );
    $list52 = ConsesLow.list( makeSymbol( "?RULE" ) );
    $const53$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym54$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $kw55$REINITIALIZED = makeKeyword( "REINITIALIZED" );
    $sym56$REMOVE_GEN_TEMPLATE = makeSymbol( "REMOVE-GEN-TEMPLATE" );
    $str57$PPH_PHRASE_FROM_ASSERTION_passed_ = makeString( "PPH-PHRASE-FROM-ASSERTION passed a non-GAF: ~S" );
    $str58$PPH_PHRASE_FROM_ASSERTION_passed_ = makeString( "PPH-PHRASE-FROM-ASSERTION passed a bad template:~% ~S" );
    $kw59$SLOW = makeKeyword( "SLOW" );
    $sym60$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $str61$______expanded_template_for__S___ = makeString( "~%*** expanded template for ~S...~%~S~%... is missing generic args ~S" );
    $sym62$REPEATED_ARGS_PHRASE_NAUT_P = makeSymbol( "REPEATED-ARGS-PHRASE-NAUT-P" );
    $sym63$GENERIC_ARG_P = makeSymbol( "GENERIC-ARG-P" );
    $sym64$PPH_NON_TEMPLATE_BOUND_EL_VAR_ = makeSymbol( "PPH-NON-TEMPLATE-BOUND-EL-VAR?" );
    $const65$TheNthFn = constant_handles.reader_make_constant_shell( makeString( "TheNthFn" ) );
    $str66$_S_can_t_begin_a___GenTemplateRec = makeString( "~S can't begin a #$GenTemplateRecipe clause" );
    $kw67$IGNORE = makeKeyword( "IGNORE" );
    $str68$Wf_problem_with__S = makeString( "Wf problem with ~S" );
    $str69$_S_expects_a_closed_formula_for_i = makeString( "~S expects a closed formula for its arg1, not ~S" );
    $str70$_S_expects_a_cycl_sentence_askabl = makeString( "~S expects a cycl-sentence-askable? as in arg-pos ~S, not ~S" );
    $const71$SententialConstituent = constant_handles.reader_make_constant_shell( makeString( "SententialConstituent" ) );
    $sym72$PPH_SPEC_ = makeSymbol( "PPH-SPEC?" );
    $const73$LexicalWord = constant_handles.reader_make_constant_shell( makeString( "LexicalWord" ) );
    $str74$_S_is_required_to_be_a___LexicalW = makeString( "~S is required to be a #$LexicalWord" );
    $str75$_S_exceeds_the_maxArity___S__allo = makeString( "~S exceeds the maxArity (~S) allowed by the predicate" );
    $const76$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $const77$GeneralLexiconMt = constant_handles.reader_make_constant_shell( makeString( "GeneralLexiconMt" ) );
    $list78 = ConsesLow.list( makeSymbol( "FOO" ), makeSymbol( "BAR" ), makeSymbol( "ARGN" ), makeSymbol( "COLL" ) );
    $const79$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $str80$_S_isn_t_a__S_w_r_t___S = makeString( "~S isn't a ~S w.r.t. ~S" );
    $str81$__Self_referential___genTemplate_ = makeString( "~&Self-referential #$genTemplate formula:~% ~S.~%" );
    $str82$__Bad_generic_arg_keyword___S__in = makeString( "~&Bad generic arg keyword (~S) in~% ~S~%" );
    $const83$genTemplate = constant_handles.reader_make_constant_shell( makeString( "genTemplate" ) );
    $const84$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell( makeString( "genTemplate-QuerySentence" ) );
    $const85$genTemplate_Constrained = constant_handles.reader_make_constant_shell( makeString( "genTemplate-Constrained" ) );
    $const86$detailedIsaParaphrase = constant_handles.reader_make_constant_shell( makeString( "detailedIsaParaphrase" ) );
    $str87$_non_wf__needs_instructions_for_i = makeString( "-non-wf? needs instructions for invoking gen-template-recipe-p on ~S" );
    $sym88$PHRASE_NAUT_ARG = makeSymbol( "PHRASE-NAUT-ARG" );
    $str89$_S_has_no_known_arity___ = makeString( "~S has no known arity.~%" );
    $sym90$_PHRASE_NAUT_ARG_CACHING_STATE_ = makeSymbol( "*PHRASE-NAUT-ARG-CACHING-STATE*" );
    $int91$128 = makeInteger( 128 );
    $list92 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "GEN-ARG" ), makeSymbol( "REMAINDER" ) );
    $str93$_S_is_not_a_well_formed_genTempla = makeString( "~S is not a well-formed genTemplate recipe." );
    $str94$PPH_PHRASE_FROM_GENTEMPLATE_PHRAS = makeString( "PPH-PHRASE-FROM-GENTEMPLATE-PHRASE passed a non-PPH-PHRASE-NAUT: ~S.~% Expansion: ~S" );
    $list95 = ConsesLow.list( ONE_INTEGER );
    $kw96$ARG1 = makeKeyword( "ARG1" );
    $sym97$PPH_ARG_POSITION_SPECIFIER_ = makeSymbol( "PPH-ARG-POSITION-SPECIFIER?" );
    $const98$PossessivePhrase = constant_handles.reader_make_constant_shell( makeString( "PossessivePhrase" ) );
    $str99$Don_t_know_how_to_make_a_PPH_PHRA = makeString( "Don't know how to make a PPH-PHRASE from ~S." );
    $str100$Couldn_t_make_PPH_phrase_from__S = makeString( "Couldn't make PPH phrase from ~S" );
    $kw101$SUBJECT_VERB = makeKeyword( "SUBJECT-VERB" );
    $str102$Bad_Nth_phrase___S__Dtr_count_is_ = makeString( "Bad Nth phrase: ~S. Dtr count is ~S" );
    $str103$Phrase_specified_to_agree_with_it = makeString( "Phrase specified to agree with itself!~% ~S" );
    $str104$Can_t_dereference__S_in____S = makeString( "Can't dereference ~S in~% ~S" );
    $str105$Potentially_recursive_agr___S____ = makeString( "Potentially recursive agr: ~S~% ~S" );
    $str106$Dereferenced__S_to__S = makeString( "Dereferenced ~S to ~S" );
    $sym107$PPH_HEAD_DTR_NAUT_ = makeSymbol( "PPH-HEAD-DTR-NAUT?" );
    $kw108$ARG2 = makeKeyword( "ARG2" );
    $str109$Incompatible_constraint__S_on__S = makeString( "Incompatible constraint ~S on ~S" );
    $str110$NthPhraseAgrFn = makeString( "NthPhraseAgrFn" );
    $kw111$PEER = makeKeyword( "PEER" );
    $str112$__Warning__null_constraint_on__S_ = makeString( "~&Warning: null constraint on ~S.~%" );
    $str113$Don_t_know_what_to_do_with__S_con = makeString( "Don't know what to do with ~S constraint." );
    $const114$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $list115 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Determiner" ) ) );
    $const116$Determiner = constant_handles.reader_make_constant_shell( makeString( "Determiner" ) );
    $list117 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) );
    $list118 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) ) );
    $kw119$DET_NBAR = makeKeyword( "DET-NBAR" );
    $kw120$ANY = makeKeyword( "ANY" );
    $kw121$NL_PREDS = makeKeyword( "NL-PREDS" );
    $kw122$POS_PRED = makeKeyword( "POS-PRED" );
    $str123$__Agr_preds_for_the_determiner__S = makeString( "~&Agr preds for the determiner ~S are ~S.~%" );
    $str124$Using_default_agr_preds__S_for__S = makeString( "Using default agr preds ~S for ~S" );
    $sym125$PPH_AGR_PREDS_FOR_DET_CYCL = makeSymbol( "PPH-AGR-PREDS-FOR-DET-CYCL" );
    $list126 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalMaxFn" ) ), constant_handles.reader_make_constant_shell( makeString( "IntervalMinFn" ) ) );
    $const127$denotation = constant_handles.reader_make_constant_shell( makeString( "denotation" ) );
    $sym128$PPH_GENL_POS_PRED_ = makeSymbol( "PPH-GENL-POS-PRED?" );
    $const129$genFormat_ArgFixed = constant_handles.reader_make_constant_shell( makeString( "genFormat-ArgFixed" ) );
    $const130$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $sym131$PPH_DNF_CLAUSAL_FORM_CACHED = makeSymbol( "PPH-DNF-CLAUSAL-FORM-CACHED" );
    $sym132$_PPH_DNF_CLAUSAL_FORM_CACHED_CACHING_STATE_ = makeSymbol( "*PPH-DNF-CLAUSAL-FORM-CACHED-CACHING-STATE*" );
    $sym133$PPH_DNF_CLAUSAL_FORM = makeSymbol( "PPH-DNF-CLAUSAL-FORM" );
    $list134 = ConsesLow.list( makeSymbol( "NEGATED-NEG-LITS" ), makeSymbol( "NEGATED-POS-LITS" ) );
    $sym135$FORT_P = makeSymbol( "FORT-P" );
    $sym136$GENERALITY_ESTIMATE = makeSymbol( "GENERALITY-ESTIMATE" );
    $list137 = ConsesLow.list( makeSymbol( "NEGLITS" ), makeSymbol( "POSLITS" ) );
    $str138$Don_t_know_how_to_convert__S_to__ = makeString( "Don't know how to convert ~S to #$genTemplate." );
    $const139$Determiner_Indefinite = constant_handles.reader_make_constant_shell( makeString( "Determiner-Indefinite" ) );
    $kw140$INDEFINITE = makeKeyword( "INDEFINITE" );
    $const141$Determiner_Definite = constant_handles.reader_make_constant_shell( makeString( "Determiner-Definite" ) );
    $kw142$DEFINITE = makeKeyword( "DEFINITE" );
    $const143$nounStrings = constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) );
    $const144$plural_Generic = constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) );
    $const145$nonSingular_Generic = constant_handles.reader_make_constant_shell( makeString( "nonSingular-Generic" ) );
    $const146$nonPlural_Generic = constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) );
    $sym147$GENTEMPLATE_PHRASE_FROM_PPH_PHRASE_INT = makeSymbol( "GENTEMPLATE-PHRASE-FROM-PPH-PHRASE-INT" );
    $const148$verbStrings = constant_handles.reader_make_constant_shell( makeString( "verbStrings" ) );
    $sym149$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER = makeSymbol( "PPH-CUSTOMIZE-TEMPLATE-MACRO-HELPER" );
    $sym150$DO_PPH_PHRASES_FOR_FORMULA = makeSymbol( "DO-PPH-PHRASES-FOR-FORMULA" );
    $kw151$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $list152 = ConsesLow.list( ZERO_INTEGER );
    $str153$__Found_PPH_PHRASE_for__S_____S__ = makeString( "~&Found PPH-PHRASE for ~S:~% ~S~% Justification:~% ~S~% Copied from~% ~S~%" );
    $sym154$GENERATE_PHRASE_FROM_TEMPLATE = makeSymbol( "GENERATE-PHRASE-FROM-TEMPLATE" );
    $sym155$_ = makeSymbol( "<" );
    $sym156$PPH_PHRASE_TOP_LEVEL_DEMERITS = makeSymbol( "PPH-PHRASE-TOP-LEVEL-DEMERITS" );
    $kw157$RANDOM = makeKeyword( "RANDOM" );
    $sym158$_ = makeSymbol( ">" );
    $sym159$GEN_TEMPLATE_VERBOSITY = makeSymbol( "GEN-TEMPLATE-VERBOSITY" );
    $sym160$GET_GEN_TEMPLATE_ASSERTION = makeSymbol( "GET-GEN-TEMPLATE-ASSERTION" );
    $kw161$GEN_FORMAT = makeKeyword( "GEN-FORMAT" );
    $str162$Couldn_t_use_gen_template_____S__ = makeString( "Couldn't use gen-template:~% ~S~% Explanation ~S" );
    $str163$Expected_gen_template__got__S__ = makeString( "Expected gen-template, got ~S~%" );
    $str164$Skipping_forbidden_lexical_assert = makeString( "Skipping forbidden lexical assertion:~% ~S" );
    $kw165$INVERSE = makeKeyword( "INVERSE" );
    $str166$__Reinitializing_relns_to_use___ = makeString( "~&Reinitializing relns-to-use.~%" );
    $const167$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw168$DEPTH = makeKeyword( "DEPTH" );
    $const169$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $str170$Inverting_templates_for__S = makeString( "Inverting templates for ~S" );
    $sym171$PPH_GENL_RELATION_ = makeSymbol( "PPH-GENL-RELATION?" );
    $str172$Relns_to_use___S__ = makeString( "Relns to use: ~S~%" );
    $sym173$PPH_GENL_PREDS_DISTANCE = makeSymbol( "PPH-GENL-PREDS-DISTANCE" );
    $const174$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $kw175$ASSERTION = makeKeyword( "ASSERTION" );
    $str176$__Using_inferior_templates___ = makeString( "~&Using inferior templates.~%" );
    $sym177$GENERATION_TEMPLATE_P = makeSymbol( "GENERATION-TEMPLATE-P" );
    $str178$__Head_of_queue_____S__ = makeString( "~&Head of queue:~% ~S~%" );
    $str179$Sending_inferior_templates_to_end = makeString( "Sending inferior templates to end of queue:~% ~S" );
    $str180$Couldn_t_use_any_gen_templates_fr = makeString( "Couldn't use any gen-templates from ~S" );
    $str181$__Reverting_to___genFormat_for__S = makeString( "~&Reverting to #$genFormat for ~S~%" );
    $kw182$INFERIOR = makeKeyword( "INFERIOR" );
    $str183$__Populating_gen_template_sets_wi = makeString( "~&Populating gen-template sets with ~S~%" );
    $kw184$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym185$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str186$Adding__GEN_FORMAT_at_end_of_queu = makeString( "Adding :GEN-FORMAT at end of queue for ~S~%" );
    $sym187$CAND = makeSymbol( "CAND" );
    $list188 = ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "RESULT" ) );
    $list189 = ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NL-PREDS" ) ) );
    $sym190$RELEVANT_PRED_IS_EVERYTHING = makeSymbol( "RELEVANT-PRED-IS-EVERYTHING" );
    $list191 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genFormat" ) ), constant_handles.reader_make_constant_shell( makeString( "genFormat-Precise" ) ) );
    $str192$__Couldn_t_find_paraphrase_templa = makeString( "~&Couldn't find paraphrase template for ~S. Using one for ~S instead.~%" );
    $str193$Infinite_recursion_for__S_using__ = makeString( "Infinite recursion for ~S using:~% ~S.~%" );
    $sym194$PPH_GFAF_ASSERTIONS_FOR_RELN = makeSymbol( "PPH-GFAF-ASSERTIONS-FOR-RELN" );
    $int195$250 = makeInteger( 250 );
    $sym196$CAR = makeSymbol( "CAR" );
    $const197$genFormat_Precise = constant_handles.reader_make_constant_shell( makeString( "genFormat-Precise" ) );
    $str198$Template_doesn_t_apply_to_input_f = makeString( "Template doesn't apply to input formula." );
    $str199$___S_is_a_symmetric_binary_predic = makeString( "~&~S is a symmetric binary predicate, so looking for a reversed template~%" );
    $str200$__Switching_arg1_and_arg2_in_phra = makeString( "~&Switching arg1 and arg2 in phrase.~%" );
    $str201$wrong_focal_argnum__wanted__S_ = makeString( "wrong focal argnum (wanted ~S)" );
    $str202$Template_has_wrong_scope_for__S = makeString( "Template has wrong scope for ~S" );
    $sym203$_GEN_TEMPLATE_VERBOSITY_CACHING_STATE_ = makeSymbol( "*GEN-TEMPLATE-VERBOSITY-CACHING-STATE*" );
    $int204$10000 = makeInteger( 10000 );
    $str205$Couldn_t_swtich_arg1_and_arg2___i = makeString( "Couldn't swtich arg1 and arg2~% in ~S" );
    $str206$Gen_template_mt__S_not_visible_fr = makeString( "Gen-template mt ~S not visible from ~S" );
    $str207$Gen_template_preds__S_not_compati = makeString( "Gen-template preds ~S not compatible with ~S" );
    $list208 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) ), constant_handles.reader_make_constant_shell( makeString( "determinerStrings" ) ) );
    $kw209$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str210$__Checking_precision_of__S_vs___S = makeString( "~&Checking precision of ~S vs. ~S.~%" );
    $str211$Not_using___genTemplate_because_o = makeString( "Not using #$genTemplate because of existing #$genFormat-ArgFixed." );
    $str212$__Template_judged_imprecise_becau = makeString( "~&Template judged imprecise because it did not reference ~S.~%" );
    $list213 = ConsesLow.list( makeKeyword( "MODES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ReformulatorMode-Tersify" ) ) ) );
    $list214 = ConsesLow.list( makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "NONE" ) );
    $str215$Deepened____S___to__S = makeString( "Deepened~% ~S~% to ~S" );
    $const216$deeperGenTemplateRecipe = constant_handles.reader_make_constant_shell( makeString( "deeperGenTemplateRecipe" ) );
    $list217 = ConsesLow.list( makeSymbol( "?DEEPER" ) );
    $kw218$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw219$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw220$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw221$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw222$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw223$HL = makeKeyword( "HL" );
    $kw224$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw225$RETURN = makeKeyword( "RETURN" );
    $list226 = ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?DEEPER" ) );
    $kw227$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw228$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw229$COMPUTE_INTERSECTION = makeKeyword( "COMPUTE-INTERSECTION" );
    $kw230$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw231$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw232$NONE = makeKeyword( "NONE" );
    $str233$__Phrasifying__S___ = makeString( "~&Phrasifying ~S.~%" );
    $list234 = ConsesLow.list( makeKeyword( "TEMPORAL-LOCATION" ), makeKeyword( "TRUE" ) );
    $kw235$DO_PPH_EXPAND_PHRASE_NAUTS_RECURSION_LIMIT = makeKeyword( "DO-PPH-EXPAND-PHRASE-NAUTS-RECURSION-LIMIT" );
    $str236$__Expanded_form_is__S___ = makeString( "~&Expanded form is ~S.~%" );
    $sym237$_EXIT = makeSymbol( "%EXIT" );
    $str238$Recursion_limit_exceeded_expandin = makeString( "Recursion limit exceeded expanding ~S~% ~S" );
    $int239$50 = makeInteger( 50 );
    $str240$Already_expanded__S = makeString( "Already expanded ~S" );
    $sym241$DO_PPH_EXPAND_PHRASE_NAUTS = makeSymbol( "DO-PPH-EXPAND-PHRASE-NAUTS" );
    $sym242$PPH_IDENTITY_TEMPLATE_P = makeSymbol( "PPH-IDENTITY-TEMPLATE-P" );
    $str243$Expansions_that_refer_to__S_tend_ = makeString( "Expansions that refer to ~S tend to cause infinite recursion.~%Can't expand ~S~%Expansion template: ~S~%" );
    $str244$Checking__gen_template_store____ = makeString( "Checking *gen-template-store*..." );
    $list245 = ConsesLow.list( makeSymbol( "THE-RELN" ), makeSymbol( "ALL-ITS-TEMPLATES" ) );
    $str246$checking__S = makeString( "checking ~S" );
    $str247$non_wff_template__S___S = makeString( "non-wff template ~S~%~S" );
    $str248$Checking_the_misc__extent_of___Be = makeString( "Checking the misc. extent of #$BestNLStringOfFn..." );
    $str249$____ = makeString( ".,;?" );
    $const250$Function = constant_handles.reader_make_constant_shell( makeString( "Function" ) );
    $sym251$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $str252$Searching___genTemplate_Constrain = makeString( "Searching #$genTemplate-Constrained..." );
    $kw253$NULL = makeKeyword( "NULL" );
    $sym254$META_GEN_TEMPLATE_P = makeSymbol( "META-GEN-TEMPLATE-P" );
    $sym255$UPDATE_TEMPLATE_OPERATOR = makeSymbol( "UPDATE-TEMPLATE-OPERATOR" );
    $const256$metaGenTemplate_QuerySentence = constant_handles.reader_make_constant_shell( makeString( "metaGenTemplate-QuerySentence" ) );
    $kw257$OR = makeKeyword( "OR" );
    $sym258$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym259$MTEMPLATE_DISJUNCTION_P = makeSymbol( "MTEMPLATE-DISJUNCTION-P" );
    $kw260$AND = makeKeyword( "AND" );
    $str261$dependent_disjunction__a_has_vary = makeString( "dependent disjunction ~a has varying arities in ~a" );
    $str262$PPH_Template_Supercategory = makeString( "PPH Template Supercategory" );
    $str263$Gen_Template_Subcategory = makeString( "Gen Template Subcategory" );
    $str264$Gen_Template_Recipe_Test_Battery = makeString( "Gen Template Recipe Test Battery" );
  }

  public static final class $gen_template_verbosity$UnaryFunction
      extends
        UnaryFunction
  {
    public $gen_template_verbosity$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GEN-TEMPLATE-VERBOSITY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return gen_template_verbosity( arg1 );
    }
  }

  public static final class $do_pph_expand_phrase_nauts$UnaryFunction
      extends
        UnaryFunction
  {
    public $do_pph_expand_phrase_nauts$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DO-PPH-EXPAND-PHRASE-NAUTS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return do_pph_expand_phrase_nauts( arg1 );
    }
  }
}
/*
 * 
 * Total time: 4707 ms
 * 
 */