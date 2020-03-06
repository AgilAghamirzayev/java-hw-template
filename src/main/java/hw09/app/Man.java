package hw09.app;

public class Man extends Human {

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    void greetPet() {
        System.out.println("GreetPet method from Woman Class");
    }

    void repairCar() {
        System.out.println("Father repair the car");
    }
}
