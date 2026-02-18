package com.javarush.test.level16.lesson13.bonus02;

/**
 * Created by s.tsymbalenko on 25.11.2016.
 */
public class Nit2 extends Thread {
    public void run(){
        try {

            while (!isInterrupted()){}

            throw new InterruptedException();

        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
