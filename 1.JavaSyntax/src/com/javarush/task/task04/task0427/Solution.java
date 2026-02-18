package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chyslo = Integer.parseInt(reader.readLine());

        if(chyslo%2==0 && 0 < chyslo && chyslo <=9){
            System.out.println("четное однозначное число");
        }else if(chyslo%2!=0 && 0 < chyslo && chyslo <=9){
            System.out.println("нечетное однозначное число");
        }

        if(chyslo%2==0 && 9 < chyslo && chyslo <=99){
            System.out.println("четное двузначное число");
        }else if(chyslo%2!=0 && 9 < chyslo && chyslo <=99){
            System.out.println("нечетное двузначное число");
        }

        if(chyslo%2==0 && 99 < chyslo && chyslo <=999){
            System.out.println("четное трехзначное число");
        }else if(chyslo%2!=0 && 99 < chyslo && chyslo <=999){
            System.out.println("нечетное трехзначное число");
        }

    }
}
