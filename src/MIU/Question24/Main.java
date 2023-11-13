package MIU.Question24;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSub(new int[]{13,6,3,2}));
        System.out.println(isSub(new int[]{11,5,3,2}));
    }

    public static int isSub(int[] a){
        int l = a.length;
        for (int i = 0; i < l - 1; i++) {
            int e = a[i]; int sum = 0;
            int[] na = Arrays.copyOfRange(a,i+1,l);
            for (int ne : na) {
                sum += ne;
            }
            if (e <= sum){
                return 0;
            }
        }
        return 1;
    }
}
