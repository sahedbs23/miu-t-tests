package MIU.Question17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%s %d %n","{1}",isInertial(new int[]{1}));
        System.out.printf("%s %d %n","{2}",isInertial(new int[]{2}));
        System.out.printf("%s %d %n","{1,2,3,4}",isInertial(new int[]{1,2,3,4}));
        System.out.printf("%s %d %n","{1,1,1,1,1,1,2}",isInertial(new int[]{1,1,1,1,1,1,2}));
        System.out.printf("%s %d %n","{2,12,4,6,8,11}",isInertial(new int[]{2,12,4,6,8,11}));
        System.out.printf("%s %d %n","{2,12,12,4,6,8,11}",isInertial(new int[]{2,12,12,4,6,8,11}));
        System.out.printf("%s %d %n","{-2,-4,-6,-8,-11}",isInertial(new int[]{-2,-4,-6,-8,-11}));
        System.out.printf("%s %d %n","{2,3,5,7}",isInertial(new int[]{2,3,5,7}));
        System.out.printf("%s %d %n","{2,4,6,8,10}",isInertial(new int[]{2,4,6,8,10}));
    }

    public static int isInertial(int[] a){
        int l = a.length;

        if (l<2){
            return 0;
        }
        Arrays.sort(a);
        int le = a[l-1];

        if (le%2 != 0){
            return 0;
        }

        int lastIndexOfEvent = -1;
        for (int j = l-2; j >=0 ; j--) {
            if (a[j] != le && a[j]%2 == 0){
                lastIndexOfEvent = j;
                break;
            }
        }
        int firstIndexOfOdd = -1;

        for (int i = 0; i <= l - 2; i++) {
            if (a[i]%2 != 0){
                firstIndexOfOdd = i;
            }
        }

        if (firstIndexOfOdd == -1){
            return 0;
        }
        if (lastIndexOfEvent > firstIndexOfOdd){
            return 0;
        }
        return 1;
    }
}
