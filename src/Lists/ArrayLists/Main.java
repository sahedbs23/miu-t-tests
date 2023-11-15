//package Lists.ArrayLists;
//
//import java.util.*;
//
//public class Main {
//
//    public enum GENDER{
//        MALE,
//        FEMALE,
//        OTHER
//    }
//    public static class Human {
//        public Human(String firstName, String lastName, GENDER sex, int age){
//        }
//    }
//    public static void main(String[] args) {
//        List<Human> list = new ArrayList<>();
//
//        list.add(new Human("Sahadat", "Hossain", GENDER.MALE, 33));
//        list.add("Sahed");
//        list.add("Lima");
//        list.add("Liza");
//        list.add("Imran");
//        list.add("Maria");
//        list.add("Solaiman");
//        list.add("Marzia");
//
//        System.out.printf("Family of %s: Number of family members :%d%n","Solaiman", list.size());
//
//        for (String member:list) {
//            System.out.println(member);
//        }
//        list.sort(Comparator.naturalOrder());
//
//        System.out.println("Natural order ordering...");
//        System.out.println("-".repeat(30));
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//
//    }
//}
