package ru.molokoin;

import java.lang.annotation.Annotation;

public class AnnotationReseacher {
    public static File getFile(Storage storage){
        Annotation fileAnnotation = storage
            .getClass()
            .getAnnotation(File.class);
        File file = (File)fileAnnotation;
        return file;
    }
    public static void print(Storage storage){
        Annotation fileAnnotation = storage
            .getClass()
            .getAnnotation(File.class);
        File file = (File)fileAnnotation;
        System.out.println(file.name());
        System.out.println(file.extension());
        System.out.println(file.size());
    }
    public static void main(String[] args) {
        
        
    }
}
