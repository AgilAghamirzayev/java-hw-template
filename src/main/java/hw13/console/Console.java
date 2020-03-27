package hw13.console;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Scanner;

public class Console implements Serializable{
    private static final long serialVersionUID = 1L;


    private static Executor executor = new Executor();
    private static UserMenu userMenu = new UserMenu();
    private static EditFamily editFamily = new EditFamily();
    private static Scanner scanner = new Scanner(System.in);


    public static void editFamily() throws ParseException, IOException {

        boolean exit = false;
        while (!exit) {
            System.out.println(editFamily.show());
            String  s = scanner.nextLine();
            switch (s) {
                case "1":
                    executor.bornChid();
                    break;
                case "2":
                    executor.adoptChild();
                    break;
                case "3":
                    executeCommand();
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid command!!!");
            }
        }
    }

    public static void executeCommand() throws ParseException, IOException {
        boolean exit = false;
        while (!exit) {
            System.out.println(userMenu.show());
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    executor.fillWithTestData();
                    break;
                case "2":
                    executor.displayFamiliesByIndex();
                    break;
                case "3":
                    executor.getFamiliesBiggerThan();
                    break;
                case "4":
                    executor.getFamiliesLessThan();
                    break;
                case "5":
                    executor.countFamiliesWithMemberNumber();
                    break;
                case "6":
                    executor.createNewFamily();
                    break;
                case "7":
                    executor.deleteFamily();
                    break;
                case "8":
                    exit = true;
                    editFamily();
                    break;
                case "9":
                    executor.deleteOlderChildren();
                    break;
                case "10":
                    System.out.println("Bye ;)");
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid command!!!");
                    exit = true;
                    executeCommand();
            }
        }
    }
}
