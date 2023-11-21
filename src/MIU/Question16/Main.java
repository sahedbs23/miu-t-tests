package MIU.Question16;

public class Main {
    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }

    public static int isMadhavArray(int[] a) {
        int l = a.length;
        int n = 2;
        int fi = 1;
        while (fi < l) {
            int li = n * (n + 1) / 2;
            if (li > l) {
                return 0;
            }
            int sum = 0;
            for (int i = fi; i < li; i++) {
                sum += a[i];
            }
            if (sum != a[0]) {
                return 0;
            }
            fi = li;
            n++;
        }
        return 1;

    }
}
