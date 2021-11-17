package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[0]);
        int symv = 0;
        int prob = 0;

        while(input.available() > 0){
           int str = input.read();
            symv++;

            if(str == 32){
                prob++;
            }

        }
        input.close();

        double res = (double) prob / symv*100;
        int i = (int) Math.round(res*100);
        System.out.println(i);
        res = (double)i / 100;
        System.out.print(res);
    }
}
