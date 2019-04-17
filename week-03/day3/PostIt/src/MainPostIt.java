public class MainPostIt {
  public static void main(String[] args) {
   PostIt example1 = new PostIt("orange", "Idea 1", "blue");
   PostIt example2 = new PostIt("pink" , "Awesome", "black");
   PostIt example3 = new PostIt ("yellow", "Superb", "green" );

    System.out.println(example1.textColor);
    System.out.println(example2.text);
    System.out.println(example3.backgroundColor);

    example1.text = "Even better!";
    System.out.println(example1.text);

  }
}
