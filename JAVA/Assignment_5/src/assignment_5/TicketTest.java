package assignment_5;

class Ticket {
    protected String passenger;
    protected double fare;

    public Ticket(String p, double f) {
        passenger = p;
        fare = f;
    }

    void display() {
        System.out.println("Passenger: " + passenger);
        System.out.println("Fare: " + fare);
    }
}

class MovieTicket extends Ticket {
     String seat;

    public MovieTicket(String p, double f, String s) {
        super(p, f);
        seat = s;
    }

    void display() {
        super.display();
        System.out.println("Seat: " + seat);
    }
}

class FlightTicket extends Ticket {
    String airline;

    public FlightTicket(String p, double f, String a) {
        super(p, f);
        airline = a;
    }

    void display() {
        super.display();
        System.out.println("Airline: " + airline);
    }
}

public class TicketTest {
    public static void main(String[] args) {
    	MovieTicket m1=new MovieTicket("Pranav", 250, "A10");
        
        FlightTicket f1=new FlightTicket("Ravi", 5500, "IndiGo");
        m1.display();
        f1.display();
    }
}