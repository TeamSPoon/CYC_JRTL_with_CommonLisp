package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sparse_matrix
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sparse_matrix";
  public static final String myFingerPrint = "22ebe476cae6a5880917e009aef71c18c3b1dffd3418601ee2c16f09b0eeaa08";
  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLSymbol $dtp_sparse_matrix$;
  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 10174L)
  public static SubLSymbol $default_smatrix_epsilon$;
  private static final SubLSymbol $sym0$SPARSE_MATRIX;
  private static final SubLSymbol $sym1$SPARSE_MATRIX_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$SMATRIX_PRINT;
  private static final SubLSymbol $sym7$SPARSE_MATRIX_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$SMATRIX_ROWS;
  private static final SubLSymbol $sym10$_CSETF_SMATRIX_ROWS;
  private static final SubLSymbol $sym11$SMATRIX_COLUMNS;
  private static final SubLSymbol $sym12$_CSETF_SMATRIX_COLUMNS;
  private static final SubLSymbol $kw13$ROWS;
  private static final SubLSymbol $kw14$COLUMNS;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_SPARSE_MATRIX;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_MATRIX_METHOD;
  private static final SubLInteger $int21$100;
  private static final SubLSymbol $sym22$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym23$VALID_HASH_TEST_P;
  private static final SubLString $str24$__SPARSE_MATRIX_;
  private static final SubLString $str25$_;
  private static final SubLString $str26$_;
  private static final SubLSymbol $sym27$VALID_MATRIX_ROW_P;
  private static final SubLSymbol $sym28$SPARSE_VECTOR_P;
  private static final SubLString $str29$non_equal_matrix_and_vector_test_;
  private static final SubLSymbol $sym30$VALID_MATRIX_COLUMN_P;
  private static final SubLSymbol $sym31$NUMBERP;
  private static final SubLFloat $float32$0_01;
  private static final SubLSymbol $sym33$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym34$FLOATP;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$CDOHASH;
  private static final SubLFloat $float37$3_4028232e38;
  private static final SubLInteger $int38$50;

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject sparse_matrix_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    smatrix_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject sparse_matrix_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sparse_matrix_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject smatrix_rows(final SubLObject v_object)
  {
    assert NIL != sparse_matrix_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject smatrix_columns(final SubLObject v_object)
  {
    assert NIL != sparse_matrix_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject _csetf_smatrix_rows(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sparse_matrix_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject _csetf_smatrix_columns(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sparse_matrix_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject make_sparse_matrix(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sparse_matrix_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$ROWS ) )
      {
        _csetf_smatrix_rows( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$COLUMNS ) )
      {
        _csetf_smatrix_columns( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject visit_defstruct_sparse_matrix(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_SPARSE_MATRIX, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$ROWS, smatrix_rows( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$COLUMNS, smatrix_columns( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_SPARSE_MATRIX, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3088L)
  public static SubLObject visit_defstruct_object_sparse_matrix_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sparse_matrix( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3291L)
  public static SubLObject new_sparse_matrix(SubLObject testfn, SubLObject size)
  {
    if( testfn == UNPROVIDED )
    {
      testfn = EQL;
    }
    if( size == UNPROVIDED )
    {
      size = $int21$100;
    }
    assert NIL != subl_promotions.positive_integer_p( size ) : size;
    assert NIL != hash_table_utilities.valid_hash_test_p( testfn ) : testfn;
    final SubLObject matrix = make_sparse_matrix( UNPROVIDED );
    _csetf_smatrix_rows( matrix, Hashtables.make_hash_table( size, testfn, UNPROVIDED ) );
    _csetf_smatrix_columns( matrix, Hashtables.make_hash_table( size, testfn, UNPROVIDED ) );
    return matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 3904L)
  public static SubLObject smatrix_test(final SubLObject matrix)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    return Hashtables.hash_table_test( smatrix_rows( matrix ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 4123L)
  public static SubLObject smatrix_print(final SubLObject matrix, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str24$__SPARSE_MATRIX_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( stream );
    final SubLObject cdohash_table = smatrix_rows( matrix );
    SubLObject row = NIL;
    SubLObject vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row = Hashtables.getEntryKey( cdohash_entry );
        vector = Hashtables.getEntryValue( cdohash_entry );
        print_high.princ( row, stream );
        streams_high.write_string( $str25$_, stream, UNPROVIDED, UNPROVIDED );
        sparse_vector.svector_print( vector, stream, ZERO_INTEGER );
        streams_high.terpri( stream );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    streams_high.write_string( $str26$_, stream, UNPROVIDED, UNPROVIDED );
    return matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 4504L)
  public static SubLObject zero_smatrix_p(final SubLObject matrix)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    return Numbers.zerop( Hashtables.hash_table_count( smatrix_rows( matrix ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 4740L)
  public static SubLObject smatrix_copy(final SubLObject matrix)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    final SubLObject copy = new_sparse_matrix( UNPROVIDED, UNPROVIDED );
    final SubLObject cdohash_table = smatrix_rows( matrix );
    SubLObject row = NIL;
    SubLObject vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row = Hashtables.getEntryKey( cdohash_entry );
        vector = Hashtables.getEntryValue( cdohash_entry );
        smatrix_set_row( copy, row, sparse_vector.svector_copy( vector ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return copy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 5058L)
  public static SubLObject smatrix_set_row(final SubLObject matrix, final SubLObject row, final SubLObject vector)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    assert NIL != valid_matrix_row_p( row ) : row;
    assert NIL != sparse_vector.sparse_vector_p( vector ) : vector;
    if( !smatrix_test( matrix ).eql( sparse_vector.svector_test( vector ) ) )
    {
      Errors.error( $str29$non_equal_matrix_and_vector_test_ );
    }
    if( NIL == sparse_vector.zero_svector_p( vector ) )
    {
      Hashtables.sethash( row, smatrix_rows( matrix ), vector );
      smatrix_clear_columns( matrix );
    }
    return matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 5685L)
  public static SubLObject smatrix_set(final SubLObject matrix, final SubLObject row, final SubLObject column, final SubLObject value)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    assert NIL != valid_matrix_row_p( row ) : row;
    assert NIL != valid_matrix_column_p( column ) : column;
    assert NIL != Types.numberp( value ) : value;
    SubLObject vector = Hashtables.gethash( row, smatrix_rows( matrix ), UNPROVIDED );
    if( NIL == vector )
    {
      vector = sparse_vector.new_sparse_vector( smatrix_test( matrix ), UNPROVIDED );
      Hashtables.sethash( row, smatrix_rows( matrix ), vector );
    }
    return sparse_vector.svector_set( vector, column, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 6291L)
  public static SubLObject smatrix_get(final SubLObject matrix, final SubLObject row, final SubLObject column)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    assert NIL != valid_matrix_row_p( row ) : row;
    assert NIL != valid_matrix_column_p( column ) : column;
    return sparse_vector.svector_get( Hashtables.gethash( row, smatrix_rows( matrix ), UNPROVIDED ), column );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 6660L)
  public static SubLObject smatrix_add(final SubLObject matrix1, final SubLObject matrix2)
  {
    assert NIL != sparse_matrix_p( matrix1 ) : matrix1;
    assert NIL != sparse_matrix_p( matrix2 ) : matrix2;
    smatrix_clear_columns( matrix1 );
    SubLObject vector2 = NIL;
    final SubLObject cdohash_table = smatrix_rows( matrix1 );
    SubLObject row = NIL;
    SubLObject vector3 = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row = Hashtables.getEntryKey( cdohash_entry );
        vector3 = Hashtables.getEntryValue( cdohash_entry );
        vector2 = Hashtables.gethash( row, smatrix_rows( matrix2 ), UNPROVIDED );
        if( NIL != vector2 )
        {
          sparse_vector.svector_add( vector3, vector2 );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return matrix1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 7220L)
  public static SubLObject smatrix_scalar_product(final SubLObject matrix, final SubLObject scalar)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    assert NIL != Types.numberp( scalar ) : scalar;
    smatrix_clear_columns( matrix );
    final SubLObject cdohash_table = smatrix_rows( matrix );
    SubLObject row = NIL;
    SubLObject vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row = Hashtables.getEntryKey( cdohash_entry );
        vector = Hashtables.getEntryValue( cdohash_entry );
        sparse_vector.svector_scale( vector, scalar );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 7617L)
  public static SubLObject smatrix_vector_product(final SubLObject matrix, final SubLObject vector)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    assert NIL != sparse_vector.sparse_vector_p( vector ) : vector;
    final SubLObject product = sparse_vector.new_sparse_vector( smatrix_test( matrix ), UNPROVIDED );
    final SubLObject cdohash_table = smatrix_rows( matrix );
    SubLObject row_name = NIL;
    SubLObject row = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row_name = Hashtables.getEntryKey( cdohash_entry );
        row = Hashtables.getEntryValue( cdohash_entry );
        sparse_vector.svector_set( product, row_name, sparse_vector.svector_scalar_product( row, vector ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return product;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 8097L)
  public static SubLObject smatrix_matrix_product(final SubLObject matrix1, final SubLObject matrix2)
  {
    assert NIL != sparse_matrix_p( matrix1 ) : matrix1;
    assert NIL != sparse_matrix_p( matrix2 ) : matrix2;
    final SubLObject matrix3 = new_sparse_matrix( UNPROVIDED, UNPROVIDED );
    smatrix_ensure_columns( matrix2 );
    final SubLObject cdohash_table = smatrix_rows( matrix1 );
    SubLObject row = NIL;
    SubLObject row_vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row = Hashtables.getEntryKey( cdohash_entry );
        row_vector = Hashtables.getEntryValue( cdohash_entry );
        final SubLObject new_row = sparse_vector.new_sparse_vector( smatrix_test( matrix1 ), UNPROVIDED );
        final SubLObject cdohash_table_$1 = smatrix_columns( matrix2 );
        SubLObject column = NIL;
        SubLObject column_vector = NIL;
        final Iterator cdohash_iterator_$2 = Hashtables.getEntrySetIterator( cdohash_table_$1 );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator_$2 ))
          {
            final Map.Entry cdohash_entry_$3 = Hashtables.iteratorNextEntry( cdohash_iterator_$2 );
            column = Hashtables.getEntryKey( cdohash_entry_$3 );
            column_vector = Hashtables.getEntryValue( cdohash_entry_$3 );
            sparse_vector.svector_set( new_row, column, sparse_vector.svector_scalar_product( row_vector, column_vector ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator_$2 );
        }
        smatrix_set_row( matrix3, row, new_row );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return matrix3;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 8769L)
  public static SubLObject smatrix_transpose(final SubLObject matrix)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    smatrix_ensure_columns( matrix );
    SubLObject temp = NIL;
    temp = smatrix_rows( matrix );
    _csetf_smatrix_rows( matrix, smatrix_columns( matrix ) );
    _csetf_smatrix_columns( matrix, temp );
    return matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 9148L)
  public static SubLObject smatrix_inverse(final SubLObject matrix)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    return smatrix_scalar_product( matrix, MINUS_ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 9355L)
  public static SubLObject smatrix_sum_norm(final SubLObject matrix)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    smatrix_ensure_columns( matrix );
    SubLObject norm = ZERO_INTEGER;
    SubLObject vector_norm = NIL;
    final SubLObject cdohash_table = smatrix_columns( matrix );
    SubLObject column = NIL;
    SubLObject vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        column = Hashtables.getEntryKey( cdohash_entry );
        vector = Hashtables.getEntryValue( cdohash_entry );
        vector_norm = sparse_vector.svector_sum_norm( vector );
        if( vector_norm.numG( norm ) )
        {
          norm = vector_norm;
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return norm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 9786L)
  public static SubLObject smatrix_max_norm(final SubLObject matrix)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    SubLObject norm = ZERO_INTEGER;
    SubLObject vector_norm = NIL;
    final SubLObject cdohash_table = smatrix_rows( matrix );
    SubLObject row = NIL;
    SubLObject vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row = Hashtables.getEntryKey( cdohash_entry );
        vector = Hashtables.getEntryValue( cdohash_entry );
        vector_norm = sparse_vector.svector_max_norm( vector );
        if( vector_norm.numG( norm ) )
        {
          norm = vector_norm;
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return norm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 10292L)
  public static SubLObject smatrix_eigenpairs(final SubLObject matrix, SubLObject n, SubLObject epsilon)
  {
    if( n == UNPROVIDED )
    {
      n = Hashtables.hash_table_count( smatrix_rows( matrix ) );
    }
    if( epsilon == UNPROVIDED )
    {
      epsilon = $default_smatrix_epsilon$.getGlobalValue();
    }
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    assert NIL != Types.floatp( epsilon ) : epsilon;
    SubLObject eigenpairs = NIL;
    SubLObject i = ONE_INTEGER;
    SubLObject eigenpair = NIL;
    while ( !i.numG( n ))
    {
      eigenpair = smatrix_dominant_eigenpair( matrix, epsilon );
      if( NIL != sparse_vector.svector_normalize( eigenpair.first() ) )
      {
        eigenpairs = ConsesLow.cons( eigenpair, eigenpairs );
        if( !i.numE( n ) )
        {
          smatrix_deflation( matrix, eigenpair.rest(), eigenpair.first() );
        }
      }
      else
      {
        i = n;
      }
      i = Numbers.add( i, ONE_INTEGER );
    }
    return Sequences.nreverse( eigenpairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 11311L)
  public static SubLObject smatrix_svd(final SubLObject matrix)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    final SubLObject mtm = smatrix_matrix_product( smatrix_transpose( smatrix_copy( matrix ) ), matrix );
    final SubLObject u = new_sparse_matrix( smatrix_test( matrix ), UNPROVIDED );
    final SubLObject uprime = new_sparse_matrix( smatrix_test( matrix ), UNPROVIDED );
    final SubLObject d = new_sparse_matrix( smatrix_test( matrix ), UNPROVIDED );
    SubLObject s = NIL;
    SubLObject i = ONE_INTEGER;
    SubLObject cdolist_list_var = smatrix_eigenpairs( mtm, UNPROVIDED, UNPROVIDED );
    SubLObject eigenpair = NIL;
    eigenpair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      smatrix_set_row( u, i, eigenpair.first() );
      s = Numbers.sqrt( Numbers.abs( eigenpair.rest() ) );
      smatrix_set_row( uprime, i, sparse_vector.svector_scale( smatrix_vector_product( matrix, eigenpair.first() ), Numbers.divide( ONE_INTEGER, s ) ) );
      smatrix_set( d, i, i, s );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      eigenpair = cdolist_list_var.first();
    }
    smatrix_transpose( uprime );
    return Values.values( uprime, d, u );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 12325L)
  public static SubLObject do_smatrix(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject row = NIL;
    SubLObject value = NIL;
    SubLObject matrix = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    row = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    matrix = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym36$CDOHASH, ConsesLow.list( row, value, ConsesLow.list( $sym9$SMATRIX_ROWS, matrix ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 12566L)
  public static SubLObject smatrix_dominant_eigenpair(final SubLObject matrix, SubLObject epsilon)
  {
    if( epsilon == UNPROVIDED )
    {
      epsilon = $default_smatrix_epsilon$.getGlobalValue();
    }
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    final SubLObject init_vector = sparse_vector.new_sparse_vector( smatrix_test( matrix ), UNPROVIDED );
    SubLObject eigenvalue = ZERO_INTEGER;
    SubLObject eigenvector = sparse_vector.new_sparse_vector( smatrix_test( matrix ), UNPROVIDED );
    final SubLObject max_iteration = Numbers.add( Hashtables.hash_table_count( smatrix_rows( matrix ) ), $int21$100 );
    SubLObject cdolist_list_var = smatrix_nonzero_columns( matrix );
    SubLObject column = NIL;
    column = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sparse_vector.svector_set( init_vector, column, number_utilities.f_1X( random.random( TEN_INTEGER ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      column = cdolist_list_var.first();
    }
    SubLObject i;
    SubLObject old_vector;
    SubLObject new_vector;
    SubLObject old_growth;
    SubLObject new_growth;
    SubLObject growth_rate;
    for( i = NIL, old_vector = NIL, new_vector = NIL, old_growth = NIL, new_growth = NIL, growth_rate = NIL, i = ZERO_INTEGER, old_vector = init_vector, new_vector = smatrix_vector_product( matrix,
        old_vector ), old_growth = ZERO_INTEGER, new_growth = raleigh_quotient( new_vector, old_vector ), growth_rate = Numbers.abs( Numbers.subtract( new_growth, old_growth ) ); !growth_rate.numL( epsilon ) && !i.numG(
            max_iteration ); i = number_utilities.f_1X( i ), old_vector = new_vector, new_vector = smatrix_vector_product( matrix, old_vector ), old_growth = new_growth, new_growth = raleigh_quotient( new_vector,
                old_vector ), growth_rate = Numbers.abs( Numbers.subtract( new_growth, old_growth ) ) )
    {
      eigenvalue = new_growth;
      eigenvector = new_vector;
    }
    return ConsesLow.cons( eigenvector, eigenvalue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 14029L)
  public static SubLObject svector_star(final SubLObject vector1, final SubLObject vector2)
  {
    assert NIL != sparse_vector.sparse_vector_p( vector1 ) : vector1;
    assert NIL != sparse_vector.sparse_vector_p( vector2 ) : vector2;
    final SubLObject matrix = new_sparse_matrix( sparse_vector.svector_test( vector1 ), UNPROVIDED );
    final SubLObject cdohash_table = sparse_vector.svector_dimensions( vector1 );
    SubLObject dim = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dim = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        smatrix_set_row( matrix, dim, sparse_vector.svector_scale( sparse_vector.svector_copy( vector2 ), value ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 14353L)
  public static SubLObject smatrix_deflation(final SubLObject matrix, final SubLObject eigenvalue, final SubLObject eigenvector)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    assert NIL != Types.numberp( eigenvalue ) : eigenvalue;
    assert NIL != sparse_vector.sparse_vector_p( eigenvector ) : eigenvector;
    return smatrix_add( matrix, smatrix_inverse( svector_star( sparse_vector.svector_scale( sparse_vector.svector_copy( eigenvector ), eigenvalue ), eigenvector ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 14688L)
  public static SubLObject sum_quotient(final SubLObject new_vector, final SubLObject old_vector)
  {
    return Numbers.divide( sparse_vector.svector_max_norm( new_vector ), sparse_vector.svector_max_norm( old_vector ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 14815L)
  public static SubLObject raleigh_quotient(final SubLObject new_vector, final SubLObject old_vector)
  {
    final SubLObject nominator = sparse_vector.svector_scalar_product( old_vector, new_vector );
    final SubLObject denominator = sparse_vector.svector_scalar_product( old_vector, old_vector );
    if( nominator.numE( denominator ) )
    {
      return ONE_INTEGER;
    }
    if( denominator.isZero() )
    {
      return $float37$3_4028232e38;
    }
    return Numbers.divide( nominator, denominator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 15141L)
  public static SubLObject smatrix_nonzero_columns(final SubLObject matrix)
  {
    smatrix_ensure_columns( matrix );
    SubLObject keys = NIL;
    final SubLObject cdohash_table = smatrix_columns( matrix );
    SubLObject column = NIL;
    SubLObject vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        column = Hashtables.getEntryKey( cdohash_entry );
        vector = Hashtables.getEntryValue( cdohash_entry );
        keys = ConsesLow.cons( column, keys );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return keys;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 15366L)
  public static SubLObject valid_matrix_row_p(final SubLObject v_object)
  {
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 15427L)
  public static SubLObject valid_matrix_column_p(final SubLObject v_object)
  {
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 15491L)
  public static SubLObject smatrix_clear_columns(final SubLObject matrix)
  {
    return Hashtables.clrhash( smatrix_columns( matrix ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 15583L)
  public static SubLObject smatrix_compute_columns(final SubLObject matrix)
  {
    final SubLObject cdohash_table = smatrix_rows( matrix );
    SubLObject row = NIL;
    SubLObject vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row = Hashtables.getEntryKey( cdohash_entry );
        vector = Hashtables.getEntryValue( cdohash_entry );
        final SubLObject cdohash_table_$4 = sparse_vector.svector_dimensions( vector );
        SubLObject column = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator_$5 = Hashtables.getEntrySetIterator( cdohash_table_$4 );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator_$5 ))
          {
            final Map.Entry cdohash_entry_$6 = Hashtables.iteratorNextEntry( cdohash_iterator_$5 );
            column = Hashtables.getEntryKey( cdohash_entry_$6 );
            value = Hashtables.getEntryValue( cdohash_entry_$6 );
            smatrix_get_column( matrix, column );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator_$5 );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 15814L)
  public static SubLObject smatrix_get_column(final SubLObject matrix, final SubLObject column)
  {
    assert NIL != sparse_matrix_p( matrix ) : matrix;
    assert NIL != valid_matrix_column_p( column ) : column;
    SubLObject vector = Hashtables.gethash( column, smatrix_columns( matrix ), UNPROVIDED );
    SubLObject value = NIL;
    if( NIL == vector )
    {
      vector = sparse_vector.new_sparse_vector( smatrix_test( matrix ), UNPROVIDED );
      final SubLObject cdohash_table = smatrix_rows( matrix );
      SubLObject row = NIL;
      SubLObject row_vector = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          row = Hashtables.getEntryKey( cdohash_entry );
          row_vector = Hashtables.getEntryValue( cdohash_entry );
          value = sparse_vector.svector_get( row_vector, column );
          if( !value.isZero() )
          {
            sparse_vector.svector_set( vector, row, sparse_vector.svector_get( row_vector, column ) );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    Hashtables.sethash( column, smatrix_columns( matrix ), vector );
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 16360L)
  public static SubLObject smatrix_ensure_columns(final SubLObject matrix)
  {
    if( NIL == subl_promotions.positive_integer_p( Hashtables.hash_table_count( smatrix_columns( matrix ) ) ) )
    {
      _csetf_smatrix_columns( matrix, Hashtables.make_hash_table( $int38$50, smatrix_test( matrix ), UNPROVIDED ) );
      smatrix_compute_columns( matrix );
    }
    return matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-matrix.lisp", position = 16619L)
  public static SubLObject smatrix_reduce(final SubLObject matrix, final SubLObject keep)
  {
    smatrix_clear_columns( matrix );
    final SubLObject rows = smatrix_rows( matrix );
    SubLObject row = NIL;
    SubLObject vector = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( rows );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        row = Hashtables.getEntryKey( cdohash_entry );
        vector = Hashtables.getEntryValue( cdohash_entry );
        if( NIL == subl_promotions.memberP( row, keep, smatrix_test( matrix ), UNPROVIDED ) )
        {
          Hashtables.remhash( row, rows );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return matrix;
  }

  public static SubLObject declare_sparse_matrix_file()
  {
    SubLFiles.declareFunction( me, "sparse_matrix_print_function_trampoline", "SPARSE-MATRIX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sparse_matrix_p", "SPARSE-MATRIX-P", 1, 0, false );
    new $sparse_matrix_p$UnaryFunction();
    SubLFiles.declareFunction( me, "smatrix_rows", "SMATRIX-ROWS", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_columns", "SMATRIX-COLUMNS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_smatrix_rows", "_CSETF-SMATRIX-ROWS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_smatrix_columns", "_CSETF-SMATRIX-COLUMNS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sparse_matrix", "MAKE-SPARSE-MATRIX", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sparse_matrix", "VISIT-DEFSTRUCT-SPARSE-MATRIX", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sparse_matrix_method", "VISIT-DEFSTRUCT-OBJECT-SPARSE-MATRIX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sparse_matrix", "NEW-SPARSE-MATRIX", 0, 2, false );
    SubLFiles.declareFunction( me, "smatrix_test", "SMATRIX-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_print", "SMATRIX-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "zero_smatrix_p", "ZERO-SMATRIX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_copy", "SMATRIX-COPY", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_set_row", "SMATRIX-SET-ROW", 3, 0, false );
    SubLFiles.declareFunction( me, "smatrix_set", "SMATRIX-SET", 4, 0, false );
    SubLFiles.declareFunction( me, "smatrix_get", "SMATRIX-GET", 3, 0, false );
    SubLFiles.declareFunction( me, "smatrix_add", "SMATRIX-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "smatrix_scalar_product", "SMATRIX-SCALAR-PRODUCT", 2, 0, false );
    SubLFiles.declareFunction( me, "smatrix_vector_product", "SMATRIX-VECTOR-PRODUCT", 2, 0, false );
    SubLFiles.declareFunction( me, "smatrix_matrix_product", "SMATRIX-MATRIX-PRODUCT", 2, 0, false );
    SubLFiles.declareFunction( me, "smatrix_transpose", "SMATRIX-TRANSPOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_inverse", "SMATRIX-INVERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_sum_norm", "SMATRIX-SUM-NORM", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_max_norm", "SMATRIX-MAX-NORM", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_eigenpairs", "SMATRIX-EIGENPAIRS", 1, 2, false );
    SubLFiles.declareFunction( me, "smatrix_svd", "SMATRIX-SVD", 1, 0, false );
    SubLFiles.declareMacro( me, "do_smatrix", "DO-SMATRIX" );
    SubLFiles.declareFunction( me, "smatrix_dominant_eigenpair", "SMATRIX-DOMINANT-EIGENPAIR", 1, 1, false );
    SubLFiles.declareFunction( me, "svector_star", "SVECTOR-STAR", 2, 0, false );
    SubLFiles.declareFunction( me, "smatrix_deflation", "SMATRIX-DEFLATION", 3, 0, false );
    SubLFiles.declareFunction( me, "sum_quotient", "SUM-QUOTIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "raleigh_quotient", "RALEIGH-QUOTIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "smatrix_nonzero_columns", "SMATRIX-NONZERO-COLUMNS", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_matrix_row_p", "VALID-MATRIX-ROW-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_matrix_column_p", "VALID-MATRIX-COLUMN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_clear_columns", "SMATRIX-CLEAR-COLUMNS", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_compute_columns", "SMATRIX-COMPUTE-COLUMNS", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_get_column", "SMATRIX-GET-COLUMN", 2, 0, false );
    SubLFiles.declareFunction( me, "smatrix_ensure_columns", "SMATRIX-ENSURE-COLUMNS", 1, 0, false );
    SubLFiles.declareFunction( me, "smatrix_reduce", "SMATRIX-REDUCE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sparse_matrix_file()
  {
    $dtp_sparse_matrix$ = SubLFiles.defconstant( "*DTP-SPARSE-MATRIX*", $sym0$SPARSE_MATRIX );
    $default_smatrix_epsilon$ = SubLFiles.deflexical( "*DEFAULT-SMATRIX-EPSILON*", $float32$0_01 );
    return NIL;
  }

  public static SubLObject setup_sparse_matrix_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sparse_matrix$.getGlobalValue(), Symbols.symbol_function( $sym7$SPARSE_MATRIX_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$SMATRIX_ROWS, $sym10$_CSETF_SMATRIX_ROWS );
    Structures.def_csetf( $sym11$SMATRIX_COLUMNS, $sym12$_CSETF_SMATRIX_COLUMNS );
    Equality.identity( $sym0$SPARSE_MATRIX );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sparse_matrix$.getGlobalValue(), Symbols.symbol_function( $sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_MATRIX_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sparse_matrix_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sparse_matrix_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sparse_matrix_file();
  }
  static
  {
    me = new sparse_matrix();
    $dtp_sparse_matrix$ = null;
    $default_smatrix_epsilon$ = null;
    $sym0$SPARSE_MATRIX = makeSymbol( "SPARSE-MATRIX" );
    $sym1$SPARSE_MATRIX_P = makeSymbol( "SPARSE-MATRIX-P" );
    $list2 = ConsesLow.list( makeSymbol( "ROWS" ), makeSymbol( "COLUMNS" ) );
    $list3 = ConsesLow.list( makeKeyword( "ROWS" ), makeKeyword( "COLUMNS" ) );
    $list4 = ConsesLow.list( makeSymbol( "SMATRIX-ROWS" ), makeSymbol( "SMATRIX-COLUMNS" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-SMATRIX-ROWS" ), makeSymbol( "_CSETF-SMATRIX-COLUMNS" ) );
    $sym6$SMATRIX_PRINT = makeSymbol( "SMATRIX-PRINT" );
    $sym7$SPARSE_MATRIX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SPARSE-MATRIX-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SPARSE-MATRIX-P" ) );
    $sym9$SMATRIX_ROWS = makeSymbol( "SMATRIX-ROWS" );
    $sym10$_CSETF_SMATRIX_ROWS = makeSymbol( "_CSETF-SMATRIX-ROWS" );
    $sym11$SMATRIX_COLUMNS = makeSymbol( "SMATRIX-COLUMNS" );
    $sym12$_CSETF_SMATRIX_COLUMNS = makeSymbol( "_CSETF-SMATRIX-COLUMNS" );
    $kw13$ROWS = makeKeyword( "ROWS" );
    $kw14$COLUMNS = makeKeyword( "COLUMNS" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_SPARSE_MATRIX = makeSymbol( "MAKE-SPARSE-MATRIX" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_MATRIX_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SPARSE-MATRIX-METHOD" );
    $int21$100 = makeInteger( 100 );
    $sym22$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym23$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $str24$__SPARSE_MATRIX_ = makeString( "#<SPARSE-MATRIX " );
    $str25$_ = makeString( "|" );
    $str26$_ = makeString( ">" );
    $sym27$VALID_MATRIX_ROW_P = makeSymbol( "VALID-MATRIX-ROW-P" );
    $sym28$SPARSE_VECTOR_P = makeSymbol( "SPARSE-VECTOR-P" );
    $str29$non_equal_matrix_and_vector_test_ = makeString( "non-equal matrix and vector test functions" );
    $sym30$VALID_MATRIX_COLUMN_P = makeSymbol( "VALID-MATRIX-COLUMN-P" );
    $sym31$NUMBERP = makeSymbol( "NUMBERP" );
    $float32$0_01 = makeDouble( 0.01 );
    $sym33$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym34$FLOATP = makeSymbol( "FLOATP" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "ROW" ), makeSymbol( "VALUE" ), makeSymbol( "MATRIX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$CDOHASH = makeSymbol( "CDOHASH" );
    $float37$3_4028232e38 = makeDouble( 3.4028232E38 );
    $int38$50 = makeInteger( 50 );
  }

  public static final class $sparse_matrix_native
      extends
        SubLStructNative
  {
    public SubLObject $rows;
    public SubLObject $columns;
    private static final SubLStructDeclNative structDecl;

    public $sparse_matrix_native()
    {
      this.$rows = CommonSymbols.NIL;
      this.$columns = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sparse_matrix_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$rows;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$columns;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$rows = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$columns = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sparse_matrix_native.class, $sym0$SPARSE_MATRIX, $sym1$SPARSE_MATRIX_P, $list2, $list3, new String[] { "$rows", "$columns"
      }, $list4, $list5, $sym6$SMATRIX_PRINT );
    }
  }

  public static final class $sparse_matrix_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sparse_matrix_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SPARSE-MATRIX-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sparse_matrix_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 332 ms
 * 
 */