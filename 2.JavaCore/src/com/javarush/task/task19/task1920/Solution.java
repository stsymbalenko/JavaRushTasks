package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(args[0]);
        BufferedReader fileReader2 = new BufferedReader(fileReader);
        TreeMap<String, Double> data = new TreeMap<>();


        String s;
        Double i2;
        String[] symbols;
        ArrayList<String> maxx = new ArrayList<>();

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


        String keymax = data.firstKey();
        double max = data.get(keymax);

        for (String key : data.keySet()) {
            double sc = data.get(key);
            if(max < sc){
                maxx.clear();
                max = sc;
                maxx.add(key);
            }else if(max == sc){
                max = sc;
                maxx.add(key);
            }
        }

        for(String v : maxx){
            System.out.println(v);
        }


    }
}
