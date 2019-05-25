package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class extended_numbers
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.extended_numbers";
  public static final String myFingerPrint = "f6e33b34af15215ed123e551dcb50f7ad5cb69084a16422129b7943d6c12298b";
  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 612L)
  private static SubLSymbol $fraction_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 1221L)
  public static SubLSymbol $include_fractions_in_extended_numbersP$;
  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 15248L)
  private static SubLSymbol $check_new_vs_old_extended_number_mathP$;
  private static final SubLSymbol $sym0$CYC_EXTENDED_NUMBER_P;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$VALID_CONSTANT_;
  private static final SubLSymbol $sym3$EXTENDED_NUMBER_P;
  private static final SubLObject $const4$PlusInfinity;
  private static final SubLObject $const5$MinusInfinity;
  private static final SubLSymbol $sym6$POSSIBLY_INFINITE_OR_EXTENDED_NUMBER_P;
  private static final SubLString $str7$___TimesFn__S__S_______Old___S___;
  private static final SubLString $str8$___QuotientFn__S__S_______Old___S;
  private static final SubLString $str9$___PlusFn__S__S_______Old___S___N;
  private static final SubLString $str10$___MinusFn__S__S_______Old___S___;
  private static final SubLSymbol $sym11$NON_DOTTED_LIST_P;
  private static final SubLString $str12$Raising__S_to_the_power__S_would_;
  private static final SubLString $str13$Can_t_do_modulo_with_0_base_;
  private static final SubLString $str14$Looks_like_not_enough_significant;
  private static final SubLInteger $int15$1000;
  private static final SubLSymbol $sym16$TEST_ZEROP;
  private static final SubLSymbol $kw17$TEST;
  private static final SubLSymbol $kw18$OWNER;
  private static final SubLSymbol $kw19$CLASSES;
  private static final SubLSymbol $kw20$KB;
  private static final SubLSymbol $kw21$FULL;
  private static final SubLSymbol $kw22$WORKING_;
  private static final SubLList $list23;

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 456L)
  public static SubLObject cyc_extended_number_p(final SubLObject v_object)
  {
    return extended_number_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 856L)
  public static SubLObject initialize_fraction_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym2$VALID_CONSTANT_, $fraction_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_fraction_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_fraction_kb_loaded();
    }
    return kb_control_vars.fraction_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 1394L)
  public static SubLObject include_fractions_in_extended_numbersP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $include_fractions_in_extended_numbersP$.getDynamicValue( thread ) && NIL != kb_control_vars.fraction_kb_loaded_p() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 1531L)
  public static SubLObject extended_number_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isNumber() || NIL != scientific_numbers.scientific_number_p( v_object ) || ( NIL != include_fractions_in_extended_numbersP() && ( NIL != fraction_utilities.fraction_p( v_object )
        || NIL != collection_defns.fractionP( v_object, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 1797L)
  public static SubLObject extended_number_zero_p(final SubLObject ex_num)
  {
    if( NIL == extended_number_p( ex_num ) )
    {
      return NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_numbers.scientific_number_zero_p( ex_num );
    }
    if( ex_num.isNumber() )
    {
      return Numbers.zerop( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_zero_p( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      return extended_number_zero_p( math_expression_utilities.fraction_from_el( ex_num ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 2275L)
  public static SubLObject extended_number_minus_p(final SubLObject ex_num)
  {
    if( NIL == extended_number_p( ex_num ) )
    {
      return NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_numbers.scientific_number_minus_p( ex_num );
    }
    if( ex_num.isNumber() )
    {
      return Numbers.minusp( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_minus_p( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      return extended_number_minus_p( math_expression_utilities.fraction_from_el( ex_num ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 2758L)
  public static SubLObject extended_number_plus_p(final SubLObject ex_num)
  {
    if( NIL == extended_number_p( ex_num ) )
    {
      return NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_numbers.scientific_number_plus_p( ex_num );
    }
    if( ex_num.isNumber() )
    {
      return Numbers.plusp( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_plus_p( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      return extended_number_plus_p( math_expression_utilities.fraction_from_el( ex_num ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 3236L)
  public static SubLObject extended_number_non_negative_p(final SubLObject ex_num)
  {
    if( NIL == extended_number_p( ex_num ) )
    {
      return NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_numbers.scientific_number_non_negative_p( ex_num );
    }
    if( ex_num.isNumber() )
    {
      return number_utilities.non_negative_number_p( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() )
    {
      return makeBoolean( NIL == extended_number_minus_p( ex_num ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 3601L)
  public static SubLObject extended_number_integer_p(final SubLObject ex_num)
  {
    if( NIL == extended_number_p( ex_num ) )
    {
      return NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_numbers.scientific_number_integer_p( ex_num );
    }
    if( ex_num.isNumber() )
    {
      return Types.integerp( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_integer_p( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      return extended_number_integer_p( math_expression_utilities.fraction_from_el( ex_num ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 4094L)
  public static SubLObject extended_number_abs(final SubLObject ex_num)
  {
    assert NIL != extended_number_p( ex_num ) : ex_num;
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_number_utilities.scientific_number_abs( ex_num );
    }
    if( ex_num.isNumber() )
    {
      return Numbers.abs( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      return fraction_or_number_to_el( extended_number_abs( math_expression_utilities.fraction_from_el( ex_num ) ) );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_abs( ex_num );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 4572L)
  public static SubLObject extended_number_negate(final SubLObject ex_num)
  {
    assert NIL != extended_number_p( ex_num ) : ex_num;
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_number_utilities.scientific_number_negate( ex_num );
    }
    if( ex_num.isNumber() )
    {
      return Numbers.minus( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      return fraction_or_number_to_el( extended_number_negate( math_expression_utilities.fraction_from_el( ex_num ) ) );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_minus( ex_num, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 5059L)
  public static SubLObject copy_extended_number(final SubLObject ex_num)
  {
    assert NIL != extended_number_p( ex_num ) : ex_num;
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_numbers.copy_scientific_number( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      return fraction_or_number_to_el( copy_extended_number( math_expression_utilities.fraction_from_el( ex_num ) ) );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.copy_fraction( ex_num );
    }
    return ex_num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 5521L)
  public static SubLObject cyc_positive_infinity_p(final SubLObject v_object)
  {
    return Equality.eql( v_object, $const4$PlusInfinity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 5751L)
  public static SubLObject cyc_negative_infinity_p(final SubLObject v_object)
  {
    return Equality.eql( v_object, $const5$MinusInfinity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 5841L)
  public static SubLObject cyc_infinite_number_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cyc_positive_infinity_p( v_object ) || NIL != cyc_negative_infinity_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 5977L)
  public static SubLObject cyc_infinite_range_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cycl_grammar.cycl_nat_p( v_object ) )
    {
      thread.resetMultipleValues();
      final SubLObject unit = quantities.explode_interval( v_object );
      final SubLObject num1 = thread.secondMultipleValue();
      final SubLObject num2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      return makeBoolean( NIL != cyc_infinite_number_p( num1 ) || NIL != cyc_infinite_number_p( num2 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 6225L)
  public static SubLObject possibly_infinite_or_extended_number_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != extended_number_p( v_object ) || NIL != cyc_infinite_number_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 6370L)
  public static SubLObject possibly_infinite_or_extended_number_minus_p(final SubLObject ex_num)
  {
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    if( NIL != extended_number_p( ex_num ) )
    {
      return extended_number_minus_p( ex_num );
    }
    return cyc_negative_infinity_p( ex_num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 6629L)
  public static SubLObject possibly_infinite_or_extended_number_plus_p(final SubLObject ex_num)
  {
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    if( NIL != extended_number_p( ex_num ) )
    {
      return extended_number_plus_p( ex_num );
    }
    return cyc_positive_infinity_p( ex_num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 6886L)
  public static SubLObject possibly_infinite_or_extended_number_abs(final SubLObject ex_num)
  {
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    if( NIL != extended_number_p( ex_num ) )
    {
      return extended_number_abs( ex_num );
    }
    if( NIL != cyc_infinite_number_p( ex_num ) )
    {
      return $const4$PlusInfinity;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 7161L)
  public static SubLObject possibly_infinite_or_extended_number_negate(final SubLObject ex_num)
  {
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    if( NIL != extended_number_p( ex_num ) )
    {
      return extended_number_negate( ex_num );
    }
    if( NIL != cyc_positive_infinity_p( ex_num ) )
    {
      return $const5$MinusInfinity;
    }
    if( NIL != cyc_negative_infinity_p( ex_num ) )
    {
      return $const4$PlusInfinity;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 7504L)
  public static SubLObject copy_possibly_infinite_or_extended_number(final SubLObject ex_num)
  {
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_numbers.copy_scientific_number( ex_num );
    }
    return ex_num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 7736L)
  public static SubLObject extended_numberE(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    if( ex_num0.equal( ex_num1 ) )
    {
      return T;
    }
    return ( NIL != include_fractions_in_extended_numbersP() ) ? extended_numberE_int( ex_num0, ex_num1, digits ) : extended_numberE_old( ex_num0, ex_num1, digits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 8158L)
  public static SubLObject extended_numberE_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      return extended_numberE_int( scientific_numbers.scientific_number_to_subl_real( ex_num0 ), ex_num1, ( NIL != digits ) ? digits
          : scientific_number_utilities.scientific_number_comparison_significant_digits( ex_num0, ex_num1 ) );
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
    {
      return extended_numberE_int( ex_num0, scientific_numbers.scientific_number_to_subl_real( ex_num1 ), ( NIL != digits ) ? digits
          : scientific_number_utilities.scientific_number_comparison_significant_digits( ex_num1, ex_num0 ) );
    }
    if( NIL != collection_defns.fractionP( ex_num0, UNPROVIDED ) )
    {
      return extended_numberE_int( math_expression_utilities.fraction_from_el( ex_num0 ), ex_num1, digits );
    }
    if( NIL != collection_defns.fractionP( ex_num1, UNPROVIDED ) )
    {
      return extended_numberE_int( ex_num0, math_expression_utilities.fraction_from_el( ex_num1 ), digits );
    }
    if( NIL != fraction_utilities.fraction_p( ex_num0 ) )
    {
      return extended_numberE_int( fraction_utilities.fraction_to_number( ex_num0 ), ex_num1, digits );
    }
    if( NIL != fraction_utilities.fraction_p( ex_num1 ) )
    {
      return extended_numberE_int( fraction_utilities.fraction_to_number( ex_num1 ), ex_num0, digits );
    }
    if( NIL != subl_promotions.positive_integer_p( digits ) )
    {
      return Numbers.numE( number_utilities.significant_digits( ex_num0, digits ), number_utilities.significant_digits( ex_num1, digits ) );
    }
    return Numbers.numE( ex_num0, ex_num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 9228L)
  public static SubLObject extended_numberE_old(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_numberE( ex_num0, ex_num1, digits );
      }
      if( ex_num1.isInteger() )
      {
        return scientific_number_utilities.scientific_number_integerE( ex_num0, ex_num1, digits );
      }
      return scientific_number_utilities.scientific_numberE( ex_num0, scientific_numbers.scientific_number_from_subl_real( ex_num1, UNPROVIDED ), digits );
    }
    else if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
    {
      if( ex_num0.isInteger() )
      {
        return scientific_number_utilities.integer_scientific_numberE( ex_num0, ex_num1, digits );
      }
      return scientific_number_utilities.scientific_numberE( scientific_numbers.scientific_number_from_subl_real( ex_num0, UNPROVIDED ), ex_num1, UNPROVIDED );
    }
    else
    {
      if( NIL != digits )
      {
        return Numbers.numE( number_utilities.significant_digits( ex_num0, digits ), number_utilities.significant_digits( ex_num1, digits ) );
      }
      return Numbers.numE( ex_num0, ex_num1 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 9991L)
  public static SubLObject extended_numberG(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    return ( NIL != include_fractions_in_extended_numbersP() ) ? extended_numberG_int( ex_num0, ex_num1, digits ) : extended_numberG_old( ex_num0, ex_num1, digits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 10299L)
  public static SubLObject extended_numberG_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      return extended_numberG_int( scientific_numbers.scientific_number_to_subl_real( ex_num0 ), ex_num1, ( NIL != digits ) ? digits
          : scientific_number_utilities.scientific_number_comparison_significant_digits( ex_num0, ex_num1 ) );
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
    {
      return extended_numberG_int( ex_num0, scientific_numbers.scientific_number_to_subl_real( ex_num1 ), ( NIL != digits ) ? digits
          : scientific_number_utilities.scientific_number_comparison_significant_digits( ex_num1, ex_num0 ) );
    }
    if( NIL != collection_defns.fractionP( ex_num0, UNPROVIDED ) )
    {
      return extended_numberG_int( math_expression_utilities.fraction_from_el( ex_num0 ), ex_num1, digits );
    }
    if( NIL != collection_defns.fractionP( ex_num1, UNPROVIDED ) )
    {
      return extended_numberG_int( ex_num0, math_expression_utilities.fraction_from_el( ex_num1 ), digits );
    }
    if( NIL != fraction_utilities.fraction_p( ex_num0 ) )
    {
      return extended_numberG_int( fraction_utilities.fraction_to_number( ex_num0 ), ex_num1, digits );
    }
    if( NIL != fraction_utilities.fraction_p( ex_num1 ) )
    {
      return extended_numberG_int( ex_num0, fraction_utilities.fraction_to_number( ex_num1 ), digits );
    }
    if( NIL != subl_promotions.positive_integer_p( digits ) )
    {
      return Numbers.numG( number_utilities.significant_digits( ex_num0, digits ), number_utilities.significant_digits( ex_num1, digits ) );
    }
    return Numbers.numG( ex_num0, ex_num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 11369L)
  public static SubLObject extended_numberG_old(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_numberG( ex_num0, ex_num1, digits );
      }
      if( ex_num1.isInteger() )
      {
        return scientific_number_utilities.scientific_number_integerG( ex_num0, ex_num1, digits );
      }
      return scientific_number_utilities.scientific_numberG( ex_num0, scientific_numbers.scientific_number_from_subl_real( ex_num1, UNPROVIDED ), digits );
    }
    else if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
    {
      if( ex_num0.isInteger() )
      {
        return scientific_number_utilities.integer_scientific_numberG( ex_num0, ex_num1, UNPROVIDED );
      }
      return scientific_number_utilities.scientific_numberG( scientific_numbers.scientific_number_from_subl_real( ex_num0, UNPROVIDED ), ex_num1, digits );
    }
    else
    {
      if( NIL != digits )
      {
        return Numbers.numG( number_utilities.significant_digits( ex_num0, digits ), number_utilities.significant_digits( ex_num1, digits ) );
      }
      return Numbers.numG( ex_num0, ex_num1 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 12105L)
  public static SubLObject extended_numberGE(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    return ( NIL != include_fractions_in_extended_numbersP() ) ? extended_numberGE_int( ex_num0, ex_num1, digits ) : extended_numberGE_old( ex_num0, ex_num1, digits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 12416L)
  public static SubLObject extended_numberGE_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    return makeBoolean( NIL != extended_numberG( ex_num0, ex_num1, digits ) || NIL != extended_numberE( ex_num0, ex_num1, digits ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 12594L)
  public static SubLObject extended_numberGE_old(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_numberGE( ex_num0, ex_num1, digits );
      }
      if( ex_num1.isInteger() )
      {
        return scientific_number_utilities.scientific_number_integerGE( ex_num0, ex_num1, digits );
      }
      return scientific_number_utilities.scientific_numberGE( ex_num0, scientific_numbers.scientific_number_from_subl_real( ex_num1, UNPROVIDED ), digits );
    }
    else if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
    {
      if( ex_num0.isInteger() )
      {
        return scientific_number_utilities.integer_scientific_numberGE( ex_num0, ex_num1, digits );
      }
      return scientific_number_utilities.scientific_numberGE( scientific_numbers.scientific_number_from_subl_real( ex_num0, UNPROVIDED ), ex_num1, digits );
    }
    else
    {
      if( NIL != digits )
      {
        return Numbers.numGE( number_utilities.significant_digits( ex_num0, digits ), number_utilities.significant_digits( ex_num1, digits ) );
      }
      return Numbers.numGE( ex_num0, ex_num1 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 13345L)
  public static SubLObject extended_numberL(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    return extended_numberG( ex_num1, ex_num0, digits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 13464L)
  public static SubLObject extended_numberLE(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits)
  {
    if( digits == UNPROVIDED )
    {
      digits = NIL;
    }
    return extended_numberGE( ex_num1, ex_num0, digits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 13585L)
  public static SubLObject possibly_infinite_or_extended_numberLE(final SubLObject smaller, final SubLObject bigger)
  {
    if( NIL != cyc_negative_infinity_p( smaller ) )
    {
      return possibly_infinite_or_extended_number_p( bigger );
    }
    if( NIL != cyc_positive_infinity_p( bigger ) )
    {
      return possibly_infinite_or_extended_number_p( smaller );
    }
    return makeBoolean( NIL != extended_number_p( smaller ) && NIL != extended_number_p( bigger ) && NIL != extended_numberLE( smaller, bigger, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 14138L)
  public static SubLObject possibly_infinite_or_extended_numberE(final SubLObject smaller, final SubLObject bigger)
  {
    if( NIL != cyc_infinite_number_p( smaller ) && NIL != cyc_infinite_number_p( bigger ) )
    {
      return Equality.equal( smaller, bigger );
    }
    return makeBoolean( NIL != extended_number_p( smaller ) && NIL != extended_number_p( bigger ) && NIL != extended_numberE( smaller, bigger, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 14457L)
  public static SubLObject possibly_infinite_or_extended_numberL(final SubLObject smaller, final SubLObject bigger)
  {
    if( NIL != cyc_negative_infinity_p( smaller ) )
    {
      return makeBoolean( NIL != extended_number_p( bigger ) || NIL != cyc_positive_infinity_p( bigger ) );
    }
    if( NIL != cyc_positive_infinity_p( bigger ) )
    {
      return makeBoolean( NIL != extended_number_p( smaller ) || NIL != cyc_negative_infinity_p( smaller ) );
    }
    return makeBoolean( NIL != extended_number_p( smaller ) && NIL != extended_number_p( bigger ) && NIL != extended_numberL( smaller, bigger, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 14903L)
  public static SubLObject extended_number_to_subl_real(final SubLObject ex_num)
  {
    if( ex_num.isNumber() )
    {
      return ex_num;
    }
    if( NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      return extended_number_to_subl_real( math_expression_utilities.fraction_from_el( ex_num ) );
    }
    if( NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_to_number( ex_num );
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_numbers.scientific_number_to_subl_real( ex_num );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 15497L)
  public static SubLObject extended_number_times(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    if( NIL != $check_new_vs_old_extended_number_mathP$.getDynamicValue( thread ) && NIL == collection_defns.fractionP( ex_num0, UNPROVIDED ) && NIL == collection_defns.fractionP( ex_num1, UNPROVIDED )
        && !extended_number_times_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED ).equal( extended_number_times_old( ex_num0, ex_num1 ) ) )
    {
      Errors.warn( $str7$___TimesFn__S__S_______Old___S___, new SubLObject[] { ex_num0, ex_num1, extended_number_times_old( ex_num0, ex_num1 ), extended_number_times_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED )
      } );
    }
    return ( NIL != include_fractions_in_extended_numbersP() ) ? extended_number_times_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED ) : extended_number_times_old( ex_num0, ex_num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 16190L)
  public static SubLObject extended_number_times_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject return_as_scientific_numberP, SubLObject max_significant_digits)
  {
    if( return_as_scientific_numberP == UNPROVIDED )
    {
      return_as_scientific_numberP = NIL;
    }
    if( max_significant_digits == UNPROVIDED )
    {
      max_significant_digits = NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      return extended_number_times_int( scientific_numbers.scientific_number_to_integer_or_fraction( ex_num0, UNPROVIDED ), ex_num1, T, ( NIL != max_significant_digits ) ? Numbers.min( max_significant_digits,
          scientific_numbers.scientific_number_significant_digit_count( ex_num0 ) ) : scientific_numbers.scientific_number_significant_digit_count( ex_num0 ) );
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
    {
      return extended_number_times_int( ex_num0, scientific_numbers.scientific_number_to_integer_or_fraction( ex_num1, UNPROVIDED ), T, ( NIL != max_significant_digits ) ? Numbers.min( max_significant_digits,
          scientific_numbers.scientific_number_significant_digit_count( ex_num1 ) ) : scientific_numbers.scientific_number_significant_digit_count( ex_num1 ) );
    }
    if( NIL != collection_defns.fractionP( ex_num0, UNPROVIDED ) )
    {
      final SubLObject result = extended_number_times_int( math_expression_utilities.fraction_from_el( ex_num0 ), ex_num1, return_as_scientific_numberP, max_significant_digits );
      return fraction_or_number_to_el( result );
    }
    if( NIL != collection_defns.fractionP( ex_num1, UNPROVIDED ) )
    {
      final SubLObject result = extended_number_times_int( ex_num0, math_expression_utilities.fraction_from_el( ex_num1 ), return_as_scientific_numberP, max_significant_digits );
      return fraction_or_number_to_el( result );
    }
    if( NIL != fraction_utilities.fraction_p( ex_num0 ) || NIL != fraction_utilities.fraction_p( ex_num1 ) )
    {
      final SubLObject result = fraction_utilities.fraction_times2( ex_num0, ex_num1 );
      return ( NIL != return_as_scientific_numberP ) ? scientific_numbers.scientific_number_from_subl_real( fraction_utilities.defractionify( result ), max_significant_digits ) : result;
    }
    final SubLObject result = Numbers.multiply( ex_num0, ex_num1 );
    return ( NIL != return_as_scientific_numberP ) ? scientific_numbers.scientific_number_from_subl_real( result, max_significant_digits ) : result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 17818L)
  public static SubLObject extended_number_times_old(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_number_times( ex_num0, ex_num1 );
      }
      if( ex_num1.isInteger() )
      {
        return scientific_number_utilities.scientific_number_integer_times( ex_num0, ex_num1 );
      }
      return scientific_number_utilities.scientific_number_times( ex_num0, scientific_numbers.scientific_number_from_subl_real( ex_num1, UNPROVIDED ) );
    }
    else
    {
      if( NIL == scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return Numbers.multiply( ex_num0, ex_num1 );
      }
      if( ex_num0.isInteger() )
      {
        return scientific_number_utilities.integer_scientific_number_times( ex_num0, ex_num1 );
      }
      return scientific_number_utilities.scientific_number_times( scientific_numbers.scientific_number_from_subl_real( ex_num0, UNPROVIDED ), ex_num1 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 18438L)
  public static SubLObject extended_number_quotient(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    if( NIL != $check_new_vs_old_extended_number_mathP$.getDynamicValue( thread ) && NIL == collection_defns.fractionP( ex_num0, UNPROVIDED ) && NIL == collection_defns.fractionP( ex_num1, UNPROVIDED )
        && !extended_number_quotient_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED ).equal( extended_number_quotient_old( ex_num0, ex_num1 ) ) )
    {
      Errors.warn( $str8$___QuotientFn__S__S_______Old___S, new SubLObject[] { ex_num0, ex_num1, extended_number_quotient_old( ex_num0, ex_num1 ), extended_number_quotient_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED )
      } );
    }
    return ( NIL != include_fractions_in_extended_numbersP() ) ? extended_number_quotient_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED ) : extended_number_quotient_old( ex_num0, ex_num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 19155L)
  public static SubLObject extended_number_quotient_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject return_as_scientific_numberP, SubLObject max_significant_digits)
  {
    if( return_as_scientific_numberP == UNPROVIDED )
    {
      return_as_scientific_numberP = NIL;
    }
    if( max_significant_digits == UNPROVIDED )
    {
      max_significant_digits = NIL;
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      return extended_number_quotient_int( scientific_numbers.scientific_number_to_integer_or_fraction( ex_num0, UNPROVIDED ), ex_num1, T, ( NIL != max_significant_digits ) ? Numbers.min( max_significant_digits,
          scientific_numbers.scientific_number_significant_digit_count( ex_num0 ) ) : scientific_numbers.scientific_number_significant_digit_count( ex_num0 ) );
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
    {
      return extended_number_quotient_int( ex_num0, scientific_numbers.scientific_number_to_integer_or_fraction( ex_num1, UNPROVIDED ), T, ( NIL != max_significant_digits ) ? Numbers.min( max_significant_digits,
          scientific_numbers.scientific_number_significant_digit_count( ex_num1 ) ) : scientific_numbers.scientific_number_significant_digit_count( ex_num1 ) );
    }
    if( NIL != collection_defns.fractionP( ex_num0, UNPROVIDED ) )
    {
      final SubLObject result = extended_number_quotient_int( math_expression_utilities.fraction_from_el( ex_num0 ), ex_num1, return_as_scientific_numberP, max_significant_digits );
      return fraction_or_number_to_el( result );
    }
    if( NIL != collection_defns.fractionP( ex_num1, UNPROVIDED ) )
    {
      final SubLObject result = extended_number_quotient_int( ex_num0, math_expression_utilities.fraction_from_el( ex_num1 ), return_as_scientific_numberP, max_significant_digits );
      return fraction_or_number_to_el( result );
    }
    if( NIL != fraction_utilities.fraction_p( ex_num0 ) || NIL != fraction_utilities.fraction_p( ex_num1 ) )
    {
      final SubLObject result = fraction_utilities.fraction_divide( ex_num0, ex_num1 );
      return ( NIL != return_as_scientific_numberP ) ? scientific_numbers.scientific_number_from_subl_real( fraction_utilities.defractionify( result ), max_significant_digits ) : result;
    }
    if( NIL != return_as_scientific_numberP )
    {
      return scientific_numbers.scientific_number_from_subl_real( Numbers.divide( ex_num0, ex_num1 ), max_significant_digits );
    }
    if( ex_num0.isInteger() && ex_num1.isInteger() && NIL != include_fractions_in_extended_numbersP() && !Numbers.mod( ex_num0, ex_num1 ).isZero() )
    {
      return math_expression_utilities.fraction_to_el( fraction_utilities.fraction_reduce( fraction_utilities.new_fraction( ex_num0, ex_num1 ) ) );
    }
    if( ex_num0.isInteger() && ex_num1.isInteger() && Numbers.mod( ex_num0, ex_num1 ).isZero() )
    {
      return Numbers.integerDivide( ex_num0, ex_num1 );
    }
    return Numbers.divide( ex_num0, ex_num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 21185L)
  public static SubLObject extended_number_quotient_old(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_number_quotient( ex_num0, ex_num1 );
      }
      if( ex_num1.isInteger() )
      {
        return scientific_number_utilities.scientific_number_integer_quotient( ex_num0, ex_num1 );
      }
      return scientific_number_utilities.scientific_number_quotient( ex_num0, scientific_numbers.scientific_number_from_subl_real( ex_num1, UNPROVIDED ) );
    }
    else
    {
      if( NIL == scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return Numbers.divide( ex_num0, ex_num1 );
      }
      if( ex_num0.isInteger() )
      {
        return scientific_number_utilities.integer_scientific_number_quotient( ex_num0, ex_num1 );
      }
      return scientific_number_utilities.scientific_number_quotient( scientific_numbers.scientific_number_from_subl_real( ex_num0, UNPROVIDED ), ex_num1 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 21904L)
  public static SubLObject extended_number_plus(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    if( NIL != $check_new_vs_old_extended_number_mathP$.getDynamicValue( thread ) && NIL == collection_defns.fractionP( ex_num0, UNPROVIDED ) && NIL == collection_defns.fractionP( ex_num1, UNPROVIDED )
        && !extended_number_plus_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED ).equal( extended_number_plus_old( ex_num0, ex_num1 ) ) )
    {
      Errors.warn( $str9$___PlusFn__S__S_______Old___S___N, new SubLObject[] { ex_num0, ex_num1, extended_number_plus_old( ex_num0, ex_num1 ), extended_number_plus_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED )
      } );
    }
    return ( NIL != include_fractions_in_extended_numbersP() ) ? extended_number_plus_int( ex_num0, ex_num1, UNPROVIDED, UNPROVIDED ) : extended_number_plus_old( ex_num0, ex_num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 22589L)
  public static SubLObject extended_number_plus_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject return_as_scientific_numberP, SubLObject max_significant_digits)
  {
    if( return_as_scientific_numberP == UNPROVIDED )
    {
      return_as_scientific_numberP = NIL;
    }
    if( max_significant_digits == UNPROVIDED )
    {
      max_significant_digits = NIL;
    }
    if( ( NIL != scientific_numbers.scientific_number_p( ex_num0 ) || NIL != scientific_numbers.scientific_number_p( ex_num1 ) ) && NIL == collection_defns.fractionP( ex_num0, UNPROVIDED ) && NIL == fraction_utilities
        .fraction_p( ex_num0 ) && NIL == collection_defns.fractionP( ex_num1, UNPROVIDED ) && NIL == fraction_utilities.fraction_p( ex_num1 ) )
    {
      return extended_number_plus_old( ex_num0, ex_num1 );
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      return extended_number_plus_int( scientific_numbers.scientific_number_to_integer_or_fraction( ex_num0, UNPROVIDED ), ex_num1, T, scientific_number_significant_digits_for_addition( ex_num0,
          max_significant_digits ) );
    }
    if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
    {
      return extended_number_plus_int( ex_num0, scientific_numbers.scientific_number_to_integer_or_fraction( ex_num1, UNPROVIDED ), T, scientific_number_significant_digits_for_addition( ex_num1,
          max_significant_digits ) );
    }
    if( NIL != collection_defns.fractionP( ex_num0, UNPROVIDED ) )
    {
      return fraction_or_number_to_el( extended_number_plus_int( math_expression_utilities.fraction_from_el( ex_num0 ), ex_num1, return_as_scientific_numberP, max_significant_digits ) );
    }
    if( NIL != collection_defns.fractionP( ex_num1, UNPROVIDED ) )
    {
      return fraction_or_number_to_el( extended_number_plus_int( ex_num0, math_expression_utilities.fraction_from_el( ex_num1 ), return_as_scientific_numberP, max_significant_digits ) );
    }
    if( NIL != fraction_utilities.fraction_p( ex_num0 ) || NIL != fraction_utilities.fraction_p( ex_num1 ) )
    {
      final SubLObject result = fraction_utilities.fraction_add2( ex_num0, ex_num1 );
      return ( NIL != return_as_scientific_numberP ) ? scientific_numbers.scientific_number_from_subl_real( fraction_utilities.defractionify( result ), max_significant_digits ) : result;
    }
    final SubLObject result = Numbers.add( ex_num0, ex_num1 );
    return ( NIL != return_as_scientific_numberP ) ? scientific_numbers.scientific_number_from_subl_real( result, max_significant_digits ) : result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 24401L)
  public static SubLObject scientific_number_significant_digits_for_addition(final SubLObject ex_num0, final SubLObject max_significant_digits)
  {
    return ( NIL != scientific_numbers.scientific_number_zero_p( ex_num0 ) ) ? max_significant_digits
        : Numbers.max( ONE_INTEGER, ( NIL != max_significant_digits ) ? Numbers.min( max_significant_digits, scientific_numbers.scientific_number_significant_digit_count( ex_num0 ) )
            : scientific_numbers.scientific_number_significant_digit_count( ex_num0 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 24782L)
  public static SubLObject extended_number_plus_old(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_number_plus( ex_num0, ex_num1 );
      }
      return scientific_number_utilities.scientific_number_plus( ex_num0, scientific_numbers.scientific_number_from_subl_real( ex_num1, UNPROVIDED ) );
    }
    else
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_number_plus( scientific_numbers.scientific_number_from_subl_real( ex_num0, UNPROVIDED ), ex_num1 );
      }
      return Numbers.add( ex_num0, ex_num1 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 25305L)
  public static SubLObject extended_number_minus(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    if( NIL != $check_new_vs_old_extended_number_mathP$.getDynamicValue( thread ) && NIL == collection_defns.fractionP( ex_num0, UNPROVIDED ) && NIL == collection_defns.fractionP( ex_num1, UNPROVIDED )
        && !extended_number_minus_int( ex_num0, ex_num1 ).equal( extended_number_minus_old( ex_num0, ex_num1 ) ) )
    {
      Errors.warn( $str10$___MinusFn__S__S_______Old___S___, new SubLObject[] { ex_num0, ex_num1, extended_number_minus_old( ex_num0, ex_num1 ), extended_number_minus_int( ex_num0, ex_num1 )
      } );
    }
    return ( NIL != include_fractions_in_extended_numbersP() ) ? extended_number_minus_int( ex_num0, ex_num1 ) : extended_number_minus_old( ex_num0, ex_num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 25998L)
  public static SubLObject extended_number_minus_int(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    return extended_number_plus_int( ex_num0, extended_number_negate( ex_num1 ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 26136L)
  public static SubLObject extended_number_minus_old(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    assert NIL != extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != extended_number_p( ex_num1 ) : ex_num1;
    if( NIL != scientific_numbers.scientific_number_p( ex_num0 ) )
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_number_minus( ex_num0, ex_num1 );
      }
      return scientific_number_utilities.scientific_number_minus( ex_num0, scientific_numbers.scientific_number_from_subl_real( ex_num1, UNPROVIDED ) );
    }
    else
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num1 ) )
      {
        return scientific_number_utilities.scientific_number_minus( scientific_numbers.scientific_number_from_subl_real( ex_num0, UNPROVIDED ), ex_num1 );
      }
      return Numbers.subtract( ex_num0, ex_num1 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 26663L)
  public static SubLObject possibly_infinite_or_extended_number_times(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    if( NIL != extended_number_p( ex_num0 ) && NIL != extended_number_p( ex_num1 ) )
    {
      return extended_number_times( ex_num0, ex_num1 );
    }
    if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != cyc_infinite_number_p( ex_num1 ) && ex_num0.eql( ex_num1 ) )
    {
      return $const4$PlusInfinity;
    }
    if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != cyc_infinite_number_p( ex_num1 ) && !ex_num0.eql( ex_num1 ) )
    {
      return $const5$MinusInfinity;
    }
    if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != extended_number_plus_p( ex_num1 ) )
    {
      return ex_num0;
    }
    if( NIL != cyc_infinite_number_p( ex_num1 ) && NIL != extended_number_plus_p( ex_num0 ) )
    {
      return ex_num1;
    }
    if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != extended_number_minus_p( ex_num1 ) )
    {
      return possibly_infinite_or_extended_number_negate( ex_num0 );
    }
    if( NIL != cyc_infinite_number_p( ex_num1 ) && NIL != extended_number_minus_p( ex_num0 ) )
    {
      return possibly_infinite_or_extended_number_negate( ex_num1 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 28034L)
  public static SubLObject possibly_infinite_or_extended_number_plus(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    if( NIL != extended_number_p( ex_num0 ) && NIL != extended_number_p( ex_num1 ) )
    {
      return extended_number_plus( ex_num0, ex_num1 );
    }
    if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != cyc_infinite_number_p( ex_num1 ) )
    {
      if( ex_num0.eql( ex_num1 ) )
      {
        return ex_num0;
      }
      return relation_evaluation.throw_unevaluatable();
    }
    else
    {
      if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != extended_number_p( ex_num1 ) )
      {
        return ex_num0;
      }
      if( NIL != cyc_infinite_number_p( ex_num1 ) && NIL != extended_number_p( ex_num0 ) )
      {
        return ex_num1;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 28755L)
  public static SubLObject possibly_infinite_or_extended_number_quotient(final SubLObject ex_num0, final SubLObject ex_num1)
  {
    assert NIL != possibly_infinite_or_extended_number_p( ex_num0 ) : ex_num0;
    assert NIL != possibly_infinite_or_extended_number_p( ex_num1 ) : ex_num1;
    if( NIL != extended_number_p( ex_num0 ) && NIL != extended_number_p( ex_num1 ) )
    {
      return extended_number_quotient( ex_num0, ex_num1 );
    }
    if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != cyc_infinite_number_p( ex_num1 ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      if( NIL != extended_number_p( ex_num0 ) && NIL != cyc_infinite_number_p( ex_num1 ) )
      {
        return ZERO_INTEGER;
      }
      if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != extended_number_plus_p( ex_num1 ) )
      {
        return ex_num0;
      }
      if( NIL != cyc_infinite_number_p( ex_num0 ) && NIL != extended_number_minus_p( ex_num1 ) )
      {
        return possibly_infinite_or_extended_number_negate( ex_num0 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 29746L)
  public static SubLObject extended_number_min(final SubLObject ex_nums)
  {
    assert NIL != list_utilities.non_dotted_list_p( ex_nums ) : ex_nums;
    SubLObject cdolist_list_var = ex_nums;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != extended_number_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject possible_min = ex_nums.first();
    cdolist_list_var = ex_nums.rest();
    SubLObject ex_num = NIL;
    ex_num = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != extended_numberL( ex_num, possible_min, UNPROVIDED ) )
      {
        possible_min = copy_extended_number( ex_num );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ex_num = cdolist_list_var.first();
    }
    return possible_min;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 31234L)
  public static SubLObject extended_number_max(final SubLObject ex_nums)
  {
    assert NIL != list_utilities.non_dotted_list_p( ex_nums ) : ex_nums;
    SubLObject cdolist_list_var = ex_nums;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != extended_number_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject possible_min = ex_nums.first();
    cdolist_list_var = ex_nums.rest();
    SubLObject ex_num = NIL;
    ex_num = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != extended_numberG( ex_num, possible_min, UNPROVIDED ) )
      {
        possible_min = copy_extended_number( ex_num );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ex_num = cdolist_list_var.first();
    }
    return possible_min;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 31534L)
  public static SubLObject extended_number_sqrt(final SubLObject ex_num)
  {
    assert NIL != extended_number_p( ex_num ) : ex_num;
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_number_utilities.scientific_number_sqrt( ex_num );
    }
    if( ex_num.isNumber() )
    {
      return Numbers.sqrt( ex_num );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      final SubLObject result = extended_number_sqrt( math_expression_utilities.fraction_from_el( ex_num ) );
      return fraction_or_number_to_el( result );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_sqrt( ex_num );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 32048L)
  public static SubLObject extended_number_log(final SubLObject ex_num, SubLObject base)
  {
    if( base == UNPROVIDED )
    {
      base = Numbers.$exp1$.getGlobalValue();
    }
    assert NIL != extended_number_p( ex_num ) : ex_num;
    if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
    {
      return scientific_number_utilities.scientific_number_log( ex_num, base );
    }
    if( ex_num.isNumber() )
    {
      return Numbers.log( ex_num, base );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
    {
      final SubLObject result = extended_number_log( math_expression_utilities.fraction_from_el( ex_num ), base );
      return fraction_or_number_to_el( result );
    }
    if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
    {
      return fraction_utilities.fraction_log( ex_num, base );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 32601L)
  public static SubLObject extended_number_expt(final SubLObject base, final SubLObject ex_num)
  {
    assert NIL != extended_number_p( ex_num ) : ex_num;
    if( NIL != extended_number_zero_p( ex_num ) )
    {
      return ONE_INTEGER;
    }
    if( NIL != extended_number_minus_p( base ) && NIL == extended_number_integer_p( ex_num ) )
    {
      Errors.error( $str12$Raising__S_to_the_power__S_would_, base, ex_num );
    }
    else if( NIL != power_too_largeP( base, ex_num ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
      {
        final SubLObject result = extended_number_expt( base, math_expression_utilities.fraction_from_el( ex_num ) );
        return fraction_or_number_to_el( result );
      }
      if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( base, UNPROVIDED ) )
      {
        final SubLObject result = extended_number_expt( math_expression_utilities.fraction_from_el( base ), ex_num );
        return fraction_or_number_to_el( result );
      }
      if( NIL != include_fractions_in_extended_numbersP() && ( NIL != fraction_utilities.fraction_p( base ) || NIL != fraction_utilities.fraction_p( ex_num ) ) )
      {
        return fraction_utilities.fraction_expt( base, ex_num );
      }
      if( NIL != scientific_numbers.scientific_number_p( base ) )
      {
        final SubLObject digits = scientific_numbers.scientific_number_significant_digit_count( base );
        return scientific_numbers.scientific_number_from_subl_real( extended_number_expt( scientific_numbers.scientific_number_to_subl_real( base ), ex_num ), digits );
      }
      if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
      {
        return scientific_number_utilities.scientific_number_expt( base, ex_num );
      }
      if( ex_num.isNumber() )
      {
        return Numbers.expt( base, ex_num );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 33891L)
  public static SubLObject extended_number_exp(final SubLObject ex_num)
  {
    assert NIL != extended_number_p( ex_num ) : ex_num;
    if( NIL != power_too_largeP( Numbers.exp( ONE_INTEGER ), ex_num ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    else
    {
      if( NIL != scientific_numbers.scientific_number_p( ex_num ) )
      {
        return scientific_number_utilities.scientific_number_exp( ex_num );
      }
      if( ex_num.isNumber() )
      {
        return Numbers.exp( ex_num );
      }
      if( NIL != include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( ex_num, UNPROVIDED ) )
      {
        final SubLObject result = extended_number_exp( math_expression_utilities.fraction_from_el( ex_num ) );
        return fraction_or_number_to_el( result );
      }
      if( NIL != include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( ex_num ) )
      {
        return fraction_utilities.fraction_exp( ex_num );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 34477L)
  public static SubLObject extended_number_modulo(final SubLObject ex_num, final SubLObject base)
  {
    assert NIL != extended_number_p( ex_num ) : ex_num;
    assert NIL != extended_number_p( base ) : base;
    if( ex_num.isNumber() && base.isNumber() )
    {
      return Numbers.mod( ex_num, base );
    }
    if( NIL != extended_number_zero_p( base ) )
    {
      Errors.error( $str13$Can_t_do_modulo_with_0_base_ );
      return NIL;
    }
    if( NIL != extended_number_zero_p( ex_num ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != extended_numberE( ex_num, base, UNPROVIDED ) )
    {
      return ZERO_INTEGER;
    }
    final SubLObject quotient = quantities.cyc_round_truncate( extended_number_quotient( ex_num, base ) );
    final SubLObject remainder = extended_number_minus( ex_num, extended_number_times( base, quotient ) );
    if( NIL != extended_numberG( extended_number_abs( remainder ), extended_number_abs( base ), UNPROVIDED ) )
    {
      Errors.error( $str14$Looks_like_not_enough_significant );
    }
    return ( NIL != extended_number_zero_p( remainder ) ) ? ZERO_INTEGER : ( extended_number_plus_p( remainder ).eql( extended_number_plus_p( base ) ) ? remainder : extended_number_plus( remainder, base ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 35670L)
  public static SubLObject extended_number_approx(final SubLObject ex_num)
  {
    return number_utilities.significant_digits( extended_number_to_subl_real( ex_num ), TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 35789L)
  public static SubLObject fraction_or_number_to_el(final SubLObject obj)
  {
    return ( NIL != fraction_utilities.fraction_p( obj ) ) ? math_expression_utilities.fraction_to_el( obj )
        : ( ( NIL != math_expression_utilities.really_big_number_for_fractionP( obj ) ) ? scientific_numbers.scientific_number_from_subl_real( obj, UNPROVIDED ) : obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 35992L)
  public static SubLObject possibly_infinite_or_extended_number_min(final SubLObject ex_nums)
  {
    assert NIL != list_utilities.non_dotted_list_p( ex_nums ) : ex_nums;
    SubLObject cdolist_list_var = ex_nums;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != possibly_infinite_or_extended_number_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject possible_min = ex_nums.first();
    cdolist_list_var = ex_nums.rest();
    SubLObject ex_num = NIL;
    ex_num = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != possibly_infinite_or_extended_numberL( ex_num, possible_min ) )
      {
        possible_min = copy_possibly_infinite_or_extended_number( ex_num );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ex_num = cdolist_list_var.first();
    }
    return possible_min;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 36528L)
  public static SubLObject possibly_infinite_or_extended_number_max(final SubLObject ex_nums)
  {
    assert NIL != list_utilities.non_dotted_list_p( ex_nums ) : ex_nums;
    SubLObject cdolist_list_var = ex_nums;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != possibly_infinite_or_extended_number_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject possible_min = ex_nums.first();
    cdolist_list_var = ex_nums.rest();
    SubLObject ex_num = NIL;
    ex_num = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != possibly_infinite_or_extended_numberL( possible_min, ex_num ) )
      {
        possible_min = copy_possibly_infinite_or_extended_number( ex_num );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ex_num = cdolist_list_var.first();
    }
    return possible_min;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 36912L)
  public static SubLObject possibly_infinite_or_extended_number_sqrt(final SubLObject ex_num)
  {
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    if( NIL != extended_number_p( ex_num ) )
    {
      return extended_number_sqrt( ex_num );
    }
    if( NIL != cyc_positive_infinity_p( ex_num ) )
    {
      return $const4$PlusInfinity;
    }
    if( NIL != cyc_negative_infinity_p( ex_num ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 37337L)
  public static SubLObject possibly_infinite_or_extended_number_log(final SubLObject ex_num, SubLObject base)
  {
    if( base == UNPROVIDED )
    {
      base = Numbers.$exp1$.getGlobalValue();
    }
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    assert NIL != extended_number_p( base ) : base;
    if( NIL != extended_number_p( ex_num ) )
    {
      return extended_number_log( ex_num, base );
    }
    if( NIL != cyc_positive_infinity_p( ex_num ) )
    {
      return $const4$PlusInfinity;
    }
    if( NIL != cyc_negative_infinity_p( ex_num ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 37827L)
  public static SubLObject possibly_infinite_or_extended_number_expt(final SubLObject base, final SubLObject ex_num)
  {
    assert NIL != extended_number_p( base ) : base;
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    if( NIL != extended_number_p( ex_num ) )
    {
      return extended_number_expt( base, ex_num );
    }
    if( NIL != cyc_positive_infinity_p( ex_num ) )
    {
      return $const4$PlusInfinity;
    }
    if( NIL != cyc_negative_infinity_p( ex_num ) )
    {
      return ZERO_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 38203L)
  public static SubLObject power_too_largeP(final SubLObject base, final SubLObject ex_num)
  {
    return extended_numberG( ex_num, $int15$1000, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 38329L)
  public static SubLObject possibly_infinite_or_extended_number_exp(final SubLObject ex_num)
  {
    assert NIL != possibly_infinite_or_extended_number_p( ex_num ) : ex_num;
    if( NIL != extended_number_p( ex_num ) )
    {
      return extended_number_exp( ex_num );
    }
    if( NIL != cyc_positive_infinity_p( ex_num ) )
    {
      return $const4$PlusInfinity;
    }
    if( NIL != cyc_negative_infinity_p( ex_num ) )
    {
      return ZERO_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/extended-numbers.lisp", position = 38661L)
  public static SubLObject test_zerop(final SubLObject v_object)
  {
    if( v_object.isZero() )
    {
      return T;
    }
    return NIL;
  }

  public static SubLObject declare_extended_numbers_file()
  {
    SubLFiles.declareFunction( me, "cyc_extended_number_p", "CYC-EXTENDED-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_fraction_kb_feature", "INITIALIZE-FRACTION-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "include_fractions_in_extended_numbersP", "INCLUDE-FRACTIONS-IN-EXTENDED-NUMBERS?", 0, 0, false );
    SubLFiles.declareFunction( me, "extended_number_p", "EXTENDED-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_zero_p", "EXTENDED-NUMBER-ZERO-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_minus_p", "EXTENDED-NUMBER-MINUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_plus_p", "EXTENDED-NUMBER-PLUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_non_negative_p", "EXTENDED-NUMBER-NON-NEGATIVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_integer_p", "EXTENDED-NUMBER-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_abs", "EXTENDED-NUMBER-ABS", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_negate", "EXTENDED-NUMBER-NEGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_extended_number", "COPY-EXTENDED-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_positive_infinity_p", "CYC-POSITIVE-INFINITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_negative_infinity_p", "CYC-NEGATIVE-INFINITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_infinite_number_p", "CYC-INFINITE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_infinite_range_p", "CYC-INFINITE-RANGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_p", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_minus_p", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-MINUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_plus_p", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-PLUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_abs", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-ABS", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_negate", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-NEGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_possibly_infinite_or_extended_number", "COPY-POSSIBLY-INFINITE-OR-EXTENDED-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_numberE", "EXTENDED-NUMBER=", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberE_int", "EXTENDED-NUMBER=-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberE_old", "EXTENDED-NUMBER=-OLD", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberG", "EXTENDED-NUMBER>", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberG_int", "EXTENDED-NUMBER>-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberG_old", "EXTENDED-NUMBER>-OLD", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberGE", "EXTENDED-NUMBER>=", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberGE_int", "EXTENDED-NUMBER>=-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberGE_old", "EXTENDED-NUMBER>=-OLD", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberL", "EXTENDED-NUMBER<", 2, 1, false );
    SubLFiles.declareFunction( me, "extended_numberLE", "EXTENDED-NUMBER<=", 2, 1, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_numberLE", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER<=", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_numberE", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER=", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_numberL", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER<", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_to_subl_real", "EXTENDED-NUMBER-TO-SUBL-REAL", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_times", "EXTENDED-NUMBER-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_times_int", "EXTENDED-NUMBER-TIMES-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "extended_number_times_old", "EXTENDED-NUMBER-TIMES-OLD", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_quotient", "EXTENDED-NUMBER-QUOTIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_quotient_int", "EXTENDED-NUMBER-QUOTIENT-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "extended_number_quotient_old", "EXTENDED-NUMBER-QUOTIENT-OLD", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_plus", "EXTENDED-NUMBER-PLUS", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_plus_int", "EXTENDED-NUMBER-PLUS-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "scientific_number_significant_digits_for_addition", "SCIENTIFIC-NUMBER-SIGNIFICANT-DIGITS-FOR-ADDITION", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_plus_old", "EXTENDED-NUMBER-PLUS-OLD", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_minus", "EXTENDED-NUMBER-MINUS", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_minus_int", "EXTENDED-NUMBER-MINUS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_minus_old", "EXTENDED-NUMBER-MINUS-OLD", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_times", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_plus", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-PLUS", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_quotient", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-QUOTIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_min", "EXTENDED-NUMBER-MIN", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_max", "EXTENDED-NUMBER-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_sqrt", "EXTENDED-NUMBER-SQRT", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_log", "EXTENDED-NUMBER-LOG", 1, 1, false );
    SubLFiles.declareFunction( me, "extended_number_expt", "EXTENDED-NUMBER-EXPT", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_exp", "EXTENDED-NUMBER-EXP", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_modulo", "EXTENDED-NUMBER-MODULO", 2, 0, false );
    SubLFiles.declareFunction( me, "extended_number_approx", "EXTENDED-NUMBER-APPROX", 1, 0, false );
    SubLFiles.declareFunction( me, "fraction_or_number_to_el", "FRACTION-OR-NUMBER-TO-EL", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_min", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-MIN", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_max", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_sqrt", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-SQRT", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_log", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-LOG", 1, 1, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_expt", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-EXPT", 2, 0, false );
    SubLFiles.declareFunction( me, "power_too_largeP", "POWER-TOO-LARGE?", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_infinite_or_extended_number_exp", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-EXP", 1, 0, false );
    SubLFiles.declareFunction( me, "test_zerop", "TEST-ZEROP", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_extended_numbers_file()
  {
    $fraction_core_constants$ = SubLFiles.deflexical( "*FRACTION-CORE-CONSTANTS*", $list1 );
    $include_fractions_in_extended_numbersP$ = SubLFiles.defparameter( "*INCLUDE-FRACTIONS-IN-EXTENDED-NUMBERS?*", T );
    $check_new_vs_old_extended_number_mathP$ = SubLFiles.defparameter( "*CHECK-NEW-VS-OLD-EXTENDED-NUMBER-MATH?*", NIL );
    return NIL;
  }

  public static SubLObject setup_extended_numbers_file()
  {
    utilities_macros.register_kb_function( $sym0$CYC_EXTENDED_NUMBER_P );
    generic_testing.define_test_case_table_int( $sym16$TEST_ZEROP, ConsesLow.list( new SubLObject[] { $kw17$TEST, NIL, $kw18$OWNER, NIL, $kw19$CLASSES, NIL, $kw20$KB, $kw21$FULL, $kw22$WORKING_, T
    } ), $list23 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_extended_numbers_file();
  }

  @Override
  public void initializeVariables()
  {
    init_extended_numbers_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_extended_numbers_file();
  }
  static
  {
    me = new extended_numbers();
    $fraction_core_constants$ = null;
    $include_fractions_in_extended_numbersP$ = null;
    $check_new_vs_old_extended_number_mathP$ = null;
    $sym0$CYC_EXTENDED_NUMBER_P = makeSymbol( "CYC-EXTENDED-NUMBER-P" );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NegativeMixedFractionFn" ) ) );
    $sym2$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $sym3$EXTENDED_NUMBER_P = makeSymbol( "EXTENDED-NUMBER-P" );
    $const4$PlusInfinity = constant_handles.reader_make_constant_shell( makeString( "PlusInfinity" ) );
    $const5$MinusInfinity = constant_handles.reader_make_constant_shell( makeString( "MinusInfinity" ) );
    $sym6$POSSIBLY_INFINITE_OR_EXTENDED_NUMBER_P = makeSymbol( "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-P" );
    $str7$___TimesFn__S__S_______Old___S___ = makeString( "(#$TimesFn ~S ~S)...~% Old: ~S~% New: ~S" );
    $str8$___QuotientFn__S__S_______Old___S = makeString( "(#$QuotientFn ~S ~S)...~% Old: ~S~% New: ~S" );
    $str9$___PlusFn__S__S_______Old___S___N = makeString( "(#$PlusFn ~S ~S)...~% Old: ~S~% New: ~S" );
    $str10$___MinusFn__S__S_______Old___S___ = makeString( "(#$MinusFn ~S ~S)...~% Old: ~S~% New: ~S" );
    $sym11$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $str12$Raising__S_to_the_power__S_would_ = makeString( "Raising ~S to the power ~S would result in an imaginary number." );
    $str13$Can_t_do_modulo_with_0_base_ = makeString( "Can't do modulo with 0 base." );
    $str14$Looks_like_not_enough_significant = makeString( "Looks like not enough significant digits to compute a modulo." );
    $int15$1000 = makeInteger( 1000 );
    $sym16$TEST_ZEROP = makeSymbol( "TEST-ZEROP" );
    $kw17$TEST = makeKeyword( "TEST" );
    $kw18$OWNER = makeKeyword( "OWNER" );
    $kw19$CLASSES = makeKeyword( "CLASSES" );
    $kw20$KB = makeKeyword( "KB" );
    $kw21$FULL = makeKeyword( "FULL" );
    $kw22$WORKING_ = makeKeyword( "WORKING?" );
    $list23 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ZERO_INTEGER ), T ), ConsesLow.list( ConsesLow.list( NIL ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), ZERO_INTEGER, TEN_INTEGER ) ), NIL ) );
  }
}
/*
 * 
 * Total time: 389 ms
 * 
 */