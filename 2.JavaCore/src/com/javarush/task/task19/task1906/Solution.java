package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = reader.readLine();
        String fileOut = reader.readLine();
        reader.close();

        FileReader input = new FileReader(fileIn);
        FileWriter output = new FileWriter(fileOut);
        int c;
        int i = 1;
        while((c=input.read())!=-1){


            if((i%2)==0){
               output.write(c);
            }
            i++;
        }

        input.close();
        output.close();


    }
}
