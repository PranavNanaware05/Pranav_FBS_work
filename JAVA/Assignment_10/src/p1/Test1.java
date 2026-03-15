package p1;

import java.util.Scanner;

class InvalidTicketNumberException extends Exception {
    @Override
    public String toString() {
        return "Invalid ticket number! Tickets must be greater than 0.";
    }
}//class InvalidTicketNumberException ends here

class TicketsSoldOutException extends Exception {
    @Override
    public String toString() {
        return "Sorry! Tickets are sold out.";
    }
}//class TicketsSoldOutException ends here

class MovieBooking
{
	static int ticketPrice = 200;
    static int remainingTickets = 50;
    public void bookTickets(int numberOfTickets) throws
    InvalidTicketNumberException,TicketsSoldOutException{
    	
    	if(numberOfTickets<=0)
    	{
    		 throw new InvalidTicketNumberException();
    	}
    	if (remainingTickets == 0 || numberOfTickets > remainingTickets) {
            throw new TicketsSoldOutException();
        }remainingTickets = remainingTickets - numberOfTickets;

        int totalAmount = numberOfTickets * ticketPrice;

        System.out.println("Booking Successful for \"3 Idiots\"!");
        System.out.println("Tickets booked: " + numberOfTickets);
        System.out.println("Total amount: ₹" + totalAmount);
    }

}
public class Test1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 MovieBooking booking = new MovieBooking();
		 while(true)
		 {
			 System.out.println("\nRemaining tickets: " + MovieBooking.remainingTickets);

	            if (MovieBooking.remainingTickets == 0) {
	                System.out.println("Sorry! Tickets are sold out.");
	                break;
	            }

	            System.out.print("Enter number of tickets: ");
	            int tickets = sc.nextInt();

	            try {
	                booking.bookTickets(tickets);
	            }
	            catch (InvalidTicketNumberException e) {
	                System.out.println(e);
	            }
	            catch (TicketsSoldOutException e) {
	                System.out.println(e);
	            }
	        }
		 }
	}


