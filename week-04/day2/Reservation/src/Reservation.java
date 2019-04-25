import java.util.ArrayList;
import java.util.List;

public class Reservation implements Reservatory {
  protected String reservation;
  protected final String codeBits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  protected final String[] dowArray = {"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN"};

  public Reservation(){
    this.setReservation();
  }

  public void setReservation(){
    System.out.println(("#Booking " + getCodeBooking() + " for " + getDowBooking()));
  }
  public String getDowBooking() {
    int num = (int)(Math.random() * 7);
    return dowArray[num];
    }

  @Override
  public String getCodeBooking() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 8; i++){
      int rand = (int) (Math.random() * 36);
      stringBuilder.append(codeBits.charAt(rand));
    }
    String result = stringBuilder.toString();
    return result;
  }
  public void generateReservation(int numOfReservations){
    if (numOfReservations <= 0){
      System.out.println( "That's it.");
    }else{
      Reservation res = new Reservation();
      generateReservation(numOfReservations -= 1);
  }
  }
}
