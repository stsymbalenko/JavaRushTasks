package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String strL = "";
       for (String str: getTokens("level22.lesson13.task01", ".")){
               strL = strL + "\"" + str + "\", ";

       }
        System.out.println("{" + strL.trim().replaceFirst(",$", "") + "}");

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] listToket = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()){
            listToket[i] = st.nextToken();
            i++;
        }
        return listToket;
    }
}