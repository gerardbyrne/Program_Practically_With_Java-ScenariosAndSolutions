package labeight.exerciseten;

import java.io.*;

public class SerialiseDeserialise
{
    public void serialiseTheQuoteObject(Quote myQuote)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("QuoteSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(myQuote);

            objectOutputStreamForData.close();
            fileOutputStreamForData.close();

            System.out.println("The serialisation has been completed");
        } // End of try block
        catch(IOException exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheQuoteObject() method

    public void deSerialiseTheQuoteObject()
    {
        try{
            /* Create an Quote object  */
            Quote myQuote= null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("QuoteSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to an Claim object
            */
            myQuote = (Quote) objectInputStreamForData.readObject();

            System.out.println("Quote Estimator Details");
            System.out.println("Customer Name:   " + myQuote.getCustomerName());
            System.out.println("Vehicle Age:   " + myQuote.getVehicleAge());
            System.out.println("Engine CC:   " + myQuote.getEngineCC());
            System.out.println("Quote Amount:   " + myQuote.getQuoteAmount());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of deSerialiseTheQuoteObject() method

} // End of SerialiseDeserialise class