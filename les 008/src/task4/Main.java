package task4;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    a.methodA();
                    b.methodB();
                }
            }
        });
        thread.start();
    }
}


class A {
    public void methodA() {
        System.out.println("A");
    }
}

class B {
    public void methodB() {
        System.out.println("B");
    }
}
