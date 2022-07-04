package task4;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}


class A extends Thread {
    @Override
    public void run() {
        synchronized (A.class){
            synchronized (B.class){
                for (int i = 0; i < 50; i++) {
                    System.out.println("class A");
                }
            }
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        synchronized (A.class){
            synchronized (B.class){
                for (int i = 0; i < 50; i++) {
                    System.out.println("class B");
                }
            }
        }
    }
}
