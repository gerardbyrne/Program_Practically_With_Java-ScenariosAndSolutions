package labten.exerciseten;
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
            /* Create an State object  */
            Claim myClaim = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("ClaimSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to a Claim object
            */
            myClaim = (Claim) objectInputStreamForData.readObject();

            System.out.println("The Agent Claim Details Are");
            System.out.println("Claim Id:            " + myClaim.getClaimId());
            System.out.println("Agent Id:            " + myClaim.getAgentId());
            System.out.println("Policy Id:           " + myClaim.getPolicyId());
            System.out.println("Claim Description:   " + myClaim.getClaimDescription());
            System.out.println("Claim Amount:        " + myClaim.getClaimAmount());
            System.out.println("Claim Completed:     " + myClaim.getCompleted());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of deSerialiseTheClaimObject() method

} // End of SerialiseDeserialise class