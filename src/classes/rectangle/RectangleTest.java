package classes.rectangle;

public class RectangleTest
{
    public static void main(String[] args)
    {
        /*
        Declare an instance of the Rectangle class called myRectangleOne which
        uses the default constructor and so the length and breadth will be 1.0
        */
        Rectangle myRectangleOne = new Rectangle();

        /*
        Use the public getLength() and getBreadth() methods and the public
        calculatePerimeter() and calculateArea() methods belonging to the
         myRectangleOne instance
         */
        System.out.printf("myRectangleOne has the default length of %.2f, the default breadth of %.2f a perimeter of %.2f and an area of %.2f %n",
            myRectangleOne.getLength(), myRectangleOne.getBreadth(), myRectangleOne.calculatePerimeter(), myRectangleOne.calculateArea());

        /*
        Declare a second instance of the Rectangle class called myRectangleTwo
        which uses the second constructor to accept the value for a length and
        breadth of type double. In this case we are passing the double values 10.00
        and 5.00 to the constructor which means that the length will be set to 10.00
        and the breadth will be set to 5.00 in the Rectangle class
        */
        Rectangle myRectangleTwo = new Rectangle(10.00, 5.00);

        /*
        Use the public getLength() and getBreadth() methods and the public
        calculatePerimeter() and calculateArea() methods belonging to the
         myRectangleTwo instance
         */
        System.out.printf("myRectangleTwo has a length of %.2f, a breadth of %.2f, a perimeter of %.2f and an area of %.2f %n",
            myRectangleTwo.getLength(), myRectangleTwo.getBreadth(), myRectangleTwo.calculatePerimeter(), myRectangleTwo.calculateArea());

        myRectangleOne.setXcoordinate(10);
        myRectangleOne.setYcoordinate(20);
        myRectangleOne.setXcoordinate(11);
        myRectangleOne.setYcoordinate(21);
        System.out.println(myRectangleOne.toString());
        System.out.println(myRectangleTwo.toString());

    } // End of main() method
} // End of CircleTest class