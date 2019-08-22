package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class xml_writer extends SubLTranslatedFile {
    public static final SubLFile me = new xml_writer();

    public static final String myName = "com.cyc.cycjava.cycl.xml_writer";

    public static final String myFingerPrint = "ab1cc8e02cfa7690d1b2545c4c8f5fb6dab8c697be35befb3c1f3ab9e9ad1471";



    public static final SubLSymbol TEXT_WRITER = makeSymbol("TEXT-WRITER");

    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("VERSION"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("ENCODING"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("STANDALONE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HEADER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CDATA"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MARKUP"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMMENT"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("START-TAG"), list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("ATOMIC")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("END-TAG"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("XML-PRINT"), list(makeSymbol("STRING"), makeSymbol("INDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("XML-PRINT-LINE"), list(makeSymbol("STRING"), makeSymbol("INDENT")), makeKeyword("PUBLIC")) });





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-CLASS");





    public static final SubLSymbol SUBLOOP_WRITER = makeSymbol("SUBLOOP-WRITER");

    public static final SubLSymbol OPEN_FN = makeSymbol("OPEN-FN");





    public static final SubLSymbol INDENT_INCREMENT = makeSymbol("INDENT-INCREMENT");





    public static final SubLSymbol STANDALONE = makeSymbol("STANDALONE");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-INSTANCE");



    public static final SubLList $list18 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list19 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("VERSION"), makeDouble(1.0)), list(makeSymbol("CSETQ"), makeSymbol("ENCODING"), makeString("US-ASCII")), list(makeSymbol("CSETQ"), makeSymbol("STANDALONE"), T), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    public static final SubLString $str22$US_ASCII = makeString("US-ASCII");

    public static final SubLSymbol XML_WRITER_INITIALIZE_METHOD = makeSymbol("XML-WRITER-INITIALIZE-METHOD");

    public static final SubLSymbol HEADER = makeSymbol("HEADER");

    public static final SubLList $list25 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list26 = list(list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("OUTSTREAM"))), list(makeSymbol("XML-HEADER"), makeSymbol("VERSION"), makeSymbol("ENCODING"), makeSymbol("STANDALONE"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");

    public static final SubLSymbol XML_WRITER_HEADER_METHOD = makeSymbol("XML-WRITER-HEADER-METHOD");

    public static final SubLSymbol CDATA = makeSymbol("CDATA");

    public static final SubLList $list30 = list(makeSymbol("STRING"));

    public static final SubLList $list31 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("OUTSTREAM"))), list(makeSymbol("XML-CDATA"), makeSymbol("STRING"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");



    public static final SubLSymbol XML_WRITER_CDATA_METHOD = makeSymbol("XML-WRITER-CDATA-METHOD");

    public static final SubLSymbol MARKUP = makeSymbol("MARKUP");

    public static final SubLList $list36 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("OUTSTREAM"))), list(makeSymbol("XML-MARKUP"), makeSymbol("STRING"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");

    public static final SubLSymbol XML_WRITER_MARKUP_METHOD = makeSymbol("XML-WRITER-MARKUP-METHOD");



    public static final SubLList $list40 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("OUTSTREAM"))), list(makeSymbol("XML-COMMENT"), makeSymbol("STRING"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");

    public static final SubLSymbol XML_WRITER_COMMENT_METHOD = makeSymbol("XML-WRITER-COMMENT-METHOD");



    public static final SubLList $list44 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    public static final SubLList $list45 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("ATOMIC"), makeSymbol("NEWLINE"));

    public static final SubLList $list46 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NAME"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("ATTRIBUTES"), makeSymbol("LISTP")), list(makeSymbol("INDENT"), makeSymbol("OUTSTREAM"), makeSymbol("INDENT-NUM")), list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("OUTSTREAM"))), list(makeSymbol("XML-START-TAG-INTERNAL"), makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("ATOMIC"))), list(makeSymbol("PWHEN"), makeSymbol("NEWLINE"), list(makeSymbol("WRITE-CHAR"), CHAR_newline, makeSymbol("OUTSTREAM"))), list(makeSymbol("PUNLESS"), makeSymbol("ATOMIC"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("INCREASE-INDENT")))), list(makeSymbol("RET"), makeSymbol("SELF")));



    public static final SubLSymbol INCREASE_INDENT = makeSymbol("INCREASE-INDENT");

    public static final SubLSymbol XML_WRITER_START_TAG_METHOD = makeSymbol("XML-WRITER-START-TAG-METHOD");



    public static final SubLList $list51 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    public static final SubLList $list52 = list(makeSymbol("NAME"), makeSymbol("INDENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEWLINE"), T));

    public static final SubLList $list53 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NAME"), makeSymbol("STRINGP")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("DECREASE-INDENT"))), list(makeSymbol("CLET"), list(list(makeSymbol("CUR-STREAM"), list(makeSymbol("GET-SUBLOOP-WRITER-OUTSTREAM"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("INDENT"), list(makeSymbol("INDENT"), makeSymbol("CUR-STREAM"), list(makeSymbol("GET-SUBLOOP-WRITER-INDENT-NUM"), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("CUR-STREAM"))), list(makeSymbol("XML-END-TAG-INTERNAL"), makeSymbol("NAME"))), list(makeSymbol("PWHEN"), makeSymbol("NEWLINE"), list(makeSymbol("WRITE-CHAR"), CHAR_newline, makeSymbol("CUR-STREAM")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol DECREASE_INDENT = makeSymbol("DECREASE-INDENT");

    public static final SubLSymbol XML_WRITER_END_TAG_METHOD = makeSymbol("XML-WRITER-END-TAG-METHOD");



    public static final SubLList $list57 = list(makeSymbol("STRING"), makeSymbol("INDENT"));

    public static final SubLList $list58 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("PWHEN"), makeSymbol("INDENT"), list(makeSymbol("INDENT"), makeSymbol("OUTSTREAM"), makeSymbol("INDENT-NUM"))), list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("OUTSTREAM"))), list(makeSymbol("XML-PRINT"), makeSymbol("STRING"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");

    public static final SubLSymbol XML_WRITER_XML_PRINT_METHOD = makeSymbol("XML-WRITER-XML-PRINT-METHOD");

    public static final SubLSymbol XML_PRINT_LINE = makeSymbol("XML-PRINT-LINE");

    public static final SubLList $list62 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("PWHEN"), makeSymbol("INDENT"), list(makeSymbol("INDENT"), makeSymbol("OUTSTREAM"), makeSymbol("INDENT-NUM"))), list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("OUTSTREAM"))), list(makeSymbol("XML-PRINT-LINE"), makeSymbol("STRING"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");

    public static final SubLSymbol XML_WRITER_XML_PRINT_LINE_METHOD = makeSymbol("XML-WRITER-XML-PRINT-LINE-METHOD");

    public static final SubLString $str65$cyc_constant = makeString("cyc-constant");

    public static final SubLString $$$guid = makeString("guid");

    public static final SubLString $$$name = makeString("name");

    public static SubLObject get_xml_writer_standalone(final SubLObject v_xml_writer) {
        return classes.subloop_get_instance_slot(v_xml_writer, SEVEN_INTEGER);
    }

    public static SubLObject set_xml_writer_standalone(final SubLObject v_xml_writer, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_xml_writer, value, SEVEN_INTEGER);
    }

    public static SubLObject get_xml_writer_encoding(final SubLObject v_xml_writer) {
        return classes.subloop_get_instance_slot(v_xml_writer, SIX_INTEGER);
    }

    public static SubLObject set_xml_writer_encoding(final SubLObject v_xml_writer, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_xml_writer, value, SIX_INTEGER);
    }

    public static SubLObject get_xml_writer_version(final SubLObject v_xml_writer) {
        return classes.subloop_get_instance_slot(v_xml_writer, FIVE_INTEGER);
    }

    public static SubLObject set_xml_writer_version(final SubLObject v_xml_writer, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_xml_writer, value, FIVE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_xml_writer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_xml_writer_instance(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, OPEN_FN, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, INDENT_NUM, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, INDENT_INCREMENT, NIL);
        classes.subloop_initialize_slot(new_instance, XML_WRITER, VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, XML_WRITER, ENCODING, NIL);
        classes.subloop_initialize_slot(new_instance, XML_WRITER, STANDALONE, NIL);
        return NIL;
    }

    public static SubLObject xml_writer_p(final SubLObject v_xml_writer) {
        return classes.subloop_instanceof_class(v_xml_writer, XML_WRITER);
    }

    public static SubLObject xml_writer_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = NIL;
        SubLObject standalone = get_xml_writer_standalone(self);
        SubLObject encoding = get_xml_writer_encoding(self);
        SubLObject version = get_xml_writer_version(self);
        try {
            thread.throwStack.push($sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                subloop_writer.text_writer_initialize_method(self);
                version = $float$1_0;
                encoding = $str22$US_ASCII;
                standalone = T;
                sublisp_throw($sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_xml_writer_standalone(self, standalone);
                    set_xml_writer_encoding(self, encoding);
                    set_xml_writer_version(self, version);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }

    public static SubLObject xml_writer_header_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = NIL;
        final SubLObject standalone = get_xml_writer_standalone(self);
        final SubLObject encoding = get_xml_writer_encoding(self);
        final SubLObject version = get_xml_writer_version(self);
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_header(version, encoding, standalone);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw($sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_xml_writer_standalone(self, standalone);
                    set_xml_writer_encoding(self, encoding);
                    set_xml_writer_version(self, version);
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }

    public static SubLObject xml_writer_cdata_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = NIL;
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_cdata(string);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw($sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }

    public static SubLObject xml_writer_markup_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = NIL;
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_markup(string);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw($sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }

    public static SubLObject xml_writer_comment_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = NIL;
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_comment(string);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw($sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }

    public static SubLObject xml_writer_start_tag_method(final SubLObject self, final SubLObject name, final SubLObject attributes, final SubLObject atomic, final SubLObject newline) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num(self);
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        assert NIL != listp(attributes) : "Types.listp(attributes) " + "CommonSymbols.NIL != Types.listp(attributes) " + attributes;
        string_utilities.indent(outstream, indent_num);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(outstream, thread);
            xml_utilities.xml_start_tag_internal(name, attributes, atomic, UNPROVIDED, UNPROVIDED);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        if (NIL != newline) {
            write_char(CHAR_newline, outstream);
        }
        if (NIL == atomic) {
            methods.funcall_instance_method_with_0_args(self, INCREASE_INDENT);
        }
        return self;
    }

    public static SubLObject xml_writer_end_tag_method(final SubLObject self, final SubLObject name, final SubLObject indent, SubLObject newline) {
        if (newline == UNPROVIDED) {
            newline = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        methods.funcall_instance_method_with_0_args(self, DECREASE_INDENT);
        final SubLObject cur_stream = subloop_writer.get_subloop_writer_outstream(self);
        if (NIL != indent) {
            string_utilities.indent(cur_stream, subloop_writer.get_subloop_writer_indent_num(self));
        }
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(cur_stream, thread);
            xml_utilities.xml_end_tag_internal(name);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        if (NIL != newline) {
            write_char(CHAR_newline, cur_stream);
        }
        return self;
    }

    public static SubLObject xml_writer_xml_print_method(final SubLObject self, final SubLObject string, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = NIL;
        final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num(self);
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                if (NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_print(string, UNPROVIDED);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw($sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_writer.set_subloop_writer_indent_num(self, indent_num);
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }

    public static SubLObject xml_writer_xml_print_line_method(final SubLObject self, final SubLObject string, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = NIL;
        final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num(self);
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                if (NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_print_line(string, UNPROVIDED);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw($sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_writer.set_subloop_writer_indent_num(self, indent_num);
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }

    public static SubLObject constant_to_xml(final SubLObject constant, final SubLObject v_xml_writer) {
        methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $str65$cyc_constant, NIL, NIL, T);
        methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$guid, NIL, NIL, NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, XML_PRINT, Guids.guid_to_string(constants_high.constant_guid(constant)), NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, END_TAG, $$$guid, NIL);
        methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$name, NIL, NIL, NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, XML_PRINT, constants_high.constant_name(constant), NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, END_TAG, $$$name, NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, END_TAG, $str65$cyc_constant, T);
        return T;
    }

    public static SubLObject declare_xml_writer_file() {
        declareFunction(me, "get_xml_writer_standalone", "GET-XML-WRITER-STANDALONE", 1, 0, false);
        declareFunction(me, "set_xml_writer_standalone", "SET-XML-WRITER-STANDALONE", 2, 0, false);
        declareFunction(me, "get_xml_writer_encoding", "GET-XML-WRITER-ENCODING", 1, 0, false);
        declareFunction(me, "set_xml_writer_encoding", "SET-XML-WRITER-ENCODING", 2, 0, false);
        declareFunction(me, "get_xml_writer_version", "GET-XML-WRITER-VERSION", 1, 0, false);
        declareFunction(me, "set_xml_writer_version", "SET-XML-WRITER-VERSION", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_xml_writer_class", "SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_xml_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-INSTANCE", 1, 0, false);
        declareFunction(me, "xml_writer_p", "XML-WRITER-P", 1, 0, false);
        declareFunction(me, "xml_writer_initialize_method", "XML-WRITER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "xml_writer_header_method", "XML-WRITER-HEADER-METHOD", 1, 0, false);
        declareFunction(me, "xml_writer_cdata_method", "XML-WRITER-CDATA-METHOD", 2, 0, false);
        declareFunction(me, "xml_writer_markup_method", "XML-WRITER-MARKUP-METHOD", 2, 0, false);
        declareFunction(me, "xml_writer_comment_method", "XML-WRITER-COMMENT-METHOD", 2, 0, false);
        declareFunction(me, "xml_writer_start_tag_method", "XML-WRITER-START-TAG-METHOD", 5, 0, false);
        declareFunction(me, "xml_writer_end_tag_method", "XML-WRITER-END-TAG-METHOD", 3, 1, false);
        declareFunction(me, "xml_writer_xml_print_method", "XML-WRITER-XML-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "xml_writer_xml_print_line_method", "XML-WRITER-XML-PRINT-LINE-METHOD", 3, 0, false);
        declareFunction(me, "constant_to_xml", "CONSTANT-TO-XML", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_xml_writer_file() {
        return NIL;
    }

    public static SubLObject setup_xml_writer_file() {
        classes.subloop_new_class(XML_WRITER, TEXT_WRITER, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(XML_WRITER, NIL);
        classes.subloop_note_class_initialization_function(XML_WRITER, SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_CLASS);
        classes.subloop_note_instance_initialization_function(XML_WRITER, SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_INSTANCE);
        subloop_reserved_initialize_xml_writer_class(XML_WRITER);
        methods.methods_incorporate_instance_method(INITIALIZE, XML_WRITER, $list18, NIL, $list19);
        methods.subloop_register_instance_method(XML_WRITER, INITIALIZE, XML_WRITER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(HEADER, XML_WRITER, $list25, NIL, $list26);
        methods.subloop_register_instance_method(XML_WRITER, HEADER, XML_WRITER_HEADER_METHOD);
        methods.methods_incorporate_instance_method(CDATA, XML_WRITER, $list25, $list30, $list31);
        methods.subloop_register_instance_method(XML_WRITER, CDATA, XML_WRITER_CDATA_METHOD);
        methods.methods_incorporate_instance_method(MARKUP, XML_WRITER, $list25, $list30, $list36);
        methods.subloop_register_instance_method(XML_WRITER, MARKUP, XML_WRITER_MARKUP_METHOD);
        methods.methods_incorporate_instance_method(COMMENT, XML_WRITER, $list25, $list30, $list40);
        methods.subloop_register_instance_method(XML_WRITER, COMMENT, XML_WRITER_COMMENT_METHOD);
        methods.methods_incorporate_instance_method(START_TAG, XML_WRITER, $list44, $list45, $list46);
        methods.subloop_register_instance_method(XML_WRITER, START_TAG, XML_WRITER_START_TAG_METHOD);
        methods.methods_incorporate_instance_method(END_TAG, XML_WRITER, $list51, $list52, $list53);
        methods.subloop_register_instance_method(XML_WRITER, END_TAG, XML_WRITER_END_TAG_METHOD);
        methods.methods_incorporate_instance_method(XML_PRINT, XML_WRITER, $list25, $list57, $list58);
        methods.subloop_register_instance_method(XML_WRITER, XML_PRINT, XML_WRITER_XML_PRINT_METHOD);
        methods.methods_incorporate_instance_method(XML_PRINT_LINE, XML_WRITER, $list25, $list57, $list62);
        methods.subloop_register_instance_method(XML_WRITER, XML_PRINT_LINE, XML_WRITER_XML_PRINT_LINE_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_xml_writer_file();
    }

    @Override
    public void initializeVariables() {
        init_xml_writer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_xml_writer_file();
    }

    
}

/**
 * Total time: 172 ms
 */
