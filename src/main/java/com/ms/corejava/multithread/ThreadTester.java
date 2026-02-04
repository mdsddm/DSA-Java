package com.ms.corejava.multithread;

public class ThreadTester {

    public static void main(String[] args) {
        new A();
        new B();
    }
}

class A extends Thread {
    A() {
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("from A thread" + i);
                sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Some problem happened in A ");
        } finally {
            System.out.println("Exiting from A Thread.");
        }
    }

}

class B extends Thread {
    B() {
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("from B thread " + i);
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Something happend in B ");
        } finally {
            System.out.println("Exting from B thread.");
        }
    }

}
