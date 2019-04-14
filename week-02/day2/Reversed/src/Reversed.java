import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Reversed {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reversed (reversed));

    }


    public static String reversed(String str) {


        String res ="";
        for (int i = 0; i < str.length(); i++) {
            char k =str.charAt(str.length() - (i+1));
            String s =String.valueOf(k);
              res= res.concat(s);
            }

          return res;






    }
}