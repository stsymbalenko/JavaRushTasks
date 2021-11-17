package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty())
            throw new TooShortStringException();

        String[] strs = string.split("\t");
        if (strs.length<3)
            throw new TooShortStringException();

        return strs[1];
    //Правильно відпрацьовує, валідатор не приймає
        /*int [] indexs = new int[string.length()];
        int index = 0;
        int i = 0;
        while(string.indexOf("\t", index) != -1){
            indexs[i] = string.indexOf("\t", index);
            index = indexs[i]+1;
            i++;
        }
        if(i<2){
            throw new TooShortStringException();
        }
        return string.substring(indexs[0], indexs[1]);*/
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
