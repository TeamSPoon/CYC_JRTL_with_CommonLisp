
(IN-PACKAGE :SHOP-USER) 
(DEFPROBLEM STRIPS-SAT-X-1
 ((SATELLITE SATELLITE0) (INSTRUMENT INSTRUMENT0)
  (INSTRUMENT INSTRUMENT1) (INSTRUMENT INSTRUMENT2)
  (SATELLITE SATELLITE1) (INSTRUMENT INSTRUMENT3)
  (INSTRUMENT INSTRUMENT4) (INSTRUMENT INSTRUMENT5)
  (SATELLITE SATELLITE2) (INSTRUMENT INSTRUMENT6)
  (INSTRUMENT INSTRUMENT7) (INSTRUMENT INSTRUMENT8) (MODE THERMOGRAPH0)
  (MODE IMAGE2) (MODE SPECTROGRAPH1) (DIRECTION GROUNDSTATION2)
  (DIRECTION GROUNDSTATION1) (DIRECTION GROUNDSTATION0)
  (DIRECTION STAR3) (DIRECTION STAR4) (DIRECTION PHENOMENON5)
  (DIRECTION PHENOMENON6) (DIRECTION STAR7) (DIRECTION PHENOMENON8)
  (DIRECTION PLANET9) (SUPPORTS INSTRUMENT0 IMAGE2)
  (SUPPORTS INSTRUMENT0 THERMOGRAPH0)
  (SUPPORTS INSTRUMENT0 SPECTROGRAPH1)
  (CALIBRATION_TARGET INSTRUMENT0 GROUNDSTATION2)
  (SUPPORTS INSTRUMENT1 THERMOGRAPH0)
  (SUPPORTS INSTRUMENT1 SPECTROGRAPH1) (SUPPORTS INSTRUMENT1 IMAGE2)
  (CALIBRATION_TARGET INSTRUMENT1 GROUNDSTATION1)
  (SUPPORTS INSTRUMENT2 IMAGE2)
  (CALIBRATION_TARGET INSTRUMENT2 GROUNDSTATION0)
  (ON_BOARD INSTRUMENT0 SATELLITE0) (ON_BOARD INSTRUMENT1 SATELLITE0)
  (ON_BOARD INSTRUMENT2 SATELLITE0) (POWER_AVAIL SATELLITE0)
  (POINTING SATELLITE0 PHENOMENON8)
  (SUPPORTS INSTRUMENT3 SPECTROGRAPH1)
  (SUPPORTS INSTRUMENT3 THERMOGRAPH0)
  (CALIBRATION_TARGET INSTRUMENT3 GROUNDSTATION0)
  (SUPPORTS INSTRUMENT4 IMAGE2) (SUPPORTS INSTRUMENT4 SPECTROGRAPH1)
  (CALIBRATION_TARGET INSTRUMENT4 GROUNDSTATION2)
  (SUPPORTS INSTRUMENT5 IMAGE2) (SUPPORTS INSTRUMENT5 SPECTROGRAPH1)
  (SUPPORTS INSTRUMENT5 THERMOGRAPH0)
  (CALIBRATION_TARGET INSTRUMENT5 GROUNDSTATION1)
  (ON_BOARD INSTRUMENT3 SATELLITE1) (ON_BOARD INSTRUMENT4 SATELLITE1)
  (ON_BOARD INSTRUMENT5 SATELLITE1) (POWER_AVAIL SATELLITE1)
  (POINTING SATELLITE1 GROUNDSTATION2) (SUPPORTS INSTRUMENT6 IMAGE2)
  (CALIBRATION_TARGET INSTRUMENT6 GROUNDSTATION1)
  (SUPPORTS INSTRUMENT7 IMAGE2) (SUPPORTS INSTRUMENT7 THERMOGRAPH0)
  (CALIBRATION_TARGET INSTRUMENT7 GROUNDSTATION1)
  (SUPPORTS INSTRUMENT8 SPECTROGRAPH1) (SUPPORTS INSTRUMENT8 IMAGE2)
  (SUPPORTS INSTRUMENT8 THERMOGRAPH0)
  (CALIBRATION_TARGET INSTRUMENT8 GROUNDSTATION0)
  (ON_BOARD INSTRUMENT6 SATELLITE2) (ON_BOARD INSTRUMENT7 SATELLITE2)
  (ON_BOARD INSTRUMENT8 SATELLITE2) (POWER_AVAIL SATELLITE2)
  (POINTING SATELLITE2 PHENOMENON5)
  (ORIGINAL-GOAL
   (AND (POINTING SATELLITE0 PHENOMENON5)
        (POINTING SATELLITE1 GROUNDSTATION2)
        (HAVE_IMAGE STAR3 THERMOGRAPH0) (HAVE_IMAGE PHENOMENON5 IMAGE2)
        (HAVE_IMAGE PHENOMENON6 IMAGE2) (HAVE_IMAGE STAR7 THERMOGRAPH0)
        (HAVE_IMAGE PHENOMENON8 IMAGE2)
        (HAVE_IMAGE PLANET9 SPECTROGRAPH1)))
  (GOAL-POINTING SATELLITE0 PHENOMENON5)
  (GOAL-POINTING SATELLITE1 GROUNDSTATION2)
  (GOAL-HAVE-IMAGE STAR3 THERMOGRAPH0)
  (GOAL-HAVE-IMAGE PHENOMENON5 IMAGE2)
  (GOAL-HAVE-IMAGE PHENOMENON6 IMAGE2)
  (GOAL-HAVE-IMAGE STAR7 THERMOGRAPH0)
  (GOAL-HAVE-IMAGE PHENOMENON8 IMAGE2)
  (GOAL-HAVE-IMAGE PLANET9 SPECTROGRAPH1))
 (MAIN)) 