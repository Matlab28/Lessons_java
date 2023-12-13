package Main12HW;

import java.util.Timer;
import java.util.TimerTask;

public class OneMinuteTimer {
    public static void main(String[] args) {
        // Create a Timer object
        Timer timer = new Timer();

        // Schedule a TimerTask to run after one minute (60000 milliseconds)
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Code to be executed after one minute
                System.out.println("One minute has passed!");

                // Stop the timer if needed
                timer.cancel();
            }
        }, 60000);
    }
}
