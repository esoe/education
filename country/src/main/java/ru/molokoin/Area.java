package ru.molokoin;

public class Area {
    private String name;
    private int population;
    private int square;

    Area(){
        //TODO сделать инициализацию полей как объектов и последующий каст в нужный тип
        //чтобы была возможность обрабатывать null поля
        //this(null,null,null);
        //Area (Object name, Object population, Object square){}

    }
    Area(Object name, int population, int square){
        init(name, population, square);
    }
    public void init(Object name, int population, int square){
        setName(name);
        setPopulation(population);
        setSquare(square);
    }
    public void print(){
        if (name != "") System.out.println("name: " + name);
        if (population > 0) System.out.println("population: " + population);
        if (square > 0) System.out.println("square: " + square);
    }
    /**
     * @param name the name to set
     */
    public void setName(Object name) {
        //преобразование Object
        try {
            if (name == null) throw new NullPointerException(getName());
        } catch (Exception e) {
            System.out.println("Наименвание не должно быть пустым. ");
            e.printStackTrace();
            this.name = "";
        }
        try {
            if((String)name == "")throw new IllegalArgumentException((String)name);
        } catch (IllegalArgumentException e) {
            System.out.println("Наименвание не должно быть пустым. ");
            e.printStackTrace();
            this.name = "";
        }
        if (name != null) this.name = (String)name;
    }
    /**
     * @param population the population to set
     */
    public void setPopulation(int population) {

        //население не может быть отрицательным
        if (population < 0) throw new IllegalArgumentException("Население не может быть отрицательным ...");
        this.population = population;
    }
    /**
     * @param square the square to set
     */
    public void setSquare(int square) {
        if (square < 0) throw new IllegalArgumentException("площадь не может быть отрицательной ...");
        this.square = square;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the population
     */
    public int getPopulation() {
        return population;
    }
    /**
     * @return the square
     */
    public int getSquare() {
        return square;
    }
}
