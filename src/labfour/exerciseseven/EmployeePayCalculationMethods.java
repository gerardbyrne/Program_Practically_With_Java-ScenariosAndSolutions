package labfour.exerciseseven;

public class EmployeePayCalculationMethods
{
    double payAmount,
           timeAndAHalfPercentageIncreaseAmount = 50,
           doubleTimePercentageIncreaseAmount = 100;

/*******************************************************************
We have methods which deal with the calculation of the employee pay.
The methods are in this separate class and can be called from another
calls if we instantiate this class.
******************************************************************/

    public double calculatePayAmountHoursGreaterThanForty(double hoursWorked, double basePayRate)
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

    public double calculatePayAmountHoursGreaterThanThirtySevenPointFive (double hoursWorked, double basePayRate)
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

    public double calculatePayAmountHoursEqualToThirtySevenPointFive(double hoursWorked, double basePayRate)
    {
        // 37.5 * £10.00 = £375.00
        payAmount = (37.5 * basePayRate);

        return payAmount;
    } // End of calculatePayAmountHoursEqualToThirtySevenPointFive() method

} // End of EmployeePayCalculationMethods class