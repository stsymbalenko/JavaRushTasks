package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();


        BufferedReader Freader = new BufferedReader(new FileReader(name));
        String list;
        String[] stroka;


        while ((list = Freader.readLine()) != null) {
            stroka = list.split(" ");
            int n = 0;

            for(String str : stroka){
                for(String st:words){
                    if(str.equals(st) == true){
                        n++;
                    }
                }
            }

            if (n == 2) {
                System.out.println(list);

            }

        }
        Freader.close();



    }
}