package algoMonster.sorting;

import java.util.Arrays;

public class MedianOfSortedArray {
    public static void main(String[] args) {
//        findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        System.out.println(findMedianSortedArrays(new int[]{5,6,7}, new int[]{1,2}));
//        1,2,5,6,7,8
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1l = nums1.length;
        int n2l = nums2.length;

        if(n1l == 0 && n2l == 0){
            return 0.00;
        }

        if(nums1.length == 0){
            return sum(nums2);
        }

        if(nums2.length == 0){
            return sum(nums1);
        }

        int pos = searchInsert(nums1, nums2[0]);
        int tl = n1l + n2l;
        int[] median2 = searchMid(tl);
        System.out.printf("ip:%d tl:%d m:%s a1:%s a2:%s %n",pos, tl, Arrays.toString(median2), Arrays.toString(nums1), Arrays.toString(nums2));

        double sum = 0.0;
        for(int i=0; i< median2.length; i++){
            int index = median2[i];
            if (pos == 0){
                if (index <= n2l-1){
                    sum += nums2[index];
                }else {
                    sum += nums1[index - n2l];
                }
            } else if (pos >n1l-1) {
                if (index<=n1l-1){
                    sum += nums1[index];
                }else {
                    sum += nums2[index-n1l];
                }
            }else {
                if (index>=pos && index<=(pos+n2l-1)){
                    sum += nums2[n2l-index];
                }else {
                    sum += nums1[index-pos];
                }
            }
        }
        return median2.length == 1 ? sum : sum/2;
    }


    public static double sum(int[] nums){
        double sum = 0.0;
        int[] median = searchMid(nums.length);
        for(int i=0; i< median.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    public static int[] searchMid(int l){
        int al = l-1;
        int m = al/2;
        if(al%2 == 0){
            return new int[]{m};
        }else{
            return new int[]{m,m+1};
        }
    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int m = 0;
        while(i<=j){
            m = (i+j)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] > target){
                j = m-1;
            }else{
                i = m+1;
            }
        }

        return  nums[m] < target ? m+1 : m;
    }
}
