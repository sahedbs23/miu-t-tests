package algoMonster.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{5,3,1,2,4})));
        System.out.println(Arrays.toString(selectionSort(new int[]{1,2,3,5,6})));
    }
    public static int[] selectionSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[min] > a[j]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }
}
