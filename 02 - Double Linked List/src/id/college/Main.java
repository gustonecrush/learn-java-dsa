package id.college;

public class Main {

    public static void main(String[] args) {

        DoubleLinkedList list1 = new DoubleLinkedList();

        list1.createDoubleLinkedList("A");
        list1.insertFirst("Z");
        list1.insertLast("B");
        list1.insertLast("C");
        list1.insertFirst("Y");
        list1.insertIn("X", 4);

    }

}
