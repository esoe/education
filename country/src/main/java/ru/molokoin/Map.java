package ru.molokoin;

public class Map {
    private Country[] map = new Country[5];
    public void initDefaults(){
        System.out.println("map.length: " + map.length + " ...");
        //заполняем поля данными
        map[0] = new Country("Russia", 17100000, 146700000, "Moscow", 12600000, 0);
        map[1] = new Country("Russia", 17100000, 146700000, "Moscow", 12600000, 0);
        map[2] = new Country("Russia", 17100000, 146700000, "Moscow", 12600000, 0);
        map[3] = new Country("Russia", 17100000, 146700000, "Moscow", 12600000, 0);
        map[4] = new Country("Russia", 17100000, 146700000, "Moscow", 12600000, 0);
    }
    public static void print(Country[] map){
        System.out.println("Количество государств, данные о которых включены в terra: " + map.length);
        int i = 0;
        while (i < map.length) {
            System.out.println("-------------------------------------------");
            map[i].print();
            map[i].getCapital().print();
            System.out.println("-------------------------------------------");
            i++;
        }

    }
    public static void main(String[] args) {
        System.out.println("App.main()");
        Map terra = new Map();
        terra.initDefaults();
        print(terra.map);
    }
}
