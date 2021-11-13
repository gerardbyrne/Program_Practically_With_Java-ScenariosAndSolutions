package classes.rectangle;

/*
This is the Circle class which has a property,
two constructors and two methods.
*/
public class Rectangle
{
    /*
    The properties called length and breadth are declared with access
    modifiers of private which means they are only accessible from
    outside the class by using the getLength() and getBreadth methods.
    getLength() and getBreadth are getter methods
    */
    private double length = 1.00;
    private double breadth = 1.00;
    private double xcoordinate;
    private double ycoordinate ;

    /*
     We have two constructors so we have what is called constructor overloading
     This first constructor is the default constructor and does not do anything
     to the length or breadth  properties. Remember that the primary purpose of the
     constructor is to change the default values of the properties
    */
    public Rectangle()
    {
    } // End of Rectangle constructor() that accepts no parameters

    /* This constructor is used to create a Rectangle instance with the length
       and breadth values that are passed into the constructor at the time it is created
    */
    public Rectangle(double lengthPassedIn, double breadthPassedIn)
    {
        this.length = lengthPassedIn;
        this.breadth = breadthPassedIn;
    } // End of Rectangle constructor() that accepts two arguments as parameters

    /* This getter method is used to return the value of the length property */
    public double getLength()
    {
        return length;
    } // End of getRadius() method

    /* This getter method is used to return the value of the breadth property */
    public double getBreadth()
    {
        return breadth;
    } // End of getBreadth() method

    /* This setter method is used to change the value of the length property */
    public void setLength(double length)
    {
        this.length = length;
    }

    /* This setter method is used to change the value of the breadth property */
    public void setBreadth(double breadth)
    {
        this.breadth = breadth;
    }

    /* This getter method is used to return the value of the xcoordinate property */
    public double getXcoordinate()
    {
        return xcoordinate;
    }

    /* This setter method is used to change the value of the xcoordinate property */
    public void setXcoordinate(double xcoordinate)
    {
        this.xcoordinate = xcoordinate;
    }

    /* This getter method is used to return the value of the ycoordinate property */
    public double getYcoordinate()
    {
        return ycoordinate;
    }

    /* This setter method is used to change the value of the ycoordinate property */
    public void setYcoordinate(double ycoordinate)
    {
        this.ycoordinate = ycoordinate;
    }

    /*
     This  method is used to return the value of the area of the rectangle with the
      specified values of the length and breadth
    */
    public double calculateArea()
    {
        return  length * breadth;
    } // End of calculateArea() method

    /*
    This  method is used to return the value of the perimeter of the rectangle with the
    specified values of the length and breadth
    */
    public double calculatePerimeter()
    {
        return  (length + breadth) * 2;
    } // End of calculatePerimeter() method

    @Override
    public String toString()
    {
        return "Rectangle{" +
            "length=" + length +
            ", breadth=" + breadth +
            ", xcoordinate=" + xcoordinate +
            ", ycoordinate=" + ycoordinate +
            '}';
    }
} // End of Rectangle class