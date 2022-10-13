package country.ru.molokoin;

public class Map {
    private Country[] map = new Country[5];
    public void initDefaults(){
        map[0] = new Country();
        map[0].init("Russia", 17100000, 146700000, "Moscow", 12600000, 0);
    }
    public static void main(String[] args) {
        System.out.println("App.main()");
        Map m = new Map();
        m.initDefaults();
        m.map[0].print();
        m.map[0].getCapital().print();
        
    }
}
