package hw05;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Shakir", "Aghamirzayev", 1965, 118, 3, "Going to work");
        Human mother = new Human("Afat", "Aghamirzayeva", 1967, 117, 7, "Have a rest");
        Family family = new Family(mother, father);
        Pet pet = new Pet("Cat", "Less", 3, 78, new String[]{"eat", "sleep", "play"});
        Human me = new Human("Aqil", "Aghamirzayev", 1999, 100, 4, "Go to course");
        Human  a = new Human("Ali","Zeka", 1111, 121,3,"jkvdvkj");
        Human b = new Human("B", "B", 1999, 100, 4, "Go to B");
        Human c = new Human("C", "C", 1999, 100, 4, "Go to C");
        Human d = new Human("D", "D", 1999, 100, 4, "Go to D");

        family.addChild(me);
        family.addChild(a);
        family.addChild(b);
        family.addChild(c);
        family.addChild(d);
        family.addPet(pet);
        System.out.println(family.showChild());
        family.deleteChild(4);
        System.out.println(family.showChild());

        System.out.println(family);
        family.eat();
        family.respond();
        family.foul();

        Pet pet1 = new Pet("Cat", "Less", 3, 78, new String[]{"eat", "sleep", "play"});
        Pet pet2 = new Pet("Cat", "Less", 3,78, new String[]{"eat", "sleep", "play"});

        System.out.println(pet1.equals(pet2));
        System.out.println(pet1.hashCode()==pet2.hashCode());

    }
}


