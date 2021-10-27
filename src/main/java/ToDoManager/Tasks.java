package ToDoManager;



public class Tasks {

    public int id;
    public String TaskName;
    public String dueDate ;
    public char mark ;

    public Tasks(String TaskName, String dueDate, char mark) {
        this.TaskName = TaskName;
        this.dueDate = dueDate;
        this.mark = mark;
    }

    public  Tasks () {

    }


    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", TaskName='" + TaskName + '\'' +
                ", dueDate=" + dueDate +
                ", mark=" + mark +
                '}';
    }
}
