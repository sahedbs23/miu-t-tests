package MIU.TwentyFifthNovExamOne;

public class HighestExponent {
    public static void main(String[] args) {
        System.out.println(findHighestExponent(27,3));
        System.out.println(findHighestExponent(162,3));
        System.out.println(findHighestExponent(280,7));
        System.out.println(findHighestExponent(28,3));
        System.out.println(findHighestExponent(28,3));
    }

    static int findHighestExponent(int n, int p){
        if (p<=1){
            return 0;
        }
        int c = 1; int ex = 0;
        for (int i = p; i <=n; i++) {
            int cc = c;
            int total = 1;
            while (cc>0){
                total *= p;
                cc--;
            }
            if (n%total == 0){
                c++;
                ex++;
            }
        }
        return ex;
    }
}
