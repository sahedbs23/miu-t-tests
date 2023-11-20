package MIU.Question7;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }

    public static int isPerfectSquare(int n){
        for (int i = n+1; i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j <= i; j++) {
                int jj = j*j;
                if (jj>i){
                    break;
                }
                if (jj == i){
                    return i;
                }
            }
        }
        return 0;
    }
}
