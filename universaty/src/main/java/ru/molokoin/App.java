package ru.molokoin;

public class App {
    private Teacher[] teachers;
    private Student[] students;
    private Aspirant[] aspirants;

    //инициируем исходные данные
    App(){
        teachers = new Teacher[2];
        students = new Student[3];
        aspirants = new Aspirant[1];
        aspirants[0] = new Aspirant("Ronald Correa", Gender.MALE, "Computer science", "Design of a functional programming language.");
    }
    public void print(Person person){
        //
    }
    //выводим данные в консоль
    public void printAll(){
        //
    }
    
    public static void main(String[] args) {
        
    }
    
}
