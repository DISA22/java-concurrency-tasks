package tasks;

public class CounterWithSynchronized {
    private int value = 0;

    public synchronized void increment() {
        value++;
    }

    public synchronized int get() {
        return value;
    }
}
