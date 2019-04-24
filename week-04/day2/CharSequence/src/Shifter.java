public class Shifter implements CharSequence{
  String str;
  int position;

  public Shifter(String str, int position){
    this.str = str;
    this.position = position;
  }

  @Override
  public int length() {
    return str.length();
  }

  @Override
  public char charAt(int index) {
    return this.str.charAt(index + this.position);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
