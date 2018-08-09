# stdlib4146 Changelog

## 0.0.2
Author JacobE
### Changes
% Changed some eclipse metadata in the project so that it will search for the required WPILib
  libraries in the current users home folder instead of a specific users.

## 0.0.1
Author GowanR
### Changes
+ Logging (rate limited, file, printing, type)
+ Motion Controller support
    + PID base, base pid that others extend
    + GenericPotArmPID, a generic PID controller for moving a POT arm. 
    + HeadingPID, PID controller for turning robot based on gyro and drive train
    + PID thread, second thread for running all PID controllers for higher frequency
+ DriveTrain skeleton
+ Motors, commonly used dc motor models with motor grouping
+ XboxController 
    + new button binding feature
+ Assemblies
    + generic Servo based on potentiometer.
    + generic model of geared down motor


## 0.0.0
Author: EliA
### Changes
+ Xbox Controller Support
