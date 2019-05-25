package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class quantities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quantities";
  public static final String myFingerPrint = "b62c13b4452347b9cec9fc5629a767691632b72408bf6616f8859572801ff01b";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 401L)
  public static SubLSymbol $convert_units_as_absolutesP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 643L)
  private static SubLSymbol $quant_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8924L)
  private static SubLSymbol $get_umf_search_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9016L)
  private static SubLSymbol $get_umf_paths$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9059L)
  private static SubLSymbol $get_umf_allow_fractionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10289L)
  private static SubLSymbol $get_definitional_unit_multiplication_factor_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43068L)
  private static SubLSymbol $round_nth_n$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43205L)
  private static SubLSymbol $round_nth_output_format$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$VALID_CONSTANT_;
  private static final SubLObject $const2$ScalarInterval;
  private static final SubLSymbol $sym3$CYC_SCALAR_INTERVAL_P;
  private static final SubLString $str4$A_KB_dependent_numerical_quantifi;
  private static final SubLObject $const5$Unity;
  private static final SubLSymbol $kw6$UNEVALUATABLE;
  private static final SubLSymbol $sym7$_EXIT;
  private static final SubLSymbol $sym8$FORT_P;
  private static final SubLObject $const9$maxQuantValue;
  private static final SubLObject $const10$minQuantValue;
  private static final SubLObject $const11$unitAbsoluteScaleOffset;
  private static final SubLSymbol $kw12$GAF;
  private static final SubLSymbol $sym13$GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR;
  private static final SubLSymbol $sym14$_GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR_CACHING_STATE_;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$CAR;
  private static final SubLObject $const17$unitMultiplicationFactor;
  private static final SubLString $str18$Link_not_found_;
  private static final SubLList $list19;
  private static final SubLString $str20$No_previous_unit_;
  private static final SubLObject $const21$multiplicationUnits;
  private static final SubLObject $const22$PerFn;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$CYC_INTEGER_RANGE;
  private static final SubLObject $const26$integerRange;
  private static final SubLObject $const27$quantitySubsumes;
  private static final SubLSymbol $sym28$CYC_NUMBER_RANGE;
  private static final SubLObject $const29$numberRange;
  private static final SubLSymbol $sym30$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym31$FUZZY_NUMBER_;
  private static final SubLObject $const32$PlusFn;
  private static final SubLObject $const33$IntervalOnNumberLine;
  private static final SubLSymbol $sym34$CYC_QUANTITY_CONVERSION;
  private static final SubLSymbol $sym35$CYC_QUANTITY_CONVERSION_ABSOLUTE;
  private static final SubLObject $const36$TimesFn;
  private static final SubLObject $const37$IntegerExtent;
  private static final SubLObject $const38$ScalarPointValue;
  private static final SubLSymbol $kw39$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym40$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym41$CYC_QUOTIENT;
  private static final SubLSymbol $sym42$CYC_INVERSE;
  private static final SubLSymbol $sym43$CYC_MODULO;
  private static final SubLString $str44$Got__S___Wanted__S;
  private static final SubLSymbol $sym45$CYC_RESIDUE;
  private static final SubLObject $const46$quantityCongruenceBase;
  private static final SubLSymbol $kw47$TRUE;
  private static final SubLObject $const48$MeasurableQuantityType;
  private static final SubLSymbol $sym49$CYC_ABSOLUTE_VALUE;
  private static final SubLSymbol $sym50$CYC_SQRT;
  private static final SubLSymbol $sym51$CYC_SQUARED;
  private static final SubLList $list52;
  private static final SubLInteger $int53$100;
  private static final SubLSymbol $sym54$CYC_PERCENT;
  private static final SubLSymbol $sym55$CEILING;
  private static final SubLSymbol $sym56$CYC_ROUND_UP;
  private static final SubLSymbol $sym57$ROUND;
  private static final SubLSymbol $sym58$CYC_ROUND_CLOSEST;
  private static final SubLSymbol $sym59$FLOOR;
  private static final SubLSymbol $sym60$CYC_ROUND_DOWN;
  private static final SubLSymbol $sym61$TRUNCATE;
  private static final SubLSymbol $sym62$CYC_ROUND_TRUNCATE;
  private static final SubLSymbol $kw63$SUBL;
  private static final SubLSymbol $sym64$NUMBERP;
  private static final SubLSymbol $sym65$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $kw66$CYCL;
  private static final SubLObject $const67$DecimalFractionFn;
  private static final SubLSymbol $sym68$ROUND_TO_NTH_DECIMAL;
  private static final SubLSymbol $sym69$CYC_ROUND_CLOSEST_TO_NTH_DECIMAL;
  private static final SubLSymbol $sym70$CYC_MAX_RANGE_INTERNAL;
  private static final SubLSymbol $sym71$CYC_MAX_RANGE;
  private static final SubLSymbol $sym72$CYC_MIN_RANGE_INTERNAL;
  private static final SubLSymbol $sym73$CYC_MIN_RANGE;
  private static final SubLSymbol $sym74$CYC_MIN_QUANT_VALUE;
  private static final SubLSymbol $sym75$CYC_MAX_QUANT_VALUE;
  private static final SubLSymbol $sym76$CYC_QUANTITY_UNIT;
  private static final SubLSymbol $sym77$CYC_QUANTITY_MEASURE;
  private static final SubLSymbol $sym78$CYC_TOLERANCE;
  private static final SubLSymbol $sym79$CYC_SIGNIFICANT_DIGITS;
  private static final SubLSymbol $sym80$SIN;
  private static final SubLSymbol $sym81$CYC_SINE;
  private static final SubLSymbol $sym82$COS;
  private static final SubLSymbol $sym83$CYC_COSINE;
  private static final SubLSymbol $sym84$TAN;
  private static final SubLSymbol $sym85$CYC_TANGENT;
  private static final SubLSymbol $sym86$CYC_COSECANT;
  private static final SubLSymbol $sym87$CYC_SECANT;
  private static final SubLSymbol $sym88$CYC_COTANGENT;
  private static final SubLObject $const89$Radian;
  private static final SubLSymbol $sym90$ASIN;
  private static final SubLSymbol $sym91$CYC_ARC_SINE;
  private static final SubLSymbol $sym92$ACOS;
  private static final SubLSymbol $sym93$CYC_ARC_COSINE;
  private static final SubLSymbol $sym94$ATAN;
  private static final SubLSymbol $sym95$CYC_ARC_TANGENT;
  private static final SubLSymbol $sym96$CYC_ARC_COSECANT;
  private static final SubLSymbol $sym97$CYC_ARC_SECANT;
  private static final SubLSymbol $sym98$CYC_ARC_COTANGENT;
  private static final SubLSymbol $sym99$CYC_LOGARITHM;
  private static final SubLSymbol $sym100$CYC_EXPONENT;
  private static final SubLSymbol $sym101$CYC_QUADRATIC_SOLUTION_POSITIVE;
  private static final SubLSymbol $sym102$CYC_QUADRATIC_SOLUTION_NEGATIVE;
  private static final SubLSymbol $kw103$HL;
  private static final SubLSymbol $sym104$MAKE_EL_LIST;
  private static final SubLSymbol $sym105$CYC_COLLECTION_SUBSUMPTION_PATHS;
  private static final SubLSymbol $sym106$CYC_PREDICATE_SUBSUMPTION_PATHS;
  private static final SubLObject $const107$greaterThan;
  private static final SubLSymbol $sym108$FRACTION_;
  private static final SubLObject $const109$NegativeMixedFractionFn;
  private static final SubLObject $const110$MixedFractionFn;
  private static final SubLString $str111$Can_t_negate__S;
  private static final SubLObject $const112$followingValue;
  private static final SubLList $list113;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$SIMPLE_FRACTION_;
  private static final SubLObject $const116$SimpleFractionFn;
  private static final SubLObject $const117$greaterThanOrEqualTo;
  private static final SubLSymbol $sym118$CYC_QUANTITY_SUBSUMES;
  private static final SubLObject $const119$quantityIntersects;
  private static final SubLSymbol $sym120$CYC_QUANTITY_INTERSECTS;
  private static final SubLSymbol $sym121$CYC_DIVIDES_EVENLY;
  private static final SubLSymbol $sym122$CYC_LIST_NTH;
  private static final SubLSymbol $sym123$EL_LIST_P;
  private static final SubLSymbol $sym124$APPEND;
  private static final SubLSymbol $sym125$EL_LIST_ITEMS;
  private static final SubLSymbol $sym126$CYC_LIST_CONCATENATE;
  private static final SubLSymbol $sym127$CYC_APPEND_TO_LIST;
  private static final SubLSymbol $sym128$CYC_PREPEND_TO_LIST;
  private static final SubLSymbol $sym129$CYC_LIST_FIRST;
  private static final SubLSymbol $sym130$CYC_LIST_SECOND;
  private static final SubLSymbol $sym131$CYC_LIST_REST;
  private static final SubLSymbol $sym132$CYC_LIST_LAST;
  private static final SubLSymbol $sym133$CYC_LIST_SUBSEQ;
  private static final SubLObject $const134$TheEmptyList;
  private static final SubLSymbol $sym135$CYC_LIST_SUBSEQ_UP_TO;
  private static final SubLSymbol $sym136$CYC_LIST_SEARCH;
  private static final SubLSymbol $sym137$CYC_POSITION;
  private static final SubLSymbol $sym138$CYC_LIST_LENGTH;
  private static final SubLSymbol $sym139$CYC_LIST_REVERSE;
  private static final SubLSymbol $sym140$CYC_LIST_MEMBER_SET;
  private static final SubLSymbol $sym141$CYC_SET_ELEMENT_LIST;
  private static final SubLSymbol $sym142$DOUBLETON_;
  private static final SubLSymbol $sym143$DOUBLETON_TO_CONS;
  private static final SubLSymbol $sym144$CYC_SUBSTITUTE_FROM_LIST;
  private static final SubLList $list145;
  private static final SubLSymbol $sym146$CYC_SUBSTITUTE_FROM_THE_TERM_BINDING_SET;
  private static final SubLSymbol $sym147$CYC_REMOVE_ADJACENT_DUPLICATES_FROM_LIST_FN;
  private static final SubLSymbol $sym148$CYC_MAP_FUNCTION_OVER_LIST;
  private static final SubLSymbol $sym149$CYC_MAP_FUNCTION_OVER_LIST_UNTIL;
  private static final SubLSymbol $sym150$CYC_MAP_FUNCTION_OVER_LIST_UNTIL_RESULT;
  private static final SubLSymbol $sym151$CYC_MAP_FUNCTION_WITH_ARGS_OVER_LISTS;
  private static final SubLSymbol $sym152$MAX;
  private static final SubLSymbol $sym153$CYC_APPLY_FUNCTION_RECURSIVELY;
  private static final SubLSymbol $sym154$CYC_LIST_MEMBER_;
  private static final SubLSymbol $sym155$CYC_LIST_CONTAINS_MEMBER_;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$CYC_SUBLIST_;
  private static final SubLSymbol $sym158$CYC_INITIAL_SUBLIST_;
  private static final SubLSymbol $kw159$EL;
  private static final SubLString $str160$Don_t_know_how_to_determine_the_e;
  private static final SubLSymbol $sym161$CYC_SET_INTERSECTION;
  private static final SubLSymbol $sym162$CYC_SET_UNION;
  private static final SubLSymbol $sym163$CYC_SET_DIFFERENCE;
  private static final SubLObject $const164$TheEmptySet;
  private static final SubLObject $const165$TheSet;
  private static final SubLSymbol $sym166$CYC_SET_EXTENT;
  private static final SubLSymbol $sym167$CYC_MAP_FUNCTION_OVER_SET;
  private static final SubLSymbol $sym168$CYC_LEAST_COMMON_MULTIPLE_INTERNAL;
  private static final SubLSymbol $sym169$CYC_LEAST_COMMON_MULTIPLE;
  private static final SubLSymbol $sym170$CYC_GREATEST_COMMON_DIVISOR_INTERNAL;
  private static final SubLSymbol $sym171$CYC_GREATEST_COMMON_DIVISOR;
  private static final SubLSymbol $sym172$CYC_RANDOM_INTEGER;
  private static final SubLInteger $int173$21;
  private static final SubLInteger $int174$_24;
  private static final SubLInteger $int175$_14;
  private static final SubLInteger $int176$_28;
  private static final SubLInteger $int177$31;
  private static final SubLSymbol $sym178$CYC_RANDOM_INTEGER_WITH_SEED;
  private static final SubLSymbol $sym179$ARITHMETIC_ANSWER;
  private static final SubLSymbol $sym180$CYC_N_RANDOM_INTEGERS;
  private static final SubLSymbol $sym181$CYC_MATRIX_SOLUTION;
  private static final SubLSymbol $sym182$GET_INTERCONVERTIBLE_UNITS_OF_MEASURE;
  private static final SubLSymbol $sym183$FALSE;
  private static final SubLList $list184;
  private static final SubLObject $const185$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLList $list186;
  private static final SubLList $list187;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1063L)
  public static SubLObject initialize_quant_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym1$VALID_CONSTANT_, $quant_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_quant_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_quant_kb_loaded();
    }
    return kb_control_vars.quant_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1416L)
  public static SubLObject cyc_scalar_interval_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != extended_numbers.extended_number_p( v_object ) || NIL != collection_defns.ibqeP( v_object, UNPROVIDED ) || NIL != isa.isa_in_any_mtP( v_object, $const2$ScalarInterval ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1948L)
  public static SubLObject list_of_cyc_scalar_interval_p(final SubLObject v_object)
  {
    return list_utilities.list_of_type_p( Symbols.symbol_function( $sym3$CYC_SCALAR_INTERVAL_P ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2060L)
  public static SubLObject make_interval(SubLObject unit, SubLObject min, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = min;
    }
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    unit = function_terms.naut_to_nart( unit );
    min = arithmetic.arithmetic_answer( min );
    max = arithmetic.arithmetic_answer( max );
    if( NIL != extended_numbers.possibly_infinite_or_extended_numberE( min, max ) )
    {
      if( unit.eql( $const5$Unity ) )
      {
        return min;
      }
      return ConsesLow.list( unit, min );
    }
    else
    {
      if( NIL != extended_numbers.possibly_infinite_or_extended_numberL( min, max ) )
      {
        return ConsesLow.list( unit, min, max );
      }
      return ConsesLow.list( unit, max, min );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2726L)
  public static SubLObject explode_interval_ignoring_unevaluatable(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_this = NIL;
    try
    {
      thread.throwStack.push( $kw6$UNEVALUATABLE );
      return explode_interval( interval );
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_this = Errors.handleThrowable( ccatch_env_var, $kw6$UNEVALUATABLE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2862L)
  public static SubLObject explode_interval(final SubLObject interval)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    if( NIL != extended_numbers.extended_number_p( interval ) || NIL != collection_defns.fractionP( interval, UNPROVIDED ) )
    {
      return Values.values( $const5$Unity, interval, interval );
    }
    if( NIL != forts.fort_p( interval ) )
    {
      return explode_fort_interval( interval );
    }
    if( interval.isAtom() )
    {
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    SubLObject unit = NIL;
    SubLObject min = NIL;
    SubLObject max = NIL;
    unit = interval.first();
    if( NIL == unit )
    {
      relation_evaluation.throw_unevaluatable();
    }
    min = conses_high.second( interval );
    if( NIL == extended_numbers.possibly_infinite_or_extended_number_p( min ) && NIL == collection_defns.fractionP( min, UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    max = ( Sequences.length( interval ).numE( THREE_INTEGER ) ? conses_high.third( interval ) : min );
    if( NIL == extended_numbers.possibly_infinite_or_extended_number_p( max ) && NIL == collection_defns.fractionP( max, UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( NIL == extended_numbers.possibly_infinite_or_extended_numberLE( min, max ) && NIL == fractionsLE( min, max ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return Values.values( unit, min, max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3988L)
  public static SubLObject explode_fort_interval(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( interval ) : interval;
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    if( NIL != extended_numbers.cyc_infinite_number_p( interval ) )
    {
      return Values.values( $const5$Unity, interval, interval );
    }
    final SubLObject max_quant_value = max_quant_value( interval, UNPROVIDED );
    final SubLObject min_quant_value = min_quant_value( interval, UNPROVIDED );
    if( NIL != max_quant_value && NIL != min_quant_value && ( NIL == forts.fort_p( max_quant_value ) || NIL != extended_numbers.cyc_infinite_number_p( max_quant_value ) ) && ( NIL == forts.fort_p( min_quant_value )
        || NIL != extended_numbers.cyc_infinite_number_p( min_quant_value ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject max_quant_unit = explode_interval( max_quant_value );
      final SubLObject max_quant_min = thread.secondMultipleValue();
      final SubLObject max_quant_max = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject min_quant_unit = explode_interval( min_quant_value );
      final SubLObject min_quant_min = thread.secondMultipleValue();
      final SubLObject min_quant_max = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( !max_quant_unit.eql( min_quant_unit ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      if( NIL == extended_numbers.possibly_infinite_or_extended_numberLE( min_quant_max, max_quant_min ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      return Values.values( max_quant_unit, min_quant_max, max_quant_min );
    }
    if( NIL != nart_handles.nart_p( interval ) )
    {
      final SubLObject nart_hl_formula = narts_high.nart_hl_formula( interval );
      if( NIL != nart_hl_formula )
      {
        return explode_interval( nart_hl_formula );
      }
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5488L)
  public static SubLObject max_quant_value(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    return kb_mapping_utilities.fpred_value_in_relevant_mts( fort, $const9$maxQuantValue, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5795L)
  public static SubLObject min_quant_value(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    return kb_mapping_utilities.fpred_value_in_relevant_mts( fort, $const10$minQuantValue, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6102L)
  public static SubLObject comparable_units(final SubLObject target_unit, final SubLObject unit)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    return makeBoolean( target_unit.eql( unit ) || NIL != list_utilities.sublisp_boolean( get_unit_multiplication_factor( unit, target_unit ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6519L)
  public static SubLObject smaller_unit_than(final SubLObject unit1, final SubLObject unit2)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    final SubLObject factor = get_unit_multiplication_factor( unit1, unit2 );
    if( NIL == extended_numbers.extended_number_p( factor ) )
    {
      return NIL;
    }
    return Numbers.numL( factor, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7030L)
  public static SubLObject convert_to_units(final SubLObject target_unit, final SubLObject unit, final SubLObject min, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = min;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $convert_units_as_absolutesP$.getDynamicValue( thread ) )
    {
      return convert_to_units_absolute( target_unit, unit, min, max );
    }
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    if( target_unit.equal( unit ) )
    {
      return Values.values( min, max );
    }
    final SubLObject factor = get_unit_multiplication_factor( unit, target_unit );
    if( NIL == extended_numbers.extended_number_p( factor ) )
    {
      return NIL;
    }
    if( factor.numE( ONE_INTEGER ) )
    {
      return Values.values( min, max );
    }
    return Values.values( extended_numbers.extended_number_times( min, factor ), extended_numbers.extended_number_times( max, factor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7835L)
  public static SubLObject convert_to_units_absolute(final SubLObject target_unit, final SubLObject unit, final SubLObject min, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = min;
    }
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    if( target_unit.eql( unit ) )
    {
      return Values.values( min, max );
    }
    final SubLObject factor = get_unit_multiplication_factor( unit, target_unit );
    final SubLObject absolute_scale_offset = get_unit_absolute_scale_offset( unit, target_unit );
    final SubLObject opposite_scale_offset = get_unit_absolute_scale_offset( target_unit, unit );
    if( NIL == extended_numbers.extended_number_p( factor ) )
    {
      return NIL;
    }
    if( NIL != absolute_scale_offset )
    {
      return Values.values( Numbers.add( absolute_scale_offset, extended_numbers.extended_number_times( min, factor ) ), Numbers.add( absolute_scale_offset, extended_numbers.extended_number_times( max, factor ) ) );
    }
    if( NIL != opposite_scale_offset )
    {
      return Values.values( extended_numbers.extended_number_times( Numbers.subtract( min, opposite_scale_offset ), factor ), extended_numbers.extended_number_times( Numbers.subtract( max, opposite_scale_offset ),
          factor ) );
    }
    return Values.values( extended_numbers.extended_number_times( min, factor ), extended_numbers.extended_number_times( max, factor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9113L)
  public static SubLObject unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject factor = NIL;
    if( NIL != mt )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        factor = get_unit_multiplication_factor( from_unit, to_unit );
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
      factor = get_unit_multiplication_factor( from_unit, to_unit );
    }
    return factor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9561L)
  public static SubLObject get_unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit)
  {
    if( NIL != czer_utilities.equals_elP( from_unit, to_unit, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ONE_INTEGER;
    }
    SubLObject factor = get_definitional_unit_multiplication_factor( from_unit, to_unit );
    if( NIL == factor )
    {
      factor = get_contingent_unit_multiplication_factor( from_unit, to_unit );
    }
    return factor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9922L)
  public static SubLObject get_unit_absolute_scale_offset(final SubLObject from_unit, final SubLObject to_unit)
  {
    SubLObject result = NIL;
    final SubLObject pred_var = $const11$unitAbsoluteScaleOffset;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( to_unit, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( to_unit, ONE_INTEGER, pred_var );
      SubLObject done_var = result;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw12$GAF, NIL, NIL );
            SubLObject done_var_$1 = result;
            final SubLObject token_var_$2 = NIL;
            while ( NIL == done_var_$1)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
              final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
              if( NIL != valid_$3 && from_unit.eql( assertions_high.gaf_arg2( assertion ) ) )
              {
                relation_evaluation.cyc_evaluate_note_support( assertion );
                result = assertions_high.gaf_arg3( assertion );
              }
              done_var_$1 = makeBoolean( NIL == valid_$3 || NIL != result );
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
        done_var = makeBoolean( NIL == valid || NIL != result );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10289L)
  public static SubLObject clear_get_definitional_unit_multiplication_factor()
  {
    final SubLObject cs = $get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10289L)
  public static SubLObject remove_get_definitional_unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue(), ConsesLow.list( from_unit, to_unit ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10289L)
  public static SubLObject get_definitional_unit_multiplication_factor_internal(final SubLObject from_unit, final SubLObject to_unit)
  {
    return get_unit_multiplication_factor_int( from_unit, to_unit, mt_vars.$assertible_theory_mt_root$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10289L)
  public static SubLObject get_definitional_unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit)
  {
    SubLObject caching_state = $get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym13$GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR, $sym14$_GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR_CACHING_STATE_, NIL, EQUAL,
          TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( from_unit, to_unit );
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
        if( from_unit.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && to_unit.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_definitional_unit_multiplication_factor_internal( from_unit, to_unit ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( from_unit, to_unit ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10638L)
  public static SubLObject get_contingent_unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit)
  {
    final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
    return get_unit_multiplication_factor_int( from_unit, to_unit, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10828L)
  public static SubLObject get_unit_multiplication_factor_int(final SubLObject from_unit, final SubLObject to_unit, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject factor = NIL;
    final SubLObject _prev_bind_0 = $get_umf_allow_fractionsP$.currentBinding( thread );
    try
    {
      $get_umf_allow_fractionsP$.bind( NIL, thread );
      factor = get_umf( to_unit, from_unit, mt );
      if( NIL == factor )
      {
        factor = get_umf( from_unit, to_unit, mt );
        if( NIL != factor )
        {
          factor = Numbers.divide( ONE_INTEGER, factor );
        }
      }
      if( NIL == factor )
      {
        final SubLObject _prev_bind_0_$4 = $get_umf_allow_fractionsP$.currentBinding( thread );
        try
        {
          $get_umf_allow_fractionsP$.bind( T, thread );
          factor = get_umf( to_unit, from_unit, mt );
        }
        finally
        {
          $get_umf_allow_fractionsP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      $get_umf_allow_fractionsP$.rebind( _prev_bind_0, thread );
    }
    return factor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11551L)
  public static SubLObject get_umf(final SubLObject from_unit, final SubLObject to_unit, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject foundP = NIL;
    SubLObject factor = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $get_umf_paths$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $get_umf_search_state$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      $get_umf_paths$.bind( NIL, thread );
      $get_umf_search_state$.bind( queues.create_queue( UNPROVIDED ), thread );
      queues.enqueue( from_unit, $get_umf_search_state$.getDynamicValue( thread ) );
      final SubLObject item_var = ConsesLow.list( from_unit, NIL, ONE_INTEGER );
      if( NIL == conses_high.member( item_var, $get_umf_paths$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $get_umf_paths$.setDynamicValue( ConsesLow.cons( item_var, $get_umf_paths$.getDynamicValue( thread ) ), thread );
      }
      foundP = get_umf_internal( to_unit );
      if( NIL != foundP )
      {
        factor = get_umf_gather_factor( to_unit, from_unit );
      }
    }
    finally
    {
      $get_umf_search_state$.rebind( _prev_bind_5, thread );
      $get_umf_paths$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return factor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11977L)
  public static SubLObject get_umf_internal(final SubLObject to_unit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject from_unit = queues.dequeue( $get_umf_search_state$.getDynamicValue( thread ) );
    if( from_unit.eql( to_unit ) )
    {
      return T;
    }
    if( NIL != from_unit )
    {
      SubLObject cdolist_list_var;
      final SubLObject umf_assertions = cdolist_list_var = gather_umf_assertions( from_unit );
      SubLObject umf_assertion = NIL;
      umf_assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args( umf_assertion );
        SubLObject arg1_unit = NIL;
        SubLObject arg2_unit = NIL;
        SubLObject raw_factor = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
        arg1_unit = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
        arg2_unit = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
        raw_factor = current.first();
        current = current.rest();
        if( NIL == current )
        {
          raw_factor = cycl_real_number_to_number( raw_factor );
          SubLObject new_factor = NIL;
          SubLObject new_unit = NIL;
          if( arg1_unit.eql( from_unit ) )
          {
            new_unit = arg2_unit;
            new_factor = raw_factor;
          }
          else
          {
            new_unit = arg1_unit;
            new_factor = Numbers.divide( ONE_INTEGER, raw_factor );
          }
          if( NIL == subl_promotions.memberP( new_unit, $get_umf_paths$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym16$CAR ) ) && ( NIL != $get_umf_allow_fractionsP$
              .getDynamicValue( thread ) || !new_factor.isDouble() ) )
          {
            final SubLObject item_var = ConsesLow.list( new_unit, from_unit, new_factor );
            if( NIL == conses_high.member( item_var, $get_umf_paths$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $get_umf_paths$.setDynamicValue( ConsesLow.cons( item_var, $get_umf_paths$.getDynamicValue( thread ) ), thread );
            }
            if( new_unit.eql( to_unit ) )
            {
              relation_evaluation.cyc_evaluate_note_support( umf_assertion );
              return T;
            }
            queues.enqueue( new_unit, $get_umf_search_state$.getDynamicValue( thread ) );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        umf_assertion = cdolist_list_var.first();
      }
      return get_umf_internal( to_unit );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13202L)
  public static SubLObject gather_umf_assertions(final SubLObject unit)
  {
    SubLObject result = NIL;
    SubLObject gather_umf_assertions = NIL;
    SubLObject pred_var = $const17$unitMultiplicationFactor;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( unit, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( unit, ONE_INTEGER, pred_var );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw12$GAF, NIL, NIL );
            SubLObject done_var_$5 = NIL;
            final SubLObject token_var_$6 = NIL;
            while ( NIL == done_var_$5)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
              final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( assertion ) );
              if( NIL != valid_$7 )
              {
                gather_umf_assertions = ConsesLow.cons( assertion, gather_umf_assertions );
              }
              done_var_$5 = makeBoolean( NIL == valid_$7 );
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
    pred_var = $const17$unitMultiplicationFactor;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( unit, TWO_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( unit, TWO_INTEGER, pred_var );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw12$GAF, NIL, NIL );
            SubLObject done_var_$6 = NIL;
            final SubLObject token_var_$7 = NIL;
            while ( NIL == done_var_$6)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$7 );
              final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( assertion ) );
              if( NIL != valid_$8 )
              {
                gather_umf_assertions = ConsesLow.cons( assertion, gather_umf_assertions );
              }
              done_var_$6 = makeBoolean( NIL == valid_$8 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    result = gather_umf_assertions;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13678L)
  public static SubLObject get_umf_gather_factor(final SubLObject end_unit, final SubLObject start_unit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( end_unit.eql( start_unit ) )
    {
      return ONE_INTEGER;
    }
    final SubLObject link = conses_high.assoc( end_unit, $get_umf_paths$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( NIL == link )
    {
      Errors.error( $str18$Link_not_found_ );
    }
    SubLObject current;
    final SubLObject datum = current = link;
    SubLObject ignore = NIL;
    SubLObject previous_unit = NIL;
    SubLObject factor = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    ignore = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    previous_unit = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    factor = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == previous_unit )
      {
        Errors.error( $str20$No_previous_unit_ );
      }
      return Numbers.multiply( factor, get_umf_gather_factor( previous_unit, start_unit ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list19 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14145L)
  public static SubLObject unit_times(final SubLObject unit1, final SubLObject unit2)
  {
    if( unit1.equal( $const5$Unity ) )
    {
      return unit2;
    }
    if( unit2.equal( $const5$Unity ) )
    {
      return unit1;
    }
    return complex_unit_times( unit1, unit2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14462L)
  public static SubLObject unit_quotient(final SubLObject unit1, final SubLObject unit2)
  {
    if( unit1.equal( unit2 ) )
    {
      return $const5$Unity;
    }
    if( unit2.equal( $const5$Unity ) )
    {
      return unit1;
    }
    return complex_unit_quotient( unit1, unit2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14720L)
  public static SubLObject unit_sqrt(final SubLObject unit)
  {
    if( unit.equal( $const5$Unity ) )
    {
      return unit;
    }
    return complex_unit_sqrt( unit );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14919L)
  public static SubLObject complex_unit_times(final SubLObject unit1, final SubLObject unit2)
  {
    SubLObject v_answer = NIL;
    SubLObject pred_var = $const21$multiplicationUnits;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( unit1, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( unit1, ONE_INTEGER, pred_var );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw12$GAF, NIL, NIL );
            SubLObject done_var_$11 = v_answer;
            final SubLObject token_var_$12 = NIL;
            while ( NIL == done_var_$11)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$12 );
              final SubLObject valid_$13 = makeBoolean( !token_var_$12.eql( assertion ) );
              if( NIL != valid_$13 && unit2.eql( assertions_high.gaf_arg2( assertion ) ) )
              {
                relation_evaluation.cyc_evaluate_note_support( assertion );
                v_answer = assertions_high.gaf_arg3( assertion );
              }
              done_var_$11 = makeBoolean( NIL == valid_$13 || NIL != v_answer );
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
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    if( NIL != v_answer )
    {
      return v_answer;
    }
    v_answer = NIL;
    pred_var = $const21$multiplicationUnits;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( unit1, TWO_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( unit1, TWO_INTEGER, pred_var );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw12$GAF, NIL, NIL );
            SubLObject done_var_$12 = v_answer;
            final SubLObject token_var_$13 = NIL;
            while ( NIL == done_var_$12)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$13 );
              final SubLObject valid_$14 = makeBoolean( !token_var_$13.eql( assertion ) );
              if( NIL != valid_$14 && unit2.eql( assertions_high.gaf_arg1( assertion ) ) )
              {
                relation_evaluation.cyc_evaluate_note_support( assertion );
                v_answer = assertions_high.gaf_arg3( assertion );
              }
              done_var_$12 = makeBoolean( NIL == valid_$14 || NIL != v_answer );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    if( NIL != v_answer )
    {
      return v_answer;
    }
    if( NIL != per_fn_unit( unit1 ) )
    {
      return complex_per_fn_unit_times( unit1, unit2 );
    }
    if( NIL != per_fn_unit( unit2 ) )
    {
      return complex_per_fn_unit_times( unit2, unit1 );
    }
    return relation_evaluation.throw_unevaluatable();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15902L)
  public static SubLObject complex_per_fn_unit_times(final SubLObject per_unit, final SubLObject unit)
  {
    final SubLObject per_numerator = cycl_utilities.nat_arg1( per_unit, UNPROVIDED );
    final SubLObject per_denominator = cycl_utilities.nat_arg2( per_unit, UNPROVIDED );
    if( per_denominator.equal( unit ) )
    {
      return per_numerator;
    }
    if( NIL != per_fn_unit( per_numerator ) && cycl_utilities.nat_arg2( per_numerator, UNPROVIDED ).equal( unit ) )
    {
      return ConsesLow.list( $const22$PerFn, cycl_utilities.nat_arg1( per_numerator, UNPROVIDED ), per_denominator );
    }
    if( NIL == per_fn_unit( unit ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      final SubLObject other_numerator = cycl_utilities.nat_arg1( unit, UNPROVIDED );
      final SubLObject other_denominator = cycl_utilities.nat_arg2( unit, UNPROVIDED );
      if( per_numerator.equal( other_denominator ) )
      {
        if( per_denominator.equal( other_numerator ) )
        {
          return $const5$Unity;
        }
        return ConsesLow.list( $const22$PerFn, other_numerator, per_denominator );
      }
      else
      {
        if( per_denominator.equal( other_numerator ) )
        {
          return ConsesLow.list( $const22$PerFn, per_numerator, other_denominator );
        }
        relation_evaluation.throw_unevaluatable();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17009L)
  public static SubLObject complex_unit_quotient(final SubLObject unit1, final SubLObject unit2)
  {
    SubLObject v_answer = NIL;
    final SubLObject pred_var = $const21$multiplicationUnits;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( unit1, THREE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( unit1, THREE_INTEGER, pred_var );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw12$GAF, NIL, NIL );
            SubLObject done_var_$17 = v_answer;
            final SubLObject token_var_$18 = NIL;
            while ( NIL == done_var_$17)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$18 );
              final SubLObject valid_$19 = makeBoolean( !token_var_$18.eql( assertion ) );
              if( NIL != valid_$19 )
              {
                if( unit2.eql( assertions_high.gaf_arg1( assertion ) ) )
                {
                  relation_evaluation.cyc_evaluate_note_support( assertion );
                  v_answer = assertions_high.gaf_arg2( assertion );
                }
                else if( unit2.eql( assertions_high.gaf_arg2( assertion ) ) )
                {
                  relation_evaluation.cyc_evaluate_note_support( assertion );
                  v_answer = assertions_high.gaf_arg1( assertion );
                }
              }
              done_var_$17 = makeBoolean( NIL == valid_$19 || NIL != v_answer );
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
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    if( NIL != v_answer )
    {
      return v_answer;
    }
    if( NIL != per_fn_unit( unit2 ) )
    {
      return complex_per_fn_unit_quotient( unit1, unit2 );
    }
    if( NIL != per_fn_unit( unit1 ) )
    {
      return relation_evaluation.throw_unevaluatable();
    }
    if( NIL != kb_utilities.kbeq( unit2, $const5$Unity ) )
    {
      return unit1;
    }
    return ConsesLow.list( $const22$PerFn, unit1, unit2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17929L)
  public static SubLObject complex_per_fn_unit_quotient(final SubLObject unit, final SubLObject per_unit)
  {
    final SubLObject per_numerator = cycl_utilities.nat_arg1( per_unit, UNPROVIDED );
    final SubLObject per_denominator = cycl_utilities.nat_arg2( per_unit, UNPROVIDED );
    if( unit.equal( per_numerator ) )
    {
      return per_denominator;
    }
    if( unit.equal( $const5$Unity ) )
    {
      return ConsesLow.list( $const22$PerFn, per_denominator, per_numerator );
    }
    if( NIL == per_fn_unit( unit ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      final SubLObject other_numerator = cycl_utilities.nat_arg1( unit, UNPROVIDED );
      final SubLObject other_denominator = cycl_utilities.nat_arg2( unit, UNPROVIDED );
      if( other_numerator.equal( per_numerator ) )
      {
        return ConsesLow.list( $const22$PerFn, per_denominator, other_denominator );
      }
      if( other_denominator.equal( per_denominator ) )
      {
        return ConsesLow.list( $const22$PerFn, other_numerator, per_numerator );
      }
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18839L)
  public static SubLObject complex_unit_sqrt(final SubLObject unit)
  {
    SubLObject v_answer = NIL;
    final SubLObject pred_var = $const21$multiplicationUnits;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( unit, THREE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( unit, THREE_INTEGER, pred_var );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw12$GAF, NIL, NIL );
            SubLObject done_var_$20 = v_answer;
            final SubLObject token_var_$21 = NIL;
            while ( NIL == done_var_$20)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$21 );
              final SubLObject valid_$22 = makeBoolean( !token_var_$21.eql( assertion ) );
              if( NIL != valid_$22 && assertions_high.gaf_arg1( assertion ).eql( assertions_high.gaf_arg2( assertion ) ) )
              {
                relation_evaluation.cyc_evaluate_note_support( assertion );
                v_answer = assertions_high.gaf_arg1( assertion );
              }
              done_var_$20 = makeBoolean( NIL == valid_$22 || NIL != v_answer );
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
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    if( NIL != v_answer )
    {
      return v_answer;
    }
    return relation_evaluation.throw_unevaluatable();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19261L)
  public static SubLObject per_fn_unit(final SubLObject unit)
  {
    if( NIL != term.hl_ground_nautP( unit ) || ( NIL != nart_handles.nart_p( unit ) && NIL != narts_high.nart_hl_formula( unit ) ) )
    {
      return Equality.eql( cycl_utilities.nat_function( unit ), $const22$PerFn );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19438L)
  public static SubLObject make_and_simplify_interval(final SubLObject unit, SubLObject min, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = min;
    }
    if( NIL != per_fn_unit( unit ) )
    {
      min = arithmetic.arithmetic_answer( min );
      max = arithmetic.arithmetic_answer( max );
      final SubLObject unit_numerator = cycl_utilities.nat_arg1( unit, UNPROVIDED );
      final SubLObject unit_denominator = cycl_utilities.nat_arg2( unit, UNPROVIDED );
      if( NIL != comparable_units( unit_numerator, unit_denominator ) )
      {
        return cyc_quotient( make_interval( unit_numerator, min, max ), make_interval( unit_denominator, ONE_INTEGER, UNPROVIDED ) );
      }
    }
    return make_interval( unit, min, max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19924L)
  public static SubLObject term_unify_with_units(SubLObject term1, final SubLObject term2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != variables.variable_p( term1 ) )
    {
      return unification_utilities.term_unify( term1, term2, UNPROVIDED, UNPROVIDED );
    }
    SubLObject current;
    final SubLObject datum = current = term1;
    SubLObject unit1 = NIL;
    SubLObject min1 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    unit1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    min1 = current.first();
    current = current.rest();
    SubLObject max1 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == max1 )
      {
        max1 = min1;
      }
      unit1 = czer_main.canonicalize_term( unit1, UNPROVIDED );
      SubLObject unit2 = NIL;
      SubLObject min2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( term2, term2, $list24 );
      unit2 = term2.first();
      SubLObject current_$24 = term2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$24, term2, $list24 );
      min2 = current_$24.first();
      current_$24 = current_$24.rest();
      SubLObject max2 = current_$24.isCons() ? current_$24.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current_$24, term2, $list24 );
      current_$24 = current_$24.rest();
      if( NIL == current_$24 )
      {
        if( NIL == max2 )
        {
          max2 = min2;
        }
        unit2 = czer_main.canonicalize_term( unit2, UNPROVIDED );
        if( NIL != variables.variable_p( unit1 ) || NIL != variables.variable_p( unit2 ) )
        {
          return unification_utilities.term_unify( ConsesLow.list( unit1, min1 ), ConsesLow.list( unit2, min2 ), UNPROVIDED, UNPROVIDED );
        }
        thread.resetMultipleValues();
        final SubLObject new_min2 = convert_to_units( unit1, unit2, min2, max2 );
        final SubLObject new_max2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( new_min2.isNumber() )
        {
          if( NIL != cycl_utilities.nat_with_functor_p( term1, $const5$Unity ) )
          {
            term1 = cycl_utilities.nat_arg1( term1, UNPROVIDED );
          }
          return unification_utilities.term_unify( term1, make_and_simplify_interval( unit1, new_min2, new_max2 ), UNPROVIDED, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( term2, $list24 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21350L)
  public static SubLObject cyc_integer_range(final SubLObject integer)
  {
    if( integer.isInteger() )
    {
      final SubLObject defn_collection = at_vars.defn_collection();
      if( NIL != forts.fort_p( defn_collection ) )
      {
        final SubLObject range_scalar = kb_mapping_utilities.fpred_value( defn_collection, $const26$integerRange, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != range_scalar )
        {
          return relation_evaluation.cyc_evaluate( el_utilities.make_binary_formula( $const27$quantitySubsumes, range_scalar, integer ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21805L)
  public static SubLObject cyc_number_range(final SubLObject number)
  {
    if( number.isNumber() )
    {
      final SubLObject defn_collection = at_vars.defn_collection();
      if( NIL != forts.fort_p( defn_collection ) )
      {
        final SubLObject range_scalar = kb_mapping_utilities.fpred_value( defn_collection, $const29$numberRange, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != range_scalar )
        {
          return relation_evaluation.cyc_evaluate( el_utilities.make_binary_formula( $const27$quantitySubsumes, range_scalar, number ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22200L)
  public static SubLObject cyc_plus_quantities(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject failureP = NIL;
    try
    {
      thread.throwStack.push( $kw6$UNEVALUATABLE );
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym30$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            v_answer = cyc_plus_quantities_int( interval1, interval2 );
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
        failureP = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      failureP = Errors.handleThrowable( ccatch_env_var, $kw6$UNEVALUATABLE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == failureP )
    {
      return v_answer;
    }
    if( NIL != list_utilities.tree_find_if( $sym31$FUZZY_NUMBER_, interval1, UNPROVIDED ) || NIL != list_utilities.tree_find_if( $sym31$FUZZY_NUMBER_, interval2, UNPROVIDED ) )
    {
      return el_utilities.make_binary_formula( $const32$PlusFn, interval1, interval2 );
    }
    return relation_evaluation.throw_unevaluatable();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23039L)
  public static SubLObject cyc_plus_quantities_int(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval1 ) && NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval2 ) )
    {
      ans = extended_numbers.possibly_infinite_or_extended_number_plus( interval1, interval2 );
    }
    else
    {
      if( ZERO_INTEGER.eql( interval1 ) && NIL != at_defns.quiet_has_typeP( interval2, $const33$IntervalOnNumberLine, UNPROVIDED ) )
      {
        return interval2;
      }
      if( ZERO_INTEGER.eql( interval2 ) && NIL != at_defns.quiet_has_typeP( interval1, $const33$IntervalOnNumberLine, UNPROVIDED ) )
      {
        return interval1;
      }
      thread.resetMultipleValues();
      final SubLObject unit1 = explode_interval( interval1 );
      final SubLObject min1 = thread.secondMultipleValue();
      final SubLObject max1 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject unit2 = explode_interval( interval2 );
      SubLObject min2 = thread.secondMultipleValue();
      SubLObject max2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == comparable_units( unit1, unit2 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      thread.resetMultipleValues();
      final SubLObject new_min2 = convert_to_units( unit1, unit2, min2, max2 );
      final SubLObject new_max2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      min2 = new_min2;
      max2 = new_max2;
      ans = make_interval( unit1, extended_numbers.possibly_infinite_or_extended_number_plus( min1, min2 ), extended_numbers.possibly_infinite_or_extended_number_plus( max1, max2 ) );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24644L)
  public static SubLObject cyc_minus_quantities(final SubLObject interval)
  {
    if( NIL != extended_numbers.extended_number_p( interval ) )
    {
      return extended_numbers.extended_number_negate( interval );
    }
    return arithmetic.cyc_times_internal( MINUS_ONE_INTEGER, interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24906L)
  public static SubLObject cyc_quantity_conversion(final SubLObject new_unit, final SubLObject interval)
  {
    final SubLObject result = convert_quantity( new_unit, interval );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25224L)
  public static SubLObject convert_quantity(final SubLObject new_unit, final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unit = explode_interval( interval );
    final SubLObject min = thread.secondMultipleValue();
    final SubLObject max = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == comparable_units( new_unit, unit ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject new_min = convert_to_units( new_unit, unit, min, max );
    final SubLObject new_max = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject ans = make_interval( new_unit, new_min, new_max );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25574L)
  public static SubLObject cyc_quantity_conversion_absolute(final SubLObject new_unit, final SubLObject interval)
  {
    final SubLObject result = convert_quantity_absolute( new_unit, interval );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25831L)
  public static SubLObject convert_quantity_absolute(final SubLObject new_unit, final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unit = explode_interval( interval );
    final SubLObject min = thread.secondMultipleValue();
    final SubLObject max = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == comparable_units( new_unit, unit ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject new_min = convert_to_units_absolute( new_unit, unit, min, max );
    final SubLObject new_max = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject ans = make_interval( new_unit, new_min, new_max );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26197L)
  public static SubLObject cycl_real_number_to_number(final SubLObject quantity)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( quantity ) )
    {
      return quantity;
    }
    thread.resetMultipleValues();
    final SubLObject unit = explode_interval( cyc_quantity_conversion( $const5$Unity, quantity ) );
    final SubLObject number_min = thread.secondMultipleValue();
    final SubLObject number_max = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == extended_numbers.possibly_infinite_or_extended_numberE( number_min, number_max ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return number_min;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26704L)
  public static SubLObject cyc_times_quantities(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject failureP = NIL;
    try
    {
      thread.throwStack.push( $kw6$UNEVALUATABLE );
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym30$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            v_answer = cyc_times_quantities_int( interval1, interval2 );
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
        failureP = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      failureP = Errors.handleThrowable( ccatch_env_var, $kw6$UNEVALUATABLE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == failureP )
    {
      return v_answer;
    }
    if( NIL != collection_defns.fractionP( interval1, UNPROVIDED ) && interval2.isInteger() )
    {
      if( NIL != collection_defns.simple_fractionP( interval1, UNPROVIDED ) || NIL != collection_defns.decimal_fractionP( interval1, UNPROVIDED ) )
      {
        return el_utilities.replace_formula_arg( ONE_INTEGER, Numbers.multiply( interval2, cycl_utilities.nat_arg1( interval1, UNPROVIDED ) ), interval1 );
      }
      if( NIL != collection_defns.mixed_fractionP( interval1, UNPROVIDED ) )
      {
        return convert_simple_fraction_to_mixed_fraction( cyc_times_quantities( convert_mixed_fraction_to_simple_fraction( interval1 ), interval2 ) );
      }
      if( NIL != collection_defns.negative_mixed_fractionP( interval1, UNPROVIDED ) )
      {
        return convert_simple_fraction_to_mixed_fraction( cyc_times_quantities( convert_fraction_to_simple_fraction( interval1 ), interval2 ) );
      }
    }
    else
    {
      if( interval1.isInteger() && NIL != collection_defns.fractionP( interval2, UNPROVIDED ) )
      {
        return cyc_times_quantities( interval2, interval1 );
      }
      if( NIL != list_utilities.tree_find_if( $sym31$FUZZY_NUMBER_, interval1, UNPROVIDED ) || NIL != list_utilities.tree_find_if( $sym31$FUZZY_NUMBER_, interval2, UNPROVIDED ) )
      {
        return el_utilities.make_binary_formula( $const36$TimesFn, interval1, interval2 );
      }
    }
    return relation_evaluation.throw_unevaluatable();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28242L)
  public static SubLObject cyc_times_quantities_int(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval1 ) && NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval2 ) )
    {
      ans = extended_numbers.possibly_infinite_or_extended_number_times( interval1, interval2 );
    }
    else if( NIL != extended_numbers.extended_number_p( interval1 ) )
    {
      thread.resetMultipleValues();
      final SubLObject unit2 = explode_interval( interval2 );
      final SubLObject min2 = thread.secondMultipleValue();
      final SubLObject max2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == extended_numbers.possibly_infinite_or_extended_number_p( min2 ) || NIL == extended_numbers.possibly_infinite_or_extended_number_p( max2 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      if( NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p( interval1 ) )
      {
        ans = make_interval( unit2, extended_numbers.possibly_infinite_or_extended_number_times( interval1, max2 ), extended_numbers.possibly_infinite_or_extended_number_times( interval1, min2 ) );
      }
      else
      {
        ans = make_interval( unit2, extended_numbers.possibly_infinite_or_extended_number_times( interval1, min2 ), extended_numbers.possibly_infinite_or_extended_number_times( interval1, max2 ) );
      }
    }
    else if( NIL != extended_numbers.extended_number_p( interval2 ) )
    {
      thread.resetMultipleValues();
      final SubLObject unit3 = explode_interval( interval1 );
      final SubLObject min3 = thread.secondMultipleValue();
      final SubLObject max3 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == extended_numbers.possibly_infinite_or_extended_number_p( min3 ) || NIL == extended_numbers.possibly_infinite_or_extended_number_p( max3 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      if( NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p( interval2 ) )
      {
        ans = make_interval( unit3, extended_numbers.possibly_infinite_or_extended_number_times( interval2, max3 ), extended_numbers.possibly_infinite_or_extended_number_times( interval2, min3 ) );
      }
      else
      {
        ans = make_interval( unit3, extended_numbers.possibly_infinite_or_extended_number_times( interval2, min3 ), extended_numbers.possibly_infinite_or_extended_number_times( interval2, max3 ) );
      }
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit3 = explode_interval( interval1 );
      final SubLObject min3 = thread.secondMultipleValue();
      final SubLObject max3 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject unit4 = explode_interval( interval2 );
      final SubLObject min4 = thread.secondMultipleValue();
      final SubLObject max4 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == extended_numbers.possibly_infinite_or_extended_number_p( min3 ) || NIL == extended_numbers.possibly_infinite_or_extended_number_p( min4 ) || NIL == extended_numbers
          .possibly_infinite_or_extended_number_p( max3 ) || NIL == extended_numbers.possibly_infinite_or_extended_number_p( max4 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      final SubLObject result_unit = unit_times( unit3, unit4 );
      final SubLObject min1min2 = extended_numbers.possibly_infinite_or_extended_number_times( min3, min4 );
      final SubLObject min1max2 = extended_numbers.possibly_infinite_or_extended_number_times( min3, max4 );
      final SubLObject max1min2 = extended_numbers.possibly_infinite_or_extended_number_times( max3, min4 );
      final SubLObject max1max2 = extended_numbers.possibly_infinite_or_extended_number_times( max3, max4 );
      final SubLObject result_min = extended_numbers.possibly_infinite_or_extended_number_min( ConsesLow.list( min1min2, min1max2, max1min2, max1max2 ) );
      final SubLObject result_max = extended_numbers.possibly_infinite_or_extended_number_max( ConsesLow.list( min1min2, min1max2, max1min2, max1max2 ) );
      ans = make_and_simplify_interval( result_unit, result_min, result_max );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31052L)
  public static SubLObject fuzzy_numberP(final SubLObject v_term)
  {
    if( NIL != extended_numbers.cyc_infinite_number_p( v_term ) )
    {
      return NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return makeBoolean( NIL != isa.isaP( v_term, $const37$IntegerExtent, UNPROVIDED, UNPROVIDED ) && ( NIL == max_quant_value( v_term, UNPROVIDED ) || NIL == min_quant_value( v_term, UNPROVIDED ) ) );
    }
    if( NIL != term.nautP( v_term, UNPROVIDED ) )
    {
      return makeBoolean( NIL != isa.isaP( v_term, $const37$IntegerExtent, UNPROVIDED, UNPROVIDED ) && NIL == isa.isaP( v_term, $const38$ScalarPointValue, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31498L)
  public static SubLObject cyc_quotient(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject ans = NIL;
          if( NIL != extended_numbers.extended_number_p( interval2 ) && NIL != extended_numbers.extended_number_zero_p( interval2 ) )
          {
            relation_evaluation.throw_unevaluatable();
          }
          else if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval2 ) && NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval1 ) )
          {
            if( NIL != scientific_numbers.scientific_number_p( interval1 ) || NIL != scientific_numbers.scientific_number_p( interval2 ) )
            {
              SubLObject ignore_errors_tag_$25 = NIL;
              try
              {
                thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
                final SubLObject _prev_bind_0_$26 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
                  try
                  {
                    return extended_numbers.extended_number_quotient( interval1, interval2 );
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0_$26, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                ignore_errors_tag_$25 = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
              }
              finally
              {
                thread.throwStack.pop();
              }
              relation_evaluation.throw_unevaluatable();
            }
            else if( NIL != extended_numbers.extended_number_p( interval2 ) && NIL != extended_numbers.extended_numberE( interval2, ONE_INTEGER, UNPROVIDED ) )
            {
              ans = interval1;
            }
            else if( NIL != extended_numbers.extended_number_p( interval1 ) && NIL != extended_numbers.extended_number_p( interval2 ) && NIL != extended_numbers.extended_numberE( interval1, interval2, UNPROVIDED ) )
            {
              ans = ONE_INTEGER;
            }
            else
            {
              ans = extended_numbers.possibly_infinite_or_extended_number_quotient( interval1, interval2 );
            }
          }
          else if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval2 ) )
          {
            thread.resetMultipleValues();
            final SubLObject unit1 = explode_interval( interval1 );
            final SubLObject min1 = thread.secondMultipleValue();
            final SubLObject max1 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            ans = make_interval( unit1, extended_numbers.possibly_infinite_or_extended_number_quotient( min1, interval2 ), extended_numbers.possibly_infinite_or_extended_number_quotient( max1, interval2 ) );
          }
          else
          {
            thread.resetMultipleValues();
            final SubLObject unit2 = explode_interval( interval2 );
            final SubLObject min2 = thread.secondMultipleValue();
            final SubLObject max2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL == extended_numbers.possibly_infinite_or_extended_number_minus_p( max2 ) && NIL == extended_numbers.possibly_infinite_or_extended_number_plus_p( min2 ) )
            {
              relation_evaluation.throw_unevaluatable();
            }
            thread.resetMultipleValues();
            SubLObject unit3 = explode_interval( interval1 );
            SubLObject min3 = thread.secondMultipleValue();
            SubLObject max3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL != comparable_units( unit3, unit2 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_min1 = convert_to_units( unit2, unit3, min3, max3 );
              final SubLObject new_max1 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              unit3 = unit2;
              min3 = new_min1;
              max3 = new_max1;
            }
            final SubLObject result_unit = unit_quotient( unit3, unit2 );
            final SubLObject min1min2 = extended_numbers.possibly_infinite_or_extended_number_quotient( min3, min2 );
            final SubLObject min1max2 = extended_numbers.possibly_infinite_or_extended_number_quotient( min3, max2 );
            final SubLObject max1min2 = extended_numbers.possibly_infinite_or_extended_number_quotient( max3, min2 );
            final SubLObject max1max2 = extended_numbers.possibly_infinite_or_extended_number_quotient( max3, max2 );
            final SubLObject result_min = extended_numbers.possibly_infinite_or_extended_number_min( ConsesLow.list( min1min2, min1max2, max1min2, max1max2 ) );
            final SubLObject result_max = extended_numbers.possibly_infinite_or_extended_number_max( ConsesLow.list( min1min2, min1max2, max1min2, max1max2 ) );
            ans = make_and_simplify_interval( result_unit, arithmetic.arithmetic_answer( result_min ), arithmetic.arithmetic_answer( result_max ) );
          }
          return ans;
        }
        catch( final Throwable catch_var2 )
        {
          Errors.handleThrowable( catch_var2, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34311L)
  public static SubLObject cyc_inverse(final SubLObject interval)
  {
    return cyc_quotient( ONE_INTEGER, interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34597L)
  public static SubLObject cyc_modulo(final SubLObject interval1, final SubLObject base)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject ans = NIL;
          if( NIL != extended_numbers.extended_number_p( base ) && NIL != extended_numbers.extended_number_zero_p( base ) )
          {
            relation_evaluation.throw_unevaluatable();
          }
          else if( NIL != extended_numbers.extended_number_p( base ) && NIL != extended_numbers.extended_number_p( interval1 ) )
          {
            ans = extended_numbers.extended_number_modulo( interval1, base );
          }
          else
          {
            thread.resetMultipleValues();
            final SubLObject unit2 = explode_interval( base );
            final SubLObject min2 = thread.secondMultipleValue();
            final SubLObject max2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL == extended_numbers.extended_numberE( min2, max2, UNPROVIDED ) )
            {
              relation_evaluation.throw_unevaluatable();
            }
            if( min2.isZero() )
            {
              relation_evaluation.throw_unevaluatable();
            }
            thread.resetMultipleValues();
            final SubLObject unit3 = explode_interval( interval1 );
            final SubLObject min3 = thread.secondMultipleValue();
            final SubLObject max3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL == extended_numbers.extended_numberE( min3, max3, UNPROVIDED ) )
            {
              relation_evaluation.throw_unevaluatable();
            }
            if( NIL == comparable_units( unit3, unit2 ) )
            {
              relation_evaluation.throw_unevaluatable();
            }
            final SubLObject converted_min1 = convert_to_units( unit2, unit3, min3, UNPROVIDED );
            final SubLObject result_unit = unit2;
            final SubLObject result_min = extended_numbers.extended_number_modulo( converted_min1, min2 );
            ans = make_and_simplify_interval( result_unit, result_min, UNPROVIDED );
          }
          return arithmetic.arithmetic_answer( ans );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36061L)
  public static SubLObject sanity_check_cyc_modulo(final SubLObject interval1, final SubLObject base, final SubLObject ans)
  {
    if( interval1.isNumber() && base.isNumber() )
    {
      return T;
    }
    if( NIL != scientific_numbers.scientific_number_p( interval1 ) || NIL != scientific_numbers.scientific_number_p( base ) )
    {
      return T;
    }
    final SubLObject subl_ans = cyc_modulo( extended_numbers.extended_number_to_subl_real( interval1 ), extended_numbers.extended_number_to_subl_real( base ) );
    final SubLObject sigdigs = ONE_INTEGER;
    SubLObject saneP = T;
    if( NIL != extended_numbers.extended_number_zero_p( ans ) )
    {
      saneP = makeBoolean( ans.numG( MINUS_ONE_INTEGER ) && ans.numL( ONE_INTEGER ) );
    }
    else if( !extended_numbers.extended_number_plus_p( ans ).eql( Numbers.plusp( subl_ans ) ) )
    {
      saneP = NIL;
    }
    else
    {
      saneP = extended_numbers.extended_numberE( number_utilities.significant_digits( extended_numbers.extended_number_to_subl_real( ans ), sigdigs ), number_utilities.significant_digits( subl_ans, sigdigs ),
          UNPROVIDED );
    }
    if( NIL == saneP )
    {
      Errors.sublisp_break( $str44$Got__S___Wanted__S, new SubLObject[] { number_utilities.significant_digits( extended_numbers.extended_number_to_subl_real( ans ), sigdigs ), number_utilities.significant_digits(
          subl_ans, sigdigs )
      } );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36961L)
  public static SubLObject cyc_residue(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unit = explode_interval( interval );
    final SubLObject min = thread.secondMultipleValue();
    final SubLObject max = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == unit )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject measure_types = unit_of_measure_type( unit );
    if( NIL == measure_types )
    {
      relation_evaluation.throw_unevaluatable();
    }
    SubLObject new_min = NIL;
    SubLObject new_max = NIL;
    if( NIL == new_min )
    {
      SubLObject csome_list_var = measure_types;
      SubLObject measure_type = NIL;
      measure_type = csome_list_var.first();
      while ( NIL == new_min && NIL != csome_list_var)
      {
        if( NIL == new_min )
        {
          SubLObject csome_list_var_$27 = quantity_congruence_base( measure_type );
          SubLObject base = NIL;
          base = csome_list_var_$27.first();
          while ( NIL == new_min && NIL != csome_list_var_$27)
          {
            thread.resetMultipleValues();
            final SubLObject base_unit = explode_interval( base );
            final SubLObject base_min = thread.secondMultipleValue();
            final SubLObject base_max = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( base_min.numE( base_max ) && NIL != comparable_units( unit, base_unit ) )
            {
              final SubLObject converted_base_value = convert_to_units( unit, base_unit, base_min, UNPROVIDED );
              new_min = Numbers.mod( min, converted_base_value );
              new_max = Numbers.add( new_min, Numbers.subtract( max, min ) );
            }
            csome_list_var_$27 = csome_list_var_$27.rest();
            base = csome_list_var_$27.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        measure_type = csome_list_var.first();
      }
    }
    return make_interval( unit, ( NIL != new_min ) ? new_min : min, ( NIL != new_max ) ? new_max : max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37877L)
  public static SubLObject quantity_congruence_base(final SubLObject quantity_type)
  {
    return kb_mapping_utilities.pred_values( quantity_type, $const46$quantityCongruenceBase, TWO_INTEGER, ONE_INTEGER, $kw47$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38007L)
  public static SubLObject unit_of_measure_type(final SubLObject unit)
  {
    SubLObject types = NIL;
    SubLObject cdolist_list_var = kb_accessors.result_isa( unit, UNPROVIDED );
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != at_defns.quiet_has_typeP( type, $const48$MeasurableQuantityType, UNPROVIDED ) )
      {
        types = ConsesLow.cons( type, types );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return Sequences.nreverse( types );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38218L)
  public static SubLObject cyc_absolute_value(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject ans = NIL;
          if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval ) )
          {
            ans = extended_numbers.possibly_infinite_or_extended_number_abs( interval );
          }
          else
          {
            thread.resetMultipleValues();
            final SubLObject unit = explode_interval( interval );
            final SubLObject min = thread.secondMultipleValue();
            final SubLObject max = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject min_abs = extended_numbers.possibly_infinite_or_extended_number_abs( min );
            final SubLObject max_abs = extended_numbers.possibly_infinite_or_extended_number_abs( max );
            SubLObject result_min = extended_numbers.possibly_infinite_or_extended_number_min( ConsesLow.list( min_abs, max_abs ) );
            final SubLObject result_max = extended_numbers.possibly_infinite_or_extended_number_max( ConsesLow.list( min_abs, max_abs ) );
            if( NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p( min ) && NIL != extended_numbers.possibly_infinite_or_extended_number_plus_p( max ) )
            {
              result_min = ZERO_INTEGER;
            }
            ans = make_interval( unit, result_min, result_max );
          }
          return ans;
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39174L)
  public static SubLObject cyc_sqrt(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval ) && NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p( interval ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    else if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            return extended_numbers.possibly_infinite_or_extended_number_sqrt( interval );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit = explode_interval( interval );
      final SubLObject min = thread.secondMultipleValue();
      final SubLObject max = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p( min ) || NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p( max ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      SubLObject ignore_errors_tag2 = NIL;
      try
      {
        thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject result_unit = unit_sqrt( unit );
            final SubLObject min_sqrt = extended_numbers.possibly_infinite_or_extended_number_sqrt( min );
            final SubLObject max_sqrt = extended_numbers.possibly_infinite_or_extended_number_sqrt( max );
            return make_interval( result_unit, min_sqrt, max_sqrt );
          }
          catch( final Throwable catch_var2 )
          {
            Errors.handleThrowable( catch_var2, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_2, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        ignore_errors_tag2 = Errors.handleThrowable( ccatch_env_var2, $kw39$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40266L)
  public static SubLObject cyc_squared(final SubLObject interval)
  {
    return arithmetic.cyc_times_internal( interval, interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40504L)
  public static SubLObject cyc_percent(final SubLObject args)
  {
    SubLObject ans = NIL;
    if( NIL == list_utilities.lengthGE( args, ONE_INTEGER, UNPROVIDED ) || NIL == list_utilities.lengthLE( args, TWO_INTEGER, UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    SubLObject min = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list52 );
    min = args.first();
    SubLObject current = args.rest();
    final SubLObject max = current.isCons() ? current.first() : min;
    cdestructuring_bind.destructuring_bind_must_listp( current, args, $list52 );
    current = current.rest();
    if( NIL == current )
    {
      if( !min.isNumber() || !max.isNumber() )
      {
        relation_evaluation.throw_unevaluatable();
      }
      final SubLObject min_scaled = Numbers.divide( min, $int53$100 );
      final SubLObject max_scaled = Numbers.divide( max, $int53$100 );
      ans = make_interval( $const5$Unity, arithmetic.arithmetic_answer( min_scaled ), arithmetic.arithmetic_answer( max_scaled ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list52 );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41109L)
  public static SubLObject cyc_round_up(final SubLObject interval)
  {
    return cyc_round_internal( interval, $sym55$CEILING, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41350L)
  public static SubLObject cyc_round_closest(final SubLObject interval)
  {
    return cyc_round_internal( interval, $sym57$ROUND, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41490L)
  public static SubLObject cyc_round_down(final SubLObject interval)
  {
    return cyc_round_internal( interval, $sym59$FLOOR, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41624L)
  public static SubLObject cyc_round_truncate(final SubLObject interval)
  {
    return cyc_round_internal( interval, $sym61$TRUNCATE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41764L)
  public static SubLObject cyc_round_internal(final SubLObject interval, final SubLObject rounding_func, SubLObject seen)
  {
    if( seen == UNPROVIDED )
    {
      seen = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject ans = NIL;
          if( NIL != subl_promotions.memberP( interval, seen, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
          {
            relation_evaluation.throw_unevaluatable();
          }
          else if( interval.isNumber() )
          {
            ans = Functions.funcall( rounding_func, interval );
          }
          else
          {
            if( NIL != extended_numbers.extended_number_p( interval ) && NIL != extended_numbers.extended_number_integer_p( interval ) )
            {
              return interval;
            }
            if( NIL != scientific_numbers.scientific_number_p( interval ) )
            {
              final SubLObject digits = scientific_numbers.scientific_number_significant_digit_count( interval );
              return scientific_numbers.scientific_number_from_subl_real( cyc_round_internal( scientific_numbers.scientific_number_to_subl_real( interval ), rounding_func, ConsesLow.cons( interval, seen ) ), digits );
            }
            if( NIL != collection_defns.fractionP( interval, UNPROVIDED ) )
            {
              ans = extended_numbers.fraction_or_number_to_el( cyc_round_internal( math_expression_utilities.fraction_from_el( interval ), rounding_func, ConsesLow.cons( interval, seen ) ) );
            }
            else if( NIL != fraction_utilities.fraction_p( interval ) )
            {
              ans = cyc_round_internal( fraction_utilities.fraction_to_number( interval ), rounding_func, ConsesLow.cons( interval, seen ) );
            }
            else
            {
              thread.resetMultipleValues();
              final SubLObject unit = explode_interval( interval );
              final SubLObject min = thread.secondMultipleValue();
              final SubLObject max = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              final SubLObject min_round = cyc_round_internal( min, rounding_func, ConsesLow.cons( interval, seen ) );
              final SubLObject max_round = cyc_round_internal( max, rounding_func, ConsesLow.cons( interval, seen ) );
              ans = make_interval( unit, min_round, max_round );
            }
          }
          return ans;
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43260L)
  public static SubLObject round_to_nth_decimal(final SubLObject number, SubLObject decimal)
  {
    if( decimal == UNPROVIDED )
    {
      decimal = $round_nth_n$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.numberp( number ) : number;
    assert NIL != subl_promotions.non_negative_integer_p( decimal ) : decimal;
    final SubLObject decimal_pos = Sequences.position( Characters.CHAR_period, string_utilities.to_string( number ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject current_decimal_places = ( NIL != decimal_pos ) ? number_utilities.f_1_( Numbers.subtract( Sequences.length( string_utilities.to_string( number ) ), decimal_pos ) ) : ZERO_INTEGER;
    if( current_decimal_places.numLE( decimal ) )
    {
      decimal = current_decimal_places;
    }
    if( decimal.isZero() )
    {
      return Numbers.round( number, UNPROVIDED );
    }
    final SubLObject scale = number_utilities.expt10( decimal );
    final SubLObject significand = Numbers.round( Numbers.multiply( number, scale ), UNPROVIDED );
    return ( $kw66$CYCL.eql( $round_nth_output_format$.getDynamicValue( thread ) ) && NIL != kb_control_vars.fraction_kb_loaded_p() ) ? el_utilities.make_binary_formula( $const67$DecimalFractionFn, significand, decimal )
        : Numbers.divide( significand, scale );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44125L)
  public static SubLObject cyc_round_closest_to_nth_decimal(final SubLObject interval, final SubLObject limit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject _prev_bind_0_$28 = $round_nth_n$.currentBinding( thread );
          final SubLObject _prev_bind_2 = $round_nth_output_format$.currentBinding( thread );
          try
          {
            $round_nth_n$.bind( limit, thread );
            $round_nth_output_format$.bind( $kw66$CYCL, thread );
            return cyc_round_internal( interval, $sym68$ROUND_TO_NTH_DECIMAL, UNPROVIDED );
          }
          finally
          {
            $round_nth_output_format$.rebind( _prev_bind_2, thread );
            $round_nth_n$.rebind( _prev_bind_0_$28, thread );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44432L)
  public static SubLObject cyc_max_range(final SubLObject args)
  {
    if( NIL == args )
    {
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    if( NIL != list_utilities.singletonP( args ) )
    {
      return args.first();
    }
    return arithmetic.quantity_reduce( Symbols.symbol_function( $sym70$CYC_MAX_RANGE_INTERNAL ), NIL, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44764L)
  public static SubLObject cyc_max_range_internal(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval1 ) && NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval2 ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject min = extended_numbers.possibly_infinite_or_extended_number_min( ConsesLow.list( interval1, interval2 ) );
            final SubLObject max = extended_numbers.possibly_infinite_or_extended_number_max( ConsesLow.list( interval1, interval2 ) );
            return make_interval( $const5$Unity, min, max );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit1 = explode_interval( interval1 );
      final SubLObject min2 = thread.secondMultipleValue();
      final SubLObject max2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject unit2 = explode_interval( interval2 );
      SubLObject min3 = thread.secondMultipleValue();
      SubLObject max3 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == comparable_units( unit1, unit2 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      thread.resetMultipleValues();
      final SubLObject new_min2 = convert_to_units( unit1, unit2, min3, max3 );
      final SubLObject new_max2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      min3 = new_min2;
      max3 = new_max2;
      SubLObject ignore_errors_tag2 = NIL;
      try
      {
        thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject ans_min = extended_numbers.possibly_infinite_or_extended_number_min( ConsesLow.list( min2, min3 ) );
            final SubLObject ans_max = extended_numbers.possibly_infinite_or_extended_number_max( ConsesLow.list( max2, max3 ) );
            return make_interval( unit1, ans_min, ans_max );
          }
          catch( final Throwable catch_var2 )
          {
            Errors.handleThrowable( catch_var2, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_2, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        ignore_errors_tag2 = Errors.handleThrowable( ccatch_env_var2, $kw39$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45834L)
  public static SubLObject cyc_min_range(final SubLObject args)
  {
    if( NIL == args )
    {
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    if( NIL != list_utilities.singletonP( args ) )
    {
      return args.first();
    }
    return arithmetic.quantity_reduce( Symbols.symbol_function( $sym72$CYC_MIN_RANGE_INTERNAL ), NIL, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46166L)
  public static SubLObject cyc_min_range_internal(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval1 ) && NIL != extended_numbers.possibly_infinite_or_extended_number_p( interval2 ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            if( NIL != extended_numbers.possibly_infinite_or_extended_numberE( interval1, interval2 ) )
            {
              return arithmetic.arithmetic_answer( interval1 );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit1 = explode_interval( interval1 );
      final SubLObject min1 = thread.secondMultipleValue();
      final SubLObject max1 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject unit2 = explode_interval( interval2 );
      SubLObject min2 = thread.secondMultipleValue();
      SubLObject max2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == comparable_units( unit1, unit2 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      thread.resetMultipleValues();
      final SubLObject new_min2 = convert_to_units( unit1, unit2, min2, max2 );
      final SubLObject new_max2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      min2 = new_min2;
      max2 = new_max2;
      final SubLObject ans_min = extended_numbers.possibly_infinite_or_extended_number_max( ConsesLow.list( min1, min2 ) );
      final SubLObject ans_max = extended_numbers.possibly_infinite_or_extended_number_min( ConsesLow.list( max1, max2 ) );
      if( NIL != extended_numbers.possibly_infinite_or_extended_numberLE( ans_min, ans_max ) )
      {
        ans = make_interval( unit1, ans_min, ans_max );
      }
      else
      {
        relation_evaluation.throw_unevaluatable();
      }
    }
    return arithmetic.arithmetic_answer( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47278L)
  public static SubLObject cyc_min_quant_value(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( interval.isNumber() || NIL != collection_defns.fractionP( interval, UNPROVIDED ) )
    {
      ans = interval;
    }
    else if( NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p( interval ) || NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p( interval ) || NIL != collection_defns
        .cyc_fractional_measurable_quantity_decimal_p( interval ) )
    {
      ans = cycl_utilities.naut_arg1( interval, UNPROVIDED );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit = explode_interval( interval );
      final SubLObject min = thread.secondMultipleValue();
      final SubLObject max = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      ans = make_interval( unit, min, UNPROVIDED );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47972L)
  public static SubLObject cyc_max_quant_value(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( interval.isNumber() || NIL != collection_defns.fractionP( interval, UNPROVIDED ) )
    {
      ans = interval;
    }
    else if( NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p( interval ) || NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p( interval ) || NIL != collection_defns
        .cyc_fractional_measurable_quantity_decimal_p( interval ) )
    {
      ans = cycl_utilities.naut_arg1( interval, UNPROVIDED );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit = explode_interval( interval );
      final SubLObject min = thread.secondMultipleValue();
      final SubLObject max = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      ans = make_interval( unit, max, UNPROVIDED );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48581L)
  public static SubLObject cyc_quantity_unit(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( interval.isNumber() || NIL != collection_defns.fractionP( interval, UNPROVIDED ) )
    {
      return $const5$Unity;
    }
    if( NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p( interval ) || NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p( interval ) || NIL != collection_defns
        .cyc_fractional_measurable_quantity_decimal_p( interval ) )
    {
      return cycl_utilities.naut_functor( interval );
    }
    thread.resetMultipleValues();
    final SubLObject unit = explode_interval( interval );
    final SubLObject min = thread.secondMultipleValue();
    final SubLObject max = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return unit;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49317L)
  public static SubLObject cyc_quantity_measure(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( interval.isNumber() || NIL != collection_defns.fractionP( interval, UNPROVIDED ) )
    {
      ans = interval;
    }
    else if( NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p( interval ) || NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p( interval ) || NIL != collection_defns
        .cyc_fractional_measurable_quantity_decimal_p( interval ) )
    {
      ans = cycl_utilities.naut_arg1( interval, UNPROVIDED );
    }
    else
    {
      thread.resetMultipleValues();
      SubLObject unit = explode_interval( interval );
      final SubLObject min = thread.secondMultipleValue();
      final SubLObject max = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      unit = $const5$Unity;
      ans = make_interval( $const5$Unity, min, max );
    }
    return arithmetic.arithmetic_answer( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50106L)
  public static SubLObject cyc_tolerance(final SubLObject interval, final SubLObject fraction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != extended_numbers.extended_number_p( interval ) )
    {
      ans = cyc_tolerance_internal( fraction, $const5$Unity, interval, interval, interval );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit = explode_interval( interval );
      final SubLObject min = thread.secondMultipleValue();
      final SubLObject max = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject average = extended_numbers.extended_number_quotient( extended_numbers.extended_number_plus( min, max ), TWO_INTEGER );
      ans = cyc_tolerance_internal( fraction, unit, min, average, max );
    }
    return arithmetic.arithmetic_answer( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50672L)
  public static SubLObject cyc_tolerance_internal(final SubLObject fraction, final SubLObject unit, final SubLObject min, final SubLObject average, final SubLObject max)
  {
    final SubLObject delta = extended_numbers.extended_number_abs( extended_numbers.extended_number_times( average, fraction ) );
    final SubLObject ans_min = extended_numbers.extended_number_minus( min, delta );
    final SubLObject ans_max = extended_numbers.extended_number_plus( max, delta );
    return make_interval( unit, ans_min, ans_max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50979L)
  public static SubLObject cyc_significant_digits(SubLObject digits, final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          digits = cycl_real_number_to_number( digits );
          if( NIL == subl_promotions.positive_integer_p( digits ) )
          {
            relation_evaluation.throw_unevaluatable();
          }
          thread.resetMultipleValues();
          final SubLObject unit = explode_interval( interval );
          SubLObject min = thread.secondMultipleValue();
          SubLObject max = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          min = number_utilities.significant_digits( min, digits );
          max = number_utilities.significant_digits( max, digits );
          final SubLObject v_answer = make_interval( unit, min, max );
          return v_answer;
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51571L)
  public static SubLObject cyc_sine(final SubLObject interval)
  {
    return cyc_trig_internal( $sym80$SIN, interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51773L)
  public static SubLObject cyc_cosine(final SubLObject interval)
  {
    return cyc_trig_internal( $sym82$COS, interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51897L)
  public static SubLObject cyc_tangent(final SubLObject interval)
  {
    return cyc_trig_internal( $sym84$TAN, interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52070L)
  public static SubLObject cyc_cosecant(final SubLObject interval)
  {
    return cyc_inverse( cyc_sine( interval ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52314L)
  public static SubLObject cyc_secant(final SubLObject interval)
  {
    return cyc_inverse( cyc_cosine( interval ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52555L)
  public static SubLObject cyc_cotangent(final SubLObject interval)
  {
    return cyc_inverse( cyc_tangent( interval ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52811L)
  public static SubLObject cyc_trig_internal(final SubLObject trig_func, final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unit = explode_interval( cyc_quantity_conversion( $const89$Radian, interval ) );
    final SubLObject min = thread.secondMultipleValue();
    final SubLObject max = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( !min.numE( max ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = Functions.funcall( trig_func, min );
    return arithmetic.arithmetic_answer( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53148L)
  public static SubLObject cyc_arc_sine(final SubLObject number)
  {
    return cyc_inverse_trig_internal( $sym90$ASIN, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53385L)
  public static SubLObject cyc_arc_cosine(final SubLObject number)
  {
    return cyc_inverse_trig_internal( $sym92$ACOS, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53521L)
  public static SubLObject cyc_arc_tangent(final SubLObject number)
  {
    return cyc_inverse_trig_internal( $sym94$ATAN, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53659L)
  public static SubLObject cyc_arc_cosecant(final SubLObject number)
  {
    return cyc_arc_sine( cyc_inverse( number ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53922L)
  public static SubLObject cyc_arc_secant(final SubLObject number)
  {
    return cyc_arc_cosine( cyc_inverse( number ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54182L)
  public static SubLObject cyc_arc_cotangent(final SubLObject number)
  {
    return cyc_arc_tangent( cyc_inverse( number ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54456L)
  public static SubLObject cyc_inverse_trig_internal(final SubLObject inverse_trig_func, final SubLObject number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    SubLObject result = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym30$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          result = Functions.funcall( inverse_trig_func, number );
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
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject ans = make_interval( $const89$Radian, result, result );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54799L)
  public static SubLObject cyc_logarithm(SubLObject number, SubLObject base)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    number = cycl_real_number_to_number( number );
    base = cycl_real_number_to_number( base );
    if( NIL == extended_numbers.possibly_infinite_or_extended_number_plus_p( number ) || NIL == extended_numbers.extended_number_non_negative_p( base ) || NIL != extended_numbers.extended_numberE( base, ONE_INTEGER,
        UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    SubLObject result = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          result = extended_numbers.possibly_infinite_or_extended_number_log( number, base );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == extended_numbers.possibly_infinite_or_extended_number_p( result ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return arithmetic.arithmetic_answer( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55488L)
  public static SubLObject cyc_exponent(SubLObject number, SubLObject exponent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    number = cycl_real_number_to_number( number );
    exponent = cycl_real_number_to_number( exponent );
    SubLObject result = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          result = extended_numbers.possibly_infinite_or_extended_number_expt( number, exponent );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == extended_numbers.possibly_infinite_or_extended_number_p( result ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return arithmetic.arithmetic_answer( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55940L)
  public static SubLObject cyc_quadratic_solution_positive(SubLObject arg_a, SubLObject arg_b, SubLObject arg_c)
  {
    arg_a = cycl_real_number_to_number( arg_a );
    arg_b = cycl_real_number_to_number( arg_b );
    arg_c = cycl_real_number_to_number( arg_c );
    final SubLObject delta = extended_numbers.extended_number_minus( extended_numbers.extended_number_expt( arg_b, TWO_INTEGER ), extended_numbers.extended_number_times( FOUR_INTEGER, extended_numbers
        .extended_number_times( arg_a, arg_c ) ) );
    if( NIL != extended_numbers.extended_number_zero_p( arg_a ) || NIL != extended_numbers.extended_number_minus_p( delta ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return arithmetic.arithmetic_answer( extended_numbers.extended_number_quotient( extended_numbers.extended_number_plus( extended_numbers.extended_number_negate( arg_b ), extended_numbers.extended_number_sqrt(
        delta ) ), extended_numbers.extended_number_times( TWO_INTEGER, arg_a ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57135L)
  public static SubLObject cyc_quadratic_solution_negative(SubLObject arg_a, SubLObject arg_b, SubLObject arg_c)
  {
    arg_a = cycl_real_number_to_number( arg_a );
    arg_b = cycl_real_number_to_number( arg_b );
    arg_c = cycl_real_number_to_number( arg_c );
    final SubLObject delta = extended_numbers.extended_number_minus( extended_numbers.extended_number_expt( arg_b, TWO_INTEGER ), extended_numbers.extended_number_times( FOUR_INTEGER, extended_numbers
        .extended_number_times( arg_a, arg_c ) ) );
    if( NIL != extended_numbers.extended_number_zero_p( arg_a ) || NIL != extended_numbers.extended_number_minus_p( delta ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return arithmetic.arithmetic_answer( extended_numbers.extended_number_quotient( extended_numbers.extended_number_minus( extended_numbers.extended_number_negate( arg_b ), extended_numbers.extended_number_sqrt(
        delta ) ), extended_numbers.extended_number_times( TWO_INTEGER, arg_a ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58241L)
  public static SubLObject cyc_collection_subsumption_paths(final SubLObject el_set)
  {
    if( NIL == el_utilities.el_set_p( el_set ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject cols = evaluate_set_elements( el_set, $kw103$HL );
    final SubLObject paths = kb_utilities.collection_subsumption_paths( cols );
    final SubLObject el_paths = Mapping.mapcar( $sym104$MAKE_EL_LIST, paths );
    return el_utilities.make_el_set( el_paths, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58641L)
  public static SubLObject cyc_predicate_subsumption_paths(final SubLObject el_set)
  {
    if( NIL == el_utilities.el_set_p( el_set ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject preds = evaluate_set_elements( el_set, $kw103$HL );
    final SubLObject paths = kb_utilities.predicate_subsumption_paths( preds );
    final SubLObject el_paths = Mapping.mapcar( $sym104$MAKE_EL_LIST, paths );
    return el_utilities.make_el_set( el_paths, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59040L)
  public static SubLObject cyc_less_than_quantities(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != extended_numbers.extended_number_p( interval1 ) && NIL != extended_numbers.extended_number_p( interval2 ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            return extended_numbers.extended_numberL( interval1, interval2, UNPROVIDED );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      relation_evaluation.throw_unevaluatable();
    }
    if( NIL != forts.fort_p( interval1 ) && NIL != forts.fort_p( interval2 ) && NIL != isa.isa_in_any_mtP( interval1, $const2$ScalarInterval ) && NIL != isa.isa_in_any_mtP( interval2, $const2$ScalarInterval ) )
    {
      if( NIL != equals.equalsP( interval1, interval2, UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL != following_valueP( interval1, interval2, UNPROVIDED ) )
      {
        return T;
      }
      if( NIL != following_valueP( interval2, interval1, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL != kb_mapping_utilities.gaf_trueP( ConsesLow.list( $const107$greaterThan, interval2, interval1 ) ) )
      {
        return T;
      }
    }
    thread.resetMultipleValues();
    final SubLObject unit1 = explode_interval( interval1 );
    final SubLObject min1 = thread.secondMultipleValue();
    SubLObject max1 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject unit2 = explode_interval( interval2 );
    SubLObject min2 = thread.secondMultipleValue();
    final SubLObject max2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == comparable_units( unit1, unit2 ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( NIL != collection_defns.fractionP( min2, UNPROVIDED ) )
    {
      min2 = convert_fraction_to_real_number( min2 );
    }
    if( NIL != collection_defns.fractionP( max1, UNPROVIDED ) )
    {
      max1 = convert_fraction_to_real_number( max1 );
    }
    min2 = convert_to_units( unit1, unit2, min2, UNPROVIDED );
    return extended_numbers.possibly_infinite_or_extended_numberL( max1, min2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61147L)
  public static SubLObject negate_fraction(final SubLObject fraction)
  {
    assert NIL != collection_defns.fractionP( fraction, UNPROVIDED ) : fraction;
    if( NIL != collection_defns.simple_fractionP( fraction, UNPROVIDED ) || NIL != collection_defns.decimal_fractionP( fraction, UNPROVIDED ) )
    {
      return el_utilities.replace_formula_arg( ONE_INTEGER, arithmetic.cyc_minus( cycl_utilities.nat_arg1( fraction, UNPROVIDED ) ), fraction );
    }
    if( NIL != collection_defns.mixed_fractionP( fraction, UNPROVIDED ) )
    {
      return el_utilities.make_el_formula( $const109$NegativeMixedFractionFn, cycl_utilities.nat_args( fraction, UNPROVIDED ), UNPROVIDED );
    }
    if( NIL != collection_defns.negative_mixed_fractionP( fraction, UNPROVIDED ) )
    {
      return el_utilities.make_el_formula( $const110$MixedFractionFn, cycl_utilities.nat_args( fraction, UNPROVIDED ), UNPROVIDED );
    }
    Errors.error( $str111$Can_t_negate__S, fraction );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61636L)
  public static SubLObject following_valueP(final SubLObject small_attribute, final SubLObject big_attribute, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return removal_modules_transitivity.inference_transitivity_check( $const112$followingValue, small_attribute, big_attribute, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61821L)
  public static SubLObject convert_fraction_to_real_number(final SubLObject fractional_number)
  {
    if( NIL != collection_defns.simple_fractionP( fractional_number, UNPROVIDED ) )
    {
      return Numbers.divide( cycl_utilities.naut_arg1( fractional_number, UNPROVIDED ), cycl_utilities.naut_arg2( fractional_number, UNPROVIDED ) );
    }
    if( NIL != collection_defns.mixed_fractionP( fractional_number, UNPROVIDED ) )
    {
      return Numbers.add( cycl_utilities.naut_arg1( fractional_number, UNPROVIDED ), Numbers.divide( cycl_utilities.naut_arg2( fractional_number, UNPROVIDED ), cycl_utilities.nat_arg3( fractional_number,
          UNPROVIDED ) ) );
    }
    if( NIL != collection_defns.negative_mixed_fractionP( fractional_number, UNPROVIDED ) )
    {
      return Numbers.minus( Numbers.add( cycl_utilities.naut_arg1( fractional_number, UNPROVIDED ), Numbers.divide( cycl_utilities.naut_arg2( fractional_number, UNPROVIDED ), cycl_utilities.nat_arg3( fractional_number,
          UNPROVIDED ) ) ) );
    }
    if( NIL != collection_defns.decimal_fractionP( fractional_number, UNPROVIDED ) )
    {
      return Numbers.divide( cycl_utilities.naut_arg1( fractional_number, UNPROVIDED ), Numbers.expt( TEN_INTEGER, cycl_utilities.naut_arg2( fractional_number, UNPROVIDED ) ) );
    }
    return fractional_number;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62516L)
  public static SubLObject convert_fraction_to_simple_fraction(final SubLObject fractional_number)
  {
    if( NIL != collection_defns.simple_fractionP( fractional_number, UNPROVIDED ) )
    {
      return fractional_number;
    }
    if( NIL != collection_defns.mixed_fractionP( fractional_number, UNPROVIDED ) )
    {
      return convert_mixed_fraction_to_simple_fraction( fractional_number );
    }
    if( NIL != collection_defns.negative_mixed_fractionP( fractional_number, UNPROVIDED ) )
    {
      return convert_negative_mixed_fraction_to_simple_fraction( fractional_number );
    }
    if( NIL != collection_defns.decimal_fractionP( fractional_number, UNPROVIDED ) )
    {
      return convert_decimal_fraction_to_simple_fraction( fractional_number );
    }
    return fractional_number;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63094L)
  public static SubLObject convert_mixed_fraction_to_simple_fraction(final SubLObject mixed_fraction)
  {
    if( NIL != collection_defns.mixed_fractionP( mixed_fraction, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( mixed_fraction, UNPROVIDED );
      SubLObject whole = NIL;
      SubLObject numerator = NIL;
      SubLObject denominator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      whole = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      numerator = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      denominator = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return convert_mixed_fraction_to_simple_fraction_internal( whole, numerator, denominator );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
    }
    else
    {
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63416L)
  public static SubLObject convert_negative_mixed_fraction_to_simple_fraction(final SubLObject negative_mixed_fraction)
  {
    if( NIL != collection_defns.negative_mixed_fractionP( negative_mixed_fraction, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( negative_mixed_fraction, UNPROVIDED );
      SubLObject whole = NIL;
      SubLObject numerator = NIL;
      SubLObject denominator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      whole = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      numerator = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      denominator = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return convert_mixed_fraction_to_simple_fraction_internal( Numbers.minus( whole ), Numbers.minus( numerator ), denominator );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
    }
    else
    {
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63791L)
  public static SubLObject convert_simple_fraction_to_mixed_fraction(final SubLObject simple_fraction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != collection_defns.simple_fractionP( simple_fraction, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( simple_fraction, UNPROVIDED );
      SubLObject numerator = NIL;
      SubLObject denominator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
      numerator = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
      denominator = current.first();
      current = current.rest();
      if( NIL == current )
      {
        thread.resetMultipleValues();
        final SubLObject quotient = Numbers.truncate( numerator, denominator );
        final SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject fn = Numbers.multiply( numerator, denominator ).isNegative() ? $const109$NegativeMixedFractionFn : $const110$MixedFractionFn;
        return el_utilities.make_ternary_formula( fn, Numbers.abs( quotient ), Numbers.abs( remainder ), Numbers.abs( denominator ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list114 );
    }
    else
    {
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64297L)
  public static SubLObject convert_simple_fraction_to_fraction(final SubLObject simple_fraction)
  {
    assert NIL != collection_defns.simple_fractionP( simple_fraction, UNPROVIDED ) : simple_fraction;
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( simple_fraction, UNPROVIDED );
    SubLObject numerator = NIL;
    SubLObject denominator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
    numerator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
    denominator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return fraction_utilities.new_fraction( numerator, denominator );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list114 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64541L)
  public static SubLObject convert_mixed_fraction_to_simple_fraction_internal(final SubLObject whole, final SubLObject numerator, final SubLObject denominator)
  {
    return el_utilities.make_binary_formula( $const116$SimpleFractionFn, Numbers.add( numerator, Numbers.multiply( whole, denominator ) ), denominator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64752L)
  public static SubLObject convert_decimal_fraction_to_simple_fraction(final SubLObject decimal_fraction)
  {
    if( NIL != collection_defns.decimal_fractionP( decimal_fraction, UNPROVIDED ) && Sequences.length( decimal_fraction ).numE( THREE_INTEGER ) )
    {
      return el_utilities.make_el_formula( $const116$SimpleFractionFn, ConsesLow.list( cycl_utilities.naut_arg1( decimal_fraction, UNPROVIDED ), Numbers.expt( TEN_INTEGER, cycl_utilities.naut_arg2( decimal_fraction,
          UNPROVIDED ) ) ), UNPROVIDED );
    }
    if( NIL != collection_defns.decimal_fractionP( decimal_fraction, UNPROVIDED ) && Sequences.length( decimal_fraction ).numE( FOUR_INTEGER ) )
    {
      return el_utilities.make_el_formula( $const116$SimpleFractionFn, ConsesLow.list( Numbers.subtract( cycl_utilities.naut_arg1( decimal_fraction, UNPROVIDED ), Numbers.floor( Numbers.divide( cycl_utilities.naut_arg1(
          decimal_fraction, UNPROVIDED ), Numbers.expt( TEN_INTEGER, cycl_utilities.nat_arg3( decimal_fraction, UNPROVIDED ) ) ), UNPROVIDED ) ), Numbers.subtract( Numbers.expt( TEN_INTEGER, cycl_utilities.naut_arg2(
              decimal_fraction, UNPROVIDED ) ), Numbers.expt( TEN_INTEGER, Numbers.subtract( cycl_utilities.naut_arg2( decimal_fraction, UNPROVIDED ), cycl_utilities.nat_arg3( decimal_fraction, UNPROVIDED ) ) ) ) ),
          UNPROVIDED );
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65763L)
  public static SubLObject fractionsL(final SubLObject fraction1, final SubLObject fraction2)
  {
    final SubLObject lcd_fractions = normalize_fractions( convert_fraction_to_simple_fraction( fraction1 ), convert_fraction_to_simple_fraction( fraction2 ) );
    return Numbers.numL( cycl_utilities.naut_arg1( lcd_fractions.first(), UNPROVIDED ), cycl_utilities.naut_arg1( conses_high.second( lcd_fractions ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66077L)
  public static SubLObject fractionsLE(final SubLObject fraction1, final SubLObject fraction2)
  {
    final SubLObject lcd_fractions = normalize_fractions( convert_fraction_to_simple_fraction( fraction1 ), convert_fraction_to_simple_fraction( fraction2 ) );
    return Numbers.numLE( cycl_utilities.naut_arg1( lcd_fractions.first(), UNPROVIDED ), cycl_utilities.naut_arg1( conses_high.second( lcd_fractions ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66424L)
  public static SubLObject normalize_fractions(final SubLObject fraction1, final SubLObject fraction2)
  {
    if( NIL != collection_defns.simple_fractionP( fraction1, UNPROVIDED ) && NIL != collection_defns.simple_fractionP( fraction2, UNPROVIDED ) )
    {
      final SubLObject common_denominator = number_utilities.lcm( ConsesLow.list( cycl_utilities.naut_arg2( fraction1, UNPROVIDED ), cycl_utilities.naut_arg2( fraction2, UNPROVIDED ) ) );
      final SubLObject fraction_multiple_1 = Numbers.divide( common_denominator, cycl_utilities.naut_arg2( fraction1, UNPROVIDED ) );
      final SubLObject fraction_multiple_2 = Numbers.divide( common_denominator, cycl_utilities.naut_arg2( fraction2, UNPROVIDED ) );
      return ConsesLow.list( el_utilities.make_el_formula( $const116$SimpleFractionFn, ConsesLow.list( Numbers.multiply( fraction_multiple_1, cycl_utilities.naut_arg1( fraction1, UNPROVIDED ) ), common_denominator ),
          UNPROVIDED ), el_utilities.make_el_formula( $const116$SimpleFractionFn, ConsesLow.list( Numbers.multiply( fraction_multiple_2, cycl_utilities.naut_arg1( fraction2, UNPROVIDED ) ), common_denominator ),
              UNPROVIDED ) );
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67108L)
  public static SubLObject cyc_less_than_or_equal_to_quantities(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != extended_numbers.extended_number_p( interval1 ) && NIL != extended_numbers.extended_number_p( interval2 ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            return extended_numbers.extended_numberLE( interval1, interval2, UNPROVIDED );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      relation_evaluation.throw_unevaluatable();
    }
    if( NIL != forts.fort_p( interval1 ) && NIL != forts.fort_p( interval2 ) && NIL != isa.isa_in_any_mtP( interval1, $const2$ScalarInterval ) && NIL != isa.isa_in_any_mtP( interval2, $const2$ScalarInterval ) )
    {
      if( NIL != equals.equalsP( interval1, interval2, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      if( NIL != following_valueP( interval1, interval2, UNPROVIDED ) )
      {
        return T;
      }
      if( NIL != following_valueP( interval2, interval1, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL != kb_mapping_utilities.gaf_trueP( ConsesLow.list( $const117$greaterThanOrEqualTo, interval2, interval1 ) ) )
      {
        return T;
      }
      if( NIL != kb_mapping_utilities.gaf_trueP( ConsesLow.list( $const107$greaterThan, interval2, interval1 ) ) )
      {
        return T;
      }
    }
    if( NIL != collection_defns.fractionP( interval1, UNPROVIDED ) && NIL != collection_defns.fractionP( interval2, UNPROVIDED ) )
    {
      return fractionsLE( interval1, interval2 );
    }
    thread.resetMultipleValues();
    final SubLObject unit1 = explode_interval( interval1 );
    final SubLObject min1 = thread.secondMultipleValue();
    final SubLObject max1 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject unit2 = explode_interval( interval2 );
    SubLObject min2 = thread.secondMultipleValue();
    final SubLObject max2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == comparable_units( unit1, unit2 ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    min2 = convert_to_units( unit1, unit2, min2, UNPROVIDED );
    return extended_numbers.possibly_infinite_or_extended_numberLE( max1, min2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68774L)
  public static SubLObject cyc_quantity_subsumes(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( interval1.isNumber() && interval2.isNumber() )
    {
      return Numbers.numE( interval1, interval2 );
    }
    if( NIL != forts.fort_p( interval1 ) && NIL != forts.fort_p( interval2 ) && NIL != isa.isa_in_any_mtP( interval1, $const2$ScalarInterval ) && NIL != isa.isa_in_any_mtP( interval1, $const2$ScalarInterval ) )
    {
      if( NIL != equals.equalsP( interval2, interval1, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      SubLObject successP = NIL;
      final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding( thread );
      try
      {
        gt_vars.$suspend_gt_type_checkingP$.bind( T, thread );
        successP = gt_methods.gt_booleanP( $const27$quantitySubsumes, interval1, interval2, UNPROVIDED );
      }
      finally
      {
        gt_vars.$suspend_gt_type_checkingP$.rebind( _prev_bind_0, thread );
      }
      if( NIL != successP )
      {
        return T;
      }
    }
    return cyc_quantity_subsumes_proper_intervals( interval1, interval2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 69596L)
  public static SubLObject cyc_quantity_subsumes_proper_intervals(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unit1 = explode_interval( interval1 );
    final SubLObject min1 = thread.secondMultipleValue();
    final SubLObject max1 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject unit2 = explode_interval( interval2 );
    SubLObject min2 = thread.secondMultipleValue();
    SubLObject max2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == comparable_units( unit1, unit2 ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    min2 = convert_to_units( unit1, unit2, min2, UNPROVIDED );
    max2 = convert_to_units( unit1, unit2, max2, UNPROVIDED );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          return makeBoolean( NIL != extended_numbers.possibly_infinite_or_extended_numberLE( min1, min2 ) && NIL != extended_numbers.possibly_infinite_or_extended_numberLE( max2, max1 ) );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70172L)
  public static SubLObject cyc_quantity_intersects(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( interval1.isNumber() && interval2.isNumber() )
    {
      return Numbers.numE( interval1, interval2 );
    }
    if( NIL != forts.fort_p( interval1 ) && NIL != forts.fort_p( interval2 ) && NIL != isa.isa_in_any_mtP( interval1, $const2$ScalarInterval ) && NIL != isa.isa_in_any_mtP( interval1, $const2$ScalarInterval ) )
    {
      if( NIL != equals.equalsP( interval2, interval1, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      SubLObject successP = NIL;
      final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding( thread );
      try
      {
        gt_vars.$suspend_gt_type_checkingP$.bind( T, thread );
        successP = gt_methods.gt_booleanP( $const119$quantityIntersects, interval1, interval2, UNPROVIDED );
      }
      finally
      {
        gt_vars.$suspend_gt_type_checkingP$.rebind( _prev_bind_0, thread );
      }
      if( NIL != successP )
      {
        return T;
      }
    }
    return cyc_quantity_intersects_proper_intervals( interval1, interval2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71004L)
  public static SubLObject cyc_quantity_intersects_proper_intervals(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unit1 = explode_interval( interval1 );
    final SubLObject min1 = thread.secondMultipleValue();
    final SubLObject max1 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject unit2 = explode_interval( interval2 );
    SubLObject min2 = thread.secondMultipleValue();
    SubLObject max2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == comparable_units( unit1, unit2 ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    min2 = convert_to_units( unit1, unit2, min2, UNPROVIDED );
    max2 = convert_to_units( unit1, unit2, max2, UNPROVIDED );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw39$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym40$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          return makeBoolean( NIL != extended_numbers.possibly_infinite_or_extended_numberLE( min1, max2 ) && NIL != extended_numbers.possibly_infinite_or_extended_numberLE( min2, max1 ) );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw39$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71582L)
  public static SubLObject cyc_divides_evenly(final SubLObject interval1, final SubLObject interval2)
  {
    final SubLObject quotient = cyc_round_closest( cyc_quotient( interval2, interval1 ) );
    if( NIL != extended_numbers.extended_number_integer_p( cyc_quantity_measure( quotient ) ) )
    {
      final SubLObject product = arithmetic.cyc_times_internal( quotient, interval1 );
      return arithmetic.cyc_numerically_equal( product, interval2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71970L)
  public static SubLObject cyc_list_nth(final SubLObject el_list, SubLObject n)
  {
    if( NIL == el_utilities.el_non_empty_list_p( el_list ) || !n.isInteger() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( !n.isPositive() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    n = Numbers.subtract( n, ONE_INTEGER );
    final SubLObject list = el_utilities.el_list_items( el_list );
    if( n.numGE( Sequences.length( list ) ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return ConsesLow.nth( n, list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 72508L)
  public static SubLObject cyc_list_concatenate(final SubLObject args)
  {
    if( NIL == list_utilities.every_in_list( Symbols.symbol_function( $sym123$EL_LIST_P ), args, UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( Functions.apply( Symbols.symbol_function( $sym124$APPEND ), Mapping.mapcar( Symbols.symbol_function( $sym125$EL_LIST_ITEMS ), args ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 72722L)
  public static SubLObject cyc_append_to_list(final SubLObject item, final SubLObject list)
  {
    if( NIL == el_utilities.el_list_p( list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( list_utilities.snoc( item, el_utilities.el_list_items( list ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 72911L)
  public static SubLObject cyc_prepend_to_list(final SubLObject item, final SubLObject list)
  {
    if( NIL == el_utilities.el_list_p( list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( ConsesLow.cons( item, el_utilities.el_list_items( list ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73102L)
  public static SubLObject cyc_list_first(final SubLObject el_list)
  {
    if( NIL == el_utilities.el_non_empty_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.el_list_items( el_list ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73281L)
  public static SubLObject cyc_list_second(final SubLObject el_list)
  {
    if( NIL == el_utilities.el_non_empty_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject items = el_utilities.el_list_items( el_list );
    if( NIL == list_utilities.lengthGE( items, TWO_INTEGER, UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return conses_high.second( items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73551L)
  public static SubLObject cyc_list_rest(final SubLObject el_list)
  {
    if( NIL == el_utilities.el_non_empty_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( el_utilities.el_list_items( el_list ).rest(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73749L)
  public static SubLObject cyc_list_last(final SubLObject el_list)
  {
    if( NIL == el_utilities.el_non_empty_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return conses_high.last( el_utilities.el_list_items( el_list ), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73931L)
  public static SubLObject cyc_list_subseq(final SubLObject el_list, SubLObject start, final SubLObject end)
  {
    if( NIL == el_utilities.el_list_p( el_list ) || !start.isInteger() || !end.isInteger() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( !start.isPositive() || !end.isPositive() || end.numL( start ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject list = el_utilities.el_list_items( el_list );
    final SubLObject length = Sequences.length( list );
    if( start.numG( length ) || end.numG( length ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    start = Numbers.subtract( start, ONE_INTEGER );
    return el_utilities.make_el_list( Sequences.subseq( list, start, end ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74546L)
  public static SubLObject cyc_list_subseq_up_to(final SubLObject el_list, SubLObject start, final SubLObject end)
  {
    if( NIL == el_utilities.el_list_p( el_list ) || !start.isInteger() || !end.isInteger() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( el_list.eql( $const134$TheEmptyList ) )
    {
      return $const134$TheEmptyList;
    }
    if( !start.isPositive() || !end.isPositive() || end.numL( start ) )
    {
      return $const134$TheEmptyList;
    }
    final SubLObject list = el_utilities.el_list_items( el_list );
    final SubLObject length = Sequences.length( list );
    final SubLObject end_mod = Numbers.min( end, length );
    if( start.numG( length ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    start = Numbers.subtract( start, ONE_INTEGER );
    return el_utilities.make_el_list( Sequences.subseq( list, start, end_mod ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75245L)
  public static SubLObject cyc_list_search(final SubLObject el_sublist, final SubLObject el_list)
  {
    if( NIL == el_utilities.el_list_p( el_sublist ) || NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject sublist = el_utilities.el_list_items( el_sublist );
    final SubLObject list = el_utilities.el_list_items( el_list );
    SubLObject positions = NIL;
    if( NIL == sublist )
    {
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Sequences.length( list ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        positions = ConsesLow.cons( Numbers.add( i, ONE_INTEGER ), positions );
      }
    }
    else
    {
      SubLObject position;
      for( position = NIL, position = Sequences.search( sublist, list, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, ZERO_INTEGER, NIL ); NIL != position; position = Sequences
          .search( sublist, list, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, Numbers.add( position, ONE_INTEGER ), NIL ) )
      {
        positions = ConsesLow.cons( Numbers.add( position, ONE_INTEGER ), positions );
      }
    }
    return el_utilities.make_el_list( Sequences.nreverse( positions ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75924L)
  public static SubLObject cyc_position(final SubLObject item, final SubLObject el_list)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject list = el_utilities.el_list_items( el_list );
    final SubLObject position = Sequences.position( item, list, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( !position.isInteger() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return arithmetic.arithmetic_answer( Numbers.add( position, ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76339L)
  public static SubLObject cyc_list_length(final SubLObject el_list)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return Sequences.length( el_utilities.el_list_items( el_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76511L)
  public static SubLObject cyc_list_reverse(final SubLObject el_list)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( Sequences.reverse( el_utilities.el_list_items( el_list ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76701L)
  public static SubLObject cyc_list_member_set(final SubLObject el_list)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject list = el_utilities.el_list_items( el_list );
    return make_hl_extensional_set( list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76923L)
  public static SubLObject cyc_set_element_list(final SubLObject el_set)
  {
    if( NIL == el_utilities.el_set_or_collection_p( el_set ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject items = evaluate_set_elements( el_set, $kw103$HL );
    return el_utilities.make_el_list( items, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77160L)
  public static SubLObject cyc_substitute_from_list(final SubLObject expr, final SubLObject el_list)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject el_pairs = el_utilities.el_list_items( el_list );
    if( NIL == list_utilities.every_in_list( $sym123$EL_LIST_P, el_pairs, UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject doubleton_list = Mapping.mapcar( $sym125$EL_LIST_ITEMS, el_pairs );
    if( NIL == list_utilities.every_in_list( $sym142$DOUBLETON_, doubleton_list, UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject alist = Mapping.mapcar( $sym143$DOUBLETON_TO_CONS, doubleton_list );
    final SubLObject new_expr = cycl_utilities.expression_sublis( list_utilities.flip_alist( alist ), expr, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    return new_expr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77983L)
  public static SubLObject doubleton_to_cons(final SubLObject doubleton)
  {
    SubLObject a = NIL;
    SubLObject b = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( doubleton, doubleton, $list145 );
    a = doubleton.first();
    SubLObject current = doubleton.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, doubleton, $list145 );
    b = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.cons( a, b );
    }
    cdestructuring_bind.cdestructuring_bind_error( doubleton, $list145 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78113L)
  public static SubLObject cyc_substitute_from_the_term_binding_set(final SubLObject expr, final SubLObject el_set)
  {
    if( NIL == el_utilities.el_set_p( el_set ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject binding_set = bindings.inferencify_kb_binding_set( el_set );
    if( NIL == bindings.binding_list_p( binding_set ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject new_expr = cycl_utilities.expression_sublis( binding_set, expr, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    return new_expr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78512L)
  public static SubLObject cyc_remove_adjacent_duplicates_from_list_fn(final SubLObject el_list)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( list_utilities.remove_duplicates_sorted( el_utilities.el_list_items( el_list ), UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78770L)
  public static SubLObject cyc_map_function_over_list(final SubLObject function, final SubLObject el_list)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject elements = el_utilities.el_list_items( el_list );
    final SubLObject v_answer = cyc_map_function_int( function, elements );
    if( NIL == v_answer )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( v_answer, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79155L)
  public static SubLObject cyc_map_function_int(final SubLObject function, final SubLObject list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = list;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject element_result = relation_evaluation.cyc_evaluate( ConsesLow.list( function, element ) );
      final SubLObject valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == valid )
      {
        relation_evaluation.throw_unevaluatable();
      }
      else
      {
        v_answer = ConsesLow.cons( element_result, v_answer );
      }
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79468L)
  public static SubLObject cyc_map_function_over_list_until(final SubLObject function, final SubLObject el_list, final SubLObject until_function)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject elements = el_utilities.el_list_items( el_list );
    final SubLObject v_answer = cyc_map_function_until_int( function, elements, until_function );
    if( NIL == v_answer )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( v_answer, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79910L)
  public static SubLObject cyc_map_function_until_int(final SubLObject function, final SubLObject list, final SubLObject until_function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject until_satisfiedP = NIL;
    if( NIL == until_satisfiedP )
    {
      SubLObject csome_list_var = list;
      SubLObject element = NIL;
      element = csome_list_var.first();
      while ( NIL == until_satisfiedP && NIL != csome_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject element_result = relation_evaluation.cyc_evaluate( ConsesLow.list( function, element ) );
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == valid )
        {
          relation_evaluation.throw_unevaluatable();
        }
        else
        {
          v_answer = ConsesLow.cons( element_result, v_answer );
        }
        final SubLObject tuples = ask_utilities.kappa_tuples( NIL, ConsesLow.list( until_function, element ), inference_worker.mt_of_currently_executing_tactic(), UNPROVIDED );
        if( NIL != tuples )
        {
          until_satisfiedP = T;
        }
        csome_list_var = csome_list_var.rest();
        element = csome_list_var.first();
      }
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80430L)
  public static SubLObject cyc_map_function_over_list_until_result(final SubLObject function, final SubLObject el_list, final SubLObject until_function)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject elements = el_utilities.el_list_items( el_list );
    final SubLObject v_answer = cyc_map_function_until_result_int( function, elements, until_function );
    if( NIL == v_answer )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( v_answer, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80904L)
  public static SubLObject cyc_map_function_until_result_int(final SubLObject function, final SubLObject list, final SubLObject until_function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject until_satisfiedP = NIL;
    if( NIL == until_satisfiedP )
    {
      SubLObject csome_list_var = list;
      SubLObject element = NIL;
      element = csome_list_var.first();
      while ( NIL == until_satisfiedP && NIL != csome_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject element_result = relation_evaluation.cyc_evaluate( ConsesLow.list( function, element ) );
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == valid )
        {
          relation_evaluation.throw_unevaluatable();
        }
        else
        {
          v_answer = ConsesLow.cons( element_result, v_answer );
        }
        final SubLObject tuples = ask_utilities.kappa_tuples( NIL, ConsesLow.list( until_function, element_result ), inference_worker.mt_of_currently_executing_tactic(), UNPROVIDED );
        if( NIL != tuples )
        {
          until_satisfiedP = T;
        }
        csome_list_var = csome_list_var.rest();
        element = csome_list_var.first();
      }
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81437L)
  public static SubLObject cyc_map_function_with_args_over_lists(final SubLObject function, final SubLObject const_indices, final SubLObject const_args, final SubLObject var_indices, final SubLObject var_arg_lists)
  {
    if( NIL == el_utilities.el_list_p( const_indices ) || NIL == el_utilities.el_list_p( const_args ) || NIL == el_utilities.el_list_p( var_indices ) || NIL == el_utilities.el_list_p( var_arg_lists )
        || NIL == list_utilities.every_in_list( $sym123$EL_LIST_P, el_utilities.el_list_items( var_arg_lists ), UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject ci = el_utilities.el_list_items( const_indices );
    final SubLObject ca = el_utilities.el_list_items( const_args );
    final SubLObject vi = el_utilities.el_list_items( var_indices );
    final SubLObject va = Mapping.mapcar( $sym125$EL_LIST_ITEMS, el_utilities.el_list_items( var_arg_lists ) );
    if( NIL == list_utilities.list_of_type_p( Symbols.symbol_function( $sym65$NON_NEGATIVE_INTEGER_P ), ci ) || NIL == list_utilities.list_of_type_p( Symbols.symbol_function( $sym65$NON_NEGATIVE_INTEGER_P ), vi )
        || NIL == list_utilities.same_length_p( ci, ca ) || NIL == list_utilities.same_length_p( vi, va ) || NIL != keyhash_utilities.fast_intersection( ci, vi, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        || NIL == list_utilities.same_lengths_p( va ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject results = cyc_map_function_with_args_over_lists_int( function, ci, ca, vi, va );
    return el_utilities.make_el_list( results, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82439L)
  public static SubLObject cyc_map_function_with_args_over_lists_int(final SubLObject function, final SubLObject const_indices, final SubLObject const_args, final SubLObject var_indices, final SubLObject var_arg_lists)
  {
    final SubLObject v_arity = number_utilities.f_1X( Functions.apply( Symbols.symbol_function( $sym152$MAX ), ConsesLow.append( const_indices, var_indices ) ) );
    final SubLObject args = ConsesLow.make_list( v_arity, NIL );
    final SubLObject length = Sequences.length( var_arg_lists.first() );
    SubLObject results = NIL;
    SubLObject const_index = NIL;
    SubLObject const_index_$29 = NIL;
    SubLObject const_arg = NIL;
    SubLObject const_arg_$30 = NIL;
    const_index = const_indices;
    const_index_$29 = const_index.first();
    const_arg = const_args;
    const_arg_$30 = const_arg.first();
    while ( NIL != const_arg || NIL != const_index)
    {
      ConsesLow.set_nth( const_index_$29, args, const_arg_$30 );
      const_index = const_index.rest();
      const_index_$29 = const_index.first();
      const_arg = const_arg.rest();
      const_arg_$30 = const_arg.first();
    }
    SubLObject i;
    SubLObject temp_args;
    SubLObject var_index;
    SubLObject var_index_$31;
    SubLObject var_arg_list;
    SubLObject var_arg_list_$32;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      temp_args = conses_high.copy_list( args );
      var_index = NIL;
      var_index_$31 = NIL;
      var_arg_list = NIL;
      var_arg_list_$32 = NIL;
      var_index = var_indices;
      var_index_$31 = var_index.first();
      var_arg_list = var_arg_lists;
      var_arg_list_$32 = var_arg_list.first();
      while ( NIL != var_arg_list || NIL != var_index)
      {
        ConsesLow.set_nth( var_index_$31, temp_args, ConsesLow.nth( i, var_arg_list_$32 ) );
        var_index = var_index.rest();
        var_index_$31 = var_index.first();
        var_arg_list = var_arg_list.rest();
        var_arg_list_$32 = var_arg_list.first();
      }
      results = ConsesLow.cons( relation_evaluation.cyc_evaluate( ConsesLow.cons( function, temp_args ) ), results );
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83140L)
  public static SubLObject cyc_apply_function_recursively(final SubLObject args, final SubLObject seed, final SubLObject fn)
  {
    if( NIL == el_utilities.el_list_p( args ) || NIL == relation_evaluation.evaluatable_functionP( fn ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    SubLObject val = seed;
    SubLObject cdolist_list_var = el_utilities.el_list_items( args );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      val = relation_evaluation.cyc_evaluate( el_utilities.make_binary_formula( fn, arg, val ) );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return val;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83638L)
  public static SubLObject cyc_list_memberP(final SubLObject el_list, final SubLObject obj)
  {
    if( NIL == el_utilities.el_list_p( el_list ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return subl_promotions.memberP( obj, el_utilities.el_list_items( el_list ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83898L)
  public static SubLObject cyc_list_contains_memberP(final SubLObject el_list, final SubLObject obj)
  {
    return cyc_list_memberP( el_list, obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 84031L)
  public static SubLObject cyc_sublistP(final SubLObject el_list, final SubLObject el_list_sub)
  {
    if( NIL == el_utilities.el_list_p( el_list ) || NIL == el_utilities.el_list_p( el_list_sub ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return Sequences.search( el_utilities.el_list_items( el_list_sub ), el_utilities.el_list_items( el_list ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 84276L)
  public static SubLObject cyc_initial_sublistP(final SubLObject list, final SubLObject sub)
  {
    if( !list.isList() || !sub.isList() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( Sequences.length( sub ).numG( Sequences.length( list ) ) )
    {
      return NIL;
    }
    SubLObject mismatchP = NIL;
    SubLObject l = NIL;
    SubLObject s = NIL;
    l = list;
    for( s = sub; NIL == mismatchP && NIL != s; s = s.rest() )
    {
      if( !s.first().equalp( l.first() ) )
      {
        mismatchP = T;
      }
      l = l.rest();
    }
    return makeBoolean( NIL == mismatchP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 84706L)
  public static SubLObject cyc_non_empty_set_p(final SubLObject v_object)
  {
    return el_utilities.el_non_empty_set_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 84961L)
  public static SubLObject cyc_empty_set_p(final SubLObject v_object)
  {
    return el_utilities.el_empty_set_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85036L)
  public static SubLObject cyc_set_p(final SubLObject v_object)
  {
    return el_utilities.el_set_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85099L)
  public static SubLObject extensional_set_p(final SubLObject v_object)
  {
    return el_utilities.el_extensional_set_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85182L)
  public static SubLObject intensional_set_p(final SubLObject v_object)
  {
    return el_utilities.el_intensional_set_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85265L)
  public static SubLObject make_hl_extensional_set(final SubLObject objects)
  {
    return czer_main.canonicalize_fn_term_if_reified( el_utilities.make_el_extensional_set( objects ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85395L)
  public static SubLObject evaluate_set_elements(final SubLObject v_set, SubLObject answer_language)
  {
    if( answer_language == UNPROVIDED )
    {
      answer_language = $kw159$EL;
    }
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    if( NIL != forts.fort_p( v_set ) && NIL != fort_types_interface.collectionP( v_set ) )
    {
      return isa.all_fort_instances( v_set, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != extensional_set_p( v_set ) )
    {
      return el_utilities.extensional_set_elements( v_set );
    }
    if( NIL != intensional_set_p( v_set ) )
    {
      return ask_utilities.the_set_of_elements( v_set, answer_language, UNPROVIDED );
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85940L)
  public static SubLObject set_extent(final SubLObject v_set, SubLObject mt, SubLObject answer_language)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( answer_language == UNPROVIDED )
    {
      answer_language = $kw159$EL;
    }
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str4$A_KB_dependent_numerical_quantifi );
    }
    if( NIL != forts.fort_p( v_set ) && NIL != fort_types_interface.collectionP( v_set ) )
    {
      return isa.all_fort_instances( v_set, mt, UNPROVIDED );
    }
    if( NIL != extensional_set_p( v_set ) )
    {
      return el_utilities.extensional_set_elements( v_set );
    }
    if( NIL == intensional_set_p( v_set ) )
    {
      Errors.error( $str160$Don_t_know_how_to_determine_the_e, v_set, mt );
      return NIL;
    }
    if( NIL != mt )
    {
      return ask_utilities.the_set_of_elements( v_set, answer_language, mt );
    }
    return ask_utilities.the_set_of_elements( v_set, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86614L)
  public static SubLObject cyc_set_intersection(final SubLObject set_1, final SubLObject set_2)
  {
    if( NIL != cyc_set_p( set_1 ) && NIL != cyc_set_p( set_2 ) )
    {
      final SubLObject elements_1 = evaluate_set_elements( set_1, $kw103$HL );
      final SubLObject elements_2 = evaluate_set_elements( set_2, $kw103$HL );
      final SubLObject intersection = keyhash_utilities.fast_intersection( elements_1, elements_2, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED );
      return make_hl_extensional_set( intersection );
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87153L)
  public static SubLObject cyc_set_union(final SubLObject set_1, final SubLObject set_2)
  {
    if( NIL != cyc_set_p( set_1 ) && NIL != cyc_set_p( set_2 ) )
    {
      final SubLObject elements_1 = evaluate_set_elements( set_1, $kw103$HL );
      final SubLObject elements_2 = evaluate_set_elements( set_2, $kw103$HL );
      final SubLObject union = ConsesLow.append( elements_1, elements_2 );
      return make_hl_extensional_set( union );
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87623L)
  public static SubLObject cyc_set_difference(final SubLObject set_1, final SubLObject set_2)
  {
    if( NIL != cyc_set_p( set_1 ) && NIL != cyc_set_p( set_2 ) )
    {
      final SubLObject elements_1 = evaluate_set_elements( set_1, $kw103$HL );
      final SubLObject elements_2 = evaluate_set_elements( set_2, $kw103$HL );
      final SubLObject difference = list_utilities.fast_set_difference( elements_1, elements_2, Symbols.symbol_function( EQUAL ) );
      return make_hl_extensional_set( difference );
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 88149L)
  public static SubLObject cyc_set_extent(final SubLObject v_set)
  {
    if( NIL == cyc_set_p( v_set ) && NIL == forts.fort_p( v_set ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject extent = evaluate_set_elements( v_set, $kw103$HL );
    final SubLObject hl_extent = make_hl_extensional_set( extent );
    if( $const164$TheEmptySet.eql( hl_extent ) )
    {
      return el_utilities.make_nat_formula( $const165$TheSet, NIL );
    }
    return hl_extent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 88567L)
  public static SubLObject cyc_map_function_over_set(final SubLObject function, final SubLObject v_set)
  {
    final SubLObject elements = evaluate_set_elements( v_set, $kw103$HL );
    final SubLObject v_answer = cyc_map_function_int( function, elements );
    if( NIL == v_answer )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return make_hl_extensional_set( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 88951L)
  public static SubLObject cyc_least_common_multiple(final SubLObject args)
  {
    if( NIL == list_of_cyc_scalar_interval_p( args ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( NIL == args )
    {
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    return arithmetic.quantity_reduce( Symbols.symbol_function( $sym168$CYC_LEAST_COMMON_MULTIPLE_INTERNAL ), NIL, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 89478L)
  public static SubLObject cyc_least_common_multiple_internal(final SubLObject scalar1, final SubLObject scalar2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( scalar1.isInteger() && scalar2.isInteger() )
    {
      ans = number_utilities.lcm2( scalar1, scalar2 );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit1 = explode_interval( scalar1 );
      final SubLObject min1 = thread.secondMultipleValue();
      final SubLObject max1 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject unit2 = explode_interval( scalar2 );
      final SubLObject min2 = thread.secondMultipleValue();
      final SubLObject max2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( !min1.isInteger() || !max1.isInteger() || !min2.isInteger() || !max2.isInteger() )
      {
        relation_evaluation.throw_unevaluatable();
      }
      if( !min1.numE( max1 ) || !min2.numE( max2 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      if( NIL == comparable_units( unit1, unit2 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      SubLObject smaller_unit = NIL;
      SubLObject larger_unit = NIL;
      SubLObject smaller_unit_integer = NIL;
      SubLObject larger_unit_integer = NIL;
      if( NIL != smaller_unit_than( unit1, unit2 ) )
      {
        smaller_unit = unit1;
        larger_unit = unit2;
        smaller_unit_integer = min1;
        larger_unit_integer = min2;
      }
      else
      {
        smaller_unit = unit2;
        larger_unit = unit1;
        smaller_unit_integer = min2;
        larger_unit_integer = min1;
      }
      if( !smaller_unit.eql( larger_unit ) && NIL == integer_valuedP( get_unit_multiplication_factor( larger_unit, smaller_unit ) ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      larger_unit_integer = Numbers.round( convert_to_units( smaller_unit, larger_unit, larger_unit_integer, UNPROVIDED ), UNPROVIDED );
      final SubLObject lcm = number_utilities.lcm2( smaller_unit_integer, larger_unit_integer );
      final SubLObject large_unit_lcm = Numbers.round( convert_to_units( larger_unit, smaller_unit, lcm, UNPROVIDED ), UNPROVIDED );
      ans = make_interval( larger_unit, large_unit_lcm, UNPROVIDED );
    }
    return arithmetic.arithmetic_answer( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 91519L)
  public static SubLObject cyc_greatest_common_divisor(final SubLObject args)
  {
    if( NIL == list_of_cyc_scalar_interval_p( args ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( NIL == args )
    {
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    return arithmetic.quantity_reduce( Symbols.symbol_function( $sym170$CYC_GREATEST_COMMON_DIVISOR_INTERNAL ), NIL, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 92058L)
  public static SubLObject cyc_greatest_common_divisor_internal(final SubLObject scalar1, final SubLObject scalar2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( scalar1.isInteger() && scalar2.isInteger() )
    {
      ans = number_utilities.gcd2( scalar1, scalar2 );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject unit1 = explode_interval( scalar1 );
      final SubLObject min1 = thread.secondMultipleValue();
      final SubLObject max1 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject unit2 = explode_interval( scalar2 );
      final SubLObject min2 = thread.secondMultipleValue();
      final SubLObject max2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( !min1.isInteger() || !max1.isInteger() || !min2.isInteger() || !max2.isInteger() )
      {
        relation_evaluation.throw_unevaluatable();
      }
      if( !min1.numE( max1 ) || !min2.numE( max2 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      if( NIL == comparable_units( unit1, unit2 ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      SubLObject smaller_unit = NIL;
      SubLObject larger_unit = NIL;
      SubLObject smaller_unit_integer = NIL;
      SubLObject larger_unit_integer = NIL;
      if( NIL != smaller_unit_than( unit1, unit2 ) )
      {
        smaller_unit = unit1;
        larger_unit = unit2;
        smaller_unit_integer = min1;
        larger_unit_integer = min2;
      }
      else
      {
        smaller_unit = unit2;
        larger_unit = unit1;
        smaller_unit_integer = min2;
        larger_unit_integer = min1;
      }
      if( !smaller_unit.eql( larger_unit ) && NIL == integer_valuedP( get_unit_multiplication_factor( larger_unit, smaller_unit ) ) )
      {
        relation_evaluation.throw_unevaluatable();
      }
      larger_unit_integer = Numbers.round( convert_to_units( smaller_unit, larger_unit, larger_unit_integer, UNPROVIDED ), UNPROVIDED );
      ans = make_interval( smaller_unit, number_utilities.gcd2( smaller_unit_integer, larger_unit_integer ), UNPROVIDED );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 93695L)
  public static SubLObject integer_valuedP(final SubLObject number)
  {
    return makeBoolean( number.isNumber() && Numbers.mod( number, ONE_INTEGER ).isZero() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 93799L)
  public static SubLObject cyc_random_integer(SubLObject max)
  {
    max = cycl_real_number_to_number( max );
    if( NIL == subl_promotions.positive_integer_p( max ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return arithmetic.arithmetic_answer( random.random( max ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 94108L)
  public static SubLObject cyc_random_integer_with_seed(SubLObject seed, SubLObject max)
  {
    seed = cycl_real_number_to_number( seed );
    max = cycl_real_number_to_number( max );
    if( NIL == subl_promotions.positive_integer_p( seed ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    if( NIL == subl_promotions.positive_integer_p( max ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    SubLObject hash = seed;
    hash = Numbers.add( Numbers.lognot( hash ), Numbers.ash( hash, $int173$21 ) );
    hash = Numbers.logxor( hash, Numbers.ash( hash, $int174$_24 ) );
    hash = Numbers.add( hash, Numbers.ash( hash, THREE_INTEGER ), Numbers.ash( hash, EIGHT_INTEGER ) );
    hash = Numbers.logxor( hash, Numbers.ash( hash, $int175$_14 ) );
    hash = Numbers.add( hash, Numbers.ash( hash, TWO_INTEGER ), Numbers.ash( hash, FOUR_INTEGER ) );
    hash = Numbers.logxor( hash, Numbers.ash( hash, $int176$_28 ) );
    hash = Numbers.add( hash, Numbers.ash( hash, $int177$31 ) );
    return arithmetic.arithmetic_answer( Numbers.mod( hash, max ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 94984L)
  public static SubLObject cyc_n_random_integers(SubLObject n, SubLObject max)
  {
    n = cycl_real_number_to_number( n );
    max = cycl_real_number_to_number( max );
    if( NIL == subl_promotions.non_negative_integer_p( n ) || NIL == subl_promotions.positive_integer_p( max ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_list( Mapping.mapcar( Symbols.symbol_function( $sym179$ARITHMETIC_ANSWER ), number_utilities.n_random_integers( n, max, UNPROVIDED ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 95420L)
  public static SubLObject cyc_matrix_solution(final SubLObject cycl_matrix)
  {
    SubLObject matrix = conses_high.copy_tree( el_utilities.el_list_items( cycl_matrix ) );
    SubLObject list_var = NIL;
    SubLObject row = NIL;
    SubLObject index = NIL;
    list_var = matrix;
    row = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), row = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      ConsesLow.set_nth( index, matrix, el_utilities.el_list_items( row ) );
    }
    matrix = matrix_utilities.gaussian_elimination( matrix );
    if( NIL == matrix )
    {
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      matrix = matrix_utilities.remove_allzero_rows( matrix );
      if( NIL != matrix_utilities.triangular_matrix_of_integer_or_fraction_p( matrix ) )
      {
        return el_utilities.make_el_list( fraction_utilities.normalize_fractional_phrase( list_utilities.snoc( ONE_INTEGER, matrix_utilities.solve_triangular_matrix( matrix ) ) ), UNPROVIDED );
      }
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 96114L)
  public static SubLObject get_interconvertible_units_of_measure(SubLObject filter_fn)
  {
    if( filter_fn == UNPROVIDED )
    {
      filter_fn = Symbols.symbol_function( $sym183$FALSE );
    }
    final SubLObject map = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject v_bindings = cdolist_list_var = inference_kernel.new_cyc_query( $list184, $const185$CurrentWorldDataCollectorMt_NonHo, $list186 );
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding;
      SubLObject unit_type = NIL;
      SubLObject unit = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list187 );
      unit_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list187 );
      unit = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == Functions.funcall( filter_fn, unit_type ) && NIL == Functions.funcall( filter_fn, unit ) )
        {
          map_utilities.map_push( map, unit_type, unit );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list187 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return map;
  }

  public static SubLObject declare_quantities_file()
  {
    SubLFiles.declareFunction( me, "initialize_quant_kb_feature", "INITIALIZE-QUANT-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_scalar_interval_p", "CYC-SCALAR-INTERVAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_cyc_scalar_interval_p", "LIST-OF-CYC-SCALAR-INTERVAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_interval", "MAKE-INTERVAL", 2, 1, false );
    SubLFiles.declareFunction( me, "explode_interval_ignoring_unevaluatable", "EXPLODE-INTERVAL-IGNORING-UNEVALUATABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "explode_interval", "EXPLODE-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "explode_fort_interval", "EXPLODE-FORT-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "max_quant_value", "MAX-QUANT-VALUE", 1, 1, false );
    SubLFiles.declareFunction( me, "min_quant_value", "MIN-QUANT-VALUE", 1, 1, false );
    SubLFiles.declareFunction( me, "comparable_units", "COMPARABLE-UNITS", 2, 0, false );
    SubLFiles.declareFunction( me, "smaller_unit_than", "SMALLER-UNIT-THAN", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_to_units", "CONVERT-TO-UNITS", 3, 1, false );
    SubLFiles.declareFunction( me, "convert_to_units_absolute", "CONVERT-TO-UNITS-ABSOLUTE", 3, 1, false );
    SubLFiles.declareFunction( me, "unit_multiplication_factor", "UNIT-MULTIPLICATION-FACTOR", 2, 1, false );
    SubLFiles.declareFunction( me, "get_unit_multiplication_factor", "GET-UNIT-MULTIPLICATION-FACTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_unit_absolute_scale_offset", "GET-UNIT-ABSOLUTE-SCALE-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_get_definitional_unit_multiplication_factor", "CLEAR-GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_definitional_unit_multiplication_factor", "REMOVE-GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_definitional_unit_multiplication_factor_internal", "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_definitional_unit_multiplication_factor", "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_contingent_unit_multiplication_factor", "GET-CONTINGENT-UNIT-MULTIPLICATION-FACTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_unit_multiplication_factor_int", "GET-UNIT-MULTIPLICATION-FACTOR-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "get_umf", "GET-UMF", 3, 0, false );
    SubLFiles.declareFunction( me, "get_umf_internal", "GET-UMF-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_umf_assertions", "GATHER-UMF-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_umf_gather_factor", "GET-UMF-GATHER-FACTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "unit_times", "UNIT-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "unit_quotient", "UNIT-QUOTIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "unit_sqrt", "UNIT-SQRT", 1, 0, false );
    SubLFiles.declareFunction( me, "complex_unit_times", "COMPLEX-UNIT-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "complex_per_fn_unit_times", "COMPLEX-PER-FN-UNIT-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "complex_unit_quotient", "COMPLEX-UNIT-QUOTIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "complex_per_fn_unit_quotient", "COMPLEX-PER-FN-UNIT-QUOTIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "complex_unit_sqrt", "COMPLEX-UNIT-SQRT", 1, 0, false );
    SubLFiles.declareFunction( me, "per_fn_unit", "PER-FN-UNIT", 1, 0, false );
    SubLFiles.declareFunction( me, "make_and_simplify_interval", "MAKE-AND-SIMPLIFY-INTERVAL", 2, 1, false );
    SubLFiles.declareFunction( me, "term_unify_with_units", "TERM-UNIFY-WITH-UNITS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_integer_range", "CYC-INTEGER-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_number_range", "CYC-NUMBER-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_plus_quantities", "CYC-PLUS-QUANTITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_plus_quantities_int", "CYC-PLUS-QUANTITIES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_minus_quantities", "CYC-MINUS-QUANTITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_quantity_conversion", "CYC-QUANTITY-CONVERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_quantity", "CONVERT-QUANTITY", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_quantity_conversion_absolute", "CYC-QUANTITY-CONVERSION-ABSOLUTE", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_quantity_absolute", "CONVERT-QUANTITY-ABSOLUTE", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_real_number_to_number", "CYCL-REAL-NUMBER-TO-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_times_quantities", "CYC-TIMES-QUANTITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_times_quantities_int", "CYC-TIMES-QUANTITIES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "fuzzy_numberP", "FUZZY-NUMBER?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_quotient", "CYC-QUOTIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_inverse", "CYC-INVERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_modulo", "CYC-MODULO", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_check_cyc_modulo", "SANITY-CHECK-CYC-MODULO", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_residue", "CYC-RESIDUE", 1, 0, false );
    SubLFiles.declareFunction( me, "quantity_congruence_base", "QUANTITY-CONGRUENCE-BASE", 1, 0, false );
    SubLFiles.declareFunction( me, "unit_of_measure_type", "UNIT-OF-MEASURE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_absolute_value", "CYC-ABSOLUTE-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_sqrt", "CYC-SQRT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_squared", "CYC-SQUARED", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_percent", "CYC-PERCENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_round_up", "CYC-ROUND-UP", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_round_closest", "CYC-ROUND-CLOSEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_round_down", "CYC-ROUND-DOWN", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_round_truncate", "CYC-ROUND-TRUNCATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_round_internal", "CYC-ROUND-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "round_to_nth_decimal", "ROUND-TO-NTH-DECIMAL", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_round_closest_to_nth_decimal", "CYC-ROUND-CLOSEST-TO-NTH-DECIMAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_max_range", "CYC-MAX-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_max_range_internal", "CYC-MAX-RANGE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_min_range", "CYC-MIN-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_min_range_internal", "CYC-MIN-RANGE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_min_quant_value", "CYC-MIN-QUANT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_max_quant_value", "CYC-MAX-QUANT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_quantity_unit", "CYC-QUANTITY-UNIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_quantity_measure", "CYC-QUANTITY-MEASURE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_tolerance", "CYC-TOLERANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_tolerance_internal", "CYC-TOLERANCE-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "cyc_significant_digits", "CYC-SIGNIFICANT-DIGITS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_sine", "CYC-SINE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_cosine", "CYC-COSINE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_tangent", "CYC-TANGENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_cosecant", "CYC-COSECANT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_secant", "CYC-SECANT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_cotangent", "CYC-COTANGENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_trig_internal", "CYC-TRIG-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_arc_sine", "CYC-ARC-SINE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_arc_cosine", "CYC-ARC-COSINE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_arc_tangent", "CYC-ARC-TANGENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_arc_cosecant", "CYC-ARC-COSECANT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_arc_secant", "CYC-ARC-SECANT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_arc_cotangent", "CYC-ARC-COTANGENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_inverse_trig_internal", "CYC-INVERSE-TRIG-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_logarithm", "CYC-LOGARITHM", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_exponent", "CYC-EXPONENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_quadratic_solution_positive", "CYC-QUADRATIC-SOLUTION-POSITIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_quadratic_solution_negative", "CYC-QUADRATIC-SOLUTION-NEGATIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_collection_subsumption_paths", "CYC-COLLECTION-SUBSUMPTION-PATHS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_predicate_subsumption_paths", "CYC-PREDICATE-SUBSUMPTION-PATHS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_less_than_quantities", "CYC-LESS-THAN-QUANTITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "negate_fraction", "NEGATE-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "following_valueP", "FOLLOWING-VALUE?", 2, 1, false );
    SubLFiles.declareFunction( me, "convert_fraction_to_real_number", "CONVERT-FRACTION-TO-REAL-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_fraction_to_simple_fraction", "CONVERT-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_mixed_fraction_to_simple_fraction", "CONVERT-MIXED-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_negative_mixed_fraction_to_simple_fraction", "CONVERT-NEGATIVE-MIXED-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_simple_fraction_to_mixed_fraction", "CONVERT-SIMPLE-FRACTION-TO-MIXED-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_simple_fraction_to_fraction", "CONVERT-SIMPLE-FRACTION-TO-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_mixed_fraction_to_simple_fraction_internal", "CONVERT-MIXED-FRACTION-TO-SIMPLE-FRACTION-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "convert_decimal_fraction_to_simple_fraction", "CONVERT-DECIMAL-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "fractionsL", "FRACTIONS<", 2, 0, false );
    SubLFiles.declareFunction( me, "fractionsLE", "FRACTIONS<=", 2, 0, false );
    SubLFiles.declareFunction( me, "normalize_fractions", "NORMALIZE-FRACTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_less_than_or_equal_to_quantities", "CYC-LESS-THAN-OR-EQUAL-TO-QUANTITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_quantity_subsumes", "CYC-QUANTITY-SUBSUMES", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_quantity_subsumes_proper_intervals", "CYC-QUANTITY-SUBSUMES-PROPER-INTERVALS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_quantity_intersects", "CYC-QUANTITY-INTERSECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_quantity_intersects_proper_intervals", "CYC-QUANTITY-INTERSECTS-PROPER-INTERVALS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_divides_evenly", "CYC-DIVIDES-EVENLY", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_nth", "CYC-LIST-NTH", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_concatenate", "CYC-LIST-CONCATENATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_append_to_list", "CYC-APPEND-TO-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_prepend_to_list", "CYC-PREPEND-TO-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_first", "CYC-LIST-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_second", "CYC-LIST-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_rest", "CYC-LIST-REST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_last", "CYC-LIST-LAST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_subseq", "CYC-LIST-SUBSEQ", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_subseq_up_to", "CYC-LIST-SUBSEQ-UP-TO", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_search", "CYC-LIST-SEARCH", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_position", "CYC-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_length", "CYC-LIST-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_reverse", "CYC-LIST-REVERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_member_set", "CYC-LIST-MEMBER-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_set_element_list", "CYC-SET-ELEMENT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_substitute_from_list", "CYC-SUBSTITUTE-FROM-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "doubleton_to_cons", "DOUBLETON-TO-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_substitute_from_the_term_binding_set", "CYC-SUBSTITUTE-FROM-THE-TERM-BINDING-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_remove_adjacent_duplicates_from_list_fn", "CYC-REMOVE-ADJACENT-DUPLICATES-FROM-LIST-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_over_list", "CYC-MAP-FUNCTION-OVER-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_int", "CYC-MAP-FUNCTION-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_over_list_until", "CYC-MAP-FUNCTION-OVER-LIST-UNTIL", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_until_int", "CYC-MAP-FUNCTION-UNTIL-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_over_list_until_result", "CYC-MAP-FUNCTION-OVER-LIST-UNTIL-RESULT", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_until_result_int", "CYC-MAP-FUNCTION-UNTIL-RESULT-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_with_args_over_lists", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS", 5, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_with_args_over_lists_int", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "cyc_apply_function_recursively", "CYC-APPLY-FUNCTION-RECURSIVELY", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_memberP", "CYC-LIST-MEMBER?", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_list_contains_memberP", "CYC-LIST-CONTAINS-MEMBER?", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_sublistP", "CYC-SUBLIST?", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_initial_sublistP", "CYC-INITIAL-SUBLIST?", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_non_empty_set_p", "CYC-NON-EMPTY-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_empty_set_p", "CYC-EMPTY-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_set_p", "CYC-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extensional_set_p", "EXTENSIONAL-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "intensional_set_p", "INTENSIONAL-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_hl_extensional_set", "MAKE-HL-EXTENSIONAL-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluate_set_elements", "EVALUATE-SET-ELEMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "set_extent", "SET-EXTENT", 1, 2, false );
    SubLFiles.declareFunction( me, "cyc_set_intersection", "CYC-SET-INTERSECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_set_union", "CYC-SET-UNION", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_set_difference", "CYC-SET-DIFFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_set_extent", "CYC-SET-EXTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_map_function_over_set", "CYC-MAP-FUNCTION-OVER-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_least_common_multiple", "CYC-LEAST-COMMON-MULTIPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_least_common_multiple_internal", "CYC-LEAST-COMMON-MULTIPLE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_greatest_common_divisor", "CYC-GREATEST-COMMON-DIVISOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_greatest_common_divisor_internal", "CYC-GREATEST-COMMON-DIVISOR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "integer_valuedP", "INTEGER-VALUED?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_random_integer", "CYC-RANDOM-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_random_integer_with_seed", "CYC-RANDOM-INTEGER-WITH-SEED", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_n_random_integers", "CYC-N-RANDOM-INTEGERS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_matrix_solution", "CYC-MATRIX-SOLUTION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_interconvertible_units_of_measure", "GET-INTERCONVERTIBLE-UNITS-OF-MEASURE", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_quantities_file()
  {
    $convert_units_as_absolutesP$ = SubLFiles.defparameter( "*CONVERT-UNITS-AS-ABSOLUTES?*", NIL );
    $quant_core_constants$ = SubLFiles.deflexical( "*QUANT-CORE-CONSTANTS*", $list0 );
    $get_umf_search_state$ = SubLFiles.defparameter( "*GET-UMF-SEARCH-STATE*", NIL );
    $get_umf_paths$ = SubLFiles.defparameter( "*GET-UMF-PATHS*", NIL );
    $get_umf_allow_fractionsP$ = SubLFiles.defparameter( "*GET-UMF-ALLOW-FRACTIONS?*", NIL );
    $get_definitional_unit_multiplication_factor_caching_state$ = SubLFiles.deflexical( "*GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR-CACHING-STATE*", NIL );
    $round_nth_n$ = SubLFiles.defparameter( "*ROUND-NTH-N*", ZERO_INTEGER );
    $round_nth_output_format$ = SubLFiles.defparameter( "*ROUND-NTH-OUTPUT-FORMAT*", $kw63$SUBL );
    return NIL;
  }

  public static SubLObject setup_quantities_file()
  {
    memoization_state.note_globally_cached_function( $sym13$GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR );
    if( $sym25$CYC_INTEGER_RANGE.isSymbol() )
    {
      final SubLObject item_var = $sym25$CYC_INTEGER_RANGE;
      if( NIL == conses_high.member( item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        at_vars.$at_collection_specific_defns$.setDynamicValue( ConsesLow.cons( item_var, at_vars.$at_collection_specific_defns$.getDynamicValue() ) );
      }
    }
    utilities_macros.register_kb_function( $sym25$CYC_INTEGER_RANGE );
    if( $sym28$CYC_NUMBER_RANGE.isSymbol() )
    {
      final SubLObject item_var = $sym28$CYC_NUMBER_RANGE;
      if( NIL == conses_high.member( item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        at_vars.$at_collection_specific_defns$.setDynamicValue( ConsesLow.cons( item_var, at_vars.$at_collection_specific_defns$.getDynamicValue() ) );
      }
    }
    utilities_macros.register_kb_function( $sym28$CYC_NUMBER_RANGE );
    utilities_macros.register_kb_function( $sym34$CYC_QUANTITY_CONVERSION );
    utilities_macros.register_kb_function( $sym35$CYC_QUANTITY_CONVERSION_ABSOLUTE );
    utilities_macros.register_kb_function( $sym41$CYC_QUOTIENT );
    utilities_macros.register_kb_function( $sym42$CYC_INVERSE );
    utilities_macros.register_kb_function( $sym43$CYC_MODULO );
    utilities_macros.register_kb_function( $sym45$CYC_RESIDUE );
    utilities_macros.register_kb_function( $sym49$CYC_ABSOLUTE_VALUE );
    utilities_macros.register_kb_function( $sym50$CYC_SQRT );
    utilities_macros.register_kb_function( $sym51$CYC_SQUARED );
    utilities_macros.register_kb_function( $sym54$CYC_PERCENT );
    utilities_macros.register_kb_function( $sym56$CYC_ROUND_UP );
    utilities_macros.register_kb_function( $sym58$CYC_ROUND_CLOSEST );
    utilities_macros.register_kb_function( $sym60$CYC_ROUND_DOWN );
    utilities_macros.register_kb_function( $sym62$CYC_ROUND_TRUNCATE );
    utilities_macros.register_kb_function( $sym69$CYC_ROUND_CLOSEST_TO_NTH_DECIMAL );
    utilities_macros.register_kb_function( $sym71$CYC_MAX_RANGE );
    utilities_macros.register_kb_function( $sym73$CYC_MIN_RANGE );
    utilities_macros.register_kb_function( $sym74$CYC_MIN_QUANT_VALUE );
    utilities_macros.register_kb_function( $sym75$CYC_MAX_QUANT_VALUE );
    utilities_macros.register_kb_function( $sym76$CYC_QUANTITY_UNIT );
    utilities_macros.register_kb_function( $sym77$CYC_QUANTITY_MEASURE );
    utilities_macros.register_kb_function( $sym78$CYC_TOLERANCE );
    utilities_macros.register_kb_function( $sym79$CYC_SIGNIFICANT_DIGITS );
    utilities_macros.register_kb_function( $sym81$CYC_SINE );
    utilities_macros.register_kb_function( $sym83$CYC_COSINE );
    utilities_macros.register_kb_function( $sym85$CYC_TANGENT );
    utilities_macros.register_kb_function( $sym86$CYC_COSECANT );
    utilities_macros.register_kb_function( $sym87$CYC_SECANT );
    utilities_macros.register_kb_function( $sym88$CYC_COTANGENT );
    utilities_macros.register_kb_function( $sym91$CYC_ARC_SINE );
    utilities_macros.register_kb_function( $sym93$CYC_ARC_COSINE );
    utilities_macros.register_kb_function( $sym95$CYC_ARC_TANGENT );
    utilities_macros.register_kb_function( $sym96$CYC_ARC_COSECANT );
    utilities_macros.register_kb_function( $sym97$CYC_ARC_SECANT );
    utilities_macros.register_kb_function( $sym98$CYC_ARC_COTANGENT );
    utilities_macros.register_kb_function( $sym99$CYC_LOGARITHM );
    utilities_macros.register_kb_function( $sym100$CYC_EXPONENT );
    utilities_macros.register_kb_function( $sym101$CYC_QUADRATIC_SOLUTION_POSITIVE );
    utilities_macros.register_kb_function( $sym102$CYC_QUADRATIC_SOLUTION_NEGATIVE );
    utilities_macros.register_kb_function( $sym105$CYC_COLLECTION_SUBSUMPTION_PATHS );
    utilities_macros.register_kb_function( $sym106$CYC_PREDICATE_SUBSUMPTION_PATHS );
    utilities_macros.register_kb_function( $sym118$CYC_QUANTITY_SUBSUMES );
    utilities_macros.register_kb_function( $sym120$CYC_QUANTITY_INTERSECTS );
    utilities_macros.register_kb_function( $sym121$CYC_DIVIDES_EVENLY );
    utilities_macros.register_kb_function( $sym122$CYC_LIST_NTH );
    utilities_macros.register_kb_function( $sym126$CYC_LIST_CONCATENATE );
    utilities_macros.register_kb_function( $sym127$CYC_APPEND_TO_LIST );
    utilities_macros.register_kb_function( $sym128$CYC_PREPEND_TO_LIST );
    utilities_macros.register_kb_function( $sym129$CYC_LIST_FIRST );
    utilities_macros.register_kb_function( $sym130$CYC_LIST_SECOND );
    utilities_macros.register_kb_function( $sym131$CYC_LIST_REST );
    utilities_macros.register_kb_function( $sym132$CYC_LIST_LAST );
    utilities_macros.register_kb_function( $sym133$CYC_LIST_SUBSEQ );
    utilities_macros.register_kb_function( $sym135$CYC_LIST_SUBSEQ_UP_TO );
    utilities_macros.register_kb_function( $sym136$CYC_LIST_SEARCH );
    utilities_macros.register_kb_function( $sym137$CYC_POSITION );
    utilities_macros.register_kb_function( $sym138$CYC_LIST_LENGTH );
    utilities_macros.register_kb_function( $sym139$CYC_LIST_REVERSE );
    utilities_macros.register_kb_function( $sym140$CYC_LIST_MEMBER_SET );
    utilities_macros.register_kb_function( $sym141$CYC_SET_ELEMENT_LIST );
    utilities_macros.register_kb_function( $sym144$CYC_SUBSTITUTE_FROM_LIST );
    utilities_macros.register_kb_function( $sym146$CYC_SUBSTITUTE_FROM_THE_TERM_BINDING_SET );
    utilities_macros.register_kb_function( $sym147$CYC_REMOVE_ADJACENT_DUPLICATES_FROM_LIST_FN );
    utilities_macros.register_kb_function( $sym148$CYC_MAP_FUNCTION_OVER_LIST );
    utilities_macros.register_kb_function( $sym149$CYC_MAP_FUNCTION_OVER_LIST_UNTIL );
    utilities_macros.register_kb_function( $sym150$CYC_MAP_FUNCTION_OVER_LIST_UNTIL_RESULT );
    utilities_macros.register_kb_function( $sym151$CYC_MAP_FUNCTION_WITH_ARGS_OVER_LISTS );
    utilities_macros.register_kb_function( $sym153$CYC_APPLY_FUNCTION_RECURSIVELY );
    utilities_macros.register_kb_function( $sym154$CYC_LIST_MEMBER_ );
    access_macros.define_obsolete_register( $sym155$CYC_LIST_CONTAINS_MEMBER_, $list156 );
    utilities_macros.register_kb_function( $sym157$CYC_SUBLIST_ );
    utilities_macros.register_kb_function( $sym158$CYC_INITIAL_SUBLIST_ );
    utilities_macros.register_kb_function( $sym161$CYC_SET_INTERSECTION );
    utilities_macros.register_kb_function( $sym162$CYC_SET_UNION );
    utilities_macros.register_kb_function( $sym163$CYC_SET_DIFFERENCE );
    utilities_macros.register_kb_function( $sym166$CYC_SET_EXTENT );
    utilities_macros.register_kb_function( $sym167$CYC_MAP_FUNCTION_OVER_SET );
    utilities_macros.register_kb_function( $sym169$CYC_LEAST_COMMON_MULTIPLE );
    utilities_macros.register_kb_function( $sym171$CYC_GREATEST_COMMON_DIVISOR );
    utilities_macros.register_kb_function( $sym172$CYC_RANDOM_INTEGER );
    utilities_macros.register_kb_function( $sym178$CYC_RANDOM_INTEGER_WITH_SEED );
    utilities_macros.register_kb_function( $sym180$CYC_N_RANDOM_INTEGERS );
    utilities_macros.register_kb_function( $sym181$CYC_MATRIX_SOLUTION );
    access_macros.register_external_symbol( $sym182$GET_INTERCONVERTIBLE_UNITS_OF_MEASURE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_quantities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_quantities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_quantities_file();
  }
  static
  {
    me = new quantities();
    $convert_units_as_absolutesP$ = null;
    $quant_core_constants$ = null;
    $get_umf_search_state$ = null;
    $get_umf_paths$ = null;
    $get_umf_allow_fractionsP$ = null;
    $get_definitional_unit_multiplication_factor_caching_state$ = null;
    $round_nth_n$ = null;
    $round_nth_output_format$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "IntervalMinFn" ) ), constant_handles.reader_make_constant_shell( makeString( "IntervalMaxFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Unity" ) ), constant_handles.reader_make_constant_shell( makeString( "UnitOfMeasure" ) ), constant_handles.reader_make_constant_shell( makeString( "maxQuantValue" ) ),
      constant_handles.reader_make_constant_shell( makeString( "minQuantValue" ) ), constant_handles.reader_make_constant_shell( makeString( "unitMultiplicationFactor" ) ), constant_handles.reader_make_constant_shell(
          makeString( "multiplicationUnits" ) ), constant_handles.reader_make_constant_shell( makeString( "PerFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles
              .reader_make_constant_shell( makeString( "TheSetOf" ) ), constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "thereExistAtMost" ) ), constant_handles.reader_make_constant_shell( makeString( "thereExistExactly" ) )
    } );
    $sym1$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $const2$ScalarInterval = constant_handles.reader_make_constant_shell( makeString( "ScalarInterval" ) );
    $sym3$CYC_SCALAR_INTERVAL_P = makeSymbol( "CYC-SCALAR-INTERVAL-P" );
    $str4$A_KB_dependent_numerical_quantifi = makeString( "A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification." );
    $const5$Unity = constant_handles.reader_make_constant_shell( makeString( "Unity" ) );
    $kw6$UNEVALUATABLE = makeKeyword( "UNEVALUATABLE" );
    $sym7$_EXIT = makeSymbol( "%EXIT" );
    $sym8$FORT_P = makeSymbol( "FORT-P" );
    $const9$maxQuantValue = constant_handles.reader_make_constant_shell( makeString( "maxQuantValue" ) );
    $const10$minQuantValue = constant_handles.reader_make_constant_shell( makeString( "minQuantValue" ) );
    $const11$unitAbsoluteScaleOffset = constant_handles.reader_make_constant_shell( makeString( "unitAbsoluteScaleOffset" ) );
    $kw12$GAF = makeKeyword( "GAF" );
    $sym13$GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR = makeSymbol( "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR" );
    $sym14$_GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR_CACHING_STATE_ = makeSymbol( "*GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR-CACHING-STATE*" );
    $list15 = ConsesLow.list( makeSymbol( "ARG1-UNIT" ), makeSymbol( "ARG2-UNIT" ), makeSymbol( "RAW-FACTOR" ) );
    $sym16$CAR = makeSymbol( "CAR" );
    $const17$unitMultiplicationFactor = constant_handles.reader_make_constant_shell( makeString( "unitMultiplicationFactor" ) );
    $str18$Link_not_found_ = makeString( "Link not found!" );
    $list19 = ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "PREVIOUS-UNIT" ), makeSymbol( "FACTOR" ) );
    $str20$No_previous_unit_ = makeString( "No previous unit." );
    $const21$multiplicationUnits = constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) );
    $const22$PerFn = constant_handles.reader_make_constant_shell( makeString( "PerFn" ) );
    $list23 = ConsesLow.list( makeSymbol( "UNIT1" ), makeSymbol( "MIN1" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MAX1" ) );
    $list24 = ConsesLow.list( makeSymbol( "UNIT2" ), makeSymbol( "MIN2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MAX2" ) );
    $sym25$CYC_INTEGER_RANGE = makeSymbol( "CYC-INTEGER-RANGE" );
    $const26$integerRange = constant_handles.reader_make_constant_shell( makeString( "integerRange" ) );
    $const27$quantitySubsumes = constant_handles.reader_make_constant_shell( makeString( "quantitySubsumes" ) );
    $sym28$CYC_NUMBER_RANGE = makeSymbol( "CYC-NUMBER-RANGE" );
    $const29$numberRange = constant_handles.reader_make_constant_shell( makeString( "numberRange" ) );
    $sym30$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym31$FUZZY_NUMBER_ = makeSymbol( "FUZZY-NUMBER?" );
    $const32$PlusFn = constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) );
    $const33$IntervalOnNumberLine = constant_handles.reader_make_constant_shell( makeString( "IntervalOnNumberLine" ) );
    $sym34$CYC_QUANTITY_CONVERSION = makeSymbol( "CYC-QUANTITY-CONVERSION" );
    $sym35$CYC_QUANTITY_CONVERSION_ABSOLUTE = makeSymbol( "CYC-QUANTITY-CONVERSION-ABSOLUTE" );
    $const36$TimesFn = constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) );
    $const37$IntegerExtent = constant_handles.reader_make_constant_shell( makeString( "IntegerExtent" ) );
    $const38$ScalarPointValue = constant_handles.reader_make_constant_shell( makeString( "ScalarPointValue" ) );
    $kw39$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym40$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym41$CYC_QUOTIENT = makeSymbol( "CYC-QUOTIENT" );
    $sym42$CYC_INVERSE = makeSymbol( "CYC-INVERSE" );
    $sym43$CYC_MODULO = makeSymbol( "CYC-MODULO" );
    $str44$Got__S___Wanted__S = makeString( "Got ~S~% Wanted ~S" );
    $sym45$CYC_RESIDUE = makeSymbol( "CYC-RESIDUE" );
    $const46$quantityCongruenceBase = constant_handles.reader_make_constant_shell( makeString( "quantityCongruenceBase" ) );
    $kw47$TRUE = makeKeyword( "TRUE" );
    $const48$MeasurableQuantityType = constant_handles.reader_make_constant_shell( makeString( "MeasurableQuantityType" ) );
    $sym49$CYC_ABSOLUTE_VALUE = makeSymbol( "CYC-ABSOLUTE-VALUE" );
    $sym50$CYC_SQRT = makeSymbol( "CYC-SQRT" );
    $sym51$CYC_SQUARED = makeSymbol( "CYC-SQUARED" );
    $list52 = ConsesLow.list( makeSymbol( "MIN" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MAX" ), makeSymbol( "MIN" ) ) );
    $int53$100 = makeInteger( 100 );
    $sym54$CYC_PERCENT = makeSymbol( "CYC-PERCENT" );
    $sym55$CEILING = makeSymbol( "CEILING" );
    $sym56$CYC_ROUND_UP = makeSymbol( "CYC-ROUND-UP" );
    $sym57$ROUND = makeSymbol( "ROUND" );
    $sym58$CYC_ROUND_CLOSEST = makeSymbol( "CYC-ROUND-CLOSEST" );
    $sym59$FLOOR = makeSymbol( "FLOOR" );
    $sym60$CYC_ROUND_DOWN = makeSymbol( "CYC-ROUND-DOWN" );
    $sym61$TRUNCATE = makeSymbol( "TRUNCATE" );
    $sym62$CYC_ROUND_TRUNCATE = makeSymbol( "CYC-ROUND-TRUNCATE" );
    $kw63$SUBL = makeKeyword( "SUBL" );
    $sym64$NUMBERP = makeSymbol( "NUMBERP" );
    $sym65$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $kw66$CYCL = makeKeyword( "CYCL" );
    $const67$DecimalFractionFn = constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) );
    $sym68$ROUND_TO_NTH_DECIMAL = makeSymbol( "ROUND-TO-NTH-DECIMAL" );
    $sym69$CYC_ROUND_CLOSEST_TO_NTH_DECIMAL = makeSymbol( "CYC-ROUND-CLOSEST-TO-NTH-DECIMAL" );
    $sym70$CYC_MAX_RANGE_INTERNAL = makeSymbol( "CYC-MAX-RANGE-INTERNAL" );
    $sym71$CYC_MAX_RANGE = makeSymbol( "CYC-MAX-RANGE" );
    $sym72$CYC_MIN_RANGE_INTERNAL = makeSymbol( "CYC-MIN-RANGE-INTERNAL" );
    $sym73$CYC_MIN_RANGE = makeSymbol( "CYC-MIN-RANGE" );
    $sym74$CYC_MIN_QUANT_VALUE = makeSymbol( "CYC-MIN-QUANT-VALUE" );
    $sym75$CYC_MAX_QUANT_VALUE = makeSymbol( "CYC-MAX-QUANT-VALUE" );
    $sym76$CYC_QUANTITY_UNIT = makeSymbol( "CYC-QUANTITY-UNIT" );
    $sym77$CYC_QUANTITY_MEASURE = makeSymbol( "CYC-QUANTITY-MEASURE" );
    $sym78$CYC_TOLERANCE = makeSymbol( "CYC-TOLERANCE" );
    $sym79$CYC_SIGNIFICANT_DIGITS = makeSymbol( "CYC-SIGNIFICANT-DIGITS" );
    $sym80$SIN = makeSymbol( "SIN" );
    $sym81$CYC_SINE = makeSymbol( "CYC-SINE" );
    $sym82$COS = makeSymbol( "COS" );
    $sym83$CYC_COSINE = makeSymbol( "CYC-COSINE" );
    $sym84$TAN = makeSymbol( "TAN" );
    $sym85$CYC_TANGENT = makeSymbol( "CYC-TANGENT" );
    $sym86$CYC_COSECANT = makeSymbol( "CYC-COSECANT" );
    $sym87$CYC_SECANT = makeSymbol( "CYC-SECANT" );
    $sym88$CYC_COTANGENT = makeSymbol( "CYC-COTANGENT" );
    $const89$Radian = constant_handles.reader_make_constant_shell( makeString( "Radian" ) );
    $sym90$ASIN = makeSymbol( "ASIN" );
    $sym91$CYC_ARC_SINE = makeSymbol( "CYC-ARC-SINE" );
    $sym92$ACOS = makeSymbol( "ACOS" );
    $sym93$CYC_ARC_COSINE = makeSymbol( "CYC-ARC-COSINE" );
    $sym94$ATAN = makeSymbol( "ATAN" );
    $sym95$CYC_ARC_TANGENT = makeSymbol( "CYC-ARC-TANGENT" );
    $sym96$CYC_ARC_COSECANT = makeSymbol( "CYC-ARC-COSECANT" );
    $sym97$CYC_ARC_SECANT = makeSymbol( "CYC-ARC-SECANT" );
    $sym98$CYC_ARC_COTANGENT = makeSymbol( "CYC-ARC-COTANGENT" );
    $sym99$CYC_LOGARITHM = makeSymbol( "CYC-LOGARITHM" );
    $sym100$CYC_EXPONENT = makeSymbol( "CYC-EXPONENT" );
    $sym101$CYC_QUADRATIC_SOLUTION_POSITIVE = makeSymbol( "CYC-QUADRATIC-SOLUTION-POSITIVE" );
    $sym102$CYC_QUADRATIC_SOLUTION_NEGATIVE = makeSymbol( "CYC-QUADRATIC-SOLUTION-NEGATIVE" );
    $kw103$HL = makeKeyword( "HL" );
    $sym104$MAKE_EL_LIST = makeSymbol( "MAKE-EL-LIST" );
    $sym105$CYC_COLLECTION_SUBSUMPTION_PATHS = makeSymbol( "CYC-COLLECTION-SUBSUMPTION-PATHS" );
    $sym106$CYC_PREDICATE_SUBSUMPTION_PATHS = makeSymbol( "CYC-PREDICATE-SUBSUMPTION-PATHS" );
    $const107$greaterThan = constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) );
    $sym108$FRACTION_ = makeSymbol( "FRACTION?" );
    $const109$NegativeMixedFractionFn = constant_handles.reader_make_constant_shell( makeString( "NegativeMixedFractionFn" ) );
    $const110$MixedFractionFn = constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) );
    $str111$Can_t_negate__S = makeString( "Can't negate ~S" );
    $const112$followingValue = constant_handles.reader_make_constant_shell( makeString( "followingValue" ) );
    $list113 = ConsesLow.list( makeSymbol( "WHOLE" ), makeSymbol( "NUMERATOR" ), makeSymbol( "DENOMINATOR" ) );
    $list114 = ConsesLow.list( makeSymbol( "NUMERATOR" ), makeSymbol( "DENOMINATOR" ) );
    $sym115$SIMPLE_FRACTION_ = makeSymbol( "SIMPLE-FRACTION?" );
    $const116$SimpleFractionFn = constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) );
    $const117$greaterThanOrEqualTo = constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) );
    $sym118$CYC_QUANTITY_SUBSUMES = makeSymbol( "CYC-QUANTITY-SUBSUMES" );
    $const119$quantityIntersects = constant_handles.reader_make_constant_shell( makeString( "quantityIntersects" ) );
    $sym120$CYC_QUANTITY_INTERSECTS = makeSymbol( "CYC-QUANTITY-INTERSECTS" );
    $sym121$CYC_DIVIDES_EVENLY = makeSymbol( "CYC-DIVIDES-EVENLY" );
    $sym122$CYC_LIST_NTH = makeSymbol( "CYC-LIST-NTH" );
    $sym123$EL_LIST_P = makeSymbol( "EL-LIST-P" );
    $sym124$APPEND = makeSymbol( "APPEND" );
    $sym125$EL_LIST_ITEMS = makeSymbol( "EL-LIST-ITEMS" );
    $sym126$CYC_LIST_CONCATENATE = makeSymbol( "CYC-LIST-CONCATENATE" );
    $sym127$CYC_APPEND_TO_LIST = makeSymbol( "CYC-APPEND-TO-LIST" );
    $sym128$CYC_PREPEND_TO_LIST = makeSymbol( "CYC-PREPEND-TO-LIST" );
    $sym129$CYC_LIST_FIRST = makeSymbol( "CYC-LIST-FIRST" );
    $sym130$CYC_LIST_SECOND = makeSymbol( "CYC-LIST-SECOND" );
    $sym131$CYC_LIST_REST = makeSymbol( "CYC-LIST-REST" );
    $sym132$CYC_LIST_LAST = makeSymbol( "CYC-LIST-LAST" );
    $sym133$CYC_LIST_SUBSEQ = makeSymbol( "CYC-LIST-SUBSEQ" );
    $const134$TheEmptyList = constant_handles.reader_make_constant_shell( makeString( "TheEmptyList" ) );
    $sym135$CYC_LIST_SUBSEQ_UP_TO = makeSymbol( "CYC-LIST-SUBSEQ-UP-TO" );
    $sym136$CYC_LIST_SEARCH = makeSymbol( "CYC-LIST-SEARCH" );
    $sym137$CYC_POSITION = makeSymbol( "CYC-POSITION" );
    $sym138$CYC_LIST_LENGTH = makeSymbol( "CYC-LIST-LENGTH" );
    $sym139$CYC_LIST_REVERSE = makeSymbol( "CYC-LIST-REVERSE" );
    $sym140$CYC_LIST_MEMBER_SET = makeSymbol( "CYC-LIST-MEMBER-SET" );
    $sym141$CYC_SET_ELEMENT_LIST = makeSymbol( "CYC-SET-ELEMENT-LIST" );
    $sym142$DOUBLETON_ = makeSymbol( "DOUBLETON?" );
    $sym143$DOUBLETON_TO_CONS = makeSymbol( "DOUBLETON-TO-CONS" );
    $sym144$CYC_SUBSTITUTE_FROM_LIST = makeSymbol( "CYC-SUBSTITUTE-FROM-LIST" );
    $list145 = ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ) );
    $sym146$CYC_SUBSTITUTE_FROM_THE_TERM_BINDING_SET = makeSymbol( "CYC-SUBSTITUTE-FROM-THE-TERM-BINDING-SET" );
    $sym147$CYC_REMOVE_ADJACENT_DUPLICATES_FROM_LIST_FN = makeSymbol( "CYC-REMOVE-ADJACENT-DUPLICATES-FROM-LIST-FN" );
    $sym148$CYC_MAP_FUNCTION_OVER_LIST = makeSymbol( "CYC-MAP-FUNCTION-OVER-LIST" );
    $sym149$CYC_MAP_FUNCTION_OVER_LIST_UNTIL = makeSymbol( "CYC-MAP-FUNCTION-OVER-LIST-UNTIL" );
    $sym150$CYC_MAP_FUNCTION_OVER_LIST_UNTIL_RESULT = makeSymbol( "CYC-MAP-FUNCTION-OVER-LIST-UNTIL-RESULT" );
    $sym151$CYC_MAP_FUNCTION_WITH_ARGS_OVER_LISTS = makeSymbol( "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS" );
    $sym152$MAX = makeSymbol( "MAX" );
    $sym153$CYC_APPLY_FUNCTION_RECURSIVELY = makeSymbol( "CYC-APPLY-FUNCTION-RECURSIVELY" );
    $sym154$CYC_LIST_MEMBER_ = makeSymbol( "CYC-LIST-MEMBER?" );
    $sym155$CYC_LIST_CONTAINS_MEMBER_ = makeSymbol( "CYC-LIST-CONTAINS-MEMBER?" );
    $list156 = ConsesLow.list( makeSymbol( "CYC-LIST-MEMBER?" ) );
    $sym157$CYC_SUBLIST_ = makeSymbol( "CYC-SUBLIST?" );
    $sym158$CYC_INITIAL_SUBLIST_ = makeSymbol( "CYC-INITIAL-SUBLIST?" );
    $kw159$EL = makeKeyword( "EL" );
    $str160$Don_t_know_how_to_determine_the_e = makeString( "Don't know how to determine the extent of ~S in ~S" );
    $sym161$CYC_SET_INTERSECTION = makeSymbol( "CYC-SET-INTERSECTION" );
    $sym162$CYC_SET_UNION = makeSymbol( "CYC-SET-UNION" );
    $sym163$CYC_SET_DIFFERENCE = makeSymbol( "CYC-SET-DIFFERENCE" );
    $const164$TheEmptySet = constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) );
    $const165$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $sym166$CYC_SET_EXTENT = makeSymbol( "CYC-SET-EXTENT" );
    $sym167$CYC_MAP_FUNCTION_OVER_SET = makeSymbol( "CYC-MAP-FUNCTION-OVER-SET" );
    $sym168$CYC_LEAST_COMMON_MULTIPLE_INTERNAL = makeSymbol( "CYC-LEAST-COMMON-MULTIPLE-INTERNAL" );
    $sym169$CYC_LEAST_COMMON_MULTIPLE = makeSymbol( "CYC-LEAST-COMMON-MULTIPLE" );
    $sym170$CYC_GREATEST_COMMON_DIVISOR_INTERNAL = makeSymbol( "CYC-GREATEST-COMMON-DIVISOR-INTERNAL" );
    $sym171$CYC_GREATEST_COMMON_DIVISOR = makeSymbol( "CYC-GREATEST-COMMON-DIVISOR" );
    $sym172$CYC_RANDOM_INTEGER = makeSymbol( "CYC-RANDOM-INTEGER" );
    $int173$21 = makeInteger( 21 );
    $int174$_24 = makeInteger( -24 );
    $int175$_14 = makeInteger( -14 );
    $int176$_28 = makeInteger( -28 );
    $int177$31 = makeInteger( 31 );
    $sym178$CYC_RANDOM_INTEGER_WITH_SEED = makeSymbol( "CYC-RANDOM-INTEGER-WITH-SEED" );
    $sym179$ARITHMETIC_ANSWER = makeSymbol( "ARITHMETIC-ANSWER" );
    $sym180$CYC_N_RANDOM_INTEGERS = makeSymbol( "CYC-N-RANDOM-INTEGERS" );
    $sym181$CYC_MATRIX_SOLUTION = makeSymbol( "CYC-MATRIX-SOLUTION" );
    $sym182$GET_INTERCONVERTIBLE_UNITS_OF_MEASURE = makeSymbol( "GET-INTERCONVERTIBLE-UNITS-OF-MEASURE" );
    $sym183$FALSE = makeSymbol( "FALSE" );
    $list184 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?U" ), constant_handles
        .reader_make_constant_shell( makeString( "UnitOfMeasureNoPrefix" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?UT" ), constant_handles
            .reader_make_constant_shell( makeString( "InterconvertibleUnitType" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?U" ), makeSymbol( "?UT" ) ) );
    $const185$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $list186 = ConsesLow.list( new SubLObject[] { makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ), makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL, makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" ),
      makeKeyword( "COMPUTE-INTERSECTION" ), makeKeyword( "MAX-TIME" ), makeInteger( 30 ), makeKeyword( "RESULT-UNIQUENESS" ), makeKeyword( "BINDINGS" ), makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), makeDouble( 1.0 ),
      makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeSymbol( "?UT" ), makeSymbol( "?U" ) ) )
    } );
    $list187 = ConsesLow.list( makeSymbol( "UNIT-TYPE" ), makeSymbol( "UNIT" ) );
  }
}
/*
 * 
 * Total time: 1197 ms
 * 
 */