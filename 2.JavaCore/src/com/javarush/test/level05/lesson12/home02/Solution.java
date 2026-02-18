package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Kolya", 21, "Kiev");
        Man man2 = new Man("Vasia", 34, "Sumy");

        Woman wom1 = new Woman("Olya", 23, "Kiev");
        Woman wom2 = new Woman("Nastya", 23, "Odesa");


        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        System.out.println(wom1.name + " " + wom1.age + " " + wom1.address);
        System.out.println(wom2.name + " " + wom2.age + " " + wom2.address);
    }

    public static class Man
    {
        private String name = null;
        private int age;
        private String address = null;
        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }


    }

    public static  class Woman
    {
        private String name = null;
        private int age;
        private String address = null;
        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
