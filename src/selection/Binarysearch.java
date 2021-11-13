package selection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binarysearch
{
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        System.out.println(first + " - " + last + " - " + mid );


        while( first <= last ){
            for(int i=first; i<last; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if ( arr[mid] < key ){
                first = mid + 1;
                System.out.println("First " + first + arr[first]);
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
                System.out.println("Last " + last + arr[last]);
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

    public static int linearSearch(List<Integer> numbers, int key)
    {
        for (int index = 0; index < numbers.size(); index++)
        {
            System.out.println((numbers.get(index) + " - " + key));
            if ( numbers.get(index) == key )
            {

                return index;  // The number (key) has been found at this index
            }
        }
        // If we get to the end of this loop then we did not find the key in this array, so return -1
        return -1;
    }
    public static void main(String args[]){
//        int arr[] = {6, 9, 12, 19, 21 , 24, 36, 48, 53, 64};
//        int key = 19;
//        int last=arr.length-1;
//        binarySearch(arr,0,last,key);
//
//        List<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(6);
//        numbers.add(53);
//        numbers.add(19);
//        numbers.add(48);
//        numbers.add(9);
//        numbers.add(21);
//        numbers.add(12);
//        numbers.add(24);
//        numbers.add(36);
//        numbers.add(64);
//
//        System.out.println(linearSearch(numbers , 6));
        int i,factorialNumber=1;
        int numberToBeFactorialed=4;//It is the number to calculate factorial
        factorialNumber = factorial(numberToBeFactorialed);
        System.out.println("Factorial of "+numberToBeFactorialed+" is: "+factorialNumber);
    }


    public static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }


} // End of Test class
