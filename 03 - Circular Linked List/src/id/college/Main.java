package id.college;

public class Main {

    public static void main(String[] args) {

        CircularSingleLinkedList llist = new CircularSingleLinkedList();

        // create linked list
        llist.createSingleLinkedList("💗");

        // insert
        llist.insertFirst("⚔️");
        llist.insertFirst("🎮");

        llist.insertLast("🐺");
        llist.insertLast("👾");

        llist.insertIn("☘️", 6);
        llist.insertIn("🪁", 7);
        llist.insertIn("💎", 8);
        llist.insertIn("🎳", 3);

        // delete
        llist.deleteFirst();
        llist.deleteLast();
        llist.deleteLast();
        llist.deleteFirst();
        llist.deleteIn(5);
        llist.deleteLast();
        llist.deleteFirst();
        llist.deleteLast();

        // destroy
        llist.destroy();
        System.out.println("Count of nodes : " + llist.count());

    }
}
