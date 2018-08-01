package stdlib4146.Motors;

import edu.wpi.first.wpilibj.SpeedController;
/*
 *  The 775Pro class is used for defining 775Pro motors.
 *
 *  @author GowanR
 *  @version 0.0.0
 */

public class 775Pro extends DCMotor {
    public 775Pro(SpeedController motorController) {
        this.freeSpeed = 18730;
        this.freeCurrent = 0.7;
        this.stallTorque = 0.71;
        this.stallCurrent = 134;
        this.power = 347;
        super(motorController);
    }
}