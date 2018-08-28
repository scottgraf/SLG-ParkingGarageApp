package us.scottgraf;

public class CheckOutRandomTime {
    private  int max = 11;
    private  int min = 1;
    private int range = max - min + 1;

    private int random;


    private static CheckOutRandomTime ourInstance = new CheckOutRandomTime();

    public static CheckOutRandomTime getInstance() {
        return ourInstance;
    }

    private CheckOutRandomTime() {
    }

    public int getCheckOutRandomTime() {
        return random;
    }

    public void setRandomTimeOut() {
        random = (int) (Math.random() * range) + min;

    }
}
