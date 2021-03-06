package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_upcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class kb_modification_event_filters extends SubLTranslatedFile {
    public static final SubLFile me = new kb_modification_event_filters();

    public static final String myName = "com.cyc.cycjava.cycl.kb_modification_event_filters";

    public static final String myFingerPrint = "a45ea8585ac4898849f9a818387519f4c7aa47935f032157e989c1f268b86e04";

    // deflexical
    private static final SubLSymbol $kb_modification_filter_map$ = makeSymbol("*KB-MODIFICATION-FILTER-MAP*");

    // deflexical
    private static final SubLSymbol $kb_modification_filter_event_equivalents$ = makeSymbol("*KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS*");

    // defparameter
    // The filters that have so far passed this event
    public static final SubLSymbol $matched_kb_modification_event_filters$ = makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*");

    // defconstant
    public static final SubLSymbol $dtp_event_filter_description$ = makeSymbol("*DTP-EVENT-FILTER-DESCRIPTION*");













    // deflexical
    public static final SubLSymbol $transmit_kb_modification_event_to_listener_method_table$ = makeSymbol("*TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-METHOD-TABLE*");



    // deflexical
    private static final SubLSymbol $kb_modification_external_filter_delivery_timeout$ = makeSymbol("*KB-MODIFICATION-EXTERNAL-FILTER-DELIVERY-TIMEOUT*");







    // deflexical
    public static final SubLSymbol $compute_key_from_external_event_filter_listener_method_table$ = makeSymbol("*COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $external_event_filter_listener_p_method_table$ = makeSymbol("*EXTERNAL-EVENT-FILTER-LISTENER-P-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $is_external_event_filter_listener_validP_method_table$ = makeSymbol("*IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $invalidate_external_event_filter_listener_method_table$ = makeSymbol("*INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*");

    // deflexical
    // Set to T if one wants a trace of where the modification events are going.
    private static final SubLSymbol $verbose_transmit_kb_modification_events$ = makeSymbol("*VERBOSE-TRANSMIT-KB-MODIFICATION-EVENTS*");



    // defconstant
    public static final SubLSymbol $dtp_message_mailbox_listener$ = makeSymbol("*DTP-MESSAGE-MAILBOX-LISTENER*");





    // deflexical
    private static final SubLSymbol $external_kb_modification_event_listeners_lock$ = makeSymbol("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-LOCK*");

    // Internal Constants
    public static final SubLString $str0$Invalid_event_denotation__A_for_f = makeString("Invalid event denotation ~A for filter ~A.");

    public static final SubLList $list1 = list(makeSymbol("FILTER-TOKEN"), makeSymbol("EVENTS"), makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCSTRING"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLString $str3$Arglist_must_start_with_event_par = makeString("Arglist must start with event parameter.");





    public static final SubLSymbol REGISTER_NEW_KB_MODIFICATION_FILTER = makeSymbol("REGISTER-NEW-KB-MODIFICATION-FILTER");



    public static final SubLSymbol REGISTER_KB_MODIFICATION_FILTER_EVENT_EQUIVALENTS = makeSymbol("REGISTER-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS");

    public static final SubLList $list9 = list(list(makeSymbol("FILTERS")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list11 = list(list(makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*"), NIL));



    public static final SubLList $list13 = list(makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*"));



    public static final SubLSymbol SYMBOLIC_PLIST_P = makeSymbol("SYMBOLIC-PLIST-P");





    private static final SubLSymbol $DEFAULT_KB_MODIFICATION_EVENT_FILTER = makeKeyword("DEFAULT-KB-MODIFICATION-EVENT-FILTER");



    public static final SubLSymbol DEFAULT_KB_MODIFICATION_EVENT_FILTER = makeSymbol("DEFAULT-KB-MODIFICATION-EVENT-FILTER");

    public static final SubLList $list21 = list(makeKeyword("ALL"));



    private static final SubLSymbol $CYCL_FORT_FILTER = makeKeyword("CYCL-FORT-FILTER");

    public static final SubLSymbol KB_MODIFICATION_EVENT_FORT_FILTER = makeSymbol("KB-MODIFICATION-EVENT-FORT-FILTER");

    public static final SubLList $list25 = list(makeKeyword("KB-MODIFY-REMOVE-CONSTANT"), makeKeyword("KB-MODIFY-REMOVE-NART"), makeKeyword("KB-MODIFY-CREATE-ASSERTION"), makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));



    public static final SubLSymbol KB_MODIFICATION_EVENT_COLLECTION_FILTER = makeSymbol("KB-MODIFICATION-EVENT-COLLECTION-FILTER");

    public static final SubLList $list28 = list(makeKeyword("KB-MODIFY-CREATE-ASSERTION"), makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));

    private static final SubLSymbol $LEXICON_FORT_FILTER = makeKeyword("LEXICON-FORT-FILTER");

    public static final SubLSymbol KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER = makeSymbol("KB-MODIFICATION-EVENT-LEXICON-FORT-FILTER");



    public static final SubLSymbol KB_MODIFICATION_EVENT_MT_FILTER = makeSymbol("KB-MODIFICATION-EVENT-MT-FILTER");



    private static final SubLSymbol $KB_MODIFY_REMOVE_CONSTANT = makeKeyword("KB-MODIFY-REMOVE-CONSTANT");





    private static final SubLSymbol $CYCL_FORT_EVENT = makeKeyword("CYCL-FORT-EVENT");









    private static final SubLSymbol $KB_MODIFY_CREATE_ASSERTION = makeKeyword("KB-MODIFY-CREATE-ASSERTION");

    private static final SubLSymbol $FORT_ASSERTION_ADDED = makeKeyword("FORT-ASSERTION-ADDED");







    private static final SubLSymbol $KB_MODIFY_REMOVE_ASSERTION = makeKeyword("KB-MODIFY-REMOVE-ASSERTION");

    private static final SubLSymbol $FORT_ASSERTION_REMOVED = makeKeyword("FORT-ASSERTION-REMOVED");

    private static final SubLSymbol $KB_MODIFY_REMOVE_NART = makeKeyword("KB-MODIFY-REMOVE-NART");





    private static final SubLSymbol $CYCL_COLLECTION_EVENT = makeKeyword("CYCL-COLLECTION-EVENT");







    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));













    private static final SubLSymbol $CYCL_MICROTHEORY_EVENT = makeKeyword("CYCL-MICROTHEORY-EVENT");



    public static final SubLSymbol EVENT_FILTER_DESCRIPTION = makeSymbol("EVENT-FILTER-DESCRIPTION");

    public static final SubLSymbol EVENT_FILTER_DESCRIPTION_P = makeSymbol("EVENT-FILTER-DESCRIPTION-P");

    public static final SubLList $list67 = list(makeSymbol("ID"), makeSymbol("PATTERN"));

    public static final SubLList $list68 = list(makeKeyword("ID"), makeKeyword("PATTERN"));

    public static final SubLList $list69 = list(makeSymbol("EVENT-FILTER-DESCRIPTION-ID"), makeSymbol("EVENT-FILTER-DESCRIPTION-PATTERN"));

    public static final SubLList $list70 = list(makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-ID"), makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN"));

    public static final SubLSymbol PRINT_EVENT_FILTER_DESCRIPTION = makeSymbol("PRINT-EVENT-FILTER-DESCRIPTION");

    public static final SubLSymbol EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-FILTER-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list73 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVENT-FILTER-DESCRIPTION-P"));

    private static final SubLSymbol EVENT_FILTER_DESCRIPTION_ID = makeSymbol("EVENT-FILTER-DESCRIPTION-ID");

    private static final SubLSymbol _CSETF_EVENT_FILTER_DESCRIPTION_ID = makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-ID");

    private static final SubLSymbol EVENT_FILTER_DESCRIPTION_PATTERN = makeSymbol("EVENT-FILTER-DESCRIPTION-PATTERN");

    private static final SubLSymbol _CSETF_EVENT_FILTER_DESCRIPTION_PATTERN = makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN");





    private static final SubLString $str80$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_EVENT_FILTER_DESCRIPTION = makeSymbol("MAKE-EVENT-FILTER-DESCRIPTION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVENT_FILTER_DESCRIPTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-FILTER-DESCRIPTION-METHOD");

    private static final SubLString $str86$_id__ = makeString(" id: ");

    private static final SubLString $str87$_pattern__ = makeString(" pattern: ");

    private static final SubLSymbol $event_filter_registration$ = makeSymbol("*EVENT-FILTER-REGISTRATION*");

    private static final SubLSymbol $event_filter_registration_lock$ = makeSymbol("*EVENT-FILTER-REGISTRATION-LOCK*");

    private static final SubLString $$$Event_Filter_Registration = makeString("Event Filter Registration");

    private static final SubLSymbol $event_filter_pattern_id$ = makeSymbol("*EVENT-FILTER-PATTERN-ID*");

    private static final SubLString $str92$Current_KB_Modification_Event_Fil = makeString("Current KB Modification Event Filter Registration");

    private static final SubLSymbol CREATE_KB_MODIFICATION_EVENT_FILTER = makeSymbol("CREATE-KB-MODIFICATION-EVENT-FILTER");

    private static final SubLSymbol DELETE_KB_MODIFICATION_EVENT_FILTER = makeSymbol("DELETE-KB-MODIFICATION-EVENT-FILTER");



    private static final SubLSymbol $kb_modification_event_to_filter_mapping$ = makeSymbol("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*");

    private static final SubLSymbol $kb_modification_event_to_filter_mapping_lock$ = makeSymbol("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*");

    private static final SubLString $str98$KB_Modification_Event_to_Filter_M = makeString("KB Modification Event to Filter Mapping");

    private static final SubLSymbol $kb_modification_event_internal_listener_table$ = makeSymbol("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*");

    private static final SubLString $str100$Current_KB_Modification_Event_To_ = makeString("Current KB Modification Event To Filter Mapping");

    private static final SubLString $str101$Current_KB_Modification_Event_Int = makeString("Current KB Modification Event Internal Listener Table");



    private static final SubLSymbol KB_MODIFICATION_EVENT_FILTER_GENERIC_EVENT_HANDLER = makeSymbol("KB-MODIFICATION-EVENT-FILTER-GENERIC-EVENT-HANDLER");













    private static final SubLSymbol $KB_MODIFICATION_FILTER_FIRED = makeKeyword("KB-MODIFICATION-FILTER-FIRED");

    private static final SubLSymbol EVENT_P = makeSymbol("EVENT-P");

    private static final SubLString $str112$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");



    private static final SubLString $str114$Not_implemented_for_type__A = makeString("Not implemented for type ~A");

    private static final SubLSymbol $KB_STORE_EVENT = makeKeyword("KB-STORE-EVENT");

    private static final SubLSymbol $kb_modification_filter_event_fired_listener$ = makeSymbol("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*");

    private static final SubLSymbol HANDLE_KB_MODIFICATION_FILTER_FIRED = makeSymbol("HANDLE-KB-MODIFICATION-FILTER-FIRED");

    private static final SubLList $list118 = list(CHAR_hyphen);



    private static final SubLString $$$eventNotifications = makeString("eventNotifications");

    private static final SubLString $str121$http___www_opencyc_org_xml_eventN = makeString("http://www.opencyc.org/xml/eventNotifications.dtd");



    private static final SubLString $$$eventNotification = makeString("eventNotification");

    private static final SubLString $$$kbModificationFilteredEvent = makeString("kbModificationFilteredEvent");

    private static final SubLString $$$filterList = makeString("filterList");

    private static final SubLString $$$filterId = makeString("filterId");

    private static final SubLString $$$timestamp = makeString("timestamp");

    private static final SubLString $$$kbEvents = makeString("kbEvents");

    private static final SubLString $$$kbEvent = makeString("kbEvent");





    private static final SubLString $str132$KB_Modification_Filter_Fired__cou = makeString("KB Modification Filter Fired: could not report event ~S to listener ~A -> error ~A.~%Deregistering listener ~A");

    private static final SubLSymbol $event_filter_listener_registration$ = makeSymbol("*EVENT-FILTER-LISTENER-REGISTRATION*");

    private static final SubLSymbol $event_filter_listener_registration_lock$ = makeSymbol("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*");

    private static final SubLString $str135$Event_Filter_Listener_Registratio = makeString("Event Filter Listener Registration");

    private static final SubLSymbol $event_filter_listener_id$ = makeSymbol("*EVENT-FILTER-LISTENER-ID*");

    private static final SubLString $str137$Current_External_KB_Modification_ = makeString("Current External KB Modification Event Filter Listener Registration");

    private static final SubLSymbol DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = makeSymbol("DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");

    private static final SubLSymbol TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD = makeSymbol("TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-SOCKET-INFO-METHOD");

    private static final SubLSymbol $sym140$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO = makeSymbol("COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD");

    private static final SubLSymbol EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD = makeSymbol("EXTERNAL-EVENT-FILTER-LISTENER-P-SOCKET-INFO-METHOD");

    private static final SubLSymbol $sym142$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD = makeSymbol("IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD");

    private static final SubLSymbol INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD = makeSymbol("INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD");



    private static final SubLString $str145$_A__About_to_send_to__A__A____A__ = makeString("~A: About to send to ~A:~A:~%~A~%");

    private static final SubLSymbol CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");





    private static final SubLSymbol $kb_modification_event_mailbox_suite$ = makeSymbol("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*");



    private static final SubLSymbol WITH_MESSAGE_MAILBOX_SUITE = makeSymbol("WITH-MESSAGE-MAILBOX-SUITE");

    public static final SubLList $list152 = list(makeSymbol("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*"));

    private static final SubLSymbol MESSAGE_MAILBOX_LISTENER = makeSymbol("MESSAGE-MAILBOX-LISTENER");

    private static final SubLSymbol MESSAGE_MAILBOX_LISTENER_P = makeSymbol("MESSAGE-MAILBOX-LISTENER-P");

    private static final SubLList $list155 = list(makeSymbol("ADDRESS"));

    private static final SubLList $list156 = list(makeKeyword("ADDRESS"));

    private static final SubLList $list157 = list(makeSymbol("MMBOX-LISTENER-ADDRESS"));

    private static final SubLList $list158 = list(makeSymbol("_CSETF-MMBOX-LISTENER-ADDRESS"));

    private static final SubLSymbol PRINT_MESSAGE_MAILBOX_LISTENER = makeSymbol("PRINT-MESSAGE-MAILBOX-LISTENER");

    private static final SubLSymbol MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MESSAGE-MAILBOX-LISTENER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list161 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MESSAGE-MAILBOX-LISTENER-P"));

    private static final SubLSymbol MMBOX_LISTENER_ADDRESS = makeSymbol("MMBOX-LISTENER-ADDRESS");

    private static final SubLSymbol _CSETF_MMBOX_LISTENER_ADDRESS = makeSymbol("_CSETF-MMBOX-LISTENER-ADDRESS");



    private static final SubLSymbol MAKE_MESSAGE_MAILBOX_LISTENER = makeSymbol("MAKE-MESSAGE-MAILBOX-LISTENER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_LISTENER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLString $str167$_address__ = makeString(" address: ");



    private static final SubLSymbol $sym169$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN = makeSymbol("TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLSymbol $sym170$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L = makeSymbol("COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLSymbol EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD = makeSymbol("EXTERNAL-EVENT-FILTER-LISTENER-P-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLSymbol $sym172$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER = makeSymbol("IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLSymbol $sym173$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE = makeSymbol("INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLString $str174$The_listener__S_is_no_longer_vali = makeString("The listener ~S is no longer valid.");

    private static final SubLSymbol $sym175$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST = makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER");

    private static final SubLSymbol ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX = makeSymbol("ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX");

    private static final SubLString $str177$Not_a_valid_external_event_filter = makeString("Not a valid external event filter listener ID.");

    private static final SubLString $str178$Wrong_API_for_type____only_suitab = makeString("Wrong API for type -- only suitable for message mailbox listeners.");

    private static final SubLSymbol $active_external_kb_modification_event_filters$ = makeSymbol("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*");

    private static final SubLSymbol $external_kb_modification_event_listeners_for_filters$ = makeSymbol("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*");

    private static final SubLString $str181$External_KB_Modification_Event_Li = makeString("External KB Modification Event Listeners");

    private static final SubLString $str182$Current_External_KB_Modification_ = makeString("Current External KB Modification Event Filters & Listeners");

    private static final SubLString $str183$_Active_Filters__ = makeString(" Active Filters: ");

    private static final SubLString $str184$_Listeners_for_Filters_Map__ = makeString(" Listeners for Filters Map: ");

    private static final SubLSymbol ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = makeSymbol("ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");

    private static final SubLSymbol REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = makeSymbol("REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");



    private static final SubLString $$$KB_Modification_Event_Filters = makeString("KB Modification Event Filters");

    private static final SubLString $str189$KB_Modification_Event_Filters_Tes = makeString("KB Modification Event Filters Test Suite");

    public static SubLObject register_new_kb_modification_filter(final SubLObject filter, final SubLObject function_spec) {
        return dictionary.dictionary_enter($kb_modification_filter_map$.getGlobalValue(), filter, function_spec);
    }

    public static SubLObject register_kb_modification_filter_event_equivalents(final SubLObject filter, final SubLObject event_denotations) {
        SubLObject events = NIL;
        SubLObject v_properties = NIL;
        SubLObject cdolist_list_var = event_denotations;
        SubLObject event_denotation = NIL;
        event_denotation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_modification_event_support.valid_kb_modification_event_class_p(event_denotation)) {
                final SubLObject item_var = event_denotation;
                if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                    events = cons(item_var, events);
                }
            } else
                if (NIL != kb_modification_event_support.valid_kb_modification_event_property_p(event_denotation)) {
                    v_properties = cons(event_denotation, v_properties);
                } else {
                    Errors.error($str0$Invalid_event_denotation__A_for_f, event_denotation, filter);
                }

            cdolist_list_var = cdolist_list_var.rest();
            event_denotation = cdolist_list_var.first();
        } 
        if (NIL != v_properties) {
            cdolist_list_var = kb_modification_event_support.get_kb_modification_event_classes_with_all_properties(v_properties);
            SubLObject event = NIL;
            event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = event;
                if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                    events = cons(item_var, events);
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            } 
        }
        return dictionary.dictionary_enter($kb_modification_filter_event_equivalents$.getGlobalValue(), filter, events);
    }

    public static SubLObject get_kb_modification_filter_event_equivalents(final SubLObject filter) {
        return dictionary.dictionary_lookup($kb_modification_filter_event_equivalents$.getGlobalValue(), filter, UNPROVIDED);
    }

    public static SubLObject define_kb_modification_event_filter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filter_token = NIL;
        SubLObject events = NIL;
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        SubLObject docstring = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        filter_token = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        events = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        docstring = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (arglist.first() != EVENT) {
            Errors.error($str3$Arglist_must_start_with_event_par);
        }
        return list(PROGN, listS(DEFINE_PRIVATE, name, arglist, docstring, append(body, NIL)), list(REGISTER_NEW_KB_MODIFICATION_FILTER, filter_token, list(QUOTE, name)), list(REGISTER_KB_MODIFICATION_FILTER_EVENT_EQUIVALENTS, filter_token, list(QUOTE, events)));
    }

    public static SubLObject map_kb_modification_filter_to_function_spec(final SubLObject filter) {
        return dictionary.dictionary_lookup($kb_modification_filter_map$.getGlobalValue(), filter, symbol_function(IDENTITY));
    }

    public static SubLObject with_matched_kb_modification_event_filters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filters = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        filters = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, $list11, append(body, list(listS(CSETQ, filters, $list13))));
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static SubLObject apply_filter_to_kb_modification_event(final SubLObject event, final SubLObject filter_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passed_filters = NIL;
        SubLObject information_bundle = NIL;
        final SubLObject _prev_bind_0 = $matched_kb_modification_event_filters$.currentBinding(thread);
        try {
            $matched_kb_modification_event_filters$.bind(NIL, thread);
            information_bundle = apply_filter_to_kb_modification_event_internal(event, filter_expression);
            passed_filters = $matched_kb_modification_event_filters$.getDynamicValue(thread);
        } finally {
            $matched_kb_modification_event_filters$.rebind(_prev_bind_0, thread);
        }
        return values(information_bundle, passed_filters);
    }

    public static SubLObject apply_filter_to_kb_modification_event_internal(final SubLObject event, final SubLObject filter_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject filter = pcase_var = filter_expression.first();
        if (pcase_var.eql($AND)) {
            SubLObject was_falseP = NIL;
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject information_bundle = NIL;
            if (NIL == was_falseP) {
                SubLObject csome_list_var = v_clauses;
                SubLObject expression = NIL;
                expression = csome_list_var.first();
                while ((NIL == was_falseP) && (NIL != csome_list_var)) {
                    final SubLObject result = apply_filter_to_kb_modification_event_internal(event, expression);
                    if (NIL != list_utilities.sublisp_boolean(result)) {
                        if (NIL != symbolic_plist_p(result)) {
                            information_bundle = cons(result, information_bundle);
                        } else
                            if (NIL != list_utilities.list_of_type_p(SYMBOLIC_PLIST_P, result)) {
                                SubLObject cdolist_list_var = result;
                                SubLObject one_result = NIL;
                                one_result = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    information_bundle = cons(one_result, information_bundle);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    one_result = cdolist_list_var.first();
                                } 
                            } else {
                                information_bundle = cons(result, information_bundle);
                            }

                    } else {
                        was_falseP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    expression = csome_list_var.first();
                } 
            }
            return NIL == was_falseP ? nreverse(information_bundle) : NIL;
        }
        if (pcase_var.eql($OR)) {
            SubLObject was_trueP = NIL;
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject information_bundle = NIL;
            if (NIL == was_trueP) {
                SubLObject csome_list_var = v_clauses;
                SubLObject expression = NIL;
                expression = csome_list_var.first();
                while ((NIL == was_trueP) && (NIL != csome_list_var)) {
                    final SubLObject result = apply_filter_to_kb_modification_event_internal(event, expression);
                    if (NIL != list_utilities.sublisp_boolean(result)) {
                        if (NIL != symbolic_plist_p(result)) {
                            information_bundle = cons(result, information_bundle);
                        } else
                            if (NIL != list_utilities.list_of_type_p(SYMBOLIC_PLIST_P, result)) {
                                SubLObject cdolist_list_var = result;
                                SubLObject one_result = NIL;
                                one_result = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    information_bundle = cons(one_result, information_bundle);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    one_result = cdolist_list_var.first();
                                } 
                            } else {
                                information_bundle = cons(result, information_bundle);
                            }

                        was_trueP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    expression = csome_list_var.first();
                } 
            }
            return NIL != was_trueP ? nreverse(information_bundle) : NIL;
        }
        if (pcase_var.eql($NOT)) {
            SubLObject passedP = NIL;
            SubLObject passed_filters = NIL;
            final SubLObject _prev_bind_0 = $matched_kb_modification_event_filters$.currentBinding(thread);
            try {
                $matched_kb_modification_event_filters$.bind(NIL, thread);
                passedP = apply_filter_to_kb_modification_event_internal(event, second(filter_expression));
                passed_filters = $matched_kb_modification_event_filters$.getDynamicValue(thread);
            } finally {
                $matched_kb_modification_event_filters$.rebind(_prev_bind_0, thread);
            }
            if (NIL == passedP) {
                $matched_kb_modification_event_filters$.setDynamicValue(cons(cons($NOT, passed_filters), $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            }
            return makeBoolean(NIL == passedP);
        }
        final SubLObject function_spec = map_kb_modification_filter_to_function_spec(filter);
        return apply(function_spec, cons(event, filter_expression.rest().rest()));
    }

    public static SubLObject symbolic_plist_p(final SubLObject list) {
        return makeBoolean((NIL != list_utilities.property_list_p(list)) && list.first().isSymbol());
    }

    public static SubLObject extract_filters_from_kb_modification_filter_expression(final SubLObject filter_expression) {
        final SubLObject pcase_var;
        final SubLObject filter = pcase_var = filter_expression.first();
        if (pcase_var.eql($AND) || pcase_var.eql($OR)) {
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject filters = NIL;
            SubLObject cdolist_list_var = v_clauses;
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1;
                final SubLObject sub_filters = cdolist_list_var_$1 = extract_filters_from_kb_modification_filter_expression(clause);
                SubLObject sub_filter = NIL;
                sub_filter = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    final SubLObject item_var = sub_filter;
                    if (NIL == member(item_var, filters, symbol_function(EQL), symbol_function(IDENTITY))) {
                        filters = cons(item_var, filters);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    sub_filter = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            return filters;
        }
        if (pcase_var.eql($NOT)) {
            return extract_filters_from_kb_modification_filter_expression(second(filter_expression));
        }
        return list(filter);
    }

    public static SubLObject compute_implied_kb_modification_events_from_filter_expression(final SubLObject filter_expression) {
        final SubLObject filters = extract_filters_from_kb_modification_filter_expression(filter_expression);
        SubLObject events = NIL;
        SubLObject cdolist_list_var = filters;
        SubLObject filter = NIL;
        filter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject event_equivalents = cdolist_list_var_$2 = get_kb_modification_filter_event_equivalents(filter);
            SubLObject event = NIL;
            event = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject item_var = event;
                if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                    events = cons(item_var, events);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                event = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            filter = cdolist_list_var.first();
        } 
        return events;
    }

    public static SubLObject default_kb_modification_event_filter(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $matched_kb_modification_event_filters$.setDynamicValue(cons($DEFAULT_KB_MODIFICATION_EVENT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
        return append(list($EVENT_CLASS, event_model.event_class(event)), event_model.event_message(event));
    }

    public static SubLObject kb_modification_event_fort_filter(final SubLObject event, final SubLObject fort, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_mentions_fort(event, fort, modifier);
        if (NIL != details) {
            $matched_kb_modification_event_filters$.setDynamicValue(cons($FORT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return NIL;
    }

    public static SubLObject kb_modification_event_collection_filter(final SubLObject event, final SubLObject collection, final SubLObject modifier, final SubLObject subsumption) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_test_for_collection_assertions(event, collection, modifier, subsumption);
        if (NIL != details) {
            $matched_kb_modification_event_filters$.setDynamicValue(cons($COLLECTION_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return NIL;
    }

    public static SubLObject kb_modification_event_lexicon_fort_filter(final SubLObject event, final SubLObject fort, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $matched_kb_modification_event_filters$.setDynamicValue(cons($LEXICON_FORT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
        return event_model.event_message(event);
    }

    public static SubLObject kb_modification_event_mt_filter(final SubLObject event, final SubLObject v_hlmt, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_test_for_microtheory(event, v_hlmt, modifier);
        if (NIL != details) {
            $matched_kb_modification_event_filters$.setDynamicValue(cons($MT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return NIL;
    }

    public static SubLObject kb_modification_event_mentions_fort(final SubLObject event, SubLObject fort, SubLObject modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $ANY_CHANGE;
        }
        if (NIL == forts.fort_p(fort)) {
            fort = narts_high.find_nart(fort);
            if (NIL == forts.fort_p(fort)) {
                return NIL;
            }
        }
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql($KB_MODIFY_REMOVE_CONSTANT)) {
            if (((($ANY_CHANGE == modifier) || ($FORT_REMOVED == modifier)) && (NIL != constant_p(fort))) && constants_high.constant_external_id(fort).equalp(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_constant_retrieve_external_id(event)))) {
                return list($EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $REMOVED_VALUE, fort);
            }
        } else
            if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
                if (($ANY_CHANGE == modifier) || ($FORT_ASSERTION_ADDED == modifier)) {
                    final SubLObject cnf = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event));
                    final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event));
                    if ((NIL != cycl_utilities.expression_find(fort, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || fort.eql(mt)) {
                        return list(new SubLObject[]{ $EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_ADDED, $FORT_MODIFIED, fort, $ASSERTION_SENTENCE, clauses.cnf_formula(cnf, UNPROVIDED), $ASSERTION_MT, mt });
                    }
                }
            } else
                if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                    if (($ANY_CHANGE == modifier) || ($FORT_ASSERTION_REMOVED == modifier)) {
                        final SubLObject formula = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
                        final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event));
                        if ((NIL != cycl_utilities.expression_find(fort, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || fort.eql(mt)) {
                            return list(new SubLObject[]{ $EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $ASSERTION_SENTENCE, kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event), $ASSERTION_MT, mt });
                        }
                    }
                } else
                    if (((pcase_var.eql($KB_MODIFY_REMOVE_NART) && (($ANY_CHANGE == modifier) || ($FORT_REMOVED == modifier))) && (NIL != nart_handles.nart_p(fort))) && narts_high.nart_hl_formula(fort).equalp(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_nart_retrieve_nart_hl_formula(event)))) {
                        return list($EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $REMOVED_VALUE, fort);
                    }



        return NIL;
    }

    public static SubLObject kb_modification_event_test_for_collection_assertions(final SubLObject event, SubLObject collection, SubLObject modifier, SubLObject subsumption_modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $ANY_CHANGE;
        }
        if (subsumption_modifier == UNPROVIDED) {
            subsumption_modifier = $ALL_INSTANTIATIONS;
        }
        if (NIL == forts.fort_p(collection)) {
            collection = narts_high.find_nart(collection);
            if (NIL == forts.fort_p(collection)) {
                return NIL;
            }
        }
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
            if (modifier == $INSTANCE_REMOVED) {
                return NIL;
            }
            final SubLObject cnf = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event));
            final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event));
            final SubLObject positive = clauses.pos_lits(cnf);
            if (NIL != list_utilities.singletonP(positive)) {
                final SubLObject clause = positive.first();
                if (NIL != kb_modification_event_test_clause_for_collection_assertion(clause, collection, mt, subsumption_modifier)) {
                    final SubLObject v_term = cycl_utilities.formula_arg1(clause, UNPROVIDED);
                    return list($EVENT_TYPE, $CYCL_COLLECTION_EVENT, $EVENT_REASON, $ITEM_ADDED, $COLLECTION_MODIFIED, collection, $ADDED_VALUE, v_term);
                }
            }
        } else
            if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                if (modifier == $INSTANCE_ADDED) {
                    return NIL;
                }
                if (NIL != kb_modification_event.kb_modify_remove_assertion_retrieve_gaf(event)) {
                    final SubLObject sentence = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
                    final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event));
                    if (TWO_INTEGER.numE(formula_arity(sentence, UNPROVIDED)) && (NIL != kb_modification_event_test_clause_for_collection_assertion(sentence, collection, mt, subsumption_modifier))) {
                        final SubLObject v_term2 = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
                        return list($EVENT_TYPE, $CYCL_COLLECTION_EVENT, $EVENT_REASON, $ITEM_REMOVED, $COLLECTION_MODIFIED, collection, $REMOVED_VALUE, v_term2);
                    }
                }
            }

        return NIL;
    }

    public static SubLObject kb_modification_event_test_clause_for_collection_assertion(final SubLObject clause, final SubLObject collection, final SubLObject mt, final SubLObject subsumption_modifier) {
        if (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(clause), $$isa, mt, UNPROVIDED)) {
            final SubLObject mentioned_collection = cycl_utilities.formula_arg2(clause, UNPROVIDED);
            if (collection.eql(mentioned_collection)) {
                return T;
            }
            if ($IMMEDIATE_INSTANTIATIONS != subsumption_modifier) {
                return genls.genlsP(cycl_utilities.formula_arg2(clause, UNPROVIDED), collection, mt, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject kb_modification_event_test_for_microtheory(final SubLObject event, final SubLObject the_test_mt, SubLObject modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $LOCAL_CHANGE;
        }
        final SubLObject test_mt = hlmt_czer.coerce_to_hlmt(the_test_mt);
        SubLObject assertion_mt = NIL;
        SubLObject reason = NIL;
        SubLObject sentence = NIL;
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
            assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event)));
            sentence = clauses.cnf_formula(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event)), UNPROVIDED);
            reason = $ASSERTION_ADDED;
        } else
            if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event)));
                sentence = kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event);
                reason = $ASSERTION_REMOVED;
            } else {
                assertion_mt = NIL;
            }

        if (NIL != hlmt.hlmtP(assertion_mt)) {
            SubLObject matchesP = NIL;
            final SubLObject pcase_var2 = modifier;
            if (pcase_var2.eql($LOCAL_CHANGE)) {
                matchesP = hlmt.hlmt_equalP(test_mt, assertion_mt);
            } else
                if (pcase_var2.eql($UPWARD_CLOSURE)) {
                    matchesP = genl_mts.genl_mtP(test_mt, assertion_mt, test_mt, UNPROVIDED);
                } else
                    if (pcase_var2.eql($DOWNWARD_CLOSURE)) {
                        matchesP = genl_mts.genl_mtP(assertion_mt, test_mt, assertion_mt, UNPROVIDED);
                    }


            if (NIL != matchesP) {
                return list($EVENT_TYPE, $CYCL_MICROTHEORY_EVENT, $EVENT_REASON, reason, $MICROTHEORY_MODIFIED, assertion_mt, $ASSERTION_SENTENCE, sentence);
            }
        }
        return NIL;
    }

    public static SubLObject event_filter_description_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_event_filter_description(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_filter_description_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$event_filter_description_native.class ? T : NIL;
    }

    public static SubLObject event_filter_description_id(final SubLObject v_object) {
        assert NIL != event_filter_description_p(v_object) : "kb_modification_event_filters.event_filter_description_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject event_filter_description_pattern(final SubLObject v_object) {
        assert NIL != event_filter_description_p(v_object) : "kb_modification_event_filters.event_filter_description_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_event_filter_description_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_filter_description_p(v_object) : "kb_modification_event_filters.event_filter_description_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_filter_description_pattern(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_filter_description_p(v_object) : "kb_modification_event_filters.event_filter_description_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_event_filter_description(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $event_filter_description_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_event_filter_description_id(v_new, current_value);
            } else
                if (pcase_var.eql($PATTERN)) {
                    _csetf_event_filter_description_pattern(v_new, current_value);
                } else {
                    Errors.error($str80$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_filter_description(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVENT_FILTER_DESCRIPTION, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, event_filter_description_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PATTERN, event_filter_description_pattern(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVENT_FILTER_DESCRIPTION, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_filter_description_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_filter_description(obj, visitor_fn);
    }

    public static SubLObject print_event_filter_description(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str86$_id__, stream, UNPROVIDED, UNPROVIDED);
            prin1(event_filter_description_id(v_object), stream);
            write_string($str87$_pattern__, stream, UNPROVIDED, UNPROVIDED);
            prin1(event_filter_description_pattern(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject new_event_filter_description(final SubLObject id, final SubLObject pattern) {
        final SubLObject efdesc = make_event_filter_description(UNPROVIDED);
        _csetf_event_filter_description_id(efdesc, id);
        _csetf_event_filter_description_pattern(efdesc, pattern);
        return efdesc;
    }

    public static SubLObject valid_event_filter_description_p(final SubLObject entitiy) {
        return makeBoolean((NIL != event_filter_description_p(entitiy)) && event_filter_description_id(entitiy).isPositive());
    }

    public static SubLObject clear_event_filter_description(final SubLObject efdesc) {
        _csetf_event_filter_description_pattern(efdesc, NIL);
        _csetf_event_filter_description_id(efdesc, MINUS_ONE_INTEGER);
        return NIL;
    }

    public static SubLObject display_current_kb_modification_event_filter_registration(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str92$Current_KB_Modification_Event_Fil, stream);
        terpri(stream);
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents($event_filter_registration$.getGlobalValue(), stream);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject reset_kb_modification_event_filter_registration() {
        $event_filter_registration$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    public static SubLObject kb_modification_event_filter_id_to_filter_description(final SubLObject id) {
        SubLObject efdesc = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            efdesc = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), id, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return efdesc;
    }

    public static SubLObject valid_kb_modification_event_filter_id_p(final SubLObject id) {
        return makeBoolean((id.isFixnum() && id.isPositive()) && (NIL != event_filter_description_p(kb_modification_event_filter_id_to_filter_description(id))));
    }

    public static SubLObject kb_modification_event_filter_pattern_to_id(final SubLObject pattern) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            id = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), pattern, MINUS_ONE_INTEGER);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static SubLObject create_kb_modification_event_filter(final SubLObject pattern) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            id = kb_modification_event_filter_pattern_to_id(pattern);
            if (id.isNegative()) {
                id = integer_sequence_generator.integer_sequence_generator_next($event_filter_pattern_id$.getGlobalValue());
                dictionary.dictionary_enter($event_filter_registration$.getGlobalValue(), pattern, id);
                dictionary.dictionary_enter($event_filter_registration$.getGlobalValue(), id, new_event_filter_description(id, pattern));
            }
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static SubLObject delete_kb_modification_event_filter(final SubLObject filter_id) {
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            final SubLObject efdesc = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), filter_id, UNPROVIDED);
            dictionary.dictionary_remove($event_filter_registration$.getGlobalValue(), event_filter_description_pattern(efdesc));
            dictionary.dictionary_remove($event_filter_registration$.getGlobalValue(), filter_id);
            clear_event_filter_description(efdesc);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject get_all_kb_modification_event_filter_ids() {
        SubLObject filter_ids = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            filter_ids = list_utilities.remove_if_not(symbol_function(FIXNUMP), dictionary.dictionary_keys($event_filter_registration$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return filter_ids;
    }

    public static SubLObject display_current_kb_modification_event_to_filter_mapping(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str100$Current_KB_Modification_Event_To_, stream);
        terpri(stream);
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents($kb_modification_event_to_filter_mapping$.getGlobalValue(), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        princ($str101$Current_KB_Modification_Event_Int, stream);
        terpri(stream);
        release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents($kb_modification_event_internal_listener_table$.getGlobalValue(), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject note_interest_in_kb_modification_event_filter(final SubLObject filter) {
        assert NIL != event_filter_description_p(filter) : "kb_modification_event_filters.event_filter_description_p(filter) " + "CommonSymbols.NIL != kb_modification_event_filters.event_filter_description_p(filter) " + filter;
        final SubLObject filter_pattern = event_filter_description_pattern(filter);
        final SubLObject events = compute_implied_kb_modification_events_from_filter_expression(filter_pattern);
        SubLObject registration_needed = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary.dictionary_enter($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter), events);
            SubLObject cdolist_list_var = events;
            SubLObject event = NIL;
            event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($NOT_FOUND == dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, $NOT_FOUND)) {
                    registration_needed = cons(event, registration_needed);
                }
                dictionary_utilities.dictionary_push($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, filter);
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            } 
            cdolist_list_var = registration_needed;
            SubLObject missing_event = NIL;
            missing_event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject listener = event_broker.describe_funcall_listener(missing_event, KB_MODIFICATION_EVENT_FILTER_GENERIC_EVENT_HANDLER, UNPROVIDED, UNPROVIDED);
                kb_modification_event.register_listener_with_kb_modifications_event_dispatcher(listener);
                dictionary.dictionary_enter($kb_modification_event_internal_listener_table$.getGlobalValue(), missing_event, listener);
                cdolist_list_var = cdolist_list_var.rest();
                missing_event = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        if (NIL != registration_needed) {
            kb_modification_event.ensure_kb_modifications_event_dispatcher_running();
        }
        return registration_needed;
    }

    public static SubLObject note_lack_of_interest_in_kb_modification_filter(final SubLObject filter) {
        assert NIL != event_filter_description_p(filter) : "kb_modification_event_filters.event_filter_description_p(filter) " + "CommonSymbols.NIL != kb_modification_event_filters.event_filter_description_p(filter) " + filter;
        SubLObject deregistration_needed = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            final SubLObject events = dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter), UNPROVIDED);
            dictionary.dictionary_remove($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter));
            SubLObject cdolist_list_var = events;
            SubLObject event = NIL;
            event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_delete_from_value($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, filter, UNPROVIDED, UNPROVIDED);
                if (NIL == dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, UNPROVIDED)) {
                    deregistration_needed = cons(event, deregistration_needed);
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            } 
            cdolist_list_var = deregistration_needed;
            SubLObject extraneous_event = NIL;
            extraneous_event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject listener = dictionary.dictionary_lookup($kb_modification_event_internal_listener_table$.getGlobalValue(), extraneous_event, $NOT_FOUND);
                dictionary.dictionary_remove($kb_modification_event_internal_listener_table$.getGlobalValue(), extraneous_event);
                if ($NOT_FOUND != listener) {
                    kb_modification_event.deregister_listener_with_kb_modifications_event_dispatcher(listener);
                }
                cdolist_list_var = cdolist_list_var.rest();
                extraneous_event = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return deregistration_needed;
    }

    public static SubLObject get_kb_modification_event_filters_from_mapping(final SubLObject event_class) {
        SubLObject filters = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            filters = dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_class, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return filters;
    }

    public static SubLObject post_kb_modification_event_filter_fired(final SubLObject listener, final SubLObject filter, final SubLObject event, final SubLObject information_bundle, final SubLObject supports) {
        final SubLObject message = list(new SubLObject[]{ $LISTENER, listener, $FILTERS, list(filter), $FIRED, event_model.event_timestamp(event), $DETAILS, information_bundle, $TRIGGER, event_model.event_class(event), $SUPPORTS, supports });
        final SubLObject filter_event = event_model.new_event($KB_MODIFICATION_FILTER_FIRED, message, event_model.event_source(event));
        return event_broker.post_event(filter_event, current_external_kb_modification_event_filter_broker());
    }

    public static SubLObject kb_modification_filter_fired_retrieve_trigger(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) " + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $TRIGGER, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_supports(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) " + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $SUPPORTS, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_details(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) " + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $DETAILS, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_fired(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) " + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $FIRED, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_filters(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) " + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $FILTERS, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_listener(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) " + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $LISTENER, UNPROVIDED);
    }

    public static SubLObject kb_modification_event_filter_generic_event_handler(final SubLObject event, final SubLObject params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            SubLObject cdolist_list_var = get_kb_modification_event_filters_from_mapping(event_model.event_class(event));
            SubLObject filter = NIL;
            filter = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject information_bundle = apply_filter_to_kb_modification_event(event, event_filter_description_pattern(filter));
                final SubLObject supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != information_bundle) {
                    final SubLObject id = event_filter_description_id(filter);
                    SubLObject cdolist_list_var_$3;
                    final SubLObject listeners = cdolist_list_var_$3 = get_all_external_kb_modification_event_filter_listeners_for_filter(id);
                    SubLObject listener = NIL;
                    listener = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        post_kb_modification_event_filter_fired(listener, filter, event, information_bundle, supports);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        listener = cdolist_list_var_$3.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                filter = cdolist_list_var.first();
            } 
        }
        return event;
    }

    public static SubLObject transmit_kb_modification_event_to_listener(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        final SubLObject method_function = method_func(listener, $transmit_kb_modification_event_to_listener_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener, message, timeout);
        }
        return Errors.error($str114$Not_implemented_for_type__A, type_of(listener));
    }

    public static SubLObject current_external_kb_modification_event_filter_broker() {
        return kb_modification_event.current_kb_modification_event_broker();
    }

    public static SubLObject event_parameter_name_from_keyword(final SubLObject keyword) {
        final SubLObject adjusted_pieces = string_utilities.split_string(Strings.string_downcase(symbol_name(keyword), UNPROVIDED, UNPROVIDED), $list118);
        if (NIL != list_utilities.singletonP(adjusted_pieces)) {
            return adjusted_pieces.first();
        }
        SubLObject list_var = NIL;
        SubLObject piece = NIL;
        SubLObject counter = NIL;
        list_var = adjusted_pieces;
        piece = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , piece = list_var.first() , counter = add(ONE_INTEGER, counter)) {
            if (!counter.isZero()) {
                Strings.set_char(piece, ZERO_INTEGER, char_upcase(Strings.sublisp_char(piece, ZERO_INTEGER)));
            }
        }
        return apply(symbol_function(CCONCATENATE), adjusted_pieces);
    }

    public static SubLObject generate_xml_for_kb_modification_filter_fired_message(final SubLObject filters, final SubLObject event, final SubLObject stream, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            final SubLObject details = kb_modification_filter_fired_retrieve_details(event);
            xml_utilities.generate_valid_xml_header(stream);
            xml_utilities.generate_xml_header_entry_for_dtd($$$eventNotifications, $str121$http___www_opencyc_org_xml_eventN, stream);
            try {
                final SubLObject _prev_bind_0_$4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$eventNotifications, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$5 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$eventNotification, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$kbModificationFilteredEvent, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                try {
                                                    final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$filterList, NIL, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            SubLObject cdolist_list_var = filters;
                                                            SubLObject filter = NIL;
                                                            filter = cdolist_list_var.first();
                                                            while (NIL != cdolist_list_var) {
                                                                try {
                                                                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$filterId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            princ(event_filter_description_id(filter), stream);
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values = getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$filterId);
                                                                        restoreValuesFromVector(_values);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                                                    }
                                                                }
                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                filter = cdolist_list_var.first();
                                                            } 
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$filterList);
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                }
                                                final SubLObject attributes = list($$$timestamp, event_model.event_timestamp(event));
                                                if (details.first().isSymbol()) {
                                                    generate_xml_for_details_of_kb_modification_filter_fired_message(attributes, details);
                                                } else {
                                                    try {
                                                        final SubLObject _prev_bind_0_$16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$kbEvents, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                SubLObject cdolist_list_var2 = details;
                                                                SubLObject detail = NIL;
                                                                detail = cdolist_list_var2.first();
                                                                while (NIL != cdolist_list_var2) {
                                                                    generate_xml_for_details_of_kb_modification_filter_fired_message(attributes, detail);
                                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                                    detail = cdolist_list_var2.first();
                                                                } 
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$17, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$11, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$16, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values3 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$kbEvents);
                                                            restoreValuesFromVector(_values3);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$kbModificationFilteredEvent);
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$eventNotification);
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$5, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values6 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$eventNotifications);
                    restoreValuesFromVector(_values6);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return event;
    }

    public static SubLObject generate_xml_for_details_of_kb_modification_filter_fired_message(final SubLObject attributes, final SubLObject details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$kbEvent, attributes, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject remainder;
                    SubLObject keyword;
                    SubLObject value;
                    SubLObject tag_name;
                    SubLObject _prev_bind_0_$28;
                    SubLObject _prev_bind_1_$29;
                    SubLObject _prev_bind_0_$29;
                    SubLObject value_tag_name;
                    SubLObject _prev_bind_0_$30;
                    SubLObject _prev_bind_1_$30;
                    SubLObject _prev_bind_0_$31;
                    SubLObject _prev_bind_0_$32;
                    SubLObject _values;
                    for (remainder = NIL, remainder = details; NIL != remainder; remainder = cddr(remainder)) {
                        keyword = remainder.first();
                        value = cadr(remainder);
                        tag_name = event_parameter_name_from_keyword(keyword);
                        try {
                            _prev_bind_0_$28 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            _prev_bind_1_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal(tag_name, NIL, NIL, NIL, $UNINITIALIZED);
                                _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    if (value.isKeyword()) {
                                        value_tag_name = event_parameter_name_from_keyword(value);
                                        _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal(value_tag_name, NIL, T, NIL, $UNINITIALIZED);
                                            _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                                        }
                                    } else {
                                        generate_xml_for_kb_modification_filter_fired_detail(value);
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$29, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$28, thread);
                            }
                        } finally {
                            _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal(tag_name);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$kbEvent);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return T;
    }

    public static SubLObject generate_xml_for_kb_modification_filter_fired_detail(final SubLObject value) {
        if (NIL != list_utilities.tree_find($HP, value, UNPROVIDED, UNPROVIDED)) {
            cycml.cycml_serialize_encapsulated_el_formula(value);
        } else {
            cycml.cycml_serialize_term(value);
        }
        return value;
    }

    public static SubLObject handle_kb_modification_filter_fired(final SubLObject event, final SubLObject params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            final SubLObject listener = kb_modification_filter_fired_retrieve_listener(event);
            final SubLObject filters = kb_modification_filter_fired_retrieve_filters(event);
            SubLObject result = NIL;
            SubLObject xml_message = NIL;
            SubLObject string_stream = NIL;
            try {
                string_stream = make_private_string_output_stream();
                generate_xml_for_kb_modification_filter_fired_message(filters, event, string_stream, UNPROVIDED);
                xml_message = get_output_stream_string(string_stream);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(string_stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        transmit_kb_modification_event_to_listener(listener, xml_message, $kb_modification_external_filter_delivery_timeout$.getGlobalValue());
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                result = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != result) {
                Errors.warn($str132$KB_Modification_Filter_Fired__cou, new SubLObject[]{ event, listener, result, listener });
                delete_external_kb_modification_event_filter_listener(external_kb_modification_event_filter_listener_to_id(listener));
            }
        }
        return event;
    }

    public static SubLObject display_current_external_kb_modification_event_filter_listener_registration(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str137$Current_External_KB_Modification_, UNPROVIDED);
        terpri(stream);
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents($event_filter_listener_registration$.getGlobalValue(), stream);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject reset_external_kb_modification_event_filter_listener_registration() {
        $event_filter_listener_registration$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    public static SubLObject compute_key_from_external_event_filter_listener(final SubLObject listener) {
        final SubLObject method_function = method_func(listener, $compute_key_from_external_event_filter_listener_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener);
        }
        return listener;
    }

    public static SubLObject external_event_filter_listener_p(final SubLObject listener) {
        final SubLObject method_function = method_func(listener, $external_event_filter_listener_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener);
        }
        return NIL;
    }

    public static SubLObject is_external_event_filter_listener_validP(final SubLObject listener) {
        final SubLObject method_function = method_func(listener, $is_external_event_filter_listener_validP_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener);
        }
        return NIL;
    }

    public static SubLObject invalidate_external_event_filter_listener(final SubLObject listener) {
        final SubLObject method_function = method_func(listener, $invalidate_external_event_filter_listener_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener);
        }
        return NIL;
    }

    public static SubLObject valid_external_event_filter_listener_p(final SubLObject v_object) {
        return makeBoolean((NIL != external_event_filter_listener_p(v_object)) && (NIL != is_external_event_filter_listener_validP(v_object)));
    }

    public static SubLObject valid_external_kb_modification_event_filter_listener_id_p(final SubLObject id) {
        return makeBoolean((id.isFixnum() && id.isPositive()) && (NIL != external_event_filter_listener_p(external_kb_modification_event_filter_listener_id_to_listener(id))));
    }

    public static SubLObject new_external_kb_modification_event_filter_listener(final SubLObject listener) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            final SubLObject key = compute_key_from_external_event_filter_listener(listener);
            id = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), key, MINUS_ONE_INTEGER);
            if (!id.isNegative()) {
                delete_external_kb_modification_event_filter_listener(id);
            }
            id = integer_sequence_generator.integer_sequence_generator_next($event_filter_listener_id$.getGlobalValue());
            dictionary.dictionary_enter($event_filter_listener_registration$.getGlobalValue(), key, id);
            dictionary.dictionary_enter($event_filter_listener_registration$.getGlobalValue(), id, listener);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static SubLObject delete_external_kb_modification_event_filter_listener(final SubLObject listener_id) {
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            SubLObject listener = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), listener_id, UNPROVIDED);
            if (NIL != external_event_filter_listener_p(listener)) {
                remove_listener_from_all_external_kb_modification_event_filters_internal(listener);
                final SubLObject key = compute_key_from_external_event_filter_listener(listener);
                dictionary.dictionary_remove($event_filter_listener_registration$.getGlobalValue(), listener_id);
                dictionary.dictionary_remove($event_filter_listener_registration$.getGlobalValue(), key);
                listener = invalidate_external_event_filter_listener(listener);
            }
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject get_all_external_kb_modification_event_filter_listener_ids() {
        SubLObject listeners = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            listeners = list_utilities.remove_if_not(symbol_function(FIXNUMP), dictionary.dictionary_keys($event_filter_listener_registration$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return listeners;
    }

    public static SubLObject external_kb_modification_event_filter_listener_id_to_listener(final SubLObject id) {
        SubLObject description = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            description = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), id, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return description;
    }

    public static SubLObject external_kb_modification_event_filter_listener_to_id(final SubLObject listener) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            id = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), compute_key_from_external_event_filter_listener(listener), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static SubLObject transmit_kb_modification_event_to_listener_socket_info_method(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        return transmit_kb_modification_event_to_socket_info_listener(listener, message, timeout);
    }

    public static SubLObject compute_key_from_external_event_filter_listener_socket_info_method(final SubLObject listener) {
        return compute_key_from_external_event_filter_socket_info_listener(listener);
    }

    public static SubLObject external_event_filter_listener_p_socket_info_method(final SubLObject listener) {
        return T;
    }

    public static SubLObject is_external_event_filter_listener_validP_socket_info_method(final SubLObject listener) {
        return is_external_event_socket_info_listener_validP(listener);
    }

    public static SubLObject invalidate_external_event_filter_listener_socket_info_method(final SubLObject listener) {
        return invalidate_external_socket_info_event_listener(listener);
    }

    public static SubLObject compute_key_from_external_event_filter_socket_info_listener(final SubLObject listener) {
        return cons(event_broker.socket_info_host(listener), event_broker.socket_info_port(listener));
    }

    public static SubLObject is_external_event_socket_info_listener_validP(final SubLObject listener) {
        return makeBoolean(event_broker.socket_info_host(listener).isString() && event_broker.socket_info_port(listener).isFixnum());
    }

    public static SubLObject invalidate_external_socket_info_event_listener(final SubLObject listener) {
        event_broker._csetf_socket_info_host(listener, NIL);
        event_broker._csetf_socket_info_port(listener, NIL);
        return listener;
    }

    public static SubLObject transmit_kb_modification_event_to_socket_info_listener(final SubLObject socket_info_listener, final SubLObject message, final SubLObject timeout) {
        final SubLObject host = event_broker.socket_info_host(socket_info_listener);
        final SubLObject port = event_broker.socket_info_port(socket_info_listener);
        SubLObject stream = NIL;
        try {
            stream = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, $PRIVATE);
            if (NIL != validate_tcp_connection(stream, host, port)) {
                if (NIL != $verbose_transmit_kb_modification_events$.getGlobalValue()) {
                    Errors.warn($str145$_A__About_to_send_to__A__A____A__, new SubLObject[]{ current_process(), host, port, message });
                }
                write_string(message, stream, UNPROVIDED, UNPROVIDED);
                force_output(stream);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != stream) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return socket_info_listener;
    }

    public static SubLObject create_external_kb_modification_event_filter_listener(final SubLObject host, final SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = NIL;
        }
        assert NIL != stringp(host) : "Types.stringp(host) " + "CommonSymbols.NIL != Types.stringp(host) " + host;
        assert NIL != plusp(port) : "Numbers.plusp(port) " + "CommonSymbols.NIL != Numbers.plusp(port) " + port;
        return new_external_kb_modification_event_filter_listener(event_broker.new_socket_info(host, port, UNPROVIDED));
    }

    public static SubLObject clear_kb_modification_event_mailboxes() {
        $kb_modification_event_mailbox_suite$.setGlobalValue(message_mailboxes.new_message_mailbox_suite());
        return $CLEARED;
    }

    public static SubLObject current_kb_modification_event_mailbox_suite() {
        return $kb_modification_event_mailbox_suite$.getGlobalValue();
    }

    public static SubLObject with_kb_modification_event_mailbox_suite(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_MESSAGE_MAILBOX_SUITE, $list152, append(body, NIL));
    }

    public static SubLObject message_mailbox_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_message_mailbox_listener(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject message_mailbox_listener_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$message_mailbox_listener_native.class ? T : NIL;
    }

    public static SubLObject mmbox_listener_address(final SubLObject v_object) {
        assert NIL != message_mailbox_listener_p(v_object) : "kb_modification_event_filters.message_mailbox_listener_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_mmbox_listener_address(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_mailbox_listener_p(v_object) : "kb_modification_event_filters.message_mailbox_listener_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_message_mailbox_listener(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $message_mailbox_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ADDRESS)) {
                _csetf_mmbox_listener_address(v_new, current_value);
            } else {
                Errors.error($str80$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_message_mailbox_listener(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MESSAGE_MAILBOX_LISTENER, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ADDRESS, mmbox_listener_address(obj));
        funcall(visitor_fn, obj, $END, MAKE_MESSAGE_MAILBOX_LISTENER, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_message_mailbox_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message_mailbox_listener(obj, visitor_fn);
    }

    public static SubLObject print_message_mailbox_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str167$_address__, stream, UNPROVIDED, UNPROVIDED);
            prin1(mmbox_listener_address(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject new_message_mailbox_listener(SubLObject mailbox_suite) {
        if (mailbox_suite == UNPROVIDED) {
            mailbox_suite = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mmbox = make_message_mailbox_listener(UNPROVIDED);
        final SubLObject address = Guids.guid_to_string(Guids.new_guid());
        _csetf_mmbox_listener_address(mmbox, address);
        if (NIL != message_mailboxes.message_mailbox_suite_p(mailbox_suite)) {
            final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
            try {
                message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                message_mailboxes.ensure_message_mailbox_allocation(address, mailbox_suite);
            } finally {
                message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_0, thread);
            }
        }
        return mmbox;
    }

    public static SubLObject transmit_kb_modification_event_to_listener_message_mailbox_listener_method(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        return transmit_kb_modification_event_to_message_mailbox_listener(listener, message, timeout);
    }

    public static SubLObject compute_key_from_external_event_filter_listener_message_mailbox_listener_method(final SubLObject listener) {
        return compute_key_from_external_event_filter_message_mailbox_listener(listener);
    }

    public static SubLObject external_event_filter_listener_p_message_mailbox_listener_method(final SubLObject listener) {
        return T;
    }

    public static SubLObject is_external_event_filter_listener_validP_message_mailbox_listener_method(final SubLObject listener) {
        return is_external_event_message_mailbox_listener_validP(listener);
    }

    public static SubLObject invalidate_external_event_filter_listener_message_mailbox_listener_method(final SubLObject listener) {
        return invalidate_external_message_mailbox_event_listener(listener);
    }

    public static SubLObject compute_key_from_external_event_filter_message_mailbox_listener(final SubLObject listener) {
        return mmbox_listener_address(listener);
    }

    public static SubLObject is_external_event_message_mailbox_listener_validP(final SubLObject listener) {
        return Guids.guid_string_p(mmbox_listener_address(listener));
    }

    public static SubLObject invalidate_external_message_mailbox_event_listener(final SubLObject listener) {
        _csetf_mmbox_listener_address(listener, NIL);
        return listener;
    }

    public static SubLObject transmit_kb_modification_event_to_message_mailbox_listener(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject address = mmbox_listener_address(listener);
        SubLObject errorP = NIL;
        final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
        final SubLObject _prev_bind_2 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
        try {
            message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
            message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
            if (NIL != message_mailboxes.known_message_mailboxP(address)) {
                message_mailboxes.store_mail_in_message_mailbox(address, message, UNPROVIDED);
            } else {
                errorP = T;
            }
        } finally {
            message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_2, thread);
            message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0, thread);
        }
        if (NIL != errorP) {
            Errors.error($str174$The_listener__S_is_no_longer_vali, listener);
        }
        return listener;
    }

    public static SubLObject create_external_kb_modification_event_filter_message_mailbox_listener() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject listener = NIL;
        final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
        try {
            message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
            listener = new_message_mailbox_listener(current_kb_modification_event_mailbox_suite());
        } finally {
            message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_0, thread);
        }
        return new_external_kb_modification_event_filter_listener(listener);
    }

    public static SubLObject all_external_kb_modification_event_filter_messages_from_mailbox(final SubLObject listener_id, SubLObject cleanup_on_exitP) {
        if (cleanup_on_exitP == UNPROVIDED) {
            cleanup_on_exitP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if (NIL == valid_external_event_filter_listener_p(listener)) {
            Errors.error($str177$Not_a_valid_external_event_filter);
        }
        if (NIL == message_mailbox_listener_p(listener)) {
            Errors.error($str178$Wrong_API_for_type____only_suitab);
        }
        final SubLObject address = mmbox_listener_address(listener);
        SubLObject event_counter = ZERO_INTEGER;
        try {
            while (true) {
                final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                final SubLObject _prev_bind_2 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                try {
                    message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                    message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                    final SubLObject message = message_mailboxes.retrieve_mail_from_message_mailbox(address);
                    task_processor.post_task_info_processor_partial_results(list(message));
                    event_counter = add(event_counter, ONE_INTEGER);
                } finally {
                    message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_2, thread);
                    message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0, thread);
                }
            } 
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != cleanup_on_exitP) {
                    final SubLObject _prev_bind_0_$35 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                    try {
                        message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                        message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                        message_mailboxes.deallocate_message_mailbox(address, UNPROVIDED);
                    } finally {
                        message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_4, thread);
                        message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0_$35, thread);
                    }
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
    }

    public static SubLObject display_current_external_kb_modification_event_filters_and_listeners(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        princ($str182$Current_External_KB_Modification_, stream);
        display_current_kb_modification_event_to_filter_mapping(stream);
        display_current_kb_modification_event_filter_registration(stream);
        display_current_external_kb_modification_event_filter_listener_registration(stream);
        terpri(stream);
        princ($str183$_Active_Filters__, stream);
        terpri(stream);
        dictionary_utilities.print_dictionary_contents($active_external_kb_modification_event_filters$.getGlobalValue(), stream);
        terpri(stream);
        princ($str184$_Listeners_for_Filters_Map__, stream);
        terpri(stream);
        dictionary_utilities.print_dictionary_contents($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), UNPROVIDED);
        return T;
    }

    public static SubLObject reset_external_kb_modification_event_filters_and_listeners() {
        reset_kb_modification_event_filter_registration();
        reset_external_kb_modification_event_filter_listener_registration();
        $active_external_kb_modification_event_filters$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        $external_kb_modification_event_listeners_for_filters$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    public static SubLObject add_external_kb_modification_event_filter_listener(final SubLObject listener_id, final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if ((NIL == valid_event_filter_description_p(filter)) || (NIL == valid_external_event_filter_listener_p(listener))) {
            return NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            final SubLObject not_foundP = eq($NOT_FOUND, dictionary.dictionary_lookup($active_external_kb_modification_event_filters$.getGlobalValue(), filter, $NOT_FOUND));
            dictionary_utilities.dictionary_increment($active_external_kb_modification_event_filters$.getGlobalValue(), filter, UNPROVIDED);
            dictionary_utilities.dictionary_push($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, listener);
            dictionary_utilities.dictionary_push($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, filter);
            if (NIL != not_foundP) {
                note_interest_in_kb_modification_event_filter(filter);
            }
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject get_active_external_kb_modification_event_filters() {
        SubLObject filters = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            filters = dictionary.dictionary_keys($active_external_kb_modification_event_filters$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return filters;
    }

    public static SubLObject get_all_external_kb_modification_event_filter_listeners_for_filter(final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        SubLObject listeners = NIL;
        if (NIL == valid_event_filter_description_p(filter)) {
            return NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            listeners = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return listeners;
    }

    public static SubLObject get_all_filters_for_external_kb_modification_event_filter_listener(final SubLObject listener_id) {
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        SubLObject filters = NIL;
        if (NIL == valid_external_event_filter_listener_p(listener)) {
            return NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            filters = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return filters;
    }

    public static SubLObject remove_external_kb_modification_event_filter_listener(final SubLObject listener_id, final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if ((NIL == valid_event_filter_description_p(filter)) || (NIL == valid_external_event_filter_listener_p(listener))) {
            return NIL;
        }
        return remove_external_kb_modification_event_filter_listener_internal(listener, filter);
    }

    public static SubLObject remove_external_kb_modification_event_filter_listener_internal(final SubLObject listener, final SubLObject filter) {
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            dictionary_utilities.dictionary_decrement_and_remove_if($active_external_kb_modification_event_filters$.getGlobalValue(), filter, UNPROVIDED, UNPROVIDED);
            dictionary_utilities.dictionary_delete_from_value($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, listener, UNPROVIDED, UNPROVIDED);
            dictionary_utilities.dictionary_delete_from_value($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, filter, UNPROVIDED, UNPROVIDED);
            if ($EMPTY == dictionary.dictionary_lookup($active_external_kb_modification_event_filters$.getGlobalValue(), filter, $EMPTY)) {
                note_lack_of_interest_in_kb_modification_filter(filter);
            }
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject remove_listener_from_all_external_kb_modification_event_filters(final SubLObject listener_id) {
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if (NIL == valid_external_event_filter_listener_p(listener)) {
            return NIL;
        }
        return remove_listener_from_all_external_kb_modification_event_filters_internal(listener);
    }

    public static SubLObject remove_listener_from_all_external_kb_modification_event_filters_internal(final SubLObject listener) {
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            SubLObject cdolist_list_var;
            final SubLObject filters = cdolist_list_var = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, UNPROVIDED);
            SubLObject filter = NIL;
            filter = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                remove_external_kb_modification_event_filter_listener_internal(listener, filter);
                cdolist_list_var = cdolist_list_var.rest();
                filter = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject declare_kb_modification_event_filters_file() {
        declareFunction(me, "register_new_kb_modification_filter", "REGISTER-NEW-KB-MODIFICATION-FILTER", 2, 0, false);
        declareFunction(me, "register_kb_modification_filter_event_equivalents", "REGISTER-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 2, 0, false);
        declareFunction(me, "get_kb_modification_filter_event_equivalents", "GET-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 1, 0, false);
        declareMacro(me, "define_kb_modification_event_filter", "DEFINE-KB-MODIFICATION-EVENT-FILTER");
        declareFunction(me, "map_kb_modification_filter_to_function_spec", "MAP-KB-MODIFICATION-FILTER-TO-FUNCTION-SPEC", 1, 0, false);
        declareMacro(me, "with_matched_kb_modification_event_filters", "WITH-MATCHED-KB-MODIFICATION-EVENT-FILTERS");
        declareFunction(me, "apply_filter_to_kb_modification_event", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT", 2, 0, false);
        declareFunction(me, "apply_filter_to_kb_modification_event_internal", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT-INTERNAL", 2, 0, false);
        declareFunction(me, "symbolic_plist_p", "SYMBOLIC-PLIST-P", 1, 0, false);
        declareFunction(me, "extract_filters_from_kb_modification_filter_expression", "EXTRACT-FILTERS-FROM-KB-MODIFICATION-FILTER-EXPRESSION", 1, 0, false);
        declareFunction(me, "compute_implied_kb_modification_events_from_filter_expression", "COMPUTE-IMPLIED-KB-MODIFICATION-EVENTS-FROM-FILTER-EXPRESSION", 1, 0, false);
        declareFunction(me, "default_kb_modification_event_filter", "DEFAULT-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction(me, "kb_modification_event_fort_filter", "KB-MODIFICATION-EVENT-FORT-FILTER", 3, 0, false);
        declareFunction(me, "kb_modification_event_collection_filter", "KB-MODIFICATION-EVENT-COLLECTION-FILTER", 4, 0, false);
        declareFunction(me, "kb_modification_event_lexicon_fort_filter", "KB-MODIFICATION-EVENT-LEXICON-FORT-FILTER", 3, 0, false);
        declareFunction(me, "kb_modification_event_mt_filter", "KB-MODIFICATION-EVENT-MT-FILTER", 3, 0, false);
        declareFunction(me, "kb_modification_event_mentions_fort", "KB-MODIFICATION-EVENT-MENTIONS-FORT", 2, 1, false);
        declareFunction(me, "kb_modification_event_test_for_collection_assertions", "KB-MODIFICATION-EVENT-TEST-FOR-COLLECTION-ASSERTIONS", 2, 2, false);
        declareFunction(me, "kb_modification_event_test_clause_for_collection_assertion", "KB-MODIFICATION-EVENT-TEST-CLAUSE-FOR-COLLECTION-ASSERTION", 4, 0, false);
        declareFunction(me, "kb_modification_event_test_for_microtheory", "KB-MODIFICATION-EVENT-TEST-FOR-MICROTHEORY", 2, 1, false);
        declareFunction(me, "event_filter_description_print_function_trampoline", "EVENT-FILTER-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "event_filter_description_p", "EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
        new kb_modification_event_filters.$event_filter_description_p$UnaryFunction();
        declareFunction(me, "event_filter_description_id", "EVENT-FILTER-DESCRIPTION-ID", 1, 0, false);
        declareFunction(me, "event_filter_description_pattern", "EVENT-FILTER-DESCRIPTION-PATTERN", 1, 0, false);
        declareFunction(me, "_csetf_event_filter_description_id", "_CSETF-EVENT-FILTER-DESCRIPTION-ID", 2, 0, false);
        declareFunction(me, "_csetf_event_filter_description_pattern", "_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN", 2, 0, false);
        declareFunction(me, "make_event_filter_description", "MAKE-EVENT-FILTER-DESCRIPTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_event_filter_description", "VISIT-DEFSTRUCT-EVENT-FILTER-DESCRIPTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_event_filter_description_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-FILTER-DESCRIPTION-METHOD", 2, 0, false);
        declareFunction(me, "print_event_filter_description", "PRINT-EVENT-FILTER-DESCRIPTION", 3, 0, false);
        declareFunction(me, "new_event_filter_description", "NEW-EVENT-FILTER-DESCRIPTION", 2, 0, false);
        declareFunction(me, "valid_event_filter_description_p", "VALID-EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
        declareFunction(me, "clear_event_filter_description", "CLEAR-EVENT-FILTER-DESCRIPTION", 1, 0, false);
        declareFunction(me, "display_current_kb_modification_event_filter_registration", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 1, false);
        declareFunction(me, "reset_kb_modification_event_filter_registration", "RESET-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 0, false);
        declareFunction(me, "kb_modification_event_filter_id_to_filter_description", "KB-MODIFICATION-EVENT-FILTER-ID-TO-FILTER-DESCRIPTION", 1, 0, false);
        declareFunction(me, "valid_kb_modification_event_filter_id_p", "VALID-KB-MODIFICATION-EVENT-FILTER-ID-P", 1, 0, false);
        declareFunction(me, "kb_modification_event_filter_pattern_to_id", "KB-MODIFICATION-EVENT-FILTER-PATTERN-TO-ID", 1, 0, false);
        declareFunction(me, "create_kb_modification_event_filter", "CREATE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction(me, "delete_kb_modification_event_filter", "DELETE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction(me, "get_all_kb_modification_event_filter_ids", "GET-ALL-KB-MODIFICATION-EVENT-FILTER-IDS", 0, 0, false);
        declareFunction(me, "display_current_kb_modification_event_to_filter_mapping", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-TO-FILTER-MAPPING", 0, 1, false);
        declareFunction(me, "note_interest_in_kb_modification_event_filter", "NOTE-INTEREST-IN-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction(me, "note_lack_of_interest_in_kb_modification_filter", "NOTE-LACK-OF-INTEREST-IN-KB-MODIFICATION-FILTER", 1, 0, false);
        declareFunction(me, "get_kb_modification_event_filters_from_mapping", "GET-KB-MODIFICATION-EVENT-FILTERS-FROM-MAPPING", 1, 0, false);
        declareFunction(me, "post_kb_modification_event_filter_fired", "POST-KB-MODIFICATION-EVENT-FILTER-FIRED", 5, 0, false);
        declareFunction(me, "kb_modification_filter_fired_retrieve_trigger", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-TRIGGER", 1, 0, false);
        declareFunction(me, "kb_modification_filter_fired_retrieve_supports", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-SUPPORTS", 1, 0, false);
        declareFunction(me, "kb_modification_filter_fired_retrieve_details", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-DETAILS", 1, 0, false);
        declareFunction(me, "kb_modification_filter_fired_retrieve_fired", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FIRED", 1, 0, false);
        declareFunction(me, "kb_modification_filter_fired_retrieve_filters", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FILTERS", 1, 0, false);
        declareFunction(me, "kb_modification_filter_fired_retrieve_listener", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-LISTENER", 1, 0, false);
        declareFunction(me, "kb_modification_event_filter_generic_event_handler", "KB-MODIFICATION-EVENT-FILTER-GENERIC-EVENT-HANDLER", 2, 0, false);
        declareFunction(me, "transmit_kb_modification_event_to_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER", 3, 0, false);
        declareFunction(me, "current_external_kb_modification_event_filter_broker", "CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER", 0, 0, false);
        declareFunction(me, "event_parameter_name_from_keyword", "EVENT-PARAMETER-NAME-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "generate_xml_for_kb_modification_filter_fired_message", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 3, 1, false);
        declareFunction(me, "generate_xml_for_details_of_kb_modification_filter_fired_message", "GENERATE-XML-FOR-DETAILS-OF-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 2, 0, false);
        declareFunction(me, "generate_xml_for_kb_modification_filter_fired_detail", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-DETAIL", 1, 0, false);
        declareFunction(me, "handle_kb_modification_filter_fired", "HANDLE-KB-MODIFICATION-FILTER-FIRED", 2, 0, false);
        declareFunction(me, "display_current_external_kb_modification_event_filter_listener_registration", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 1, false);
        declareFunction(me, "reset_external_kb_modification_event_filter_listener_registration", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 0, false);
        declareFunction(me, "compute_key_from_external_event_filter_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction(me, "external_event_filter_listener_p", "EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
        declareFunction(me, "is_external_event_filter_listener_validP", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?", 1, 0, false);
        declareFunction(me, "invalidate_external_event_filter_listener", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction(me, "valid_external_event_filter_listener_p", "VALID-EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
        declareFunction(me, "valid_external_kb_modification_event_filter_listener_id_p", "VALID-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-P", 1, 0, false);
        declareFunction(me, "new_external_kb_modification_event_filter_listener", "NEW-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction(me, "delete_external_kb_modification_event_filter_listener", "DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction(me, "get_all_external_kb_modification_event_filter_listener_ids", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-IDS", 0, 0, false);
        declareFunction(me, "external_kb_modification_event_filter_listener_id_to_listener", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-TO-LISTENER", 1, 0, false);
        declareFunction(me, "external_kb_modification_event_filter_listener_to_id", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-TO-ID", 1, 0, false);
        declareFunction(me, "transmit_kb_modification_event_to_listener_socket_info_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-SOCKET-INFO-METHOD", 3, 0, false);
        declareFunction(me, "compute_key_from_external_event_filter_listener_socket_info_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction(me, "external_event_filter_listener_p_socket_info_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction(me, "is_external_event_filter_listener_validP_socket_info_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction(me, "invalidate_external_event_filter_listener_socket_info_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction(me, "compute_key_from_external_event_filter_socket_info_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-SOCKET-INFO-LISTENER", 1, 0, false);
        declareFunction(me, "is_external_event_socket_info_listener_validP", "IS-EXTERNAL-EVENT-SOCKET-INFO-LISTENER-VALID?", 1, 0, false);
        declareFunction(me, "invalidate_external_socket_info_event_listener", "INVALIDATE-EXTERNAL-SOCKET-INFO-EVENT-LISTENER", 1, 0, false);
        declareFunction(me, "transmit_kb_modification_event_to_socket_info_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-SOCKET-INFO-LISTENER", 3, 0, false);
        declareFunction(me, "create_external_kb_modification_event_filter_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 1, false);
        declareFunction(me, "clear_kb_modification_event_mailboxes", "CLEAR-KB-MODIFICATION-EVENT-MAILBOXES", 0, 0, false);
        declareFunction(me, "current_kb_modification_event_mailbox_suite", "CURRENT-KB-MODIFICATION-EVENT-MAILBOX-SUITE", 0, 0, false);
        declareMacro(me, "with_kb_modification_event_mailbox_suite", "WITH-KB-MODIFICATION-EVENT-MAILBOX-SUITE");
        declareFunction(me, "message_mailbox_listener_print_function_trampoline", "MESSAGE-MAILBOX-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "message_mailbox_listener_p", "MESSAGE-MAILBOX-LISTENER-P", 1, 0, false);
        new kb_modification_event_filters.$message_mailbox_listener_p$UnaryFunction();
        declareFunction(me, "mmbox_listener_address", "MMBOX-LISTENER-ADDRESS", 1, 0, false);
        declareFunction(me, "_csetf_mmbox_listener_address", "_CSETF-MMBOX-LISTENER-ADDRESS", 2, 0, false);
        declareFunction(me, "make_message_mailbox_listener", "MAKE-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
        declareFunction(me, "visit_defstruct_message_mailbox_listener", "VISIT-DEFSTRUCT-MESSAGE-MAILBOX-LISTENER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_message_mailbox_listener_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-LISTENER-METHOD", 2, 0, false);
        declareFunction(me, "print_message_mailbox_listener", "PRINT-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
        declareFunction(me, "new_message_mailbox_listener", "NEW-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
        declareFunction(me, "transmit_kb_modification_event_to_listener_message_mailbox_listener_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 3, 0, false);
        declareFunction(me, "compute_key_from_external_event_filter_listener_message_mailbox_listener_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction(me, "external_event_filter_listener_p_message_mailbox_listener_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction(me, "is_external_event_filter_listener_validP_message_mailbox_listener_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction(me, "invalidate_external_event_filter_listener_message_mailbox_listener_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction(me, "compute_key_from_external_event_filter_message_mailbox_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 1, 0, false);
        declareFunction(me, "is_external_event_message_mailbox_listener_validP", "IS-EXTERNAL-EVENT-MESSAGE-MAILBOX-LISTENER-VALID?", 1, 0, false);
        declareFunction(me, "invalidate_external_message_mailbox_event_listener", "INVALIDATE-EXTERNAL-MESSAGE-MAILBOX-EVENT-LISTENER", 1, 0, false);
        declareFunction(me, "transmit_kb_modification_event_to_message_mailbox_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
        declareFunction(me, "create_external_kb_modification_event_filter_message_mailbox_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 0, 0, false);
        declareFunction(me, "all_external_kb_modification_event_filter_messages_from_mailbox", "ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX", 1, 1, false);
        declareFunction(me, "display_current_external_kb_modification_event_filters_and_listeners", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 1, false);
        declareFunction(me, "reset_external_kb_modification_event_filters_and_listeners", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 0, false);
        declareFunction(me, "add_external_kb_modification_event_filter_listener", "ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        declareFunction(me, "get_active_external_kb_modification_event_filters", "GET-ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 0, 0, false);
        declareFunction(me, "get_all_external_kb_modification_event_filter_listeners_for_filter", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENERS-FOR-FILTER", 1, 0, false);
        declareFunction(me, "get_all_filters_for_external_kb_modification_event_filter_listener", "GET-ALL-FILTERS-FOR-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction(me, "remove_external_kb_modification_event_filter_listener", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        declareFunction(me, "remove_external_kb_modification_event_filter_listener_internal", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-INTERNAL", 2, 0, false);
        declareFunction(me, "remove_listener_from_all_external_kb_modification_event_filters", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 1, 0, false);
        declareFunction(me, "remove_listener_from_all_external_kb_modification_event_filters_internal", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-INTERNAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_modification_event_filters_file() {
        deflexical("*KB-MODIFICATION-FILTER-MAP*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*", NIL);
        defconstant("*DTP-EVENT-FILTER-DESCRIPTION*", EVENT_FILTER_DESCRIPTION);
        deflexical("*EVENT-FILTER-REGISTRATION*", SubLSystemTrampolineFile.maybeDefault($event_filter_registration$, $event_filter_registration$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*EVENT-FILTER-REGISTRATION-LOCK*", SubLSystemTrampolineFile.maybeDefault($event_filter_registration_lock$, $event_filter_registration_lock$, () -> make_lock($$$Event_Filter_Registration)));
        deflexical("*EVENT-FILTER-PATTERN-ID*", SubLSystemTrampolineFile.maybeDefault($event_filter_pattern_id$, $event_filter_pattern_id$, () -> integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED)));
        deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*", SubLSystemTrampolineFile.maybeDefault($kb_modification_event_to_filter_mapping$, $kb_modification_event_to_filter_mapping$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*", SubLSystemTrampolineFile.maybeDefault($kb_modification_event_to_filter_mapping_lock$, $kb_modification_event_to_filter_mapping_lock$, () -> make_lock($str98$KB_Modification_Event_to_Filter_M)));
        deflexical("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*", SubLSystemTrampolineFile.maybeDefault($kb_modification_event_internal_listener_table$, $kb_modification_event_internal_listener_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*", SubLSystemTrampolineFile.maybeDefault($kb_modification_filter_event_fired_listener$, $kb_modification_filter_event_fired_listener$, () -> event_broker.describe_funcall_listener($KB_MODIFICATION_FILTER_FIRED, HANDLE_KB_MODIFICATION_FILTER_FIRED, UNPROVIDED, UNPROVIDED)));
        deflexical("*KB-MODIFICATION-EXTERNAL-FILTER-DELIVERY-TIMEOUT*", TWENTY_INTEGER);
        deflexical("*EVENT-FILTER-LISTENER-REGISTRATION*", SubLSystemTrampolineFile.maybeDefault($event_filter_listener_registration$, $event_filter_listener_registration$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*", SubLSystemTrampolineFile.maybeDefault($event_filter_listener_registration_lock$, $event_filter_listener_registration_lock$, () -> make_lock($str135$Event_Filter_Listener_Registratio)));
        deflexical("*EVENT-FILTER-LISTENER-ID*", SubLSystemTrampolineFile.maybeDefault($event_filter_listener_id$, $event_filter_listener_id$, () -> integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED)));
        deflexical("*COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*EXTERNAL-EVENT-FILTER-LISTENER-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*VERBOSE-TRANSMIT-KB-MODIFICATION-EVENTS*", NIL);
        deflexical("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*", SubLSystemTrampolineFile.maybeDefault($kb_modification_event_mailbox_suite$, $kb_modification_event_mailbox_suite$, () -> message_mailboxes.new_message_mailbox_suite()));
        defconstant("*DTP-MESSAGE-MAILBOX-LISTENER*", MESSAGE_MAILBOX_LISTENER);
        deflexical("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*", SubLSystemTrampolineFile.maybeDefault($active_external_kb_modification_event_filters$, $active_external_kb_modification_event_filters$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*", SubLSystemTrampolineFile.maybeDefault($external_kb_modification_event_listeners_for_filters$, $external_kb_modification_event_listeners_for_filters$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-LOCK*", make_lock($str181$External_KB_Modification_Event_Li));
        return NIL;
    }

    public static SubLObject setup_kb_modification_event_filters_file() {
        register_new_kb_modification_filter($DEFAULT_KB_MODIFICATION_EVENT_FILTER, DEFAULT_KB_MODIFICATION_EVENT_FILTER);
        register_kb_modification_filter_event_equivalents($DEFAULT_KB_MODIFICATION_EVENT_FILTER, $list21);
        register_new_kb_modification_filter($CYCL_FORT_FILTER, KB_MODIFICATION_EVENT_FORT_FILTER);
        register_kb_modification_filter_event_equivalents($CYCL_FORT_FILTER, $list25);
        register_new_kb_modification_filter($COLLECTION_FILTER, KB_MODIFICATION_EVENT_COLLECTION_FILTER);
        register_kb_modification_filter_event_equivalents($COLLECTION_FILTER, $list28);
        register_new_kb_modification_filter($LEXICON_FORT_FILTER, KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER);
        register_kb_modification_filter_event_equivalents($LEXICON_FORT_FILTER, $list25);
        register_new_kb_modification_filter($MT_FILTER, KB_MODIFICATION_EVENT_MT_FILTER);
        register_kb_modification_filter_event_equivalents($MT_FILTER, $list28);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_filter_description$.getGlobalValue(), symbol_function(EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list73);
        def_csetf(EVENT_FILTER_DESCRIPTION_ID, _CSETF_EVENT_FILTER_DESCRIPTION_ID);
        def_csetf(EVENT_FILTER_DESCRIPTION_PATTERN, _CSETF_EVENT_FILTER_DESCRIPTION_PATTERN);
        identity(EVENT_FILTER_DESCRIPTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_filter_description$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_FILTER_DESCRIPTION_METHOD));
        declare_defglobal($event_filter_registration$);
        declare_defglobal($event_filter_registration_lock$);
        declare_defglobal($event_filter_pattern_id$);
        register_external_symbol(CREATE_KB_MODIFICATION_EVENT_FILTER);
        register_external_symbol(DELETE_KB_MODIFICATION_EVENT_FILTER);
        declare_defglobal($kb_modification_event_to_filter_mapping$);
        declare_defglobal($kb_modification_event_to_filter_mapping_lock$);
        declare_defglobal($kb_modification_event_internal_listener_table$);
        event_model.register_event_class($KB_MODIFICATION_FILTER_FIRED, $KB_STORE_EVENT, NIL);
        declare_defglobal($kb_modification_filter_event_fired_listener$);
        kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($kb_modification_filter_event_fired_listener$.getGlobalValue());
        declare_defglobal($event_filter_listener_registration$);
        declare_defglobal($event_filter_listener_registration_lock$);
        declare_defglobal($event_filter_listener_id$);
        register_external_symbol(DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD));
        register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym140$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO));
        register_method($external_event_filter_listener_p_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD));
        register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym142$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD));
        register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD));
        register_external_symbol(CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        declare_defglobal($kb_modification_event_mailbox_suite$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list161);
        def_csetf(MMBOX_LISTENER_ADDRESS, _CSETF_MMBOX_LISTENER_ADDRESS);
        identity(MESSAGE_MAILBOX_LISTENER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_LISTENER_METHOD));
        register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym169$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN));
        register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym170$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L));
        register_method($external_event_filter_listener_p_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD));
        register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym172$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER));
        register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym173$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE));
        register_external_symbol($sym175$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST);
        register_external_symbol(ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX);
        declare_defglobal($active_external_kb_modification_event_filters$);
        declare_defglobal($external_kb_modification_event_listeners_for_filters$);
        register_external_symbol(ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        register_external_symbol(REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        sunit_external.define_test_category($$$KB_Modification_Event_Filters, UNPROVIDED);
        sunit_external.define_test_suite($str189$KB_Modification_Event_Filters_Tes, list($$$KB_Modification_Event_Filters), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_modification_event_filters_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_modification_event_filters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_modification_event_filters_file();
    }

    

    public static final class $event_filter_description_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $pattern;

        private static final SubLStructDeclNative structDecl;

        private $event_filter_description_native() {
            this.$id = Lisp.NIL;
            this.$pattern = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$pattern;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$pattern = value;
        }

        static {
            structDecl = makeStructDeclNative($event_filter_description_native.class, EVENT_FILTER_DESCRIPTION, EVENT_FILTER_DESCRIPTION_P, $list67, $list68, new String[]{ "$id", "$pattern" }, $list69, $list70, PRINT_EVENT_FILTER_DESCRIPTION);
        }
    }

    public static final class $event_filter_description_p$UnaryFunction extends UnaryFunction {
        public $event_filter_description_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-FILTER-DESCRIPTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_filter_description_p(arg1);
        }
    }

    public static final class $message_mailbox_listener_native extends SubLStructNative {
        public SubLObject $address;

        private static final SubLStructDeclNative structDecl;

        private $message_mailbox_listener_native() {
            this.$address = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$address;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$address = value;
        }

        static {
            structDecl = makeStructDeclNative($message_mailbox_listener_native.class, MESSAGE_MAILBOX_LISTENER, MESSAGE_MAILBOX_LISTENER_P, $list155, $list156, new String[]{ "$address" }, $list157, $list158, PRINT_MESSAGE_MAILBOX_LISTENER);
        }
    }

    public static final class $message_mailbox_listener_p$UnaryFunction extends UnaryFunction {
        public $message_mailbox_listener_p$UnaryFunction() {
            super(extractFunctionNamed("MESSAGE-MAILBOX-LISTENER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return message_mailbox_listener_p(arg1);
        }
    }
}

/**
 * Total time: 1042 ms
 */
