package ru.molokoin;

public class App {
    public static void main(String[] args) {
        //int[] array = {10, 2, 120,324,8,0};
        Person[] array = new Person[2];
        array[0] = new Person("Ivan", "Ivanov");
        array[1] = new Soldier("Aleksey", "Alekseev", MilitarySpeciality.GUNLAYER);
        array[1].toString();
    }
}
