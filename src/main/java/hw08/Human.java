package hw08;

import java.util.HashMap;

public class Human {
     public String name;
     public String surname;
     public int year;
     public int iq;
     public String task;

     HashMap<String, String> schedule = new HashMap<String, String>();





    public Human(){
        System.out.println("Object has been created!");
    }


    public Human(String name, String surname, int year, int iq, String day, String task){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.setSchedule(day, task);
    }

    void setSchedule(String day, String task) {
        schedule.put(" "+day+" "," " + task);
    }

    void greetPet(){}

    private String getSchedule() {
        return schedule.toString();
    }

    public String toString(){
        return "Human name = " + this.name
                + " surname = " + this.surname
                + " year = " + this.year
                + " iq = " + this.iq
                + " schedule = " + this.getSchedule();

    }
    @Override
    protected void finalize(){
        System.out.println("Object has been deleted!");
    }
}
