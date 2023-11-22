package algoMonster.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
       System.out.println(Arrays.toString(insertionSort(new int[]{5,3,1,2,4})));
    }
    public static int[] insertionSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            //assuming first number is sorted
            int c =  i;
            while (c>0 && a[c] < a[c-1]){
                int t = a[c-1];
                a[c-1] = a[c];
                a[c] = t;
                c--;
            }
        }
        return a;
    }
}
