package Comparable;

import java.util.*;

public class ComparableImpl {
    public static void main(String[] args) {
        List<Person1> peopleList = new ArrayList<>();
        Set<Person1> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }
    private static  void addElements(Collection collection){
        collection.add(new Person1(1,"Jack"));
        collection.add(new Person1(3,"Dawson"));
        collection.add(new Person1(2,"Thierry"));
        collection.add(new Person1(4,"Aleksandr"));
    }
}

class Person1 implements Comparable<Person1>{
    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return id == person1.id && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person1 o) {
        if (this.id > o.getId()){
            return 1;
        }else if (this.id < o.getId()){
            return -1;
        }else
            return 0;
    }
}
