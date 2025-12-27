package tasks;

public class VisibilityProblem {
    private int value = 0;

    public synchronized void set(int v) {
        value = v;
    }

    public int get() {
        return value;
    }
}
