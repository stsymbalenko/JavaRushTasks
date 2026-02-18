package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine())%5;


            if (t >= 0 && t < 3) {
                System.out.println("зелёный");
            } else if (t >= 3 && t < 4) {
                System.out.println("жёлтый");
            } else if (t >= 4 && t < 5) {
                System.out.println("красный");
            }

    }
}