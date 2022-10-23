package ru.molokoin;

import java.util.Arrays;

/**
 * Класс - хранилище информации обо всех файлах
 * предоставляет инструментарий обращения с массивом файлов
 */
public class Storage {
    private File[] files;
    public Storage(){}
    public Storage(File[] files){
        setFiles(files);
    }
    public void setFiles(File[] files) {
        this.files = files;
    }
    public File[] getFiles() {
        return files;
    }
    public void print(){
        int i = 0;
        while (i < getFiles().length){
            getFiles()[i].print();
            i++;
        }
    }
    public void add(File file) {
        if(getFiles() == null){
            File[] result = new File[1];
            result[0] = file;
            setFiles(result);
        }
        else{
            File[] result = Arrays.copyOf(getFiles(), getFiles().length+1);
            result[result.length - 1] = file;
            setFiles(result);
        }
    }
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.add(new Document("myDocument", (byte)10, Extension.DOCUMENT, "txt", 5));
        storage.add(new Image("myImage", (byte)15, Extension.IMAGE, "jpg", new Dimensions(12, 8)));
        storage.print();

    }

}
