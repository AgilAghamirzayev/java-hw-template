package hw05;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Shakir", "Aghamirzayev", 1965, 118, 3, "Going to work");
        Human mother = new Human("Afat", "Aghamirzayeva", 1967, 117, 7, "Have a rest");
        Family family = new Family(mother, father);
        Pet pet = new Pet("Cat", "Less", 3, 78, new String[]{"eat", "sleep", "play"});
        Human me = new Human("Aqil", "Aghamirzayev", 1999, 100, 4, "Go to course");
        family.addChild(me);
        family.addPet(pet);
        System.out.println(family.toString());

        family.eat();
        family.respond();
        family.foul();

        Pet pet1 = new Pet("Cat", "Less", 3, 78, new String[]{"eat", "sleep", "play"});
        Pet pet2 = new Pet("Cat", "Less", 3,78, new String[]{"eat", "sleep", "play"});


    }
}