package p1;

import java.util.Arrays;

class EmptyNameException extends Exception {
	public String toString() {
		return "Student name cannot be empty";
	}
} // class EmptyNameException ends here

class UnderageException extends Exception {

	@Override
	public String toString() {
		return "Student must be at least 17 years old";
	}

}// class UnderageException ends here

class InvalidPercentageException extends Exception {

	@Override
	public String toString() {
		return "Percentage must be between 0 and 100\"";
	}

}// class InvalidPercentageException ends here

class NotFitForAdmissionException extends Exception {
	public String toString() {
		return "Student not eligible for admission";
	}
}// class NotFitForAdmissionException ends here

class FeesNotPaidException extends Exception {
	public String toString() {
		return "Fees not paid";
	}
}// class FeesNotPaidException ends here

class InsufficientFeesException extends Exception {
	public String toString() {
		return "Minimum 30% fees must be paid";
	}
}

class AdmissionForm {

	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;

	public AdmissionForm(String studentName, int age, double percentage, double courseFees, double feesPaid) {

		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}

	public void validateForm() throws EmptyNameException, UnderageException, InvalidPercentageException,
			NotFitForAdmissionException, FeesNotPaidException, InsufficientFeesException {

		if (studentName == null || studentName.trim().isEmpty() ) {
			throw new EmptyNameException();
		}

		if (age < 17) {
			throw new UnderageException();
		}

		if (percentage < 0 || percentage > 100) {
			throw new InvalidPercentageException();
		}

		if (percentage < 35) {
			throw new NotFitForAdmissionException();
		}

		if (feesPaid == 0) {
			throw new FeesNotPaidException();
		}

		if (feesPaid < courseFees * 0.30) {
			throw new InsufficientFeesException();
		}

		System.out.println("Admission Successful!");
	}

}
//class AdmissionForm ends here
public class Test {

	public static void main(String[] args) {
		 AdmissionForm f1 = new AdmissionForm("Rahul", 19, 65, 50000, 20000);
		 
		 try {
			 f1.validateForm();
		 } catch (EmptyNameException e) {
	            System.out.println(e);
	        }
	        catch (UnderageException e) {
	            System.out.println(e);
	        }
	        catch (InvalidPercentageException e) {
	            System.out.println(e);
	        }
	        catch (NotFitForAdmissionException e) {
	            System.out.println(e);
	        }
	        catch (FeesNotPaidException e) {
	            System.out.println(e);
	        }
	        catch (InsufficientFeesException e) {
	            System.out.println(e);
	        }

	}

}
