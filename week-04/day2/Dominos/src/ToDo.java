public class ToDo implements Comparable<ToDo> {
  private String description;
  private boolean completed;

  public ToDo(String description) {
    this.description = description;
  }

  public void complete() {
    this.completed = true;
  }

  public int compareTo(ToDo action){
    int result = Boolean.compare(this.completed, action.completed);
     if (result != 0){
       return result;
     }else {this.description.compareTo(action.description);
     }
     return result;
  }


  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + description;
  }
}

