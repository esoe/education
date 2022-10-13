package ru.molokoin;

public class Country extends Area{
    private Area capital;

    public Country() {
    }
    Country(String name, int population, int square){
        //this(name, population, square, null, null, null);
        //TODO исключить дублирование метода Area.init()
        this.init(name, population, square);
    }
    Country(String name, int population, int square, String capitalName, int capitalPopulation, int capitalSquare){
        //параметры страны
        this.init(name
        , population
        , square);
        //параметры столицы
        if (capitalName != null)
        setCapital(new Area(capitalName
        , capitalPopulation
        , capitalSquare));
    }
    public static void print(Country country){
        System.out.println("-------------------------------------------");
        Area a = (Country) country;
        a.print();
        country.getCapital().print();
        System.out.println("-------------------------------------------");

    }

    /**
     * @param сapital the сapital to set
     */
    public void setCapital(Area capital) {
        this.capital = capital;
    }

    /**
     * @return the сapital
     */
    public Area getCapital() {
        return capital;
    }
}
