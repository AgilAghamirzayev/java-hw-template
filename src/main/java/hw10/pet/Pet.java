package hw10.pet;

import java.util.*;

public abstract class Pet {

    private String nickname;
    private Species species;
    private int age;
    private int trickLevel;
    private List<String> habits = new LinkedList<>();

    public Pet(String nickname, int age, int trickLevel, List<String> habits){
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet() {
    }

    void eat(){
        System.out.println("I am eating");
    }

    public abstract void respond();

    public String getNickname() {
        return nickname;
    }

    public Species getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public List<String> getHabits() {
        return habits;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String toString(){
        //return String.format("%s{nickname=%s, age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, this.getHabits());
        return String.format("{My name is %s, I am a %s}", nickname, species);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(nickname, pet.nickname) &&
                species == pet.species &&
                Objects.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, species, age, trickLevel, habits);
    }
}
