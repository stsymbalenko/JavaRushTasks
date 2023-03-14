package com.javarush.task.level03.lesson08.task01;

/* Как захватить мирВвести с клавиатуры число и имя, вывести на экран строку:«имя» захватит мир через «число» лет. Му-ха-ха!Пример: Вася захватит мир через 8 лет. Му-ха-ха!
Последовательность вводимых данных имеет большое значение.*/
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader
        (new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        String a = reader.readLine();
        System.out.println(a + " захватит мир через " + i + " лет. Му-ха-ха!");

    }
}