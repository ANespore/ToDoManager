package ToDoManager;



public class Tasks {

    public int id;
    public String TaskName;
    public String dueDate ;
    public String taskStatus ;

    public Tasks(String TaskName, String dueDate, String taskStatus) {
        this.TaskName = TaskName;
        this.dueDate = dueDate;
        this.taskStatus = taskStatus;
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
                '}';
    }
}
