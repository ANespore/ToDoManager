import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("Welcome to do Manager, please choose option ");
            System.out.println("1. Create new list");
            System.out.println("\n Enter Quit to end program ... ");
            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit":
                    System.out.println("Exiting application....");
                    break;

            }


        }
        while (!userInput.equalsIgnoreCase("Quit")) ;
        return;
    }
}