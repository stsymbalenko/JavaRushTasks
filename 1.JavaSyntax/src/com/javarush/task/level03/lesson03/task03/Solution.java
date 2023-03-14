package com.javarush.task.level03.lesson03.task03;

/* 10 процентовРеализуйте метод addTenPercent,
который увеличивает переданное целое число на 10%.
Исправьте ошибку в сигнатуре метода.
Подсказка: подумайте, какие у этого метода входные и выходные данные.*/
public class Solution
{
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        return i+i*0.1;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(10));
    }
}
/*Объяснение : По условию задачи сначала меняем сигнатуру метода,
        исправляем void
        на double. Потом в самом коде метода по условию задачи прибавляем 10%.*/
