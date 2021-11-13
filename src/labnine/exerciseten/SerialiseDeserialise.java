package labnine.exerciseten;

import labeight.exerciseten.Quote;

import java.io.*;

public class SerialiseDeserialise
{
    public void serialiseTheStateObject(State myState)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("StateSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(myState);

            objectOutputStreamForData.close();
            fileOutputStreamForData.close();

            System.out.println("The serialisation has been completed");
        } // End of try block
        catch(IOException exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheStateObject() method

    public void deSerialiseTheStateObject()
    {
        try{
            /* Create an State object  */
            State myState = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("StateSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to an Claim object
            */
            myState = (State) objectInputStreamForData.readObject();

            System.out.println("State Details");
            System.out.println("State name:   " + myState.getStateName());
            System.out.println("State Capital:   " + myState.getStateCapital());
            System.out.println("State Population:   " + myState.getStatePopulation());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of deSerialiseTheStateObject() method

} // End of SerialiseDeserialise class