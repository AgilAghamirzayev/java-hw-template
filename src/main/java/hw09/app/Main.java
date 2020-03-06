package hw09.app;

import hw09.controllers.FamilyController;

public class Main {

    public static void main(String[] args) {
        FamilyController familyController = new FamilyController();

        Human father1 = new Human("A", "Aa", 1965);
        Human mother1 = new Human("A", "Aa", 1967);
        Human father2 = new Human("B", "Bb", 1965);
        Human mother2 = new Human("B", "Bb", 1967);
        Human father3 = new Human("C", "Cc", 1965);
        Human mother3 = new Human("C", "Cc", 1967);
        Human father4 = new Human("D", "Dd", 1965);
        Human mother4 = new Human("D", "Dd", 1967);

        Family family1= new Family(father1,mother1);
        Family family2 = new Family(father2,mother2);
        Family family3 = new Family(father3, mother3);
        Family family4 = new Family(father4, mother4);

        Human child1 =  new Human("Achild", "Achild", 1999);
        Human child2 =  new Human("Achild", "Achild", 1999);
        Human child3 =  new Human("Bchild", "Bchild", 1999);
        Human child4 =  new Human("Bchild", "Bchild", 1999);
        Human child5 =  new Human("Cchild", "Cchild", 1999);
        Human child6 =  new Human("Cchild", "Cchild", 1999);
        Human child7 =  new Human("Dchild", "Dchild", 1999);
        Human child8 =  new Human("Dchild", "Dchild", 1999);





        familyController.createNewFamily(father1,mother1);
        familyController.createNewFamily(father2, mother2);
        familyController.createNewFamily(father3,mother3);
        familyController.createNewFamily(father4,mother4);
        familyController.bornChild(family1,"masculine");// gender is : feminine or masculine
        familyController.bornChild(family4,"feminine");
        familyController.adoptChild(family1,child1);
        familyController.adoptChild(family2,child4);
        familyController.adoptChild(family3,child5);
        familyController.adoptChild(family4,child7);
        familyController.adoptChild(family1,child2);
        familyController.adoptChild(family2,child3);
        familyController.adoptChild(family3,child6);
        familyController.adoptChild(family4,child8);

        familyController.displayAllFamilies();
        familyController.deleteAllChildrenOlderThen(15);
        System.out.println(familyController.count());
        familyController.deleteFamilyByIndex(1);
        System.out.println(familyController.count());
        //System.out.println(familyController.getAllFamilies());






//
//        List<Family> families = new ArrayList<>();
//        families.add(family);
//        families.add(family1);
//        families.add(family2);

//        System.out.println(DayOfWeek.MONDAY.name());
//
//        Pet dog = new Dog("DOGG", 3, 75, "eat", "sleep", "play");
//        Pet cat = new RoboCat("ROBOT", 1, 111, "On", "Off", "Saying 0 and 1 instead of 'meow'");
//        Pet catDomestic = new DomesticCat("CAT", 5, 70, "eat", "sleep", "play");
//        Pet fish = new Fish("FISH", 1, 10, "swim", "eat", "sleep");
//       Family family = new Family(father, mother);
//        Man me =  new Man("Aqil", "Aghamirzayev", 1999, 100, "Wednesday", "Go to course");
//        family.addChild(me);
//        System.out.println();
//        Man child = new Man("a", "a", 2020, 150, "Friday", "Have a rest");
//        family.addChild(child);
//        family.setPet(catDomestic);
//        family.setPet(cat);
//        family.setPet(dog);
//        System.out.println(family.toString());

    }
}
