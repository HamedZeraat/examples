package arithmetic;

import java.math.BigInteger;

public class AdditionImpl implements Addition {

    @Override
    public BigInteger add(BigInteger a, BigInteger b) {
        return a.add(b);
    }
}
