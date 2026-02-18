package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ch1 = Integer.parseInt(reader.readLine());
        int ch2 = Integer.parseInt(reader.readLine());
        int ch3 = Integer.parseInt(reader.readLine());

        int a = 0;
        int b = 0;

        if(ch1>0){
            b++;
        }else if(ch1<0){
            a++;
        }

        if(ch2>0){
            b++;
        }else if(ch2<0){
            a++;
        }

        if(ch3>0){
            b++;
        }else if(ch3<0){
            a++;
        }

        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);

    }
}
