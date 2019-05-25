package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class new_cycl_query_specification
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.new_cycl_query_specification";
  public static final String myFingerPrint = "24f81262bd29feb6a1bfe71fd8113ca78a249ac22b114a9f268e470ee651e1b8";
  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLSymbol $dtp_new_cycl_query_specification$;
  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 17180L)
  private static SubLSymbol $new_cycl_query_parameter_set$;
  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 18700L)
  private static SubLSymbol $new_cycl_query_encoding_extent$;
  private static final SubLSymbol $sym0$NEW_CYCL_QUERY_SPECIFICATION;
  private static final SubLSymbol $sym1$NEW_CYCL_QUERY_SPECIFICATION_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$NEW_CYCL_QUERY_SPECIFICATION_PRINT;
  private static final SubLSymbol $sym7$NEW_CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$NEW_CYCL_QUERY_SPEC_CYCL_ID;
  private static final SubLSymbol $sym10$_CSETF_NEW_CYCL_QUERY_SPEC_CYCL_ID;
  private static final SubLSymbol $sym11$NEW_CYCL_QUERY_SPEC_FORMULA;
  private static final SubLSymbol $sym12$_CSETF_NEW_CYCL_QUERY_SPEC_FORMULA;
  private static final SubLSymbol $sym13$NEW_CYCL_QUERY_SPEC_MT;
  private static final SubLSymbol $sym14$_CSETF_NEW_CYCL_QUERY_SPEC_MT;
  private static final SubLSymbol $sym15$NEW_CYCL_QUERY_SPEC_COMMENT;
  private static final SubLSymbol $sym16$_CSETF_NEW_CYCL_QUERY_SPEC_COMMENT;
  private static final SubLSymbol $sym17$NEW_CYCL_QUERY_SPEC_PROPERTIES;
  private static final SubLSymbol $sym18$_CSETF_NEW_CYCL_QUERY_SPEC_PROPERTIES;
  private static final SubLSymbol $sym19$NEW_CYCL_QUERY_SPEC_INDEXICALS;
  private static final SubLSymbol $sym20$_CSETF_NEW_CYCL_QUERY_SPEC_INDEXICALS;
  private static final SubLSymbol $sym21$NEW_CYCL_QUERY_SPEC_EDITED;
  private static final SubLSymbol $sym22$_CSETF_NEW_CYCL_QUERY_SPEC_EDITED;
  private static final SubLSymbol $kw23$CYCL_ID;
  private static final SubLSymbol $kw24$FORMULA;
  private static final SubLSymbol $kw25$MT;
  private static final SubLSymbol $kw26$COMMENT;
  private static final SubLSymbol $kw27$PROPERTIES;
  private static final SubLSymbol $kw28$INDEXICALS;
  private static final SubLSymbol $kw29$EDITED;
  private static final SubLString $str30$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw31$BEGIN;
  private static final SubLSymbol $sym32$MAKE_NEW_CYCL_QUERY_SPECIFICATION;
  private static final SubLSymbol $kw33$SLOT;
  private static final SubLSymbol $kw34$END;
  private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_NEW_CYCL_QUERY_SPECIFICATION_METHOD;
  private static final SubLString $str36$_NEW_CYCL_QUERY_SPECIFICATION__S_;
  private static final SubLString $str37$_Properties___S_;
  private static final SubLString $str38$_Template_Slots___S_;
  private static final SubLString $str39$__changed__;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$XML_TAG;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$CLET;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str46$cyclQuery;
  private static final SubLString $str47$queryID;
  private static final SubLString $str48$queryFormula;
  private static final SubLString $str49$Can_t_serialize__S____Its_query_f;
  private static final SubLString $str50$queryMt;
  private static final SubLString $str51$queryComment;
  private static final SubLString $str52$queryInferenceProperties;
  private static final SubLString $str53$queryIndexicals;
  private static final SubLString $str54$queryIndexical;
  private static final SubLString $str55$queryInferenceProperty;
  private static final SubLString $str56$propertySymbol;
  private static final SubLString $str57$propertyValue;
  private static final SubLSymbol $kw58$CHANGED;
  private static final SubLSymbol $kw59$INFERENCE_MODE;
  private static final SubLSymbol $sym60$EL_FORMULA_P;
  private static final SubLSymbol $sym61$MICROTHEORY_P;
  private static final SubLObject $const62$TheNthFn;
  private static final SubLSymbol $sym63$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLSymbol $sym64$NEW_CYCL_QUERY_INDEXICAL_P;
  private static final SubLSymbol $sym65$NCQ_INFERENCE_PARAMETER_P;
  private static final SubLSymbol $sym66$LISTP;
  private static final SubLList $list67;
  private static final SubLString $str68$Insufficient_number_of_substituti;
  private static final SubLSymbol $sym69$_NEW_CYCL_QUERY_PARAMETER_SET_;
  private static final SubLObject $const70$InferenceParameter;
  private static final SubLObject $const71$CycAPIMt;
  private static final SubLObject $const72$subLIdentifier;
  private static final SubLSymbol $kw73$TRUE;
  private static final SubLObject $const74$SubLQuoteFn;

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_specification_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    new_cycl_query_specification_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_specification_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $new_cycl_query_specification_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_spec_cycl_id(final SubLObject v_object)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_spec_formula(final SubLObject v_object)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_spec_mt(final SubLObject v_object)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_spec_comment(final SubLObject v_object)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_spec_properties(final SubLObject v_object)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_spec_indexicals(final SubLObject v_object)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject new_cycl_query_spec_edited(final SubLObject v_object)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject _csetf_new_cycl_query_spec_cycl_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject _csetf_new_cycl_query_spec_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject _csetf_new_cycl_query_spec_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject _csetf_new_cycl_query_spec_comment(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject _csetf_new_cycl_query_spec_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject _csetf_new_cycl_query_spec_indexicals(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject _csetf_new_cycl_query_spec_edited(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != new_cycl_query_specification_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject make_new_cycl_query_specification(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $new_cycl_query_specification_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw23$CYCL_ID ) )
      {
        _csetf_new_cycl_query_spec_cycl_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$FORMULA ) )
      {
        _csetf_new_cycl_query_spec_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$MT ) )
      {
        _csetf_new_cycl_query_spec_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$COMMENT ) )
      {
        _csetf_new_cycl_query_spec_comment( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$PROPERTIES ) )
      {
        _csetf_new_cycl_query_spec_properties( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$INDEXICALS ) )
      {
        _csetf_new_cycl_query_spec_indexicals( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$EDITED ) )
      {
        _csetf_new_cycl_query_spec_edited( v_new, current_value );
      }
      else
      {
        Errors.error( $str30$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject visit_defstruct_new_cycl_query_specification(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw31$BEGIN, $sym32$MAKE_NEW_CYCL_QUERY_SPECIFICATION, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw23$CYCL_ID, new_cycl_query_spec_cycl_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw24$FORMULA, new_cycl_query_spec_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw25$MT, new_cycl_query_spec_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw26$COMMENT, new_cycl_query_spec_comment( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw27$PROPERTIES, new_cycl_query_spec_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw28$INDEXICALS, new_cycl_query_spec_indexicals( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw29$EDITED, new_cycl_query_spec_edited( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$END, $sym32$MAKE_NEW_CYCL_QUERY_SPECIFICATION, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632L)
  public static SubLObject visit_defstruct_object_new_cycl_query_specification_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_new_cycl_query_specification( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 3166L)
  public static SubLObject new_cycl_query_specification_print(final SubLObject query_spec, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str36$_NEW_CYCL_QUERY_SPECIFICATION__S_, new SubLObject[] { new_cycl_query_spec_cycl_id( query_spec ), new_cycl_query_spec_formula( query_spec ), new_cycl_query_spec_mt( query_spec ),
      new_cycl_query_spec_comment( query_spec )
    } );
    string_utilities.indent( stream, depth );
    PrintLow.format( stream, $str37$_Properties___S_, new_cycl_query_spec_properties( query_spec ) );
    if( NIL != new_cycl_query_spec_indexicals( query_spec ) )
    {
      PrintLow.format( stream, $str38$_Template_Slots___S_, new_cycl_query_spec_indexicals( query_spec ) );
    }
    if( NIL != new_cycl_query_spec_edited( query_spec ) )
    {
      streams_high.write_string( $str39$__changed__, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_char( Characters.CHAR_greater, stream );
    return query_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 3921L)
  public static SubLObject cycl_query_xml_tag(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject local_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    local_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym41$XML_TAG, reader.bq_cons( local_name, $list42 ), ConsesLow.listS( $sym43$CLET, $list44, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 4142L)
  public static SubLObject xml_serialize_new_cycl_query_specification(final SubLObject cycl_query, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    SubLObject error_message = NIL;
    SubLObject xml_string = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym45$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject stream_$1 = NIL;
          try
          {
            stream_$1 = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0_$2 = xml_vars.$xml_stream$.currentBinding( thread );
            try
            {
              xml_vars.$xml_stream$.bind( stream_$1, thread );
              try
              {
                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str46$cyclQuery, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
                  final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$5 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                    xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                    try
                    {
                      final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                      try
                      {
                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                            thread );
                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                        xml_utilities.xml_start_tag_internal( $str47$queryID, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
                        final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$7 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                          xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                          cycml.cycml_serialize_term( new_cycl_query_spec_cycl_id( cycl_query ) );
                        }
                        finally
                        {
                          xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$7, thread );
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$6, thread );
                        }
                      }
                      finally
                      {
                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$6, thread );
                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$5, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal( $str47$queryID );
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                      }
                    }
                    try
                    {
                      final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                      try
                      {
                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                            thread );
                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                        xml_utilities.xml_start_tag_internal( $str48$queryFormula, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
                        final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$9 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                          xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                          final SubLObject query_formula = new_cycl_query_spec_formula( cycl_query );
                          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == cycl_grammar.cycl_sentence_p( query_formula ) )
                          {
                            Errors.error( $str49$Can_t_serialize__S____Its_query_f, new_cycl_query_spec_cycl_id( cycl_query ), query_formula );
                          }
                          cycml.cycml_serialize_sentence( query_formula );
                        }
                        finally
                        {
                          xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$9, thread );
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$9, thread );
                        }
                      }
                      finally
                      {
                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$8, thread );
                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$8, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal( $str48$queryFormula );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                      }
                    }
                    try
                    {
                      final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                      try
                      {
                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                            thread );
                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                        xml_utilities.xml_start_tag_internal( $str50$queryMt, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
                        final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$11 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                          xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                          cycml.cycml_serialize_term( new_cycl_query_spec_mt( cycl_query ) );
                        }
                        finally
                        {
                          xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$11, thread );
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$12, thread );
                        }
                      }
                      finally
                      {
                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$10, thread );
                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$11, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values3 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal( $str50$queryMt );
                        Values.restoreValuesFromVector( _values3 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                      }
                    }
                    if( NIL != new_cycl_query_spec_comment( cycl_query ) )
                    {
                      try
                      {
                        final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str51$queryComment, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
                          final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$13 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                            xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                            cycml.cycml_serialize_term( new_cycl_query_spec_comment( cycl_query ) );
                          }
                          finally
                          {
                            xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$13, thread );
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$15, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$12, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$14, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values4 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str51$queryComment );
                          Values.restoreValuesFromVector( _values4 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
                        }
                      }
                    }
                    if( NIL != new_cycl_query_spec_properties( cycl_query ) )
                    {
                      try
                      {
                        final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$14 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str52$queryInferenceProperties, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
                          final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$15 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                            xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                            SubLObject remainder;
                            SubLObject property;
                            SubLObject value;
                            for( remainder = NIL, remainder = new_cycl_query_spec_properties( cycl_query ); NIL != remainder; remainder = conses_high.cddr( remainder ) )
                            {
                              property = remainder.first();
                              value = conses_high.cadr( remainder );
                              xml_serialize_inference_parameter( property, value );
                            }
                          }
                          finally
                          {
                            xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$15, thread );
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$18, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$14, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$17, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values5 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str52$queryInferenceProperties );
                          Values.restoreValuesFromVector( _values5 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                        }
                      }
                    }
                    if( NIL != new_cycl_query_spec_indexicals( cycl_query ) )
                    {
                      try
                      {
                        final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str53$queryIndexicals, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
                          final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$17 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                            xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                            SubLObject cdolist_list_var = new_cycl_query_spec_indexicals( cycl_query );
                            SubLObject indexical = NIL;
                            indexical = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              try
                              {
                                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str54$queryIndexical, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
                                  final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$19 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                                    xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                                    cycml.cycml_serialize_term( indexical );
                                  }
                                  finally
                                  {
                                    xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$19, thread );
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$23, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$18, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$22, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values6 = Values.getValuesAsVector();
                                  xml_utilities.xml_terpri();
                                  xml_utilities.xml_end_tag_internal( $str54$queryIndexical );
                                  Values.restoreValuesFromVector( _values6 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
                                }
                              }
                              cdolist_list_var = cdolist_list_var.rest();
                              indexical = cdolist_list_var.first();
                            }
                          }
                          finally
                          {
                            xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$17, thread );
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$21, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$16, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$20, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values7 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str53$queryIndexicals );
                          Values.restoreValuesFromVector( _values7 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
                        }
                      }
                    }
                  }
                  finally
                  {
                    xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$5, thread );
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$3, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values8 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str46$cyclQuery );
                  Values.restoreValuesFromVector( _values8 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
                }
              }
            }
            finally
            {
              xml_vars.$xml_stream$.rebind( _prev_bind_0_$2, thread );
            }
            xml_string = streams_high.get_output_stream_string( stream_$1 );
          }
          finally
          {
            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values9 = Values.getValuesAsVector();
              streams_high.close( stream_$1, UNPROVIDED );
              Values.restoreValuesFromVector( _values9 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
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
      Errors.error( error_message );
    }
    else
    {
      print_high.princ( xml_string, stream );
    }
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 5810L)
  public static SubLObject xml_serialize_inference_parameter(final SubLObject property, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str55$queryInferenceProperty, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
        final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        final SubLObject _prev_bind_1_$44 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
          xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
          try
          {
            final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str56$propertySymbol, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
              final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              final SubLObject _prev_bind_1_$46 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                streams_high.write_string( Symbols.symbol_name( property ), xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$46, thread );
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$45, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$45, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$44, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str56$propertySymbol );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$47 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str57$propertyValue, NIL, NIL, NIL, xml_vars.cycl_query_namespace() );
              final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              final SubLObject _prev_bind_1_$48 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( xml_vars.cycl_query_namespace(), thread );
                xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$cycl_query_include_namespaceP$.getDynamicValue( thread ), thread );
                cycml.cycml_serialize_term( value );
              }
              finally
              {
                xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$48, thread );
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$48, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$47, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$47, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str57$propertyValue );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
            }
          }
        }
        finally
        {
          xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$44, thread );
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$43, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str55$queryInferenceProperty );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 6123L)
  public static SubLObject new_cycl_query_specification_cycl_id(final SubLObject cycl_query)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    return new_cycl_query_spec_cycl_id( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 6338L)
  public static SubLObject new_cycl_query_specification_formula(final SubLObject cycl_query)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    return new_cycl_query_spec_formula( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 6511L)
  public static SubLObject new_cycl_query_specification_mt(final SubLObject cycl_query)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    return new_cycl_query_spec_mt( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 6674L)
  public static SubLObject new_cycl_query_specification_comment(final SubLObject cycl_query)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    return new_cycl_query_spec_comment( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 6847L)
  public static SubLObject new_cycl_query_specification_properties(final SubLObject cycl_query)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    return new_cycl_query_spec_properties( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 7026L)
  public static SubLObject new_cycl_query_specification_indexicals(final SubLObject cycl_query)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    return new_cycl_query_spec_indexicals( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 7205L)
  public static SubLObject new_cycl_query_specification_edited(final SubLObject cycl_query)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    return new_cycl_query_spec_edited( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 7376L)
  public static SubLObject set_new_cycl_query_specification_cycl_id(final SubLObject cycl_query, final SubLObject id)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    _csetf_new_cycl_query_spec_cycl_id( cycl_query, id );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 7581L)
  public static SubLObject set_new_cycl_query_specification_formula(final SubLObject cycl_query, final SubLObject formula)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    _csetf_new_cycl_query_spec_formula( cycl_query, formula );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 7795L)
  public static SubLObject set_new_cycl_query_specification_mt(final SubLObject cycl_query, final SubLObject mt)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    _csetf_new_cycl_query_spec_mt( cycl_query, mt );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 7989L)
  public static SubLObject set_new_cycl_query_specification_comment(final SubLObject cycl_query, final SubLObject comment)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    _csetf_new_cycl_query_spec_comment( cycl_query, comment );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 8203L)
  public static SubLObject set_new_cycl_query_specification_properties(final SubLObject cycl_query, final SubLObject props)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    _csetf_new_cycl_query_spec_properties( cycl_query, props );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 8419L)
  public static SubLObject set_new_cycl_query_specification_properties_eliminating_defaults(final SubLObject cycl_query, final SubLObject props)
  {
    return set_new_cycl_query_specification_properties( cycl_query, inference_parameters.remove_inference_engine_query_property_defaults( props ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 8641L)
  public static SubLObject set_new_cycl_query_specification_indexicals(final SubLObject cycl_query, final SubLObject indexicals)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    _csetf_new_cycl_query_spec_indexicals( cycl_query, indexicals );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 8867L)
  public static SubLObject set_cycl_query_specification_edited(final SubLObject cycl_query)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    _csetf_new_cycl_query_spec_edited( cycl_query, cycl_query );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 9070L)
  public static SubLObject templated_new_cycl_query_specification_p(final SubLObject cycl_query)
  {
    return makeBoolean( NIL != new_cycl_query_specification_indexicals( cycl_query ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 9257L)
  public static SubLObject new_cycl_query_specification_edited_p(final SubLObject cycl_query)
  {
    return new_cycl_query_specification_edited( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 9448L)
  public static SubLObject mark_new_cycl_query_specification_modified(final SubLObject cycl_query)
  {
    _csetf_new_cycl_query_spec_edited( cycl_query, $kw58$CHANGED );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 9601L)
  public static SubLObject update_query_spec_params_using_defaults(final SubLObject query_spec, final SubLObject defaults)
  {
    SubLObject existing_params = new_cycl_query_specification_properties( query_spec );
    SubLObject new_params = conses_high.copy_list( existing_params );
    final SubLObject existing_mode = conses_high.getf( existing_params, $kw59$INFERENCE_MODE, NIL );
    if( NIL != existing_mode )
    {
      existing_params = list_utilities.augment_plist_with_defaults( conses_high.copy_list( existing_params ), inference_parameters.query_properties_for_inference_mode( existing_mode ) );
    }
    SubLObject dirtyP = NIL;
    SubLObject remainder;
    SubLObject param;
    SubLObject value;
    for( remainder = NIL, remainder = defaults; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      param = remainder.first();
      value = conses_high.cadr( remainder );
      if( NIL == list_utilities.plist_has_keyP( existing_params, param ) )
      {
        dirtyP = T;
        new_params = conses_high.putf( new_params, param, value );
      }
    }
    if( NIL != dirtyP )
    {
      set_new_cycl_query_specification_properties( query_spec, new_params );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 10413L)
  public static SubLObject reset_new_cycl_query_specification_formula(final SubLObject cycl_query, final SubLObject formula)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    assert NIL != el_utilities.el_formula_p( formula ) : formula;
    _csetf_new_cycl_query_spec_formula( cycl_query, formula );
    mark_new_cycl_query_specification_modified( cycl_query );
    return new_cycl_query_spec_formula( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 10755L)
  public static SubLObject reset_new_cycl_query_specification_mt(final SubLObject cycl_query, final SubLObject mt)
  {
    assert NIL != new_cycl_query_specification_p( cycl_query ) : cycl_query;
    assert NIL != fort_types_interface.microtheory_p( mt ) : mt;
    _csetf_new_cycl_query_spec_mt( cycl_query, mt );
    mark_new_cycl_query_specification_modified( cycl_query );
    return new_cycl_query_spec_mt( cycl_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 11066L)
  public static SubLObject new_cycl_query_indexical_p(final SubLObject v_object)
  {
    return makeBoolean( ( NIL != narts_high.naut_p( v_object ) && NIL != new_cycl_query_indexical_formula_p( v_object ) ) || ( NIL != nart_handles.nart_p( v_object ) && NIL != new_cycl_query_indexical_formula_p(
        narts_high.nart_el_formula( v_object ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 11387L)
  public static SubLObject new_cycl_query_indexical_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_ternary_formula_p( v_object ) && cycl_utilities.formula_arg0( v_object ).eql( $const62$TheNthFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 11545L)
  public static SubLObject create_new_cycl_query_specification()
  {
    final SubLObject cycl_query = make_new_cycl_query_specification( UNPROVIDED );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 11733L)
  public static SubLObject load_new_cycl_query_specification_from_kb(SubLObject identifier, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != cycl_grammar.cycl_denotational_term_p( identifier ) : identifier;
    final SubLObject cycl_query = create_new_cycl_query_specification();
    if( NIL != function_terms.nat_formula_p( identifier ) )
    {
      final SubLObject nart = narts_high.find_nart( identifier );
      if( NIL != nart )
      {
        identifier = nart;
      }
    }
    _csetf_new_cycl_query_spec_cycl_id( cycl_query, identifier );
    new_cycl_query_specification_load_sentence( identifier, cycl_query );
    new_cycl_query_specification_load_mt( identifier, cycl_query );
    new_cycl_query_specification_load_inference_parameters( identifier, cycl_query );
    analyse_new_cycl_query_specification_for_indexicals( cycl_query );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 12531L)
  public static SubLObject analyse_new_cycl_query_specification_for_indexicals(final SubLObject cycl_query)
  {
    final SubLObject formula = new_cycl_query_spec_formula( cycl_query );
    final SubLObject indexical_list = list_utilities.tree_gather( formula, Symbols.symbol_function( $sym64$NEW_CYCL_QUERY_INDEXICAL_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == list_utilities.empty_list_p( indexical_list ) )
    {
      final SubLObject indexical_set = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
      SubLObject cdolist_list_var = indexical_list;
      SubLObject indexical = NIL;
      indexical = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set.set_add( indexical, indexical_set );
        cdolist_list_var = cdolist_list_var.rest();
        indexical = cdolist_list_var.first();
      }
      _csetf_new_cycl_query_spec_indexicals( cycl_query, indexical_set );
    }
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 13028L)
  public static SubLObject new_cycl_query_specification_load_sentence(final SubLObject identifier, final SubLObject cycl_query)
  {
    final SubLObject sentence = kb_query.kbq_sentence( identifier );
    _csetf_new_cycl_query_spec_formula( cycl_query, czer_main.unquote_quoted_term( sentence, UNPROVIDED ) );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 13264L)
  public static SubLObject new_cycl_query_specification_load_mt(final SubLObject identifier, final SubLObject cycl_query)
  {
    final SubLObject mt = kb_query.kbq_mt( identifier );
    _csetf_new_cycl_query_spec_mt( cycl_query, narts_high.nart_substitute( mt ) );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 13525L)
  public static SubLObject new_cycl_query_specification_load_inference_parameters(final SubLObject identifier, final SubLObject cycl_query)
  {
    final SubLObject v_properties = list_utilities.filter_plist( kb_query.kbq_query_properties( identifier ), $sym65$NCQ_INFERENCE_PARAMETER_P );
    _csetf_new_cycl_query_spec_properties( cycl_query, v_properties );
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 13808L)
  public static SubLObject copy_new_cycl_query_specification(final SubLObject query_spec)
  {
    assert NIL != new_cycl_query_specification_p( query_spec ) : query_spec;
    final SubLObject new_spec = create_new_cycl_query_specification();
    _csetf_new_cycl_query_spec_cycl_id( new_spec, new_cycl_query_spec_cycl_id( query_spec ) );
    _csetf_new_cycl_query_spec_formula( new_spec, el_utilities.copy_formula( new_cycl_query_spec_formula( query_spec ) ) );
    _csetf_new_cycl_query_spec_mt( new_spec, new_cycl_query_spec_mt( query_spec ) );
    _csetf_new_cycl_query_spec_properties( new_spec, conses_high.copy_list( new_cycl_query_spec_properties( query_spec ) ) );
    if( NIL != templated_new_cycl_query_specification_p( query_spec ) )
    {
      _csetf_new_cycl_query_spec_indexicals( new_spec, set.copy_set( new_cycl_query_spec_indexicals( query_spec ) ) );
    }
    mark_new_cycl_query_specification_modified( new_spec );
    return new_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 14820L)
  public static SubLObject instantiate_new_cycl_query_specification_from_template(final SubLObject query_spec, final SubLObject substitutions, SubLObject enforce_full_instantiationP)
  {
    if( enforce_full_instantiationP == UNPROVIDED )
    {
      enforce_full_instantiationP = T;
    }
    assert NIL != new_cycl_query_specification_p( query_spec ) : query_spec;
    assert NIL != Types.listp( substitutions ) : substitutions;
    final SubLObject instantiated_query = copy_new_cycl_query_specification( query_spec );
    final SubLObject indexical_set = new_cycl_query_specification_indexicals( instantiated_query );
    final SubLObject formula = new_cycl_query_specification_formula( instantiated_query );
    SubLObject cdolist_list_var = substitutions;
    SubLObject substitution = NIL;
    substitution = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = substitution;
      SubLObject v_term = NIL;
      SubLObject replacement = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
      v_term = current.first();
      current = ( replacement = current.rest() );
      conses_high.nsubst( replacement, v_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      set.set_remove( v_term, indexical_set );
      cdolist_list_var = cdolist_list_var.rest();
      substitution = cdolist_list_var.first();
    }
    if( NIL != set.set_emptyP( indexical_set ) )
    {
      _csetf_new_cycl_query_spec_indexicals( instantiated_query, NIL );
    }
    else if( NIL != enforce_full_instantiationP )
    {
      Errors.error( $str68$Insufficient_number_of_substituti, set.set_element_list( indexical_set ) );
    }
    return instantiated_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 16137L)
  public static SubLObject new_cycl_query_specification_ask(SubLObject query_spec, SubLObject mt, SubLObject substitutions, SubLObject more_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( substitutions == UNPROVIDED )
    {
      substitutions = NIL;
    }
    if( more_properties == UNPROVIDED )
    {
      more_properties = NIL;
    }
    assert NIL != new_cycl_query_specification_p( query_spec ) : query_spec;
    if( NIL != substitutions )
    {
      query_spec = instantiate_new_cycl_query_specification_from_template( query_spec, substitutions, UNPROVIDED );
    }
    if( NIL == fort_types_interface.microtheory_p( mt ) )
    {
      mt = new_cycl_query_spec_mt( query_spec );
    }
    SubLObject query_properties = new_cycl_query_spec_properties( query_spec );
    query_properties = list_utilities.merge_plist( query_properties, more_properties );
    return inference_kernel.new_cyc_query( new_cycl_query_spec_formula( query_spec ), mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 17415L)
  public static SubLObject get_new_cycl_query_parameter_set()
  {
    ensure_new_cycl_query_parameter_set_initialized();
    return new_cycl_query_parameter_set();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 17562L)
  public static SubLObject ensure_new_cycl_query_parameter_set_initialized()
  {
    if( NIL == is_new_cycl_query_parameter_set_initializedP() )
    {
      initialize_new_cycl_query_parameter_set();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 17748L)
  public static SubLObject is_new_cycl_query_parameter_set_initializedP()
  {
    return makeBoolean( NIL != $new_cycl_query_parameter_set$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 17867L)
  public static SubLObject new_cycl_query_parameter_set()
  {
    return $new_cycl_query_parameter_set$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 17956L)
  public static SubLObject ncq_inference_parameter_p(final SubLObject v_object)
  {
    return set.set_memberP( v_object, get_new_cycl_query_parameter_set() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 18073L)
  public static SubLObject initialize_new_cycl_query_parameter_set()
  {
    $new_cycl_query_parameter_set$.setGlobalValue( compute_new_cycl_query_parameter_set() );
    return new_cycl_query_parameter_set();
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 18253L)
  public static SubLObject compute_new_cycl_query_parameter_set()
  {
    final SubLObject parameters = new_cycl_query_get_all_parameters();
    final SubLObject v_set = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = parameters;
    SubLObject parameter = NIL;
    parameter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject internal_encoding = new_cycl_query_get_internal_encoding_for_parameter( parameter );
      set.set_add( internal_encoding, v_set );
      cdolist_list_var = cdolist_list_var.rest();
      parameter = cdolist_list_var.first();
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 18584L)
  public static SubLObject new_cycl_query_get_all_parameters()
  {
    return isa.all_fort_instances( $const70$InferenceParameter, $const71$CycAPIMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/new-cycl-query-specification.lisp", position = 18838L)
  public static SubLObject new_cycl_query_get_internal_encoding_for_parameter(final SubLObject parameter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject encoding = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $new_cycl_query_encoding_extent$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject encoding_function = kb_mapping_utilities.fpred_value( parameter, $const72$subLIdentifier, ONE_INTEGER, TWO_INTEGER, $kw73$TRUE );
      if( NIL != el_utilities.el_formula_with_operator_p( encoding_function, $const74$SubLQuoteFn ) )
      {
        encoding = cycl_utilities.formula_arg1( encoding_function, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return encoding;
  }

  public static SubLObject declare_new_cycl_query_specification_file()
  {
    SubLFiles.declareFunction( me, "new_cycl_query_specification_print_function_trampoline", "NEW-CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_p", "NEW-CYCL-QUERY-SPECIFICATION-P", 1, 0, false );
    new $new_cycl_query_specification_p$UnaryFunction();
    SubLFiles.declareFunction( me, "new_cycl_query_spec_cycl_id", "NEW-CYCL-QUERY-SPEC-CYCL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_spec_formula", "NEW-CYCL-QUERY-SPEC-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_spec_mt", "NEW-CYCL-QUERY-SPEC-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_spec_comment", "NEW-CYCL-QUERY-SPEC-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_spec_properties", "NEW-CYCL-QUERY-SPEC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_spec_indexicals", "NEW-CYCL-QUERY-SPEC-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_spec_edited", "NEW-CYCL-QUERY-SPEC-EDITED", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_new_cycl_query_spec_cycl_id", "_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_new_cycl_query_spec_formula", "_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_new_cycl_query_spec_mt", "_CSETF-NEW-CYCL-QUERY-SPEC-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_new_cycl_query_spec_comment", "_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_new_cycl_query_spec_properties", "_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_new_cycl_query_spec_indexicals", "_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_new_cycl_query_spec_edited", "_CSETF-NEW-CYCL-QUERY-SPEC-EDITED", 2, 0, false );
    SubLFiles.declareFunction( me, "make_new_cycl_query_specification", "MAKE-NEW-CYCL-QUERY-SPECIFICATION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_new_cycl_query_specification", "VISIT-DEFSTRUCT-NEW-CYCL-QUERY-SPECIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_new_cycl_query_specification_method", "VISIT-DEFSTRUCT-OBJECT-NEW-CYCL-QUERY-SPECIFICATION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_print", "NEW-CYCL-QUERY-SPECIFICATION-PRINT", 3, 0, false );
    SubLFiles.declareMacro( me, "cycl_query_xml_tag", "CYCL-QUERY-XML-TAG" );
    SubLFiles.declareFunction( me, "xml_serialize_new_cycl_query_specification", "XML-SERIALIZE-NEW-CYCL-QUERY-SPECIFICATION", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_serialize_inference_parameter", "XML-SERIALIZE-INFERENCE-PARAMETER", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_cycl_id", "NEW-CYCL-QUERY-SPECIFICATION-CYCL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_formula", "NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_mt", "NEW-CYCL-QUERY-SPECIFICATION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_comment", "NEW-CYCL-QUERY-SPECIFICATION-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_properties", "NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_indexicals", "NEW-CYCL-QUERY-SPECIFICATION-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_edited", "NEW-CYCL-QUERY-SPECIFICATION-EDITED", 1, 0, false );
    SubLFiles.declareFunction( me, "set_new_cycl_query_specification_cycl_id", "SET-NEW-CYCL-QUERY-SPECIFICATION-CYCL-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "set_new_cycl_query_specification_formula", "SET-NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "set_new_cycl_query_specification_mt", "SET-NEW-CYCL-QUERY-SPECIFICATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_new_cycl_query_specification_comment", "SET-NEW-CYCL-QUERY-SPECIFICATION-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_new_cycl_query_specification_properties", "SET-NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_new_cycl_query_specification_properties_eliminating_defaults", "SET-NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES-ELIMINATING-DEFAULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_new_cycl_query_specification_indexicals", "SET-NEW-CYCL-QUERY-SPECIFICATION-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_cycl_query_specification_edited", "SET-CYCL-QUERY-SPECIFICATION-EDITED", 1, 0, false );
    SubLFiles.declareFunction( me, "templated_new_cycl_query_specification_p", "TEMPLATED-NEW-CYCL-QUERY-SPECIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_edited_p", "NEW-CYCL-QUERY-SPECIFICATION-EDITED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_new_cycl_query_specification_modified", "MARK-NEW-CYCL-QUERY-SPECIFICATION-MODIFIED", 1, 0, false );
    SubLFiles.declareFunction( me, "update_query_spec_params_using_defaults", "UPDATE-QUERY-SPEC-PARAMS-USING-DEFAULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_new_cycl_query_specification_formula", "RESET-NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_new_cycl_query_specification_mt", "RESET-NEW-CYCL-QUERY-SPECIFICATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_indexical_p", "NEW-CYCL-QUERY-INDEXICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_indexical_formula_p", "NEW-CYCL-QUERY-INDEXICAL-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "create_new_cycl_query_specification", "CREATE-NEW-CYCL-QUERY-SPECIFICATION", 0, 0, false );
    SubLFiles.declareFunction( me, "load_new_cycl_query_specification_from_kb", "LOAD-NEW-CYCL-QUERY-SPECIFICATION-FROM-KB", 1, 1, false );
    SubLFiles.declareFunction( me, "analyse_new_cycl_query_specification_for_indexicals", "ANALYSE-NEW-CYCL-QUERY-SPECIFICATION-FOR-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_load_sentence", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_load_mt", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_load_inference_parameters", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-INFERENCE-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "copy_new_cycl_query_specification", "COPY-NEW-CYCL-QUERY-SPECIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "instantiate_new_cycl_query_specification_from_template", "INSTANTIATE-NEW-CYCL-QUERY-SPECIFICATION-FROM-TEMPLATE", 2, 1, false );
    SubLFiles.declareFunction( me, "new_cycl_query_specification_ask", "NEW-CYCL-QUERY-SPECIFICATION-ASK", 1, 3, false );
    SubLFiles.declareFunction( me, "get_new_cycl_query_parameter_set", "GET-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_new_cycl_query_parameter_set_initialized", "ENSURE-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "is_new_cycl_query_parameter_set_initializedP", "IS-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_parameter_set", "NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "ncq_inference_parameter_p", "NCQ-INFERENCE-PARAMETER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_new_cycl_query_parameter_set", "INITIALIZE-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_new_cycl_query_parameter_set", "COMPUTE-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_get_all_parameters", "NEW-CYCL-QUERY-GET-ALL-PARAMETERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query_get_internal_encoding_for_parameter", "NEW-CYCL-QUERY-GET-INTERNAL-ENCODING-FOR-PARAMETER", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_new_cycl_query_specification_file()
  {
    $dtp_new_cycl_query_specification$ = SubLFiles.defconstant( "*DTP-NEW-CYCL-QUERY-SPECIFICATION*", $sym0$NEW_CYCL_QUERY_SPECIFICATION );
    $new_cycl_query_parameter_set$ = SubLFiles.deflexical( "*NEW-CYCL-QUERY-PARAMETER-SET*", ( maybeDefault( $sym69$_NEW_CYCL_QUERY_PARAMETER_SET_, $new_cycl_query_parameter_set$, NIL ) ) );
    $new_cycl_query_encoding_extent$ = SubLFiles.deflexical( "*NEW-CYCL-QUERY-ENCODING-EXTENT*", $const71$CycAPIMt );
    return NIL;
  }

  public static SubLObject setup_new_cycl_query_specification_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_new_cycl_query_specification$.getGlobalValue(), Symbols.symbol_function(
        $sym7$NEW_CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$NEW_CYCL_QUERY_SPEC_CYCL_ID, $sym10$_CSETF_NEW_CYCL_QUERY_SPEC_CYCL_ID );
    Structures.def_csetf( $sym11$NEW_CYCL_QUERY_SPEC_FORMULA, $sym12$_CSETF_NEW_CYCL_QUERY_SPEC_FORMULA );
    Structures.def_csetf( $sym13$NEW_CYCL_QUERY_SPEC_MT, $sym14$_CSETF_NEW_CYCL_QUERY_SPEC_MT );
    Structures.def_csetf( $sym15$NEW_CYCL_QUERY_SPEC_COMMENT, $sym16$_CSETF_NEW_CYCL_QUERY_SPEC_COMMENT );
    Structures.def_csetf( $sym17$NEW_CYCL_QUERY_SPEC_PROPERTIES, $sym18$_CSETF_NEW_CYCL_QUERY_SPEC_PROPERTIES );
    Structures.def_csetf( $sym19$NEW_CYCL_QUERY_SPEC_INDEXICALS, $sym20$_CSETF_NEW_CYCL_QUERY_SPEC_INDEXICALS );
    Structures.def_csetf( $sym21$NEW_CYCL_QUERY_SPEC_EDITED, $sym22$_CSETF_NEW_CYCL_QUERY_SPEC_EDITED );
    Equality.identity( $sym0$NEW_CYCL_QUERY_SPECIFICATION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_new_cycl_query_specification$.getGlobalValue(), Symbols.symbol_function(
        $sym35$VISIT_DEFSTRUCT_OBJECT_NEW_CYCL_QUERY_SPECIFICATION_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym69$_NEW_CYCL_QUERY_PARAMETER_SET_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_new_cycl_query_specification_file();
  }

  @Override
  public void initializeVariables()
  {
    init_new_cycl_query_specification_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_new_cycl_query_specification_file();
  }
  static
  {
    me = new new_cycl_query_specification();
    $dtp_new_cycl_query_specification$ = null;
    $new_cycl_query_parameter_set$ = null;
    $new_cycl_query_encoding_extent$ = null;
    $sym0$NEW_CYCL_QUERY_SPECIFICATION = makeSymbol( "NEW-CYCL-QUERY-SPECIFICATION" );
    $sym1$NEW_CYCL_QUERY_SPECIFICATION_P = makeSymbol( "NEW-CYCL-QUERY-SPECIFICATION-P" );
    $list2 = ConsesLow.list( makeSymbol( "CYCL-ID" ), makeSymbol( "FORMULA" ), makeSymbol( "MT" ), makeSymbol( "COMMENT" ), makeSymbol( "PROPERTIES" ), makeSymbol( "INDEXICALS" ), makeSymbol( "EDITED" ) );
    $list3 = ConsesLow.list( makeKeyword( "CYCL-ID" ), makeKeyword( "FORMULA" ), makeKeyword( "MT" ), makeKeyword( "COMMENT" ), makeKeyword( "PROPERTIES" ), makeKeyword( "INDEXICALS" ), makeKeyword( "EDITED" ) );
    $list4 = ConsesLow.list( makeSymbol( "NEW-CYCL-QUERY-SPEC-CYCL-ID" ), makeSymbol( "NEW-CYCL-QUERY-SPEC-FORMULA" ), makeSymbol( "NEW-CYCL-QUERY-SPEC-MT" ), makeSymbol( "NEW-CYCL-QUERY-SPEC-COMMENT" ), makeSymbol(
        "NEW-CYCL-QUERY-SPEC-PROPERTIES" ), makeSymbol( "NEW-CYCL-QUERY-SPEC-INDEXICALS" ), makeSymbol( "NEW-CYCL-QUERY-SPEC-EDITED" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID" ), makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA" ), makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-MT" ), makeSymbol(
        "_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT" ), makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES" ), makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS" ), makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-EDITED" ) );
    $sym6$NEW_CYCL_QUERY_SPECIFICATION_PRINT = makeSymbol( "NEW-CYCL-QUERY-SPECIFICATION-PRINT" );
    $sym7$NEW_CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "NEW-CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "NEW-CYCL-QUERY-SPECIFICATION-P" ) );
    $sym9$NEW_CYCL_QUERY_SPEC_CYCL_ID = makeSymbol( "NEW-CYCL-QUERY-SPEC-CYCL-ID" );
    $sym10$_CSETF_NEW_CYCL_QUERY_SPEC_CYCL_ID = makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID" );
    $sym11$NEW_CYCL_QUERY_SPEC_FORMULA = makeSymbol( "NEW-CYCL-QUERY-SPEC-FORMULA" );
    $sym12$_CSETF_NEW_CYCL_QUERY_SPEC_FORMULA = makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA" );
    $sym13$NEW_CYCL_QUERY_SPEC_MT = makeSymbol( "NEW-CYCL-QUERY-SPEC-MT" );
    $sym14$_CSETF_NEW_CYCL_QUERY_SPEC_MT = makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-MT" );
    $sym15$NEW_CYCL_QUERY_SPEC_COMMENT = makeSymbol( "NEW-CYCL-QUERY-SPEC-COMMENT" );
    $sym16$_CSETF_NEW_CYCL_QUERY_SPEC_COMMENT = makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT" );
    $sym17$NEW_CYCL_QUERY_SPEC_PROPERTIES = makeSymbol( "NEW-CYCL-QUERY-SPEC-PROPERTIES" );
    $sym18$_CSETF_NEW_CYCL_QUERY_SPEC_PROPERTIES = makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES" );
    $sym19$NEW_CYCL_QUERY_SPEC_INDEXICALS = makeSymbol( "NEW-CYCL-QUERY-SPEC-INDEXICALS" );
    $sym20$_CSETF_NEW_CYCL_QUERY_SPEC_INDEXICALS = makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS" );
    $sym21$NEW_CYCL_QUERY_SPEC_EDITED = makeSymbol( "NEW-CYCL-QUERY-SPEC-EDITED" );
    $sym22$_CSETF_NEW_CYCL_QUERY_SPEC_EDITED = makeSymbol( "_CSETF-NEW-CYCL-QUERY-SPEC-EDITED" );
    $kw23$CYCL_ID = makeKeyword( "CYCL-ID" );
    $kw24$FORMULA = makeKeyword( "FORMULA" );
    $kw25$MT = makeKeyword( "MT" );
    $kw26$COMMENT = makeKeyword( "COMMENT" );
    $kw27$PROPERTIES = makeKeyword( "PROPERTIES" );
    $kw28$INDEXICALS = makeKeyword( "INDEXICALS" );
    $kw29$EDITED = makeKeyword( "EDITED" );
    $str30$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw31$BEGIN = makeKeyword( "BEGIN" );
    $sym32$MAKE_NEW_CYCL_QUERY_SPECIFICATION = makeSymbol( "MAKE-NEW-CYCL-QUERY-SPECIFICATION" );
    $kw33$SLOT = makeKeyword( "SLOT" );
    $kw34$END = makeKeyword( "END" );
    $sym35$VISIT_DEFSTRUCT_OBJECT_NEW_CYCL_QUERY_SPECIFICATION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-NEW-CYCL-QUERY-SPECIFICATION-METHOD" );
    $str36$_NEW_CYCL_QUERY_SPECIFICATION__S_ = makeString( "<NEW-CYCL-QUERY-SPECIFICATION ~S ~S in ~S ;; ~A~% " );
    $str37$_Properties___S_ = makeString( " Properties: ~S " );
    $str38$_Template_Slots___S_ = makeString( " Template Slots: ~S " );
    $str39$__changed__ = makeString( " (changed) " );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "LOCAL-NAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym41$XML_TAG = makeSymbol( "XML-TAG" );
    $list42 = ConsesLow.list( NIL, NIL, NIL, NIL, ConsesLow.list( makeSymbol( "CYCL-QUERY-NAMESPACE" ) ) );
    $sym43$CLET = makeSymbol( "CLET" );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CYCML-INCLUDE-NAMESPACE?*" ), makeSymbol( "*CYCL-QUERY-INCLUDE-NAMESPACE?*" ) ) );
    $sym45$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str46$cyclQuery = makeString( "cyclQuery" );
    $str47$queryID = makeString( "queryID" );
    $str48$queryFormula = makeString( "queryFormula" );
    $str49$Can_t_serialize__S____Its_query_f = makeString( "Can't serialize ~S.~% Its query formula is not a valid CycL sentence:~% ~S" );
    $str50$queryMt = makeString( "queryMt" );
    $str51$queryComment = makeString( "queryComment" );
    $str52$queryInferenceProperties = makeString( "queryInferenceProperties" );
    $str53$queryIndexicals = makeString( "queryIndexicals" );
    $str54$queryIndexical = makeString( "queryIndexical" );
    $str55$queryInferenceProperty = makeString( "queryInferenceProperty" );
    $str56$propertySymbol = makeString( "propertySymbol" );
    $str57$propertyValue = makeString( "propertyValue" );
    $kw58$CHANGED = makeKeyword( "CHANGED" );
    $kw59$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $sym60$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym61$MICROTHEORY_P = makeSymbol( "MICROTHEORY-P" );
    $const62$TheNthFn = constant_handles.reader_make_constant_shell( makeString( "TheNthFn" ) );
    $sym63$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $sym64$NEW_CYCL_QUERY_INDEXICAL_P = makeSymbol( "NEW-CYCL-QUERY-INDEXICAL-P" );
    $sym65$NCQ_INFERENCE_PARAMETER_P = makeSymbol( "NCQ-INFERENCE-PARAMETER-P" );
    $sym66$LISTP = makeSymbol( "LISTP" );
    $list67 = ConsesLow.cons( makeSymbol( "TERM" ), makeSymbol( "REPLACEMENT" ) );
    $str68$Insufficient_number_of_substituti = makeString( "Insufficient number of substitutions -- indexicals ~A unaccounted for." );
    $sym69$_NEW_CYCL_QUERY_PARAMETER_SET_ = makeSymbol( "*NEW-CYCL-QUERY-PARAMETER-SET*" );
    $const70$InferenceParameter = constant_handles.reader_make_constant_shell( makeString( "InferenceParameter" ) );
    $const71$CycAPIMt = constant_handles.reader_make_constant_shell( makeString( "CycAPIMt" ) );
    $const72$subLIdentifier = constant_handles.reader_make_constant_shell( makeString( "subLIdentifier" ) );
    $kw73$TRUE = makeKeyword( "TRUE" );
    $const74$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
  }

  public static final class $new_cycl_query_specification_native
      extends
        SubLStructNative
  {
    public SubLObject $cycl_id;
    public SubLObject $formula;
    public SubLObject $mt;
    public SubLObject $comment;
    public SubLObject $properties;
    public SubLObject $indexicals;
    public SubLObject $edited;
    private static final SubLStructDeclNative structDecl;

    public $new_cycl_query_specification_native()
    {
      this.$cycl_id = CommonSymbols.NIL;
      this.$formula = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$comment = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
      this.$indexicals = CommonSymbols.NIL;
      this.$edited = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $new_cycl_query_specification_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$cycl_id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$formula;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$comment;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$properties;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$indexicals;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$edited;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$cycl_id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$formula = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$comment = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$properties = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$indexicals = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$edited = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $new_cycl_query_specification_native.class, $sym0$NEW_CYCL_QUERY_SPECIFICATION, $sym1$NEW_CYCL_QUERY_SPECIFICATION_P, $list2, $list3, new String[] { "$cycl_id",
        "$formula", "$mt", "$comment", "$properties", "$indexicals", "$edited"
      }, $list4, $list5, $sym6$NEW_CYCL_QUERY_SPECIFICATION_PRINT );
    }
  }

  public static final class $new_cycl_query_specification_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $new_cycl_query_specification_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NEW-CYCL-QUERY-SPECIFICATION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return new_cycl_query_specification_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1213 ms
 * 
 */