package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.*;

/*
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File path=new File(args[0]);
        File fileFist =new File(args[1]);

        File resultFileAbsolutePath=new File(path + "/" + fileFist.getName());
        File allFilesContent=new File(path + "/" + "allFilesContent.txt");

        FileUtils.renameFile(resultFileAbsolutePath,allFilesContent);

        FileOutputStream fileOutputStream=new FileOutputStream(allFilesContent);
        fileOutputStream.close();

        ArrayList<File>result= vozFile(path);

        result.sort(Comparator.comparing(File::getName));


        fileOutputStream=new FileOutputStream(allFilesContent);

            for (File file:result)
            {
                FileInputStream inputStream=new FileInputStream(file);

                    while(inputStream.available()>0 && !file.getName().equals("allFilesContent.txt"))
                    {
                        fileOutputStream.write(inputStream.read());
                    }
                    byte[]bytes=System.lineSeparator().getBytes();
                    fileOutputStream.write(bytes);
                    inputStream.close();

            }
            fileOutputStream.close();



    }
    public  static ArrayList<File> vozFile(File path)
    {
        ArrayList<File>result=new ArrayList<>();
        for (File file: Objects.requireNonNull(path.listFiles()))
        {
            if (file.isFile()&&file.length()<=50)
            {
                result.add(file);
            }
            if (file.isDirectory())
            {
                ArrayList<File>result1= vozFile(file);
                result.addAll(result1);
            }
        }
        return result;
    }
}
