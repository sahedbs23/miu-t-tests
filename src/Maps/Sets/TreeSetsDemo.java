package Maps.Sets;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetsDemo {
    public static void main(String[] args) {
        Set<String> grocery = new TreeSet<>();

        grocery.add("Garlic");
        grocery.add("Apple");
        grocery.add("Eggs");

        Iterator<String> treeSetIterator = grocery.iterator();

        while (treeSetIterator.hasNext()){
            System.out.println(treeSetIterator.next());
        }
        char[] apple = "apple".toCharArray();

    }
}
