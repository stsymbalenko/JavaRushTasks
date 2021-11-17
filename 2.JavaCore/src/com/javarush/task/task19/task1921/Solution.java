package com.javarush.task.task19.task1921;

import java.io.*;
import java.util.*;


/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String list = "";
        String[] stroka;

        while ((list = reader.readLine()) != null) {
            stroka = list.split(" ");
            String name = "";

            for(int i = stroka.length - 4; i >= 0; i--){
                name = stroka[i] + " " + name;
            }


            Calendar calendar = new GregorianCalendar(Integer.parseInt(stroka[stroka.length-1]), Integer.parseInt(stroka[stroka.length-2]) - 1, Integer.parseInt(stroka[stroka.length-3]));

            PEOPLE.add(new Person(name.trim(), calendar.getTime()));
        }
        reader.close();

    }
}