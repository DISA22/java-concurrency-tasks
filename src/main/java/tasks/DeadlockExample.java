
package tasks;

public class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public void methodA() {
        synchronized (lockA) {
            System.out.println("Захватил lockB");
        }

        synchronized (lockB) {
            System.out.println("Захватил ЛокA");
        }
    }

    public void methodB() {
        synchronized (lockA) {
            System.out.println("Захватил lockA");
        }

        synchronized (lockB) {
            System.out.println("Захватил Локб");
        }
    }
}
