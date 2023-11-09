package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // there is no order
        Set<String> linkedHashSet = new LinkedHashSet<>();// in the order you fill the set
        Set<String> treeSet = new TreeSet<>(); // ordered

        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");

        for (String name : hashSet){
            System.out.println(name);
        }

        System.out.println();

        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        for (String name : linkedHashSet){
            System.out.println(name);
        }

        System.out.println();

        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for (String name : treeSet) {
            System.out.println(name);
        }

        System.out.println();

        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));

        // Union


    }
}
