package com.javarush.task.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e;
        if (a > b)
            e =a;
        else
            e =b;
        if (e < c)
            e =c;
        if (e < d)
            e = d;
        System.out.println(e);

    }
}

//Объяснение : вводим временную переменную. Сравниваем первые два числа и этой переменной присваиваем найбольшее. Дальше сравниваем эту переменную с остальными двумя числами.