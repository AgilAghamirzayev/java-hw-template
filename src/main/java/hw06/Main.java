package hw06;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Shakir", "Aghamirzayev", 1965, 118, 3, "Going to work");
        Human mother = new Human("Afat", "Aghamirzayeva", 1967, 117, 7, "Have a rest");
        Family family = new Family(mother, father);
        Pet pet = new Pet(Species.CAT, "Less", 3, 78, new String[]{"eat", "sleep", "play"});
        Human me = new Human("Aqil", "Aghamirzayev", 1999, 100, 4, "Go to course");
        Human me1 = new Human("A", "Aghamirzayev", 1999, 100, 4, "Go to course");
        Human me2 = new Human("b", "Aghamirzayev", 1999, 100, 4, "Go to course");
        Human me3 = new Human("C", "Aghamirzayev", 1999, 100, 4, "Go to course");
        Human me4 = new Human("D", "Aghamirzayev", 1999, 100, 4, "Go to course");
        family.addChild(me);
        family.addChild(me1);
        family.addChild(me2);
        family.addChild(me3);
        family.addChild(me4);
        family.deleteChild(4);
        family.deleteChild(me4);

        family.addPet(pet);
        //family.showChild();
        System.out.println(family.toString());

        family.eat();
        family.respond();
        family.foul();

        Pet pet1 = new Pet(Species.CAT, "Less", 3, 78, new String[]{"eat", "sleep", "play"});
        Pet pet2 = new Pet(Species.CAT, "Less", 3,78, new String[]{"eat", "sleep", "play"});
        if (pet1.equals(pet2)) System.out.println("They are same");
        else System.out.println("They are different");

//        for (int i = 0; i < 1000000 ; i++) {
//            Human human = new Human();
//        }

    }
}
