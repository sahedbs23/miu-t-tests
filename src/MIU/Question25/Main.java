package MIU.Question25;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSym(new int[]{2,7,9,10,11,5,8}));
        System.out.println(isSym(new int[]{9,8,7,13,14,17}));
        System.out.println(isSym(new int[]{2,7,8,9,11,13,10}));
    }

    public static int isSym(int[] a){
        int i =0, j = a.length-1;

        while (i<=j){
            if (a[i]%2 != a[j]%2){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
