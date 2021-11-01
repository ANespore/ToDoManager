package ToDoManager;



public class Tasks {

    public int id;
    public String TaskName;
    public String dueDate ;
    public String taskStatus;
    public String description ;

    public Tasks(int id, String TaskName, String description, String dueDate, String taskStatus ) {
        this.id = id;
        this.TaskName = TaskName;
        this.dueDate = dueDate;
        this.taskStatus = taskStatus;
        this.description = description;
    }

    public  Tasks () {

    }


    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", TaskName='" + TaskName + '\'' +
                ", dueDate=" + dueDate +
                ", taskStatus=" + taskStatus +
                ", description=" + description +
                '}';
    }
}
