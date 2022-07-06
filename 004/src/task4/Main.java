package task4;


public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run Daemon thread");
            }
        });
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread name = " + thread.getName());
        System.out.println("Thread ID = "+ thread.getId());
        System.out.println("Thread State = " + thread.getState());
        System.out.println("Thread priority = " + thread.getPriority());
        System.out.println("Thread Status = " + thread.isAlive());

    }
}
