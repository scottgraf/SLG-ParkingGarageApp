package us.scottgraf;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIn {
    private Scanner keyboard = new Scanner(System.in);
    private static String choice;
    private int specialEvent = 0;
    private static CheckIn ourInstance = new CheckIn();

    private ArrayList specialEventTicket = new ArrayList();


    public static CheckIn getInstance() {
        return ourInstance;
    }

    private CheckIn() {
    }

    public void print(){

        boolean pick = true;
            while (pick) {

                System.out.println("Best Value Parking Garage ");
                System.out.println("========================= ");
                System.out.println(" ");
                System.out.println("1) Check/In ");
                System.out.println("2) Special Event ");
                System.out.println("3) Close Garage");

                choice = keyboard.nextLine();

                switch (choice) {
                    case "1":
                        CheckOut.getInstance().checkOut();
                        break;
                    case "2":

                        specialEventTicket.add(specialEvent++);
                        TicketSpecialEvent.getInstance().ticketSpecialEvent();
                        break;
                    case "3":
                        pick = false;
                        DailySummary.getInstance();
                        break;
                    default:
                        System.out.println("You need to pick an option");


                }

            }
        }

    public int getSpecialEvent() {

        for (specialEvent = 0; specialEvent < specialEventTicket.size(); specialEvent++) {

        }
        return specialEventTicket.size();
        }

    }

