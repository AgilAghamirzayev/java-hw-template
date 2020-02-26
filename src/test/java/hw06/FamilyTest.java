package hw06;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class FamilyTest {
    Human father = new Human("Shakir", "Aghamirzayev", 1965, 118, 3, "Going to work");
    Human mother = new Human("Afat", "Aghamirzayeva", 1967, 117, 7, "Have a rest");
    Human me = new Human("Aqil", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Human child2 = new Human("A", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Pet pet = new Pet(Species.DOG,"Rax",5,75, new String[]{"eat", "sleep", "play"});

    Family family1 = new Family(mother, father);

    @BeforeEach
    public void setUp() throws Exception{
        family1.addChild(me);
        family1.addPet(pet);
    }

    @Test
    void addChild() {
        family1.addChild(child2);
        int expect = 2;
        int actual = family1.temp;
        assertEquals(expect,actual);
    }

    @Test
    void deleteChild() {
        family1.addChild(child2);
        family1.deleteChild(1);
        int expect = 1;
        int actual = family1.temp;
        assertEquals(expect, actual);
    }

    @Test
    void testDeleteChild() {
        family1.addChild(child2);
        family1.deleteChild(1);
        int expect = 1;
        int actual = family1.temp;
        assertEquals(expect, actual);
    }

    @Test
    void showChild() {
    }

    @Test
    void coutFamily() {
        int expect = 3;
        int actual = family1.coutFamily();
        assertEquals(expect,actual);
    }
}