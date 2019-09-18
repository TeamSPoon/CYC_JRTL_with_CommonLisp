package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_macro;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class nl_api_datastructures extends SubLTranslatedFile {
    public static final SubLFile me = new nl_api_datastructures();

    public static final String myName = "com.cyc.cycjava.cycl.nl_api_datastructures";

    public static final String myFingerPrint = "9709e7d3d966034d339936172e000cdbf8ef64753a616dfa4807a41dc263a8e4";

    // Internal Constants
    public static final SubLSymbol NEW_NL_OUTPUT_SPEC = makeSymbol("NEW-NL-OUTPUT-SPEC");



    public static final SubLSymbol NL_INTERPRETATION_SPEC_P = makeSymbol("NL-INTERPRETATION-SPEC-P");









    public static final SubLSymbol NEW_NL_INTERPRETATION_SPEC = makeSymbol("NEW-NL-INTERPRETATION-SPEC");

    public static final SubLList $list8 = list(makeSymbol("&OPTIONAL"), makeSymbol("PLIST"));

    public static final SubLString $str9$construct_a_new_default_NL_interp = makeString("construct a new default NL interpretation specification.  By default, the interpretation-spec will direct\n   the parsers to return only the CycL of the interpretation");

    public static final SubLList $list10 = list(makeSymbol("NL-INTERPRETATION-SPEC-P"));

    public static final SubLList $list11 = list(makeSymbol("OBJ"));

    public static final SubLString $str12$ = makeString("");

    public static final SubLList $list13 = list(makeSymbol("BOOLEAN"));

    public static final SubLSymbol NL_INTERP_SPEC_REQUEST_CYCL = makeSymbol("NL-INTERP-SPEC-REQUEST-CYCL");

    public static final SubLList $list15 = list(makeSymbol("INTERP-SPEC"));

    public static final SubLList $list16 = list(list(makeSymbol("INTERP-SPEC"), makeSymbol("NL-INTERPRETATION-SPEC-P")));

    public static final SubLSymbol $sym17$NL_INTERP_SPEC_RETURN_CYCL_ = makeSymbol("NL-INTERP-SPEC-RETURN-CYCL?");



    public static final SubLSymbol NL_INTERP_SPEC_REQUEST_WEIGHT = makeSymbol("NL-INTERP-SPEC-REQUEST-WEIGHT");

    public static final SubLSymbol $sym20$NL_INTERP_SPEC_RETURN_WEIGHT_ = makeSymbol("NL-INTERP-SPEC-RETURN-WEIGHT?");



    public static final SubLSymbol NL_INTERP_SPEC_REQUEST_JUSTIFICATION = makeSymbol("NL-INTERP-SPEC-REQUEST-JUSTIFICATION");

    public static final SubLSymbol $sym23$NL_INTERP_SPEC_RETURN_JUSTIFICATION_ = makeSymbol("NL-INTERP-SPEC-RETURN-JUSTIFICATION?");



    public static final SubLSymbol NL_INTERP_SPEC_REQUEST_PHRASE_TYPES = makeSymbol("NL-INTERP-SPEC-REQUEST-PHRASE-TYPES");

    public static final SubLSymbol $sym26$NL_INTERP_SPEC_RETURN_PHRASE_TYPES_ = makeSymbol("NL-INTERP-SPEC-RETURN-PHRASE-TYPES?");



    public static final SubLSymbol NL_INTERP_SPEC_REQUEST_HEAD_INFLECTIONS = makeSymbol("NL-INTERP-SPEC-REQUEST-HEAD-INFLECTIONS");

    public static final SubLSymbol $sym29$NL_INTERP_SPEC_RETURN_HEAD_INFLECTIONS_ = makeSymbol("NL-INTERP-SPEC-RETURN-HEAD-INFLECTIONS?");

    public static final SubLSymbol NL_INTERP_SPEC_REQUEST_PRAGMATICS = makeSymbol("NL-INTERP-SPEC-REQUEST-PRAGMATICS");

    public static final SubLSymbol $sym31$NL_INTERP_SPEC_RETURN_PRAGMATICS_ = makeSymbol("NL-INTERP-SPEC-RETURN-PRAGMATICS?");

    public static final SubLSymbol NEW_NL_INTERPRETATION = makeSymbol("NEW-NL-INTERPRETATION");

    public static final SubLSymbol NL_INTERPRETATION_P = makeSymbol("NL-INTERPRETATION-P");

    public static final SubLList $list34 = list(makeSymbol("ITEM"));

    public static final SubLList $list35 = list(makeSymbol("INTERP"), makeSymbol("CYCL"));

    public static final SubLSymbol PLIST_ENTER = makeSymbol("PLIST-ENTER");

    public static final SubLSymbol SET_NL_INTERP_CYCL = makeSymbol("SET-NL-INTERP-CYCL");

    public static final SubLString $str38$set_the_CycL_value_for_INTERP_to_ = makeString("set the CycL value for INTERP to CYCL");

    public static final SubLSymbol GET_NL_INTERP_CYCL = makeSymbol("GET-NL-INTERP-CYCL");

    public static final SubLList $list40 = list(makeSymbol("INTERP"));

    public static final SubLString $str41$Returns_the_CycL_currently_specif = makeString("Returns the CycL currently specified on INTERP");

    public static final SubLList $list42 = list(list(makeSymbol("INTERP"), makeSymbol("NL-INTERPRETATION-P")));

    public static final SubLList $list43 = list(makeSymbol("CYCL-FORMULA-P"));

    public static final SubLList $list44 = list(makeSymbol("INTERP"), makeSymbol("VALUE"));

    public static final SubLSymbol SET_NL_INTERP_PRAGMATICS = makeSymbol("SET-NL-INTERP-PRAGMATICS");

    public static final SubLString $str46$set_the_pragmatic_features_for_IN = makeString("set the pragmatic features for INTERP to VALUE");

    public static final SubLSymbol GET_NL_INTERP_PRAGMATICS = makeSymbol("GET-NL-INTERP-PRAGMATICS");

    public static final SubLString $str48$Returns_the_pragmatic_features_sp = makeString("Returns the pragmatic features specified for INTERP, which are each of the form\n   (PRAGMATIC-FEATURE MT)");

    public static final SubLList $list49 = list(makeSymbol("LISTP"));

    public static final SubLList $list50 = list(makeSymbol("INTERP"), makeSymbol("WEIGHT"));

    public static final SubLSymbol SET_NL_INTERP_WEIGHT = makeSymbol("SET-NL-INTERP-WEIGHT");

    public static final SubLString $str52$set_the_weight_for_INTERP_to_WEIG = makeString("set the weight for INTERP to WEIGHT");

    public static final SubLSymbol GET_NL_INTERP_WEIGHT = makeSymbol("GET-NL-INTERP-WEIGHT");

    public static final SubLString $str54$Returns_the_weight_currently_spec = makeString("Returns the weight currently specified on INTERP");

    public static final SubLList $list55 = list(makeSymbol("NUMBER-P"));

    public static final SubLList $list56 = list(makeSymbol("INTERP"), makeSymbol("JUSTIFICATION"));

    public static final SubLSymbol SET_NL_INTERP_JUSTIFICATION = makeSymbol("SET-NL-INTERP-JUSTIFICATION");

    public static final SubLString $str58$set_the_justification_for_INTERP_ = makeString("set the justification for INTERP to JUSTIFICATION");

    public static final SubLSymbol GET_NL_INTERP_JUSTIFICATION = makeSymbol("GET-NL-INTERP-JUSTIFICATION");

    public static final SubLString $str60$Returns_the_justification_current = makeString("Returns the justification currently specified on INTERP");

    public static final SubLList $list61 = list(makeSymbol("NL-JUSTIFICATION-P"));

    public static final SubLList $list62 = list(makeSymbol("INTERP"), makeSymbol("PHRASE-TYPES"));

    public static final SubLSymbol SET_NL_INTERP_PHRASE_TYPES = makeSymbol("SET-NL-INTERP-PHRASE-TYPES");

    public static final SubLString $str64$set_the_phrase_types_for_INTERP_t = makeString("set the phrase-types for INTERP to PHRASE-TYPES");

    public static final SubLList $list65 = list(makeSymbol("INTERP"), makeSymbol("PHRASE-TYPE"));



    public static final SubLSymbol ADD_NL_INTERP_PHRASE_TYPE = makeSymbol("ADD-NL-INTERP-PHRASE-TYPE");

    public static final SubLString $str68$add_PHRASE_TYPES_to_the_phrase_ty = makeString("add PHRASE-TYPES to the phrase-types for INTERP");

    public static final SubLSymbol GET_NL_INTERP_PHRASE_TYPES = makeSymbol("GET-NL-INTERP-PHRASE-TYPES");

    public static final SubLString $str70$Returns_the_phrase_types_currentl = makeString("Returns the phrase-types currently specified on INTERP");

    public static final SubLList $list71 = list(list(makeSymbol("LIST"), makeSymbol("CYCL-TERM-P")));

    public static final SubLList $list72 = list(makeSymbol("INTERP"), makeSymbol("INFLECTIONS"));

    public static final SubLSymbol SET_NL_INTERP_HEAD_INFLECTIONS = makeSymbol("SET-NL-INTERP-HEAD-INFLECTIONS");

    public static final SubLString $str74$set_the_inflections__speech_part_ = makeString("set the inflections (speech-part-predicates) for INTERP to INFLECTIONS");

    public static final SubLSymbol GET_NL_INTERP_HEAD_INFLECTIONS = makeSymbol("GET-NL-INTERP-HEAD-INFLECTIONS");

    public static final SubLString $str76$returns_the_inflections_predicate = makeString("returns the inflections predicates that are used in the head word for this interpretation");

    public static final SubLString $$$NLInterpretation = makeString("NLInterpretation");



    private static final SubLString $$$Cycl = makeString("Cycl");

    private static final SubLString $$$Weight = makeString("Weight");

    private static final SubLString $$$PhraseType = makeString("PhraseType");

    private static final SubLString $$$HeadInflection = makeString("HeadInflection");

    private static final SubLString $$$justification = makeString("justification");

    private static final SubLString $$$status = makeString("status");

    private static final SubLString $$$unimplemented = makeString("unimplemented");

    public static SubLObject new_nl_output_spec(final SubLObject output_type, SubLObject interp_spec) {
        if (interp_spec == UNPROVIDED) {
            interp_spec = NIL;
        }
        SubLSystemTrampolineFile.enforceType(output_type, KEYWORDP);
        SubLSystemTrampolineFile.enforceType(interp_spec, NL_INTERPRETATION_SPEC_P);
        final SubLObject desired_interp_spec = (NIL != interp_spec) ? interp_spec : new_nl_interpretation_spec(UNPROVIDED);
        final SubLObject result = list(output_type, desired_interp_spec);
        return result;
    }

    public static SubLObject output_spec_interp_spec(final SubLObject obj) {
        return second(obj);
    }

    public static SubLObject subl_output_spec_p(final SubLObject obj) {
        return eq(obj.first(), $SUBL);
    }

    public static SubLObject xml_output_spec_p(final SubLObject obj) {
        return eq(obj.first(), $XML);
    }

    public static SubLObject new_nl_interpretation_spec(SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        if (NIL != list_utilities.non_empty_list_p(plist)) {
            return plist;
        }
        return new_nl_interpretation(list($CYCL, T, $PRAGMATICS, T));
    }

    public static SubLObject nl_interpretation_spec_p(final SubLObject obj) {
        return nl_interpretation_p(obj);
    }

    public static SubLObject nl_interp_spec_request_cycl(SubLObject interp_spec) {
        SubLSystemTrampolineFile.enforceType(interp_spec, NL_INTERPRETATION_SPEC_P);
        interp_spec = putf(interp_spec, $CYCL, T);
        return interp_spec;
    }

    public static SubLObject nl_interp_spec_return_cyclP(final SubLObject interp_spec) {
        return getf(interp_spec, $CYCL, UNPROVIDED);
    }

    public static SubLObject nl_interp_spec_request_weight(SubLObject interp_spec) {
        SubLSystemTrampolineFile.enforceType(interp_spec, NL_INTERPRETATION_SPEC_P);
        interp_spec = putf(interp_spec, $WEIGHT, T);
        return interp_spec;
    }

    public static SubLObject nl_interp_spec_return_weightP(final SubLObject interp_spec) {
        return getf(interp_spec, $WEIGHT, UNPROVIDED);
    }

    public static SubLObject nl_interp_spec_request_justification(SubLObject interp_spec) {
        SubLSystemTrampolineFile.enforceType(interp_spec, NL_INTERPRETATION_SPEC_P);
        interp_spec = putf(interp_spec, $JUSTIFICATION, T);
        return interp_spec;
    }

    public static SubLObject nl_interp_spec_return_justificationP(final SubLObject interp_spec) {
        return getf(interp_spec, $JUSTIFICATION, UNPROVIDED);
    }

    public static SubLObject nl_interp_spec_request_phrase_types(SubLObject interp_spec) {
        SubLSystemTrampolineFile.enforceType(interp_spec, NL_INTERPRETATION_SPEC_P);
        interp_spec = putf(interp_spec, $PHRASE_TYPES, T);
        return interp_spec;
    }

    public static SubLObject nl_interp_spec_return_phrase_typesP(final SubLObject interp_spec) {
        return getf(interp_spec, $PHRASE_TYPES, UNPROVIDED);
    }

    public static SubLObject nl_interp_spec_request_head_inflections(SubLObject interp_spec) {
        SubLSystemTrampolineFile.enforceType(interp_spec, NL_INTERPRETATION_SPEC_P);
        interp_spec = putf(interp_spec, $INFLECTIONS, T);
        return interp_spec;
    }

    public static SubLObject nl_interp_spec_return_head_inflectionsP(final SubLObject interp_spec) {
        return getf(interp_spec, $INFLECTIONS, UNPROVIDED);
    }

    public static SubLObject nl_interp_spec_request_pragmatics(SubLObject interp_spec) {
        SubLSystemTrampolineFile.enforceType(interp_spec, NL_INTERPRETATION_SPEC_P);
        interp_spec = putf(interp_spec, $PRAGMATICS, T);
        return interp_spec;
    }

    public static SubLObject nl_interp_spec_return_pragmaticsP(final SubLObject interp_spec) {
        return getf(interp_spec, $PRAGMATICS, UNPROVIDED);
    }

    public static SubLObject new_nl_interpretation(SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        if (NIL != nl_interpretation_p(plist)) {
            return plist;
        }
        return NIL;
    }

    public static SubLObject nl_interpretation_p(final SubLObject item) {
        return list_utilities.property_list_p(item);
    }

    public static SubLObject set_nl_interp_cycl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = NIL;
        SubLObject cycl = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        interp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        cycl = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PLIST_ENTER, interp, $CYCL, cycl);
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    public static SubLObject get_nl_interp_cycl(final SubLObject interp) {
        SubLSystemTrampolineFile.enforceType(interp, NL_INTERPRETATION_P);
        return getf(interp, $CYCL, UNPROVIDED);
    }

    public static SubLObject set_nl_interp_pragmatics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        interp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PLIST_ENTER, interp, $PRAGMATICS, value);
        }
        cdestructuring_bind_error(datum, $list44);
        return NIL;
    }

    public static SubLObject get_nl_interp_pragmatics(final SubLObject interp) {
        SubLSystemTrampolineFile.enforceType(interp, NL_INTERPRETATION_P);
        return getf(interp, $PRAGMATICS, UNPROVIDED);
    }

    public static SubLObject set_nl_interp_weight(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = NIL;
        SubLObject weight = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        interp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        weight = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PLIST_ENTER, interp, $WEIGHT, weight);
        }
        cdestructuring_bind_error(datum, $list50);
        return NIL;
    }

    public static SubLObject get_nl_interp_weight(final SubLObject interp) {
        SubLSystemTrampolineFile.enforceType(interp, NL_INTERPRETATION_P);
        return getf(interp, $WEIGHT, UNPROVIDED);
    }

    public static SubLObject set_nl_interp_justification(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = NIL;
        SubLObject justification = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        interp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        justification = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PLIST_ENTER, interp, $JUSTIFICATION, justification);
        }
        cdestructuring_bind_error(datum, $list56);
        return NIL;
    }

    public static SubLObject get_nl_interp_justification(final SubLObject interp) {
        SubLSystemTrampolineFile.enforceType(interp, NL_INTERPRETATION_P);
        return getf(interp, $JUSTIFICATION, UNPROVIDED);
    }

    public static SubLObject set_nl_interp_phrase_types(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = NIL;
        SubLObject phrase_types = NIL;
        destructuring_bind_must_consp(current, datum, $list62);
        interp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        phrase_types = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PLIST_ENTER, interp, $PHRASE_TYPES, phrase_types);
        }
        cdestructuring_bind_error(datum, $list62);
        return NIL;
    }

    public static SubLObject add_nl_interp_phrase_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = NIL;
        SubLObject phrase_type = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        interp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        phrase_type = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PUTF, interp, $PHRASE_TYPES, bq_cons(phrase_type, getf(interp, $PHRASE_TYPES, UNPROVIDED)));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static SubLObject get_nl_interp_phrase_types(final SubLObject interp) {
        SubLSystemTrampolineFile.enforceType(interp, NL_INTERPRETATION_P);
        return getf(interp, $PHRASE_TYPES, UNPROVIDED);
    }

    public static SubLObject set_nl_interp_head_inflections(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = NIL;
        SubLObject inflections = NIL;
        destructuring_bind_must_consp(current, datum, $list72);
        interp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        inflections = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PLIST_ENTER, interp, $INFLECTIONS, inflections);
        }
        cdestructuring_bind_error(datum, $list72);
        return NIL;
    }

    public static SubLObject get_nl_interp_head_inflections(final SubLObject interp) {
        SubLSystemTrampolineFile.enforceType(interp, NL_INTERPRETATION_P);
        return getf(interp, $INFLECTIONS, UNPROVIDED);
    }

    public static SubLObject nl_interp_to_xml(final SubLObject nl_interp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject xml = NIL;
        final SubLObject attributes = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                try {
                    final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$NLInterpretation, attributes, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$Cycl, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        cycml_generator.cycml_serialize_object(get_nl_interp_cycl(nl_interp));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$Cycl);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            if (NIL != get_nl_interp_weight(nl_interp)) {
                                try {
                                    final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$Weight, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            xml_utilities.xml_print(get_nl_interp_weight(nl_interp), UNPROVIDED);
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$Weight);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                            }
                            if (NIL != get_nl_interp_justification(nl_interp)) {
                                nl_interp_justification_to_xml(get_nl_interp_justification(nl_interp));
                            }
                            if (NIL != get_nl_interp_phrase_types(nl_interp)) {
                                try {
                                    final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$PhraseType, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            SubLObject cdolist_list_var = get_nl_interp_phrase_types(nl_interp);
                                            SubLObject phrase_type = NIL;
                                            phrase_type = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                cycml_generator.cycml_serialize_object(phrase_type);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                phrase_type = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$9, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$PhraseType);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            }
                            if (NIL != get_nl_interp_head_inflections(nl_interp)) {
                                try {
                                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$HeadInflection, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            SubLObject cdolist_list_var = get_nl_interp_head_inflections(nl_interp);
                                            SubLObject inflection = NIL;
                                            inflection = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                cycml_generator.cycml_serialize_object(inflection);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                inflection = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$HeadInflection);
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$NLInterpretation);
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            xml = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values6 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values6);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return xml;
    }

    public static SubLObject nl_interp_justification_to_xml(final SubLObject just) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal($$$justification, list($$$status, $$$unimplemented), T, NIL, $UNINITIALIZED);
            final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
            }
        } finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cycls_from_nl_interps(final SubLObject interps) {
        return remove_duplicates(Mapping.mapcar(GET_NL_INTERP_CYCL, interps), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_justification_p(final SubLObject obj) {
        return listp(obj);
    }

    public static SubLObject declare_nl_api_datastructures_file() {
        declareFunction(me, "new_nl_output_spec", "NEW-NL-OUTPUT-SPEC", 1, 1, false);
        declareFunction(me, "output_spec_interp_spec", "OUTPUT-SPEC-INTERP-SPEC", 1, 0, false);
        declareFunction(me, "subl_output_spec_p", "SUBL-OUTPUT-SPEC-P", 1, 0, false);
        declareFunction(me, "xml_output_spec_p", "XML-OUTPUT-SPEC-P", 1, 0, false);
        declareFunction(me, "new_nl_interpretation_spec", "NEW-NL-INTERPRETATION-SPEC", 0, 1, false);
        declareFunction(me, "nl_interpretation_spec_p", "NL-INTERPRETATION-SPEC-P", 1, 0, false);
        declareFunction(me, "nl_interp_spec_request_cycl", "NL-INTERP-SPEC-REQUEST-CYCL", 1, 0, false);
        declareFunction(me, "nl_interp_spec_return_cyclP", "NL-INTERP-SPEC-RETURN-CYCL?", 1, 0, false);
        declareFunction(me, "nl_interp_spec_request_weight", "NL-INTERP-SPEC-REQUEST-WEIGHT", 1, 0, false);
        declareFunction(me, "nl_interp_spec_return_weightP", "NL-INTERP-SPEC-RETURN-WEIGHT?", 1, 0, false);
        declareFunction(me, "nl_interp_spec_request_justification", "NL-INTERP-SPEC-REQUEST-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "nl_interp_spec_return_justificationP", "NL-INTERP-SPEC-RETURN-JUSTIFICATION?", 1, 0, false);
        declareFunction(me, "nl_interp_spec_request_phrase_types", "NL-INTERP-SPEC-REQUEST-PHRASE-TYPES", 1, 0, false);
        declareFunction(me, "nl_interp_spec_return_phrase_typesP", "NL-INTERP-SPEC-RETURN-PHRASE-TYPES?", 1, 0, false);
        declareFunction(me, "nl_interp_spec_request_head_inflections", "NL-INTERP-SPEC-REQUEST-HEAD-INFLECTIONS", 1, 0, false);
        declareFunction(me, "nl_interp_spec_return_head_inflectionsP", "NL-INTERP-SPEC-RETURN-HEAD-INFLECTIONS?", 1, 0, false);
        declareFunction(me, "nl_interp_spec_request_pragmatics", "NL-INTERP-SPEC-REQUEST-PRAGMATICS", 1, 0, false);
        declareFunction(me, "nl_interp_spec_return_pragmaticsP", "NL-INTERP-SPEC-RETURN-PRAGMATICS?", 1, 0, false);
        declareFunction(me, "new_nl_interpretation", "NEW-NL-INTERPRETATION", 0, 1, false);
        declareFunction(me, "nl_interpretation_p", "NL-INTERPRETATION-P", 1, 0, false);
        declareMacro(me, "set_nl_interp_cycl", "SET-NL-INTERP-CYCL");
        declareFunction(me, "get_nl_interp_cycl", "GET-NL-INTERP-CYCL", 1, 0, false);
        declareMacro(me, "set_nl_interp_pragmatics", "SET-NL-INTERP-PRAGMATICS");
        declareFunction(me, "get_nl_interp_pragmatics", "GET-NL-INTERP-PRAGMATICS", 1, 0, false);
        declareMacro(me, "set_nl_interp_weight", "SET-NL-INTERP-WEIGHT");
        declareFunction(me, "get_nl_interp_weight", "GET-NL-INTERP-WEIGHT", 1, 0, false);
        declareMacro(me, "set_nl_interp_justification", "SET-NL-INTERP-JUSTIFICATION");
        declareFunction(me, "get_nl_interp_justification", "GET-NL-INTERP-JUSTIFICATION", 1, 0, false);
        declareMacro(me, "set_nl_interp_phrase_types", "SET-NL-INTERP-PHRASE-TYPES");
        declareMacro(me, "add_nl_interp_phrase_type", "ADD-NL-INTERP-PHRASE-TYPE");
        declareFunction(me, "get_nl_interp_phrase_types", "GET-NL-INTERP-PHRASE-TYPES", 1, 0, false);
        declareMacro(me, "set_nl_interp_head_inflections", "SET-NL-INTERP-HEAD-INFLECTIONS");
        declareFunction(me, "get_nl_interp_head_inflections", "GET-NL-INTERP-HEAD-INFLECTIONS", 1, 0, false);
        declareFunction(me, "nl_interp_to_xml", "NL-INTERP-TO-XML", 1, 0, false);
        declareFunction(me, "nl_interp_justification_to_xml", "NL-INTERP-JUSTIFICATION-TO-XML", 1, 0, false);
        declareFunction(me, "cycls_from_nl_interps", "CYCLS-FROM-NL-INTERPS", 1, 0, false);
        declareFunction(me, "nl_justification_p", "NL-JUSTIFICATION-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_nl_api_datastructures_file() {
        return NIL;
    }

    public static SubLObject setup_nl_api_datastructures_file() {
        register_external_symbol(NEW_NL_OUTPUT_SPEC);
        register_cyc_api_function(NEW_NL_INTERPRETATION_SPEC, $list8, $str9$construct_a_new_default_NL_interp, NIL, $list10);
        register_cyc_api_function(NL_INTERPRETATION_SPEC_P, $list11, $str12$, NIL, $list13);
        register_cyc_api_function(NL_INTERP_SPEC_REQUEST_CYCL, $list15, $str12$, $list16, NIL);
        register_cyc_api_function($sym17$NL_INTERP_SPEC_RETURN_CYCL_, $list15, $str12$, NIL, NIL);
        register_cyc_api_function(NL_INTERP_SPEC_REQUEST_WEIGHT, $list15, $str12$, $list16, NIL);
        register_cyc_api_function($sym20$NL_INTERP_SPEC_RETURN_WEIGHT_, $list15, $str12$, NIL, NIL);
        register_cyc_api_function(NL_INTERP_SPEC_REQUEST_JUSTIFICATION, $list15, $str12$, $list16, NIL);
        register_cyc_api_function($sym23$NL_INTERP_SPEC_RETURN_JUSTIFICATION_, $list15, $str12$, NIL, NIL);
        register_cyc_api_function(NL_INTERP_SPEC_REQUEST_PHRASE_TYPES, $list15, $str12$, $list16, NIL);
        register_cyc_api_function($sym26$NL_INTERP_SPEC_RETURN_PHRASE_TYPES_, $list15, $str12$, NIL, NIL);
        register_cyc_api_function(NL_INTERP_SPEC_REQUEST_HEAD_INFLECTIONS, $list15, $str12$, $list16, NIL);
        register_cyc_api_function($sym29$NL_INTERP_SPEC_RETURN_HEAD_INFLECTIONS_, $list15, $str12$, NIL, NIL);
        register_cyc_api_function(NL_INTERP_SPEC_REQUEST_PRAGMATICS, $list15, $str12$, $list16, NIL);
        register_cyc_api_function($sym31$NL_INTERP_SPEC_RETURN_PRAGMATICS_, $list15, $str12$, NIL, NIL);
        register_external_symbol(NEW_NL_INTERPRETATION);
        register_cyc_api_function(NL_INTERPRETATION_P, $list34, $str12$, NIL, $list13);
        register_cyc_api_macro(SET_NL_INTERP_CYCL, $list35, $str38$set_the_CycL_value_for_INTERP_to_);
        register_cyc_api_function(GET_NL_INTERP_CYCL, $list40, $str41$Returns_the_CycL_currently_specif, $list42, $list43);
        register_cyc_api_macro(SET_NL_INTERP_PRAGMATICS, $list44, $str46$set_the_pragmatic_features_for_IN);
        register_cyc_api_function(GET_NL_INTERP_PRAGMATICS, $list40, $str48$Returns_the_pragmatic_features_sp, $list42, $list49);
        register_cyc_api_macro(SET_NL_INTERP_WEIGHT, $list50, $str52$set_the_weight_for_INTERP_to_WEIG);
        register_cyc_api_function(GET_NL_INTERP_WEIGHT, $list40, $str54$Returns_the_weight_currently_spec, $list42, $list55);
        register_cyc_api_macro(SET_NL_INTERP_JUSTIFICATION, $list56, $str58$set_the_justification_for_INTERP_);
        register_cyc_api_function(GET_NL_INTERP_JUSTIFICATION, $list40, $str60$Returns_the_justification_current, $list42, $list61);
        register_cyc_api_macro(SET_NL_INTERP_PHRASE_TYPES, $list62, $str64$set_the_phrase_types_for_INTERP_t);
        register_cyc_api_macro(ADD_NL_INTERP_PHRASE_TYPE, $list65, $str68$add_PHRASE_TYPES_to_the_phrase_ty);
        register_cyc_api_function(GET_NL_INTERP_PHRASE_TYPES, $list40, $str70$Returns_the_phrase_types_currentl, $list42, $list71);
        register_cyc_api_macro(SET_NL_INTERP_HEAD_INFLECTIONS, $list72, $str74$set_the_inflections__speech_part_);
        register_cyc_api_function(GET_NL_INTERP_HEAD_INFLECTIONS, $list40, $str76$returns_the_inflections_predicate, $list42, $list71);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nl_api_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_api_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nl_api_datastructures_file();
    }

    
}

/**
 * Total time: 331 ms
 */
