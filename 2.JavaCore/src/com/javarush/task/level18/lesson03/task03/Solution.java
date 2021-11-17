package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        ArrayList<Integer> list = new ArrayList();
        HashMap<Integer,Integer> povtory = new HashMap();

        FileInputStream input = new FileInputStream(filename);

        while (input.available() > 0){

            list.add(input.read());
        }

        int p = 0;
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if (list.get(i) == list.get(j)){
                    p++;
                }
            }

            if(p!=0){
                povtory.put(list.get(i),p);
            }
            p = 0;
        }

        int max = 0;

        for(int i : povtory.values()){

                if(max < i){
                    max = i;

                }

            }

        reader.close();
        input.close();

        for(Map.Entry entry : povtory.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.print(entry.getKey());
                System.out.print(" ");
            }
        }

    }
}
