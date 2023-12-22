package Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Giraffe");
        list.add("Cat");
        list.add("Lion");
        list.add("Dog");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()){
//                    return 1;
//                } else if (o1.length() < o2.length()) {
//                    return -1;
//                }else
//                return 0;
//            }
//        });
        System.out.println(list);
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
