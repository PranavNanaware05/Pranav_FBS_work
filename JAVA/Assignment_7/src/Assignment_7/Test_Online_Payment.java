	package Assignment_7;
	
	
	abstract class Payment
	{
		String paymentId;
		double amount;
		String payerName;
		String  status;
		 String getPaymentId() {
			return paymentId;
		}
		 void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}
		 double getAmount() {
			return amount;
		}
		 void setAmount(double amount) {
			this.amount = amount;
		}
		 String getPayerName() {
			return payerName;
		}
		 void setPayerName(String payerName) {
			this.payerName = payerName;
		}
		 String getStatus() {
			return status;
		}
		 void setStatus(String status) {
			this.status = status;
		}
		 Payment(String paymentId, double amount, String payerName, String status) {
			
			this.paymentId = paymentId;
			this.amount = amount;
			this.payerName = payerName;
			this.status = status;
		}
		
		 Payment() {
	        this.paymentId = "DEFAULT_ID";
	        this.amount = 0.0;
	        this.payerName = "UNKNOWN";
	        this.status = "PENDING";
	    }
		 
		 void printSummary() {
			    System.out.println("\n----- Payment Summary -----");
		        System.out.println("Payment ID: " + paymentId);
		        System.out.println("Payer Name: " + payerName);
		        System.out.println("Amount    : " + amount);
		        System.out.println("Status    : " + status);
		 }
		 final void process()
		 {
			 System.out.println("\nProcessing Payment ID: " + paymentId);
	
		        if (validate()) {
		            deductAmount();
		            sendNotification();
		            status = "SUCCESS";
		        } else {
		            status = "FAILED";
		            System.out.println("Payment validation failed.");
		        }
		 }
		 abstract boolean validate();
		 abstract void deductAmount();
		 abstract void sendNotification();
	}
	//class Payment Ends here
	
	
	class CardPayment extends Payment
	{
		String cardNumber;
		String cvv;
		
		
		public CardPayment(String paymentId, double amount, String payerName, String status,String cardNumber,String cvv) {
			super(paymentId, amount, payerName, status);
			this.cardNumber=cardNumber;
			this.cvv=cvv;
		}
		public String getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public String getCvv() {
			return cvv;
		}
		public void setCvv(String cvv) {
			this.cvv = cvv;
		}
		boolean validate()
		{
			System.out.println("Validating card details...");
			if(cardNumber.length()==16&&cvv.length()==3&&amount>0)
			{
				System.out.println("Card is validate");
				return true;
			}
			else
			{
				System.out.println("Card is not validate");
				return false;
			}
			
			
		}
		void deductAmount()
		{
			System.out.println("Deducting " + amount + " from card ending with "
	                + cardNumber);
		}
		void sendNotification()
		{
			System.out.println("SMS sent: Card payment successful.");
		}
		
	}
	
	class UPIPayment extends Payment
	{
		String upiId;
		UPIPayment(String paymentId, double amount,
	            String payerName, String status, String upiId) {
	           super(paymentId, amount, payerName, status);
	            this.upiId = upiId;
	          }
	
		boolean validate()
		{
		    if(upiId.contains("@") && amount>=1 && amount<=100000)
		    {
		        System.out.println("UPI validation successful.");
		        return true;
		    }
		    else
		    {
		        System.out.println("UPI validation not successful.");
		        return false;
		    }
		}
		void deductAmount()
		{
			 System.out.println("Deducting " + amount + " from UPI ID: " + upiId);
		}
		void sendNotification()
		{
			System.out.println("Sending UPI payment confirmation to " + payerName);	
		}
	}
	class Test_Online_Payment {
	    public static void main(String[] args) {

	        Payment p1 = new CardPayment(
	                "P101", 5000, "Pranav", "PENDING",
	                "1234567812345678", "123");

	        Payment p2 = new UPIPayment(
	                "P102", 2000, "Rahul", "PENDING",
	                "rahul@upi");

	        Payment p3 = new CardPayment(
	                "P103", -100, "Amit", "PENDING",
	                "1234", "12");

	        Payment[] payments = {p1, p2, p3};

	        // Normal for loop
	        for (int i = 0; i < payments.length; i++) {
	            payments[i].process();
	            payments[i].printSummary();
	        }
	    }
	}