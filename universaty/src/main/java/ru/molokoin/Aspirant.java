package ru.molokoin;

public class Aspirant extends Person{
    private String thesisTitle;
    public static final Role role = Role.ASPIRANT;

    Aspirant (String name, Gender gender, String department, String thesisTitle) {
        super(name, gender, department);
        setThesisTitle(thesisTitle);
    }
    
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public static void main(String[] args) {
        
        
    }
}
