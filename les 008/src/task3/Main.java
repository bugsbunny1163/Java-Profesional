package task3;

public class Main {
    public static void main(String[] args) {
        PriorityRunner priorityRunner = new PriorityRunner();
        priorityRunner.setPriority(Thread.MIN_PRIORITY);
        PriorityThread priorityThread = new PriorityThread();
        priorityThread.setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        priorityRunner.start();
        priorityThread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main " + i);
        }
    }
}
