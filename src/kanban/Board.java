package kanban;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {

    }

    public void removeTask(Task task) {

    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return null;
    }

    public List<Task> getTasksByUser(User user) {
        return null;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public void print(){
        for(Task task : tasks){
            System.out.println(task.getDescription() + task.getStatus());
        }
    }
}
