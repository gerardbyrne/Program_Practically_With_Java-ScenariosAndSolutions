package classes.circle;

public class CircleTest
{
    public static void main(String[] args)
    {
        /*
        Declare an instance of the Circle class called myCircleOne which
        uses the default constructor and so the radius will be 1.0
        */
        Circle myCircleOne = new Circle();

        /*
        Use the public getRadius() method and the public calculateArea() method
        belonging to the myCircleOne instance
        */
        System.out.printf("myCircleOne has the default radius of %.2f and an " +
        "area of %.2f %n", myCircleOne.getRadius(), myCircleOne.calculateArea());

        /*
        Declare a second instance of the Circle class called myCircleTwo
        which uses the second constructor to accept the value for a radius
        of type double. In this case we are passing the double value 10.00 to
        the constructor which means that the radius will be set to 10.00 in the
        Circle class
        */
        Circle myCircleTwo = new Circle(10.00);

        /*
        Use the public getRadius() method and the public calculateArea() method
        belonging to the myCircleTwo instance
        */
        System.out.printf("myCircleTwo has the user specified radius of %.2f and an area of %.2f %n", myCircleTwo.getRadius(), myCircleTwo.calculateArea());

        /*
        Use the public calculateCircumference() method belonging to the myCircleOne instance
        */
        System.out.printf("myCircleOne has the user specified radius of %.2f and circumference of %.2f %n", myCircleOne.getRadius(), myCircleOne.calculateCircumference());

         /*
        Use the public calculateCircumference() method belonging to the  myCircleTwo instance
        */
        System.out.printf("myCircleTwo has the user specified radius of %.2f and circumference of %.2f %n", myCircleTwo.getRadius(), myCircleTwo.calculateCircumference());

    } // End of main() method
} // End of CircleTest class