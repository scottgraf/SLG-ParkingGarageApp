package us.scottgraf;

public class LostTicketFeeCalculator implements Fees{
    public int getLostTicketFee(){
        return 25;
    }

    public int execute() {return getLostTicketFee();}
}
