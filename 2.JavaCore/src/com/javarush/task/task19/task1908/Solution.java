package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
        String s;
        StringBuffer s2 = new StringBuffer();
        while ((s = fileReader.readLine()) != null) {
            s2.append(s + "\n") ;
        }
        fileReader.close();

        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(outputFile));

        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(s2.toString());
        while(matcher.find()) {
            s = matcher.group(0);
            if (s.replaceAll("\\D", "").length() == s.length()) {


                fileWrite.write(s+" ");



            }
        }
        fileWrite.close();




    }
}
