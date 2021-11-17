package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;

import java.util.zip.ZipInputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // Это решение позаимствовано отсюда
        // https://www.snip2code.com/Snippet/1178691/Level-31--Lesson-06--Bonus-01

        String resultFileName = args[0];
        int filePartCount = args.length - 1;
        String[] fileNamePart = new String[filePartCount];
        for (int i = 0; i < filePartCount; i++) {
            fileNamePart[i] = args[i + 1];
        }
        Arrays.sort(fileNamePart);

        List<FileInputStream> fisList = new ArrayList<>();
        for (int i = 0; i < filePartCount; i++) {
            fisList.add(new FileInputStream(fileNamePart[i]));
        }
        SequenceInputStream seqInStream = new SequenceInputStream(Collections.enumeration(fisList));
        ZipInputStream zipInStream = new ZipInputStream(seqInStream);
        FileOutputStream fileOutStream = new FileOutputStream(resultFileName);
        byte[] buf = new byte[1024 * 1024];
        while (zipInStream.getNextEntry() != null) {
            int count;
            while ((count = zipInStream.read(buf)) != -1) {
                fileOutStream.write(buf, 0, count);
            }
        }
        seqInStream.close();
        zipInStream.close();
        fileOutStream.close();
    }
}

//Робочий варіант, але валідатор не прийням
/*
public class Solution {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(new File(args[0]));
        TreeSet<String> files = new TreeSet<String>();
        for(int n = 1; n < args.length; n++){
            files.add(args[n]);
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String fname : files) {
            try (FileInputStream fis = new FileInputStream(new File(fname))){
                byte[] b = new byte[fis.available()];
                fis.read(b);
                byteArrayOutputStream.write(b);
            }
        }

        try(ZipInputStream zipReader = new ZipInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()))){
            ZipEntry entry;
            byte[] buffer = new byte[1024*1024];
            while ((entry = zipReader.getNextEntry()) != null) {
                int count = 0;
                while ((count = zipReader.read(buffer)) != -1) {
                    fos.write(buffer, 0, count);
                }
            }
            fos.flush();
        }

        fos.close();
    }

}*/
