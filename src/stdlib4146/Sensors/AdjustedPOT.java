package stdlib4146.Sensors;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
/**
 * The AdjustedPOT class is used for scaling the POT from arbitrary analog input to a degree mode. 
 * Basically maps a pot arbitrary input into degrees. map [0.0213, 1.234] => [0, 90]
 * Assumes min is 0 degrees and max is angleRange. Assumes all inputs are positive.
 *
 *  @author GowanR
 *  @version 0.0.0
 */

public class AdjustedPOT {
    AnalogPotentiometer pot;
    double min;
    double max;
    double angleRange;

    public AdjustedPOT(int analogInputID, double min, double max, double angleRange) {
        pot = new AnalogPotentiometer(analogInputID);
    }
    public double get() {
        return (pot.get() - min) * (angleRange/(max-min));
    }
    public boolean reachedMaxSoftStop() {
        return pot.get() > max;
    }
    public boolean reachedMinSoftStop() {
        return pot.get() < min;
    }
}