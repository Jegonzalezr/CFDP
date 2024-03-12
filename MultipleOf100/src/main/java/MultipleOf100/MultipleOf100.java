package MultipleOf100;

import java.util.Scanner;

public class MultipleOf100 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int intA = sn.nextInt();
        String multipleA = (intA % 100) == 0 ? "Multiple of 100" : "Not multiple of 100";
        
        System.out.println(multipleA);
        
        sn.close();
    }
}
