package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String namefile = reader.readLine();
            FileInputStream input = null;
            try {
              input = new FileInputStream(namefile);
            }catch (FileNotFoundException e){
                System.out.print(namefile);

                break;

            }
            input.close();

        }
    }
}
