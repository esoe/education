package ru.molokoin;

public class Country extends Area{
    private Area capital;

    public Country() {
    }
    Country(String name, int population, int square, String capitalName, int capitalPopulation, int capitalSquare){
        this.init(name, population, square);
        setCapital(new Area(capitalName, capitalPopulation, capitalSquare));
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
