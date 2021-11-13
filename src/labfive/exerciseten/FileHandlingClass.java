package labfive.exerciseten;

import java.io.*;

public class FileHandlingClass
{
    Utilities myUtilities = new Utilities();

    public void writeClaimPropertiesToTextFile(double[][]  arrayPassedIn, String filePathToBeWrittenTo)
    {
        System.out.println("*************************************");
        System.out.println("Writing claim value to the text file");
        System.out.println("*************************************");
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
           We iterate the array of arrays as the outer iteration and in the inner
           iteration we iterate each item of the array found in the outer iteration
           We add a string of text to the double values to clarify the information
           being written to the text file
          */
            for(double[] array : arrayPassedIn)
            {
                int counterForWhichPositionInTheArrayWeAreAt = 0;
                for(double value : array)
                {
                    switch (counterForWhichPositionInTheArrayWeAreAt)
                    {
                        case 0:
                            //bufferedWriter.write(String.format("%-40s%s", "The first claim has a value of ", value));
                            bufferedWriter.write(String.format("%-40s%s", myUtilities.CLAIMVALUEONEMESSAGE, value));
                            break;
                        case 1:
                            //bufferedWriter.write(String.format("%-40s%s", "The second claim has a value of ", String.valueOf(value)));
                            bufferedWriter.write(String.format("%-40s%s", myUtilities.CLAIMVALUETWOMESSAGE, String.valueOf(value)));
                            break;
                        case 2:
                            //bufferedWriter.write(String.format("%-40s%s", "The total of the two claims is ", String.valueOf(value)));
                            bufferedWriter.write(String.format("%-40s%s", myUtilities.CLAIMTOTALMESSAGE, String.valueOf(value)));
                            break;
                        case 3:
                            //bufferedWriter.write(String.format("%-40s%s", "The average of the two claims is ", String.valueOf(value)));
                            bufferedWriter.write(String.format("%-40s%s", myUtilities.CLAIMAVERAGEMESSAGE, String.valueOf(value)));
                            break;
                    }
                    bufferedWriter.newLine();
                    counterForWhichPositionInTheArrayWeAreAt++;
                } // End of inner for iteration
                bufferedWriter.newLine();
            } // End of outer for iteration

            // Close the files.
            bufferedWriter.close();
        }  // End of the try section of the error handling
        catch(IOException ex)
        {
            System.out.println("Error writing file '" + filePathToBeWrittenTo + "'");
        } // End of the catch section of the error handling
    } // End of writeShapePropertiesToTextFile() method

    public void readClaimPropertiesFromTextFile(String filePathToBeReadFrom)
    {
        System.out.println("***************************************");
        System.out.println("Reading claim values from the text file");
        System.out.println("***************************************");
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
} // End of FileHandlingClass class
