package com.javarush.task.task18.task1823;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String namefile = reader.readLine();

            if (namefile.contains("exit")) {
                break;
            }
            ReadThread rt = new ReadThread(namefile);
            rt.start();

        }
    }

    public static class ReadThread extends Thread {
        private final String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        public void run()
        {
            ArrayList<Integer> ch = new ArrayList<>();
            FileInputStream input = null;
            try {
                input = new FileInputStream(fileName);

            int sum = 0;

            while(input.available() > 0){
                ch.add(input.read());

              }

                input.close();
             } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }



            int max = 0;
            int strmax = 0;
            for( int i = 0; i < ch.size(); i++){
                int sum = 0;
                int str0 = ch.get(i);

                for (int str : ch){
                    if (str == str0){
                    sum++;
                    }

                    if (max < sum){
                        max = sum;
                        strmax = str0;
                    }
                }
            }
            resultMap.put(fileName, strmax);

        }

    }
}
