import java.util.ArrayList;

public class ToDoMain {
  public static void main(String[] args) {
  ToDoList toDoList = new ToDoList();


  ToDo milk = new ToDo("Get milk");
  ToDo obs = new ToDo("Remove obstacles");
  ToDo stand = new ToDo("Stand up");
  ToDo eat = new ToDo("Eat lunch");

  obs.complete();
  eat.complete();

  toDoList.add(milk);
  toDoList.add(obs);
  toDoList.add(stand);
  toDoList.add(eat);

  for(int i = 0; i < toDoList.thingsToDo.size()-1; i++){
    System.out.println(toDoList.thingsToDo.get(i).compareTo(toDoList.thingsToDo.get(toDoList.thingsToDo.indexOf(i)+1)));
      if(toDoList.thingsToDo.get(i).compareTo(toDoList.thingsToDo.get(toDoList.thingsToDo.indexOf(i+1))) != 0){
       toDoList.swap(i+1);
      }


  }




  System.out.println(toDoList);
}
}


