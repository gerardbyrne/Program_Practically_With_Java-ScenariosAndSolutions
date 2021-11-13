package classes.books;

public class BookStoreWithAuthor
{
    static Author myAuthorOne = new Author(1, "Gerry Byrne", "gb@test.com", "Computer Programming");

    static BookWithAuthor myBookWithAuthorOne = new BookWithAuthor("978-0-222456-47-2", 2021, "Program Practically With Java", 49.99, myAuthorOne);
    static BookWithAuthor myBookWithAuthorTwo = new BookWithAuthor("978-0-333456-47-2", 2021, "Program Practically With Java Example Projects", 39.99, myAuthorOne);

    public static void main(String[] args)
    {
        System.out.println(myBookWithAuthorOne.toString());
        myBookWithAuthorTwo.printBookDetails();
    } // End of main() method

} // End of class BookStore