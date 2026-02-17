class Calculator
{
    // Addition
    int add(int a, int b)
     {
         return a + b;
     }
    double add(double a, double b) 
    {
         return a + b;
     }
    double add(int a, double b) 
    {
         return a + b;
     }
    double add(double a, int b)
     {
         return a + b;
     }

    // Subtraction
    int subtract(int a, int b)
     {
         return a - b;
     }
    double subtract(double a, double b) 
    {
         return a - b;
     }
    double subtract(int a, double b)
     {
         return a - b; 
    }
    double subtract(double a, int b)
     {
         return a - b; 
        }

    // Multiplication
    int multiply(int a, int b)
     {
         return a * b; 
     }
    double multiply(double a, double b)
     {
         return a * b; 
     }
    double multiply(int a, double b)
     {
         return a * b; 
    }
    double multiply(double a, int b)
     {
         return a * b;
     }

    // Division
    int divide(int a, int b)
     {
         return a / b;
     }
    double divide(double a, double b)
     {
         return a / b;
     }
    double divide(int a, double b)
     {
         return a / b;
     }
    double divide(double a, int b)
     {
         return a / b;
     }
}

 class Test_Calculator
{
    public static void main(String[] args)
    {
        Calculator c = new Calculator();

        System.out.println("Addition: " + c.add(10, 5));
        System.out.println("Subtraction: " + c.subtract(10.5, 5));
        System.out.println("Multiplication: " + c.multiply(4, 2.5));
        System.out.println("Division: " + c.divide(10, 2));
    }
}