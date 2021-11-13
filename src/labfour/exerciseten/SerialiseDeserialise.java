package labfour.exerciseten;

import java.io.*;

public class SerialiseDeserialise
{
    public void serialiseTheEmployeeObject(Employee myEmployee)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("EmployeeSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(myEmployee);

            objectOutputStreamForData.close();
            fileOutputStreamForData.close();

            System.out.println("The serialisation has been completed");
        } // End of try block
        catch(IOException exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheEmployeeObject() method

    public void deSerialiseTheEmployeeObject()
    {
        try{
            /* Create an Employee object  */
            Employee myEmployee = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("EmployeeSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to an Employee object
            */
            myEmployee = (Employee) objectInputStreamForData.readObject();

            System.out.println("Employee Details");
            System.out.println("Employee name:    " + myEmployee.getEmployeeName());
            System.out.println("Hours worked:   " + myEmployee.getHoursWorked());
            System.out.println("Pay amount:    " + myEmployee.getPayAmount());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of deSerialiseTheEmployeeObject() method

} // End of SerialiseDeserialise class