package country.ru.molokoin;

public class Map {
    private Country[] map;// = new Country[5];
    public void initDefaults(){
        map = new Country[5];
        map[0].setName("Russia");
    }
    public static void main(String[] args) {
        System.out.println("App.main()");
    }
}
