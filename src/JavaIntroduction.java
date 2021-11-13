import java.util.Scanner;

public class JavaIntroduction
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        int counter = 0;
        int totalofallclaims = 0;
        int inputnumber = 0;

        while (counter < 2)
        {
            System.out.println("What is the value of the claim: -- ");
            inputnumber = myScanner.nextInt();

            // Add the number to the total
            totalofallclaims = totalofallclaims + inputnumber;
            counter = counter + 1;

            // Print out the total of the claims that have been entered
            System.out.println("The total of the claims that have been input is " + totalofallclaims);
        }

    } // End of main method
} // End of JavaIntroduction class