public class Gnirts implements CharSequence{
  String str;

  Gnirts(String str){
    this.str = str;
  }



  public int length() {
    return str.length();
  }

  public char charAt(int index) {
    return this.str.charAt(str.length()-index);
  }

  public CharSequence subSequence(int start, int end) {
    return null;
  }
}


