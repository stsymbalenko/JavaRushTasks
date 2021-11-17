package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        reader.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();


        String sub;
        while ((sub = br.readLine()) != null) {
            stringBuilder.append(sub);
            stringBuilder.append(" ");
        }
        br.close();

        String[] strings = stringBuilder.toString().split(" ");
        for(int i = 0; i < strings.length; i++){
            for(int j = i+1; j<strings.length; j++){
                if (strings[i]!=null & strings[j]!=null) {
                    StringBuilder sbb = new StringBuilder(strings[j]);
                    if (strings[i].equals(sbb.reverse().toString())) {
                        Pair pers = new Pair();
                        pers.first = strings[j];
                        pers.second = strings[i];

                        //if (!result.contains(pers))
                        result.add(pers);
                        strings[j] = null;
                        strings[i] = null;
                    }
                }
            }

        }

        for (Pair p : result) {
            System.out.println(p.first + " " + p.second);
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
