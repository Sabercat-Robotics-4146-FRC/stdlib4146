package stdlib4146.Motors;

import edu.wpi.first.wpilibj.SpeedController;
/*
 *  The CIM class is used for defining CIM motors.
 *
 *  @author GowanR
 *  @version 0.0.0
 */

public class CIM extends DCMotor {
    public CIM(SpeedController motorController) {
        this.freeSpeed = 5330.0;
        this.freeCurrent = 2.7;
        this.stallTorque = 2.41;
        this.stallCurrent = 131;
        this.power = 337;
        super(motorController);
    }
}