package hw05;

public class Human {
     public String name;
     public String surname;
     public int year;
     public int iq;
     public static String[][] schedule = new String[][]{
             {"Monday", " "},
             {"Tuesday", " "},
             {"Wednesday", " "},
             {"Thursday", " "},
             {"Friday", " "},
             {"Saturday", " "},
             {"Sunday", " "}
     };
     public String task;


    public Human(){ }


    public Human(String name, String surname, int year, int iq, int day, String task){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.setSchedule(day, task);
    }

    void setSchedule(int day, String task) {
            schedule[day-1][1]=task;
            this.task = schedule[day-1][0]+ " " +task;
    }

    private String getSchedule() {
        return task;
    }


    @Override
    public String toString() {
        return " Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", task='" + task + '\'' +
                "}\n";
    }
}
