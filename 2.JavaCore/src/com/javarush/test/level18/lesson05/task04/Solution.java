package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        ArrayList<Integer> list = new ArrayList<>();

        FileInputStream input = new FileInputStream(file1);
        FileOutputStream output = new FileOutputStream(file2);

        while(input.available()>0){
            list.add(input.read());
        }

        for(int i = list.size()-1; i >= 0; i--){
            output.write(list.get(i));
        }

        reader.close();
        input.close();
        output.close();

    }
}
