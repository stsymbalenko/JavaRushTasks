package com.javarush.test.level14.lesson06.home01;
//import com.javarush.test.level14.lesson06.home01.Solution.Hen;

/**
 * Created by s.tsymbalenko on 17.08.2016.
 */
public class MoldovanHen extends Hen {



    public int getCountOfEggsPerMonth(){

        return 20;
    }

    String getDescription(){
        String s = " Моя страна - "  + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return super.getDescription() + s;
    }
}
