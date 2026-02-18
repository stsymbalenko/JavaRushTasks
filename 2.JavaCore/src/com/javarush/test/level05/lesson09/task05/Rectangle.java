package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int priamokut;
    public Rectangle(int left, int top, int width, int height){
        this.priamokut = left + top + width +left;
    }
    public Rectangle(int left, int top){
        this.priamokut = left + top;
    }
    public Rectangle(int width){
        this.priamokut = width;
    }
    public Rectangle(Rectangle rec){
        this.priamokut = rec.priamokut;
    }

}
