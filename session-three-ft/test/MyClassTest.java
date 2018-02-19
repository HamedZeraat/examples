import org.junit.*;

import static org.junit.Assert.*;

public class MyClassTest {
    private MyClass my;

    @BeforeClass
    public static void setUpClass(){
        System.err.println("Beginning");
    }

    @AfterClass
    public static void finish(){
        System.err.println("After everything");
    }

    @Before
    public void setUp(){
        my = new MyClass();
        System.err.println("Before");
    }

    @After
    public void tearDown(){
        my = null;
        System.err.println("After");
    }

    @Test
    public void concatenate() {
        System.err.println("test 1");
        assertEquals("abcdef",my.concatenate("abc","def"));
    }

    @Test
    public void concatenateFails(){
        System.err.println("test 2");
        assertNotEquals("abc", my.concatenate("abc","def"));
    }

}