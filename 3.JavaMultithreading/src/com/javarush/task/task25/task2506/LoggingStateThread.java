package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    Thread thread;
    private Thread.State currentState;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        currentState = thread.getState();

    }

    @Override
    public void run() {
        System.out.println(currentState);
        while (true) {
            if (thread.getState() != currentState) {
                currentState = thread.getState();
                System.out.println(currentState);
            }
            if (currentState == State.TERMINATED) {
                break;
            }
        }
        interrupt();

    }


}
