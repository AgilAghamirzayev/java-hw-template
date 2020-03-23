package hw11.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Human {

    private String name;
    private String surname;
    public long birthDate;
    private int iq;
    private HashMap<String, String> schedule = new HashMap<String, String>();


    public Human(String name, String surname, String  date) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(date).getTime();
    }

    public Human(String name, String surname,int iq, String  date, String day, String task) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(date).getTime();
        this.setSchedule(day,task);
    }


    public void describeAge(){
        Calendar time = Calendar.getInstance();
        long difference = time.getTimeInMillis() - this.birthDate;
        time.setTimeInMillis(difference);
        int year = time.get(Calendar.YEAR) - 1965;
        int month = time.get(Calendar.MONTH);
        int day = time.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + " years " + month + " months " + day + " days ");
     }

     public String dateToString(){
         Date date = new Date(birthDate);
         SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         return df.format(date);
     }

    public void setSchedule(String day, String task) {
        schedule.put(" "+ day +" "," " + task);
    }

    public void greetPet(){}


    private String getSchedule() {
        return String.valueOf(schedule);
    }

    public String toString(){
        return " name = " + this.name
                + " surname = " + this.surname
                + " year = " + this.dateToString()
                + " iq = " + this.iq
                + " schedule = " + this.getSchedule();

    }
}
