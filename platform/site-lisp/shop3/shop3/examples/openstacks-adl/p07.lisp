(in-package :shop-openstacks)

#.(make-problem 'OS-SEQUENCEDSTRIPS-P15_1 'OPENSTACKS-SEQUENCEDSTRIPS-ADL-INCLUDED '((NEXT-COUNT
                                                                                      N0
                                                                                      N1)
                                                                                     (NEXT-COUNT
                                                                                      N1
                                                                                      N2)
                                                                                     (NEXT-COUNT
                                                                                      N2
                                                                                      N3)
                                                                                     (NEXT-COUNT
                                                                                      N3
                                                                                      N4)
                                                                                     (NEXT-COUNT
                                                                                      N4
                                                                                      N5)
                                                                                     (NEXT-COUNT
                                                                                      N5
                                                                                      N6)
                                                                                     (NEXT-COUNT
                                                                                      N6
                                                                                      N7)
                                                                                     (NEXT-COUNT
                                                                                      N7
                                                                                      N8)
                                                                                     (NEXT-COUNT
                                                                                      N8
                                                                                      N9)
                                                                                     (NEXT-COUNT
                                                                                      N9
                                                                                      N10)
                                                                                     (NEXT-COUNT
                                                                                      N10
                                                                                      N11)
                                                                                     (NEXT-COUNT
                                                                                      N11
                                                                                      N12)
                                                                                     (NEXT-COUNT
                                                                                      N12
                                                                                      N13)
                                                                                     (NEXT-COUNT
                                                                                      N13
                                                                                      N14)
                                                                                     (NEXT-COUNT
                                                                                      N14
                                                                                      N15)
                                                                                     (STACKS-AVAIL
                                                                                      N0)
                                                                                     (WAITING
                                                                                      O1)
                                                                                     (INCLUDES
                                                                                      O1
                                                                                      P8)
                                                                                     (WAITING
                                                                                      O2)
                                                                                     (INCLUDES
                                                                                      O2
                                                                                      P10)
                                                                                     (INCLUDES
                                                                                      O2
                                                                                      P15)
                                                                                     (WAITING
                                                                                      O3)
                                                                                     (INCLUDES
                                                                                      O3
                                                                                      P8)
                                                                                     (WAITING
                                                                                      O4)
                                                                                     (INCLUDES
                                                                                      O4
                                                                                      P2)
                                                                                     (WAITING
                                                                                      O5)
                                                                                     (INCLUDES
                                                                                      O5
                                                                                      P6)
                                                                                     (INCLUDES
                                                                                      O5
                                                                                      P8)
                                                                                     (WAITING
                                                                                      O6)
                                                                                     (INCLUDES
                                                                                      O6
                                                                                      P6)
                                                                                     (WAITING
                                                                                      O7)
                                                                                     (INCLUDES
                                                                                      O7
                                                                                      P3)
                                                                                     (INCLUDES
                                                                                      O7
                                                                                      P4)
                                                                                     (INCLUDES
                                                                                      O7
                                                                                      P6)
                                                                                     (WAITING
                                                                                      O8)
                                                                                     (INCLUDES
                                                                                      O8
                                                                                      P11)
                                                                                     (WAITING
                                                                                      O9)
                                                                                     (INCLUDES
                                                                                      O9
                                                                                      P5)
                                                                                     (INCLUDES
                                                                                      O9
                                                                                      P9)
                                                                                     (INCLUDES
                                                                                      O9
                                                                                      P12)
                                                                                     (WAITING
                                                                                      O10)
                                                                                     (INCLUDES
                                                                                      O10
                                                                                      P11)
                                                                                     (WAITING
                                                                                      O11)
                                                                                     (INCLUDES
                                                                                      O11
                                                                                      P12)
                                                                                     (WAITING
                                                                                      O12)
                                                                                     (INCLUDES
                                                                                      O12
                                                                                      P8)
                                                                                     (WAITING
                                                                                      O13)
                                                                                     (INCLUDES
                                                                                      O13
                                                                                      P1)
                                                                                     (INCLUDES
                                                                                      O13
                                                                                      P7)
                                                                                     (WAITING
                                                                                      O14)
                                                                                     (INCLUDES
                                                                                      O14
                                                                                      P9)
                                                                                     (WAITING
                                                                                      O15)
                                                                                     (INCLUDES
                                                                                      O15
                                                                                      P13)
                                                                                     (INCLUDES
                                                                                      O15
                                                                                      P14)
                                                                                     (INCLUDES
                                                                                      O15
                                                                                      P15)
                                                                                     (=
                                                                                      (TOTAL-COST)
                                                                                      0)
                                                                                     (COUNT
                                                                                      N0)
                                                                                     (COUNT
                                                                                      N1)
                                                                                     (COUNT
                                                                                      N2)
                                                                                     (COUNT
                                                                                      N3)
                                                                                     (COUNT
                                                                                      N4)
                                                                                     (COUNT
                                                                                      N5)
                                                                                     (COUNT
                                                                                      N6)
                                                                                     (COUNT
                                                                                      N7)
                                                                                     (COUNT
                                                                                      N8)
                                                                                     (COUNT
                                                                                      N9)
                                                                                     (COUNT
                                                                                      N10)
                                                                                     (COUNT
                                                                                      N11)
                                                                                     (COUNT
                                                                                      N12)
                                                                                     (COUNT
                                                                                      N13)
                                                                                     (COUNT
                                                                                      N14)
                                                                                     (COUNT
                                                                                      N15)
                                                                                     (ORDER
                                                                                      O1)
                                                                                     (ORDER
                                                                                      O2)
                                                                                     (ORDER
                                                                                      O3)
                                                                                     (ORDER
                                                                                      O4)
                                                                                     (ORDER
                                                                                      O5)
                                                                                     (ORDER
                                                                                      O6)
                                                                                     (ORDER
                                                                                      O7)
                                                                                     (ORDER
                                                                                      O8)
                                                                                     (ORDER
                                                                                      O9)
                                                                                     (ORDER
                                                                                      O10)
                                                                                     (ORDER
                                                                                      O11)
                                                                                     (ORDER
                                                                                      O12)
                                                                                     (ORDER
                                                                                      O13)
                                                                                     (ORDER
                                                                                      O14)
                                                                                     (ORDER
                                                                                      O15)
                                                                                     (PRODUCT
                                                                                      P1)
                                                                                     (PRODUCT
                                                                                      P2)
                                                                                     (PRODUCT
                                                                                      P3)
                                                                                     (PRODUCT
                                                                                      P4)
                                                                                     (PRODUCT
                                                                                      P5)
                                                                                     (PRODUCT
                                                                                      P6)
                                                                                     (PRODUCT
                                                                                      P7)
                                                                                     (PRODUCT
                                                                                      P8)
                                                                                     (PRODUCT
                                                                                      P9)
                                                                                     (PRODUCT
                                                                                      P10)
                                                                                     (PRODUCT
                                                                                      P11)
                                                                                     (PRODUCT
                                                                                      P12)
                                                                                     (PRODUCT
                                                                                      P13)
                                                                                     (PRODUCT
                                                                                      P14)
                                                                                     (PRODUCT
                                                                                      P15)
                                                                                     (:GOAL
                                                                                      (AND
                                                                                       (SHIPPED
                                                                                        O1)
                                                                                       (SHIPPED
                                                                                        O2)
                                                                                       (SHIPPED
                                                                                        O3)
                                                                                       (SHIPPED
                                                                                        O4)
                                                                                       (SHIPPED
                                                                                        O5)
                                                                                       (SHIPPED
                                                                                        O6)
                                                                                       (SHIPPED
                                                                                        O7)
                                                                                       (SHIPPED
                                                                                        O8)
                                                                                       (SHIPPED
                                                                                        O9)
                                                                                       (SHIPPED
                                                                                        O10)
                                                                                       (SHIPPED
                                                                                        O11)
                                                                                       (SHIPPED
                                                                                        O12)
                                                                                       (SHIPPED
                                                                                        O13)
                                                                                       (SHIPPED
                                                                                        O14)
                                                                                       (SHIPPED
                                                                                        O15)))) '(:TASK
                                                                                                  PLAN)) 