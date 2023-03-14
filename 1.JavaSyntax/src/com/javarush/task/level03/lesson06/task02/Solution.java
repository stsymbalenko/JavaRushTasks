package com.javarush.task.level03.lesson06.task02;

/* Таблица умноженияВыведи на экран таблицу умножения 10 на 10 в следующем виде:1 2 3 …2 4 6 …3 6 9 ……*/
public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        for (int i=1; i <=10;i++)
        {
            for (int n=1; n <= 10; n++)
            {
                System.out.print(i * n + " ");
            }
            System.out.println();
        }

    }
}


//Объяснение : эту задачу лучше решать с помощью цыклов, хотя их еще и не изучали в этом курсе.