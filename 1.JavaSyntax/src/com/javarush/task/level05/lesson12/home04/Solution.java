package com.javarush.task.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

        Date d = new Date();
        SimpleDateFormat date = new SimpleDateFormat("dd MM yyyy");
        System.out.println(date.format(d));

    }
}
