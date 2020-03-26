package hw12.console;

import hw12.controllers.FamilyController;
import hw12.dao.FamilyDao;
import hw12.human.DayOfWeek;
import hw12.human.Human;
import hw12.human.Man;
import hw12.human.Woman;
import hw12.pet.Dog;
import hw12.pet.Fish;
import hw12.pet.Pet;
import hw12.pet.RoboCat;
import hw12.services.FamilyService;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;

public class Executor {

    Scanner scanner = new Scanner(System.in);
    FamilyDao dao = new FamilyDao();
    FamilyService service = new FamilyService(dao);
    FamilyController controller = new FamilyController(service);

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
        Human child2 = new Man("Aysu", "Valiyeva", LocalDate.of(2017, 8, 9).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
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
        System.out.print("request a number one you interested in: ");
        int a = Integer.parseInt(scanner.nextLine());
        controller.getFamiliesBiggerThan(a);
    }

    public void getFamiliesLessThan(){
        System.out.print("request a number one you interested in: ");
        int a = Integer.parseInt(scanner.nextLine());
        controller.getFamiliesLessThan(a);
    }

    public void countFamiliesWithMemberNumber(){
        System.out.print("request a number one you interested in: ");
        int a = Integer.parseInt(scanner.nextLine());
        controller.countFamiliesWithMemberNumber(a);
    }

    public void createNewFamily(){

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

        Human mother = new Man(name,surname,LocalDate.of(birthYear,birthMonth,birthDay).toEpochDay(),iq);
        Human father = new Man(fname,fsurname,LocalDate.of(fbirthYear,fbirthMonth,fbirthDay).toEpochDay(),fiq);

        controller.createNewFamily(father,mother);
        System.out.println("New family created");
    }


    public void deleteFamily(){
        System.out.print("Enter family id: ");
        int a = Integer.parseInt(scanner.nextLine());
        controller.deleteFamilyByIndex(a);
    }



    public void bornChid() throws ParseException {
        System.out.print("request family identifier (ID): ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter boy's name: ");
        String boyName = scanner.nextLine();
        System.out.print("Enter girl's name: ");
        String girlName = scanner.nextLine();
        controller.bornChild(controller.getFamilyById(a),boyName,girlName);
    }

    public void adoptChild(){
        System.out.print("request family identifier (ID): ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter year of birth: ");
        String yearOfBirth = scanner.nextLine();
        System.out.print("Enter iq: ");
        int iq = Integer.parseInt(scanner.nextLine());
        Human human = new Human(name,surname,yearOfBirth,iq);
        controller.adoptChild(controller.getFamilyById(a),human);
    }

    public void deleteOlderChildren(){
        System.out.println("Enter interested age: ");
        int s = Integer.parseInt(scanner.nextLine());
        controller.deleteAllChildrenOlderThen(s);
    }

}
