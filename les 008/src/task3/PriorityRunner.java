package task3;

public class PriorityRunner extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("PriorityRunner "+ i);
        }
    }
}
