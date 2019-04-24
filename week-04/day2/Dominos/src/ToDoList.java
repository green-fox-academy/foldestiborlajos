import java.util.ArrayList;
import java.util.List;

public class ToDoList{

   List<ToDo> thingsToDo;

  public ToDoList() {
   thingsToDo = new ArrayList<>();
    }

    public void add(ToDo action) {
      thingsToDo.add(action);
    }

    @Override
    public String toString() {
      String result = "";
      for(int i = 0; i < thingsToDo.size(); i++) {
        result += (i+1) + ". " + thingsToDo.get(i) + "\n";
      }
      return result;
    }
}

