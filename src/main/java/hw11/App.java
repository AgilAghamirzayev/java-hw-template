package hw11;


import hw11.app.*;
import hw11.controllers.FamilyController;

import java.text.ParseException;

public class App {

    public static void main(String[] args) throws ParseException {
        FamilyController familyController = new FamilyController();

        Human father1 = new Man("A", "Aa", "01/02/1965");
        Human mother1 = new Woman("A", "Aa", "02/04/1967");
        Human father2 = new Man("B", "Ba", "02/02/1965");
        Human mother2 = new Woman("B", "Ba", "02/01/1967");
        Human father3 = new Man("C", "Aa", "02/02/1965");
        Human mother3 = new Woman("C", "Aa", "02/05/1967");
        Human father4 = new Man("D", "Aa", "02/02/1965");
        Human mother4 = new Woman("D", "Aa", "02/01/1967");


        Human child1 =  new Woman("Achild", "Achild", "02/02/1999");
        Human child2 =  new Man("Achild", "Achild", "01/02/2001");
        Human child3 =  new Man("Bchild", "Bchild", "04/05/2012");
        Human child4 =  new Man("Bchild", "Bchild", "02/03/2005");
        Human child5 =  new Man("Cchild", "Cchild", "12/07/2000");
        Human child6 =  new Woman("Cchild", "Cchild", "22/02/1997");
        Human child7 =  new Man("Dchild", "Dchild", "12/12/1990");
        Human child8 =  new Woman("Dchild", "Dchild", "26/06/1998");


        Pet fish = new Fish("Memo",2,123,"swim","eat", "clean");
        Pet dog = new Dog("PiBody",3,223,"swim","eat", "run");
        Pet robotCat = new RoboCat("Tom",2,121,"swim","eat", "speak");
        Pet domesticCat = new DomesticCat("Tommy",2,123,"swim","eat", "clean");



        familyController.createNewFamily(father1,mother1);
        familyController.createNewFamily(father2,mother2);
        familyController.createNewFamily(father3,mother3);
        familyController.createNewFamily(father4,mother4);

        familyController.bornChild(familyController.getFamilyById(1),"masculine");  // gender is : feminine or masculine
        familyController.bornChild(familyController.getFamilyById(4),"feminine");

        familyController.adoptChild(familyController.getFamilyById(2),child1);
        familyController.adoptChild(familyController.getFamilyById(3),child1);
        familyController.adoptChild(familyController.getFamilyById(1),child1);
        familyController.adoptChild(familyController.getFamilyById(2),child4);
        familyController.adoptChild(familyController.getFamilyById(3),child5);
        familyController.adoptChild(familyController.getFamilyById(4),child7);
        familyController.adoptChild(familyController.getFamilyById(2),child2);
        familyController.adoptChild(familyController.getFamilyById(3),child3);
        familyController.adoptChild(familyController.getFamilyById(3),child6);
        familyController.adoptChild(familyController.getFamilyById(4),child8);

        familyController.addPet(1,fish);
        familyController.addPet(2,domesticCat);
        familyController.addPet(1,dog);
        familyController.addPet(2,robotCat);


        father2.setSchedule(DayOfWeek.MONDAY.toString(),"read");

        familyController.displayAllFamilies();

        familyController.deleteAllChildrenOlderThen(12);

        System.out.println(familyController.count());

        familyController.deleteFamilyByIndex(1);

        System.out.println(familyController.count());

        familyController.displayAllFamilies();

        System.out.println(familyController.getFamilyById(1).children.toString());

        father1.describeAge();
        mother1.describeAge();
        father1.greetPet();

    }
}
