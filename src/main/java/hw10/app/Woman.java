package hw10.app;

import java.text.ParseException;

public class Woman extends Human {

    public Woman(String name, String surname, String  year,int iq,String day, String task) throws ParseException {
        super(name, surname,iq, year, day, task);
    }

    public void greetPet() {
        System.out.println("GreetPet method from Woman Class");
    }

    public void makeUp() {
        System.out.println("Mother has MakeUp");
    }
}
