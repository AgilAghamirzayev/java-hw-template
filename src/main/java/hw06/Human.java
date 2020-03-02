package hw06;

import java.util.Objects;

public class Human {
     public String name;
     public String surname;
     public int year;
     public int iq;
     public String task;
    public static String[][] schedule = new String[][]{
             {DayOfWeek.MONDAY.name(), " "},
             {DayOfWeek.TUESDAY.name(), " "},
             {DayOfWeek.WEDNESDAY.name(), " "},
             {DayOfWeek.THURSDAY.name(), " "},
             {DayOfWeek.FRIDAY.name(), " "},
             {DayOfWeek.SATURDAY.name(), " "},
             {DayOfWeek.SUNDAY.name(), " "}
     };


    public Human(String name, String surname, int year, int iq, int day, String task){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.setSchedule(day, task);
    }

    public Human() {
            System.out.println("Object has been created");
    }

    void setSchedule(int day, String task) {
            schedule[day-1][1]=task;
            this.task = schedule[day-1][0]+ " " +schedule[day-1][1];
    }

    void greetPet(){

    }

    private String getSchedule() {
        return task;
    }


    @Override
    protected void finalize(){
        System.out.println("Object has been deleted!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", task='" + task + '\'' +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(task, human.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, task);
    }
}
