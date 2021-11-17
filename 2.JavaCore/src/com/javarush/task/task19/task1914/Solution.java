package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {


        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream= new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();

        System.setOut(consoleStream);



        String s2 = outputStream.toString();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(outputStream.toString());

        char[] ch = new char[2];
        int i = 0;
        String s22;
        while(matcher.find()) {
            s22 = matcher.group(0);

            if (s22.replaceAll("\\D", "").length() == s22.length()) {

                ch[i] = (char) Integer.parseInt(s22);
                i++;
            }
        }

        System.out.print(s2.replace("\r\n",""));

        if(s2.contains("+")){
            System.out.print(ch[0] + ch[1]);
        }else if (s2.contains("-")){
            System.out.print(ch[0] - ch[1]);
        }else if(s2.contains("*") ){
            System.out.print(ch[0] * ch[1]);
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

