package ru.molokoin;

public class Book {
    private String name;
    private Publisher publisher;
    private int year;
    private String[] authors;
    Book(){}
    Book(Object name, Object year, Object publisher){}
    Book(Object name, Object author, Object year, Object publisher){
        this(name, year, publisher);
        setAuthors(uppendAuthors((String)author));
    }
    Book(Object name, Object[] authors, Object year, Object publisher){
        this(name, year, publisher);
        String[] a = (String[]) authors;
        setAuthors(a);
    }
    
    public String[] uppendAuthors(String author){
        String[] result;
        try {
            if (getAuthors() == null)throw new NullPointerException("Перечень авторов пока пуст ...");
        } catch (NullPointerException e) {
            e.printStackTrace();
            result = new String[1];
            result[0] = author;
            return result;
        }
        result = new String[getAuthorsCount() + 1];
        int i = 0;
        while (i < getAuthorsCount()){
            result[i] = getAuthorByIndex(i);
            i++;
        }
        result[getAuthorsCount()] = author;
        return result;
    }
    public String getAuthorByIndex(int index){
        String author = getAuthors()[index];
        return author;
    }
    //количество авторов книги
    public int getAuthorsCount(){
        //TODO проверить наличие массива - null
        return getAuthors().length;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        //TODO название книги не должно быть пустой ссылкой;
        this.name = name;
    }
    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(Publisher publisher) {
        //TODO издательство не должно быть пустой ссылкой;
        this.publisher = publisher;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        //TODO год издания должен быть строго больше нуля
        this.year = year;
    }
    /**
     * @param author the author to set
     */
    public void setAuthors(String[] authors) {
        //TODO массив не должен содержать пустых ссылок
        this.authors = authors;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the publisher
     */
    public Publisher getPublisher() {
        return publisher;
    }
    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    /**
     * @return the author
     */
    public String[] getAuthors() {
        return authors;
    }

}
