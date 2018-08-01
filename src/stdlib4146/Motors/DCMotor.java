package stdlib4146.Motors;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *  The Motor class is an abstract class used to create DC motors.
 *
 *  @author GowanR
 *  @version 0.0.0
 */
public class DCMotor implements SpeedController, DCMotorSpecs {
    double freeSpeed;    // RPM
    double freeCurrent;  // Amperes
    double stallTorque;  // N*M
    double stallCurrent; // Amperes
    double power;        // Watts
    
    double Kt; // stallTorque / stallCurrent
    double Kv; // freeSpeed / 12v
    
    SpeedController motorController;
    public DCMotor(SpeedController motorController) {
        this.motorController = motorController;
        Kt = stallTorque / stallCurrent;
        Kv = freeSpeed / 12.6;
    }
    // ======================= SpeedController Overrides ======================= //
    public void disable() {
        this.speedController.disable();
    }
    public double get() {
        return this.speedController.get();
    }
    public boolean getInverted() {
        return this.speedController.getInverted();
    }
    public void set(double voltageProportion) {
        this.speedController.set(voltageProportion);
    }
    public void setInverted(boolean inverted) {
        this.speedController.setInverted(inverted);
    }
    public void stopMotor() {
        this.speedController.stopMotor();
    }
    // ======================= DCMotorSpecs Overrides ======================= //
    public double getFreeSpeed() {
        return freeSpeed;
    }
    public double getFreeCurrent() {
        return freeCurrent;
    }
    public double getStallTorque() {
        return stallCurrent;
    }
    public double getStallCurrent() {
        return stallCurrent;
    }
    public double getPower() {
        return power;
    }
}