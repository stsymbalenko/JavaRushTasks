package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[1];
        String fileOutputName = args[2];
        FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream = new FileOutputStream(fileOutputName);

        if(args[0].contains("-e")){


            byte[] byteFile = new byte[inputStream.available()];
            int len = inputStream.read(byteFile);

            for(int i = 0; i < len; i++)
            {
                byteFile[i]++;
            }

            outputStream.write(byteFile, 0, len);


        }else if(args[0].contains("-d")){


            byte[] byteFile = new byte[inputStream.available()];
            int len = inputStream.read(byteFile);

            for(int i = 0; i < len; i++)
            {
                byteFile[i]--;
            }

            outputStream.write(byteFile, 0, len);


        }


        inputStream.close();
        outputStream.close();

    }

}