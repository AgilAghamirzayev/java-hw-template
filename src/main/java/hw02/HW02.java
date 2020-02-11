package hw02;

import java.util.Random;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {

        System.out.println("All set. Get ready to rumble!\n");

        System.out.println(
                "0 | 1 | 2 | 3 | 4 | 5 |\n" +
                "1 | - | - | - | - | - |\n" +
                "2 | - | - | - | - | - |\n" +
                "3 | - | - | - | - | - |\n" +
                "4 | - | - | - | - | - |\n" +
                "5 | - | - | - | - | - |\n");

        shooting();

    }

    public static void shooting() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int MIN = 1;
        final int MAX = 5;

        int r2 = random.nextInt(MAX - MIN + 1) + MIN;
        int r3 = random.nextInt(MAX - MIN + 1) + MIN;


        //System.out.println(r2);   For testing
        //System.out.println(r3);


        String arr[][] = new String[5][5];

        for (int a = 0; a < 5; a++) {
            for (int  b = 0; b < 5; b++) {
                arr[a][b] = "-";
            }
        }

        while (true) {
            System.out.print("Enter a line for fire: ");
            try {
                int i = scanner.nextInt();
                int j = scanner.nextInt();

                arr[i - 1][j - 1] = "*";

                System.out.println("\n");
                System.out.println( "0 | 1 | 2 | 3 | 4 | 5 |");
                for (int m = 0; m < 5; m++) {
                    System.out.print(m+1 +" | ");
                    for (int n = 0; n < 5; n++) {

                        System.out.print(arr[m][n] + " | ");
                    }
                    System.out.println();
                }

                System.out.println();
                if (arr[i - 1][j - 1].equals(arr[r2 - 1][r3 - 1])) {
                    arr[r2 - 1][r3 - 1] = "x";
                    break;
                }

            } catch (Exception e) {
                System.out.println("You should only number and range of [ 1, 5]. Enter the numbers again");
            }
            scanner.nextLine();
        }
            scanner.close();

        System.out.println("Finally you have won!!!");
        System.out.println();
        System.out.println( "0 | 1 | 2 | 3 | 4 | 5 |");
            for (int i = 0; i < 5; i++) {
                System.out.print(i+1 +" | ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(arr[i][j] + " | ");
                }
                System.out.println();
            }
        }
    }

