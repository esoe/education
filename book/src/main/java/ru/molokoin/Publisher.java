package ru.molokoin;

public class Publisher {
    private String name;
    private String sity;
    Publisher(){
        this(null, null);
    }

    Publisher(String name, String sity){
        setName(name);
        setSity(sity);
    }
    //выводим в консоль данные Издательства
    public void print(){
        System.out.println("Издательство: " + getName()  + " ----> " + "город: " + getSity());
    }
    /**
     * Метод класса. Возвращает массив данных об издательствах по умолчанию
     * @return
     */
    public static Publisher[] getDefaults(){
        Publisher[] defaultPublishers = new Publisher[4];
        defaultPublishers[0] = new Publisher("Проспект", "Москва");
        defaultPublishers[1] = new Publisher("Питер", "Санкт-Петербург");
        defaultPublishers[2] = new Publisher("БХВ", "Санкт-Петербург");
        defaultPublishers[3] = new Publisher("Диалектика", "Киев");
        return defaultPublishers;
    }
    /**
     * @param name the name to set
     * DONE: имя издательства не олжно быть пустой ссылкой
     */
    public void setName(String name) {
        String defaultName = "noname publisher";
        try {
            if (name == null) throw new NullPointerException("Имя издательства не задано пользователем. Установлено значение поля по умолчанию {noname publisher} ...");
        }catch (NullPointerException e){
            setName(defaultName);
        }finally {
            this.name = name;
        }
    }
    /**
     * @param sity the sity to set
     * TODO: Наименование города издания не должно быть пустой ссылкой
     */
    public void setSity(String sity) {
        String defaultSity = "noname sity";
        try {
            if (sity == null) throw new NullPointerException("Наименование города не задано пользователем. Установлено значение поля по умолчанию {noname sity} ...");
        } catch (Exception e) {
            setSity(defaultSity);
        }finally{
            this.sity = sity;
        }
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
    public static void main(String[] args) {
        Publisher[] publishers = Publisher.getDefaults();
        int i = 0;
        while (i < publishers.length){
            publishers[i].print();
            i++;
        }
    }
    
}
