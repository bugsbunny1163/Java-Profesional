package task7.solution2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();

    }
}


class A extends Thread {
    public static Lock lockA = new ReentrantLock();

    @Override
    public void run() {
        try {
            lockA.lock();
            B.lockB.lock();
            System.out.println("A");
            System.out.println("A hold B");
        } finally {
            lockA.unlock();
            B.lockB.unlock();
        }
    }
}

class B extends Thread {
    public static Lock lockB = new ReentrantLock();

    @Override
    public void run() {
        try {
            A.lockA.lock();
            lockB.lock();
            System.out.println("B");
            System.out.println("B hold A");
        } finally {
            A.lockA.unlock();
            lockB.unlock();
        }
    }
}
