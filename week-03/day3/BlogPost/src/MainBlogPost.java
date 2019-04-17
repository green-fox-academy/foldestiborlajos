public class MainBlogPost {
  public static void main(String[] args) {



  BlogPost first = new BlogPost ("John Doe", "Lorem Ipsum","", "2000.05.04.");
  BlogPost second = new BlogPost ("Tim Urban", "Wait but why","", "2010.10.10.");
  BlogPost third = new BlogPost ("William Turton", "Lorem Ipsum","", "2017.03.28.");

  first.text = "Lorem ipsum dolor sit amet.";

  second.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

  third.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
          "When I asked to take his picture outside one of IBM’s New York City offices, " +
          "he told me that he wasn’t really into the whole organizer profile thing.";
 }
}
