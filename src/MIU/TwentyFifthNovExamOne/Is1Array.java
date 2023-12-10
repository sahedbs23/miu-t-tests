package MIU.TwentyFifthNovExamOne;

public class Is1Array {
    public static void main(String[] args) {
        System.out.println(findIs1Array(new int[]{1,2,1}));
        System.out.println(findIs1Array(new int[]{1,1,1,2,1,1,1}));
        System.out.println(findIs1Array(new int[]{1,1,1,2,1,3,1}));
        System.out.println(findIs1Array(new int[]{1,1,1,2,1,1,3}));
        System.out.println(findIs1Array(new int[]{1,1,2,2,2,1,1}));
        System.out.println(findIs1Array(new int[]{1,1,2,1,2,1,1}));
    }
    public static int findIs1Array(int[] a){
        if (a== null || a.length <2){
            return 0;
        }
        int i = 0;
        int j = a.length-1;
        if (a[i] != 1 || a[j] != 1){
            return 0;
        }
        int mid = (i + j-i) /2;

        if (a[mid] != 2){
            return 0;
        }

        while (i<j){
            if (a[i] != a[j]){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
