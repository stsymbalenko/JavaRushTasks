package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;



public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fisreader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> listLine = new ArrayList<>();
        while (fisreader.ready()) {
            listLine.add(String.format("%s%n", fisreader.readLine()));
        }
        fisreader.close();

        String line;
        int i = 0;
        int currId;
        int id = Integer.parseInt(args[1]);


        if (args[0].equals("-u")) {

            while ((line = listLine.get(i)) != null) {
                currId = Integer.parseInt(listLine.get(i+1).substring(0, 8).trim());
                if (id == currId) {
                    listLine.set(i+1, String.format("%-8d%-30s%-8s%-4s", id, args[2], args[3], args[4]) + "\r\n");
                    break;
                }
                i++;
            }
            BufferedWriter foswriter = new BufferedWriter(new FileWriter(fileName));
            for (String s : listLine) {
                foswriter.write(s);
            }
            foswriter.close();
        }else if (args[0].equals("-d")) {

            while ((line = listLine.get(i)) != null) {
                currId = Integer.parseInt(listLine.get(i+1).substring(0, 8).trim());

                if (id == currId) {
                    listLine.remove(i+1);
                    break;
                }
                i++;
            }
            BufferedWriter foswriter = new BufferedWriter(new FileWriter(fileName));
            for (String s : listLine) {
                foswriter.write(s);
            }
            foswriter.close();
        }
    }
}