package com.javarush.task.level02.lesson08.task03;

/* Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
Подсказка:
Нужно написать тело существующей функции min и исправить возвращаемое значение.
*/
public class Solution
{
    public static int min(int a, int b, int c)
    {
        //напишите тут ваш код
        int d;
        if ( a < b)
            d = a;
        else d = b;
        if ( d < c)
            return d;
        else
            return c;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(1,2,3) );
        System.out.println( min(-1,-2,-3) );
        System.out.println( min(3,5,3) );
        System.out.println( min(10,5,10) );
    }

}


/*
Объяснение : Сначала сравниваем первые два числа и среди них находим найменьшее.
        Потом найменьшее среди первых двух сравниваем с последним третим числом.*/
