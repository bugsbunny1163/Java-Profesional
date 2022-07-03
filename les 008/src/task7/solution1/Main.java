package task7.solution1;

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
        synchronized (A.class) {
            System.out.println("A");
            synchronized (B.class) {
                System.out.println("A hold B");
            }
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        synchronized (A.class) {
            System.out.println("B");
            synchronized (B.class) {
                System.out.println("B hold A");
            }
        }
    }
}
