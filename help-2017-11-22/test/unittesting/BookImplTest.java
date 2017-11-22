package unittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookImplTest {
    final String NAME = "Fred";
    final String TITLE = "Mythical";

    Book b;

    @Before
    public void setup() {
       b = new BookImpl(NAME,TITLE);
    }

    @Test
    public void getAuthorName() {
        assertEquals(NAME, b.getAuthorName());
    }

    @Test
    public void getTitle() {
        assertEquals(TITLE,b.getTitle());
    }

}