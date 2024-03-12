package DeclareVariables;

import
    java.util.Scanner;
public class DeclareVariables {
    public static void main(String args[] ){
        //Here we declare a variable called sn, wich is an instance of Scanner
        //Is just for read the data.
        Scanner sn = new Scanner(System.in);
        
        //The next 9 lines are valid declarations of native data type variables.
        byte    b;
        short   s;
        int     i;
        long    l;
        float   f;
        double  d;
        char    c;
        boolean bn;
        
        //The next line is a example of how to declare a String variable.
        String str;
        
        System.out.print("Type a byte value: ");
        b = sn.nextByte();
        System.out.println("The byte we just read is: "+b);

        System.out.print("Type a short value: ");
        s = sn.nextShort();
        System.out.println("The short we just read is: " + s);

        System.out.print("Type a int value: ");
        i = sn.nextInt();
        System.out.println("The int we just read is: " + i);

        System.out.print("Type a long value: ");
        l= sn.nextLong();
        System.out.println("The long we just read is: " + l);
        
        System.out.println("Type a float value(a numer like 4.2): ");
        f = sn.nextFloat();
        System.out.println("The float we just read is: " + f);
        
        System.out.println("Type a double value (a number like 4.32332): ");
        d = sn.nextDouble();
        System.out.println("The double we just read is: " + d);
        
        //The next two lines not work
        //c = sn.nextChar();
        //System.out.println("The we just read is: " +);
        
        //There is no support in java to read a char.
        //So we read a String and extract the first char
        System.out.println("Type a char value (a single letter): ");
        c = sn.next().charAt(0);
        System.out.println("The we just read is: " + c);
        
        System.out.println("Type a boolean value(true or false): ");
        bn = sn.nextBoolean();
        System.out.println("The boolena we just read is: " + bn);
        
        System.out.println("Type a String value (without spaces or tabs): ");
        str = sn.next();
        System.out.println("The string we just read is: " + str);
        
        sn.close();
    }
}
