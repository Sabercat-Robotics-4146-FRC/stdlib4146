package stdlib4146.Assemblies;
import java.utils.ArrayList;

/**
 *  The MotorGroup class allows you to group DCMotors together in order to model and control them together.
 *
 *  @author GowanR
 *  @version 0.0.0
 */

public class MotorGroup extends DCMotorSpecs{
    ArrayList<DCMotor> motorBundle;

    public MotorGroup(ArrayList<DCMotor> motorBundle) {
        this.motorBundle = motorBundle;
    }
    public MotorGroup(DCMotor motor) {
        this.motorBundle = new ArrayList<DCMotor>();
        this.motorBundle.add(motor);
    }
    public MotorGroup() {
        this.motorBundle = new ArrayList<DCMotor>();
    }
    public add(DCMotor motor) {
        motorBundle.add(motor);
    }
    public void set(double voltageProportion) {
        for (DCMotor motor : motorBundle) {
            motor.set(voltageProportion);
        }
    }
    public double get() {

    }
    public double getFreeSpeed() { // returns lowest freespeed in bundle
        double _minRPM = motorBundle.get(0).getFreeSpeed();
        if (motorBundle.size() == 0){
            return -1;
        }
        for (DCMotor motor : motorBundle) {
            if (motor.getFreeSpeed() < _minRPM) {
                _minRPM = motor.getFreeSpeed();
            }
        }
        return _minRPM;
    }
    public double getFreeCurrent() {
        if (motorBundle.size() == 0){
            return -1;
        }

        double _freeCurrentSum = 0;
        for (DCMotor motor : motorBundle) {
            _freeCurrentSum += motor.getFreeCurrent();
        }
        return _freeCurrentSum;
    }
    public double getStallTorque() {
        if (motorBundle.size() == 0){
            return -1;
        }

        double _stallTorqueSum = 0;
        for (DCMotor motor : motorBundle) {
            _stallTorqueSum += motor.getStallTorque();
        }
        return _stallTorqueSum;
    }
    public double getStallCurrent() {
        if (motorBundle.size() == 0){
            return -1;
        }

        double _stallCurrentSum = 0;
        for (DCMotor motor : motorBundle) {
            _stallCurrentSum += motor.getStallCurrent();
        }
        return _stallCurrentSum;
    }
    public double getPower() {
        if (motorBundle.size() == 0){
            return -1;
        }

        double _powerSum = 0;
        for (DCMotor motor : motorBundle) {
            _powerSum += motor.getPower();
        }
        return _powerSum;
    }
}