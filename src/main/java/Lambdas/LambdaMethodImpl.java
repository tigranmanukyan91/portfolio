package Lambdas;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaMethodImpl {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArray(arr);
        fillList(list);

        // map method
        arr = Arrays.stream(arr).map(i -> i * 2).toArray();
        list = list.stream().map(i -> i * 2).toList();

        // all elements in the array will become 3
        arr = Arrays.stream(arr).map(i -> 3).toArray();
        //all elements in the array will increase by 1
        arr = Arrays.stream(arr).map(i -> i + 1).toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        //filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArray(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(i -> i % 2 == 0).toArray();
        list2 = list2.stream().filter(i-> i%2 == 0).toList();

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        //forEach method
        Arrays.stream(arr2).forEach(System.out::println);
        list2.forEach(System.out::println);

        //reduce method
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArray(arr3);
        fillList(list3);
        int sum1 = Arrays.stream(arr3).reduce((acc, i) -> acc + i).getAsInt();

        int product = list3.stream().reduce((acc, i) -> acc * i).get();

        System.out.println(sum1);
        System.out.println(product);

        int[] arr4 = new int[10];
        fillArray(arr4);

        int[] array = Arrays.stream(arr4).filter(i -> i % 2 != 0).map(i -> i * 2).toArray();

        System.out.println(Arrays.toString(array));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        set = set.stream().map( i -> i * 3).collect(Collectors.toSet());

        System.out.println(set);
    }

    private static void fillArray(int[] arr){
        for (int i = 0; i < 10; i++)
            arr[i] = i + 1;
    }
    private static void fillList(List<Integer> list){
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
    }

}
