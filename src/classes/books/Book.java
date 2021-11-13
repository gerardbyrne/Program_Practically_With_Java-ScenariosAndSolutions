package classes.books;

public class Book
{
    /*
    Declare the properties of the class
    */
    private String isbn;
    private int yearOfPublication;
    private String bookName;
    private double bookPrice;

    /*
    Declare the constructor for the class and
    use it to set the value of the properties
    */
    public Book(String isbnPassedIn, int yearOfPublicationPassedIn, String bookNamePassedIn, double bookPricePassedIn  )
    {
        isbn = isbnPassedIn;
        yearOfPublication = yearOfPublicationPassedIn;
        bookName = bookNamePassedIn;
        bookPrice = bookPricePassedIn;
    }

    /* This getter method is used to return the value of the isbn property */
    public String getIsbn()
    {
        return isbn;
    }

    /* This setter method is used to amend the value of the isbn property */
    public void setIsbn(String author)
    {
        this.isbn = author;
    }

    /* This getter method is used to return the value of the year of publication property */
    public int getYearOfPublication()
    {
        return yearOfPublication;
    }

    /* This setter method is used to amend the value of the year of publication property */
    public void setYearOfPublication(int yearOfPublication)
    {
        this.yearOfPublication = yearOfPublication;
    }

    /* This getter method is used to return the value of the bookName property */
    public String getBookName()
    {
        return bookName;
    }

    /* This setter method is used to amend the value of the bookName property */
    public void setBookName(String name)
    {
        this.bookName = name;
    }

    /* This getter method is used to return the value of the getBookPrice property */
    public double getBookPrice()
    {
        return bookPrice;
    }

    /* This setter method is used to amend the value of the bookPrice property */
    public void setBookPrice(double bookPrice)
    {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString()
    {
        return "Book{" +
            "isbn='" + isbn + '\'' +
            ", yearOfPublication=" + yearOfPublication +
            ", bookName='" + bookName + '\'' +
            ", bookPrice=" + bookPrice +
            '}';
    }

    public void printBookDetails()
    {
        System.out.println("The isbn code for the book is " + isbn);
        System.out.println("The year of publication is " + yearOfPublication);
        System.out.println("The book has title of " + bookName);
        System.out.println("The book price is " + bookName);
    } // End of printBookDetails() method

} // End of BookStore class