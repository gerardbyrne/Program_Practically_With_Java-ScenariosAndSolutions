package labthree.exercisenine;

import java.io.*;

public class FileHandlingClass
{
    public void writeShapePropertiesToTextFile(double[] arrayPassedIn, String filePathToBeWrittenTo)
    {
        System.out.println("***************************");
        System.out.println("Writing to the text file");
        System.out.println("***************************");
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
           We will use a foreach loop and simply write each value to the file
          */
            for(double arrayItem : arrayPassedIn)
            {
                bufferedWriter.write(String.valueOf(arrayItem));
                bufferedWriter.newLine();
            }
            // Close the files.
            bufferedWriter.close();
        }  // End of the try section of the error handling
        catch(IOException ex)
        {
            System.out.println("Error writing file '" + filePathToBeWrittenTo + "'");
        } // End of the catch section of the error handling
    } // End of writeShapePropertiesToTextFile() method

    public void readShapePropertiesFromTextFile(String filePathToBeReadFrom)
    {
        System.out.println("***************************");
        System.out.println("Reading from the text file");
        System.out.println("***************************");
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
        }  // End of try section of the error handling

        catch(IOException ex)
        {
            System.out.println("Error reading file '" + filePathToBeReadFrom + "'");
        } // End of the catch section of the error handling

    } // End of readShapePropertiesFromTextFile() method
} // End of class FileHandlingClass
