package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_nat_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities";
  public static final String myFingerPrint = "b8013975ba6f37ba5c412c289f4a6be5e3506d9838ed11dc1c3b8a44de1f05f1";
  private static final SubLSymbol $sym0$RESET_NAT_ISA_LINKS_INT;
  private static final SubLObject $const1$termOfUnit;
  private static final SubLSymbol $sym2$ASSERTION_P;
  private static final SubLSymbol $sym3$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const4$EverythingPSC;
  private static final SubLObject $const5$MtUnionFn;
  private static final SubLSymbol $sym6$SBHL_RESULT_GENL;
  private static final SubLSymbol $sym7$RESULT_GENL_ARGS;
  private static final SubLSymbol $sym8$RESULT_INTER_ARG_GENL;
  private static final SubLSymbol $sym9$RESULT_INTER_ARG_GENL_RELN;
  private static final SubLSymbol $sym10$RESULT_GENL_VIA_ARG_ARG_GENL;
  private static final SubLSymbol $sym11$SBHL_RESULT_ISA;
  private static final SubLSymbol $sym12$RESULT_ISA_ARGS;
  private static final SubLSymbol $sym13$RESULT_INTER_ARG_ISA;
  private static final SubLSymbol $sym14$RESULT_INTER_ARG_ISA_RELN;
  private static final SubLSymbol $sym15$RESULT_ISA_VIA_ARG_ARG_ISA;
  private static final SubLSymbol $sym16$RESULT_ISA_ARG_ISAS;
  private static final SubLSymbol $sym17$RESULT_ISA_WHEN_ARG_ISA;
  private static final SubLSymbol $sym18$RESULT_ISA_VIA_CLOSED_UNDER;
  private static final SubLSymbol $sym19$SBHL_EVALUATION_RESULT_QUOTED_ISA;
  private static final SubLSymbol $sym20$SBHL_RESULT_QUOTED_ISA;
  private static final SubLObject $const21$resultGenl;
  private static final SubLSymbol $kw22$TRUE;
  private static final SubLObject $const23$resultGenlArg;
  private static final SubLObject $const24$interArgResultGenl;
  private static final SubLObject $const25$interArgResultGenlReln;
  private static final SubLObject $const26$resultIsa;
  private static final SubLObject $const27$resultIsaArg;
  private static final SubLObject $const28$interArgResultIsa;
  private static final SubLObject $const29$interArgResultIsaReln;
  private static final SubLObject $const30$resultIsaArgIsa;
  private static final SubLObject $const31$resultIsaWhenArgIsa;
  private static final SubLObject $const32$closedUnder;
  private static final SubLObject $const33$evaluationResultQuotedIsa;
  private static final SubLObject $const34$resultQuotedIsa;
  private static final SubLSymbol $sym35$RESULT_GENL;
  private static final SubLSymbol $sym36$RESULT_ISA;
  private static final SubLSymbol $sym37$RESULT_ISA_ARG_ISA;
  private static final SubLSymbol $sym38$EVALUATION_RESULT_QUOTED_ISA;
  private static final SubLSymbol $sym39$RESULT_QUOTED_ISA;
  private static final SubLString $str40$_a_is_not_a_supported_NAUT_link_g;
  private static final SubLSymbol $sym41$CYC_VAR_;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 784L)
  public static SubLObject reset_nat_isa_links()
  {
    kb_mapping.map_predicate_extent_index( Symbols.symbol_function( $sym0$RESET_NAT_ISA_LINKS_INT ), $const1$termOfUnit, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 963L)
  public static SubLObject reset_nat_isa_links_int(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject nat = assertions_high.gaf_arg1( assertion );
    SubLObject redoP = NIL;
    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
      redoP = Types.sublisp_null( isa.isa( nat, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != redoP )
    {
      _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
      try
      {
        system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
        isa.reset_isa_links( nat );
      }
      finally
      {
        system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 1250L)
  public static SubLObject sbhl_result_genl(final SubLObject node)
  {
    return kb_accessors.result_genl( cycl_utilities.nat_functor( node ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 1508L)
  public static SubLObject sbhl_result_isa(final SubLObject node)
  {
    return kb_accessors.result_isa( cycl_utilities.nat_functor( node ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 1651L)
  public static SubLObject sbhl_evaluation_result_quoted_isa(final SubLObject node)
  {
    return kb_accessors.evaluation_result_quoted_isa( cycl_utilities.nat_functor( node ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 1848L)
  public static SubLObject sbhl_result_quoted_isa(final SubLObject node)
  {
    return kb_accessors.result_quoted_isa( cycl_utilities.nat_functor( node ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 2023L)
  public static SubLObject sbhl_naut_forward_genl_mts(final SubLObject node)
  {
    final SubLObject pcase_var = cycl_utilities.nat_functor( node );
    if( pcase_var.eql( $const5$MtUnionFn ) )
    {
      return hlmt.mt_union_mts( node );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 2220L)
  public static SubLObject sbhl_determine_naut_just_step(final SubLObject node, final SubLObject link_node, final SubLObject link_generator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( link_generator.eql( $sym6$SBHL_RESULT_GENL ) )
    {
      return sbhl_result_genl_just( node, link_node );
    }
    if( link_generator.eql( $sym7$RESULT_GENL_ARGS ) )
    {
      return sbhl_result_genl_args_just( node, link_node );
    }
    if( link_generator.eql( $sym8$RESULT_INTER_ARG_GENL ) )
    {
      return sbhl_inter_arg_genl_just( node, link_node );
    }
    if( link_generator.eql( $sym9$RESULT_INTER_ARG_GENL_RELN ) )
    {
      return sbhl_inter_arg_genl_reln_just( node, link_node );
    }
    if( link_generator.eql( $sym10$RESULT_GENL_VIA_ARG_ARG_GENL ) )
    {
      return sbhl_result_genl_via_arg_arg_genl_just( node, link_node );
    }
    if( link_generator.eql( $sym11$SBHL_RESULT_ISA ) )
    {
      return sbhl_result_isa_just( node, link_node );
    }
    if( link_generator.eql( $sym12$RESULT_ISA_ARGS ) )
    {
      return sbhl_result_isa_args_just( node, link_node );
    }
    if( link_generator.eql( $sym13$RESULT_INTER_ARG_ISA ) )
    {
      return sbhl_result_inter_arg_isa_just( node, link_node );
    }
    if( link_generator.eql( $sym14$RESULT_INTER_ARG_ISA_RELN ) )
    {
      return sbhl_result_inter_arg_isa_reln_just( node, link_node );
    }
    if( link_generator.eql( $sym15$RESULT_ISA_VIA_ARG_ARG_ISA ) )
    {
      return sbhl_result_isa_via_arg_arg_isa_just( node, link_node );
    }
    if( link_generator.eql( $sym16$RESULT_ISA_ARG_ISAS ) )
    {
      return sbhl_result_isa_arg_isas_just( node, link_node );
    }
    if( link_generator.eql( $sym17$RESULT_ISA_WHEN_ARG_ISA ) )
    {
      return sbhl_result_isa_when_arg_isa_just( node, link_node );
    }
    if( link_generator.eql( $sym18$RESULT_ISA_VIA_CLOSED_UNDER ) )
    {
      return sbhl_result_isa_via_closed_under_just( node, link_node );
    }
    if( link_generator.eql( $sym19$SBHL_EVALUATION_RESULT_QUOTED_ISA ) )
    {
      return sbhl_evaluation_result_quoted_isa_just( node, link_node );
    }
    if( link_generator.eql( $sym20$SBHL_RESULT_QUOTED_ISA ) )
    {
      return sbhl_result_quoted_isa_just( node, link_node );
    }
    return arguments.make_hl_support( sbhl_module_utilities.sbhl_pred_get_hl_module( sbhl_module_vars.get_sbhl_module_link_pred( sbhl_search_vars.$sbhl_search_module$.getDynamicValue( thread ) ) ), ConsesLow.list(
        sbhl_module_vars.get_sbhl_module_link_pred( sbhl_search_vars.$sbhl_search_module$.getDynamicValue( thread ) ), node, link_node ), mt_relevance_macros.$mt$.getDynamicValue( thread ), sbhl_search_utilities
            .hl_default_tv( sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 3936L)
  public static SubLObject sbhl_result_genl_just(final SubLObject node, final SubLObject link_node)
  {
    return ConsesLow.list( ConsesLow.list( $const21$resultGenl, cycl_utilities.nat_functor( node ), link_node ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 4069L)
  public static SubLObject sbhl_result_genl_args_just(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject args = kb_accessors.result_genl_via_argnums( node, link_node, UNPROVIDED, UNPROVIDED );
    return ConsesLow.list( ConsesLow.list( $const23$resultGenlArg, cycl_utilities.nat_functor( node ), args.first() ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 4274L)
  public static SubLObject sbhl_inter_arg_genl_just(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject args = kb_accessors.result_inter_arg_genl_via_which_args( node, link_node, UNPROVIDED ).first();
    final SubLObject arg = args.first();
    final SubLObject ind_col = conses_high.second( args );
    final SubLObject dep_col = conses_high.third( args );
    return ConsesLow.list( ConsesLow.list( $const24$interArgResultGenl, cycl_utilities.nat_functor( node ), arg, ind_col, dep_col ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 4586L)
  public static SubLObject sbhl_inter_arg_genl_reln_just(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject args = kb_accessors.result_inter_arg_genl_reln_via_which_args( node, link_node, UNPROVIDED, UNPROVIDED ).first();
    final SubLObject rel_sentence = args.first().first();
    final SubLObject arg = conses_high.second( args );
    final SubLObject rel = cycl_utilities.formula_operator( rel_sentence );
    final SubLObject rel_nat_term_arg = conses_high.third( args );
    final SubLObject rel_col_arg = conses_high.fourth( args );
    return ConsesLow.list( ConsesLow.list( $const25$interArgResultGenlReln, cycl_utilities.nat_functor( node ), arg, rel, rel_nat_term_arg, rel_col_arg ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 5027L)
  public static SubLObject sbhl_result_genl_via_arg_arg_genl_just(final SubLObject node, final SubLObject link_node)
  {
    return sbhl_result_genl_args_just( node, link_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 5155L)
  public static SubLObject sbhl_result_isa_just(final SubLObject node, final SubLObject link_node)
  {
    return ConsesLow.list( ConsesLow.list( $const26$resultIsa, cycl_utilities.nat_functor( node ), link_node ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 5286L)
  public static SubLObject sbhl_result_isa_args_just(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject args = kb_accessors.result_isa_via_argnums( node, link_node, UNPROVIDED, UNPROVIDED );
    return ConsesLow.list( ConsesLow.list( $const27$resultIsaArg, cycl_utilities.nat_functor( node ), args.first() ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 5488L)
  public static SubLObject sbhl_result_inter_arg_isa_just(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject args = kb_accessors.result_inter_arg_isa_via_which_args( node, link_node, UNPROVIDED, UNPROVIDED ).first();
    final SubLObject arg = args.first();
    final SubLObject ind_col = conses_high.second( args );
    final SubLObject dep_col = conses_high.third( args );
    return ConsesLow.list( ConsesLow.list( $const28$interArgResultIsa, cycl_utilities.nat_functor( node ), arg, ind_col, dep_col ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 5804L)
  public static SubLObject sbhl_result_inter_arg_isa_reln_just(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject args = kb_accessors.result_inter_arg_isa_reln_via_which_args( node, link_node, UNPROVIDED, UNPROVIDED ).first();
    final SubLObject rel_sentence = args.first().first();
    final SubLObject arg = conses_high.second( args );
    final SubLObject rel = cycl_utilities.formula_operator( rel_sentence );
    final SubLObject rel_nat_term_arg = conses_high.third( args );
    final SubLObject rel_col_arg = conses_high.fourth( args );
    return ConsesLow.list( ConsesLow.list( $const29$interArgResultIsaReln, cycl_utilities.nat_functor( node ), arg, rel, rel_nat_term_arg, rel_col_arg ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 6249L)
  public static SubLObject sbhl_result_isa_arg_isas_just(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject args = kb_accessors.result_isa_arg_isa_via_argnums( node, link_node, UNPROVIDED, UNPROVIDED );
    final SubLObject isa_arg = args.first();
    return ConsesLow.list( ConsesLow.list( $const30$resultIsaArgIsa, cycl_utilities.nat_functor( node ), isa_arg ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 6525L)
  public static SubLObject sbhl_result_isa_when_arg_isa_just(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject resultcol_argnum_col = kb_accessors.result_isa_when_arg_isa_via_argnums( node, link_node, UNPROVIDED, UNPROVIDED );
    final SubLObject resultcol = resultcol_argnum_col.first();
    final SubLObject argnum = conses_high.second( resultcol_argnum_col );
    final SubLObject col = conses_high.third( resultcol_argnum_col );
    return ConsesLow.list( ConsesLow.list( $const31$resultIsaWhenArgIsa, cycl_utilities.nat_functor( node ), resultcol, argnum, col ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 7110L)
  public static SubLObject sbhl_result_isa_via_closed_under_just(final SubLObject node, final SubLObject link_node)
  {
    SubLObject result = NIL;
    result = ConsesLow.list( ConsesLow.list( $const32$closedUnder, link_node, cycl_utilities.nat_functor( node ) ), NIL, $kw22$TRUE );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 7617L)
  public static SubLObject sbhl_result_isa_via_arg_arg_isa_just(final SubLObject node, final SubLObject link_node)
  {
    return sbhl_result_isa_args_just( node, link_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 7742L)
  public static SubLObject sbhl_evaluation_result_quoted_isa_just(final SubLObject node, final SubLObject link_node)
  {
    return ConsesLow.list( ConsesLow.list( $const33$evaluationResultQuotedIsa, cycl_utilities.nat_functor( node ), link_node ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 7907L)
  public static SubLObject sbhl_result_quoted_isa_just(final SubLObject node, final SubLObject link_node)
  {
    return ConsesLow.list( ConsesLow.list( $const34$resultQuotedIsa, cycl_utilities.nat_functor( node ), link_node ), NIL, $kw22$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 8051L)
  public static SubLObject sbhl_determine_naut_link_mts(final SubLObject node, final SubLObject link_node, final SubLObject link_generator)
  {
    if( link_generator.eql( $sym35$RESULT_GENL ) )
    {
      return result_genl_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym7$RESULT_GENL_ARGS ) )
    {
      return result_genl_arg_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym8$RESULT_INTER_ARG_GENL ) )
    {
      return result_inter_arg_genl_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym9$RESULT_INTER_ARG_GENL_RELN ) )
    {
      return result_inter_arg_genl_reln_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym10$RESULT_GENL_VIA_ARG_ARG_GENL ) )
    {
      return result_genl_via_arg_arg_genl_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym36$RESULT_ISA ) )
    {
      return result_isa_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym12$RESULT_ISA_ARGS ) )
    {
      return result_isa_arg_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym13$RESULT_INTER_ARG_ISA ) )
    {
      return result_inter_arg_isa_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym14$RESULT_INTER_ARG_ISA_RELN ) )
    {
      return result_inter_arg_isa_reln_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym15$RESULT_ISA_VIA_ARG_ARG_ISA ) )
    {
      return result_isa_via_arg_arg_isa_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym16$RESULT_ISA_ARG_ISAS ) )
    {
      return result_isa_arg_isa_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym37$RESULT_ISA_ARG_ISA ) )
    {
      return result_isa_when_arg_isa_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym18$RESULT_ISA_VIA_CLOSED_UNDER ) )
    {
      return result_isa_via_closed_under_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym38$EVALUATION_RESULT_QUOTED_ISA ) )
    {
      return evaluation_result_quoted_isa_by_what_mts( node, link_node );
    }
    if( link_generator.eql( $sym39$RESULT_QUOTED_ISA ) )
    {
      return result_quoted_isa_by_what_mts( node, link_node );
    }
    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str40$_a_is_not_a_supported_NAUT_link_g, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 9629L)
  public static SubLObject result_genl_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject functor = cycl_utilities.nat_functor( node );
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_indexing.gaf_mts( ConsesLow.list( $const21$resultGenl, node, link_node ) );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_genl_by_what_mts( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( node, UNPROVIDED ) ), link_node );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym41$CYC_VAR_ ), UNPROVIDED ) )
    {
      sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 10086L)
  public static SubLObject result_genl_arg_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject functor = cycl_utilities.nat_functor( node );
    SubLObject result = NIL;
    if( NIL != forts.fort_p( functor ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( functor, $const23$resultGenlArg, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( arg.isInteger() && cycl_utilities.nat_arg( node, arg, UNPROVIDED ).equal( link_node ) )
          {
            result = ConsesLow.nconc( kb_indexing.gaf_mts( ConsesLow.list( $const23$resultGenlArg, functor, arg ) ), result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      result = result_genl_arg_by_what_mts( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( node, UNPROVIDED ) ), link_node );
    }
    else if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym41$CYC_VAR_ ), UNPROVIDED ) )
    {
      sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 10764L)
  public static SubLObject result_genl_via_arg_arg_genl_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 10929L)
  public static SubLObject result_inter_arg_genl_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 11087L)
  public static SubLObject result_inter_arg_genl_reln_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 11250L)
  public static SubLObject result_isa_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject functor = cycl_utilities.nat_functor( node );
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_indexing.gaf_mts( ConsesLow.list( $const26$resultIsa, node, link_node ) );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_by_what_mts( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( node, UNPROVIDED ) ), link_node );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym41$CYC_VAR_ ), UNPROVIDED ) )
    {
      sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 11698L)
  public static SubLObject result_isa_arg_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject functor = cycl_utilities.nat_functor( node );
    SubLObject result = NIL;
    if( NIL != forts.fort_p( functor ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( functor, $const27$resultIsaArg, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( arg.isInteger() && cycl_utilities.nat_arg( node, arg, UNPROVIDED ).equal( link_node ) )
          {
            result = ConsesLow.nconc( kb_indexing.gaf_mts( ConsesLow.list( $const27$resultIsaArg, functor, arg ) ), result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      result = result_isa_arg_by_what_mts( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( node, UNPROVIDED ) ), link_node );
    }
    else if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym41$CYC_VAR_ ), UNPROVIDED ) )
    {
      sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 12368L)
  public static SubLObject result_isa_via_arg_arg_isa_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 12531L)
  public static SubLObject result_inter_arg_isa_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 12688L)
  public static SubLObject result_inter_arg_isa_reln_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 12850L)
  public static SubLObject result_isa_arg_isa_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 13005L)
  public static SubLObject result_isa_when_arg_isa_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 13165L)
  public static SubLObject result_isa_via_closed_under_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    SubLObject mts = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cycl_utilities.nat_args( node, UNPROVIDED );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      mts = ConsesLow.nconc( isa.max_floor_mts_of_isa_paths( arg, link_node, UNPROVIDED ), mts );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    mts = genl_mts.max_floor_mts( mts, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var2;
    final SubLObject closed_under_assertions = cdolist_list_var2 = kb_indexing.find_all_gafs( ConsesLow.list( $const32$closedUnder, link_node, cycl_utilities.nat_functor( node ), NIL, $kw22$TRUE ) );
    SubLObject cu_ass = NIL;
    cu_ass = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject cu_mt = assertions_high.assertion_mt( cu_ass );
      result = ConsesLow.nconc( genl_mts.max_floor_mts( ConsesLow.cons( cu_mt, mts ), UNPROVIDED, UNPROVIDED ), result );
      cdolist_list_var2 = cdolist_list_var2.rest();
      cu_ass = cdolist_list_var2.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 13733L)
  public static SubLObject evaluation_result_quoted_isa_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject functor = cycl_utilities.nat_functor( node );
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_indexing.gaf_mts( ConsesLow.list( $const33$evaluationResultQuotedIsa, node, link_node ) );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return evaluation_result_quoted_isa_by_what_mts( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( node, UNPROVIDED ) ), link_node );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym41$CYC_VAR_ ), UNPROVIDED ) )
    {
      sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-nat-utilities.lisp", position = 14231L)
  public static SubLObject result_quoted_isa_by_what_mts(final SubLObject node, final SubLObject link_node)
  {
    final SubLObject functor = cycl_utilities.nat_functor( node );
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_indexing.gaf_mts( ConsesLow.list( $const34$resultQuotedIsa, node, link_node ) );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_quoted_isa_by_what_mts( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( node, UNPROVIDED ) ), link_node );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym41$CYC_VAR_ ), UNPROVIDED ) )
    {
      sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
      return NIL;
    }
    return NIL;
  }

  public static SubLObject declare_sbhl_nat_utilities_file()
  {
    SubLFiles.declareFunction( me, "reset_nat_isa_links", "RESET-NAT-ISA-LINKS", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_nat_isa_links_int", "RESET-NAT-ISA-LINKS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_genl", "SBHL-RESULT-GENL", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_isa", "SBHL-RESULT-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_evaluation_result_quoted_isa", "SBHL-EVALUATION-RESULT-QUOTED-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_quoted_isa", "SBHL-RESULT-QUOTED-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_naut_forward_genl_mts", "SBHL-NAUT-FORWARD-GENL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_determine_naut_just_step", "SBHL-DETERMINE-NAUT-JUST-STEP", 3, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_genl_just", "SBHL-RESULT-GENL-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_genl_args_just", "SBHL-RESULT-GENL-ARGS-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_inter_arg_genl_just", "SBHL-INTER-ARG-GENL-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_inter_arg_genl_reln_just", "SBHL-INTER-ARG-GENL-RELN-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_genl_via_arg_arg_genl_just", "SBHL-RESULT-GENL-VIA-ARG-ARG-GENL-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_isa_just", "SBHL-RESULT-ISA-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_isa_args_just", "SBHL-RESULT-ISA-ARGS-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_inter_arg_isa_just", "SBHL-RESULT-INTER-ARG-ISA-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_inter_arg_isa_reln_just", "SBHL-RESULT-INTER-ARG-ISA-RELN-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_isa_arg_isas_just", "SBHL-RESULT-ISA-ARG-ISAS-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_isa_when_arg_isa_just", "SBHL-RESULT-ISA-WHEN-ARG-ISA-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_isa_via_closed_under_just", "SBHL-RESULT-ISA-VIA-CLOSED-UNDER-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_isa_via_arg_arg_isa_just", "SBHL-RESULT-ISA-VIA-ARG-ARG-ISA-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_evaluation_result_quoted_isa_just", "SBHL-EVALUATION-RESULT-QUOTED-ISA-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_result_quoted_isa_just", "SBHL-RESULT-QUOTED-ISA-JUST", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_determine_naut_link_mts", "SBHL-DETERMINE-NAUT-LINK-MTS", 3, 0, false );
    SubLFiles.declareFunction( me, "result_genl_by_what_mts", "RESULT-GENL-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_genl_arg_by_what_mts", "RESULT-GENL-ARG-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_genl_via_arg_arg_genl_by_what_mts", "RESULT-GENL-VIA-ARG-ARG-GENL-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_inter_arg_genl_by_what_mts", "RESULT-INTER-ARG-GENL-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_inter_arg_genl_reln_by_what_mts", "RESULT-INTER-ARG-GENL-RELN-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_isa_by_what_mts", "RESULT-ISA-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_isa_arg_by_what_mts", "RESULT-ISA-ARG-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_isa_via_arg_arg_isa_by_what_mts", "RESULT-ISA-VIA-ARG-ARG-ISA-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_by_what_mts", "RESULT-INTER-ARG-ISA-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_reln_by_what_mts", "RESULT-INTER-ARG-ISA-RELN-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_isa_arg_isa_by_what_mts", "RESULT-ISA-ARG-ISA-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_isa_when_arg_isa_by_what_mts", "RESULT-ISA-WHEN-ARG-ISA-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_isa_via_closed_under_by_what_mts", "RESULT-ISA-VIA-CLOSED-UNDER-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "evaluation_result_quoted_isa_by_what_mts", "EVALUATION-RESULT-QUOTED-ISA-BY-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "result_quoted_isa_by_what_mts", "RESULT-QUOTED-ISA-BY-WHAT-MTS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sbhl_nat_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_sbhl_nat_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_nat_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_nat_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_nat_utilities_file();
  }
  static
  {
    me = new sbhl_nat_utilities();
    $sym0$RESET_NAT_ISA_LINKS_INT = makeSymbol( "RESET-NAT-ISA-LINKS-INT" );
    $const1$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $sym2$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym3$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const4$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const5$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $sym6$SBHL_RESULT_GENL = makeSymbol( "SBHL-RESULT-GENL" );
    $sym7$RESULT_GENL_ARGS = makeSymbol( "RESULT-GENL-ARGS" );
    $sym8$RESULT_INTER_ARG_GENL = makeSymbol( "RESULT-INTER-ARG-GENL" );
    $sym9$RESULT_INTER_ARG_GENL_RELN = makeSymbol( "RESULT-INTER-ARG-GENL-RELN" );
    $sym10$RESULT_GENL_VIA_ARG_ARG_GENL = makeSymbol( "RESULT-GENL-VIA-ARG-ARG-GENL" );
    $sym11$SBHL_RESULT_ISA = makeSymbol( "SBHL-RESULT-ISA" );
    $sym12$RESULT_ISA_ARGS = makeSymbol( "RESULT-ISA-ARGS" );
    $sym13$RESULT_INTER_ARG_ISA = makeSymbol( "RESULT-INTER-ARG-ISA" );
    $sym14$RESULT_INTER_ARG_ISA_RELN = makeSymbol( "RESULT-INTER-ARG-ISA-RELN" );
    $sym15$RESULT_ISA_VIA_ARG_ARG_ISA = makeSymbol( "RESULT-ISA-VIA-ARG-ARG-ISA" );
    $sym16$RESULT_ISA_ARG_ISAS = makeSymbol( "RESULT-ISA-ARG-ISAS" );
    $sym17$RESULT_ISA_WHEN_ARG_ISA = makeSymbol( "RESULT-ISA-WHEN-ARG-ISA" );
    $sym18$RESULT_ISA_VIA_CLOSED_UNDER = makeSymbol( "RESULT-ISA-VIA-CLOSED-UNDER" );
    $sym19$SBHL_EVALUATION_RESULT_QUOTED_ISA = makeSymbol( "SBHL-EVALUATION-RESULT-QUOTED-ISA" );
    $sym20$SBHL_RESULT_QUOTED_ISA = makeSymbol( "SBHL-RESULT-QUOTED-ISA" );
    $const21$resultGenl = constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) );
    $kw22$TRUE = makeKeyword( "TRUE" );
    $const23$resultGenlArg = constant_handles.reader_make_constant_shell( makeString( "resultGenlArg" ) );
    $const24$interArgResultGenl = constant_handles.reader_make_constant_shell( makeString( "interArgResultGenl" ) );
    $const25$interArgResultGenlReln = constant_handles.reader_make_constant_shell( makeString( "interArgResultGenlReln" ) );
    $const26$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
    $const27$resultIsaArg = constant_handles.reader_make_constant_shell( makeString( "resultIsaArg" ) );
    $const28$interArgResultIsa = constant_handles.reader_make_constant_shell( makeString( "interArgResultIsa" ) );
    $const29$interArgResultIsaReln = constant_handles.reader_make_constant_shell( makeString( "interArgResultIsaReln" ) );
    $const30$resultIsaArgIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsaArgIsa" ) );
    $const31$resultIsaWhenArgIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsaWhenArgIsa" ) );
    $const32$closedUnder = constant_handles.reader_make_constant_shell( makeString( "closedUnder" ) );
    $const33$evaluationResultQuotedIsa = constant_handles.reader_make_constant_shell( makeString( "evaluationResultQuotedIsa" ) );
    $const34$resultQuotedIsa = constant_handles.reader_make_constant_shell( makeString( "resultQuotedIsa" ) );
    $sym35$RESULT_GENL = makeSymbol( "RESULT-GENL" );
    $sym36$RESULT_ISA = makeSymbol( "RESULT-ISA" );
    $sym37$RESULT_ISA_ARG_ISA = makeSymbol( "RESULT-ISA-ARG-ISA" );
    $sym38$EVALUATION_RESULT_QUOTED_ISA = makeSymbol( "EVALUATION-RESULT-QUOTED-ISA" );
    $sym39$RESULT_QUOTED_ISA = makeSymbol( "RESULT-QUOTED-ISA" );
    $str40$_a_is_not_a_supported_NAUT_link_g = makeString( "~a is not a supported NAUT link generator" );
    $sym41$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
  }
}
/*
 * 
 * Total time: 103 ms
 * 
 */