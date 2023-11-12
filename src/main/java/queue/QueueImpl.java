package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueImpl {
    public static void main(String[] args) {
        Person123 person1 = new Person123(1);
        Person123 person2 = new Person123(2);
        Person123 person3 = new Person123(3);
        Person123 person4 = new Person123(4);
        Queue<Person123> people = new ArrayBlockingQueue<Person123>(3);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));

        System.out.println(people);

    }

}

class Person123 {
    private int id;

    public Person123(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person123{" +
                "id=" + id +
                '}';
    }
}
