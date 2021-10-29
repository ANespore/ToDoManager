package ToDoManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public String createTask(String existListName, String TaskName,String description,String dueDate,String taskStatus) {

        try {
            managerRepository.createTask(existListName,TaskName,description,dueDate,taskStatus);
            return "Task created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating task!";

        }


    }


    public ArrayList getAllLists() {
        try {
            return managerRepository.getAllLists();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Tasks> getAllTasks(String existListName2) {

        try {
            return managerRepository.getAllTasks(existListName2);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String deleteTask (String deleteList, int id) {
        try {
            managerRepository.delete(deleteList,id);
            return"Task deleted successfully!";
        } catch (SQLException e) {
            System.out.println(e);
            return "Error deleting task!";
        }
    }



}
