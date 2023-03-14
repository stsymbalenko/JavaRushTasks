package com.javarush.task.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String dog = null;
    public void initialize(String name){
        this.dog = name;
    }
    public  void  initialize(String name, int rost){
        this.dog = name + rost;
    }
    public  void initialize(String name, int rost, String color){
        this.dog = name + rost + color;
    }


}
