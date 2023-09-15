package bo.edu.ucb.practica_contenedor.api;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import bo.edu.ucb.practica_contenedor.bl.TaskBl;
import bo.edu.ucb.practica_contenedor.dto.Task;

class TaskAPI {
    private TaskBl taskBl;

    
    public TaskAPI(){
        taskBl = new TaskBl();
    }
    
    @GetMapping("/")
    public Map create(Task task){
        taskBl.create(task);
        return null;
    }
    
    public Map listAll(){
        return (Map) taskBl.listAll();
    }
    
    public Map delete(int taskId){
        taskBl.delete(taskId);
        return null;
    }
}
