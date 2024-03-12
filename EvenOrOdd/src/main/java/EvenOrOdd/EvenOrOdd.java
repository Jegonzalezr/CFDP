package EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese el número que desee verificar si es par o impar: ");
        int intA = sn.nextInt();
        String strA = (intA % 2) == 0 ? "Even" : "Odd";
        
        System.out.println(strA);
        
        sn.close();
    }
}