package hw09.app;

final class Woman extends Human {

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    void greetPet() {
        System.out.println("GreetPet method from Woman Class");
    }

    void makeUp() {
        System.out.println("Mother has MakeUp");
    }
}
