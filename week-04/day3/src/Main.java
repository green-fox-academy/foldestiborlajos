public class Main {
  public static void main(String[] args) {
    Sum sum = new Sum();

    sum.sumList.add(3);
    sum.sumList.add(5);
    sum.sumList.add(7);
    sum.sumList.add(14);
    sum.sumList.add(0);

    System.out.println(sum.sum());
  }
}
