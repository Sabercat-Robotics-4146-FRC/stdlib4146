package stdlib4146.Misc;
/**
 * The Timer class simplifies the use of timers and calculating of DT, which many things in our code need.
 * 
 * @author GowanR
 * @author EliA
 * @author JacobE
 * 
 * @version 2.0.0
 */

public class Timer {
	private long startTime = 0; // Refers to the time the timer started.
	private long thisTime = 0; // Refers to the time at the beginning of the current update call
	private long lastTime = 0; // Refers to the time at the beginning of the last update call
	private double dt = 0; // change in time (seconds)
	
	public Timer() {
		// I think we can just not have this since its empty but I don't remember...
	}
	
	private double convertNanoToSec(long nano) {
		return (nano * (1e-9));
	}
	
	public void start() { // Call right before you need the timer. Probably in telop, before the loop.
		startTime = System.nanoTime();
		thisTime = startTime;
		lastTime = startTime;
	}
	
	public void reset() {
		startTime = System.nanoTime();
		thisTime = startTime;
		lastTime = startTime;
	}
	
	public void update() {
		thisTime = System.nanoTime();
		dt = convertNanoToSec(thisTime - lastTime);
		lastTime = thisTime;
	}
	
	public double timeSinceStart() {
		return convertNanoToSec( System.nanoTime() - startTime );
	}
	
	public double getDT() { // Returns DT(which is in seconds)
		return dt;
	}
}
