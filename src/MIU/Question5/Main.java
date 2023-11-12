package MIU.Question5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new int[1].length);
     System.out.println(Arrays.toString(f(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1})));
     System.out.println(Arrays.toString(f(new int[]{1,8,3,2,6}, new int[]{2,6,1})));
     System.out.println(Arrays.toString(f(new int[]{1,3,7,9}, new int[]{7,1,9,3})));
     System.out.println(Arrays.toString(f(new int[]{1,2}, new int[]{3,4})));
     System.out.println(Arrays.toString(f(new int[]{}, new int[]{1,2,3})));
     System.out.println(Arrays.toString(f(new int[]{1,2}, new int[]{})));
     System.out.println(Arrays.toString(f(new int[]{1,2}, null)));
     System.out.println(Arrays.toString(f(null, new int[]{})));
     System.out.println(Arrays.toString(f(null, null)));
    }

    public static int[] f(int[] first, int[] second){
        if (first == null || second == null){
            return null;
        }

        if (first.length ==0 || second.length==0){
            return new int[]{};
        }

        int[] r = new int[first.length+second.length];
        int k = -1;

        for (int i = 0; i < first.length; i++) {
            int n = first[i];
            if (n<0){
                continue;
            }
            for (int j = 0; j < second.length; j++) {
                if (n == second[j]){
                    k++;
                    r[k] = n;
                }
            }
        }
        int[] rr = new int[k+1];
        for (int i = 0; i <= k; i++) {
            rr[i] = r[i];
        }
        return rr;
    }
}
