public  class Domino implements Comparable<Domino>{

  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int compareTo(Domino domino) {

    return Integer.compare(this.getLeftSide(), domino.getLeftSide());
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }
}
