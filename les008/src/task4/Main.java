package task4;

public class Main {
    static volatile boolean lock;

    public static void main(String[] args) {
        lock = false;
        A a = new A();
        B b = new B();
        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);
        threadA.start();
        threadB.start();
    }
}

class A implements Runnable {
//    boolean lock;

    public A() {
//        this.lock = lock;
    }

    void methodA() {
        while (true) {
            if (!Main.lock) {
                System.out.println(Thread.currentThread().getName() + " A class");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Main.lock = true;
            }
        }
    }

    @Override
    public void run() {
        methodA();
    }
}

class B implements Runnable {
//    boolean lock;

    public B() {
//        this.lock = lock;
    }

    void methodB() {
        while (true) {
            if (Main.lock) {
                System.out.println(Thread.currentThread().getName() + " B class");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Main.lock = false;
            }
        }
    }

    @Override
    public void run() {
        methodB();
    }
}