package stdlib4146.Motors;

import edu.wpi.first.wpilibj.SpeedController;
/*
 *  The MiniCIM class is used for defining MiniCIM motors.
 *
 *  @author GowanR
 *  @version 0.0.0
 */

public class MiniCIM extends DCMotor {
    public MiniCIM(SpeedController motorController) {
        this.freeSpeed = 5840;
        this.freeCurrent = 3;
        this.stallTorque = 1.41;
        this.stallCurrent = 89;
        this.power = 215;
        super(motorController);
    }
}