package hw06;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FamilyTest {
    Human father = new Human("Shakir", "Aghamirzayev", 1965, 118, 3, "Going to work");
    Human mother = new Human("Afat", "Aghamirzayeva", 1967, 117, 7, "Have a rest");
    Human me = new Human("Aqil", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Human child2 = new Human("A", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Human child3 = new Human("b", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Human child4 = new Human("C", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Human child5 = new Human("D", "Aghamirzayev", 1999, 100, 4, "Go to course");
    Pet pet = new Pet(Species.DOG,"Rax",5,75, new String[]{"eat", "sleep", "play"});

    Family family1 = new Family(mother, father);

    @BeforeAll
    public void setUp() throws Exception{
        family1.addChild(me);
        family1.addPet(pet);
    }

    @Test
    void addChild() {
        family1.addChild(child2);
        int expect = 2;
        int actual = family1.temp;
    }

    @Test
    void deleteChild() {

    }

    @Test
    void testDeleteChild() {
    }

    @Test
    void showChild() {
    }

    @Test
    void coutFamily() {
    }
}