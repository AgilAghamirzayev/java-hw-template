package hw07;

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
        schedule[0][0] = day;
        schedule[0][1] = task;
        this.task = day + " " + task;
    }

    void greetPet(){}

    private String getSchedule() {

        return task;
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
