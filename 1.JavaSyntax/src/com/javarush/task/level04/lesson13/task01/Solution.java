package com.javarush.task.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int x = 2; x <= 100; x += 2)
        {
            System.out.println(x);
        }

    }
}
