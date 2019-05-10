
;;;**********************************************************
;;;
;;;                         PROGMR
;;;     (INTERPRETER FOR THE PROGRAMMAR GRAMMAR WRITING LANGUAGE)
;;;
;;;############################################################

(DEFUN RESTOREPT NIL (SETQ PT SAVEPT))

(DEFUN-FEXPR SETMVB
       (PTR-MVB)
       (PROG (SAVE)
        (SETQ MVB (EVAL (CAR PTR-MVB))) ;IF THERE ARE SEVERAL CLAUSES ACTIVE AT THE
        (SETQ SAVE PT)
        (SETQ PT MVB) ;SAME TIME IT SETS THE NEAEST ONE.
        (SETR 'MVB MVB (MOVE-PT C U (CLAUSE)))
        (SETQ PT SAVE)
        (RETURN T)))

(DEFUN ADD-F-PT   (FEATURE PTR)
      (THSETF (G3T (CAR PTR) 'FEATURES) (CONS FEATURE (FE PTR)))
      (AND (EQ PTR C) (SETQ FE (FE PTR)))
      T)

(DEFUN REMOVE-F-PT  (FEATURE PTR)
      (THSETF (G3T (CAR PTR) 'FEATURES)
        (SETDIF (THGET (CAR PTR) 'FEATURES)
           (LIST FEATURE)))
      (AND (EQ PTR C) (SETQ FE (FE PTR)))
      T)

(DEFUN ONE-WORD-LEFT NIL (AND (CDR NB) (NOT (CDDR NB))))


;;;   a list of smnfns which will
;;;    be broken at (before calling)
(SETQ SMNBREAKS  NIL)


(DEFUN-FEXPR CALLSM
       (SEMANTIC-EXPRESSION)
       (PROG (RESULT MPLNR-TIME SM-TTIME GC SMNFN)
        (SETQ SMNFN (CAR SEMANTIC-EXPRESSION))
        (AND  SMNTRACE
         (APPLY-SAY
                  (LIST 'SEMANTICS '***** UNIT 'CALLING SMNFN)))
        (AND  SMN
         (COND ((OR (EQ SMNBREAKS T) (MEMQ SMNFN SMNBREAKS))
                (RETURN (ERT)))
               (T (RETURN T))))
        (AND  SMNTRACE
         (PROGN (PRINTC '\ \ CALLSM\:\ )
                (PRINC (CAR SEMANTIC-EXPRESSION))))
        (SETQ MPLNR-TIME 0.)
        (SETQ GC    0
         SM-TTIME (GET-INTERNAL-RUN-TIME)
         RESULT    (EVAL (CAR SEMANTIC-EXPRESSION)))
        (SETQ SM-TIME (+ SM-TIME
                       (- (TIMER SM-TTIME
                               (GET-INTERNAL-RUN-TIME))
                          MPLNR-TIME)))
        (OR (= GC 0)
            (SETQ SM-TIME
                (- SM-TIME (TIMER GC 0))
             P-GC
                0))
        (SETQ MP-TIME (+ MP-TIME MPLNR-TIME))
        (AND  SMNTRACE
         (PROGN (PRINTC 'CALLSM\ RETURNING\:\ )
                (PRINC RESULT)))
        (COND ((OR (EQ SMNBREAKS 'ALL)
                (MEMQ SMNFN SMNBREAKS))
               (ERT)))
        (RETURN RESULT)))

(DEFUN-FEXPR MOVE-PT
       (L)
       (PROG (XX YY L2 EXEC SAVE)
        (SETQ EXEC L)
        (SETQ SAVE PT)
        TEST1
        (COND ((AND (CDR EXEC) (NOT (ATOM (CADR EXEC))))
               (GO TEST)))
        LOOK1
        (SETQ XX (CAR EXEC))
        LOOK
        (COND ((EQ XX 'H)
               (OR (SETQ PT H) (GO FAIL))
               (GO EX))
         ((EQ XX 'C) (SETQ PT C) (GO EX))
         ((EQ XX 'PC)
          (SETQ PT (H (PARENT C)))
          (GO EX))
         ((EQ XX 'LASTSENT)
          (SETQ PT LASTSENT)
          (GO EX))
         ((EQ XX 'U)
          (OR (SETQ PT (PARENT PT)) (GO FAIL)))
         ((EQ XX 'DLC)
          (OR (SETQ PT (H PT)) (GO FAIL)))
         ((EQ XX 'DF)
          (SETQ L2 (CONS 'DLC (CONS 'FR L2)))
          (SETQ XX 'DLC)
          (GO LOOK))
         ((EQ XX 'FR)
          (COND ((MOVE-PT PV) (GO LOOK))))
         ((EQ XX 'NX)
          (OR (SETQ PT (PREVIOUS (H (PARENT PT)) (CAR PT)))
              (GO FAIL)))
         ((EQ XX 'PV)
          (SETQ  PT (OR (AND (EQ PT C) (H (PARENT C)))
                     (FOLLOWING (H (PARENT PT)) (CAR PT))
                     (GO FAIL))))
         (T (PRINT XX) (ERT MOVE-PT ILLEGAL INSTRUCTION)))
        EX
        (COND ((OR (NULL L2) (NULL (SETQ L2 (CDR L2))))
               (GO TEST)))
        (SETQ XX (CAR L2))
        (GO LOOK)
        TEST
        (COND ((NULL (CDR EXEC)) (RETURN PT))
         ((ATOM (CADR EXEC)) T)
         ((COND  ((CDADR EXEC) (EVAL (CADR EXEC)))
             (T (ISX PT (CAADR EXEC))))
          (SETQ EXEC (CDR EXEC)))
         (T (GO LOOK1)))
        (COND ((SETQ EXEC (CDR EXEC)) (GO TEST1)))
        (RETURN PT)
        FAIL
        (SETQ PT SAVE)
        (RETURN NIL)))

(DEFUN-FEXPR MOVE-PTW
       (L)
       (PROG (EXEC SAVE XX)
        (SETQ SAVE PTW)
        (SETQ EXEC L)
        TEST1
        (COND ((AND (CDR EXEC) (NOT (ATOM (CADR EXEC))))
               (GO EX)))
        LOOK1
        (SETQ XX (CAR EXEC))
        LOOK
        (COND ((EQ XX 'N) (SETQ PTW N))
         ((EQ XX 'LASTSENT) (SETQ PTW (NB LASTSENT)))
         ((EQ XX 'FW) (SETQ PTW (NB PT)))
         ((EQ XX 'AW)
          (COND  ((EQ PT C) (GO FAIL))
             ((SETQ PTW (N PT))
              (SETQ XX 'PW)
              (GO LOOK))))
         ((EQ XX 'LW)
          (COND  ((EQ PT C) (GO FAIL))
             ((SETQ PTW (N PT))
              (SETQ XX 'PW)
              (GO LOOK))))
         ((EQ XX 'NW)
          (COND  ((SETQ PTW (CDR PTW)))
             ((SETQ PTW (FINDB SENT NIL)) (GO FAIL))))
         ((EQ XX 'PW)
          (COND  ((SETQ PTW (FINDB SENT PTW)))
             ((SETQ PTW SENT) (GO FAIL))))
         ((EQ XX 'SFW) (SETQ PTW SENT))
         ((EQ XX 'SLW) (SETQ PTW (FINDB SENT NIL)))
         ((BUG MOVE-PTW ILLEGAL INSTRUCTION)))
        EX
        (COND ((NULL (CDR EXEC)) (RETURN PTW))
         ((ATOM (CADR EXEC)) T)
         ((COND  ((CDADR EXEC) (EVAL (CADR EXEC)))
             (T (ISX PTW (CAADR EXEC))))
          (SETQ EXEC (CDR EXEC)))
         (T (GO LOOK1)))
        (COND ((SETQ EXEC (CDR EXEC)) (GO TEST1)))
        (RETURN PTW)
        FAIL
        (SETQ PTW SAVE)
        (RETURN NIL)))

(DEFUN APPLY-GRAMMAR  (UNIT)
      (DECLARE (SPECIAL UNIT))
      (COND ((THGET UNIT 'INTERPRET) (INTERPRET UNIT))
       (T (EVAL (LIST UNIT)))))

(DEFUN BUILDNODE  (FEATURES FIRSTWORD WORDAFTER DAUGHTERS SEMANTICS)
      (PROG (NODE)
       (SETQ NODE (LIST (MAKESYM 'NODE)))
       (SETR 'FEATURES FEATURES NODE)
       (SETR 'FIRSTWORD FIRSTWORD NODE)
       (SETR 'WORDAFTER WORDAFTER NODE)
       (SETR 'DAUGHTERS DAUGHTERS NODE)
       (SETR 'SEMANTICS SEMANTICS NODE)
       (RETURN NODE)))

(DEFMACRO CQ
    (FEATURE)
    `
    (MEMQ ',FEATURE FE))

 ; (DEFUN-FEXPR CQ (FEATURE) (MEMQ (CAR FEATURE) FE))

(DEFUN CUT
      (A)
      (PROG (B C)
       (SETQ B N)
       LOOP
       (COND ((EQ A B)
              (SETQ CUT A)
              (SETQ NN (NOT (EQ CUT N)))
              (RETURN T))
        ((EQ B END) (RETURN NIL))
        ((SETQ B (CDR B)) (GO LOOP))
        ((NULL A)
         (SETQ CUT NIL)
         (SETQ NN N)
         (RETURN T)))))

(DEFUN CUT-BACK-ONE NIL (MOVE-PTW N PW) (SHRDLU-POP) (CUT PTW))

(DEFUN F
    (A)
    (COND ((MEMBER A FE) T)
     ((SETR 'FEATURES
       (SETQ FE (CONS A FE))
       C))))

(DEFUN FE (NODE) (GETR 'FEATURES NODE))

(DEFUN FEATURE? (FEATURE) (MEMQ FEATURE FE))

(DEFUN FESET (NODE FEATURES) (SETR 'FEATURES FEATURES NODE))

(DEFUN FLUSHME  NIL
      ;; IF YOU HAVEN'T REAHED THE CUT, FLUSHES THE NEXT WORD IN THE
      ;;SENTENCE.  FAILS IF IT REACHES CUT POINT
      (AND N NN (SETQ NN (NOT (EQ CUT (SETQ N (CDR N)))))))

(DEFUN FOLLOWING  (LIST MEMBER)
      ;; GET THE ELEMENT OF LIST FOLLOWING MEMBER
      (AND (MEMQ MEMBER LIST) (CDR (MEMQ MEMBER LIST))))

(DEFUN-FEXPR FQ
       (A)
       (MAPCAR
        #'(LAMBDA (X) (OR (MEMQ X FE) (SETQ FE (CONS X FE))))
        A)
       (SETR 'FEATURES FE C))

(DEFUN GETR  (REGISTER NODE)
      ;; THIS FUNCTION RETRIEVES THE CONTENTS OF THE REGISTER
      ;;ASSOCIATED WITH THE GIVEN NODE
      (THGET (CAR NODE) REGISTER))

(DEFUN H (NODE) (GETR 'DAUGHTERS NODE))

(DEFUN-FEXPR ISQ (A) (MEMQ (CADR A) (FE (EVAL (CAR A)))))

(DEFUN ISX (A B) (MEMBER B (FE A)))

(DEFUN M (A) (SETQ ME (CONS A ME)))

(DEFUN-FEXPR MP (A) (SETQ MESP A))

(DEFUN-FEXPR MQ (A) (SETQ ME (CONS A ME)))

(DEFUN N (NODE) (GETR 'WORDAFTER NODE))

(DEFUN NB (NODE) (GETR 'FIRSTWORD NODE))

(DEFUN-FEXPR NEXTW (A) (EQ (CAR N) (CAR A)))

(DEFUN NEXTWORD NIL (CAR N)) ;RETURN THE NEXT WORD IN THE SENTENCE

(DEFUN NEXTWORD? (A) (EQ (CAR N) A))

(DEFUN-FEXPR NQ (A) (MEMQ (CAR A) (FE N)))

(DEFUN ONLY-ONE-WORD-LEFT NIL (AND N (NOT (CDR N))))

(DEFUN PARENT (NODE) (GETR 'PARENT NODE))

(DEFUN-FEXPR PARSE
       (A)
       (COND ((MEMQ (CAR A) '(NG CLAUSE VG PREPG ADJG))
              (PARSE2 A (MEMQ 'TOPLEVEL A)))
        ((PARSE3 A NIL))))

;; SBCL didnt like use DECLAREing SPECIAL as special (So renamed to SPEZIAL)
(DEFUN PARSE2  (R3ST P)
      ;;THIS FUNCTION CALLS THE PROGRAMMAR FUNCTION INDICATED BY THE
      ;;FIRST MEMBER OF R3ST - A FEATURE LIST THE PARAMETER P
      ;;INDICATES WHETHER PARSE2 IS BEING CALLED FROM THE TOPLEVEL
      ;;IF P IS TRUE, PARSE2 DOES NOT APPEND THE NODE JUST PARSED TO
      ;;THE PARSING TREE PARSE2 WILL CALL EITHER A COMPILED OR
      ;;INTERPRETED VERSION OF THE GRAMMAR PROGRAM
      (DECLARE (SPECIAL R3ST))
      (PROG (UNIT CREATED-NODE END PARENT RE SPEZIAL NBB)
       (DECLARE (SPECIAL PARENT RE SPEZIAL))
       (SETQ UNIT  (CAR R3ST)
        LEVEL  (+ 1 LEVEL))
       (COND ((EQ (SETQ NBB N) CUT)
              (SETQ LEVEL (- LEVEL 1))
              (RETURN NIL)))
       (SETQ END CUT)
       (SETQ NN (NOT (EQ N CUT)))
       (SETQ PARENT C)
       (COND ((NQ B-SPECIAL)
              (AND  PARSETRACE
               (PROGN (PRINTC '\ \ SPECIAL\ WORD)
                      (PRINC (CAR N))
                      (TERPRI)))
              (EVAL (GETR 'B-SPECIAL N))))
       (COND ((EQ SPEZIAL 'SKIP) (GO SKIP))
        ((EQ SPEZIAL 'DONE) (GO DONE))
        ((EQ SPEZIAL 'LOSE) (SETQ N NBB) (GO LOSE)))
       (AND PARSETRACE
        (PROGN  (TERPRI)
           (PRINC '\>)
           (PRINC LEVEL)
           (PRINC '\ ####\ PARSING\:\ )
           (PRINC R3ST)))
       (COND ((NULL (SETQ RE (APPLY-GRAMMAR UNIT))) ;THIS IS WHERE ALL THE WORK HAPPENS. IF THE
              (SETQ RE NIL) ;PARSE SUCEEDS, IT WILL RETURN THE NODE THAT HAS
              (SETQ N NBB) ;BEEN BUILT UP (SEE THE FUNCTION
              (GO LOSE))) ;"INTERPRETATION" IN IN GINTER)
       SKIP
       (COND ((EQ N CUT))
        ((NQ SPEZIAL) (EVAL (GETR 'SPECIAL N))))
       DONE
       (OR  P
        (REBUILD (SETQ FE (THGET (CAR C) 'FEATURES)) ;REBUILDS THE HIGHER LEVEL NODE TO INCORPORATE
             NB ;THE DAUGHTER THAT WAS JUST PARSED EXCEPT IN THE
             N ;CASE WHERE THIS NODE IS THE TOPLEVEL
             (SETQ H (APPEND RE H))
             SM
             C))
       LOSE
       (SETQ NN (NOT (EQ N CUT)))
       OK
       (COND ((AND  RE
               (OR (EQ PARSETRACE 'ALL)
                   (EQ PARSEBREAK 'ALL)
                   (MEMQ UNIT PARSEBREAK)
                   (MEMQ UNIT PARSETRACE)))
              (TERPRI)
              (PRINC '>)
              (PRINC LEVEL)
              (PRINC '\ PARSE\ SUCEEDED\:\ )
              (PRINC UNIT)
              (PRINC '\ \ )
              (PRINC (FROM (NB RE) N))
              (AND PARSENODE-SEE (DP (CAR RE)))
              (AND  (OR (EQ PARSEBREAK 'ALL)
                     (MEMQ UNIT PARSEBREAK))
               (ERT)))
        ((OR PARSEBREAK PARSETRACE)
         (TERPRI)
         (PRINC '\>)
         (PRINC LEVEL)
         (PRINC '\ PARSE\ FAILED)
         (AND  (OR (EQ PARSEBREAK 'ALL)
                (MEMQ UNIT PARSEBREAK))
          (ERT))))
       (PARSE-STATISTICS) ;defined in SYSCOM
       (SETQ LEVEL (- LEVEL 1))
       (RETURN RE)))

(DEFUN PARSE3  (R3ST P)
      ;; PARSE3 IS CALLED TO PARSE JUST THE NEXT WORD IN THE
      ;;SENTENCE
      (PROG (XP LABL RE SPEZIAL NBB NODE)
       (COND ((EQ (SETQ NBB N) CUT) (MQ CUT) (RETURN NIL))
        ((NQ B-SPECIAL) ;IS THE NEXT WORD MARKED SPECL?
         (EVAL (GETR 'B-SPECIAL N)) ;YES, DO SOMETHING SPECIALL
         (COND ((EQ SPEZIAL 'SKIP) (GO SKIP))
           ((EQ SPEZIAL 'LOSE)
            (SETQ N NBB)
            (RETURN NIL))
           ((EQ SPEZIAL 'DONE) (GO DONE)))))
       (COND ((CAR (SETQ XP R3ST))) ;IF CALL IS (PARSE NIL FOO)
        ((NEXTWORD? (CADR R3ST)) (GO OK)) ;THEN LOOK FOR EXACT WORD "FOO"
        ((SETQ N NBB) (RETURN NIL))) ;IF NOT THERE, FAIL
       LOOP
       (COND ((NOT (ATOM (CAR XP)))
              (SETQ LABL (CONS (CAAR XP) LABL))) ;IF THE FEATURE IS NOT AN ATOM JUST ADD THE
        ((EQ (CAR XP) 'NULL)) ;FEATURE TO THE LIST
        ((MEMQ (CAR XP) (FE N)))
        ((MEMQ (CAR XP) UNMKD))
        ((M (CAR XP)) (SETQ N NBB) (RETURN NIL)))
       (COND ((SETQ XP (CDR XP)) (GO LOOP)))
       OK
       (SETQ
        RE
           (BUILDNODE (MEET  (APPEND (FE N) LABL)
                       (THGET (CAR R3ST) 'ELIM))
            N
            (CDR N)
            'WORD
            (OR SMN
                    (NULL (CAR R3ST))
                    (AND (NULL (SM N)) (UNDEFINED))
                    (CADR (OR  (ASSOC (CAR R3ST)
                                (SM N)
                                :TEST
                                #'EQUAL)
                           (UNDEFINED))))))
       (SETQ N (CDR N))
       SKIP
       (SETQ NN (NOT (EQ N CUT)))
       (COND ((AND NN (NQ SPEZIAL))
              (EVAL (GETR 'SPECIAL N))))
       DONE
       (SETR 'PARENT C RE)
       (COND (P RE)
        (T (REBUILD FE NB N (SETQ H (APPEND RE H)) SM C)))
       (AND PARSENODE-SEE RE (DP (CAR RE)) PNS-BK (ERT))
       (PARSE-STATISTICS)
       (RETURN RE)))

(DEFUN PARSEREL   (A B NODE)
      (PROG NIL
       GO
       (COND ((NULL A) (RETURN NIL))
        ((NOT (ISX NODE (CAAR A))))
        ((EVAL (APPEND '(PARSE CLAUSE RSNG)
                (CDAR A)
                B))
         (RETURN H)))
       (SETQ A (CDR A))
       (GO GO)))

(DEFUN-FEXPR SHRDLU-POP
       (A)
       (COND
        ((OR (NULL A) (NULL (CAR A)))
         (COND
          ((NULL H) NIL)
          ((SETQ N (NB H))
           (SETQ H (CDR H))
           (REBUILD FE NB N H SM C)
           (SETQ NN (NOT (EQ N CUT)))
           (OR
              SMN
              (PROG (XX)
                    (MAPL
                        #'(LAMBDA (BACKNODE)
                              (CATCH 'DONE-POP
                                     (AND  (MAPL #'(LAMBDA (PLACE)
                                                    (AND (EQ PLACE (NB BACKNODE))
                                                         (THROW 'DONE-POP NIL)))
                                                  N)
                                           (SETQ XX (CONS (CAR BACKNODE) XX)))))
                        BACKREF)
                    (SETQ BACKREF XX)))
           T)))
        ((EVAL (CONS 'POPTO A)) (SHRDLU-POP))))

(DEFUN-FEXPR POPTO
       (A)
       (PROG (XX)
        (DECLARE (SPECIAL XX))
        (SETQ XX H)
        LOOP
        (COND ((EVAL (CONS 'ISQ (CONS 'XX A))))
         ((SETQ XX (CDR XX)) (GO LOOP))
         ((MQ POPTO) (RETURN NIL)))
        EX
        (COND ((EQ XX H) (RETURN C))
         ((SHRDLU-POP) (GO EX)))))

(DEFUN PREVIOUS   (LIST MEMBER)
      ;; GET THE ELEMENT OF LIST BEFORE MEMBER
      (PROG (GOODIE)
       GO
       (COND ((NULL LIST) (RETURN NIL))
        ((EQ MEMBER (CAR LIST)) (RETURN GOODIE))
        (T
           (SETQ GOODIE (CAR LIST))
           (SETQ LIST (CDR LIST))))
       (GO GO)))

(DEFUN PTFIND  (X YY Z)
      (PROG (FOO)
       (SETQ FOO (CAR X))
       UP
       (COND ((MOVE-PT U) (GO UP))
        ((EQ (NB PT) X) (GO ON)))
       DOWN
       (OR (MOVE-PT DLC PV (MEMQ FOO (NB PT))) (RETURN NIL))
       ON
       (COND ((NOT (EQ X (NB PT))) (GO DOWN))
        ((EQ YY T))
        ((MOVE-PT DF (EQ (N PT) YY)))
        ((RETURN NIL)))
       CHECK
       (COND ((EVAL Z) (RETURN PT))
        ((NOT (EQ YY T)))
        ((MOVE-PT DF) (GO CHECK)))))

(DEFUN REBUILD  (FEATURES FIRSTWORD WORDAFTER DAUGHTERS  SEMANTICS NODE)
      (SETR 'FEATURES FEATURES NODE)
      (SETR 'FIRSTWORD FIRSTWORD NODE)
      (SETR 'WORDAFTER WORDAFTER NODE)
      (SETR 'DAUGHTERS DAUGHTERS NODE)
      (SETR 'SEMANTICS SEMANTICS NODE)
      NODE)

(DEFUN ROOT  (X)
;;; INPUT= PIECE OF SENTENCE
;;; OUTPUT= ROOT OF FIRST WORD IN THAT PIECE
;;; IF WORD HAS NO ROOT PROPERTY, THE ROOT == WORD
      (OR (THGET (CAR X) 'ROOT) (CAR X)))

(DEFUN-FEXPR RQ (A) (SETR 'FEATURES (SETQ FE (SETDIF FE A)) C)) ;REMOVE THE FEATURE A FROM FEATURE LIST OF THE
 ;CURRENT NODE

(DEFUN SECONDWORD? (WORD) (AND N (CDR N) (EQ (CADR N) WORD)))

(DEFUN SETR  (REGISTER VALUE NODE)
      ;; THIS FUNCTION ASSOCIATES THE GIVEN VALUE WITH THE GIVEN
      ;;NODE UNDER THE GIVEN INDICATOR, REGISTER
      (THSETF (G3T (CAR NODE) REGISTER) VALUE))

(DEFUN SM (NODE) (GETR 'SEMANTICS NODE))

(DEFUN-FEXPR TRNSF
       (A)
       (SETR 'FEATURES
        (SETQ FE (SHRDLU-UNION (MEET A (FE PT)) FE))
        C))

(DEFUN UPREL  (X)
      (AND (NOT (ATOM X))
       (OR (MEMQ 'UPREL (FE X)) ; FIND NODE WITH UPREL FEATURE
           (UPREL (H X))
           (UPREL (CDR X)))))

(DEFUN WORD (N) (CAR N))

(DEFUN UPCHECK
    NIL
      (AND (MOVE-PT C U (REL-NOT-FOUND))
       (NOT  (MEET (FE PT)
              '(OBJ1Q OBJ1REL OBJ2Q OBJ2REL LOBREL LOBQ)))))
#|�Visual LISP� Format Options�
;; (200 6 1 0 T "end of " 100 20 0 0 1 T T nil T)
;*** DO NOT add text below the comment! ***|#
