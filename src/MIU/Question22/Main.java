package MIU.Question22;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        System.out.println(sumFactor(new int[]{3,0,2,-5,0}));
        System.out.println(sumFactor(new int[]{9,-3,-3,-1,-1}));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0,0,0}));
//        System.out.println(sumFactor(new int[]{}));
    }

    public static int sumFactor(int[] a){
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int j : a) {
            Integer g = map.getOrDefault(j, 0);
            map.put(j, ++g);
            sum += j;
        }
        var count = map.get(sum);
        return Objects.requireNonNullElse(count, 0);
    }
}
