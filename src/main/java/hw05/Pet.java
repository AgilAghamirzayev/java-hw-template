package hw05;

import java.util.Objects;

public class Pet {
    private String nickname;
    private String species;
    private int age;
    private int trickLevel;
    private static String[] habits ;


    Pet(String species,String nickname,int age,  int trickLevel, String[] habit){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        habits = habit.clone();
    }

    void setSpecies(String species){this.species = species;}
    String getNickname(){return nickname;}
    void setNickname(String nickname){this.nickname = nickname;}
    void setAge(int age){this.age =age;}
    void setTrickLevel(int trickLevel){this.trickLevel = trickLevel; }

    private String getHabits(){
        StringBuilder sb = new StringBuilder();
        for (String habit: habits) {
            sb.append(" "+habit);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                nickname.equals(pet.nickname) &&
                species.equals(pet.species);
    }


    public int hashCode() {
        return Objects.hash(nickname, species, age, trickLevel);
    }


}
