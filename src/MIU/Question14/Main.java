package MIU.Question14;

public class Main {
    public static void main(String[] args) {
        System.out.println(answerTwo(new int[]{6,8,1,8,2}));
        System.out.println(answerTwo(new int[]{6,8,1,8,6}));
    }

    public static int answerTwo(int[] a){
        int mc = 0;
        int mv = 0;
        for (int i = 0; i < a.length; i++) {
            int tv = a[i];
            int tc = 0;

            for (int j = 0; j < a.length; j++) {
                if (tv == a[j]){
                    tc++;
                }
            }
            if (tc > mc){
                mc = tc;
                mv = tv;
            }
        }
        return mv;
    }
}
