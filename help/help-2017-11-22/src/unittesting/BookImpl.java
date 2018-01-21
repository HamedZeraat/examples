package unittesting;

/**
 * Created by keith on 22/11/2017.
 */
public class BookImpl implements Book {
    private String name;
    private String title;

    public BookImpl(String name, String title){
        this.name = name;
        this.title = title;
    }

    @Override
    public String getAuthorName() {
        return name;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
