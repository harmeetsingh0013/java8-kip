package com.knoldus.kip.java8.day1.refactor;

/**
 * Created by harmeet on 27/3/17.
 */

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Without Lambda: "+Thread.currentThread().getName());
    }
}

public class CodeRefactor {
    public static void main(String... args) {
        Runnable worker1 = new Worker();
        Thread thread1 = new Thread(worker1);
        thread1.start();

        Runnable worker2 = () -> System.out.println("With lambda: "+Thread.currentThread().getName());
        Thread thread2 = new Thread(worker2);
        thread2.start();
    }
}
