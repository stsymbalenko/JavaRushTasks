package com.javarush.test.level10.lesson11.home04;


/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        //char[] str = s.toCharArray();
        //System.out.println(s);
        for(int i = 0; i < 40; i++){

          String st = s.substring(i,s.length());
            System.out.println(st);

        }
        //напишите тут ваш код
    }



}
