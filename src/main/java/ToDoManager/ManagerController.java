package ToDoManager;

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
}
