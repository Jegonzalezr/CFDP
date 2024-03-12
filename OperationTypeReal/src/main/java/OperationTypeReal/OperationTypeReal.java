package OperationTypeReal;

public class OperationTypeReal {

    public static void main(String[] args) {
        int     intA = 4;
        int     intB = 3;
        double  doubleA = 4;
        double  doubleB = 3;
        double  doubleC = 4/3.0;
        double  doubleD = 4.0/3;
        double  doubleE = 4.0/3.0;
        double  doubleF = intA/intB;
        double  doubleG = intA/(double)intB;
        double  doubleH = (double)intA/intB;
        double  doubleI = (double)intA/(double)intB;
        double  doubleJ = 4/5 + 3*intB/intA - intA/intB + (intA*(intB/intA));
        
        System.out.println("doubleA     =" + doubleA);
        System.out.println("doubleB     =" + doubleB);
        System.out.println("doubleC     =" + doubleC);
        System.out.println("doubleD     =" + doubleD);
        System.out.println("doubleE     =" + doubleE);
        System.out.println("doubleF     =" + doubleF);
        System.out.println("doubleG     =" + doubleG);
        System.out.println("doubleH     =" + doubleH);
        System.out.println("doubleI     =" + doubleI);
        System.out.println("doubleJ     =" + doubleJ);
    }
}
