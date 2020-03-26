package hw11;



import hw11.human.Human;
import hw11.human.Man;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Human father1 = new Man("A","B", LocalDate.of(1978, 9, 21).toEpochDay(), null);
        Human father2 = new Man("B","Bb","21/09/1978",112);


        System.out.println(father1.describeAge());
        System.out.println(father2);

    }
}
