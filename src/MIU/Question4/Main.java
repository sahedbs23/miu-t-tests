package MIU.Question4;

public class Main {
    public static void main(String[] args) {
        System.out.println(f(1234));
        System.out.println(f(12005));
        System.out.println(f(1));
        System.out.println(f(1000));
        System.out.println(f(-12345));
    }

    public static int f(int n){
        //1234
        int rev = 0;
        int rem = 0;
        while (n!=0){
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }

          return  rev;
    }
}
