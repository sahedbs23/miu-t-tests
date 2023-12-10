package leetcode.DailyChellange;

public class Main {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
        System.out.println(largestGoodInteger("2300019"));
        System.out.println(largestGoodInteger("42352338"));
    }

    public static String largestGoodInteger(String num) {
        int max = -1;
        int i = 0;
        while (i < num.length() - 2) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                max = Math.max(num.charAt(i), max);
                i = i + 2;
            } else {
                i++;
            }
        }

        if (max == -1) {
            return "";
        }

        char c = (char) max;
        return new String(new char[]{c, c, c});
    }
}
