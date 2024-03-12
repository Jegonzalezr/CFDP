package IntExample;

public class IntExample {

    public static void main(String[] args) {
        double doubleA = 4, doubleB = 3;
        int intA = 4, intB = 3;
        
        //int intC = 4/3.0;
        //int intD = 4.0/3;
        //int intE = 4.0/3.0;
        //int intF = doubleA/doubleB;
        //int intG = doubleA/(int)doubleB;
        //int intH = (int)doubleA/doubleB;
        
        int intI = (int)doubleA/(int)doubleB;
        int intJ = 4/5 + 3*intB/intA - intA/intB + (intA*(intB/intA));
        int intQ = 13/3;
        int intR = 13%3;
        System.out.println("intA = " + intA);
        System.out.println("intB = " + intB);
        System.out.println("intQ = " + intQ);
        System.out.println("intR = " + intR);
        System.out.println("intI = " + intI);
        System.out.println("intJ = " + intJ);
    }
}
