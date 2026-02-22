package assignment_5;

class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    void display() {
        System.out.println("Amount: " + amount);
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void display() {
        display();
        System.out.println("Card Number: " + cardNumber);
    }
}

class UpiPayment extends Payment {
    private String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    void display() {
        super.display();
        System.out.println("UPI ID: " + upiId);
    }
}

 class PaymentTest {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment(2500, "1234-5678");
        c.display();

        System.out.println();

        UpiPayment u = new UpiPayment(1200, "pranav@upi");
        u.display();
    }
}