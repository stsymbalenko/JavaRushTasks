package com.javarush.task.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {

        int suma = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;

        while ((s = Integer.parseInt(reader.readLine())) != -1 )
          suma += s;

        System.out.print(suma-1);

    }
}
