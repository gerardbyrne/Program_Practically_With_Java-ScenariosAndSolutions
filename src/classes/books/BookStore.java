package classes.books;

public class BookStore
{
    static Book myBookOne = new Book("978-0-222456-47-2", 2021, "Program Practically With Java", 49.99);
    static Book myBookTwo = new Book("978-0-333456-47-2", 2021, "Program Practically With Java Example Projects", 39.99);

    public static void main(String[] args)
    {
        System.out.println(myBookOne.toString());
        myBookTwo.printBookDetails();
    } // End of main() method

} // End of class BookStore