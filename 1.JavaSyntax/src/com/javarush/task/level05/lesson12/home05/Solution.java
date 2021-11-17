package com.javarush.test.level05.lesson12.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int suma = 0;
        String exit = "сумма";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String vvod = reader.readLine();
            if (vvod.equals(exit))
            {
                System.out.print(suma);
                break;
            }else {
                int chislo = Integer.parseInt(vvod);
                suma = suma + chislo;
            }
        }
    }
}
