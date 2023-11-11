package stringMethods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String abc = "abc";
        char[] c = new char[]{'a', 'b', 'c'};
        String cs = new String(c);
        System.out.println(abc);
        System.out.println(cs);
        System.out.println(abc.equals(cs));

        System.out.println("abc" + "cde");
        System.out.println(abc.substring(1,3));

        System.out.println("C".compareTo("c"));

        System.out.println("ABCDEFGH".contains("BCD"));

        System.out.println(String.join("AB", "BC"));

        System.out.println("ABCAB".lastIndexOf('A'));

        System.out.println(Arrays.toString("Hello_Dolly_How_are_you   ".split("_")));

    }
}
