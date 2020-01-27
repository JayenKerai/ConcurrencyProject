package com.sparta.jk;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //using 1st method to create thread 1
        Thread thread1 = new Thread(new SharedCounter());

        //using 2nd method to create thread 2
        SharedCounter sC = new SharedCounter();
        Thread thread2 = new Thread(sC);

        //using 1st method to create thread 3
        Thread thread3 = new Thread(new SharedCounter());

        thread1.setName("thread 1");
        thread2.setName("thread 2");
        thread3.setName("thread 3");

        //run both threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class SharedCounter implements Runnable {
    int counter = 0;

    @Override
    public void run() {
        incrementCounter();
        System.out.println(counter + " " + Thread.currentThread().getName()); //prints current counter value and its thread
    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        ++counter;
    }
}
