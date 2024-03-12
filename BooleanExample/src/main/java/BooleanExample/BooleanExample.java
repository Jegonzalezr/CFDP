package BooleanExample;

public class BooleanExample {

    public static void main(String[] args) {
        boolean and1 = true && true;
        boolean and2 = true && false;
        boolean and3 = false && true;
        boolean and4 = false && false;
        System.out.println(and1+" "+and2+" "+and3+" "+and4);

        boolean or1 = true || true;
        boolean or2 = true || false;
        boolean or3 = false || true;
        boolean or4 = false || false;
        System.out.println(or1+" "+or2+" "+or3+" "+or4);

        boolean xor1 = true ^ true;
        boolean xor2 = true ^ false;
        boolean xor3 = false ^ true;
        boolean xor4 = false ^ false;
        System.out.println(xor1+" "+xor2+" "+xor3+" "+xor4);

        boolean neg1 = !true;
        boolean neg2 = !false;
        System.out.println(neg1+" "+neg2);

        boolean b1 = ((4>2) && (3<10)) || (false && (3*4==12));
        System.out.println(b1);

        boolean b2 = ((4>2) && (3<10)) && (false && (3*4==12));
        System.out.println(b2);

        boolean b3 = ((4>2 || 1!=1) && (3<10)) && (!false && (3*4!=12));
        System.out.println(b3);

        boolean b4 = ((4>2 || 1!=1) && (3<10)) || (!false && (3*4!=12));
        System.out.println(b4);

        int ternary = 3 > 4 ? 1 : -1;
        System.out.println(ternary);

        String ternary2 = 4 == 1+4-1 ? "equal":"different";
        System.out.println(ternary2);
    }
}
