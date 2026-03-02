package Assignment_7;

import java.util.Scanner;


abstract class InsurancePolicy {

    String policyHolderName;
    double basePremium;

    public InsurancePolicy(String policyHolderName, double basePremium) {
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    
    abstract double calculatePremium();

    
    void printPolicyDetails() {
        System.out.println("\n----- Policy Details -----");
        System.out.println("Policy Holder Name : " + policyHolderName);
        System.out.println("Base Premium       : ₹" + basePremium);
        System.out.println("Final Premium      : ₹" + calculatePremium());
    }
}


class CarInsurance extends InsurancePolicy {

    int carAgeInYears;
    boolean hadAccidentInLastYear;
    double carValue;

    public CarInsurance(String policyHolderName, double basePremium,
                        int carAgeInYears, boolean hadAccidentInLastYear,
                        double carValue) {

        super(policyHolderName, basePremium);
        this.carAgeInYears = carAgeInYears;
        this.hadAccidentInLastYear = hadAccidentInLastYear;
        this.carValue = carValue;
    }

    double calculatePremium() {

        double premium = basePremium;

        // Car age loading
        if (carAgeInYears <= 3)
            premium += basePremium * 0.10;
        else if (carAgeInYears <= 7)
            premium += basePremium * 0.20;
        else
            premium += basePremium * 0.30;

        // Accident condition
        if (hadAccidentInLastYear)
            premium += basePremium * 0.25;
        else
            premium -= basePremium * 0.10;

        // High value car
        if (carValue > 1000000)
            premium += 2000;

        return premium;
    }
}


class HealthInsurance extends InsurancePolicy {

    int age;
    boolean isSmoker;
    boolean hasPreExistingDisease;

    public HealthInsurance(String policyHolderName, double basePremium,
                           int age, boolean isSmoker,
                           boolean hasPreExistingDisease) {

        super(policyHolderName, basePremium);
        this.age = age;
        this.isSmoker = isSmoker;
        this.hasPreExistingDisease = hasPreExistingDisease;
    }

    double calculatePremium() {

        double premium = basePremium;

        // Age loading
        if (age < 30)
            premium += basePremium * 0.10;
        else if (age <= 45)
            premium += basePremium * 0.25;
        else
            premium += basePremium * 0.40;

        // Smoking condition
        if (isSmoker)
            premium += basePremium * 0.30;
        else
            premium -= basePremium * 0.05;

        // Pre-existing disease
        if (hasPreExistingDisease)
            premium += basePremium * 0.20;

        return premium;
    }
}


public class Test_InsurancePolicy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InsurancePolicy policy = null;

        System.out.println("Select Policy Type:");
        System.out.println("1. Car Insurance");
        System.out.println("2. Health Insurance");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Policy Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Base Premium: ");
        double basePremium = sc.nextDouble();

        if (choice == 1) {

            System.out.print("Enter Car Age (in years): ");
            int carAge = sc.nextInt();

            System.out.print("Had accident in last year? (true/false): ");
            boolean accident = sc.nextBoolean();

            System.out.print("Enter Car Value: ");
            double carValue = sc.nextDouble();

            policy = new CarInsurance(name, basePremium, carAge, accident, carValue);

        }
        else if (choice == 2) {

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Are you a smoker? (true/false): ");
            boolean smoker = sc.nextBoolean();

            System.out.print("Pre-existing disease? (true/false): ");
            boolean disease = sc.nextBoolean();

            policy = new HealthInsurance(name, basePremium, age, smoker, disease);
        }
        else {
            System.out.println("Invalid choice!");
            
            return;
        }

        policy.printPolicyDetails();
        
    }
}