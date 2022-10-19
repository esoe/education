package ru.molokoin;

public class Soldier extends Person{
    private MilitarySpeciality militarySpeciality;
    public Soldier(String firstname, String lastname,  MilitarySpeciality militarySpeciality){
        super(firstname, lastname);
        setMilitarySpeciality(militarySpeciality);
        
    }
    public MilitarySpeciality getMilitarySpeciality() {
        return militarySpeciality;
    }
    public void setMilitarySpeciality(MilitarySpeciality militarySpeciality) {
        this.militarySpeciality = militarySpeciality;
    }
}
