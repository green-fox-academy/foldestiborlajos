public class Factorial {
    public static void main(String[] args) {

        System.out.println( factorio(11));
    }
    public static int factorio (int a)
    {
        int j = 1;
        for (int i =1; i <= a; i++) {
            j *= i;
        }
        return (j);
    }
}
