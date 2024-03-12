package BigIntegerExample;

import java.math.BigInteger;
public class BigIntegerExample {

    public static void main(String[] args) {
        
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.ZERO);
        System.out.println(BigInteger.TEN);

        BigInteger a = new BigInteger("6000000000000000000000000000000000000000000");
        BigInteger b = new BigInteger("2000000000000000000000000000000000000001234");
        BigInteger c = a.add(b);
        System.out.println(c);

        c = a.multiply(b);
        System.out.println(c);

        c = a.subtract(b);
        System.out.println(c);

        c = a.divide(b);
        System.out.println(c);
    }
}
