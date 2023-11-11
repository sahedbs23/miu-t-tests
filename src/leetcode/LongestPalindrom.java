package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class LongestPalindrom {
    public static void main(String[] args) {

    }

    public static int findLongestPalindrom(String s){
        Map<Character, Integer> map = new HashMap<>();
        int i=0, j=s.length()-1;
        while (i<=j){
            char c = s.charAt(i);
            if (i==j){
                if (map.containsKey(c)){
                    map.put(c,map.get(c) + 1);
                }else {
                    map.put(c, 1);
                }
                i++;
            }else {
                char ce = s.charAt(i);
                if (map.containsKey(c)){
                    map.put(c,map.get(c) + 1);
                }else {
                    map.put(c, 1);
                }

                if (map.containsKey(ce)){
                    map.put(c,map.get(ce) + 1);
                }else {
                    map.put(ce, 1);
                }
                i++;
                j--;
            }
        }
        return 1;
    }
}
