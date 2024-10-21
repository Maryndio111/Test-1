import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Task>taskList1 = new ArrayList<>();// создаем пустой лист для  task
        taskList1.add(new Task(1,"задача№1", "реализовать задачу №1"));
        taskList1.add(new Task(2,"задача№2", "реализовать задачу №2"));
        taskList1.add(new Task(3,"задача№3", "реализовать задачу №3"));
        List<Task> taskList2= List.of (
                new Task(1,"задача№4", "реализовать задачу №4"),
                new Task(1,"задача№5", "реализовать задачу №5"),
                new Task(1,"задача№6", "реализовать задачу №6"),
                new Task(1,"задача№7", "реализовать задачу №7")
        );
        List<String>technogies1 = List.of("Java","go","lll");
        List<String>technogies2 = List.of("Java","c++","lol","go");

        List<Programmer>programmers = List.of(
                new Programmer("jack", technogies1),
                new Programmer("mary", technogies2),
                new Programmer("tom", List.of("java","go", "mmm"))
        );
        for (int i = 0; i <programmers.size(); i++) {
            programmers.get(i).addTask(taskList1.get(0));
        }
        for (int i = 0; i <programmers.size(); i++) {
            System.out.println(programmers.get(i));

        }
        System.out.println("---------------------добавили задачу мари");
        programmers.get(1).addTask(taskList1.get(1));

        for (int i = 0; i< programmers.size(); i++){
            System.out.println("есть ли у джека задача?");

        }
        System.out.println(" have oder nein task jack");
        System.out.println(programmers.get(1).checkTaskByNumber(2));
        System.out.println(" have oder nein task mary");
        System.out.println(programmers.get(0).checkTaskByNumber(2));



        }

      /*  Programmer programmer=new Programmer("Mary", null);
        System.out.println(programmer);
         programmer.addTask(new Task( 1,"add task", "task"));
        System.out.println(programmer);*/


    }
