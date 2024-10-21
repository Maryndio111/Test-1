import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String name;
    private List<Task>tasks ;
    private List<String>technogies;

    public Programmer(String name, List<String> technogies) {
        this.name = name;
        this.technogies = technogies;
    tasks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name + " " + technogies +
                ", tasks=" + tasks ;
    }
    public void addTask (Task task){
        tasks.add(task);
    }
    public List<Task>getTasks(){
        return tasks;
    }
    public boolean checkTaskByNumber(int numer){
        for (int i = 0; i <tasks.size(); i++) {
            if (tasks.get(i).getNumer()==numer){
                return true;
            }

        }
        return false;
    }
}
