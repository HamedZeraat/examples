package ex01;

/**
 * Create a class for books. Books have authors and titles.
 * The class should implement getters for both author name and title,
 * but these must be set at construction time and never be modified
 * afterwards. (Reminder: An object whose fields cannot be changed after construction is
 * called an immutable object.)
 */
public class Book {
    private String authorName;
    private String title;

    /**
     *
     * @param authorName
     * @param bookTitle
     */
    public Book(String authorName, String bookTitle){
        this.authorName = authorName;
        title = bookTitle;
    }

    public String getAuthorName(){
        return authorName;
    }

    public String getTitle(){
        return title;
    }
}
