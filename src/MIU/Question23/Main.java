package MIU.Question23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isEvenSpaced(new int[]{100,19,131,140}));
        System.out.println(isEvenSpaced(new int[]{200,1,151,160}));
        System.out.println(isEvenSpaced(new int[]{200,10,151,160}));
        System.out.println(isEvenSpaced(new int[]{100,19,-131,-140}));
        System.out.println(isEvenSpaced(new int[]{80,-56,11,-81}));
    }

    public static int isEvenSpaced(int[] a){
        int l = a.length;
        if (l<2){
            return 0;
        }

        Arrays.sort(a);
        int diff = a[l-1] - a[0];
        if (diff%2 == 0){
            return 1;
        }else {
            return 0;
        }
    }
}
