package hw11.app;

import java.text.ParseException;

public class Man extends Human {

    public Man(String name, String surname, String  year) throws ParseException {
        super(name, surname, year);
    }

    public void greetPet() {
        System.out.println("GreetPet method from Woman Class");
    }

    public void repairCar() {
        System.out.println("Father repair the car");
    }
}
