package ToDoManager;

import Database.DBHandler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ManagerRepository {

    DBHandler dbHandler = new DBHandler();

    public   void createList (String listName) throws SQLException {

        String query = "Create table $listName (id int primary key not null auto_increment, TaskName VARCHAR (255) not null,description VARCHAR (255) not null, dueDate VARCHAR (255) not null,taskStatus VARCHAR (255) not null)";
        String queryNew =query.replace("$listName",listName);
        PreparedStatement preparedStatement  = dbHandler.getConnection().prepareStatement(queryNew);

        preparedStatement.execute();
        preparedStatement.close();
    }

    public   void deleteList (String delList) throws SQLException {

        String query = "Drop table if exists $listName";
        String queryNew =query.replace("$listName",delList);
        PreparedStatement preparedStatement  = dbHandler.getConnection().prepareStatement(queryNew);

        preparedStatement.execute();
        preparedStatement.close();
    }

    public void createTask (String existListName, String TaskName,String description, String dueDate,String taskStatus) throws SQLException{
        String query = "INSERT INTO $existListName (TaskName,description, dueDate, taskStatus) VALUES (?,?,?,?)";
        String queryNew =query.replace("$existListName",existListName);

        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(queryNew);


        preparedStatement.setString(1, TaskName);
        preparedStatement.setString(2, description);
        preparedStatement.setString(3, dueDate);
        preparedStatement.setString(4, taskStatus);

        preparedStatement.execute();
        preparedStatement.close();

    }

    public ArrayList getAllLists() throws SQLException{
        String query = "SHOW TABLES";

        Statement statement = dbHandler.getConnection().createStatement();
        ResultSet results = statement.executeQuery(query);

        ArrayList lists = new ArrayList<>();

        while(results.next()){

            String listName = results.getString("Tables_in_todomanager");


            lists.add(listName);

        }
        return lists;
    }

    public static ArrayList<Tasks> getAllTasks(String existListName2) throws SQLException {
        String query = "SELECT * FROM $existListName2";
        String queryNew =query.replace("$existListName2",existListName2);

        Statement statement = DBHandler.getConnection().createStatement();
        ResultSet results = statement.executeQuery(queryNew);

        ArrayList<Tasks> task= new ArrayList<>();

        while (results.next()) {
            int id = results.getInt("id");
            String TaskName = results.getString("TaskName");
            String description = results.getString("description");
            String dueDate = results.getString("dueDate");
            String taskStatus = results.getString ("taskStatus");

            Tasks tasks = new Tasks(id, TaskName, description, dueDate, taskStatus);
            task.add(tasks);
        }

        return task;
    }

    public static void delete(String deleteList, int id) throws SQLException {
        String query = "DELETE FROM $deleteList WHERE id=?";
        String queryNew =query.replace("$deleteList",deleteList);

        PreparedStatement preparedStatement = DBHandler.getConnection().prepareStatement(queryNew);
        preparedStatement.setInt(1, id );

        preparedStatement.execute();
        preparedStatement.close();
    }


    public void updateTask (String existListName3, int idOfTask, String fieldToUpdate,String newValue) throws SQLException {
        String query = "Update $existListName3 SET $fieldToUpdate = ?  where id = ?" ;
        String queryNew =query.replace("$existListName3",existListName3);
        String queryFinal = queryNew.replace("$fieldToUpdate",fieldToUpdate);
        PreparedStatement preparedStatement =dbHandler.getConnection().prepareStatement(queryFinal);
        preparedStatement.setString(1,newValue);
        preparedStatement.setInt(2,idOfTask);

        preparedStatement.execute();
        preparedStatement.close();


    }




}
