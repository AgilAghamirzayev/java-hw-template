package hw09.services;

import hw09.app.*;
import hw09.controllers.FamilyController;
import hw09.dao.FamilyDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {

    FamilyService familyService = new FamilyService();
    Human father1 = new Man("A", "Aa", 1965);
    Human mother1 = new Woman("A", "Aa", 1967);

    Human father2 = new Man("B", "Bb", 1965);
    Human mother2 = new Woman("B", "Bb", 1967);


    Human child1 =  new Woman("Achild", "Achild", 2012);
    Human child2 =  new Man("Achild", "Achild", 1995);
    Human child3 =  new Man("Bchild", "Bchild", 1999);
    Human child4 =  new Man("Bchild", "Bchild", 2001);

    Pet dog = new Dog("PiBody",3,223,"swim","eat", "run");

    @BeforeEach

    public void setUp(){
        familyService.createNewFamily(father1,mother1);
    }

    @Test
    void getAllFamilies() {
        String expect ="[Family {mother:  name = A surname = Aa year = 1967, father:  name = A surname = Aa year = 1965, pets: [DOG{nickname=PiBody, age=3, trickLevel=223, habits=[eat, run, swim]}], children: []}]";
        String  actual = familyService.getAllFamilies().toString();
        assertEquals(expect,actual);
    }

    @Test
    void bornChild() {
        Family family1 = new Family(father1, mother1);
        String expect = "[ name = Aqil surname = Aghamirzayev year = 1999]";
        familyService.bornChild(family1, "masculine");  // gender is : feminine or masculine
        String actual = family1.children.toString();
        assertEquals(expect, actual);
    }
    @Test

    void adoptChild() {
        Family family1 = new Family(father1,mother1);
        String expect = "[ name = Achild surname = Achild year = 2012]";
        familyService.adoptChild(family1,child1);
        String actual = family1.children.toString();
        assertEquals(expect,actual);
    }

    @Test
    void deleteAllChildrenOlderThen() {
        familyService.adoptChild(familyService.getFamilyById(1),child1);
        familyService.adoptChild(familyService.getFamilyById(1),child2);
        familyService.adoptChild(familyService.getFamilyById(1),child3);
        familyService.adoptChild(familyService.getFamilyById(1),child4);
        String expect = "[ name = Achild surname = Achild year = 2012]";
        String actual =  familyService.deleteAllChildrenOlderThen(15).toString();
        assertEquals(expect,actual);
    }


    @Test
    void count() {
        familyService.createNewFamily(father2,mother2);
        int expect = 2;
        int actual = familyService.count();
        assertEquals(expect,actual);
    }

    @Test
    void getFamilyById() {
        String expect = "Family {mother:  name = A surname = Aa year = 1967, father:  name = A surname = Aa year = 1965, pets: [DOG{nickname=PiBody, age=3, trickLevel=223, habits=[eat, run, swim]}], children: []}";
        String actual = familyService.getFamilyById(1).toString();
        assertEquals(expect,actual);
    }

    @Test
    void getPets() {
        familyService.addPet(1,dog);
        String expect = "[DOG{nickname=PiBody, age=3, trickLevel=223, habits=[eat, run, swim]}]";
        String actual = familyService.getPets(1).toString();
        assertEquals(expect,actual);
    }

}