package labfour.exerciseten;

import java.io.Serializable;

public class Employee implements Serializable
{
    String employeeName;
    double hoursWorked;
    double payAmount;

    public Employee(String employeeName, double hoursWorked, double payAmount)
    {
        this.employeeName = employeeName;
        this.hoursWorked = hoursWorked;
        this.payAmount = payAmount;
    } //End of constructor

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public double getPayAmount()
    {
        return payAmount;
    }

    public void setPayAmount(double payAmount)
    {
        this.payAmount = payAmount;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
            "employeeName='" + employeeName + '\'' +
            ", hoursWorked='" + hoursWorked + '\'' +
            ", payAmount='" + payAmount + '\'' +
            '}';
    }
} //End of Employee class
