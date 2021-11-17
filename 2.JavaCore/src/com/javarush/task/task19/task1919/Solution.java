package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader fileReader2 = new BufferedReader(fileReader);
        TreeMap<String, Double> data = new TreeMap<>();

        String s;
        Double i2;
        String[] symbols;

        while ((s = fileReader2.readLine()) != null) {
            symbols = s.split(" ");
            if (data.containsKey(symbols[0]))
            {
                i2 = data.get(symbols[0]);
                data.put(symbols[0], Double.parseDouble(symbols[1]) + i2);
            } else {
                data.put(symbols[0], Double.parseDouble(symbols[1]));
            }
        }

        fileReader.close();


        for (String key : data.keySet()) {
            System.out.println(key + " " + data.get(key));
        }

    }
}
