package stdlib4146.Assemblies;
import stdlib4146.Motors.DCMotor;
import stdlib4146.Motors.MotorGroup;

/**
 *  The GearBoxMotorGeneric class is used for modeling DCMotors or MotorGroups with a gearbox.
 *
 *  @author GowanR
 *  @version 0.0.0
 */

public class GearboxMotorGeneric {
    double reduction;
    double gearboxEfficiency; 
    MotorGroup motors;

    public GearboxMotorGeneric(DCMotor motor, double reduction) {
        this.motors = new MotorGroup(motor);
        this.reduction = reduction;
    }
    public GearboxMotorGeneric(MotorGroup motorGroup, double reduction) {
        this.motors = motorGroup;
        this.reduction = reduction;
    }
    public void addMotor(DCMotor motor) {
        this.motors.add(motor);
    }
}