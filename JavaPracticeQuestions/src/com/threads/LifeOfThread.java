package com.threads;
 

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is in Running state");

        try {
            // Thread moves to Timed Waiting
            Thread.sleep(1000);
            System.out.println("Thread woke up from Timed Waiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread is about to finish (Terminated state)");
    }
}


public class LifeOfThread {
    public static void main(String[] args) throws InterruptedException {
        // Thread is in New state
        MyThread t = new MyThread();

        System.out.println("State after creation: " + t.getState()); // NEW

        t.start(); // Moves to Runnable state
        System.out.println("State after calling start(): " + t.getState()); // RUNNABLE

        // Sleep the main thread for a short time so child thread enters sleep
        Thread.sleep(100);

        System.out.println("State while child thread is sleeping: " + t.getState()); // TIMED_WAITING

        // Wait for thread to complete
        t.join();

        System.out.println("State after thread finishes: " + t.getState()); // TERMINATED
    }
}
