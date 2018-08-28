package us.scottgraf;

public class TicketCheckOut {
    private FeesMaker feesMaker = new FeesMaker();
    private static TicketCheckOut ourInstance = new TicketCheckOut();

    public static TicketCheckOut getInstance() {
        return ourInstance;
    }

    private TicketCheckOut() {
    }

        public void ticketCheckOut () {
            CheckInRandomTime.getInstance().setRandomTimeIn();
            CheckOutRandomTime.getInstance().setRandomTimeOut();
           int x = CheckOutRandomTime.getInstance().getCheckOutRandomTime();
           int y = CheckInRandomTime.getInstance().getCheckInRandomTime();

            System.out.println("Best Value Parking Garage ");
            System.out.println("========================= ");
            System.out.println(" ");
            System.out.println("Receipt for a vehicle " + CheckOut.getInstance().idList());
            System.out.println(" ");

            if (y < 12) {
                System.out.println((x + 12) - y + " hours parked " + y + "am" + " - " + x + "pm");
            } else
                System.out.println((x + 12) - y + " hours parked " + y + "pm" + " - " + x + "pm");


            System.out.println("$" + feesMaker.miniMaxFee().execute());

    }

}
