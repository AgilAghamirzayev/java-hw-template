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

            System.out.print("Do you want to change yor task? Yes or No: ");
            String select = new String();
            select = scanner.nextLine();

                if (select.toLowerCase().equals("yes")) {
                    while (true){
                    System.out.println("If you want to change task of week, just write: 'change WeekDay'sName', For exit write 'exit'. \nex: 'change Monday' ");
                    String s = scanner.nextLine();
                    String m = s.toLowerCase();
                    if (m.equals(String.format("change %s", arr[0][0].toLowerCase()))) {
                        System.out.println(String.format("Please, input new tasks for %s .", arr[0][0]));
                        arr[0][1] = scanner.nextLine();
                    } else if (m.equals(String.format("change %s", arr[1][0].toLowerCase()))) {
                        System.out.println(String.format("Please, input new tasks for %s .", arr[1][0]));
                        arr[1][1] = scanner.nextLine();
                    } else if (m.equals(String.format("change %s", arr[2][0].toLowerCase()))) {
                        System.out.println(String.format("Please, input new tasks for %s .", arr[2][0]));
                        arr[2][1] = scanner.nextLine();
                    } else if (m.equals(String.format("change %s", arr[3][0].toLowerCase()))) {
                        System.out.println(String.format("Please, input new tasks for %s .", arr[3][0]));
                        arr[3][1] = scanner.nextLine();
                    } else if (m.equals(String.format("change %s", arr[4][0].toLowerCase()))) {
                        System.out.println(String.format("Please, input new tasks for %s .", arr[4][0]));
                        arr[4][1] = scanner.nextLine();
                    } else if (m.equals(String.format("change %s", arr[5][0].toLowerCase()))) {
                        System.out.println(String.format("Please, input new tasks for %s .", arr[5][0]));
                        arr[5][1] = scanner.nextLine();
                    } else if (m.equals(String.format("change %s", arr[6][0].toLowerCase()))) {
                        System.out.println(String.format("Please, input new tasks for %s .", arr[6][0]));
                        arr[6][1] = scanner.nextLine();
                    } else if (m.equals("exit")) {
                        break;
                    }else {
                        System.out.println("if you want to change task of week, just write 'change WeekDay'sName ' ");
                    }
                    }
                } else if (select.toLowerCase().equals("no")) {
                    System.out.println("Please, input the day of the week:");
                    String s = scanner.nextLine();
                    String m = s.toLowerCase();
                    if (m.equals(arr[0][0].toLowerCase())) {
                        System.out.println(String.format("Your tasks for %s: %s", arr[0][0], arr[0][1]));
                    } else if (m.equals(arr[1][0].toLowerCase())) {
                        System.out.println(String.format("Your tasks for %s: %s", arr[1][0], arr[1][1]));
                    } else if (m.equals(arr[2][0].toLowerCase())) {
                        System.out.println(String.format("Your tasks for %s: %s", arr[2][0], arr[2][1]));
                    } else if (m.equals(arr[3][0].toLowerCase())) {
                        System.out.println(String.format("Your tasks for %s: %s", arr[3][0], arr[3][1]));
                    } else if (m.equals(arr[4][0].toLowerCase())) {
                        System.out.println(String.format("Your tasks for %s: %s", arr[4][0], arr[4][1]));
                    } else if (m.equals(arr[5][0].toLowerCase())) {
                        System.out.println(String.format("Your tasks for %s: %s", arr[5][0], arr[5][1]));
                    } else if (m.equals(arr[6][0].toLowerCase())) {
                        System.out.println(String.format("Your tasks for %s: %s", arr[6][0], arr[6][1]));
                    } else if (m.equals("exit".toLowerCase())) {
                        break;
                    } else {
                        System.out.println("Sorry, I don't understand you, please try again.");
                    }
                } else {
                    System.out.println("Please select only Yes or No");
                }

        }
    }
}
