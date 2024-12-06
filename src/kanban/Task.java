package kanban;

import user.User;

import java.util.Objects;

public class Task {
    private String description;
    private TaskStatus status;
    private User user;

    public Task(String description) {
        this.description = description;
        this.user = null;
        status = TaskStatus.NEW;
    }

    public void assignUser(User user) {
        this.user = user;
        status = TaskStatus.IN_PROGRESS;
    }

    public void complete(){
        status = TaskStatus.DONE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}