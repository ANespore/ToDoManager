package ToDoManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagerController {

    ManagerRepository managerRepository = new ManagerRepository();
    public  String createList(String listName) {

        try {
            managerRepository.createList(listName);
            return "List created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating list!";

        }


    }

    public  String deleteList(String delList) {

        try {
            managerRepository.deleteList(delList);
            return "List deleted successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error deleting the list!";

        }


    }

    public String createTask(String TaskName,String description,String dueDate,String taskStatus) {

        try {
            managerRepository.createTask(TaskName,description,dueDate,taskStatus);
            return "Task created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating task!";

        }


    }

}
