package labseven.exerciseten;

import java.io.*;

public class SerialiseDeserialise
{
    public void serialiseTheInvoiceObject(InvoiceItem myInvoiceItem)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("InvoiceSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(myInvoiceItem);

            objectOutputStreamForData.close();
            fileOutputStreamForData.close();

            System.out.println("The serialisation has been completed");
        } // End of try block
        catch(IOException exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheInvoiceObject() method

    public void deSerialiseTheInvoiceObject()
    {
        try{
            /* Create an InvoiceItem object  */
            InvoiceItem myInvoiceItem = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("InvoiceSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to an Claim object
            */
            myInvoiceItem = (InvoiceItem) objectInputStreamForData.readObject();

            System.out.println("Invoice Details");
            System.out.println("Item Description:   " + myInvoiceItem.getItemDescription());
            System.out.println("Quantity:   " + myInvoiceItem.getItemQuantity());
            System.out.println("Items total:   " + myInvoiceItem.getItemsTotal());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of deSerialiseTheInvoiceObject() method

} // End of SerialiseDeserialise class