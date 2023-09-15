package bo.edu.ucb.practica_contenedor.dto;

import java.util.Date;

public class Task {
    private int taskId;
    private String name;
    private Date dueDate;
    private String status;

    public Task(int taskId, String name, Date dueDate, String status){
        this.taskId = taskId;
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "toString";
    }
}
