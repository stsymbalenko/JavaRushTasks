package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> parameters = new LinkedHashMap();
        parameters.put("name", "Ivanov");
        parameters.put("country", "Ukraine");
        parameters.put("city", null);
        parameters.put("age", "65");
        System.out.println(getQuery(parameters));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        if (params == null || params.isEmpty())
            return s.toString();

        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");

        }
        if (s.length() > 5)
            s.delete(s.toString().length()-5,s.toString().length());

        return s.toString();
    }
}