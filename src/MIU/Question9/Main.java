package MIU.Question9;

public class Main {
    public static void main(String[] args) {
        System.out.println(primeCount(10,30));
        System.out.println(primeCount(11,29));
        System.out.println(primeCount(20,22));
        System.out.println(primeCount(1,1));
        System.out.println(primeCount(5,5));
        System.out.println(primeCount(6,2));
        System.out.println(primeCount(-10,6));
    }
    public static int primeCount(int start, int end){
        int count = 0;
        start = Math.max(start, 2);
        if (start>end){
            return count;
        }
        for (int i = start; i <= end; i++) {
            count += isPrime(i);
        }
        return count;
    }
    public static int isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
