import ToDoManager.ManagerController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("Welcome to do Manager, please choose option ");
            System.out.println("1. Create new list");
            System.out.println("2. Delete list");
            System.out.println("3. Add new task to list");
            System.out.println("4. Show all existing lists");
            System.out.println("5. View all tasks in list");
            System.out.println("6. Update task");
            System.out.println("7. Delete task");
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
                    System.out.println("Please enter list name You want to delete");
                    System.out.println(managerController.getAllLists());
                    String delList = scanner.nextLine();
                    System.out.println( managerController.deleteList(delList));
                    break;
                case "3":
                    System.out.println("Please enter list name You want to use");
                    System.out.println(managerController.getAllLists());
                    String existListName = scanner.nextLine();
                    System.out.println("Please enter task name");
                    String taskName = scanner.nextLine();
                    System.out.println("Please enter task description");
                    String description = scanner.nextLine();
                    System.out.println("Please enter due date");
                    String dueDate = scanner.nextLine();
                    System.out.println("Please enter task status");
                    String taskStatus = scanner.nextLine();
                    System.out.println( managerController.createTask(existListName,taskName,description,dueDate,taskStatus));
                    break;

                case "4":
                    System.out.println(managerController.getAllLists());
                    break;
                case "5":
                    System.out.println("Please enter list name You want to use");
                    System.out.println(managerController.getAllLists());
                    String existListName2 = scanner.nextLine();
                    System.out.println(managerController.getAllTasks(existListName2));
                    break;
                case "6":
                    System.out.println("Please enter list name You want to use");
                    System.out.println(managerController.getAllLists());
                    String existListName3 = scanner.nextLine();
                    System.out.println("Please enter id of task You want to update");
                    System.out.println(managerController.getAllTasks(existListName3));
                   // String idOfTask = intScanner.nextInt();
                case "7":
                    System.out.println("Please enter list name You want use");
                    System.out.println(managerController.getAllLists());
                    String deleteList = scanner.nextLine();
                    System.out.println("Please enter task id You want to delete");
                    System.out.println(managerController.getAllTasks(deleteList));
                    int idTaskDel = intScanner.nextInt();
                    System.out.println(managerController.deleteTask(deleteList,idTaskDel));


                    break;


            }


        }
        while (!userInput.equalsIgnoreCase("Quit")) ;
        return;
    }
}