package stdlib4146.Motors;

import edu.wpi.first.wpilibj.SpeedController;
/*
 *  The BAG class is used for defining BAG motors.
 *
 *  @author GowanR
 *  @version 0.0.0
 */

public class BAG extends DCMotor {
    public BAG(SpeedController motorController) {
        this.freeSpeed = 13180;
        this.freeCurrent = 1.8;
        this.stallTorque = 0.43;
        this.stallCurrent = 53;
        this.power = 149;
        super(motorController);
    }
}