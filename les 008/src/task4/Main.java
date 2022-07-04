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
    }
}

class B extends Thread {
    @Override
    public void run() {
    }
}
