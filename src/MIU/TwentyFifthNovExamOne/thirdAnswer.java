package MIU.TwentyFifthNovExamOne;

public class thirdAnswer {
    public static void main(String[] args) {
        System.out.println(f(new  int[]{1,3,31,11}));
    }

    public static int f(int[] a){
        int diff = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] != a[j]){
                    diff++;
                }
            }
            if (diff >= 2){
                break;
            }
        }

        if (diff < 2){
            return -1;
        }

        int min = a[0];
        int max = a[a.length-1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min){
                min = a[i];
            }
            if (a[i] > max){
                max = a[i];
            }
        }

        int minCount = 0;
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == min){
                minCount++;
            }
            if (a[i] == max){
                maxCount++;
            }
        }
        return minCount == maxCount ? 1 : -1;
    }
}
