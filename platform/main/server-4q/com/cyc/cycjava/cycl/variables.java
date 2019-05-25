package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class variables
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.variables";
  public static final String myFingerPrint = "42f1e7a080e8e16de658d1e1c1c0ae6c438b47a8b753ea1a877aaa2c0f8b1649";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 597L)
  private static SubLSymbol $hl_variable_prefix_char$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 722L)
  private static SubLSymbol $default_el_variable_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1168L)
  public static SubLSymbol $dtp_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1764L)
  private static SubLSymbol $variable_max$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1925L)
  private static SubLSymbol $variable_array$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1967L)
  public static SubLSymbol $var0$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLSymbol $var1$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2080L)
  public static SubLSymbol $var2$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2138L)
  public static SubLSymbol $var3$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2196L)
  public static SubLSymbol $var4$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4520L)
  private static SubLSymbol $default_el_var_for_hl_var_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4895L)
  private static SubLSymbol $hl_var_for_default_el_var_caching_state$;
  private static final SubLString $str0$_VAR;
  private static final SubLSymbol $sym1$VARIABLE;
  private static final SubLSymbol $sym2$VARIABLE_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_VARIABLE;
  private static final SubLSymbol $sym8$VARIABLE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$VAR_ID;
  private static final SubLSymbol $sym11$_CSETF_VAR_ID;
  private static final SubLSymbol $kw12$ID;
  private static final SubLString $str13$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw14$BEGIN;
  private static final SubLSymbol $sym15$MAKE_VARIABLE;
  private static final SubLSymbol $kw16$SLOT;
  private static final SubLSymbol $kw17$END;
  private static final SubLSymbol $sym18$VISIT_DEFSTRUCT_OBJECT_VARIABLE_METHOD;
  private static final SubLString $str19$_Cvar_D;
  private static final SubLInteger $int20$99;
  private static final SubLSymbol $sym21$SXHASH_VARIABLE_METHOD;
  private static final SubLList $list22;
  private static final SubLString $str23$Return_T_iff_OBJECT_is_an_HL_vari;
  private static final SubLList $list24;
  private static final SubLInteger $int25$200;
  private static final SubLSymbol $sym26$_VARIABLE_ARRAY_;
  private static final SubLSymbol $sym27$_VAR0_;
  private static final SubLSymbol $sym28$_VAR1_;
  private static final SubLSymbol $sym29$_VAR2_;
  private static final SubLSymbol $sym30$_VAR3_;
  private static final SubLSymbol $sym31$_VAR4_;
  private static final SubLSymbol $sym32$FIXNUMP;
  private static final SubLString $str33$The_maximum_number_of_HL_variable;
  private static final SubLString $str34$__has_been_reached_;
  private static final SubLSymbol $sym35$VARIABLE_COUNT;
  private static final SubLString $str36$Return_the_total_number_of_HL_var;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw41$DONE;
  private static final SubLSymbol $sym42$NUM;
  private static final SubLSymbol $sym43$DO_NUMBERS;
  private static final SubLSymbol $kw44$START;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$CLET;
  private static final SubLSymbol $sym47$FIND_VARIABLE_BY_ID;
  private static final SubLSymbol $sym48$VARIABLE_ID;
  private static final SubLList $list49;
  private static final SubLString $str50$Return_id_of_HL_variable_VARIABLE;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$INTEGERP;
  private static final SubLString $str53$Return_the_HL_variable_with_ID__o;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$DEFAULT_EL_VAR_FOR_HL_VAR;
  private static final SubLString $str57$Return_a_readable_EL_var_from_HL_;
  private static final SubLSymbol $sym58$DEFAULT_EL_VAR_FOR_HL_VAR_CACHED;
  private static final SubLSymbol $sym59$_DEFAULT_EL_VAR_FOR_HL_VAR_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym60$HL_VAR_FOR_DEFAULT_EL_VAR;
  private static final SubLSymbol $sym61$EL_VAR_;
  private static final SubLSymbol $sym62$_HL_VAR_FOR_DEFAULT_EL_VAR_CACHING_STATE_;
  private static final SubLSymbol $sym63$VARIABLE__;
  private static final SubLSymbol $sym64$SORT_HL_VARIABLE_LIST_MEMOIZED_INT;
  private static final SubLSymbol $sym65$HL_VAR_;
  private static final SubLSymbol $sym66$DEFAULT_EL_VAR_;
  private static final SubLSymbol $sym67$NON_DEFAULT_EL_VAR_;
  private static final SubLString $str68$_s_contained_the_non_default_EL_v;
  private static final SubLSymbol $sym69$VARIABLE_SYMBOLP;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$CONS;
  private static final SubLSymbol $sym72$_;
  private static final SubLSymbol $sym73$FULLY_BOUND_P;
  private static final SubLString $str74$Return_T_iff_OBJECT_contains_no_H;
  private static final SubLSymbol $sym75$NOT_FULLY_BOUND_P;
  private static final SubLString $str76$Return_T_iff_OBJECT_contains_some;
  private static final SubLSymbol $sym77$CYC_VAR_;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1168L)
  public static SubLObject variable_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_variable( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1168L)
  public static SubLObject variable_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $variable_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1168L)
  public static SubLObject var_id(final SubLObject v_object)
  {
    assert NIL != variable_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1168L)
  public static SubLObject _csetf_var_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != variable_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1168L)
  public static SubLObject make_variable(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $variable_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw12$ID ) )
      {
        _csetf_var_id( v_new, current_value );
      }
      else
      {
        Errors.error( $str13$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1168L)
  public static SubLObject visit_defstruct_variable(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw14$BEGIN, $sym15$MAKE_VARIABLE, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw16$SLOT, $kw12$ID, var_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw17$END, $sym15$MAKE_VARIABLE, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1168L)
  public static SubLObject visit_defstruct_object_variable_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_variable( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1267L)
  public static SubLObject print_variable(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = variable_id( v_object );
    final SubLObject name = ConsesLow.nth( id, control_vars.$variable_names$.getDynamicValue( thread ) );
    if( NIL != name )
    {
      print_high.princ( name, stream );
    }
    else
    {
      PrintLow.format( stream, $str19$_Cvar_D, $hl_variable_prefix_char$.getGlobalValue(), id );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1520L)
  public static SubLObject sxhash_variable_method(final SubLObject v_object)
  {
    final SubLObject id = var_id( v_object );
    if( id.isInteger() )
    {
      return id;
    }
    return $int20$99;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2254L)
  public static SubLObject get_variable(final SubLObject num)
  {
    assert NIL != Types.fixnump( num ) : num;
    if( num.numGE( $variable_max$.getGlobalValue() ) )
    {
      Errors.error( Sequences.cconcatenate( $str33$The_maximum_number_of_HL_variable, new SubLObject[] { format_nil.format_nil_a_no_copy( $variable_max$.getGlobalValue() ), $str34$__has_been_reached_
      } ) );
    }
    return Vectors.aref( $variable_array$.getGlobalValue(), num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2551L)
  public static SubLObject setup_variable_table()
  {
    if( !$variable_array$.getGlobalValue().isVector() )
    {
      final SubLObject array = Vectors.make_vector( $variable_max$.getGlobalValue(), NIL );
      SubLObject i;
      SubLObject var;
      for( i = NIL, i = ZERO_INTEGER; i.numL( $variable_max$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        var = make_variable( UNPROVIDED );
        _csetf_var_id( var, i );
        Vectors.set_aref( array, i, var );
      }
      $variable_array$.setGlobalValue( array );
      setup_convenience_variables();
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2953L)
  public static SubLObject setup_convenience_variables()
  {
    if( NIL == variable_p( $var0$.getGlobalValue() ) )
    {
      $var0$.setGlobalValue( get_variable( ZERO_INTEGER ) );
      $var1$.setGlobalValue( get_variable( ONE_INTEGER ) );
      $var2$.setGlobalValue( get_variable( TWO_INTEGER ) );
      $var3$.setGlobalValue( get_variable( THREE_INTEGER ) );
      $var4$.setGlobalValue( get_variable( FOUR_INTEGER ) );
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3254L)
  public static SubLObject variable_count()
  {
    return $variable_max$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3383L)
  public static SubLObject do_hl_variables(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    hl_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      if( NIL == conses_high.member( current_$1, $list39, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw40$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw41$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject num = $sym42$NUM;
    return ConsesLow.list( $sym43$DO_NUMBERS, ConsesLow.list( num, $kw44$START, ZERO_INTEGER, $kw17$END, $list45, $kw41$DONE, done ), ConsesLow.listS( $sym46$CLET, ConsesLow.list( ConsesLow.list( hl_var, ConsesLow.list(
        $sym47$FIND_VARIABLE_BY_ID, num ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3690L)
  public static SubLObject variable_id(final SubLObject variable)
  {
    enforceType( variable, $sym2$VARIABLE_P );
    return var_id( variable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3868L)
  public static SubLObject find_variable_by_id(final SubLObject id)
  {
    enforceType( id, $sym52$INTEGERP );
    return get_variable( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4071L)
  public static SubLObject variable_L(final SubLObject var1, final SubLObject var2)
  {
    return Numbers.numL( variable_id( var1 ), variable_id( var2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4164L)
  public static SubLObject random_variable()
  {
    if( NIL != $variable_array$.getGlobalValue() )
    {
      return find_variable_by_id( random.random( variable_count() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4317L)
  public static SubLObject default_el_var_for_hl_var(final SubLObject variable)
  {
    enforceType( variable, $sym2$VARIABLE_P );
    return default_el_var_for_hl_var_cached( variable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4520L)
  public static SubLObject clear_default_el_var_for_hl_var_cached()
  {
    final SubLObject cs = $default_el_var_for_hl_var_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4520L)
  public static SubLObject remove_default_el_var_for_hl_var_cached(final SubLObject variable)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $default_el_var_for_hl_var_cached_caching_state$.getGlobalValue(), ConsesLow.list( variable ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4520L)
  public static SubLObject default_el_var_for_hl_var_cached_internal(final SubLObject variable)
  {
    assert NIL != variable_p( variable ) : variable;
    final SubLObject el_var = cycl_variables.make_el_var( print_high.prin1_to_string( variable ) );
    return el_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4520L)
  public static SubLObject default_el_var_for_hl_var_cached(final SubLObject variable)
  {
    SubLObject caching_state = $default_el_var_for_hl_var_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym58$DEFAULT_EL_VAR_FOR_HL_VAR_CACHED, $sym59$_DEFAULT_EL_VAR_FOR_HL_VAR_CACHED_CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, variable, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( default_el_var_for_hl_var_cached_internal( variable ) ) );
      memoization_state.caching_state_put( caching_state, variable, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4764L)
  public static SubLObject get_default_el_var(final SubLObject num)
  {
    return cycl_variables.make_el_var( Sequences.cconcatenate( $default_el_variable_prefix$.getGlobalValue(), string_utilities.object_to_string( num ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4895L)
  public static SubLObject clear_hl_var_for_default_el_var()
  {
    final SubLObject cs = $hl_var_for_default_el_var_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4895L)
  public static SubLObject remove_hl_var_for_default_el_var(final SubLObject el_variable)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $hl_var_for_default_el_var_caching_state$.getGlobalValue(), ConsesLow.list( el_variable ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4895L)
  public static SubLObject hl_var_for_default_el_var_internal(final SubLObject el_variable)
  {
    assert NIL != cycl_variables.el_varP( el_variable ) : el_variable;
    return find_variable_by_id( reader.read_from_string_ignoring_errors( Symbols.symbol_name( el_variable ), NIL, NIL, FOUR_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4895L)
  public static SubLObject hl_var_for_default_el_var(final SubLObject el_variable)
  {
    SubLObject caching_state = $hl_var_for_default_el_var_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym60$HL_VAR_FOR_DEFAULT_EL_VAR, $sym62$_HL_VAR_FOR_DEFAULT_EL_VAR_CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, el_variable, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( hl_var_for_default_el_var_internal( el_variable ) ) );
      memoization_state.caching_state_put( caching_state, el_variable, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5174L)
  public static SubLObject sort_hl_variable_list(final SubLObject hl_variable_list)
  {
    return Sort.sort( hl_variable_list, $sym63$VARIABLE__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5276L)
  public static SubLObject sort_hl_variable_list_memoized(final SubLObject hl_variable_list)
  {
    return conses_high.copy_list( sort_hl_variable_list_memoized_int( hl_variable_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5410L)
  public static SubLObject sort_hl_variable_list_memoized_int_internal(final SubLObject hl_variable_list)
  {
    return sort_hl_variable_list( conses_high.copy_list( hl_variable_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5410L)
  public static SubLObject sort_hl_variable_list_memoized_int(final SubLObject hl_variable_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sort_hl_variable_list_memoized_int_internal( hl_variable_list );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym64$SORT_HL_VARIABLE_LIST_MEMOIZED_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym64$SORT_HL_VARIABLE_LIST_MEMOIZED_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym64$SORT_HL_VARIABLE_LIST_MEMOIZED_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, hl_variable_list, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sort_hl_variable_list_memoized_int_internal( hl_variable_list ) ) );
      memoization_state.caching_state_put( caching_state, hl_variable_list, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5580L)
  public static SubLObject sorted_hl_variables_in_expressions_intersection(final SubLObject expression1, final SubLObject expression2)
  {
    return sort_hl_variable_list_memoized( conses_high.intersection( cycl_utilities.expression_gather( expression1, $sym65$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), cycl_utilities.expression_gather(
        expression2, $sym65$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5822L)
  public static SubLObject canonicalize_default_el_vars(final SubLObject expression)
  {
    return cycl_utilities.expression_transform( expression, $sym66$DEFAULT_EL_VAR_, $sym60$HL_VAR_FOR_DEFAULT_EL_VAR, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6084L)
  public static SubLObject uncanonicalize_hl_vars(final SubLObject expression)
  {
    return cycl_utilities.expression_transform( expression, $sym2$VARIABLE_P, $sym56$DEFAULT_EL_VAR_FOR_HL_VAR, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6337L)
  public static SubLObject error_unless_canonicalize_default_el_vars(final SubLObject expression)
  {
    error_if_expression_contains_non_default_el_var( expression );
    return canonicalize_default_el_vars( expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6525L)
  public static SubLObject error_if_expression_contains_non_default_el_var(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject non_default_el_var = cycl_utilities.expression_find_if( $sym67$NON_DEFAULT_EL_VAR_, expression, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != non_default_el_var )
    {
      Errors.error( $str68$_s_contained_the_non_default_EL_v, expression, non_default_el_var );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6847L)
  public static SubLObject variable_symbolp(final SubLObject symbol)
  {
    return cycl_variables.el_varP( symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7022L)
  public static SubLObject gather_variable_symbols(final SubLObject formula)
  {
    return list_utilities.tree_gather( formula, $sym61$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7132L)
  public static SubLObject replace_variables(final SubLObject form, final SubLObject variable_symbols)
  {
    final SubLObject subs = Mapping.mapcar( Symbols.symbol_function( $sym71$CONS ), variable_symbols, new SubLObject[] { Mapping.mapcar( Symbols.symbol_function( $sym47$FIND_VARIABLE_BY_ID ), list_utilities.num_list(
        Sequences.length( variable_symbols ), UNPROVIDED ) )
    } );
    return conses_high.sublis( subs, form, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7370L)
  public static SubLObject restore_variables(final SubLObject form, final SubLObject original_variables)
  {
    final SubLObject subs = Mapping.mapcar( Symbols.symbol_function( $sym71$CONS ), Mapping.mapcar( Symbols.symbol_function( $sym47$FIND_VARIABLE_BY_ID ), list_utilities.num_list( Sequences.length( original_variables ),
        UNPROVIDED ) ), new SubLObject[]
        { original_variables
    } );
    return conses_high.sublis( subs, form, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7614L)
  public static SubLObject subst_hl_variables(final SubLObject el_vars, SubLObject tree)
  {
    tree = conses_high.copy_tree( tree );
    SubLObject list_var = NIL;
    SubLObject el_var = NIL;
    SubLObject hl_var_id = NIL;
    list_var = el_vars;
    el_var = list_var.first();
    for( hl_var_id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), hl_var_id = Numbers.add( ONE_INTEGER, hl_var_id ) )
    {
      final SubLObject hl_var = find_variable_by_id( hl_var_id );
      tree = conses_high.nsubst( hl_var, el_var, tree, Symbols.symbol_function( EQL ), UNPROVIDED );
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7868L)
  public static SubLObject generate_hl_variable_list(final SubLObject n)
  {
    final SubLObject variable_list = ConsesLow.make_list( n, UNPROVIDED );
    SubLObject index = NIL;
    SubLObject rest = NIL;
    index = ZERO_INTEGER;
    for( rest = variable_list; NIL != rest; rest = rest.rest() )
    {
      ConsesLow.rplaca( rest, find_variable_by_id( index ) );
      index = Numbers.add( index, ONE_INTEGER );
    }
    return variable_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8217L)
  public static SubLObject gather_hl_variables(final SubLObject v_object)
  {
    return Sort.sort( list_utilities.tree_gather( v_object, Symbols.symbol_function( $sym2$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym72$_ ), Symbols.symbol_function(
        $sym48$VARIABLE_ID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8330L)
  public static SubLObject max_hl_variable(final SubLObject v_object)
  {
    return number_utilities.maximum( gather_hl_variables( v_object ), Symbols.symbol_function( $sym48$VARIABLE_ID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8433L)
  public static SubLObject max_hl_variable_id(final SubLObject v_object)
  {
    final SubLObject var = max_hl_variable( v_object );
    return ( NIL != var ) ? variable_id( var ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8560L)
  public static SubLObject fully_bound_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == not_fully_bound_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8748L)
  public static SubLObject not_fully_bound_p(final SubLObject v_object)
  {
    if( v_object.isAtom() )
    {
      return variable_p( v_object );
    }
    SubLObject rest = NIL;
    SubLObject next = NIL;
    rest = v_object;
    next = rest.first();
    while ( !rest.rest().isAtom())
    {
      if( NIL != not_fully_bound_p( next ) )
      {
        return T;
      }
      rest = rest.rest();
      next = rest.first();
    }
    return makeBoolean( NIL != not_fully_bound_p( next ) || NIL != variable_p( rest.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9249L)
  public static SubLObject cycl_ground_expression_p(final SubLObject expression)
  {
    return makeBoolean( NIL == cycl_utilities.expression_find_if( $sym77$CYC_VAR_, expression, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9361L)
  public static SubLObject hl_ground_expression_p(final SubLObject expression)
  {
    return makeBoolean( NIL == cycl_utilities.expression_find_if( Symbols.symbol_function( $sym2$VARIABLE_P ), expression, UNPROVIDED, UNPROVIDED ) );
  }

  public static SubLObject declare_variables_file()
  {
    SubLFiles.declareFunction( me, "variable_print_function_trampoline", "VARIABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_p", "VARIABLE-P", 1, 0, false );
    new $variable_p$UnaryFunction();
    SubLFiles.declareFunction( me, "var_id", "VAR-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_var_id", "_CSETF-VAR-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "make_variable", "MAKE-VARIABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_variable", "VISIT-DEFSTRUCT-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_variable_method", "VISIT-DEFSTRUCT-OBJECT-VARIABLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_variable", "PRINT-VARIABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_variable_method", "SXHASH-VARIABLE-METHOD", 1, 0, false );
    new $sxhash_variable_method$UnaryFunction();
    SubLFiles.declareFunction( me, "get_variable", "GET-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "setup_variable_table", "SETUP-VARIABLE-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "setup_convenience_variables", "SETUP-CONVENIENCE-VARIABLES", 0, 0, false );
    SubLFiles.declareFunction( me, "variable_count", "VARIABLE-COUNT", 0, 0, false );
    SubLFiles.declareMacro( me, "do_hl_variables", "DO-HL-VARIABLES" );
    SubLFiles.declareFunction( me, "variable_id", "VARIABLE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "find_variable_by_id", "FIND-VARIABLE-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_L", "VARIABLE-<", 2, 0, false );
    new $variable_L$BinaryFunction();
    SubLFiles.declareFunction( me, "random_variable", "RANDOM-VARIABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "default_el_var_for_hl_var", "DEFAULT-EL-VAR-FOR-HL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_default_el_var_for_hl_var_cached", "CLEAR-DEFAULT-EL-VAR-FOR-HL-VAR-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_default_el_var_for_hl_var_cached", "REMOVE-DEFAULT-EL-VAR-FOR-HL-VAR-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "default_el_var_for_hl_var_cached_internal", "DEFAULT-EL-VAR-FOR-HL-VAR-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "default_el_var_for_hl_var_cached", "DEFAULT-EL-VAR-FOR-HL-VAR-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_el_var", "GET-DEFAULT-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_hl_var_for_default_el_var", "CLEAR-HL-VAR-FOR-DEFAULT-EL-VAR", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_hl_var_for_default_el_var", "REMOVE-HL-VAR-FOR-DEFAULT-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_var_for_default_el_var_internal", "HL-VAR-FOR-DEFAULT-EL-VAR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_var_for_default_el_var", "HL-VAR-FOR-DEFAULT-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_hl_variable_list", "SORT-HL-VARIABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_hl_variable_list_memoized", "SORT-HL-VARIABLE-LIST-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_hl_variable_list_memoized_int_internal", "SORT-HL-VARIABLE-LIST-MEMOIZED-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_hl_variable_list_memoized_int", "SORT-HL-VARIABLE-LIST-MEMOIZED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sorted_hl_variables_in_expressions_intersection", "SORTED-HL-VARIABLES-IN-EXPRESSIONS-INTERSECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_default_el_vars", "CANONICALIZE-DEFAULT-EL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "uncanonicalize_hl_vars", "UNCANONICALIZE-HL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "error_unless_canonicalize_default_el_vars", "ERROR-UNLESS-CANONICALIZE-DEFAULT-EL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "error_if_expression_contains_non_default_el_var", "ERROR-IF-EXPRESSION-CONTAINS-NON-DEFAULT-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_symbolp", "VARIABLE-SYMBOLP", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_variable_symbols", "GATHER-VARIABLE-SYMBOLS", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_variables", "REPLACE-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "restore_variables", "RESTORE-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "subst_hl_variables", "SUBST-HL-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_hl_variable_list", "GENERATE-HL-VARIABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_hl_variables", "GATHER-HL-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "max_hl_variable", "MAX-HL-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "max_hl_variable_id", "MAX-HL-VARIABLE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "fully_bound_p", "FULLY-BOUND-P", 1, 0, false );
    new $fully_bound_p$UnaryFunction();
    SubLFiles.declareFunction( me, "not_fully_bound_p", "NOT-FULLY-BOUND-P", 1, 0, false );
    new $not_fully_bound_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cycl_ground_expression_p", "CYCL-GROUND-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_ground_expression_p", "HL-GROUND-EXPRESSION-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_variables_file()
  {
    $hl_variable_prefix_char$ = SubLFiles.defconstant( "*HL-VARIABLE-PREFIX-CHAR*", Characters.CHAR_question );
    $default_el_variable_prefix$ = SubLFiles.defconstant( "*DEFAULT-EL-VARIABLE-PREFIX*", $str0$_VAR );
    $dtp_variable$ = SubLFiles.defconstant( "*DTP-VARIABLE*", $sym1$VARIABLE );
    $variable_max$ = SubLFiles.deflexical( "*VARIABLE-MAX*", $int25$200 );
    $variable_array$ = SubLFiles.deflexical( "*VARIABLE-ARRAY*", ( maybeDefault( $sym26$_VARIABLE_ARRAY_, $variable_array$, NIL ) ) );
    $var0$ = SubLFiles.deflexical( "*VAR0*", ( maybeDefault( $sym27$_VAR0_, $var0$, NIL ) ) );
    $var1$ = SubLFiles.deflexical( "*VAR1*", ( maybeDefault( $sym28$_VAR1_, $var1$, NIL ) ) );
    $var2$ = SubLFiles.deflexical( "*VAR2*", ( maybeDefault( $sym29$_VAR2_, $var2$, NIL ) ) );
    $var3$ = SubLFiles.deflexical( "*VAR3*", ( maybeDefault( $sym30$_VAR3_, $var3$, NIL ) ) );
    $var4$ = SubLFiles.deflexical( "*VAR4*", ( maybeDefault( $sym31$_VAR4_, $var4$, NIL ) ) );
    $default_el_var_for_hl_var_cached_caching_state$ = SubLFiles.deflexical( "*DEFAULT-EL-VAR-FOR-HL-VAR-CACHED-CACHING-STATE*", NIL );
    $hl_var_for_default_el_var_caching_state$ = SubLFiles.deflexical( "*HL-VAR-FOR-DEFAULT-EL-VAR-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_variables_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_variable$.getGlobalValue(), Symbols.symbol_function( $sym8$VARIABLE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$VAR_ID, $sym11$_CSETF_VAR_ID );
    Equality.identity( $sym1$VARIABLE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_variable$.getGlobalValue(), Symbols.symbol_function( $sym18$VISIT_DEFSTRUCT_OBJECT_VARIABLE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_variable$.getGlobalValue(), Symbols.symbol_function( $sym21$SXHASH_VARIABLE_METHOD ) );
    utilities_macros.register_cyc_api_function( $sym2$VARIABLE_P, $list22, $str23$Return_T_iff_OBJECT_is_an_HL_vari, NIL, $list24 );
    subl_macro_promotions.declare_defglobal( $sym26$_VARIABLE_ARRAY_ );
    subl_macro_promotions.declare_defglobal( $sym27$_VAR0_ );
    subl_macro_promotions.declare_defglobal( $sym28$_VAR1_ );
    subl_macro_promotions.declare_defglobal( $sym29$_VAR2_ );
    subl_macro_promotions.declare_defglobal( $sym30$_VAR3_ );
    subl_macro_promotions.declare_defglobal( $sym31$_VAR4_ );
    setup_variable_table();
    utilities_macros.register_cyc_api_function( $sym35$VARIABLE_COUNT, NIL, $str36$Return_the_total_number_of_HL_var, NIL, $list37 );
    utilities_macros.register_cyc_api_function( $sym48$VARIABLE_ID, $list49, $str50$Return_id_of_HL_variable_VARIABLE, $list51, $list37 );
    utilities_macros.register_cyc_api_function( $sym47$FIND_VARIABLE_BY_ID, $list3, $str53$Return_the_HL_variable_with_ID__o, $list54, $list55 );
    utilities_macros.register_cyc_api_function( $sym56$DEFAULT_EL_VAR_FOR_HL_VAR, $list49, $str57$Return_a_readable_EL_var_from_HL_, $list51, NIL );
    memoization_state.note_globally_cached_function( $sym58$DEFAULT_EL_VAR_FOR_HL_VAR_CACHED );
    memoization_state.note_globally_cached_function( $sym60$HL_VAR_FOR_DEFAULT_EL_VAR );
    memoization_state.note_memoized_function( $sym64$SORT_HL_VARIABLE_LIST_MEMOIZED_INT );
    access_macros.define_obsolete_register( $sym69$VARIABLE_SYMBOLP, $list70 );
    utilities_macros.register_cyc_api_function( $sym73$FULLY_BOUND_P, $list22, $str74$Return_T_iff_OBJECT_contains_no_H, NIL, $list24 );
    utilities_macros.register_cyc_api_function( $sym75$NOT_FULLY_BOUND_P, $list22, $str76$Return_T_iff_OBJECT_contains_some, NIL, $list24 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_variables_file();
  }

  @Override
  public void initializeVariables()
  {
    init_variables_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_variables_file();
  }
  static
  {
    me = new variables();
    $hl_variable_prefix_char$ = null;
    $default_el_variable_prefix$ = null;
    $dtp_variable$ = null;
    $variable_max$ = null;
    $variable_array$ = null;
    $var0$ = null;
    $var1$ = null;
    $var2$ = null;
    $var3$ = null;
    $var4$ = null;
    $default_el_var_for_hl_var_cached_caching_state$ = null;
    $hl_var_for_default_el_var_caching_state$ = null;
    $str0$_VAR = makeString( "?VAR" );
    $sym1$VARIABLE = makeSymbol( "VARIABLE" );
    $sym2$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $list3 = ConsesLow.list( makeSymbol( "ID" ) );
    $list4 = ConsesLow.list( makeKeyword( "ID" ) );
    $list5 = ConsesLow.list( makeSymbol( "VAR-ID" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-VAR-ID" ) );
    $sym7$PRINT_VARIABLE = makeSymbol( "PRINT-VARIABLE" );
    $sym8$VARIABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "VARIABLE-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "VARIABLE-P" ) );
    $sym10$VAR_ID = makeSymbol( "VAR-ID" );
    $sym11$_CSETF_VAR_ID = makeSymbol( "_CSETF-VAR-ID" );
    $kw12$ID = makeKeyword( "ID" );
    $str13$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw14$BEGIN = makeKeyword( "BEGIN" );
    $sym15$MAKE_VARIABLE = makeSymbol( "MAKE-VARIABLE" );
    $kw16$SLOT = makeKeyword( "SLOT" );
    $kw17$END = makeKeyword( "END" );
    $sym18$VISIT_DEFSTRUCT_OBJECT_VARIABLE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-VARIABLE-METHOD" );
    $str19$_Cvar_D = makeString( "~Cvar~D" );
    $int20$99 = makeInteger( 99 );
    $sym21$SXHASH_VARIABLE_METHOD = makeSymbol( "SXHASH-VARIABLE-METHOD" );
    $list22 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $str23$Return_T_iff_OBJECT_is_an_HL_vari = makeString( "Return T iff OBJECT is an HL variable." );
    $list24 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $int25$200 = makeInteger( 200 );
    $sym26$_VARIABLE_ARRAY_ = makeSymbol( "*VARIABLE-ARRAY*" );
    $sym27$_VAR0_ = makeSymbol( "*VAR0*" );
    $sym28$_VAR1_ = makeSymbol( "*VAR1*" );
    $sym29$_VAR2_ = makeSymbol( "*VAR2*" );
    $sym30$_VAR3_ = makeSymbol( "*VAR3*" );
    $sym31$_VAR4_ = makeSymbol( "*VAR4*" );
    $sym32$FIXNUMP = makeSymbol( "FIXNUMP" );
    $str33$The_maximum_number_of_HL_variable = makeString( "The maximum number of HL variables (" );
    $str34$__has_been_reached_ = makeString( ") has been reached." );
    $sym35$VARIABLE_COUNT = makeSymbol( "VARIABLE-COUNT" );
    $str36$Return_the_total_number_of_HL_var = makeString( "Return the total number of HL " );
    $list37 = ConsesLow.list( makeSymbol( "INTEGERP" ) );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list39 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw40$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw41$DONE = makeKeyword( "DONE" );
    $sym42$NUM = makeUninternedSymbol( "NUM" );
    $sym43$DO_NUMBERS = makeSymbol( "DO-NUMBERS" );
    $kw44$START = makeKeyword( "START" );
    $list45 = ConsesLow.list( makeSymbol( "VARIABLE-COUNT" ) );
    $sym46$CLET = makeSymbol( "CLET" );
    $sym47$FIND_VARIABLE_BY_ID = makeSymbol( "FIND-VARIABLE-BY-ID" );
    $sym48$VARIABLE_ID = makeSymbol( "VARIABLE-ID" );
    $list49 = ConsesLow.list( makeSymbol( "VARIABLE" ) );
    $str50$Return_id_of_HL_variable_VARIABLE = makeString( "Return id of HL variable VARIABLE." );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "VARIABLE-P" ) ) );
    $sym52$INTEGERP = makeSymbol( "INTEGERP" );
    $str53$Return_the_HL_variable_with_ID__o = makeString( "Return the HL variable with ID, or NIL if not present." );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "INTEGERP" ) ) );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "VARIABLE-P" ) ) );
    $sym56$DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol( "DEFAULT-EL-VAR-FOR-HL-VAR" );
    $str57$Return_a_readable_EL_var_from_HL_ = makeString( "Return a readable EL var from HL var VARIABLE." );
    $sym58$DEFAULT_EL_VAR_FOR_HL_VAR_CACHED = makeSymbol( "DEFAULT-EL-VAR-FOR-HL-VAR-CACHED" );
    $sym59$_DEFAULT_EL_VAR_FOR_HL_VAR_CACHED_CACHING_STATE_ = makeSymbol( "*DEFAULT-EL-VAR-FOR-HL-VAR-CACHED-CACHING-STATE*" );
    $sym60$HL_VAR_FOR_DEFAULT_EL_VAR = makeSymbol( "HL-VAR-FOR-DEFAULT-EL-VAR" );
    $sym61$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym62$_HL_VAR_FOR_DEFAULT_EL_VAR_CACHING_STATE_ = makeSymbol( "*HL-VAR-FOR-DEFAULT-EL-VAR-CACHING-STATE*" );
    $sym63$VARIABLE__ = makeSymbol( "VARIABLE-<" );
    $sym64$SORT_HL_VARIABLE_LIST_MEMOIZED_INT = makeSymbol( "SORT-HL-VARIABLE-LIST-MEMOIZED-INT" );
    $sym65$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $sym66$DEFAULT_EL_VAR_ = makeSymbol( "DEFAULT-EL-VAR?" );
    $sym67$NON_DEFAULT_EL_VAR_ = makeSymbol( "NON-DEFAULT-EL-VAR?" );
    $str68$_s_contained_the_non_default_EL_v = makeString( "~s contained the non-default EL variable ~s, which is not handled yet." );
    $sym69$VARIABLE_SYMBOLP = makeSymbol( "VARIABLE-SYMBOLP" );
    $list70 = ConsesLow.list( makeSymbol( "EL-VAR?" ) );
    $sym71$CONS = makeSymbol( "CONS" );
    $sym72$_ = makeSymbol( "<" );
    $sym73$FULLY_BOUND_P = makeSymbol( "FULLY-BOUND-P" );
    $str74$Return_T_iff_OBJECT_contains_no_H = makeString( "Return T iff OBJECT contains no HL variables, and therefore is fully bound." );
    $sym75$NOT_FULLY_BOUND_P = makeSymbol( "NOT-FULLY-BOUND-P" );
    $str76$Return_T_iff_OBJECT_contains_some = makeString( "Return T iff OBJECT contains some HL variable, and therefore is not fully bound." );
    $sym77$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
  }

  public static final class $variable_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;

    public $variable_native()
    {
      this.$id = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $variable_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $variable_native.class, $sym1$VARIABLE, $sym2$VARIABLE_P, $list3, $list4, new String[] { "$id"
      }, $list5, $list6, $sym7$PRINT_VARIABLE );
    }
  }

  public static final class $variable_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $variable_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VARIABLE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return variable_p( arg1 );
    }
  }

  public static final class $sxhash_variable_method$UnaryFunction
      extends
        UnaryFunction
  {
    public $sxhash_variable_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-VARIABLE-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sxhash_variable_method( arg1 );
    }
  }

  public static final class $variable_L$BinaryFunction
      extends
        BinaryFunction
  {
    public $variable_L$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VARIABLE-<" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return variable_L( arg1, arg2 );
    }
  }

  public static final class $fully_bound_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $fully_bound_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FULLY-BOUND-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return fully_bound_p( arg1 );
    }
  }

  public static final class $not_fully_bound_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $not_fully_bound_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NOT-FULLY-BOUND-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return not_fully_bound_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 258 ms
 * 
 */