package com.sparta.jk;

public class Main {
    public static void main(String[] args) {
        //using 1st method to create thread
        Thread thread1 = new Thread(new SharedCounter());

        //using 2nd method to create thread
        SharedCounter sC = new SharedCounter();
        Thread thread2 = new Thread(sC);

        //run both threads
        thread1.start();
        thread1.setPriority(10);
        thread2.start();
        thread2.setPriority(1);
    }
}

class SharedCounter implements Runnable {
    int counter = 0;

    @Override
    public void run() {
        System.out.println(counter + " " + Thread.currentThread().getName());
        incrementCounter();
    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        ++counter;
    }
}