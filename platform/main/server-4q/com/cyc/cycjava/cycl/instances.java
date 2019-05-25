package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class instances
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.instances";
  public static final String myFingerPrint = "035c64c37aefe44c978129329daf6c46a75c30bc494505298d044292739df65a";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 850L)
  public static SubLSymbol $instances_instance_slot_access_violation$;
  private static final SubLString $str0$Cannot_access__A_slot__S_from_ins;
  private static final SubLString $str1$NEW_INSTANCE__Class__S_is_an_abst;
  private static final SubLString $str2$GET_SLOT___S_has_no__S_slot_;
  private static final SubLString $str3$SET_SLOT___S_has_no__S_slot_;
  private static final SubLString $str4$INSTANCES_ACCESS_CHECK_INSTANCE_S;
  private static final SubLString $str5$INSTANCES_ACCESS_CHECK_INSTANCE_S;
  private static final SubLString $str6$INSTANCES_ACCESS_CHECK_INSTANCE_S;
  private static final SubLSymbol $kw7$PROTECTED;
  private static final SubLSymbol $sym8$CLASS_NAME;
  private static final SubLSymbol $kw9$PRIVATE;
  private static final SubLSymbol $kw10$PUBLIC;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$CLASSES_GETF;
  private static final SubLSymbol $sym13$INSTANCE_PLIST;
  private static final SubLString $str14$SUBLOOP_EXPORT_SLOTS__Cannot_expo;
  private static final SubLString $str15$SUBLOOP_EXPORT_SLOTS__Cannot_expo;
  private static final SubLSymbol $sym16$GET_SLOT;
  private static final SubLSymbol $sym17$QUOTE;
  private static final SubLList $list18;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 979L)
  public static SubLObject new_instance(final SubLObject class_name_or_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject is_symbol = Types.symbolp( class_name_or_class );
    final SubLObject is_class = makeBoolean( NIL == is_symbol && NIL != subloop_structures.class_p( class_name_or_class ) );
    if( NIL != is_symbol || NIL != is_class )
    {
      final SubLObject v_class = ( NIL != is_symbol ) ? classes.classes_retrieve_class( class_name_or_class ) : class_name_or_class;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != subloop_class_properties.get_subloop_class_property_abstract_p( v_class ) )
      {
        Errors.error( $str1$NEW_INSTANCE__Class__S_is_an_abst, subloop_structures.class_name( v_class ) );
      }
      final SubLObject boolean_slot_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class );
      final SubLObject boolean_slot_count = Sequences.length( boolean_slot_alist );
      final SubLObject boolean_slot_vector = boolean_slot_count.numG( ZERO_INTEGER ) ? ZERO_INTEGER : NIL;
      final SubLObject any_slot_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class );
      final SubLObject any_slot_count = Sequences.length( any_slot_alist );
      final SubLObject any_slot_vector = any_slot_count.numG( ZERO_INTEGER ) ? Vectors.make_vector( any_slot_count, UNPROVIDED ) : NIL;
      final SubLObject instance = subloop_structures.make_instance( UNPROVIDED );
      final SubLObject initializer = subloop_structures.class_instance_initialization_function( v_class );
      if( NIL != any_slot_vector )
      {
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( any_slot_count ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          Vectors.set_aref( any_slot_vector, i, NIL );
        }
      }
      subloop_structures._csetf_instance_class( instance, v_class );
      subloop_structures._csetf_instance_boolean_slots( instance, boolean_slot_vector );
      subloop_structures._csetf_instance_any_slots( instance, any_slot_vector );
      subloop_structures._csetf_instance_plist( instance, NIL );
      if( NIL != initializer )
      {
        Functions.funcall( initializer, instance );
      }
      return instance;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2405L)
  public static SubLObject direct_instance_of_p(final SubLObject instance, final SubLObject class_or_class_name)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      final SubLObject true_class = ( NIL != subloop_structures.class_p( class_or_class_name ) ) ? class_or_class_name : classes.classes_retrieve_class( class_or_class_name );
      if( NIL != true_class )
      {
        return Equality.eq( subloop_structures.instance_class( instance ), true_class );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2733L)
  public static SubLObject instance_of_p(final SubLObject instance, final SubLObject oop_type)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      if( NIL == oop_type )
      {
        return NIL;
      }
      if( NIL != subloop_structures.class_p( oop_type ) )
      {
        final SubLObject direct_class = subloop_structures.instance_class( instance );
        return ( NIL != conses_high.member( oop_type, subloop_structures.class_compiled_inheritance_path( direct_class ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
      }
      if( NIL != subloop_structures.interface_p( oop_type ) )
      {
        final SubLObject direct_class = subloop_structures.instance_class( instance );
        return classes.classes_implements_p( direct_class, oop_type );
      }
      if( oop_type.isSymbol() )
      {
        final SubLObject direct_class = subloop_structures.instance_class( instance );
        SubLObject structure = classes.classes_retrieve_class( oop_type );
        if( NIL != structure )
        {
          return ( NIL != conses_high.member( structure, subloop_structures.class_compiled_inheritance_path( direct_class ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
        }
        structure = interfaces.interfaces_retrieve_interface( oop_type );
        if( NIL != structure )
        {
          return classes.classes_implements_p( direct_class, structure );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3572L)
  public static SubLObject get_slot(final SubLObject instance_class_or_class_name, final SubLObject slot_name)
  {
    if( NIL != subloop_structures.instance_p( instance_class_or_class_name ) )
    {
      final SubLObject value = get_instance_slot( instance_class_or_class_name, slot_name );
      if( NIL != classes.class_implements_slot_listeners_p( subloop_structures.instance_class( instance_class_or_class_name ) ) )
      {
        slot_listeners.slot_listeners_fire_all_get_slot_listeners( instance_class_or_class_name, slot_name, value );
      }
      return value;
    }
    if( NIL != subloop_structures.class_p( instance_class_or_class_name ) )
    {
      return classes.get_class_slot( instance_class_or_class_name, slot_name );
    }
    if( instance_class_or_class_name.isSymbol() )
    {
      final SubLObject v_class = classes.classes_retrieve_class( instance_class_or_class_name );
      if( NIL != subloop_structures.class_p( v_class ) )
      {
        return classes.get_class_slot( v_class, slot_name );
      }
    }
    Errors.error( $str2$GET_SLOT___S_has_no__S_slot_, instance_class_or_class_name, slot_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4385L)
  public static SubLObject set_slot(final SubLObject instance_class_or_class_name, final SubLObject slot_name, final SubLObject value)
  {
    if( NIL != subloop_structures.instance_p( instance_class_or_class_name ) )
    {
      set_instance_slot( instance_class_or_class_name, slot_name, value );
      slot_listeners.slot_listeners_fire_all_set_slot_listeners( instance_class_or_class_name, slot_name, value );
      return value;
    }
    if( NIL != subloop_structures.class_p( instance_class_or_class_name ) )
    {
      return classes.set_class_slot( instance_class_or_class_name, slot_name, value );
    }
    if( instance_class_or_class_name.isSymbol() )
    {
      final SubLObject v_class = classes.classes_retrieve_class( instance_class_or_class_name );
      if( NIL != subloop_structures.class_p( v_class ) )
      {
        return classes.set_class_slot( v_class, slot_name, value );
      }
    }
    Errors.error( $str3$SET_SLOT___S_has_no__S_slot_, instance_class_or_class_name, slot_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5096L)
  public static SubLObject instances_access_check_instance_slot(final SubLObject v_class, final SubLObject instance, final SubLObject slot)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
    {
      Errors.error( $str4$INSTANCES_ACCESS_CHECK_INSTANCE_S, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instance )
    {
      Errors.error( $str5$INSTANCES_ACCESS_CHECK_INSTANCE_S, instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == slot )
    {
      Errors.error( $str6$INSTANCES_ACCESS_CHECK_INSTANCE_S, slot );
    }
    final SubLObject pcase_var = slots.slot_protection( slot );
    if( pcase_var.eql( $kw7$PROTECTED ) )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( slots.slot_class_name( slot ), subloop_structures.class_compiled_inheritance_path( v_class ), Symbols.symbol_function( EQ ),
          Symbols.symbol_function( $sym8$CLASS_NAME ) ) )
      {
        Errors.error( $instances_instance_slot_access_violation$.getGlobalValue(), new SubLObject[] { $kw7$PROTECTED, slots.slot_name( slot ), instance, subloop_structures.class_name( v_class )
        } );
      }
    }
    else if( pcase_var.eql( $kw9$PRIVATE ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !subloop_structures.class_name( v_class ).eql( slots.slot_class_name( slot ) ) && ( NIL == classes.superclassp(
        classes.$curclass$.getDynamicValue( thread ), v_class ) || !subloop_structures.class_name( classes.$curclass$.getDynamicValue( thread ) ).eql( slots.slot_class_name( slot ) ) ) )
    {
      Errors.error( $instances_instance_slot_access_violation$.getGlobalValue(), new SubLObject[] { $kw9$PRIVATE, slots.slot_name( slot ), instance, subloop_structures.class_name( v_class )
      } );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6027L)
  public static SubLObject instances_access_check_slot(final SubLObject v_class, final SubLObject slot_name)
  {
    if( NIL != subloop_structures.class_p( v_class ) && slot_name.isSymbol() && NIL != slot_name )
    {
      final SubLObject slot = classes.classes_get_slot( v_class, slot_name );
      if( NIL != slot )
      {
        final SubLObject protection = slots.slot_protection( slot );
        final SubLObject slot_class_name = slots.slot_class_name( slot );
        final SubLObject name = subloop_structures.class_name( v_class );
        final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path( v_class );
        final SubLObject pcase_var = protection;
        if( pcase_var.eql( $kw10$PUBLIC ) )
        {
          return T;
        }
        if( pcase_var.eql( $kw7$PROTECTED ) )
        {
          return ( NIL != conses_high.member( slot_class_name, compiled_inheritance_path, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym8$CLASS_NAME ) ) ) ? T : NIL;
        }
        if( pcase_var.eql( $kw9$PRIVATE ) )
        {
          return Equality.eq( slot_class_name, name );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6598L)
  public static SubLObject instances_filter_slots_per_access(final SubLObject v_class, final SubLObject slot_names)
  {
    SubLObject filtered_slot_names = NIL;
    SubLObject cdolist_list_var = slot_names;
    SubLObject slot_name = NIL;
    slot_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != instances_access_check_slot( v_class, slot_name ) )
      {
        filtered_slot_names = ConsesLow.cons( slot_name, filtered_slot_names );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot_name = cdolist_list_var.first();
    }
    return Sequences.nreverse( filtered_slot_names );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6885L)
  public static SubLObject instances_access_check_method(final SubLObject v_class, final SubLObject method)
  {
    if( NIL != subloop_structures.class_p( v_class ) && NIL != subloop_structures.method_p( method ) )
    {
      final SubLObject protection = subloop_structures.method_protection( method );
      final SubLObject method_class_name = subloop_structures.method_class_name( method );
      final SubLObject name = subloop_structures.class_name( v_class );
      final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path( v_class );
      final SubLObject pcase_var = protection;
      if( pcase_var.eql( $kw10$PUBLIC ) )
      {
        return T;
      }
      if( pcase_var.eql( $kw7$PROTECTED ) )
      {
        return ( NIL != conses_high.member( method_class_name, compiled_inheritance_path, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym8$CLASS_NAME ) ) ) ? T : NIL;
      }
      if( pcase_var.eql( $kw9$PRIVATE ) )
      {
        return Equality.eq( method_class_name, name );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7362L)
  public static SubLObject instances_access_check_method_name(final SubLObject v_class, final SubLObject method_name)
  {
    if( NIL != subloop_structures.class_p( v_class ) && method_name.isSymbol() && NIL != method_name )
    {
      final SubLObject method = methods.methods_get_method( v_class, method_name );
      if( NIL != method )
      {
        return instances_access_check_method( v_class, method );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7650L)
  public static SubLObject instances_filter_methods_per_access(final SubLObject v_class, final SubLObject v_methods)
  {
    SubLObject filtered_methods = NIL;
    SubLObject cdolist_list_var = v_methods;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != instances_access_check_method( v_class, method ) )
      {
        filtered_methods = ConsesLow.cons( method, filtered_methods );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return Sequences.nreverse( filtered_methods );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7917L)
  public static SubLObject instances_filter_method_names_per_access(final SubLObject v_class, final SubLObject method_names)
  {
    SubLObject filtered_method_names = NIL;
    SubLObject cdolist_list_var = method_names;
    SubLObject method_name = NIL;
    method_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != instances_access_check_method_name( v_class, method_name ) )
      {
        filtered_method_names = ConsesLow.cons( method_name, filtered_method_names );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method_name = cdolist_list_var.first();
    }
    return Sequences.nreverse( filtered_method_names );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8234L)
  public static SubLObject get_instance_slot(final SubLObject instance, final SubLObject slot_name)
  {
    final SubLObject v_class = subloop_structures.instance_class( instance );
    SubLObject association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_slot_access_alist( v_class ) );
    if( NIL != association )
    {
      instances_access_check_instance_slot( v_class, instance, association );
      return Vectors.aref( subloop_structures.instance_any_slots( instance ), slots.slot_index( association ) );
    }
    association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    if( NIL != association )
    {
      instances_access_check_instance_slot( v_class, instance, association );
      return classes.ldb_test( bytes.sublisp_byte( ONE_INTEGER, slots.slot_index( association ) ), subloop_structures.instance_boolean_slots( instance ) );
    }
    return classes.get_class_slot( v_class, slot_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8948L)
  public static SubLObject set_instance_slot(final SubLObject instance, final SubLObject slot_name, final SubLObject value)
  {
    final SubLObject v_class = subloop_structures.instance_class( instance );
    SubLObject association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_slot_access_alist( v_class ) );
    if( NIL != association )
    {
      instances_access_check_instance_slot( v_class, instance, association );
      return Vectors.set_aref( subloop_structures.instance_any_slots( instance ), slots.slot_index( association ), value );
    }
    association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    if( NIL != association )
    {
      instances_access_check_instance_slot( v_class, instance, association );
      subloop_structures._csetf_instance_boolean_slots( instance, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, bytes.sublisp_byte( ONE_INTEGER, slots.slot_index( association ) ), subloop_structures
          .instance_boolean_slots( instance ) ) );
      return value;
    }
    return classes.set_class_slot( v_class, slot_name, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9751L)
  public static SubLObject instances_all_class_slots(final SubLObject instance)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( instance );
      return classes.classes_all_class_slots( v_class, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9940L)
  public static SubLObject instances_all_instance_slots(final SubLObject instance)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( instance );
      return classes.classes_all_instance_slots( v_class, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10135L)
  public static SubLObject instances_all_any_instance_slots(final SubLObject instance)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( instance );
      return classes.classes_all_any_instance_slots( v_class, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10338L)
  public static SubLObject instances_all_slots(final SubLObject instance)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( instance );
      return classes.classes_all_slots( v_class, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10515L)
  public static SubLObject instance_get_property_internal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    SubLObject indicator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    indicator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym12$CLASSES_GETF, ConsesLow.list( $sym13$INSTANCE_PLIST, instance ), indicator );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10651L)
  public static SubLObject instance_get_property(final SubLObject instance, final SubLObject indicator)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      return classes.classes_getf( subloop_structures.instance_plist( instance ), indicator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10817L)
  public static SubLObject instance_set_property(final SubLObject instance, final SubLObject indicator, final SubLObject value)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      subloop_structures._csetf_instance_plist( instance, classes.classes_putf( subloop_structures.instance_plist( instance ), indicator, value ) );
      return value;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11042L)
  public static SubLObject subloop_export_slots(final SubLObject instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( instance ) )
    {
      Errors.error( $str14$SUBLOOP_EXPORT_SLOTS__Cannot_expo, instance );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str15$SUBLOOP_EXPORT_SLOTS__Cannot_expo, instance );
    }
    final SubLObject v_class_$4 = v_class;
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class_$4 );
    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class_$4 );
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class_$4 );
    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class_$4 );
    SubLObject all_slots = NIL;
    SubLObject var_name = NIL;
    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var;
      var_name = ( item_var = slots.slot_name( slot ) );
      if( NIL == conses_high.member( item_var, all_slots, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        all_slots = ConsesLow.cons( item_var, all_slots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    var_name = NIL;
    cdolist_list_var = compiled_instance_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var;
      var_name = ( item_var = slots.slot_name( slot ) );
      if( NIL == conses_high.member( item_var, all_slots, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        all_slots = ConsesLow.cons( item_var, all_slots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    var_name = NIL;
    cdolist_list_var = compiled_class_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var;
      var_name = ( item_var = slots.slot_name( slot ) );
      if( NIL == conses_high.member( item_var, all_slots, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        all_slots = ConsesLow.cons( item_var, all_slots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    var_name = NIL;
    cdolist_list_var = compiled_class_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var;
      var_name = ( item_var = slots.slot_name( slot ) );
      if( NIL == conses_high.member( item_var, all_slots, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        all_slots = ConsesLow.cons( item_var, all_slots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = all_slots;
    SubLObject slot2 = NIL;
    slot2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != slot2 && slot2.isSymbol() )
      {
        Symbols.set( slot2, get_slot( instance, slot2 ) );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      slot2 = cdolist_list_var2.first();
    }
    return all_slots;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11957L)
  public static SubLObject subloop_compose_accessors(final SubLObject instance, final SubLObject slot_list)
  {
    if( NIL == slot_list )
    {
      return instance;
    }
    return ConsesLow.list( $sym16$GET_SLOT, subloop_compose_accessors( instance, slot_list.rest() ), ConsesLow.list( $sym17$QUOTE, slot_list.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12181L)
  public static SubLObject get_composed_slots(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    instance = current.first();
    final SubLObject slot_list;
    current = ( slot_list = current.rest() );
    return subloop_compose_accessors( instance, slot_list );
  }

  public static SubLObject declare_instances_file()
  {
    SubLFiles.declareFunction( me, "new_instance", "NEW-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "direct_instance_of_p", "DIRECT-INSTANCE-OF-P", 2, 0, false );
    SubLFiles.declareFunction( me, "instance_of_p", "INSTANCE-OF-P", 2, 0, false );
    SubLFiles.declareFunction( me, "get_slot", "GET-SLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_slot", "SET-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "instances_access_check_instance_slot", "INSTANCES-ACCESS-CHECK-INSTANCE-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "instances_access_check_slot", "INSTANCES-ACCESS-CHECK-SLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "instances_filter_slots_per_access", "INSTANCES-FILTER-SLOTS-PER-ACCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "instances_access_check_method", "INSTANCES-ACCESS-CHECK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "instances_access_check_method_name", "INSTANCES-ACCESS-CHECK-METHOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "instances_filter_methods_per_access", "INSTANCES-FILTER-METHODS-PER-ACCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "instances_filter_method_names_per_access", "INSTANCES-FILTER-METHOD-NAMES-PER-ACCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_instance_slot", "GET-INSTANCE-SLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_instance_slot", "SET-INSTANCE-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "instances_all_class_slots", "INSTANCES-ALL-CLASS-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "instances_all_instance_slots", "INSTANCES-ALL-INSTANCE-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "instances_all_any_instance_slots", "INSTANCES-ALL-ANY-INSTANCE-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "instances_all_slots", "INSTANCES-ALL-SLOTS", 1, 0, false );
    SubLFiles.declareMacro( me, "instance_get_property_internal", "INSTANCE-GET-PROPERTY-INTERNAL" );
    SubLFiles.declareFunction( me, "instance_get_property", "INSTANCE-GET-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "instance_set_property", "INSTANCE-SET-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_export_slots", "SUBLOOP-EXPORT-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_compose_accessors", "SUBLOOP-COMPOSE-ACCESSORS", 2, 0, false );
    SubLFiles.declareMacro( me, "get_composed_slots", "GET-COMPOSED-SLOTS" );
    return NIL;
  }

  public static SubLObject init_instances_file()
  {
    $instances_instance_slot_access_violation$ = SubLFiles.defconstant( "*INSTANCES-INSTANCE-SLOT-ACCESS-VIOLATION*", $str0$Cannot_access__A_slot__S_from_ins );
    return NIL;
  }

  public static SubLObject setup_instances_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_instances_file();
  }

  @Override
  public void initializeVariables()
  {
    init_instances_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_instances_file();
  }
  static
  {
    me = new instances();
    $instances_instance_slot_access_violation$ = null;
    $str0$Cannot_access__A_slot__S_from_ins = makeString( "Cannot access ~A slot ~S from instance ~S of class ~S." );
    $str1$NEW_INSTANCE__Class__S_is_an_abst = makeString( "NEW-INSTANCE: Class ~S is an abstract class.  Abstract classes cannot be instantiated." );
    $str2$GET_SLOT___S_has_no__S_slot_ = makeString( "GET-SLOT: ~S has no ~S slot." );
    $str3$SET_SLOT___S_has_no__S_slot_ = makeString( "SET-SLOT: ~S has no ~S slot." );
    $str4$INSTANCES_ACCESS_CHECK_INSTANCE_S = makeString( "INSTANCES-ACCESS-CHECK-INSTANCE-SLOT: ~S is not a class." );
    $str5$INSTANCES_ACCESS_CHECK_INSTANCE_S = makeString( "INSTANCES-ACCESS-CHECK-INSTANCE-SLOT: ~S is not an instance." );
    $str6$INSTANCES_ACCESS_CHECK_INSTANCE_S = makeString( "INSTANCES-ACCESS-CHECK-INSTANCE-SLOT: ~S is not a slot." );
    $kw7$PROTECTED = makeKeyword( "PROTECTED" );
    $sym8$CLASS_NAME = makeSymbol( "CLASS-NAME" );
    $kw9$PRIVATE = makeKeyword( "PRIVATE" );
    $kw10$PUBLIC = makeKeyword( "PUBLIC" );
    $list11 = ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol( "INDICATOR" ) );
    $sym12$CLASSES_GETF = makeSymbol( "CLASSES-GETF" );
    $sym13$INSTANCE_PLIST = makeSymbol( "INSTANCE-PLIST" );
    $str14$SUBLOOP_EXPORT_SLOTS__Cannot_expo = makeString( "SUBLOOP-EXPORT-SLOTS: Cannot export slots of non instance ~S." );
    $str15$SUBLOOP_EXPORT_SLOTS__Cannot_expo = makeString( "SUBLOOP-EXPORT-SLOTS: Cannot export slots of deformed instance ~S." );
    $sym16$GET_SLOT = makeSymbol( "GET-SLOT" );
    $sym17$QUOTE = makeSymbol( "QUOTE" );
    $list18 = ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol( "&BODY" ), makeSymbol( "SLOT-LIST" ) );
  }
}
/*
 * 
 * Total time: 186 ms
 * 
 */