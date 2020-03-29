package hw07;

import java.util.Objects;

public abstract class Pet {
    private String nickname;
    private Species species;
    private int age;
    private int trickLevel;
    private static String[] habits;



    public void setSpecies(Species species){this.species=species;}

    Pet(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3){
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        habits = new String[]{habit1, habit2, habit3};
    }


    Pet(){
        Species species = Species.UNKNOWN;
    }



    public String toString(){
        return String.format("%s{nickname=%s, age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, this.getHabits());
    }
    private String getHabits(){
        StringBuilder sb = new StringBuilder();
        for (String habit: habits) {
            sb.append(" "+habit);
        }
        return sb.toString();
    }



    @Override
    protected void finalize() {
        System.out.println("Object " + this.getClass().getName());
    }


    void eat(){
        System.out.println("I am eating");
    }

    abstract void respond();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                nickname.equals(pet.nickname) &&
                species == pet.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, species, age, trickLevel);
    }
}
