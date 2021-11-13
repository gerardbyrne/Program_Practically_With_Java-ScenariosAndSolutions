package labfour.exercisefive;

import java.util.Scanner;

public class EmployeePayArrays
{
    static Scanner myScanner = new Scanner(System.in);
    static String employeeName;
    static double hoursWorked, basePayRate, payAmount, timeAndAHalfPercentageIncreaseAmount = 50, doubleTimePercentageIncreaseAmount = 100;

    // Create the arrays
    static String[] EmployeeOnePayDetails = new String[3];
    static String[] EmployeeTwoPayDetails  = new String[3];
    static String[] EmployeeThreePayDetails = new String[3];
    static String[][] employeesArray  = new String[3][3];

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

            // Add the items to one of the three arrays
            switch(counter)
            {
                case 0:
                    EmployeeOnePayDetails[0] = employeeName;
                    EmployeeOnePayDetails[1] = String.valueOf(hoursWorked);
                    if (hoursWorked > 45)
                    {
                        EmployeeOnePayDetails[2] = "HR";
                    } else
                    {
                        EmployeeOnePayDetails[2] = String.valueOf(payAmount);
                    }
                    break;
                case 1:
                    EmployeeTwoPayDetails[0] = employeeName;
                    EmployeeTwoPayDetails[1] = String.valueOf(hoursWorked);
                    if (hoursWorked > 45)
                    {
                        EmployeeTwoPayDetails[2] = "HR";
                    } else
                    {
                        EmployeeTwoPayDetails[2] = String.valueOf(payAmount);
                    }
                    break;
                case 2:
                    EmployeeThreePayDetails[0] = employeeName;
                    EmployeeThreePayDetails[1] = String.valueOf(hoursWorked);
                    if (hoursWorked > 45)
                    {
                        EmployeeThreePayDetails[2] = "HR";
                    } else
                    {
                        EmployeeThreePayDetails[2] = String.valueOf(payAmount);
                    }
                    break;
            } // End switch selection


        // Add the items to the array of arrays
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
    } // End of for iteration

    // Display the contents of the three separate arrays
    for(String employeeItem : EmployeeOnePayDetails)
    {
        System.out.println("Employee One " + employeeItem);
    }// End of for each iteration

    for(String employeeItem : EmployeeTwoPayDetails)
    {
        System.out.println("Employee Two " + employeeItem);
    }// End of for each iteration

    for(String employeeItem : EmployeeThreePayDetails)
    {
        System.out.println("Employee Three " + employeeItem);
    }// End of for each iteration

    // Display the contents of the array of arrays
    for (int outerCounter = 0; outerCounter < employeesArray.length; outerCounter++)
    {
        for (int innerCounter = 0; innerCounter < employeesArray[outerCounter].length; innerCounter++)
        {
            System.out.print("Index [" + outerCounter + "][" + innerCounter + "]: ");
            System.out.println(employeesArray[outerCounter][innerCounter]);
        }
    }

    } // End of main() method
} // End of EmployeePayArrays class