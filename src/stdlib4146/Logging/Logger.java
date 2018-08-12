package stdlib4146.Logging;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.FileOutputStream;

/*
 *  The Logger class is used for smart logging and printing. The print statements are rate limited by default. 
 *  Can write to a file or print.
 *
 *  @author GowanR
 *  @version 0.0.1
 */


 //  ___
 // | __ In order from most import to least important.
 // ||      FATAL,    Use when the error will likely cause Robot Failure.
 // ||      CRITICAL, Use when system critical fault occurs.
 // ||      ERROR,    Use when an error occurs.
 // ||      WARNING,  Use when you're warning about important info.
 // \/      DEBUG,    Use when you're just debugging the Robot.


public class Logger {
    public static final double UPDATE_RATE = 1; //Htz, once per second
    public static ArrayList<String> LOG_QUEUE = new ArrayList<String>();
    public static double DT_ACC = 0;
    public static FileOutputStream OUTPUT_STREAM;
    public static final String FILE_NAME = ""; // Change this to write to a file.

    static String timestamp() {
        return (String)(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
    }
    static void log(String level, String message) {
    	LOG_QUEUE.add("[" + level + "] " + message + " [" + timestamp() + "]");
    }
    static void debug(String message) {
        log("DEBUG", message);
    }
    static void warn(String message) {
        log("WARNING", message);
    }
    static void error(String message) {
        log("ERROR", message);
    }
    static void critical(String message) {
        log("CRITICAL", message);
    }
    static void fatal(String message) {
        log("FATAL", message);
    }
    @SuppressWarnings("unused") // eclipse calls the file printing dead code if name is blank and underlines are annoying.
	static void update(double dt) throws IOException { // Run this in the main operation loop.
        if (FILE_NAME != "" && OUTPUT_STREAM == null) {
           OUTPUT_STREAM = new FileOutputStream(FILE_NAME);
        }
        DT_ACC += dt;
        if (DT_ACC >= (1/UPDATE_RATE)) {
            for (String message : LOG_QUEUE) {
                System.out.println(message);
                if (FILE_NAME != "") {
                    message += "\n";
                    OUTPUT_STREAM.write(message.getBytes());
                } 
            }
            DT_ACC = 0;
            LOG_QUEUE.clear();
        }
    }
    static void closeFile() throws IOException {
        if (OUTPUT_STREAM != null) {
            OUTPUT_STREAM.close();
        }
    }
}