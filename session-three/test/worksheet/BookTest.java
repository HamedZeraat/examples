package worksheet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by keith on 15/11/2017.
 */
public class BookTest {
    private Book bk;
    private final static String author = "An author";
    private final static String title = "A title";

    @Before
    public void setUp() throws Exception {
        bk = new Book(author, title);
    }

    @Test
    public void getAuthorName() throws Exception {
        assertEquals(author, bk.getAuthorName());
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(title, bk.getTitle());
    }

}