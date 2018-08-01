package stdlib4146;

/**
 * The ButtonCallback interface is used for streamlining button callbacks with the ControllerBinder.
 * 
 * @author GowanR
 * 
 * @version 0.0.0
 */


public interface ButtonCallback {
    public void onPress(double holdtime); // first iteration of press has holdtime = 0
    public void onRelease(); // only runs once on release
}