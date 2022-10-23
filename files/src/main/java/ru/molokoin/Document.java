package ru.molokoin;

public class Document extends File{
    private String format;
    private int lists;

    /**
     * Базовый конструктор класса File
     * @param name
     * @param size
     * @param extension
     */
    public Document(String name, byte size, Extension extension) {
        super(name, size, extension);
        //TODO Auto-generated constructor stub
    }

    /**
     * Основной конструктор документа
     * @param name
     * @param size
     * @param extension
     * @param format
     * @param lists
     */
    public Document(String name, byte size, Extension extension,String format, int lists) {
        super(name, size, extension);
        init(format, lists);
    }

    /**
     * Инициируем атрибуты документа:
     * формат и количество страниц.
     * @param format
     * @param lists
     */
    public void init(String format, int lists){
        setFormat(format);
        setLists(lists);
    }
    public void print(){
        super.print();
        System.out.println("format: " + getFormat());
        System.out.println("lists: " + getLists());
        System.out.println("--------------------------------------------");
        
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getFormat() {
        return format;
    }
    public void setLists(int lists) {
        this.lists = lists;
    }
    public int getLists() {
        return lists;
    }
}
