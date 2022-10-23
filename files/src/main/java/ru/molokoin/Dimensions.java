package ru.molokoin;

public class Dimensions {
    int width;
    int height;
    Dimensions(int width, int height){
        setWidth(width);
        setHeight(height);
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
