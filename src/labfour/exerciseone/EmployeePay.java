package labfour.exerciseone;

import java.util.Scanner;

public class EmployeePay
{
    static Scanner myScanner = new Scanner(System.in);
    static String employeeName;
    static double hoursWorked, basePayRate;

    public static void main(String[] args)
    {
        System.out.println("What is the name of the employee?");
        employeeName = myScanner.next();

        System.out.println("How many hours has " + employeeName + " worked?");
        hoursWorked = myScanner.nextDouble();

        System.out.println("What is the base pay rate for " + employeeName + "?");
        basePayRate = myScanner.nextDouble();

        System.out.printf("%s has worked %.2f hours with a pay rate of $%.2f ", employeeName, hoursWorked, basePayRate);

    } // End of main() method
} // End of EmployeePay class