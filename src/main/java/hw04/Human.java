package hw04;

import java.util.Arrays;

public class Human {
     String name;
     String surname;
     int year;
     int iq;
     Pet pet;
     Human mother;
     Human father;
     static String[][] schedule = new String[7][2];


    public Human(){ }


    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.year = 1996;
        this.iq = 112;
    }

   public Human(String name, String surname, int year, Human mother, Human father){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

   public Human(String name, String surname, int year, int iq,Pet pet, Human mother, Human father){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }




    public void greetPet(){
        System.out.println("Hello, " + this.pet.nickname);
    }

    public void describePet(){
        if (this.pet.trickLevel>=50) System.out.println(String.format("I have a %s, he is %d years old, he almost not sly", this.pet, this.pet.age));
        if (this.pet.trickLevel<50) System.out.println(String.format("I have a %s, he is %d years old, he is very sly", this.pet, this.pet.age));
    }

    public String toString(){
         return "Human{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", year=" + year + ", iq=" + iq + ", \npet=" + pet + ", \nmother=" + mother + ", \nfather=" + father + '}';
    }

    public String toString(int a){
        return String.format("Human{name='%s', surname'%s'}",name,surname);
    }
}
