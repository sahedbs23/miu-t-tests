package MIU.Question15;

public class Main {
    public static void main(String[] args) {
        System.out.println(answerThree(new int[]{}));
        System.out.println(answerThree(new int[]{5,4,3,2,3,4,6,1}));
    }

    public static int answerThree(int[] a) {
        int l = a.length;
        if (l== 0 || l%2 != 0){
            return 0;
        }
        int fhs = 0;
        int shs = 0;
        int m = l/2;
        for (int i = 0; i < m; i++) {
            fhs += a[i];
        }

        for (int i = m; i < l; i++) {
            shs += a[i];
        }

        return fhs == shs ? 1 : 0;
    }
}
