package MIU.Question21;

public class Main {
    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{3,1,1,4}));
        System.out.println(stantonMeasure(new int[]{1,3,1,1,3,3,2,3,3,3,4}));
        System.out.println(stantonMeasure(new int[]{}));
    }

    public static int stantonMeasure(int[] a){
        int oc = 0;
        int sm = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1){
                oc++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (oc == a[i]){
                sm++;
            }
        }
        return sm;
    }
}
