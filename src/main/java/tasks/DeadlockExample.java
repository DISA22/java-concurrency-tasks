
package tasks;

public class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public void methodA() {
        synchronized (lockB) {
            System.out.println("Захватил lockB");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (lockA) {
            System.out.println("Захватил ЛокA");
        }
    }

    //я пробовал сделать дедлок и у меня ни разу не получилось
    //я пробовал сделать дедлок и у меня ни разу не получилось
    //я пробовал сделать дедлок и у меня ни разу не получилось


    public void methodB() {
        synchronized (lockA) {
            System.out.println("Захватил lockA");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (lockB) {
            System.out.println("Захватил Локб");
        }
    }
}
