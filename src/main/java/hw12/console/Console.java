package hw12.console;

import java.text.ParseException;
import java.util.Scanner;

public class    Console  {

    private static Scanner scanner = new Scanner(System.in);
    private static Executor executor = new Executor();
    private static UserMenu userMenu = new UserMenu();
    private static EditFamily editFamily = new EditFamily();

    public static void editFamily() throws ParseException {

        boolean exit = false;
        while (!exit) {
            System.out.println(editFamily.show());
            int s = Integer.parseInt(scanner.nextLine());
            switch (s) {
                case 1:
                    executor.bornChid();
                    break;
                case 2:
                    executor.adoptChild();
                    break;
                case 3:
                    executeCommand();
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid command!!!");
            }
        }
    }

    public static void executeCommand() throws ParseException {
        boolean exit = false;
        while (!exit) {
            System.out.println(userMenu.show());
            int s = Integer.parseInt(scanner.nextLine());
            switch (s) {
                case 1:
                    executor.fillWithTestData();
                    break;
                case 2:
                    executor.displayFamiliesByIndex();
                    break;
                case 3:
                    executor.getFamiliesBiggerThan();
                    break;
                case 4:
                    executor.getFamiliesLessThan();
                    break;
                case 5:
                    executor.countFamiliesWithMemberNumber();
                    break;
                case 6:
                    executor.createNewFamily();
                    break;
                case 7:
                    executor.deleteFamily();
                    break;
                case 8:
                    exit = true;
                    editFamily();
                    break;
                case 9:
                    executor.deleteOlderChildren();
                    break;
                case 10:
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
