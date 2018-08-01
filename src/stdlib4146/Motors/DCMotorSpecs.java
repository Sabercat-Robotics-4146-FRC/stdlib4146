package stdlib4146.Motors;
/**
 *  The DCMotorSpecs interface gives unified specification for both DCMototors and MotorGroups.
 *
 *  @author GowanR
 *  @version 0.0.0
 */

public interface DCMotorSpecs {
    public double getFreeSpeed();
    public double getFreeCurrent();
    public double getStallTorque();
    public double getStallCurrent();
    public double getPower();
}