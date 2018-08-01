package stdlib4146.Misc;
/**
 *  This is where all static methods that are for generic math use go.
 *
 *  @author GowanR
 *  @version 0.0.0
 */


public class Utils {
    public static double clamp(double valueToClamp, double clampValue) {
		if(valueToClamp > clampValue){
			return clampValue;
		} else if(valueToClamp < -(clampValue)) {
			return -(clampValue);
		}
		return valueToClamp;
    }
}