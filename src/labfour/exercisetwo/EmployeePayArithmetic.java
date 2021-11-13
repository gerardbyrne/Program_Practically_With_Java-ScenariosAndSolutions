package labfour.exercisetwo;

import java.util.Scanner;

public class EmployeePayArithmetic
{
    static Scanner myScanner = new Scanner(System.in);
    static String employeeName;
    static double hoursWorked, basePayRate, payAmount;

    public static void main(String[] args)
    {
        System.out.println("What is the name of the employee?");
        employeeName = myScanner.next();

        System.out.println("How many hours has " + employeeName + " worked?");
        hoursWorked = myScanner.nextDouble();

        System.out.println("What is the base pay rate for " + employeeName + "?");
        basePayRate = myScanner.nextDouble();

        payAmount = ( 37.5 * basePayRate) + ((hoursWorked - 37.5) * (basePayRate * 1.5));

        System.out.printf("%s has worked %.2f hours with a pay rate of $%.2f giving them a pay amount of $%.2f", employeeName, hoursWorked, basePayRate, payAmount);

    } // End of main() method
} // End of EmployeePayArithmetic class