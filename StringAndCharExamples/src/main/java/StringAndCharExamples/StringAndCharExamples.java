package StringAndCharExamples;

public class StringAndCharExamples {

    public static void main(String[] args) {
        String s = " Strings in Java are easy ";
        String s2 = " Strings in Java ARE EASY ";
        System.out.println(s.charAt(4));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(0));
        System.out.println("The size is :" + s.length());
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.equals(s2));
        System.out.println(s.compareTo("XXX"));
        System.out.println(s.compareTo("AAA"));
        System.out.println(s.compareTo(s));
        System.out.println(s.compareToIgnoreCase(s2));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("xxxx"));
        System.out.println(s);
        System.out.println("_" + s.trim() + "_");
        System.out.println(s.trim().endsWith("easy"));
        System.out.println(s.trim().endsWith("hard"));
        System.out.println(s.trim().startsWith("Strings"));
        System.out.println(s.trim().startsWith("games"));
        System.out.println(s.lastIndexOf("s"));
    }
}
