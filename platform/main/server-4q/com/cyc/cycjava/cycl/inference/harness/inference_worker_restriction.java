package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.simplification_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_restriction
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction";
  public static final String myFingerPrint = "139c2c2a29122c6811adf3405fd3e349b633800c1bca122ce7959544975a16bc";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLSymbol $dtp_restriction_link_data$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLSymbol $dtp_restriction_listening_link_data$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12072L)
  public static SubLSymbol $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$;
  private static final SubLSymbol $sym0$RESTRICTION_LINK_DATA;
  private static final SubLSymbol $sym1$RESTRICTION_LINK_DATA_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$RESTR_LINK_DATA_BINDINGS;
  private static final SubLSymbol $sym10$_CSETF_RESTR_LINK_DATA_BINDINGS;
  private static final SubLSymbol $sym11$RESTR_LINK_DATA_HL_MODULE;
  private static final SubLSymbol $sym12$_CSETF_RESTR_LINK_DATA_HL_MODULE;
  private static final SubLSymbol $kw13$BINDINGS;
  private static final SubLSymbol $kw14$HL_MODULE;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_RESTRICTION_LINK_DATA;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LINK_DATA_METHOD;
  private static final SubLSymbol $sym21$RESTRICTION_LISTENING_LINK_DATA;
  private static final SubLSymbol $sym22$RESTRICTION_LISTENING_LINK_DATA_P;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$RESTR_LISTEN_LINK_DATA_BINDINGS;
  private static final SubLSymbol $sym30$_CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS;
  private static final SubLSymbol $sym31$RESTR_LISTEN_LINK_DATA_HL_MODULE;
  private static final SubLSymbol $sym32$_CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE;
  private static final SubLSymbol $sym33$RESTR_LISTEN_LINK_DATA_LISTENERS;
  private static final SubLSymbol $sym34$_CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS;
  private static final SubLSymbol $kw35$LISTENERS;
  private static final SubLSymbol $sym36$MAKE_RESTRICTION_LISTENING_LINK_DATA;
  private static final SubLSymbol $sym37$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LISTENING_LINK_DATA_METHOD;
  private static final SubLSymbol $sym38$PROBLEM_P;
  private static final SubLSymbol $sym39$MAPPED_PROBLEM_P;
  private static final SubLSymbol $kw40$RESTRICTION;
  private static final SubLSymbol $kw41$JOIN_ORDERED;
  private static final SubLSymbol $kw42$FREE;
  private static final SubLSymbol $sym43$RESTRICTION_LINK_P;
  private static final SubLSymbol $sym44$BINDING_LIST_P;
  private static final SubLSymbol $sym45$HL_MODULE_P;
  private static final SubLSymbol $sym46$TACTIC_P;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw50$DONE;
  private static final SubLSymbol $sym51$DO_LIST;
  private static final SubLSymbol $sym52$RESTRICTION_LINK_LISTENERS;
  private static final SubLString $str53$No_tactic_found_for__S;
  private static final SubLSymbol $sym54$RESTRICTION_PROOF_P;
  private static final SubLSymbol $kw55$SIMPLIFICATION;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject restriction_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject restriction_link_data_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $restriction_link_data_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject restr_link_data_bindings(final SubLObject v_object)
  {
    assert NIL != restriction_link_data_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject restr_link_data_hl_module(final SubLObject v_object)
  {
    assert NIL != restriction_link_data_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject _csetf_restr_link_data_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != restriction_link_data_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject _csetf_restr_link_data_hl_module(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != restriction_link_data_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject make_restriction_link_data(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $restriction_link_data_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$BINDINGS ) )
      {
        _csetf_restr_link_data_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$HL_MODULE ) )
      {
        _csetf_restr_link_data_hl_module( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject visit_defstruct_restriction_link_data(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_RESTRICTION_LINK_DATA, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$BINDINGS, restr_link_data_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$HL_MODULE, restr_link_data_hl_module( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_RESTRICTION_LINK_DATA, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1247L)
  public static SubLObject visit_defstruct_object_restriction_link_data_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_restriction_link_data( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject restriction_listening_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject restriction_listening_link_data_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $restriction_listening_link_data_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject restr_listen_link_data_bindings(final SubLObject v_object)
  {
    assert NIL != restriction_listening_link_data_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject restr_listen_link_data_hl_module(final SubLObject v_object)
  {
    assert NIL != restriction_listening_link_data_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject restr_listen_link_data_listeners(final SubLObject v_object)
  {
    assert NIL != restriction_listening_link_data_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject _csetf_restr_listen_link_data_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != restriction_listening_link_data_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject _csetf_restr_listen_link_data_hl_module(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != restriction_listening_link_data_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject _csetf_restr_listen_link_data_listeners(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != restriction_listening_link_data_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject make_restriction_listening_link_data(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $restriction_listening_link_data_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$BINDINGS ) )
      {
        _csetf_restr_listen_link_data_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$HL_MODULE ) )
      {
        _csetf_restr_listen_link_data_hl_module( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$LISTENERS ) )
      {
        _csetf_restr_listen_link_data_listeners( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject visit_defstruct_restriction_listening_link_data(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym36$MAKE_RESTRICTION_LISTENING_LINK_DATA, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$BINDINGS, restr_listen_link_data_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$HL_MODULE, restr_listen_link_data_hl_module( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw35$LISTENERS, restr_listen_link_data_listeners( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym36$MAKE_RESTRICTION_LISTENING_LINK_DATA, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1677L)
  public static SubLObject visit_defstruct_object_restriction_listening_link_data_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_restriction_listening_link_data( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 2316L)
  public static SubLObject new_restriction_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject restriction_bindings, SubLObject listening_linkP, SubLObject hl_module)
  {
    if( listening_linkP == UNPROVIDED )
    {
      listening_linkP = NIL;
    }
    if( hl_module == UNPROVIDED )
    {
      hl_module = NIL;
    }
    assert NIL != inference_datastructures_problem.problem_p( supported_problem ) : supported_problem;
    if( NIL != supporting_mapped_problem && !assertionsDisabledInClass && NIL == inference_datastructures_problem_link.mapped_problem_p( supporting_mapped_problem ) )
    {
      throw new AssertionError( supporting_mapped_problem );
    }
    final SubLObject link = inference_datastructures_problem_link.new_problem_link( $kw40$RESTRICTION, supported_problem );
    if( NIL != listening_linkP )
    {
      new_restriction_listening_link_data( link );
    }
    else
    {
      new_restriction_link_data( link );
    }
    if( NIL != hl_module )
    {
      set_restriction_link_hl_module( link, hl_module );
    }
    set_restriction_link_bindings( link, restriction_bindings );
    clear_restriction_link_listeners( link );
    inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( supporting_mapped_problem, link );
    inference_datastructures_problem_link.problem_link_open_all( link );
    inference_worker.propagate_problem_link( link );
    return link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 3323L)
  public static SubLObject new_restriction_link_data(final SubLObject restriction_link)
  {
    final SubLObject data = make_restriction_link_data( UNPROVIDED );
    inference_datastructures_problem_link.set_problem_link_data( restriction_link, data );
    return restriction_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 3508L)
  public static SubLObject new_restriction_listening_link_data(final SubLObject restriction_link)
  {
    final SubLObject data = make_restriction_listening_link_data( UNPROVIDED );
    inference_datastructures_problem_link.set_problem_link_data( restriction_link, data );
    return restriction_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 3713L)
  public static SubLObject destroy_restriction_link(final SubLObject restriction_link)
  {
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( restriction_link );
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( supported_problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject jo_link;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      jo_link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, jo_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( jo_link, $kw41$JOIN_ORDERED ) )
      {
        inference_worker_join_ordered.remove_join_ordered_link_restricted_non_focal_link( jo_link, restriction_link );
      }
    }
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( restriction_link );
    if( NIL != restriction_link_data_p( data ) )
    {
      _csetf_restr_link_data_bindings( data, $kw42$FREE );
      _csetf_restr_link_data_hl_module( data, $kw42$FREE );
    }
    else
    {
      _csetf_restr_listen_link_data_bindings( data, $kw42$FREE );
      _csetf_restr_listen_link_data_hl_module( data, $kw42$FREE );
      _csetf_restr_listen_link_data_listeners( data, $kw42$FREE );
    }
    return restriction_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 4406L)
  public static SubLObject restriction_link_bindings(final SubLObject restriction_link)
  {
    assert NIL != restriction_link_p( restriction_link ) : restriction_link;
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( restriction_link );
    if( NIL != restriction_link_data_p( data ) )
    {
      return restr_link_data_bindings( data );
    }
    return restr_listen_link_data_bindings( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 4908L)
  public static SubLObject restriction_link_hl_module(final SubLObject restriction_link)
  {
    assert NIL != restriction_link_p( restriction_link ) : restriction_link;
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( restriction_link );
    if( NIL != restriction_link_data_p( data ) )
    {
      return restr_link_data_hl_module( data );
    }
    return restr_listen_link_data_hl_module( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 5217L)
  public static SubLObject restriction_link_listeners(final SubLObject restriction_link)
  {
    assert NIL != restriction_link_p( restriction_link ) : restriction_link;
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( restriction_link );
    if( NIL != restriction_listening_link_data_p( data ) )
    {
      return restr_listen_link_data_listeners( data );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 5494L)
  public static SubLObject set_restriction_link_bindings(final SubLObject restriction_link, final SubLObject v_bindings)
  {
    assert NIL != restriction_link_p( restriction_link ) : restriction_link;
    assert NIL != bindings.binding_list_p( v_bindings ) : v_bindings;
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( restriction_link );
    if( NIL != restriction_link_data_p( data ) )
    {
      _csetf_restr_link_data_bindings( data, v_bindings );
    }
    else
    {
      _csetf_restr_listen_link_data_bindings( data, v_bindings );
    }
    return restriction_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 5994L)
  public static SubLObject set_restriction_link_hl_module(final SubLObject restriction_link, final SubLObject hl_module)
  {
    assert NIL != restriction_link_p( restriction_link ) : restriction_link;
    assert NIL != inference_modules.hl_module_p( hl_module ) : hl_module;
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( restriction_link );
    if( NIL != restriction_link_data_p( data ) )
    {
      _csetf_restr_link_data_hl_module( data, hl_module );
    }
    else
    {
      _csetf_restr_listen_link_data_hl_module( data, hl_module );
    }
    return restriction_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 6403L)
  public static SubLObject clear_restriction_link_listeners(final SubLObject restriction_link)
  {
    assert NIL != restriction_link_p( restriction_link ) : restriction_link;
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( restriction_link );
    if( NIL != restriction_listening_link_data_p( data ) )
    {
      _csetf_restr_listen_link_data_listeners( data, NIL );
    }
    return restriction_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 6717L)
  public static SubLObject add_restriction_link_listener(final SubLObject restriction_link, final SubLObject tactic)
  {
    assert NIL != restriction_link_p( restriction_link ) : restriction_link;
    assert NIL != inference_datastructures_tactic.tactic_p( tactic ) : tactic;
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( restriction_link );
    if( NIL != restriction_listening_link_data_p( data ) && NIL == conses_high.member( tactic, restr_listen_link_data_listeners( data ), EQUAL, Symbols.symbol_function( IDENTITY ) ) )
    {
      _csetf_restr_listen_link_data_listeners( data, ConsesLow.cons( tactic, restr_listen_link_data_listeners( data ) ) );
    }
    return restriction_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7079L)
  public static SubLObject do_restriction_link_listeners(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject listener = NIL;
    SubLObject restriction_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    listener = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    restriction_link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      if( NIL == conses_high.member( current_$1, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw49$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw50$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym51$DO_LIST, ConsesLow.list( listener, ConsesLow.list( $sym52$RESTRICTION_LINK_LISTENERS, restriction_link ), $kw50$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7389L)
  public static SubLObject restriction_listening_link_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_problem_link.problem_link_p( v_object ) && NIL != restriction_listening_link_data_p( inference_datastructures_problem_link.problem_link_data( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7637L)
  public static SubLObject restriction_link_supporting_mapped_problem(final SubLObject restriction_link)
  {
    return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem( restriction_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7827L)
  public static SubLObject restriction_link_supporting_variable_map(final SubLObject restriction_link)
  {
    final SubLObject supporting_mapped_problem = restriction_link_supporting_mapped_problem( restriction_link );
    if( NIL != supporting_mapped_problem )
    {
      return inference_datastructures_problem_link.mapped_problem_variable_map( supporting_mapped_problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 8147L)
  public static SubLObject restriction_link_tactic(final SubLObject restriction_link)
  {
    assert NIL != restriction_link_p( restriction_link ) : restriction_link;
    final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem( restriction_link );
    final SubLObject hl_module = restriction_link_hl_module( restriction_link );
    if( NIL != hl_module )
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
      SubLObject candidate_tactic = NIL;
      candidate_tactic = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( hl_module.eql( inference_datastructures_tactic.tactic_hl_module( candidate_tactic ) ) )
        {
          return candidate_tactic;
        }
        cdolist_list_var = cdolist_list_var.rest();
        candidate_tactic = cdolist_list_var.first();
      }
      if( NIL == inference_datastructures_problem.tactically_unexamined_problem_p( problem ) )
      {
        return Errors.error( $str53$No_tactic_found_for__S, restriction_link );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 8675L)
  public static SubLObject restriction_link_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_problem_link.problem_link_p( v_object ) && $kw40$RESTRICTION == inference_datastructures_problem_link.problem_link_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 8838L)
  public static SubLObject maybe_new_restriction_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject restriction_bindings, SubLObject listening_linkP, SubLObject tactic)
  {
    if( listening_linkP == UNPROVIDED )
    {
      listening_linkP = NIL;
    }
    if( tactic == UNPROVIDED )
    {
      tactic = NIL;
    }
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem ) );
    SubLObject basis_object;
    SubLObject state;
    SubLObject dependent_link;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      dependent_link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, dependent_link ) && NIL != restriction_link_p( dependent_link ) && supported_problem.eql( inference_datastructures_problem_link
          .problem_link_supported_problem( dependent_link ) ) && NIL != bindings.bindings_equalP( restriction_bindings, restriction_link_bindings( dependent_link ) ) )
      {
        return dependent_link;
      }
    }
    final SubLObject hl_module = ( NIL != tactic ) ? inference_datastructures_tactic.tactic_hl_module( tactic ) : NIL;
    return new_restriction_link( supported_problem, supporting_mapped_problem, restriction_bindings, listening_linkP, hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 9798L)
  public static SubLObject bubble_up_proof_to_restriction_link(final SubLObject restricted_proof, final SubLObject restricted_variable_map, final SubLObject restriction_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject restricted_bindings = inference_datastructures_proof.proof_bindings( restricted_proof );
    final SubLObject restriction_bindings = restriction_link_bindings( restriction_link );
    final SubLObject unrestricted_bindings = inference_worker.proof_bindings_from_constituents( restriction_bindings, restricted_bindings, restricted_variable_map );
    thread.resetMultipleValues();
    final SubLObject unrestricted_proof = new_restriction_proof( restriction_link, restricted_proof, unrestricted_bindings );
    final SubLObject newP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    inference_worker_rewrite.trigger_restriction_link_listeners( restriction_link, restricted_proof );
    if( NIL != newP )
    {
      inference_worker.bubble_up_proof( unrestricted_proof );
    }
    else
    {
      inference_worker.possibly_note_proof_processed( restricted_proof );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11179L)
  public static SubLObject new_restriction_proof(final SubLObject restriction_link, final SubLObject restricted_proof, final SubLObject unrestricted_bindings)
  {
    final SubLObject subproofs = ConsesLow.list( restricted_proof );
    return inference_worker.propose_new_proof_with_bindings( restriction_link, inference_worker.canonicalize_proof_bindings( unrestricted_bindings ), subproofs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11668L)
  public static SubLObject restriction_proof_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_proof.proof_p( v_object ) && $kw40$RESTRICTION == inference_datastructures_proof.proof_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11793L)
  public static SubLObject problem_has_restriction_linkP(final SubLObject problem)
  {
    return inference_datastructures_problem.problem_has_argument_link_of_typeP( problem, $kw40$RESTRICTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11919L)
  public static SubLObject restriction_proof_hl_module(final SubLObject proof)
  {
    assert NIL != restriction_proof_p( proof ) : proof;
    return restriction_link_hl_module( inference_datastructures_proof.proof_link( proof ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12332L)
  public static SubLObject simplification_tactic_p(final SubLObject tactic)
  {
    return makeBoolean( NIL != inference_datastructures_tactic.tactic_p( tactic ) && NIL != simplification_modules.simplification_module_p( inference_datastructures_tactic.tactic_hl_module( tactic ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12532L)
  public static SubLObject simplification_link_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != restriction_link_p( v_object ) && NIL != simplification_modules.simplification_module_p( restriction_link_hl_module( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12691L)
  public static SubLObject problem_is_a_simplificationP(final SubLObject problem)
  {
    return inference_datastructures_problem.problem_has_dependent_link_of_typeP( problem, $kw55$SIMPLIFICATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12820L)
  public static SubLObject problem_has_a_simplificationP(final SubLObject problem)
  {
    return inference_datastructures_problem.problem_has_argument_link_of_typeP( problem, $kw55$SIMPLIFICATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12949L)
  public static SubLObject problem_first_simplified_supporting_problem(final SubLObject problem)
  {
    final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject simp_link;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      simp_link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, simp_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( simp_link, $kw55$SIMPLIFICATION ) )
      {
        return inference_datastructures_problem_link.problem_link_sole_supporting_problem( simp_link );
      }
    }
    return NIL;
  }

  public static SubLObject declare_inference_worker_restriction_file()
  {
    SubLFiles.declareFunction( me, "restriction_link_data_print_function_trampoline", "RESTRICTION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "restriction_link_data_p", "RESTRICTION-LINK-DATA-P", 1, 0, false );
    new $restriction_link_data_p$UnaryFunction();
    SubLFiles.declareFunction( me, "restr_link_data_bindings", "RESTR-LINK-DATA-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "restr_link_data_hl_module", "RESTR-LINK-DATA-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_restr_link_data_bindings", "_CSETF-RESTR-LINK-DATA-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_restr_link_data_hl_module", "_CSETF-RESTR-LINK-DATA-HL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_restriction_link_data", "MAKE-RESTRICTION-LINK-DATA", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_restriction_link_data", "VISIT-DEFSTRUCT-RESTRICTION-LINK-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_restriction_link_data_method", "VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LINK-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "restriction_listening_link_data_print_function_trampoline", "RESTRICTION-LISTENING-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "restriction_listening_link_data_p", "RESTRICTION-LISTENING-LINK-DATA-P", 1, 0, false );
    new $restriction_listening_link_data_p$UnaryFunction();
    SubLFiles.declareFunction( me, "restr_listen_link_data_bindings", "RESTR-LISTEN-LINK-DATA-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "restr_listen_link_data_hl_module", "RESTR-LISTEN-LINK-DATA-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "restr_listen_link_data_listeners", "RESTR-LISTEN-LINK-DATA-LISTENERS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_restr_listen_link_data_bindings", "_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_restr_listen_link_data_hl_module", "_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_restr_listen_link_data_listeners", "_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_restriction_listening_link_data", "MAKE-RESTRICTION-LISTENING-LINK-DATA", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_restriction_listening_link_data", "VISIT-DEFSTRUCT-RESTRICTION-LISTENING-LINK-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_restriction_listening_link_data_method", "VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LISTENING-LINK-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_restriction_link", "NEW-RESTRICTION-LINK", 3, 2, false );
    SubLFiles.declareFunction( me, "new_restriction_link_data", "NEW-RESTRICTION-LINK-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "new_restriction_listening_link_data", "NEW-RESTRICTION-LISTENING-LINK-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_restriction_link", "DESTROY-RESTRICTION-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "restriction_link_bindings", "RESTRICTION-LINK-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "restriction_link_hl_module", "RESTRICTION-LINK-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "restriction_link_listeners", "RESTRICTION-LINK-LISTENERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_restriction_link_bindings", "SET-RESTRICTION-LINK-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_restriction_link_hl_module", "SET-RESTRICTION-LINK-HL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_restriction_link_listeners", "CLEAR-RESTRICTION-LINK-LISTENERS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_restriction_link_listener", "ADD-RESTRICTION-LINK-LISTENER", 2, 0, false );
    SubLFiles.declareMacro( me, "do_restriction_link_listeners", "DO-RESTRICTION-LINK-LISTENERS" );
    SubLFiles.declareFunction( me, "restriction_listening_link_p", "RESTRICTION-LISTENING-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "restriction_link_supporting_mapped_problem", "RESTRICTION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "restriction_link_supporting_variable_map", "RESTRICTION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "restriction_link_tactic", "RESTRICTION-LINK-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "restriction_link_p", "RESTRICTION-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_new_restriction_link", "MAYBE-NEW-RESTRICTION-LINK", 3, 2, false );
    SubLFiles.declareFunction( me, "bubble_up_proof_to_restriction_link", "BUBBLE-UP-PROOF-TO-RESTRICTION-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "new_restriction_proof", "NEW-RESTRICTION-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "restriction_proof_p", "RESTRICTION-PROOF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_has_restriction_linkP", "PROBLEM-HAS-RESTRICTION-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "restriction_proof_hl_module", "RESTRICTION-PROOF-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "simplification_tactic_p", "SIMPLIFICATION-TACTIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "simplification_link_p", "SIMPLIFICATION-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_is_a_simplificationP", "PROBLEM-IS-A-SIMPLIFICATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_has_a_simplificationP", "PROBLEM-HAS-A-SIMPLIFICATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_first_simplified_supporting_problem", "PROBLEM-FIRST-SIMPLIFIED-SUPPORTING-PROBLEM", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_worker_restriction_file()
  {
    $dtp_restriction_link_data$ = SubLFiles.defconstant( "*DTP-RESTRICTION-LINK-DATA*", $sym0$RESTRICTION_LINK_DATA );
    $dtp_restriction_listening_link_data$ = SubLFiles.defconstant( "*DTP-RESTRICTION-LISTENING-LINK-DATA*", $sym21$RESTRICTION_LISTENING_LINK_DATA );
    $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$ = SubLFiles.defparameter( "*SIMPLIFICATION-TACTICS-EXECUTE-EARLY-AND-PASS-DOWN-TRANSFORMATION-MOTIVATION?*", T );
    return NIL;
  }

  public static SubLObject setup_inference_worker_restriction_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_restriction_link_data$.getGlobalValue(), Symbols.symbol_function( $sym7$RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$RESTR_LINK_DATA_BINDINGS, $sym10$_CSETF_RESTR_LINK_DATA_BINDINGS );
    Structures.def_csetf( $sym11$RESTR_LINK_DATA_HL_MODULE, $sym12$_CSETF_RESTR_LINK_DATA_HL_MODULE );
    Equality.identity( $sym0$RESTRICTION_LINK_DATA );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_restriction_link_data$.getGlobalValue(), Symbols.symbol_function(
        $sym20$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LINK_DATA_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_restriction_listening_link_data$.getGlobalValue(), Symbols.symbol_function(
        $sym27$RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list28 );
    Structures.def_csetf( $sym29$RESTR_LISTEN_LINK_DATA_BINDINGS, $sym30$_CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS );
    Structures.def_csetf( $sym31$RESTR_LISTEN_LINK_DATA_HL_MODULE, $sym32$_CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE );
    Structures.def_csetf( $sym33$RESTR_LISTEN_LINK_DATA_LISTENERS, $sym34$_CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS );
    Equality.identity( $sym21$RESTRICTION_LISTENING_LINK_DATA );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_restriction_listening_link_data$.getGlobalValue(), Symbols.symbol_function(
        $sym37$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LISTENING_LINK_DATA_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_worker_restriction_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_worker_restriction_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_worker_restriction_file();
  }
  static
  {
    me = new inference_worker_restriction();
    $dtp_restriction_link_data$ = null;
    $dtp_restriction_listening_link_data$ = null;
    $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$ = null;
    $sym0$RESTRICTION_LINK_DATA = makeSymbol( "RESTRICTION-LINK-DATA" );
    $sym1$RESTRICTION_LINK_DATA_P = makeSymbol( "RESTRICTION-LINK-DATA-P" );
    $list2 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "HL-MODULE" ) );
    $list3 = ConsesLow.list( makeKeyword( "BINDINGS" ), makeKeyword( "HL-MODULE" ) );
    $list4 = ConsesLow.list( makeSymbol( "RESTR-LINK-DATA-BINDINGS" ), makeSymbol( "RESTR-LINK-DATA-HL-MODULE" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-RESTR-LINK-DATA-BINDINGS" ), makeSymbol( "_CSETF-RESTR-LINK-DATA-HL-MODULE" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RESTRICTION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RESTRICTION-LINK-DATA-P" ) );
    $sym9$RESTR_LINK_DATA_BINDINGS = makeSymbol( "RESTR-LINK-DATA-BINDINGS" );
    $sym10$_CSETF_RESTR_LINK_DATA_BINDINGS = makeSymbol( "_CSETF-RESTR-LINK-DATA-BINDINGS" );
    $sym11$RESTR_LINK_DATA_HL_MODULE = makeSymbol( "RESTR-LINK-DATA-HL-MODULE" );
    $sym12$_CSETF_RESTR_LINK_DATA_HL_MODULE = makeSymbol( "_CSETF-RESTR-LINK-DATA-HL-MODULE" );
    $kw13$BINDINGS = makeKeyword( "BINDINGS" );
    $kw14$HL_MODULE = makeKeyword( "HL-MODULE" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_RESTRICTION_LINK_DATA = makeSymbol( "MAKE-RESTRICTION-LINK-DATA" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LINK_DATA_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LINK-DATA-METHOD" );
    $sym21$RESTRICTION_LISTENING_LINK_DATA = makeSymbol( "RESTRICTION-LISTENING-LINK-DATA" );
    $sym22$RESTRICTION_LISTENING_LINK_DATA_P = makeSymbol( "RESTRICTION-LISTENING-LINK-DATA-P" );
    $list23 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "HL-MODULE" ), makeSymbol( "LISTENERS" ) );
    $list24 = ConsesLow.list( makeKeyword( "BINDINGS" ), makeKeyword( "HL-MODULE" ), makeKeyword( "LISTENERS" ) );
    $list25 = ConsesLow.list( makeSymbol( "RESTR-LISTEN-LINK-DATA-BINDINGS" ), makeSymbol( "RESTR-LISTEN-LINK-DATA-HL-MODULE" ), makeSymbol( "RESTR-LISTEN-LINK-DATA-LISTENERS" ) );
    $list26 = ConsesLow.list( makeSymbol( "_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS" ), makeSymbol( "_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE" ), makeSymbol( "_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS" ) );
    $sym27$RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RESTRICTION-LISTENING-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE" );
    $list28 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RESTRICTION-LISTENING-LINK-DATA-P" ) );
    $sym29$RESTR_LISTEN_LINK_DATA_BINDINGS = makeSymbol( "RESTR-LISTEN-LINK-DATA-BINDINGS" );
    $sym30$_CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS = makeSymbol( "_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS" );
    $sym31$RESTR_LISTEN_LINK_DATA_HL_MODULE = makeSymbol( "RESTR-LISTEN-LINK-DATA-HL-MODULE" );
    $sym32$_CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE = makeSymbol( "_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE" );
    $sym33$RESTR_LISTEN_LINK_DATA_LISTENERS = makeSymbol( "RESTR-LISTEN-LINK-DATA-LISTENERS" );
    $sym34$_CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS = makeSymbol( "_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS" );
    $kw35$LISTENERS = makeKeyword( "LISTENERS" );
    $sym36$MAKE_RESTRICTION_LISTENING_LINK_DATA = makeSymbol( "MAKE-RESTRICTION-LISTENING-LINK-DATA" );
    $sym37$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LISTENING_LINK_DATA_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LISTENING-LINK-DATA-METHOD" );
    $sym38$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $sym39$MAPPED_PROBLEM_P = makeSymbol( "MAPPED-PROBLEM-P" );
    $kw40$RESTRICTION = makeKeyword( "RESTRICTION" );
    $kw41$JOIN_ORDERED = makeKeyword( "JOIN-ORDERED" );
    $kw42$FREE = makeKeyword( "FREE" );
    $sym43$RESTRICTION_LINK_P = makeSymbol( "RESTRICTION-LINK-P" );
    $sym44$BINDING_LIST_P = makeSymbol( "BINDING-LIST-P" );
    $sym45$HL_MODULE_P = makeSymbol( "HL-MODULE-P" );
    $sym46$TACTIC_P = makeSymbol( "TACTIC-P" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "LISTENER" ), makeSymbol( "RESTRICTION-LINK" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list48 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw49$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw50$DONE = makeKeyword( "DONE" );
    $sym51$DO_LIST = makeSymbol( "DO-LIST" );
    $sym52$RESTRICTION_LINK_LISTENERS = makeSymbol( "RESTRICTION-LINK-LISTENERS" );
    $str53$No_tactic_found_for__S = makeString( "No tactic found for ~S" );
    $sym54$RESTRICTION_PROOF_P = makeSymbol( "RESTRICTION-PROOF-P" );
    $kw55$SIMPLIFICATION = makeKeyword( "SIMPLIFICATION" );
  }

  public static final class $restriction_link_data_native
      extends
        SubLStructNative
  {
    public SubLObject $bindings;
    public SubLObject $hl_module;
    private static final SubLStructDeclNative structDecl;

    public $restriction_link_data_native()
    {
      this.$bindings = CommonSymbols.NIL;
      this.$hl_module = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $restriction_link_data_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$bindings;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$hl_module;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$bindings = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$hl_module = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $restriction_link_data_native.class, $sym0$RESTRICTION_LINK_DATA, $sym1$RESTRICTION_LINK_DATA_P, $list2, $list3, new String[] { "$bindings", "$hl_module"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $restriction_link_data_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $restriction_link_data_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RESTRICTION-LINK-DATA-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return restriction_link_data_p( arg1 );
    }
  }

  public static final class $restriction_listening_link_data_native
      extends
        SubLStructNative
  {
    public SubLObject $bindings;
    public SubLObject $hl_module;
    public SubLObject $listeners;
    private static final SubLStructDeclNative structDecl;

    public $restriction_listening_link_data_native()
    {
      this.$bindings = CommonSymbols.NIL;
      this.$hl_module = CommonSymbols.NIL;
      this.$listeners = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $restriction_listening_link_data_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$bindings;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$hl_module;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$listeners;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$bindings = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$hl_module = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$listeners = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $restriction_listening_link_data_native.class, $sym21$RESTRICTION_LISTENING_LINK_DATA, $sym22$RESTRICTION_LISTENING_LINK_DATA_P, $list23, $list24, new String[] {
        "$bindings", "$hl_module", "$listeners"
      }, $list25, $list26, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $restriction_listening_link_data_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $restriction_listening_link_data_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RESTRICTION-LISTENING-LINK-DATA-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return restriction_listening_link_data_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 394 ms synthetic
 */