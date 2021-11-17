package com.javarush.task.task21.task2113;

public class Horse {
    String name;
    double speed;
    double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }



    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

   public void move(){
       distance += speed*Math.random();
    }

   public void print(){
        String dot = "";
        for(int n=0; n < Math.floor(distance); n++){
            dot = dot + ".";
        }
       System.out.println(dot + name);

    }
}
