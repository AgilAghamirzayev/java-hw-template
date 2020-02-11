package hw03;

import java.util.Scanner;

public class HW_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [][] arr = new String[7][2];

        arr[0][0] = "Sunday";
        arr[0][1] = "do home work";
        arr[1][0] = "Monday";
        arr[1][1] = "go to courses; watch a film";
        arr[2][0] = "Tuesday";
        arr[2][1] = "go out with friends; read book";
        arr[3][0] = "Wednesday";
        arr[3][1] = "go to courses; improve algorithm skills";
        arr[4][0] = "Thursday";
        arr[4][1] = "go to gym; watch online course";
        arr[5][0] = "Friday";
        arr[5][1] = "go to courses; do coding challenges";
        arr[6][0] = "Saturday";
        arr[6][1] = "relaxing; visit grandparents";



        while (true){
            System.out.print("Please, input the day of the week: ");
            String s = scanner.nextLine();
            String m = s.toLowerCase();
            String combined = String.format("Your tasks for %s: " , s);

            if (m.equals(arr[0][0].toLowerCase())){
                System.out.println(combined + arr[0][1]);
            } else if (m.equals(arr[1][0].toLowerCase())){
                System.out.println(combined + arr[1][1]);
            }else if (m.equals(arr[2][0].toLowerCase())){
                System.out.println(combined + arr[2][1]);
            }else if (m.equals(arr[3][0].toLowerCase())){
                System.out.println(combined + arr[3][1]);
            }else if (m.equals(arr[4][0].toLowerCase())){
                System.out.println(combined + arr[4][1]);
            }else if (m.equals(arr[5][0].toLowerCase())){
                System.out.println(combined + arr[5][1]);
            }else if (m.equals(arr[6][0].toLowerCase())){
                System.out.println(combined + arr[6][1]);
            }else if (m.equals("exit")){
                break;
            } else {
                System.out.println("Sorry, I don't understand you, please try again.");
            }

        }
    }
}
