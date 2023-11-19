package Maps.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Rejuana Rahman Prova", "01730445377");
        phoneBook.put("Sahed Moral", "01714999720");

        System.out.println(phoneBook.containsValue("01714999720"));

        for (String v:phoneBook.values()) {
            System.out.println(v);
        }

        for(String k:phoneBook.keySet()){
            System.out.println(k);
        }

        for(Map.Entry<String,String> entry : phoneBook.entrySet()){
            System.out.printf("%s -> %s %n",entry.getKey(), entry.getValue());
        }

        phoneBook.computeIfPresent("Sahed Moral", (key, value) -> "+88".concat(value));
        phoneBook.putIfAbsent("Abdur Rahman", "+8801814999874");
        System.out.println(phoneBook);

        System.out.println(phoneBook.remove("Abdur Rahman"));
        System.out.println(phoneBook.size());
        System.out.println(phoneBook.isEmpty());

//        phoneBook.replace("Rejuana Rahman Prova" ,"+8801730445377");
        phoneBook.put("Rejuana Rahman Prova" ,"+8801730445377");


        System.out.println(phoneBook);
    }
}
