package hw04;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int date;
    int iq;
    Object mother;
    Object father;
    String[][] schedule = new String[7][];


    public Human(String name, String surname, int date){
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

   public Human(String name, String surname, int date, Object mother, Object father){
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.mother = mother;
        this.father = father;
    }

   public Human(String name, String surname, int date, int iq, Object mother, Object father){
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
    }

    public Human(){

    }



    public void greetPet(){
        System.out.println("Hello, " + Pet.nickname);
    }

    public void describePet(){
        if (Pet.trickLevel>=50) System.out.println(String.format("I have a %s, he is %d years old, he almost not sly", Pet.species, Pet.age));
        if (Pet.trickLevel<50) System.out.println(String.format("I have a %s, he is %d years old, he is very sly", Pet.species, Pet.age));
    }

    public String toString(){

        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, mother='%s', father='%s', pet=%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}}",
                name, surname,date, iq, mother, father,Pet.species, Pet.nickname, Pet.age, Pet.trickLevel, Arrays.toString(Pet.habits));
    }
}
