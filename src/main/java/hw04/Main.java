package hw04;

import static hw04.Human.*;

public class Main {
    public static void main(String[] args) {


        //For pet class
        System.out.println();
        Pet dog = new Pet("Dog", "Polo", 3 , 87);
        System.out.println(dog.toString());
        Pet cat = new Pet("Cat", "catt");
        cat.trickLevel = 49;
        cat.age = 2;
        System.out.println(cat.toString());

        //For Human class

        Human father = new Human("Shakir","Aghamirzayev");
        Human mother = new Human("Afat", "Aghamirzayeva");
        System.out.println();
        Human me = new Human("Aqil", "Aghamirzayev", 1999, 131, dog, mother, father);
        System.out.println();
        System.out.println(father.toString(2));
        System.out.println();
        System.out.println(mother.toString(1));
        System.out.println();
        System.out.println(me.toString());
        System.out.println();
        me.greetPet();
        System.out.println();
        me.describePet();


    }
}
