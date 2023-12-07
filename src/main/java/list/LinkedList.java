package list;

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);
        System.out.println(linkedList.get(0));

        linkedList.remove(0);
        System.out.println(linkedList);

    }
}
