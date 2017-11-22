package unittesting;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by keith on 22/11/2017.
 */
public class UserImplTest {
    final String NAME = "FRED";
    User u;


    @Before
    public void setup(){
        u = new UserImpl(NAME);
    }
    @Test
    public void getName() throws Exception {
        assertEquals(NAME,u.getName());
    }

    @Test
    public void getLibraryID() throws Exception {
        assertEquals(13,u.getLibraryID());
    }

    @Ignore
    @Test
    public void setLibraryID() throws Exception {

    }

}