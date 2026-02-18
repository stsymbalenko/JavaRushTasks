package com.javarush.task.task25.task2502;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception{
            if (loadWheelNamesFromDB() == null | loadWheelNamesFromDB().length != 4) throw new Exception();
            this.wheels = new ArrayList<>();
            String[] str = loadWheelNamesFromDB();

            for(int i = 0; i<4; i++){
                wheels.add(Wheel.valueOf(str[i]));
            }

        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {

    }
}
