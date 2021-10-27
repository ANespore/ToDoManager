package ToDoManager;

import Database.DBHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagerRepository {

    DBHandler dbHandler = new DBHandler();

    public   void createList (String listName) throws SQLException {

        String query = "Create table $listName (id int primary key not null auto_increment, TaskName VARCHAR (255) not null, dueDate VARCHAR (255) not null,taskStatus int not null)";
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
}
