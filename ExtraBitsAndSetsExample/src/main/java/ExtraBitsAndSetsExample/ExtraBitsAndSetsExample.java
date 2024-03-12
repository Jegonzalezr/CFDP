package ExtraBitsAndSetsExample;

import static java.lang.Integer.*;

public class ExtraBitsAndSetsExample {

    public static void main(String[] args) {

        //To represent the set: {a,b,c,d}
        String universalSetNames = "dcba";
        int universalSetSize = universalSetNames.length();
        int universalSet = (1<<universalSetSize)-1;
        System.out.println("{d,c,b,a} = "+universalSet+" = "+ toBinaryString(universalSet));

        int indexA = 0;
        int indexC = 2;
        int aBit = 1<<indexA;
        int cBit = 1<<indexC;
        int aUc = aBit|cBit;
        System.out.println("aUc = "+aUc+" = "+toBinaryString(aUc)+" in binary");

        int sizeOfASet = bitCount(aUc);
        System.out.println("size of "+aUc+" ("+toBinaryString(aUc)+") = "+sizeOfASet);
        System.out.println(highestOneBit(aUc));
        System.out.println(lowestOneBit(aUc));
        System.out.println(Integer.numberOfLeadingZeros(aUc));
        System.out.println(Integer.numberOfTrailingZeros(aUc));
        System.out.println(toBinaryString(Integer.reverse(aUc)));
        System.out.println(toBinaryString(reverseBytes(aUc)));
        System.out.println(toBinaryString(rotateLeft(aUc, 2)));
        System.out.println(toBinaryString(rotateRight(aUc, 2)));
        System.out.println(Integer.toHexString(aUc));
        System.out.println(Integer.toOctalString(aUc));
    }
}