package stringMethods.Concat;

public class StringConcatenation {

    public static void main(String[] args){
        System.out.println(concatString("Hello", "World"));
        String paragraphOne = "Lorem Ipsum Dollar emit!";
        String paragraphTwo = "This is another dummy string!";

        String[] stringArray = new String[]{
                "indexOf",
                "charAt",
                "toCharArray",
                "concat"
        };

        System.out.println(paragraphOne.concat("\n").concat(paragraphTwo));
        int count = 1;
        for(String str : stringArray){
            System.out.print(count++ + ". Useful String methods ".concat(str).concat("\n"));
        }

        System.out.println("Let's find out full address line from address");
        System.out.println("-".repeat(45));
        System.out.println(fullAddress("54/3, Kawlar Molla Bari","Mosjid Road","Dakhsinkhan, Dhaka-1229"));
    }

    public static String concatString(String str1, String str2){
        return str1.concat(" ").concat(str2);
    }

    public static String fullAddress(String s1, String s2, String s3){
        return s1.concat(", ").concat(s2).concat(", ").concat(s3);
    }


}
