package hw04;

public class Main {
    public static void main(String[] args) {

        Human michael = new Human("Michael", "Karleone", 1993, 90, "Jane Karleone", "Vito Karleone");
        Pet pet1 = new Pet("dog", "Rock",5,75, Pet.habits);

        pet1.habits[0] = "eat";
        pet1.habits[1] = "drink";
        pet1.habits[2] = "sleep";

        System.out.println(michael.toString());
        System.out.println(pet1.toString());


        pet1.eat();
        pet1.foul();
        pet1.respond();

        michael.describePet();
        michael.greetPet();


    }
}
