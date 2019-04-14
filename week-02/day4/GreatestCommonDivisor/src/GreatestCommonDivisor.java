public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(GreatestCommonDivisor(252, 105));
    }

    public static int GreatestCommonDivisor(int a, int b) {



        if (a % b ==0) {
            return b;
        } else {if (a>b){
             return GreatestCommonDivisor(a-b, b);}
             else {return GreatestCommonDivisor(b-a, a);}

        }
    }
}