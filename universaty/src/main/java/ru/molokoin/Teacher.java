package ru.molokoin;

public class Teacher extends Person{
    public static final Role role = Role.TEACHER;

    Teacher(String name, Gender gender, String department) {
        super(name, gender, department);
        //
    }
}
