package hw10;

import hw10.controllers.FamilyController;

import hw10.human.Family;
import hw10.human.Human;
import hw10.human.Man;
import hw10.human.Woman;
import hw10.pet.*;
import hw10.services.FamilyService;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws ParseException {

        FamilyService service = new FamilyService();
        FamilyController controller = new FamilyController(service);

        //initializations fathers & mothers
        Human father1 = new Man("A", "Aa", LocalDate.of(1960, 10, 18).toEpochDay());
        Human mother1 = new Woman("A", "Aa", LocalDate.of(1960, 10, 18).toEpochDay());
        Human father2 = new Man("B", "Bb", LocalDate.of(1960, 10, 18).toEpochDay());
        Human mother2 = new Woman("B", "Bb", LocalDate.of(1960, 10, 18).toEpochDay());
        Human father3 = new Man("C", "Cc", LocalDate.of(1960, 10, 18).toEpochDay());
        Human mother3 = new Woman("C", "Cc", LocalDate.of(1960, 10, 18).toEpochDay());
        Human father4 = new Man("D", "Dd", LocalDate.of(1960, 10, 18).toEpochDay());
        Human mother4 = new Woman("D", "Dd", LocalDate.of(1960, 10, 18).toEpochDay());

        //initializations children
        Human child1 =  new Woman("Achild", "Achild", LocalDate.of(1960, 10, 18).toEpochDay());
        Human child2 =  new Man("Achild", "Achild", LocalDate.of(1960, 10, 18).toEpochDay());
        Human child3 =  new Man("Bchild", "Bchild", LocalDate.of(1960, 10, 18).toEpochDay());
        Human child4 =  new Man("Bchild", "Bchild", LocalDate.of(1960, 10, 18).toEpochDay());
        Human child5 =  new Man("Cchild", "Cchild", LocalDate.of(1960, 10, 18).toEpochDay());
        Human child6 =  new Woman("Cchild", "Cchild", LocalDate.of(1960, 10, 18).toEpochDay());
        Human child7 =  new  Man("Dchild", "Dchild", LocalDate.of(1960, 10, 18).toEpochDay());
        Human child8 =  new Woman("Dchild", "Dchild", LocalDate.of(1960, 10, 18).toEpochDay());

        //initializations pets
        Pet fish = new Fish("Memo",2,112, Arrays.asList("swim","clean","jump"));
        Pet dog = new Dog("PiBody",3,223,Arrays.asList("swim","eat", "run"));
        Pet robotCat = new RoboCat("Tom",2,121,Arrays.asList("swim","eat", "speak"));
        Pet domesticCat = new DomesticCat("Tommy",2,123,Arrays.asList("swim","eat", "clean"));

        //crete families
        controller.createNewFamily(father1,mother1);
        controller.createNewFamily(father2,mother2);
        controller.createNewFamily(father3, mother3);
        controller.createNewFamily(father4,mother4);


        //adopt children
        controller.adoptChild(controller.getFamilyById(0),child1);
        controller.adoptChild(controller.getFamilyById(1),child2);
        controller.adoptChild(controller.getFamilyById(0),child3);
        controller.adoptChild(controller.getFamilyById(1),child4);
        controller.adoptChild(controller.getFamilyById(2),child5);
        controller.adoptChild(controller.getFamilyById(3),child6);
        controller.adoptChild(controller.getFamilyById(2),child7);
        controller.adoptChild(controller.getFamilyById(3),child8);

        //add pets
        controller.addPet(1,fish);
        controller.addPet(1,dog);
        controller.addPet(2,robotCat);
        controller.addPet(3,domesticCat);
        controller.addPet(0,dog);
        controller.addPet(0,robotCat);
        controller.addPet(2,domesticCat);

        //born children
        controller.bornChild(controller.getFamilyById(0),"Ayxan","Ayan");
        controller.bornChild(controller.getFamilyById(1),"Orxan","Ayla");
        controller.bornChild(controller.getFamilyById(2),"Samir","Leyla");
        controller.bornChild(controller.getFamilyById(3),"Adil","Aysun");

        //families count
        System.out.printf("There are %d families.\n", controller.count());

        //getAllFamilies
        System.out.println("Get all families: ");
        controller.getAllFamilies().forEach(System.out::println);

        //displayAllFamilies
        controller.displayAllFamilies();

        //families bigger than AND families less than
        System.out.println("All families bigger than 2:");
        controller.getFamiliesBiggerThan(2);
        System.out.println("All families less than 4:");
        controller.getFamiliesLessThan(4);

        //delete all children older than
        controller.deleteAllChildrenOlderThen(15);
        System.out.println("After deleting older children");
        controller.displayAllFamilies();


        //family with specific number of members
        int count = controller.countFamiliesWithMemberNumber(3);
        System.out.printf("There are %d families with 3 members\n", count);

        //get family by id AND delete family by id
        Family family = controller.getFamilyById(1);
        System.out.println("Family at index 1 will be deleted: " + family.toString());
        controller.deleteFamilyByIndex(1);
        controller.displayAllFamilies();

        //getPets
        System.out.println("Pets of the family2: "+ controller.getPets(1).toString());





    }
}
