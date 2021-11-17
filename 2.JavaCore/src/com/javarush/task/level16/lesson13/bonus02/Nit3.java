package com.javarush.test.level16.lesson13.bonus02;

/**
 * Created by s.tsymbalenko on 25.11.2016.
 */
public class Nit3 extends Thread {
    public void run(){
        while(true){
            System.out.println("Ура");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
