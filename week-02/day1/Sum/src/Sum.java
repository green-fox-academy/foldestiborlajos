public class Sum {
    public static void main(String[] args) {
        System.out.println (sum (3));

    }
    public static int sum (int a)
    {   int s = 0;


        for (int j = 0; a >= j; j++)
        { s += j;
        }

        return (s);



    }
}
