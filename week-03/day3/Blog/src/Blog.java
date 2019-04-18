import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> posts = new ArrayList<>();
  public Blog (List <BlogPost> posts) {
    this.posts = posts;
  }
  public void delete (int index) {
    posts.remove(index);
  }

  public void update (int index,BlogPost post) {
    posts.remove(index);
    posts.add(index, post);

  }

}
