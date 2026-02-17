class BankAccount
{
    long accountNumber;
    String holderName;
    double currentBalance;
    double interestRate;
}//class BankAccount ends here


class Test_BankAccount
{
    public static void main(String args[])
    {
        BankAccount b1 = new BankAccount();//reference

        System.out.println("HashCode        :" + b1);
        System.out.println("Account Number  :" + b1.accountNumber);
        System.out.println("Holder Name     :" + b1.holderName);
        System.out.println("Current Balance :" + b1.currentBalance);
        System.out.println("Interest Rate   :" + b1.interestRate);

        b1.accountNumber = 12345678901L;
        b1.holderName = "Pranav Nanaware";
        b1.currentBalance = 50000.00;
        b1.interestRate = 4.5;

        System.out.println("======== After Assigning values ========");
        System.out.println("Account Number  :" + b1.accountNumber);
        System.out.println("Holder Name     :" + b1.holderName);
        System.out.println("Current Balance :" + b1.currentBalance);
        System.out.println("Interest Rate   :" + b1.interestRate + "%");
    }
}
