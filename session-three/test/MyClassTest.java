import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MyClassTest {
    private MyClass myUnit;

    @Before
    public void testInit(){
        myUnit = new MyClass();
    }

    @Test
    public void testConcatenate() {
       String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenateFail() {
        String result = myUnit.concatenate("one", "two");

        assertNotEquals("onetw", result);
    }

}