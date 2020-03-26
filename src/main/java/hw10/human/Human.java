package hw10.human;


import hw10.pet.Pet;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Human {

    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Pet pet;
    private Family family;
    private Map<String, ArrayList<String>> schedule = new HashMap<>();


    public Human(String name, String surname, long  birthDate, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.family = family;
        if ((family != null)) family.addChild(this);
    }

    public Human(String name, String surname, long  year, Pet pet, Family family, Map<String, ArrayList<String>>  schedule ) {
        this(name,surname,year,family);
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human(String name, String surname, String birthDate, int iq) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.name = name;
        this.surname = surname;
        this.birthDate = LocalDate.parse(birthDate,formatter).toEpochDay();
        this.iq = iq;
    }

    public String  describeAge(){
        LocalDate date = LocalDate.ofEpochDay(birthDate);
        LocalDate localDate = LocalDate.now();
        Period period = Period.between(date, localDate);
        return String.format("%d years, %d months, %d days old", period.getYears(), period.getMonths(), period.getDays());
     }


    public void greetPet(){
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet(){
        String slyness = pet.getAge() > 50 ? "very sly" : "almost sly";
        System.out.printf("I  have a %s, he is %d years old, he is %s\n", pet.getSpecies(), pet.getAge(), slyness);
    }


    public String getFullName(){
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getYear() {
        return birthDate;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }


    public void setSchedule(Map<String, ArrayList<String>> schedule) {
        this.schedule = schedule;
    }

    public void setYear(long birthDate) {
        this.birthDate = birthDate;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setFamily(Family family) {
        if (family.equals(this.family)) return;
        if (this.family != null) this.family.deleteChild(this);
        this.family = family;
    }


    public String toString(){
        return String.format("Human{ name = '%s', surname ='%s', birth date ='%s', iq = %d, schedule =%s}",
                name,
                surname,
                LocalDate.ofEpochDay(birthDate).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                iq,
                schedule.toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(family, human.family) &&
                Objects.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, iq, pet, family, schedule);
    }
}
