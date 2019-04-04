public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a = 2 * a;
        System.out.println(a);

        int b = 100;
        b = b - 7;
        System.out.println(b);

        int c = 44;
        c = 2 * c;
        System.out.println(c);

        int d = 125;
        d = 125 / 5;
        System.out.println(d);

        int e = 8;
        e = e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean bigger = f1 > f2;
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;
        boolean dbigger = (2 * g1) > g2;
        System.out.println(dbigger);

        int h = 137598745;
        h = (h % 11);
        boolean divisible = h == 0;
        System.out.println(divisible);

        int i1 = 10;
        int i2 = 3;
        boolean res = i1 > (i2 * i2) && i1 < (i2 * i2 * i2);
        System.out.println(res);

        int j = 1521;
        boolean resj = j/3 > 0 || j / 5 > 0;
        System.out.println(resj);





    }
}
