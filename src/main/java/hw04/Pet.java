package hw04;

import java.util.Arrays;

public class Pet {
    static String nickname;
    static String species;
    static int age;
    static int trickLevel;
    static String[] habits = new String[3];

    public Pet(String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }


    Pet(String species,String nickname,int age,  int trickLevel, String[] habits){
        this.nickname = nickname;
        this.species = species;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    public Pet(){

    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println(String.format("Hello, owner. I am - %s. I miss you!", species));
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    public String toString(){
        return String.format("%s{nickname=%s, age=%d, trickLevel=%d, habits=%s", species, nickname, age, trickLevel, Arrays.toString(habits));
    }
}
