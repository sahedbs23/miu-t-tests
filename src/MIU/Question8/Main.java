package MIU.Question8;

public class Main {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2}, 5));
    }
    public static int nUpCount(int[] a, int n){
        int sum = 0;
        int upCount = 0;

        for (int i = 0; i < a.length; i++) {
            int temp = sum;
            sum += a[i];
            if (temp<= n && sum > n){
                upCount++;
            }
        }
//        return upCount;
        return Integer.MAX_VALUE;
    }
}
