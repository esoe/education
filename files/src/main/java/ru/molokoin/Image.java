package ru.molokoin;

public class Image extends File{
    private String format;
    private Dimensions dimensions;

    public Image(String name, byte size, Extension extension, String format, Dimensions dimensions) {
        super(name, size, extension);
        init(format, dimensions);
    }
    public void print(){
        super.print();
        System.out.println("format: " + getFormat());
        System.out.println("Dimensions: " + getDimensions().getHeight() + " x " + getDimensions().getWidth());
        System.out.println("--------------------------------------------");
        
    }
    public void init(String format, Dimensions dimensions){
        setFormat(format);
        setDimensions(dimensions);
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
    public String getFormat() {
        return format;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    
}
