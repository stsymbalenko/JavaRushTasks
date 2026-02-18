package com.javarush.test.level14.lesson06.home01;
//import com.javarush.test.level14.lesson06.home01.Hen;

/**
 * Created by s.tsymbalenko on 17.08.2016.
 */
public class BelarusianHen extends Hen {


    public int getCountOfEggsPerMonth(){

        return  30;
    }

    public String getDescription(){
       String s = " Моя страна - "  + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return super.getDescription() + s;
    }
}
