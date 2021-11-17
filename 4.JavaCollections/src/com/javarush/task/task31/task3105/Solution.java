package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String zipFileName = args[1];
        File file = new File(fileName);

        Map<String, ByteArrayOutputStream> archivedFiles = new HashMap<>();
        try (ZipInputStream zipReader = new ZipInputStream(new FileInputStream(zipFileName))) {
            ZipEntry entry;
            while ((entry = zipReader.getNextEntry()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int count = 0;
                while ((count = zipReader.read(buffer)) != -1)
                    byteArrayOutputStream.write(buffer, 0, count);

                archivedFiles.put(entry.getName(), byteArrayOutputStream);
            }
        }

        try (ZipOutputStream zipWriter = new ZipOutputStream(new FileOutputStream(zipFileName))) {
            for (Map.Entry<String, ByteArrayOutputStream> pair : archivedFiles.entrySet()) {
                if (pair.getKey().substring(pair.getKey().lastIndexOf("/") + 1).equals(file.getName())) continue;
                zipWriter.putNextEntry(new ZipEntry(pair.getKey()));
                zipWriter.write(pair.getValue().toByteArray());
            }

            ZipEntry zipEntry = new ZipEntry("new/" + file.getName());
            zipWriter.putNextEntry(zipEntry);
            Files.copy(file.toPath(), zipWriter);
        }
    }
}

//Варіант працює, але не приймає валідатор
/*
public class Solution {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        HashMap<ZipEntry, byte[]> listEntry = new HashMap<>();

        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(args[1]));
        ZipEntry entry;
        while ((entry = zipIn.getNextEntry()) != null) {
            System.out.println(entry.getSize());
            byte[] buff = new byte[(int) entry.getSize()];
            zipIn.read(buff);
            listEntry.put(entry, buff);
        }
        zipIn.close();

        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(args[1])))
        {
            boolean files = false;

            ZipEntry remEnt = null;
            for (ZipEntry zipEntr : listEntry.keySet()) {
                if (zipEntr.getName().equals(file.getName())) {
                    remEnt = zipEntr;
                    files = true;
                }
            }
            listEntry.remove(remEnt);

            if (files) {
                zipOut.putNextEntry(new ZipEntry(file.getName()));
                Files.copy(file.toPath(), zipOut);
            } else {

                zipOut.putNextEntry(new ZipEntry("new/" + file.getName()));
                Files.copy(file.toPath(), zipOut);
            }

            for (ZipEntry entry1 : listEntry.keySet()) {
                byte[] buffOut = new byte[listEntry.values().size()];
                buffOut = listEntry.get(entry1);
                zipOut.putNextEntry(entry1);
                zipOut.write(buffOut);

            }
            zipOut.closeEntry();
            zipOut.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}*/
