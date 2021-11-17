package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[0]);
        int sum = 0;

        char[] m = new char[52];
        for (int i=0; i< 26; i++) {
            m[i] = (char)('a' + i);
            int i2 = i + 26;
            m[i2] = (char)('A' + i);

        }


        while(input.available() > 0){
            int f = input.read();
            for (char i : m) {
                if ( f == i) {

                    sum++;
                }
            }
        }

        input.close();
        System.out.print(sum);
    }


}
