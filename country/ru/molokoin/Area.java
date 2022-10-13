package country.ru.molokoin;

public class Area {
    private String name;
    private int population;
    private int square;

    Area(){}
    Area(String name, int population, int square){
        setName(name);
        setPopulation(population);
        setSquare(square);
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param population the population to set
     */
    public void setPopulation(int population) {
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
