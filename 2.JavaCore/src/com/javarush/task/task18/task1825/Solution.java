package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> nf = new ArrayList<>();
        String namefile = null;
        String nf0 = null;
        while(true){
            namefile = reader.readLine();

            if(namefile.contains("end")){
                break;
            }
            nf.add(namefile);

            if(!namefile.contains("end")){
                nf0 = namefile.substring(0,namefile.length()-6);
            }

        }

        reader.close();

        Collections.sort(nf);
        FileInputStream inputStream = null;
        FileOutputStream outputStream = new FileOutputStream(nf0);


        for (String file : nf) {
           inputStream  = new FileInputStream(file);
            byte[] buffer = new byte[inputStream.available()];
            while (inputStream.available() > 0)
            {
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }
            inputStream.close();
        }


        outputStream.close();

    }
}
