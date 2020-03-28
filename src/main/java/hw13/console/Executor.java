package hw13.console;

import hw13.controllers.FamilyController;
import hw13.dao.FamilyDao;
import hw13.human.DayOfWeek;
import hw13.human.Human;
import hw13.human.Man;
import hw13.human.Woman;
import hw13.pet.Dog;
import hw13.pet.Fish;
import hw13.pet.Pet;
import hw13.pet.RoboCat;
import hw13.services.FamilyService;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Executor implements Serializable {
    private static final long serialVersionUID = 1L;


    FamilyDao dao = new FamilyDao();
    FamilyService service = new FamilyService(dao);
    FamilyController controller = new FamilyController(service);
    private static Scanner scanner = new Scanner(System.in);
    public void fillWithTestData(){

        Pet fish = new Fish("Memo",2,109, Arrays.asList("swim","clean","jump"));
        Pet dog = new Dog("PiBody",1,100, Arrays.asList("swim","run","jump"));
        Pet robocat = new RoboCat("Tom",3,92, Arrays.asList("swim","clean","jump"));

        Human father1 = new Man("Ali", "Aiyev", LocalDate.of(1960, 10, 18).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
            put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
            put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
        }});
        Human mother1 = new Man("Aysu", "Aliyeva", LocalDate.of(1963, 9, 12).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
            put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
            put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
        }});

        Human father2 = new Man("Akif", "Valiyev", LocalDate.of(1989, 2, 11).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
            put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
            put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
        }});
        Human mother2 = new Man("Ayla", "Valiyeva", LocalDate.of(1992, 8, 9).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
            put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
            put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
        }});

        Human child1 = new Man("Orxan", "Valiyev", LocalDate.of(2014, 2, 11).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
            put(DayOfWeek.SUNDAY.toString(), Arrays.asList("relax","go to movie"));
            put(DayOfWeek.WEDNESDAY.toString(), Arrays.asList("school","do smt"));
        }});
        Human child2 = new Woman("Aysu", "Valiyeva", LocalDate.of(2017, 8, 9).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
            put(DayOfWeek.MONDAY.toString(), Arrays.asList("relax","go to movie"));
            put(DayOfWeek.TUESDAY.toString(), Arrays.asList("school","do smt"));
        }});

        controller.createNewFamily(father1,mother1);
        controller.createNewFamily(father2,mother2);
        controller.addPet(1,fish);
        controller.addPet(1,dog);
        controller.addPet(1,robocat);

        controller.adoptChild(controller.getFamilyById(1),child1);
        controller.adoptChild(controller.getFamilyById(1),child2);
        System.out.println("Done !");
    }


    public void  displayFamiliesByIndex(){
        System.out.println(controller.getFamilyById(1));
    }

    public void getFamiliesBiggerThan(){
        try {
            System.out.print("request a number one you interested in: ");
            int a = Integer.parseInt(scanner.nextLine());
            controller.getFamiliesBiggerThan(a);
        } catch (NumberFormatException e){
            System.out.println("Enter a valid command!!!");
            getFamiliesBiggerThan();
        }

    }

    public void getFamiliesLessThan(){

        try {
            System.out.print("request a number one you interested in: ");
            int a = Integer.parseInt(scanner.nextLine());
            controller.getFamiliesLessThan(a);
        } catch (NumberFormatException e){
            System.out.println("Enter a valid command!!!");
            getFamiliesLessThan();
        }
    }

    public void countFamiliesWithMemberNumber(){
        try {
            System.out.print("request a number one you interested in: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println(controller.countFamiliesWithMemberNumber(a));
        } catch (NumberFormatException e){
            System.out.println("Enter a valid command!!!");
            countFamiliesWithMemberNumber();
        }

    }

    public void createNewFamily(){
        try {
            System.out.print("Enter mother's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter mother's lastName: ");
            String surname = scanner.nextLine();
            System.out.print("Enter mother's birth year: ");
            int birthYear = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter mother's month of birth: ");
            int birthMonth =  Integer.parseInt(scanner.nextLine());
            System.out.print("Enter mother's birthday: ");
            int birthDay =  Integer.parseInt(scanner.nextLine());
            System.out.print("Enter mother's iq: ");
            int iq = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter father's name: ");
            String fname = scanner.nextLine();
            System.out.print("Enter father's lastName: ");
            String fsurname = scanner.nextLine();
            System.out.print("Enter father's birth year: ");
            int fbirthYear = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter father's month of birth: ");
            int fbirthMonth =  Integer.parseInt(scanner.nextLine());
            System.out.print("Enter father's birthday: ");
            int fbirthDay =  Integer.parseInt(scanner.nextLine());
            System.out.print("Enter father's iq: ");
            int fiq = Integer.parseInt(scanner.nextLine());

            Human mother = new Woman(name,surname,LocalDate.of(birthYear,birthMonth,birthDay).toEpochDay(),iq);
            Human father = new Man(fname,fsurname,LocalDate.of(fbirthYear,fbirthMonth,fbirthDay).toEpochDay(),fiq);

            controller.createNewFamily(father,mother);
            System.out.println("New family created");
        } catch (NumberFormatException e){
            System.out.println("Enter a valid command!!!");
            createNewFamily();
        }


    }


    public void deleteFamily(){
        try {
            System.out.print("Enter family id: ");
            int a = Integer.parseInt(scanner.nextLine());
            controller.deleteFamilyByIndex(a);
            System.out.println("Deleted!!!");
        } catch (NumberFormatException e){
            System.out.println("Enter a valid command!!!");
            deleteFamily();
        }
    }



    public void bornChid()  {
        try {
            System.out.print("request family identifier (ID): ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter boy's name: ");
            String boyName = scanner.nextLine();
            System.out.print("Enter girl's name: ");
            String girlName = scanner.nextLine();
            controller.bornChild(controller.getFamilyById(a),boyName,girlName);
            System.out.println("Borned!!!");
        } catch (NumberFormatException e){
            System.out.println("Enter a valid command!!!");
            bornChid();
        }

    }

    public void adoptChild(){
        try {
            System.out.print("request family identifier (ID): ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter surname: ");
            String surname = scanner.nextLine();
            System.out.print("Enter year of birth \"dd/MM/yyyy\" Ex 02/02/2020 : ");
            String yearOfBirth = scanner.nextLine();
            System.out.print("Enter iq: ");
            int iq = Integer.parseInt(scanner.nextLine());
            Human human = new Human(name,surname,yearOfBirth,iq);
            controller.adoptChild(controller.getFamilyById(a),human);
            System.out.println("Adopted!!!");
        } catch (NumberFormatException e){
            System.out.println("Enter a valid command!!!");
            adoptChild();
        }

    }

    public void deleteOlderChildren(){
        try {
            System.out.println("Enter interested age: ");
            int s = Integer.parseInt(scanner.nextLine());
            controller.deleteAllChildrenOlderThen(s);
            System.out.println("Deleted!!!");
        } catch (NumberFormatException e){
            System.out.println("Enter a valid command!!!");
            deleteOlderChildren();
        }
    }


}
