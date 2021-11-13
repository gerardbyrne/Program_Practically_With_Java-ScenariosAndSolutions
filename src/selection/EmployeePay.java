package selection;

import java.util.Scanner;

public class EmployeePay
{
    static Scanner myScanner = new Scanner(System.in);
    static double numberOfHoursWorked, baseRateOfPay, overtimeStartValue=37.5, overtimePercentageIncrease =50, totalPay;

    public static void main(String[] args)
    {
        System.out.println("How many hours have you worked for?");
        numberOfHoursWorked = myScanner.nextDouble();

        System.out.println("What is your base rate for pay?");
        baseRateOfPay = myScanner.nextDouble();

        if(numberOfHoursWorked > 45)
        {
            System.out.println("Please contact HR to discuss your working hours");
        } // End of if block
        else if (numberOfHoursWorked > 37.5)
            {
             // (100+50)/100 = 150/100 = 1.5
            double overtimePayPercentage = (100 + overtimePercentageIncrease)/100;

            // £18.00 * £1.5 = £27.00
            double overtimePayRate = baseRateOfPay * overtimePayPercentage;

            //(40-37.5) * £27.00 = 2.5 * £27.00 = £67.50
            double overtimePay = (numberOfHoursWorked - overtimeStartValue) * overtimePayRate;

            // 37.5 * £18.00 = £675.00
            double basePay= (overtimeStartValue * baseRateOfPay);

            // £675.00 + £67.50 = £742.50
            totalPay = basePay + overtimePay;
            System.out.printf("Your total pay with overtime will be %.2f ", totalPay);
            } // End of else if block
            else
                {
                    // 37.5 * £18.00 = £675.00
                    double basePay= (overtimeStartValue * baseRateOfPay);
                    System.out.printf("Your total pay will be %.2f ", basePay);
                } // End of else block
    } // End of main() method
} // End of EmployeePay class