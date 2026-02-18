package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        String dayWeek;
        if(day==1){
            dayWeek = "понедельник";
        }else if(day ==2){
            dayWeek = "вторник";
        }else if(day ==3) {
            dayWeek = "среда";
        }else if(day ==4) {
            dayWeek = "четверг";
        }else if(day ==5) {
            dayWeek = "пятница";
        }else if(day ==6) {
            dayWeek = "суббота";
        }else if(day==7){
            dayWeek = "воскресенье";
        }else{
            dayWeek = "такого дня недели не существует";
        }
        System.out.println(dayWeek);
    }
}