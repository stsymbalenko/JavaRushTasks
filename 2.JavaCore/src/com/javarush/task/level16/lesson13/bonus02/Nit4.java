package com.javarush.test.level16.lesson13.bonus02;

/**
 * Created by s.tsymbalenko on 25.11.2016.
 */
public class Nit4 extends Thread implements Message {
    public void run(){
        while (!isInterrupted()){
        }

    }

    @Override
    public void showWarning() {

        try{
            this.interrupt();
            this.join();

        } catch (InterruptedException e){}
    }
}
