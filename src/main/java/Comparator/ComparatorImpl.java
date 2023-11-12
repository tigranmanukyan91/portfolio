package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImpl {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Owl");
        animals.add("Alligator");
        animals.add("Frog");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return 1;
                }else if (o1.length() < o2.length()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(100);
        numbers.add(50);
        numbers.add(70);
        numbers.add(80);

        Collections.sort(numbers, (o1, o2) -> {
            if (o1 < o2){
                return 1;
            }else if (o1 > o2){
                return -1;
            }else
                return 0;
        });
        System.out.println(numbers);


        List<Person> people = new ArrayList<>();

        people.add(new Person(1,"John"));
        people.add(new Person(2,"Tim"));
        people.add(new Person(3,"Tom"));
        people.add(new Person(4,"Mike"));
        people.add(new Person(5,"Peter"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()){
                    return 1;
                }else if (o1.getId() < o2.getId()){
                    return -1;
                }else
                    return 0;
            }
        });
        System.out.println(people);
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Comparator.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
