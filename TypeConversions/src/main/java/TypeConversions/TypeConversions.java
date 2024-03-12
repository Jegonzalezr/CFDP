package TypeConversions;

public class TypeConversions {

    public static void main(String[] args) {
        byte    b = 1;
        short   s = 2;
        int     i = 3;
        long    l = 4;
        float   f = 5;
        double  d = 6;
        char    c = 'x';
        boolean bn = true;
        String strB = b + "";
        String strS = String.valueOf(s);
        String strI = new String(i + "");
        String strL = l + "";
        String strF = new String(String.valueOf(f));
        String strD = new String("" + d);
        String strC = c + "";
        String strBn = bn + "";
        System.out.println("Printing Strings Values.");
        System.out.println(strB + " " + strS + " " + strI + " " + strL);
        System.out.println(strF + " " + strD + " " + strS + " " + strC);
        System.out.println(strBn);
        b = Byte.parseByte(strB);
        s = Short.parseShort(strS);
        i = Integer.parseInt(strI);
        l = Long.parseLong(strL);
        f = Float.parseFloat(strF);
        d = Double.parseDouble(strD);
        
// Not parse, we must extract first character
        c = strC.charAt(0);
        bn = Boolean.parseBoolean(strBn);
        System.out.println("Printing native variables via parsing.");
        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d + " " + s + " " + c);
        System.out.println(bn);
        b = Byte.valueOf(strB);
        s = Short.valueOf(strS);
        i = Integer.valueOf(strI);
        l = Long.valueOf(strL);
        f = Float.valueOf(strF);
        d = Double.valueOf(strD);
        bn = Boolean.valueOf(strBn);
        System.out.println("Printing native variables via valueOf.");
        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d + " " + s + " " + c);
        System.out.println(bn);
        Byte bw     = 1;
        Short sw    = 2;
        Integer iw  = 3;
        Long lw     = 4L;
        Float fw = new Float(5);
        Double dw = new Double(6);
        Character cw = 'x';
        Boolean bnw = true;
        System.out.println("Printing wrapper values.");
        System.out.println(bw + " " + sw + " " + iw + " " + lw);
        System.out.println(fw + " " + dw + " " + sw + " " + cw);
        System.out.println(bnw);
        b = bw.byteValue();
        s = sw.shortValue();
        i = iw.intValue();
        l = lw.longValue();
        f = fw.floatValue();
        d = dw.doubleValue();
        bn = bnw.booleanValue();
        System.out.println("Printing native values methods in wrapper classes.");
        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d + " " + s + " " + c);
        System.out.println(bn);
    }
}
