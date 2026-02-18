package com.javarush.test.level15.lesson12.home05;

/**
 * Created by s.tsymbalenko on 03.10.2016.
 */
public class SubSolution extends Solution {

    public SubSolution() {
        super();
    }

    public SubSolution(int i, short sh) {
        super(i, sh);
    }

    public SubSolution(String s, short sh) {
        super(s, sh);
    }

    private SubSolution(String s, int i){

    }
    private SubSolution(Object ob){

    }
    private SubSolution (int i){

    }


    protected SubSolution(Integer in) {
        super(in);
    }

    protected SubSolution(Integer in, String s) {
        super(in, s);
    }

    protected SubSolution(Integer in, short sh) {
        super(in, sh);
    }

    SubSolution(String s, boolean b) {
        super(s, b);
    }

    SubSolution(Integer in, boolean b) {
        super(in, b);
    }

    SubSolution(int i, boolean b) {
        super(i, b);
    }
}
