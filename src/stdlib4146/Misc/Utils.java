package stdlib4146.Misc;
/**
 *  This is where all static methods that are for generic use go.
 *
 *  @author GowanR
 *  @author JacobE
 *  @version 0.0.1
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
    
    public static void waitTime() {
		try {
			Thread.sleep(1); // time in milliseconds
		} catch (InterruptedException e) {
			System.out.println("Thread.sleep was Interrupted in waitTime1!");
			e.printStackTrace();
		}
	}
	
	public static void waitTime(int i) {
		try {
			Thread.sleep(i); // time in milliseconds
		} catch (InterruptedException e) {
			System.out.println("Thread.sleep was Interrupted in waitTime2!");
			e.printStackTrace();
		}
	}
}