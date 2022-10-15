package ru.molokoin;

public class Book {
    private String name;
    private Publisher publisher;
    private int year;
    private String[] authors;
    private Publisher[] publishers = Publisher.getDefaultArray();

    Book(){}
    Book(String name, int year, Publisher publisher){}
    Book(String name, String author, int year, Publisher publisher){
        this(name, year, publisher);
        setAuthors(uppendAuthors((String)author));
    }
    Book(String name, String[] authors, int year, Publisher publisher){
        this(name, year, publisher);
        String[] a = (String[]) authors;
        setAuthors(a);
    }
    public static Book[] getDefaultArray(){
        Book[] books = new Book[2];

        //book 1
        String name = "Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных";
        books[0] = new Book();
        books[0].setName(name);
        books[0].uppendAuthors("Седжвик Роберт");
        books[0].uppendAuthors("Уэйн Кевин");
        books[0].setPublisher(Publisher.getPublisherByName(Publisher.getDefaultArray(), "Питер"));
        books[0].setYear(2018);

        //book 2
        name = "Разработка требований к программному обеспечению. 3-е издание, дополненное";
        books[1] = new Book();
        books[1].setName(name);
        books[1].uppendAuthors("Вигерс Карл");
        books[1].setPublisher(Publisher.getPublisherByName(Publisher.getDefaultArray(), "БХВ"));
        books[1].setYear(2019);

        return books;
    }
    public void print(){
        System.out.println("-------------------------------");
        System.out.println(toString());
        System.out.println("Наименование книги (name) :: " + name);
        getPublisher().print();
        System.out.println("Год издания (year) :: " + year);
        System.out.println("Авторы:");
        int i = 0;
        while (i < getAuthorsCount()){
            System.out.println((i + 1) + ". " + getAuthors()[i]);
            i++;
        }
        System.out.println("-------------------------------");
    }
    //TODO добавляем список авторов
    public String[] uppendAuthors(String author){
        String[] result;
        try {
            if (getAuthors() == null)throw new NullPointerException("Перечень авторов пока пуст ...");
        } catch (NullPointerException e) {
            e.printStackTrace();
            result = new String[1];
            result[0] = author;
        } finally {
            result = new String[getAuthorsCount() +1];
            int i = 0;
            while (i < getAuthorsCount()){
                result[i] = getAuthorByIndex(i);
                i++;
            }
        }
        return result;
    }
    public String getAuthorByIndex(int index){
        String author = getAuthors()[index];
        return author;
    }
    //количество авторов книги
    public int getAuthorsCount(){
        int count = 0;
        try {
            if (getAuthors() == null) throw new NullPointerException("авторы еще не добавлены в список ...");
        } catch (NullPointerException e) {
            count = 0;
        } finally {
            count = getAuthors().length;
        }
        return count;
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
        String[] result = new String[0];
        try {
            if (authors == null) throw new NullPointerException("Авторы еще не заносились в список ...");
        } catch (NullPointerException e) {
            // TODO: handle exception
            e.printStackTrace();
            result = new String[0];
        } finally {
            result = authors;
        }
        return result;
    }
    public static void main(String[] args) {
        Book[] books = Book.getDefaultArray();
        int i = 0;
        while (i < books.length){
            books[i].print();
            i++;
        }
    }

}
