package p1;

import java.util.Scanner;

class InvalidUsernameException extends Exception
{

	
	public String toString() {
		return "Invalid Username!";
	}
	
}//class InvalidUsernameException ends here

class InvalidPasswordException extends Exception {

    @Override
    public String toString() {
        return "Invalid Password!";
    }
}//class InvalidPasswordException ends here

class Login
{
	String username="admin";
	String password="12345";
	
	public void validateUsername(String enteredUsername) throws InvalidUsernameException
	{
		if(!this.username.equals(enteredUsername))
		{
			throw new InvalidUsernameException();
		}
	}
	public void validatePassword(String enteredPassword) throws InvalidPasswordException
	{
		if(!this.password.equals(enteredPassword))
		{
			throw new InvalidPasswordException();
		}
	}
}
public class Login_test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Login l1=new Login();
		
		try {

		    System.out.println("enter user name:");
		    String user=sc.next();
		    l1.validateUsername(user);

		    int attempt=3;

		    while(attempt>0)
		    {
		        System.out.print("Enter password: ");
		        String pass = sc.next();

		        try {
		            l1.validatePassword(pass);
		            System.out.println("Login Successful!");
		            return;
		        }
		        catch (InvalidPasswordException e) {
		            attempt--;
		            System.out.println(e);
		            System.out.println("Remaining attempts: " + attempt);
		        }
		    }

		    System.out.println("Account Locked!");

		}
		catch (InvalidUsernameException e) {
		    System.out.println(e);
		}
	}
	}