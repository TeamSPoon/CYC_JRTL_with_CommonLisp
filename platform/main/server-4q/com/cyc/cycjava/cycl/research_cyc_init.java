package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class research_cyc_init
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.research_cyc_init";
  public static final String myFingerPrint = "f08c09ffc03432cb2a6abab2c06945a2fb894de12aabc21b774e94f2fd7298ba";
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 907L)
  private static SubLSymbol $research_cyc_initialization_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1145L)
  public static SubLSymbol $master_license_key$;
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1552L)
  private static SubLSymbol $research_cyc_license_key_invalid_string$;
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1659L)
  private static SubLSymbol $research_cyc_license_key_expired_string$;
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 4397L)
  private static SubLSymbol $stashed_kb_object_lookup_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 7034L)
  private static SubLSymbol $stashed_kb_object_content_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9346L)
  private static SubLSymbol $stashed_kb_indexing_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11320L)
  private static SubLSymbol $stashed_inference_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14292L)
  private static SubLSymbol $stashed_other_vars$;
  private static final SubLSymbol $sym0$_RESEARCH_CYC_INITIALIZATION_METHODS_;
  private static final SubLObject $list1;
  private static final SubLSymbol $sym2$_MASTER_LICENSE_KEY_;
  private static final SubLString $str3$ResearchCyc_License_Key_has_not_b;
  private static final SubLString $str4$ResearchCyc_License_Key_invalid_;
  private static final SubLString $str5$Your_current_Cyc_license_is_no_lo;
  private static final SubLSymbol $sym6$STRINGP;
  private static final SubLInteger $int7$24;
  private static final SubLString $str8$0000_0000_0000_0000_0000;
  private static final SubLList $list9;
  private static final SubLInteger $int10$256;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLInteger $int13$20000000;
  private static final SubLInteger $int14$65536;
  private static final SubLInteger $int15$4096;
  private static final SubLSymbol $sym16$UNIVERSAL_DATE_P;
  private static final SubLSymbol $sym17$_STASHED_KB_OBJECT_LOOKUP_VARS_;
  private static final SubLSymbol $kw18$UNINITIALIZED;
  private static final SubLSymbol $sym19$_CONSTANT_FROM_GUID_;
  private static final SubLSymbol $sym20$_CONSTANT_FROM_SUID_;
  private static final SubLSymbol $sym21$_NART_FROM_ID_;
  private static final SubLSymbol $sym22$_ASSERTION_FROM_ID_;
  private static final SubLSymbol $sym23$_DEDUCTION_FROM_ID_;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$_STASHED_KB_OBJECT_CONTENT_VARS_;
  private static final SubLSymbol $sym26$_CONSTANT_GUID_TABLE_;
  private static final SubLSymbol $sym27$_NART_HL_FORMULA_TABLE_;
  private static final SubLSymbol $sym28$_ASSERTION_CONTENT_MANAGER_;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$_STASHED_KB_INDEXING_VARS_;
  private static final SubLSymbol $sym31$_CONSTANT_INDEX_MANAGER_;
  private static final SubLSymbol $sym32$_NART_INDEX_MANAGER_;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$_STASHED_INFERENCE_VARS_;
  private static final SubLSymbol $sym35$_SBHL_MODULES_;
  private static final SubLSymbol $sym36$_ISA_CACHE_;
  private static final SubLSymbol $sym37$_ALL_MTS_ISA_CACHE_;
  private static final SubLSymbol $sym38$_GENLS_CACHE_;
  private static final SubLSymbol $sym39$_ALL_MTS_GENLS_CACHE_;
  private static final SubLSymbol $sym40$_GENL_PREDICATE_CACHE_;
  private static final SubLSymbol $sym41$_GENL_INVERSE_CACHE_;
  private static final SubLSymbol $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_;
  private static final SubLSymbol $sym43$_ALL_MTS_GENL_INVERSE_CACHE_;
  private static final SubLSymbol $sym44$_SBHL_MODULE_KEY_TEST_;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$_STASHED_OTHER_VARS_;
  private static final SubLSymbol $sym47$_SUBL_EVAL_METHOD_;
  private static final SubLSymbol $sym48$_HTML_HANDLER_PROPERTY_;

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1023L)
  public static SubLObject research_cyc_initialization_funcall(final SubLObject n)
  {
    return Functions.funcall( ConsesLow.nth( n, $research_cyc_initialization_methods$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1191L)
  public static SubLObject get_master_license_key()
  {
    SubLObject license_key = NIL;
    license_key = $master_license_key$.getGlobalValue();
    return license_key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1432L)
  public static SubLObject research_cyc_license_key_error()
  {
    return Errors.error( $str3$ResearchCyc_License_Key_has_not_b );
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1839L)
  public static SubLObject research_cyc_install_license_key(final SubLObject license_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( license_key ) : license_key;
    if( NIL != list_utilities.lengthE( license_key, $int7$24, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject key_integers = interpret_license_key( license_key );
      final SubLObject expiration_date = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !expiration_date.numGE( numeric_date_utilities.today() ) )
      {
        if( false )
          Errors.error( $research_cyc_license_key_expired_string$.getGlobalValue() );
      }
      SubLObject cdolist_list_var = key_integers;
      SubLObject n = NIL;
      n = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        research_cyc_initialization_funcall( n );
        cdolist_list_var = cdolist_list_var.rest();
        n = cdolist_list_var.first();
      }
      return T;
    }
    if( NIL != list_utilities.lengthE( license_key, NINETEEN_INTEGER, UNPROVIDED ) )
    {
      Errors.error( $research_cyc_license_key_expired_string$.getGlobalValue() );
    }
    else
    {
      Errors.error( $research_cyc_license_key_invalid_string$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 2402L)
  public static SubLObject research_cyc_pre_initializations()
  {
    SubLObject license_key = get_master_license_key();
    if( NIL == license_key )
    {
      license_key = $str8$0000_0000_0000_0000_0000;
    }
    research_cyc_install_license_key( license_key );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 2682L)
  public static SubLObject perform_research_cyc_build_finalizations()
  {
    stash_kb_object_lookup_vars();
    stash_kb_object_content_vars();
    stash_kb_indexing_vars();
    stash_inference_vars();
    stash_other_vars();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 2894L)
  public static SubLObject perform_research_cyc_load_finalizations()
  {
    perform_research_cyc_build_finalizations();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 3055L)
  public static SubLObject interpret_license_key(final SubLObject key)
  {
    final SubLObject strings = string_utilities.split_string( key, $list9 );
    SubLObject key_integers = NIL;
    SubLObject raw_nybbles = NIL;
    SubLObject expiration_date = NIL;
    SubLObject cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject nybble = string_utilities.hex_char_value( Strings.sublisp_char( string, ZERO_INTEGER ) );
      final SubLObject integer = Numbers.add( Numbers.multiply( string_utilities.hex_char_value( Strings.sublisp_char( string, ONE_INTEGER ) ), $int10$256 ), Numbers.multiply( string_utilities.hex_char_value( Strings
          .sublisp_char( string, TWO_INTEGER ) ), SIXTEEN_INTEGER ), Numbers.multiply( string_utilities.hex_char_value( Strings.sublisp_char( string, THREE_INTEGER ) ), ONE_INTEGER ) );
      key_integers = ConsesLow.cons( integer, key_integers );
      raw_nybbles = ConsesLow.cons( nybble, raw_nybbles );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    key_integers = Sequences.nreverse( key_integers );
    raw_nybbles = Sequences.nreverse( raw_nybbles );
    expiration_date = interpret_license_expiration_date_nybbles( raw_nybbles );
    return Values.values( key_integers, expiration_date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 3787L)
  public static SubLObject interpret_license_expiration_date_nybbles(final SubLObject raw_nybbles)
  {
    SubLObject nybbles = NIL;
    SubLObject raw_nybble = NIL;
    SubLObject raw_nybble_$1 = NIL;
    SubLObject expiration_mask = NIL;
    SubLObject expiration_mask_$2 = NIL;
    raw_nybble = raw_nybbles;
    raw_nybble_$1 = raw_nybble.first();
    expiration_mask = $list11;
    expiration_mask_$2 = expiration_mask.first();
    while ( NIL != expiration_mask || NIL != raw_nybble)
    {
      nybbles = ConsesLow.cons( Numbers.logxor( raw_nybble_$1, expiration_mask_$2 ), nybbles );
      raw_nybble = raw_nybble.rest();
      raw_nybble_$1 = raw_nybble.first();
      expiration_mask = expiration_mask.rest();
      expiration_mask_$2 = expiration_mask.first();
    }
    nybbles = Sequences.nreverse( nybbles );
    SubLObject current;
    final SubLObject datum = current = nybbles;
    SubLObject nybble4 = NIL;
    SubLObject nybble5 = NIL;
    SubLObject nybble6 = NIL;
    SubLObject nybble7 = NIL;
    SubLObject nybble8 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    nybble4 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    nybble5 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    nybble6 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    nybble7 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    nybble8 = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
      return NIL;
    }
    final SubLObject date = Numbers.add( new SubLObject[] { $int13$20000000, Numbers.multiply( nybble4, $int14$65536 ), Numbers.multiply( nybble5, $int15$4096 ), Numbers.multiply( nybble6, $int10$256 ), Numbers.multiply(
        nybble7, SIXTEEN_INTEGER ), Numbers.multiply( nybble8, ONE_INTEGER )
    } );
    assert NIL != numeric_date_utilities.universal_date_p( date ) : date;
    return date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 4671L)
  public static SubLObject stash_kb_object_lookup_vars()
  {
    $stashed_kb_object_lookup_vars$.setGlobalValue( ConsesLow.list( Symbols.symbol_value( $sym19$_CONSTANT_FROM_GUID_ ), Symbols.symbol_value( $sym20$_CONSTANT_FROM_SUID_ ), Symbols.symbol_value( $sym21$_NART_FROM_ID_ ),
        Symbols.symbol_value( $sym22$_ASSERTION_FROM_ID_ ), Symbols.symbol_value( $sym23$_DEDUCTION_FROM_ID_ ) ) );
    Symbols.set( $sym19$_CONSTANT_FROM_GUID_, NIL );
    Symbols.set( $sym20$_CONSTANT_FROM_SUID_, NIL );
    Symbols.set( $sym21$_NART_FROM_ID_, NIL );
    Symbols.set( $sym22$_ASSERTION_FROM_ID_, NIL );
    Symbols.set( $sym23$_DEDUCTION_FROM_ID_, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5183L)
  public static SubLObject unstash_kb_object_lookup_vars()
  {
    if( $stashed_kb_object_lookup_vars$.getGlobalValue().isList() && NIL != list_utilities.lengthE( $stashed_kb_object_lookup_vars$.getGlobalValue(), FIVE_INTEGER, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = $stashed_kb_object_lookup_vars$.getGlobalValue();
      SubLObject one = NIL;
      SubLObject two = NIL;
      SubLObject three = NIL;
      SubLObject four = NIL;
      SubLObject five = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      one = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      two = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      three = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      four = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      five = current.first();
      current = current.rest();
      if( NIL == current )
      {
        Symbols.set( $sym19$_CONSTANT_FROM_GUID_, one );
        Symbols.set( $sym20$_CONSTANT_FROM_SUID_, two );
        Symbols.set( $sym21$_NART_FROM_ID_, three );
        Symbols.set( $sym22$_ASSERTION_FROM_ID_, four );
        Symbols.set( $sym23$_DEDUCTION_FROM_ID_, five );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5668L)
  public static SubLObject unstash_kb_object_lookup_vars_1()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5760L)
  public static SubLObject unstash_kb_object_lookup_vars_2()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5851L)
  public static SubLObject unstash_kb_object_lookup_vars_3()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5942L)
  public static SubLObject unstash_kb_object_lookup_vars_4()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6033L)
  public static SubLObject unstash_kb_object_lookup_vars_5()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6124L)
  public static SubLObject unstash_kb_object_lookup_vars_6()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6215L)
  public static SubLObject unstash_kb_object_lookup_vars_7()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6306L)
  public static SubLObject unstash_kb_object_lookup_vars_8()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6397L)
  public static SubLObject unstash_kb_object_lookup_vars_9()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6488L)
  public static SubLObject unstash_kb_object_lookup_vars_10()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6579L)
  public static SubLObject unstash_kb_object_lookup_vars_11()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6670L)
  public static SubLObject unstash_kb_object_lookup_vars_12()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6761L)
  public static SubLObject unstash_kb_object_lookup_vars_13()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6852L)
  public static SubLObject unstash_kb_object_lookup_vars_14()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6943L)
  public static SubLObject unstash_kb_object_lookup_vars_15()
  {
    return unstash_kb_object_lookup_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 7125L)
  public static SubLObject stash_kb_object_content_vars()
  {
    $stashed_kb_object_content_vars$.setGlobalValue( ConsesLow.list( Symbols.symbol_value( $sym26$_CONSTANT_GUID_TABLE_ ), Symbols.symbol_value( $sym27$_NART_HL_FORMULA_TABLE_ ), Symbols.symbol_value(
        $sym28$_ASSERTION_CONTENT_MANAGER_ ) ) );
    Symbols.set( $sym26$_CONSTANT_GUID_TABLE_, $kw18$UNINITIALIZED );
    Symbols.set( $sym27$_NART_HL_FORMULA_TABLE_, $kw18$UNINITIALIZED );
    Symbols.set( $sym28$_ASSERTION_CONTENT_MANAGER_, $kw18$UNINITIALIZED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 7522L)
  public static SubLObject unstash_kb_object_content_vars()
  {
    if( NIL != Symbols.symbol_value( $sym19$_CONSTANT_FROM_GUID_ ) && $stashed_kb_object_content_vars$.getGlobalValue().isList() && NIL != list_utilities.lengthE( $stashed_kb_object_content_vars$.getGlobalValue(),
        THREE_INTEGER, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = $stashed_kb_object_content_vars$.getGlobalValue();
      SubLObject one = NIL;
      SubLObject two = NIL;
      SubLObject three = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      one = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      two = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      three = current.first();
      current = current.rest();
      if( NIL == current )
      {
        Symbols.set( $sym26$_CONSTANT_GUID_TABLE_, one );
        Symbols.set( $sym27$_NART_HL_FORMULA_TABLE_, two );
        Symbols.set( $sym28$_ASSERTION_CONTENT_MANAGER_, three );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 7950L)
  public static SubLObject unstash_kb_object_content_vars_1()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8044L)
  public static SubLObject unstash_kb_object_content_vars_2()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8137L)
  public static SubLObject unstash_kb_object_content_vars_3()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8230L)
  public static SubLObject unstash_kb_object_content_vars_4()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8323L)
  public static SubLObject unstash_kb_object_content_vars_5()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8416L)
  public static SubLObject unstash_kb_object_content_vars_6()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8509L)
  public static SubLObject unstash_kb_object_content_vars_7()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8602L)
  public static SubLObject unstash_kb_object_content_vars_8()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8695L)
  public static SubLObject unstash_kb_object_content_vars_9()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8788L)
  public static SubLObject unstash_kb_object_content_vars_10()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8881L)
  public static SubLObject unstash_kb_object_content_vars_11()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8974L)
  public static SubLObject unstash_kb_object_content_vars_12()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9067L)
  public static SubLObject unstash_kb_object_content_vars_13()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9160L)
  public static SubLObject unstash_kb_object_content_vars_14()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9253L)
  public static SubLObject unstash_kb_object_content_vars_15()
  {
    return unstash_kb_object_content_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9425L)
  public static SubLObject stash_kb_indexing_vars()
  {
    $stashed_kb_indexing_vars$.setGlobalValue( ConsesLow.list( Symbols.symbol_value( $sym31$_CONSTANT_INDEX_MANAGER_ ), Symbols.symbol_value( $sym32$_NART_INDEX_MANAGER_ ) ) );
    Symbols.set( $sym31$_CONSTANT_INDEX_MANAGER_, $kw18$UNINITIALIZED );
    Symbols.set( $sym32$_NART_INDEX_MANAGER_, $kw18$UNINITIALIZED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9709L)
  public static SubLObject unstash_kb_indexing_vars()
  {
    if( NIL != Symbols.symbol_value( $sym19$_CONSTANT_FROM_GUID_ ) && NIL != Symbols.symbol_value( $sym26$_CONSTANT_GUID_TABLE_ ) && $stashed_kb_indexing_vars$.getGlobalValue().isList() && NIL != list_utilities.lengthE(
        $stashed_kb_indexing_vars$.getGlobalValue(), TWO_INTEGER, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = $stashed_kb_indexing_vars$.getGlobalValue();
      SubLObject one = NIL;
      SubLObject two = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      one = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      two = current.first();
      current = current.rest();
      if( NIL == current )
      {
        Symbols.set( $sym31$_CONSTANT_INDEX_MANAGER_, one );
        Symbols.set( $sym32$_NART_INDEX_MANAGER_, two );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10104L)
  public static SubLObject unstash_kb_indexing_vars_1()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10186L)
  public static SubLObject unstash_kb_indexing_vars_2()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10267L)
  public static SubLObject unstash_kb_indexing_vars_3()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10348L)
  public static SubLObject unstash_kb_indexing_vars_4()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10429L)
  public static SubLObject unstash_kb_indexing_vars_5()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10510L)
  public static SubLObject unstash_kb_indexing_vars_6()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10591L)
  public static SubLObject unstash_kb_indexing_vars_7()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10672L)
  public static SubLObject unstash_kb_indexing_vars_8()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10753L)
  public static SubLObject unstash_kb_indexing_vars_9()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10834L)
  public static SubLObject unstash_kb_indexing_vars_10()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10915L)
  public static SubLObject unstash_kb_indexing_vars_11()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10996L)
  public static SubLObject unstash_kb_indexing_vars_12()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11077L)
  public static SubLObject unstash_kb_indexing_vars_13()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11158L)
  public static SubLObject unstash_kb_indexing_vars_14()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11239L)
  public static SubLObject unstash_kb_indexing_vars_15()
  {
    return unstash_kb_indexing_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11395L)
  public static SubLObject stash_inference_vars()
  {
    $stashed_inference_vars$.setGlobalValue( ConsesLow.list( new SubLObject[] { Symbols.symbol_value( $sym35$_SBHL_MODULES_ ), Symbols.symbol_value( $sym36$_ISA_CACHE_ ), Symbols.symbol_value(
        $sym37$_ALL_MTS_ISA_CACHE_ ), Symbols.symbol_value( $sym38$_GENLS_CACHE_ ), Symbols.symbol_value( $sym39$_ALL_MTS_GENLS_CACHE_ ), Symbols.symbol_value( $sym40$_GENL_PREDICATE_CACHE_ ), Symbols.symbol_value(
            $sym41$_GENL_INVERSE_CACHE_ ), Symbols.symbol_value( $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_ ), Symbols.symbol_value( $sym43$_ALL_MTS_GENL_INVERSE_CACHE_ )
    } ) );
    Symbols.set( $sym35$_SBHL_MODULES_, dictionary.new_dictionary( Symbols.symbol_value( $sym44$_SBHL_MODULE_KEY_TEST_ ), UNPROVIDED ) );
    Symbols.set( $sym36$_ISA_CACHE_, NIL );
    Symbols.set( $sym37$_ALL_MTS_ISA_CACHE_, NIL );
    Symbols.set( $sym38$_GENLS_CACHE_, NIL );
    Symbols.set( $sym39$_ALL_MTS_GENLS_CACHE_, NIL );
    Symbols.set( $sym40$_GENL_PREDICATE_CACHE_, NIL );
    Symbols.set( $sym41$_GENL_INVERSE_CACHE_, NIL );
    Symbols.set( $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_, NIL );
    Symbols.set( $sym43$_ALL_MTS_GENL_INVERSE_CACHE_, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 12306L)
  public static SubLObject unstash_inference_vars()
  {
    if( NIL != Symbols.symbol_value( $sym19$_CONSTANT_FROM_GUID_ ) && NIL != Symbols.symbol_value( $sym26$_CONSTANT_GUID_TABLE_ ) && NIL != Symbols.symbol_value( $sym31$_CONSTANT_INDEX_MANAGER_ )
        && $stashed_inference_vars$.getGlobalValue().isList() && NIL != list_utilities.lengthE( $stashed_inference_vars$.getGlobalValue(), NINE_INTEGER, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = $stashed_inference_vars$.getGlobalValue();
      SubLObject one = NIL;
      SubLObject two = NIL;
      SubLObject three = NIL;
      SubLObject four = NIL;
      SubLObject five = NIL;
      SubLObject six = NIL;
      SubLObject seven = NIL;
      SubLObject eight = NIL;
      SubLObject nine = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      one = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      two = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      three = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      four = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      five = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      six = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      seven = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      eight = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      nine = current.first();
      current = current.rest();
      if( NIL == current )
      {
        Symbols.set( $sym35$_SBHL_MODULES_, one );
        Symbols.set( $sym36$_ISA_CACHE_, two );
        Symbols.set( $sym37$_ALL_MTS_ISA_CACHE_, three );
        Symbols.set( $sym38$_GENLS_CACHE_, four );
        Symbols.set( $sym39$_ALL_MTS_GENLS_CACHE_, five );
        Symbols.set( $sym40$_GENL_PREDICATE_CACHE_, six );
        Symbols.set( $sym41$_GENL_INVERSE_CACHE_, seven );
        Symbols.set( $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_, eight );
        Symbols.set( $sym43$_ALL_MTS_GENL_INVERSE_CACHE_, nine );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13136L)
  public static SubLObject unstash_inference_vars_1()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13214L)
  public static SubLObject unstash_inference_vars_2()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13291L)
  public static SubLObject unstash_inference_vars_3()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13368L)
  public static SubLObject unstash_inference_vars_4()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13445L)
  public static SubLObject unstash_inference_vars_5()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13522L)
  public static SubLObject unstash_inference_vars_6()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13599L)
  public static SubLObject unstash_inference_vars_7()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13676L)
  public static SubLObject unstash_inference_vars_8()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13753L)
  public static SubLObject unstash_inference_vars_9()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13830L)
  public static SubLObject unstash_inference_vars_10()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13907L)
  public static SubLObject unstash_inference_vars_11()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13984L)
  public static SubLObject unstash_inference_vars_12()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14061L)
  public static SubLObject unstash_inference_vars_13()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14138L)
  public static SubLObject unstash_inference_vars_14()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14215L)
  public static SubLObject unstash_inference_vars_15()
  {
    return unstash_inference_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14359L)
  public static SubLObject stash_other_vars()
  {
    $stashed_other_vars$.setGlobalValue( ConsesLow.list( Symbols.symbol_value( $sym47$_SUBL_EVAL_METHOD_ ), Symbols.symbol_value( $sym48$_HTML_HANDLER_PROPERTY_ ) ) );
    Symbols.set( $sym47$_SUBL_EVAL_METHOD_, NIL );
    Symbols.set( $sym48$_HTML_HANDLER_PROPERTY_, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14604L)
  public static SubLObject unstash_other_vars()
  {
    if( NIL != Symbols.symbol_value( $sym19$_CONSTANT_FROM_GUID_ ) && NIL != Symbols.symbol_value( $sym26$_CONSTANT_GUID_TABLE_ ) && NIL != Symbols.symbol_value( $sym31$_CONSTANT_INDEX_MANAGER_ ) && NIL != Symbols
        .symbol_value( $sym35$_SBHL_MODULES_ ) && $stashed_other_vars$.getGlobalValue().isList() && NIL != list_utilities.lengthE( $stashed_other_vars$.getGlobalValue(), TWO_INTEGER, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = $stashed_other_vars$.getGlobalValue();
      SubLObject one = NIL;
      SubLObject two = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      one = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      two = current.first();
      current = current.rest();
      if( NIL == current )
      {
        Symbols.set( $sym47$_SUBL_EVAL_METHOD_, one );
        Symbols.set( $sym48$_HTML_HANDLER_PROPERTY_, two );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15061L)
  public static SubLObject unstash_other_vars_1()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15131L)
  public static SubLObject unstash_other_vars_2()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15200L)
  public static SubLObject unstash_other_vars_3()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15269L)
  public static SubLObject unstash_other_vars_4()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15338L)
  public static SubLObject unstash_other_vars_5()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15407L)
  public static SubLObject unstash_other_vars_6()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15476L)
  public static SubLObject unstash_other_vars_7()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15545L)
  public static SubLObject unstash_other_vars_8()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15614L)
  public static SubLObject unstash_other_vars_9()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15683L)
  public static SubLObject unstash_other_vars_10()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15752L)
  public static SubLObject unstash_other_vars_11()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15821L)
  public static SubLObject unstash_other_vars_12()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15890L)
  public static SubLObject unstash_other_vars_13()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15959L)
  public static SubLObject unstash_other_vars_14()
  {
    return unstash_other_vars();
  }

  @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 16028L)
  public static SubLObject unstash_other_vars_15()
  {
    return unstash_other_vars();
  }

  public static SubLObject declare_research_cyc_init_file()
  {
    SubLFiles.declareFunction( me, "research_cyc_initialization_funcall", "RESEARCH-CYC-INITIALIZATION-FUNCALL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_master_license_key", "GET-MASTER-LICENSE-KEY", 0, 0, false );
    SubLFiles.declareFunction( me, "research_cyc_license_key_error", "RESEARCH-CYC-LICENSE-KEY-ERROR", 0, 0, false );
    SubLFiles.declareFunction( me, "research_cyc_install_license_key", "RESEARCH-CYC-INSTALL-LICENSE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "research_cyc_pre_initializations", "RESEARCH-CYC-PRE-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "perform_research_cyc_build_finalizations", "PERFORM-RESEARCH-CYC-BUILD-FINALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "perform_research_cyc_load_finalizations", "PERFORM-RESEARCH-CYC-LOAD-FINALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "interpret_license_key", "INTERPRET-LICENSE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "interpret_license_expiration_date_nybbles", "INTERPRET-LICENSE-EXPIRATION-DATE-NYBBLES", 1, 0, false );
    SubLFiles.declareFunction( me, "stash_kb_object_lookup_vars", "STASH-KB-OBJECT-LOOKUP-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars", "UNSTASH-KB-OBJECT-LOOKUP-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_1", "UNSTASH-KB-OBJECT-LOOKUP-VARS-1", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_2", "UNSTASH-KB-OBJECT-LOOKUP-VARS-2", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_3", "UNSTASH-KB-OBJECT-LOOKUP-VARS-3", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_4", "UNSTASH-KB-OBJECT-LOOKUP-VARS-4", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_5", "UNSTASH-KB-OBJECT-LOOKUP-VARS-5", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_6", "UNSTASH-KB-OBJECT-LOOKUP-VARS-6", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_7", "UNSTASH-KB-OBJECT-LOOKUP-VARS-7", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_8", "UNSTASH-KB-OBJECT-LOOKUP-VARS-8", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_9", "UNSTASH-KB-OBJECT-LOOKUP-VARS-9", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_10", "UNSTASH-KB-OBJECT-LOOKUP-VARS-10", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_11", "UNSTASH-KB-OBJECT-LOOKUP-VARS-11", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_12", "UNSTASH-KB-OBJECT-LOOKUP-VARS-12", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_13", "UNSTASH-KB-OBJECT-LOOKUP-VARS-13", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_14", "UNSTASH-KB-OBJECT-LOOKUP-VARS-14", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_lookup_vars_15", "UNSTASH-KB-OBJECT-LOOKUP-VARS-15", 0, 0, false );
    SubLFiles.declareFunction( me, "stash_kb_object_content_vars", "STASH-KB-OBJECT-CONTENT-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars", "UNSTASH-KB-OBJECT-CONTENT-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_1", "UNSTASH-KB-OBJECT-CONTENT-VARS-1", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_2", "UNSTASH-KB-OBJECT-CONTENT-VARS-2", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_3", "UNSTASH-KB-OBJECT-CONTENT-VARS-3", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_4", "UNSTASH-KB-OBJECT-CONTENT-VARS-4", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_5", "UNSTASH-KB-OBJECT-CONTENT-VARS-5", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_6", "UNSTASH-KB-OBJECT-CONTENT-VARS-6", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_7", "UNSTASH-KB-OBJECT-CONTENT-VARS-7", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_8", "UNSTASH-KB-OBJECT-CONTENT-VARS-8", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_9", "UNSTASH-KB-OBJECT-CONTENT-VARS-9", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_10", "UNSTASH-KB-OBJECT-CONTENT-VARS-10", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_11", "UNSTASH-KB-OBJECT-CONTENT-VARS-11", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_12", "UNSTASH-KB-OBJECT-CONTENT-VARS-12", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_13", "UNSTASH-KB-OBJECT-CONTENT-VARS-13", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_14", "UNSTASH-KB-OBJECT-CONTENT-VARS-14", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_object_content_vars_15", "UNSTASH-KB-OBJECT-CONTENT-VARS-15", 0, 0, false );
    SubLFiles.declareFunction( me, "stash_kb_indexing_vars", "STASH-KB-INDEXING-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars", "UNSTASH-KB-INDEXING-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_1", "UNSTASH-KB-INDEXING-VARS-1", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_2", "UNSTASH-KB-INDEXING-VARS-2", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_3", "UNSTASH-KB-INDEXING-VARS-3", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_4", "UNSTASH-KB-INDEXING-VARS-4", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_5", "UNSTASH-KB-INDEXING-VARS-5", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_6", "UNSTASH-KB-INDEXING-VARS-6", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_7", "UNSTASH-KB-INDEXING-VARS-7", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_8", "UNSTASH-KB-INDEXING-VARS-8", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_9", "UNSTASH-KB-INDEXING-VARS-9", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_10", "UNSTASH-KB-INDEXING-VARS-10", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_11", "UNSTASH-KB-INDEXING-VARS-11", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_12", "UNSTASH-KB-INDEXING-VARS-12", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_13", "UNSTASH-KB-INDEXING-VARS-13", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_14", "UNSTASH-KB-INDEXING-VARS-14", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_kb_indexing_vars_15", "UNSTASH-KB-INDEXING-VARS-15", 0, 0, false );
    SubLFiles.declareFunction( me, "stash_inference_vars", "STASH-INFERENCE-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars", "UNSTASH-INFERENCE-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_1", "UNSTASH-INFERENCE-VARS-1", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_2", "UNSTASH-INFERENCE-VARS-2", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_3", "UNSTASH-INFERENCE-VARS-3", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_4", "UNSTASH-INFERENCE-VARS-4", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_5", "UNSTASH-INFERENCE-VARS-5", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_6", "UNSTASH-INFERENCE-VARS-6", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_7", "UNSTASH-INFERENCE-VARS-7", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_8", "UNSTASH-INFERENCE-VARS-8", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_9", "UNSTASH-INFERENCE-VARS-9", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_10", "UNSTASH-INFERENCE-VARS-10", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_11", "UNSTASH-INFERENCE-VARS-11", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_12", "UNSTASH-INFERENCE-VARS-12", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_13", "UNSTASH-INFERENCE-VARS-13", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_14", "UNSTASH-INFERENCE-VARS-14", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_inference_vars_15", "UNSTASH-INFERENCE-VARS-15", 0, 0, false );
    SubLFiles.declareFunction( me, "stash_other_vars", "STASH-OTHER-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars", "UNSTASH-OTHER-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_1", "UNSTASH-OTHER-VARS-1", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_2", "UNSTASH-OTHER-VARS-2", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_3", "UNSTASH-OTHER-VARS-3", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_4", "UNSTASH-OTHER-VARS-4", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_5", "UNSTASH-OTHER-VARS-5", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_6", "UNSTASH-OTHER-VARS-6", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_7", "UNSTASH-OTHER-VARS-7", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_8", "UNSTASH-OTHER-VARS-8", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_9", "UNSTASH-OTHER-VARS-9", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_10", "UNSTASH-OTHER-VARS-10", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_11", "UNSTASH-OTHER-VARS-11", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_12", "UNSTASH-OTHER-VARS-12", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_13", "UNSTASH-OTHER-VARS-13", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_14", "UNSTASH-OTHER-VARS-14", 0, 0, false );
    SubLFiles.declareFunction( me, "unstash_other_vars_15", "UNSTASH-OTHER-VARS-15", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_research_cyc_init_file()
  {
    $research_cyc_initialization_methods$ = SubLFiles.deflexical( "*RESEARCH-CYC-INITIALIZATION-METHODS*", ( NIL != Symbols.boundp( $sym0$_RESEARCH_CYC_INITIALIZATION_METHODS_ ) ) ? $research_cyc_initialization_methods$
        .getGlobalValue() : $list1 );
    $master_license_key$ = SubLFiles.deflexical( "*MASTER-LICENSE-KEY*", ( NIL != Symbols.boundp( $sym2$_MASTER_LICENSE_KEY_ ) ) ? $master_license_key$.getGlobalValue() : NIL );
    $research_cyc_license_key_invalid_string$ = SubLFiles.deflexical( "*RESEARCH-CYC-LICENSE-KEY-INVALID-STRING*", $str4$ResearchCyc_License_Key_invalid_ );
    $research_cyc_license_key_expired_string$ = SubLFiles.deflexical( "*RESEARCH-CYC-LICENSE-KEY-EXPIRED-STRING*", $str5$Your_current_Cyc_license_is_no_lo );
    $stashed_kb_object_lookup_vars$ = SubLFiles.deflexical( "*STASHED-KB-OBJECT-LOOKUP-VARS*", ( NIL != Symbols.boundp( $sym17$_STASHED_KB_OBJECT_LOOKUP_VARS_ ) ) ? $stashed_kb_object_lookup_vars$.getGlobalValue()
        : $kw18$UNINITIALIZED );
    $stashed_kb_object_content_vars$ = SubLFiles.deflexical( "*STASHED-KB-OBJECT-CONTENT-VARS*", ( NIL != Symbols.boundp( $sym25$_STASHED_KB_OBJECT_CONTENT_VARS_ ) ) ? $stashed_kb_object_content_vars$.getGlobalValue()
        : $kw18$UNINITIALIZED );
    $stashed_kb_indexing_vars$ = SubLFiles.deflexical( "*STASHED-KB-INDEXING-VARS*", ( NIL != Symbols.boundp( $sym30$_STASHED_KB_INDEXING_VARS_ ) ) ? $stashed_kb_indexing_vars$.getGlobalValue() : $kw18$UNINITIALIZED );
    $stashed_inference_vars$ = SubLFiles.deflexical( "*STASHED-INFERENCE-VARS*", ( NIL != Symbols.boundp( $sym34$_STASHED_INFERENCE_VARS_ ) ) ? $stashed_inference_vars$.getGlobalValue() : $kw18$UNINITIALIZED );
    $stashed_other_vars$ = SubLFiles.deflexical( "*STASHED-OTHER-VARS*", ( NIL != Symbols.boundp( $sym46$_STASHED_OTHER_VARS_ ) ) ? $stashed_other_vars$.getGlobalValue() : $kw18$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_research_cyc_init_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_RESEARCH_CYC_INITIALIZATION_METHODS_ );
    subl_macro_promotions.declare_defglobal( $sym2$_MASTER_LICENSE_KEY_ );
    subl_macro_promotions.declare_defglobal( $sym17$_STASHED_KB_OBJECT_LOOKUP_VARS_ );
    subl_macro_promotions.declare_defglobal( $sym25$_STASHED_KB_OBJECT_CONTENT_VARS_ );
    subl_macro_promotions.declare_defglobal( $sym30$_STASHED_KB_INDEXING_VARS_ );
    subl_macro_promotions.declare_defglobal( $sym34$_STASHED_INFERENCE_VARS_ );
    subl_macro_promotions.declare_defglobal( $sym46$_STASHED_OTHER_VARS_ );
    return NIL;
  }

  private static SubLObject _constant_1_initializer()
  {
    return ConsesLow.list( new SubLObject[] { makeSymbol( "RESEARCH-CYC-LICENSE-KEY-ERROR" ), makeSymbol( "NL-TRIE-NAME-STRING-PREDS" ), makeSymbol( "CLEAR-CLARIFYING-COLLECTION?" ), makeSymbol(
        "CLEAR-GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON" ), makeSymbol( "UNSTASH-INFERENCE-VARS-11" ), makeSymbol( "FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER" ), makeSymbol( "HTML-INSIDE-BODY-P" ), makeSymbol(
            "CLEAR-PPH-PHRASE-ID-DEMERITS" ), makeSymbol( "CB-NAT-HISTORY-ITEMS" ), makeSymbol( "LOAD-NAMESPACE-TRANSCRIPTS" ), makeSymbol( "PARSING-TIMEOUT-TIME-REMAINING" ), makeSymbol( "KBP-NODE-COUNT" ), makeSymbol(
                "CLEAR-GET-CODE-FOR-LANGUAGE" ), makeSymbol( "SBHL-CACHE-TUNING-DATA-GATHERING-EPILOGUE" ), makeSymbol( "CURRENTLY-ACTIVE-PROBLEM-STORE" ), makeSymbol( "ALL-CYC-TESTS-ARE-VALID" ), makeSymbol(
                    "SKSI-BATCH-TRANSLATE-COERCE-TYPES?" ), makeSymbol( "BESTPARENTHETICALPHRASEFN" ), makeSymbol( "UNSTASH-INFERENCE-VARS-4" ), makeSymbol( "ENSURE-RKF-EVENT-DISPATCHER-RUNNING" ), makeSymbol(
                        "CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL" ), makeSymbol( "POSSIBLY-CONVERT-NART-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS" ), makeSymbol( "CLEAR-ALL-SPECS-SET" ), makeSymbol(
                            "PLURALPARAPHRASEFN" ), makeSymbol( "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE" ), makeSymbol( "HAS-KB-STORAGE-CLIENT?" ), makeSymbol( "ALL-CORE-CONSTANTS" ), makeSymbol( "PPH-NEW-EMPTY-MAP" ),
      makeSymbol( "GET-SQS-VERSION" ), makeSymbol( "NEW-PROBLEM-STRATEGIC-PROPERTIES" ), makeSymbol( "REMOVE-SENTENTIAL-OPERATORS" ), makeSymbol( "ALL-QUERY-DYNAMIC-PROPERTIES" ), makeSymbol(
          "CB-SERVER-SHOW-TRANSMIT-QUEUE?" ), makeSymbol( "CLEAR-GEN-TEMPLATE-VERBOSITY" ), makeSymbol( "HALT-JAVA-API-LEASE-MONITOR" ), makeSymbol( "SORT-TRANSCRIPT-RENAMES" ), makeSymbol( "META-REMOVAL-MODULE-LIST" ),
      makeSymbol( "SC-PARSING-MT" ), makeSymbol( "ALL-INFERENCE-UNIT-TEST-NAMES" ), makeSymbol( "INDEXICAL-THE-CURRENT-HOST-NAME" ), makeSymbol( "DUPLICATE-KB-HL-SUPPORTS" ), makeSymbol( "GET-ARC-LEXICON-SLURPER" ),
      makeSymbol( "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-INTERNAL" ), makeSymbol( "COMPUTE-CORE-RAW-CONSTANTS" ), makeSymbol( "IS-SQS-AVAILABLE?" ), makeSymbol( "OUTPUT-GENERATE-TEXT-BAD-RESULTS" ), makeSymbol(
          "INITIALIZE-NON-FORT-ISA-TABLES" ), makeSymbol( "OPTIMIZE-SBHL-STORE" ), makeSymbol( "CLEAR-RELATION-MOST-RESTRICTED-ARG" ), makeSymbol( "CLEAR-L2R-SUPERTEXT-INDEXICAL" ), makeSymbol(
              "EXPLICITIFCOLLECTION-NLPHRASEFN" ), makeSymbol( "CLEAR-BUILD-FACT-SHEET-DEFAULT-DOMAIN-MT" ), makeSymbol( "CLEAR-RELEVANT-TEMPLATE-MTS" ), makeSymbol( "AUXILIARY-QUEUE-PEEK" ), makeSymbol(
                  "CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT" ), makeSymbol( "CLEAR-NEW-KB-STATE" ), makeSymbol( "PPH-REGRESSION-TRACKING-RESET-SKIPS" ), makeSymbol( "GET-SBHL-SEARCH-DIRECTION" ), makeSymbol(
                      "CLEAR-EXTERNAL-IDENTIFICATION-FOR-CHOICE" ), makeSymbol( "INITIALIZE-SKSI-DATA-STRUCTURES" ), makeSymbol( "SPEECH-PARTS-INITIALIZED?" ), makeSymbol( "OPERATOR-FORMULAS-RULE-SUPPORT" ), makeSymbol(
                          "CLEAR-ANSWER-QUESTION" ), makeSymbol( "CLEAR-PS-PARSE-VBAR-INT-CACHED" ), makeSymbol( "CLEAR-PSP-HEAD-KEY-FOR-CATEGORY" ), makeSymbol( "CYC-SYSTEM-DOC-NAMING-CONVENTIONS" ), makeSymbol(
                              "SBHL-NEW-SPACE-SOURCE" ), makeSymbol( "MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT" ), makeSymbol( "GT-SEARCH-INDEX-ARG" ), makeSymbol( "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-VM" ), makeSymbol(
                                  "CLEAR-RELATION-ARGS-SORTED-BY-RESTRICTION" ), makeSymbol( "STASH-KB-INDEXING-VARS" ), makeSymbol( "POSSIBLY-CULL-LOADED-RDF-GRAPHS" ), makeSymbol( "SOFTWARE-TYPE" ), makeSymbol(
                                      "SBHL-BACKWARD-SEARCH-P" ), makeSymbol( "KB-MODIFICATIONS-EVENT-DISPATCHER-RUNNING?" ), makeSymbol( "CB-PARTITION-LOAD-FILENAME-SECTION" ), makeSymbol( "PARTITION-COMMON-SYMBOLS" ),
      makeSymbol( "START-SCHEDULED-QUERY-PROCESSING-INTERNAL" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-12" ), makeSymbol( "NEW-RANDOM-BASIS-FOR-SKOLEM-NAME" ), makeSymbol( "QC-ACT-NEW-STATE" ), makeSymbol(
          "COMPLEX-INDEX-KEYS-DEFINED-P" ), makeSymbol( "CLEAR-XML-NAME" ), makeSymbol( "INITIALIZE-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE" ), makeSymbol( "RC-NEW-RHS" ), makeSymbol( "UNINITIALIZED" ), makeSymbol(
              "COMPUTE-RESEARCH-CYC-INITIALIZATION-METHODS" ), makeSymbol( "SAVE-RECENT-EXPERIENCE-INTERNAL" ), makeSymbol( "MAKE-EMPTY-UI-REQUEST" ), makeSymbol(
                  "GATHER-RELEVANT-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE" ), makeSymbol( "CLEAR-DOCUMENT-ANNOTATION-TERM-ID" ), makeSymbol( "PENNTAG-PHRASE-CATEGORIES" ),
      makeSymbol( "CLEAR-COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT" ), makeSymbol( "CATEGORIZE-KCT-INVALIDITY-REASONS" ), makeSymbol( "CLEAR-MEANING-SENTENCE-MTS" ), makeSymbol(
          "CB-SERVER-SHOW-TRANSMIT-QUEUE?" ), makeSymbol( "GET-SBHL-OPPOSITE-LINK-DIRECTION" ), makeSymbol( "ALL-FORWARD-RULES" ), makeSymbol( "KCT-ANY-THINKING-RUNNING?" ), makeSymbol( "CLEAR-CONSTANT-TABLES" ),
      makeSymbol( "MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT" ), makeSymbol( "POSSIBLY-CONVERT-CONSTANT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS" ), makeSymbol( "SBHL-JUSTIFICATION-ASSEMBLED-P" ), makeSymbol(
          "CLEAR-SKSI-GET-RAW-VAR" ), makeSymbol( "INITIALIZE-SPEECH-PART-PREDS" ), makeSymbol( "CLEAR-TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE" ), makeSymbol( "CLEAR-RESULT" ), makeSymbol(
              "UNLINKEDSUBPARAPHRASEFN" ), makeSymbol( "LAST-QUERY-SET-RUN" ), makeSymbol( "CB-SERVER-SHOW-LOCAL-QUEUE?" ), makeSymbol( "CLEAR-PSP-DEVISABLE-VERB-FRAMES" ), makeSymbol( "CB-KB-QUERY-SHOW-PRAGMATICS" ),
      makeSymbol( "COMPUTE-KBS-RAW-CONSTANTS" ), makeSymbol( "WIDE-ASSERTION-HL-STORE-CACHE?" ), makeSymbol( "CURRENT-FORWARD-INFERENCE-FULLY-PROPAGATING-RULE?" ), makeSymbol( "INITIALIZE-DISJOINT-WITH-MODULE" ),
      makeSymbol( "HAS-NEW-CONSTANTS?" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-14" ), makeSymbol( "HAS-NEW-NARTS?" ), makeSymbol( "CREATE-SAMPLE-INVALID-CLAUSE-STRUC" ), makeSymbol( "WNI-SYNSET-INDIVIDUALS" ),
      makeSymbol( "CLEAR-WNI-SYNSET-VERB-FRAMES-HELPER" ), makeSymbol( "DISABLE-AGENDA-DAILY-GC" ), makeSymbol( "RBP-UNTRACE-ALL-RULES" ), makeSymbol( "NEW-CFASL-COUNT-STREAM" ), makeSymbol( "XML-CDATA-SUFFIX" ),
      makeSymbol( "FIND-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE" ), makeSymbol( "GET-AVAILABLE-SEARCH-ENGINES" ), makeSymbol( "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE" ),
      makeSymbol( "MEDIUM-TOMBSTONING-MODE?" ), makeSymbol( "CONSTANT-READER-MACRO-CHAR" ), makeSymbol( "WNI-ACCESS-PATH-SUBPROTOCOL" ), makeSymbol( "NEW-MWP-PREFIX-MATCHER" ), makeSymbol( "LOCAL-QUEUE-PEEK" ),
      makeSymbol( "NEW-MUTED-NART-INDEX-ITERATOR" ), makeSymbol( "GET-TERM-LEXICON" ), makeSymbol( "CLEAR-KEYWORD-FOR-PRED" ), makeSymbol( "GET-SANITY-CHECKER" ), makeSymbol( "CONFIGURE-APP-COLORS" ), makeSymbol(
          "CLEAR-GET-OBJECT-BY-HL-ID-STRING" ), makeSymbol( "NOTE-NEW-PROBLEM-CREATED" ), makeSymbol( "CLEAR-PPH-VAR-TYPING-PREDICATES" ), makeSymbol( "UNINDEXED-HLMT-SYNTAX-CONSTANTS" ), makeSymbol(
              "ALL-FORWARD-GAFS" ), makeSymbol( "CB-DELETE-ALL-PROOF-CHECKER-RULES" ), makeSymbol( "L2R-SENTENCE-LEVEL-PEG-CREATION-RULES" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR-STATE" ),
      makeSymbol( "SHOW-KB-FEATURES" ), makeSymbol( "TERMPARAPHRASEFN-PHYSICALLOCATION" ), makeSymbol( "FUNCTION-RULE-TOP-LEVEL-KEY" ), makeSymbol( "PARTITION-INVALID-MISSING-TERMS-COUNT" ), makeSymbol(
          "WITHIN-NEGATION?" ), makeSymbol( "ADDITIONAL-KIF-DEFINITIONS" ), makeSymbol( "PPH-NEW-IDENTITY-MAP" ), makeSymbol( "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE" ), makeSymbol( "CLEAR-WEB-CONCEPTUALLY-RELATED" ),
      makeSymbol( "DECLARE-NL-TRIE-NOT-KNOWN-STALE" ), makeSymbol( "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER" ), makeSymbol( "*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*-INITIALIZER" ), makeSymbol(
          "ENSURE-INFERENCE-EVENT-DISPATCHER-RUNNING" ), makeSymbol( "PSP-SEMX-CLEAR-HANDLERS" ), makeSymbol( "ASSERTION-INDEXING-STORE" ), makeSymbol( "CONFLICT-HANDLER" ), makeSymbol(
              "OE-PATCH-MESSAGES-ENABLED-AND-EMAIL-VALID?" ), makeSymbol( "AGENDA-PROCESS" ), makeSymbol( "REMOVE-CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS" ), makeSymbol( "ALL-PROBLEM-STORES" ), makeSymbol(
                  "CB-C-BOOKKEEPING-HEADER" ), makeSymbol( "COMPUTE-REMOTE-IMAGE-OLD-DEDUCTIONS-CONGRUENT?" ), makeSymbol( "BROADER-TERM-PREDS" ), makeSymbol( "REFORMULATOR-FULLY-INITIALIZED?" ), makeSymbol(
                      "RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL" ), makeSymbol( "EMPTY-THOUGHT" ), makeSymbol( "SET-TO-RECEIVING-EVERYTHING" ), makeSymbol( "CLEAR-ALL-EXISTING-INDEXING" ), makeSymbol( "KEYHASH-EMPTY-KEY" ),
      makeSymbol( "MWP-RULE-SPEC-TABLE-INIT" ), makeSymbol( "REMOVE-L2R-DOCUMENT-INDEXICAL" ), makeSymbol( "INSERT-KB-NOT-CURRENT-MESSAGE" ), makeSymbol( "ENSURE-GUARDIAN-RUNNING" ), makeSymbol(
          "LEXICON-INITIALIZED-P" ), makeSymbol( "SBHL-LINK-HISTORICAL-COUNT" ), makeSymbol( "PERFORM-INDEXING-PRE-DUMP-CLEANUP" ), makeSymbol( "BREAK-ON-FAILURE?" ), makeSymbol( "CLEAR-PARTITION-LOADER-STATE" ),
      makeSymbol( "CB-USE-MTS-FILTER" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-INTEGERS-ITERATOR-STATE" ), makeSymbol( "WITHIN-NEGATION?" ), makeSymbol( "CLEAR-AGENDA-PROCESS" ), makeSymbol( "RL-TACTICIAN-NEURAL-NET" ),
      makeSymbol( "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE" ), makeSymbol( "INITIALIZE-PENNTAG-FORTS" ), makeSymbol( "ALL-OS-PROCESSES" ), makeSymbol( "CLEAR-CACHED-COMPACT-HL-EXTERNAL-ID-STRING" ),
      makeSymbol( "REFORMULATOR-RULE-PREDICATES" ), makeSymbol( "CONSOLE-TASK-PROCESSORS-INITIALIZED-P" ), makeSymbol( "POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE" ), makeSymbol( "NOT-GENL-INVERSE-MODE-P" ), makeSymbol(
          "NEW-WNI-PROBLEM-STORE" ), makeSymbol( "UNLEXIFIED-TERM-DISCOVERY-LOGGING-REQUESTED?" ), makeSymbol( "TVA-CACHE-SPEC-PREDS-TOTAL-TIME" ), makeSymbol( "CLEAR-RDFS-EXPANDED-NAME" ), makeSymbol(
              "FORCE-CHARNIAK-PARSER-AVAILABLE?" ), makeSymbol( "OWL-EXPORTER2-ID-MAP" ), makeSymbol( "EMPTY-THOUGHT" ), makeSymbol( "HALT-JAVA-API-LEASE-MONITOR" ), makeSymbol( "CONSTANT-NAMES-IN-CODE-BUT-NOT-KB" ),
      makeSymbol( "CLEAR-GET-CONCEPT-TAGS-FROM-STRING" ), makeSymbol( "ALL-TCP-SERVERS" ), makeSymbol( "IDENTIFY-KBS-DEDUCTIONS" ), makeSymbol( "CB-C-BOOKKEEPING-HEADER" ), makeSymbol(
          "UNSTASH-KB-OBJECT-CONTENT-VARS-12" ), makeSymbol( "SYSTEM-CODE-API-INITIALIZATIONS" ), makeSymbol( "RESET-OLD-QUOTED-DEFNS-REJECT?-METERS" ), makeSymbol( "ALL-CLONED-BLN-TERMS" ), makeSymbol(
              "CLEAR-GET-LANGUAGE-FOR-CODE" ), makeSymbol( "SBHL-JUSTIFICATION-ASSEMBLED" ), makeSymbol( "FORWARD-MODULES" ), makeSymbol( "DECLARE-GEN-TEMPLATE-STORE-STALENESS-UNACCEPTABLE" ), makeSymbol(
                  "CLEAR-XML-TOKENS-FROM-FILE" ), makeSymbol( "REBUILD-SBHL-MODULES" ), makeSymbol( "TRANSFORMATION-RULES-WITH-STATISTICS-COUNT" ), makeSymbol( "HL-TRANSCRIPT-QUEUE-SIZE" ), makeSymbol(
                      "SPECIFIC-PREFERENCE-MODULE-COUNT" ), makeSymbol( "CLEAR-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING" ), makeSymbol( "WFF-CHECK-VARS?" ), makeSymbol( "REFORMULATOR-RULE-SPEC-PREDS" ), makeSymbol(
                          "GET-FILE-BACKED-NART-ID-THRESHOLD" ), makeSymbol( "RESET-RKF-IRRELEVANT-FORT-CACHE" ), makeSymbol( "BYTE-ORDER-MARK" ), makeSymbol( "RUN-BASELINE-TESTS" ), makeSymbol(
                              "MAKE-HTML-CYC-LOGIN-SESSION" ), makeSymbol( "RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS" ), makeSymbol( "HOURLY-FACT-SHEET-STATS" ), makeSymbol( "GET-SBHL-SEARCH-PARENT-MARKING" ),
      makeSymbol( "OTHER-TOP-LEVEL-KEY" ), makeSymbol( "PPH-REGRESSION-TRACKING-PRINT-SKIPS" ), makeSymbol( "INITIALIZE-REFORMULATOR-RULES-TO-USE" ), makeSymbol( "CLEAR-TERM-LEARNER-LEXICAL-CACHES" ), makeSymbol(
          "PPH-UNKNOWN-CYCL" ), makeSymbol( "CLEAR-PSP-RULES" ), makeSymbol( "WITHIN-QUERY-TENSE-CZER-MODE?" ), makeSymbol( "NEW-NULL-ACCUMULATOR" ), makeSymbol( "INCREMENT-PROBLEM-HISTORICAL-COUNT" ), makeSymbol(
              "USER-ACTIONS-EMPTY?" ), makeSymbol( "CURRENT-GUARDIAN-PROCESS" ), makeSymbol( "CLEAR-DECOMPOSE-CONCEPT-FILTER-SPEC" ), makeSymbol( "DESTROY-DUPLICATE-KB-HL-SUPPORTS" ), makeSymbol(
                  "KBQ-CFASL-COMMON-SYMBOLS" ), makeSymbol( "CLEAR-CACHED-CANDIDATE-GENL-PREDS" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-9" ), makeSymbol( "NART-INDEX-USAGE-COUNTS-ENABLED-P" ), makeSymbol(
                      "CB-RTV-FORT-GENERATION-FN" ), makeSymbol( "ARETE-DISABLE-GLOBAL-LOGGING" ), makeSymbol( "CLEAR-MWP-BASE-POSES-FOR-REIFIED-AFFIX" ), makeSymbol(
                          "CLEAR-GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION" ), makeSymbol( "FACT-SHEET-MIN-PARAGRAPH-LENGTH" ), makeSymbol( "COUNT-NEW-CONSTANTS" ), makeSymbol( "BLAST-KE-STATE" ), makeSymbol(
                              "GET-ILP-EXPORT-INPUT-MODES-QUERY-PROPERTIES" ), makeSymbol( "CHECK-ASSERTIBLE-LITERAL?" ), makeSymbol( "COMPUTE-CORE-NARTS" ), makeSymbol( "CLEAR-AGENDA-PROCESS" ), makeSymbol(
                                  "CLEAR-SKSI-SPARQL-REMOVAL-MODULES" ), makeSymbol( "POSSIBLY-SAVE-RECENT-EXPERIENCE" ), makeSymbol( "CLEAR-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE" ), makeSymbol(
                                      "CLEAR-MAX-PREDS-MATCHING-POS-CACHED" ), makeSymbol( "REBUILD-COMPUTABLE-CONTENT-DUMPABLE-LOW" ), makeSymbol( "CACHED-TVA-VALUE-COUNT" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-6" ),
      makeSymbol( "MACHINE-INSTANCE" ), makeSymbol( "CB-CLEAR-ASSERTION-HISTORY" ), makeSymbol( "SKSI-IGNORE-ERRORS" ), makeSymbol( "CLEAR-INDIVIDUAL?-CACHED" ), makeSymbol( "FIX-FORTS-WITH-GENLS-BUT-NOT-COLLECTIONS" ),
      makeSymbol( "CB-EVENT-DISPATCHER-RUNNING?" ), makeSymbol( "SCOOP-TRACE-DISPLAY-TRACE-STACK" ), makeSymbol( "CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER" ), makeSymbol(
          "ENFORCE-EVALUATABLE-SATISFIABILITY?" ), makeSymbol( "CLEAR-GET-COOCCURRING-CONDITIONS" ), makeSymbol( "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED-2" ), makeSymbol( "SYSTEM-CODE-INFERENCE-INITIALIZATIONS" ),
      makeSymbol( "ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE" ), makeSymbol( "CLEAR-CACHED-CREATOR" ), makeSymbol( "FORMULA-TEMPLATE-NAMESPACE" ), makeSymbol( "CLEAR-RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED" ),
      makeSymbol( "ALL-PROBLEM-STORE-PROPERTIES" ), makeSymbol( "CLEAR-SET-QUERY-VARIABLE" ), makeSymbol( "CLEAR-WNI-SYNSETS-CAUSING-HELPER" ), makeSymbol( "NEW-FORMULA-TEMPLATE-EDITING-STATE" ), makeSymbol(
          "LOCAL-QUEUE-SIZE" ), makeSymbol( "RANDOM-BINARY-PREDICATE" ), makeSymbol( "ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS-INTERNAL" ), makeSymbol( "LOCAL-TRANSCRIPT-VERSION" ), makeSymbol( "GET-ALL-PARSING-FILTERS" ),
      makeSymbol( "CB-KB-QUERY-BEING-SAVED" ), makeSymbol( "CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS" ), makeSymbol( "GET-REMOTE-OPERATIONS-KB-CHECK-POINT" ), makeSymbol( "RESET-CACHE-SUF-DEFN-METERS" ), makeSymbol(
          "FINALIZE-SENTENCIFIER" ), makeSymbol( "TERMPARAPHRASEFN" ), makeSymbol( "REMOVE-L2R-DOCUMENT-SENTENCE-FINDER-KBQ" ), makeSymbol( "GEN-TEMPLATE-STORE-KNOWN-STALE-P" ), makeSymbol(
              "MISSING-KB-HL-SUPPORT-ID-SET" ), makeSymbol( "PPH-KAPPA-JUSTIFICATION-TEMPLATE" ), makeSymbol( "RESET-NAT-ISA-LINKS" ), makeSymbol( "PHRASECYCLFN" ), makeSymbol( "SBHL-TRUE-SEARCH-P" ), makeSymbol(
                  "INITIALIZE-REMOTE-HL-STORE-CONNECTIONS" ), makeSymbol( "OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS" ), makeSymbol( "CLEAR-PSP-RULES-CACHES" ), makeSymbol( "REMOVE-FORBIDDEN-KB-COVERING-COLLECTIONS-SET" ),
      makeSymbol( "CREATE-REMOTE-HL-STORE-CONNECTION" ), makeSymbol( "CYC-TEST-WRITE-IMAGE-DIRECTORY" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-7" ), makeSymbol( "GET-SBHL-GOAL-SPACE" ), makeSymbol(
          "UNSTASH-KB-OBJECT-CONTENT-VARS-15" ), makeSymbol( "GET-KB-UNREPRESENTED-TERM-OLD-SPACE-SIZE" ), makeSymbol( "UNSTASH-INFERENCE-VARS-15" ), makeSymbol( "RECOMPUTING-SKOLEM-DEFN-INFO-VAR" ), makeSymbol(
              "ESTIMATED-CONSTANTS-PER-NART" ), makeSymbol( "EXCEPTION-RULE-TOP-LEVEL-KEY" ), makeSymbol( "NL-GENERATION-FORT-CACHE-DATA-GENERATED?" ), makeSymbol( "DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME" ),
      makeSymbol( "CLEAR-PARTITION-SCOPE" ), makeSymbol( "PPH-NL-GENERATION-CACHE-JUSTIFICATION" ), makeSymbol( "NL-TRIE-STALENESS-ACCEPTABLE?" ), makeSymbol( "CLEAN-INVALID-BOOKKEEPING-INFO" ), makeSymbol(
          "MASTER-TRANSCRIPT-CATCH-UP" ), makeSymbol( "CLEAR-DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK" ), makeSymbol( "CURRENTLY-EXECUTING-TACTIC" ), makeSymbol( "PERFORM-ONE-AGENDA-ACTION" ), makeSymbol(
              "CLEAR-PRECISE-KEYWORD-FOR-PRED" ), makeSymbol( "SAVING-OPERATIONS?" ), makeSymbol( "EMPTY-THOUGHT" ), makeSymbol( "FORWARD-PROBLEM-STORE-PROPERTIES" ), makeSymbol( "CLEAR-PSP-VALID-CATEGORY?" ),
      makeSymbol( "INC-TOTAL-AUXILIARY-OPERATIONS-RUN" ), makeSymbol( "METER-ASSERTION-CONTENT-SWAP-TIME" ), makeSymbol( "RKF-TEXT-PROCESSOR-RESET-CACHES" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE" ),
      makeSymbol( "CLEAR-EVALUATABLE-RELATION-TESTS" ), makeSymbol( "CYC-CGI-RELATIVE-URL" ), makeSymbol( "CLEAR-TOP-MT-PERCENT-COUNT" ), makeSymbol( "PSP-ENVIRONMENTAL-STATE" ), makeSymbol(
          "CLEAR-MAL-ACTUAL-ARITY-CACHED?" ), makeSymbol( "KB-OBJECT-COUNT-LIST" ), makeSymbol( "CB-CURRENT-PARTITION-SAVE" ), makeSymbol( "INFERENCE-MONITOR-TREE-SCRIPT" ), makeSymbol( "TYPECLARIFYINGPHRASEFN" ),
      makeSymbol( "NART-HL-FORMULA-TABLE-INITIALIZED?" ), makeSymbol( "CLEAR-MONAD-MT-NAUT-CACHE" ), makeSymbol( "*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*-INITIALIZER" ), makeSymbol( "DHTML-LEXICAL-SCRIPTS" ),
      makeSymbol( "CYC-HITEK-FEATURE" ), makeSymbol( "CLEAR-RL-MODULE-STORE" ), makeSymbol( "COMPUTE-MISSING-OLD-NART-REMOTE-IDS" ), makeSymbol( "CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY" ), makeSymbol(
          "MAKE-STATIC-SEARCH-STRUC" ), makeSymbol( "GET-QL-INDEX-SUPPORT-VERBOSE" ), makeSymbol( "CATEGORIZE-KCT-INVALIDITY-REASONS" ), makeSymbol( "TEMPLATES-USE-ISA/GENLS?" ), makeSymbol(
              "GET-SBHL-UNDIRECTED-DIRECTION" ), makeSymbol( "CLEAR-COMPLEX-WORD-STRING-IS-SPEECH-PART?" ), makeSymbol( "CB-COMPUTE-PARTITION-LOAD-PUBLIC-DIRECTORY" ), makeSymbol( "COUNT-NEW-KB-OBJECTS" ), makeSymbol(
                  "CLEAR-COMMANDER-QUEUES" ), makeSymbol( "CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED" ), makeSymbol( "SKSI-VIOLATIONS" ), makeSymbol( "HTML-FLUSH" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS" ), makeSymbol(
                      "SBHL-CONTINUE-SEARCH-PATH" ), makeSymbol( "BLN2-ACCESS-PATH" ), makeSymbol( "CLEAR-PPH-POSSESSIVE-PREDS" ), makeSymbol( "MAKE-STATIC-SEARCH-NODE" ), makeSymbol(
                          "PPH-KAPPA-JUSTIFICATION-TEMPLATE-INTERNAL" ), makeSymbol( "GT-LINK-SUPPORT" ), makeSymbol( "TVA-RETURN-ONE-ANSWER?" ), makeSymbol( "CLEAR-REDUCE-MT-UNION-HLMT-INT" ), makeSymbol(
                              "CB-KE-REVIEW-RESULT-PAGE" ), makeSymbol( "MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT" ), makeSymbol( "JAVA-LINK-DEBUG-MODE?" ), makeSymbol( "ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?" ),
      makeSymbol( "CLEAR-FOL-NART-STRING" ), makeSymbol( "CLEAR-STRINGLIST-ARGS-OF-PRED-CACHED-INT" ), makeSymbol( "UPDATE-API-PROTOCOL" ), makeSymbol( "PPH-IDENTITY-TEMPLATE" ), makeSymbol(
          "NO-ARG-TYPES-AT-PARAMETER-STATE?" ), makeSymbol( "CB-MOST-RECENT-CONSTANT" ), makeSymbol( "FTS-ADDITIONAL-EXCLUDED-TERMS" ), makeSymbol( "CYC-BOOKKEEPING-INFO" ), makeSymbol( "GET-LISP-IMPLEMENTATION-TYPE" ),
      makeSymbol( "PSP-NP-GAP-SEMX" ), makeSymbol( "HL-MODIFY-LOCAL?" ), makeSymbol( "NEW-PRODUCT-ACCUMULATOR" ), makeSymbol( "CLEAR-EBMT-CYCLS-FOR-PHRASE" ), makeSymbol( "FORWARD-PROBLEM-HISTORICAL-COUNT" ), makeSymbol(
          "INITIALIZE-INCOMPATIBLE-MT-MODULE" ), makeSymbol( "CLEAR-PSP-RULES-CACHES" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS" ), makeSymbol( "NEW-CONSTANTS-ITERATOR" ), makeSymbol(
              "ENSURE-SWAPPABLE-TVA-CACHE-LOCK" ), makeSymbol( "UNSTASH-OTHER-VARS-15" ), makeSymbol( "SBHL-MODULES-INITIALIZED?" ), makeSymbol( "DONT-MAINTAIN-DEDUCTION-USAGE-COUNTS" ), makeSymbol( "BLN1-ACCESS-PATH" ),
      makeSymbol( "BUILDER-FORWARD-INFERENCE-METRICS-LOG" ), makeSymbol( "PERFORM-CYC-TESTING-INITIALIZATIONS" ), makeSymbol( "WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET" ), makeSymbol( "RANDOM-VARIABLE" ),
      makeSymbol( "TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES" ), makeSymbol( "INC-LOCAL-TRANSCRIPT-VERSION" ), makeSymbol( "DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE" ), makeSymbol(
          "INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?" ), makeSymbol( "CLEAR-BIOLOGY-PRACTICE-RULES" ), makeSymbol( "CLEAR-REMOVAL-MODULE-TESTS" ), makeSymbol( "CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?" ), makeSymbol(
              "WORKING-INFERENCE-TESTS" ), makeSymbol( "RBP-TRACE" ), makeSymbol( "ARGUMENT-TYPE-HIERARCHY" ), makeSymbol( "INITIALIZE-NEGATION-PREDS-MODULE" ), makeSymbol( "CB-SPECIFIC-HL-STORAGE-MODULE-PREDICATES" ),
      makeSymbol( "MOST-RECENT-FAILING-CYC-TEST-RUNS" ), makeSymbol( "RESET-LAST-MONITORED-INFERENCE" ), makeSymbol( "CB-SERVER-STATUS-MODE" ), makeSymbol( "RC-NEXT-ID" ), makeSymbol(
          "CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE" ), makeSymbol( "DISABLE-ASSERTIVE-WFF-FORWARD-RULES" ), makeSymbol( "CLEAR-EXPORTABLE-DEDUCTION-SUPPORTED-OBJECT?" ), makeSymbol( "RBP-TRACED-RULES" ), makeSymbol(
              "NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR" ), makeSymbol( "SPORTING-GOODS-ACCESS-PATH" ), makeSymbol( "SHOW-CRIPPLED-HAYSTACK-STATISTICS" ), makeSymbol( "NEW-FORMULA-TEMPLATE-EDITING-STATE" ),
      makeSymbol( "CLEAR-XSD-NAME" ), makeSymbol( "NEW-NULL-ACCUMULATOR" ), makeSymbol( "START-AGENT-RECEIVED-MESSAGE-HANDLER" ), makeSymbol( "NEW-CONSTANT-CHECKPOINT" ), makeSymbol(
          "CLEAR-INFERENCE-MONITOR-FOCAL-OBJECT-HTML" ), makeSymbol( "SKOLEMS-WITH-MISMATCHED-UNREIFIED-SK-TERMS" ), makeSymbol( "REGISTER-ALL-QUERY-LIBRARY-PARSERS" ), makeSymbol(
              "GATHER-SKSI-KNOWLEDGE-SOURCES-AND-DESCRIPTIONS" ), makeSymbol( "CB-NOTIFY-USERS-DRAW-HEADER" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-1" ), makeSymbol( "CURRENT-FORWARD-INFERENCE-RULE" ), makeSymbol(
                  "FI-GET-WARNING" ), makeSymbol( "NEW-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR" ), makeSymbol( "CLEAR-L2R-DOCUMENT-SENTENCE-FINDER-KBQ" ), makeSymbol( "INITIALIZE-CAE-QUERY-TRANSLATION" ), makeSymbol(
                      "STRUCTURAL-LINK-HISTORICAL-COUNT" ), makeSymbol( "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE" ), makeSymbol( "MULTI-WORD-PREDS" ), makeSymbol( "CLEAR-PRIN1-SYMBOL-TO-STRING" ),
      makeSymbol( "PPH-DISCOURSE-CONTEXT-INITIALIZED?" ), makeSymbol( "DEFINITENBARPPFN" ), makeSymbol( "EXPERIMENTAL-IMAGE" ), makeSymbol( "QC-NEXT-ID" ), makeSymbol( "FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES" ),
      makeSymbol( "CLEAR-CLAUSE-STRUC-TABLE" ), makeSymbol( "CLEAR-RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?" ), makeSymbol( "BESTNLPHRASEOFSTRINGFN" ), makeSymbol( "CLEAR-PREDICATE-GRAPH" ), makeSymbol(
          "CYC-THESAURUS-FEATURE" ), makeSymbol( "FI-GET-ERROR" ), makeSymbol( "CLEAR-SKSI-SUPPORTED-PREDICATE-CACHE" ), makeSymbol( "CLEAR-PPH-PHRASE-ID-DEMERITS" ), makeSymbol( "OWL-TAG-ATTRIBUTES" ), makeSymbol(
              "RESTART-ALL-TCP-SERVERS" ), makeSymbol( "RKF-ADDRESSEE" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-8" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-4" ), makeSymbol( "GET-KB-HL-SUPPORT" ), makeSymbol(
                  "NO-OP" ), makeSymbol( "CNC-POPCORN-MINIMUM" ), makeSymbol( "TRANSCRIPT-DIRECTORY" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE" ), makeSymbol(
                      "CTEST-ALL-KB-TEST-METRIC-CONSTANTS" ), makeSymbol( "TACTIC-HISTORICAL-COUNT" ), makeSymbol( "GET-GHL-LINK-PRED" ), makeSymbol( "INDEXICAL-QUERY-MT" ), makeSymbol(
                          "CLEAR-GET-DEFAULT-CAE-GUIDANCE-MT" ), makeSymbol( "GET-LUCENE-HOST" ), makeSymbol( "SCHEDULED-QUERY-QUEUE" ), makeSymbol( "ARGUMENT-TYPE-HIERARCHY" ), makeSymbol(
                              "CLEAR-DEFAULT-EL-VAR-FOR-HL-VAR-CACHED" ), makeSymbol( "CB-SERVER-STATUS-TRANSMIT-QUEUE" ), makeSymbol( "CLEAR-GENL-PREDICATE-GRAPH" ), makeSymbol(
                                  "COMPUTE-REMOTE-IMAGE-OLD-ASSERTIONS-CONGRUENT?" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE" ), makeSymbol( "GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES" ),
      makeSymbol( "GET-HL-STORE-CACHES-SHARED-SYMBOLS" ), makeSymbol( "PRE-NUM-NOT-WFF" ), makeSymbol( "NL-TRIE-STALE?" ), makeSymbol( "INITIALIZE-NAME-TITLES" ), makeSymbol(
          "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE" ), makeSymbol( "CLEAR-GET-FOLLOWUP-CATEGORIES-FOR-TYPE" ), makeSymbol( "OWL-OPENCYC-UNVERSIONED-BASE-URI" ), makeSymbol( "RANDOM-0-1" ), makeSymbol(
              "CLEAR-ALL-SBHL-TIME-DATA" ), makeSymbol( "CLEAR-PRECISE-KEYWORD-FOR-PRED" ), makeSymbol( "CURRENT-NART-INDEX-SWAP-TIME" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-15" ), makeSymbol(
                  "OLD-DEDUCTION-COUNT" ), makeSymbol( "CLEAR-MAKE-SBHL-GRAPH-LINK-GENL-MT" ), makeSymbol( "UNSTASH-OTHER-VARS-1" ), makeSymbol( "ENABLE-QL-IR-SEARCH" ), makeSymbol( "CACHE-PSP-FRAME-INFO" ), makeSymbol(
                      "NBARHEADEDBYNOUNFORMFN" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-6" ), makeSymbol( "INITIALIZE-CONSTANT-INDEX-HL-STORE-CACHE" ), makeSymbol( "HTML-UPDATE-CB-TOOLBAR-SCRIPT" ), makeSymbol(
                          "INFERENCE-MONITOR-HEAD-SCRIPT" ), makeSymbol( "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER" ), makeSymbol( "OE-PATCH-MESSAGES-ENABLED-AND-EMAIL-VALID?" ), makeSymbol(
                              "CLEAR-FIRST-ORDER-COLLECTION?" ), makeSymbol( "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS" ), makeSymbol( "FORWARD-INFERENCE-ALL-RULES-ALLOWED?" ), makeSymbol( "RESET-TP-VALID-QUANTITY-P" ),
      makeSymbol( "CLEAR-LILLIPUT-CACHES" ), makeSymbol( "RKF-ALL-CONCEPT-HARVESTER-METHODS" ), makeSymbol( "CLEAR-ALL-SBHL-TIME-DATA" ), makeSymbol( "REPEATFORSUBSEQUENTARGSFN" ), makeSymbol( "GET-SBHL-ISA?-GOAL" ),
      makeSymbol( "TVA-RETURN-ONE-ANSWER?" ), makeSymbol( "L2R-SENTENCE-INDEXICAL-INTERNAL" ), makeSymbol( "ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES?" ), makeSymbol( "ALL-CORE-UNION-CONSTANTS" ), makeSymbol(
          "SAVE-RECENT-EXPERIENCE-INTERNAL" ), makeSymbol( "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER&TASK" ), makeSymbol( "NOTE-AT-VIOLATION?" ), makeSymbol( "FINALIZE-LINKAGE" ), makeSymbol( "INITIALIZE-CB-RTV-COLLECTIONS" ),
      makeSymbol( "THINKING-TASK" ), makeSymbol( "FACT-SHEET-DEFAULT-LANGUAGE-MT-INTERNAL" ), makeSymbol( "QUERY-SUGGESTOR-RUN-TRIAL-TEST" ), makeSymbol( "PPH-PHRASE-DEFAULT-VERB-PRED" ), makeSymbol(
          "HTML-META-DONT-CACHE" ), makeSymbol( "GET-SBHL-COMBINE-FN" ), makeSymbol( "INITIALIZE-NUMBER-VALUES" ), makeSymbol( "PPH-GENERIC-SPEECH-PART-PREDS-WITH-TENSE-AND-ASPECT" ), makeSymbol(
              "CLEAR-PPH-APPLY-TEMPLATE" ), makeSymbol( "CB-SUBL-DOC-METHOD-INDEX-GUTS" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-5" ), makeSymbol( "L2R-SUPERTEXT-INDEXICAL" ), makeSymbol( "LTAI" ), makeSymbol(
                  "INDEXICAL-THE-CYC-PROCESS-OWNER" ), makeSymbol( "GLOBAL-FORWARD-INFERENCE-TO-DO?" ), makeSymbol( "COMPUTE-KBS-DEFINITIONAL-PREDICATES" ), makeSymbol( "SBHL-FALSE-SEARCH-P" ), makeSymbol(
                      "CZER-MEMOIZATION-STATE" ), makeSymbol( "BIOLOGY-PRACTICE-RULES-INTERNAL" ), makeSymbol( "ARETE-TERMS-TOUCHED-COUNT" ), makeSymbol( "MULTI-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO" ), makeSymbol(
                          "ENSURE-CYCLIST-OK" ), makeSymbol( "NEW-LEXIFICATION-ID" ), makeSymbol( "BUILDER-LOG-DIRECTORY" ), makeSymbol( "CLEAR-FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED" ),
      makeSymbol( "INITIALIZE-NEGATION-PREDS-MODULE" ), makeSymbol( "GET-SKSI-SMT-MODE" ), makeSymbol( "CYCLIFY-STRING-INITIALIZE-CYCLIFY-STATUS" ), makeSymbol( "FIND-ASSERTION-WITH-KB-HL-SUPPORT-DEDUCTION-DEPENDENT" ),
      makeSymbol( "DHTML-DOM-WRAPPER-POSTAMBLE" ), makeSymbol( "CLEAR-SKOS-EXPANDED-NAME" ), makeSymbol( "FACT-SHEET-PPH-DEMERIT-CUTOFF" ), makeSymbol( "CURRENT-TS-FILE" ), makeSymbol( "AUXILIARY-QUEUE-PEEK" ),
      makeSymbol( "WNI-MARK-EXISTING-MAPPED-TERMS" ), makeSymbol( "CLEAR-NL-TRIE-PREDS-OF-POS" ), makeSymbol( "ENSURE-CB-EVENT-DISPATCHER-RUNNING" ), makeSymbol( "RKF-SD-IGNORE-CLEAR" ), makeSymbol(
          "TERMPARAPHRASEFN-CITYWITHCOUNTRYABBREVIATION" ), makeSymbol( "RESET-HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS" ), makeSymbol( "MAKE-CONSTANT-EXTERNAL-ID" ), makeSymbol( "CLEAR-UNIT-OF-MONEY-P" ),
      makeSymbol( "ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY" ), makeSymbol( "INITIALIZE-CONSTANT-NAMES-IN-CODE" ), makeSymbol( "INITIALIZE-NAME-TITLES" ), makeSymbol( "ALL-KB-MODAL-OPERATORS" ), makeSymbol(
          "SCHEDULED-QUERY-TEST-QUERY" ), makeSymbol( "NART-HL-FORMULAS-UNBUILT?" ), makeSymbol( "NART-HL-FORMULA-USAGE-COUNTS-ENABLED-P" ), makeSymbol( "CLEAR-REFORMULATOR-CACHES" ), makeSymbol(
              "ENSURE-PPH-INITIALIZED" ), makeSymbol( "FUNCTIONS-FOR-FCP-SWEEP" ), makeSymbol( "CLEAR-GET-SYNTACTIC-DOCUMENT-STATS" ), makeSymbol( "CLEAR-GEN-TEMPLATE-QUERY-SENTENCE-INDEX" ), makeSymbol(
                  "MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-RUNNING?" ), makeSymbol( "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-CODE-SUPPORT" ), makeSymbol( "PPH-PP-CATEGORY" ), makeSymbol(
                      "SWAP-OUT-ALL-PRISTINE-DEDUCTIONS" ), makeSymbol( "ARETE-NARTS-TOUCHED-COUNT" ), makeSymbol( "CLEAR-SIMPLE-SKSI-TERMS" ), makeSymbol( "WNI-SYNSET-INDIVIDUALS" ), makeSymbol(
                          "CORE-KB-FINALIZATION" ), makeSymbol( "GRACEFUL-QUIT" ), makeSymbol( "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-MTS" ), makeSymbol( "ST-SIMILARITY-NAT-HISTORY-ITEMS" ), makeSymbol(
                              "EVALUATABLE-RELATIONS-WITH-EVALUATABLE-RELATION-TESTS" ), makeSymbol( "ENSURE-SPEECH-PARTS-INITIALIZED" ), makeSymbol( "CLEAR-FACT-SHEET-OPTIONAL-SECTION-END-COMMENT" ), makeSymbol(
                                  "CFASL-READ" ), makeSymbol( "CLEAR-DOCUMENT-ANNOTATION-TERM-FROM-ID" ), makeSymbol( "NUMERIC-QUERY-PROPERTIES" ), makeSymbol( "CLEAR-CODE-MAPPING-SKS-CACHE" ), makeSymbol(
                                      "DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME" ), makeSymbol( "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES" ), makeSymbol( "PSP-NP-EDGES" ), makeSymbol(
                                          "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE" ), makeSymbol( "INDEXICAL-THE-CYC-PROCESS-OWNER-INTERNAL" ), makeSymbol( "CLEAR-ALL-SBHL-NON-TIME-DATA" ), makeSymbol(
                                              "SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT" ), makeSymbol( "MAKE-LATITUDE-VIA-LOCATION-RULE-SUPPORT" ), makeSymbol( "CB-SAVE-AS-QUERY-SUBMIT-SECTION" ),
      makeSymbol( "BYTE-ORDER-MARK" ), makeSymbol( "CLEAR-TEMPLATE-MTS" ), makeSymbol( "REGISTER-DEFAULT-QL-PARSERS" ), makeSymbol( "CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL" ), makeSymbol(
          "CLEAR-GET-PRED-LIST-ORDER-FOR-TYPE" ), makeSymbol( "GET-SCHEUER-QS" ), makeSymbol( "INITIALIZE-RBP-NAME-CACHE" ), makeSymbol( "INITIALIZE-RBP-TERM-KEYWORD-MAP" ), makeSymbol(
              "CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS" ), makeSymbol( "MEDIUM-TOMBSTONING-MODE?" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS" ), makeSymbol(
                  "REMOVE-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol( "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT" ), makeSymbol( "GET-KBS-PREREMOVED-ASSERTIONS" ), makeSymbol(
                      "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL" ), makeSymbol( "INITIALIZE-RTP-KB-FEATURE" ), makeSymbol( "CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol(
                          "RBP-NEW-RULE-BANK" ), makeSymbol( "CLEAR-BIOLOGY-PRACTICE-RULES" ), makeSymbol( "CONSTRAINED-PARSING-CLEAR-ACTIONS" ), makeSymbol( "UNSTASH-OTHER-VARS-15" ), makeSymbol(
                              "CB-SYSTEM-HEALTH-POSSIBLE-CHECKUPS" ), makeSymbol( "ADDITIONAL-NAT-FUNCTION-SUPPORTS" ), makeSymbol( "L2R-DOCUMENT-INDEXICAL" ), makeSymbol( "INC-TOTAL-LOCAL-OPERATIONS-TRANSMITTED" ),
      makeSymbol( "SBHL-PRIMARY-WHAT-MTS-SPACES" ), makeSymbol( "CYCLIFY-TEST" ), makeSymbol( "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-SUCCESS" ), makeSymbol( "DERIVED-PREDS" ), makeSymbol( "CLEAR-PPH-NC-RULE-LIST" ),
      makeSymbol( "REMOVE-OWL-PREDICATE-TYPES-FOR-EXPORT" ), makeSymbol( "GET-TENSE-CZER-MODE" ), makeSymbol( "NEW-WHOLLY-UNSPECIFIED-MT-ERROR" ), makeSymbol( "GET-ALL-QUERY-LIBRARY-MTS" ), makeSymbol(
          "MULTI-LITERAL-PROBLEM-HISTORICAL-COUNT" ), makeSymbol( "HL-ACCESS-LOCAL?" ), makeSymbol( "FREE-ALL-KB-HL-SUPPORT" ), makeSymbol( "UPDATE-GOOGLE-API-METHOD-INVOCATION-COUNT" ), makeSymbol(
              "CLEAR-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER" ), makeSymbol( "CLEAR-GET-PUBLIC-FACT-SHEET-STRING-URL-MAPPINGS" ), makeSymbol( "LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY" ), makeSymbol(
                  "UNSTASH-KB-OBJECT-LOOKUP-VARS-13" ), makeSymbol( "GET-RED-EXTERNAL-ELEMENT" ), makeSymbol( "CLEAR-MATCH-RECURSIVE-TEMPLATE-ITEM" ), makeSymbol( "PPH-VAR-TYPING-PREDICATES" ), makeSymbol(
                      "MAKE-TVA-DEFAULT-STRATEGY" ), makeSymbol( "CB-SERVER-STATUS-SYSTEM" ), makeSymbol( "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-NO-SUCCESS" ), makeSymbol( "TURN-KR-SUGAR-ON" ), makeSymbol(
                          "CATEGORIZE-KCT-INVALIDITY-REASONS" ), makeSymbol( "SCHEDULED-QUERY-TEST-QUERY" ), makeSymbol( "CLEAR-LILLIPUT-ALL-INSTANCES" ), makeSymbol( "EVAL-IN-API-CLEAR-TRACE-LOG" ), makeSymbol(
                              "CLEAR-PLAUSIBILITY-CACHES" ), makeSymbol( "INCLUDE-FRACTIONS-IN-EXTENDED-NUMBERS?" ), makeSymbol( "FIND-OR-CREATE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE" ), makeSymbol(
                                  "BOGUS-CONSTANTS-MENTIONED-IN-CODE" ), makeSymbol( "CLEAR-CACHED-CANDIDATE-GENL-PREDS-IN-MT" ), makeSymbol( "TERMPARAPHRASEFN-PHYSICALLOCATION" ), makeSymbol( "CB-HELP-KEYWORDS" ),
      makeSymbol( "RECALCULATE-SKSI-ISA-MODULE-REWRITE-INFO" ), makeSymbol( "CLEAR-ALL-EXISTING-INDEXING" ), makeSymbol( "CLEAR-CACHED-SELF-EXPANDING-RULE-ASSERTION?" ), makeSymbol( "CYC-ANNOTATION-BASE-URI" ),
      makeSymbol( "GET-ILP-EXPORT-OUTPUT-MODES-QUERY-PROPERTIES" ), makeSymbol( "PPH-SPEAKER-KNOWN-P" ), makeSymbol( "CLEAR-MAKE-OPTIONAL-WORD-LIST" ), makeSymbol(
          "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER" ), makeSymbol( "TYPECLARIFYINGPHRASEFN" ), makeSymbol( "CLEAR-ALL-SPECS-SET" ), makeSymbol( "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS" ),
      makeSymbol( "CB-PARAPHRASE-MT" ), makeSymbol( "UNSTASH-OTHER-VARS-15" ), makeSymbol( "CLEAR-APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY" ), makeSymbol( "WORD-STRINGS-FN" ), makeSymbol(
          "MT-DIMENSION-TYPES" ), makeSymbol( "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL" ), makeSymbol( "UNSTASH-INFERENCE-VARS-9" ), makeSymbol( "POLITENESS-OF-WS-PRED" ), makeSymbol( "CB-PROOF-VIEW-DESTROYER" ),
      makeSymbol( "RKF-UTTRDR-DEREGISTER-ALL-PARSERS" ), makeSymbol( "DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME" ), makeSymbol( "SKSI-BREAK-ON-ERRORS" ), makeSymbol( "PPH-DEFAULT-VAR-TYPE" ), makeSymbol(
          "PROPERTY-TYPES-PROBLEM-STORE-SIZE-OK?" ), makeSymbol( "CONTENT-LINK-HISTORICAL-COUNT" ), makeSymbol( "CLEAR-EXPORTABLE-DEDUCTION-SUPPORT?" ), makeSymbol( "REFORMULATOR-RULES-TO-USE" ), makeSymbol(
              "UNASSOCIATED-REFORMULATOR-RULES" ), makeSymbol( "CONSTRUCT-EMPTY-KEY-ENTRY" ), makeSymbol( "SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?" ), makeSymbol(
                  "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION" ), makeSymbol( "CLEAR-MACHINE-IS-MYSELF-VIA-CYC-API" ), makeSymbol( "SBHL-FINISHED-WITH-GOAL" ), makeSymbol(
                      "SKSI-LANGUAGE-SPOKEN-LANGUAGES" ), makeSymbol( "ALL-INFERENCE-EVENT-CLASSES" ), makeSymbol( "RANDOM-PATH-CHAR" ), makeSymbol( "UNIVERSAL-REMOVAL-MODULE-COUNT" ), makeSymbol(
                          "ALL-JSON-HANDLER-SYMBOLS" ), makeSymbol( "CONSTANT-INDEX-DONT-MAINTAIN-USAGES-COUNTS" ), makeSymbol( "KB-LOADED" ), makeSymbol( "IGNORING-SDC?" ), makeSymbol( "CITIES-TO-COUNTRIES" ),
      makeSymbol( "MAYBE-INITIALIZE-PPH-GENERATION-PREDS" ), makeSymbol( "TERMPARAPHRASEFN-CITYWITHSTATEORPROVINCENAME" ), makeSymbol( "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL" ), makeSymbol(
          "CLEAR-PS-PARSE-PREDICATIVE-ADJP-INT-CACHED" ), makeSymbol( "TERMPARAPHRASEFN-NP-QUATYPE" ), makeSymbol( "TAXONOMY-TERM-RELATIONS-DICT" ), makeSymbol( "CLEAR-FIND-STEM-MEMOIZED" ), makeSymbol(
              "CHECK-GEN-TEMPLATE-STORE-INITIALIZATION" ), makeSymbol( "ACCUMULATED-XML-TOKENS" ), makeSymbol( "HTML-SET-ALL-RADIO-BUTTONS-SCRIPT" ), makeSymbol( "JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P" ),
      makeSymbol( "ASSERTION-CONS-SHARING-DICTIONARY" ), makeSymbol( "NAVIGATOR-CATEGORIES-FOR-DISPLAY" ), makeSymbol( "UNSTASH-OTHER-VARS-15" ), makeSymbol( "AES-DO-ORTHOGRAPHIC-CHANGE-FNS" ), makeSymbol(
          "CLEAR-MT-RELEVANCE-CACHE" ), makeSymbol( "WNI-ACCESS-PATH-DB" ), makeSymbol( "PRINT-WFF-REFORMULATOR-RULES" ), makeSymbol( "DISABLE-SKSI-SMT-MODE" ), makeSymbol(
              "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE" ), makeSymbol( "INTERRUPT-GENERIC-SEARCH" ), makeSymbol( "METER-CONSTANT-INDEX-SWAP-TIME" ), makeSymbol( "TEST-PARSE-A-SENTENCE-COMPLETELY" ), makeSymbol(
                  "PSP-GET-ANSWERS" ), makeSymbol( "CT-CR-INITIALIZE-IRRELEVANT-TERM-TABLE" ), makeSymbol( "REMOVAL-COMPLETENESS-MINIMIZATION-ALLOWED?" ), makeSymbol( "SBHL-JUSTIFICATION-SEARCH-P" ), makeSymbol(
                      "UNSTASH-INFERENCE-VARS-5" ), makeSymbol( "NEW-NEW-UNREPRESENTED-TERMS-ITERATOR" ), makeSymbol( "USE-DEFAULT-LINKAGE-CREATION-RULES?" ), makeSymbol( "REMOVE-TOO-BIG-PLACES" ), makeSymbol(
                          "CB-PARTITION-LOAD-GUTS" ), makeSymbol( "ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES?" ), makeSymbol( "CURRENT-XREF-SYSTEM" ), makeSymbol( "ALL-PREDS-ARE-RELEVANT?" ), makeSymbol(
                              "MAKE-TVA-SIMPLE-STRATEGY" ), makeSymbol( "UIMMA-NEW-ID" ), makeSymbol( "RESET-UNCACHE-SUF-FUNCTION-METERS" ), makeSymbol( "INITIALIZE-JAVA-API-LEASE-MONITOR" ), makeSymbol(
                                  "REBUILD-RULE-SET" ), makeSymbol( "SBHL-VERIFY-NAUT-MT-RELEVANCE-P" ), makeSymbol( "POLITENESS-OF-WS-PRED" ), makeSymbol( "CURRENTLY-EXECUTING-HL-MODULE" ), makeSymbol(
                                      "HL-STORE-CACHES-DIRECTORY" ), makeSymbol( "CATCH-UP-TO-CURRENT" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-8" ), makeSymbol( "RELATION-INSTANCE-EXISTS-SKSI-COST" ), makeSymbol(
                                          "ENGLISH-GENERATION-FORT-CACHE-MOST-RECENT-AVAILABLE?" ), makeSymbol( "CACHED-DEDUCTION-COUNT" ), makeSymbol( "CB-DESTROY-ALL-INFERENCES-BUT-LAST-N" ), makeSymbol(
                                              "PPH-LEXIFICATION-PREDS" ), makeSymbol( "CLEAR-HL-MODULE-EXPAND-COUNTS" ), makeSymbol( "CURRENT-ASSERTION-CONTENT-SWAP-TIME" ), makeSymbol(
                                                  "CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?" ), makeSymbol( "CB-SHOW-RECENT-ASSERTIONS" ), makeSymbol( "OWL-TERM-NAMES" ), makeSymbol(
                                                      "POSSIBLY-CONVERT-CONSTANT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS" ), makeSymbol( "CLEAR-SKSI-QUERY-COSTS" ), makeSymbol(
                                                          "FORWARD-INFERENCE-RULE-SELECT-VIA-ALLOWED-RULES?" ), makeSymbol( "HTML-SELECT-MULTIPLE" ), makeSymbol( "INFERENCE-RELEVANT-MT" ), makeSymbol( "RED-GET-OBJECT" ),
      makeSymbol( "PPH-ABORT" ), makeSymbol( "PPH-PHRASE-ID-INDEX-NEW-OBJECTS-COUNT" ), makeSymbol( "GET-PUBLIC-FACT-SHEET-PROPERTIES" ), makeSymbol( "MAKE-MULTIBINDING" ), makeSymbol( "ID-INDEX-TOMBSTONE" ), makeSymbol(
          "AGENDA-RUNNING" ), makeSymbol( "EXPANSION-JUSTIFICATION" ), makeSymbol( "CLEAR-PRIN1-SYMBOL-TO-STRING" ), makeSymbol( "WORKING-INFERENCE-TESTS" ), makeSymbol(
              "CLEAR-REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK" ), makeSymbol( "KBQ-CFASL-COMMON-SYMBOLS" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-FORTS-ITERATOR-STATE" ), makeSymbol(
                  "CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE" ), makeSymbol( "GET-TEMP-DIRECTORY" ), makeSymbol( "NOTE-FACT-SHEET-QUERY-TIMEOUT-IN-HOURLY-STATS" ), makeSymbol(
                      "CLEAR-EXPORTABLE-DEDUCTION-SUPPORTED-OBJECT?" ), makeSymbol( "CLEAR-GKE-ISAS-FILTERED-TERM" ), makeSymbol( "CLEAR-SPECIFIED-NODES-IN-FILTER" ), makeSymbol( "RBP-WFF-RESET-METRICS" ), makeSymbol(
                          "NEW-MUTED-ASSERTION-CONTENT-ITERATOR" ), makeSymbol( "GENL-INVERSE-MODE-P" ), makeSymbol( "WFF-ONLY-NEEDS-SYNTACTIC-CHECKS?" ), makeSymbol( "KBS-RAW-CONSTANTS" ), makeSymbol( "GRACEFUL-QUIT" ),
      makeSymbol( "LOAD-ALL-CRIPPLED-HAYSTACKS-INT" ), makeSymbol( "CLEAR-NUM-LIST-CACHED" ), makeSymbol( "CLEAR-PPH-ARG-IN-RELN-PREDS" ), makeSymbol( "NEXT-RDF-BLANK-NODE-ID" ), makeSymbol(
          "CLEAR-GET-POS-ARG-OF-PRED-INT" ), makeSymbol( "START-CB-EVENT-DISPATCHER" ), makeSymbol( "WFF-VIOLATIONS" ), makeSymbol( "ALL-KB-FUNCTIONS" ), makeSymbol( "REMOVE-COLLECTION-CREATION-TEMPLATE" ), makeSymbol(
              "COMPUTE-HL-STORE-CACHES-DIRECTORY" ), makeSymbol( "DISABLE-QL-IR-SEARCH" ), makeSymbol( "NEW-HL-STORAGE-MODULE-INFO" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR-STATE" ), makeSymbol(
                  "WITHIN-NEGATED-DISJUNCTION?" ), makeSymbol( "CLEAR-REMOTE-OPERATIONS-KB-CHECK-POINT" ), makeSymbol( "RTP-VBAR-TEMPLATES" ), makeSymbol( "TMS-ANY-ASSERTION-BEING-REMOVED?" ), makeSymbol(
                      "FACT-SHEET-QUERY-SOFT-TIMEOUT-TIME-REACHED?" ), makeSymbol( "HANDLE-LAST-HTML-MESSAGE" ), makeSymbol( "DHTML-CREATION-SCRIPTS" ), makeSymbol( "CLEAR-PSP-FRAME-HAS-TYPE?" ), makeSymbol(
                          "XREF-GLOBAL-SCOPE" ), makeSymbol( "ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE" ), makeSymbol( "TEST-THAT-ALL-ASSERTIONS-ARE-FINDABLE" ), makeSymbol( "UNSTASH-OTHER-VARS-9" ), makeSymbol(
                              "INITIALIZE-KCT" ), makeSymbol( "CB-INFERENCE-HELP-DIRECTORY" ), makeSymbol( "ROBUST-NART-LOOKUP?" ), makeSymbol( "CLEAR-KB-PATHS" ), makeSymbol( "VALID-METHOD-LISTENER-TYPES" ), makeSymbol(
                                  "FORGET-USELESS-NARTS-WRT-OPENCYC" ), makeSymbol( "WNI-UNASSERTING-REDUNDANT-GENLS" ), makeSymbol( "UNREPRESENTED-TERM-INDEX-MAINTAIN-USAGE-COUNTS" ), makeSymbol( "KBS-CLEANUP" ),
      makeSymbol( "INITIALIZE-NEGATION-MT-MODULE" ), makeSymbol( "BOGUSLY-LEXIFIED-TERMS" ), makeSymbol( "RESET-TERM-CLASSIFICATION-TREE" ), makeSymbol( "INITIALIZE-LINKAGE" ), makeSymbol(
          "TEST-THAT-ALL-ASSERTIONS-ARE-FINDABLE" ), makeSymbol( "INITIALIZE-GAF-AFTER-ADDINGS-HASH" ), makeSymbol( "CLEAR-PREDS-OF-POS-CACHED" ), makeSymbol( "CLEAR-LILLIPUT-ALL-INSTANCES" ), makeSymbol(
              "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS" ), makeSymbol( "COMPUTE-KBS-RAW-CONSTANTS" ), makeSymbol( "TERMPARAPHRASEFN-NP-QUATYPE" ), makeSymbol( "CLEAR-FACT-SHEET-IMAGE-URL-ROOT" ),
      makeSymbol( "SBHL-JUSTIFICATION-SEARCH-P" ), makeSymbol( "RECEIVING?" ), makeSymbol( "THESAURUS-KB-LOADED-P" ), makeSymbol( "CREATE-NART-DUMP-ID-TABLE" ), makeSymbol( "PPH-BROADEN-LANGUAGE-MT" ), makeSymbol(
          "GRAPHL-SEARCH-SIZE" ), makeSymbol( "SIMPLIFY-REDUNDANCIES?" ), makeSymbol( "CLEAR-RKF-NUMBER-STRING?" ), makeSymbol( "NO-ARG-FORMAT-AT-PARAMETER-STATE?" ), makeSymbol( "CB-OPTIONS-HISTORY-AND-BROWSER-TOOL" ),
      makeSymbol( "START-BLUE-EVENT-DISPATCHER" ), makeSymbol( "CB-KB-QUERY-WARN-OF-EXTRA-SENTENCE" ), makeSymbol( "RKF-TEXT-PROCESSOR-RESET-CACHES" ), makeSymbol( "MACHINE-BOGOMIPS" ), makeSymbol(
          "INVALID-EVALUATION" ), makeSymbol( "ALL-CORE-FORTS" ), makeSymbol( "L2R-IMAGE-ELAPSED-CPU-TIME" ), makeSymbol( "REMOVE-TVA-CACHE-MAX-INSTANCES-TO-CACHE" ), makeSymbol( "CYC-REVISION-STRING" ), makeSymbol(
              "DEREGISTER-EBMT" ), makeSymbol( "CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES" ), makeSymbol( "SKOLEM-TABLE-CONTAINS-OLD-FORMAT-SKOLEMS?" ), makeSymbol( "RULE-SUGGESTION-PREDICATE" ), makeSymbol(
                  "EXPERIMENTAL-IMAGE" ), makeSymbol( "GKE-MEMOIZATION-STATE" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-4" ), makeSymbol( "LOAD-TRANSCRIPT-EXPRS" ), makeSymbol( "RESTART-API-TASK-PROCESSORS" ),
      makeSymbol( "INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE" ), makeSymbol( "CLEAR-CAE-DEFAULT-PARSING-MT" ), makeSymbol( "GATHERING-EXPANSION-JUSTIFICATIONS?" ), makeSymbol( "ENABLE-QL-IR-SEARCH" ), makeSymbol(
          "CLEAR-FOAF-EXPANDED-NAME" ), makeSymbol( "GET-ALL-FORMULA-TEMPLATE-TOPICS" ), makeSymbol( "INITIALIZE-NEWEST-CONSTANT-TABLE" ), makeSymbol( "IS-SKSI-SMT-MODE-ENABLED?" ), makeSymbol(
              "GET-SBHL-MARKING-GENERATION" ), makeSymbol( "FIND-OR-CREATE-PPH-ISA-CONTEXT" ), makeSymbol( "CB-COMPUTE-PARTITION-LOAD-PERSONAL-DIRECTORY" ), makeSymbol( "CONTRACTION-HTS-VALID?" ), makeSymbol(
                  "CLEAR-NL-TRIE-CACHES" ), makeSymbol( "RESET-UNCACHE-SUF-FUNCTION-METERS" ), makeSymbol( "CLEAR-DENOTATUM-ARG-OF-PRED-CACHED" ), makeSymbol( "CLEAR-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT" ), makeSymbol(
                      "CURRENT-SKS-REGISTRATION-STATE" ), makeSymbol( "CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL" ), makeSymbol( "UNINDEXED-SYNTAX-CONSTANT-INDEX-CLEANUP" ), makeSymbol( "FORTS-BEING-REMOVED" ),
      makeSymbol( "RTP-KB-LOADED-P" ), makeSymbol( "BESTLISTPARAPHRASEWITHSEPARATORANDCOEFFICIENTSFN-CONSTRAINED" ), makeSymbol( "INITIALIZE-CARDINALITIES" ), makeSymbol( "FORGET-INVALID-DEDUCTIONS" ), makeSymbol(
          "INCREMENT-UNIFICATION-ATTEMPT-HISTORICAL-COUNT" ), makeSymbol( "HAS-NEXT-ARC-LEXICON-ENTRY" ), makeSymbol( "LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE" ), makeSymbol( "NEW-DEFN-STACK" ), makeSymbol(
              "CLEAR-SKSI-SMT-COMPILE-PARAM-DEFINITIONS" ), makeSymbol( "ENSURE-LINK-SERVER-RUNNING" ), makeSymbol( "XML-ITEM-SEPARATOR" ), makeSymbol( "CORE-KB-LOADED?" ), makeSymbol( "LEXICON-INITIALIZED-P" ),
      makeSymbol( "SDBC-DB2-PORT" ), makeSymbol( "CB-SERVER-STATUS-AUX-QUEUE" ), makeSymbol( "INITIALIZE-TERM-STRINGS-PREDS" ), makeSymbol( "GET-NEW-CYCL-QUERY-PARAMETER-SET" ), makeSymbol( "CLEAR-DB-OUTPUT-SPECS" ),
      makeSymbol( "LISTED-MTS-ARE-RELEVANT?" ), makeSymbol( "SAVE-LOCAL-EXPERIENCE" ), makeSymbol( "CREATE-SAMPLE-INVALID-KB-HL-SUPPORT" ), makeSymbol( "STOP-GENERIC-EVENT-DISPATCHER-PROCESS" ), makeSymbol(
          "GT-LINK-PRED" ), makeSymbol( "CLEAR-L2R-DOCUMENT-SENTENCE-FINDER-KBQ" ), makeSymbol( "RUN-AUXILIARY-OP?" ), makeSymbol( "ASSERTION-MANAGER-MAINTAIN-USAGE-COUNTS" ), makeSymbol(
              "TVA-ITERATES-SKSI-PREDICATE-EXTENT?" ), makeSymbol( "GET-WS-INDEX-PORT" ), makeSymbol( "TENSEDPHRASEFN" ), makeSymbol( "COMPUTE-BOGUS-CONSTANT-NAMES-IN-CODE" ), makeSymbol( "CLEAR-SIMPLE-SKSI-TERMS" ),
      makeSymbol( "NEW-INDEXED-ITEMS" ), makeSymbol( "FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK" ), makeSymbol( "CLEAR-KEY-GAF-ARG-INDEX-CACHED" ), makeSymbol( "IS-SQS-AVAILABLE?" ), makeSymbol(
          "CLEAR-GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT" ), makeSymbol( "CONSTANTS-MENTIONED-IN-CODE" ), makeSymbol( "HTML-FLUSH" ), makeSymbol( "DEFAULT-PREFERENCE-FILE" ), makeSymbol(
              "CLEAR-MAX-PREDS-LICENSED-BY-POS" ), makeSymbol( "CLEAR-NL-REFORMULATE-INT-CACHED" ), makeSymbol( "CLEAR-TERM-LEARNER-TERM-HEADER-STRING" ), makeSymbol( "DETERMINE-SBHL-MARK-BETWEEN-CONSIDER-FN" ),
      makeSymbol( "CLEAR-GET-PUBLIC-FACT-SHEET-STRING-URL-MAPPINGS" ), makeSymbol( "CLEAR-DISAMBIGUATION-MODEL" ), makeSymbol( "GET-NUMERIC-DATE-PATTERNS" ), makeSymbol( "GET-UNREPRESENTED-TERM-NEW-SPACE-SUID-KEYS" ),
      makeSymbol( "XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION" ), makeSymbol( "CLEAR-BOOKKEEPING-BINARY-GAF-STORE" ), makeSymbol( "FACT-SHEET-LOG-STREAM" ), makeSymbol( "PPH-DISCOURSE-CONTEXT-COPY" ), makeSymbol(
          "GET-KBS-INHERITED-STORES" ), makeSymbol( "CLEAR-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT" ), makeSymbol( "REMOVE-BAD-TERM-OF-UNIT-ASSERTIONS" ), makeSymbol( "NL-TRIE-REVISIONS-STALE?" ), makeSymbol(
              "BRANCH-TAG" ), makeSymbol( "CLEAN-SBHL-MODULES" ), makeSymbol( "GOOD-PROBLEM-HISTORICAL-COUNT" ), makeSymbol( "CONSTRAINED-PARSING-GET-ACTIONS" ), makeSymbol( "DISPLAY-API-TASK-PROCESSORS" ), makeSymbol(
                  "PSP-NP-GAP-SEMX" ), makeSymbol( "CLEAR-GET-POS-ARG-OF-PRED-INT" ), makeSymbol( "AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?" ), makeSymbol( "SKSI-HL-STORAGE-MODULES-COUNT" ), makeSymbol(
                      "HALT-SCHEDULED-QUERY-PROCESSING" ), makeSymbol( "UNSTASH-OTHER-VARS-9" ), makeSymbol( "MUST-USE-STATIC-MEMORY-FOR-NL-TRIE" ), makeSymbol( "ST-SIMILARITY-ENTRANCE-INTERNAL" ), makeSymbol(
                          "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-CODE-SUPPORT" ), makeSymbol( "LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol( "SPECIFIC-REMOVAL-MODULE-COUNT" ), makeSymbol(
                              "FORWARD-INFERENCE-TRIGGERED-TMS-RULES" ), makeSymbol( "FIND-CONTROL-CHARS-IN-NAMES" ), makeSymbol( "INITIALIZE-SEMANTIC-ETL-INFRASTRUCTURE" ), makeSymbol(
                                  "COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?" ), makeSymbol( "ALL-KB-HL-SUPPORTS" ), makeSymbol( "ASSERTION-CONTENT-COMPLETELY-CACHED?" ), makeSymbol( "CLEAR-SUF-QUOTED-FUNCTIONS" ),
      makeSymbol( "UNSTASH-INFERENCE-VARS-7" ), makeSymbol( "CURRENT-XREF-MODULE" ), makeSymbol( "OWL-EXPORT-DEFAULT-NAMESPACE" ), makeSymbol( "CLEAR-TAXONOMY-SUPPRESSED-FACETS" ), makeSymbol(
          "CLEAR-PSP-SUB-CATEGORIES" ), makeSymbol( "CLEAR-RDFS-NAME" ), makeSymbol( "INITIALIZE-LEXICON-KB-FEATURE" ), makeSymbol( "CLEAR-AT-ARGN-INT-CACHED" ), makeSymbol( "EXECUTED-TACTIC-HISTORICAL-COUNT" ),
      makeSymbol( "ENSURE-FILE-BACKED-CACHE-DIRECTORY" ), makeSymbol( "GET-MASTER-LICENSE-KEY" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-3" ), makeSymbol( "CR-PATHS-STATUS" ), makeSymbol(
          "REMOVE-CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS" ), makeSymbol( "CB-OPTIONS-TABLE-OF-CONTENTS" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-13" ), makeSymbol( "DHTML-CREATION-SCRIPTS" ), makeSymbol(
              "CLEAR-DATE-GENLS" ), makeSymbol( "WIDE-DEDUCTION-HL-STORE-CACHE?" ), makeSymbol( "ENABLE-SKSI-SMT-MODE" ), makeSymbol( "CLEAR-SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM" ), makeSymbol(
                  "POSSIBLY-CONVERT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS" ), makeSymbol( "AT-CHECK-DEFINING-MTS-P" ), makeSymbol( "DETECT-CYC-PRODUCT" ), makeSymbol( "REFORMULATOR-IRRELEVANT-FORTS" ),
      makeSymbol( "DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES" ), makeSymbol( "GET-NL-REFORMULATOR-TIME" ), makeSymbol( "MACHINE-BOGOMIPS" ), makeSymbol( "FORWARD-INFERENCE-TRIGGERED-TMS-RULES" ), makeSymbol(
          "RED-STRUCT-CREATE" ), makeSymbol( "LOAD-TRANSCRIPT-EXPRS" ), makeSymbol( "WITHIN-NEGATED-DISJUNCTION?" ), makeSymbol( "CACHED-NART-INDEX-COUNT" ), makeSymbol( "KCT-ANY-THINKING-RUNNING?" ), makeSymbol(
              "CLEAR-TVA-CACHE-MAX-INSTANCES-TO-CACHE" ), makeSymbol( "PARTITION-CREATE-INVALID-CONSTANT" ), makeSymbol( "RESEARCHCYC-KILL-EXPENSIVE-TRUE-RULE-TEMPLATES" ), makeSymbol(
                  "INC-TOTAL-AUXILIARY-OPERATIONS-RUN" ), makeSymbol( "MULTI-WORD-PREDS" ), makeSymbol( "FIX-FORTS-WITH-GENLS-BUT-NOT-COLLECTIONS" ), makeSymbol( "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE" ), makeSymbol(
                      "CNC-POPCORN-WINDOW" ), makeSymbol( "PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS" ), makeSymbol( "BG-TASK-PROCESSORS-INITIALIZED-P" ), makeSymbol( "INITIALIZE-QUESTION" ), makeSymbol(
                          "NEW-LOCAL-HL-TRANSCRIPT" ), makeSymbol( "CLEAR-GEN-TEMPLATE-STORE" ), makeSymbol( "INITIALIZE-COLLECTION-LOCAL-INSTANCE-CARDINALITIES" ), makeSymbol(
                              "REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE" ), makeSymbol( "CLEAR-MEANING-SENTENCE-PREDS" ), makeSymbol( "CONSTANT-INDICES-COMPLETELY-CACHED?" ), makeSymbol(
                                  "HL-PROTOTYPE-COLLECTIONS" ), makeSymbol( "NEW-RANDOM-THOUGHT-GENERATOR" ), makeSymbol( "CURRENT-GOOGLE-API-METHOD-INVOCATION-COUNT" ), makeSymbol(
                                      "BUILD-FACT-SHEET-DEFAULT-LANGUAGE-MT" ), makeSymbol( "SKSI-PROFILING-ON?" ), makeSymbol( "NEW-CONCEPTUALLY-RELATED-ANSWER-TABLE" ), makeSymbol(
                                          "INCREMENT-UNIFICATION-SUCCESS-HISTORICAL-COUNT" ), makeSymbol( "REMOVE-INVALID-CONSTANTS-FROM-COMPLETIONS" ), makeSymbol( "CLEAR-PPH-DISCOURSE-CONTEXT" ), makeSymbol(
                                              "NL-REFORMULATE-DAEMON" ), makeSymbol( "CNC-POPCORN-WINDOW" ), makeSymbol( "NEW-PSP-ANSWER-ACCUMULATOR" ), makeSymbol( "SAVING-OPERATIONS?" ), makeSymbol(
                                                  "MAKE-RELATION-EXISTS-INSTANCE-SUPPORT" ), makeSymbol( "FORWARD-INFERENCE-ALL-RULES-ALLOWED?" ), makeSymbol( "LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE" ), makeSymbol(
                                                      "CLEAR-TIMING-INFO" ), makeSymbol( "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER" ), makeSymbol( "CLEAR-COLLECTION-VIA-WEB-SEARCH?" ), makeSymbol( "NEW-SBHL-CACHE" ),
      makeSymbol( "FORWARD-PROBLEM-STORE-HISTORICAL-COUNT" ), makeSymbol( "CLEAR-ALL-PPH-VAR-TYPING-PREDICATES" ), makeSymbol( "INITIALIZE-JAVA-BACKEND-FUNCTION-ARGLIST-TABLE" ), makeSymbol(
          "INITIALIZE-RKF-DEPRECATED-RULES" ), makeSymbol( "NEW-UNREPRESENTED-TERM-ID-THRESHOLD" ), makeSymbol( "CLEAR-MWP-BASE-POSES-FOR-REIFIED-AFFIX" ), makeSymbol( "HL-PROTOTYPE-COLLECTIONS" ), makeSymbol(
              "KILL-NAKED-PROTOTYPICALS" ), makeSymbol( "CLEAR-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE" ), makeSymbol( "CLEAR-SPEC-PRED-FORT-CACHE" ), makeSymbol( "CB-ALL-GENERIC-PREFERENCE-MODULES" ), makeSymbol(
                  "DEFAULT-LUCENE-CONFIRMED-TERMS-BOOST" ), makeSymbol( "PPH-TOP-LEVEL-CYCL" ), makeSymbol( "UNSTASH-INFERENCE-VARS-15" ), makeSymbol( "AT-MAPPING-FINISHED" ), makeSymbol(
                      "SKSI-REGISTERED-KNOWLEDGE-SOURCES" ), makeSymbol( "UNSTASH-INFERENCE-VARS-10" ), makeSymbol( "ENSURE-TASK-PROCESS-BEING-WORKED-ON-INITIALIZED" ), makeSymbol( "NON-WFF-COUNT" ), makeSymbol(
                          "OPTIMIZE-ASSERTION-TABLE" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-3" ), makeSymbol( "RESET-KBS-RAW-CONSTANT-TABLES" ), makeSymbol( "CLEAR-RDF-STANDARD-PREFIX-FOR-NAMESPACE" ), makeSymbol(
                              "PREVIOUS-OWL-EXPORT-VERSION-DATES" ), makeSymbol( "NOUN-COMPOUND-CONSTRAINT-STRING-SPECS" ), makeSymbol( "MAX-SKOLEM-ARITY" ), makeSymbol( "CLEAR-ALLOW-ARBITRARY-ASSERTION-DELETION" ),
      makeSymbol( "CACHED-TVA-VALUE-COUNT" ), makeSymbol( "HAS-NEW-UNREPRESENTED-TERMS?" ), makeSymbol( "EBMT-KEEPALIVE-FILENAME" ), makeSymbol( "CTEST-ALL-KB-TEST-METRIC-CONSTANTS" ), makeSymbol(
          "PPH-GENERIC-SPEECH-PART-PREDS-WITH-TENSE-AND-ASPECT-INTERNAL" ), makeSymbol( "SIMPLIFY-CONTRADICTIONS?" ), makeSymbol( "ALL-PROBLEM-STORE-PROPERTIES" ), makeSymbol(
              "INITIALIZE-COLLECTION-LOCAL-QUOTED-INSTANCE-CARDINALITIES" ), makeSymbol( "INITIALIZE-NAME-TITLES" ), makeSymbol( "CLEAR-PREDICATE-GRAPH" ), makeSymbol( "DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK" ),
      makeSymbol( "CLEAR-GET-SALIENT-EXEMPLARS" ), makeSymbol( "CLEAR-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE" ), makeSymbol( "QC-NEW-QUERY" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE" ),
      makeSymbol( "GET-NUMERIC-DATE-PATTERNS" ), makeSymbol( "CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT" ), makeSymbol( "CB-OPTIONS-GENERAL" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-15" ), makeSymbol(
          "CLEAR-WF-COL-TEMPLATE-COMBO?" ), makeSymbol( "STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION" ), makeSymbol( "CLEAR-MWP-BASE-PRED-OF-POS" ), makeSymbol( "SBHL-TEMPORAL-INCREMENT" ), makeSymbol(
              "SCOPE-KB-DIFF-DEDUCTIONS" ), makeSymbol( "GEN-TEMPLATE-STORE-NOTE-REVISIONS" ), makeSymbol( "REPORT-TIME-TESTING-INFO" ), makeSymbol( "FIX-RECONSIDER-TMS" ), makeSymbol(
                  "CLEAR-CONCEPT-FILTER-SPECIFICATION-P" ), makeSymbol( "MAYBE-INITIALIZE-FET-SOURCES" ), makeSymbol( "REMOVE-TOO-BIG-PLACES" ), makeSymbol( "INITIALIZE-KB-VARIABLES" ), makeSymbol(
                      "CREATE-SAMPLE-INVALID-NART" ), makeSymbol( "ALL-LILLIPUT-QUERY-METRICS" ), makeSymbol( "INITIALIZE-UNREPRESENTED-TERM-INDEX-HL-STORE-CACHE" ), makeSymbol(
                          "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE" ), makeSymbol( "VALID-TRUTHS" ), makeSymbol( "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE" ), makeSymbol(
                              "REMOVE-PPH-KAPPA-JUSTIFICATION-TEMPLATE" ), makeSymbol( "OPENCYC-KBS-POSSIBLY-PREPARE-BROADER-TERM-QUEUE" ), makeSymbol( "REMOVAL-LINK-HISTORICAL-COUNT" ), makeSymbol(
                                  "NEW-CONSTANTS-ITERATOR" ), makeSymbol( "CLEAR-WF-COL-TEMPLATE-COMBO?" ), makeSymbol( "CLEAR-HL-MODULE-EXPAND-COUNTS" ), makeSymbol( "OPENCYC-KBS-NEW-KBS-FORT-ITERATOR" ), makeSymbol(
                                      "ARETE-NARTS-TOUCHED-COUNT" ), makeSymbol( "RKF-TEXT-PROCESSOR-RESET-CACHES" ), makeSymbol( "GET-SBHL-SEARCH-DIRECTION" ), makeSymbol( "UNIT-OF-MEASURE-FST" ), makeSymbol(
                                          "INITIALIZE-RTP-KB-FEATURE" ), makeSymbol( "BIO-FILTER-COLL" ), makeSymbol( "CLEAR-LINK-EXECUTE-CACHED" ), makeSymbol( "PPH-MAXIMIZE-LINKS?" ), makeSymbol(
                                              "UNSET-PLANNER-KB-LOADED" ), makeSymbol( "FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK" ), makeSymbol( "UNSTASH-OTHER-VARS" ), makeSymbol(
                                                  "GENL-MTS-OF-LISTED-MTS-ARE-RELEVANT?" ), makeSymbol( "GET-ALL-QUERY-LIBRARIES" ), makeSymbol( "XREF-METHOD-SCOPE" ), makeSymbol( "CLEAR-TASK-ALLOWS-UNKNOWN-SENTENCE" ),
      makeSymbol( "CYC-DATE-FEATURE" ), makeSymbol( "GET-SBHL-SEARCH-MODULE-TYPE" ), makeSymbol( "NEW-CFASL-COUNT-STREAM" ), makeSymbol( "CB-ALL-INFERENCE-PARAMETERS" ), makeSymbol( "PAD-TABLE-INITIALIZED?" ),
      makeSymbol( "CLEAR-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED" ), makeSymbol( "ASSIGN-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK-AND-WAIT-FOR-RESULT" ), makeSymbol( "INFERENCE-EXPAND-SENSE" ), makeSymbol(
          "CLEAR-MEANING-SENTENCE-PRED-STORE" ), makeSymbol( "CLEAR-QUERY-LIBRARY-DEFAULT-QUERY-MT" ), makeSymbol( "PLOT-IMAGE-EXTENSION" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-8" ), makeSymbol(
              "LOAD-NAMESPACE-TRANSCRIPTS" ), makeSymbol( "INITIALIZE-SENTENCIFIER" ), makeSymbol( "HERALD-NEW-DISCOURSE-CONTEXT" ), makeSymbol( "PSP-RULE-FORT-WEIGHTS" ), makeSymbol(
                  "CLEAR-PREDICATE-REQUIRES-BACKCHAIN?" ), makeSymbol( "GRACEFUL-QUIT" ), makeSymbol( "PSP-CHART-MAX-SPAN" ), makeSymbol( "SET-SBHL-BOOLEAN-GOAL-CONDITIONS" ), makeSymbol( "SEND-STORED-OPERATIONS" ),
      makeSymbol( "OWL-EXPORT-DEFAULT-NAMESPACE" ), makeSymbol( "NL-TRIE-VALIDATE-ALL-ENTRIES" ), makeSymbol( "UNARY-QUANTITY-FST" ), makeSymbol( "SKSI-DATABASE-FUSION-DEBUG?" ), makeSymbol(
          "CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER" ), makeSymbol( "LINKS-TO-ALL-INFERENCES" ), makeSymbol( "CB-AGENDA-ERROR-MODE-DISPLAY" ), makeSymbol(
              "INITIALIZE-DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES" ), makeSymbol( "INITIALIZE-OWL-SPAN-ID-COUNTER" ), makeSymbol( "SPURIOUS-AGENDA-PROCESSES" ), makeSymbol(
                  "CLEAR-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY" ), makeSymbol( "AVERAGE-HISTORICAL-INFERENCE-RELEVANT-PROBLEM-COUNT" ), makeSymbol( "RANDOM-MT" ), makeSymbol(
                      "CLEAR-SKSI-SUPPORTED-BROWSING-CACHES" ), makeSymbol( "GATHER-RELEVANT-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE" ), makeSymbol(
                          "CLEAR-FULLY-CONNECTED-GRAPH-LINKS" ), makeSymbol( "STOP-ALL-FACT-SHEET-SCREENSAVERS" ), makeSymbol( "GATHER-FET-STATS" ), makeSymbol( "ASSERTING-TREES?" ), makeSymbol(
                              "INSERT-STORED-OPTIONS" ), makeSymbol( "DISCARDED-TACTIC-HISTORICAL-COUNT" ), makeSymbol( "PSP-AGENT" ), makeSymbol( "CB-OPTIONS-GENERAL" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-2" ),
      makeSymbol( "CLEAR-ALEXANDRIA-CACHES" ), makeSymbol( "RUN-ONE-REMOTE-OP" ), makeSymbol( "CLEAR-PSP-CYCL-FAILS-CONSTRAINT?" ), makeSymbol( "REMOVAL-LINK-HISTORICAL-COUNT" ), makeSymbol( "XML-SCHEMA-CLASS-URIS" ),
      makeSymbol( "CFASL-QUIT" ), makeSymbol( "RESET-WFF-STATE" ), makeSymbol( "MAX-SUPPORTED-FORMULA-ARITY" ), makeSymbol( "UNSET-PARAPHRASE-KB-LOADED" ), makeSymbol( "FSUT-PRIORITIZER-MIN-NICE-LEVEL" ), makeSymbol(
          "OWL-IMPORTER-V2-VERSION-NUMBER" ), makeSymbol( "SERVLET-CONTAINER-PORT" ), makeSymbol( "CLEAR-META-RELATION-SOMEWHERE?" ), makeSymbol( "CONSTANT-INDEX-ENABLE-MEMORY-MAPPING" ), makeSymbol(
              "IS-INSIDE-KB-STORE-TRANSACTION?" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-15" ), makeSymbol( "SKSI-LANGUAGE-SPOKEN-LANGUAGES-GUTS" ), makeSymbol( "GET-NULL-FILE-STREAM-PATH" ), makeSymbol(
                  "CB-AGENDA-LOCAL-QUEUE-DISPLAY" ), makeSymbol( "RKF-UTTRDR-MAYBE-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES" ), makeSymbol( "MEANING-SENTENCE-PRED-STORE-COUNT" ), makeSymbol(
                      "CLEAR-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED" ), makeSymbol( "DEQUEUE-SCHEDULED-QUERY" ), makeSymbol( "LEXIFICATION-REVIEWER" ), makeSymbol( "SWAP-OUT-ALL-PRISTINE-ASSERTIONS" ),
      makeSymbol( "CLEAR-CACHED-CANDIDATE-GENL-PREDS" ), makeSymbol( "CLEAR-FOAF-NAME" ), makeSymbol( "USE-DEVELOPMENT-DISAMBIGUATED-INDEXES" ), makeSymbol( "CLEAR-CACHED-LEXICAL-ARG-TYPES" ), makeSymbol(
          "CLEAR-PSP-CATEGORY-FROM-FRAME" ), makeSymbol( "CB-SERVER-STATUS-HELP" ), makeSymbol( "CLEAR-DATA-PARSER-ALL-GENLS" ), makeSymbol( "RANDOM-GAF" ), makeSymbol( "CURRENT-SKSI-BATCH-TEMPLATE" ), makeSymbol(
              "INITIALIZE-SKSI-BATCH-TEMPLATES" ), makeSymbol( "DEREGISTER-TEMPLATE-PARSER" ), makeSymbol( "INITIALIZE-INTENSIONALLY-INCOMPATIBLE-MT-MODULE" ), makeSymbol( "CLEAR-CACHED-ALL-INSTANCES-AMONG" ),
      makeSymbol( "POSTMODIFIER_EDFORMFN" ), makeSymbol( "ARETE-ASSERTIONS-TOUCHED-COUNT" ), makeSymbol( "CLEAR-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED" ), makeSymbol(
          "BESTLISTPARAPHRASEWITHSEPARATORANDCOEFFICIENTSFN-CONSTRAINED" ), makeSymbol( "CLEAR-CONSTANT-GUID-TABLE" ), makeSymbol( "HTML-UPDATE-CB-STATUS-SCRIPT" ), makeSymbol( "GATHER-LOAD-PARTITION-KB-HL-SUPPORTS" ),
      makeSymbol( "RKF-SD-CLEAR" ), makeSymbol( "INITIALIZE-NEGATION-INVERSE-MODULE" ), makeSymbol( "KBS-STATE-VALID?" ), makeSymbol( "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-VM" ), makeSymbol( "PROOF-VIEW-DEFAULT-COLOR" ),
      makeSymbol( "GET-NUMERIC-DATE-PATTERNS" ), makeSymbol( "CLEAR-ARG-COLLECTIONS" ), makeSymbol( "SET-WORDNET-KB-LOADED" ), makeSymbol( "COMPUTE-CACHED-QUOTED-ISAS-FROM-ALL-MTS-CACHE" ), makeSymbol(
          "GET-SBHL-SEARCH-MODULE-TYPE" ), makeSymbol( "CLEAR-CACHED-GET-RESULT-SET-FROM-SQL-SOURCE" ), makeSymbol( "CLEAR-BAR-LEVEL-CACHED" ), makeSymbol( "GATHER-INCREMENTAL-OPERATION-STATS" ), makeSymbol(
              "RESET-NEW-QUOTED-DEFNS-REJECT?-METERS" ), makeSymbol( "CLEAR-DEFAULT-VALUES-FOR-PRED" ), makeSymbol( "INITIALIZE-JAVA-API-LEASE-MONITOR" ), makeSymbol( "ARETE-NARTS-TOUCHED-COUNT" ), makeSymbol(
                  "SCHEDULED-QUERY-QUEUE" ), makeSymbol( "GET-SBHL-SEARCH-BEHAVIOR" ), makeSymbol( "CLEAR-COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT" ), makeSymbol( "NL-TAG-CYCL-PLACEHOLDER" ),
      makeSymbol( "IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?" ), makeSymbol( "MAYBE-INITIALIZE-NL-TRIE-SUBWORD-CACHE" ), makeSymbol( "REPORT-TIME-TESTING-INFO" ), makeSymbol( "CB-MTS-FILTER-USE-GENLMT" ),
      makeSymbol( "ROBUST-NART-LOOKUP?" ), makeSymbol( "WITHIN-AGENDA" ), makeSymbol( "UNSTASH-INFERENCE-VARS-7" ), makeSymbol( "CLEAR-CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?" ), makeSymbol( "FI-ASK-STATUS-INT" ),
      makeSymbol( "USGS-ACCESS-PATH" ), makeSymbol( "OWL-EXPORT-VERSION-INFO" ), makeSymbol( "NEW-DENSE-NART-ID-INDEX" ), makeSymbol( "CB-SUBL-DOC-HEADER" ), makeSymbol( "ESTIMATED-ASSERTIONS-PER-HL-SUPPORT" ),
      makeSymbol( "GET-INTERNAL-REAL-TIME-MS" ), makeSymbol( "BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN" ), makeSymbol( "ALL-SKOLEM-RULES" ), makeSymbol( "CB-MOST-RECENT-ASSERTION" ), makeSymbol(
          "FORGET-INVALID-BOOKKEEPING-ASSERTIONS" ), makeSymbol( "QL-IR-SEARCH-ALLOWED?" ), makeSymbol( "CB-MYCREATIONPURPOSE-FILTER" ), makeSymbol( "CLEAN-ASSERTION-ASSERT-INFO" ), makeSymbol(
              "CLEAR-FIND-STEM-MEMOIZED" ), makeSymbol( "START-GUARDIAN" ), makeSymbol( "PPH-CURRENT-ARG0-SPECIFIED-P" ), makeSymbol( "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-CODE-SUPPORT" ), makeSymbol(
                  "USE-TOPIC-DEFINING-MT-WHEN-PASSED-EVERYTHING-PSC?" ), makeSymbol( "FIND-ASSERTION-WITH-KB-HL-SUPPORT-DEDUCTION-DEPENDENT" ), makeSymbol( "CB-ASSERTION-HISTORY-ITEMS" ), makeSymbol(
                      "CLEAR-OWL-PREDICATE-TYPES-FOR-EXPORT" ), makeSymbol( "CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES" ), makeSymbol( "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING" ), makeSymbol(
                          "MAKE-KB-HL-SUPPORT-ID" ), makeSymbol( "SORT-SUF-QUOTED-DEFN-CACHE" ), makeSymbol( "CURRENT-PARITER-WIDTH" ), makeSymbol( "AT-SEARCHING-GENL-INVERSES?" ), makeSymbol(
                              "INITIALIZE-GAF-AFTER-ADDINGS-HASH" ), makeSymbol( "OWL-PROPERTY-ELEMENT-NAMES" ), makeSymbol( "GET-UNQUALIFIED-MACHINE-NAME" ), makeSymbol( "INIT-KE-STATE" ), makeSymbol(
                                  "RKF-AR-SELECT-PROCESSING-METHOD" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR-STATE" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE" ), makeSymbol(
                                      "SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-REGISTERED?" ), makeSymbol( "COPYRIGHT-NOTICE" ), makeSymbol( "NEW-ALEXANDRIA-ALL-FORTS-ITERATOR" ), makeSymbol( "CREATE-SAMPLE-INVALID-NART" ),
      makeSymbol( "GENERATE-ABBREVIATION-REGULAR-EXPRESSIONS" ), makeSymbol( "ID-INDEX-EMPTY-LIST" ), makeSymbol( "REMOVE-CACHED-LOAD-ALL-HAYSTACKS" ), makeSymbol( "INITIALIZE-NEWEST-CONSTANT-TABLE" ), makeSymbol(
          "CLEAR-FSUT-PRIORITIZER-SLEEP-INTERVAL-FROM-NICE-LEVEL" ), makeSymbol( "USE-NON-TRUE-ASSERTION-TV-CACHE?" ), makeSymbol( "CLEAR-GENL-PRED-NAUT-CACHE" ), makeSymbol( "SHOW-JAVA-API-SERVICE-LEASES" ), makeSymbol(
              "CYC-SYSTEM-DOC-FILE" ), makeSymbol( "PREPARE-KB-MINI-DUMP" ), makeSymbol( "CLEAR-DEFAULT-VALUES-FOR-PRED" ), makeSymbol( "CLEAR-SKSI-REGISTERED-KNOWLEDGE-SOURCES" ), makeSymbol( "THE-CYCLIST" ),
      makeSymbol( "GET-REMOTE-OPERATIONS-KB-CHECK-POINT" ), makeSymbol( "CLEAR-DEFAULT-VALUES-FOR-PRED" ), makeSymbol( "SET-TO-NOT-RECEIVING" ), makeSymbol( "NEW-HL-STORAGE-MODULE-INFO" ), makeSymbol(
          "INITIALIZE-PPH-SUBCOL-FNS" ), makeSymbol( "CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?" ), makeSymbol( "COMPILE-LEGACY-COMMUNICATION-MODE-INFORMATION" ), makeSymbol( "INITIALIZE-ALL-MODULES" ), makeSymbol(
              "CB-CURE-PORT" ), makeSymbol( "CREATE-CLASS" ), makeSymbol( "IDENTIFY-KBS-DEDUCTIONS" ), makeSymbol( "BIOLOGY-PRACTICE-RULES-INTERNAL" ), makeSymbol( "TITLES-CONVENTIONALLY-QUOTED" ), makeSymbol(
                  "MAKE-ISOMORPHIC-SENTENCES-RULE-SUPPORT" ), makeSymbol( "CLEAR-QUA-CACHES" ), makeSymbol( "PRINT-FAILING-TESTS" ), makeSymbol( "INITIALIZE-KB-VARIABLES" ), makeSymbol(
                      "CLEAR-DEFAULT-NL-PREDS-FOR-TYPE-LIST" ), makeSymbol( "CLEAR-ALL-RECENT-TRANSFORMATION-RULE-STATISTICS" ), makeSymbol( "LEXICON-KB-LOADED-P" ), makeSymbol( "LOCAL-ASKED-QUERIES-TRANSCRIPT" ),
      makeSymbol( "PSP-ALLOWED-GAP-CATEGORY" ), makeSymbol( "CLEAR-WU-ARG-OF-PRED-CACHED-INT" ), makeSymbol( "GET-RED-KEY-FOR-DEFAULT-JAVA-LIB" ), makeSymbol( "PPH-CURRENT-ADDRESSEE" ), makeSymbol(
          "SHOW-OWL-EXPORT-USAGES" ), makeSymbol( "ALL-PROBLEM-STORE-DYNAMIC-PROPERTIES" ), makeSymbol( "REFORMULATOR-KB-LOADED-P" ), makeSymbol( "INITIALIZE-EVAL-IN-API-ENV" ), makeSymbol( "CLEAR-CONSTANT-TABLES" ),
      makeSymbol( "RANDOM-GAF" ), makeSymbol( "HTFILE-MINIMAL-SPACE-REQUIRED" ), makeSymbol( "API-PORT" ), makeSymbol( "USING-SWAPPABLE-TVA-CACHES?" ), makeSymbol( "WITHIN-QUERY?" ), makeSymbol(
          "REMOVE-SCOPED-PARTITION" ), makeSymbol( "CLEAR-MT-RELEVANCE-CACHE" ), makeSymbol( "ARETE-NARTS-TOUCHED-COUNT" ), makeSymbol( "CLEAR-MT-GRAPH" ), makeSymbol( "GET-PARSE-TREE-UTILITIES-PARSER" ), makeSymbol(
              "CB-CURE-PORT" ), makeSymbol( "SALIENT-DESCRIPTOR-FET-FN" ), makeSymbol( "CYC-INITIALIZATION" ), makeSymbol( "CLEAR-QUA-GENERATE-PHRASE" ), makeSymbol( "CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY" ),
      makeSymbol( "PSP-SEMX-CLEAR-HANDLERS" ), makeSymbol( "CLEAR-CLOSED-LEXICAL-CLASS-STRINGS" ), makeSymbol( "L2R-LINKAGE-CREATION-RULES" ), makeSymbol( "CURRENT-OWL-IMPORTER" ), makeSymbol( "AGENDA-STATE" ),
      makeSymbol( "FORGET-OLD-CREATION-SECOND-DATE" ), makeSymbol( "SYSTEM-CODE-API-INITIALIZATIONS" ), makeSymbol( "ALL-FORTS" ), makeSymbol( "CLEAR-FULLY-CONNECTED-GRAPH-LINKS" ), makeSymbol(
          "CLEAR-KB-HL-SUPPORT-CONTENT-SWAP-TIME" ), makeSymbol( "CFASL-SET-MODE-INTERNALIZED" ), makeSymbol( "ASSERTIVE-WFF-RULES-CACHED-INTERNAL" ), makeSymbol( "EXECUTED-TACTIC-HISTORICAL-COUNT" ), makeSymbol(
              "INITIALIZE-KBS-DEFINITIONAL-RULE-TABLE" ), makeSymbol( "CLEAR-QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS" ), makeSymbol( "GATHER-ILP-EXPORT-TYPE-AND-INSTANCE-INFORMATION?" ), makeSymbol(
                  "SET-TO-NO-RECORD" ), makeSymbol( "INITIALIZE-AGENDA" ), makeSymbol( "ANY-TIME-IS-RELEVANT?" ), makeSymbol( "CLEAR-STRATEGY-TYPE-STORE" ), makeSymbol( "NPP-INIT-EXCLUDED-NAME-PREDS" ), makeSymbol(
                      "RESET-OLD-DEFNS-REJECT?-METERS" ), makeSymbol( "GET-AVAILABLE-SEARCH-ENGINES" ), makeSymbol( "RECALCULATE-SKSI-ISA-MODULE-REWRITE-INFO" ), makeSymbol( "NL-GENERATION-CACHE-MEMORY-MAPPED?" ),
      makeSymbol( "CLEAR-LILLIPUT-CACHES" ), makeSymbol( "SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT" ), makeSymbol( "CURRENT-FORWARD-INFERENCE-ENVIRONMENT" ), makeSymbol( "ENABLE-SKSI-SMT-MODE" ), makeSymbol(
          "JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P" ), makeSymbol( "CLEAR-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?" ), makeSymbol( "CLEAR-FACT-SHEET-SENTENCE-GROUP-SUMMARY" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-2" ),
      makeSymbol( "HALT-CONSOLE-TASK-PROCESSORS" ), makeSymbol( "CLEAR-POS-TO-SEMTRANS-PRED-CACHED" ), makeSymbol( "COMMANDER-DEBUG-LEVEL" ), makeSymbol( "BUILD-CYC-TO-SUPERTAG-MAP" ), makeSymbol(
          "RBP-TERM-KEYWORD-MAP" ), makeSymbol( "IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?" ), makeSymbol( "HTML-GOOGLE-PIE-CHART-SCRIPT" ), makeSymbol( "PSP-NP-EDGES" ), makeSymbol( "INDEXICAL-YESTERDAY" ),
      makeSymbol( "DECLARE-GEN-TEMPLATE-STORE-KNOWN-STALE" ), makeSymbol( "SKSI-SUSPEND-COST-RECORDING-FOR-CURRENT-ITERATOR" ), makeSymbol( "NEW-CONSTANT-CHECKPOINT" ), makeSymbol( "INITIALIZE-NEWEST-CONSTANT-TABLE" ),
      makeSymbol( "CZER-MEMOIZATION-STATE" ), makeSymbol( "FORWARD-INFERENCE-METRICS-INFERENCE-INDEX" ), makeSymbol( "ANY-SKSI-MEANING-SENTENCE-MT-RELEVANT?" ), makeSymbol( "CLEAR-QUERY-SEARCH-CACHES" ), makeSymbol(
          "CB-SERVER-SHOW-LOCAL-QUEUE?" ), makeSymbol( "GET-SBHL-SEARCH-ADD-UNMARKED-NODE-TEST" ), makeSymbol( "WITHIN-HL-EVAL?" ), makeSymbol( "CLEAR-FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT" ), makeSymbol(
              "PPH-INITIALIZED?" ), makeSymbol( "CB-KB-QUERY-SHOW-MT" ), makeSymbol( "CLEAR-DOCUMENT-ANNOTATION-TERM-FROM-ID" ), makeSymbol( "PPH-PARAMETER-DECLARATIONS" ), makeSymbol( "INITIALIZE-PARAPHRASE-CYCL" ),
      makeSymbol( "NOTE-SHOULD-PROPAGATE-REWRITE-OF-CNF" ), makeSymbol( "SKSI-SUSPEND-COST-RECORDING-FOR-CURRENT-ITERATOR" ), makeSymbol( "ALL-RFS" ), makeSymbol( "REMOVE-FACT-SHEET-DEFAULT-LANGUAGE-MT" ), makeSymbol(
          "INITIALIZE-SKSI-BATCH-TEMPLATES" ), makeSymbol( "INITIALIZE-NL-TRIE-SYNTACTIC-PREDICATES" ), makeSymbol( "NEW-UIMA" ), makeSymbol( "INITIALIZE-DERIVED-PREDS" ), makeSymbol( "REMOVE-SIMPLE-SKSI-TERMS" ),
      makeSymbol( "REGISTER-TEMPLATE-PARSER" ), makeSymbol( "INITIALIZE-NL-TRIE-SUBWORD-CACHES" ), makeSymbol( "CLEAR-CAE-FACT-EDITOR-FOCAL-TYPES" ), makeSymbol( "ALL-XML-HANDLER-SYMBOLS" ), makeSymbol(
          "PPH-PROVEN-SENTENCE-FROM-INFERENCE-ANSWER" ), makeSymbol( "ALL-PROBLEM-STORE-STATIC-PROPERTIES" ), makeSymbol( "GLOBAL-CACHE-VARIABLES" ), makeSymbol( "CYC-MAINT-FEATURE" ), makeSymbol(
              "DEDUCTION-CONTENT-COMPLETELY-CACHED?" ), makeSymbol( "GET-TERNARY-QUANT-FNS" ), makeSymbol( "CLEAR-TAXONOMY-SUPPRESSED-FACETS" ), makeSymbol( "CURRENT-PROCESS-IS-AGENDA" ), makeSymbol(
                  "UNSET-TIME-KB-LOADED" ), makeSymbol( "CLEAR-SIMPLE-BINARY-PROPERTY-PATTERNS" ), makeSymbol( "CLEAR-LEXICAL-MT-FOR-LANGUAGE" ), makeSymbol( "CLEAR-RUN-COLUMN-QUERY" ), makeSymbol(
                      "CLEAR-RKF-MIN-ARG-N-ISA" ), makeSymbol( "CLEAR-GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION" ), makeSymbol( "INFERENCE-UNIT-TEST-CLEANUP" ), makeSymbol( "REGISTER-ALL-QUERY-LIBRARY-PARSERS" ),
      makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-14" ), makeSymbol( "EBMT-CLEAR-CACHES" ), makeSymbol( "NEW-DENSE-NART-ID-INDEX" ), makeSymbol( "KILL-ALL-CB-PROOF-VIEW-THREADS" ), makeSymbol(
          "GET-SBHL-SEARCH-PARENT-MARKING" ), makeSymbol( "XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION" ), makeSymbol( "NEW-OWL-DEFINITION-ACCUMULATOR" ), makeSymbol( "REGISTER-DEFAULT-QL-PARSERS" ), makeSymbol(
              "CONSTRUCT-UNREPRESENTED-TERMS-FHT-BASED-ITERATOR" ), makeSymbol( "L2R-PICK-DOCUMENT-TO-READ" ), makeSymbol( "WIDE-UNREPRESENTED-TERM-COMPLEX-INDEX-HL-STORE-CACHE?" ), makeSymbol(
                  "START-KB-MODIFICATIONS-EVENT-DISPATCHER" ), makeSymbol( "SHOW-FUNCTION-CACHING-RESULTS" ), makeSymbol( "CLEAR-RTV-PANEL-ENABLED-FOR-TASK" ), makeSymbol( "SBHL-MAPPING-FINISHED" ), makeSymbol(
                      "CYC-PRODUCT" ), makeSymbol( "POST-PERCENT-NOT-WFF" ), makeSymbol( "MAKE-STATIC-SEARCH-NODE" ), makeSymbol( "MT-RELEVANCE-UNSPECIFIED?" ), makeSymbol( "PPH-REGEX-BEHAVES-AS-EXPECTED?" ), makeSymbol(
                          "CLEAR-SOURCE-INFORMATION-ENABLED-FOR-TASK" ), makeSymbol( "CZER-CREATE-NARTS?" ), makeSymbol( "DEFN-COLLECTION" ), makeSymbol( "CLEAR-CORE-STATE" ), makeSymbol( "BRANCH-TAG" ), makeSymbol(
                              "WNI-MAPPED-TERMS-AND-POS-OFFSETS" ), makeSymbol( "CLEAR-PPH-AGR-PREDS-FROM-CATEGORY-CACHED" ), makeSymbol( "STOP-ALL-FACT-SHEET-SCREENSAVERS" ), makeSymbol(
                                  "ASSERTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS" ), makeSymbol( "LINKAGE-CREATION-RULES" ), makeSymbol( "CURRENT-MT-RELEVANCE-MT-LIST" ), makeSymbol( "SKSI-VIOLATIONS" ), makeSymbol(
                                      "SET-BASIC-NC-RULE-COUNT" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-15" ), makeSymbol( "CB-OPTIONS-GENERAL" ), makeSymbol( "CLEAR-CAE-DEFAULT-NL-DOMAIN-MT" ), makeSymbol(
                                          "CLEAR-QUERY-SEARCH-TABLE-PREDS" ), makeSymbol( "COMPUTE-MACHINE-BOGOMIPS" ), makeSymbol( "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER" ), makeSymbol(
                                              "BASIC-LILLIPUT-QUERY-METRICS" ), makeSymbol( "REMOVE-L2R-SENTENCE-STRING-NUMBER-INDEXICAL" ), makeSymbol( "SCOPE-KBS-SPLICING-ASSERTIONS" ), makeSymbol(
                                                  "GET-ALL-SBHL-MODULE-CACHE-STRATEGY-METRICS" ), makeSymbol( "RESEARCH-CYC-PRE-INITIALIZATIONS" ), makeSymbol( "DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK" ),
      makeSymbol( "DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME" ), makeSymbol( "SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?" ), makeSymbol( "NEW-WHOLLY-UNSPECIFIED-MT-ERROR" ), makeSymbol(
          "CB-ACTIVE-PROCESSES-FOR-DISPLAY" ), makeSymbol( "GATHER-LOAD-PARTITION-MISSING-CONSTANTS" ), makeSymbol( "COMPUTE-PRED-STRENG-RESULT" ), makeSymbol( "GENERIC-EVENT-DISPATCHER-PROCESS" ), makeSymbol(
              "CODE-PRODUCT" ), makeSymbol( "NEW-HAPPINESS-INDEX" ), makeSymbol( "CLEAR-FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?" ), makeSymbol( "KB-HL-SUPPORT-USAGE-COUNTS-ENABLED-P" ), makeSymbol( "EMPTY-MB" ),
      makeSymbol( "KILL-TEST-CONSTANTS-CREATED" ), makeSymbol( "SHOW-API-TP-MSGS" ), makeSymbol( "CLEAR-FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI" ), makeSymbol( "KB-TINY-OR-FULL" ), makeSymbol( "UNSET-FRACTION-KB-LOADED" ),
      makeSymbol( "NEW-NL-TRIE-COMPLETION-INDEX" ), makeSymbol( "CB-SHOW-RECENT-ASSERTIONS" ), makeSymbol( "TRANSLATION-COPYRIGHT-STRING" ), makeSymbol( "TRANSFORMATION-RULES-WITH-RECEIVED-STATISTICS-COUNT" ),
      makeSymbol( "NEW-ALEXANDRIA-ALL-RULES-ITERATOR" ), makeSymbol( "BESTPPFN" ), makeSymbol( "RKF-SC-NEW-LIMITATIONS" ), makeSymbol( "VERBOSE-PRINT-PPH-PHRASES?" ), makeSymbol( "OWL-OPENCYC-UNVERSIONED-BASE-URI" ),
      makeSymbol( "INITIALIZE-TERM-STRINGS-PREDS" ), makeSymbol( "INFERENCE-SPEC-PREDS-ARE-RELEVANT?" ), makeSymbol( "CLEAR-XSD-NAME" ), makeSymbol( "CLEAR-MAKE-NL-TAG-TEMPLATE" ), makeSymbol(
          "CB-SHOW-RECENT-SENTENCES" ), makeSymbol( "CLEAR-KB-STORE-ENTITY-MANAGER" ), makeSymbol( "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE" ), makeSymbol( "UNSET-DATE-KB-LOADED" ), makeSymbol(
              "ALL-INFERENCE-EVENT-CLASSES" ), makeSymbol( "NOT-INSTANCES-AMONG" ), makeSymbol( "SET-HB-ALTERNATE-PREDICATE" ), makeSymbol( "METER-ASSERTION-CONTENT-SWAP-TIME" ), makeSymbol(
                  "KB-CONTENT-COPYRIGHT-NOTICE" ), makeSymbol( "PSP-NEW-CONSTRAINTS" ), makeSymbol( "KB-PRODUCT" ), makeSymbol( "LOCAL-QUEUE-SIZE" ), makeSymbol( "KB-TINY-OR-FULL" ), makeSymbol(
                      "GET-SBHL-PREDICATES-INTERNAL" ), makeSymbol( "GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE" ), makeSymbol( "GET-TRIE-ANCESTOR-TRACKING-VECTOR" ), makeSymbol( "CLEAR-FUNCTION-CACHING-RESULTS" ),
      makeSymbol( "CLEAR-ASKED-QUERY-QUEUE" ), makeSymbol( "CB-KCT-TOGGLE-ROWCOLOR" ), makeSymbol( "INITIALIZE-GAF-AFTER-REMOVINGS-HASH" ), makeSymbol( "DECLARE-NL-TRIE-STALENESS-UNACCEPTABLE" ), makeSymbol(
          "REMOVE-FACT-SHEET-IMAGE-FILE-ROOT-URL" ), makeSymbol( "PPH-TOP-LEVEL-PROOF-P" ), makeSymbol( "CB-SYSTEM-HEALTH-SHOW-STATISTICS" ), makeSymbol( "ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC" ), makeSymbol(
              "PRINT-WFF-REFORMULATOR-RULES" ), makeSymbol( "HL-MODIFY-ANYWHERE?" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-6" ), makeSymbol( "SEND-STORED-OPERATIONS" ), makeSymbol(
                  "CLEAR-RELATION-GENERALITY-ESTIMATE-CACHED" ), makeSymbol( "SET-TO-TRANSMIT-ONLY" ), makeSymbol( "CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS" ), makeSymbol(
                      "INCREMENT-SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT" ), makeSymbol( "POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP" ), makeSymbol( "MAX-SUSPENDED-METHOD-DEPTH" ), makeSymbol(
                          "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE" ), makeSymbol( "*GENL-INVERSE-RULE*-INITIALIZER" ), makeSymbol( "INITIALIZE-OPEN-CYC-INFERENCE-API-VARS" ), makeSymbol(
                              "ALLOW-FACT-SHEET-SCREENSAVERS" ), makeSymbol( "KB-RULE-SET" ), makeSymbol( "SET-QUANT-KB-LOADED" ), makeSymbol( "CB-CLEAR-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS" ), makeSymbol(
                                  "CLEAR-GET-PRED-LIST-ORDER-FOR-TYPE" ), makeSymbol( "PROBLEM-REUSES-HISTORICAL-COUNT" ), makeSymbol( "GET-GURUQA-WIZARD" ), makeSymbol( "RESET-TP-VALID-QUANTITY-P" ), makeSymbol(
                                      "ALL-INFERENCE-MODES" ), makeSymbol( "CB-SUBL-DOC-MODULE-INDEX-STATIC-FILENAME" ), makeSymbol( "NEW-FORT-ID-INDEX-NARTS" ), makeSymbol( "CURRENT-GUARDIAN-PROCESS" ), makeSymbol(
                                          "COMPUTE-BOGUS-CONSTANT-NAMES-IN-CODE" ), makeSymbol( "CLEAR-PS-PARSE-VBAR-INT-CACHED" ), makeSymbol( "SME-LEXWIZ-USE-BLACKBOARD?" ), makeSymbol(
                                              "CLEAR-KB-HL-SUPPORT-CONTENT-TABLE" ), makeSymbol( "NEW-NO-OP-HIERARCHICAL-VISITOR" ), makeSymbol( "TERMPARAPHRASEFN-PHYSICALLOCATION" ), makeSymbol(
                                                  "NL-TAG-CYCL-PLACEHOLDER" ), makeSymbol( "MAINTAIN-ASSERTION-USAGE-COUNTS" ), makeSymbol( "NEW-ASSERTIONS-ITERATOR" ), makeSymbol( "CLEAR-PPH-ENHANCED-DOMAIN-MT" ),
      makeSymbol( "SKSI-HL-STORAGE-MODULES-COUNT" ), makeSymbol( "CLEAR-RKF-NUMBER-STRING?" ), makeSymbol( "CLEAR-CB-HTML-FOR-CYCLIST-IN-NL" ), makeSymbol( "PRE-PERCENT-NOT-WFF" ), makeSymbol(
          "GET-NUMERIC-DATE-PATTERNS" ), makeSymbol( "ACQUAINT-BLAIR-DEMO" ), makeSymbol( "MWP-RULE-SPEC-TABLE-INIT" ), makeSymbol( "STASH-KB-OBJECT-CONTENT-VARS" ), makeSymbol( "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL" ),
      makeSymbol( "FTS-INIT-VIA-RULES" ), makeSymbol( "CLEAN-SBHL-MODULES" ), makeSymbol( "SBHL-CACHE-SUCCESS-HISTORICAL-COUNT" ), makeSymbol( "CURRENT-MT-RELEVANCE-TEST" ), makeSymbol( "CAE-FRAGMENT-REFINEMENTS" ),
      makeSymbol( "RKF-ASSERTION-ATTRIBUTION-MT" ), makeSymbol( "ISA-ARGS-TO-QUERIES" ), makeSymbol( "COMMIT-KB-STORE-TRANSACTION" ), makeSymbol( "DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER" ), makeSymbol(
          "ACQUAINT-CLINTON-DEMO" ), makeSymbol( "FORGET-OLD-CREATION-SECONDS" ), makeSymbol( "GET-FORWARD-INFERENCE-ENVIRONMENT" ), makeSymbol( "RKF-SD-CLEAR" ), makeSymbol( "GET-KBS-POST-IDENTIFY-FORTS-FNS" ),
      makeSymbol( "INITIALIZE-NL-TRIE-NAME-STRING-PREDS" ), makeSymbol( "CURRENT-PARITER-WIDTH" ), makeSymbol( "REGISTER-USGS-SKS" ), makeSymbol( "*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*-INITIALIZER" ),
      makeSymbol( "NEW-FACT-SHEET-QUERY-DAEMON" ), makeSymbol( "TERMPARAPHRASEFN-CITYWITHSTATEORPROVINCEABBREVIATION" ), makeSymbol( "SOME-EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?" ), makeSymbol( "PAD-TABLE-INITIALIZED?" ),
      makeSymbol( "CYCL-QUERY-NAMESPACE" ), makeSymbol( "PERSPECTIVE-ACTIONS" ), makeSymbol( "CURRENT-FORWARD-INFERENCE-GAF" ), makeSymbol( "CLEAR-CORBA-CACHES" ), makeSymbol( "PPH-DEFAULT-GRAMMATICAL-GENDER" ),
      makeSymbol( "REMOTE-QUEUE-DEQUEUE" ), makeSymbol( "RTP-KB-LOADED-P" ), makeSymbol( "CURRENT-SYSTEM-TRANSLATION-SYSTEM" ), makeSymbol( "GET-INTERNAL-RUN-TIME" ), makeSymbol( "CLEAR-SOME-MAX-FLOOR-MTS?-CACHED" ),
      makeSymbol( "DUMPER-NUM-TOP-LEVEL-INDEX" ), makeSymbol( "INITIALIZE-CAE-QUERY-TRANSLATION" ), makeSymbol( "FINALIZE-KB-TABLES" ), makeSymbol( "NEXT-CLAUSE-STRUC-ID" ), makeSymbol( "RECONSTRUCT-AUXILIARY-INDICES" ),
      makeSymbol( "CLEAR-AT-VAR-TYPE-DNFS-INT-CACHED" ), makeSymbol( "REMOVE-KE-INTERACTION-FOLDERS" ), makeSymbol( "ENABLE-FULL-SENTENCE-CAE-INTERPRETATION" ), makeSymbol( "L2R-SENTENCE-NUMBER-INDEXICAL-INTERNAL" ),
      makeSymbol( "MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON" ), makeSymbol( "REMOVAL-MODULES" ), makeSymbol( "CLEAR-GET-STRINGS-OF-TYPE-CACHED" ), makeSymbol( "CLEAR-WNI-SYNSETS-CAUSED-BY-HELPER" ), makeSymbol(
          "INITIALIZE-TERM-STRINGS-PREDS" ), makeSymbol( "CLEAR-NODES-SUPPRESSED-FROM-FILTER" ), makeSymbol( "GET-SBHL-FORWARD-DIRECTED-DIRECTION" ), makeSymbol( "PPH-CURRENT-PRECISION" ), makeSymbol(
              "CLEAR-GET-COERCED-CYCLS-FOR-TERM" ), makeSymbol( "OCLOCKFN" ), makeSymbol( "GET-QL-INDEX-LOG" ), makeSymbol( "CLEAR-PPH-ARG-POSITION-LOOKUP" ), makeSymbol( "CYCML-INDENT" ), makeSymbol(
                  "PPH-KAPPA-JUSTIFICATION-TEMPLATE-INTERNAL" ), makeSymbol( "CLEAR-GENERATE-SKSI-SLRM-REQUIRED-FUNCTION" ), makeSymbol( "PPH-TRACKING-VAR-TYPES-P" ), makeSymbol(
                      "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER" ), makeSymbol( "SUCCESSFUL-INFERENCE-HISTORICAL-COUNT" ), makeSymbol( "NL-TAG-CYCL-PLACEHOLDER" ), makeSymbol(
                          "KBS-DEDUCTION-COUNT" ), makeSymbol( "GET-INDEXING-PRE-DUMP-CLEANUP-DEFS" ), makeSymbol( "DHTML-CREATION-SCRIPTS" ), makeSymbol( "USE-DEVELOPMENT-INDEXES" ), makeSymbol(
                              "NEW-SEMTRANS-LEXICON" ), makeSymbol( "NEW-BLUE-GRAPH" ), makeSymbol( "BENCHMARK-CYCLOPS-SETUP" ), makeSymbol( "INIT-TEMPORAL-BOUNDS-INTERSECT" ), makeSymbol(
                                  "DISABLE-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE" ), makeSymbol( "MAKE-PPH-INFO-VECTOR" ), makeSymbol( "CHECK-SBHL-MODULES-STORE-FOR-LEGACY-FORMAT" ), makeSymbol(
                                      "CREATE-NART-DUMP-ID-TABLE" ), makeSymbol( "SOME-FORT-BEING-REMOVED?" ), makeSymbol( "CLEAR-RKF-ASSERTION-ATTRIBUTION-MT" ), makeSymbol( "CLEAR-CANON-CACHES" ), makeSymbol(
                                          "TOMORROW" ), makeSymbol( "NON-FORT-ISA-TABLE" ), makeSymbol( "USE-FACT-SHEET-IMAGE-FILE-ROOT-URL?" ), makeSymbol( "PREVIOUS-QUERY-INFERENCE" ), makeSymbol(
                                              "CLEAR-AT-ARGN-INT-CACHED" ), makeSymbol( "CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS" ), makeSymbol( "NEW-RDF-GRAPH" ), makeSymbol( "CLEAR-NL-MAX-FLOOR-PREDS" ), makeSymbol(
                                                  "GET-KBS-INHERITED-STORES" ), makeSymbol( "UNSTASH-OTHER-VARS-14" ), makeSymbol( "JSON-NEWLINE" ), makeSymbol( "OWL-TAG-ATTRIBUTES-INTERNAL" ), makeSymbol(
                                                      "GET-SBHL-SEARCH-ADD-NODE-TEST" ), makeSymbol( "CLEAR-FUNCTION-CACHING-RESULTS" ), makeSymbol( "CLEAR-RKF-VERB-STRING?" ), makeSymbol(
                                                          "CB-CLEAR-KCT-TEST-BEING-SAVED" ), makeSymbol( "PPH-CLOSE-TAG-GREP-REGEX" ), makeSymbol( "CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?" ), makeSymbol(
                                                              "INTER-ARG-FORMAT-CACHE-INITIALIZED?" ), makeSymbol( "CLEAR-AUTOCOMPLETE-ISA-CACHE" ), makeSymbol( "GENL-ARGS-TO-QUERIES" ), makeSymbol(
                                                                  "PLURALPARAPHRASEFN-PP" ), makeSymbol( "INITIALIZE-REFORMULATOR-RULE-PREDICATES" ), makeSymbol( "KB-DUMP-COMMON-SYMBOLS" ), makeSymbol(
                                                                      "PPH-PHRASE-ID-INDEX-NEW-OBJECTS-COUNT" ), makeSymbol( "HL-PROTOTYPES-ENABLED?" ), makeSymbol( "REBUILD-NON-TRUE-ASSERTION-TV-CACHE" ), makeSymbol(
                                                                          "GENERIC-PREFERENCE-MODULES" ), makeSymbol( "RECOMPUTING-SKOLEM-DEFN-INFO-BLIST" ), makeSymbol( "GET-ENTITY-GRAPH-REGISTRY" ), makeSymbol(
                                                                              "CLEAR-GEN-TEMPLATE-VERBOSITY" ), makeSymbol( "OLD-UNREPRESENTED-TERM-COUNT" ), makeSymbol( "KBS-DEFINITIONAL-CONSTANT-COUNT" ), makeSymbol(
                                                                                  "CLEAR-LEXIFICATION-CACHES" ), makeSymbol( "FACT-SHEET-QUERY-SOFT-TIMEOUT-TIME-REACHED?" ), makeSymbol( "CB-MISSING-ICON" ), makeSymbol(
                                                                                      "METER-NART-INDEX-SWAP-TIME" ), makeSymbol( "INCREMENT-DISCARDED-TACTIC-HISTORICAL-COUNT" ), makeSymbol(
                                                                                          "MWP-RULE-CONSTRAINT-TABLE-INIT" ), makeSymbol( "SME-LEXWIZ-USE-BLACKBOARD?" ), makeSymbol( "CLEAR-PPH-APPLY-TEMPLATE" ),
      makeSymbol( "CLEAR-NL-REFORMULATE-INT-CACHED" ), makeSymbol( "KB-HL-SUPPORT-CONTENT-INDEX-MEMORY-MAPPED?" ), makeSymbol( "UN-NOTE-ALL-SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCES" ), makeSymbol(
          "HLT-TRACE-ENABLED?" ), makeSymbol( "GET-SBHL-GATHER-SPACE" ), makeSymbol( "SKSI-BATCH-TRANSLATE-COERCE-TYPES?" ), makeSymbol( "CB-USE-MYCREATOR-FILTER" ), makeSymbol( "UNDEFINE-ALL-TEST-CASE-TABLES" ),
      makeSymbol( "ASSERT-MISSING-QUOTED-ISA-INSTANTIATED-CONSTANT-ASSERTIONS" ), makeSymbol( "SBHL-APPLY-UNWIND-FUNCTION-P" ), makeSymbol( "CLEAR-TIME-MT-CACHE" ), makeSymbol( "CB-TOE-QUERY" ), makeSymbol(
          "INITIALIZE-COLLECTION-LOCAL-SPEC-CARDINALITIES" ), makeSymbol( "SBHL-VERIFY-NAUT-MT-RELEVANCE-P" ), makeSymbol( "COMPUTE-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO" ), makeSymbol( "MAX-SKOLEM-ARITY" ),
      makeSymbol( "RBP-WFF-DOMAIN-MT" ), makeSymbol( "OWL-EXPORT-DEFAULT-NAMESPACE" ), makeSymbol( "REMOVE-SKSI-SCHEMA-TRANSLATION-LIFTING-RULE" ), makeSymbol( "CLEAR-NL-TRIE-POS-OF-PRED" ), makeSymbol(
          "NEW-CB-PARTITION-SAVE" ), makeSymbol( "WITHIN-ASK?" ), makeSymbol( "BESTSETPARAPHRASEWITHSEPARATORANDCOEFFICIENTSFN-CONSTRAINED" ), makeSymbol( "UNSTASH-OTHER-VARS-11" ), makeSymbol(
              "REMOVAL-MODULES-WITH-REMOVAL-MODULE-COST-TESTS" ), makeSymbol( "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER" ), makeSymbol( "CLEAR-FACT-SHEET-SENTENCE-GROUP-SUMMARY" ), makeSymbol(
                  "BASIC-LILLIPUT-QUERY-METRICS" ), makeSymbol( "CB-SUBL-DOC-HEADER" ), makeSymbol( "NON-WFF-COUNT" ), makeSymbol( "QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL" ), makeSymbol(
                      "ENUMERATE-ALL-TEMPLATE-CATEGORIES" ), makeSymbol( "ENABLE-SPEC-PREDS-OF-IST-INDEXING" ), makeSymbol( "CLEAR-SKSI-CONJUNCTIVE-REMOVAL-MODULES" ), makeSymbol( "FI-ASK-STATUS" ), makeSymbol(
                          "INITIALIZE-INTENSIONALLY-INCOMPATIBLE-MT-MODULE" ), makeSymbol( "SBHL-GOAL-SEARCH-P" ), makeSymbol( "EFFECTIVE-SERVLET-CONTAINER-PORT" ), makeSymbol( "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES" ),
      makeSymbol( "CONSTANT-INDEX-USAGE-COUNTS-ENABLED?" ), makeSymbol( "RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS" ), makeSymbol( "CLEAR-INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE" ), makeSymbol(
          "UNSTASH-KB-INDEXING-VARS-1" ), makeSymbol( "CURRENTLY-ACTIVE-PROBLEM" ), makeSymbol( "ALL-CURRENTLY-FORWARD-PROPAGATING-SUPPORTS" ), makeSymbol( "MINIMAL-HAPPINESS" ), makeSymbol(
              "CLEAR-TERM-LEARNER-CLOUD-DISPLAY-NL" ), makeSymbol( "NLDISJUNCTIONFN" ), makeSymbol( "MULTI-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT" ), makeSymbol( "CB-FORM-CONS-INTER-ARG-SPACE" ), makeSymbol(
                  "PPH-NBAR-CATEGORY" ), makeSymbol( "PERFORM-CYC-TESTING-INITIALIZATIONS" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR-STATE" ), makeSymbol( "NEW-ASSERTION-COUNT" ), makeSymbol(
                      "CLEAR-WU-ARG-OF-PRED-CACHED-INT" ), makeSymbol( "READ-OPERATIONS-FROM-SERVER" ), makeSymbol( "PROCESS-QL-INDEX-QUEUE-ENTRIES" ), makeSymbol( "WNI-REFRESH-CONCEPT-MATCH-HTML-CACHE" ), makeSymbol(
                          "SBHL-REACHED-CUTOFF-P" ), makeSymbol( "NEGATIVE-INFINITY" ), makeSymbol( "INITIALIZE-NON-FORT-ISA-TABLES" ), makeSymbol( "ENFORCE-EVALUATABLE-SATISFIABILITY?" ), makeSymbol(
                              "PROBLEM-STORE-ID-INDEX" ), makeSymbol( "STOP-BLUE-EVENT-DISPATCHER" ), makeSymbol( "NEW-BOOKKEEPING-INTERMEDIATE-INDEX" ), makeSymbol( "ADD-KBS-ADDITIONAL-REDUNDANT-ASSERTED-ARGUMENTS" ),
      makeSymbol( "ASSERTIONS-WITH-MORE-THAN-ONE-BELIEF" ), makeSymbol( "KB-STORAGE-LOGGING-P" ), makeSymbol( "RUN-AUXILIARY-OP?" ), makeSymbol( "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL" ), makeSymbol(
          "FACT-SHEET-IMAGE-FILE-ROOT-URL" ), makeSymbol( "USE-DEVELOPMENT-DISAMBIGUATED-INDEXES" ), makeSymbol( "HALT-NEWS-TROLLER-DAEMON" ), makeSymbol( "CB-PARTITION-LOAD-PUBLIC-SECTION" ), makeSymbol(
              "MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT" ), makeSymbol( "NL-REFORMULATE-DAEMON" ), makeSymbol( "SC-ACT-NEW-STATE" ), makeSymbol( "CLEAR-GET-AFFECTED-PARTS" ), makeSymbol(
                  "RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS" ), makeSymbol( "CLEAR-MAX-PREDS-MATCHING-POS-CACHED" ), makeSymbol( "SKSI-WARN-ON-ERRORS" ), makeSymbol( "KBS-IMAGE-CLEANUP" ), makeSymbol(
                      "HL-ACCESS-REMOTE?" ), makeSymbol( "ALL-BACKWARD-RULES" ), makeSymbol( "CLEAR-CACHED-UNION-ALL-SPECS-COUNT" ), makeSymbol( "OLD-NART-COUNT" ), makeSymbol( "HL-STORE-ERROR-HANDLING-MODE" ),
      makeSymbol( "SCOPE-KBS-SPLICING-ASSERTIONS" ), makeSymbol( "SINGLE-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT" ), makeSymbol( "RKF-SC-NEW-LIMITATIONS" ), makeSymbol( "KEYWORD-VARIABLE-PREFIX-CHAR" ), makeSymbol(
          "INITIALIZE-PLANNER-THREAD" ), makeSymbol( "INITIALIZE-AGENT-MANAGER-CONNECTION" ), makeSymbol( "TOTAL-SIZE-OF-ALL-HISTORICAL-PROBLEM-STORES" ), makeSymbol( "ACTIVE-LEXICON-FILTERS" ), makeSymbol(
              "NL-REF-RESET-METRICS" ), makeSymbol( "CLEAR-PPH-INDEXICAL-DATES" ), makeSymbol( "ALL-NEW-NARTS" ), makeSymbol( "DO-FORWARD-MODULES-LIST" ), makeSymbol( "CB-TD-SEARCH-GUTS" ), makeSymbol(
                  "RESET-WFF-VIOLATIONS" ), makeSymbol( "RECOMPUTING-SKOLEM-DEFN-INFO-VAR" ), makeSymbol( "DECLARE-NL-TRIE-STALENESS-UNACCEPTABLE" ), makeSymbol( "NEW-DEDUCTION-CHECKPOINT" ), makeSymbol(
                      "INITIALIZE-SPEECH-PART-PREDS" ), makeSymbol( "CYC-STANDARD-LISP-SOURCE-DIRECTORY" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-2" ), makeSymbol( "INDEXICAL-HYPOTHESIS-MT" ), makeSymbol(
                          "SERVLET-CONTAINER-PORT" ), makeSymbol( "STOP-ALL-FACT-SHEET-SCREENSAVERS" ), makeSymbol( "RKF-UTTRDR-ARE-NLTAGS-ALLOWED?" ), makeSymbol( "LISP-IMPLEMENTATION-TYPE" ), makeSymbol(
                              "ARETE-LAST-NART-TOUCHED" ), makeSymbol( "CURRENTLY-EXECUTING-TACTICS" ), makeSymbol( "RECLASSIFY-HL-STORAGE-MODULES" ), makeSymbol( "GET-ALL-SDS" ), makeSymbol( "GET-SQS-VERSION" ),
      makeSymbol( "UNSET-QUANT-KB-LOADED" ), makeSymbol( "KB-TINY-OR-FULL" ), makeSymbol( "ENGLISH-QUANTITY-PARSER" ), makeSymbol( "CLEAR-HIGHER-ORDER-COLLECTION?-CACHED" ), makeSymbol(
          "CONJUNCTIVE-REMOVAL-MODULE-COUNT" ), makeSymbol( "RECOMPUTING-SKOLEM-DEFN-INFO-KEY" ), makeSymbol( "CB-CLEAR-EL-FORMULAS-CACHE" ), makeSymbol( "GENERATE-QUIRK-GUI-EMPTY-ANSWER" ), makeSymbol(
              "GENERIC-EVENT-DISPATCHER-PROCESS" ), makeSymbol( "NO-WFF-SEMANTICS-OR-ARITY?" ), makeSymbol( "GET-NEW-PPH-PHRASE-COUNT" ), makeSymbol( "TEST-RDF-GRAPH" ), makeSymbol( "DEFN-COLLECTION" ), makeSymbol(
                  "RED-GET-OBJECT-BARE" ), makeSymbol( "CLEAR-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?" ), makeSymbol( "RDF-XML-LITERAL-URI" ), makeSymbol( "INITIALIZE-NEW-CYCL-QUERY-PARAMETER-SET" ), makeSymbol(
                      "DEDUCTION-MANAGER-MAINTAIN-USAGE-COUNTS" ), makeSymbol( "CANDIDATE-ASSERTION-FI-FORMULA" ), makeSymbol( "CLEAR-CACHED-COMPACT-HL-EXTERNAL-ID-STRING" ), makeSymbol(
                          "MAYBE-INITIALIZE-PPH-GENERATION-PREDS" ), makeSymbol( "CYC-TEST-FILE-COUNT" ), makeSymbol( "COUNT-NEW-DEDUCTIONS" ), makeSymbol( "INITIALIZE-NART-INDEX-HL-STORE-CACHE" ), makeSymbol(
                              "OLD-UNREPRESENTED-TERM-COUNT" ), makeSymbol( "WIDE-UNREPRESENTED-TERM-COMPLEX-INDEX-HL-STORE-CACHE?" ), makeSymbol( "BLUE-FILTER-FNS" ), makeSymbol( "INITIALIZE-KCT" ), makeSymbol(
                                  "REBUILD-LEXICON-CACHE" ), makeSymbol( "CLEAR-NEGATION-PREDICATE-GRAPH" ), makeSymbol( "CLEAR-QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED" ), makeSymbol(
                                      "GET-KB-HEALTH-STATISTIC-COMPONENTS" ), makeSymbol( "NEW-PROBLEM-STORE-POINTER" ), makeSymbol( "CHECK-SBHL-CACHES?" ), makeSymbol(
                                          "GATHER-RELEVANT-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE" ), makeSymbol( "PERFORM-INDEXING-PRE-DUMP-CLEANUP" ), makeSymbol(
                                              "PREVIOUS-OWL-EXPORT-VERSION-DATES" ), makeSymbol( "GET-KB-HEALTH-STATISTIC-COMPONENTS" ), makeSymbol( "CLEAR-NART-HL-FORMULA-SWAP-TIME" ), makeSymbol(
                                                  "NOTE-SBHL-CACHES-INITIALIZED" ), makeSymbol( "CURRENT-KB-MODIFICATION-EVENT-MAILBOX-SUITE" ), makeSymbol( "TRANSFORMATION-MODULE-COUNT" ), makeSymbol(
                                                      "WNI-ACCESS-PATH-PROXY-PORT" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-12" ), makeSymbol( "AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?" ), makeSymbol(
                                                          "FORMULA-TEMPLATE-NAMESPACE" ), makeSymbol( "HTML-COPYRIGHT-TEXT" ), makeSymbol( "CLEAR-CONCEPTS-TO-ADD-FOR-CONCEPT" ), makeSymbol(
                                                              "RKF-TEXT-PROCESSOR-RESET-CACHES" ), makeSymbol( "RKF-SD-MAKE-PROBLEM-STORE" ), makeSymbol( "CB-SHOW-SYSTEM-SETTINGS" ), makeSymbol(
                                                                  "UNSTASH-INFERENCE-VARS-12" ), makeSymbol( "STUB-TARGET-ACCESS-PATH" ), makeSymbol( "GET-FILE-BACKED-DEDUCTION-ID-THRESHOLD" ), makeSymbol(
                                                                      "CB-AVAILABLE-TOOLS" ), makeSymbol( "INDEXICAL-HYPOTHESIS-MT" ), makeSymbol( "ESTIMATED-CONSTANTS-PER-NART" ), makeSymbol(
                                                                          "START-SCHEDULED-QUERY-PROCESSING-INTERNAL" ), makeSymbol( "CREATE-KQML-READ-TABLE" ), makeSymbol( "UNSTASH-OTHER-VARS-12" ), makeSymbol(
                                                                              "XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION" ), makeSymbol( "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL" ), makeSymbol(
                                                                                  "FSUT-PRIORITIZER-DEFAULT-NEW-DAYS" ), makeSymbol( "NEW-ALEXANDRIA-ALL-STRINGS-ITERATOR" ), makeSymbol( "READ-TRANSCRIPT-POSITION" ),
      makeSymbol( "CLEAR-CONCEPT-FILTER-CACHES" ), makeSymbol( "INCREMENT-SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT" ), makeSymbol( "CLEAR-GET-ALL-SUBEVENTS" ), makeSymbol( "CR-NON-PERSON" ), makeSymbol(
          "INCREMENT-TACTIC-HISTORICAL-COUNT" ), makeSymbol( "COMPUTE-SPARQL-ORACLE-QUERY-TIMEOUT" ), makeSymbol( "RESTART-ALL-TCP-SERVERS" ), makeSymbol( "PSP-ALLOWED-GAP-CATEGORY" ), makeSymbol( "BASIC-AJAX-SCRIPTS" ),
      makeSymbol( "GET-SBHL-WHAT-MTS-MARKING-SPACE" ), makeSymbol( "MISSING-KNOWLEDGE-DISCOVERY-EVENT-BROKER" ), makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" ), makeSymbol( "DONT-METER-CONSTANT-INDEX-SWAP-TIME" ),
      makeSymbol( "SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE" ), makeSymbol( "INITIALIZE-NL-TRIE-OTHER-PREDICATES" ), makeSymbol( "CLEAR-DENOTATIONS-OF-CONSTANT" ), makeSymbol(
          "CLEAR-REMOTE-OPERATIONS-KB-CHECK-POINT" ), makeSymbol( "NEW-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR" ), makeSymbol( "UNMARK-FORTS-WITHOUT-ASSERTIONS" ), makeSymbol( "CLEAR-GET-COOCCURRING-CONDITIONS" ),
      makeSymbol( "CURRENT-FORWARD-INFERENCE-ENVIRONMENT" ), makeSymbol( "ABORT-CURRENT-CONTROLLING-INFERENCE" ), makeSymbol( "NON-FORT-INSTANCE-TABLE" ), makeSymbol( "INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES" ),
      makeSymbol( "STOP-KB-MODIFICATIONS-EVENT-DISPATCHER" ), makeSymbol( "CLEAR-REDUCE-MT-UNION-HLMT-INT" ), makeSymbol( "LAUNCH-SCHEDULED-QUERY-DAEMON" ), makeSymbol(
          "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT" ), makeSymbol( "WNI-TOPMOST-UNMAPPED-VERBS-FOR-MATCHING" ), makeSymbol( "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED-2" ), makeSymbol( "RESET-JAVA-API-KERNEL" ),
      makeSymbol( "KBP-NODE-COUNT" ), makeSymbol( "PPH-REGEX-AVAILABLE?" ), makeSymbol( "INFERENCE-CURRENT-SENSE" ), makeSymbol( "DONT-METER-ASSERTION-CONTENT-SWAP-TIME" ), makeSymbol( "NEXT-RUNSTATE-ID" ), makeSymbol(
          "CLEAR-RELATION-MOST-RESTRICTED-ARG" ), makeSymbol( "INITIALIZE-SPEECH-PART-CACHES" ), makeSymbol( "WNI-ACCESS-PATH-PORT" ), makeSymbol( "GET-JAVA-RED-ROOT-KEY" ), makeSymbol( "INDEXICAL-FACT-SHEET-TOPIC" ),
      makeSymbol( "BESTDETNBARFN-DEFINITE" ), makeSymbol( "ALWAYS-ACTIVE-CB-FORM-CONS-METHODS" ), makeSymbol( "MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT" ), makeSymbol( "NO-WFF-SEMANTICS-OR-ARITY?" ), makeSymbol(
          "PSP-GAP-ALLOWED?" ), makeSymbol( "HTML-EOS-OPEN-TAGS" ), makeSymbol( "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL" ), makeSymbol( "CLEAR-DATE-GENLS" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-10" ), makeSymbol(
              "CB-SPECIFIC-REMOVAL-MODULE-PREDICATES" ), makeSymbol( "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING" ), makeSymbol( "TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED" ), makeSymbol(
                  "CLEAR-POS-ARG-OF-PRED-CACHED" ), makeSymbol( "UNSTASH-OTHER-VARS-13" ), makeSymbol( "SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE" ), makeSymbol( "TERMPARAPHRASEFN-PRENOMINALMODIFIER" ), makeSymbol(
                      "NOTE-RBP-RB-INITIALIZED" ), makeSymbol( "REMOVE-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol( "SPEC-INVERSES-ARE-RELEVANT?" ), makeSymbol(
                          "CLEAR-PPH-DISCOURSE-CONTEXT" ), makeSymbol( "CLEAR-TERM-LEARNER-TYPES-FOR-FRAGMENT" ), makeSymbol( "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED" ), makeSymbol( "CLEAR-PSP-BINDINGS-FROM-FRAME-INT" ),
      makeSymbol( "CLEAR-STORED-OPERATIONS" ), makeSymbol( "CLEAR-QAGA-LINK-RESULT" ), makeSymbol( "CB-MYREVIEWER-FILTER" ), makeSymbol( "RANDOM-PREDICATE" ), makeSymbol( "AGENDA-ERROR-MODE" ), makeSymbol(
          "HLMTS-SUPPORTED?" ), makeSymbol( "GATHERING-EXPANSION-JUSTIFICATIONS?" ), makeSymbol( "STASH-KB-OBJECT-CONTENT-VARS" ), makeSymbol( "INDEXICAL-TOMORROW" ), makeSymbol( "KEYWORD-VARIABLE-PREFIX-CHAR" ),
      makeSymbol( "MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES" ), makeSymbol( "HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P" ), makeSymbol( "WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?" ), makeSymbol(
          "PPH-PHRASE-DEFAULT-VERB-PRED" ), makeSymbol( "PLANNER-KB-LOADED-P" ), makeSymbol( "MAKE-EMPTY-SET-SUPPORT" ), makeSymbol( "PSP-CHART-MAX-SPAN" ), makeSymbol( "FIND-OR-CREATE-PPH-MEMOIZATION-STATE" ),
      makeSymbol( "SET-CYC-SECURE-KB-LOADED" ), makeSymbol( "CLEAR-NL-TRIE-CLOSED-CLASS-POS-PREDS" ), makeSymbol( "FINALIZE-HAYSTACK-CORPUS" ), makeSymbol( "STASH-KB-INDEXING-VARS" ), makeSymbol(
          "RKF-SD-FIND-OR-MAKE-PROBLEM-STORE" ), makeSymbol( "CLEAR-PPH-VAR-TYPING-PREDICATES" ), makeSymbol( "CYC-HPSG-FEATURE" ), makeSymbol( "MAPPING-ANSWER-FOUND?" ), makeSymbol(
              "SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR?" ), makeSymbol( "DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE" ), makeSymbol( "CACHED-NART-INDEX-COUNT" ), makeSymbol( "TVA-VAR-ARGNUMS" ), makeSymbol(
                  "NEW-RKF-SD-RULE-INFO-SCORE" ), makeSymbol( "CLEAR-INTERPRETATION-RULES" ), makeSymbol( "WRITING-TRANSCRIPTS?" ), makeSymbol( "CB-ALL-GENERIC-PREFERENCE-MODULES" ), makeSymbol(
                      "PARSING-TIMEOUT-CURRENT-TIME" ), makeSymbol( "TOTAL-SIZE-OF-ALL-HISTORICAL-PROBLEM-STORES" ), makeSymbol( "CLEAR-MAX-PREDS-MATCHING-POS-CACHED" ), makeSymbol( "ENSURE-REFORMULATOR-INITIALIZED" ),
      makeSymbol( "PROCESS-QL-INDEX-QUEUE-ENTRIES" ), makeSymbol( "CLEAR-GET-TREATMENTS-FOR-CONDITION" ), makeSymbol( "STOP-ALL-FSUT-PRIORITIZERS" ), makeSymbol( "FIND-ASSERTION-WITH-KB-HL-SUPPORT-DEDUCTION-DEPENDENT" ),
      makeSymbol( "POPULATE-SCHEDULED-QUERY-QUEUE" ), makeSymbol( "ALWAYS-ACTIVE-CB-FORM-CONS-METHODS" ), makeSymbol( "CLEAR-PREDICATE-GRAPH" ), makeSymbol( "REBUILD-RULE-AFTER-ADDING-CACHES" ), makeSymbol(
          "REMOVE-SCOPED-PARTITION" ), makeSymbol( "CLEAR-RTP-VBAR-TEMPLATE-CATEGORY?" ), makeSymbol( "GET-ENGLISH-GENERATION-FORT-CACHE" ), makeSymbol( "LAUNCH-LONG-INFERENCE-WARNER" ), makeSymbol(
              "CONTENT-LINK-HISTORICAL-COUNT" ), makeSymbol( "PPH-TRACKING-VAR-TYPES-P" ), makeSymbol( "NEXT-UNREPRESENTED-TERM-SUID" ), makeSymbol( "GET-DERIVED-NC-RULE-COUNT" ), makeSymbol(
                  "LOCAL-OPERATIONS-ANYWHERE" ), makeSymbol( "FACT-SHEET-PARAPHRASE-SOFT-TIMEOUT-TIME-REACHED?" ), makeSymbol( "SPECIFIC-REMOVAL-MODULES" ), makeSymbol( "CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES-INTERNAL" ),
      makeSymbol( "CLEAR-GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION" ), makeSymbol( "REBUILD-KB-INDEXING" ), makeSymbol( "L2R-SUPERTEXT-INDEXICAL-INTERNAL" ), makeSymbol( "CLEAR-WNI-SYNSET-TERM-HELPER" ), makeSymbol(
          "COMPUTE-CORE-FORTS" ), makeSymbol( "INDEXICAL-THE-CURRENT-SYSTEM-NUMBER" ), makeSymbol( "KBS-DEFINITION-VALID?" ), makeSymbol( "TRANSLATION-COPYRIGHT-STRING" ), makeSymbol(
              "CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT" ), makeSymbol( "DEPRECATE-OLD-SOURCE-CITATION-FORMAT?" ), makeSymbol( "RKF-GENERATE-EXAMPLES?" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-9" ), makeSymbol(
                  "LIST-ALL-PACKAGES" ), makeSymbol( "UNSTASH-OTHER-VARS-14" ), makeSymbol( "CALL-FORWARD-INFERENCE-BROWSING-CALLBACK?" ), makeSymbol( "REINDEX-ALL-ASSERTIONS" ), makeSymbol(
                      "FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER" ), makeSymbol( "CYC-QA-FEATURE" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-12" ), makeSymbol( "ALL-CORE-CONSTANTS" ), makeSymbol(
                          "CLEAR-MWP-BASE-POSES-FOR-REIFIED-AFFIX" ), makeSymbol( "QC-NEW-QUERY" ), makeSymbol( "CREATE-ASSERTION-DUMP-ID-TABLE" ), makeSymbol( "NEW-TACTICLESS-STRATEGY" ), makeSymbol(
                              "SKSI-BATCH-TRANSLATE-COERCE-TYPES?" ), makeSymbol( "CLEAR-WORD-GRAPH-LINKS" ), makeSymbol( "NEW-CACHE-METRICS" ), makeSymbol( "FORGET-INVALID-DEDUCTIONS" ), makeSymbol(
                                  "COUNT-NEW-DEDUCTIONS" ), makeSymbol( "FORWARD-MODULES" ), makeSymbol( "ENSURE-LINK-SERVER-RUNNING" ), makeSymbol( "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-NO-SUCCESS" ), makeSymbol(
                                      "CB-SHOW-MISSING-BINDING-VALUE-HORIZONTAL" ), makeSymbol( "DESTROY-ALL-PROBLEM-STORES" ), makeSymbol( "CLEAN-KB-INDEXING" ), makeSymbol( "PSP-AGENT" ), makeSymbol(
                                          "CURRENTLY-ACTIVE-PROBLEM-QUERY" ), makeSymbol( "CLEAR-SKOS-NAME" ), makeSymbol( "CLEAR-NER-CLUSTERS" ), makeSymbol( "CLEAR-MONAD-MT-NAUT-CACHE" ), makeSymbol(
                                              "DETERMINE-SBHL-MARK-BETWEEN-CONSIDER-FN" ), makeSymbol( "MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol(
                                                  "STITCH-TOGETHER-NL-GENERATION-CACHE-TIME-PLOTS" ), makeSymbol( "SBHL-CACHE-TUNING-DATA-GATHERING-EPILOGUE" ), makeSymbol( "NEW-BOOKKEEPING-INTERMEDIATE-INDEX" ),
      makeSymbol( "NART-COUNT" ), makeSymbol( "QC-NEW-QUERY" ), makeSymbol( "LOCAL-HL-TRANSCRIPT-VERSION" ), makeSymbol( "GET-SANITY-CHECKER" ), makeSymbol( "BIO-FILTER-COLL" ), makeSymbol(
          "WIDE-CONSTANT-COMPLEX-INDEX-HL-STORE-CACHE?" ), makeSymbol( "SBHL-SEARCH-TRUE-TV" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE" ), makeSymbol( "THROW-UNEVALUATABLE" ), makeSymbol(
              "ACTIVE-GUARDIAN-REQUESTS" ), makeSymbol( "INDEXICAL-FACT-SHEET-TABLE-TYPE" ), makeSymbol( "CLEAR-FORT-PASSES-CACHED-THCL-TESTS?" ), makeSymbol( "RC-ACT-NEW-STATE" ), makeSymbol(
                  "MERGE-FORT-ASSERTION-MAP-VALID?" ), makeSymbol( "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE" ), makeSymbol( "METER-NART-HL-FORMULA-SWAP-TIME" ), makeSymbol( "UNSET-LEXICON-KB-LOADED" ), makeSymbol(
                      "CLEAR-TEMPLATE-RULES-MASTER-INDEX" ), makeSymbol( "INDEXICAL-THE-CURRENT-HOST-NAME" ), makeSymbol( "LEVIATHAN-ALLOWED-RULES" ), makeSymbol( "GET-SBHL-GOAL-NODES" ), makeSymbol(
                          "HTTP-STATE-KEY-FOR-REQUEST" ), makeSymbol( "REMOVE-INVALID-PPH-PHRASES" ), makeSymbol( "CONSTANT-INDEX-MEMORY-MAPPED?" ), makeSymbol( "FORT-REFORMULATOR-RULE-TABLE" ), makeSymbol(
                              "CLEAR-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE" ), makeSymbol( "UNSTASH-OTHER-VARS-11" ), makeSymbol( "AT-SOME-ARG-ISA-REQUIRED?" ), makeSymbol( "CLEAR-MAL-ACTUAL-ARITY-CACHED?" ),
      makeSymbol( "HTML-COMPLETE-SCRIPT" ), makeSymbol( "XML-TERPRI" ), makeSymbol( "CURRENT-PARITER-WIDTH" ), makeSymbol( "WITHIN-CONJUNCTION?" ), makeSymbol( "INFERENCE-CURRENT-SENSE" ), makeSymbol(
          "SYNCHRONIZE-CONSTANTS-WITH-HL-STORE" ), makeSymbol( "NEW-UIMA" ), makeSymbol( "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES" ), makeSymbol( "INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE" ), makeSymbol( "SF-NEXT-ID" ),
      makeSymbol( "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER" ), makeSymbol( "CLEAR-FULLY-CONNECTED-GRAPH-LINKS" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-9" ), makeSymbol(
          "DONT-METER-UNREPRESENTED-TERM-INDEX-SWAP-TIME" ), makeSymbol( "UNSET-FRACTION-KB-LOADED" ), makeSymbol( "UNSTASH-INFERENCE-VARS-13" ), makeSymbol( "TERRORIST-ATTACK-LEXIFICATION-KBQ" ), makeSymbol(
              "ALEPH-EXPORT-MODE-INFORMATION?" ), makeSymbol( "NEW-FORMULA-TEMPLATE-EDITING-STATE" ), makeSymbol( "MAINTAIN-UNREPRESENTED-TERM-INDEX-USAGE-COUNTS" ), makeSymbol( "LEVIATHAN-KB-CONTENT-ALLOWED-RULES" ),
      makeSymbol( "YESTERDAY" ), makeSymbol( "STASH-KB-OBJECT-CONTENT-VARS" ), makeSymbol( "CYC-QA-FEATURE" ), makeSymbol( "NEW-CONSTANT-COUNT" ), makeSymbol( "PPH-UNKNOWN-ARG-POSITION" ), makeSymbol(
          "MAKE-RELATION-INSTANCE-EXISTS-SUPPORT" ), makeSymbol( "FORWARD-INFERENCE-METRICS-TIME-INDEX" ), makeSymbol( "GET-SBHL-GOAL-TABLE" ), makeSymbol( "REMOTE-QUEUE-SIZE" ), makeSymbol( "GET-TEMP-DIRECTORY" ),
      makeSymbol( "CURRENT-FORWARD-INFERENCE-RULE" ), makeSymbol( "INITIALIZE-NL-TRIE-NAME-STRING-PREDS" ), makeSymbol( "PROCESS-COUNT" ), makeSymbol( "POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD" ),
      makeSymbol( "SBHL-CONTINUE-SEARCH-PATH" ), makeSymbol( "INITIALIZE-PPH-SUBJECT-ROLE-PREDS" ), makeSymbol( "KBS-KILL-UNRUNNABLE-KB-QUERIES" ), makeSymbol( "CLEAR-NART-HL-FORMULA-TABLE" ), makeSymbol(
          "TEST-EMIT-CYCML-ASSERTIONS" ), makeSymbol( "CLEAR-CORE-MT-DEFINITIONAL-INFO" ), makeSymbol( "CLEAR-PSP-REWRITE" ), makeSymbol( "GET-SBHL-COMPOSE-FN" ), makeSymbol( "EPHEMERAL-TERM-COUNT" ), makeSymbol(
              "TERMPARAPHRASEFN-COUNTYWITHSTATEORPROVINCEABBREVIATION" ), makeSymbol( "EXPANSION-JUSTIFICATION" ), makeSymbol( "PPH-SEARCH-LIMIT" ), makeSymbol( "SBHL-PRIMARY-WHAT-MTS-SPACES" ), makeSymbol(
                  "SUBCOL-UNWIND-ALLOCATE-EXISTENTIAL-VARIABLE" ), makeSymbol( "RESET-OLD-DEFNS-ADMIT?-METERS" ), makeSymbol( "RECOMPUTING-SKOLEM-DEFN?" ), makeSymbol( "CLEAR-FACT-SHEET-TRANSITIVITY-CHECK" ), makeSymbol(
                      "CB-PROOF-VIEW-DESTROYER" ), makeSymbol( "ALL-INFERENCE-DYNAMIC-PROPERTIES" ), makeSymbol( "CB-AVAILABLE-TOOLS" ), makeSymbol( "ARETE-LAST-CONSTANT-TOUCHED" ), makeSymbol(
                          "L2R-SUPERTEXT-INDEXICAL" ), makeSymbol( "MAX-GEN-TEMPLATE-PHRASE-ID-INTERNAL" ), makeSymbol( "HTML-QUIT" ), makeSymbol( "TVA-RETURN-ONE-ANSWER?" ), makeSymbol( "GET-SBHL-MODULE-PROPERTIES" ),
      makeSymbol( "CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS" ), makeSymbol( "CLEAR-GET-TREATED-CONDITION" ), makeSymbol( "FIND-ALL-AURA-CONCEPTS" ), makeSymbol( "CLEAR-MWP-BASE-PRED-OF-POS" ), makeSymbol(
          "LEVIATHAN-HAYSTACK-ALL-ALLOWED-RULES" ), makeSymbol( "SBHL-GOAL-SEARCH-P" ), makeSymbol( "ENSURE-SPEECH-PARTS-INITIALIZED" ), makeSymbol( "COLLECTION-INTERSECTION-GENLS-RULE-SUPPORT" ), makeSymbol(
              "ENSURE-REFORMULATOR-INITIALIZED" ), makeSymbol( "RC-NEW-RHS" ), makeSymbol( "SBHL-CURRENT-TEMPORAL-NODE-NOT-YET-CONSIDERED-P" ), makeSymbol( "API-OUTPUT-PROTOCOL" ), makeSymbol( "TERMPARAPHRASEFN-PP" ),
      makeSymbol( "CYCLIFY-TEST" ), makeSymbol( "BESTVERBFORMFORSUBJECTFN" ), makeSymbol( "GC-EPHEMERAL" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-8" ), makeSymbol( "SET-WORDNET-KB-LOADED" ), makeSymbol(
          "NO-CYC-TESTS-DEFINED?" ), makeSymbol( "CLEAR-ISA-DEPENDENT-CACHES-INTERNAL" ), makeSymbol( "CB-PRECISION-SUGGESTOR-STALE-PAGE-SUBMITTED" ), makeSymbol( "CLEAR-RULE-AFTER-ADDINGS" ), makeSymbol(
              "TMS-CAN-KILL-FORTS-FOR-ME?" ), makeSymbol( "CLEAR-TERM-LEARNER-FACT-STATUS-INT" ), makeSymbol( "ALL-CORE-UNION-CONSTANTS" ), makeSymbol( "CLEAR-GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED" ),
      makeSymbol( "XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION" ), makeSymbol( "SET-DEFAULT-HB-ICON" ), makeSymbol( "KBS-CLEAR-EXTENT" ), makeSymbol( "CLEAR-FORWARD-INFERENCE-METRICS" ), makeSymbol( "WITHIN-QUERY?" ),
      makeSymbol( "CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE" ), makeSymbol( "UNINITIALIZED" ), makeSymbol( "RESTART-CONSOLE-TASK-PROCESSORS" ), makeSymbol( "GET-BUG-AVOIDANCE-PRINCIPLES" ), makeSymbol(
          "STOP-FACT-SHEET-UPDATES-AFTER-CURRENT-TERM" ), makeSymbol( "ANY-RECENT-ASKED-QUERIES?" ), makeSymbol( "CLEAR-PPH-PHRASE-ID-DEMERITS" ), makeSymbol( "ADDITIONAL-NAT-FUNCTION-SUPPORTS" ), makeSymbol(
              "PROVIDE-WFF-SUGGESTIONS?" ), makeSymbol( "INITIALIZE-ALL-SYSTEMS" ), makeSymbol( "FACT-SHEET-BASE-URL-PLACEHOLDER" ), makeSymbol( "AMP-DEMO" ), makeSymbol( "KBQ-DEFAULT-DEFINING-MT" ), makeSymbol(
                  "SERIALIZE-SHARED-STRUCTURE-INDEX" ), makeSymbol( "JAVA-BACKEND-INITIALIZER-METHODS" ), makeSymbol( "INITIALIZE-MIN-ARITIES" ), makeSymbol( "RKF-IRRELEVANT-CACHE-SUPPORTS-THCL?" ), makeSymbol(
                      "MOST-RECENT-FAILING-CYC-TESTS" ), makeSymbol( "BOGUSLY-LEXIFIED-TERMS" ), makeSymbol( "NEW-GUID" ), makeSymbol( "KB-INDEXING-DECLARATION-STORE" ), makeSymbol(
                          "INITIALIZE-C-BACKEND-FUNCTION-BOOLEAN-HASH" ), makeSymbol( "AUTO-INCREMENT-KB" ), makeSymbol( "RUN-SCHEDULED-QUERIES" ), makeSymbol(
                              "CLEAR-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED" ), makeSymbol( "ALL-PREDS-ARE-RELEVANT?" ), makeSymbol( "GEN-TEMPLATE-STORE-PRESENT-P" ), makeSymbol( "DEFN-COLLECTION" ),
      makeSymbol( "REMOVE-LEADERS-TO-GROUPS" ), makeSymbol( "MAKE-STATIC-CLAUSE-STRUC" ), makeSymbol( "INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES" ), makeSymbol( "CLEAR-CACHED-GET-RESULT-SET-FROM-SQL-SOURCE" ), makeSymbol(
          "INITIALIZE-LEXICON-LOOKUP-MT" ), makeSymbol( "ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?" ), makeSymbol( "BESTPARENTHETICALPHRASEFN" ), makeSymbol( "INITIALIZE-COLLECTION-LOCAL-QUOTED-INSTANCE-CARDINALITIES" ),
      makeSymbol( "CLEAR-PSP-PHRASE-TYPES" ), makeSymbol( "MAKE-MULTIBINDING" ), makeSymbol( "CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS" ), makeSymbol(
          "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT" ), makeSymbol( "CLEAR-WNI-DERIVED-FORMS-HELPER" ), makeSymbol( "NEW-CONSTANT-COUNT" ), makeSymbol( "CLEAR-QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY" ), makeSymbol(
              "GET-SBHL-LINK-MT" ), makeSymbol( "WNI-ACCESS-PATH-SUBPROTOCOL" ), makeSymbol( "CYC-ANNOTATION-BASE-URI" ), makeSymbol( "ROLL-LOCAL-TRANSCRIPT" ), makeSymbol( "CURRENT-COMPLEX-INDEX-TERM" ), makeSymbol(
                  "SINGLE-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO" ), makeSymbol( "SCOPE-KBS-SPLICING-ASSERTIONS" ), makeSymbol( "SXSW-ALL-BANDS-REQUEST" ), makeSymbol( "MACHINE-BOGOMIPS" ), makeSymbol(
                      "NOTE-MWP-NEEDS-REINITIALIZATION" ), makeSymbol( "CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED" ), makeSymbol( "COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT-INTERNAL" ),
      makeSymbol( "FIND-OR-CREATE-PPH-MEMOIZATION-STATE" ), makeSymbol( "CB-USE-ASSERTION-END-DATE-FILTER" ), makeSymbol( "CLEAR-GENLS-GRAPH" ), makeSymbol( "CNC-POPCORN-MINIMUM" ), makeSymbol( "PPH-GENERIC-POS-PREDS" ),
      makeSymbol( "L2R-SENTENCE-NUMBER-INDEXICAL-INTERNAL" ), makeSymbol( "SYSTEM-CODE-LISP-INITIALIZATIONS" ), makeSymbol( "VALID-SBHL-P" ), makeSymbol( "CREATE-CLAUSE-STRUC-DUMP-ID-TABLE" ), makeSymbol(
          "NEXT-SCHEDULED-QUERY" ), makeSymbol( "RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?" ), makeSymbol( "PROCESS-TMS-KB-HL-SUPPORT-QUEUE" ), makeSymbol( "NEXT-LEXICON-ENTRY" ), makeSymbol( "READ-TRANSCRIPT" ), makeSymbol(
              "STASH-INFERENCE-VARS" ), makeSymbol( "CLEAR-QUA-ALL-PHRASES-FOR-TERM" ), makeSymbol( "FIX-BAD-NARTS" ), makeSymbol( "INITIALIZE-REFORMULATOR" ), makeSymbol( "TENSEDPHRASEFN-DEFAULTPAST" ), makeSymbol(
                  "PROCESS-LOCAL-OPERATIONS?" ), makeSymbol( "HTML-DISPLAY-NODE-RENDERING-COLORMAP" ), makeSymbol( "CLEAR-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED" ), makeSymbol( "NEXT-SCHEDULED-QUERY" ),
      makeSymbol( "WITHIN-ABNORMALITY-CHECKING?" ), makeSymbol( "NL-REFORMULATE-DAEMON-RUN" ), makeSymbol( "INIT-STARTS-DURING" ), makeSymbol( "END-TASK-PROCESSOR-LOGGING-TO-FILE" ), makeSymbol( "INVALID-EVALUATION" ),
      makeSymbol( "REBUILD-PPH-PHRASES" ), makeSymbol( "CLEAR-PPH-JAVALIST-SORT-XYZ-PARAPHRASES" ), makeSymbol( "CLEAR-QUERY-LIBRARY-ROOT-FOLDER" ), makeSymbol( "UNSTASH-OTHER-VARS-5" ), makeSymbol(
          "VALID-HASH-TEST-SYMBOLS" ), makeSymbol( "CLEAR-MAX-PREDS-OF-POS" ), makeSymbol( "SETUP-VARIABLE-TABLE" ), makeSymbol( "INITIALIZE-ASSERTION-HL-STORE-CACHE" ), makeSymbol( "THIS-YEAR" ), makeSymbol(
              "GEN-TEMPLATE-STORE-REVISIONS-STALE?-INTERNAL" ), makeSymbol( "CLEAR-QUERY-SEARCH-TABLE-PREDS" ), makeSymbol( "GENL-MTS-ARE-RELEVANT?" ), makeSymbol( "LOADED-RDF-GRAPHS" ), makeSymbol(
                  "TVA-COMPUTE-JUSTIFICATIONS?" ), makeSymbol( "DEFAULT-LINKAGE-CREATION-RULES" ), makeSymbol( "FINALIZE-CAE-QUERY-TRANSLATION" ), makeSymbol( "REMOVAL-LINK-HISTORICAL-COUNT" ), makeSymbol(
                      "SET-PARAPHRASE-KB-LOADED" ), makeSymbol( "JAVA-BACKEND-COMPUTE-PACKAGE-PREFIX" ), makeSymbol( "PSP-AGENT" ), makeSymbol( "RKF-UTTRDR-FULL-SPANS-ONLY?" ), makeSymbol( "INITIALIZE-NAME-TITLES" ),
      makeSymbol( "INIT-TEMPORALLY-STARTED-BY" ), makeSymbol( "GET-NART" ), makeSymbol( "LEVIATHAN-KB-CONTENT-ALLOWED-RULES" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-13" ), makeSymbol(
          "CLEAR-CAE-QUERY-SEARCH-FILTER-STRING" ), makeSymbol( "GET-WS-INDEX-PORT" ), makeSymbol( "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS" ), makeSymbol( "CLEAR-CACHED-MAX-FLOOR-MTS-OF-NAT" ), makeSymbol(
              "DELAYED-PROCESSOR-META-DAEMON-RUN" ), makeSymbol( "GENERIC-REMOVAL-MODULES" ), makeSymbol( "ARETE-DISABLE-GLOBAL-LOGGING" ), makeSymbol( "SBHL-VERIFY-NAUT-MT-RELEVANCE-P" ), makeSymbol(
                  "VALID-CFASL-RELOC-SIDE-STREAM-P" ), makeSymbol( "INITIALIZE-KB-CONTENT-LEVIATHAN-QUERIES" ), makeSymbol( "KBS-SKOLEMS" ), makeSymbol( "MODERNIZE-SKOLEM-AXIOM-TABLE" ), makeSymbol(
                      "NEW-INVALID-DEDUCTION-ITERATOR" ), makeSymbol( "PREPARE-PROOF-QUERY-PROPERTIES" ), makeSymbol( "REMOVE-ASSERTIVE-WFF-RULES-CACHED" ), makeSymbol( "GET-ALL-MT-VECTORS" ), makeSymbol(
                          "REMOVE-GET-SBHL-PREDICATES" ), makeSymbol( "CLEAR-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT" ), makeSymbol( "INITIALIZE-NL-GENERATION-CACHES" ), makeSymbol( "CURRENT-QUERY-ALLOWS-NEW-TERMS?" ),
      makeSymbol( "GET-TASK-PROCESSOR-VERBOSITY" ), makeSymbol( "GET-KBS-PRERUN-FNS" ), makeSymbol( "CLEAR-TERM-LEARNER-TYPE-PROMPT" ), makeSymbol( "FIND-OR-CREATE-PPH-CONTEXT" ), makeSymbol(
          "COMPILE-DEFAULT-XSD-ATTRIBUTE-LIST" ), makeSymbol( "BLAST-KE-STATE" ), makeSymbol( "CLEAR-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED" ), makeSymbol( "CLEAR-PPH-INDEXICAL-DATES" ), makeSymbol(
              "INIT-ENDS-AFTER-ENDING-OF" ), makeSymbol( "CB-TOTAL-SPECIFIC-REMOVAL-MODULE-COUNT" ), makeSymbol( "CB-PARTITION-LOAD-GUTS" ), makeSymbol( "CYC-SECURE-KB-LOADED-P" ), makeSymbol(
                  "INITIALIZE-C-BACKEND-FUNCTION-NAME-TABLE" ), makeSymbol( "CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES" ), makeSymbol( "INITIALIZE-SEMANTIC-ETL-INFRASTRUCTURE" ), makeSymbol(
                      "INITIALIZE-NL-TRIE-OTHER-PREDICATES" ), makeSymbol( "PPH-DETP-NART-CACHED-INTERNAL" ), makeSymbol( "ILP-TERM-EXPORT-NEGATIVE-EXAMPLES?" ), makeSymbol( "PERFORM-KB-CLEANUPS" ), makeSymbol(
                          "UNSTASH-INFERENCE-VARS-8" ), makeSymbol( "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE" ), makeSymbol( "LEXICON-INITIALIZED-P" ), makeSymbol( "CLEAR-GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED" ),
      makeSymbol( "INITIALIZE-HALO-LEVIATHAN-QUERIES" ), makeSymbol( "GET-RED-APPLICATION-ELEMENTS" ), makeSymbol( "NCP-INITIALIZE-METRICS" ), makeSymbol( "GENERIC-REMOVAL-MODULES" ), makeSymbol(
          "COLLECTION-CREATION-TEMPLATE" ), makeSymbol( "COUNTRIES-TO-REGIONS" ), makeSymbol( "CLEAR-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol( "GET-FILE-BACKED-NART-ID-THRESHOLD" ),
      makeSymbol( "CB-KB-QUERY-SHOW-PRAGMATICS" ), makeSymbol( "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE" ), makeSymbol( "CLEAR-ICON-RELATIVE-PATH-FOR-SOURCE" ), makeSymbol(
          "START-BLUE-EVENT-DISPATCHER" ), makeSymbol( "SAVE-LOCAL-OPERATIONS" ), makeSymbol( "GET-KB-UNREPRESENTED-TERM-OLD-SPACE-SIZE" ), makeSymbol( "RED-STRUCT-CREATE" ), makeSymbol( "CLEAR-SOAP-EXPANDED-NAME" ),
      makeSymbol( "REMOVE-FACT-SHEET-IMAGE-FILE-ROOT-URL" ), makeSymbol( "CLEAR-QUOTED-FORMULA-ARG-INT?" ), makeSymbol( "RL-MODULE-STORE" ), makeSymbol( "ARGHASH-TYPES" ), makeSymbol(
          "CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME" ), makeSymbol( "SBHL-SUSPEND-NEW-SPACES?" ), makeSymbol( "NEW-PROBLEM-STORE-ID" ), makeSymbol( "CLEAR-KEY-GAF-ARG-INDEX-CACHED" ), makeSymbol(
              "CLEAR-RKF-PREPOSITION-STRING?" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-5" ), makeSymbol( "RECEIVING?" ), makeSymbol( "RELATION-ALL-COLLECTION-COST-ESTIMATE" ), makeSymbol(
                  "SIMPLIFY-TRANSITIVE-REDUNDANCIES?" ), makeSymbol( "RANDOM-VARIABLE" ), makeSymbol( "CLEAR-CACHED-GET-RESULT-SET-FROM-SQL-SOURCE" ), makeSymbol( "GEN-TEMPLATE-STORE-LENGTH-SANE?" ), makeSymbol(
                      "WITH-TIMEOUT-MAKE-TAG" ), makeSymbol( "CYC-TEST-WRITE-IMAGE-DIRECTORY" ), makeSymbol( "PARTITION-FORTS" ), makeSymbol( "PROCESS-BLOCK" ), makeSymbol( "L2R-SUPERTEXT-INDEXICAL-INTERNAL" ),
      makeSymbol( "ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES?" ), makeSymbol( "SM-NEW-MERGE-INFO" ), makeSymbol( "DEFAULT-PREFERENCE-FILE-EXISTS?" ), makeSymbol( "NART-HL-FORMULA-COMPLETELY-CACHED?" ), makeSymbol(
          "CB-SHOW-NL-TRIE-GET-STARTING-ENTRY-SPECIFICATION" ), makeSymbol( "OWL-MERGE-MT" ), makeSymbol( "GOOGLE-STATUS" ), makeSymbol( "RKF-UTTRDR-FULL-SPANS-ONLY?" ), makeSymbol( "TEMP-DIRECTORY" ), makeSymbol(
              "DERIVED-PREDS" ), makeSymbol( "CLEAR-COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT" ), makeSymbol( "LOAD-REMOTE-OPERATIONS" ), makeSymbol( "PREPARE-KB-MINI-DUMP" ), makeSymbol(
                  "CYCL-PATCH-NUMBER" ), makeSymbol( "CONDITIONALPHRASEFN" ), makeSymbol( "HTML-INPUT-CHECKED" ), makeSymbol( "WNI-ACCESS-PATH-PROXY-SERVER" ), makeSymbol( "KB-HL-SUPPORT-CONTENT-INDEX-MEMORY-MAPPED?" ),
      makeSymbol( "CB-ALL-FORWARD-MODULES" ), makeSymbol( "CB-KCT-STATUS-TABLE-HEADER" ), makeSymbol( "RKF-ADDRESSEE" ), makeSymbol( "CB-JAVA-APPLET-TUNNEL-CREATE-LOGIN" ), makeSymbol(
          "REMOVE-FACT-SHEET-DEFAULT-LANGUAGE-MT" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-12" ), makeSymbol( "WITHIN-QUERY?" ), makeSymbol( "CLEAR-INDIVIDUAL?-CACHED" ), makeSymbol( "NON-WFF-COUNT" ), makeSymbol(
              "CLEAR-FOAF-NAME" ), makeSymbol( "RESTART-ALL-TCP-SERVERS" ), makeSymbol( "CLEAR-BAD-FOR-TAGGING?" ), makeSymbol( "FET-EMPTY-SOURCE-DICTIONARY" ), makeSymbol( "GRAMMAR-PERMISSIVE-WRT-VARIABLES?" ),
      makeSymbol( "REMOVE-NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS" ), makeSymbol( "GET-SBHL-JUST-BEHAVIOR" ), makeSymbol( "CB-KB-QUERY-WARN-OF-EXTRA-MT" ), makeSymbol( "BYTE-ORDER-MARK" ), makeSymbol(
          "UNSTASH-OTHER-VARS-5" ), makeSymbol( "SKSI-BREAK-ON-ERRORS" ), makeSymbol( "REBUILD-ASSERTION-INDEXING-FOR-RECONNECT" ), makeSymbol( "SKSI-SUPPORTED-MT-BROWSING-REGISTERED?" ), makeSymbol(
              "BESTSYMBOLPHRASEFN" ), makeSymbol( "COUNT-NEW-ASSERTIONS" ), makeSymbol( "CLEAR-NAMED-ENTITY?" ), makeSymbol( "WNI-ACCESS-PATH-PROXY-SERVER" ), makeSymbol( "UNSTASH-INFERENCE-VARS" ), makeSymbol(
                  "CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED" ), makeSymbol( "CLEAR-DET-DENOT-IS-SCALAR-INTERVAL?-CACHED" ), makeSymbol( "INITIALIZE-KB-FEATURES" ), makeSymbol( "INITIALIZE-KBS-DEFINITIONAL-RULE-TABLE" ),
      makeSymbol( "CURRENT-SYSTEM-TRANSLATION" ), makeSymbol( "RESET-ARC-LEXICON-SLURPER" ), makeSymbol( "CT-CR-SETUP" ), makeSymbol( "LEXICON-KB-LOADED-P" ), makeSymbol( "MAKE-EMPTY-UI-REQUEST" ), makeSymbol(
          "CLEAR-NART-TABLE" ), makeSymbol( "NEW-RKF-SD-RULE-INFO-SCORE" ), makeSymbol( "RESET-COHERENCE-VIOLATIONS" ), makeSymbol( "CLEAR-TERMS-FOR-PUBLIC-FACT-SHEETS" ), makeSymbol( "CB-KB-QUERY-SHOW-SENTENCE" ),
      makeSymbol( "SBHL-TEMPORALITY-DATE-SUCCESSION" ), makeSymbol( "CLEAR-PREDS-OF-STRING&WORD" ), makeSymbol( "CLEAR-SXHASH-EXTERNAL-CONSTANT" ), makeSymbol( "TASK-PROCESSOR-HANDLER" ), makeSymbol(
          "WITHIN-ABNORMALITY-CHECKING?" ), makeSymbol( "UNDEFINE-ALL-CYC-TESTS" ), makeSymbol( "NEW-SBHL-CACHE" ), makeSymbol( "DOLLAR-SIGN-PLUS-NUMBER-FST" ), makeSymbol( "CLOSED-QUERY-SUCCESS-TOKEN" ), makeSymbol(
              "SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR-INITIAL-STATE" ), makeSymbol( "INITIALIZE-FILE-VECTOR-BACKED-MAP" ), makeSymbol( "CLEAR-VIRTUAL-ASSERTION-COUNT" ), makeSymbol( "ANY-TIME-IS-RELEVANT?" ),
      makeSymbol( "NEW-PPH-DISCOURSE-CONTEXT" ), makeSymbol( "HTML-COPYRIGHT-NOTICE" ), makeSymbol( "BASIC-AJAX-SCRIPTS" ), makeSymbol( "CREATE-NART-DUMP-ID-TABLE" ), makeSymbol( "CLEAR-BYTE-ORDER-MARK" ), makeSymbol(
          "API-QUIT" ), makeSymbol( "CLEAR-PROPRIETARY-TERM?" ), makeSymbol( "NEW-CONSTANTS-ITERATOR" ), makeSymbol( "RESET-NAT-ISA-LINKS" ), makeSymbol( "PPH-CURRENT-PRECISION" ), makeSymbol( "GENL-RULES-ENABLED?" ),
      makeSymbol( "API-INPUT-PROTOCOL" ), makeSymbol( "INDEXICAL-THE-PURPOSE" ), makeSymbol( "RESET-ALL-FILE-BACKED-CACHES" ), makeSymbol( "GET-DEDUCTION" ), makeSymbol( "ARETE-ENABLE-GLOBAL-LOGGING" ), makeSymbol(
          "CLEAR-EXTERNAL-SOURCE-ACCESS-PATH-CACHE" ), makeSymbol( "RESET-JAVA-API-KERNEL" ), makeSymbol( "NEW-KBS-PRETTY-STRING-FORT-ITERATOR" ), makeSymbol( "NEXT-KCT-THINKING-ID" ), makeSymbol(
              "CLEAR-PPH-STRING-FROM-UTF8-STRING" ), makeSymbol( "CLEAR-LEXICONS-TO-LANGUAGES" ), makeSymbol( "CYCLIFY-TEST" ), makeSymbol( "LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol(
                  "UNSTASH-KB-OBJECT-CONTENT-VARS-8" ), makeSymbol( "CLEAR-TASK-ALLOWS-UNKNOWN-SENTENCE" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS" ), makeSymbol( "CLEAR-RDF-GRAPH-INDEX-SUB-INDEXES" ), makeSymbol(
                      "CURRENT-FORWARD-INFERENCE-ENVIRONMENT" ), makeSymbol( "INITIALIZE-OCTANT-LOCATIONS" ), makeSymbol( "PERFORMING-FORWARD-INFERENCE?" ), makeSymbol( "CB-FAST?" ), makeSymbol( "LOCAL-QUEUE-DEQUEUE" ),
      makeSymbol( "KB-HL-SUPPORT-COUNT" ), makeSymbol( "REFORMULATOR-VARIABLES-INITIALIZED?" ), makeSymbol( "CLEAR-MAX-GEN-TEMPLATE-PHRASE-ID" ), makeSymbol( "GRAMMAR-PERMISSIVE-WRT-VARIABLES?" ), makeSymbol(
          "USE-RULE-SET?" ), makeSymbol( "CLEAR-RKF-PREPOSITION-STRING?" ), makeSymbol( "PERFORM-LIMITATION-MOTIVATED-POST-IDENTIFY-CLEANUPS" ), makeSymbol( "CONFIGURE-APP-COLORS" ), makeSymbol(
              "SHOW-HISTORICAL-INFORMATION" ), makeSymbol( "KBQ-CFASL-COMMON-SYMBOLS-SIMPLE" ), makeSymbol( "CLEAR-GENL-INVERSE-GRAPH" ), makeSymbol( "CLEAR-AT-ARGN-INT-CACHED" ), makeSymbol(
                  "DEFAULT-RELATION-TAGGING-DOMAIN-MT" ), makeSymbol( "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES" ), makeSymbol( "DEDUCTION-USAGE-COUNTS-ENABLED-P" ), makeSymbol( "CB-C-GAF-ARG-USE-BINARY?" ), makeSymbol(
                      "INITIALIZE-CB-RTV-PREDICATES" ), makeSymbol( "KCT-ALL-THINKINGS" ), makeSymbol( "CANDIDATE-ASSERTION-FI-FORMULA" ), makeSymbol( "PROOF-HISTORICAL-COUNT" ), makeSymbol( "PPH-IDENTITY-TEMPLATE" ),
      makeSymbol( "CLEAR-PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT" ), makeSymbol( "CONSTANT-INDEX-DONT-MAINTAIN-USAGES-COUNTS" ), makeSymbol( "CURRENT-PROCESS" ), makeSymbol( "NEW-UNSPECIFIED-PPH-PRONOUN-AGR" ),
      makeSymbol( "INITIALIZE-JAVA-API-LEASE-MONITOR" ), makeSymbol( "STOP-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER" ), makeSymbol( "GET-NL-TRIE" ), makeSymbol( "RED-ORDERED-VAR-LIST" ), makeSymbol(
          "GHL-USES-SPEC-PREDS-P" ), makeSymbol( "EXTERNAL-NON-WFF-STORE-FILENAME" ), makeSymbol( "ASKED-QUERY-COMMON-SYMBOLS-SIMPLE" ), makeSymbol( "GET-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES" ), makeSymbol(
              "RELEVANT-DIRECTIONS" ), makeSymbol( "REINITIALIZE-LINKAGE" ), makeSymbol( "NEW-FORT-ID-INDEX" ), makeSymbol( "QUATERNARY-FET-EVALUATION-PRED" ), makeSymbol( "REBUILD-COMPUTABLE-BUT-NOT-DUMPABLE-YET" ),
      makeSymbol( "INITIALIZE-TVA-CACHES" ), makeSymbol( "SHOW-TRANSCRIPT-INFORMATION" ), makeSymbol( "IS-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED?" ), makeSymbol( "*TIME-POINT-SUBSUMED-RULE*-INITIALIZER" ), makeSymbol(
          "MAKE-ASSERTION-ID" ), makeSymbol( "FLUSH-KB-STORE-TRANSACTION" ), makeSymbol( "CLEAR-PPH-GENL-CATEGORY?" ), makeSymbol( "ILP-TERM-EXPORT-NEGATIVE-EXAMPLES?" ), makeSymbol( "GET-SCG-PARSER-CALLBACK-PORT" ),
      makeSymbol( "CLEAR-STRATEGY-TYPE-STORE" ), makeSymbol( "GET-HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE" ), makeSymbol( "CLEAR-IMPLAUSIBLE-ADMITTED-ARGUMENT?" ), makeSymbol( "GET-TRIE-ANCESTOR-TRACKING-VECTOR" ),
      makeSymbol( "PPH-DEFAULT-VAR-TYPE" ), makeSymbol( "REMOVE-PPH-INDEXICAL-DATES" ), makeSymbol( "CLEAR-CACHED-ALL-GENL-MTS" ), makeSymbol( "CB-OPTIONS-SUBMIT-BAR" ), makeSymbol( "OWL-EXPORT-DEFAULT-NAMESPACE" ),
      makeSymbol( "PPH-LEXIFICATION-PREDS-INTERNAL" ), makeSymbol( "TERMPARAPHRASEFN-CONSTRAINED" ), makeSymbol( "LATEST-INFERENCE" ), makeSymbol( "NEW-GUID" ), makeSymbol( "INITIALIZE-NL-TRIE-SUBWORD-CACHES" ),
      makeSymbol( "ALL-INFERENCE-EVENT-PROPERTIES" ), makeSymbol( "KILL-NAKED-PROTOTYPICALS" ), makeSymbol( "LOCAL-TRANSCRIPT" ), makeSymbol( "CB-MYCREATIONPURPOSE-FILTER" ), makeSymbol( "CLEAR-RUN-CNC-QUERY" ),
      makeSymbol( "ALL-QUERY-STATIC-PROPERTIES" ), makeSymbol( "STRATEGY-POSSIBLY-UN-NOTE-UNINTERESTINGNESS-EXPLANATION" ), makeSymbol( "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-LIB" ), makeSymbol(
          "RUN-ONE-LOCAL-OP-IN-AGENDA" ), makeSymbol( "GET-TAGGER" ), makeSymbol( "REMOVAL-MODULES" ), makeSymbol( "INITIALIZE-ALL-MTS-SBHL-CACHES" ), makeSymbol( "GET-ALL-SDS" ), makeSymbol(
              "UNSTASH-KB-OBJECT-CONTENT-VARS-10" ), makeSymbol( "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-INTERNAL" ), makeSymbol( "REMOVE-CACHED-LOAD-ALL-HAYSTACKS" ), makeSymbol( "NEW-SBHL-NULL-ITERATOR" ), makeSymbol(
                  "MISSING-ASSERTION-ID-SET" ), makeSymbol( "CLEAR-CLAUSE-STRUC-TABLE" ), makeSymbol( "PPH-QUANTIFIER-KEYWORDS" ), makeSymbol( "LOAD-COMPUTABLE-KB-INITIALIZATIONS" ), makeSymbol(
                      "NEW-ALEXANDRIA-ALL-CONSTANTS-ITERATOR" ), makeSymbol( "RESET-OLD-DEFNS-ADMIT?-METERS" ), makeSymbol( "VALID-DIRECTIONS" ), makeSymbol( "INIT-SPPS-TO-NL-NUMBERS" ), makeSymbol(
                          "CLEAR-IS-ABBREVIATION-PREDICATE" ), makeSymbol( "CYC-CGI-URL-INT" ), makeSymbol( "RTP-VBAR-TEMPLATES-CACHED" ), makeSymbol( "PPH-NEW-PARAMETER-SNAPSHOT" ), makeSymbol(
                              "NEW-KB-HL-SUPPORT-CONTENT" ), makeSymbol( "CLEAR-CHARNIAK-PARSE" ), makeSymbol( "GET-TRIE-ANCESTOR-TRACKING-VECTOR" ), makeSymbol( "DEEPAK-QUERIES-TIMING-TEST" ), makeSymbol(
                                  "MAKE-CYC-ANNOTATION-ENTITY-MAP" ), makeSymbol( "STASH-KB-INDEXING-VARS" ), makeSymbol( "FTS-INIT-VIA-RMP-GAFS" ), makeSymbol( "MAYBE-INITIALIZE-PPH-GENERATION-PREDS" ), makeSymbol(
                                      "UNSTASH-KB-OBJECT-CONTENT-VARS-5" ), makeSymbol( "CB-MYCREATIONPURPOSE-FILTER" ), makeSymbol( "WNI-NO-SYNSETS-FOR-MATCHING" ), makeSymbol(
                                          "LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY" ), makeSymbol( "KBS-STATE-VALID?" ), makeSymbol( "POSSIBLY-CLEAR-DUMPABLE-KB-STATE-HASHES" ), makeSymbol( "NON-TRIE-SUBWORD-PREDS" ),
      makeSymbol( "INITIALIZE-CAE-QUERY-TRANSLATION" ), makeSymbol( "DESTROY-DUPLICATE-KB-HL-SUPPORTS" ), makeSymbol( "WITHIN-GENERIC-PREFERENCE-ANALYSIS?" ), makeSymbol( "ENSURE-EVENT-HIERARCHY" ), makeSymbol(
          "NGA-ACCESS-PATH" ), makeSymbol( "CLEAR-CACHED-CREATOR" ), makeSymbol( "CLEAR-LOCAL-QUEUE" ), makeSymbol( "CLEAR-OWL11-NAME" ), makeSymbol( "SET-QUANT-KB-LOADED" ), makeSymbol(
              "SKSI-SMT-GET-UNITS-OF-MEASUREMENT" ), makeSymbol( "CLEAR-SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN" ), makeSymbol( "CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?" ), makeSymbol( "DESTROY-ALL-INFERENCES" ),
      makeSymbol( "IS-PROOF-SPEC-STORE-AVAILABLE?" ), makeSymbol( "RESET-RKF-IRRELEVANT-FORT-CACHE" ), makeSymbol( "CLEAR-SKSI-GET-DATUM-VAR" ), makeSymbol( "CLEAR-USER-PREFERENCES" ), makeSymbol(
          "CLEAR-VARIABLE-ORDER-COLLECTION?" ), makeSymbol( "SBHL-JUSTIFICATION-ASSEMBLED-P" ), makeSymbol( "INITIALIZE-ACCESS-PATH-MAP" ), makeSymbol( "ABORT-AND-RESTART-AGENDA" ), makeSymbol( "RBP-VOCABULARY-MTS" ),
      makeSymbol( "CLEAR-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED" ), makeSymbol( "CLEAR-CLOSED-LEXICAL-CLASSES" ), makeSymbol( "HERALD-START" ), makeSymbol( "CLEAR-RDF-GRAPH-GET-BLANK-NODE-CACHED" ), makeSymbol(
          "ALL-SYSTEM-PARAMETERS" ), makeSymbol( "ALL-FORTS" ), makeSymbol( "DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES" ), makeSymbol( "RBP-RULE-COUNT" ), makeSymbol( "GLOBAL-FORWARD-INFERENCE-TO-DO?" ), makeSymbol(
              "SBHL-CACHE-TUNING-EXPERIMENT-PROLOGUE" ), makeSymbol( "HANDLING-PPH-METHOD-FAILURES-P" ), makeSymbol( "MISSING-OLD-DEDUCTION-IDS" ), makeSymbol( "ACRONYM-PREDICATES" ), makeSymbol(
                  "CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE" ), makeSymbol( "FORMAT-NIL-PERCENT" ), makeSymbol( "BENCHMARK-CYCLOPS-CREATE-ONTOLOGY" ), makeSymbol( "NOTE-GEN-TEMPLATE-STORE-INITIALIZED" ), makeSymbol(
                      "CLEAR-PLACE-TIGHTENING-LEXICON" ), makeSymbol( "CLEAR-ASSERTION-TABLE" ), makeSymbol( "SYSTEM-CODE-LISP-INITIALIZATIONS" ), makeSymbol( "MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT" ),
      makeSymbol( "DONT-MAINTAIN-NART-INDEX-USAGE-COUNTS" ), makeSymbol( "REFORMULATOR-KB-LOADED-P" ), makeSymbol( "NL-FORT-GENERATION-TASK-SUCCESS-CODE" ), makeSymbol( "KCT-INITIALIZE" ), makeSymbol(
          "INITIALIZE-POS-TAGS" ), makeSymbol( "ALL-KBS-DEFINITIONAL-PREDICATES" ), makeSymbol( "CLEAR-DERIVED-PREDS" ), makeSymbol( "INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES" ), makeSymbol( "UNSTASH-OTHER-VARS-12" ),
      makeSymbol( "KE-CHECK-FORMS-TO-EVAL" ), makeSymbol( "CLEAR-SIMPLE-SKSI-TERMS" ), makeSymbol( "INTERRUPT-INITIAL-PROCESS" ), makeSymbol( "CLEAR-GENL-PREDICATE-GRAPH" ), makeSymbol( "WFF-CONSTRAINT-MT" ), makeSymbol(
          "INITIALIZE-RKF-KB-FEATURE" ), makeSymbol( "COMPLETE-KNOWLEDGE-SOURCES" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE" ), makeSymbol( "WORD-STRINGS-FN" ), makeSymbol(
              "REFORMULATOR-RULE-SPEC-PREDS" ), makeSymbol( "JAVA-BACKEND-FUNCTION-CALL-REST-ARITY-STATS" ), makeSymbol( "CLEAR-WNI-VERB-FRAMES-FOR-WORD" ), makeSymbol( "GET-ALL-SBHL-MODULE-LINK-PREDICATES" ),
      makeSymbol( "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-MTS" ), makeSymbol( "PPH-CURRENT-ARG0-SPECIFIED-P" ), makeSymbol( "RESET-NEC-DEFN-REJECTS?-METERS" ), makeSymbol( "CHECK-GEN-TEMPLATE-STORE-INITIALIZATION" ),
      makeSymbol( "CLEAR-INTER-CONSTRAINTS-FROM-RULE" ), makeSymbol( "CLEAR-TERM-LEARNER-LEXICAL-CACHES" ), makeSymbol( "UNSTASH-INFERENCE-VARS-6" ), makeSymbol( "RTP-VBAR-TEMPLATES-CACHED-INTERNAL" ), makeSymbol(
          "CYC-NL-FEATURE" ), makeSymbol( "CLEAR-PREFERRED-REWRITE-TERM" ), makeSymbol( "BIO-FILTER-COLL" ), makeSymbol( "SYSTEM-CODE-HL-INITIALIZATIONS" ), makeSymbol( "UNIFICATION-SUCCESS-HISTORICAL-COUNT" ),
      makeSymbol( "CLEAR-TERM-LEARNER-OBJECT-FROM-ID" ), makeSymbol( "TERM-CLASSIFICATION-TREE-MT" ), makeSymbol( "ASSERTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS" ), makeSymbol( "ASSERTIONS-WITH-META-ASSERTIONS-COUNT" ),
      makeSymbol( "UNSTASH-OTHER-VARS-2" ), makeSymbol( "RDF-PARSER-TEST-FILES" ), makeSymbol( "ALL-KB-MODAL-OPERATORS-INTERNAL" ), makeSymbol( "MUST-USE-STATIC-MEMORY-FOR-NL-TRIE" ), makeSymbol(
          "GET-SEMTRANS-LEXICON" ), makeSymbol( "DO-INITIALIZE-GEN-TEMPLATE-STORE" ), makeSymbol( "PHRASE-SPECIFICATION-TIP" ), makeSymbol( "CLEAR-PPH-ENHANCED-DOMAIN-MT" ), makeSymbol( "ALEPH-INDUCTION-FILESET-NAME" ),
      makeSymbol( "CLEAR-QUERY-LIBRARY-DEFAULT-MAX-TIME" ), makeSymbol( "STOP-ALL-HL-TRANSCRIPT-TRACES-TO-FILES" ), makeSymbol( "MAKE-STATIC-SEARCH-STRUC" ), makeSymbol( "FIND-OR-CREATE-PPH-PHRASE-COPY-STACK" ),
      makeSymbol( "CLEAR-TAXONOMY-SUPPRESSED-FACETS" ), makeSymbol( "FI-GET-WARNING-INT" ), makeSymbol( "GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE" ), makeSymbol( "NEW-SEMTRANS-LEXICON" ), makeSymbol(
          "CURRENT-AR-CONCEPT-GROUNDING-MAP" ), makeSymbol( "INIT-SME-LEXWIZ" ), makeSymbol( "LIST-DEF-RED-VARIABLES" ), makeSymbol( "NON-TRUE-ASSERTION-COUNT" ), makeSymbol( "DEDUCTION-MANAGER-ENABLE-MEMORY-MAPPING" ),
      makeSymbol( "PPH-GENERATE-ALTERNATIVE-PHRASES?" ), makeSymbol( "FI-GET-ERROR-STRING-INT" ), makeSymbol( "CLEAR-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE" ), makeSymbol( "POS-EVIDENCE-TABLES-INITIALIZED?" ),
      makeSymbol( "CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET" ), makeSymbol( "L2R-SENTENCE-STRING-NUMBER-INDEXICAL" ), makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" ), makeSymbol( "TEMPLATE-MTS" ), makeSymbol(
          "TEST-AES-DO-ORTHOGRAPHIC-CHANGES" ), makeSymbol( "LOCAL-TRANSCRIPT-HISTORY" ), makeSymbol( "INITIALIZE-KBS-FORT-TABLE" ), makeSymbol( "CB-PRECISION-SUGGESTOR-INITIAL-INFERENCE-STATE" ), makeSymbol(
              "UNIFICATION-SUCCESS-HISTORICAL-COUNT" ), makeSymbol( "CLEAR-PHRASE-NAUT-ARG" ), makeSymbol( "XML-CDATA-SUFFIX" ), makeSymbol( "TERMPARAPHRASEFN-CITYWITHCOUNTRYABBREVIATION" ), makeSymbol(
                  "UNSTASH-KB-OBJECT-CONTENT-VARS-12" ), makeSymbol( "SCHEDULED-QUERY-TEST-QUERY" ), makeSymbol( "CB-KB-QUERY-SHOW-PRAGMATICS" ), makeSymbol( "CORE-KB-FINISH-DEFINITIONS" ), makeSymbol(
                      "REBUILD-LEXICON-CACHE" ), makeSymbol( "REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS" ), makeSymbol( "EVERYTHING-PSC-DWIMMED-AWAY?" ), makeSymbol( "ALL-QUERY-PROPERTIES" ), makeSymbol(
                          "PUBLIC-FACT-SHEET-AD-HTML" ), makeSymbol( "CURRENTLY-EXECUTING-TACTICS" ), makeSymbol( "INITIALIZE-RULE-AFTER-ADDINGS-HASH" ), makeSymbol( "BESTLISTPARAPHRASEWITHSEPARATORFN-CONSTRAINED" ),
      makeSymbol( "CLEAR-RKF-SALIENT-GENERALIZATIONS" ), makeSymbol( "FI-ASK-STATUS" ), makeSymbol( "GET-QL-INDEX-ROOT-DIR-NAMES" ), makeSymbol( "ENSURE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-RUNNING" ),
      makeSymbol( "GET-SBHL-FORWARD-DIRECTED-DIRECTION" ), makeSymbol( "PPH-INFO-VECTOR-SLOTS" ), makeSymbol( "MODAL-STRINGS-INTERNAL" ), makeSymbol( "DEFAULT-NL-GENERATION-FORT-CACHE-PARAPHRASE-MT" ), makeSymbol(
          "GENERATE-XSD-EPILOGUE" ), makeSymbol( "REINDEX-ALL-KB-HL-SUPPORTS" ), makeSymbol( "CLEAR-MDW-GRAPH" ), makeSymbol( "RESET-RTP-COMPLETELY" ), makeSymbol( "NON-WFF-ASSERTION-IDS" ), makeSymbol(
              "UNSET-LEXICON-KB-LOADED" ), makeSymbol( "PPH-SUMMARY-MAX-SENTENCES-FOR-SAME-PRED" ), makeSymbol( "DEREGISTER-ALL-SKSI-REMOVAL-MODULES" ), makeSymbol( "UNSET-NL-KB-LOADED" ), makeSymbol(
                  "WIDE-DEDUCTION-HL-STORE-CACHE?" ), makeSymbol( "TOP-LEVEL-NL-PREDS" ), makeSymbol( "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER&TASK" ), makeSymbol( "SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT" ), makeSymbol(
                      "NEW-HTFILE-HEADER" ), makeSymbol( "GATHER-LOAD-PARTITION-MISSING-NARTS" ), makeSymbol( "SOMEWHERE-CACHE-UNBUILT?" ), makeSymbol( "GET-DEFAULT-SEARCH-ENGINE" ), makeSymbol( "RULE-SUGGESTION-MT" ),
      makeSymbol( "GET-RESOURCED-PPH-ENVIRONMENT-STACK" ), makeSymbol( "CLEAR-PREDS-OF-POS-CACHED" ), makeSymbol( "CHMOD-SAFE-TO-USE?" ), makeSymbol( "GET-KBS-INHERITED-STORES" ), makeSymbol(
          "PPH-STRING-FREQUENCIES-AVAILABLE?" ), makeSymbol( "HB-DISPLAY-SUPERIORS" ), makeSymbol( "GET-ALL-FORMULA-TEMPLATE-DEFINITION-TUPLES" ), makeSymbol( "CLEAR-HL-PROTOTYPE-STATISTICS" ), makeSymbol(
              "RKF-EVENT-DISPATCHER-RUNNING?" ), makeSymbol( "SET-TO-RECEIVING-EVERYTHING" ), makeSymbol( "INDEXICAL-FACT-SHEET-SENTENCE" ), makeSymbol( "OWL-EXPORTER-V2-VERSION-NUMBER" ), makeSymbol(
                  "RESET-QUOTED-NECESSARY-DEFNS-REJECT?-METERS" ), makeSymbol( "MOST-RECENT-FAILING-CYC-TEST-RUNS" ), makeSymbol( "NEW-PROBLEM-STORE-ID" ), makeSymbol( "SAVE-HL-TRANSCRIPT-OPS-INTERNAL" ), makeSymbol(
                      "CLEAR-FIND-STEM-MEMOIZED" ), makeSymbol( "GET-SBHL-CONSIDER-NODE-FN" ), makeSymbol( "CYC-DOCUMENTATION-TOC" ), makeSymbol( "INITIALIZE-LEXICON-FROM-KB" ), makeSymbol( "ALL-GENERIC-TEST-CASES" ),
      makeSymbol( "DO-POST-IDENTIFY-KBS-ASSERTIONS-FNS" ), makeSymbol( "RECONNECT-ENGLISH-GENERATION-FORT-CACHE" ), makeSymbol( "MAPPING-ANSWER-FOUND?" ), makeSymbol( "CURRENT-XREF-SYSTEM-MODULES" ), makeSymbol(
          "CSQL-SUPPORTS" ), makeSymbol( "SET-RED-SYMBOLS" ), makeSymbol( "DEFAULT-ABDUCTION-INFERENCE-PARAMETERS" ), makeSymbol( "HTML-POPUP-SCRIPT" ), makeSymbol( "COMPUTE-MISSING-OLD-NART-REMOTE-IDS" ), makeSymbol(
              "SF-NEW-STATE" ), makeSymbol( "CLEAR-CAE-DEFAULT-NL-DOMAIN-MT" ), makeSymbol( "GRSOS-REPEATED-ARGS?" ), makeSymbol( "CLEAR-GET-CODE-FOR-LANGUAGE" ), makeSymbol( "LOADED-RDF-GRAPH-COUNT" ), makeSymbol(
                  "STRATEGIC-HEURISTIC-INDEX" ), makeSymbol( "INTERRUPT-GENERIC-SEARCH" ), makeSymbol( "CLEAR-GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED" ), makeSymbol( "INIT-TEMPORAL-BOUNDS-SUBSUME" ), makeSymbol(
                      "GET-RED-VALUE-FOR-DEFAULT-JAVA-HOME" ), makeSymbol( "REMOVE-BAD-TERM-OF-UNIT-ASSERTIONS" ), makeSymbol( "MULTI-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT" ), makeSymbol(
                          "CACHED-DEDUCTION-COUNT" ), makeSymbol( "GET-QL-INDEX-PORT" ), makeSymbol( "CURRENTLY-EXECUTING-HL-STORAGE-MODULE" ), makeSymbol( "GET-ALL-FORMULA-TEMPLATE-TOPICS" ), makeSymbol(
                              "SKSI-DEFAULT-ERROR-HANDLING-MODE" ), makeSymbol( "NEW-PROBLEM-STORE-ID" ), makeSymbol( "INVALID-CONSTANT-NAMES" ), makeSymbol( "INIT-COTEMPORAL" ), makeSymbol(
                                  "CB-ALL-GENERIC-HL-STORAGE-MODULES" ), makeSymbol( "HL-STORAGE-MODULES" ), makeSymbol( "RECALCULATE-SKSI-REWRITE-INFO" ), makeSymbol( "CLEAR-STRINGLIST-ARGS-OF-PRED-CACHED" ),
      makeSymbol( "CURRENT-FORWARD-INFERENCE-GAF" ), makeSymbol( "DENOTATION-COUNT" ), makeSymbol( "CB-SERVER-STATUS-SYSTEM" ), makeSymbol( "CLEAR-GENL-INVERSE-GRAPH" ), makeSymbol( "SEMANTIC-INDEX-INITIALIZED?" ),
      makeSymbol( "POSSIBLY-INITIALIZE-OWL-EXPORT-STATE" ), makeSymbol( "COUNT-NEW-DEDUCTIONS" ), makeSymbol( "KBS-NART-COUNT" ), makeSymbol( "ALL-FACT-SHEET-UPDATE-TERM-PRIORITIZERS" ), makeSymbol(
          "CYC-SECURE-KB-LOADED-P" ), makeSymbol( "CLEAR-QUERY-LIBRARY-TEMPLATE-FORWARD-RULES" ), makeSymbol( "LOCAL-QUEUE-PEEK" ), makeSymbol( "CAUGHT-UP-ON-MASTER-TRANSCRIPT" ), makeSymbol(
              "CLEAR-ASSERTION-CONTENT-TABLE" ), makeSymbol( "SBHL-SEARCH-HAS-MULTIPLE-GOALS-P" ), makeSymbol( "REMEMBERING-PPH-AMBIGUOUS-STRINGS?" ), makeSymbol( "CLEAR-WNI-SYNSET-TERM-HELPER" ), makeSymbol(
                  "SORT-SUF-QUOTED-DEFN-CACHE" ), makeSymbol( "INITIALIZE-REFORMULATOR-VARIABLES" ), makeSymbol( "IS-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED?" ), makeSymbol( "NEW-FORWARD-INFERENCE-ENVIRONMENT" ),
      makeSymbol( "CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS" ), makeSymbol( "GET-SBHL-MAP-FUNCTION" ), makeSymbol( "CLEAR-SCG-LEXICAL-MT" ), makeSymbol( "CYC-MAINT-FEATURE" ), makeSymbol(
          "GET-ALL-DEFAULT-WFF-CHECKING-MTS" ), makeSymbol( "CLEAR-SUF-QUOTED-DEFNS" ), makeSymbol( "GNDB-ACCESS-PATH" ), makeSymbol( "CSS-KEYWORDS" ), makeSymbol( "CLEAR-CACHED-LEXICAL-ACCESS-FUNCTIONS" ), makeSymbol(
              "SKSI-CLOSE-RESOURCED-CONNECTIONS" ), makeSymbol( "GET-SBHL-SEARCH-TYPE" ), makeSymbol( "TEST-IPC-ENQUEUE-DRAIN" ), makeSymbol( "JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P" ), makeSymbol(
                  "CLEAR-SCHEDULED-QUERY-QUEUE" ), makeSymbol( "PERFORM-RESEARCH-CYC-LOAD-FINALIZATIONS" ), makeSymbol( "RESET-UNCACHE-SUF-QUOTED-DEFN-METERS" ), makeSymbol( "REMOVE-PPH-LEXIFICATION-PREDS" ), makeSymbol(
                      "CURRENT-SKS-REGISTRATION-STATE" ), makeSymbol( "REBUILD-SBHL-MODULES" ), makeSymbol( "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-P" ), makeSymbol( "REMOVE-ALL-KB-MODAL-OPERATORS" ), makeSymbol(
                          "GET-WS-INDEX-PORT" ), makeSymbol( "GEN-TEMPLATE-STORE-NOTE-REVISIONS" ), makeSymbol( "KB-LOADED" ), makeSymbol( "CLEAR-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE" ), makeSymbol(
                              "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE" ), makeSymbol( "GET-ENTITY-GRAPH-REGISTRY" ), makeSymbol( "ALL-NARTS-INDEXED" ), makeSymbol( "CLEAR-HL-STORAGE-MODULE-INDEXES" ), makeSymbol(
                                  "INCREMENT-SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT" ), makeSymbol( "PREVIOUS-DUMP-KB-STATE-CHECKPOINT" ), makeSymbol( "OWL-PREDICATE-TYPES-FOR-EXPORT" ), makeSymbol(
                                      "AVERAGE-HISTORICAL-INFERENCE-RELEVANT-PROBLEM-COUNT" ), makeSymbol( "CLEAR-FSUT-PRIORITIZER-SLEEP-INTERVAL-FROM-NICE-LEVEL" ), makeSymbol( "STOP-ALL-FSUT-PRIORITIZERS" ),
      makeSymbol( "CLEAR-GET-CODE-FOR-LANGUAGE" ), makeSymbol( "CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES" ), makeSymbol( "PPH-VBAR-CATEGORY" ), makeSymbol( "START-KB-MODIFICATIONS-EVENT-DISPATCHER" ), makeSymbol(
          "HAS-NEW-DEDUCTIONS?" ), makeSymbol( "CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE" ), makeSymbol( "CLEAR-REQUIRED-BOUND-ARGS-FOR-PREDS" ), makeSymbol( "GUARDIAN-HANDLER" ), makeSymbol(
              "CLEAR-GET-EXAMPLE-INSTANCES-AS-RENDERINGS" ), makeSymbol( "CLEAR-PSP-FRAME-TYPE-INSTANCES" ), makeSymbol( "GET-DERIVED-NC-RULE-COUNT" ), makeSymbol( "DOCUMENTSENTENCEFN" ), makeSymbol(
                  "OWL-IMPORTER-V1-VERSION-NUMBER" ), makeSymbol( "METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME" ), makeSymbol( "GET-SBHL-LINK-TV" ), makeSymbol( "UNSET-WORDNET-IMPORT-KB-LOADED" ), makeSymbol(
                      "CLEAR-GET-OBJECT-BY-HL-ID-STRING" ), makeSymbol( "ENSURE-BLUE-EVENT-DISPATCHER-RUNNING" ), makeSymbol( "NL-TRIE-STALE?" ), makeSymbol( "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-MTS" ), makeSymbol(
                          "GET-CORBA-REMOVAL-PREDICATES" ), makeSymbol( "ALL-INFERENCE-META-PROPERTIES" ), makeSymbol( "SKSI-CORBA-MODULES-COUNT" ), makeSymbol( "TVA-VAR-ARGNUMS" ), makeSymbol( "HL-MODIFY-REMOTE?" ),
      makeSymbol( "SHOW-OWL-IMPORT-USAGES" ), makeSymbol( "CLEAR-RTP-TEMPLATE-CATEGORY?" ), makeSymbol( "FIND-OR-CREATE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE" ), makeSymbol(
          "CLEAR-SPEC-PRED-NAUT-CACHE" ), makeSymbol( "DEFINE-HL-MODIFIER-PREAMBLE" ), makeSymbol( "META-REMOVAL-COMPLETE-POS-REQUIRED" ), makeSymbol( "CLEAR-EXPORTABLE-MT?" ), makeSymbol( "RL-MODULE-STORE" ),
      makeSymbol( "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT" ), makeSymbol( "WFF-FORMULA" ), makeSymbol( "CB-FORM-CONS-METHODS-ACTIVE" ), makeSymbol( "SET-BASIC-NC-RULE-COUNT" ), makeSymbol( "LOG-FACT-SHEET-HOURLY-REPORT" ),
      makeSymbol( "SKSI-KB-LOADED-P" ), makeSymbol( "CLEAR-CACHED-LEXIFICATIONS-FOR-TERM" ), makeSymbol( "INFERENCE-CURRENT-HL-MODULE" ), makeSymbol( "RESET-CACHE-SUF-FUNCTION-METERS" ), makeSymbol(
          "GET-SBHL-WHAT-MTS-BEHAVIOR" ), makeSymbol( "GRSOS-REPEATED-ARGS?" ), makeSymbol( "MODERNIZE-SKOLEM-AXIOM-TABLE" ), makeSymbol( "CYC-PPH-FEATURE" ), makeSymbol( "PROOF-VIEW-NAMESPACE" ), makeSymbol(
              "MWP-RULE-SPEC-TABLE-INIT" ), makeSymbol( "CLEAR-TYPES-FOR-PUBLIC-FACT-SHEETS" ), makeSymbol( "CLEAR-FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT" ), makeSymbol( "PPH-CURRENT-CYCL" ), makeSymbol(
                  "ALL-RELEVANT-SKSI-CONTENT-MTS" ), makeSymbol( "PROBLEM-STORE-COUNT" ), makeSymbol( "NEW-RKF-SD-PROMPT" ), makeSymbol( "BUILD-EVAL-FORM-LIST" ), makeSymbol( "PARTITION-CREATE-INVALID-CONSTANT" ),
      makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-11" ), makeSymbol( "REFORMULATOR-RELEVANT-PREDICATES" ), makeSymbol( "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT" ), makeSymbol( "OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS" ),
      makeSymbol( "CB-SERVER-STATUS-AUX-QUEUE" ), makeSymbol( "LONG-SITE-NAME" ), makeSymbol( "CLEAR-SKSI-MODULE-LOGICAL-SCHEMAS-CACHE" ), makeSymbol( "ASSERTIVE-WFF-RULES-CACHED-INTERNAL" ), makeSymbol(
          "CYC-VERSIONED-WORLD-NAME" ), makeSymbol( "CLEAR-TERM-PASSES-ARG-RESTRICTIONS" ), makeSymbol( "HL-ACCESS-LOCAL?" ), makeSymbol( "CLEAR-VIEWPOINT-CACHE" ), makeSymbol( "CLEAR-HTML-GLYPH-CODE-FOR-DENOT" ),
      makeSymbol( "CLOSE-OLD-AREAS" ), makeSymbol( "CLEAR-WNI-SYNSET-TERM-HELPER" ), makeSymbol( "DISABLE-RULE-HISTORICAL-CONNECTEDNESS" ), makeSymbol( "GET-TAGGER" ), makeSymbol( "CB-EMPTY-INDEX-FRAME" ), makeSymbol(
          "INITIALIZE-MULTI-WORD-PREDS" ), makeSymbol( "FORWARD-INFERENCE-TRIGGERED-TMS-RULES" ), makeSymbol( "SF-NEXT-ID" ), makeSymbol( "CURRENTLY-CONSIDERED-TACTIC" ), makeSymbol( "TEST-PARSE-A-QUESTION-COMPLETELY" ),
      makeSymbol( "INITIALIZE-RULE-AFTER-REMOVINGS-HASH" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE" ), makeSymbol( "BESTBINDINGSPHRASEFN" ), makeSymbol(
          "CLEAR-RELATION-ARGS-SORTED-BY-RESTRICTION" ), makeSymbol( "SKSI-IGNORE-ERRORS" ), makeSymbol( "IMPORT-SAMPLE-ONTOLOGIES" ), makeSymbol( "RESEARCH-CYC-LICENSE-KEY-ERROR" ), makeSymbol(
              "START-RECORDING-SBHL-CACHE-TUNING-DATA" ), makeSymbol( "RBP-NEW-RULE-BANK" ), makeSymbol( "CLEAR-PLACE-TIGHTENING-LEXICON" ), makeSymbol( "NEW-MUTED-UNREPRESENTED-TERM-INDEX-ITERATOR" ), makeSymbol(
                  "INITIALIZE-NUMBER-VALUES" ), makeSymbol( "COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?" ), makeSymbol( "L2R-PICK-DOCUMENT-TO-READ" ), makeSymbol( "FACT-SHEET-LOG-STREAM" ), makeSymbol(
                      "GET-NIMD-TASK-STRING-DENOTATION-MAPPER-LEXICON" ), makeSymbol( "ST-HTML-LEGEND" ), makeSymbol( "KB-LOADED-STRING" ), makeSymbol( "CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON" ), makeSymbol(
                          "RUN-ONE-LOCAL-OP-IN-AGENDA" ), makeSymbol( "HALT-API-TASK-PROCESSORS" ), makeSymbol( "*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*-INITIALIZER" ), makeSymbol(
                              "CB-CURRENT-RELEVANT-TERMS" ), makeSymbol( "MAINTAIN-CONSTANT-INDEX-USAGE-COUNTS" ), makeSymbol( "INITIALIZE-LEXICON" ), makeSymbol( "CLEAR-HL-VAR-FOR-DEFAULT-EL-VAR" ), makeSymbol(
                                  "CLAUSE-STRUC-TABLE" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-7" ), makeSymbol( "PENNTAG-PHRASE-CATEGORIES" ), makeSymbol( "SBHL-CACHING-INIT" ), makeSymbol(
                                      "DO-INITIALIZE-GEN-TEMPLATE-STORE" ), makeSymbol( "CLEAR-RESOLVE-RDF/XML-URI-INTERNAL" ), makeSymbol( "UNASSOCIATED-REFORMULATOR-RULES" ), makeSymbol( "RUN-LOCAL-OP?" ), makeSymbol(
                                          "CLEAR-SINGULARIZE-WORD" ), makeSymbol( "LINKAGE-CREATION-RULES" ), makeSymbol( "RESET-LEXICON-SLURPER" ), makeSymbol( "CLEAR-MDW-GRAPH" ), makeSymbol(
                                              "UNSTASH-KB-OBJECT-LOOKUP-VARS-7" ), makeSymbol( "MINI-FACT-SHEET-TERM-TYPES" ), makeSymbol( "CB-COMPUTE-PARTITION-LOAD-PUBLIC-DIRECTORY" ), makeSymbol( "KE-CYCLIFY-FORMS" ),
      makeSymbol( "WITHIN-QUERY-TENSE-CZER-MODE?" ), makeSymbol( "MAKE-TVA-SIMPLE-STRATEGY" ), makeSymbol( "GET-ALL-SKSS" ), makeSymbol( "HALT-BG-TASK-PROCESSORS" ), makeSymbol( "CB-CREATE-SIMILAR-GUEST-WARN" ),
      makeSymbol( "NL-TRIE-ROTATION-INDEX-INITIALIZATION-PRACTICAL-P" ), makeSymbol( "TVA-PRECOMPUTES-SKSI-CLOSURES?" ), makeSymbol( "LISP-IMPLEMENTATION-TYPE" ), makeSymbol( "CLEAR-MONAD-MT-FORT-CACHE" ), makeSymbol(
          "SF-NEXT-ID" ), makeSymbol( "CLEAR-PPH-DNF-CLAUSAL-FORM-CACHED" ), makeSymbol( "INITIALIZE-SCOOP-DEFINITIONS" ), makeSymbol( "CB-MYCREATOR-FILTER" ), makeSymbol( "PPH-ALLOW-CONTRACTIONS?" ), makeSymbol(
              "UNEXPANDED-FORMULA" ), makeSymbol( "FILE-VECTOR-BACKED-MAP-EXERCISER-PROCESS" ), makeSymbol( "ALL-OS-PROCESSES" ), makeSymbol( "GET-SBHL-FORWARD-DIRECTED-DIRECTION" ), makeSymbol( "GET-SBHL-GOAL-TABLE" ),
      makeSymbol( "SCOPE-KBS-SPLICING-ASSERTIONS" ), makeSymbol( "COMPUTE-CORE-CONSTANTS" ), makeSymbol( "MAPPING-ANSWER-FOUND?" ), makeSymbol( "GET-GKE-QUANTIFIERS" ), makeSymbol(
          "SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?" ), makeSymbol( "L2R-SENTENCE-STRING-INDEXICAL-INTERNAL" ), makeSymbol( "LIST-ALL-PACKAGES" ), makeSymbol( "EMPTY-THOUGHT" ), makeSymbol(
              "OUTPUT-GENERATE-TEXT-BAD-RESULTS" ), makeSymbol( "SEMANTIC-VIOLATIONS" ), makeSymbol( "CB-CREATE-SIMILAR-GUEST-WARN" ), makeSymbol( "CLEAR-DERIVED-PREDS" ), makeSymbol( "REGISTER-CYCLIFY-PARSER" ),
      makeSymbol( "UNSTASH-INFERENCE-VARS-4" ), makeSymbol( "MODAL-STRINGS-INTERNAL" ), makeSymbol( "GET-SBHL-CONSIDER-NODE-FN" ), makeSymbol( "DISABLE-ASSERTIVE-WFF" ), makeSymbol( "WORRY-TRANSMIT-OPERATIONS" ),
      makeSymbol( "MT-OF-CURRENTLY-EXECUTING-TACTIC" ), makeSymbol( "CLEAR-NEW-KB-STATE" ), makeSymbol( "KB-DUMP-DEFAULT-COMMON-SYMBOLS" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-3" ), makeSymbol(
          "RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS" ), makeSymbol( "GET-RTV-INFERENCE-NODE-CONSTRAINTS" ), makeSymbol( "CLEAR-MWP-BASE-PRED-OF-POS" ), makeSymbol( "CITIES-TO-COUNTRIES" ), makeSymbol(
              "KBP-RESULT-PATHS" ), makeSymbol( "NEW-NEW-NARTS-ITERATOR" ), makeSymbol( "CLEAR-QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY" ), makeSymbol( "REMOVE-INVALID-CONSTANTS-FROM-COMPLETIONS" ),
      makeSymbol( "CLEAR-RDF-STANDARD-PREFIX-FOR-NAMESPACE" ), makeSymbol( "ASSERTING-TREES?" ), makeSymbol( "CB-SYSTEM-HEALTH-POSSIBLE-CHECKUPS" ), makeSymbol( "LOAD-ALL-CRIPPLED-HAYSTACKS-INT" ), makeSymbol(
          "JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-FORMULAS-ITERATOR-STATE" ), makeSymbol( "INVALID-CONSTANT-NAMES" ), makeSymbol( "CLEAR-FIND-STEM-MEMOIZED" ), makeSymbol(
              "CB-CLEAR-KCT-TEST-BEING-SAVED" ), makeSymbol( "NEW-LEX-PRED-SET" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-7" ), makeSymbol( "CLEAR-CB-SUGGEST-GAFS-FOR-TERMS" ), makeSymbol( "GET-CYC-TO-PENN-MAP" ),
      makeSymbol( "SCOPE-KBS-ASSERTIONS" ), makeSymbol( "CLEAR-SPLIT-LINK-WORD" ), makeSymbol( "RESET-NAT-ISA-LINKS" ), makeSymbol( "CB-FORM-CONS-INTER-ARG-SPACE" ), makeSymbol( "CLEAR-INTER-CONSTRAINTS-FROM-RULE" ),
      makeSymbol( "UNSTASH-OTHER-VARS-12" ), makeSymbol( "SWAP-OUT-ALL-PRISTINE-NART-HL-FORMULAS" ), makeSymbol( "ACTIVE-GUARDIAN-REQUESTS" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-4" ), makeSymbol(
          "NON-WFF-ASSERTION-IDS" ), makeSymbol( "SBHL-SEARCH-TRUE-TV" ), makeSymbol( "RKF-SC-NEW-LIMITATIONS" ), makeSymbol( "REMOVE-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE" ), makeSymbol( "CURRENT-XREF-MODULE" ),
      makeSymbol( "PLOT-IMAGE-FORMAT-AND-EXTENSION" ), makeSymbol( "WNI-ACCESS-PATH-DB" ), makeSymbol( "INIT-STARTS-DURING" ), makeSymbol( "L2R-SENTENCE-STRING-NUMBER-INDEXICAL" ), makeSymbol(
          "UNSTASH-KB-OBJECT-CONTENT-VARS-12" ), makeSymbol( "SET-KCT-KB-LOADED" ), makeSymbol( "POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP" ), makeSymbol( "INITIALIZE-NL-TAG-FNS" ), makeSymbol(
              "PROCESS-LOCAL-OPERATIONS?" ), makeSymbol( "ENABLE-HLMTS" ), makeSymbol( "REMOVE-SCOPED-PARTITION" ), makeSymbol( "TWODIGITYEARPARAPHRASEFN" ), makeSymbol( "NEW-ALEXANDRIA-ALL-CONSTANTS-ITERATOR" ),
      makeSymbol( "CLEAR-STORED-OPERATIONS" ), makeSymbol( "HB-DEBUG" ), makeSymbol( "INCREMENT-SBHL-MARKING-GENERATION" ), makeSymbol( "GET-SANITY-CHECKER" ), makeSymbol( "WNI-ACCESS-PATH-USER" ), makeSymbol(
          "CLEAR-QUESTION-TOPICS-INFORMATION-FOR-PREDICATE" ), makeSymbol( "INITIALIZE-ISA-MODULE" ), makeSymbol( "PROOF-VIEW-CLOSED-QUERY-SUCCESS-VALUE" ), makeSymbol( "SBHL-CACHE-SUCCESS-HISTORICAL-COUNT" ),
      makeSymbol( "CLEAR-PSP-NP-GAP-SEMX" ), makeSymbol( "CLEAR-PPH-NL-GENERATION-PRED?" ), makeSymbol( "DISABLE-ASSERTIVE-WFF-FORWARD-RULES" ), makeSymbol( "CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED" ), makeSymbol(
          "CB-CLEAR-KCT-TEST-BEING-SAVED" ), makeSymbol( "INITIALIZE-LEXICON-LOOKUP-MT" ), makeSymbol( "GET-ALL-TSBS" ), makeSymbol( "NEW-PPH-PHRASE-COUNT" ), makeSymbol( "INITIALIZE-RBP-TERM-KEYWORD-MAP" ), makeSymbol(
              "SCHEDULED-QUERY-QUEUE" ), makeSymbol( "SCOPE-KBS-SPLICING-ASSERTIONS" ), makeSymbol( "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS-COUNT" ), makeSymbol( "NEW-CFASL-COUNT-STREAM" ), makeSymbol(
                  "CLEAR-RTV-PANEL-ENABLED-FOR-TASK" ), makeSymbol( "PARTITION-CREATE-INVALID-CONSTANT" ), makeSymbol( "INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES" ), makeSymbol(
                      "FACT-SHEET-QUERY-SOFT-TIMEOUT-TIME-REACHED?" ), makeSymbol( "OWL-PROPERTY-ELEMENT-NAMES-INTERNAL" ), makeSymbol( "REMOVE-ASSERTIVE-WFF-RULES-CACHED" ), makeSymbol(
                          "GET-ALL-FORMULA-TEMPLATE-SUBTOPICS" ), makeSymbol( "BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN" ), makeSymbol( "CLEAN-INVALID-BOOKKEEPING-INFO" ), makeSymbol( "AGENDA-ERROR-MODES" ), makeSymbol(
                              "REBUILD-SOMEWHERE-CACHE" ), makeSymbol( "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-INTERNAL" ), makeSymbol( "HERALD-START" ), makeSymbol( "GET-ALL-MT-VECTORS" ), makeSymbol(
                                  "MAPPING-FINISHED" ), makeSymbol( "INITIALIZE-REFORMULATOR-RULE-SPEC-PREDS" ), makeSymbol( "PPH-NBAR-CATEGORY" ), makeSymbol( "BROAD-MT-INDEX-CLEANUP" ), makeSymbol(
                                      "CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE" ), makeSymbol( "TKB-KBS-SAVE-TERMS-WITHOUT-ISAS" ), makeSymbol( "POSSIBLY-NOTE-TRANSCRIPT-OPERATIONS-PROCESSED" ),
      makeSymbol( "UNSTASH-OTHER-VARS" ), makeSymbol( "RUN-ONE-AUXILIARY-OP-IN-AGENDA" ), makeSymbol( "PPH-NON-EXPLANATORY-PROOFS" ), makeSymbol( "NEW-OWL-IMPORTER" ), makeSymbol(
          "SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT" ), makeSymbol( "UNSTASH-INFERENCE-VARS-7" ), makeSymbol( "CB-GLOB-RESET" ), makeSymbol( "PSP-ALLOWED-GAP-CATEGORY" ), makeSymbol( "CFASL-INVALID-KB-HL-SUPPORT" ),
      makeSymbol( "DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK" ), makeSymbol( "CURRENT-FORWARD-INFERENCE-FULLY-PROPAGATING-RULE?" ), makeSymbol( "TMS-ANY-ASSERTION-BEING-REMOVED?" ), makeSymbol(
          "DO-AGENDA-DAILY-GC" ), makeSymbol( "GC-FULL" ), makeSymbol( "CLEAR-PHRASE-NAUT-ARG" ), makeSymbol( "GET-QL-INDEX-DISTANCE" ), makeSymbol( "INIT-BIRTH-DATE" ), makeSymbol( "CB-SERVER-STATUS-LOCAL-QUEUE" ),
      makeSymbol( "TEMPLATE-MTS" ), makeSymbol( "RESET-SBHL-MODULES" ), makeSymbol( "HISTORICAL-PROBLEM-CREATION-TIMES" ), makeSymbol( "CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED" ), makeSymbol(
          "INITIALIZE-TIME-KB-FEATURE" ), makeSymbol( "PROBABLY-MOST-RECENT-ASSERTION" ), makeSymbol( "PPH-LANGUAGE-MT" ), makeSymbol( "CB-SHOW-RECENT-SENTENCES" ), makeSymbol( "INDEXICAL-NOW" ), makeSymbol(
              "GET-QL-INDEX-UPDATE-PROCEDURE" ), makeSymbol( "POSSIBLY-INITIALIZE-DUMPABLE-KB-STATE-HASHES" ), makeSymbol( "UIMMA-DEFAULT-DOMAIN-MT" ), makeSymbol( "CLEAR-QUERY-LIBRARY-DEFAULT-QUERY-MT" ), makeSymbol(
                  "CLEAR-OWL-EXPORT-STATE" ), makeSymbol( "CURRENT-COMPLEX-INDEX-KEYS" ), makeSymbol( "SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE" ), makeSymbol( "API-PORT" ), makeSymbol(
                      "FORGET-REDUNDANT-ASSERTIVE-WFF-DEDUCTIONS" ), makeSymbol( "SHOW-PROOF-VIEW-TOC" ), makeSymbol( "BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN" ), makeSymbol( "CLEAR-QUA-EXPANSION-CYCLS" ), makeSymbol(
                          "CLASSES-BEFORE-LISTENERS-BY-DEFAULT-P" ), makeSymbol( "CLEAR-SUGGESTED-FREE-POSITION-FOR-PRED?" ), makeSymbol( "SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-INTERNAL" ), makeSymbol(
                              "FORMAT-NIL-PERCENT" ), makeSymbol( "CLEAR-TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?" ), makeSymbol( "GET-PSP-LEXICON" ), makeSymbol( "SBHL-VERIFY-NAUT-MT-RELEVANCE-P" ), makeSymbol(
                                  "INITIALIZE-FILE-VECTOR-BACKED-MAP" ), makeSymbol( "ASSUME-NL-TRIE-VALID?" ), makeSymbol( "CLEAR-CAE-QUERY-SEARCH-TABLES" ), makeSymbol(
                                      "CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES" ), makeSymbol( "CLEAR-LOCAL-QUEUE" ), makeSymbol( "NOTING-PROGRESS-POSTAMBLE" ), makeSymbol(
                                          "KBS-BROADER-TERM-CANDIDATE-FORTS" ), makeSymbol( "CLEAR-INDIVIDUAL?-CACHED" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-12" ), makeSymbol(
                                              "PARTITION-CREATE-INVALID-CONSTANT" ), makeSymbol( "SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE" ), makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-10" ), makeSymbol(
                                                  "INITIALIZE-EVAL-IN-API-ENV" ), makeSymbol( "GET-LATEST-NL-GENERATION-CACHE-FILE-PATH" ), makeSymbol( "NEW-DENSE-DEDUCTION-ID-INDEX" ), makeSymbol(
                                                      "REBUILD-REFORMULATOR-RULES" ), makeSymbol( "ASKED-QUERY-COMMON-SYMBOLS" ), makeSymbol( "NEW-MESSAGE-MAILBOX-SUITE" ), makeSymbol( "PSP-NP-EDGES" ), makeSymbol(
                                                          "CLEAR-REMOVE-TVA-CACHE-VALUE-CACHED" ), makeSymbol( "HTML-SET-ALL-RADIO-BUTTONS-SCRIPT" ), makeSymbol( "API-INPUT-PROTOCOL" ), makeSymbol(
                                                              "SUBCOL-UNWIND-ALLOCATE-EXISTENTIAL-VARIABLE" ), makeSymbol( "NEW-LOCAL-TRANSCRIPT" ), makeSymbol( "INITIALIZE-DISJOINT-WITH-MODULE" ), makeSymbol(
                                                                  "GET-KBS-NAME" ), makeSymbol( "INCREMENT-PROOF-HISTORICAL-COUNT" ), makeSymbol( "PERFECT-ASPECT-PRED" ), makeSymbol( "EL-VARIABLE-HYPHEN-CHAR" ),
      makeSymbol( "SET-KCT-KB-LOADED" ), makeSymbol( "CLEAR-UNREPRESENTED-TERM-FHT" ), makeSymbol( "CLEAR-NODES-SUPPRESSED-FROM-FILTER" ), makeSymbol( "NEW-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR" ), makeSymbol(
          "UNSTASH-INFERENCE-VARS-5" ), makeSymbol( "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING" ), makeSymbol( "CLEAR-GET-COLLECTION-INSTANCES" ), makeSymbol( "NAT-FUNCTION-HL-SUPPORT" ), makeSymbol(
              "TEST-SET-CONTENTS" ), makeSymbol( "BATHYMETRIC-HEADER-ACCESS-PATH" ), makeSymbol( "GENERATION-FUNCTION-ALIST" ), makeSymbol( "HL-ACCESS-REMOTE?" ), makeSymbol( "GNDB-ACCESS-PATH" ), makeSymbol(
                  "VIRTUAL-ASSERTION-COUNT" ), makeSymbol( "OPENCYC-KBS-FORTS-CONTRIBUTE-PRETTY-STRINGS" ), makeSymbol( "CLEAR-FORT-PASSES-CACHED-THCL-TESTS?" ), makeSymbol( "REMOVAL-MODULES-EXTERNAL" ), makeSymbol(
                      "CZER-CREATE-NARTS?" ), makeSymbol( "DHTML-DOM-ATTRIBUTE-POSTAMBLE" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE" ), makeSymbol( "CLEAR-INTENSIONALLY-INCOMPATIBLE-MT-GRAPH" ),
      makeSymbol( "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT" ), makeSymbol( "CLEAR-GET-REFORMULATION-SPECIFICATION-FROM-KB" ), makeSymbol( "NEW-THEORY-CHECKPOINT" ), makeSymbol( "RDF/XML-OLD-TERM-URIS" ), makeSymbol(
          "SERIALIZABLE-UNITS-OF-MEASURE-MATHML-INTERNAL" ), makeSymbol( "SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-REGISTERED?" ), makeSymbol( "IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?" ), makeSymbol(
              "ALL-SYSTEM-PARAMETER-DEFINITIONS" ), makeSymbol( "NEW-DENSE-CONSTANT-ID-INDEX" ), makeSymbol( "NEW-MWP-PARSE" ), makeSymbol( "RESET-NECESSARY-DEFNS-REJECT?-METERS" ), makeSymbol(
                  "CLEAR-NEGATION-PREDICATE-GRAPH" ), makeSymbol( "INITIALIZE-GEN-TEMPLATE-QUERY-SENTENCE-INDEX" ), makeSymbol( "KILL-DUPLICATE-NARTS" ), makeSymbol( "INITIALIZE-SKSI-KB-FEATURE" ), makeSymbol(
                      "NEW-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR" ), makeSymbol( "CLEAR-RBP-OK-NAME-CACHED?" ), makeSymbol( "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-CODE-SUPPORT" ), makeSymbol(
                          "CLEAR-FUNCTIONAL-PREDICATE-IN-ARG?" ), makeSymbol( "GET-SBHL-WHAT-MTS-MAP-FUNCTION" ), makeSymbol( "UPDATE-AGENDA-DAILY-GC-TIME" ), makeSymbol( "VALID-DIRECTIONS" ), makeSymbol(
                              "GET-RED-VALUE-FOR-DEFAULT-JAVA-LIB" ), makeSymbol( "NEW-FHT-SUID-ITEM" ), makeSymbol( "RBP-UNTRACE-ALL-RULES" ), makeSymbol( "REALLY-RECOMPUTING-SKOLEM-DEFN?" ), makeSymbol(
                                  "DESTROY-ALL-PROBLEM-STORES" ), makeSymbol( "NEW-PPH-PHRASE-COUNT" ), makeSymbol( "BESTNLPHRASEOFSTRINGFN" ), makeSymbol( "CLEAR-TERM-LEARNER-TYPE-PROMPT" ), makeSymbol(
                                      "GET-SIMPLE-QUERY-DEFAULT-NL-MT" ), makeSymbol( "WNI-CLEAR-FUNCTION-CACHES" ), makeSymbol( "NART-REFORMULATOR-RULE-TABLE" ), makeSymbol( "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER" ),
      makeSymbol( "CLEAR-STANFORD-PARSE" ), makeSymbol( "NOTING-PERCENT-PROGRESS-POSTAMBLE" ), makeSymbol( "ATTEMPT-TEMPORARY-PATCH-P" ), makeSymbol( "NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS-INTERNAL" ), makeSymbol(
          "SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS" ), makeSymbol( "CB-GLOB-RESET" ), makeSymbol( "AGENDA-SAVE-ASKED-QUERIES?" ), makeSymbol( "FSUT-PRIORITIZER-MIN-NICE-LEVEL" ), makeSymbol(
              "SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT" ), makeSymbol( "ENABLE-FULL-SENTENCE-CAE-INTERPRETATION" ), makeSymbol( "CFASL-INVALID-KB-HL-SUPPORT" ), makeSymbol( "PPH-NEW-PARAMETER-SNAPSHOT" ),
      makeSymbol( "WNI-MARK-EXISTING-MAPPED-TERMS" ), makeSymbol( "SKSI-WARN-ON-REGISTRATION-ERRORS?" ), makeSymbol( "INITIALIZE-NL-TRIE-OTHER-PREDICATES" ), makeSymbol( "CLEAR-ALL-SBHL-TIME-DATA" ), makeSymbol(
          "NEW-GLOB-ID-STATE" ), makeSymbol( "OPTIMIZE-ASSERTION-TABLE" ), makeSymbol( "USER-ACTIONS-EMPTY?" ), makeSymbol( "INCREMENT-INFERENCE-HISTORICAL-COUNT" ), makeSymbol( "INIT-SME-LEXIFICATION-WIZARD" ),
      makeSymbol( "CLEAR-NART-HL-FORMULA-TABLE" ), makeSymbol( "RESET-SME-LEXIFICATION-PARAMETERS" ), makeSymbol( "FINALIZE-FORWARD-INFERENCE-METRICS-INFERENCE-INDEX" ), makeSymbol( "WNI-DELETE-ALL-CONCEPT-MATCH-HTML" ),
      makeSymbol( "RUN-AUXILIARY-OP?" ), makeSymbol( "NEW-FACT-SHEET-QUERY-DAEMON" ), makeSymbol( "NEW-FORWARD-INFERENCE-ENVIRONMENT" ), makeSymbol( "CLEAR-PAST-TENSE-FORM?" ), makeSymbol(
          "STORING-CYCLIFIER-WFF-RESULTS?" ), makeSymbol( "PPH-IRRELEVANCE-CHECK-MT" ), makeSymbol( "CLEAR-MAKE-SBHL-GRAPH-LINK-GENLS" ), makeSymbol( "MAKE-CONSTANT-EXTERNAL-ID" ), makeSymbol(
              "CLEAR-KB-STORE-ENTITY-MANAGER" ), makeSymbol( "REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS" ), makeSymbol( "PPH-REGISTERED-VARS" ), makeSymbol( "ASSERTION-MANAGER-MAINTAIN-USAGE-COUNTS" ), makeSymbol(
                  "CYC-REVISION-NUMBERS" ), makeSymbol( "FIX-QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL" ), makeSymbol( "GET-SBHL-CONSIDER-NODE-FN" ), makeSymbol( "SORT-TRANSCRIPT-RENAMES" ), makeSymbol(
                      "CLEAR-DEFN-CYC-EVALUATE" ), makeSymbol( "CB-SERVER-SHOW-TRANSMIT-QUEUE?" ), makeSymbol( "MAYBE-INITIALIZE-CB-RTV-COLLECTIONS" ), makeSymbol( "USE-HEZBOLLAH-INDEXES" ), makeSymbol(
                          "CLEAR-FUNCTION-CACHING-RESULTS" ), makeSymbol( "DISABLE-QUIRK" ), makeSymbol( "FACT-SHEET-DEFAULT-DOMAIN-MT" ), makeSymbol( "BACKWARD-INFERENCE-HISTORICAL-COUNT" ), makeSymbol(
                              "NEW-WNI-PROBLEM-STORE" ), makeSymbol( "CLEAR-PS-PARSE-VBAR-INT-CACHED" ), makeSymbol( "NL-REFORMULATE-DAEMON-RUN" ), makeSymbol( "CLEAR-QL-COLLECTION-BACKCHAIN-ENCOURAGED?" ), makeSymbol(
                                  "START-DAEMON-AND-STOP-RECEIVING" ), makeSymbol( "TRANSLATOR-OUTPUT-ENABLED-P" ), makeSymbol( "TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?" ), makeSymbol(
                                      "INVALID-CONSTANT-NAMES" ), makeSymbol( "UNSTASH-INFERENCE-VARS-5" ), makeSymbol( "CYCL-QUERY-NAMESPACE" ), makeSymbol( "RELATION-INSTANCE-ALL-COLLECTION-COST-ESTIMATE" ),
      makeSymbol( "NEW-NEW-CONSTANTS-ITERATOR" ), makeSymbol( "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING" ), makeSymbol( "CURRENTLY-ACTIVE-PROBLEM-STORE-CREATION-TIME" ), makeSymbol( "NLCONJUNCTIONFN" ),
      makeSymbol( "GET-QL-INDEX-UPDATE-PROCESS" ), makeSymbol( "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?" ), makeSymbol( "GET-CURRENT-TASK-PROCESSOR-INFO" ), makeSymbol(
          "DETERMINE-SBHL-MARK-BETWEEN-CONSIDER-FN" ), makeSymbol( "WITHIN-QUERY-TENSE-CZER-MODE?" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-15" ), makeSymbol( "NEXT-NART-ID" ), makeSymbol(
              "FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK" ), makeSymbol( "PPH-TIMEOUT" ), makeSymbol( "CLEAR-OWL-NAME" ), makeSymbol( "POSSIBLY-ROLL-TO-ALLOW-TRANSMITTING" ), makeSymbol( "CREATE-SAMPLE-INVALID-NART" ),
      makeSymbol( "INITIALIZE-JAVA-BACKEND-GLOBAL-TABLES" ), makeSymbol( "ALREADY-WITHIN-FI-OPERATION?" ), makeSymbol( "MAKE-NEW-RDF-GRAPH" ), makeSymbol( "CB-SPECIFY-INPUT" ), makeSymbol(
          "FORWARD-PROBLEM-STORE-PROPERTIES" ), makeSymbol( "NEW-ROOT-TACTICIAN-HEURISTICS" ), makeSymbol( "GATHER-FET-STATS" ), makeSymbol( "CLEAR-OWL-IMPORTER-CACHES" ), makeSymbol( "SKSI-VIOLATIONS" ), makeSymbol(
              "NEW-ALEXANDRIA-ALL-INTEGERS-ITERATOR" ), makeSymbol( "QUERY-SEARCH-TABLE-PREDS" ), makeSymbol( "MTS-CLEAR-TESTS" ), makeSymbol( "CB-PARTITION-LOAD-HEADER" ), makeSymbol(
                  "INITIALIZE-ALL-MTS-CACHE-FOR-GENL-PREDS-AND-INVERSE" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-12" ), makeSymbol( "INCREMENT-SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT" ), makeSymbol(
                      "WNI-ACCESS-PATH-USER" ), makeSymbol( "MAINTAIN-UNREPRESENTED-TERM-INDEX-USAGE-COUNTS" ), makeSymbol( "*TIME-POINT-SUBSUMED-RULE*-INITIALIZER" ), makeSymbol( "MISSING-OLD-CONSTANT-INTERNAL-IDS" ),
      makeSymbol( "FINISH-TRIE-ANCESTOR-TRACKING" ), makeSymbol( "KBQ-CFASL-COMMON-SYMBOLS" ), makeSymbol( "MAKE-QUOTED-DEFN-FN-HISTORY-TABLE" ), makeSymbol( "CURRENT-KB-HAS-PRETTY-STRINGS-ASSERTED?" ), makeSymbol(
          "FORTS-BEING-REMOVED" ), makeSymbol( "MAX-PRED-STRENGS" ), makeSymbol( "REMOVE-SCOPED-PARTITION" ), makeSymbol( "ASSERTIONS-WITH-MORE-THAN-ONE-BELIEF" ), makeSymbol( "GET-KB-OBJECT-MANAGERS" ), makeSymbol(
              "CB-SHOP-ENABLE-PLAN-CHECKING" ), makeSymbol( "CREATE-NEW-CYCL-QUERY-SPECIFICATION" ), makeSymbol( "EL-VARIABLE-PREFIX-STRING" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE" ), makeSymbol(
                  "GET-SBHL-SEARCH-INDEX-ARG" ), makeSymbol( "CURRENT-SBHL-MARKING-SPACE-RESOURCE" ), makeSymbol( "UNSTASH-INFERENCE-VARS-8" ), makeSymbol( "INITIALIZE-AGENDA" ), makeSymbol( "AVAILABLE-DATABASES" ),
      makeSymbol( "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING" ), makeSymbol( "NEW-MUTED-NART-INDEX-ITERATOR" ), makeSymbol( "CLEAN-AND-REBUILD-ALL-DAMAGED-MODULES" ), makeSymbol(
          "NEW-ALEXANDRIA-ALL-VARIABLES-ITERATOR" ), makeSymbol( "UNSET-DATE-KB-LOADED" ), makeSymbol( "CLEAR-NL-TRIE-PREDS-OF-POS" ), makeSymbol( "WITHIN-SKSI-DATABASE-FUSION?" ), makeSymbol(
              "AVERAGE-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-2" ), makeSymbol( "CFASL-OUTPUT-RELOC-FOOTER" ), makeSymbol( "CB-KE-REVIEW-CREATORS" ), makeSymbol(
                  "NEW-PROBLEM-STORE-POINTER" ), makeSymbol( "COUNT-NEW-KB-OBJECTS" ), makeSymbol( "CLEAR-TERM-LEARNER-ID" ), makeSymbol( "VECTOR-OF-POS-TAGS" ), makeSymbol( "CB-PROOF-CHECKER-RULES" ), makeSymbol(
                      "RESET-COHERENCE-VIOLATIONS" ), makeSymbol( "SBHL-MODULE-PREMARKS-GATHER-NODES-P" ), makeSymbol( "INFERENCE-SPEC-PREDS-ARE-RELEVANT?" ), makeSymbol( "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS" ),
      makeSymbol( "SHOW-OWL-EXPORT-USAGES" ), makeSymbol( "INSERT-TRANSMIT-OPTIONS" ), makeSymbol( "WITHIN-DISJUNCTION?" ), makeSymbol( "CLEAR-ALL-KB-REFORMULATOR-MODES" ), makeSymbol(
          "RESIZE-ALL-KB-OBJECT-MANAGER-LRU-CACHES" ), makeSymbol( "CLEAR-WNI-ALL-HYPERNYMS-HELPER" ), makeSymbol( "CURRENT-PARSING-CONSTRAINT-RANKINGS" ), makeSymbol( "HL-PROTOTYPE-COLLECTIONS" ), makeSymbol(
              "MISSING-CONSTANT-ID-SET" ), makeSymbol( "YESTERDAY" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-RULES-ITERATOR-STATE" ), makeSymbol( "MAX-PRED-STRENGS" ), makeSymbol( "NO-ARG-FORMAT-AT-PARAMETER-STATE?" ),
      makeSymbol( "UNSTASH-KB-OBJECT-CONTENT-VARS-7" ), makeSymbol( "UNDECLARE-REMOTE-HL-STORE-IMAGE" ), makeSymbol( "INIT-OVERLAPS-START" ), makeSymbol( "RC-NEW-LHS" ), makeSymbol(
          "FIND-OR-CREATE-PPH-MEMOIZATION-STATE" ), makeSymbol( "INITIALIZE-GENLS-MODULE" ), makeSymbol( "DO-FORWARD-MODULES-LIST" ), makeSymbol( "INITIALIZE-LOCAL-CARDINALITIES" ), makeSymbol( "MODAL-WORDS" ),
      makeSymbol( "CLEAR-EXPAND-RDF-XML-URI-NAMESPACE-PREFIX" ), makeSymbol( "CLEAR-GET-PUBLIC-FACT-SHEET-STRING-URL-MAPPINGS" ), makeSymbol( "TODAY-ABBREVIATION-STRING" ), makeSymbol( "META-SPLIT-CRITERIA" ),
      makeSymbol( "UNSTASH-OTHER-VARS-1" ), makeSymbol( "CLEAR-RDF-FIND-BASE-URI" ), makeSymbol( "WFF-PROPERTIES" ), makeSymbol( "SPECIFIC-PREFERENCE-MODULE-PREDICATES" ), makeSymbol( "CLEAR-ALL-KB-MODAL-OPERATORS" ),
      makeSymbol( "RESET-UNCACHE-SUF-QUOTED-DEFN-METERS" ), makeSymbol( "CLEAR-SIMPLE-SKSI-TERMS" ), makeSymbol( "RECALCULATE-SKSI-ISA-MODULE-REWRITE-INFO" ), makeSymbol(
          "CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE" ), makeSymbol( "L2R-DOCUMENT-SENTENCE-FINDER-KBQ-INTERNAL" ), makeSymbol( "TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY" ), makeSymbol(
              "CACHE-ALL-SYMBOL-SXHASH-EXTERNAL-CODES" ), makeSymbol( "LOAD-REMOTE-OPERATIONS" ), makeSymbol( "GET-SBHL-COMBINE-FN" ), makeSymbol( "CLEAR-STORED-OPERATIONS" ), makeSymbol( "SBHL-TEMPORAL-INCREMENT" ),
      makeSymbol( "NEXT-TRANSCRIPT-DIRECTORY" ), makeSymbol( "WNI-MAPPED-TERMS" ), makeSymbol( "NEW-CONCEPTUALLY-RELATED-ANSWER-TABLE" ), makeSymbol( "REGISTER-EBMT" ), makeSymbol( "INITIALIZE-HALO-LEVIATHAN-QUERIES" ),
      makeSymbol( "SET-TO-TRANSMIT-ONLY" ), makeSymbol( "FIX-FORTS-WITH-GENLS-BUT-NOT-COLLECTIONS" ), makeSymbol( "ALL-LEXICON-STRING-PREDICATES" ), makeSymbol( "CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE" ),
      makeSymbol( "TVA-PRECOMPUTES-SKSI-CLOSURES?" ), makeSymbol( "SKSI-SUPPORTED-BROWSING-REGISTERED?" ), makeSymbol( "GET-QL-INDEX-UPDATE-PROCEDURE" ), makeSymbol( "BESTNLPHRASEOFSTRINGFN" ), makeSymbol(
          "CYC-REVISION-NUMBERS" ), makeSymbol( "SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?" ), makeSymbol( "ENSURE-KB-MODIFICATIONS-EVENT-DISPATCHER-RUNNING" ), makeSymbol( "CONSTANT-INDEX-MAINTAIN-USAGE-COUNTS" ),
      makeSymbol( "WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?" ), makeSymbol( "SOME-SKSI-REMOVAL-MODULE-REGISTERED?" ), makeSymbol( "HTML-META-NO-ROBOTS" ), makeSymbol( "REMOVAL-MODULES-CONJUNCTIVE" ), makeSymbol(
          "CLEAR-RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN" ), makeSymbol( "CYCLIFIER-CATCH-ERRORS?" ), makeSymbol( "INITIALIZE-HTTP-RESTRICTED-FUNCTIONS" ), makeSymbol( "NL-GENERATION-FORT-CACHE-DATA-GENERATED?" ), makeSymbol(
              "ALL-NAKED-IN-PROGRESS-TERMS" ), makeSymbol( "REBUILD-RULE-CONNECTIVITY-GRAPH" ), makeSymbol( "MAKE-ISOMORPHIC-SENTENCES-RULE-SUPPORT" ), makeSymbol( "DONT-RECORD-OPERATIONS-LOCALLY" ), makeSymbol(
                  "VERIFY-CYC-BUILD" ), makeSymbol( "CONSOLE-TASK-PROCESSORS-INITIALIZED-P" ), makeSymbol( "ARETE-ENABLE-GLOBAL-LOGGING" ), makeSymbol( "FOAF-NAMESPACE" ), makeSymbol( "VERBS-NEED-SF" ), makeSymbol(
                      "CLEAR-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol( "REMOVE-PPH-POSSESSIVE-PREDS" ), makeSymbol( "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?" ), makeSymbol(
                          "POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP" ), makeSymbol( "INIT-BIRTH-DATE" ), makeSymbol( "GET-RED-KEY-FOR-DEFAULT-JAVA-VM" ), makeSymbol( "CLEAR-CURRENT-FORWARD-PROBLEM-STORE" ),
      makeSymbol( "POSSIBLY-INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT" ), makeSymbol( "GET-SBHL-LINK-MT" ), makeSymbol( "RESET-UNCACHE-SUF-DEFN-METERS" ), makeSymbol( "CLEAR-TRANSFORMATION-MODULE-TESTS" ), makeSymbol(
          "L2R-SENTENCE-STRING-NUMBER-INDEXICAL" ), makeSymbol( "GET-GKE-QUANTIFIER-RANGES" ), makeSymbol( "RKF-UTTRDR-DEREGISTER-ALL-PARSERS" ), makeSymbol( "MAPPING-FUNCALL-INT" ), makeSymbol(
              "CYC-RESEARCHCYC-FEATURE" ), makeSymbol( "SKSI-MODULES-BY-SKS-GET-SKSES" ), makeSymbol( "GNUPLOT-AVAILABLE?" ), makeSymbol( "CLEAR-CMLS-DECODING-TABLE" ), makeSymbol( "NOTE-OWL-IMPORT-SECTION-DONE" ),
      makeSymbol( "REMOVAL-MODULES-EXTERNAL" ), makeSymbol( "CLEAR-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED" ), makeSymbol( "SBHL-WHAT-MTS-GOAL-FINAL-MT-PATHS" ), makeSymbol( "INVALID-FAST-FHT-OPTIMIZATION-MODE" ),
      makeSymbol( "SBHL-PRIMARY-WHAT-MTS-SPACES" ), makeSymbol( "COUNTRIES-TO-REGIONS" ), makeSymbol( "NEW-HAPPINESS-INDEX" ), makeSymbol( "CLEAR-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED" ), makeSymbol(
          "NEW-ACCESS-PATH" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-2" ), makeSymbol( "INCREMENT-PROBLEM-STORE-HISTORICAL-COUNT" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-3" ), makeSymbol(
              "ENSURE-TEMPLATE-RULES-MASTER-INDEX" ), makeSymbol( "EL-VARIABLE-PREFIX-CHAR" ), makeSymbol( "CLEAR-QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?" ), makeSymbol(
                  "KB-HL-SUPPORT-CONTENT-COMPLETELY-CACHED?" ), makeSymbol( "CLEAR-CAE-DEFAULT-PARSING-MT" ), makeSymbol( "GET-RED-EXTERNAL-ELEMENT" ), makeSymbol( "MAKE-KB-HL-SUPPORT-ID" ), makeSymbol(
                      "TOTAL-SIZE-OF-ALL-PROBLEM-STORES" ), makeSymbol( "MAKE-DEFN-FN-HISTORY-TABLE" ), makeSymbol( "TRANSLATOR-CURRENT-METHOD" ), makeSymbol( "ARGUMENT-TYPE-HIERARCHY" ), makeSymbol( "NON-WFF-ERROR" ),
      makeSymbol( "RECOMPUTING-SKOLEM-DEFN-INFO-BLIST" ), makeSymbol( "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-INTERNAL" ), makeSymbol( "CLEAR-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY" ), makeSymbol(
          "UNSTASH-KB-OBJECT-LOOKUP-VARS-9" ), makeSymbol( "KBS-DEDUCTION-COUNT" ), makeSymbol( "CLEAR-ALL-ARG-TYPE-PREDICATE-CACHES" ), makeSymbol( "KBS-KILL-UNRUNNABLE-KB-QUERIES" ), makeSymbol(
              "GET-SQS-LIST-QUEUES-COMMAND" ), makeSymbol( "DONT-METER-NART-HL-FORMULA-SWAP-TIME" ), makeSymbol( "FORBIDDEN-KB-COVERING-COLLECTIONS-SET" ), makeSymbol( "GET-GKE-QUANTIFIER-RANGES" ), makeSymbol(
                  "TRANSFORMATION-MODULES-WITH-TRANSFORMATION-MODULE-TESTS" ), makeSymbol( "GET-NEXT-PROOF-VIEW-ID" ), makeSymbol( "CLEAR-QUA-EXPANSION-CYCLS" ), makeSymbol( "GET-GKE-QUANTIFIERS" ), makeSymbol(
                      "INERT-RULES" ), makeSymbol( "CONSTANT-INDEX-MEMORY-MAPPED?" ), makeSymbol( "SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT" ), makeSymbol( "GET-DEFAULT-SENTENCE-STRING-LEXICON" ), makeSymbol(
                          "DO-NARTS-TABLE" ), makeSymbol( "MOST-RECENT-PROBLEM-STORE-SUID" ), makeSymbol( "GET-SKSI-SMT-MODE" ), makeSymbol( "RC-ACT-NEW-STATE" ), makeSymbol( "INITIALIZE-ASSERTION-HL-STORE-CACHE" ),
      makeSymbol( "ENSURE-DELAYED-PROCESSOR-META-DAEMON-RUNNING" ), makeSymbol( "NEW-ASSERTION-CHECKPOINT" ), makeSymbol( "COMPUTE-ASSERTION-ONTOLOGY-LAYER-STATISTICS" ), makeSymbol( "PARTITION-CREATE-INVALID-NART" ),
      makeSymbol( "INFERENCE-CURRENT-SENSE" ), makeSymbol( "OWL-EXPORT-DEFAULT-NAMESPACE" ), makeSymbol( "GENERIC-HL-STORAGE-MODULES" ), makeSymbol( "NEW-KB-CHECKPOINT" ), makeSymbol(
          "CB-USE-ASSERTION-END-DATE-FILTER" ), makeSymbol( "NEW-HAPPINESS-INDEX" ), makeSymbol( "SBHL-ENCOUNTERED-DIFFICULT-NAUT-MT-GENERATOR" ), makeSymbol( "ARG-N-RULE-SUPPORT" ), makeSymbol(
              "FACT-SHEET-BASE-URL-PLACEHOLDER" ), makeSymbol( "SBHL-ENCOUNTERED-DIFFICULT-NAUT-MT-GENERATOR" ), makeSymbol( "MAKE-NEW-RDF-GRAPH" ), makeSymbol( "NOTE-SHOULD-PROPAGATE-REWRITE-OF-CNF" ), makeSymbol(
                  "GET-SBHL-GOAL-NODE" ), makeSymbol( "SC-STORAGE-MT" ), makeSymbol( "OWL-PROPERTY-ELEMENT-NAMES-INTERNAL" ), makeSymbol( "CLEAR-CACHED-LEXICAL-VARS" ), makeSymbol( "DEREGISTER-CYCLIFY-PARSER" ),
      makeSymbol( "CLEAR-ALL-API-WIDGETS-CACHES" ), makeSymbol( "NEW-PPH-API-PARAM-ITERATOR" ), makeSymbol( "BACKWARD-PROBLEM-STORE-HISTORICAL-COUNT" ), makeSymbol( "CLEAR-WEB-CONCEPTUALLY-RELATED" ), makeSymbol(
          "REMOVE-COUNTRIES-TO-REGIONS" ), makeSymbol( "PREDICATES-WITH-SPECIFIC-HL-STORAGE-MODULES" ), makeSymbol( "ENTITY-MENTIONS-PROOF-POSSIBLE?-INTERNAL" ), makeSymbol( "MULTI-SKOLEM-SKOLEMS" ), makeSymbol(
              "JAVA-BACKEND-COMPUTE-PACKAGE-PREFIX" ), makeSymbol( "CYCL-UPTIME" ), makeSymbol( "REBUILD-COMPUTABLE-BUT-NOT-DUMPABLE-YET" ), makeSymbol( "CLEAR-CODE-MAPPING-SKS-CACHE" ), makeSymbol(
                  "CLEAR-SCALAR-FUNCTION?" ), makeSymbol( "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED" ), makeSymbol( "COMPUTE-KBS-RAW-CONSTANTS" ), makeSymbol( "CITIES-TO-COUNTRIES" ), makeSymbol(
                      "CLEAR-CONSTANT-COMPLETION-TABLE" ), makeSymbol( "COMPILE-KB-HEALTH-STATISTICS" ), makeSymbol( "HTML-PROBLEM-LAYOUT-VISUALIZATION-PAGE-CSS" ), makeSymbol( "CLEAR-ALL-API-WIDGETS-CACHES" ),
      makeSymbol( "CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON" ), makeSymbol( "CLEAR-SKSI-SUPPORTED-BROWSING-CACHES" ), makeSymbol( "WITHIN-UNASSERT?" ), makeSymbol(
          "GET-ILP-EXPORT-OUTPUT-MODES-QUERY-PROPERTIES" ), makeSymbol( "CLEAR-VARIABLE-ORDER-COLLECTION?" ), makeSymbol( "PARTITION-SCOPE" ), makeSymbol( "FACT-SHEET-DEFAULT-DOMAIN-MT-INTERNAL" ), makeSymbol(
              "CURRENT-MT-RELEVANCE-MT-CONTEXT" ), makeSymbol( "DELAYED-PROCESSOR-META-DAEMON-RUN" ), makeSymbol( "GENL-ARGS-TO-QUERIES" ), makeSymbol( "PROCESS-BLOCK" ), makeSymbol( "CLEAR-MODAL-WORDS" ), makeSymbol(
                  "INITIALIZE-JAVA-BACKEND-FUNCTION-TABLES" ), makeSymbol( "INSERT-KB-NOT-CURRENT-MESSAGE" ), makeSymbol( "IS-JAVA-BACKEND-LOGGING-ACTIVE?" ), makeSymbol( "RULES-THAT-TOTALLY-SUCK" ), makeSymbol(
                      "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS" ), makeSymbol( "LOCAL-HL-TRANSCRIPT-VERSION" ), makeSymbol( "REMOVAL-ASK-ANSWER-COUNT" ), makeSymbol( "MWP-RULE-CONSTRAINT-TABLE-INIT" ),
      makeSymbol( "GET-SBHL-PREDICATES-INT" ), makeSymbol( "CLEAR-RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN" ), makeSymbol( "CLEAR-LATE-ASSERTIONS" ), makeSymbol( "GET-SUBCOLLECTION-PATTERNS-FROM-KB" ), makeSymbol(
          "MAKE-NEW-SBHL-GRAPH" ), makeSymbol( "GET-KB-UNREPRESENTED-TERM-RAW-NEW-SPACE-SIZE" ), makeSymbol( "CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-INTERNAL" ), makeSymbol( "ENABLE-HLMTS" ), makeSymbol(
              "LOCAL-TRANSCRIPT-VERSION" ), makeSymbol( "DECLARE-GEN-TEMPLATE-STORE-NOT-KNOWN-STALE" ), makeSymbol( "L2R-SENTENCE-STRING-INDEXICAL-INTERNAL" ), makeSymbol( "INITIALIZE-GENLS-MODULE" ), makeSymbol(
                  "MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON" ), makeSymbol( "WITHIN-SKSI-SQL-CONNECTION-RESOURCING?" ), makeSymbol( "CLEAR-SKSI-CORBA-MODULES" ), makeSymbol( "GET-FILE-BACKED-KB-HL-SUPPORT-ID-THRESHOLD" ),
      makeSymbol( "SBHL-SUSPEND-NEW-SPACES?" ), makeSymbol( "FACT-SHEET-PPH-DEMERIT-CUTOFF" ), makeSymbol( "CYC-KBI-FEATURE" ), makeSymbol( "XREF-REFERENCE-SCOPE" ), makeSymbol( "RESET-NAT-ISA-LINKS" ), makeSymbol(
          "ALLOW-DOCUMENT-TAGGER-RESTRICTED-WEB-SERVICE" ), makeSymbol( "CLEAR-FRAME-ARG-OF-PRED-CACHED-INT" ), makeSymbol( "WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?" ), makeSymbol( "DETECT-CYC-PRODUCT" ), makeSymbol(
              "ABBREVIATION-PREDICATES" ), makeSymbol( "SET-CYC-SECURE-KB-LOADED" ), makeSymbol( "INCREMENT-DEPENDENT-LINK-HISTORICAL-COUNT" ), makeSymbol( "META-SPLIT-CRITERIA" ), makeSymbol( "AGENDA-LOGS-ERRORS?" ),
      makeSymbol( "UNSET-KCT-KB-LOADED" ), makeSymbol( "CLEAR-PSP-CATEGORY-FROM-FRAME" ), makeSymbol( "DOLLAR-SIGN-PLUS-NUMBER-FST" ), makeSymbol( "CLEAR-GENERATE-SKSI-SLRM-REQUIRED-FUNCTION" ), makeSymbol(
          "CYCL-FOR-SUBL-RULE-SUPPORT" ), makeSymbol( "SF-NEXT-ID" ), makeSymbol( "RESIZE-ALL-KB-OBJECT-MANAGER-LRU-CACHES" ), makeSymbol( "CB-OPTIONS-HISTORY-AND-BROWSER-TOOL" ), makeSymbol(
              "REMOVE-L2R-SENTENCE-STRING-NUMBER-INDEXICAL" ), makeSymbol( "DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE" ), makeSymbol( "REMOVE-SCOPED-PARTITION" ), makeSymbol(
                  "CLEAR-MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED" ), makeSymbol( "PSP-AGENT" ), makeSymbol( "JAVA-LINK-DEBUG-MODE?" ), makeSymbol( "CLEAR-PSP-SYNTACTIC-CONSTRAINT-TYPES" ), makeSymbol(
                      "CLEAR-PPH-VAR-TYPES" ), makeSymbol( "SCOOP-FETCH-NEXT-OUTGOING-MESSAGE-PACKET" ), makeSymbol( "COMPILE-KB-HEALTH-STATISTICS" ), makeSymbol( "FORTS-TYPED-SIBLING-DISJOINT-COLLECTION" ), makeSymbol(
                          "PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?" ), makeSymbol( "FACT-SHEET-PARAPHRASE-SOFT-TIMEOUT-TIME-REACHED?" ), makeSymbol( "SOFTWARE-VERSION" ), makeSymbol(
                              "INITIALIZE-JAVA-BACKEND-GLOBAL-TABLES" ), makeSymbol( "ABORT-AGENDA" ), makeSymbol( "CB-PARTITION-LOAD-PERSONAL-SECTION" ), makeSymbol( "RDF-PARSER-TEST-FILES" ), makeSymbol(
                                  "DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE" ), makeSymbol( "PPH-BREAK-ON-ERROR?" ), makeSymbol( "MT-DIMENSION-TYPES" ), makeSymbol(
                                      "CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol( "DELETED-ASSERTION-ID-ITERATOR" ), makeSymbol( "CLEAR-RL-MODULE-STORE-IF-CORRUPT" ), makeSymbol(
                                          "INITIALIZE-ARITIES" ), makeSymbol( "CLEAR-DEFAULT-MEDICAL-TAGGING-LEXICON" ), makeSymbol( "MAYBE-EVAL-FORMS" ), makeSymbol( "NEW-MWP-PARSE-SET" ), makeSymbol(
                                              "UNSTASH-KB-OBJECT-LOOKUP-VARS-4" ), makeSymbol( "TERMPARAPHRASEFN-NP" ), makeSymbol( "GET-BTREE" ), makeSymbol( "CLEAR-CACHED-GKE-FUNCTIONS" ), makeSymbol(
                                                  "REGISTER-ALL-SKSI-CORBA-MODULES" ), makeSymbol( "CLEAR-PRED-ARGS-CONSTRAINTS-ACCESSED-IN-SPACES?" ), makeSymbol( "SCOPE-KB-DIFF-DEDUCTIONS" ), makeSymbol(
                                                      "PPH-PHRASE-ID-INDEX" ), makeSymbol( "ENSURE-POS-TEMPLATE-MAPPINGS-INITIALIZED" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-14" ), makeSymbol(
                                                          "SKSI-MODULES-ALLOWED-IN-CURRENT-INFERENCE?" ), makeSymbol( "CLEAR-ASSERTION-CONTENT-TABLE" ), makeSymbol( "WNI-LIST-GLOSSES-FOR-EVENT-SYNSETS" ), makeSymbol(
                                                              "TVA-VAR-ARGNUMS" ), makeSymbol( "PLURALPARAPHRASEFN" ), makeSymbol( "GET-HTTP-LOGGING-SEQUENCE-GENERATOR" ), makeSymbol(
                                                                  "CLEAR-CACHED-LEXICAL-ACCESS-FUNCTIONS" ), makeSymbol( "CYC-MEMORY-HOGS-DATA" ), makeSymbol( "CLEAR-EMPLOYEE-EMPLOYERS-AND-MTS" ), makeSymbol(
                                                                      "GET-FILE-BACKED-ASSERTION-ID-THRESHOLD" ), makeSymbol( "GET-KBS-PREREMOVED-ASSERTIONS" ), makeSymbol( "TKB-KBS-SAVE-TERMS-WITHOUT-ISAS" ),
      makeSymbol( "RECOMPUTING-SKOLEM-DEFN-INFO-DEFN" ), makeSymbol( "INCREMENT-FORWARD-INFERENCE-HISTORICAL-COUNT" ), makeSymbol( "CB-CLEAR-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS" ), makeSymbol(
          "PREPARE-PROOF-QUERY-PROPERTIES" ), makeSymbol( "WNI-ACCESS-PATH-PROXY-SERVER" ), makeSymbol( "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL" ), makeSymbol( "PHRASEFORMFN" ), makeSymbol(
              "NEXT-UNREPRESENTED-TERM-SUID" ), makeSymbol( "CLEAR-CONSTANT-INDEX-SWAP-TIME" ), makeSymbol( "CLEAR-CACHED-LEXICAL-ARG-TYPES" ), makeSymbol( "CLEAR-TERM-LEARNER-FACT-STATUS-INT" ), makeSymbol(
                  "UNSTASH-KB-OBJECT-LOOKUP-VARS-13" ), makeSymbol( "CLEAR-NER-CLUSTERS" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE" ), makeSymbol( "BUILD-FACT-SHEET-DEFAULT-LANGUAGE-MT-INTERNAL" ),
      makeSymbol( "LEVIATHAN-HAYSTACK-ALLOWED-RULES" ), makeSymbol( "BESTNLSTRINGFORSENTENCEFN" ), makeSymbol( "GET-NIMD-TASK-STRING-DENOTATION-MAPPER-LEXICON" ), makeSymbol( "TMS-ANY-ASSERTION-BEING-REMOVED?" ),
      makeSymbol( "CLEAR-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT" ), makeSymbol( "CYC-TASK-SCHEDULER-KB-LOADED-P" ), makeSymbol( "SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P" ), makeSymbol(
          "LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY" ), makeSymbol( "ASSERTED-ARGUMENT-TOKENS" ), makeSymbol( "WITHIN-AGENDA" ), makeSymbol( "QUERY-STATIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS" ), makeSymbol(
              "REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS" ), makeSymbol( "ALL-ARG-CONSTRAINT-PREDS" ), makeSymbol( "GC-EPHEMERAL" ), makeSymbol( "CLEAR-OBJECT-TO-STRING" ), makeSymbol( "INITIAL-PROCESS" ), makeSymbol(
                  "FIND-OR-CREATE-PPH-CONTEXT" ), makeSymbol( "FACT-SHEET-DATA-PATH" ), makeSymbol( "CYC-VERSIONED-WORLD-NAME" ), makeSymbol( "PREVIOUS-QUERY-INFERENCE" ), makeSymbol( "REBUILD-RULE-SET" ), makeSymbol(
                      "PREVIOUS-OWL-EXPORT-VERSION-DATES" ), makeSymbol( "INITIALIZE-ACQUAINT-HIGHLY-RELEVANT-RANKINGS" ), makeSymbol( "INITIALIZE-AT-CACHE" ), makeSymbol( "RESET-API-WIDGET-SESSIONS-RESOURCES" ),
      makeSymbol( "PPH-GENERIC-POS-PREDS" ), makeSymbol( "SBHL-FALSE-SEARCH-P" ), makeSymbol( "SUCCESSFUL-BACKWARD-INFERENCE-HISTORICAL-COUNT" ), makeSymbol( "KBS-FORT-STATE-VALID?" ), makeSymbol(
          "GET-QL-INDEX-UPDATE-PROCEDURE" ), makeSymbol( "INITIALIZE-KB-STATE-HASHES" ), makeSymbol( "MISSING-OLD-DEDUCTION-IDS" ), makeSymbol( "INTERRUPT-GENERIC-SEARCH" ), makeSymbol( "CB-HELP-KEYWORDS" ), makeSymbol(
              "CLEAR-RL-MODULE-STORE" ), makeSymbol( "SKSI-REFORMULATE-RECURSION-LIMIT-EXCEEDED?" ), makeSymbol( "KCT-KB-LOADED-P" ), makeSymbol( "CB-PARTITION-LOAD-FILENAME-SECTION" ), makeSymbol(
                  "GEN-TEMPLATE-STORE-NOTE-REVISIONS" ), makeSymbol( "CLEAR-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT" ), makeSymbol( "GET-INTERNAL-RUN-TIME" ), makeSymbol( "HL-TRANSCRIPT-QUEUE-SIZE" ), makeSymbol(
                      "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER" ), makeSymbol( "GET-SBHL-MAP-FUNCTION" ), makeSymbol( "CLEAR-NODES-SUPPRESSED-FROM-FILTER" ), makeSymbol(
                          "SBHL-OBJECT-TYPE-CHECKING-P" ), makeSymbol( "CLEAR-MATCH-RECURSIVE-TEMPLATE-ITEM" ), makeSymbol( "FACT-SHEET-HOURLY-REPORTING-ON?" ), makeSymbol( "SYNCHRONIZE-CONSTANTS-WITH-LOCAL-HL-STORE" ),
      makeSymbol( "SET-RTP-KB-LOADED" ), makeSymbol( "NEW-CACHE-ACCESS-PATH" ), makeSymbol( "GET-ILP-EXPORT-NEGATIVE-EXAMPLE-COLLECTOR" ), makeSymbol( "SHOW-HAYSTACK-STATISTICS" ), makeSymbol(
          "UNSTASH-KB-INDEXING-VARS-3" ), makeSymbol( "CLEAR-VBAR-TEMPLATE-CATEGORY?" ), makeSymbol( "CLEAR-SKSI-GET-DATUM-VAR" ), makeSymbol( "CLEAR-ALL-HTML-STATE" ), makeSymbol( "UIMMA-DEFAULT-DOMAIN-MT" ),
      makeSymbol( "COMPUTE-KBS-NARTS" ), makeSymbol( "RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS" ), makeSymbol( "CB-TD-SEARCH-GUTS" ), makeSymbol( "CLEAR-COMPUTE-TPTP-QUERY-INDEX-NUMBER" ), makeSymbol(
          "PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT-INTERNAL" ), makeSymbol( "REBUILD-ARITY-CACHE" ), makeSymbol( "CLEAR-ALL-RECEIVED-TRANSFORMATION-RULE-STATISTICS" ), makeSymbol( "LOCAL-EXPERIENCE-TRANSCRIPT" ),
      makeSymbol( "CITIES-TO-COUNTRIES" ), makeSymbol( "TEST-PESSIMIZE-ID-INDEX" ), makeSymbol( "PRE-PERCENT-NOT-WFF" ), makeSymbol( "RESET-API-WIDGET-SESSIONS-RESOURCES" ), makeSymbol(
          "UNSTASH-KB-OBJECT-LOOKUP-VARS-8" ), makeSymbol( "CLEAR-MAKE-SBHL-GRAPH-LINK-GENLS" ), makeSymbol( "CB-OPTIONS-TERM-DISPLAY" ), makeSymbol( "NEW-FORT-ID-INDEX-CONSTANTS" ), makeSymbol( "DO-PRERUN-KBS-FNS" ),
      makeSymbol( "CB-DELETE-ALL-PROOF-CHECKER-RULES" ), makeSymbol( "RECLASSIFY-SOMEWHERE-CACHED-PREDS" ), makeSymbol( "KBS-IMAGE-CLEANUP" ), makeSymbol( "NEW-TVA-CACHE-ENTRY" ), makeSymbol(
          "DEDUCTION-MANAGER-MEMORY-MAPPED?" ), makeSymbol( "GATHER-ALL-LIFTING-RULES" ), makeSymbol( "FORGET-USELESS-NARTS-WRT-OPENCYC-UNTIL-QUIESCENCE" ), makeSymbol( "USE-RULE-SET?" ), makeSymbol(
              "DIAGNOSE-ALL-SKOLEMS" ), makeSymbol( "REPORT-CFASL-INVALID-OBJECTS?" ), makeSymbol( "UNBOUND-RULE-INDEX" ), makeSymbol( "GET-ALL-FORMULA-TEMPLATE-DEFINITION-MTS" ), makeSymbol(
                  "L2R-GARBAGE-COLLECTION-QUERY-SPECS" ), makeSymbol( "GET-PARSING-FAITHFULNESS-FILTER-TYPES" ), makeSymbol( "GET-RTP-KB-PARSE-NODE" ), makeSymbol( "NLCONJUNCTIONFN" ), makeSymbol(
                      "HTML-OPTION-SELECTED" ), makeSymbol( "FIND-OR-CREATE-SBHL-ITERATOR-SHELL" ), makeSymbol( "SBHL-SECONDARY-WHAT-MTS-SPACES" ), makeSymbol( "CB-MISSING-ICON" ), makeSymbol(
                          "SBHL-CONTINUE-SEARCH-PATH" ), makeSymbol( "ALL-CORE-UNION-CONSTANTS" ), makeSymbol( "INDEXICAL-HYPOTHESIS-MT" ), makeSymbol( "GET-FILE-BACKED-NART-INTERNAL-ID-THRESHOLD" ), makeSymbol(
                              "KB-HL-SUPPORT-USAGE-COUNTS-ENABLED-P" ), makeSymbol( "CONFIGURE-APP-COLORS" ), makeSymbol( "INITIALIZE-PENNTAG-PHRASE-CATEGORIES" ), makeSymbol( "INITIALIZE-NEGATION-MT-MODULE" ),
      makeSymbol( "SEND-LOCAL-TRANSCRIPT" ), makeSymbol( "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS" ), makeSymbol( "REBUILD-NON-TRUE-ASSERTION-TV-CACHE" ), makeSymbol( "REMOVE-LEADERS-TO-GROUPS" ), makeSymbol(
          "INCREMENT-FORWARD-INFERENCE-HISTORICAL-COUNT" ), makeSymbol( "CORE-KB-FINALIZATION" ), makeSymbol( "COMPUTE-ASSERTION-ONTOLOGY-LAYER-STATISTICS" ), makeSymbol( "DONT-MAINTAIN-ASSERTION-USAGE-COUNTS" ),
      makeSymbol( "PERFORM-FORWARD-INFERENCE" ), makeSymbol( "CLEAR-RELATION-MOST-RESTRICTED-ARG" ), makeSymbol( "DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES" ), makeSymbol( "CLEAR-TERM-CLASSIFICATION-TREE-INFO" ),
      makeSymbol( "CLEAR-FACT-SHEET-DEFAULT-LANGUAGE-MT" ), makeSymbol( "ALLOWED-RULES-UTILITIES" ), makeSymbol( "GET-DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR" ), makeSymbol( "ENSURE-EVENT-BROKER" ), makeSymbol(
          "START-GUARDIAN" ), makeSymbol( "CLEAR-GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT" ), makeSymbol( "GET-SBHL-FALSE-TV" ), makeSymbol( "SKSI-LANGUAGE-SPOKEN-LANGUAGES-GUTS" ), makeSymbol(
              "CB-SHOW-NL-TRIE-GET-STARTING-ENTRY-SPECIFICATION" ), makeSymbol( "RETURN-STRING" ), makeSymbol( "CB-ALL-REWRITE-MODULES" ), makeSymbol( "PPH-TIMEOUT" ), makeSymbol( "INSTANTIATE-SBHL-MARKING-SPACE" ),
      makeSymbol( "INIT-TEMPORALLY-COORIGINATING" ), makeSymbol( "ALL-EXTERNAL-SYMBOLS" ), makeSymbol( "CLEAR-PARSE-AS-TYPE?" ), makeSymbol( "DEPRECATE-OLD-SOURCE-CITATION-FORMAT?" ), makeSymbol(
          "SKSI-CORBA-MODULES-COUNT" ), makeSymbol( "ENSURE-TEMPLATE-RULES-MASTER-INDEX" ), makeSymbol( "SKSI-NEXT-ID" ), makeSymbol( "CLEAR-DEFNS" ), makeSymbol( "SKSI-UNTRACE" ), makeSymbol(
              "CLEAR-ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS" ), makeSymbol( "RECONSTRUCT-UNBOUND-RULE-INDICES" ), makeSymbol( "ENSURE-CYC-TO-PENN-MAP" ), makeSymbol( "DEFN-COLLECTION" ), makeSymbol(
                  "CLEAR-GET-VARIABLES-OF-TYPE-IN-FORMULA" ), makeSymbol( "PPH-KAPPA-JUSTIFICATION-TEMPLATE" ), makeSymbol( "GET-LUCENE-PORT" ), makeSymbol( "NEW-TACTICLESS-STRATEGY" ), makeSymbol(
                      "CLEAR-NL-GENERATION-CACHE-EXCEPTIONS" ), makeSymbol( "CB-CURRENT-PARTITION-SAVE" ), makeSymbol( "UIA-CANNOT-TREAT-COMMENTS-AS-MUMBLING" ), makeSymbol(
                          "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-INTERNAL" ), makeSymbol( "NEW-CONCEPTUALLY-RELATED-MAPPING-TABLE" ), makeSymbol( "ALL-EXTERNAL-SYMBOLS" ), makeSymbol( "INFERENCE-COUNT" ), makeSymbol(
                              "METER-CONSTANT-INDEX-SWAP-TIME" ), makeSymbol( "AUTO-FLUSH-LOGS?" ), makeSymbol( "CANDIDATE-ASSERTION-EL-FORMULA" ), makeSymbol( "CB-MOST-RECENT-SENTENCE" ), makeSymbol(
                                  "CYCLIST-IS-GUEST" ), makeSymbol( "CLEAR-EXPAND-WORD-ITEMS-IN-LIST-INT" ), makeSymbol( "PPH-IRRELEVANCE-CHECK-MT" ), makeSymbol( "INITIALIZE-TVA-CACHES" ), makeSymbol(
                                      "ALL-KB-HL-SUPPORTS" ), makeSymbol( "GET-KB-HL-SUPPORT" ), makeSymbol( "CLEAR-NOTIFY-VISUALIZING-PROBLEM-STORE" ), makeSymbol(
                                          "GATHER-DEFAULT-REFORMULATOR-MODE-PRECEDENCE-FROM-KB" ), makeSymbol( "GET-DEFAULT-SENTENCE-STRING-PARSER" ), makeSymbol( "UNSTASH-KB-OBJECT-LOOKUP-VARS-7" ), makeSymbol(
                                              "PPH-PHRASE-FNS-INITIALIZED?" ), makeSymbol( "CLEANLY-INITIALIZE-SBHL-TIME-MODULES" ), makeSymbol( "NEW-SBHL-SUB-CACHE" ), makeSymbol( "INITIALIZE-FILE-VECTOR-BACKED-MAP" ),
      makeSymbol( "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-IDS" ), makeSymbol( "INITIALIZE-ISA-ARG2-NAUT-TABLE" ), makeSymbol( "PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET" ), makeSymbol(
          "TODAY-ABBREVIATION-STRING" ), makeSymbol( "INITIALIZE-OPEN-CYC-INFERENCE-API-VARS" ), makeSymbol( "GEN-TEMPLATE-STORE-INITIALIZED?" ), makeSymbol( "PERFORM-FORWARD-INFERENCE-NOW" ), makeSymbol(
              "FORTS-TYPED-SIBLING-DISJOINT-COLLECTION" ), makeSymbol( "CONSTANT-INDEX-USAGE-COUNTS-ENABLED?" ), makeSymbol( "CANONICAL-CYC-WORKING-DIRECTORY" ), makeSymbol( "NEW-WNI-PROBLEM-STORE" ), makeSymbol(
                  "EXTERNAL-PROCESSES-SUPPORTED?" ), makeSymbol( "POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE" ), makeSymbol( "NEW-UNREPRESENTED-TERM-ID-THRESHOLD" ), makeSymbol( "CLEAR-WNI-SYNSET-COLLECTION?" ),
      makeSymbol( "GET-JAVA-RED-ROOT-KEY" ), makeSymbol( "CLEAR-NL-TAGS" ), makeSymbol( "REFORMULATOR-RULES-TO-IGNORE" ), makeSymbol( "CYCL-QUERY-SPECIFICATION-NEW" ), makeSymbol( "GET-GKE-QUANTIFIERS" ), makeSymbol(
          "INITIALIZE-ALL-MTS-CACHE-FOR-GENLS" ), makeSymbol( "DEFINITENOUNPPFN" ), makeSymbol( "ROLL-LOCAL-HL-TRANSCRIPT" ), makeSymbol( "COMPUTE-KBS-BROADER-TERM-GAFS" ), makeSymbol( "MAYBE-USE-ENGLISH-TEXT" ),
      makeSymbol( "LEXICON-LOOKUP-MT-INFO" ), makeSymbol( "NON-TRIE-SUBWORD-PREDS-INTERNAL" ), makeSymbol( "RKF-SD-KNOWN-PROBLEM-STORE-PROPERTIES" ), makeSymbol( "WITHIN-SKSI-GLOBAL-RESOURCING?" ), makeSymbol(
          "NEW-DENSE-DEDUCTION-ID-INDEX" ), makeSymbol( "WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET" ), makeSymbol( "RKF-UTTRDR-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES" ), makeSymbol(
              "GET-SOFTWARE-TYPE-AS-RED-KEY-NAME" ), makeSymbol( "NEGATIVE-INFINITY" ), makeSymbol( "GET-UNQUALIFIED-MACHINE-NAME" ), makeSymbol( "FIND-SBHL-ITERATOR-SHELL" ), makeSymbol(
                  "CURRENT-QUERY-ALLOWS-NEW-TERMS?" ), makeSymbol( "HAS-NEW-DEDUCTIONS?" ), makeSymbol( "NEW-ILP-EXPORT-NEGATIVE-EXAMPLE-COLLECTOR" ), makeSymbol( "FACT-SHEET-DEFAULT-DOMAIN-MT-INTERNAL" ), makeSymbol(
                      "CLEAR-LINK-EXECUTE-INT" ), makeSymbol( "PPH-PHRASE-DEFAULT-VERB-PRED" ), makeSymbol( "PREPARE-KB-MINI-DUMP" ), makeSymbol( "NEW-CONSTANT-CHECKPOINT" ), makeSymbol( "SAVE-LOCAL-ASKED-QUERIES" ),
      makeSymbol( "GET-ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS" ), makeSymbol( "SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE" ), makeSymbol( "SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT" ), makeSymbol(
          "GRAMMAR-PERMITS-LIST-AS-TERMINAL?" ), makeSymbol( "GT-LINK-PRED" ), makeSymbol( "AGENT-RECEIVED-MESSSAGE-HANDLER" ), makeSymbol( "WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET" ), makeSymbol(
              "CONSTRUCT-UNREPRESENTED-TERMS-FHT-BASED-ITERATOR" ), makeSymbol( "CLEAR-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" ), makeSymbol( "CURRENT-PARITER-INDEX" ), makeSymbol(
                  "RBP-CHECK-INITIALIZATIONS" ), makeSymbol( "SET-TO-DEAD-RECEIVE" ), makeSymbol( "TEST-PESSIMIZE-ID-INDEX" ), makeSymbol( "NEW-SUM-ACCUMULATOR" ), makeSymbol( "CHECK-AND-POLL" ), makeSymbol(
                      "WHITESPACE-CHARS" ), makeSymbol( "UNSTASH-OTHER-VARS-10" ), makeSymbol( "GET-ALL-URI-PATTERNS" ), makeSymbol( "UNSTASH-INFERENCE-VARS-12" ), makeSymbol( "ASSERTIVE-WFF-RULES" ), makeSymbol(
                          "LOAD-SYSTEM-PARAMETERS" ), makeSymbol( "INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE" ), makeSymbol( "FIND-OR-CREATE-PPH-ISA-CONTEXT" ), makeSymbol(
                              "CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE" ), makeSymbol( "CB-SERVER-STATUS-HELP" ), makeSymbol( "CB-SUBL-DOC-DISCLAIMER" ), makeSymbol( "CLEAR-TERM-CLASSIFICATION-TREE-INFO" ),
      makeSymbol( "RESET-RKF-IRRELEVANT-FORT-CACHE" ), makeSymbol( "INIT-TEMPORALLY-COTERMINAL" ), makeSymbol( "USE-TRANSCRIPT-SERVER" ), makeSymbol( "RBP-UNTRACE" ), makeSymbol( "WNI-MAPPED-TERMS" ), makeSymbol(
          "CLEAR-LILLIPUT-CACHES" ), makeSymbol( "CLEANUP-BROKEN-JAVA-API-SOCKETS" ), makeSymbol( "FORGET-SYNTACTICALLY-INVALID-NEW-KB-HL-SUPPORTS" ), makeSymbol( "CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS" ), makeSymbol(
              "TEST-CATEGORIZED-TIMING" ), makeSymbol( "COLLECTION-INTERSECTION-SPECS-RULE-SUPPORT" ), makeSymbol( "DESTROY-ALL-PROBLEM-STORES" ), makeSymbol( "CLEAR-ADD-TVA-CACHE-KEY-CACHED" ), makeSymbol(
                  "TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES" ), makeSymbol( "GATHER-ALL-TOP-LEVEL-REGISTERED-KNOWLEDGE-SOURCES" ), makeSymbol( "MAPPING-FUNCALL-INT" ), makeSymbol( "STOP-CB-EVENT-DISPATCHER" ),
      makeSymbol( "CYCL-UPTIME" ), makeSymbol( "NL-TRIE-KNOWN-STALE-P" ), makeSymbol( "COMPUTE-CACHED-PREDICATES-FROM-ALL-MTS-CACHE" ), makeSymbol( "PROBABLY-MOST-RECENT-ASSERTION" ), makeSymbol(
          "DEFAULT-REPORT-PROPERTIES" ), makeSymbol( "ARETE-NARTS-TOUCHED-COUNT" ), makeSymbol( "PLOT-IMAGE-FORMAT-AND-EXTENSION" ), makeSymbol( "CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?" ), makeSymbol(
              "REMOVE-RBP-RB-ALL-RULES-SORTED" ), makeSymbol( "CHECK-WFF-ARITY?" ), makeSymbol( "TRANSCRIPT-DIRECTORY" ), makeSymbol( "SOME-EXTERNAL-REMOVAL-MODULES?" ), makeSymbol( "WITHIN-DISJUNCTION?" ), makeSymbol(
                  "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER" ), makeSymbol( "GET-SBHL-TERMINATING-MARKING-SPACE" ), makeSymbol( "FORCE-STANFORD-PARSER-AVAILABLE?" ), makeSymbol(
                      "GENERIC-REMOVAL-MODULE-COUNT" ), makeSymbol( "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS-COUNT" ), makeSymbol( "PPH-EMPTY-CYCL" ), makeSymbol( "UNSTASH-INFERENCE-VARS-11" ), makeSymbol(
                          "CLEAR-UNBOUND-RULE-INDEX" ), makeSymbol( "CLEAR-RULE-AFTER-REMOVINGS" ), makeSymbol( "GET-QL-INDEX-DISTANCE" ), makeSymbol( "CLEAR-ICON-RELATIVE-PATH-FOR-SOURCE" ), makeSymbol(
                              "CURRENT-GENERATION-LEVEL" ), makeSymbol( "SBHL-CLOSURE-SEARCH-P" ), makeSymbol( "CLEAR-FACT-SHEET-DEFAULT-LANGUAGE-MT" ), makeSymbol( "RESET-UNCACHE-SUF-DEFN-METERS" ), makeSymbol(
                                  "UNSTASH-INFERENCE-VARS-6" ), makeSymbol( "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT" ), makeSymbol( "ALL-ARG-CONSTRAINT-PREDS" ), makeSymbol( "NEW-RULE-ITERATOR" ), makeSymbol(
                                      "CLEAR-DIFFERENTIATING-GENLS" ), makeSymbol( "TRANSFORMATION-LINK-HISTORICAL-COUNT" ), makeSymbol( "PPH-CURRENT-ARG0-POSITION" ), makeSymbol( "GET-QL-INDEX-PORT" ), makeSymbol(
                                          "RESET-RTP-COMPLETELY" ), makeSymbol( "CLEAR-AT-ARGN-INT-CACHED" ), makeSymbol( "CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS" ), makeSymbol( "CLEAR-EVALUATABLE-EXPORT-CACHES" ),
      makeSymbol( "INITIAL-FORWARD-INFERENCE-METRIC-TIME" ), makeSymbol( "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL" ), makeSymbol( "CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE" ), makeSymbol(
          "ENSURE-POS-TEMPLATE-MAPPINGS-INITIALIZED" ), makeSymbol( "INITIALIZE-GAF-AFTER-ADDINGS-HASH" ), makeSymbol( "LAST-WFF-CHECKED-ASSERTION-ID" ), makeSymbol(
              "ENGLISH-GENERATION-FORT-CACHE-MOST-RECENT-AVAILABLE?" ), makeSymbol( "GET-ALL-LSBS" ), makeSymbol( "NEW-COUNT-ACCUMULATOR" ), makeSymbol( "CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?" ), makeSymbol(
                  "PPH-IDENTITY-MAP" ), makeSymbol( "GHL-BACKWARD-DIRECTION" ), makeSymbol( "GET-KBS-PRERUN-FNS" ), makeSymbol( "NEW-ASSERTIONS-ITERATOR" ), makeSymbol( "NCP-INITIALIZE-METRICS" ), makeSymbol(
                      "SKOS-CORE-NAMESPACE" ), makeSymbol( "UNSTASH-KB-INDEXING-VARS-10" ), makeSymbol( "NL-KB-LOADED-P" ), makeSymbol( "MAX-GEN-TEMPLATE-PHRASE-ID" ), makeSymbol( "GET-ALL-PARSING-PRINCIPLES" ),
      makeSymbol( "CLEAR-WNI-ALL-HYPONYMS-HELPER" ), makeSymbol( "CB-NOTE-NO-FOCAL-INFERENCE" ), makeSymbol( "SHOW-INSTANTIATED-HAYSTACK-STATISTICS" ), makeSymbol( "GET-RED-VALUE-FOR-DEFAULT-JAVA-HOME" ), makeSymbol(
          "REGEX-VERSION" ), makeSymbol( "RESET-TERM-CLASSIFICATION-TREE" ), makeSymbol( "NEW-HTML-STATE" ), makeSymbol( "CLEAR-STRICTLY-WFF-IN-ALL-SPEC-MTS?" ), makeSymbol( "NPP-INIT-EXCLUDED-NAME-PREDS" ), makeSymbol(
              "COMPUTE-SPARQL-ORACLE-QUERY-TIMEOUT" ), makeSymbol( "POPULATE-SCHEDULED-QUERY-QUEUE" ), makeSymbol( "FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE" ), makeSymbol( "OPTIMIZE-SBHL-STORE" ), makeSymbol(
                  "DONT-METER-ASSERTION-CONTENT-SWAP-TIME" ), makeSymbol( "ST-HTML-LEGEND" ), makeSymbol( "CLEAR-DENOTATUM-ARG-OF-PRED-CACHED-INT" ), makeSymbol( "REMOTE-QUEUE-SIZE" ), makeSymbol(
                      "CLEAR-TEMPLATE-RULES-MASTER-INDEX" ), makeSymbol( "CLEAR-STRING-TO-INTERVAL-CACHED" ), makeSymbol( "ASSUME-NL-TRIE-VALID?" ), makeSymbol( "WNI-REVIEW-FACT-SLOTS-INTERNAL" ), makeSymbol(
                          "PSP-AGENT" ), makeSymbol( "BACKCHAINING-ON-IST-ENABLED?" ), makeSymbol( "INDEXICAL-SECONDS-SINCE-1970" ), makeSymbol( "NEW-CB-QUERY-SPECIAL-VARIABLE-STATE" ), makeSymbol(
                              "RECOMPUTING-SKOLEM-DEFN-INFO-DEFN" ), makeSymbol( "STRATEGIST-WANTS-RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?" ), makeSymbol( "CLEAR-PSP-KEYWORDS-FOR-FRAME" ), makeSymbol(
                                  "CLEAR-CACHED-ALL-NEGATION-INVERSES" ), makeSymbol( "INITIALIZE-NEGATION-MT-MODULE" ), makeSymbol( "CURRENT-COMPLEX-INDEX-KEYS" ), makeSymbol( "CLEAR-CACHED-CNF-CLAUSAL-FORM" ),
      makeSymbol( "SBHL-SUSPEND-NEW-SPACES?" ), makeSymbol( "HTML-BR" ), makeSymbol( "NEW-FHT-SUID-ITEM" ), makeSymbol( "INVALID-HYPHEN-SEQUENCE" ), makeSymbol( "CLEAR-JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE" ),
      makeSymbol( "CB-PROOF-VIEW-DESTROYER" ), makeSymbol( "FORWARD-INFERENCE-ALL-RULES-ALLOWED?" ), makeSymbol( "RESET-OLD-QUOTED-DEFNS-ADMIT?-METERS" ), makeSymbol( "PERFORM-INDEXING-PRE-DUMP-CLEANUP" ), makeSymbol(
          "LINK-REGEX-PATTERNS-INITIALIZED?" ), makeSymbol( "CURRENT-MT-RELEVANCE-MT" ), makeSymbol( "NPP-INIT-EXCLUDED-NAME-PREDS" ), makeSymbol( "UNSTASH-INFERENCE-VARS-4" ), makeSymbol(
              "HISTORICAL-PROBLEM-CREATION-TIMES" ), makeSymbol( "WNI-PROBLEM-STORE-PROPERTIES" ), makeSymbol( "CLEAR-TERM-LEARNER-TYPES-FOR-FRAGMENT" ), makeSymbol( "ASSERTION-CONS-SHARING-DICTIONARY" ), makeSymbol(
                  "GET-ALL-TRANSCRIPTS-IMAGE" ), makeSymbol( "INFERENCE-GENL-INVERSES-ARE-RELEVANT?" ), makeSymbol( "L2R-SUPERTEXT-INDEXICAL-INTERNAL" ), makeSymbol( "PPH-QUANTIFIER-KEYWORDS" ), makeSymbol(
                      "ENSURE-POS-TEMPLATE-MAPPINGS-INITIALIZED" ), makeSymbol( "SCOPE-KB-DIFF-ASSERTIONS" ), makeSymbol( "DO-CONSTANTS-TABLE" ), makeSymbol( "XREF-GLOBAL-SCOPE" ), makeSymbol(
                          "NOTE-AT-CACHE-INITIALIZED" ), makeSymbol( "CTEST-ALL-KB-TEST-METRIC-CONSTANTS" ), makeSymbol( "AT-CONSIDERING-ATOMIC-SENTENCE-P" ), makeSymbol( "ALLOW-FACT-SHEET-SCREENSAVERS" ), makeSymbol(
                              "OWL-IMPORTER-ID-INDEX" ), makeSymbol( "NEW-DEDUCTION-ID-THRESHOLD" ), makeSymbol( "CURRENT-TS-FILE" ), makeSymbol( "CLEAR-NODES-SUPPRESSED-FROM-FILTER" ), makeSymbol(
                                  "COMPUTE-AVERAGE-NUMBER-OF-FORTS-MENTIONED-IN-REFORMULATOR-RULES" ), makeSymbol( "GET-SBHL-WHAT-MTS-SWEEP-DISJOINS-MODULE" ), makeSymbol( "INITIALIZE-CB-RTV-PREDICATES" ), makeSymbol(
                                      "INITIALIZE-SEMANTIC-ETL-INFRASTRUCTURE" ), makeSymbol( "CLEAR-MDW-GRAPH" ), makeSymbol( "CURRENT-OWL-IMPORTER" ), makeSymbol( "NOUN-COMPOUND-CONSTRAINT-STRING-SPECS" ), makeSymbol(
                                          "ENSURE-SWAPPABLE-TVA-CACHE-LOCK" ), makeSymbol( "PPH-GENERATE-MORPHOLOGICAL-ALTERNATIVES?" ), makeSymbol( "INITIALIZE-CONSTANT-NAMES-IN-CODE" ), makeSymbol(
                                              "GET-SBHL-LINK-DIRECTION-AS-LIST" ), makeSymbol( "AVERAGE-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT" ), makeSymbol( "KILL-UNUSED-INSTANTIATED-CONSTANTS" ), makeSymbol(
                                                  "CLEAR-FACT-SHEET-LABEL-FOR-CATEGORY" ), makeSymbol( "CURRENT-XREF-SYSTEM" ), makeSymbol( "GET-SBHL-FORWARD-DIRECTED-DIRECTION" ), makeSymbol(
                                                      "TERMPARAPHRASEFN-COUNTYWITHSTATEORPROVINCENAME" ), makeSymbol( "GET-ALL-URI-PATTERNS" ), makeSymbol( "HALT-JAVA-API-LEASE-MONITOR" ), makeSymbol(
                                                          "CLEAR-PQDS-DEPTH" ), makeSymbol( "FORWARD-INFERENCE-METRICS-TIME-INDEX" ), makeSymbol( "GET-SBHL-SEARCH-BEHAVIOR" ), makeSymbol( "DISABLE-AGENDA-DAILY-GC" ),
      makeSymbol( "MAKE-RELATION-INSTANCE-EXISTS-SUPPORT" ), makeSymbol( "INITIALIZE-HTTP-RESTRICTED-FUNCTIONS" ), makeSymbol( "SBHL-NEW-SPACE-SOURCE" ), makeSymbol( "REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE" ),
      makeSymbol( "MAX-GEN-TEMPLATE-PHRASE-ID" ), makeSymbol( "GET-CURRENT-COOKIES-FOR-REQUEST" ), makeSymbol( "SET-DONT-CHECK-WFF-SEMANTICS" ), makeSymbol( "UNSTASH-INFERENCE-VARS-6" ), makeSymbol(
          "INITIALIZE-CORE-FORT-TABLE" ), makeSymbol( "MACHINE-VERSION" ), makeSymbol( "NL-TRIE-REVISIONS-STALE?-INTERNAL" ), makeSymbol( "REDO-SYSTEM-CODE-INITIALIZATIONS" ), makeSymbol(
              "ARETE-CONSTANTS-TOUCHED-COUNT" ), makeSymbol( "WITHIN-FACT-SHEET-PARAPHRASE?" ), makeSymbol( "CYC-RETRIEVAL-FEATURE" ), makeSymbol( "SBHL-TEMPORALITY-DATE-SUCCESSION" ), makeSymbol(
                  "CB-ALL-PARTITION-METHODS" ), makeSymbol( "CSS-KEYWORDS" ), makeSymbol( "INITIALIZE-LEXICON-KB-FEATURE" ), makeSymbol( "CLEAR-PSP-RULES" ), makeSymbol( "ONLY-SPECIFIED-MT-IS-RELEVANT?" ), makeSymbol(
                      "CACHED-LOAD-ALL-HAYSTACKS-INTERNAL" ), makeSymbol( "WNI-ACCESS-PATH-SERVER" ), makeSymbol( "CLEAR-CAE-QUERY-SEARCH-FILTER-STRING" ), makeSymbol( "DECLARE-NL-TRIE-NOT-KNOWN-STALE" ), makeSymbol(
                          "CB-MYCREATIONPURPOSE-FILTER" ), makeSymbol( "CLEAR-NORMALIZE-CURE-USER" ), makeSymbol( "GET-ALL-PARSING-FILTERS" ), makeSymbol( "CLEAR-SPP-MORE-BASIC?-CACHED" ), makeSymbol(
                              "CLEAR-GET-ISA-RESTRICTIONS-FROM-SENTENCE" )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_research_cyc_init_file();
  }

  @Override
  public void initializeVariables()
  {
    init_research_cyc_init_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_research_cyc_init_file();
  }
  static
  {
    me = new research_cyc_init();
    $research_cyc_initialization_methods$ = null;
    $master_license_key$ = null;
    $research_cyc_license_key_invalid_string$ = null;
    $research_cyc_license_key_expired_string$ = null;
    $stashed_kb_object_lookup_vars$ = null;
    $stashed_kb_object_content_vars$ = null;
    $stashed_kb_indexing_vars$ = null;
    $stashed_inference_vars$ = null;
    $stashed_other_vars$ = null;
    $sym0$_RESEARCH_CYC_INITIALIZATION_METHODS_ = makeSymbol( "*RESEARCH-CYC-INITIALIZATION-METHODS*" );
    $list1 = _constant_1_initializer();
    $sym2$_MASTER_LICENSE_KEY_ = makeSymbol( "*MASTER-LICENSE-KEY*" );
    $str3$ResearchCyc_License_Key_has_not_b = makeString( "ResearchCyc License Key has not been provided." );
    $str4$ResearchCyc_License_Key_invalid_ = makeString( "ResearchCyc License Key invalid." );
    $str5$Your_current_Cyc_license_is_no_lo = makeString( "Your current Cyc license is no longer valid.\nTo renew your license, please contact us at license@cyc.com." );
    $sym6$STRINGP = makeSymbol( "STRINGP" );
    $int7$24 = makeInteger( 24 );
    $str8$0000_0000_0000_0000_0000 = makeString( "0000-0000-0000-0000-0000" );
    $list9 = ConsesLow.list( Characters.CHAR_hyphen );
    $int10$256 = makeInteger( 256 );
    $list11 = ConsesLow.list( TWELVE_INTEGER, TEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, THREE_INTEGER );
    $list12 = ConsesLow.list( makeSymbol( "NYBBLE4" ), makeSymbol( "NYBBLE3" ), makeSymbol( "NYBBLE2" ), makeSymbol( "NYBBLE1" ), makeSymbol( "NYBBLE0" ) );
    $int13$20000000 = makeInteger( 20000000 );
    $int14$65536 = makeInteger( 65536 );
    $int15$4096 = makeInteger( 4096 );
    $sym16$UNIVERSAL_DATE_P = makeSymbol( "UNIVERSAL-DATE-P" );
    $sym17$_STASHED_KB_OBJECT_LOOKUP_VARS_ = makeSymbol( "*STASHED-KB-OBJECT-LOOKUP-VARS*" );
    $kw18$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym19$_CONSTANT_FROM_GUID_ = makeSymbol( "*CONSTANT-FROM-GUID*" );
    $sym20$_CONSTANT_FROM_SUID_ = makeSymbol( "*CONSTANT-FROM-SUID*" );
    $sym21$_NART_FROM_ID_ = makeSymbol( "*NART-FROM-ID*" );
    $sym22$_ASSERTION_FROM_ID_ = makeSymbol( "*ASSERTION-FROM-ID*" );
    $sym23$_DEDUCTION_FROM_ID_ = makeSymbol( "*DEDUCTION-FROM-ID*" );
    $list24 = ConsesLow.list( makeSymbol( "ONE" ), makeSymbol( "TWO" ), makeSymbol( "THREE" ), makeSymbol( "FOUR" ), makeSymbol( "FIVE" ) );
    $sym25$_STASHED_KB_OBJECT_CONTENT_VARS_ = makeSymbol( "*STASHED-KB-OBJECT-CONTENT-VARS*" );
    $sym26$_CONSTANT_GUID_TABLE_ = makeSymbol( "*CONSTANT-GUID-TABLE*" );
    $sym27$_NART_HL_FORMULA_TABLE_ = makeSymbol( "*NART-HL-FORMULA-TABLE*" );
    $sym28$_ASSERTION_CONTENT_MANAGER_ = makeSymbol( "*ASSERTION-CONTENT-MANAGER*" );
    $list29 = ConsesLow.list( makeSymbol( "ONE" ), makeSymbol( "TWO" ), makeSymbol( "THREE" ) );
    $sym30$_STASHED_KB_INDEXING_VARS_ = makeSymbol( "*STASHED-KB-INDEXING-VARS*" );
    $sym31$_CONSTANT_INDEX_MANAGER_ = makeSymbol( "*CONSTANT-INDEX-MANAGER*" );
    $sym32$_NART_INDEX_MANAGER_ = makeSymbol( "*NART-INDEX-MANAGER*" );
    $list33 = ConsesLow.list( makeSymbol( "ONE" ), makeSymbol( "TWO" ) );
    $sym34$_STASHED_INFERENCE_VARS_ = makeSymbol( "*STASHED-INFERENCE-VARS*" );
    $sym35$_SBHL_MODULES_ = makeSymbol( "*SBHL-MODULES*" );
    $sym36$_ISA_CACHE_ = makeSymbol( "*ISA-CACHE*" );
    $sym37$_ALL_MTS_ISA_CACHE_ = makeSymbol( "*ALL-MTS-ISA-CACHE*" );
    $sym38$_GENLS_CACHE_ = makeSymbol( "*GENLS-CACHE*" );
    $sym39$_ALL_MTS_GENLS_CACHE_ = makeSymbol( "*ALL-MTS-GENLS-CACHE*" );
    $sym40$_GENL_PREDICATE_CACHE_ = makeSymbol( "*GENL-PREDICATE-CACHE*" );
    $sym41$_GENL_INVERSE_CACHE_ = makeSymbol( "*GENL-INVERSE-CACHE*" );
    $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_ = makeSymbol( "*ALL-MTS-GENL-PREDICATE-CACHE*" );
    $sym43$_ALL_MTS_GENL_INVERSE_CACHE_ = makeSymbol( "*ALL-MTS-GENL-INVERSE-CACHE*" );
    $sym44$_SBHL_MODULE_KEY_TEST_ = makeSymbol( "*SBHL-MODULE-KEY-TEST*" );
    $list45 = ConsesLow.list( new SubLObject[] { makeSymbol( "ONE" ), makeSymbol( "TWO" ), makeSymbol( "THREE" ), makeSymbol( "FOUR" ), makeSymbol( "FIVE" ), makeSymbol( "SIX" ), makeSymbol( "SEVEN" ), makeSymbol(
        "EIGHT" ), makeSymbol( "NINE" )
    } );
    $sym46$_STASHED_OTHER_VARS_ = makeSymbol( "*STASHED-OTHER-VARS*" );
    $sym47$_SUBL_EVAL_METHOD_ = makeSymbol( "*SUBL-EVAL-METHOD*" );
    $sym48$_HTML_HANDLER_PROPERTY_ = makeSymbol( "*HTML-HANDLER-PROPERTY*" );
  }
}
/*
 *
 * Total time: 3489 ms
 *
 */