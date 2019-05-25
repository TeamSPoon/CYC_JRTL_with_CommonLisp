package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class isa
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.isa";
  public static final String myFingerPrint = "c3c24719c025f301b9d847ba712f57de9dc816183179cbbb2da60b76ad52b03f";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 758L)
  private static SubLSymbol $sbhl_may_return_naut_collections_as_fortsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11429L)
  private static SubLSymbol $all_isas_wrt$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11527L)
  private static SubLSymbol $all_isas_wrt_isa$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43208L)
  private static SubLSymbol $random_instance_of_sampling_ratio$;
  private static final SubLObject $const0$isa;
  private static final SubLSymbol $sym1$HL_TERM_P;
  private static final SubLSymbol $sym2$FORT_P;
  private static final SubLSymbol $sym3$MIN_ISA;
  private static final SubLList $list4;
  private static final SubLString $str5$Returns_most_specific_collections;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $sym9$MAX_NOT_ISA;
  private static final SubLString $str10$Returns_most_general_collections_;
  private static final SubLObject $const11$True_JustificationTruth;
  private static final SubLSymbol $sym12$EL_FORT_P;
  private static final SubLSymbol $sym13$INSTANCES;
  private static final SubLList $list14;
  private static final SubLString $str15$Returns_the_asserted_instances_of;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$MAX_INSTANCES;
  private static final SubLList $list18;
  private static final SubLString $str19$Returns_the_maximal_among_the_ass;
  private static final SubLSymbol $sym20$ALL_INSTANCES_WITH_MAX;
  private static final SubLSymbol $sym21$INTEGERP;
  private static final SubLSymbol $kw22$INVALID_ITERATION_TERM;
  private static final SubLSymbol $sym23$MIN_NOT_INSTANCES;
  private static final SubLString $str24$Returns_the_most_specific_negated;
  private static final SubLSymbol $sym25$ISA_SIBLINGS;
  private static final SubLString $str26$Returns_the_direct_isas_of_those_;
  private static final SubLSymbol $sym27$INSTANCE_SIBLINGS;
  private static final SubLString $str28$Returns_the_direct_instances_of_t;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw31$ERROR;
  private static final SubLString $str32$_A_is_not_a__A;
  private static final SubLSymbol $sym33$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw34$CERROR;
  private static final SubLString $str35$continue_anyway;
  private static final SubLSymbol $kw36$WARN;
  private static final SubLString $str37$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLSymbol $kw38$OLD;
  private static final SubLString $str39$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str40$attempting_to_bind_direction_link;
  private static final SubLSymbol $kw41$RESOURCE;
  private static final SubLSymbol $sym42$SBHL_SEARCH_TRUTH_VALUE_P;
  private static final SubLList $list43;
  private static final SubLObject $const44$genls;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym47$MAP_INSTANCES;
  private static final SubLList $list48;
  private static final SubLString $str49$apply_FUNCTION_to_every__least_ge;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$ALL_ISA;
  private static final SubLString $str52$Returns_all_collections_that_incl;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const55$EverythingPSC;
  private static final SubLSymbol $sym56$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLSymbol $sym57$ALL_INSTANCES;
  private static final SubLString $str58$Returns_all_instances_of_COLLECTI;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$ALL_INSTANCES_IN_ALL_MTS;
  private static final SubLList $list61;
  private static final SubLString $str62$_return_listp__all_instances_of_C;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$ALL_FORT_INSTANCES;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$HL_PROTOTYPICAL_INSTANCE_;
  private static final SubLSymbol $sym67$ALL_FORT_INSTANCES_IN_ALL_MTS;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$GATHER_ISA_WRT_ISA;
  private static final SubLSymbol $sym70$ALL_ISAS_WRT;
  private static final SubLList $list71;
  private static final SubLString $str72$Returns_all_isa_of_term_TERM_that;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$LISTP;
  private static final SubLSymbol $sym75$ISA_STORED_NAUT_ARG2_P;
  private static final SubLSymbol $sym76$UNION_ALL_ISA;
  private static final SubLList $list77;
  private static final SubLString $str78$Returns_all_collections_that_incl;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$UNION_ALL_INSTANCES;
  private static final SubLList $list81;
  private static final SubLString $str82$Returns_set_of_all_instances_of_e;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$ALL_ISA_AMONG;
  private static final SubLList $list85;
  private static final SubLString $str86$Returns_those_elements_of_COLLECT;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$ALL_INSTANCES_AMONG;
  private static final SubLList $list89;
  private static final SubLString $str90$Returns_those_elements_of_TERMS_t;
  private static final SubLList $list91;
  private static final SubLInteger $int92$100000;
  private static final SubLInteger $int93$50;
  private static final SubLInteger $int94$25;
  private static final SubLSymbol $sym95$ALL_NOT_ISA;
  private static final SubLString $str96$Returns_all_collections_that_do_n;
  private static final SubLSymbol $sym97$ALL_NOT_INSTANCES;
  private static final SubLString $str98$Returns_all_terms_that_are_not_me;
  private static final SubLSymbol $sym99$NOT_ISA_AMONG;
  private static final SubLString $str100$Returns_those_elements_of_COLLECT;
  private static final SubLSymbol $sym101$MAP_ALL_ISA;
  private static final SubLList $list102;
  private static final SubLString $str103$Apply_FUNCTION_to_every_all_isa_o;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$MAP_ALL_INSTANCES;
  private static final SubLList $list106;
  private static final SubLString $str107$Apply_FUNCTION_to_each_unique_ins;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$ANY_WRT_ALL_ISA;
  private static final SubLString $str110$Return_the_first_encountered_non_;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$ISA__GOAL;
  private static final SubLSymbol $kw113$BREADTH;
  private static final SubLSymbol $kw114$QUEUE;
  private static final SubLSymbol $kw115$STACK;
  private static final SubLList $list116;
  private static final SubLString $str117$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym118$COUNT_ALL_INSTANCES;
  private static final SubLList $list119;
  private static final SubLString $str120$Counts_the_number_of_instances_in;
  private static final SubLList $list121;
  private static final SubLObject $const122$quotedIsa;
  private static final SubLSymbol $sym123$COUNT_ALL_QUOTED_INSTANCES;
  private static final SubLString $str124$Counts_the_number_of_quoted_insta;
  private static final SubLObject $const125$CollectionIntersectionFn;
  private static final SubLSymbol $sym126$ISA_;
  private static final SubLList $list127;
  private static final SubLString $str128$Returns_whether_TERM_is_an_instan;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$ISA_IN_MTS_;
  private static final SubLList $list131;
  private static final SubLString $str132$is__term__an_element_of__collecti;
  private static final SubLSymbol $sym133$ISA_IN_ANY_MT_;
  private static final SubLList $list134;
  private static final SubLString $str135$is__term__an_element_of__collecti;
  private static final SubLSymbol $sym136$ANY_ISA_;
  private static final SubLString $str137$Returns_whether_TERM_is_an_instan;
  private static final SubLSymbol $sym138$ISA_ANY_;
  private static final SubLObject $const139$Collection;
  private static final SubLString $str140$_A_is_not_a_collection;
  private static final SubLSymbol $sym141$ANY_ISA_ANY_;
  private static final SubLList $list142;
  private static final SubLString $str143$_return_booleanp__whether_any_ter;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$NOT_ISA_;
  private static final SubLString $str146$_return_booleanp__whether_TERM_is;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$WHY_ISA_;
  private static final SubLList $list149;
  private static final SubLString $str150$Returns_justification_of__isa_TER;
  private static final SubLList $list151;
  private static final SubLObject $const152$termOfUnit;
  private static final SubLList $list153;
  private static final SubLObject $const154$resultIsa;
  private static final SubLObject $const155$resultIsaArg;
  private static final SubLObject $const156$interArgResultIsa;
  private static final SubLObject $const157$interArgResultIsaReln;
  private static final SubLSymbol $sym158$WHY_NOT_ISA_;
  private static final SubLString $str159$Returns_justification_of__not__is;
  private static final SubLSymbol $sym160$INSTANCES_;
  private static final SubLString $str161$Returns_whether_COLLECTION_has_an;
  private static final SubLSymbol $sym162$GATHER_GENLS_MTS;
  private static final SubLSymbol $sym163$HLMT_P;
  private static final SubLObject $const164$Thing;
  private static final SubLSymbol $sym165$MAX_FLOOR_MTS_OF_ISA_PATHS;
  private static final SubLList $list166;
  private static final SubLString $str167$Returns_in_what__most_genl__mts_T;
  private static final SubLSymbol $sym168$MAX_FLOOR_MTS_OF_QUOTED_ISA_PATHS;
  private static final SubLString $str169$Returns_in_what__most_genl__mts_T;
  private static final SubLSymbol $sym170$LIST;
  private static final SubLSymbol $sym171$SETS_EQUAL_;
  private static final SubLSymbol $sym172$GATHER_MIN_MTS_OF_PATHS_BETWEEN;
  private static final SubLSymbol $kw173$TRUE;
  private static final SubLSymbol $sym174$CACHE_MTS_OF_ARG;
  private static final SubLObject $const175$resultQuotedIsa;
  private static final SubLObject $const176$evaluationResultQuotedIsa;
  private static final SubLSymbol $sym177$HLMT_EQUAL;
  private static final SubLSymbol $sym178$KB_SET_OR_COLLECTION_P;
  private static final SubLObject $const179$TheSet;
  private static final SubLList $list180;
  private static final SubLSymbol $sym181$INSTANCEOF_AFTER_ADDING;
  private static final SubLSymbol $sym182$ISA_AFTER_ADDING;
  private static final SubLList $list183;
  private static final SubLObject $const184$CollectionSubsetFn;
  private static final SubLList $list185;
  private static final SubLList $list186;
  private static final SubLObject $const187$TheCollectionOf;
  private static final SubLList $list188;
  private static final SubLSymbol $kw189$FORWARD;
  private static final SubLSymbol $sym190$INSTANCEOF_AFTER_REMOVING;
  private static final SubLSymbol $sym191$ISA_AFTER_REMOVING;
  private static final SubLSymbol $sym192$QUOTED_ISA_;
  private static final SubLString $str193$Returns_whether_TERM_is_a_quoted_;
  private static final SubLSymbol $sym194$QUOTED_ISA_IN_ANY_MT_;
  private static final SubLSymbol $sym195$ANY_QUOTED_ISA_;
  private static final SubLSymbol $sym196$QUOTED_ISA_ANY_;
  private static final SubLSymbol $sym197$ALL_QUOTED_ISA_;
  private static final SubLString $str198$Returns_whether_TERM_is_a_quoted_;
  private static final SubLSymbol $sym199$NOT_QUOTED_ISA_;
  private static final SubLSymbol $sym200$QUOTED_INSTANCES;
  private static final SubLSymbol $sym201$UNION_ALL_QUOTED_INSTANCES;
  private static final SubLString $str202$Returns_set_of_all_quoted_instanc;
  private static final SubLSymbol $sym203$MAP_ALL_QUOTED_ISA;
  private static final SubLString $str204$Apply_FUNCTION_to_every_all_quote;
  private static final SubLList $list205;
  private static final SubLSymbol $sym206$ALL_QUOTED_ISA;
  private static final SubLSymbol $sym207$ALL_QUOTED_ISAS_WRT;
  private static final SubLSymbol $sym208$ALL_QUOTED_INSTANCES;
  private static final SubLSymbol $sym209$ALL_QUOTED_ISA_AMONG;
  private static final SubLString $str210$Returns_those_elements_of_COLLECT;
  private static final SubLSymbol $sym211$QUOTED_INSTANCEOF_AFTER_ADDING;
  private static final SubLSymbol $sym212$QUOTED_INSTANCEOF_AFTER_REMOVING;
  private static final SubLSymbol $kw213$GAF;
  private static final SubLSymbol $sym214$MIN_COLS;
  private static final SubLSymbol $kw215$TEST;
  private static final SubLSymbol $kw216$OWNER;
  private static final SubLSymbol $kw217$CLASSES;
  private static final SubLSymbol $kw218$KB;
  private static final SubLSymbol $kw219$TINY;
  private static final SubLSymbol $kw220$WORKING_;
  private static final SubLList $list221;
  private static final SubLSymbol $sym222$MAX_COLS;
  private static final SubLList $list223;
  private static final SubLSymbol $kw224$FULL;
  private static final SubLList $list225;
  private static final SubLList $list226;
  private static final SubLList $list227;
  private static final SubLSymbol $sym228$ALL_INSTANCES_;
  private static final SubLList $list229;
  private static final SubLList $list230;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1111L)
  public static SubLObject isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    SubLObject result = sbhl_link_methods.sbhl_forward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv, UNPROVIDED );
    if( NIL != forts.non_fort_p( v_term ) )
    {
      result = list_utilities.fast_delete_duplicates( ConsesLow.nconc( sbhl_link_methods.non_fort_isas( v_term, mt, tv ), result ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) )
    {
      result = list_utilities.fast_delete_duplicates( ConsesLow.nconc( sbhl_link_methods.isas_from_naut_arg2( v_term, mt, tv ), result ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1798L)
  public static SubLObject min_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$HL_TERM_P );
    SubLObject result = sbhl_search_methods.sbhl_min_forward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv );
    if( NIL != forts.non_fort_p( v_term ) )
    {
      result = genls.min_cols( ConsesLow.nconc( sbhl_link_methods.non_fort_isas( v_term, mt, tv ), result ), mt, tv );
    }
    if( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) )
    {
      result = genls.min_cols( ConsesLow.nconc( sbhl_link_methods.isas_from_naut_arg2( v_term, mt, tv ), result ), mt, tv );
    }
    if( NIL == $sbhl_may_return_naut_collections_as_fortsP$.getDynamicValue( thread ) )
    {
      result = list_utilities.remove_if_not( $sym2$FORT_P, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2445L)
  public static SubLObject min_isa_in_mt(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      result = min_isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2652L)
  public static SubLObject nat_isa(final SubLObject naut, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject nart = narts_high.find_nart( naut );
    if( NIL != nart_handles.nart_p( nart ) )
    {
      return isa( nart, mt, tv );
    }
    return naut_isa( naut, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2882L)
  public static SubLObject naut_isa(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.remove_duplicate_forts( ConsesLow.append( new SubLObject[] { kb_accessors.result_isa( cycl_utilities.nat_functor( naut ), mt ), kb_accessors.result_isa_args( naut, mt ), kb_accessors
        .result_inter_arg_isa( naut, mt ), kb_accessors.result_inter_arg_isa_reln( naut, mt ), kb_accessors.result_isa_via_arg_arg_isa( naut, mt ), kb_accessors.result_isa_arg_isas( naut, mt ), kb_accessors
            .result_isa_when_arg_isa( naut, mt ), sbhl_link_methods.non_fort_isas( naut, mt, UNPROVIDED )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3270L)
  public static SubLObject not_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_forward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3450L)
  public static SubLObject max_not_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    return genls.max_cols( sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv ), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3781L)
  public static SubLObject nat_max_not_isa(final SubLObject nat, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject nart = narts_high.find_nart( nat );
    if( NIL != nart_handles.nart_p( nart ) )
    {
      return max_not_isa( nart, mt, tv );
    }
    SubLObject not_isa = NIL;
    SubLObject cdolist_list_var = genls.union_all_genls( kb_accessors.result_types( cycl_utilities.nat_functor( nat ), mt ), mt, tv );
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      not_isa = conses_high.nunion( disjoint_with.max_all_disjoint_with( v_isa, mt, tv ), not_isa, UNPROVIDED, UNPROVIDED );
      not_isa = conses_high.nunion( sdc.max_sdc( v_isa, mt ), not_isa, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return genls.max_cols( not_isa, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4284L)
  public static SubLObject instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = $const11$True_JustificationTruth;
    }
    enforceType( col, $sym12$EL_FORT_P );
    return sbhl_link_methods.sbhl_backward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4635L)
  public static SubLObject max_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym12$EL_FORT_P );
    return sbhl_search_methods.sbhl_max_backward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4971L)
  public static SubLObject all_instances_with_max(final SubLObject cycl_term, final SubLObject max)
  {
    assert NIL != Types.integerp( max ) : max;
    if( NIL == fort_types_interface.collection_p( cycl_term ) )
    {
      return NIL;
    }
    final SubLObject iter = kb_iterators.new_instances_iterator( cycl_term );
    SubLObject cur_term = NIL;
    SubLObject result = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( max ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL != iteration.iteration_done( iter ) )
      {
        return result;
      }
      cur_term = iteration.iteration_next_without_values( iter, $kw22$INVALID_ITERATION_TERM );
      if( cur_term != $kw22$INVALID_ITERATION_TERM )
      {
        result = ConsesLow.cons( cur_term, result );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5626L)
  public static SubLObject not_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_backward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5806L)
  public static SubLObject min_not_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym12$EL_FORT_P );
    return sbhl_search_methods.sbhl_min_backward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6081L)
  public static SubLObject isa_siblings(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    return sbhl_link_methods.sbhl_siblings_forward( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6408L)
  public static SubLObject instance_siblings(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym12$EL_FORT_P );
    return sbhl_link_methods.sbhl_siblings_backward( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6772L)
  public static SubLObject map_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject module = sbhl_module_vars.get_sbhl_module( $const0$isa );
    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( module, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject tv_var = tv;
        final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw31$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw34$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw36$WARN ) )
            {
              Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const11$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw38$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw38$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$5 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$14 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( module );
                    SubLObject rest;
                    SubLObject module_var;
                    SubLObject _prev_bind_0_$7;
                    SubLObject _prev_bind_1_$6;
                    SubLObject node;
                    SubLObject d_link;
                    SubLObject mt_links;
                    SubLObject iteration_state;
                    SubLObject mt_$18;
                    SubLObject tv_links;
                    SubLObject _prev_bind_0_$8;
                    SubLObject iteration_state_$20;
                    SubLObject tv_$21;
                    SubLObject link_nodes;
                    SubLObject _prev_bind_0_$9;
                    SubLObject sol;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject v_isa;
                    SubLObject csome_list_var;
                    SubLObject v_isa2;
                    SubLObject new_list;
                    SubLObject rest_$23;
                    SubLObject generating_fn;
                    SubLObject _prev_bind_0_$10;
                    SubLObject sol2;
                    SubLObject link_nodes2;
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject v_isa3;
                    SubLObject csome_list_var2;
                    SubLObject v_isa4;
                    for( rest = NIL, rest = accessible_modules; NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != rest; rest = rest.rest() )
                    {
                      module_var = rest.first();
                      _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        node = function_terms.naut_to_nart( v_term );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread )
                                  && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                mt_$18 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$18 ) )
                                {
                                  _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$18, thread );
                                    for( iteration_state_$20 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(
                                        thread ) && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state_$20 ); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(
                                            iteration_state_$20 ) )
                                    {
                                      thread.resetMultipleValues();
                                      tv_$21 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$20 );
                                      link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$21 ) )
                                      {
                                        _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv_$21, thread );
                                          sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            set_contents_var = set.do_set_internal( sol );
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL == set_contents.do_set_contents_doneP( basis_object,
                                                    state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              v_isa = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, v_isa ) )
                                              {
                                                Functions.funcall( function, v_isa );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            if( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) )
                                            {
                                              csome_list_var = sol;
                                              v_isa2 = NIL;
                                              v_isa2 = csome_list_var.first();
                                              while ( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != csome_list_var)
                                              {
                                                Functions.funcall( function, v_isa2 );
                                                csome_list_var = csome_list_var.rest();
                                                v_isa2 = csome_list_var.first();
                                              }
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$9, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$20 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$8, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                              .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          for( rest_$23 = NIL, rest_$23 = new_list; NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != rest_$23; rest_$23 = rest_$23.rest() )
                          {
                            generating_fn = rest_$23.first();
                            _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                set_contents_var2 = set.do_set_internal( sol2 );
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents
                                        .do_set_contents_update_state( state2 ) )
                                {
                                  v_isa3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, v_isa3 ) )
                                  {
                                    Functions.funcall( function, v_isa3 );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                if( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) )
                                {
                                  csome_list_var2 = sol2;
                                  v_isa4 = NIL;
                                  v_isa4 = csome_list_var2.first();
                                  while ( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != csome_list_var2)
                                  {
                                    Functions.funcall( function, v_isa4 );
                                    csome_list_var2 = csome_list_var2.rest();
                                    v_isa4 = csome_list_var2.first();
                                  }
                                }
                              }
                              else
                              {
                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$10, thread );
                            }
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$6, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$7, thread );
                      }
                    }
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$15, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$14, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$5, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$5, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$6, thread );
                }
                if( source == $kw41$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$5, thread );
              }
              if( source == $kw41$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$4, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$4, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$4, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$3, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$3, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$2, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    if( NIL != forts.non_fort_p( v_term ) )
    {
      final SubLObject mt_var2 = mt;
      _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
        final SubLObject tv_var2 = tv;
        final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var2 ) ? tv_var2 : sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var2 ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var2 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_search_truth_value_p( tv_var2 ) )
          {
            final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var2.eql( $kw31$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var2, $sym42$SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var2.eql( $kw34$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var2, $sym42$SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var2.eql( $kw36$WARN ) )
            {
              Errors.warn( $str32$_A_is_not_a__A, tv_var2, $sym42$SBHL_SEARCH_TRUTH_VALUE_P );
            }
            else
            {
              Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var2, $sym42$SBHL_SEARCH_TRUTH_VALUE_P );
            }
          }
          SubLObject csome_list_var3 = Hashtables.gethash_without_values( v_term, sbhl_link_methods.non_fort_isa_table(), UNPROVIDED );
          SubLObject isa_tuple = NIL;
          isa_tuple = csome_list_var3.first();
          while ( NIL != csome_list_var3)
          {
            SubLObject current;
            final SubLObject datum = current = isa_tuple;
            SubLObject v_isa5 = NIL;
            SubLObject table_mt = NIL;
            SubLObject table_tv = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
            v_isa5 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
            table_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
            table_tv = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( NIL != mt_relevance_macros.relevant_mtP( table_mt ) && NIL != sbhl_search_vars.relevant_sbhl_tvP( table_tv ) )
              {
                Functions.funcall( function, v_isa5 );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
            }
            csome_list_var3 = csome_list_var3.rest();
            isa_tuple = csome_list_var3.first();
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$7, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$11, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) )
    {
      module = sbhl_module_vars.get_sbhl_module( $const44$genls );
      final SubLObject mt_var3 = mt;
      final SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_7 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_8 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var3 ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var3 ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var3 ), thread );
        final SubLObject tv_var3 = tv;
        final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var3 ) ? tv_var3 : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var3 ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var3 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var3 ) )
          {
            final SubLObject pcase_var3 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var3.eql( $kw31$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var3, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var3.eql( $kw34$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var3, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var3.eql( $kw36$WARN ) )
            {
              Errors.warn( $str32$_A_is_not_a__A, tv_var3, $sym33$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var3, $sym33$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_module_vars.$sbhl_module$.bind( module, thread );
            SubLObject cdolist_list_var = Hashtables.gethash( v_term, sbhl_link_methods.$isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED );
            SubLObject isa_tuple2 = NIL;
            isa_tuple2 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = isa_tuple2;
              SubLObject naut = NIL;
              SubLObject isa_mt = NIL;
              SubLObject isa_tv = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list45 );
              naut = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list45 );
              isa_mt = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list45 );
              isa_tv = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( NIL != mt_relevance_macros.relevant_mtP( isa_mt ) && NIL != sbhl_search_vars.relevant_sbhl_tvP( isa_tv ) )
                {
                  final SubLObject v_isa6 = naut;
                  Functions.funcall( function, v_isa6 );
                  SubLObject cdolist_list_var_$30;
                  final SubLObject new_list2 = cdolist_list_var_$30 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                      .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), module ) )
                      : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), module ) );
                  SubLObject generating_fn2 = NIL;
                  generating_fn2 = cdolist_list_var_$30.first();
                  while ( NIL != cdolist_list_var_$30)
                  {
                    final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                    try
                    {
                      sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                      final SubLObject v_isa7 = Functions.funcall( generating_fn2, naut );
                      Functions.funcall( function, v_isa7 );
                    }
                    finally
                    {
                      sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$14, thread );
                    }
                    cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                    generating_fn2 = cdolist_list_var_$30.first();
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list45 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              isa_tuple2 = cdolist_list_var.first();
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$13, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$8, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$12, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_8, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_7, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_6, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7489L)
  public static SubLObject map_min_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    map_isa( function, v_term, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7627L)
  public static SubLObject map_instances(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( function, $sym46$FUNCTION_SPEC_P );
    enforceType( v_term, $sym12$EL_FORT_P );
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const0$isa );
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( module, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$32 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$34 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject tv_var = tv;
        final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw31$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw34$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw36$WARN ) )
            {
              Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$35 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const11$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw38$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$36 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw38$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$36 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$45 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( module );
                    SubLObject rest;
                    SubLObject module_var;
                    SubLObject _prev_bind_0_$38;
                    SubLObject _prev_bind_1_$37;
                    SubLObject node;
                    SubLObject d_link;
                    SubLObject mt_links;
                    SubLObject iteration_state;
                    SubLObject mt_$49;
                    SubLObject tv_links;
                    SubLObject _prev_bind_0_$39;
                    SubLObject iteration_state_$51;
                    SubLObject tv_$52;
                    SubLObject link_nodes;
                    SubLObject _prev_bind_0_$40;
                    SubLObject sol;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject instance;
                    SubLObject csome_list_var;
                    SubLObject instance2;
                    SubLObject new_list;
                    SubLObject rest_$54;
                    SubLObject generating_fn;
                    SubLObject _prev_bind_0_$41;
                    SubLObject sol2;
                    SubLObject link_nodes2;
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject instance3;
                    SubLObject csome_list_var2;
                    SubLObject instance4;
                    for( rest = NIL, rest = accessible_modules; NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != rest; rest = rest.rest() )
                    {
                      module_var = rest.first();
                      _prev_bind_0_$38 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      _prev_bind_1_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        node = function_terms.naut_to_nart( v_term );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread )
                                  && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                mt_$49 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$49 ) )
                                {
                                  _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$49, thread );
                                    for( iteration_state_$51 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(
                                        thread ) && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state_$51 ); iteration_state_$51 = dictionary_contents.do_dictionary_contents_next(
                                            iteration_state_$51 ) )
                                    {
                                      thread.resetMultipleValues();
                                      tv_$52 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$51 );
                                      link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$52 ) )
                                      {
                                        _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv_$52, thread );
                                          sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            set_contents_var = set.do_set_internal( sol );
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL == set_contents.do_set_contents_doneP( basis_object,
                                                    state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              instance = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, instance ) )
                                              {
                                                Functions.funcall( function, instance );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            if( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) )
                                            {
                                              csome_list_var = sol;
                                              instance2 = NIL;
                                              instance2 = csome_list_var.first();
                                              while ( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != csome_list_var)
                                              {
                                                Functions.funcall( function, instance2 );
                                                csome_list_var = csome_list_var.rest();
                                                instance2 = csome_list_var.first();
                                              }
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$40, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$51 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$39, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                              .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          for( rest_$54 = NIL, rest_$54 = new_list; NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != rest_$54; rest_$54 = rest_$54.rest() )
                          {
                            generating_fn = rest_$54.first();
                            _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                set_contents_var2 = set.do_set_internal( sol2 );
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents
                                        .do_set_contents_update_state( state2 ) )
                                {
                                  instance3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, instance3 ) )
                                  {
                                    Functions.funcall( function, instance3 );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                if( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) )
                                {
                                  csome_list_var2 = sol2;
                                  instance4 = NIL;
                                  instance4 = csome_list_var2.first();
                                  while ( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != csome_list_var2)
                                  {
                                    Functions.funcall( function, instance4 );
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance4 = csome_list_var2.first();
                                  }
                                }
                              }
                              else
                              {
                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$41, thread );
                            }
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$37, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$38, thread );
                      }
                    }
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$46, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$45, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$36, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$36, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$37, thread );
                }
                if( source == $kw41$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$36, thread );
              }
              if( source == $kw41$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$35, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$35, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$35, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$34, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$34, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$33, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$34, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$33, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$32, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8185L)
  public static SubLObject min_isas_of_type(final SubLObject v_term, final SubLObject type, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject all_isas = all_isa( v_term, mt, tv );
    final SubLObject isas_of_type = all_instances_among( type, all_isas, mt, tv );
    return genls.min_cols( isas_of_type, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8505L)
  public static SubLObject all_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$HL_TERM_P );
    SubLObject result = sbhl_search_methods.sbhl_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv );
    if( NIL != forts.non_fort_p( v_term ) )
    {
      result = list_utilities.fast_delete_duplicates( ConsesLow.nconc( sbhl_link_methods.non_fort_all_isa( v_term, mt, tv ), result ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) )
    {
      result = list_utilities.fast_delete_duplicates( ConsesLow.nconc( genls.union_all_genls( sbhl_link_methods.isas_from_naut_arg2( v_term, mt, tv ), mt, tv ), result ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
    }
    if( NIL == $sbhl_may_return_naut_collections_as_fortsP$.getDynamicValue( thread ) )
    {
      result = list_utilities.remove_if_not( $sym2$FORT_P, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9280L)
  public static SubLObject all_isa_in_any_mt(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_isa = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      all_isa = all_isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_isa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9480L)
  public static SubLObject all_isa_in_mt(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_isa = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      all_isa = all_isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_isa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9696L)
  public static SubLObject all_isa_in_mts(final SubLObject v_term, SubLObject mts)
  {
    if( mts == UNPROVIDED )
    {
      mts = genl_mts.all_base_mts( mt_relevance_macros.$mt$.getDynamicValue() );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_isa = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym56$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      all_isa = all_isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_isa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9955L)
  public static SubLObject nat_all_isa(final SubLObject nat_formula, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return all_isa( nat_formula, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10103L)
  public static SubLObject all_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym12$EL_FORT_P );
    return sbhl_search_methods.sbhl_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10387L)
  public static SubLObject all_instances_in_all_mts(final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( collection, $sym12$EL_FORT_P );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      result = all_instances( collection, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10687L)
  public static SubLObject all_fort_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return list_utilities.delete_if_not( $sym2$FORT_P, all_instances( col, mt, tv ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10957L)
  public static SubLObject all_non_prototypical_fort_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Sequences.delete_if( $sym66$HL_PROTOTYPICAL_INSTANCE_, all_fort_instances( col, mt, tv ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11153L)
  public static SubLObject all_fort_instances_in_all_mts(final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      result = all_fort_instances( collection, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11652L)
  public static SubLObject all_isas_wrt(final SubLObject v_term, final SubLObject v_isa, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym12$EL_FORT_P );
    enforceType( v_isa, $sym12$EL_FORT_P );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $all_isas_wrt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $all_isas_wrt_isa$.currentBinding( thread );
    try
    {
      $all_isas_wrt$.bind( NIL, thread );
      $all_isas_wrt_isa$.bind( v_isa, thread );
      map_all_isa( $sym69$GATHER_ISA_WRT_ISA, v_term, mt, tv );
      result = $all_isas_wrt$.getDynamicValue( thread );
    }
    finally
    {
      $all_isas_wrt_isa$.rebind( _prev_bind_2, thread );
      $all_isas_wrt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12227L)
  public static SubLObject gather_isa_wrt_isa(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != isaP( v_term, $all_isas_wrt_isa$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      $all_isas_wrt$.setDynamicValue( ConsesLow.cons( v_term, $all_isas_wrt$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12358L)
  public static SubLObject union_all_isa(final SubLObject terms, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( terms, $sym74$LISTP );
    if( NIL == terms )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( terms ) )
    {
      return all_isa( terms.first(), mt, tv );
    }
    SubLObject result = sbhl_search_methods.sbhl_union_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), terms, mt, tv );
    if( NIL != list_utilities.any_in_list( $sym75$ISA_STORED_NAUT_ARG2_P, terms, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) )
        {
          result = ConsesLow.nconc( genls.all_genls( sbhl_link_methods.isas_from_naut_arg2( v_term, mt, tv ), mt, tv ), result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      result = list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == $sbhl_may_return_naut_collections_as_fortsP$.getDynamicValue( thread ) )
      {
        result = list_utilities.remove_if_not( $sym2$FORT_P, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13231L)
  public static SubLObject union_all_instances(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym74$LISTP );
    if( NIL == cols )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( cols ) )
    {
      return all_instances( cols.first(), mt, tv );
    }
    return sbhl_search_methods.sbhl_union_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), cols, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13622L)
  public static SubLObject all_isa_among(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collections, $sym74$LISTP );
    if( NIL == collections )
    {
      return NIL;
    }
    if( NIL == list_utilities.singletonP( collections ) )
    {
      return sbhl_search_methods.sbhl_all_forward_true_nodes_among( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, collections, mt, tv );
    }
    if( NIL != isaP( v_term, collections.first(), mt, tv ) )
    {
      return collections;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14306L)
  public static SubLObject isa_allP(final SubLObject v_term, final SubLObject collections, final SubLObject mt)
  {
    return list_utilities.same_length_p( all_isa_among( v_term, collections, mt, UNPROVIDED ), collections );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14485L)
  public static SubLObject min_isa_among(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return genls.min_cols( all_isa_among( v_term, collections, mt, tv ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14613L)
  public static SubLObject all_instances_among(final SubLObject col, final SubLObject terms, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym1$HL_TERM_P );
    enforceType( terms, $sym74$LISTP );
    if( NIL == terms )
    {
      return NIL;
    }
    if( NIL == list_utilities.singletonP( terms ) )
    {
      return sbhl_search_methods.sbhl_all_backward_true_nodes_among( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, terms, mt, tv );
    }
    if( NIL != isaP( terms.first(), col, mt, tv ) )
    {
      return terms;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15069L)
  public static SubLObject all_instances_among_fast(final SubLObject col, final SubLObject terms, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != sbhl_cache.valid_cached_fort_type_p( col ) )
    {
      SubLObject filtered_terms = NIL;
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != fort_types_interface.fort_has_typeP( v_term, col, mt ) )
        {
          filtered_terms = ConsesLow.cons( v_term, filtered_terms );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      return Sequences.nreverse( filtered_terms );
    }
    final SubLObject instance_count = ( NIL != forts.fort_p( col ) ) ? cardinality_estimates.instance_cardinality( col ) : $int92$100000;
    if( instance_count.numLE( $int93$50 ) )
    {
      return all_instances_among( col, terms, mt, UNPROVIDED );
    }
    final SubLObject term_count = Sequences.length( terms );
    final SubLObject threshold = $int94$25;
    if( number_utilities.percent( term_count, instance_count, TWO_INTEGER ).numL( threshold ) )
    {
      SubLObject filtered_terms2 = NIL;
      SubLObject cdolist_list_var2 = terms;
      SubLObject v_term2 = NIL;
      v_term2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != isaP( v_term2, col, mt, UNPROVIDED ) )
        {
          filtered_terms2 = ConsesLow.cons( v_term2, filtered_terms2 );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        v_term2 = cdolist_list_var2.first();
      }
      return Sequences.nreverse( filtered_terms2 );
    }
    return all_instances_among( col, terms, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16236L)
  public static SubLObject all_isa_if(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_forward_true_nodes_if( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, function, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16598L)
  public static SubLObject all_instances_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_backward_true_nodes_if( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, function, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16903L)
  public static SubLObject all_isa_if_with_pruning(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_forward_true_nodes_if_with_pruning( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, function, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17281L)
  public static SubLObject all_not_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17566L)
  public static SubLObject all_not_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym12$EL_FORT_P );
    return sbhl_search_methods.sbhl_all_backward_false_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17980L)
  public static SubLObject not_isa_among(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collections, $sym74$LISTP );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = collections;
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != not_isaP( v_term, col, mt, tv ) )
      {
        result = ConsesLow.cons( col, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18366L)
  public static SubLObject not_instances_among()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19515L)
  public static SubLObject map_all_isa(final SubLObject fn, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( fn, $sym46$FUNCTION_SPEC_P );
    enforceType( v_term, $sym1$HL_TERM_P );
    sbhl_search_methods.sbhl_map_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, fn, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19887L)
  public static SubLObject map_all_instances(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( fn, $sym46$FUNCTION_SPEC_P );
    enforceType( col, $sym12$EL_FORT_P );
    sbhl_search_methods.sbhl_map_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, fn, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20168L)
  public static SubLObject any_all_isa(final SubLObject fn, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, fn, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20536L)
  public static SubLObject any_wrt_all_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( function, $sym46$FUNCTION_SPEC_P );
    enforceType( v_term, $sym1$HL_TERM_P );
    return any_all_isa( function, v_term, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20873L)
  public static SubLObject any_all_forward_true_nodes_isa(final SubLObject pred, final SubLObject start_node, final SubLObject v_isa, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_target_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject _prev_bind_0_$56 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_target_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$57 = sbhl_marking_vars.$sbhl_mapping_marking_space$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_isaP_goal$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_mapping_marking_space$.bind( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ), thread );
              sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.bind( sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue( thread ), thread );
              sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.bind( T, thread );
              sbhl_search_vars.$sbhl_isaP_goal$.bind( v_isa, thread );
              result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( pred ), start_node, $sym112$ISA__GOAL, mt, tv, UNPROVIDED );
            }
            finally
            {
              sbhl_search_vars.$sbhl_isaP_goal$.rebind( _prev_bind_4, thread );
              sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.rebind( _prev_bind_3, thread );
              sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.rebind( _prev_bind_2, thread );
              sbhl_marking_vars.$sbhl_mapping_marking_space$.rebind( _prev_bind_0_$57, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_target_gather_space$.rebind( _prev_bind_0_$56, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$59, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_target_space$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21347L)
  public static SubLObject sample_leaf_instances(final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv)
  {
    if( samples == UNPROVIDED )
    {
      samples = ONE_INTEGER;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_sample_leaf_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), col, samples, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21657L)
  public static SubLObject sample_different_leaf_instances(final SubLObject dif_node, final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv)
  {
    if( samples == UNPROVIDED )
    {
      samples = ONE_INTEGER;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_sample_different_leaf_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), dif_node, col, samples, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22061L)
  public static SubLObject sbhl_record_all_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    sbhl_marking_methods.sbhl_record_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt, tv );
    if( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) )
    {
      SubLObject cdolist_list_var = sbhl_link_methods.isas_from_naut_arg2( v_term, mt, tv );
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sbhl_marking_methods.sbhl_record_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const44$genls ), v_isa, mt, tv );
        cdolist_list_var = cdolist_list_var.rest();
        v_isa = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22530L)
  public static SubLObject count_all_instances(final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( collection, $sym12$EL_FORT_P );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$60 = collection;
        final SubLObject deck_type = $kw115$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$61 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$62 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$63 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              final SubLObject tv_var = tv;
              final SubLObject _prev_bind_0_$63 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw31$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw34$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw36$WARN ) )
                  {
                    Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$68 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) ),
                      thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const0$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$66 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$69 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$60, UNPROVIDED );
                      while ( NIL != node_var_$60)
                      {
                        final SubLObject tt_node_var = node_var_$60;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$66 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
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
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$74 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$74 ) )
                                    {
                                      final SubLObject _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$74, thread );
                                        SubLObject iteration_state_$76;
                                        for( iteration_state_$76 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$76 ); iteration_state_$76 = dictionary_contents.do_dictionary_contents_next( iteration_state_$76 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv_$77 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$76 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$77 ) )
                                          {
                                            final SubLObject _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$77, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject ins;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject ins2 = NIL;
                                                ins2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  ins2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$68, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$76 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$67, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
                                  SubLObject mt_$75 = NIL;
                                  SubLObject tv_$78 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  mt_$75 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  tv_$78 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$75 ) )
                                    {
                                      final SubLObject _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$75, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$78 ) )
                                        {
                                          final SubLObject _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv_$78, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject ins;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                ins = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  count = Numbers.add( count, ONE_INTEGER );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$83 = sol;
                                              SubLObject ins2 = NIL;
                                              ins2 = csome_list_var_$83.first();
                                              while ( NIL != csome_list_var_$83)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  count = Numbers.add( count, ONE_INTEGER );
                                                }
                                                csome_list_var_$83 = csome_list_var_$83.rest();
                                                ins2 = csome_list_var_$83.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$70, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$69, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$84;
                              final SubLObject new_list = cdolist_list_var_$84 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$84.first();
                              while ( NIL != cdolist_list_var_$84)
                              {
                                final SubLObject _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    SubLObject ins3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        count = Numbers.add( count, ONE_INTEGER );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject ins4 = NIL;
                                    ins4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        count = Numbers.add( count, ONE_INTEGER );
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      ins4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$71, thread );
                                }
                                cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                                generating_fn = cdolist_list_var_$84.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$67, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$66, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const0$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$72 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$60 );
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
                                    final SubLObject mt_$76 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$76 ) )
                                    {
                                      final SubLObject _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$76, thread );
                                        SubLObject iteration_state_$77;
                                        for( iteration_state_$77 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$77 ); iteration_state_$77 = dictionary_contents.do_dictionary_contents_next( iteration_state_$77 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv_$79 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$77 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$79 ) )
                                          {
                                            final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$79, thread );
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
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$74, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$77 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$73, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$85;
                              final SubLObject new_list2 = cdolist_list_var_$85 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$85.first();
                              while ( NIL != cdolist_list_var_$85)
                              {
                                final SubLObject _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$75, thread );
                                }
                                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                                generating_fn2 = cdolist_list_var_$85.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$68, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$72, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$60 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$69, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$66, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$65, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$68, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$65, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$64, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$64, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$63, thread );
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$63, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$62, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$76, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$61, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$77, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22909L)
  public static SubLObject count_all_instances_if(final SubLObject collection, final SubLObject pred, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$97 = collection;
        final SubLObject deck_type = $kw115$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$98 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$99 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$100 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              final SubLObject tv_var = tv;
              final SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$101 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw31$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw34$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw36$WARN ) )
                  {
                    Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$105 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) ),
                      thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const0$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$102 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$103 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$97, UNPROVIDED );
                      while ( NIL != node_var_$97)
                      {
                        final SubLObject tt_node_var = node_var_$97;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$103 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
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
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$111 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$111 ) )
                                    {
                                      final SubLObject _prev_bind_0_$104 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$111, thread );
                                        SubLObject iteration_state_$113;
                                        for( iteration_state_$113 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$113 ); iteration_state_$113 = dictionary_contents.do_dictionary_contents_next( iteration_state_$113 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv_$114 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$113 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$114 ) )
                                          {
                                            final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$114, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject ins;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != Functions.funcall( pred, ins ) )
                                                    {
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject ins2 = NIL;
                                                ins2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != Functions.funcall( pred, ins2 ) )
                                                    {
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  ins2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$105, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$113 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$104, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
                                  SubLObject mt_$112 = NIL;
                                  SubLObject tv_$115 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  mt_$112 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  tv_$115 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$112 ) )
                                    {
                                      final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$112, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$115 ) )
                                        {
                                          final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv_$115, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject ins;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                ins = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != Functions.funcall( pred, ins ) )
                                                  {
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$120 = sol;
                                              SubLObject ins2 = NIL;
                                              ins2 = csome_list_var_$120.first();
                                              while ( NIL != csome_list_var_$120)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != Functions.funcall( pred, ins2 ) )
                                                  {
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                }
                                                csome_list_var_$120 = csome_list_var_$120.rest();
                                                ins2 = csome_list_var_$120.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$107, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$106, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$121;
                              final SubLObject new_list = cdolist_list_var_$121 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$121.first();
                              while ( NIL != cdolist_list_var_$121)
                              {
                                final SubLObject _prev_bind_0_$108 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    SubLObject ins3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != Functions.funcall( pred, ins3 ) )
                                        {
                                          count = Numbers.add( count, ONE_INTEGER );
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject ins4 = NIL;
                                    ins4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != Functions.funcall( pred, ins4 ) )
                                        {
                                          count = Numbers.add( count, ONE_INTEGER );
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      ins4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$108, thread );
                                }
                                cdolist_list_var_$121 = cdolist_list_var_$121.rest();
                                generating_fn = cdolist_list_var_$121.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$104, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$103, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const0$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$109 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$105 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$97 );
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
                                    final SubLObject mt_$113 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$113 ) )
                                    {
                                      final SubLObject _prev_bind_0_$110 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$113, thread );
                                        SubLObject iteration_state_$114;
                                        for( iteration_state_$114 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$114 ); iteration_state_$114 = dictionary_contents.do_dictionary_contents_next( iteration_state_$114 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv_$116 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$114 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$116 ) )
                                          {
                                            final SubLObject _prev_bind_0_$111 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$116, thread );
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
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$111, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$114 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$110, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$122;
                              final SubLObject new_list2 = cdolist_list_var_$122 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$122.first();
                              while ( NIL != cdolist_list_var_$122)
                              {
                                final SubLObject _prev_bind_0_$112 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$112, thread );
                                }
                                cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                                generating_fn2 = cdolist_list_var_$122.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$105, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$109, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$97 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$106, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$103, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$102, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$105, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$102, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$101, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$101, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$100, thread );
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$100, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$99, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$113, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$98, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$114, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23208L)
  public static SubLObject count_all_instances_E(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GP = NIL;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        if( NIL == GP )
        {
          SubLObject node_var_$134 = collection;
          final SubLObject deck_type = $kw115$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$135 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject mt_var = mt;
              final SubLObject _prev_bind_0_$136 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$137 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$137 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$138 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw31$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw34$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw36$WARN ) )
                    {
                      Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$138 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$139 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$142 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const0$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const0$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$139 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$140 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$143 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$134, UNPROVIDED );
                        while ( NIL != node_var_$134 && NIL == GP)
                        {
                          final SubLObject tt_node_var = node_var_$134;
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$isa ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$140;
                          SubLObject _prev_bind_1_$141;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt_$148;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$141;
                          SubLObject iteration_state_$150;
                          SubLObject tv_$151;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$142;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject ins;
                          SubLObject csome_list_var;
                          SubLObject ins2;
                          SubLObject csome_list_var2;
                          SubLObject instance_tuple;
                          SubLObject current;
                          SubLObject datum;
                          SubLObject link_node;
                          SubLObject mt_$149;
                          SubLObject tv_$152;
                          SubLObject _prev_bind_0_$143;
                          SubLObject _prev_bind_0_$144;
                          SubLObject link_nodes2;
                          SubLObject csome_list_var_$157;
                          SubLObject new_list;
                          SubLObject rest_$158;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$145;
                          SubLObject sol2;
                          SubLObject link_nodes3;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject ins3;
                          SubLObject csome_list_var3;
                          SubLObject ins4;
                          for( rest = NIL, rest = accessible_modules; NIL == GP && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$140 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$141 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$148 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$148 ) )
                                      {
                                        _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$148, thread );
                                          for( iteration_state_$150 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$150 ); iteration_state_$150 = dictionary_contents.do_dictionary_contents_next( iteration_state_$150 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$151 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$150 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$151 ) )
                                            {
                                              _prev_bind_0_$142 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$151, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    ins = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numG( num ) )
                                                      {
                                                        GP = T;
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == GP )
                                                  {
                                                    csome_list_var = sol;
                                                    ins2 = NIL;
                                                    ins2 = csome_list_var.first();
                                                    while ( NIL == GP && NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        count = Numbers.add( count, ONE_INTEGER );
                                                        if( count.numG( num ) )
                                                        {
                                                          GP = T;
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      ins2 = csome_list_var.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$142, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$150 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$141, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == GP )
                                {
                                  csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL == GP && NIL != csome_list_var2)
                                  {
                                    datum = ( current = instance_tuple );
                                    link_node = NIL;
                                    mt_$149 = NIL;
                                    tv_$152 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    mt_$149 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    tv_$152 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$149 ) )
                                      {
                                        _prev_bind_0_$143 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$149, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$152 ) )
                                          {
                                            _prev_bind_0_$144 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$152, thread );
                                              link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                    if( count.numG( num ) )
                                                    {
                                                      GP = T;
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == GP )
                                                {
                                                  csome_list_var_$157 = sol;
                                                  ins2 = NIL;
                                                  ins2 = csome_list_var_$157.first();
                                                  while ( NIL == GP && NIL != csome_list_var_$157)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numG( num ) )
                                                      {
                                                        GP = T;
                                                      }
                                                    }
                                                    csome_list_var_$157 = csome_list_var_$157.rest();
                                                    ins2 = csome_list_var_$157.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$144, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$143, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities
                                    .get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$158 = NIL, rest_$158 = new_list; NIL == GP && NIL != rest_$158; rest_$158 = rest_$158.rest() )
                                {
                                  generating_fn = rest_$158.first();
                                  _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                            .getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          count = Numbers.add( count, ONE_INTEGER );
                                          if( count.numG( num ) )
                                          {
                                            GP = T;
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == GP )
                                      {
                                        csome_list_var3 = sol2;
                                        ins4 = NIL;
                                        ins4 = csome_list_var3.first();
                                        while ( NIL == GP && NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            count = Numbers.add( count, ONE_INTEGER );
                                            if( count.numG( num ) )
                                            {
                                              GP = T;
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          ins4 = csome_list_var3.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$145, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$141, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$140, thread );
                            }
                          }
                          final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) );
                          SubLObject rest2;
                          SubLObject module_var2;
                          SubLObject _prev_bind_0_$146;
                          SubLObject _prev_bind_1_$142;
                          SubLObject node2;
                          SubLObject d_link2;
                          SubLObject mt_links2;
                          SubLObject iteration_state2;
                          SubLObject mt_$150;
                          SubLObject tv_links2;
                          SubLObject _prev_bind_0_$147;
                          SubLObject iteration_state_$151;
                          SubLObject tv_$153;
                          SubLObject link_nodes4;
                          SubLObject _prev_bind_0_$148;
                          SubLObject sol3;
                          SubLObject set_contents_var3;
                          SubLObject basis_object3;
                          SubLObject state3;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var4;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list2;
                          SubLObject rest_$159;
                          SubLObject generating_fn2;
                          SubLObject _prev_bind_0_$149;
                          SubLObject sol4;
                          SubLObject link_nodes5;
                          SubLObject set_contents_var4;
                          SubLObject basis_object4;
                          SubLObject state4;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var5;
                          SubLObject node_vars_link_node4;
                          for( rest2 = NIL, rest2 = accessible_modules2; NIL == GP && NIL != rest2; rest2 = rest2.rest() )
                          {
                            module_var2 = rest2.first();
                            _prev_bind_0_$146 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$142 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node2 = function_terms.naut_to_nart( node_var_$134 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == GP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$150 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$150 ) )
                                      {
                                        _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$150, thread );
                                          for( iteration_state_$151 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == GP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$151 ); iteration_state_$151 = dictionary_contents.do_dictionary_contents_next( iteration_state_$151 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$153 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$151 );
                                            link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$153 ) )
                                            {
                                              _prev_bind_0_$148 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$153, thread );
                                                sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  set_contents_var3 = set.do_set_internal( sol3 );
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
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
                                                  if( NIL == GP )
                                                  {
                                                    csome_list_var4 = sol3;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL == GP && NIL != csome_list_var4)
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
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$148, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$151 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$147, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$159 = NIL, rest_$159 = new_list2; NIL == GP && NIL != rest_$159; rest_$159 = rest_$159.rest() )
                                {
                                  generating_fn2 = rest_$159.first();
                                  _prev_bind_0_$149 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    link_nodes5 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      set_contents_var4 = set.do_set_internal( sol4 );
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
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
                                      if( NIL == GP )
                                      {
                                        csome_list_var5 = sol4;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL == GP && NIL != csome_list_var5)
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
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$149, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$142, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$146, thread );
                            }
                          }
                          node_var_$134 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$143, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$140, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$139, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$142, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$139, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$138, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$138, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$137, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$137, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$136, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$150, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$135, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$151 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$151, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return Numbers.numE( count, num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23546L)
  public static SubLObject count_all_instances_G(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GP = NIL;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        if( NIL == GP )
        {
          SubLObject node_var_$171 = collection;
          final SubLObject deck_type = $kw115$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$172 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject mt_var = mt;
              final SubLObject _prev_bind_0_$173 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$174 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$174 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$175 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw31$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw34$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw36$WARN ) )
                    {
                      Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$175 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$176 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$179 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const0$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const0$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$176 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$177 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$180 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$171, UNPROVIDED );
                        while ( NIL != node_var_$171 && NIL == GP)
                        {
                          final SubLObject tt_node_var = node_var_$171;
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$isa ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$177;
                          SubLObject _prev_bind_1_$178;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt_$185;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$178;
                          SubLObject iteration_state_$187;
                          SubLObject tv_$188;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$179;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject ins;
                          SubLObject csome_list_var;
                          SubLObject ins2;
                          SubLObject csome_list_var2;
                          SubLObject instance_tuple;
                          SubLObject current;
                          SubLObject datum;
                          SubLObject link_node;
                          SubLObject mt_$186;
                          SubLObject tv_$189;
                          SubLObject _prev_bind_0_$180;
                          SubLObject _prev_bind_0_$181;
                          SubLObject link_nodes2;
                          SubLObject csome_list_var_$194;
                          SubLObject new_list;
                          SubLObject rest_$195;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$182;
                          SubLObject sol2;
                          SubLObject link_nodes3;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject ins3;
                          SubLObject csome_list_var3;
                          SubLObject ins4;
                          for( rest = NIL, rest = accessible_modules; NIL == GP && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$177 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$178 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$185 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$185 ) )
                                      {
                                        _prev_bind_0_$178 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$185, thread );
                                          for( iteration_state_$187 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$187 ); iteration_state_$187 = dictionary_contents.do_dictionary_contents_next( iteration_state_$187 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$188 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$187 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$188 ) )
                                            {
                                              _prev_bind_0_$179 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$188, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    ins = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numG( num ) )
                                                      {
                                                        GP = T;
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == GP )
                                                  {
                                                    csome_list_var = sol;
                                                    ins2 = NIL;
                                                    ins2 = csome_list_var.first();
                                                    while ( NIL == GP && NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        count = Numbers.add( count, ONE_INTEGER );
                                                        if( count.numG( num ) )
                                                        {
                                                          GP = T;
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      ins2 = csome_list_var.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$179, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$187 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$178, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == GP )
                                {
                                  csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL == GP && NIL != csome_list_var2)
                                  {
                                    datum = ( current = instance_tuple );
                                    link_node = NIL;
                                    mt_$186 = NIL;
                                    tv_$189 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    mt_$186 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    tv_$189 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$186 ) )
                                      {
                                        _prev_bind_0_$180 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$186, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$189 ) )
                                          {
                                            _prev_bind_0_$181 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$189, thread );
                                              link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                    if( count.numG( num ) )
                                                    {
                                                      GP = T;
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == GP )
                                                {
                                                  csome_list_var_$194 = sol;
                                                  ins2 = NIL;
                                                  ins2 = csome_list_var_$194.first();
                                                  while ( NIL == GP && NIL != csome_list_var_$194)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numG( num ) )
                                                      {
                                                        GP = T;
                                                      }
                                                    }
                                                    csome_list_var_$194 = csome_list_var_$194.rest();
                                                    ins2 = csome_list_var_$194.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$181, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$180, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities
                                    .get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$195 = NIL, rest_$195 = new_list; NIL == GP && NIL != rest_$195; rest_$195 = rest_$195.rest() )
                                {
                                  generating_fn = rest_$195.first();
                                  _prev_bind_0_$182 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                            .getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          count = Numbers.add( count, ONE_INTEGER );
                                          if( count.numG( num ) )
                                          {
                                            GP = T;
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == GP )
                                      {
                                        csome_list_var3 = sol2;
                                        ins4 = NIL;
                                        ins4 = csome_list_var3.first();
                                        while ( NIL == GP && NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            count = Numbers.add( count, ONE_INTEGER );
                                            if( count.numG( num ) )
                                            {
                                              GP = T;
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          ins4 = csome_list_var3.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$182, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$178, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$177, thread );
                            }
                          }
                          final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) );
                          SubLObject rest2;
                          SubLObject module_var2;
                          SubLObject _prev_bind_0_$183;
                          SubLObject _prev_bind_1_$179;
                          SubLObject node2;
                          SubLObject d_link2;
                          SubLObject mt_links2;
                          SubLObject iteration_state2;
                          SubLObject mt_$187;
                          SubLObject tv_links2;
                          SubLObject _prev_bind_0_$184;
                          SubLObject iteration_state_$188;
                          SubLObject tv_$190;
                          SubLObject link_nodes4;
                          SubLObject _prev_bind_0_$185;
                          SubLObject sol3;
                          SubLObject set_contents_var3;
                          SubLObject basis_object3;
                          SubLObject state3;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var4;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list2;
                          SubLObject rest_$196;
                          SubLObject generating_fn2;
                          SubLObject _prev_bind_0_$186;
                          SubLObject sol4;
                          SubLObject link_nodes5;
                          SubLObject set_contents_var4;
                          SubLObject basis_object4;
                          SubLObject state4;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var5;
                          SubLObject node_vars_link_node4;
                          for( rest2 = NIL, rest2 = accessible_modules2; NIL == GP && NIL != rest2; rest2 = rest2.rest() )
                          {
                            module_var2 = rest2.first();
                            _prev_bind_0_$183 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$179 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node2 = function_terms.naut_to_nart( node_var_$171 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == GP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$187 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$187 ) )
                                      {
                                        _prev_bind_0_$184 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$187, thread );
                                          for( iteration_state_$188 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == GP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$188 ); iteration_state_$188 = dictionary_contents.do_dictionary_contents_next( iteration_state_$188 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$190 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$188 );
                                            link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$190 ) )
                                            {
                                              _prev_bind_0_$185 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$190, thread );
                                                sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  set_contents_var3 = set.do_set_internal( sol3 );
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
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
                                                  if( NIL == GP )
                                                  {
                                                    csome_list_var4 = sol3;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL == GP && NIL != csome_list_var4)
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
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$185, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$188 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$184, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$196 = NIL, rest_$196 = new_list2; NIL == GP && NIL != rest_$196; rest_$196 = rest_$196.rest() )
                                {
                                  generating_fn2 = rest_$196.first();
                                  _prev_bind_0_$186 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    link_nodes5 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      set_contents_var4 = set.do_set_internal( sol4 );
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
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
                                      if( NIL == GP )
                                      {
                                        csome_list_var5 = sol4;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL == GP && NIL != csome_list_var5)
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
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$186, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$179, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$183, thread );
                            }
                          }
                          node_var_$171 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$180, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$177, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$176, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$179, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$176, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$175, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$175, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$174, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$174, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$173, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$187 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$187, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$172, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$188 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$188, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return GP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23875L)
  public static SubLObject count_all_instances_GE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GEP = NIL;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        if( NIL == GEP )
        {
          SubLObject node_var_$208 = collection;
          final SubLObject deck_type = $kw115$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$209 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject mt_var = mt;
              final SubLObject _prev_bind_0_$210 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$211 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$211 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$212 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw31$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw34$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw36$WARN ) )
                    {
                      Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$212 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$213 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$216 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const0$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const0$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$213 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$214 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$217 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$208, UNPROVIDED );
                        while ( NIL != node_var_$208 && NIL == GEP)
                        {
                          final SubLObject tt_node_var = node_var_$208;
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$isa ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$214;
                          SubLObject _prev_bind_1_$215;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt_$222;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$215;
                          SubLObject iteration_state_$224;
                          SubLObject tv_$225;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$216;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject ins;
                          SubLObject csome_list_var;
                          SubLObject ins2;
                          SubLObject csome_list_var2;
                          SubLObject instance_tuple;
                          SubLObject current;
                          SubLObject datum;
                          SubLObject link_node;
                          SubLObject mt_$223;
                          SubLObject tv_$226;
                          SubLObject _prev_bind_0_$217;
                          SubLObject _prev_bind_0_$218;
                          SubLObject link_nodes2;
                          SubLObject csome_list_var_$231;
                          SubLObject new_list;
                          SubLObject rest_$232;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$219;
                          SubLObject sol2;
                          SubLObject link_nodes3;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject ins3;
                          SubLObject csome_list_var3;
                          SubLObject ins4;
                          for( rest = NIL, rest = accessible_modules; NIL == GEP && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$214 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$215 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GEP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$222 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$222 ) )
                                      {
                                        _prev_bind_0_$215 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$222, thread );
                                          for( iteration_state_$224 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GEP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$224 ); iteration_state_$224 = dictionary_contents.do_dictionary_contents_next( iteration_state_$224 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$225 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$224 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$225 ) )
                                            {
                                              _prev_bind_0_$216 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$225, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    ins = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numGE( num ) )
                                                      {
                                                        GEP = T;
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == GEP )
                                                  {
                                                    csome_list_var = sol;
                                                    ins2 = NIL;
                                                    ins2 = csome_list_var.first();
                                                    while ( NIL == GEP && NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        count = Numbers.add( count, ONE_INTEGER );
                                                        if( count.numGE( num ) )
                                                        {
                                                          GEP = T;
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      ins2 = csome_list_var.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$216, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$224 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$215, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == GEP )
                                {
                                  csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL == GEP && NIL != csome_list_var2)
                                  {
                                    datum = ( current = instance_tuple );
                                    link_node = NIL;
                                    mt_$223 = NIL;
                                    tv_$226 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    mt_$223 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    tv_$226 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$223 ) )
                                      {
                                        _prev_bind_0_$217 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$223, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$226 ) )
                                          {
                                            _prev_bind_0_$218 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$226, thread );
                                              link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                    if( count.numGE( num ) )
                                                    {
                                                      GEP = T;
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == GEP )
                                                {
                                                  csome_list_var_$231 = sol;
                                                  ins2 = NIL;
                                                  ins2 = csome_list_var_$231.first();
                                                  while ( NIL == GEP && NIL != csome_list_var_$231)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numGE( num ) )
                                                      {
                                                        GEP = T;
                                                      }
                                                    }
                                                    csome_list_var_$231 = csome_list_var_$231.rest();
                                                    ins2 = csome_list_var_$231.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$218, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$217, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities
                                    .get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const0$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$232 = NIL, rest_$232 = new_list; NIL == GEP && NIL != rest_$232; rest_$232 = rest_$232.rest() )
                                {
                                  generating_fn = rest_$232.first();
                                  _prev_bind_0_$219 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                            .getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          count = Numbers.add( count, ONE_INTEGER );
                                          if( count.numGE( num ) )
                                          {
                                            GEP = T;
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == GEP )
                                      {
                                        csome_list_var3 = sol2;
                                        ins4 = NIL;
                                        ins4 = csome_list_var3.first();
                                        while ( NIL == GEP && NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            count = Numbers.add( count, ONE_INTEGER );
                                            if( count.numGE( num ) )
                                            {
                                              GEP = T;
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          ins4 = csome_list_var3.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$219, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$215, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$214, thread );
                            }
                          }
                          final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const0$isa ) ) );
                          SubLObject rest2;
                          SubLObject module_var2;
                          SubLObject _prev_bind_0_$220;
                          SubLObject _prev_bind_1_$216;
                          SubLObject node2;
                          SubLObject d_link2;
                          SubLObject mt_links2;
                          SubLObject iteration_state2;
                          SubLObject mt_$224;
                          SubLObject tv_links2;
                          SubLObject _prev_bind_0_$221;
                          SubLObject iteration_state_$225;
                          SubLObject tv_$227;
                          SubLObject link_nodes4;
                          SubLObject _prev_bind_0_$222;
                          SubLObject sol3;
                          SubLObject set_contents_var3;
                          SubLObject basis_object3;
                          SubLObject state3;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var4;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list2;
                          SubLObject rest_$233;
                          SubLObject generating_fn2;
                          SubLObject _prev_bind_0_$223;
                          SubLObject sol4;
                          SubLObject link_nodes5;
                          SubLObject set_contents_var4;
                          SubLObject basis_object4;
                          SubLObject state4;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var5;
                          SubLObject node_vars_link_node4;
                          for( rest2 = NIL, rest2 = accessible_modules2; NIL == GEP && NIL != rest2; rest2 = rest2.rest() )
                          {
                            module_var2 = rest2.first();
                            _prev_bind_0_$220 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$216 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node2 = function_terms.naut_to_nart( node_var_$208 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == GEP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$224 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$224 ) )
                                      {
                                        _prev_bind_0_$221 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$224, thread );
                                          for( iteration_state_$225 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == GEP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$225 ); iteration_state_$225 = dictionary_contents.do_dictionary_contents_next( iteration_state_$225 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$227 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$225 );
                                            link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$227 ) )
                                            {
                                              _prev_bind_0_$222 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$227, thread );
                                                sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  set_contents_var3 = set.do_set_internal( sol3 );
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
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
                                                  if( NIL == GEP )
                                                  {
                                                    csome_list_var4 = sol3;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL == GEP && NIL != csome_list_var4)
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
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$222, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$225 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$221, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$233 = NIL, rest_$233 = new_list2; NIL == GEP && NIL != rest_$233; rest_$233 = rest_$233.rest() )
                                {
                                  generating_fn2 = rest_$233.first();
                                  _prev_bind_0_$223 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    link_nodes5 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      set_contents_var4 = set.do_set_internal( sol4 );
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
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
                                      if( NIL == GEP )
                                      {
                                        csome_list_var5 = sol4;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL == GEP && NIL != csome_list_var5)
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
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$223, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$216, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$220, thread );
                            }
                          }
                          node_var_$208 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$217, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$214, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$213, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$216, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$213, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$212, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$212, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$211, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$211, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$210, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$224 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$224, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$209, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$225 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$225, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return GEP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24221L)
  public static SubLObject count_all_instances_L(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Numbers.numL( count_all_instances( collection, mt, tv ), num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24432L)
  public static SubLObject count_all_instances_LE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Numbers.numLE( count_all_instances( collection, mt, tv ), num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24656L)
  public static SubLObject count_all_quoted_instances(final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( collection, $sym12$EL_FORT_P );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$245 = collection;
        final SubLObject deck_type = $kw115$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$246 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$247 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$248 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              final SubLObject tv_var = tv;
              final SubLObject _prev_bind_0_$248 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$249 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw31$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw34$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw36$WARN ) )
                  {
                    Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$249 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$250 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$253 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const122$quotedIsa ) ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const122$quotedIsa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$250 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$251 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$254 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$245, UNPROVIDED );
                      while ( NIL != node_var_$245)
                      {
                        final SubLObject tt_node_var = node_var_$245;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$251 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$252 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
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
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$259 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$259 ) )
                                    {
                                      final SubLObject _prev_bind_0_$252 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$259, thread );
                                        SubLObject iteration_state_$261;
                                        for( iteration_state_$261 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$261 ); iteration_state_$261 = dictionary_contents.do_dictionary_contents_next( iteration_state_$261 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv_$262 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$261 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$262 ) )
                                          {
                                            final SubLObject _prev_bind_0_$253 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$262, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject ins;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject ins2 = NIL;
                                                ins2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  ins2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$253, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$261 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$252, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
                                  SubLObject mt_$260 = NIL;
                                  SubLObject tv_$263 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  mt_$260 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  tv_$263 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$260 ) )
                                    {
                                      final SubLObject _prev_bind_0_$254 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$260, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$263 ) )
                                        {
                                          final SubLObject _prev_bind_0_$255 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv_$263, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject ins;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                ins = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  count = Numbers.add( count, ONE_INTEGER );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$268 = sol;
                                              SubLObject ins2 = NIL;
                                              ins2 = csome_list_var_$268.first();
                                              while ( NIL != csome_list_var_$268)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  count = Numbers.add( count, ONE_INTEGER );
                                                }
                                                csome_list_var_$268 = csome_list_var_$268.rest();
                                                ins2 = csome_list_var_$268.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$255, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$254, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$269;
                              final SubLObject new_list = cdolist_list_var_$269 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                      $const122$quotedIsa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$269.first();
                              while ( NIL != cdolist_list_var_$269)
                              {
                                final SubLObject _prev_bind_0_$256 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    SubLObject ins3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        count = Numbers.add( count, ONE_INTEGER );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject ins4 = NIL;
                                    ins4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        count = Numbers.add( count, ONE_INTEGER );
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      ins4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$256, thread );
                                }
                                cdolist_list_var_$269 = cdolist_list_var_$269.rest();
                                generating_fn = cdolist_list_var_$269.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$252, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$251, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const122$quotedIsa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$257 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$253 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$245 );
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
                                    final SubLObject mt_$261 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$261 ) )
                                    {
                                      final SubLObject _prev_bind_0_$258 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$261, thread );
                                        SubLObject iteration_state_$262;
                                        for( iteration_state_$262 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$262 ); iteration_state_$262 = dictionary_contents.do_dictionary_contents_next( iteration_state_$262 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv_$264 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$262 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$264 ) )
                                          {
                                            final SubLObject _prev_bind_0_$259 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$264, thread );
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
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$259, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$262 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$258, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$270;
                              final SubLObject new_list2 = cdolist_list_var_$270 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$270.first();
                              while ( NIL != cdolist_list_var_$270)
                              {
                                final SubLObject _prev_bind_0_$260 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$260, thread );
                                }
                                cdolist_list_var_$270 = cdolist_list_var_$270.rest();
                                generating_fn2 = cdolist_list_var_$270.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$253, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$257, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$245 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$254, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$251, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$250, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$253, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$250, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$249, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$249, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$248, thread );
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$248, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$247, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$261 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$261, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$246, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$262 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$262, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25063L)
  public static SubLObject count_all_quoted_instances_if(final SubLObject collection, final SubLObject pred, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$282 = collection;
        final SubLObject deck_type = $kw115$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$283 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$284 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$285 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              final SubLObject tv_var = tv;
              final SubLObject _prev_bind_0_$285 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$286 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw31$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw34$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw36$WARN ) )
                  {
                    Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$286 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$287 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$290 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const122$quotedIsa ) ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const122$quotedIsa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$287 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$288 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$291 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$282, UNPROVIDED );
                      while ( NIL != node_var_$282)
                      {
                        final SubLObject tt_node_var = node_var_$282;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$288 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$289 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
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
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$296 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$296 ) )
                                    {
                                      final SubLObject _prev_bind_0_$289 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$296, thread );
                                        SubLObject iteration_state_$298;
                                        for( iteration_state_$298 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$298 ); iteration_state_$298 = dictionary_contents.do_dictionary_contents_next( iteration_state_$298 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv_$299 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$298 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$299 ) )
                                          {
                                            final SubLObject _prev_bind_0_$290 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$299, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject ins;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != Functions.funcall( pred, ins ) )
                                                    {
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject ins2 = NIL;
                                                ins2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != Functions.funcall( pred, ins2 ) )
                                                    {
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  ins2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$290, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$298 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$289, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
                                  SubLObject mt_$297 = NIL;
                                  SubLObject tv_$300 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  mt_$297 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                  tv_$300 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$297 ) )
                                    {
                                      final SubLObject _prev_bind_0_$291 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$297, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$300 ) )
                                        {
                                          final SubLObject _prev_bind_0_$292 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv_$300, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject ins;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                ins = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != Functions.funcall( pred, ins ) )
                                                  {
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$305 = sol;
                                              SubLObject ins2 = NIL;
                                              ins2 = csome_list_var_$305.first();
                                              while ( NIL != csome_list_var_$305)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != Functions.funcall( pred, ins2 ) )
                                                  {
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                }
                                                csome_list_var_$305 = csome_list_var_$305.rest();
                                                ins2 = csome_list_var_$305.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$292, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$291, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$306;
                              final SubLObject new_list = cdolist_list_var_$306 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                      $const122$quotedIsa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$306.first();
                              while ( NIL != cdolist_list_var_$306)
                              {
                                final SubLObject _prev_bind_0_$293 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    SubLObject ins3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != Functions.funcall( pred, ins3 ) )
                                        {
                                          count = Numbers.add( count, ONE_INTEGER );
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject ins4 = NIL;
                                    ins4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != Functions.funcall( pred, ins4 ) )
                                        {
                                          count = Numbers.add( count, ONE_INTEGER );
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      ins4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$293, thread );
                                }
                                cdolist_list_var_$306 = cdolist_list_var_$306.rest();
                                generating_fn = cdolist_list_var_$306.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$289, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$288, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const122$quotedIsa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$294 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$290 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$282 );
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
                                    final SubLObject mt_$298 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$298 ) )
                                    {
                                      final SubLObject _prev_bind_0_$295 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$298, thread );
                                        SubLObject iteration_state_$299;
                                        for( iteration_state_$299 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$299 ); iteration_state_$299 = dictionary_contents.do_dictionary_contents_next( iteration_state_$299 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv_$301 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$299 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$301 ) )
                                          {
                                            final SubLObject _prev_bind_0_$296 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$301, thread );
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
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$296, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$299 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$295, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$307;
                              final SubLObject new_list2 = cdolist_list_var_$307 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$307.first();
                              while ( NIL != cdolist_list_var_$307)
                              {
                                final SubLObject _prev_bind_0_$297 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$297, thread );
                                }
                                cdolist_list_var_$307 = cdolist_list_var_$307.rest();
                                generating_fn2 = cdolist_list_var_$307.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$290, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$294, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$282 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$291, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$288, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$287, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$290, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$287, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$286, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$286, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$285, thread );
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$285, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$284, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$298 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$298, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$283, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$299 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$299, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25383L)
  public static SubLObject count_all_quoted_instances_E(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GP = NIL;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        if( NIL == GP )
        {
          SubLObject node_var_$319 = collection;
          final SubLObject deck_type = $kw115$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$320 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject mt_var = mt;
              final SubLObject _prev_bind_0_$321 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$322 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$322 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$323 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw31$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw34$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw36$WARN ) )
                    {
                      Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$323 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$324 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$327 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const122$quotedIsa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const122$quotedIsa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$324 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$325 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$328 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$319, UNPROVIDED );
                        while ( NIL != node_var_$319 && NIL == GP)
                        {
                          final SubLObject tt_node_var = node_var_$319;
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$325;
                          SubLObject _prev_bind_1_$326;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt_$333;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$326;
                          SubLObject iteration_state_$335;
                          SubLObject tv_$336;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$327;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject ins;
                          SubLObject csome_list_var;
                          SubLObject ins2;
                          SubLObject csome_list_var2;
                          SubLObject instance_tuple;
                          SubLObject current;
                          SubLObject datum;
                          SubLObject link_node;
                          SubLObject mt_$334;
                          SubLObject tv_$337;
                          SubLObject _prev_bind_0_$328;
                          SubLObject _prev_bind_0_$329;
                          SubLObject link_nodes2;
                          SubLObject csome_list_var_$342;
                          SubLObject new_list;
                          SubLObject rest_$343;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$330;
                          SubLObject sol2;
                          SubLObject link_nodes3;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject ins3;
                          SubLObject csome_list_var3;
                          SubLObject ins4;
                          for( rest = NIL, rest = accessible_modules; NIL == GP && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$325 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$326 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$333 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$333 ) )
                                      {
                                        _prev_bind_0_$326 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$333, thread );
                                          for( iteration_state_$335 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$335 ); iteration_state_$335 = dictionary_contents.do_dictionary_contents_next( iteration_state_$335 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$336 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$335 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$336 ) )
                                            {
                                              _prev_bind_0_$327 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$336, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    ins = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numG( num ) )
                                                      {
                                                        GP = T;
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == GP )
                                                  {
                                                    csome_list_var = sol;
                                                    ins2 = NIL;
                                                    ins2 = csome_list_var.first();
                                                    while ( NIL == GP && NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        count = Numbers.add( count, ONE_INTEGER );
                                                        if( count.numG( num ) )
                                                        {
                                                          GP = T;
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      ins2 = csome_list_var.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$327, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$335 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$326, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == GP )
                                {
                                  csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL == GP && NIL != csome_list_var2)
                                  {
                                    datum = ( current = instance_tuple );
                                    link_node = NIL;
                                    mt_$334 = NIL;
                                    tv_$337 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    mt_$334 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    tv_$337 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$334 ) )
                                      {
                                        _prev_bind_0_$328 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$334, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$337 ) )
                                          {
                                            _prev_bind_0_$329 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$337, thread );
                                              link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                    if( count.numG( num ) )
                                                    {
                                                      GP = T;
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == GP )
                                                {
                                                  csome_list_var_$342 = sol;
                                                  ins2 = NIL;
                                                  ins2 = csome_list_var_$342.first();
                                                  while ( NIL == GP && NIL != csome_list_var_$342)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numG( num ) )
                                                      {
                                                        GP = T;
                                                      }
                                                    }
                                                    csome_list_var_$342 = csome_list_var_$342.rest();
                                                    ins2 = csome_list_var_$342.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$329, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$328, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities
                                    .get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                        $const122$quotedIsa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$343 = NIL, rest_$343 = new_list; NIL == GP && NIL != rest_$343; rest_$343 = rest_$343.rest() )
                                {
                                  generating_fn = rest_$343.first();
                                  _prev_bind_0_$330 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                            .getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          count = Numbers.add( count, ONE_INTEGER );
                                          if( count.numG( num ) )
                                          {
                                            GP = T;
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == GP )
                                      {
                                        csome_list_var3 = sol2;
                                        ins4 = NIL;
                                        ins4 = csome_list_var3.first();
                                        while ( NIL == GP && NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            count = Numbers.add( count, ONE_INTEGER );
                                            if( count.numG( num ) )
                                            {
                                              GP = T;
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          ins4 = csome_list_var3.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$330, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$326, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$325, thread );
                            }
                          }
                          final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const122$quotedIsa ) ) );
                          SubLObject rest2;
                          SubLObject module_var2;
                          SubLObject _prev_bind_0_$331;
                          SubLObject _prev_bind_1_$327;
                          SubLObject node2;
                          SubLObject d_link2;
                          SubLObject mt_links2;
                          SubLObject iteration_state2;
                          SubLObject mt_$335;
                          SubLObject tv_links2;
                          SubLObject _prev_bind_0_$332;
                          SubLObject iteration_state_$336;
                          SubLObject tv_$338;
                          SubLObject link_nodes4;
                          SubLObject _prev_bind_0_$333;
                          SubLObject sol3;
                          SubLObject set_contents_var3;
                          SubLObject basis_object3;
                          SubLObject state3;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var4;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list2;
                          SubLObject rest_$344;
                          SubLObject generating_fn2;
                          SubLObject _prev_bind_0_$334;
                          SubLObject sol4;
                          SubLObject link_nodes5;
                          SubLObject set_contents_var4;
                          SubLObject basis_object4;
                          SubLObject state4;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var5;
                          SubLObject node_vars_link_node4;
                          for( rest2 = NIL, rest2 = accessible_modules2; NIL == GP && NIL != rest2; rest2 = rest2.rest() )
                          {
                            module_var2 = rest2.first();
                            _prev_bind_0_$331 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$327 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node2 = function_terms.naut_to_nart( node_var_$319 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == GP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$335 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$335 ) )
                                      {
                                        _prev_bind_0_$332 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$335, thread );
                                          for( iteration_state_$336 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == GP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$336 ); iteration_state_$336 = dictionary_contents.do_dictionary_contents_next( iteration_state_$336 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$338 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$336 );
                                            link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$338 ) )
                                            {
                                              _prev_bind_0_$333 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$338, thread );
                                                sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  set_contents_var3 = set.do_set_internal( sol3 );
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
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
                                                  if( NIL == GP )
                                                  {
                                                    csome_list_var4 = sol3;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL == GP && NIL != csome_list_var4)
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
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$333, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$336 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$332, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$344 = NIL, rest_$344 = new_list2; NIL == GP && NIL != rest_$344; rest_$344 = rest_$344.rest() )
                                {
                                  generating_fn2 = rest_$344.first();
                                  _prev_bind_0_$334 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    link_nodes5 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      set_contents_var4 = set.do_set_internal( sol4 );
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
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
                                      if( NIL == GP )
                                      {
                                        csome_list_var5 = sol4;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL == GP && NIL != csome_list_var5)
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
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$334, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$327, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$331, thread );
                            }
                          }
                          node_var_$319 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$328, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$325, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$324, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$327, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$324, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$323, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$323, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$322, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$322, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$321, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$335 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$335, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$320, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$336 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$336, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return Numbers.numE( count, num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25742L)
  public static SubLObject count_all_quoted_instances_G(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GP = NIL;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        if( NIL == GP )
        {
          SubLObject node_var_$356 = collection;
          final SubLObject deck_type = $kw115$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$357 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject mt_var = mt;
              final SubLObject _prev_bind_0_$358 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$359 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$359 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$360 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw31$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw34$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw36$WARN ) )
                    {
                      Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$360 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$361 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$364 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const122$quotedIsa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const122$quotedIsa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$361 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$362 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$365 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$356, UNPROVIDED );
                        while ( NIL != node_var_$356 && NIL == GP)
                        {
                          final SubLObject tt_node_var = node_var_$356;
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$362;
                          SubLObject _prev_bind_1_$363;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt_$370;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$363;
                          SubLObject iteration_state_$372;
                          SubLObject tv_$373;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$364;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject ins;
                          SubLObject csome_list_var;
                          SubLObject ins2;
                          SubLObject csome_list_var2;
                          SubLObject instance_tuple;
                          SubLObject current;
                          SubLObject datum;
                          SubLObject link_node;
                          SubLObject mt_$371;
                          SubLObject tv_$374;
                          SubLObject _prev_bind_0_$365;
                          SubLObject _prev_bind_0_$366;
                          SubLObject link_nodes2;
                          SubLObject csome_list_var_$379;
                          SubLObject new_list;
                          SubLObject rest_$380;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$367;
                          SubLObject sol2;
                          SubLObject link_nodes3;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject ins3;
                          SubLObject csome_list_var3;
                          SubLObject ins4;
                          for( rest = NIL, rest = accessible_modules; NIL == GP && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$362 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$363 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$370 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$370 ) )
                                      {
                                        _prev_bind_0_$363 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$370, thread );
                                          for( iteration_state_$372 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$372 ); iteration_state_$372 = dictionary_contents.do_dictionary_contents_next( iteration_state_$372 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$373 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$372 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$373 ) )
                                            {
                                              _prev_bind_0_$364 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$373, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    ins = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numG( num ) )
                                                      {
                                                        GP = T;
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == GP )
                                                  {
                                                    csome_list_var = sol;
                                                    ins2 = NIL;
                                                    ins2 = csome_list_var.first();
                                                    while ( NIL == GP && NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        count = Numbers.add( count, ONE_INTEGER );
                                                        if( count.numG( num ) )
                                                        {
                                                          GP = T;
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      ins2 = csome_list_var.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$364, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$372 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$363, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == GP )
                                {
                                  csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL == GP && NIL != csome_list_var2)
                                  {
                                    datum = ( current = instance_tuple );
                                    link_node = NIL;
                                    mt_$371 = NIL;
                                    tv_$374 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    mt_$371 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    tv_$374 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$371 ) )
                                      {
                                        _prev_bind_0_$365 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$371, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$374 ) )
                                          {
                                            _prev_bind_0_$366 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$374, thread );
                                              link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                    if( count.numG( num ) )
                                                    {
                                                      GP = T;
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == GP )
                                                {
                                                  csome_list_var_$379 = sol;
                                                  ins2 = NIL;
                                                  ins2 = csome_list_var_$379.first();
                                                  while ( NIL == GP && NIL != csome_list_var_$379)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numG( num ) )
                                                      {
                                                        GP = T;
                                                      }
                                                    }
                                                    csome_list_var_$379 = csome_list_var_$379.rest();
                                                    ins2 = csome_list_var_$379.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$366, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$365, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities
                                    .get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                        $const122$quotedIsa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$380 = NIL, rest_$380 = new_list; NIL == GP && NIL != rest_$380; rest_$380 = rest_$380.rest() )
                                {
                                  generating_fn = rest_$380.first();
                                  _prev_bind_0_$367 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                            .getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          count = Numbers.add( count, ONE_INTEGER );
                                          if( count.numG( num ) )
                                          {
                                            GP = T;
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == GP )
                                      {
                                        csome_list_var3 = sol2;
                                        ins4 = NIL;
                                        ins4 = csome_list_var3.first();
                                        while ( NIL == GP && NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            count = Numbers.add( count, ONE_INTEGER );
                                            if( count.numG( num ) )
                                            {
                                              GP = T;
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          ins4 = csome_list_var3.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$367, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$363, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$362, thread );
                            }
                          }
                          final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const122$quotedIsa ) ) );
                          SubLObject rest2;
                          SubLObject module_var2;
                          SubLObject _prev_bind_0_$368;
                          SubLObject _prev_bind_1_$364;
                          SubLObject node2;
                          SubLObject d_link2;
                          SubLObject mt_links2;
                          SubLObject iteration_state2;
                          SubLObject mt_$372;
                          SubLObject tv_links2;
                          SubLObject _prev_bind_0_$369;
                          SubLObject iteration_state_$373;
                          SubLObject tv_$375;
                          SubLObject link_nodes4;
                          SubLObject _prev_bind_0_$370;
                          SubLObject sol3;
                          SubLObject set_contents_var3;
                          SubLObject basis_object3;
                          SubLObject state3;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var4;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list2;
                          SubLObject rest_$381;
                          SubLObject generating_fn2;
                          SubLObject _prev_bind_0_$371;
                          SubLObject sol4;
                          SubLObject link_nodes5;
                          SubLObject set_contents_var4;
                          SubLObject basis_object4;
                          SubLObject state4;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var5;
                          SubLObject node_vars_link_node4;
                          for( rest2 = NIL, rest2 = accessible_modules2; NIL == GP && NIL != rest2; rest2 = rest2.rest() )
                          {
                            module_var2 = rest2.first();
                            _prev_bind_0_$368 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$364 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node2 = function_terms.naut_to_nart( node_var_$356 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == GP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$372 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$372 ) )
                                      {
                                        _prev_bind_0_$369 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$372, thread );
                                          for( iteration_state_$373 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == GP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$373 ); iteration_state_$373 = dictionary_contents.do_dictionary_contents_next( iteration_state_$373 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$375 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$373 );
                                            link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$375 ) )
                                            {
                                              _prev_bind_0_$370 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$375, thread );
                                                sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  set_contents_var3 = set.do_set_internal( sol3 );
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
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
                                                  if( NIL == GP )
                                                  {
                                                    csome_list_var4 = sol3;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL == GP && NIL != csome_list_var4)
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
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$370, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$373 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$369, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$381 = NIL, rest_$381 = new_list2; NIL == GP && NIL != rest_$381; rest_$381 = rest_$381.rest() )
                                {
                                  generating_fn2 = rest_$381.first();
                                  _prev_bind_0_$371 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    link_nodes5 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      set_contents_var4 = set.do_set_internal( sol4 );
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
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
                                      if( NIL == GP )
                                      {
                                        csome_list_var5 = sol4;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL == GP && NIL != csome_list_var5)
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
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$371, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$364, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$368, thread );
                            }
                          }
                          node_var_$356 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$365, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$362, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$361, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$364, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$361, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$360, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$360, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$359, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$359, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$358, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$372 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$372, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$357, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$373 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$373, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return GP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26092L)
  public static SubLObject count_all_quoted_instances_GE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GEP = NIL;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        if( NIL == GEP )
        {
          SubLObject node_var_$393 = collection;
          final SubLObject deck_type = $kw115$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$394 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject mt_var = mt;
              final SubLObject _prev_bind_0_$395 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$396 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$396 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$397 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw31$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw34$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw36$WARN ) )
                    {
                      Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$397 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$398 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$401 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const122$quotedIsa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const122$quotedIsa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$398 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$399 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$402 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$393, UNPROVIDED );
                        while ( NIL != node_var_$393 && NIL == GEP)
                        {
                          final SubLObject tt_node_var = node_var_$393;
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$399;
                          SubLObject _prev_bind_1_$400;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt_$407;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$400;
                          SubLObject iteration_state_$409;
                          SubLObject tv_$410;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$401;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject ins;
                          SubLObject csome_list_var;
                          SubLObject ins2;
                          SubLObject csome_list_var2;
                          SubLObject instance_tuple;
                          SubLObject current;
                          SubLObject datum;
                          SubLObject link_node;
                          SubLObject mt_$408;
                          SubLObject tv_$411;
                          SubLObject _prev_bind_0_$402;
                          SubLObject _prev_bind_0_$403;
                          SubLObject link_nodes2;
                          SubLObject csome_list_var_$416;
                          SubLObject new_list;
                          SubLObject rest_$417;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$404;
                          SubLObject sol2;
                          SubLObject link_nodes3;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject ins3;
                          SubLObject csome_list_var3;
                          SubLObject ins4;
                          for( rest = NIL, rest = accessible_modules; NIL == GEP && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$399 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$400 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GEP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$407 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$407 ) )
                                      {
                                        _prev_bind_0_$400 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$407, thread );
                                          for( iteration_state_$409 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GEP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$409 ); iteration_state_$409 = dictionary_contents.do_dictionary_contents_next( iteration_state_$409 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$410 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$409 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$410 ) )
                                            {
                                              _prev_bind_0_$401 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$410, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    ins = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numGE( num ) )
                                                      {
                                                        GEP = T;
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == GEP )
                                                  {
                                                    csome_list_var = sol;
                                                    ins2 = NIL;
                                                    ins2 = csome_list_var.first();
                                                    while ( NIL == GEP && NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        count = Numbers.add( count, ONE_INTEGER );
                                                        if( count.numGE( num ) )
                                                        {
                                                          GEP = T;
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      ins2 = csome_list_var.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$401, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$409 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$400, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == GEP )
                                {
                                  csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL == GEP && NIL != csome_list_var2)
                                  {
                                    datum = ( current = instance_tuple );
                                    link_node = NIL;
                                    mt_$408 = NIL;
                                    tv_$411 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    mt_$408 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                                    tv_$411 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$408 ) )
                                      {
                                        _prev_bind_0_$402 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$408, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$411 ) )
                                          {
                                            _prev_bind_0_$403 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv_$411, thread );
                                              link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  ins = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, ins ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                    if( count.numGE( num ) )
                                                    {
                                                      GEP = T;
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == GEP )
                                                {
                                                  csome_list_var_$416 = sol;
                                                  ins2 = NIL;
                                                  ins2 = csome_list_var_$416.first();
                                                  while ( NIL == GEP && NIL != csome_list_var_$416)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                      if( count.numGE( num ) )
                                                      {
                                                        GEP = T;
                                                      }
                                                    }
                                                    csome_list_var_$416 = csome_list_var_$416.rest();
                                                    ins2 = csome_list_var_$416.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$403, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$402, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities
                                    .get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                        $const122$quotedIsa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$417 = NIL, rest_$417 = new_list; NIL == GEP && NIL != rest_$417; rest_$417 = rest_$417.rest() )
                                {
                                  generating_fn = rest_$417.first();
                                  _prev_bind_0_$404 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        ins3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, ins3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins3, sbhl_marking_vars.$sbhl_gather_space$
                                            .getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          count = Numbers.add( count, ONE_INTEGER );
                                          if( count.numGE( num ) )
                                          {
                                            GEP = T;
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == GEP )
                                      {
                                        csome_list_var3 = sol2;
                                        ins4 = NIL;
                                        ins4 = csome_list_var3.first();
                                        while ( NIL == GEP && NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            count = Numbers.add( count, ONE_INTEGER );
                                            if( count.numGE( num ) )
                                            {
                                              GEP = T;
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          ins4 = csome_list_var3.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$404, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$400, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$399, thread );
                            }
                          }
                          final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const122$quotedIsa ) ) );
                          SubLObject rest2;
                          SubLObject module_var2;
                          SubLObject _prev_bind_0_$405;
                          SubLObject _prev_bind_1_$401;
                          SubLObject node2;
                          SubLObject d_link2;
                          SubLObject mt_links2;
                          SubLObject iteration_state2;
                          SubLObject mt_$409;
                          SubLObject tv_links2;
                          SubLObject _prev_bind_0_$406;
                          SubLObject iteration_state_$410;
                          SubLObject tv_$412;
                          SubLObject link_nodes4;
                          SubLObject _prev_bind_0_$407;
                          SubLObject sol3;
                          SubLObject set_contents_var3;
                          SubLObject basis_object3;
                          SubLObject state3;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var4;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list2;
                          SubLObject rest_$418;
                          SubLObject generating_fn2;
                          SubLObject _prev_bind_0_$408;
                          SubLObject sol4;
                          SubLObject link_nodes5;
                          SubLObject set_contents_var4;
                          SubLObject basis_object4;
                          SubLObject state4;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var5;
                          SubLObject node_vars_link_node4;
                          for( rest2 = NIL, rest2 = accessible_modules2; NIL == GEP && NIL != rest2; rest2 = rest2.rest() )
                          {
                            module_var2 = rest2.first();
                            _prev_bind_0_$405 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$401 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node2 = function_terms.naut_to_nart( node_var_$393 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == GEP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$409 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$409 ) )
                                      {
                                        _prev_bind_0_$406 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$409, thread );
                                          for( iteration_state_$410 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == GEP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$410 ); iteration_state_$410 = dictionary_contents.do_dictionary_contents_next( iteration_state_$410 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv_$412 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$410 );
                                            link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$412 ) )
                                            {
                                              _prev_bind_0_$407 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv_$412, thread );
                                                sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  set_contents_var3 = set.do_set_internal( sol3 );
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
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
                                                  if( NIL == GEP )
                                                  {
                                                    csome_list_var4 = sol3;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL == GEP && NIL != csome_list_var4)
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
                                                }
                                                else
                                                {
                                                  Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$407, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$410 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$406, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$418 = NIL, rest_$418 = new_list2; NIL == GEP && NIL != rest_$418; rest_$418 = rest_$418.rest() )
                                {
                                  generating_fn2 = rest_$418.first();
                                  _prev_bind_0_$408 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    link_nodes5 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      set_contents_var4 = set.do_set_internal( sol4 );
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
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
                                      if( NIL == GEP )
                                      {
                                        csome_list_var5 = sol4;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL == GEP && NIL != csome_list_var5)
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
                                    }
                                    else
                                    {
                                      Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$408, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$401, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$405, thread );
                            }
                          }
                          node_var_$393 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$402, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$399, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$398, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$401, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$398, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$397, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$397, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$396, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$396, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$395, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$409 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$409, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$394, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$410 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$410, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return GEP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26459L)
  public static SubLObject count_all_quoted_instances_L(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Numbers.numL( count_all_quoted_instances( collection, mt, tv ), num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26691L)
  public static SubLObject count_all_quoted_instances_LE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Numbers.numLE( count_all_quoted_instances( collection, mt, tv ), num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26936L)
  public static SubLObject isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( collection, $sym12$EL_FORT_P );
    if( NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, collection, mt, tv ) )
    {
      return T;
    }
    if( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) && NIL != genls.any_specP( collection, sbhl_link_methods.isas_from_naut_arg2( v_term, mt, tv ), mt, tv ) )
    {
      return T;
    }
    if( NIL != cycl_grammar.cycl_nat_p( collection ) && cycl_utilities.formula_operator( collection ).eql( $const125$CollectionIntersectionFn ) && NIL != el_utilities.el_extensional_set_p( cycl_utilities.formula_arg1(
        collection, UNPROVIDED ) ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject colls = cdolist_list_var = el_utilities.extensional_set_elements( cycl_utilities.formula_arg1( collection, UNPROVIDED ) );
      SubLObject sub_coll = NIL;
      sub_coll = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == term.el_fort_p( sub_coll ) || NIL == isaP( v_term, sub_coll, mt, tv ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sub_coll = cdolist_list_var.first();
      }
      return T;
    }
    if( NIL != forts.non_fort_p( v_term ) && NIL != sbhl_link_methods.non_fort_isaP( v_term, collection, mt, tv ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28165L)
  public static SubLObject isa_in_mtsP(final SubLObject v_term, final SubLObject collection, final SubLObject mts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( collection, $sym12$EL_FORT_P );
    SubLObject isaP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym56$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      isaP = isaP( v_term, collection, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return isaP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28474L)
  public static SubLObject isa_in_any_mtP(final SubLObject v_term, final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isaP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      isaP = isaP( v_term, collection, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return isaP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28694L)
  public static SubLObject nat_isaP(final SubLObject nat, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject v_term = cycl_utilities.find_ground_naut( nat );
    if( NIL != v_term )
    {
      return isaP( v_term, collection, mt, tv );
    }
    return nat_isa_intP( nat, collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28974L)
  public static SubLObject nat_isa_intP(final SubLObject nat, final SubLObject collection, final SubLObject mt)
  {
    return makeBoolean( NIL != sbhl_link_methods.non_fort_isaP( nat, collection, mt, UNPROVIDED ) || ( NIL == weak_not_result_isa_colP( cycl_utilities.nat_functor( nat ), collection, mt )
        && NIL == weak_not_result_isa_arg_colP( nat, collection, mt ) && ( NIL != result_isa_colP( cycl_utilities.nat_functor( nat ), collection, mt ) || NIL != result_isa_arg_colP( nat, collection, mt )
            || NIL != result_isa_inter_arg_colP( nat, collection, mt ) || NIL != result_isa_inter_arg_reln_colP( nat, collection, mt ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29534L)
  public static SubLObject result_isa_colP(final SubLObject functor, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return genls.any_specP( collection, kb_accessors.result_isa( functor, mt ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29700L)
  public static SubLObject weak_not_result_isa_colP(final SubLObject functor, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return disjoint_with.any_disjoint_with_anyP_memoized( kb_accessors.result_isa( functor, mt ), ConsesLow.list( collection ), mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29943L)
  public static SubLObject result_isa_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return genls.any_specP( collection, kb_accessors.result_isa_args( nat_formula, mt ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30126L)
  public static SubLObject weak_not_result_isa_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return disjoint_with.any_disjoint_with_anyP_memoized( kb_accessors.result_isa_args( nat_formula, mt ), ConsesLow.list( collection ), mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30386L)
  public static SubLObject result_isa_inter_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return genls.any_specP( collection, kb_accessors.result_inter_arg_isa( nat_formula, mt ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30580L)
  public static SubLObject result_isa_inter_arg_reln_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return genls.any_specP( collection, kb_accessors.result_inter_arg_isa_reln( nat_formula, mt ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30791L)
  public static SubLObject isaP_goal(final SubLObject node)
  {
    if( NIL != sbhl_search_methods.sbhl_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), node, sbhl_search_vars.get_sbhl_isaP_goal(), UNPROVIDED, UNPROVIDED ) )
    {
      return node;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31026L)
  public static SubLObject any_isaP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collections, $sym74$LISTP );
    if( NIL == collections )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( collections ) )
    {
      return isaP( v_term, collections.first(), mt, tv );
    }
    return makeBoolean( NIL != sbhl_search_methods.sbhl_predicate_relation_with_any_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, collections, mt, tv ) || NIL != ( ( NIL != forts.non_fort_p( v_term ) )
        ? sbhl_link_methods.non_fort_isa_anyP( v_term, collections, mt, tv )
        : NIL ) || NIL != ( ( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) ) ? genls.any_genl_anyP( sbhl_link_methods.isas_from_naut_arg2( v_term, mt, tv ), collections, mt, tv ) : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31678L)
  public static SubLObject isa_anyP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collections, $sym74$LISTP );
    return any_isaP( v_term, collections, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31940L)
  public static SubLObject nat_any_isaP(final SubLObject nat, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject v_term = cycl_utilities.find_ground_naut( nat );
    if( NIL != v_term )
    {
      return isa_anyP( v_term, collections, mt, tv );
    }
    return makeBoolean( NIL != sbhl_link_methods.non_fort_isa_anyP( nat, collections, UNPROVIDED, UNPROVIDED ) || NIL != genls.any_genl_anyP( kb_accessors.result_types( cycl_utilities.nat_functor( nat ), mt ),
        collections, mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32291L)
  public static SubLObject find_if_isaP(final SubLObject collection, final SubLObject list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( list ) : list;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == isaP( collection, $const139$Collection, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str140$_A_is_not_a_collection, collection );
    }
    SubLObject cdolist_list_var = list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa_in_any_mtP( item, collection ) )
      {
        return item;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32621L)
  public static SubLObject all_isaP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    assert NIL != Types.listp( collections ) : collections;
    if( NIL == collections )
    {
      return T;
    }
    if( NIL != list_utilities.singletonP( collections ) )
    {
      return isaP( v_term, collections.first(), mt, tv );
    }
    return makeBoolean( NIL != sbhl_search_methods.sbhl_predicate_relation_with_all_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, collections, mt, tv ) || NIL != ( ( NIL != forts.non_fort_p( v_term ) )
        ? sbhl_link_methods.non_fort_isa_allP( v_term, collections, mt, tv )
        : NIL ) || NIL != ( ( NIL != sbhl_link_methods.isa_stored_naut_arg2_p( v_term ) ) ? genls.any_genl_allP( sbhl_link_methods.isas_from_naut_arg2( v_term, mt, tv ), collections, mt, tv ) : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33226L)
  public static SubLObject all_instancesP(final SubLObject terms, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( NIL == terms )
    {
      return T;
    }
    if( NIL != list_utilities.singletonP( terms ) )
    {
      return isaP( terms.first(), collection, mt, tv );
    }
    return sbhl_search_methods.sbhl_all_with_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), terms, collection, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33580L)
  public static SubLObject any_isa_anyP(final SubLObject terms, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( terms, $sym74$LISTP );
    enforceType( collections, $sym74$LISTP );
    if( NIL == terms )
    {
      return NIL;
    }
    if( NIL == collections )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( terms ) )
    {
      return isa_anyP( terms.first(), collections, mt, tv );
    }
    return makeBoolean( NIL != sbhl_search_methods.sbhl_predicate_relation_between_any_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), terms, collections, mt, tv ) || NIL != ( ( NIL != list_utilities.any_in_list(
        $sym75$ISA_STORED_NAUT_ARG2_P, terms, UNPROVIDED ) ) ? genls.any_genl_anyP( sbhl_link_methods.union_isas_from_naut_arg2( terms, mt, tv ), collections, mt, tv ) : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34393L)
  public static SubLObject not_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collection, $sym12$EL_FORT_P );
    return makeBoolean( ( ( NIL == control_vars.within_assertP() || NIL == czer_utilities.equals_elP( el_utilities.make_binary_formula( $const0$isa, v_term, collection ), wff_vars.wff_original_formula(), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) && NIL != not_isa_by_extent_knownP( v_term, collection, mt, tv ) ) || NIL != not_isa_by_sbhlP( v_term, collection, mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35072L)
  public static SubLObject not_isa_someP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    SubLObject resultP = NIL;
    if( NIL == resultP )
    {
      SubLObject csome_list_var = collections;
      SubLObject col = NIL;
      col = csome_list_var.first();
      while ( NIL == resultP && NIL != csome_list_var)
      {
        if( NIL != not_isaP( v_term, col, mt, tv ) )
        {
          resultP = T;
        }
        csome_list_var = csome_list_var.rest();
        col = csome_list_var.first();
      }
    }
    return resultP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35453L)
  public static SubLObject not_isa_by_sbhlP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, collection, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35620L)
  public static SubLObject not_isa_by_extent_knownP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( NIL != kb_accessors.completely_enumerable_collectionP( collection, mt ) )
    {
      return makeBoolean( NIL == isaP( v_term, collection, mt, tv ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35976L)
  public static SubLObject argue_not_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36256L)
  public static SubLObject not_isa_in_any_mtP(final SubLObject v_term, final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject not_isaP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      not_isaP = not_isaP( v_term, collection, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return not_isaP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36509L)
  public static SubLObject nat_not_isaP(final SubLObject nat, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject v_term = cycl_utilities.find_ground_naut( nat );
    if( NIL != v_term )
    {
      return not_isaP( v_term, collection, mt, tv );
    }
    return disjoint_with.any_disjoint_with_anyP_memoized( kb_accessors.result_types( cycl_utilities.nat_functor( nat ), mt ), ConsesLow.list( collection ), mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36864L)
  public static SubLObject why_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv, SubLObject behavior)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collection, $sym12$EL_FORT_P );
    if( NIL != term.first_order_nautP( v_term ) )
    {
      return any_just_of_nat_isa( v_term, collection, mt );
    }
    return sbhl_search_methods.why_sbhl_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, collection, mt, tv, behavior );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37358L)
  public static SubLObject any_just_of_isa(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return why_isaP( v_term, collection, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37514L)
  public static SubLObject any_just_of_nat_isa(final SubLObject nat, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject v_term = cycl_utilities.find_ground_naut( nat );
    final SubLObject just = any_just_of_isa( v_term, collection, mt );
    if( NIL != just )
    {
      return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const152$termOfUnit, v_term, nat ), $list153 ), just );
    }
    SubLObject nat_just = NIL;
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_types( cycl_utilities.nat_functor( nat ), mt );
      SubLObject v_isa = NIL;
      v_isa = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        if( !v_isa.equal( collection ) )
        {
          nat_just = genls.why_genlP( v_isa, collection, mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != nat_just || v_isa.equal( collection ) )
        {
          return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const154$resultIsa, cycl_utilities.nat_functor( nat ), v_isa ), $list153 ), nat_just );
        }
        csome_list_var = csome_list_var.rest();
        v_isa = csome_list_var.first();
      }
    }
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_isa_args( nat, mt );
      SubLObject v_isa = NIL;
      v_isa = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        if( !v_isa.equal( collection ) )
        {
          nat_just = genls.why_genlP( v_isa, collection, mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != nat_just || v_isa.equal( collection ) )
        {
          final SubLObject args = kb_accessors.result_isa_via_argnums( nat, collection, mt, UNPROVIDED );
          if( NIL != args )
          {
            return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const155$resultIsaArg, cycl_utilities.nat_functor( nat ), args.first() ), $list153 ), nat_just );
          }
        }
        csome_list_var = csome_list_var.rest();
        v_isa = csome_list_var.first();
      }
    }
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_inter_arg_isa( nat, mt );
      SubLObject v_isa = NIL;
      v_isa = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        if( !v_isa.equal( collection ) )
        {
          nat_just = genls.why_genlP( v_isa, collection, mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != nat_just || v_isa.equal( collection ) )
        {
          final SubLObject args = kb_accessors.result_inter_arg_isa_via_which_args( nat, collection, mt, UNPROVIDED ).first();
          if( args.isCons() )
          {
            final SubLObject arg = args.first();
            final SubLObject ind_col = conses_high.second( args );
            final SubLObject dep_col = conses_high.third( args );
            final SubLObject arg_col = cycl_utilities.nat_arg( nat, arg, UNPROVIDED );
            if( !arg_col.equal( ind_col ) )
            {
              nat_just = ConsesLow.nconc( nat_just, why_isaP( arg_col, ind_col, mt, UNPROVIDED, UNPROVIDED ) );
            }
            if( !dep_col.equal( collection ) )
            {
              nat_just = ConsesLow.nconc( nat_just, genls.why_genlP( dep_col, collection, mt, UNPROVIDED, UNPROVIDED ) );
            }
            return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const156$interArgResultIsa, cycl_utilities.nat_functor( nat ), arg, ind_col, dep_col ), $list153 ), nat_just );
          }
        }
        csome_list_var = csome_list_var.rest();
        v_isa = csome_list_var.first();
      }
    }
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_inter_arg_isa_reln( nat, mt );
      SubLObject v_isa = NIL;
      v_isa = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        if( !v_isa.equal( collection ) )
        {
          nat_just = genls.why_genlP( v_isa, collection, mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != nat_just || v_isa.equal( collection ) )
        {
          final SubLObject args = kb_accessors.result_inter_arg_isa_reln_via_which_args( nat, collection, mt, UNPROVIDED ).first();
          if( args.isCons() )
          {
            final SubLObject rel_sentence = args.first().first();
            final SubLObject arg2 = conses_high.second( args );
            final SubLObject rel = cycl_utilities.formula_operator( rel_sentence );
            final SubLObject rel_nat_term_arg = conses_high.third( args );
            final SubLObject rel_col_arg = conses_high.fourth( args );
            final SubLObject col = cycl_utilities.formula_arg( rel_sentence, rel_col_arg, UNPROVIDED );
            if( !col.equal( collection ) )
            {
              nat_just = ConsesLow.nconc( nat_just, genls.why_genlP( col, collection, mt, UNPROVIDED, UNPROVIDED ) );
            }
            return ConsesLow.append( ConsesLow.list( reader.bq_cons( ConsesLow.list( $const157$interArgResultIsaReln, cycl_utilities.nat_functor( nat ), arg2, rel, rel_nat_term_arg, rel_col_arg ), $list153 ), reader
                .bq_cons( rel_sentence, $list153 ) ), nat_just );
          }
        }
        csome_list_var = csome_list_var.rest();
        v_isa = csome_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40132L)
  public static SubLObject why_not_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv, SubLObject behavior)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collection, $sym12$EL_FORT_P );
    if( NIL != term.first_order_nautP( v_term ) )
    {
      return any_just_of_nat_not_isa( v_term, collection, mt );
    }
    SubLObject just = NIL;
    just = sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, collection, mt, tv, behavior );
    if( NIL == just )
    {
      just = at_defns.why_not_isa_via_defnsP( v_term, collection, mt );
    }
    return just;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40700L)
  public static SubLObject any_just_of_not_isa(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return why_not_isaP( v_term, collection, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40869L)
  public static SubLObject any_just_of_nat_not_isa(final SubLObject nat, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject v_term = cycl_utilities.find_ground_naut( nat );
    final SubLObject just = any_just_of_not_isa( v_term, collection, mt );
    if( NIL != just )
    {
      return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const152$termOfUnit, v_term, nat ), $list153 ), just );
    }
    SubLObject nat_just = NIL;
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_types( cycl_utilities.nat_functor( nat ), mt );
      SubLObject v_isa = NIL;
      v_isa = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        nat_just = genls.why_not_genlP( v_isa, collection, mt, UNPROVIDED, UNPROVIDED );
        if( NIL != nat_just )
        {
          return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const154$resultIsa, cycl_utilities.nat_functor( nat ), v_isa ), $list153 ), just );
        }
        csome_list_var = csome_list_var.rest();
        v_isa = csome_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41392L)
  public static SubLObject instancesP(final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( collection, $sym12$EL_FORT_P );
    return instancesP_int( collection, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41676L)
  public static SubLObject instancesP_int(final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( collection, UNPROVIDED ) )
    {
      return instances( narts_high.find_nart( collection ), mt, UNPROVIDED );
    }
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const0$isa );
    SubLObject instanceP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject tv_var = tv;
      final SubLObject _prev_bind_0_$430 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
      final SubLObject _prev_bind_1_$431 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
      try
      {
        sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
        sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
        if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
        {
          final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
          if( pcase_var.eql( $kw31$ERROR ) )
          {
            sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else if( pcase_var.eql( $kw34$CERROR ) )
          {
            sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else if( pcase_var.eql( $kw36$WARN ) )
          {
            Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
          }
          else
          {
            Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
            Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
          }
        }
        final SubLObject _prev_bind_0_$431 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
        final SubLObject _prev_bind_1_$432 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
        final SubLObject _prev_bind_2_$434 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_search_truth$.bind( $const11$True_JustificationTruth, thread );
          sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
          sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
          final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
          final SubLObject _prev_bind_0_$432 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw38$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
            final SubLObject _prev_bind_0_$433 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw38$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$434 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
              final SubLObject _prev_bind_1_$433 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
              final SubLObject _prev_bind_2_$435 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try
                {
                  needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                  final SubLObject _prev_bind_0_$435 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$434 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$436 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_3_$443 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_4_$444 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( module, thread );
                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( module );
                    SubLObject rest;
                    SubLObject module_var;
                    SubLObject _prev_bind_0_$436;
                    SubLObject _prev_bind_1_$435;
                    SubLObject node;
                    SubLObject d_link;
                    SubLObject mt_links;
                    SubLObject iteration_state;
                    SubLObject mt_$447;
                    SubLObject tv_links;
                    SubLObject _prev_bind_0_$437;
                    SubLObject iteration_state_$449;
                    SubLObject tv_$450;
                    SubLObject link_nodes;
                    SubLObject _prev_bind_0_$438;
                    SubLObject sol;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject instance;
                    SubLObject csome_list_var;
                    SubLObject instance2;
                    SubLObject csome_list_var2;
                    SubLObject instance_tuple;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject link_node;
                    SubLObject mt_$448;
                    SubLObject tv_$451;
                    SubLObject _prev_bind_0_$439;
                    SubLObject _prev_bind_0_$440;
                    SubLObject link_nodes2;
                    SubLObject csome_list_var_$456;
                    SubLObject new_list;
                    SubLObject rest_$457;
                    SubLObject generating_fn;
                    SubLObject _prev_bind_0_$441;
                    SubLObject sol2;
                    SubLObject link_nodes3;
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject instance3;
                    SubLObject csome_list_var3;
                    SubLObject instance4;
                    for( rest = NIL, rest = accessible_modules; NIL == instanceP && NIL != rest; rest = rest.rest() )
                    {
                      module_var = rest.first();
                      _prev_bind_0_$436 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      _prev_bind_1_$435 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        node = function_terms.naut_to_nart( collection );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == instanceP && NIL == dictionary_contents
                                  .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                mt_$447 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$447 ) )
                                {
                                  _prev_bind_0_$437 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$447, thread );
                                    for( iteration_state_$449 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == instanceP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state_$449 ); iteration_state_$449 = dictionary_contents.do_dictionary_contents_next( iteration_state_$449 ) )
                                    {
                                      thread.resetMultipleValues();
                                      tv_$450 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$449 );
                                      link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$450 ) )
                                      {
                                        _prev_bind_0_$438 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv_$450, thread );
                                          sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            set_contents_var = set.do_set_internal( sol );
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == instanceP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              instance = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, instance ) && NIL != instance )
                                              {
                                                instanceP = T;
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            if( NIL == instanceP )
                                            {
                                              csome_list_var = sol;
                                              instance2 = NIL;
                                              instance2 = csome_list_var.first();
                                              while ( NIL == instanceP && NIL != csome_list_var)
                                              {
                                                if( NIL != instance2 )
                                                {
                                                  instanceP = T;
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                instance2 = csome_list_var.first();
                                              }
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$438, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$449 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$437, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                          if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == instanceP )
                          {
                            csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                            instance_tuple = NIL;
                            instance_tuple = csome_list_var2.first();
                            while ( NIL == instanceP && NIL != csome_list_var2)
                            {
                              datum = ( current = instance_tuple );
                              link_node = NIL;
                              mt_$448 = NIL;
                              tv_$451 = NIL;
                              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                              link_node = current.first();
                              current = current.rest();
                              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                              mt_$448 = current.first();
                              current = current.rest();
                              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
                              tv_$451 = current.first();
                              current = current.rest();
                              if( NIL == current )
                              {
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$448 ) )
                                {
                                  _prev_bind_0_$439 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$448, thread );
                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$451 ) )
                                    {
                                      _prev_bind_0_$440 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv_$451, thread );
                                        link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                        if( NIL != set.set_p( sol ) )
                                        {
                                          set_contents_var = set.do_set_internal( sol );
                                          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                              set_contents_var ); NIL == instanceP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                          {
                                            instance = set_contents.do_set_contents_next( basis_object, state );
                                            if( NIL != set_contents.do_set_contents_element_validP( state, instance ) && NIL != instance )
                                            {
                                              instanceP = T;
                                            }
                                          }
                                        }
                                        else if( sol.isList() )
                                        {
                                          if( NIL == instanceP )
                                          {
                                            csome_list_var_$456 = sol;
                                            instance2 = NIL;
                                            instance2 = csome_list_var_$456.first();
                                            while ( NIL == instanceP && NIL != csome_list_var_$456)
                                            {
                                              if( NIL != instance2 )
                                              {
                                                instanceP = T;
                                              }
                                              csome_list_var_$456 = csome_list_var_$456.rest();
                                              instance2 = csome_list_var_$456.first();
                                            }
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$440, thread );
                                      }
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$439, thread );
                                  }
                                }
                              }
                              else
                              {
                                cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
                              }
                              csome_list_var2 = csome_list_var2.rest();
                              instance_tuple = csome_list_var2.first();
                            }
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                              .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          for( rest_$457 = NIL, rest_$457 = new_list; NIL == instanceP && NIL != rest_$457; rest_$457 = rest_$457.rest() )
                          {
                            generating_fn = rest_$457.first();
                            _prev_bind_0_$441 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                set_contents_var2 = set.do_set_internal( sol2 );
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == instanceP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  instance3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, instance3 ) && NIL != instance3 )
                                  {
                                    instanceP = T;
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                if( NIL == instanceP )
                                {
                                  csome_list_var3 = sol2;
                                  instance4 = NIL;
                                  instance4 = csome_list_var3.first();
                                  while ( NIL == instanceP && NIL != csome_list_var3)
                                  {
                                    if( NIL != instance4 )
                                    {
                                      instanceP = T;
                                    }
                                    csome_list_var3 = csome_list_var3.rest();
                                    instance4 = csome_list_var3.first();
                                  }
                                }
                              }
                              else
                              {
                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$441, thread );
                            }
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$435, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$436, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_4_$444, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$443, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$436, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$434, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$435, thread );
                  }
                }
                finally
                {
                  if( NIL != needs_to_releaseP )
                  {
                    ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$435, thread );
                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$433, thread );
                sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$434, thread );
              }
              if( source == $kw41$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$433, thread );
            }
            if( source == $kw41$RESOURCE )
            {
              sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$432, thread );
          }
        }
        finally
        {
          sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$434, thread );
          sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$432, thread );
          sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$431, thread );
        }
      }
      finally
      {
        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$431, thread );
        sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$430, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return instanceP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42195L)
  public static SubLObject forts_of_type(final SubLObject v_forts, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_forts;
    SubLObject fort = NIL;
    fort = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != sbhl_link_vars.sbhl_node_object_p( fort ) && NIL != isaP( fort, collection, mt, tv ) )
      {
        result = ConsesLow.cons( fort, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      fort = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42502L)
  public static SubLObject all_isa_mts(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_result$.bind( isa_mts( v_term ), thread );
      map_all_isa( $sym162$GATHER_GENLS_MTS, v_term, UNPROVIDED, UNPROVIDED );
      result = list_utilities.remove_duplicate_forts( sbhl_search_vars.$sbhl_result$.getDynamicValue( thread ) );
    }
    finally
    {
      sbhl_search_vars.$sbhl_result$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42788L)
  public static SubLObject gather_genls_mts(final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    sbhl_search_vars.$sbhl_result$.setDynamicValue( ConsesLow.nconc( sbhl_search_vars.$sbhl_result$.getDynamicValue( thread ), genls.genls_mts( collection ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42982L)
  public static SubLObject partial_isa_extensionP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != at_defns.any_sufficient_defn_anywhereP( collection ) || NIL != at_defns.any_sufficient_functionP( collection, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43388L)
  public static SubLObject random_instance_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( collection ) : collection;
    if( NIL != mt && !assertionsDisabledSynth && NIL == hlmt.hlmt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    if( NIL != sbhl_cache.valid_fort_typeP( collection ) )
    {
      return list_utilities.random_element( fort_types_interface.all_forts_of_type( collection ) );
    }
    if( $const164$Thing.eql( collection ) )
    {
      return forts.random_fort( UNPROVIDED );
    }
    if( cardinality_estimates.instance_cardinality( collection ).numG( Numbers.integerDivide( forts.fort_count(), $random_instance_of_sampling_ratio$.getGlobalValue() ) ) )
    {
      SubLObject result;
      SubLObject candidate;
      for( result = NIL; NIL == result; result = candidate )
      {
        candidate = forts.random_fort( UNPROVIDED );
        if( NIL != isaP( candidate, collection, mt, UNPROVIDED ) )
        {
        }
      }
      return result;
    }
    final SubLObject v_instances = all_instances( collection, mt, UNPROVIDED );
    return list_utilities.random_element( v_instances );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44498L)
  public static SubLObject min_ceiling_isa(final SubLObject terms, SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_min_ceilings( sbhl_module_vars.get_sbhl_module( $const0$isa ), terms, candidates, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44842L)
  public static SubLObject nearest_common_isa(final SubLObject terms, SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return min_ceiling_isa( terms, candidates, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45110L)
  public static SubLObject max_floor_instances(final SubLObject terms, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject max_floor_instances = NIL;
    return max_floor_instances;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45439L)
  public static SubLObject max_floor_mts_of_isa_paths_wrt(final SubLObject v_term, final SubLObject collection, final SubLObject mt)
  {
    return genl_mts.selected_genl_mts( mt, max_floor_mts_of_isa_paths( v_term, collection, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45735L)
  public static SubLObject max_floor_mts_of_isa_paths(final SubLObject v_term, final SubLObject collection, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collection, $sym12$EL_FORT_P );
    SubLObject max_floor_mts = NIL;
    max_floor_mts = genl_mts.max_floor_mts_from_mt_sets( min_mts_of_isa_paths( v_term, collection, tv ) );
    return max_floor_mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46145L)
  public static SubLObject max_floor_mts_of_quoted_isa_paths(final SubLObject v_term, final SubLObject collection, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collection, $sym12$EL_FORT_P );
    SubLObject max_floor_mts = NIL;
    max_floor_mts = genl_mts.max_floor_mts_from_mt_sets( min_mts_of_quoted_isa_paths( v_term, collection, tv ) );
    return max_floor_mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46575L)
  public static SubLObject min_mts_of_isa_paths(final SubLObject v_term, final SubLObject collection, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( NIL != cycl_grammar.cycl_quoted_term_p( v_term ) )
    {
      final SubLObject denoted_term = czer_main.unquote_quoted_term( v_term, UNPROVIDED );
      if( NIL != denoted_term )
      {
        return min_mts_of_quoted_isa_paths( denoted_term, collection, tv );
      }
    }
    else
    {
      if( NIL == term.first_order_nautP( v_term ) )
      {
        final SubLObject isa_mts = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, collection, tv );
        SubLObject defn_mts = NIL;
        if( NIL != at_defns.any_sufficient_defn_anywhereP( collection ) )
        {
          defn_mts = Mapping.mapcar( Symbols.symbol_function( $sym170$LIST ), at_defns.max_mts_of_admitting_defns( v_term, collection ) );
        }
        return ConsesLow.nconc( isa_mts, defn_mts );
      }
      final SubLObject isa_mts = nat_min_mts_of_isa_paths( v_term, collection );
      if( NIL != isa_mts )
      {
        return isa_mts;
      }
      if( NIL != at_defns.any_sufficient_defn_anywhereP( collection ) )
      {
        return Mapping.mapcar( Symbols.symbol_function( $sym170$LIST ), at_defns.max_mts_of_admitting_defns( v_term, collection ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47505L)
  public static SubLObject nat_min_mts_of_isa_paths(final SubLObject nat, final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = cycl_utilities.find_ground_naut( nat );
    if( NIL != v_term )
    {
      return min_mts_of_isa_paths( v_term, collection, UNPROVIDED );
    }
    SubLObject result = NIL;
    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      SubLObject cdolist_list_var;
      final SubLObject assertions = cdolist_list_var = czer_meta.find_assertions_cycl( el_utilities.make_binary_formula( $const0$isa, nat, collection ), UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = ConsesLow.list( assertions_high.assertion_mt( assertion ) );
        if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( $sym171$SETS_EQUAL_ ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result = ConsesLow.cons( item_var, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
    _prev_bind_2 = control_vars.$mapping_gather_arg$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_target$.bind( collection, thread );
      control_vars.$mapping_gather_arg$.bind( TWO_INTEGER, thread );
      control_vars.$mapping_answer$.bind( NIL, thread );
      final SubLObject _prev_bind_0_$459 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$460 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
        kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym172$GATHER_MIN_MTS_OF_PATHS_BETWEEN ), cycl_utilities.nat_functor( nat ), ONE_INTEGER, $const154$resultIsa, $kw173$TRUE, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$460, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$459, thread );
      }
      if( NIL != control_vars.$mapping_answer$.getDynamicValue( thread ) )
      {
        SubLObject cdolist_list_var = control_vars.$mapping_answer$.getDynamicValue( thread );
        SubLObject mts = NIL;
        mts = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var = mts;
          if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( $sym171$SETS_EQUAL_ ), Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          mts = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_3, thread );
      control_vars.$mapping_gather_arg$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = control_vars.$mapping_gather_arg$.currentBinding( thread );
    _prev_bind_2 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_gather_arg$.bind( TWO_INTEGER, thread );
      control_vars.$mapping_answer$.bind( Hashtables.make_hash_table( el_utilities.formula_arity( nat, UNPROVIDED ), UNPROVIDED, UNPROVIDED ), thread );
      final SubLObject _prev_bind_0_$460 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$461 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
        kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym174$CACHE_MTS_OF_ARG ), cycl_utilities.nat_functor( nat ), ONE_INTEGER, $const155$resultIsaArg, $kw173$TRUE, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$461, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$460, thread );
      }
      final SubLObject cdohash_table = control_vars.$mapping_answer$.getDynamicValue( thread );
      SubLObject argnum = NIL;
      SubLObject argnum_mts = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          argnum = Hashtables.getEntryKey( cdohash_entry );
          argnum_mts = Hashtables.getEntryValue( cdohash_entry );
          final SubLObject v_isa = cycl_utilities.formula_arg( nat, argnum, UNPROVIDED );
          SubLObject cdolist_list_var2 = genls.min_mts_of_genls_paths( v_isa, collection, UNPROVIDED );
          SubLObject mt_set = NIL;
          mt_set = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( NIL != mt_set )
            {
              SubLObject cdolist_list_var_$463 = argnum_mts;
              SubLObject mt = NIL;
              mt = cdolist_list_var_$463.first();
              while ( NIL != cdolist_list_var_$463)
              {
                final SubLObject min_mt_set = genl_mts.min_mts( conses_high.adjoin( mt, mt_set, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
                if( NIL != min_mt_set )
                {
                  final SubLObject item_var2 = min_mt_set;
                  if( NIL == conses_high.member( item_var2, result, Symbols.symbol_function( $sym171$SETS_EQUAL_ ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    result = ConsesLow.cons( item_var2, result );
                  }
                }
                cdolist_list_var_$463 = cdolist_list_var_$463.rest();
                mt = cdolist_list_var_$463.first();
              }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            mt_set = cdolist_list_var2.first();
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_gather_arg$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48950L)
  public static SubLObject min_mts_of_quoted_isa_paths(final SubLObject v_term, final SubLObject collection, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( NIL == term.first_order_nautP( v_term ) )
    {
      final SubLObject isa_mts = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, collection, tv );
      SubLObject defn_mts = NIL;
      if( NIL != at_defns.any_sufficient_quoted_defn_anywhereP( collection ) )
      {
        defn_mts = Mapping.mapcar( Symbols.symbol_function( $sym170$LIST ), at_defns.max_mts_of_admitting_quoted_defns( v_term, collection ) );
      }
      return ConsesLow.nconc( isa_mts, defn_mts );
    }
    final SubLObject quoted_isa_mts = nat_min_mts_of_quoted_isa_paths( v_term, collection );
    if( NIL != quoted_isa_mts )
    {
      return quoted_isa_mts;
    }
    if( NIL != at_defns.any_sufficient_quoted_defn_anywhereP( collection ) )
    {
      return Mapping.mapcar( Symbols.symbol_function( $sym170$LIST ), at_defns.max_mts_of_admitting_quoted_defns( v_term, collection ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49774L)
  public static SubLObject nat_min_mts_of_quoted_isa_paths(final SubLObject nat, final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = cycl_utilities.find_ground_naut( nat );
    if( NIL != v_term )
    {
      return min_mts_of_quoted_isa_paths( v_term, collection, UNPROVIDED );
    }
    SubLObject result = NIL;
    SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
    SubLObject _prev_bind_2 = control_vars.$mapping_gather_arg$.currentBinding( thread );
    SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_target$.bind( collection, thread );
      control_vars.$mapping_gather_arg$.bind( TWO_INTEGER, thread );
      control_vars.$mapping_answer$.bind( NIL, thread );
      final SubLObject _prev_bind_0_$464 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$465 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
        kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym172$GATHER_MIN_MTS_OF_PATHS_BETWEEN ), cycl_utilities.nat_functor( nat ), ONE_INTEGER, $const175$resultQuotedIsa, $kw173$TRUE, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$465, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$464, thread );
      }
      result = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_3, thread );
      control_vars.$mapping_gather_arg$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
    _prev_bind_2 = control_vars.$mapping_gather_arg$.currentBinding( thread );
    _prev_bind_3 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_target$.bind( collection, thread );
      control_vars.$mapping_gather_arg$.bind( TWO_INTEGER, thread );
      control_vars.$mapping_answer$.bind( NIL, thread );
      final SubLObject _prev_bind_0_$465 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$466 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
        kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym172$GATHER_MIN_MTS_OF_PATHS_BETWEEN ), cycl_utilities.nat_functor( nat ), ONE_INTEGER, $const176$evaluationResultQuotedIsa, $kw173$TRUE, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$466, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$465, thread );
      }
      final SubLObject item_var = result;
      if( NIL == conses_high.member( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ), Symbols.symbol_function( $sym171$SETS_EQUAL_ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
      }
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_3, thread );
      control_vars.$mapping_gather_arg$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50694L)
  public static SubLObject gather_min_mts_of_paths_between(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject source = assertions_high.gaf_arg( assertion, control_vars.$mapping_gather_arg$.getDynamicValue( thread ) );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    if( NIL != forts.fort_p( source ) )
    {
      SubLObject cdolist_list_var = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths( sbhl_module_vars.get_sbhl_module( $const44$genls ), source, control_vars.$mapping_target$.getDynamicValue( thread ), UNPROVIDED );
      SubLObject mt_set = NIL;
      mt_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != mt_set )
        {
          final SubLObject min_mt_set = genl_mts.min_mts( conses_high.adjoin( mt, mt_set, Symbols.symbol_function( $sym177$HLMT_EQUAL ), UNPROVIDED ), UNPROVIDED );
          if( NIL != min_mt_set )
          {
            final SubLObject item_var = min_mt_set;
            if( NIL == conses_high.member( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ), Symbols.symbol_function( $sym171$SETS_EQUAL_ ), Symbols.symbol_function( IDENTITY ) ) )
            {
              control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        mt_set = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51220L)
  public static SubLObject cache_mts_of_arg(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      hash_table_utilities.push_hash( assertions_high.gaf_arg( assertion, control_vars.$mapping_gather_arg$.getDynamicValue( thread ) ), assertions_high.assertion_mt( assertion ), control_vars.$mapping_answer$
          .getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51415L)
  public static SubLObject max_floor_mts_of_not_isa_paths(final SubLObject v_term, final SubLObject not_col, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths( sbhl_module_vars.get_sbhl_module( $const0$isa ), not_col, v_term, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51734L)
  public static SubLObject min_mts_of_not_isa_paths(final SubLObject v_term, final SubLObject not_col, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths( sbhl_module_vars.get_sbhl_module( $const0$isa ), not_col, v_term, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52042L)
  public static SubLObject instantiationP(final SubLObject v_term, final SubLObject v_set, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_set ) )
    {
      return isaP( v_term, v_set, mt, UNPROVIDED );
    }
    if( NIL != set_naut_p( v_set ) )
    {
      return member_of_cycl_setP( v_term, v_set );
    }
    if( NIL != el_utilities.specs_fn_naut_p( v_set ) )
    {
      return genls.genlP( v_term, el_utilities.specs_fn_arg( v_set ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52448L)
  public static SubLObject instantiations(final SubLObject v_set, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_set ) )
    {
      return instances( v_set, mt, UNPROVIDED );
    }
    if( NIL != set_naut_p( v_set ) )
    {
      return members_of_cycl_set( v_set );
    }
    if( NIL != el_utilities.specs_fn_naut_p( v_set ) )
    {
      return genls.specs( el_utilities.specs_fn_arg( v_set ), mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52765L)
  public static SubLObject all_instantiations(final SubLObject v_set, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_set ) )
    {
      return all_instances( v_set, mt, UNPROVIDED );
    }
    if( NIL != set_naut_p( v_set ) )
    {
      return members_of_cycl_set( v_set );
    }
    if( NIL != el_utilities.specs_fn_naut_p( v_set ) )
    {
      return genls.all_specs( el_utilities.specs_fn_arg( v_set ), mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53087L)
  public static SubLObject random_instantiation(final SubLObject v_set, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != kb_accessors.kb_set_or_collection_p( v_set ) : v_set;
    if( NIL != forts.fort_p( v_set ) )
    {
      return random_instance_of( v_set, mt );
    }
    if( NIL != set_naut_p( v_set ) )
    {
      return random_member_of_cycl_set( v_set );
    }
    if( NIL != el_utilities.specs_fn_naut_p( v_set ) )
    {
      return genls.random_spec_of( el_utilities.specs_fn_arg( v_set ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53582L)
  public static SubLObject set_naut_p(final SubLObject obj)
  {
    return cycl_utilities.naut_with_functor_p( obj, $const179$TheSet );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53756L)
  public static SubLObject member_of_cycl_setP(final SubLObject v_term, final SubLObject v_set)
  {
    return subl_promotions.memberP( v_term, cycl_utilities.nat_args( v_set, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53851L)
  public static SubLObject members_of_cycl_set(final SubLObject v_set)
  {
    return cycl_utilities.nat_args( v_set, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53918L)
  public static SubLObject random_member_of_cycl_set(final SubLObject v_set)
  {
    return list_utilities.random_element( members_of_cycl_set( v_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54019L)
  public static SubLObject isas_mts(final SubLObject fort)
  {
    return kb_accessors.pred_mts( fort, $const0$isa, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54279L)
  public static SubLObject isa_mts(final SubLObject fort)
  {
    return kb_accessors.pred_mts( fort, $const0$isa, $list180 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54408L)
  public static SubLObject type_mts(final SubLObject fort)
  {
    return isa_mts( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54508L)
  public static SubLObject asserted_isaP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54708L)
  public static SubLObject asserted_isa(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54895L)
  public static SubLObject asserted_not_isa(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_false_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55088L)
  public static SubLObject supported_isa(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_true_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55278L)
  public static SubLObject supported_not_isa(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_false_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55474L)
  public static SubLObject asserted_instance(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55681L)
  public static SubLObject asserted_not_instance(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_false_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55892L)
  public static SubLObject supported_instance(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_true_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56100L)
  public static SubLObject supported_not_instance(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_false_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$isa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56314L)
  public static SubLObject instanceof_after_adding(SubLObject source, final SubLObject assertion)
  {
    return isa_after_adding( source, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56617L)
  public static SubLObject isa_after_adding(SubLObject source, final SubLObject assertion)
  {
    sbhl_link_methods.sbhl_after_adding( source, assertion, sbhl_module_vars.get_sbhl_module( $const0$isa ) );
    sbhl_cache.sbhl_cache_addition_maintainence( assertion );
    after_adding_modules.clear_isa_dependent_caches( source, assertion );
    possibly_propagate_isa_collection_subset_fn_the_set_of( assertion );
    possibly_propagate_isa_the_collection_of( assertion );
    sbhl_link_methods.possibly_add_non_fort_isa( assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57128L)
  public static SubLObject possibly_propagate_isa_collection_subset_fn_the_set_of(final SubLObject assertion)
  {
    if( NIL != assertion_utilities.true_assertionP( assertion ) )
    {
      final SubLObject isa_formula = fi.assertion_fi_formula( assertion, UNPROVIDED );
      SubLObject current;
      final SubLObject datum = current = isa_formula;
      SubLObject v_isa = NIL;
      SubLObject v_term = NIL;
      SubLObject subset_expr = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list183 );
      v_isa = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list183 );
      v_term = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list183 );
      subset_expr = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( v_isa.eql( $const0$isa ) && NIL != el_utilities.el_formula_with_operator_p( subset_expr, $const184$CollectionSubsetFn ) )
        {
          SubLObject current_$469;
          final SubLObject datum_$468 = current_$469 = subset_expr;
          SubLObject csfn = NIL;
          SubLObject col = NIL;
          SubLObject colexpr = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$469, datum_$468, $list185 );
          csfn = current_$469.first();
          current_$469 = current_$469.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$469, datum_$468, $list185 );
          col = current_$469.first();
          current_$469 = current_$469.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$469, datum_$468, $list185 );
          colexpr = current_$469.first();
          current_$469 = current_$469.rest();
          if( NIL == current_$469 )
          {
            possibly_propagate_isa_the_set_of( colexpr, v_term, assertion );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum_$468, $list185 );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list183 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57865L)
  public static SubLObject possibly_propagate_isa_the_collection_of(final SubLObject assertion)
  {
    if( NIL != assertion_utilities.true_assertionP( assertion ) )
    {
      final SubLObject isa_formula = fi.assertion_fi_formula( assertion, UNPROVIDED );
      SubLObject current;
      final SubLObject datum = current = isa_formula;
      SubLObject v_isa = NIL;
      SubLObject v_term = NIL;
      SubLObject colexpr = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
      v_isa = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
      v_term = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
      colexpr = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( v_isa.eql( $const0$isa ) && NIL != el_utilities.el_formula_with_operator_p( colexpr, $const187$TheCollectionOf ) )
        {
          possibly_propagate_isa_the_set_of( colexpr, v_term, assertion );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list186 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58452L)
  public static SubLObject possibly_propagate_isa_the_set_of(final SubLObject colexpr, final SubLObject v_term, final SubLObject assertion)
  {
    SubLObject tso = NIL;
    SubLObject var = NIL;
    SubLObject prop = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( colexpr, colexpr, $list188 );
    tso = colexpr.first();
    SubLObject current = colexpr.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, colexpr, $list188 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, colexpr, $list188 );
    prop = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject transformed_conclusion = cycl_utilities.expression_subst( v_term, var, prop, UNPROVIDED, UNPROVIDED );
      final SubLObject mt = assertions_high.assertion_mt( assertion );
      fi.fi_add_argument_int( transformed_conclusion, mt, ConsesLow.list( assertion ), $kw189$FORWARD, T );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( colexpr, $list188 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58806L)
  public static SubLObject instanceof_after_removing(SubLObject source, final SubLObject assertion)
  {
    return isa_after_removing( source, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59037L)
  public static SubLObject isa_after_removing(SubLObject source, final SubLObject assertion)
  {
    sbhl_link_methods.sbhl_after_removing( source, assertion, sbhl_module_vars.get_sbhl_module( $const0$isa ) );
    sbhl_cache.sbhl_cache_removal_maintainence( assertion );
    sbhl_link_methods.possibly_remove_non_fort_isa( assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59330L)
  public static SubLObject clear_isa_graph()
  {
    sbhl_link_methods.clear_sbhl_module_graph( sbhl_module_vars.get_sbhl_module( $const0$isa ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59568L)
  public static SubLObject clear_node_isa_links(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$isa ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$isa ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$isa ), thread );
      SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts( sbhl_module_vars.get_sbhl_module( $const0$isa ), node );
      SubLObject mt = NIL;
      mt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sbhl_link_methods.clear_sbhl_links_within_mt( node, mt, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        mt = cdolist_list_var.first();
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59777L)
  public static SubLObject reset_isa_links(final SubLObject node)
  {
    final SubLObject mts = isas_mts( node );
    clear_node_isa_links( node );
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      reset_isa_links_in_mt( node, mt );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59948L)
  public static SubLObject reset_isa_links_in_mt(final SubLObject node, final SubLObject mt)
  {
    sbhl_link_methods.sbhl_recompute_links( node, mt, sbhl_module_vars.get_sbhl_module( $const0$isa ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60066L)
  public static SubLObject reset_isa_graph(SubLObject clearP)
  {
    if( clearP == UNPROVIDED )
    {
      clearP = T;
    }
    if( NIL != clearP )
    {
      clear_isa_graph();
    }
    sbhl_link_methods.sbhl_recompute_graph_links( sbhl_module_vars.get_sbhl_module( $const0$isa ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60230L)
  public static SubLObject quoted_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    SubLObject result = sbhl_link_methods.sbhl_forward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, mt, tv, UNPROVIDED );
    if( NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p( v_term ) )
    {
      result = list_utilities.fast_delete_duplicates( ConsesLow.nconc( sbhl_link_methods.quoted_isas_from_naut_arg2( v_term, mt, tv ), result ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60742L)
  public static SubLObject nat_quoted_isa(final SubLObject naut, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject nart = narts_high.find_nart( naut );
    if( NIL != nart_handles.nart_p( nart ) )
    {
      return quoted_isa( nart, mt, tv );
    }
    final SubLObject nat_functor = cycl_utilities.nat_functor( naut );
    return ConsesLow.nconc( kb_accessors.evaluation_result_quoted_isa( nat_functor, mt ), kb_accessors.result_quoted_isa( nat_functor, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61043L)
  public static SubLObject not_quoted_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_forward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61228L)
  public static SubLObject quoted_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( collection, $sym12$EL_FORT_P );
    return makeBoolean( NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, collection, mt, tv ) || NIL != ( ( NIL != sbhl_link_methods
        .quoted_isa_stored_naut_arg2_p( v_term ) ) ? genls.any_specP( collection, sbhl_link_methods.quoted_isas_from_naut_arg2( v_term, mt, tv ), mt, tv ) : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61827L)
  public static SubLObject quoted_isa_in_any_mtP(final SubLObject v_term, final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject qisaP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      qisaP = quoted_isaP( v_term, collection, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return qisaP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62064L)
  public static SubLObject any_quoted_isaP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collections, $sym74$LISTP );
    if( NIL == collections )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( collections ) )
    {
      return quoted_isaP( v_term, collections.first(), mt, tv );
    }
    return makeBoolean( NIL != sbhl_search_methods.sbhl_predicate_relation_with_any_p( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, collections, mt, tv ) || NIL != ( ( NIL != sbhl_link_methods
        .quoted_isa_stored_naut_arg2_p( v_term ) ) ? genls.any_genl_anyP( sbhl_link_methods.quoted_isas_from_naut_arg2( v_term, mt, tv ), collections, mt, tv ) : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62668L)
  public static SubLObject quoted_isa_anyP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collections, $sym74$LISTP );
    return any_quoted_isaP( v_term, collections, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62944L)
  public static SubLObject all_quoted_isaP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collections, $sym74$LISTP );
    if( NIL == collections )
    {
      return T;
    }
    if( NIL != list_utilities.singletonP( collections ) )
    {
      return quoted_isaP( v_term, collections.first(), mt, tv );
    }
    return makeBoolean( NIL != sbhl_search_methods.sbhl_predicate_relation_with_all_p( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, collections, mt, tv ) || NIL != ( ( NIL != sbhl_link_methods
        .quoted_isa_stored_naut_arg2_p( v_term ) ) ? genls.any_genl_allP( sbhl_link_methods.quoted_isas_from_naut_arg2( v_term, mt, tv ), collections, mt, tv ) : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63553L)
  public static SubLObject not_quoted_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collection, $sym12$EL_FORT_P );
    return makeBoolean( NIL != not_quoted_isa_by_extent_knownP( v_term, collection, mt, tv ) || NIL != not_quoted_isa_by_sbhlP( v_term, collection, mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63929L)
  public static SubLObject not_quoted_isa_by_sbhlP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, collection, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64109L)
  public static SubLObject not_quoted_isa_by_extent_knownP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( NIL != kb_accessors.completely_enumerable_collectionP( collection, mt ) )
    {
      return makeBoolean( NIL == quoted_isaP( v_term, collection, mt, tv ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64479L)
  public static SubLObject quoted_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = $const11$True_JustificationTruth;
    }
    enforceType( col, $sym12$EL_FORT_P );
    return sbhl_link_methods.sbhl_backward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), col, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64778L)
  public static SubLObject union_all_quoted_instances(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym74$LISTP );
    if( NIL == cols )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( cols ) )
    {
      return all_quoted_instances( cols.first(), mt, tv );
    }
    return sbhl_search_methods.sbhl_union_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), cols, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65196L)
  public static SubLObject map_all_quoted_isa(final SubLObject fn, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( fn, $sym46$FUNCTION_SPEC_P );
    enforceType( v_term, $sym1$HL_TERM_P );
    sbhl_search_methods.sbhl_map_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, fn, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65577L)
  public static SubLObject map_all_quoted_instances(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    sbhl_search_methods.sbhl_map_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), col, fn, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65892L)
  public static SubLObject map_quoted_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject module = sbhl_module_vars.get_sbhl_module( $const122$quotedIsa );
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( module, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$470 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$471 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$472 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject tv_var = tv;
        final SubLObject _prev_bind_0_$471 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$472 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw31$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw34$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw36$WARN ) )
            {
              Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$472 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$473 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$473 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const11$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$473 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw38$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$474 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw38$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$475 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$474 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$474 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$483 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$484 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( module );
                    SubLObject rest;
                    SubLObject module_var;
                    SubLObject _prev_bind_0_$476;
                    SubLObject _prev_bind_1_$475;
                    SubLObject node;
                    SubLObject d_link;
                    SubLObject mt_links;
                    SubLObject iteration_state;
                    SubLObject mt_$487;
                    SubLObject tv_links;
                    SubLObject _prev_bind_0_$477;
                    SubLObject iteration_state_$489;
                    SubLObject tv_$490;
                    SubLObject link_nodes;
                    SubLObject _prev_bind_0_$478;
                    SubLObject sol;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject quoted_isa;
                    SubLObject csome_list_var;
                    SubLObject quoted_isa2;
                    SubLObject new_list;
                    SubLObject rest_$492;
                    SubLObject generating_fn;
                    SubLObject _prev_bind_0_$479;
                    SubLObject sol2;
                    SubLObject link_nodes2;
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject quoted_isa3;
                    SubLObject csome_list_var2;
                    SubLObject quoted_isa4;
                    for( rest = NIL, rest = accessible_modules; NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != rest; rest = rest.rest() )
                    {
                      module_var = rest.first();
                      _prev_bind_0_$476 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      _prev_bind_1_$475 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        node = function_terms.naut_to_nart( v_term );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread )
                                  && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                mt_$487 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$487 ) )
                                {
                                  _prev_bind_0_$477 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$487, thread );
                                    for( iteration_state_$489 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(
                                        thread ) && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state_$489 ); iteration_state_$489 = dictionary_contents.do_dictionary_contents_next(
                                            iteration_state_$489 ) )
                                    {
                                      thread.resetMultipleValues();
                                      tv_$490 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$489 );
                                      link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$490 ) )
                                      {
                                        _prev_bind_0_$478 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv_$490, thread );
                                          sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            set_contents_var = set.do_set_internal( sol );
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL == set_contents.do_set_contents_doneP( basis_object,
                                                    state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              quoted_isa = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, quoted_isa ) )
                                              {
                                                Functions.funcall( function, quoted_isa );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            if( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) )
                                            {
                                              csome_list_var = sol;
                                              quoted_isa2 = NIL;
                                              quoted_isa2 = csome_list_var.first();
                                              while ( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != csome_list_var)
                                              {
                                                Functions.funcall( function, quoted_isa2 );
                                                csome_list_var = csome_list_var.rest();
                                                quoted_isa2 = csome_list_var.first();
                                              }
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$478, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$489 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$477, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                              .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          for( rest_$492 = NIL, rest_$492 = new_list; NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != rest_$492; rest_$492 = rest_$492.rest() )
                          {
                            generating_fn = rest_$492.first();
                            _prev_bind_0_$479 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                set_contents_var2 = set.do_set_internal( sol2 );
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents
                                        .do_set_contents_update_state( state2 ) )
                                {
                                  quoted_isa3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, quoted_isa3 ) )
                                  {
                                    Functions.funcall( function, quoted_isa3 );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                if( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) )
                                {
                                  csome_list_var2 = sol2;
                                  quoted_isa4 = NIL;
                                  quoted_isa4 = csome_list_var2.first();
                                  while ( NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue( thread ) && NIL != csome_list_var2)
                                  {
                                    Functions.funcall( function, quoted_isa4 );
                                    csome_list_var2 = csome_list_var2.rest();
                                    quoted_isa4 = csome_list_var2.first();
                                  }
                                }
                              }
                              else
                              {
                                Errors.error( $str39$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$479, thread );
                            }
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$475, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$476, thread );
                      }
                    }
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$484, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$483, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$474, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$474, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$475, thread );
                }
                if( source == $kw41$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$474, thread );
              }
              if( source == $kw41$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$473, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$473, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$473, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$472, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$472, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$471, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$472, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$471, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$470, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    if( NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p( v_term ) )
    {
      module = sbhl_module_vars.get_sbhl_module( $const44$genls );
      final SubLObject mt_var2 = mt;
      final SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_7 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_8 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
        final SubLObject tv_var2 = tv;
        final SubLObject _prev_bind_0_$480 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$476 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var2 ) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var2 ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var2 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var2 ) )
          {
            final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var2.eql( $kw31$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var2, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var2.eql( $kw34$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var2, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var2.eql( $kw36$WARN ) )
            {
              Errors.warn( $str32$_A_is_not_a__A, tv_var2, $sym33$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var2, $sym33$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$481 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_module_vars.$sbhl_module$.bind( module, thread );
            SubLObject cdolist_list_var = Hashtables.gethash( v_term, sbhl_link_methods.$quoted_isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED );
            SubLObject quoted_isa_tuple = NIL;
            quoted_isa_tuple = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = quoted_isa_tuple;
              SubLObject naut = NIL;
              SubLObject quoted_isa_mt = NIL;
              SubLObject quoted_isa_tv = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list205 );
              naut = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list205 );
              quoted_isa_mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list205 );
              quoted_isa_tv = current.first();
              current = current.rest();
              if( NIL == current )
              {
                if( NIL != mt_relevance_macros.relevant_mtP( quoted_isa_mt ) && NIL != sbhl_search_vars.relevant_sbhl_tvP( quoted_isa_tv ) )
                {
                  final SubLObject quoted_isa5 = naut;
                  Functions.funcall( function, quoted_isa5 );
                  SubLObject cdolist_list_var_$497;
                  final SubLObject new_list2 = cdolist_list_var_$497 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                      .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), module ) )
                      : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), module ) );
                  SubLObject generating_fn2 = NIL;
                  generating_fn2 = cdolist_list_var_$497.first();
                  while ( NIL != cdolist_list_var_$497)
                  {
                    final SubLObject _prev_bind_0_$482 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                    try
                    {
                      sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                      final SubLObject quoted_isa6 = Functions.funcall( generating_fn2, naut );
                      Functions.funcall( function, quoted_isa6 );
                    }
                    finally
                    {
                      sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$482, thread );
                    }
                    cdolist_list_var_$497 = cdolist_list_var_$497.rest();
                    generating_fn2 = cdolist_list_var_$497.first();
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list205 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              quoted_isa_tuple = cdolist_list_var.first();
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$481, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$476, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$480, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_8, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_7, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_6, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66521L)
  public static SubLObject map_min_quoted_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    map_quoted_isa( function, v_term, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66673L)
  public static SubLObject all_quoted_isa(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$HL_TERM_P );
    SubLObject result = sbhl_search_methods.sbhl_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, mt, tv );
    if( NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p( v_term ) )
    {
      result = list_utilities.fast_delete_duplicates( ConsesLow.nconc( genls.union_all_genls( sbhl_link_methods.quoted_isas_from_naut_arg2( v_term, mt, tv ), mt, tv ), result ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
    }
    if( NIL == $sbhl_may_return_naut_collections_as_fortsP$.getDynamicValue( thread ) )
    {
      result = list_utilities.remove_if_not( $sym2$FORT_P, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67366L)
  public static SubLObject all_quoted_isa_in_any_mt(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_isa = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      all_isa = all_quoted_isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_isa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67580L)
  public static SubLObject all_quoted_isa_in_mt(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_isa = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      all_isa = all_quoted_isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_isa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67810L)
  public static SubLObject all_quoted_isa_in_mts(final SubLObject v_term, SubLObject mts)
  {
    if( mts == UNPROVIDED )
    {
      mts = genl_mts.all_base_mts( mt_relevance_macros.$mt$.getDynamicValue() );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_isa = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym56$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      all_isa = all_quoted_isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_isa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68083L)
  public static SubLObject all_quoted_isas_wrt(final SubLObject v_term, final SubLObject v_isa, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym12$EL_FORT_P );
    enforceType( v_isa, $sym12$EL_FORT_P );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $all_isas_wrt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $all_isas_wrt_isa$.currentBinding( thread );
    try
    {
      $all_isas_wrt$.bind( NIL, thread );
      $all_isas_wrt_isa$.bind( v_isa, thread );
      map_all_quoted_isa( $sym69$GATHER_ISA_WRT_ISA, v_term, mt, tv );
      result = $all_isas_wrt$.getDynamicValue( thread );
    }
    finally
    {
      $all_isas_wrt_isa$.rebind( _prev_bind_2, thread );
      $all_isas_wrt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68703L)
  public static SubLObject all_quoted_instances(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym12$EL_FORT_P );
    return sbhl_search_methods.sbhl_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68966L)
  public static SubLObject all_quoted_instances_in_all_mts(final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym54$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const55$EverythingPSC, thread );
      result = all_quoted_instances( collection, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 69199L)
  public static SubLObject all_quoted_isa_among(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( v_term, $sym1$HL_TERM_P );
    enforceType( collections, $sym74$LISTP );
    if( NIL == collections )
    {
      return NIL;
    }
    if( NIL == list_utilities.singletonP( collections ) )
    {
      return sbhl_search_methods.sbhl_all_forward_true_nodes_among( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, collections, mt, tv );
    }
    if( NIL != quoted_isaP( v_term, collections.first(), mt, tv ) )
    {
      return collections;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 69761L)
  public static SubLObject asserted_quoted_isaP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70098L)
  public static SubLObject asserted_quoted_isa(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_links( sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ), v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70305L)
  public static SubLObject quoted_instanceof_after_adding(SubLObject source, final SubLObject assertion)
  {
    sbhl_link_methods.sbhl_after_adding( source, assertion, sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) );
    sbhl_cache.sbhl_cache_addition_maintainence( assertion );
    after_adding_modules.clear_quoted_isa_dependent_caches( source, assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70842L)
  public static SubLObject quoted_instanceof_after_removing(SubLObject source, final SubLObject assertion)
  {
    sbhl_link_methods.sbhl_after_removing( source, assertion, sbhl_module_vars.get_sbhl_module( $const122$quotedIsa ) );
    sbhl_cache.sbhl_cache_removal_maintainence( assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71176L)
  public static SubLObject all_instances_via_indexing(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return instances_via_indexing( col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 72425L)
  public static SubLObject instances_via_indexing(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = $const0$isa;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( col, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( col, TWO_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw213$GAF, $kw173$TRUE, NIL );
              SubLObject done_var_$499 = NIL;
              final SubLObject token_var_$500 = NIL;
              while ( NIL == done_var_$499)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$500 );
                final SubLObject valid_$501 = makeBoolean( !token_var_$500.eql( gaf ) );
                if( NIL != valid_$501 )
                {
                  final SubLObject ins = assertions_high.gaf_arg1( gaf );
                  result = ConsesLow.cons( ins, result );
                }
                done_var_$499 = makeBoolean( NIL == valid_$501 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$502 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$502, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  public static SubLObject declare_isa_file()
  {
    SubLFiles.declareFunction( me, "isa", "ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "min_isa", "MIN-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "min_isa_in_mt", "MIN-ISA-IN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "nat_isa", "NAT-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "naut_isa", "NAUT-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "not_isa", "NOT-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "max_not_isa", "MAX-NOT-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "nat_max_not_isa", "NAT-MAX-NOT-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "instances", "INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "max_instances", "MAX-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "all_instances_with_max", "ALL-INSTANCES-WITH-MAX", 2, 0, false );
    SubLFiles.declareFunction( me, "not_instances", "NOT-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "min_not_instances", "MIN-NOT-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "isa_siblings", "ISA-SIBLINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "instance_siblings", "INSTANCE-SIBLINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "map_isa", "MAP-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "map_min_isa", "MAP-MIN-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "map_instances", "MAP-INSTANCES", 2, 2, false );
    SubLFiles.declareFunction( me, "min_isas_of_type", "MIN-ISAS-OF-TYPE", 2, 2, false );
    SubLFiles.declareFunction( me, "all_isa", "ALL-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "all_isa_in_any_mt", "ALL-ISA-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "all_isa_in_mt", "ALL-ISA-IN-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "all_isa_in_mts", "ALL-ISA-IN-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "nat_all_isa", "NAT-ALL-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "all_instances", "ALL-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "all_instances_in_all_mts", "ALL-INSTANCES-IN-ALL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_fort_instances", "ALL-FORT-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "all_non_prototypical_fort_instances", "ALL-NON-PROTOTYPICAL-FORT-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "all_fort_instances_in_all_mts", "ALL-FORT-INSTANCES-IN-ALL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_isas_wrt", "ALL-ISAS-WRT", 2, 2, false );
    SubLFiles.declareFunction( me, "gather_isa_wrt_isa", "GATHER-ISA-WRT-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "union_all_isa", "UNION-ALL-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "union_all_instances", "UNION-ALL-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "all_isa_among", "ALL-ISA-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "isa_allP", "ISA-ALL?", 3, 0, false );
    SubLFiles.declareFunction( me, "min_isa_among", "MIN-ISA-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "all_instances_among", "ALL-INSTANCES-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "all_instances_among_fast", "ALL-INSTANCES-AMONG-FAST", 2, 1, false );
    SubLFiles.declareFunction( me, "all_isa_if", "ALL-ISA-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "all_instances_if", "ALL-INSTANCES-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "all_isa_if_with_pruning", "ALL-ISA-IF-WITH-PRUNING", 2, 2, false );
    SubLFiles.declareFunction( me, "all_not_isa", "ALL-NOT-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "all_not_instances", "ALL-NOT-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "not_isa_among", "NOT-ISA-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "not_instances_among", "NOT-INSTANCES-AMONG", 0, 0, false );
    SubLFiles.declareFunction( me, "map_all_isa", "MAP-ALL-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_instances", "MAP-ALL-INSTANCES", 2, 2, false );
    SubLFiles.declareFunction( me, "any_all_isa", "ANY-ALL-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "any_wrt_all_isa", "ANY-WRT-ALL-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "any_all_forward_true_nodes_isa", "ANY-ALL-FORWARD-TRUE-NODES-ISA", 3, 2, false );
    SubLFiles.declareFunction( me, "sample_leaf_instances", "SAMPLE-LEAF-INSTANCES", 1, 3, false );
    SubLFiles.declareFunction( me, "sample_different_leaf_instances", "SAMPLE-DIFFERENT-LEAF-INSTANCES", 2, 3, false );
    SubLFiles.declareFunction( me, "sbhl_record_all_isa", "SBHL-RECORD-ALL-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "count_all_instances", "COUNT-ALL-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "count_all_instances_if", "COUNT-ALL-INSTANCES-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_instances_E", "COUNT-ALL-INSTANCES-=", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_instances_G", "COUNT-ALL-INSTANCES->", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_instances_GE", "COUNT-ALL-INSTANCES->=", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_instances_L", "COUNT-ALL-INSTANCES-<", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_instances_LE", "COUNT-ALL-INSTANCES-<=", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_quoted_instances", "COUNT-ALL-QUOTED-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "count_all_quoted_instances_if", "COUNT-ALL-QUOTED-INSTANCES-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_quoted_instances_E", "COUNT-ALL-QUOTED-INSTANCES-=", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_quoted_instances_G", "COUNT-ALL-QUOTED-INSTANCES->", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_quoted_instances_GE", "COUNT-ALL-QUOTED-INSTANCES->=", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_quoted_instances_L", "COUNT-ALL-QUOTED-INSTANCES-<", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_quoted_instances_LE", "COUNT-ALL-QUOTED-INSTANCES-<=", 2, 2, false );
    SubLFiles.declareFunction( me, "isaP", "ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "isa_in_mtsP", "ISA-IN-MTS?", 3, 0, false );
    SubLFiles.declareFunction( me, "isa_in_any_mtP", "ISA-IN-ANY-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "nat_isaP", "NAT-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "nat_isa_intP", "NAT-ISA-INT?", 3, 0, false );
    SubLFiles.declareFunction( me, "result_isa_colP", "RESULT-ISA-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "weak_not_result_isa_colP", "WEAK-NOT-RESULT-ISA-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "result_isa_arg_colP", "RESULT-ISA-ARG-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "weak_not_result_isa_arg_colP", "WEAK-NOT-RESULT-ISA-ARG-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "result_isa_inter_arg_colP", "RESULT-ISA-INTER-ARG-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "result_isa_inter_arg_reln_colP", "RESULT-ISA-INTER-ARG-RELN-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "isaP_goal", "ISA?-GOAL", 1, 0, false );
    SubLFiles.declareFunction( me, "any_isaP", "ANY-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "isa_anyP", "ISA-ANY?", 2, 2, false );
    SubLFiles.declareFunction( me, "nat_any_isaP", "NAT-ANY-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "find_if_isaP", "FIND-IF-ISA?", 2, 0, false );
    SubLFiles.declareFunction( me, "all_isaP", "ALL-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "all_instancesP", "ALL-INSTANCES?", 2, 2, false );
    SubLFiles.declareFunction( me, "any_isa_anyP", "ANY-ISA-ANY?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_isaP", "NOT-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_isa_someP", "NOT-ISA-SOME?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_isa_by_sbhlP", "NOT-ISA-BY-SBHL?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_isa_by_extent_knownP", "NOT-ISA-BY-EXTENT-KNOWN?", 2, 2, false );
    SubLFiles.declareFunction( me, "argue_not_isaP", "ARGUE-NOT-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_isa_in_any_mtP", "NOT-ISA-IN-ANY-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "nat_not_isaP", "NAT-NOT-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "why_isaP", "WHY-ISA?", 2, 3, false );
    SubLFiles.declareFunction( me, "any_just_of_isa", "ANY-JUST-OF-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "any_just_of_nat_isa", "ANY-JUST-OF-NAT-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_isaP", "WHY-NOT-ISA?", 2, 3, false );
    SubLFiles.declareFunction( me, "any_just_of_not_isa", "ANY-JUST-OF-NOT-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "any_just_of_nat_not_isa", "ANY-JUST-OF-NAT-NOT-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "instancesP", "INSTANCES?", 1, 2, false );
    SubLFiles.declareFunction( me, "instancesP_int", "INSTANCES?-INT", 1, 2, false );
    SubLFiles.declareFunction( me, "forts_of_type", "FORTS-OF-TYPE", 2, 2, false );
    SubLFiles.declareFunction( me, "all_isa_mts", "ALL-ISA-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_genls_mts", "GATHER-GENLS-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "partial_isa_extensionP", "PARTIAL-ISA-EXTENSION?", 1, 1, false );
    SubLFiles.declareFunction( me, "random_instance_of", "RANDOM-INSTANCE-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "min_ceiling_isa", "MIN-CEILING-ISA", 1, 3, false );
    SubLFiles.declareFunction( me, "nearest_common_isa", "NEAREST-COMMON-ISA", 1, 3, false );
    SubLFiles.declareFunction( me, "max_floor_instances", "MAX-FLOOR-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_isa_paths_wrt", "MAX-FLOOR-MTS-OF-ISA-PATHS-WRT", 3, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_isa_paths", "MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_quoted_isa_paths", "MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "min_mts_of_isa_paths", "MIN-MTS-OF-ISA-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "nat_min_mts_of_isa_paths", "NAT-MIN-MTS-OF-ISA-PATHS", 2, 0, false );
    SubLFiles.declareFunction( me, "min_mts_of_quoted_isa_paths", "MIN-MTS-OF-QUOTED-ISA-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "nat_min_mts_of_quoted_isa_paths", "NAT-MIN-MTS-OF-QUOTED-ISA-PATHS", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_min_mts_of_paths_between", "GATHER-MIN-MTS-OF-PATHS-BETWEEN", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_mts_of_arg", "CACHE-MTS-OF-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_not_isa_paths", "MAX-FLOOR-MTS-OF-NOT-ISA-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "min_mts_of_not_isa_paths", "MIN-MTS-OF-NOT-ISA-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "instantiationP", "INSTANTIATION?", 2, 1, false );
    SubLFiles.declareFunction( me, "instantiations", "INSTANTIATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_instantiations", "ALL-INSTANTIATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "random_instantiation", "RANDOM-INSTANTIATION", 1, 1, false );
    SubLFiles.declareFunction( me, "set_naut_p", "SET-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "member_of_cycl_setP", "MEMBER-OF-CYCL-SET?", 2, 0, false );
    SubLFiles.declareFunction( me, "members_of_cycl_set", "MEMBERS-OF-CYCL-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "random_member_of_cycl_set", "RANDOM-MEMBER-OF-CYCL-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "isas_mts", "ISAS-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_mts", "ISA-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "type_mts", "TYPE-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_isaP", "ASSERTED-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_isa", "ASSERTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_not_isa", "ASSERTED-NOT-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_isa", "SUPPORTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_not_isa", "SUPPORTED-NOT-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_instance", "ASSERTED-INSTANCE", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_not_instance", "ASSERTED-NOT-INSTANCE", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_instance", "SUPPORTED-INSTANCE", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_not_instance", "SUPPORTED-NOT-INSTANCE", 1, 1, false );
    SubLFiles.declareFunction( me, "instanceof_after_adding", "INSTANCEOF-AFTER-ADDING", 2, 0, false );
    new $instanceof_after_adding$BinaryFunction();
    SubLFiles.declareFunction( me, "isa_after_adding", "ISA-AFTER-ADDING", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_propagate_isa_collection_subset_fn_the_set_of", "POSSIBLY-PROPAGATE-ISA-COLLECTION-SUBSET-FN-THE-SET-OF", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_propagate_isa_the_collection_of", "POSSIBLY-PROPAGATE-ISA-THE-COLLECTION-OF", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_propagate_isa_the_set_of", "POSSIBLY-PROPAGATE-ISA-THE-SET-OF", 3, 0, false );
    SubLFiles.declareFunction( me, "instanceof_after_removing", "INSTANCEOF-AFTER-REMOVING", 2, 0, false );
    new $instanceof_after_removing$BinaryFunction();
    SubLFiles.declareFunction( me, "isa_after_removing", "ISA-AFTER-REMOVING", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_isa_graph", "CLEAR-ISA-GRAPH", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_node_isa_links", "CLEAR-NODE-ISA-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_isa_links", "RESET-ISA-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_isa_links_in_mt", "RESET-ISA-LINKS-IN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_isa_graph", "RESET-ISA-GRAPH", 0, 1, false );
    SubLFiles.declareFunction( me, "quoted_isa", "QUOTED-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "nat_quoted_isa", "NAT-QUOTED-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "not_quoted_isa", "NOT-QUOTED-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "quoted_isaP", "QUOTED-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "quoted_isa_in_any_mtP", "QUOTED-ISA-IN-ANY-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "any_quoted_isaP", "ANY-QUOTED-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "quoted_isa_anyP", "QUOTED-ISA-ANY?", 2, 2, false );
    SubLFiles.declareFunction( me, "all_quoted_isaP", "ALL-QUOTED-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_quoted_isaP", "NOT-QUOTED-ISA?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_quoted_isa_by_sbhlP", "NOT-QUOTED-ISA-BY-SBHL?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_quoted_isa_by_extent_knownP", "NOT-QUOTED-ISA-BY-EXTENT-KNOWN?", 2, 2, false );
    SubLFiles.declareFunction( me, "quoted_instances", "QUOTED-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "union_all_quoted_instances", "UNION-ALL-QUOTED-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "map_all_quoted_isa", "MAP-ALL-QUOTED-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_quoted_instances", "MAP-ALL-QUOTED-INSTANCES", 2, 2, false );
    SubLFiles.declareFunction( me, "map_quoted_isa", "MAP-QUOTED-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "map_min_quoted_isa", "MAP-MIN-QUOTED-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "all_quoted_isa", "ALL-QUOTED-ISA", 1, 2, false );
    SubLFiles.declareFunction( me, "all_quoted_isa_in_any_mt", "ALL-QUOTED-ISA-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "all_quoted_isa_in_mt", "ALL-QUOTED-ISA-IN-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "all_quoted_isa_in_mts", "ALL-QUOTED-ISA-IN-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_quoted_isas_wrt", "ALL-QUOTED-ISAS-WRT", 2, 2, false );
    SubLFiles.declareFunction( me, "all_quoted_instances", "ALL-QUOTED-INSTANCES", 1, 2, false );
    SubLFiles.declareFunction( me, "all_quoted_instances_in_all_mts", "ALL-QUOTED-INSTANCES-IN-ALL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_quoted_isa_among", "ALL-QUOTED-ISA-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "asserted_quoted_isaP", "ASSERTED-QUOTED-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_quoted_isa", "ASSERTED-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "quoted_instanceof_after_adding", "QUOTED-INSTANCEOF-AFTER-ADDING", 2, 0, false );
    SubLFiles.declareFunction( me, "quoted_instanceof_after_removing", "QUOTED-INSTANCEOF-AFTER-REMOVING", 2, 0, false );
    SubLFiles.declareFunction( me, "all_instances_via_indexing", "ALL-INSTANCES-VIA-INDEXING", 1, 1, false );
    SubLFiles.declareFunction( me, "instances_via_indexing", "INSTANCES-VIA-INDEXING", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_isa_file()
  {
    $sbhl_may_return_naut_collections_as_fortsP$ = SubLFiles.defparameter( "*SBHL-MAY-RETURN-NAUT-COLLECTIONS-AS-FORTS?*", T );
    $all_isas_wrt$ = SubLFiles.defparameter( "*ALL-ISAS-WRT*", NIL );
    $all_isas_wrt_isa$ = SubLFiles.defparameter( "*ALL-ISAS-WRT-ISA*", NIL );
    $random_instance_of_sampling_ratio$ = SubLFiles.deflexical( "*RANDOM-INSTANCE-OF-SAMPLING-RATIO*", TWENTY_INTEGER );
    return NIL;
  }

  public static SubLObject setup_isa_file()
  {
    utilities_macros.register_cyc_api_function( $sym3$MIN_ISA, $list4, $str5$Returns_most_specific_collections, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym9$MAX_NOT_ISA, $list4, $str10$Returns_most_general_collections_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym13$INSTANCES, $list14, $str15$Returns_the_asserted_instances_of, $list16, $list7 );
    utilities_macros.register_cyc_api_function( $sym17$MAX_INSTANCES, $list18, $str19$Returns_the_maximal_among_the_ass, $list16, $list7 );
    access_macros.register_external_symbol( $sym20$ALL_INSTANCES_WITH_MAX );
    utilities_macros.register_cyc_api_function( $sym23$MIN_NOT_INSTANCES, $list18, $str24$Returns_the_most_specific_negated, $list16, $list7 );
    utilities_macros.register_cyc_api_function( $sym25$ISA_SIBLINGS, $list4, $str26$Returns_the_direct_isas_of_those_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym27$INSTANCE_SIBLINGS, $list4, $str28$Returns_the_direct_instances_of_t, $list29, $list7 );
    utilities_macros.register_cyc_api_function( $sym47$MAP_INSTANCES, $list48, $str49$apply_FUNCTION_to_every__least_ge, $list50, NIL );
    utilities_macros.register_cyc_api_function( $sym51$ALL_ISA, $list4, $str52$Returns_all_collections_that_incl, $list6, $list53 );
    utilities_macros.register_cyc_api_function( $sym57$ALL_INSTANCES, $list18, $str58$Returns_all_instances_of_COLLECTI, $list16, $list59 );
    utilities_macros.register_cyc_api_function( $sym60$ALL_INSTANCES_IN_ALL_MTS, $list61, $str62$_return_listp__all_instances_of_C, $list63, $list59 );
    access_macros.define_obsolete_register( $sym64$ALL_FORT_INSTANCES, $list65 );
    access_macros.register_external_symbol( $sym64$ALL_FORT_INSTANCES );
    access_macros.define_obsolete_register( $sym67$ALL_FORT_INSTANCES_IN_ALL_MTS, $list68 );
    utilities_macros.register_cyc_api_function( $sym70$ALL_ISAS_WRT, $list71, $str72$Returns_all_isa_of_term_TERM_that, $list73, $list7 );
    utilities_macros.register_cyc_api_function( $sym76$UNION_ALL_ISA, $list77, $str78$Returns_all_collections_that_incl, $list79, $list7 );
    utilities_macros.register_cyc_api_function( $sym80$UNION_ALL_INSTANCES, $list81, $str82$Returns_set_of_all_instances_of_e, $list83, $list7 );
    utilities_macros.register_cyc_api_function( $sym84$ALL_ISA_AMONG, $list85, $str86$Returns_those_elements_of_COLLECT, $list87, $list7 );
    utilities_macros.register_cyc_api_function( $sym88$ALL_INSTANCES_AMONG, $list89, $str90$Returns_those_elements_of_TERMS_t, $list91, $list59 );
    utilities_macros.register_cyc_api_function( $sym95$ALL_NOT_ISA, $list4, $str96$Returns_all_collections_that_do_n, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym97$ALL_NOT_INSTANCES, $list18, $str98$Returns_all_terms_that_are_not_me, $list16, $list7 );
    utilities_macros.register_cyc_api_function( $sym99$NOT_ISA_AMONG, $list85, $str100$Returns_those_elements_of_COLLECT, $list87, $list7 );
    utilities_macros.register_cyc_api_function( $sym101$MAP_ALL_ISA, $list102, $str103$Apply_FUNCTION_to_every_all_isa_o, $list104, NIL );
    utilities_macros.register_cyc_api_function( $sym105$MAP_ALL_INSTANCES, $list106, $str107$Apply_FUNCTION_to_each_unique_ins, $list108, NIL );
    utilities_macros.register_cyc_api_function( $sym109$ANY_WRT_ALL_ISA, $list48, $str110$Return_the_first_encountered_non_, $list111, NIL );
    utilities_macros.register_cyc_api_function( $sym118$COUNT_ALL_INSTANCES, $list119, $str120$Counts_the_number_of_instances_in, $list63, $list121 );
    utilities_macros.register_cyc_api_function( $sym123$COUNT_ALL_QUOTED_INSTANCES, $list119, $str124$Counts_the_number_of_quoted_insta, $list63, $list121 );
    utilities_macros.register_cyc_api_function( $sym126$ISA_, $list127, $str128$Returns_whether_TERM_is_an_instan, $list63, $list129 );
    utilities_macros.register_cyc_api_function( $sym130$ISA_IN_MTS_, $list131, $str132$is__term__an_element_of__collecti, $list63, $list129 );
    utilities_macros.register_cyc_api_function( $sym133$ISA_IN_ANY_MT_, $list134, $str135$is__term__an_element_of__collecti, NIL, $list129 );
    utilities_macros.register_cyc_api_function( $sym136$ANY_ISA_, $list85, $str137$Returns_whether_TERM_is_an_instan, $list87, $list129 );
    utilities_macros.register_cyc_api_function( $sym138$ISA_ANY_, $list85, $str137$Returns_whether_TERM_is_an_instan, $list87, $list129 );
    utilities_macros.register_cyc_api_function( $sym141$ANY_ISA_ANY_, $list142, $str143$_return_booleanp__whether_any_ter, $list144, $list129 );
    utilities_macros.register_cyc_api_function( $sym145$NOT_ISA_, $list127, $str146$_return_booleanp__whether_TERM_is, $list147, $list129 );
    utilities_macros.register_cyc_api_function( $sym148$WHY_ISA_, $list149, $str150$Returns_justification_of__isa_TER, $list147, $list151 );
    utilities_macros.register_cyc_api_function( $sym158$WHY_NOT_ISA_, $list149, $str159$Returns_justification_of__not__is, $list147, $list151 );
    utilities_macros.register_cyc_api_function( $sym160$INSTANCES_, $list119, $str161$Returns_whether_COLLECTION_has_an, $list63, $list129 );
    utilities_macros.register_cyc_api_function( $sym165$MAX_FLOOR_MTS_OF_ISA_PATHS, $list166, $str167$Returns_in_what__most_genl__mts_T, $list147, NIL );
    utilities_macros.register_cyc_api_function( $sym168$MAX_FLOOR_MTS_OF_QUOTED_ISA_PATHS, $list166, $str169$Returns_in_what__most_genl__mts_T, $list147, NIL );
    utilities_macros.register_kb_function( $sym181$INSTANCEOF_AFTER_ADDING );
    utilities_macros.register_kb_function( $sym182$ISA_AFTER_ADDING );
    utilities_macros.register_kb_function( $sym190$INSTANCEOF_AFTER_REMOVING );
    utilities_macros.register_kb_function( $sym191$ISA_AFTER_REMOVING );
    utilities_macros.register_cyc_api_function( $sym192$QUOTED_ISA_, $list127, $str193$Returns_whether_TERM_is_a_quoted_, $list63, $list129 );
    utilities_macros.register_cyc_api_function( $sym194$QUOTED_ISA_IN_ANY_MT_, $list134, $str135$is__term__an_element_of__collecti, NIL, $list129 );
    utilities_macros.register_cyc_api_function( $sym195$ANY_QUOTED_ISA_, $list85, $str137$Returns_whether_TERM_is_an_instan, $list87, $list129 );
    utilities_macros.register_cyc_api_function( $sym196$QUOTED_ISA_ANY_, $list85, $str137$Returns_whether_TERM_is_an_instan, $list87, $list129 );
    utilities_macros.register_cyc_api_function( $sym197$ALL_QUOTED_ISA_, $list85, $str198$Returns_whether_TERM_is_a_quoted_, $list87, $list129 );
    utilities_macros.register_cyc_api_function( $sym199$NOT_QUOTED_ISA_, $list127, $str146$_return_booleanp__whether_TERM_is, $list147, $list129 );
    utilities_macros.register_cyc_api_function( $sym200$QUOTED_INSTANCES, $list14, $str15$Returns_the_asserted_instances_of, $list16, $list7 );
    utilities_macros.register_cyc_api_function( $sym201$UNION_ALL_QUOTED_INSTANCES, $list81, $str202$Returns_set_of_all_quoted_instanc, $list83, $list7 );
    utilities_macros.register_cyc_api_function( $sym203$MAP_ALL_QUOTED_ISA, $list102, $str204$Apply_FUNCTION_to_every_all_quote, $list104, NIL );
    utilities_macros.register_cyc_api_function( $sym206$ALL_QUOTED_ISA, $list4, $str52$Returns_all_collections_that_incl, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym207$ALL_QUOTED_ISAS_WRT, $list71, $str72$Returns_all_isa_of_term_TERM_that, $list73, $list7 );
    utilities_macros.register_cyc_api_function( $sym208$ALL_QUOTED_INSTANCES, $list18, $str58$Returns_all_instances_of_COLLECTI, $list16, $list7 );
    utilities_macros.register_cyc_api_function( $sym209$ALL_QUOTED_ISA_AMONG, $list85, $str210$Returns_those_elements_of_COLLECT, $list87, $list7 );
    utilities_macros.register_kb_function( $sym211$QUOTED_INSTANCEOF_AFTER_ADDING );
    utilities_macros.register_kb_function( $sym212$QUOTED_INSTANCEOF_AFTER_REMOVING );
    generic_testing.define_test_case_table_int( $sym214$MIN_COLS, ConsesLow.list( new SubLObject[] { $kw215$TEST, NIL, $kw216$OWNER, NIL, $kw217$CLASSES, NIL, $kw218$KB, $kw219$TINY, $kw220$WORKING_, T
    } ), $list221 );
    generic_testing.define_test_case_table_int( $sym222$MAX_COLS, ConsesLow.list( new SubLObject[] { $kw215$TEST, NIL, $kw216$OWNER, NIL, $kw217$CLASSES, NIL, $kw218$KB, $kw219$TINY, $kw220$WORKING_, T
    } ), $list221 );
    generic_testing.define_test_case_table_int( $sym76$UNION_ALL_ISA, ConsesLow.list( new SubLObject[] { $kw215$TEST, NIL, $kw216$OWNER, NIL, $kw217$CLASSES, NIL, $kw218$KB, $kw219$TINY, $kw220$WORKING_, T
    } ), $list223 );
    generic_testing.define_test_case_table_int( $sym84$ALL_ISA_AMONG, ConsesLow.list( new SubLObject[] { $kw215$TEST, NIL, $kw216$OWNER, NIL, $kw217$CLASSES, NIL, $kw218$KB, $kw224$FULL, $kw220$WORKING_, T
    } ), $list225 );
    generic_testing.define_test_case_table_int( $sym88$ALL_INSTANCES_AMONG, ConsesLow.list( new SubLObject[] { $kw215$TEST, NIL, $kw216$OWNER, NIL, $kw217$CLASSES, NIL, $kw218$KB, $kw224$FULL, $kw220$WORKING_, T
    } ), $list226 );
    generic_testing.define_test_case_table_int( $sym99$NOT_ISA_AMONG, ConsesLow.list( new SubLObject[] { $kw215$TEST, NIL, $kw216$OWNER, NIL, $kw217$CLASSES, NIL, $kw218$KB, $kw224$FULL, $kw220$WORKING_, T
    } ), $list227 );
    generic_testing.define_test_case_table_int( $sym228$ALL_INSTANCES_, ConsesLow.list( new SubLObject[] { $kw215$TEST, NIL, $kw216$OWNER, NIL, $kw217$CLASSES, NIL, $kw218$KB, $kw224$FULL, $kw220$WORKING_, T
    } ), $list229 );
    generic_testing.define_test_case_table_int( $sym141$ANY_ISA_ANY_, ConsesLow.list( new SubLObject[] { $kw215$TEST, NIL, $kw216$OWNER, NIL, $kw217$CLASSES, NIL, $kw218$KB, $kw224$FULL, $kw220$WORKING_, T
    } ), $list230 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_isa_file();
  }

  @Override
  public void initializeVariables()
  {
    init_isa_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_isa_file();
  }
  static
  {
    me = new isa();
    $sbhl_may_return_naut_collections_as_fortsP$ = null;
    $all_isas_wrt$ = null;
    $all_isas_wrt_isa$ = null;
    $random_instance_of_sampling_ratio$ = null;
    $const0$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym1$HL_TERM_P = makeSymbol( "HL-TERM-P" );
    $sym2$FORT_P = makeSymbol( "FORT-P" );
    $sym3$MIN_ISA = makeSymbol( "MIN-ISA" );
    $list4 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str5$Returns_most_specific_collections = makeString( "Returns most-specific collections that include TERM (inexpensive)" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "HL-TERM-P" ) ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "FORT-P" ) ) );
    $sym8$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $sym9$MAX_NOT_ISA = makeSymbol( "MAX-NOT-ISA" );
    $str10$Returns_most_general_collections_ = makeString( "Returns most-general collections that do not include TERM (expensive)" );
    $const11$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $sym12$EL_FORT_P = makeSymbol( "EL-FORT-P" );
    $sym13$INSTANCES = makeSymbol( "INSTANCES" );
    $list14 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "TV" ), constant_handles.reader_make_constant_shell( makeString(
        "True-JustificationTruth" ) ) ) );
    $str15$Returns_the_asserted_instances_of = makeString( "Returns the asserted instances of COL" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym17$MAX_INSTANCES = makeSymbol( "MAX-INSTANCES" );
    $list18 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str19$Returns_the_maximal_among_the_ass = makeString( "Returns the maximal among the asserted instances of COL" );
    $sym20$ALL_INSTANCES_WITH_MAX = makeSymbol( "ALL-INSTANCES-WITH-MAX" );
    $sym21$INTEGERP = makeSymbol( "INTEGERP" );
    $kw22$INVALID_ITERATION_TERM = makeKeyword( "INVALID-ITERATION-TERM" );
    $sym23$MIN_NOT_INSTANCES = makeSymbol( "MIN-NOT-INSTANCES" );
    $str24$Returns_the_most_specific_negated = makeString( "Returns the most-specific negated instances of collection COL" );
    $sym25$ISA_SIBLINGS = makeSymbol( "ISA-SIBLINGS" );
    $str26$Returns_the_direct_isas_of_those_ = makeString( "Returns the direct isas of those collections of which TERM is a direct instance" );
    $sym27$INSTANCE_SIBLINGS = makeSymbol( "INSTANCE-SIBLINGS" );
    $str28$Returns_the_direct_instances_of_t = makeString( "Returns the direct instances of those collections having direct isa TERM" );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw31$ERROR = makeKeyword( "ERROR" );
    $str32$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym33$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw34$CERROR = makeKeyword( "CERROR" );
    $str35$continue_anyway = makeString( "continue anyway" );
    $kw36$WARN = makeKeyword( "WARN" );
    $str37$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $kw38$OLD = makeKeyword( "OLD" );
    $str39$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str40$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $kw41$RESOURCE = makeKeyword( "RESOURCE" );
    $sym42$SBHL_SEARCH_TRUTH_VALUE_P = makeSymbol( "SBHL-SEARCH-TRUTH-VALUE-P" );
    $list43 = ConsesLow.list( makeSymbol( "ISA" ), makeUninternedSymbol( "TABLE-MT" ), makeUninternedSymbol( "TABLE-TV" ) );
    $const44$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list45 = ConsesLow.list( makeUninternedSymbol( "NAUT" ), makeUninternedSymbol( "ISA-MT" ), makeUninternedSymbol( "ISA-TV" ) );
    $sym46$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym47$MAP_INSTANCES = makeSymbol( "MAP-INSTANCES" );
    $list48 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str49$apply_FUNCTION_to_every__least_ge = makeString( "apply FUNCTION to every (least general) #$isa of TERM" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym51$ALL_ISA = makeSymbol( "ALL-ISA" );
    $str52$Returns_all_collections_that_incl = makeString( "Returns all collections that include TERM (inexpensive)" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "COLLECTION-P" ) ) );
    $sym54$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const55$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym56$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym57$ALL_INSTANCES = makeSymbol( "ALL-INSTANCES" );
    $str58$Returns_all_instances_of_COLLECTI = makeString( "Returns all instances of COLLECTION (expensive)" );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "HL-TERM-P" ) ) );
    $sym60$ALL_INSTANCES_IN_ALL_MTS = makeSymbol( "ALL-INSTANCES-IN-ALL-MTS" );
    $list61 = ConsesLow.list( makeSymbol( "COLLECTION" ) );
    $str62$_return_listp__all_instances_of_C = makeString( "@return listp; all instances of COLLECTION in all mts." );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym64$ALL_FORT_INSTANCES = makeSymbol( "ALL-FORT-INSTANCES" );
    $list65 = ConsesLow.list( makeSymbol( "ALL-INSTANCES" ) );
    $sym66$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol( "HL-PROTOTYPICAL-INSTANCE?" );
    $sym67$ALL_FORT_INSTANCES_IN_ALL_MTS = makeSymbol( "ALL-FORT-INSTANCES-IN-ALL-MTS" );
    $list68 = ConsesLow.list( makeSymbol( "ALL-INSTANCES-IN-ALL-MTS" ) );
    $sym69$GATHER_ISA_WRT_ISA = makeSymbol( "GATHER-ISA-WRT-ISA" );
    $sym70$ALL_ISAS_WRT = makeSymbol( "ALL-ISAS-WRT" );
    $list71 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "ISA" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str72$Returns_all_isa_of_term_TERM_that = makeString( "Returns all isa of term TERM that are also instances of collection ISA (ascending transitive closure; inexpensive)" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "ISA" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym74$LISTP = makeSymbol( "LISTP" );
    $sym75$ISA_STORED_NAUT_ARG2_P = makeSymbol( "ISA-STORED-NAUT-ARG2-P" );
    $sym76$UNION_ALL_ISA = makeSymbol( "UNION-ALL-ISA" );
    $list77 = ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str78$Returns_all_collections_that_incl = makeString( "Returns all collections that include any term in TERMS (inexpensive)" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "LISTP" ) ) );
    $sym80$UNION_ALL_INSTANCES = makeSymbol( "UNION-ALL-INSTANCES" );
    $list81 = ConsesLow.list( makeSymbol( "COLS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str82$Returns_set_of_all_instances_of_e = makeString( "Returns set of all instances of each collection in COLS (expensive)" );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "COLS" ), makeSymbol( "LISTP" ) ) );
    $sym84$ALL_ISA_AMONG = makeSymbol( "ALL-ISA-AMONG" );
    $list85 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "COLLECTIONS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str86$Returns_those_elements_of_COLLECT = makeString( "Returns those elements of COLLECTIONS that include TERM as an all-instance" );
    $list87 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "HL-TERM-P" ) ), ConsesLow.list( makeSymbol( "COLLECTIONS" ), makeSymbol( "LISTP" ) ) );
    $sym88$ALL_INSTANCES_AMONG = makeSymbol( "ALL-INSTANCES-AMONG" );
    $list89 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "TERMS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str90$Returns_those_elements_of_TERMS_t = makeString( "Returns those elements of TERMS that include COL as an all-isa" );
    $list91 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "HL-TERM-P" ) ), ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "LISTP" ) ) );
    $int92$100000 = makeInteger( 100000 );
    $int93$50 = makeInteger( 50 );
    $int94$25 = makeInteger( 25 );
    $sym95$ALL_NOT_ISA = makeSymbol( "ALL-NOT-ISA" );
    $str96$Returns_all_collections_that_do_n = makeString( "Returns all collections that do not include TERM (expensive)" );
    $sym97$ALL_NOT_INSTANCES = makeSymbol( "ALL-NOT-INSTANCES" );
    $str98$Returns_all_terms_that_are_not_me = makeString( "Returns all terms that are not members of col (by assertion)" );
    $sym99$NOT_ISA_AMONG = makeSymbol( "NOT-ISA-AMONG" );
    $str100$Returns_those_elements_of_COLLECT = makeString( "Returns those elements of COLLECTIONS that do NOT include TERM" );
    $sym101$MAP_ALL_ISA = makeSymbol( "MAP-ALL-ISA" );
    $list102 = ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str103$Apply_FUNCTION_to_every_all_isa_o = makeString( "Apply FUNCTION to every all-isa of TERM\n   (FUNCTION must not affect the current sbhl search state)" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "HL-TERM-P" ) ) );
    $sym105$MAP_ALL_INSTANCES = makeSymbol( "MAP-ALL-INSTANCES" );
    $list106 = ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str107$Apply_FUNCTION_to_each_unique_ins = makeString( "Apply FUNCTION to each unique instance of all specs of COLLECTION." );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym109$ANY_WRT_ALL_ISA = makeSymbol( "ANY-WRT-ALL-ISA" );
    $str110$Return_the_first_encountered_non_ = makeString( "Return the first encountered non-nil result of applying FUNCTION to the all-isa of TERM\n   (FUNCTION may not affect the current sbhl search state)" );
    $list111 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "HL-TERM-P" ) ) );
    $sym112$ISA__GOAL = makeSymbol( "ISA?-GOAL" );
    $kw113$BREADTH = makeKeyword( "BREADTH" );
    $kw114$QUEUE = makeKeyword( "QUEUE" );
    $kw115$STACK = makeKeyword( "STACK" );
    $list116 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str117$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym118$COUNT_ALL_INSTANCES = makeSymbol( "COUNT-ALL-INSTANCES" );
    $list119 = ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str120$Counts_the_number_of_instances_in = makeString( "Counts the number of instances in COLLECTION and then returns the count." );
    $list121 = ConsesLow.list( makeSymbol( "INTEGERP" ) );
    $const122$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $sym123$COUNT_ALL_QUOTED_INSTANCES = makeSymbol( "COUNT-ALL-QUOTED-INSTANCES" );
    $str124$Counts_the_number_of_quoted_insta = makeString( "Counts the number of quoted instances in COLLECTION and then returns the count." );
    $const125$CollectionIntersectionFn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersectionFn" ) );
    $sym126$ISA_ = makeSymbol( "ISA?" );
    $list127 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "COLLECTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str128$Returns_whether_TERM_is_an_instan = makeString(
        "Returns whether TERM is an instance of COLLECTION via the SBHL, i.e. isa and genls assertions.\n@note This function does _not_ use defns to determine membership in COLLECTION.\n@see has-type?\n@see quiet-has-type?" );
    $list129 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym130$ISA_IN_MTS_ = makeSymbol( "ISA-IN-MTS?" );
    $list131 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "COLLECTION" ), makeSymbol( "MTS" ) );
    $str132$is__term__an_element_of__collecti = makeString( "is <term> an element of <collection> via assertions in any mt in <mts>" );
    $sym133$ISA_IN_ANY_MT_ = makeSymbol( "ISA-IN-ANY-MT?" );
    $list134 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "COLLECTION" ) );
    $str135$is__term__an_element_of__collecti = makeString( "is <term> an element of <collection> in any mt" );
    $sym136$ANY_ISA_ = makeSymbol( "ANY-ISA?" );
    $str137$Returns_whether_TERM_is_an_instan = makeString( "Returns whether TERM is an instance of any collection in COLLECTIONS" );
    $sym138$ISA_ANY_ = makeSymbol( "ISA-ANY?" );
    $const139$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $str140$_A_is_not_a_collection = makeString( "~A is not a collection" );
    $sym141$ANY_ISA_ANY_ = makeSymbol( "ANY-ISA-ANY?" );
    $list142 = ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "COLLECTIONS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str143$_return_booleanp__whether_any_ter = makeString( "@return booleanp; whether any term in TERMS is an instance of any collection in COLLECTIONS" );
    $list144 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "COLLECTIONS" ), makeSymbol( "LISTP" ) ) );
    $sym145$NOT_ISA_ = makeSymbol( "NOT-ISA?" );
    $str146$_return_booleanp__whether_TERM_is = makeString( "@return booleanp; whether TERM is known to not be an instance of COLLECTION" );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "HL-TERM-P" ) ), ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym148$WHY_ISA_ = makeSymbol( "WHY-ISA?" );
    $list149 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "COLLECTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "BEHAVIOR" ) );
    $str150$Returns_justification_of__isa_TER = makeString( "Returns justification of (isa TERM COLLECTION)" );
    $list151 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $const152$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $list153 = ConsesLow.list( makeKeyword( "TRUE" ) );
    $const154$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
    $const155$resultIsaArg = constant_handles.reader_make_constant_shell( makeString( "resultIsaArg" ) );
    $const156$interArgResultIsa = constant_handles.reader_make_constant_shell( makeString( "interArgResultIsa" ) );
    $const157$interArgResultIsaReln = constant_handles.reader_make_constant_shell( makeString( "interArgResultIsaReln" ) );
    $sym158$WHY_NOT_ISA_ = makeSymbol( "WHY-NOT-ISA?" );
    $str159$Returns_justification_of__not__is = makeString( "Returns justification of (not (isa TERM COLLECTION))" );
    $sym160$INSTANCES_ = makeSymbol( "INSTANCES?" );
    $str161$Returns_whether_COLLECTION_has_an = makeString( "Returns whether COLLECTION has any direct instances" );
    $sym162$GATHER_GENLS_MTS = makeSymbol( "GATHER-GENLS-MTS" );
    $sym163$HLMT_P = makeSymbol( "HLMT-P" );
    $const164$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $sym165$MAX_FLOOR_MTS_OF_ISA_PATHS = makeSymbol( "MAX-FLOOR-MTS-OF-ISA-PATHS" );
    $list166 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "COLLECTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TV" ) );
    $str167$Returns_in_what__most_genl__mts_T = makeString( "Returns in what (most-genl) mts TERM is an instance of COLLECTION" );
    $sym168$MAX_FLOOR_MTS_OF_QUOTED_ISA_PATHS = makeSymbol( "MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS" );
    $str169$Returns_in_what__most_genl__mts_T = makeString( "Returns in what (most-genl) mts TERM is a quoted instance of COLLECTION" );
    $sym170$LIST = makeSymbol( "LIST" );
    $sym171$SETS_EQUAL_ = makeSymbol( "SETS-EQUAL?" );
    $sym172$GATHER_MIN_MTS_OF_PATHS_BETWEEN = makeSymbol( "GATHER-MIN-MTS-OF-PATHS-BETWEEN" );
    $kw173$TRUE = makeKeyword( "TRUE" );
    $sym174$CACHE_MTS_OF_ARG = makeSymbol( "CACHE-MTS-OF-ARG" );
    $const175$resultQuotedIsa = constant_handles.reader_make_constant_shell( makeString( "resultQuotedIsa" ) );
    $const176$evaluationResultQuotedIsa = constant_handles.reader_make_constant_shell( makeString( "evaluationResultQuotedIsa" ) );
    $sym177$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
    $sym178$KB_SET_OR_COLLECTION_P = makeSymbol( "KB-SET-OR-COLLECTION-P" );
    $const179$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $list180 = ConsesLow.list( ONE_INTEGER );
    $sym181$INSTANCEOF_AFTER_ADDING = makeSymbol( "INSTANCEOF-AFTER-ADDING" );
    $sym182$ISA_AFTER_ADDING = makeSymbol( "ISA-AFTER-ADDING" );
    $list183 = ConsesLow.list( makeSymbol( "ISA" ), makeSymbol( "TERM" ), makeSymbol( "SUBSET-EXPR" ) );
    $const184$CollectionSubsetFn = constant_handles.reader_make_constant_shell( makeString( "CollectionSubsetFn" ) );
    $list185 = ConsesLow.list( makeSymbol( "CSFN" ), makeSymbol( "COL" ), makeSymbol( "COLEXPR" ) );
    $list186 = ConsesLow.list( makeSymbol( "ISA" ), makeSymbol( "TERM" ), makeSymbol( "COLEXPR" ) );
    $const187$TheCollectionOf = constant_handles.reader_make_constant_shell( makeString( "TheCollectionOf" ) );
    $list188 = ConsesLow.list( makeSymbol( "TSO" ), makeSymbol( "VAR" ), makeSymbol( "PROP" ) );
    $kw189$FORWARD = makeKeyword( "FORWARD" );
    $sym190$INSTANCEOF_AFTER_REMOVING = makeSymbol( "INSTANCEOF-AFTER-REMOVING" );
    $sym191$ISA_AFTER_REMOVING = makeSymbol( "ISA-AFTER-REMOVING" );
    $sym192$QUOTED_ISA_ = makeSymbol( "QUOTED-ISA?" );
    $str193$Returns_whether_TERM_is_a_quoted_ = makeString(
        "Returns whether TERM is a quoted instance of COLLECTION via the SBHL, i.e. quotedIsa and genls assertions.\n@note This function does _not_ use defns to determine membership in COLLECTION.\n@see has-type?\n@see quiet-has-type?" );
    $sym194$QUOTED_ISA_IN_ANY_MT_ = makeSymbol( "QUOTED-ISA-IN-ANY-MT?" );
    $sym195$ANY_QUOTED_ISA_ = makeSymbol( "ANY-QUOTED-ISA?" );
    $sym196$QUOTED_ISA_ANY_ = makeSymbol( "QUOTED-ISA-ANY?" );
    $sym197$ALL_QUOTED_ISA_ = makeSymbol( "ALL-QUOTED-ISA?" );
    $str198$Returns_whether_TERM_is_a_quoted_ = makeString( "Returns whether TERM is a quoted instance of all collections in COLLECTIONS" );
    $sym199$NOT_QUOTED_ISA_ = makeSymbol( "NOT-QUOTED-ISA?" );
    $sym200$QUOTED_INSTANCES = makeSymbol( "QUOTED-INSTANCES" );
    $sym201$UNION_ALL_QUOTED_INSTANCES = makeSymbol( "UNION-ALL-QUOTED-INSTANCES" );
    $str202$Returns_set_of_all_quoted_instanc = makeString( "Returns set of all quoted instances of each collection in COLS (expensive)" );
    $sym203$MAP_ALL_QUOTED_ISA = makeSymbol( "MAP-ALL-QUOTED-ISA" );
    $str204$Apply_FUNCTION_to_every_all_quote = makeString( "Apply FUNCTION to every all-quoted-isa of TERM\n   (FUNCTION must not affect the current sbhl search state)" );
    $list205 = ConsesLow.list( makeUninternedSymbol( "NAUT" ), makeUninternedSymbol( "QUOTED-ISA-MT" ), makeUninternedSymbol( "QUOTED-ISA-TV" ) );
    $sym206$ALL_QUOTED_ISA = makeSymbol( "ALL-QUOTED-ISA" );
    $sym207$ALL_QUOTED_ISAS_WRT = makeSymbol( "ALL-QUOTED-ISAS-WRT" );
    $sym208$ALL_QUOTED_INSTANCES = makeSymbol( "ALL-QUOTED-INSTANCES" );
    $sym209$ALL_QUOTED_ISA_AMONG = makeSymbol( "ALL-QUOTED-ISA-AMONG" );
    $str210$Returns_those_elements_of_COLLECT = makeString( "Returns those elements of COLLECTIONS that include TERM as an all-quoted-instance" );
    $sym211$QUOTED_INSTANCEOF_AFTER_ADDING = makeSymbol( "QUOTED-INSTANCEOF-AFTER-ADDING" );
    $sym212$QUOTED_INSTANCEOF_AFTER_REMOVING = makeSymbol( "QUOTED-INSTANCEOF-AFTER-REMOVING" );
    $kw213$GAF = makeKeyword( "GAF" );
    $sym214$MIN_COLS = makeSymbol( "MIN-COLS" );
    $kw215$TEST = makeKeyword( "TEST" );
    $kw216$OWNER = makeKeyword( "OWNER" );
    $kw217$CLASSES = makeKeyword( "CLASSES" );
    $kw218$KB = makeKeyword( "KB" );
    $kw219$TINY = makeKeyword( "TINY" );
    $kw220$WORKING_ = makeKeyword( "WORKING?" );
    $list221 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) );
    $sym222$MAX_COLS = makeSymbol( "MAX-COLS" );
    $list223 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL ), NIL ) );
    $kw224$FULL = makeKeyword( "FULL" );
    $list225 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "Collection" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "Muffet" ) ), NIL ), NIL ) );
    $list226 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "Muffet" ) ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Muffet" ) ) ) ), ConsesLow.list( ConsesLow
            .list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), NIL, constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ) ), NIL ), ConsesLow.list( ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "Female" ) ), NIL ), NIL ) );
    $list227 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Muffet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Male" ) ) ),
        constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Male" ) ) ) ) );
    $sym228$ALL_INSTANCES_ = makeSymbol( "ALL-INSTANCES?" );
    $list229 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL, constant_handles.reader_make_constant_shell( makeString( "Female" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Muffet" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "Female" ) ) ), T ) );
    $list230 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Muffet" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "Poodle" ) ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ) ), T ) );
  }

  public static final class $instanceof_after_adding$BinaryFunction
      extends
        BinaryFunction
  {
    public $instanceof_after_adding$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INSTANCEOF-AFTER-ADDING" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return instanceof_after_adding( arg1, arg2 );
    }
  }

  public static final class $instanceof_after_removing$BinaryFunction
      extends
        BinaryFunction
  {
    public $instanceof_after_removing$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INSTANCEOF-AFTER-REMOVING" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return instanceof_after_removing( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 13047 ms synthetic
 */