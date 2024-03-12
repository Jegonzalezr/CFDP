package BigDecimalExample;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalExample {

    public static void main(String[] args) {
        System.out.println(BigDecimal.ONE);
        System.out.println(BigDecimal.ZERO);
        System.out.println(BigDecimal.TEN);

        BigDecimal a = new BigDecimal("600000000000000000000000000000000.00000929309");
        BigDecimal b = new BigDecimal("200000000000000000000000000000000.00034211234");
        System.out.println("Precision: " + a.precision());

        MathContext mc = new MathContext(100);
        BigDecimal c = a.add(b, mc);
        System.out.println(c);

        c = a.multiply(b);
        System.out.println(c);

        c = a.subtract(b);
        System.out.println(c);

        c = a.divide(b, mc);
        System.out.println(c);
    }
}
