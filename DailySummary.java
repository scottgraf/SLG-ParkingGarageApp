package us.scottgraf;

public class DailySummary {
    private static DailySummary ourInstance = new DailySummary();

    public static DailySummary getInstance() {
        return ourInstance;
    }

    private DailySummary() {

        System.out.println("Best Value Parking Garage ");
        System.out.println("========================= ");
        System.out.println(" ");
        System.out.println("Activity to Date" );
        System.out.println(" ");

        FeesMaker feesMaker = new FeesMaker();
        CheckOut.getInstance().setTotalCostCheckIns();
        System.out.println("$" + CheckOut.getInstance().getTotalCostCheckIns() + " was collected from " + CheckOut.getInstance().getCheckInNumber()  + " Check Ins");

        System.out.println("$" + feesMaker.specialEvent().execute() * CheckIn.getInstance().getSpecialEvent() + " was collected from " + CheckIn.getInstance().getSpecialEvent() +  " Special Events");
        System.out.println("$" + feesMaker.lostTicket().execute() * CheckOut.getInstance().getLostTicket() + " was collected from " + CheckOut.getInstance().getLostTicket() +  " Lost Tickets");
        System.out.println("");
        System.out.println("");
        System.out.println("$" + (CheckOut.getInstance().getTotalCostCheckIns()  + (feesMaker.lostTicket().execute() * CheckOut.getInstance().getLostTicket()) + (feesMaker.specialEvent().execute() * CheckIn.getInstance().getSpecialEvent())) + " was collected overall" );
    }


}
