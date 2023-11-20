package MIU.Question3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 0, 4  )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 0, 3 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 0, 2 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 0, 1 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 1, 3  )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 1, 2 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 1, 1 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 2, 2 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 2, 1 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 3, 1 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, 1, 0 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, -1, 2 )));
        System.out.println(Arrays.toString(f(new char[]{'a','b','c'}, -1, -2 )));
        System.out.println(Arrays.toString(f(new char[]{}, 0, 1 )));
    }

    public  static char[] f(char[] a, int start, int len){
        int al = a.length;
        if (al ==0 || start<0 || len<0){
            return null;
        }
        int ul = start + len;

        if (ul > al){
            return null;
        }

        char[] aa  = new char[len];
        int j =0;
        for (int i = start; i < ul; i++) {
            aa[j] = a[i];
            j++;
        }
        return aa;

    }
}
