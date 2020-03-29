package hw13.services;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import hw13.controllers.FamilyController;
import hw13.dao.FamilyDao;
import hw13.human.*;
import hw13.pet.Dog;
import hw13.pet.Fish;
import hw13.pet.Pet;
import hw13.pet.RoboCat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest implements Serializable {

    private static final long serialVersionUID = 1L;

    public static FamilyDao dao = new FamilyDao();
    public static FamilyService service = new FamilyService(dao);

    Pet fish = new Fish("Memo",2,109, Arrays.asList("swim","clean","jump"));
    Pet robocat = new RoboCat("Tom",3,92, Arrays.asList("swim","clean","jump"));

    Human father1 = new Man("Ali", "Aiyev", LocalDate.of(1960, 10, 18).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
        put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
        put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
    }});

    Human mother1 = new Man("Aysu", "Aliyeva", LocalDate.of(1963, 9, 12).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
        put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
        put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
    }});

    Human child1 = new Man("Orxan", "Valiyev", LocalDate.of(2014, 2, 11).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
        put(DayOfWeek.SUNDAY.toString(), Arrays.asList("relax","go to movie"));
        put(DayOfWeek.WEDNESDAY.toString(), Arrays.asList("school","do smt"));
    }});

    Human father2 = new Man("Akif", "Valiyev", LocalDate.of(1989, 2, 11).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
        put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
        put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
    }});
    Human mother2 = new Man("Ayla", "Valiyeva", LocalDate.of(1992, 8, 9).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
        put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
        put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
    }});

    Human child2 = new Woman("Aysu", "Valiyeva", LocalDate.of(2017, 8, 9).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
        put(DayOfWeek.MONDAY.toString(), Arrays.asList("relax","go to movie"));
        put(DayOfWeek.TUESDAY.toString(), Arrays.asList("school","do smt"));
    }});

    @BeforeEach
    void setUp(){
        service.createNewFamily(father1,mother1);
    }


    @Test
    void getAllFamilies() {
         String actual = service.getAllFamilies().toString();
         String expect = "[family:\n" +
                 "\t\tfather: { name = 'Ali', surname ='Aiyev', birth date ='18/10/1960', iq = 0, schedule ={THURSDAY=[sport, do smt], FRIDAY=[relax, go to movie]}}\n" +
                 "\t\tmother: { name = 'Aysu', surname ='Aliyeva', birth date ='12/09/1963', iq = 0, schedule ={THURSDAY=[sport, do smt], FRIDAY=[relax, go to movie]}}\n" +
                 "\t\tchildren:\n" +
                 "\t\tpets: [\n" +
                 "\t\t\t\tFISH {nickname=Memo, age=2, trickLevel=109, habits=[swim, clean, jump]}, \n" +
                 "\t\t\t\tROBOCAT {nickname=Tom, age=3, trickLevel=92, habits=[swim, clean, jump]}]\n" +
                 "\t\t, family:\n" +
                 "\t\tfather: { name = 'Ali', surname ='Aiyev', birth date ='18/10/1960', iq = 0, schedule ={THURSDAY=[sport, do smt], FRIDAY=[relax, go to movie]}}\n" +
                 "\t\tmother: { name = 'Aysu', surname ='Aliyeva', birth date ='12/09/1963', iq = 0, schedule ={THURSDAY=[sport, do smt], FRIDAY=[relax, go to movie]}}\n" +
                 "\t\tchildren:\n" +
                 "\t\tpets: []\n" +
                 "\t\t, family:\n" +
                 "\t\tfather: { name = 'Ali', surname ='Aiyev', birth date ='18/10/1960', iq = 0, schedule ={THURSDAY=[sport, do smt], FRIDAY=[relax, go to movie]}}\n" +
                 "\t\tmother: { name = 'Aysu', surname ='Aliyeva', birth date ='12/09/1963', iq = 0, schedule ={THURSDAY=[sport, do smt], FRIDAY=[relax, go to movie]}}\n" +
                 "\t\tchildren:\n" +
                 "\t\tpets: []\n" +
                 "\t\t]";
         assertEquals(expect,actual);

    }

    @Test
    void countFamiliesWithMemberNumber() {
        service.createNewFamily(father2, mother2);
        service.adoptChild(service.getFamilyById(1),child2);
        service.adoptChild(service.getFamilyById(0),child1);
        int actual = service.countFamiliesWithMemberNumber(3);
        int expect = 1;
        assertEquals(actual,expect);
    }

    @Test
    void deleteFamilyByIndex() {
        assertTrue(service.deleteFamilyByIndex(0));
    }

    @Test
    void bornChild() {
        String actual = service.bornChild(service.getFamilyById(0),"Ali","Ayla").children.toString();
        String expect = "[{ name = 'Ali', surname ='Aliyeva', birth date ='29/03/2020', iq = 0, schedule ={}}, { name = 'Ayla', surname ='Aliyeva', birth date ='29/03/2020', iq = 0, schedule ={}}]";
        assertEquals(actual,expect);
    }

    @Test
    void adoptChild() {
        Human child =  new Man("Achild", "Achild", LocalDate.of(1960, 10, 18).toEpochDay());
        String actual = service.adoptChild(service.getFamilyById(0),child).children.toString();
        String expect = "[{ name = 'Ali', surname ='Aliyeva', birth date ='29/03/2020', iq = 0, schedule ={}}, { name = 'Ayla', surname ='Aliyeva', birth date ='29/03/2020', iq = 0, schedule ={}}, { name = 'Orxan', surname ='Valiyev', birth date ='11/02/2014', iq = 0, schedule ={WEDNESDAY=[school, do smt], SUNDAY=[relax, go to movie]}}, { name = 'Achild', surname ='Achild', birth date ='18/10/1960', iq = 0, schedule ={}}]";
        assertEquals(actual,expect);
    }

    @Test
    void count() {
        int actual = service.count();
        int expect = 2;
        assertEquals(actual,expect);
    }

    @Test
    void getFamilyById() {
        String actual = service.getFamilyById(0).toString();
        String  expect = "family:\n" +
                "\t\tfather: { name = 'Ali', surname ='Aiyev', birth date ='18/10/1960', iq = 0, schedule ={THURSDAY=[sport, do smt], FRIDAY=[relax, go to movie]}}\n" +
                "\t\tmother: { name = 'Aysu', surname ='Aliyeva', birth date ='12/09/1963', iq = 0, schedule ={THURSDAY=[sport, do smt], FRIDAY=[relax, go to movie]}}\n" +
                "\t\tchildren:\n" +
                "\t\t\t\tboy: { name = 'Ali', surname ='Aliyeva', birth date ='29/03/2020', iq = 0, schedule ={}}\n" +
                "\t\t\t\tgirl: { name = 'Ayla', surname ='Aliyeva', birth date ='29/03/2020', iq = 0, schedule ={}}\n" +
                "\t\tpets: [\n" +
                "\t\t\t\tFISH {nickname=Memo, age=2, trickLevel=109, habits=[swim, clean, jump]}, \n" +
                "\t\t\t\tROBOCAT {nickname=Tom, age=3, trickLevel=92, habits=[swim, clean, jump]}]\n" +
                "\t\t";
        assertEquals(actual,expect);

    }

    @Test
    void getPets() {
        service.addPet(0,fish);
        service.addPet(0,robocat);
        String actual = service.getPets(0).toString();
        String expect = "[\n" +
                "\t\t\t\tFISH {nickname=Memo, age=2, trickLevel=109, habits=[swim, clean, jump]}, \n" +
                "\t\t\t\tROBOCAT {nickname=Tom, age=3, trickLevel=92, habits=[swim, clean, jump]}]";
        assertEquals(actual,expect);
    }
}