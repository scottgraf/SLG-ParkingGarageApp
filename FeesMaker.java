package us.scottgraf;

public class FeesMaker {
    private Fees lostTicketFeeCalculator = new LostTicketFeeCalculator();
    private Fees minimumMaximumFeeCalculator = new MinimumMaximumFeeCalculator();
    private Fees specialEventFeeCalculator = new SpecialEventFeeCalculator();

    public FeesMaker(){
    }

    public Fees lostTicket() {return lostTicketFeeCalculator;}
    public Fees miniMaxFee() {return minimumMaximumFeeCalculator;}
    public Fees specialEvent() {return specialEventFeeCalculator;}
}
