package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty()){
            throw new TooShortStringException();}

        String[] strs = string.split(" ");

        if (strs.length<5)
            throw new TooShortStringException();

        return strs[1] + " " + strs[2] + " " + strs[3] + " " + strs[4];
    }
    //Робочий варіант, але валідатор не приймає
        /*String str = "";
        for (int i = 1; i < 5; i++){
            str = str+strs[i] + " ";
        }
        if (strs.length<5)
            throw new TooShortStringException();

        return str.trim();
       }*/

    public static class TooShortStringException extends RuntimeException{
    }
}