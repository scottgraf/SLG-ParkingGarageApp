package us.scottgraf;

public class CheckInRandomTime {
    private  int max = 12;
    private  int min = 7;
    private  int range = max - min + 1;
    private int random;


   private static CheckInRandomTime ourInstance = new CheckInRandomTime();

    public static CheckInRandomTime getInstance() {
        return ourInstance;
    }

    private CheckInRandomTime() {
    }
    public  int getCheckInRandomTime() {

        return random;
    }

    public void setRandomTimeIn() {
        random = (int) (Math.random() * range) + min;

    }



}
