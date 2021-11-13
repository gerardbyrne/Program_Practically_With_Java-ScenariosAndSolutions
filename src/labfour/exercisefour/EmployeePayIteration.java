package labfour.exercisefour;

import java.util.Scanner;

public class EmployeePayIteration
{
    static Scanner myScanner = new Scanner(System.in);
    static String employeeName;
    static double hoursWorked, basePayRate, payAmount, timeAndAHalfPercentageIncreaseAmount = 50, doubleTimePercentageIncreaseAmount = 100;

    public static void main(String[] args)
    {
        for (int counter =0; counter<3; counter++)
        {
            System.out.println("What is the name of the employee?");
            employeeName = myScanner.next();

            System.out.println("How many hours has " + employeeName + " worked?");
            hoursWorked = myScanner.nextDouble();

            System.out.println("What is the base pay rate for " + employeeName + "?");
            basePayRate = myScanner.nextDouble();

            if (hoursWorked > 45)
            {
                System.out.println(employeeName + " has working hours that need to be looked at by HR, " +
                    "please contact them as soon as possible to enable pay processing to take place");
            } // End of if block
            else if (hoursWorked > 40)
            {
                // (100+100)/100 = 200/100 = 2.0
                double doubleTime = (100 + doubleTimePercentageIncreaseAmount) / 100;

                // £10.00 * 2.0 = £20.00
                double overtimePayRate = basePayRate * doubleTime;

                //(42-40) * £20.00 = 2 * £20.00 = £40.00
                double overtimePay = (hoursWorked - 40) * overtimePayRate;

                // £10.00 * 37.5 = 375.00 +  £40.00 = £415.00
                payAmount = (basePayRate * 37.5) + overtimePay;
            } // End of else if block
            else if (hoursWorked > 37.5)
            {
                // (100+50)/100 = 150/100 = 1.5
                double timeAndAHalf = (100 + timeAndAHalfPercentageIncreaseAmount) / 100;

                // £10.00 * 1.5 = £15.00
                double overtimePayRate = basePayRate * timeAndAHalf;

                //(40-37.5) * £15.00 = 2.5 * £15.00 = £37.50
                double overtimePay = (hoursWorked - 37.5) * overtimePayRate;

                // (£10.00 * £37.50) = £375.00 + 37.50 = 412.50
                payAmount = (basePayRate * 37.5) + overtimePay;
            } // End of else if block
            else
            {
                // 37.5 * £10.00 = £375.00
                payAmount = (37.5 * basePayRate);
            } // End of else block

            if (hoursWorked < 45)
            {
                System.out.printf("%s has worked %.2f hours with a base pay rate of $%.2f giving them a pay amount of $%.2f%n", employeeName, hoursWorked, basePayRate, payAmount);
            }// End of if statement
        } // End of for iteration

    } // End of main() method
} // End of EmployeePayIteration class