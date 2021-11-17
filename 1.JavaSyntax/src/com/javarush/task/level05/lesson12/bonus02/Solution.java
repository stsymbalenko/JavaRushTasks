package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int g = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, g);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int g)
    {
        if (a < b && a < c && a < d && a < g)
        {
            return a;
        }else if (b < c && b < d && b < g && b < a){
            return b;
        }else if (c < d && c < g && c < a && c < b){
            return c;
        }else if (d < g && d < a && d < b && d < c){
            return d;
        }else if (g < a && g < b && g < c && g < d);{
                    return g;
                }
    }

}
