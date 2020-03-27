package hw13.pet;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class Pet implements Serializable {
    private static final long serialVersionUID = 1L;

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
        return String.format("\n\t\t\t\t%s {nickname=%s, age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, this.getHabits());
        //return String.format("{My name is %s, I am a %s}", nickname, species);
    }

}
