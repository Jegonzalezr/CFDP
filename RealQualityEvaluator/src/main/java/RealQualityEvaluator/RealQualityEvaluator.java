package RealQualityEvaluator;

import java.util.Scanner;
        
public class RealQualityEvaluator {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingresar el primer número real a comparar: ");
        double doubleA = sn.nextDouble();
        
        System.out.println("Ingresar el segundo número real a comparar: ");
        double doubleB = sn.nextDouble();
        
        System.out.println("Ingresar la tolerancia entre los dos números a comparar: ");
        double doubleC = sn.nextDouble();
        
        
        String strA = doubleA - doubleB <= doubleC ? "Equals" : "Not Equals";
        System.out.println(strA);
        
        sn.close();
    }
}
