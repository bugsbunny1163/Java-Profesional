package task2;

public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Main first = new Main();
        Main second = new Main();
        first.setName("first");
        second.setName("second");
        first.start();
        second.start();
        System.out.println("Завершення main");
    }

    @Override
    public void run() {
        System.out.println("Завершення "+Thread.currentThread().getName());
    }
}
