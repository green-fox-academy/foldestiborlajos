import java.sql.SQLOutput;

public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String i = "My todo:\n";
        String j = "- Download games\n";
        String k = "    -Diablo";
        String todoText2 = i.concat(todoText.concat(j.concat(k)));
        System.out.println(todoText2);

    }

}
