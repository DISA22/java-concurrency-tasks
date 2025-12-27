
package tasks;

public class VolatileFlag {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void runLoop() {
        while (running) {
            // busy work
        }
    }
}
