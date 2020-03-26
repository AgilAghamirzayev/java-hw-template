package hw09.app;

import java.util.HashSet;
import java.util.Objects;

public abstract class Pet {
    private String nickname;
    private Species species;
    private int age;
    private int trickLevel;
    HashSet<String> habits = new HashSet<String>();



    public void setSpecies(Species species){this.species=species;}

    public Pet(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3){
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        habits.add(habit1);
        habits.add(habit2);
        habits.add(habit3);
    }


    Pet (Species species){species = Species.UNKNOWN;}



    public String toString(){
        return String.format("%s{nickname=%s, age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, this.getHabits());
    }
    private String getHabits(){
        return habits.toString();
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

    private int hashCode(Object pet){return hashCode();}

    @Override
    protected void finalize() {
        System.out.println("Object " + this.getClass().getName());
    }


    void eat(){
        System.out.println("I am eating");
    }

    protected abstract void respond();

}
