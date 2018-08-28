package us.scottgraf;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {
    private Scanner keyboard = new Scanner(System.in);
    private String choice;
    private int lost = 0;
    private int checkInId = 0;
    private int checkIn = 0;
    private ArrayList id = new ArrayList();
    private ArrayList lostTicket = new ArrayList();
    private ArrayList CheckInNumber = new ArrayList();
    private FeesMaker feesMaker = new FeesMaker();

    private int totalCheckIns = 0;

     private int sum = 0;
    private ArrayList<Integer> totalCost = new ArrayList<>();
    private static CheckOut ourInstance = new CheckOut();

    public static CheckOut getInstance() {
        return ourInstance;
    }

    private CheckOut() {
    }

    public void checkOut(){
        boolean pick = true;
            while(pick) {
                System.out.println("Best Value Parking Garage ");
                System.out.println("========================= ");
                System.out.println(" ");
                System.out.println("1) Check/out ");
                System.out.println("2) Lost Ticket ");


                choice = keyboard.nextLine();

                switch (choice) {
                    case "1":
                        pick = false;
                        id.add(checkInId++);
                        CheckInNumber.add(checkIn++);
                        TicketCheckOut.getInstance().ticketCheckOut();
                        totalCost.add(feesMaker.miniMaxFee().execute());

                        break;
                    case "2":
                        pick = false;
                        id.add(checkInId++);
                        lostTicket.add(lost++);
                        TicketLostTicket.getInstance().ticketLostTicket();
                        break;
                    default:
                        System.out.println("You need to pick an option");

                }
            }
    }

    public int idList(){

        for (checkInId=0; checkInId<id.size(); checkInId++) {

        }
        return id.size();
    }

    public int getCheckInNumber(){
        for (checkIn=0; checkIn<CheckInNumber.size(); checkIn++) {

        }
        return CheckInNumber.size();

    }

    public int getLostTicket(){

        for (lost=0; lost<lostTicket.size(); lost++) {

        }
        return lostTicket.size();
    }

    public int getTotalCostCheckIns(){

        for (totalCheckIns=0; totalCheckIns<totalCost.size(); totalCheckIns++) {

        }

        return sum;
    }

    public void setTotalCostCheckIns() {
        for (totalCheckIns = 0; totalCheckIns < totalCost.size(); totalCheckIns++) {

            sum += totalCost.get(totalCheckIns);
        }
    }


}
