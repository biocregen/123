package Module1;

import java.math.BigInteger;

public class Maxlongsqr {
    public static BigInteger maxLongSqr() {
        BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
        a = a.multiply(b);
        return a;
    }
    public static void main(String[] args) {
        System.out.println(maxLongSqr());
    }
}
