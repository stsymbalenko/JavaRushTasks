package com.javarush.task.task31.task3112;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method

        URL url = new URL(urlString);
        Path fileUrl = Paths.get(url.getFile());
        InputStream input = url.openStream();
        Path path = downloadDirectory;
        Path pathFull = Paths.get(path.toString() + "/" + fileUrl.getFileName());
        Path tempFile = Files.createTempFile("temp", ".tmp");
        Files.copy(input, tempFile, StandardCopyOption.REPLACE_EXISTING);
        Files.move(tempFile, pathFull, StandardCopyOption.REPLACE_EXISTING);
        return pathFull;
    }
}
