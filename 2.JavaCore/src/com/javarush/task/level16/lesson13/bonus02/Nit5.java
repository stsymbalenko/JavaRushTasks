package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by s.tsymbalenko on 25.11.2016.
 */
public class Nit5 extends Thread {
    public void run(){
        int sum = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (!isInterrupted()) {

                String str = reader.readLine();
                if (str.equals("N")) {
                    this.interrupt();
                } else {
                    sum += Integer.parseInt(str);
                }
            }
            System.out.println(sum);
        }
        catch (IOException e) {

            }

    }

}
