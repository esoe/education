package ru.molokoin;

/**
 * Класс - обертка
 * 
 */
public class File {
    private String name;
    private byte size;
    private Extension extension;
    public File(String name, byte size, Extension extension){
        setName(name);
        setSize(size);
        setExtension(extension);
    }
    public void print(){
        System.out.println("name: " + getName());
        System.out.println("size: " + (byte) getSize());
        System.out.println("extension: " + extension);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSize(byte size) {
        this.size = size;
    }
    public void setExtension(Extension extension) {
        this.extension = extension;
    }
    public String getName() {
        return name;
    }
    public byte getSize() {
        return size;
    }
    public Extension getExtension() {
        return extension;
    }
}
