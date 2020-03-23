package hw06;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class FamilyTest {

    Human father = new Human("Shakir", "Aghamirzayev", 1965, 118, 3, "Going to work");
    Human mother = new Human("Afat", "Aghamirzayeva", 1967, 117, 7, "Have a rest");
    Human child1 = new Human("Aqil", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Human child2 = new Human("A", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Human child3 = new Human("A", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Pet pet1 = new Pet(Species.DOG,"Rax",5,75, new String[]{"eat", "sleep", "play"});
    Pet pet2 = new Pet(Species.DOG,"Rax",5,75, new String[]{"eat", "sleep", "play"});
    Family family1 = new Family(mother, father);

    @BeforeEach
    public void setUp(){
        family1.addChild(child1);
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
        family1.deleteChild(child1);
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

    @Test
    void testToString() {
        String expect = "Human{name='Afat', surname='Aghamirzayeva', year=1967, iq=117, task='SUNDAY Have a rest'}\n";
        String actual = mother.toString();
        assertEquals(actual,expect);

    }

    @Test
    void testToString2(){
        String expect = "Human{name='Shakir', surname='Aghamirzayev', year=1965, iq=118, task='WEDNESDAY Going to " +
                "work'}\n";
        String actual = father.toString();
        assertEquals(expect,actual);
    }

    @Test
    void testEquals() {
        assertTrue(pet1.equals(pet2));
        assertTrue(child2.equals(child3));
    }
}