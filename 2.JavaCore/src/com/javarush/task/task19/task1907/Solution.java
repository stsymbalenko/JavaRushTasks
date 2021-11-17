package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        int wordCount = 0;

        Pattern p = Pattern.compile("\\bworld\\b", Pattern.CASE_INSENSITIVE);

        while (fileReader.ready()) {
            Matcher m = p.matcher(fileReader.readLine());

            while (m.find()) {
                wordCount++;
            }
        }

        fileReader.close();
        System.out.println(wordCount);

    }
}
