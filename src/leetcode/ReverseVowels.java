package leetcode;

import java.util.Arrays;

public class ReverseVowels {
    public static final String VOWELS = "AEIOUaeiou";

    public static boolean isVowel(char c){
        return switch (c) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    public static String reverse(String s){
        char[] sArr = s.toCharArray();
        int i=0, j=s.length()-1;
        boolean iBool,jBool;
        while(i < j){
                iBool = isVowel(s.charAt(i));
                jBool = isVowel(s.charAt(j));
            if (iBool && jBool){
                char tempChar = s.charAt(i);
                sArr[i] = sArr[j];
                sArr[j] = tempChar;
                i++;
                j--;
            } else if (!iBool) {
                i++;
            }else {
                j--;
            }
        }
        return String.valueOf(sArr);
    }
}