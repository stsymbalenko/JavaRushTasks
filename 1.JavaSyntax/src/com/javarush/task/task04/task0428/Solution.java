package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int ch1 = Integer.parseInt(reader.readLine());
        int ch2 = Integer.parseInt(reader.readLine());
        int ch3 = Integer.parseInt(reader.readLine());

        int count = 0;

        if (ch1>0){
            count++;
        }
        if ((ch2)>0){
            count++;
        }
        if ((ch3)>0){
            count++;
        }

        System.out.println(count);

    }
}
