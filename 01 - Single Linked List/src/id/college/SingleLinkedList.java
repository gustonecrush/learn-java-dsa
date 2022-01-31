package id.college;

public class SingleLinkedList {

    // properties
    private Node head;
    private Node tail;

    // constructor
    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // methods
    // count
    public int count() {
        Node curr = this.head;
        int count = 0;
        while( curr != null ) {
            count += 1;
            curr = curr.next;
        }
        return count;
    }

    // isEmpty
    public boolean isEmpty() { return ( count() == 0 ) ? true : false; }

    // createLinkedList
    public void createLinkedList(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        this.head = newNode;
        this.tail = newNode;

        display();
        System.out.println();
    }

    // insertFirst
    public void insertFirst(String data) {
        if( isEmpty() ) {
            createLinkedList(data);
        } else {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = this.head;
            this.head = newNode;
        }
        display();
        System.out.println();
    }

    // insertLast
    public void insertLast(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        this.tail.next = newNode;
        this.tail = newNode;

        display();
        System.out.println();
    }

    // insertIn
    public void insertIn(String data, int position) {
        if( position < 0 || position > count()) {
            System.out.println("position is out of range!");
        } else if( isEmpty() ) {
            createLinkedList(data);
        } else if( position == count() + 1 ) {
            insertLast(data);
        } else if( position == 1 ) {
            insertFirst(data);
        } else {
            Node newNode = new Node();
            Node curr = this.head;
            int count = 1;
            while( count < position - 1 ) {
                count++;
                curr = curr.next;
            }
            newNode.data = data;
            newNode.next = curr.next;
            curr.next = newNode;

            display();
            System.out.println();
        }
    }

    // deleteFirst
    public void deleteFirst() {
        Node del = this.head;
        this.head = this.head.next;
        del = null;

        display();
        System.out.println();
    }

    // deleteLast
    public void deleteLast() {
        Node del = this.tail;
        Node curr = this.head;
        while( curr.next != this.tail ) {
            curr = curr.next;
        }
        curr.next = null;
        del = null;
        this.tail = curr;

        display();
        System.out.println();
    }

    // deleteIn
//    public void deleteIn(int position) {
//        Node curr = this.head;
//        Node before, del;
//        int count = 1;
//        while( count < position ) {
//            before = curr;
//            curr = curr.next;
//            count++;
//        }
//        del = curr;
//        before.next = del.next;
//        del = null;
//
    }

    // display
    private void display() {
        Node curr = this.head;
        while( curr != null ) {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        }
    }

    // destroy
    public void destroy() {
        Node curr = this.head;
        Node del;
        while( curr != null ) {
            del = curr;
            curr = curr.next;
            del = null;
        }

        this.head = null;
        this.tail = null;

        display();
        System.out.println("linked list is destroyed");
    }

}
