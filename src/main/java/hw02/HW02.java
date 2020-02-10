package hw02;

import java.util.Random;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {

        twoDArray();
    }

    public static void twoDArray(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int MIN = 0;
        final int MAX = 5;

        int randomNumber = random.nextInt(MAX-MIN+1) + MIN; //random.nextInt(max - min + 1) + min

        int arr[][] = new int[5][5];


        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
