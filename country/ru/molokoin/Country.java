package country.ru.molokoin;

public class Country extends Area{
    private Area capital;

    Country(String name, int population, int square, String capitalName, int capitalPopulation, int capitalSquare){
        init(name, population, square, capitalName, capitalPopulation, capitalSquare);
    }
    public Country() {
    }
    public void init(String name, int population, int square, String capitalName, int capitalPopulation, int capitalSquare){
        setCapital(capitalName, capitalPopulation, capitalSquare);
        setName(name);
        setPopulation(population);
        setSquare(square);
    }

    
    /**
     * @param сapital the сapital to set
     */
    public void setCapital(String name, int population, int square) {
        this.capital = new Area(name, population, square);
    }

    /**
     * @return the сapital
     */
    public Area getCapital() {
        return capital;
    }

    public static void main(String[] args) {
        System.out.println("Country.main()");

    }
}
