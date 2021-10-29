import ToDoManager.ManagerController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("Welcome to do Manager, please choose option ");
            System.out.println("1. Create new list");
            System.out.println("2. Delete list");
            System.out.println("3. Add new task to list");
            System.out.println("\n Enter Quit to end program ... ");
            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit":
                    System.out.println("Exiting application....");
                    break;
                case "1":
                    System.out.println("Please enter list name");
                    String listName = scanner.nextLine();
                    System.out.println( managerController.createList(listName));
                    break;
                case "2":
                    System.out.println("Please enter list name");
                    String delList = scanner.nextLine();
                    System.out.println( managerController.deleteList(delList));
                    break;
                case "3":
                    System.out.println("Please enter task name");
                    String taskName = scanner.nextLine();
                    System.out.println("Please enter due date");
                    String dueDate = scanner.nextLine();
                    System.out.println("Please enter task status");
                    String taskStatus = scanner.nextLine();
                    System.out.println( managerController.createTask(taskName,dueDate,taskStatus));
                    break;


            }


        }
        while (!userInput.equalsIgnoreCase("Quit")) ;
        return;
    }
}