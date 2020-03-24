package hw12.app;

import java.text.ParseException;

public class Woman extends Human {

    public Woman(String name, String surname, String  year) throws ParseException {
        super(name, surname, year);
    }

    public void greetPet() {
        System.out.println("GreetPet method from Woman Class");
    }

    public void makeUp() {
        System.out.println("Mother has MakeUp");
    }
}
