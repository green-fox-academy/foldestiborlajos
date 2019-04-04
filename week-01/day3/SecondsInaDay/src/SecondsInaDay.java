public class SecondsInaDay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int Seconds = 1;
        int Minutes = 60 * Seconds;
        int Hours = 60 * Minutes;

        System.out.println( "The remaining seconds are :" + (24 * Hours - (currentHours * Hours) - (currentMinutes * Minutes) - (currentSeconds * Seconds)));

    }
}
