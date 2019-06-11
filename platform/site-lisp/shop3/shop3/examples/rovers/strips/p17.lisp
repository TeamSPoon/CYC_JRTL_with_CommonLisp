
(IN-PACKAGE :SHOP3-ROVERS) 
(DEFPROBLEM ROVERPROB5624 ROVER
            ((OBJECTIVE OBJECTIVE5) (OBJECTIVE OBJECTIVE4)
             (OBJECTIVE OBJECTIVE3) (OBJECTIVE OBJECTIVE2)
             (OBJECTIVE OBJECTIVE1) (OBJECTIVE OBJECTIVE0)
             (CAMERA CAMERA6) (CAMERA CAMERA5) (CAMERA CAMERA4)
             (CAMERA CAMERA3) (CAMERA CAMERA2) (CAMERA CAMERA1)
             (CAMERA CAMERA0) (WAYPOINT WAYPOINT14)
             (WAYPOINT WAYPOINT13) (WAYPOINT WAYPOINT12)
             (WAYPOINT WAYPOINT11) (WAYPOINT WAYPOINT10)
             (WAYPOINT WAYPOINT9) (WAYPOINT WAYPOINT8)
             (WAYPOINT WAYPOINT7) (WAYPOINT WAYPOINT6)
             (WAYPOINT WAYPOINT5) (WAYPOINT WAYPOINT4)
             (WAYPOINT WAYPOINT3) (WAYPOINT WAYPOINT2)
             (WAYPOINT WAYPOINT1) (WAYPOINT WAYPOINT0)
             (STORE ROVER5STORE) (STORE ROVER4STORE)
             (STORE ROVER3STORE) (STORE ROVER2STORE)
             (STORE ROVER1STORE) (STORE ROVER0STORE) (ROVER ROVER5)
             (ROVER ROVER4) (ROVER ROVER3) (ROVER ROVER2)
             (ROVER ROVER1) (ROVER ROVER0) (MODE LOW_RES)
             (MODE HIGH_RES) (MODE COLOUR) (LANDER GENERAL)
             (VISIBLE WAYPOINT1 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT1)
             (VISIBLE WAYPOINT1 WAYPOINT8)
             (VISIBLE WAYPOINT8 WAYPOINT1)
             (VISIBLE WAYPOINT1 WAYPOINT11)
             (VISIBLE WAYPOINT11 WAYPOINT1)
             (VISIBLE WAYPOINT1 WAYPOINT14)
             (VISIBLE WAYPOINT14 WAYPOINT1)
             (VISIBLE WAYPOINT2 WAYPOINT6)
             (VISIBLE WAYPOINT6 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT9)
             (VISIBLE WAYPOINT9 WAYPOINT2)
             (VISIBLE WAYPOINT3 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT6)
             (VISIBLE WAYPOINT6 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT7)
             (VISIBLE WAYPOINT7 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT11)
             (VISIBLE WAYPOINT11 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT13)
             (VISIBLE WAYPOINT13 WAYPOINT3)
             (VISIBLE WAYPOINT4 WAYPOINT1)
             (VISIBLE WAYPOINT1 WAYPOINT4)
             (VISIBLE WAYPOINT4 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT4)
             (VISIBLE WAYPOINT4 WAYPOINT10)
             (VISIBLE WAYPOINT10 WAYPOINT4)
             (VISIBLE WAYPOINT4 WAYPOINT14)
             (VISIBLE WAYPOINT14 WAYPOINT4)
             (VISIBLE WAYPOINT5 WAYPOINT1)
             (VISIBLE WAYPOINT1 WAYPOINT5)
             (VISIBLE WAYPOINT5 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT5)
             (VISIBLE WAYPOINT5 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT5)
             (VISIBLE WAYPOINT5 WAYPOINT8)
             (VISIBLE WAYPOINT8 WAYPOINT5)
             (VISIBLE WAYPOINT5 WAYPOINT14)
             (VISIBLE WAYPOINT14 WAYPOINT5)
             (VISIBLE WAYPOINT6 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT6)
             (VISIBLE WAYPOINT6 WAYPOINT4)
             (VISIBLE WAYPOINT4 WAYPOINT6)
             (VISIBLE WAYPOINT6 WAYPOINT5)
             (VISIBLE WAYPOINT5 WAYPOINT6)
             (VISIBLE WAYPOINT6 WAYPOINT7)
             (VISIBLE WAYPOINT7 WAYPOINT6)
             (VISIBLE WAYPOINT6 WAYPOINT10)
             (VISIBLE WAYPOINT10 WAYPOINT6)
             (VISIBLE WAYPOINT6 WAYPOINT12)
             (VISIBLE WAYPOINT12 WAYPOINT6)
             (VISIBLE WAYPOINT6 WAYPOINT13)
             (VISIBLE WAYPOINT13 WAYPOINT6)
             (VISIBLE WAYPOINT7 WAYPOINT8)
             (VISIBLE WAYPOINT8 WAYPOINT7)
             (VISIBLE WAYPOINT7 WAYPOINT9)
             (VISIBLE WAYPOINT9 WAYPOINT7)
             (VISIBLE WAYPOINT8 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT8)
             (VISIBLE WAYPOINT8 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT8)
             (VISIBLE WAYPOINT8 WAYPOINT10)
             (VISIBLE WAYPOINT10 WAYPOINT8)
             (VISIBLE WAYPOINT9 WAYPOINT8)
             (VISIBLE WAYPOINT8 WAYPOINT9)
             (VISIBLE WAYPOINT10 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT10)
             (VISIBLE WAYPOINT10 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT10)
             (VISIBLE WAYPOINT11 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT11)
             (VISIBLE WAYPOINT11 WAYPOINT4)
             (VISIBLE WAYPOINT4 WAYPOINT11)
             (VISIBLE WAYPOINT11 WAYPOINT8)
             (VISIBLE WAYPOINT8 WAYPOINT11)
             (VISIBLE WAYPOINT11 WAYPOINT9)
             (VISIBLE WAYPOINT9 WAYPOINT11)
             (VISIBLE WAYPOINT11 WAYPOINT10)
             (VISIBLE WAYPOINT10 WAYPOINT11)
             (VISIBLE WAYPOINT12 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT12)
             (VISIBLE WAYPOINT12 WAYPOINT1)
             (VISIBLE WAYPOINT1 WAYPOINT12)
             (VISIBLE WAYPOINT12 WAYPOINT5)
             (VISIBLE WAYPOINT5 WAYPOINT12)
             (VISIBLE WAYPOINT12 WAYPOINT7)
             (VISIBLE WAYPOINT7 WAYPOINT12)
             (VISIBLE WAYPOINT13 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT13)
             (VISIBLE WAYPOINT13 WAYPOINT5)
             (VISIBLE WAYPOINT5 WAYPOINT13)
             (VISIBLE WAYPOINT13 WAYPOINT14)
             (VISIBLE WAYPOINT14 WAYPOINT13)
             (VISIBLE WAYPOINT14 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT14)
             (VISIBLE WAYPOINT14 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT14)
             (VISIBLE WAYPOINT14 WAYPOINT9)
             (VISIBLE WAYPOINT9 WAYPOINT14)
             (VISIBLE WAYPOINT14 WAYPOINT10)
             (VISIBLE WAYPOINT10 WAYPOINT14) (AT_SOIL_SAMPLE WAYPOINT0)
             (AT_ROCK_SAMPLE WAYPOINT1) (AT_SOIL_SAMPLE WAYPOINT2)
             (AT_ROCK_SAMPLE WAYPOINT2) (AT_SOIL_SAMPLE WAYPOINT3)
             (AT_ROCK_SAMPLE WAYPOINT3) (AT_SOIL_SAMPLE WAYPOINT4)
             (AT_ROCK_SAMPLE WAYPOINT4) (AT_SOIL_SAMPLE WAYPOINT5)
             (AT_ROCK_SAMPLE WAYPOINT5) (AT_ROCK_SAMPLE WAYPOINT6)
             (AT_ROCK_SAMPLE WAYPOINT7) (AT_SOIL_SAMPLE WAYPOINT9)
             (AT_ROCK_SAMPLE WAYPOINT9) (AT_ROCK_SAMPLE WAYPOINT10)
             (AT_ROCK_SAMPLE WAYPOINT11) (AT_ROCK_SAMPLE WAYPOINT12)
             (AT_SOIL_SAMPLE WAYPOINT13) (AT_ROCK_SAMPLE WAYPOINT13)
             (AT_SOIL_SAMPLE WAYPOINT14) (AT_ROCK_SAMPLE WAYPOINT14)
             (AT_LANDER GENERAL WAYPOINT13) (CHANNEL_FREE GENERAL)
             (AT ROVER0 WAYPOINT12) (AVAILABLE ROVER0)
             (STORE_OF ROVER0STORE ROVER0) (EMPTY ROVER0STORE)
             (EQUIPPED_FOR_ROCK_ANALYSIS ROVER0)
             (CAN_TRAVERSE ROVER0 WAYPOINT12 WAYPOINT0)
             (CAN_TRAVERSE ROVER0 WAYPOINT0 WAYPOINT12)
             (CAN_TRAVERSE ROVER0 WAYPOINT12 WAYPOINT1)
             (CAN_TRAVERSE ROVER0 WAYPOINT1 WAYPOINT12)
             (CAN_TRAVERSE ROVER0 WAYPOINT12 WAYPOINT6)
             (CAN_TRAVERSE ROVER0 WAYPOINT6 WAYPOINT12)
             (CAN_TRAVERSE ROVER0 WAYPOINT12 WAYPOINT7)
             (CAN_TRAVERSE ROVER0 WAYPOINT7 WAYPOINT12)
             (CAN_TRAVERSE ROVER0 WAYPOINT0 WAYPOINT3)
             (CAN_TRAVERSE ROVER0 WAYPOINT3 WAYPOINT0)
             (CAN_TRAVERSE ROVER0 WAYPOINT1 WAYPOINT4)
             (CAN_TRAVERSE ROVER0 WAYPOINT4 WAYPOINT1)
             (CAN_TRAVERSE ROVER0 WAYPOINT1 WAYPOINT5)
             (CAN_TRAVERSE ROVER0 WAYPOINT5 WAYPOINT1)
             (CAN_TRAVERSE ROVER0 WAYPOINT1 WAYPOINT8)
             (CAN_TRAVERSE ROVER0 WAYPOINT8 WAYPOINT1)
             (CAN_TRAVERSE ROVER0 WAYPOINT1 WAYPOINT11)
             (CAN_TRAVERSE ROVER0 WAYPOINT11 WAYPOINT1)
             (CAN_TRAVERSE ROVER0 WAYPOINT6 WAYPOINT13)
             (CAN_TRAVERSE ROVER0 WAYPOINT13 WAYPOINT6)
             (CAN_TRAVERSE ROVER0 WAYPOINT7 WAYPOINT9)
             (CAN_TRAVERSE ROVER0 WAYPOINT9 WAYPOINT7)
             (AT ROVER1 WAYPOINT12) (AVAILABLE ROVER1)
             (STORE_OF ROVER1STORE ROVER1) (EMPTY ROVER1STORE)
             (EQUIPPED_FOR_IMAGING ROVER1)
             (CAN_TRAVERSE ROVER1 WAYPOINT12 WAYPOINT0)
             (CAN_TRAVERSE ROVER1 WAYPOINT0 WAYPOINT12)
             (CAN_TRAVERSE ROVER1 WAYPOINT12 WAYPOINT1)
             (CAN_TRAVERSE ROVER1 WAYPOINT1 WAYPOINT12)
             (CAN_TRAVERSE ROVER1 WAYPOINT12 WAYPOINT5)
             (CAN_TRAVERSE ROVER1 WAYPOINT5 WAYPOINT12)
             (CAN_TRAVERSE ROVER1 WAYPOINT12 WAYPOINT6)
             (CAN_TRAVERSE ROVER1 WAYPOINT6 WAYPOINT12)
             (CAN_TRAVERSE ROVER1 WAYPOINT0 WAYPOINT3)
             (CAN_TRAVERSE ROVER1 WAYPOINT3 WAYPOINT0)
             (CAN_TRAVERSE ROVER1 WAYPOINT0 WAYPOINT13)
             (CAN_TRAVERSE ROVER1 WAYPOINT13 WAYPOINT0)
             (CAN_TRAVERSE ROVER1 WAYPOINT1 WAYPOINT11)
             (CAN_TRAVERSE ROVER1 WAYPOINT11 WAYPOINT1)
             (CAN_TRAVERSE ROVER1 WAYPOINT1 WAYPOINT14)
             (CAN_TRAVERSE ROVER1 WAYPOINT14 WAYPOINT1)
             (CAN_TRAVERSE ROVER1 WAYPOINT5 WAYPOINT2)
             (CAN_TRAVERSE ROVER1 WAYPOINT2 WAYPOINT5)
             (CAN_TRAVERSE ROVER1 WAYPOINT5 WAYPOINT8)
             (CAN_TRAVERSE ROVER1 WAYPOINT8 WAYPOINT5)
             (CAN_TRAVERSE ROVER1 WAYPOINT6 WAYPOINT4)
             (CAN_TRAVERSE ROVER1 WAYPOINT4 WAYPOINT6)
             (CAN_TRAVERSE ROVER1 WAYPOINT6 WAYPOINT7)
             (CAN_TRAVERSE ROVER1 WAYPOINT7 WAYPOINT6)
             (CAN_TRAVERSE ROVER1 WAYPOINT6 WAYPOINT10)
             (CAN_TRAVERSE ROVER1 WAYPOINT10 WAYPOINT6)
             (CAN_TRAVERSE ROVER1 WAYPOINT11 WAYPOINT9)
             (CAN_TRAVERSE ROVER1 WAYPOINT9 WAYPOINT11)
             (AT ROVER2 WAYPOINT5) (AVAILABLE ROVER2)
             (STORE_OF ROVER2STORE ROVER2) (EMPTY ROVER2STORE)
             (EQUIPPED_FOR_IMAGING ROVER2)
             (CAN_TRAVERSE ROVER2 WAYPOINT5 WAYPOINT1)
             (CAN_TRAVERSE ROVER2 WAYPOINT1 WAYPOINT5)
             (CAN_TRAVERSE ROVER2 WAYPOINT5 WAYPOINT2)
             (CAN_TRAVERSE ROVER2 WAYPOINT2 WAYPOINT5)
             (CAN_TRAVERSE ROVER2 WAYPOINT5 WAYPOINT6)
             (CAN_TRAVERSE ROVER2 WAYPOINT6 WAYPOINT5)
             (CAN_TRAVERSE ROVER2 WAYPOINT5 WAYPOINT8)
             (CAN_TRAVERSE ROVER2 WAYPOINT8 WAYPOINT5)
             (CAN_TRAVERSE ROVER2 WAYPOINT5 WAYPOINT13)
             (CAN_TRAVERSE ROVER2 WAYPOINT13 WAYPOINT5)
             (CAN_TRAVERSE ROVER2 WAYPOINT5 WAYPOINT14)
             (CAN_TRAVERSE ROVER2 WAYPOINT14 WAYPOINT5)
             (CAN_TRAVERSE ROVER2 WAYPOINT1 WAYPOINT0)
             (CAN_TRAVERSE ROVER2 WAYPOINT0 WAYPOINT1)
             (CAN_TRAVERSE ROVER2 WAYPOINT1 WAYPOINT4)
             (CAN_TRAVERSE ROVER2 WAYPOINT4 WAYPOINT1)
             (CAN_TRAVERSE ROVER2 WAYPOINT2 WAYPOINT3)
             (CAN_TRAVERSE ROVER2 WAYPOINT3 WAYPOINT2)
             (CAN_TRAVERSE ROVER2 WAYPOINT2 WAYPOINT9)
             (CAN_TRAVERSE ROVER2 WAYPOINT9 WAYPOINT2)
             (CAN_TRAVERSE ROVER2 WAYPOINT2 WAYPOINT11)
             (CAN_TRAVERSE ROVER2 WAYPOINT11 WAYPOINT2)
             (CAN_TRAVERSE ROVER2 WAYPOINT6 WAYPOINT7)
             (CAN_TRAVERSE ROVER2 WAYPOINT7 WAYPOINT6)
             (CAN_TRAVERSE ROVER2 WAYPOINT6 WAYPOINT12)
             (CAN_TRAVERSE ROVER2 WAYPOINT12 WAYPOINT6)
             (CAN_TRAVERSE ROVER2 WAYPOINT8 WAYPOINT10)
             (CAN_TRAVERSE ROVER2 WAYPOINT10 WAYPOINT8)
             (AT ROVER3 WAYPOINT13) (AVAILABLE ROVER3)
             (STORE_OF ROVER3STORE ROVER3) (EMPTY ROVER3STORE)
             (EQUIPPED_FOR_SOIL_ANALYSIS ROVER3)
             (EQUIPPED_FOR_IMAGING ROVER3)
             (CAN_TRAVERSE ROVER3 WAYPOINT13 WAYPOINT0)
             (CAN_TRAVERSE ROVER3 WAYPOINT0 WAYPOINT13)
             (CAN_TRAVERSE ROVER3 WAYPOINT13 WAYPOINT3)
             (CAN_TRAVERSE ROVER3 WAYPOINT3 WAYPOINT13)
             (CAN_TRAVERSE ROVER3 WAYPOINT13 WAYPOINT5)
             (CAN_TRAVERSE ROVER3 WAYPOINT5 WAYPOINT13)
             (CAN_TRAVERSE ROVER3 WAYPOINT13 WAYPOINT6)
             (CAN_TRAVERSE ROVER3 WAYPOINT6 WAYPOINT13)
             (CAN_TRAVERSE ROVER3 WAYPOINT0 WAYPOINT1)
             (CAN_TRAVERSE ROVER3 WAYPOINT1 WAYPOINT0)
             (CAN_TRAVERSE ROVER3 WAYPOINT0 WAYPOINT10)
             (CAN_TRAVERSE ROVER3 WAYPOINT10 WAYPOINT0)
             (CAN_TRAVERSE ROVER3 WAYPOINT3 WAYPOINT7)
             (CAN_TRAVERSE ROVER3 WAYPOINT7 WAYPOINT3)
             (CAN_TRAVERSE ROVER3 WAYPOINT3 WAYPOINT8)
             (CAN_TRAVERSE ROVER3 WAYPOINT8 WAYPOINT3)
             (CAN_TRAVERSE ROVER3 WAYPOINT3 WAYPOINT11)
             (CAN_TRAVERSE ROVER3 WAYPOINT11 WAYPOINT3)
             (CAN_TRAVERSE ROVER3 WAYPOINT5 WAYPOINT2)
             (CAN_TRAVERSE ROVER3 WAYPOINT2 WAYPOINT5)
             (CAN_TRAVERSE ROVER3 WAYPOINT5 WAYPOINT12)
             (CAN_TRAVERSE ROVER3 WAYPOINT12 WAYPOINT5)
             (CAN_TRAVERSE ROVER3 WAYPOINT5 WAYPOINT14)
             (CAN_TRAVERSE ROVER3 WAYPOINT14 WAYPOINT5)
             (CAN_TRAVERSE ROVER3 WAYPOINT1 WAYPOINT4)
             (CAN_TRAVERSE ROVER3 WAYPOINT4 WAYPOINT1)
             (AT ROVER4 WAYPOINT1) (AVAILABLE ROVER4)
             (STORE_OF ROVER4STORE ROVER4) (EMPTY ROVER4STORE)
             (EQUIPPED_FOR_ROCK_ANALYSIS ROVER4)
             (EQUIPPED_FOR_IMAGING ROVER4)
             (CAN_TRAVERSE ROVER4 WAYPOINT1 WAYPOINT0)
             (CAN_TRAVERSE ROVER4 WAYPOINT0 WAYPOINT1)
             (CAN_TRAVERSE ROVER4 WAYPOINT1 WAYPOINT4)
             (CAN_TRAVERSE ROVER4 WAYPOINT4 WAYPOINT1)
             (CAN_TRAVERSE ROVER4 WAYPOINT1 WAYPOINT5)
             (CAN_TRAVERSE ROVER4 WAYPOINT5 WAYPOINT1)
             (CAN_TRAVERSE ROVER4 WAYPOINT1 WAYPOINT8)
             (CAN_TRAVERSE ROVER4 WAYPOINT8 WAYPOINT1)
             (CAN_TRAVERSE ROVER4 WAYPOINT1 WAYPOINT12)
             (CAN_TRAVERSE ROVER4 WAYPOINT12 WAYPOINT1)
             (CAN_TRAVERSE ROVER4 WAYPOINT1 WAYPOINT14)
             (CAN_TRAVERSE ROVER4 WAYPOINT14 WAYPOINT1)
             (CAN_TRAVERSE ROVER4 WAYPOINT0 WAYPOINT3)
             (CAN_TRAVERSE ROVER4 WAYPOINT3 WAYPOINT0)
             (CAN_TRAVERSE ROVER4 WAYPOINT0 WAYPOINT6)
             (CAN_TRAVERSE ROVER4 WAYPOINT6 WAYPOINT0)
             (CAN_TRAVERSE ROVER4 WAYPOINT0 WAYPOINT10)
             (CAN_TRAVERSE ROVER4 WAYPOINT10 WAYPOINT0)
             (CAN_TRAVERSE ROVER4 WAYPOINT0 WAYPOINT13)
             (CAN_TRAVERSE ROVER4 WAYPOINT13 WAYPOINT0)
             (CAN_TRAVERSE ROVER4 WAYPOINT4 WAYPOINT2)
             (CAN_TRAVERSE ROVER4 WAYPOINT2 WAYPOINT4)
             (CAN_TRAVERSE ROVER4 WAYPOINT4 WAYPOINT11)
             (CAN_TRAVERSE ROVER4 WAYPOINT11 WAYPOINT4)
             (CAN_TRAVERSE ROVER4 WAYPOINT8 WAYPOINT7)
             (CAN_TRAVERSE ROVER4 WAYPOINT7 WAYPOINT8)
             (CAN_TRAVERSE ROVER4 WAYPOINT14 WAYPOINT9)
             (CAN_TRAVERSE ROVER4 WAYPOINT9 WAYPOINT14)
             (AT ROVER5 WAYPOINT8) (AVAILABLE ROVER5)
             (STORE_OF ROVER5STORE ROVER5) (EMPTY ROVER5STORE)
             (EQUIPPED_FOR_ROCK_ANALYSIS ROVER5)
             (EQUIPPED_FOR_IMAGING ROVER5)
             (CAN_TRAVERSE ROVER5 WAYPOINT8 WAYPOINT1)
             (CAN_TRAVERSE ROVER5 WAYPOINT1 WAYPOINT8)
             (CAN_TRAVERSE ROVER5 WAYPOINT8 WAYPOINT3)
             (CAN_TRAVERSE ROVER5 WAYPOINT3 WAYPOINT8)
             (CAN_TRAVERSE ROVER5 WAYPOINT8 WAYPOINT5)
             (CAN_TRAVERSE ROVER5 WAYPOINT5 WAYPOINT8)
             (CAN_TRAVERSE ROVER5 WAYPOINT8 WAYPOINT7)
             (CAN_TRAVERSE ROVER5 WAYPOINT7 WAYPOINT8)
             (CAN_TRAVERSE ROVER5 WAYPOINT8 WAYPOINT9)
             (CAN_TRAVERSE ROVER5 WAYPOINT9 WAYPOINT8)
             (CAN_TRAVERSE ROVER5 WAYPOINT8 WAYPOINT10)
             (CAN_TRAVERSE ROVER5 WAYPOINT10 WAYPOINT8)
             (CAN_TRAVERSE ROVER5 WAYPOINT8 WAYPOINT11)
             (CAN_TRAVERSE ROVER5 WAYPOINT11 WAYPOINT8)
             (CAN_TRAVERSE ROVER5 WAYPOINT1 WAYPOINT4)
             (CAN_TRAVERSE ROVER5 WAYPOINT4 WAYPOINT1)
             (CAN_TRAVERSE ROVER5 WAYPOINT1 WAYPOINT12)
             (CAN_TRAVERSE ROVER5 WAYPOINT12 WAYPOINT1)
             (CAN_TRAVERSE ROVER5 WAYPOINT1 WAYPOINT14)
             (CAN_TRAVERSE ROVER5 WAYPOINT14 WAYPOINT1)
             (CAN_TRAVERSE ROVER5 WAYPOINT3 WAYPOINT0)
             (CAN_TRAVERSE ROVER5 WAYPOINT0 WAYPOINT3)
             (CAN_TRAVERSE ROVER5 WAYPOINT3 WAYPOINT6)
             (CAN_TRAVERSE ROVER5 WAYPOINT6 WAYPOINT3)
             (CAN_TRAVERSE ROVER5 WAYPOINT5 WAYPOINT2)
             (CAN_TRAVERSE ROVER5 WAYPOINT2 WAYPOINT5)
             (CAN_TRAVERSE ROVER5 WAYPOINT5 WAYPOINT13)
             (CAN_TRAVERSE ROVER5 WAYPOINT13 WAYPOINT5)
             (ON_BOARD CAMERA0 ROVER4)
             (CALIBRATION_TARGET CAMERA0 OBJECTIVE2)
             (SUPPORTS CAMERA0 HIGH_RES) (SUPPORTS CAMERA0 LOW_RES)
             (ON_BOARD CAMERA1 ROVER3)
             (CALIBRATION_TARGET CAMERA1 OBJECTIVE2)
             (SUPPORTS CAMERA1 COLOUR) (ON_BOARD CAMERA2 ROVER5)
             (CALIBRATION_TARGET CAMERA2 OBJECTIVE1)
             (SUPPORTS CAMERA2 COLOUR) (SUPPORTS CAMERA2 HIGH_RES)
             (ON_BOARD CAMERA3 ROVER3)
             (CALIBRATION_TARGET CAMERA3 OBJECTIVE5)
             (SUPPORTS CAMERA3 COLOUR) (ON_BOARD CAMERA4 ROVER5)
             (CALIBRATION_TARGET CAMERA4 OBJECTIVE3)
             (SUPPORTS CAMERA4 COLOUR) (SUPPORTS CAMERA4 HIGH_RES)
             (SUPPORTS CAMERA4 LOW_RES) (ON_BOARD CAMERA5 ROVER1)
             (CALIBRATION_TARGET CAMERA5 OBJECTIVE0)
             (SUPPORTS CAMERA5 LOW_RES) (ON_BOARD CAMERA6 ROVER2)
             (CALIBRATION_TARGET CAMERA6 OBJECTIVE5)
             (SUPPORTS CAMERA6 COLOUR) (SUPPORTS CAMERA6 HIGH_RES)
             (VISIBLE_FROM OBJECTIVE0 WAYPOINT0)
             (VISIBLE_FROM OBJECTIVE0 WAYPOINT1)
             (VISIBLE_FROM OBJECTIVE0 WAYPOINT2)
             (VISIBLE_FROM OBJECTIVE0 WAYPOINT3)
             (VISIBLE_FROM OBJECTIVE1 WAYPOINT0)
             (VISIBLE_FROM OBJECTIVE1 WAYPOINT1)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT0)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT1)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT2)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT3)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT4)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT5)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT6)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT7)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT8)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT9)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT10)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT11)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT12)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT13)
             (VISIBLE_FROM OBJECTIVE2 WAYPOINT14)
             (VISIBLE_FROM OBJECTIVE3 WAYPOINT0)
             (VISIBLE_FROM OBJECTIVE3 WAYPOINT1)
             (VISIBLE_FROM OBJECTIVE3 WAYPOINT2)
             (VISIBLE_FROM OBJECTIVE3 WAYPOINT3)
             (VISIBLE_FROM OBJECTIVE3 WAYPOINT4)
             (VISIBLE_FROM OBJECTIVE3 WAYPOINT5)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT0)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT1)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT2)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT3)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT4)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT5)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT6)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT7)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT8)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT9)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT10)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT11)
             (VISIBLE_FROM OBJECTIVE4 WAYPOINT12)
             (VISIBLE_FROM OBJECTIVE5 WAYPOINT0)
             (VISIBLE_FROM OBJECTIVE5 WAYPOINT1)
             (:ORIGINAL-GOAL
              (AND (COMMUNICATED_SOIL_DATA WAYPOINT14)
                   (COMMUNICATED_SOIL_DATA WAYPOINT5)
                   (COMMUNICATED_SOIL_DATA WAYPOINT2)
                   (COMMUNICATED_SOIL_DATA WAYPOINT3)
                   (COMMUNICATED_ROCK_DATA WAYPOINT3)
                   (COMMUNICATED_ROCK_DATA WAYPOINT5)
                   (COMMUNICATED_ROCK_DATA WAYPOINT12)
                   (COMMUNICATED_ROCK_DATA WAYPOINT9)
                   (COMMUNICATED_IMAGE_DATA OBJECTIVE2 COLOUR)
                   (COMMUNICATED_IMAGE_DATA OBJECTIVE2 LOW_RES)
                   (COMMUNICATED_IMAGE_DATA OBJECTIVE3 COLOUR)
                   (COMMUNICATED_IMAGE_DATA OBJECTIVE5 COLOUR)
                   (COMMUNICATED_IMAGE_DATA OBJECTIVE4 COLOUR)))
             (COMMUNICATE_SOIL_DATA WAYPOINT14)
             (COMMUNICATE_SOIL_DATA WAYPOINT5)
             (COMMUNICATE_SOIL_DATA WAYPOINT2)
             (COMMUNICATE_SOIL_DATA WAYPOINT3)
             (COMMUNICATE_ROCK_DATA WAYPOINT3)
             (COMMUNICATE_ROCK_DATA WAYPOINT5)
             (COMMUNICATE_ROCK_DATA WAYPOINT12)
             (COMMUNICATE_ROCK_DATA WAYPOINT9)
             (COMMUNICATE_IMAGE_DATA OBJECTIVE2 COLOUR)
             (COMMUNICATE_IMAGE_DATA OBJECTIVE2 LOW_RES)
             (COMMUNICATE_IMAGE_DATA OBJECTIVE3 COLOUR)
             (COMMUNICATE_IMAGE_DATA OBJECTIVE5 COLOUR)
             (COMMUNICATE_IMAGE_DATA OBJECTIVE4 COLOUR))
            (:TASK ACHIEVE-GOALS)) 