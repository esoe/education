package ru.molokoin;

import java.sql.Time;

public enum Extension{
    DOCUMENT,
    IMAGE,
    AUDIO,
    VIDEO,
    OTHER;

    private String format;
    private int lists;
    private Dimensions dimensions;
    private String content;
    private Time lenght;

    protected void initDocument(String format, int lists){
        setFormat(format);
        setLists(lists);
    }
    protected void printDocument(){
        System.out.println("format: " + getFormat());
        System.out.println("lists: " + getLists());
    }

    protected void setFormat(String format) {
        this.format = format;
    }
    protected void setLists(int lists) {
        this.lists = lists;
    }
    protected void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
    protected void setContent(String content) {
        this.content = content;
    }
    protected void setLenght(Time lenght) {
        this.lenght = lenght;
    }
    protected String getFormat() {
        return format;
    }
    protected int getLists() {
        return lists;
    }
    protected Dimensions getDimensions() {
        return dimensions;
    }
    protected String getContent() {
        return content;
    }
    protected Time getLenght() {
        return lenght;
    }
}
