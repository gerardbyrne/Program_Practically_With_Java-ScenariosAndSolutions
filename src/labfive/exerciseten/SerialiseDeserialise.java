package labfive.exerciseten;

import java.io.*;

public class SerialiseDeserialise
{
    public void serialiseTheClaimObject(Claim myClaim)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("ClaimSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(myClaim);

            objectOutputStreamForData.close();
            fileOutputStreamForData.close();

            System.out.println("The serialisation has been completed");
        } // End of try block
        catch(IOException exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheClaimObject() method

    public void deSerialiseTheClaimObject()
    {
        try{
            /* Create a Claim object  */
            Claim myClaim = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("ClaimSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to an Claim object
            */
            myClaim = (Claim) objectInputStreamForData.readObject();

            System.out.println("Claim Details");
            System.out.println("Claim one value:   " + myClaim.getClaimOneAmount());
            System.out.println("Claim two value:   " + myClaim.getClaimTwoAmount());
            System.out.println("Total of claims:   " + myClaim.getTotalOfClaims());
            System.out.println("Average of claims: " + myClaim.getAverageOfClaims());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of deSerialiseTheClaimObject() method

} // End of SerialiseDeserialise class