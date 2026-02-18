package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        Arrays.sort(array);
        int median = (array.length%2 != 0) ? array[array.length/2] : (array[(array.length-1)/2] + array[array.length/2])/2;
        Comparator<Integer> madianComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) -((median-o1)+(median-o2));
            }};
        Arrays.sort(array, madianComparator);
        return array;
    }
}
