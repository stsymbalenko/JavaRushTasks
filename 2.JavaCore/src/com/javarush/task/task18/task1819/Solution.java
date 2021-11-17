package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream input1 = new FileInputStream(file1);
        FileInputStream input2 = new FileInputStream(file2);

        byte[] buffer = new byte[input1.available()];
        input1.read(buffer, 0, input1.available());


        FileOutputStream output1 = new FileOutputStream(file1);

        output1.write((new String()).getBytes());

        while (input2.available() > 0){
            output1.write(input2.read());
        }

        output1.write(buffer, 0, buffer.length);



        input1.close();
        input2.close();
        output1.close();

    }
}
