package us.scottgraf;

public class MinimumMaximumFeeCalculator implements Fees {
    int hours;

    public int getFee() {

            hours = (CheckOutRandomTime.getInstance().getCheckOutRandomTime() + 12) - CheckInRandomTime.getInstance().getCheckInRandomTime();

            if (hours <= 3) {
                return 5;

            } else if (hours > 3 && hours < 13) {
               int  x = (int)(5 + Math.ceil((hours - 3)));
                return (x);

            } else {
                return 15;
            }
    }

    public int execute () {

        return getFee();
    }
}
