package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int krug = Integer.parseInt(null);
    public void initialize(int centerX, int centerY, int radius){
        this.krug = centerX + centerY + radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width){
        this.krug = centerX + centerY + radius + width;
    }
    public void initialize(int centerX,int centerY, int radius, int width, int color){
        this.krug = centerX + centerY + radius + width + color;
    }

}
