package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class genl_mts
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.genl_mts";
  public static final String myFingerPrint = "65d14144c83b2e243ea2cd910577ab9cf00f5e60fa09df7b98d795b457c24e48";
  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 16060L)
  private static SubLSymbol $all_base_mts_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 16507L)
  public static SubLSymbol $min_mts_2_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 18644L)
  public static SubLSymbol $suppress_max_floor_mts_explosion_warning$;
  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 18747L)
  private static SubLSymbol $max_floor_mts_explosion_warning_min_placements_mt_count$;
  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 23430L)
  private static SubLSymbol $cached_max_floor_mts_from_mt_sets_caching_state$;
  private static final SubLObject $const0$genlMt;
  private static final SubLObject $const1$Microtheory;
  private static final SubLSymbol $sym2$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const3$EverythingPSC;
  private static final SubLSymbol $sym4$ANY_GENL_MT__MEMOIZED;
  private static final SubLSymbol $sym5$EL_FORT_P;
  private static final SubLSymbol $sym6$CORE_MICROTHEORY_P;
  private static final SubLSymbol $sym7$ANY_GENL_MT_;
  private static final SubLList $list8;
  private static final SubLString $str9$_any_genl_mt__spec_genls__is_t_if;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$ALL_BASE_MTS;
  private static final SubLSymbol $sym13$_ALL_BASE_MTS_CACHING_STATE_;
  private static final SubLInteger $int14$2048;
  private static final SubLInteger $int15$1000;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$BASE_MT;
  private static final SubLSymbol $sym18$CDOLIST;
  private static final SubLSymbol $sym19$WITH_MT;
  private static final SubLSymbol $kw20$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym21$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym22$MAX_FLOOR_MTS_EXPLOSION_WARNING;
  private static final SubLString $str23$__Forward_inference_mt_placement_;
  private static final SubLSymbol $sym24$NART_P;
  private static final SubLSymbol $sym25$NART_EL_FORMULA;
  private static final SubLString $str26$;
  private static final SubLString $str27$____KB__A;
  private static final SubLString $str28$__gaf__;
  private static final SubLString $str29$__rule__;
  private static final SubLString $str30$___S_____A__;
  private static final SubLSymbol $sym31$GENERALITY_ESTIMATE_;
  private static final SubLString $str32$_______;
  private static final SubLString $str33$Repropagaing;
  private static final SubLSymbol $sym34$_EXIT;
  private static final SubLSymbol $sym35$ATEMPORAL_HLMT_;
  private static final SubLSymbol $sym36$HLMT_MONAD_MT;
  private static final SubLSymbol $sym37$MAX_FLOOR_MONAD_MTS;
  private static final SubLSymbol $sym38$UNION;
  private static final SubLSymbol $sym39$MAX_FLOOR_MTS;
  private static final SubLSymbol $sym40$CACHED_MAX_FLOOR_MTS_FROM_MT_SETS;
  private static final SubLSymbol $sym41$_CACHED_MAX_FLOOR_MTS_FROM_MT_SETS_CACHING_STATE_;
  private static final SubLInteger $int42$10000;
  private static final SubLSymbol $kw43$GAF;
  private static final SubLSymbol $kw44$TRUE;
  private static final SubLSymbol $sym45$POSSIBLY_HLMT_P;
  private static final SubLSymbol $sym46$RELEVANT_MT_IS_GENL_MT;
  private static final SubLString $str47$Identifying_MTs_in_loops;
  private static final SubLString $str48$cdolist;
  private static final SubLString $str49$_S;
  private static final SubLString $str50$Identifying_MT_Loop_Members;
  private static final SubLString $str51$length__S_loop____S;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$_;
  private static final SubLSymbol $sym54$LENGTH;
  private static final SubLSymbol $sym55$ADD_BASE_MT;
  private static final SubLSymbol $sym56$ADD_GENL_MT;
  private static final SubLSymbol $sym57$REMOVE_BASE_MT;
  private static final SubLSymbol $sym58$REMOVE_GENL_MT;

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 768L)
  public static SubLObject genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_forward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 1161L)
  public static SubLObject min_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_min_forward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 1363L)
  public static SubLObject not_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_forward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 1565L)
  public static SubLObject max_not_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_max_forward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 1781L)
  public static SubLObject spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_backward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 1990L)
  public static SubLObject leaf_mtP(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return makeBoolean( NIL == sbhl_link_methods.sbhl_backward_true_link_nodes_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 2181L)
  public static SubLObject max_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_max_backward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 2385L)
  public static SubLObject not_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_backward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 2588L)
  public static SubLObject min_not_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_min_backward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 2804L)
  public static SubLObject genl_mt_siblings(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_siblings_forward( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 3019L)
  public static SubLObject spec_mt_siblings(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_siblings_backward( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 3221L)
  public static SubLObject all_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return all_genl_mts_internal( mt, mt_mt, tv, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 3513L)
  public static SubLObject all_genl_mts_internal(final SubLObject mt, final SubLObject mt_mt, final SubLObject tv, final SubLObject caching_enabledP)
  {
    return sbhl_search_methods.sbhl_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 3775L)
  public static SubLObject all_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return all_spec_mts_internal( mt, mt_mt, tv, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 3974L)
  public static SubLObject all_spec_mts_internal(final SubLObject mt, final SubLObject mt_mt, final SubLObject tv, final SubLObject caching_enabledP)
  {
    return sbhl_search_methods.sbhl_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 4237L)
  public static SubLObject all_proper_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Sequences.remove( mt, all_genl_mts( mt, mt_mt, tv ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 4478L)
  public static SubLObject all_proper_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Sequences.remove( mt, all_spec_mts( mt, mt_mt, tv ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 4709L)
  public static SubLObject random_genl_mt(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return list_utilities.random_element( all_genl_mts( mt, mt_mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 4838L)
  public static SubLObject random_spec_mt(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( NIL != mt_vars.core_microtheory_p( mt ) )
    {
      return isa.random_instance_of( $const1$Microtheory, UNPROVIDED );
    }
    return list_utilities.random_element( all_spec_mts( mt, mt_mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 5112L)
  public static SubLObject random_proper_genl_mt(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return list_utilities.random_element( all_proper_genl_mts( mt, mt_mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 5244L)
  public static SubLObject random_proper_spec_mt(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return list_utilities.random_element( all_proper_spec_mts( mt, mt_mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 5376L)
  public static SubLObject all_not_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 5641L)
  public static SubLObject all_not_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 5894L)
  public static SubLObject all_genl_mts_between(final SubLObject spec_mt, final SubLObject genl_mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_forward_true_nodes_between( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), spec_mt, genl_mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 6243L)
  public static SubLObject union_all_genl_mts(final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_union_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mts, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 6444L)
  public static SubLObject union_all_spec_mts(final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_union_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mts, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 6680L)
  public static SubLObject all_dependent_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_dependent_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 6969L)
  public static SubLObject all_genl_mts_among(final SubLObject mt, final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_forward_true_nodes_among( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mts, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 7193L)
  public static SubLObject all_spec_mts_among(final SubLObject mt, final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_backward_true_nodes_among( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mts, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 7403L)
  public static SubLObject selected_genl_mts(final SubLObject mt, final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return all_genl_mts_among( mt, mts, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 7527L)
  public static SubLObject all_genl_mts_if(final SubLObject mt, final SubLObject function, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_forward_true_nodes_if( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, function, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 7770L)
  public static SubLObject all_spec_mts_if(final SubLObject mt, final SubLObject function, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_backward_true_nodes_if( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, function, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 8003L)
  public static SubLObject map_all_genl_mts(final SubLObject fn, final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    sbhl_search_methods.sbhl_map_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, fn, mt_mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 8262L)
  public static SubLObject map_all_spec_mts(final SubLObject fn, final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    sbhl_search_methods.sbhl_map_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, fn, mt_mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 8505L)
  public static SubLObject map_union_all_genl_mts(final SubLObject fn, final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    sbhl_search_methods.sbhl_map_union_all_forward_true_nodes( mts, fn, mt_mt, tv, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 8761L)
  public static SubLObject map_all_genl_mts_of_all(final SubLObject fn, final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    map_union_all_genl_mts( fn, mts, mt_mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 8892L)
  public static SubLObject map_union_all_spec_mts(final SubLObject fn, final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    sbhl_search_methods.sbhl_map_union_all_backward_true_nodes( mts, fn, mt_mt, tv, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 9135L)
  public static SubLObject map_all_spec_mts_of_all(final SubLObject fn, final SubLObject mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    map_union_all_spec_mts( fn, mts, mt_mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 9266L)
  public static SubLObject genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( NIL != hlmt.hlmts_supportedP() )
    {
      return hlmt_relevance.hlmt_visible_p( spec, genl );
    }
    return monad_genl_mtP( spec, genl, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 9724L)
  public static SubLObject proper_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return makeBoolean( NIL != genl_mtP( spec, genl, mt_mt, tv ) && NIL == genl_mtP( genl, spec, mt_mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 9886L)
  public static SubLObject monad_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym2$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const3$EverythingPSC, thread );
      result = sbhl_search_methods.sbhl_non_justifying_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), spec, genl, mt_mt, tv );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 10404L)
  public static SubLObject spec_mtP(final SubLObject genl, final SubLObject spec, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return genl_mtP( spec, genl, mt_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 10596L)
  public static SubLObject genl_mt_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_inverse_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), genl, spec, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 10906L)
  public static SubLObject any_genl_mtP_memoized_internal(final SubLObject spec, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return any_genl_mtP( spec, v_genls, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 10906L)
  public static SubLObject any_genl_mtP_memoized(final SubLObject spec, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return any_genl_mtP_memoized_internal( spec, v_genls, mt_mt, tv );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym4$ANY_GENL_MT__MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym4$ANY_GENL_MT__MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym4$ANY_GENL_MT__MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( spec, v_genls, mt_mt, tv );
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
        if( spec.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( v_genls.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt_mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && tv.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( any_genl_mtP_memoized_internal( spec, v_genls, mt_mt, tv ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( spec, v_genls, mt_mt, tv ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 11100L)
  public static SubLObject any_genl_mtP(final SubLObject spec, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( v_genls, $sym5$EL_FORT_P );
    if( NIL == list_utilities.any_in_list( $sym6$CORE_MICROTHEORY_P, v_genls, UNPROVIDED ) )
    {
      return sbhl_search_methods.sbhl_predicate_relation_with_any_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), spec, v_genls, mt_mt, tv );
    }
    if( NIL != mt_vars.core_microtheory_p( spec ) )
    {
      return mt_vars.core_any_genl_mtP( spec, v_genls );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 11610L)
  public static SubLObject genl_mt_of_anyP(final SubLObject specs, final SubLObject genl, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_any_with_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), specs, genl, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 11897L)
  public static SubLObject all_genl_mtP(final SubLObject spec, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_predicate_relation_with_all_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), spec, v_genls, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 12183L)
  public static SubLObject genl_mt_of_allP(final SubLObject specs, final SubLObject genl, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_with_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), specs, genl, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 12475L)
  public static SubLObject any_genl_mt_of_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_predicate_relation_between_any_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), specs, v_genls, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 12812L)
  public static SubLObject not_genl_mtP(final SubLObject mt, final SubLObject not_genl, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, not_genl, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 13299L)
  public static SubLObject argue_not_genl_mtP(final SubLObject mt, final SubLObject not_genl, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, not_genl, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 13623L)
  public static SubLObject not_spec_mtP(final SubLObject not_genl, final SubLObject mt, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return not_genl_mtP( mt, not_genl, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 13838L)
  public static SubLObject not_any_genl_mtP(final SubLObject mt, final SubLObject not_genl_mts, SubLObject mt_mt, SubLObject tv)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_with_any_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, not_genl_mts, mt_mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 14190L)
  public static SubLObject mts_intersectP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return makeBoolean( NIL != mts_explicitly_intersectP( mt1, mt2, mt_mt ) || NIL != negation_mt.not_negation_mtP( mt1, mt2, mt_mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 14611L)
  public static SubLObject mts_explicitly_intersectP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return makeBoolean( NIL != genl_mtP( mt1, mt2, mt_mt, UNPROVIDED ) || NIL != genl_mtP( mt2, mt1, mt_mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 14760L)
  public static SubLObject why_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    if( NIL != hlmt.hlmts_supportedP() )
    {
      return hlmt_relevance.why_hlmt_visible_p( spec, genl, mt_mt, tv, behavior );
    }
    return why_monad_genl_mtP( spec, genl, mt_mt, tv, behavior );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 15208L)
  public static SubLObject why_monad_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym2$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const3$EverythingPSC, thread );
      result = sbhl_search_methods.why_sbhl_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), spec, genl, mt_mt, tv, behavior );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 15530L)
  public static SubLObject any_just_of_genl_mt(final SubLObject spec, final SubLObject genl, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return why_genl_mtP( spec, genl, mt_mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 15650L)
  public static SubLObject why_not_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), spec, genl, mt_mt, tv, behavior );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 15932L)
  public static SubLObject any_just_of_not_genl_mt(final SubLObject spec, final SubLObject genl, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return why_not_genl_mtP( spec, genl, mt_mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 16060L)
  public static SubLObject clear_all_base_mts()
  {
    final SubLObject cs = $all_base_mts_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 16060L)
  public static SubLObject remove_all_base_mts(final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $all_base_mts_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 16060L)
  public static SubLObject all_base_mts_internal(final SubLObject mt)
  {
    return all_genl_mts( mt, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 16060L)
  public static SubLObject all_base_mts(final SubLObject mt)
  {
    SubLObject caching_state = $all_base_mts_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym12$ALL_BASE_MTS, $sym13$_ALL_BASE_MTS_CACHING_STATE_, $int14$2048, EQL, ONE_INTEGER, $int15$1000 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( all_base_mts_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 16349L)
  public static SubLObject do_base_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject base_mt = $sym17$BASE_MT;
    return ConsesLow.list( $sym18$CDOLIST, ConsesLow.list( base_mt, ConsesLow.list( $sym12$ALL_BASE_MTS, mt ) ), ConsesLow.listS( $sym19$WITH_MT, base_mt, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 16666L)
  public static SubLObject min_mts(SubLObject mts, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue( thread ) )
    {
      mts = mt_vars.minimize_mts_wrt_core( mts );
    }
    if( NIL != $min_mts_2_enabledP$.getDynamicValue( thread ) && NIL != list_utilities.doubletonP( mts ) )
    {
      return min_mts_2( mts.first(), conses_high.second( mts ), mt_mt );
    }
    return sbhl_search_methods.sbhl_min_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mts, mt_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 17072L)
  public static SubLObject min_mts_before_floors(final SubLObject mts, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return min_mts( mts, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 17265L)
  public static SubLObject min_mts_2(final SubLObject mt_1, final SubLObject mt_2, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if( NIL != genl_mtP( mt_1, mt_2, mt_mt, UNPROVIDED ) )
    {
      if( NIL != genl_mtP( mt_2, mt_1, mt_mt, UNPROVIDED ) )
      {
        return ConsesLow.list( mt_1, mt_2 );
      }
      return ConsesLow.list( mt_1 );
    }
    else
    {
      if( NIL != genl_mtP( mt_2, mt_1, mt_mt, UNPROVIDED ) )
      {
        return ConsesLow.list( mt_2 );
      }
      return ConsesLow.list( mt_1, mt_2 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 17595L)
  public static SubLObject max_mts(SubLObject mts, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue( thread ) )
    {
      mts = mt_vars.maximize_mts_wrt_core( mts );
    }
    return sbhl_search_methods.sbhl_max_nodes( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mts, mt_mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 17912L)
  public static SubLObject max_mts_before_ceiling(SubLObject mts, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue( thread ) )
    {
      mts = mt_vars.maximize_mts_wrt_core( mts );
    }
    return list_utilities.fast_delete_duplicates( mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 18262L)
  public static SubLObject min_ceiling_mts(SubLObject mts, SubLObject candidates, SubLObject mt_mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    mts = max_mts_before_ceiling( mts, mt_mt );
    return sbhl_search_methods.sbhl_min_ceilings( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mts, candidates, mt_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 18830L)
  public static SubLObject max_floor_mts(final SubLObject mts, SubLObject candidates, SubLObject mt_mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mts )
    {
      return NIL;
    }
    final SubLObject placement_mts = ( NIL != hlmt.hlmts_supportedP() ) ? max_floor_hlmts( mts, candidates, mt_mt ) : max_floor_monad_mts( mts, candidates, mt_mt );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( NIL == $suppress_max_floor_mts_explosion_warning$.getDynamicValue( thread ) && $max_floor_mts_explosion_warning_min_placements_mt_count$.getDynamicValue( thread ).isNumber() && Sequences.length(
              placement_mts ).numG( $max_floor_mts_explosion_warning_min_placements_mt_count$.getDynamicValue( thread ) ) )
          {
            max_floor_mts_explosion_warning( kb_utilities.sort_terms( conses_high.copy_list( mts ), NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), kb_utilities.sort_terms( conses_high.copy_list(
                placement_mts ), NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw20$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return placement_mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 19719L)
  public static SubLObject max_floor_mts_explosion_warning_internal(final SubLObject mts, final SubLObject placement_mts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Errors.warn( $str23$__Forward_inference_mt_placement_, new SubLObject[] { Sequences.length( mts ), Sequences.length( placement_mts ), list_utilities.quotify( cycl_utilities.expression_transform( mts, $sym24$NART_P,
        $sym25$NART_EL_FORMULA, UNPROVIDED, UNPROVIDED ) ), ( NIL != forward.current_forward_inference_gaf() ) ? assertion_handles.assertion_id( forward.current_forward_inference_gaf() ) : $str26$, ( NIL != forward
            .current_forward_inference_rule() ) ? assertion_handles.assertion_id( forward.current_forward_inference_rule() ) : $str26$, ( NIL != control_vars.$use_transcriptP$.getDynamicValue( thread ) ) ? $str26$
                : PrintLow.format( NIL, $str27$____KB__A, operation_communication.kb_version_string() )
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 19719L)
  public static SubLObject max_floor_mts_explosion_warning(final SubLObject mts, final SubLObject placement_mts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return max_floor_mts_explosion_warning_internal( mts, placement_mts );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym22$MAX_FLOOR_MTS_EXPLOSION_WARNING, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym22$MAX_FLOOR_MTS_EXPLOSION_WARNING, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym22$MAX_FLOOR_MTS_EXPLOSION_WARNING, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( mts, placement_mts );
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
        if( mts.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && placement_mts.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( max_floor_mts_explosion_warning_internal( mts, placement_mts ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( mts, placement_mts ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 20330L)
  public static SubLObject show_max_floor_mts_info(SubLObject mts, SubLObject gaf_assertion_id, SubLObject rule_assertion_id, SubLObject repropagateP)
  {
    if( gaf_assertion_id == UNPROVIDED )
    {
      gaf_assertion_id = NIL;
    }
    if( rule_assertion_id == UNPROVIDED )
    {
      rule_assertion_id = NIL;
    }
    if( repropagateP == UNPROVIDED )
    {
      repropagateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $suppress_max_floor_mts_explosion_warning$.currentBinding( thread );
    try
    {
      $suppress_max_floor_mts_explosion_warning$.bind( T, thread );
      final SubLObject gaf = ( NIL != gaf_assertion_id ) ? assertion_handles.find_assertion_by_id( gaf_assertion_id ) : NIL;
      final SubLObject rule = ( NIL != rule_assertion_id ) ? assertion_handles.find_assertion_by_id( rule_assertion_id ) : NIL;
      if( NIL != gaf )
      {
        PrintLow.format( T, $str28$__gaf__ );
        format_cycl_expression.format_cycl_expression( uncanonicalizer.assertion_el_ist_formula( gaf ), UNPROVIDED, UNPROVIDED );
      }
      if( NIL != rule )
      {
        PrintLow.format( T, $str29$__rule__ );
        format_cycl_expression.format_cycl_expression( uncanonicalizer.assertion_el_ist_formula( rule ), UNPROVIDED, UNPROVIDED );
      }
      mts = narts_high.nart_substitute( mts );
      SubLObject cdolist_list_var = Sort.sort( conses_high.copy_list( mts ), $sym31$GENERALITY_ESTIMATE_, UNPROVIDED );
      SubLObject mt = NIL;
      mt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str30$___S_____A__, mt, cardinality_estimates.generality_estimate( mt ) );
        cdolist_list_var = cdolist_list_var.rest();
        mt = cdolist_list_var.first();
      }
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str32$_______ );
      cdolist_list_var = Sort.sort( max_floor_mts( mts, UNPROVIDED, UNPROVIDED ), $sym31$GENERALITY_ESTIMATE_, UNPROVIDED );
      mt = NIL;
      mt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str30$___S_____A__, mt, cardinality_estimates.generality_estimate( mt ) );
        cdolist_list_var = cdolist_list_var.rest();
        mt = cdolist_list_var.first();
      }
      if( NIL != repropagateP )
      {
        final SubLObject str = $str33$Repropagaing;
        final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
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
          forward.repropagate_forward_gaf_wrt_rule( gaf, rule );
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$1, thread );
        }
      }
      return NIL;
    }
    finally
    {
      $suppress_max_floor_mts_explosion_warning$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 21344L)
  public static SubLObject max_floor_hlmts(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt)
  {
    return ( NIL != list_utilities.every_in_list( $sym35$ATEMPORAL_HLMT_, mts, UNPROVIDED ) ) ? max_floor_monad_mts( Mapping.mapcar( $sym36$HLMT_MONAD_MT, mts ), candidates, mt_mt )
        : hlmt_relevance.max_floor_polyad_mts( mts, candidates, mt_mt, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 21624L)
  public static SubLObject max_floor_monad_mts_internal(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt)
  {
    return ( NIL != mts ) ? sbhl_search_methods.sbhl_max_floors( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), min_mts_before_floors( mts, mt_mt ), candidates, mt_mt, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 21624L)
  public static SubLObject max_floor_monad_mts(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return max_floor_monad_mts_internal( mts, candidates, mt_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym37$MAX_FLOOR_MONAD_MTS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym37$MAX_FLOOR_MONAD_MTS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym37$MAX_FLOOR_MONAD_MTS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( mts, candidates, mt_mt );
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
        if( mts.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( candidates.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt_mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( max_floor_monad_mts_internal( mts, candidates, mt_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( mts, candidates, mt_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 21850L)
  public static SubLObject max_floor_mts_with_cycles_pruned(final SubLObject mts, SubLObject candidates, SubLObject mt_mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return ( NIL != hlmt.hlmts_supportedP() ) ? max_floor_hlmts_with_cycles_pruned( mts, candidates, mt_mt ) : max_floor_monad_mts_with_cycles_pruned( mts, candidates, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 22405L)
  public static SubLObject max_floor_hlmts_with_cycles_pruned(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt)
  {
    return ( NIL != list_utilities.every_in_list( $sym35$ATEMPORAL_HLMT_, mts, UNPROVIDED ) ) ? max_floor_monad_mts_with_cycles_pruned( Mapping.mapcar( $sym36$HLMT_MONAD_MT, mts ), candidates, mt_mt )
        : hlmt_relevance.max_floor_polyad_mts( mts, candidates, mt_mt, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 22717L)
  public static SubLObject max_floor_monad_mts_with_cycles_pruned(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt)
  {
    return ( NIL != mts ) ? sbhl_search_methods.sbhl_max_floors_pruning_cycles( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), min_mts_before_floors( mts, mt_mt ), candidates, mt_mt, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 22959L)
  public static SubLObject max_floor_mts_from_mt_sets(final SubLObject mt_sets)
  {
    return max_mts( Sequences.creduce( Symbols.symbol_function( $sym38$UNION ), Sequences.delete( NIL, Mapping.mapcar( Symbols.symbol_function( $sym39$MAX_FLOOR_MTS ), mt_sets ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ), ZERO_INTEGER, NIL, NIL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 23430L)
  public static SubLObject clear_cached_max_floor_mts_from_mt_sets()
  {
    final SubLObject cs = $cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 23430L)
  public static SubLObject remove_cached_max_floor_mts_from_mt_sets(final SubLObject mt_sets)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue(), ConsesLow.list( mt_sets ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 23430L)
  public static SubLObject cached_max_floor_mts_from_mt_sets_internal(final SubLObject mt_sets)
  {
    return max_floor_mts_from_mt_sets( mt_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 23430L)
  public static SubLObject cached_max_floor_mts_from_mt_sets(final SubLObject mt_sets)
  {
    SubLObject caching_state = $cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym40$CACHED_MAX_FLOOR_MTS_FROM_MT_SETS, $sym41$_CACHED_MAX_FLOOR_MTS_FROM_MT_SETS_CACHING_STATE_, $int42$10000, EQUAL, ONE_INTEGER,
          $int42$10000 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt_sets, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_max_floor_mts_from_mt_sets_internal( mt_sets ) ) );
      memoization_state.caching_state_put( caching_state, mt_sets, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 23585L)
  public static SubLObject max_floor_mts_of_genl_mt_paths(final SubLObject spec_mt, final SubLObject genl_mt)
  {
    if( NIL != genl_mtP( spec_mt, genl_mt, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( mt_vars.$mt_mt$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 23865L)
  public static SubLObject genl_mt_mts(final SubLObject mt)
  {
    return kb_accessors.pred_mts( mt, $const0$genlMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 24128L)
  public static SubLObject asserted_genl_mtsP(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 24346L)
  public static SubLObject asserted_genl_mts(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 24547L)
  public static SubLObject genl_mts_from_asserted_assertions(final SubLObject mt)
  {
    SubLObject v_genl_mts = NIL;
    final SubLObject pred_var = $const0$genlMt;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( mt, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( mt, ONE_INTEGER, pred_var );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw43$GAF, $kw44$TRUE, NIL );
            SubLObject done_var_$2 = NIL;
            final SubLObject token_var_$3 = NIL;
            while ( NIL == done_var_$2)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
              final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( gaf ) );
              if( NIL != valid_$4 && NIL != assertions_high.asserted_assertionP( gaf ) )
              {
                v_genl_mts = ConsesLow.cons( assertions_high.gaf_arg2( gaf ), v_genl_mts );
              }
              done_var_$2 = makeBoolean( NIL == valid_$4 );
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
    return Sequences.nreverse( v_genl_mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 24922L)
  public static SubLObject asserted_not_genl_mts(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_false_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 25129L)
  public static SubLObject supported_genl_mts(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_true_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 25333L)
  public static SubLObject supported_not_genl_mts(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_false_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 25543L)
  public static SubLObject asserted_spec_mtsP(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 25771L)
  public static SubLObject asserted_spec_mts(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 25980L)
  public static SubLObject asserted_not_spec_mts(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_false_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 26195L)
  public static SubLObject supported_spec_mts(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_true_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 26407L)
  public static SubLObject supported_not_spec_mts(final SubLObject mt, SubLObject mt_mt)
  {
    if( mt_mt == UNPROVIDED )
    {
      mt_mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_false_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt, mt_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 26625L)
  public static SubLObject coextensional_mts(final SubLObject mt)
  {
    assert NIL != hlmt.possibly_hlmt_p( mt ) : mt;
    final SubLObject v_genl_mts = all_genl_mts( mt, UNPROVIDED, UNPROVIDED );
    final SubLObject spec_mts = all_spec_mts( mt, UNPROVIDED, UNPROVIDED );
    return kb_utilities.sort_terms( keyhash_utilities.fast_intersection( v_genl_mts, spec_mts, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 26983L)
  public static SubLObject all_mt_loops(SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_loop_set = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
    final SubLObject monad_mts = isa.all_instances_in_all_mts( $const1$Microtheory );
    SubLObject equivalence_classes = NIL;
    final SubLObject preferred_mt_map = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource( SIX_INTEGER );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_ms_resource, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
      try
      {
        final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym46$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( mt_vars.$mt_mt$.getGlobalValue(), thread );
          final SubLObject list_var = monad_mts;
          final SubLObject _prev_bind_0_$6 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_1_$7 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$9 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( $str47$Identifying_MTs_in_loops, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = list_var;
              SubLObject monad_mt = NIL;
              monad_mt = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                if( NIL != forts.fort_p( monad_mt ) )
                {
                  final SubLObject monad_genl_card = cardinality_estimates.genl_cardinality( monad_mt );
                  final SubLObject monad_spec_card = cardinality_estimates.spec_cardinality( monad_mt );
                  final SubLObject direct_genl_mts = genl_mts( monad_mt, UNPROVIDED, UNPROVIDED );
                  SubLObject loop_witness_mt = NIL;
                  if( NIL == loop_witness_mt )
                  {
                    SubLObject csome_list_var_$10 = direct_genl_mts;
                    SubLObject candidate_mt = NIL;
                    candidate_mt = csome_list_var_$10.first();
                    while ( NIL == loop_witness_mt && NIL != csome_list_var_$10)
                    {
                      if( NIL != forts.fort_p( candidate_mt ) )
                      {
                        final SubLObject candidate_genl_card = cardinality_estimates.genl_cardinality( candidate_mt );
                        final SubLObject candidate_spec_card = cardinality_estimates.spec_cardinality( candidate_mt );
                        if( monad_genl_card.numE( candidate_genl_card ) && monad_spec_card.numE( candidate_spec_card ) && NIL != genl_mtP( candidate_mt, monad_mt, UNPROVIDED, UNPROVIDED ) )
                        {
                          if( NIL != verboseP )
                          {
                            Errors.warn( $str49$_S, monad_mt );
                          }
                          loop_witness_mt = candidate_mt;
                          set.set_add( monad_mt, mt_loop_set );
                        }
                      }
                      csome_list_var_$10 = csome_list_var_$10.rest();
                      candidate_mt = csome_list_var_$10.first();
                    }
                  }
                }
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                monad_mt = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_2_$9, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$7, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_0_$6, thread );
          }
          SubLObject sofar_var = ZERO_INTEGER;
          final SubLObject total_var = set.set_size( mt_loop_set );
          final SubLObject _prev_bind_0_$8 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_1_$8 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$10 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( $str50$Identifying_MT_Loop_Members );
              final SubLObject set_contents_var = set.do_set_internal( mt_loop_set );
              SubLObject basis_object;
              SubLObject state;
              SubLObject mt;
              SubLObject equivalent_mts;
              SubLObject current;
              SubLObject datum;
              SubLObject preferred_mt;
              SubLObject dispreferred_mts;
              SubLObject cdolist_list_var;
              SubLObject dispreferred_mt;
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                mt = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, mt ) )
                {
                  sofar_var = Numbers.add( sofar_var, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar_var, total_var );
                  if( NIL == dictionary.dictionary_lookup( preferred_mt_map, mt, UNPROVIDED ) )
                  {
                    equivalent_mts = coextensional_mts( mt );
                    if( NIL != verboseP )
                    {
                      Errors.warn( $str51$length__S_loop____S, Sequences.length( equivalent_mts ), equivalent_mts );
                    }
                    equivalence_classes = ConsesLow.cons( equivalent_mts, equivalence_classes );
                    datum = ( current = equivalent_mts );
                    preferred_mt = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                    preferred_mt = current.first();
                    current = ( dispreferred_mts = current.rest() );
                    dictionary.dictionary_enter( preferred_mt_map, preferred_mt, preferred_mt );
                    cdolist_list_var = dispreferred_mts;
                    dispreferred_mt = NIL;
                    dispreferred_mt = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      dictionary.dictionary_enter( preferred_mt_map, dispreferred_mt, preferred_mt );
                      cdolist_list_var = cdolist_list_var.rest();
                      dispreferred_mt = cdolist_list_var.first();
                    }
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_9, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$10, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$8, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$8, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$6, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$5, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0, thread );
    }
    equivalence_classes = Sort.sort( equivalence_classes, Symbols.symbol_function( $sym53$_ ), Symbols.symbol_function( $sym54$LENGTH ) );
    return Values.values( equivalence_classes, preferred_mt_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 29193L)
  public static SubLObject add_base_mt(SubLObject source, final SubLObject assertion)
  {
    return add_genl_mt( source, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 29503L)
  public static SubLObject add_genl_mt(SubLObject source, final SubLObject assertion)
  {
    final SubLObject spec = assertions_high.gaf_arg1( assertion );
    final SubLObject genl = assertions_high.gaf_arg2( assertion );
    if( NIL != assertions_high.assertion_has_truth( assertion, $kw44$TRUE ) )
    {
      cardinality_estimates.update_cardinality_estimates_wrt_genls( spec, genl );
    }
    sbhl_link_methods.sbhl_after_adding( source, assertion, sbhl_module_vars.get_sbhl_module( $const0$genlMt ) );
    after_adding_modules.clear_mt_dependent_caches( source, assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 29976L)
  public static SubLObject remove_base_mt(SubLObject source, final SubLObject assertion)
  {
    return remove_genl_mt( source, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 30203L)
  public static SubLObject remove_genl_mt(SubLObject source, final SubLObject assertion)
  {
    sbhl_link_methods.sbhl_after_removing( source, assertion, sbhl_module_vars.get_sbhl_module( $const0$genlMt ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 30407L)
  public static SubLObject clear_mt_graph()
  {
    sbhl_link_methods.clear_sbhl_module_graph( sbhl_module_vars.get_sbhl_module( $const0$genlMt ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 30621L)
  public static SubLObject clear_node_genl_mt_links(final SubLObject mt, final SubLObject mt_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$genlMt ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$genlMt ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), thread );
      sbhl_link_methods.clear_sbhl_links_within_mt( mt, mt_mt, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 30783L)
  public static SubLObject reset_genl_mt_links(final SubLObject mt, SubLObject mts)
  {
    if( mts == UNPROVIDED )
    {
      mts = NIL;
    }
    return reset_mts_links( mt, mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 30872L)
  public static SubLObject reset_mts_links(final SubLObject mt, SubLObject mts)
  {
    if( mts == UNPROVIDED )
    {
      mts = NIL;
    }
    final SubLObject out_mts = ( NIL != mts ) ? mts : sbhl_link_methods.sbhl_link_mts( sbhl_module_vars.get_sbhl_module( $const0$genlMt ), mt );
    final SubLObject in_mts = ( NIL != mts ) ? mts : genl_mt_mts( mt );
    SubLObject cdolist_list_var = out_mts;
    SubLObject mt_mt = NIL;
    mt_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      clear_node_genl_mt_links( mt, mt_mt );
      cdolist_list_var = cdolist_list_var.rest();
      mt_mt = cdolist_list_var.first();
    }
    cdolist_list_var = in_mts;
    mt_mt = NIL;
    mt_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      reset_mts_links_in_mt( mt, mt_mt );
      cdolist_list_var = cdolist_list_var.rest();
      mt_mt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 31201L)
  public static SubLObject reset_mts_links_in_mt(final SubLObject mt, final SubLObject mt_mt)
  {
    after_adding_modules.clear_mt_dependent_caches( T, T );
    sbhl_link_methods.sbhl_recompute_links( mt, mt_mt, sbhl_module_vars.get_sbhl_module( $const0$genlMt ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genl-mts.lisp", position = 31358L)
  public static SubLObject reset_mt_graph(SubLObject clearP)
  {
    if( clearP == UNPROVIDED )
    {
      clearP = T;
    }
    after_adding_modules.clear_mt_dependent_caches( T, T );
    if( NIL != clearP )
    {
      clear_mt_graph();
    }
    sbhl_link_methods.sbhl_recompute_graph_links( sbhl_module_vars.get_sbhl_module( $const0$genlMt ) );
    after_adding_modules.clear_mt_dependent_caches( T, T );
    return NIL;
  }

  public static SubLObject declare_genl_mts_file()
  {
    SubLFiles.declareFunction( me, "genl_mts", "GENL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "min_genl_mts", "MIN-GENL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "not_genl_mts", "NOT-GENL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "max_not_genl_mts", "MAX-NOT-GENL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "spec_mts", "SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "leaf_mtP", "LEAF-MT?", 1, 2, false );
    SubLFiles.declareFunction( me, "max_spec_mts", "MAX-SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "not_spec_mts", "NOT-SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "min_not_spec_mts", "MIN-NOT-SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "genl_mt_siblings", "GENL-MT-SIBLINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "spec_mt_siblings", "SPEC-MT-SIBLINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_genl_mts", "ALL-GENL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_genl_mts_internal", "ALL-GENL-MTS-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "all_spec_mts", "ALL-SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_spec_mts_internal", "ALL-SPEC-MTS-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "all_proper_genl_mts", "ALL-PROPER-GENL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_proper_spec_mts", "ALL-PROPER-SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "random_genl_mt", "RANDOM-GENL-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "random_spec_mt", "RANDOM-SPEC-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "random_proper_genl_mt", "RANDOM-PROPER-GENL-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "random_proper_spec_mt", "RANDOM-PROPER-SPEC-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "all_not_genl_mts", "ALL-NOT-GENL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_not_spec_mts", "ALL-NOT-SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_genl_mts_between", "ALL-GENL-MTS-BETWEEN", 2, 2, false );
    SubLFiles.declareFunction( me, "union_all_genl_mts", "UNION-ALL-GENL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "union_all_spec_mts", "UNION-ALL-SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_dependent_spec_mts", "ALL-DEPENDENT-SPEC-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_genl_mts_among", "ALL-GENL-MTS-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "all_spec_mts_among", "ALL-SPEC-MTS-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "selected_genl_mts", "SELECTED-GENL-MTS", 2, 2, false );
    SubLFiles.declareFunction( me, "all_genl_mts_if", "ALL-GENL-MTS-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "all_spec_mts_if", "ALL-SPEC-MTS-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_genl_mts", "MAP-ALL-GENL-MTS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_spec_mts", "MAP-ALL-SPEC-MTS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_union_all_genl_mts", "MAP-UNION-ALL-GENL-MTS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_genl_mts_of_all", "MAP-ALL-GENL-MTS-OF-ALL", 2, 2, false );
    SubLFiles.declareFunction( me, "map_union_all_spec_mts", "MAP-UNION-ALL-SPEC-MTS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_spec_mts_of_all", "MAP-ALL-SPEC-MTS-OF-ALL", 2, 2, false );
    SubLFiles.declareFunction( me, "genl_mtP", "GENL-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "proper_genl_mtP", "PROPER-GENL-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "monad_genl_mtP", "MONAD-GENL-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "spec_mtP", "SPEC-MT?", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_mt_ofP", "GENL-MT-OF?", 2, 2, false );
    SubLFiles.declareFunction( me, "any_genl_mtP_memoized_internal", "ANY-GENL-MT?-MEMOIZED-INTERNAL", 2, 2, false );
    SubLFiles.declareFunction( me, "any_genl_mtP_memoized", "ANY-GENL-MT?-MEMOIZED", 2, 2, false );
    SubLFiles.declareFunction( me, "any_genl_mtP", "ANY-GENL-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "genl_mt_of_anyP", "GENL-MT-OF-ANY?", 2, 2, false );
    SubLFiles.declareFunction( me, "all_genl_mtP", "ALL-GENL-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "genl_mt_of_allP", "GENL-MT-OF-ALL?", 2, 2, false );
    SubLFiles.declareFunction( me, "any_genl_mt_of_anyP", "ANY-GENL-MT-OF-ANY?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_genl_mtP", "NOT-GENL-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "argue_not_genl_mtP", "ARGUE-NOT-GENL-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_spec_mtP", "NOT-SPEC-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_any_genl_mtP", "NOT-ANY-GENL-MT?", 2, 2, false );
    SubLFiles.declareFunction( me, "mts_intersectP", "MTS-INTERSECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "mts_explicitly_intersectP", "MTS-EXPLICITLY-INTERSECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_genl_mtP", "WHY-GENL-MT?", 2, 3, false );
    SubLFiles.declareFunction( me, "why_monad_genl_mtP", "WHY-MONAD-GENL-MT?", 2, 3, false );
    SubLFiles.declareFunction( me, "any_just_of_genl_mt", "ANY-JUST-OF-GENL-MT", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_genl_mtP", "WHY-NOT-GENL-MT?", 2, 3, false );
    SubLFiles.declareFunction( me, "any_just_of_not_genl_mt", "ANY-JUST-OF-NOT-GENL-MT", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_all_base_mts", "CLEAR-ALL-BASE-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_all_base_mts", "REMOVE-ALL-BASE-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_base_mts_internal", "ALL-BASE-MTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "all_base_mts", "ALL-BASE-MTS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_base_mts", "DO-BASE-MTS" );
    SubLFiles.declareFunction( me, "min_mts", "MIN-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "min_mts_before_floors", "MIN-MTS-BEFORE-FLOORS", 1, 1, false );
    SubLFiles.declareFunction( me, "min_mts_2", "MIN-MTS-2", 2, 1, false );
    SubLFiles.declareFunction( me, "max_mts", "MAX-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "max_mts_before_ceiling", "MAX-MTS-BEFORE-CEILING", 1, 1, false );
    SubLFiles.declareFunction( me, "min_ceiling_mts", "MIN-CEILING-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "max_floor_mts", "MAX-FLOOR-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "max_floor_mts_explosion_warning_internal", "MAX-FLOOR-MTS-EXPLOSION-WARNING-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_explosion_warning", "MAX-FLOOR-MTS-EXPLOSION-WARNING", 2, 0, false );
    SubLFiles.declareFunction( me, "show_max_floor_mts_info", "SHOW-MAX-FLOOR-MTS-INFO", 1, 3, false );
    SubLFiles.declareFunction( me, "max_floor_hlmts", "MAX-FLOOR-HLMTS", 3, 0, false );
    SubLFiles.declareFunction( me, "max_floor_monad_mts_internal", "MAX-FLOOR-MONAD-MTS-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "max_floor_monad_mts", "MAX-FLOOR-MONAD-MTS", 3, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_with_cycles_pruned", "MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 2, false );
    SubLFiles.declareFunction( me, "max_floor_hlmts_with_cycles_pruned", "MAX-FLOOR-HLMTS-WITH-CYCLES-PRUNED", 3, 0, false );
    SubLFiles.declareFunction( me, "max_floor_monad_mts_with_cycles_pruned", "MAX-FLOOR-MONAD-MTS-WITH-CYCLES-PRUNED", 3, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_from_mt_sets", "MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_max_floor_mts_from_mt_sets", "CLEAR-CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_max_floor_mts_from_mt_sets", "REMOVE-CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_max_floor_mts_from_mt_sets_internal", "CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_max_floor_mts_from_mt_sets", "CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_genl_mt_paths", "MAX-FLOOR-MTS-OF-GENL-MT-PATHS", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_mts", "GENL-MT-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_genl_mtsP", "ASSERTED-GENL-MTS?", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_genl_mts", "ASSERTED-GENL-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "genl_mts_from_asserted_assertions", "GENL-MTS-FROM-ASSERTED-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_not_genl_mts", "ASSERTED-NOT-GENL-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_genl_mts", "SUPPORTED-GENL-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_not_genl_mts", "SUPPORTED-NOT-GENL-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_spec_mtsP", "ASSERTED-SPEC-MTS?", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_spec_mts", "ASSERTED-SPEC-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_not_spec_mts", "ASSERTED-NOT-SPEC-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_spec_mts", "SUPPORTED-SPEC-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_not_spec_mts", "SUPPORTED-NOT-SPEC-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "coextensional_mts", "COEXTENSIONAL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_mt_loops", "ALL-MT-LOOPS", 0, 1, false );
    SubLFiles.declareFunction( me, "add_base_mt", "ADD-BASE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "add_genl_mt", "ADD-GENL-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_base_mt", "REMOVE-BASE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_genl_mt", "REMOVE-GENL-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_mt_graph", "CLEAR-MT-GRAPH", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_node_genl_mt_links", "CLEAR-NODE-GENL-MT-LINKS", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_genl_mt_links", "RESET-GENL-MT-LINKS", 1, 1, false );
    SubLFiles.declareFunction( me, "reset_mts_links", "RESET-MTS-LINKS", 1, 1, false );
    SubLFiles.declareFunction( me, "reset_mts_links_in_mt", "RESET-MTS-LINKS-IN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_mt_graph", "RESET-MT-GRAPH", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_genl_mts_file()
  {
    $all_base_mts_caching_state$ = SubLFiles.deflexical( "*ALL-BASE-MTS-CACHING-STATE*", NIL );
    $min_mts_2_enabledP$ = SubLFiles.defvar( "*MIN-MTS-2-ENABLED?*", NIL );
    $suppress_max_floor_mts_explosion_warning$ = SubLFiles.defparameter( "*SUPPRESS-MAX-FLOOR-MTS-EXPLOSION-WARNING*", NIL );
    $max_floor_mts_explosion_warning_min_placements_mt_count$ = SubLFiles.defparameter( "*MAX-FLOOR-MTS-EXPLOSION-WARNING-MIN-PLACEMENTS-MT-COUNT*", FIVE_INTEGER );
    $cached_max_floor_mts_from_mt_sets_caching_state$ = SubLFiles.deflexical( "*CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_genl_mts_file()
  {
    memoization_state.note_memoized_function( $sym4$ANY_GENL_MT__MEMOIZED );
    utilities_macros.register_cyc_api_function( $sym7$ANY_GENL_MT_, $list8, $str9$_any_genl_mt__spec_genls__is_t_if, $list10, $list11 );
    memoization_state.note_globally_cached_function( $sym12$ALL_BASE_MTS );
    memoization_state.note_memoized_function( $sym22$MAX_FLOOR_MTS_EXPLOSION_WARNING );
    memoization_state.note_memoized_function( $sym37$MAX_FLOOR_MONAD_MTS );
    memoization_state.note_globally_cached_function( $sym40$CACHED_MAX_FLOOR_MTS_FROM_MT_SETS );
    utilities_macros.register_kb_function( $sym55$ADD_BASE_MT );
    utilities_macros.register_kb_function( $sym56$ADD_GENL_MT );
    utilities_macros.register_kb_function( $sym57$REMOVE_BASE_MT );
    utilities_macros.register_kb_function( $sym58$REMOVE_GENL_MT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_genl_mts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_genl_mts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_genl_mts_file();
  }
  static
  {
    me = new genl_mts();
    $all_base_mts_caching_state$ = null;
    $min_mts_2_enabledP$ = null;
    $suppress_max_floor_mts_explosion_warning$ = null;
    $max_floor_mts_explosion_warning_min_placements_mt_count$ = null;
    $cached_max_floor_mts_from_mt_sets_caching_state$ = null;
    $const0$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const1$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $sym2$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const3$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym4$ANY_GENL_MT__MEMOIZED = makeSymbol( "ANY-GENL-MT?-MEMOIZED" );
    $sym5$EL_FORT_P = makeSymbol( "EL-FORT-P" );
    $sym6$CORE_MICROTHEORY_P = makeSymbol( "CORE-MICROTHEORY-P" );
    $sym7$ANY_GENL_MT_ = makeSymbol( "ANY-GENL-MT?" );
    $list8 = ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "GENLS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT-MT" ), makeSymbol( "*MT-MT*" ) ), makeSymbol( "TV" ) );
    $str9$_any_genl_mt__spec_genls__is_t_if = makeString( "(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "GENLS" ), makeSymbol( "EL-FORT-P" ) ) );
    $list11 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym12$ALL_BASE_MTS = makeSymbol( "ALL-BASE-MTS" );
    $sym13$_ALL_BASE_MTS_CACHING_STATE_ = makeSymbol( "*ALL-BASE-MTS-CACHING-STATE*" );
    $int14$2048 = makeInteger( 2048 );
    $int15$1000 = makeInteger( 1000 );
    $list16 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym17$BASE_MT = makeUninternedSymbol( "BASE-MT" );
    $sym18$CDOLIST = makeSymbol( "CDOLIST" );
    $sym19$WITH_MT = makeSymbol( "WITH-MT" );
    $kw20$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym21$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym22$MAX_FLOOR_MTS_EXPLOSION_WARNING = makeSymbol( "MAX-FLOOR-MTS-EXPLOSION-WARNING" );
    $str23$__Forward_inference_mt_placement_ = makeString( "~&Forward inference mt placement explosion detected (~A -> ~A): (show-max-floor-mts-info ~S ~A ~A)~A" );
    $sym24$NART_P = makeSymbol( "NART-P" );
    $sym25$NART_EL_FORMULA = makeSymbol( "NART-EL-FORMULA" );
    $str26$ = makeString( "" );
    $str27$____KB__A = makeString( " ;; KB ~A" );
    $str28$__gaf__ = makeString( "~&gaf: " );
    $str29$__rule__ = makeString( "~&rule: " );
    $str30$___S_____A__ = makeString( "~&~S ;; ~A~%" );
    $sym31$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE>" );
    $str32$_______ = makeString( "~&-->~%" );
    $str33$Repropagaing = makeString( "Repropagaing" );
    $sym34$_EXIT = makeSymbol( "%EXIT" );
    $sym35$ATEMPORAL_HLMT_ = makeSymbol( "ATEMPORAL-HLMT?" );
    $sym36$HLMT_MONAD_MT = makeSymbol( "HLMT-MONAD-MT" );
    $sym37$MAX_FLOOR_MONAD_MTS = makeSymbol( "MAX-FLOOR-MONAD-MTS" );
    $sym38$UNION = makeSymbol( "UNION" );
    $sym39$MAX_FLOOR_MTS = makeSymbol( "MAX-FLOOR-MTS" );
    $sym40$CACHED_MAX_FLOOR_MTS_FROM_MT_SETS = makeSymbol( "CACHED-MAX-FLOOR-MTS-FROM-MT-SETS" );
    $sym41$_CACHED_MAX_FLOOR_MTS_FROM_MT_SETS_CACHING_STATE_ = makeSymbol( "*CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-CACHING-STATE*" );
    $int42$10000 = makeInteger( 10000 );
    $kw43$GAF = makeKeyword( "GAF" );
    $kw44$TRUE = makeKeyword( "TRUE" );
    $sym45$POSSIBLY_HLMT_P = makeSymbol( "POSSIBLY-HLMT-P" );
    $sym46$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $str47$Identifying_MTs_in_loops = makeString( "Identifying MTs in loops" );
    $str48$cdolist = makeString( "cdolist" );
    $str49$_S = makeString( "~S" );
    $str50$Identifying_MT_Loop_Members = makeString( "Identifying MT Loop Members" );
    $str51$length__S_loop____S = makeString( "length ~S loop:~%~S" );
    $list52 = ConsesLow.list( makeSymbol( "PREFERRED-MT" ), makeSymbol( "&REST" ), makeSymbol( "DISPREFERRED-MTS" ) );
    $sym53$_ = makeSymbol( ">" );
    $sym54$LENGTH = makeSymbol( "LENGTH" );
    $sym55$ADD_BASE_MT = makeSymbol( "ADD-BASE-MT" );
    $sym56$ADD_GENL_MT = makeSymbol( "ADD-GENL-MT" );
    $sym57$REMOVE_BASE_MT = makeSymbol( "REMOVE-BASE-MT" );
    $sym58$REMOVE_GENL_MT = makeSymbol( "REMOVE-GENL-MT" );
  }
}
/*
 * 
 * Total time: 633 ms
 * 
 */