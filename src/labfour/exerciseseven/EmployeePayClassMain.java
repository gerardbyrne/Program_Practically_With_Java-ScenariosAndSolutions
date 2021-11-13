package labfour.exerciseseven;

import java.util.Scanner;

public class EmployeePayClassMain
{
    static Scanner myScanner = new Scanner(System.in);
    static String employeeName;
    static double hoursWorked, basePayRate, payAmount;

    // Create the arrays
    static String[][] employeesArray  = new String[3][3];

    public static void main(String[] args)
    {
        EmployeePayCalculationMethods myEmployeePayCalculationMethods = new EmployeePayCalculationMethods();
        EmployeePayArrayMethods myEmployeePayArrayMethods = new EmployeePayArrayMethods();

        for (int counter =0; counter<3; counter++)
        {
          basePayRate = 0.00;
          acceptEmployeeDetails();

            if (hoursWorked > 45)
            {
                displayHRMessage();
            } // End of if block
            else if (hoursWorked > 40)
            {
                payAmount= myEmployeePayCalculationMethods.calculatePayAmountHoursGreaterThanForty(hoursWorked, basePayRate);
            } // End of else if block
            else if (hoursWorked > 37.5)
            {
                payAmount = myEmployeePayCalculationMethods.calculatePayAmountHoursGreaterThanThirtySevenPointFive (hoursWorked, basePayRate);
            } // End of else if block
            else
            {
                payAmount = myEmployeePayCalculationMethods.calculatePayAmountHoursEqualToThirtySevenPointFive(hoursWorked, basePayRate);
            } // End of else block

            if (hoursWorked < 45)
            {
                displayPaySlip();
            }// End of if statement

            // Add the items to the array of arrays
            myEmployeePayArrayMethods.addEmployeeToArrayOfArrays(counter, employeeName, hoursWorked, payAmount);
        } // End of for iteration

        // Display the contents of the array of arrays
        myEmployeePayArrayMethods.displayAllEmployeeDetails();

    } // End of main() method

    public static void displayPaySlip()
    {
        System.out.printf("%s has worked %.2f hours with a base pay rate of $%.2f giving them a pay amount of $%.2f%n", employeeName, hoursWorked, basePayRate, payAmount);
    } // End of displayPaySlip() method


    public static void acceptEmployeeDetails()
    {
        System.out.println("What is the name of the employee?");
        employeeName = myScanner.next();

        System.out.println("How many hours has " + employeeName + " worked?");
        hoursWorked = myScanner.nextDouble();

        System.out.println("What is the base pay rate for " + employeeName + "?");
        basePayRate = myScanner.nextDouble();
    } // End of acceptEmployeeDetails() method

    public static void displayHRMessage()
    {
        System.out.println(employeeName + " has working hours that need to be looked at by HR, " +
            "please contact them as soon as possible to enable pay processing to take place");
    } // End of displayHRMessage() method

} // End of EmployeePayArrays class