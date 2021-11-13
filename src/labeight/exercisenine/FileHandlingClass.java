package labeight.exercisenine;

import java.io.*;

public class FileHandlingClass
{
    public void writeQuoteDetailsToTextFile(String quoteDetails[], String filePathToBeWrittenTo)
    {
        System.out.println("************************************************");
        System.out.println(" Writing quote estimate details to the text file ");
        System.out.println("***********************************************");
        // Enclose the code in a try catch to handle errors
        try
        {
          /*
           Create an instance of the FileWriter and call it fileWriter
           FileWriter is used to write text files in the default encoding.
          */
            FileWriter fileWriter = new FileWriter(filePathToBeWrittenTo, false);

          /*
           Create an instance of the BufferedReader and call it bufferedReader
           we should always wrap a FileWriter in a BufferedWriter
          */
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

          /*
           Write text to the file using the write() method.
           In Java the write method will not automatically use a newline character
           so we will use the newLine() method to add the new line.
           We will use a for loop and simply write each value from the
           array quoteDetails to the file
          */
            for(int counter = 0; counter<quoteDetails.length; counter++)
            {
                    bufferedWriter.write(quoteDetails[counter]);
                    bufferedWriter.newLine();
            } // End of array iteration
            // Close the files.
            bufferedWriter.close();
            fileWriter.close();
        }  // End of the try section of the error handling
        catch(IOException ex)
        {
            System.out.println("Error writing file '" + filePathToBeWrittenTo + "'");
        } // End of the catch section of the error handling
    } // End of writeQuoteDetailsToTextFile() method

    public void readQuoteDetailsFromTextFile(String filePathToBeReadFrom)
    {
        System.out.println("*************************************************");
        System.out.println("Reading quote estimate details from the text file");
        System.out.println("*************************************************");
        // Set up a string variable to hold the lines read
        String line;

        // Enclose the code in a try catch to handle errors
        try
        {
       /*
        Create an instance of the FileReader and call it fileReader
        FileReader is used to read text files in the default encoding.
       */
            FileReader fileReader= new FileReader(filePathToBeReadFrom);

       /*
          Create an instance of the BufferedReader and call it bufferedReader
          we should always wrap a FileReader in a BufferedReader
       */
            BufferedReader bufferedReader = new BufferedReader(fileReader);

       /*
      Iterate the buffer and read one line at a time and display it
        */
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }  // End of while iteration

            // Close the files.
            bufferedReader.close();
            fileReader.close();
        }  // End of try section of the error handling

        catch(IOException ex)
        {
            System.out.println("Error reading file '" + filePathToBeReadFrom + "'");
        } // End of the catch section of the error handling

    } // End of readQuoteDetailsFromTextFile() method

} // End of FileHandlingClass class