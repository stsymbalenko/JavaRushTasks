package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(outputFile));
        String s;


        while ((s = fileReader.readLine()) != null) {
            fileWrite.write(s.replaceAll("\\W", ""));
        }
        fileReader.close();
        fileWrite.close();
    }
}
