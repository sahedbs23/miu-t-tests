package MIU.Question20;

public class Main {
    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{2, 1}));
        System.out.println(isGuthrieSequence(new int[]{8,4,2,1}));
        System.out.println(isGuthrieSequence(new int[]{8,17,4,1}));
        System.out.println(isGuthrieSequence(new int[]{8,4,1}));
        System.out.println(isGuthrieSequence(new int[]{8,4,2}));
    }

    public static int isGuthrieSequence(int[] a){

        if (a.length<2){
            return 0;
        }

        if (a[a.length-1] != 1 ){
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            int val = a[i];
            int nv;
            if (val %2 == 0){
                nv = val /2;
            }else {
                nv = (val *3) + 1;
            }
            if (a[i+1] != nv){
                return 0;
            }
        }
        return 1;
    }
}
