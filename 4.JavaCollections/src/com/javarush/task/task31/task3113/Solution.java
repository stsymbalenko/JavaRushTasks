package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/*
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path path = Paths.get(reader.readLine());

        if (Files.isDirectory(path)){

            long file = Files.walk(path).filter((s) -> !Files.isDirectory(s)).count();
            long folder = Files.walk(path).filter((s) -> Files.isDirectory(s)).count();


            System.out.println("Всего папок - " + (folder-1));
            System.out.println("Всего файлов - " + file);
            System.out.println("Общий размер - " + getSize(path));
        }else{
            System.out.println(path.toAbsolutePath() + " - не папка");
        }

    }


    static long getSize(Path startPath) throws IOException {
        final AtomicLong size = new AtomicLong(0);

        Files.walkFileTree(startPath, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file,
                                             BasicFileAttributes attrs) throws IOException {
                size.addAndGet(attrs.size());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc)
                    throws IOException {
                System.out.println("skipped: " + file + "e=" + exc);
                return FileVisitResult.CONTINUE;
            }
        });

        return size.get();
    }

}
