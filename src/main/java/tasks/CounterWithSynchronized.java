package tasks;

public class CounterWithSynchronized {
    private int value = 0;

    public synchronized void increment() {
        value++;
    }

    public int get() {
        return value;
    }
}
