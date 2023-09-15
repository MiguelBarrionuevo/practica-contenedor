package bo.edu.ucb.practica_contenedor.bl;
import bo.edu.ucb.practica_contenedor.dto.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskBl {

    List<Task> database = new ArrayList<>();

    //Listar
    public void create(Task task){
        database.add(task);
    }

    public List<Task> listAll(){
        return database;
    }

    public void delete(int taskId){
        for (int i=0; i< database.size();i++){
            Task t = database.get(i);
            if(t.getTaskId()== taskId){
                database.remove(i);
            }
        }
    }
}
