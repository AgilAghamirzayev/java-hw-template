package hw09;

final class Woman extends Human {

    Woman(String name,String surname,int year,int iq,String day,String task) {
        super(name,surname,year,iq,day,task);
        System.out.println("object of Woman class has been created");
    }

    void greetPet() {
        System.out.println("GreetPet method from Woman Class");
    }

    void makeUp() {
        System.out.println("Mother has MakeUp");
    }
}
