package arithmetic;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class AdditionTest {
    private BigInteger b;
    private BigInteger c;
    private Addition item;

//    static {
//
//    }
//
//    {
//        b = new BigInteger("123");
//        c = new BigInteger("234");
//    }


    @Before
    public void startup() {
        item = new AdditionImpl();
        b = new BigInteger("123");
        c = new BigInteger("234");
//        System.err.println("Doing startup");
    }

    @Test
    public void addEquals() {
        assertEquals(new BigInteger("357"), item.add(b, c));
    }

    @Test
    public void addNotEquals() {
        assertNotEquals(new BigInteger("0"), item.add(b, c));
    }

    @Test
    @Ignore
    public void whoKnows() {
        fail();
    }
}
