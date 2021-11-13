package labsix.exerciseten;

import java.io.*;

public class SerialiseDeserialise
{
    public void serialiseTheClaimMonthlyNumbersObject(ClaimMonthlyNumbers myClaimMonthlyNumbers)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("ClaimMonthlyNumbersSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(myClaimMonthlyNumbers);

            objectOutputStreamForData.close();
            fileOutputStreamForData.close();

            System.out.println("The serialisation has been completed");
        } // End of try block
        catch(IOException exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheClaimMonthlyNumbersObject() method

    public void deSerialiseTheClaimMonthlyNumbersObject()
    {
        try{
            /* Create a Claim object  */
            ClaimMonthlyNumbers myClaimMonthlyNumbers = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("ClaimMonthlyNumbersSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to an Claim object
            */
            myClaimMonthlyNumbers = (ClaimMonthlyNumbers) objectInputStreamForData.readObject();

            System.out.println("Claim Month and Number of Claims");
            System.out.println("Claim month:   " + myClaimMonthlyNumbers.getMonth());
            System.out.println("Number of claims:   " + myClaimMonthlyNumbers.getNumberOfClaims());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of deSerialiseTheClaimMonthlyNumbersObject() method

} // End of SerialiseDeserialise class