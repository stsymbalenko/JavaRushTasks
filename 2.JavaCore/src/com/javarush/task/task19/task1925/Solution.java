package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader intfile = new FileReader(args[0]);
        FileWriter outfile = new FileWriter(args[1]);

        BufferedReader reader = new BufferedReader(intfile);

        String list;
        String list2 = "";
        String[] stroka;

        while((list = reader.readLine()) !=null){
            stroka = list.split(" ");

            for(String str : stroka){
                if (str.length()>6){
                    list2 += str + ",";

                }

            }
        }

        intfile.close();

        outfile.write(list2.substring(0, list2.length()-1));
        outfile.close();
        reader.close();     

    }
}