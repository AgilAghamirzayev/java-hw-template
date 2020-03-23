package hw11.app;

import java.util.HashSet;

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

    public boolean equals(Object that){
        if (this == that) return true;
        if (hashCode(this) != hashCode(that)) return false;
        if (!(that instanceof Pet)) return false;
        return this.nickname.equals(((Pet) that).nickname)
                && this.age == ((Pet) that).age
                && this.species.equals(((Pet) that).species);
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
