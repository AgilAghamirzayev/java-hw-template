package hw10.app;

import java.text.ParseException;

public class Man extends Human {

    public Man(String name, String surname, String  year,int iq,String day, String task) throws ParseException {
        super(name, surname,iq, year, day, task);
    }

    public void greetPet() {
        System.out.println("GreetPet method from Woman Class");
    }

    public void repairCar() {
        System.out.println("Father repair the car");
    }
}
