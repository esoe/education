package ru.molokoin;

public class Publisher {
    private String name;
    private String sity;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        //не должно быть пустой ссылкой
        this.name = name;
    }
    /**
     * @param sity the sity to set
     */
    public void setSity(String sity) {
        //не должно быть пустой ссылкой
        this.sity = sity;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the sity
     */
    public String getSity() {
        return sity;
    }
    
}
