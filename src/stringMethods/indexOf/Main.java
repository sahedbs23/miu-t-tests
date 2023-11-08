package stringMethods.indexOf;

public class Main {

    public static void main(String[] args){
        String helloWorld  = "Hello World!";

        int index = findStringIndex(helloWorld, "World");

        if ( index >= 0){
            System.out.printf("Index found at %d%n", index);
        }
        char searchChar = 'W';
        int charIndex = findCharIndex(helloWorld, searchChar);

        if (charIndex >= 0){
            System.out.printf("`%c` found in string : %d%n", searchChar, charIndex);
        }

        char searchChar2 = '!';
        int charIndex2 = findIndex(helloWorld, searchChar2, 5);
        if (charIndex2 > 0){
            System.out.printf("'%c' found at index %d in '%s' %n",searchChar2, charIndex2, helloWorld);
        }

        System.out.println(helloWorld.lastIndexOf('l'));

        System.out.println(helloWorld.indexOf(5));
    }

    public static int findStringIndex(String s, String c){
        return findIndex(s,c,0);
    }

    public static int findCharIndex(String s, char c){
        return findIndex(s,c,0);
    }

    private static int findIndex(String s, char c, int searchStart){
        return s.indexOf(c, searchStart);
    }

    private static int findIndex(String s, String c, int searchStart){
        return s.indexOf(c,searchStart);
    }
}
