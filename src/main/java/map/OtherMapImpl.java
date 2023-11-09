package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMapImpl {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>(); // no order guaranteed when iterating over it
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();//  how you add the elements to the map, it orders that way
        Map<Integer,String> treeMap = new TreeMap<>();// guarantees that it will be ordered by the key (natural ordering)

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);

    }

    public static void testMap(Map<Integer,String> map){
        map.put(39,"Bob");
        map.put(12,"Alex");
        map.put(21,"Gary");
        map.put(50,"John");
        map.put(1500,"Tom");
        map.put(7,"Tim");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
