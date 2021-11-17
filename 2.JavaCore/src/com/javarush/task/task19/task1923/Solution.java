package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        FileWriter fileWrite = new FileWriter(args[1]);

        BufferedReader reader = new BufferedReader(fileReader);

        String list;
        String[] stroka;

        Pattern p = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);


        while((list = reader.readLine()) !=null){
            stroka = list.split(" ");

            for(String str : stroka){
                Matcher m = p.matcher(str);
                if (m.find()){
                    fileWrite.write(str);
                    fileWrite.write(" ");
                }
            }

        }
        fileReader.close();
        fileWrite.close();

    }
}
