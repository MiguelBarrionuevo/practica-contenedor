package bo.edu.ucb.practica_contenedor.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import bo.edu.ucb.practica_contenedor.bl.TaskBl;
import bo.edu.ucb.practica_contenedor.dto.Task;

import java.util.Map;

class TaskAPI {
    private TaskBl taskBl;

    
    public TaskAPI(){
        taskBl = new TaskBl();
    }
    
    @PostMapping("/task")
    public Map create(Task task){
        taskBl.create(task);
        return null;
    }
    
    @GetMapping("/task")
    public Map listAll(){
        return (Map) taskBl.listAll();
    }
    
    @DeleteMapping("/task/{id}")
    public Map delete(int taskId){
        taskBl.delete(taskId);
        return null;
    }
}
