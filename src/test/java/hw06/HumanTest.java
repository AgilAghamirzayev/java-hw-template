package hw06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human father = new Human("Shakir", "Aghamirzayev", 1965, 118, 3, "Going to work");
    Human mother = new Human("Afat", "Aghamirzayeva", 1967, 117, 7, "Have a rest");

    @BeforeEach
    public void setUp(){
        Family family1 = new Family(mother, father);
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
}