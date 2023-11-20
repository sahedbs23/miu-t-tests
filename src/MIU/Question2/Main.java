package MIU.Question2;

public class Main {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1,2}));
        System.out.println(f(new int[]{1,2,3}));
        System.out.println(f(new int[]{1,2,3,4}));
        System.out.println(f(new int[]{3,3,4,4}));
        System.out.println(f(new int[]{}));
    }
    public static int f(int[] a){
        int os = 0;
        int es =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                es += a[i];
            }else {
                os += a[i];
            }
        }
        return os - es;
    }
}
