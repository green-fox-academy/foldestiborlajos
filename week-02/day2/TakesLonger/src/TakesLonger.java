public class TakesLonger { public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    StringBuilder quoteBuild = new StringBuilder(quote);
      String in = " always takes longer than";
      quoteBuild.insert(20, in);

    System.out.println(quoteBuild);

}
}

