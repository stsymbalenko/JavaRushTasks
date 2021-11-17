package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String namefile = args[0];
        Map<Integer, Integer> arrayMap = new TreeMap<>();
        FileInputStream input = new FileInputStream(namefile);


        byte[] buffer = new byte[input.available()];
        input.read(buffer, 0, input.available());
        //String str = new String();


        for(int i=0; i < buffer.length; i++){
            int k = buffer[i];
            int n = 0;

            for (int m = 0; m < buffer.length; m++ ){
                if(k == buffer[m]){
                    n++;
                }
            }

            arrayMap.put(k, n);

        }
        input.close();

        Set set2 = arrayMap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();

            int ch = (int) me2.getKey();
            System.out.print((char)ch + " ");

            System.out.println(me2.getValue());

        }




    }
}
