package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private  List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

   public void run(){
        for(int i = 1; i <= 100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move(){
        horses.get(0).move();
        horses.get(1).move();
        horses.get(2).move();
    }

    public void print(){
        for(Horse hors : horses){
            hors.print();
        }

        for(int n =0; n<10; n++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        if(Math.floor(horses.get(0).distance) < Math.floor(horses.get(1).distance) && Math.floor(horses.get(1).distance) > Math.floor(horses.get(2).distance)){
            return horses.get(1);
        }else if (Math.floor(horses.get(1).distance) < Math.floor(horses.get(2).distance) && Math.floor(horses.get(0).distance) < Math.floor(horses.get(2).distance)){
            return horses.get(2);
        }else return horses.get(0);

    }
    public void printWinner() {
        System.out.println("Winner is " + getWinner().name + "!");
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        Horse horse1 = new Horse("Mustang", 3,0);
        Horse horse2 = new Horse("Storm", 3,0);
        Horse horse3 = new Horse("Arrow", 3,0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);

        game.run();
        game.printWinner();


    }
}
