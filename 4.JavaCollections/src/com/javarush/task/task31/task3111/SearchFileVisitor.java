package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;

    boolean minSizeCheck = false;
    boolean maxSizeCheck = false;
    boolean partOfNameCheck = false;
    boolean partOfContentCheck = false;

    private List<Path> foundFiles = new ArrayList<>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
        this.partOfNameCheck = true;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
        this.partOfContentCheck = true;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
        this.minSizeCheck = true;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        this.maxSizeCheck = true;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        boolean containsName = false;
        if(partOfName!=null && file.getFileName().toString().contains(partOfName)) {
            containsName = true;
        }
        String str = new String(Files.readAllBytes(file));
        boolean containsContent = false;
        if(partOfContent!=null && str.contains(partOfContent)) {
            containsContent = true;
        }

        boolean containsMinSize = false;
        if(content.length >= minSize) {
            containsMinSize = true;
        }

        boolean containsMaxSize = false;
        if(content.length <= maxSize) {
            containsMaxSize = true;
        }

        if(partOfNameCheck && partOfContentCheck && minSizeCheck && maxSizeCheck){
            if(containsName && containsContent && containsMinSize && containsMaxSize) {
                foundFiles.add(file);

            }
        }
        if(partOfNameCheck && partOfContentCheck && minSizeCheck && !maxSizeCheck) {
            if (containsName && containsContent && containsMinSize) {
                foundFiles.add(file);

            }
        }
        if(partOfNameCheck && partOfContentCheck && !minSizeCheck && maxSizeCheck) {
                if (containsName && containsContent && containsMaxSize) {
                    foundFiles.add(file);

                }
        }
            if(partOfNameCheck && !partOfContentCheck && minSizeCheck&& maxSizeCheck){
                if (containsName && containsMinSize && containsMaxSize) {
                    foundFiles.add(file);

                }
            }
            if(!partOfNameCheck && partOfContentCheck && minSizeCheck&& maxSizeCheck){
                if (containsContent && containsMinSize && containsMaxSize) {
                    foundFiles.add(file);

                }
            }

        if(!partOfNameCheck && !partOfContentCheck && minSizeCheck && maxSizeCheck){
            if(containsMinSize && containsMaxSize) {
                foundFiles.add(file);

            }
        }

        if(partOfNameCheck && partOfContentCheck && !minSizeCheck && !maxSizeCheck){
            if(containsName && containsContent) {
                foundFiles.add(file);

            }
        }
        if(partOfNameCheck && !partOfContentCheck && !minSizeCheck && maxSizeCheck){
            if(containsName && containsMaxSize) {
                foundFiles.add(file);

            }
        }
        if(partOfNameCheck && !partOfContentCheck && minSizeCheck && !maxSizeCheck){
            if(containsName && containsMinSize) {
                foundFiles.add(file);

             }
        }

        if(!partOfNameCheck && partOfContentCheck && !minSizeCheck && maxSizeCheck){
            if(containsContent && containsMaxSize) {
                foundFiles.add(file);

            }
        }
        if(!partOfNameCheck && partOfContentCheck && minSizeCheck && !maxSizeCheck) {
            if(containsContent && containsMinSize) {
                foundFiles.add(file);

            }
        }
        if(partOfNameCheck && !partOfContentCheck && !minSizeCheck && !maxSizeCheck){
            if(containsName) {
            foundFiles.add(file);

            }
        }
        if(!partOfNameCheck && partOfContentCheck && !minSizeCheck && !maxSizeCheck){
            if(containsContent) {
                foundFiles.add(file);

            }
        }
        if(!partOfNameCheck && !partOfContentCheck && minSizeCheck && !maxSizeCheck){
        if(containsMinSize) {
            foundFiles.add(file);

            }
        }
        if(!partOfNameCheck && !partOfContentCheck && !minSizeCheck && maxSizeCheck){
        if(containsMaxSize) {
            foundFiles.add(file);

            }
        }

        return super.visitFile(file, attrs);
    }
}
