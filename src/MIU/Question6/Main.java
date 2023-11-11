package MIU.Question6;

public class Main {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1,8,3,7,10,2}));
        System.out.println(f(new int[]{1,5,3,1,1,1,1,1,1}));
        System.out.println(f(new int[]{2,1,1,1,2,1,7}));
        System.out.println(f(new int[]{1,2,3}));
        System.out.println(f(new int[]{3,4,5,10}));
        System.out.println(f(new int[]{1,2,10,3,4}));
    }

    public static int f(int[] a){
        int l=0, r=a.length-1,res=-1;
        while (l>=0 && r<= a.length-1){
            int mid = r - l /2;
            int ls = 0;
            int rs = 0;
            for (int i = 0; i < mid; i++) {
                ls += a[i];
            }
            for (int j = mid+1; j < a.length; j++) {
                rs += a[j];
            }

            if (ls == rs){
                res=mid;
                break;
            } else if (ls > rs) {
                l++;
            }else {
                r++;
            }
        }
        return res;
    }
}
