package MIU.Question18;

import java.util.Arrays;

public class squarePairs {
    public static void main(String[] args){
        System.out.println(isPerfectSquare(3));
        System.out.println(isPerfectSquare(10));
        System.out.println(isPerfectSquare(17));

        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(16));

        System.out.println(countSquarePairs(new int[]{9,0,2,-5,7}));
        System.out.println(countSquarePairs(new int[]{9}));
        System.out.println(countSquarePairs(new int[]{11,5,4,20}));
    }

    public static int countSquarePairs(int[] a){
        int count = 0;
        if (a.length <= 1){
            return count;
        }
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            if (a[i] <=0){
                continue;
            }
            for(int j=i+1; j<a.length; j++ ){
                if (isPerfectSquare(a[i] + a[j]) == 1){
                    count++;
                }
            }
        }
        return count;
    }

    public static int isPerfectSquare(int n){
        return Math.sqrt(n) % 1 == 0 ? 1 : 0;
    }
}
