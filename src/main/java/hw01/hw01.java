package hw01;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class hw01  {
    public static void main(String[] args) {

        System.out.print("Hi! First of all please write your name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("**************************");
        System.out.println("*  Let the game, begin ! *");
        System.out.println("**************************");

        int[] arr = new int[]{};

        int guess = myRandomMethod();

        System.out.println();
        while (true){
            try {
                int num  = scanner.nextInt();
                arr =addArrayAlgorithm(arr.length, arr, num);
                if (guess==num){
                    System.out.println("Congratulations you found the correct answer , " + name);
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

    public static int  myRandomMethod(){

        String[][] array = {
                {"When was born Hazrat Muhammad? ", "571"},
                {"When did the World War II begin? " , "1939"},
                {"When did the World War I begin? " , "1914"},
                {"When did Azerbaijan gain independence? ", "1918"},
                {"When happened Khojaly Massacre in azerbaijan? ", "1992"},
                {"When was   founded Google? ", "1998"},
                {"When was mcdonald's founded? ", "1955"},
                {"When was Microsoft founded? ", "1975"},
                {"When was Apple founded? ", "1976"},
                {"When was the Antarctic discovered?", "1773"},
                {"When created Facebook? ", "2004"},
        };

        Random random =new Random();
        final int MIN = 0;
        final int MAX = array.length-1;

        int randomNumber = random.nextInt(MAX-MIN+1) + MIN; //random.nextInt(max - min + 1) + min
        System.out.println(array[randomNumber][0]);

        int a = Integer.parseInt(array[randomNumber][1]);
        return a;
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
