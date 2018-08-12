package stdlib4146.XboxController;
import java.util.ArrayList;
/**
 * The ControllerBinder class simplifies the controller syntax for handling user input.
 * 
 * @author GowanR
 * 
 * @version 0.0.0
 */

public class ControllerBinder {
    Controller xboxController;
    ArrayList<BoundCallback> callbackList;

    public ControllerBinder(Controller xboxController) {
        this.xboxController = xboxController;
        callbackList = new ArrayList<BoundCallback>();
    }
    
    public void bind(int button, ButtonCallback callback) {
        callbackList.add(new BoundCallback(button, callback));
    }
    
    public void update(double dt) {
        for (BoundCallback bc : callbackList) {
            if (xboxController.getRawButton(bc.button)) {
                bc.pressed = true;
                bc.callback.onPress(bc.holdtime);
                bc.holdtime += dt;
                bc.releaseRan = false;
            } 
            if (!xboxController.getRawButton(bc.button)) {
                bc.pressed = false;
                if (!bc.releaseRan) {
                    bc.callback.onRelease();
                    bc.releaseRan = true;
                }
            }
        }
    }

    class BoundCallback {
        public int button;
        public ButtonCallback callback;
        public double holdtime;
        public boolean pressed;
        public boolean releaseRan;
        
        public BoundCallback(int button, ButtonCallback callback) { 
            this.button = button;
            this.callback = callback;
            this.holdtime = 0;
            this.pressed = false;
            this.releaseRan = true; // Refers to whether the onRelease method has run.
        }
    }
}