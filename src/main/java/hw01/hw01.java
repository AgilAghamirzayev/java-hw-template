package hw01;
import java.util.*;
public class hw01  {
    public static void main(String[] args) {
        System.out.print("Hi! First of all please write your name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int[] arr = new int[]{};

        System.out.println("Let the game, begin !");

        int guess = myRandomMethod();

        while (true){
            System.out.println("Please enter a number in a range [0-100] ");
            try {
                int num  = scanner.nextInt();
                arr =addArrayAlgorithm(arr.length, arr, num);
                if (guess==num){
                    System.out.println("Congratulations, " + name);
                    break;
                } else if (num > guess){
                    System.out.println("Your number is too big. Please, try again.");
                } else {
                    System.out.println("Your number is too small. Please, try again.");
                }
            } catch (Exception e){
                System.out.println("This is not a number, You should enter a number");
            }
            scanner.nextLine();
        }

        sortArrayAlgorithm(arr);
        System.out.println("Your numbers: " + Arrays.toString(arr));
        scanner.close();
    }

    public static int myRandomMethod(){

        int[] array = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        Random random =new Random();
        final int MIN = 0;
        final int MAX = array.length-1;

        int randomNumber = random.nextInt(MAX-MIN+1) + MIN; //random.nextInt(max - min + 1) + min
        // I can use int randomNumber=random.nextInt(100); but the task must be performed using arrays
        return randomNumber;
    }


    public static int[] addArrayAlgorithm(int n, int[] arr, int x) {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }


    public static int[] sortArrayAlgorithm(int[] array) { // bubble sorting )
        boolean swapped;
        for (int j=0; j < array.length-1; j++) {
            swapped = false;
            for (int i = 0; i < array.length-j-1; i++) {
                if (array[i] < array[i+1]) {
                    int x = array[i];
                    array[i] = array[i+1];
                    array[i+1] = x;
                    swapped= true;
                }
            }
            if (swapped == false)
                break;
        }
        return array;
    }
}
