package com.javarush.task.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        Integer[] array = new Integer[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array, Collections.reverseOrder());
        for (int i=0; i<array.length; i++)         {
        System.out.println(array[i]);
    }


    }
}

//Объяснение : лучше всего решать с помощью массивов и метода sort. В курсе иногда дают задания на опережение. Collections.reverseOrder() дает возможность сортировать по убыванию.