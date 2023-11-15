package MIU.Question19;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));
    }

    public static int findPorcupineNumber(int n){
        int i = n;
        while (i<Integer.MAX_VALUE){
            i++;
            int prime = isPrime(i);
            if (prime == 0){
                continue;
            }

            if (!isEndWith9(i)){
                continue;
            }
            int nextPrime = findNextPrime(i);

            if (isEndWith9(nextPrime)){
                return i;
            }
            i = nextPrime;
        }
        return i;
    }

    private static boolean isEndWith9(int n){
        return n % 10 == 9;
    }

    private static int findNextPrime(int n){
        int j = n;
        while (j<Integer.MAX_VALUE){
            j++;
            int prime = isPrime(j);
            if (prime == 1){
                break;
            }
        }
        return j;
    }

    private static int isPrime(int n){
        for (int i = 2; i < n / 2; i++) {
            if (n%i == 0){
                return 0;
            }
        }
        return 1;
    }


}
