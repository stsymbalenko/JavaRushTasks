package com.javarush.task.level02.lesson05.task03;

/* У каждого животного должна быть хозяйка.
Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвойте каждому животному владельца (owner).
*/
public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Woman Masha = new Woman();
        Cat cat = new Cat();
        cat.owner = Masha;
        Dog dog = new Dog();
        dog.owner = Masha;
        Fish fish = new Fish();
        fish.owner = Masha;
    }

    public static class Cat
    {
        public Woman owner;
    }

    public static class Dog
    {
        public Woman owner;
    }

    public static class Fish
    {
        public Woman owner;
    }

    public static class Woman
    {
    }
}

/*
Объяснение : По условиям задачи каждому новому объекту (кроме женщины) нужно присвоить (указать) хазяина. Первым делом создаем новый объект женщина :
        Woman Masha = new Woman();
        Потом создаем нужные объекты :
        Cat cat = new Cat();
        Так создали новый объект кот. Потом  указываем владельцем вновь созданного объекта кота созданную выше женщину Машу:
        cat.owner = Masha;
        По аналогии создаем собаку и рыбку.*/
