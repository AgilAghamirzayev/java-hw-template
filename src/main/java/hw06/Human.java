package hw06;

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
        System.out.println("Object has been created");
    }


    public Human(String name, String surname, int year, int iq, int day, String task){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.setSchedule(day, task);
    }

    void setSchedule(int day, String task) {
            schedule[day-1][1]=task;
            this.task = schedule[day-1][0]+ " " +schedule[day-1][1];
    }

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
}
