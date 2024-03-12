package IntsAndBitsExample;

public class IntsAndBitsExample {

    public static void main(String[] args) {
        int a = 23, b = 27;
        System.out.println("a = "+a+" = "+Integer.toBinaryString(a)+" in binary");
        System.out.println("b = "+b+" = "+Integer.toBinaryString(b)+" in binary");

        int bitNegationA = ~a;
        int bitNegationB = ~b;
        int bitOr = a|b;
        int bitAnd = a&b;
        int bitXor = a^b;
        System.out.println("bitNegationA in Decimal: "+bitNegationA);
        System.out.println("bitNegationA in Binary : "+Integer.toBinaryString(bitNegationA));
        System.out.println("bitNegationB in Decimal: "+bitNegationB);
        System.out.println("bitNegationB in Binary : "+Integer.toBinaryString(bitNegationB));
        System.out.println(a+"|"+b+" in Decimal: "+bitOr);
        System.out.println(a+"|"+b+" in Binary : "+Integer.toBinaryString(bitOr));
        System.out.println(a+"&"+b+" in Decimal: "+bitAnd);
        System.out.println(a+"&"+b+" in Binary : "+Integer.toBinaryString(bitAnd));
        System.out.println(a+"^"+b+" in Decimal: "+bitXor);
        System.out.println(a+"^"+b+" in Binary : "+Integer.toBinaryString(bitXor));

        int shiftRight = a >> 3;
        int shiftLeft = a << 3;
        int shiftRight2 = a >>> 3;
        int shiftRightNegative = (-a) >> 3;
        int shiftLeftNegative = (-a) << 3;
        int shiftRightNegative2 = (-a) >>> 3;
        System.out.println(a+" >> "+3+" in Decimal: "+shiftRight);
        System.out.println(a+" >> "+3+" in Binary : "+Integer.toBinaryString(shiftRight));
        System.out.println(a+" << "+3+" in Decimal: "+shiftLeft);
        System.out.println(a+" << "+3+" in Binary : "+Integer.toBinaryString(shiftLeft));
        System.out.println(a+" >>> "+3+" in Decimal: "+shiftRight2);
        System.out.println(a+" >>> "+3+" in Binary : "+Integer.toBinaryString(shiftRight2));
        System.out.println(-a+" >> "+3+" in Decimal: "+shiftRightNegative);
        System.out.println(-a+" >> "+3+" in Binary : "+Integer.toBinaryString(shiftRightNegative));
        System.out.println(-a+" << "+3+" in Decimal: "+shiftLeftNegative);
        System.out.println(-a+" << "+3+" in Binary : "+Integer.toBinaryString(shiftLeftNegative));
        System.out.println(-a+" >>> "+3+" in Decimal: "+shiftRightNegative2);
        System.out.println(-a+" >>> "+3+" in Binary : "+Integer.toBinaryString(shiftRightNegative2));
    }
}
