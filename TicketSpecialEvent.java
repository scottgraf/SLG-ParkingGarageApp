package us.scottgraf;

public class TicketSpecialEvent {
    private static TicketSpecialEvent ourInstance = new TicketSpecialEvent();

    public static TicketSpecialEvent getInstance() {
        return ourInstance;
    }

    private TicketSpecialEvent() {
    }
    public void ticketSpecialEvent(){
        FeesMaker feesMaker = new FeesMaker();

        System.out.println("Best Value Parking Garage ");
        System.out.println("========================= ");
        System.out.println(" ");
        System.out.println("Receipt for a vehicle" + "");
        System.out.println(" ");
        System.out.println("Special Event");
        System.out.println(" ");
        System.out.println("$" + feesMaker.specialEvent().execute());
    }

}
