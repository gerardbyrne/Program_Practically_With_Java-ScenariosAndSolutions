package classes.books;

public class Author
{
    /*
Declare the properties of the class
*/
    private long authorId;
    private String authorName;
    private String authorEmail;
    private String authorCategory;

    /*
    Declare the constructor for the class and
    use it to set the value of the properties
    */
    public Author(long authorIdPassedIn, String authorNamePassedIn, String authorEmailPassedIn, String authorCategoryPassedIn)
    {
        this.authorId = authorIdPassedIn;
        this.authorName = authorNamePassedIn;
        this.authorEmail = authorEmailPassedIn;
        this.authorCategory = authorCategoryPassedIn;
    }

    /* This getter method is used to return the value of the author id property */
    public long getAuthorId()
    {
        return authorId;
    }

    /* This setter method is used to amend the value of the author id property */
    public void setAuthorId(long authorId)
    {
        this.authorId = authorId;
    }

    /* This getter method is used to return the value of the author name property */
    public String getAuthorName()
    {
        return authorName;
    }

    /* This setter method is used to amend the value of the author name property */
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    /* This getter method is used to return the value of the author email property */
    public String getAuthorEmail()
    {
        return authorEmail;
    }

    /* This setter method is used to amend the value of the author email property */
    public void setAuthorEmail(String authorEmail)
    {
        this.authorEmail = authorEmail;
    }

    /* This getter method is used to return the value of the author category property */
    public String getAuthorCategory()
    {
        return authorCategory;
    }

    /* This setter method is used to amend the value of the author category property */
    public void setAuthorCategory(String authorCategory)
    {
        this.authorCategory = authorCategory;
    }

    @Override
    public String toString()
    {
        return "Author{" +
            "authorId=" + authorId +
            ", authorName='" + authorName + '\'' +
            ", authorEmail='" + authorEmail + '\'' +
            ", authorCategory='" + authorCategory + '\'' +
            '}';
    }

    public void printAuthorDetails()
    {
        System.out.println("The author id is " + authorId);
        System.out.println("The author name is " + authorName);
        System.out.println("The author email is " + authorEmail);
        System.out.println("The author category is " + authorCategory);
    } // End of printAuthorDetails() method

} // End of Author class
