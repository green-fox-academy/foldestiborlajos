import java.util.ArrayList;
import java.util.Collections;

public class ToDoMain {
  public static void main(String[] args) {
  ToDoList toDoList = new ToDoList();


  ToDo milk = new ToDo("Get milk");
  ToDo obs = new ToDo("Remove obstacles");
  ToDo stand = new ToDo("Stand up");
  ToDo eat = new ToDo("Eat lunch");
  ToDo elev = new ToDo("Elevate yourself");
  ToDo sit = new ToDo ("Sit down for ten minutes");

  obs.complete();
  eat.complete();
  elev.complete();

  toDoList.add(milk);
  toDoList.add(obs);
  toDoList.add(stand);
  toDoList.add(eat);
  toDoList.add(elev);

  toDoList.thingsToDo.add(4, sit);

  toDoList.thingsToDo.sort(ToDo::compareTo);
  Collections.reverse(toDoList.thingsToDo);

  System.out.println(toDoList);
}
}


