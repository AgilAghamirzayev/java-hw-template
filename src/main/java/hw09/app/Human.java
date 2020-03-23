package hw09.app;

public class Human {

    public  String name;
    public String surname;
    private  int year;

     public int getAge(){
         return 2020-this.year;
     }


    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public String toString(){
        return " name = " + this.name
                + " surname = " + this.surname
                + " year = " + this.year;

    }

}
