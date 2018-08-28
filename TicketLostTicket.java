package us.scottgraf;

public class TicketLostTicket {

    private static TicketLostTicket ourInstance = new TicketLostTicket();

    public static TicketLostTicket getInstance() {
        return ourInstance;
    }

    private TicketLostTicket() {
    }
        public void ticketLostTicket (){
            FeesMaker feesMaker = new FeesMaker();

            System.out.println("Best Value Parking Garage ");
            System.out.println("========================= ");
            System.out.println(" ");
            System.out.println("Receipt for a vehicle " + CheckOut.getInstance().idList());
            System.out.println(" ");
            System.out.println("Lost Ticket");
            System.out.println(" ");
            System.out.println("$" + feesMaker.lostTicket().execute());

        }

}
