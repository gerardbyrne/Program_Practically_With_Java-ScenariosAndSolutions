package classes.circle;

/*
This is the Circle class which has a property,
two constructors and two methods.
*/
public class Circle
{
    /*
    The property called radius is declared with an access modifier of private
    which means it is only accessible from outside the class by using the
    getRadius() method. getRadius() is a getter method
    */
    private double radius = 1.00;

    /*
     We have two constructors so we have what is called constructor overloading
     This first constructor is the default constructor and does not do anything
     to the radius property. Remember that the primary purpose of the
     constructor is to change the default values of the properties
    */
    public Circle()
    {
    } // End of Circle constructor() that accepts no parameters

    /* This constructor is used to create a Circle instance with the radius
       size that is passed into the constructor at the time it is created
    */
    public Circle(double radiusPassedIn)
    {
        this.radius = radiusPassedIn;
    } // End of Circle constructor() that accepts a parameter

    /* This getter method is used to return the value of the radius property */
    public double getRadius()
    {
        return radius;
    } // End of getRadius() method

    /* This  method is used to return the value of the area of the circle with the specified radius */
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    } // End of calculateArea() method

    /* This  method is used to return the value of the circumference of the circle with the specified radius */
    public double calculateCircumference()
    {
        return Math.PI * radius * 2;
    } // End of calculateCircumference() method
} // End of Circle class