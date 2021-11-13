package labfour.exerciseseven;

public class EmployeePayArrayMethods
{
//    String employeeName;
//    double hoursWorked, payAmount;

    // Create the arrays
    String[][] employeesArray  = new String[3][3];

/*******************************************************************
We have methods which deal with writing to and reading from the array.
The methods are in this separate class and can be called from another
calls if we instantiate this class.
******************************************************************/
    public void addEmployeeToArrayOfArrays(int counter, String employeeName, double hoursWorked, double payAmount)
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

    public void displayAllEmployeeDetails()
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

} // End of EmployeePayArrayMethods class