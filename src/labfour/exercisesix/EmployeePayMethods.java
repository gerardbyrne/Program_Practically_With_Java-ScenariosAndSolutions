package labfour.exercisesix;

import java.util.Scanner;

public class EmployeePayMethods
{
    static Scanner myScanner = new Scanner(System.in);
    static String employeeName;
    static double hoursWorked, basePayRate, payAmount, timeAndAHalfPercentageIncreaseAmount = 50, doubleTimePercentageIncreaseAmount = 100;

    // Create the arrays
    static String[][] employeesArray  = new String[3][3];

    public static void main(String[] args)
    {
        for (int counter =0; counter<3; counter++)
        {
          acceptEmployeeDetails();

            if (hoursWorked > 45)
            {
                displayHRMessage();
            } // End of if block
            else if (hoursWorked > 40)
            {
                calculatePayAmountHoursGreaterThanForty();
            } // End of else if block
            else if (hoursWorked > 37.5)
            {
                calculatePayAmountHoursGreaterThanThirtySevenPointFive ();
            } // End of else if block
            else
            {
                calculatePayAmountHoursEqualToThirtySevenPointFive();
            } // End of else block

            if (hoursWorked < 45)
            {
                displayPaySlip();
            }// End of if statement

            // Add the items to the array of arrays
            addEmployeeToArrayOfArrays(counter);
        } // End of for iteration

        // Display the contents of the array of arrays
        displayAllEmployeeDetails();

    } // End of main() method

/*******************************************************************
Methods are reuseable blocks of code outside the main() method.
Here we call each method from within the main() method but we
could have a method call another method.
We have methods which deal with the circle and methods that deal
with the sphere. Maybe later these could be separated into
two different classes!
******************************************************************/


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

    public static double calculatePayAmountHoursGreaterThanForty()
    {
        // (100+100)/100 = 200/100 = 2.0
        double doubleTime = (100 + doubleTimePercentageIncreaseAmount) / 100;

        // £10.00 * 2.0 = £20.00
        double overtimePayRate = basePayRate * doubleTime;

        //(42-40) * £20.00 = 2 * £20.00 = £40.00
        double overtimePay = (hoursWorked - 40) * overtimePayRate;

        // £10.00 * 37.5 = 375.00 +  £40.00 = £415.00
        payAmount = (basePayRate * 37.5) + overtimePay;

        return payAmount;
    } // End of calculatePayAmountHoursGreaterThanForty() method

    public static double calculatePayAmountHoursGreaterThanThirtySevenPointFive ()
    {
        // (100+50)/100 = 150/100 = 1.5
        double timeAndAHalf = (100 + timeAndAHalfPercentageIncreaseAmount) / 100;

        // £10.00 * 1.5 = £15.00
        double overtimePayRate = basePayRate * timeAndAHalf;

        //(40-37.5) * £15.00 = 2.5 * £15.00 = £37.50
        double overtimePay = (hoursWorked - 37.5) * overtimePayRate;

        // (£10.00 * £37.50) = £375.00 + 37.50 = 412.50
        payAmount = (basePayRate * 37.5) + overtimePay;

        return payAmount;
    } // End of calculatePayAmountHoursGreaterThanThirtySevenPointFive() method

    public static double calculatePayAmountHoursEqualToThirtySevenPointFive()
    {
        // 37.5 * £10.00 = £375.00
        payAmount = (37.5 * basePayRate);

        return payAmount;
    } // End of calculatePayAmountHoursEqualToThirtySevenPointFive() method

    public static void displayPaySlip()
    {
        System.out.printf("%s has worked %.2f hours with a base pay rate of $%.2f giving them a pay amount of $%.2f%n", employeeName, hoursWorked, basePayRate, payAmount);
    } // End of displayPaySlip() method

    public static void addEmployeeToArrayOfArrays(int counter)
    {
        switch(counter)
        {
            case 0:
                employeesArray[0][0] = employeeName;
                employeesArray[0][1] = String.valueOf(hoursWorked);
                if (hoursWorked > 45)
                {
                    employeesArray[0][2] = "HR";
                } else
                {
                    employeesArray[0][2] = String.valueOf(payAmount);
                }
                break;
            case 1:
                employeesArray[1][0] = employeeName;
                employeesArray[1][1] = String.valueOf(hoursWorked);
                if (hoursWorked > 45)
                {
                    employeesArray[1][2] = "HR";
                } else
                {
                    employeesArray[1][2] = String.valueOf(payAmount);
                }
                break;
            case 2:
                employeesArray[2][0] = employeeName;
                employeesArray[2][1] = String.valueOf(hoursWorked);
                if (hoursWorked > 45)
                {
                    employeesArray[2][2] = "HR";
                } else
                {
                    employeesArray[2][2] = String.valueOf(payAmount);
                }
                break;
        } // End switch selection for the array of arrays
    } // End of addEmployeeToArrayOfArrays() method

    public static void displayAllEmployeeDetails()
    {
        for (int outerCounter = 0; outerCounter < employeesArray.length; outerCounter++)
        {
            for (int innerCounter = 0; innerCounter < employeesArray[outerCounter].length; innerCounter++)
            {
                System.out.print("Index [" + outerCounter + "][" + innerCounter + "]: ");
                System.out.println(employeesArray[outerCounter][innerCounter]);
            }
        }
    } // End of displayAllEmployeeDetails() method

} // End of EmployeePayMethods class