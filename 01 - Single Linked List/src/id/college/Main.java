package id.college;

public class Main {

    public static void main(String[] args) {

        SingleLinkedList list1 = new SingleLinkedList();

        list1.createLinkedList("A");
        list1.insertFirst("B");
        list1.insertLast("C");
        list1.insertLast("D");
        list1.insertIn("E", 4);
        list1.deleteFirst();
        list1.deleteFirst();
        list1.deleteFirst();
        list1.deleteFirst();
        list1.destroy();


        SingleLinkedList list2 = new SingleLinkedList();

        list2.createLinkedList("F");
        list2.insertLast("G");
        list2.insertLast("H");
        list2.insertFirst("I");
        list2.deleteLast();
        list2.deleteLast();
        list2.deleteLast();

        list2.destroy();

    }

}
