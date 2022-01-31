package id.college;

public class DoubleLinkedList {

    // properties
    public Node head;
    public Node tail;

    // constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // methods

    public int count() {
        /*
         * count()
         * → this is a method which is used for returning
         *   sum of nodes in linkes list
         *
         * → the visibility is public
         *
         * input : -
         * output: sum of nodes
         *
         * */

        Node curr = this.head;     // create curr node as navigation
        int count = 0;             // create counter variable then set to zero, because we will do math's addition operation
        while( curr != null ) {    // while curr is not null
            count++;               // do increment to counter variable
            curr = curr.next;      // set curr to curr.next
        }

        return count;              // return counter variable

    }

    public void createDoubleLinkedList(String data) {
        /*
         * createDoubleLinkedList(data)
         * → this is a method which is used for making the first
         *   element of a linked list
         *
         * → the visibility is public
         *
         * input : node's data
         * output: head → node
         *         head = tail
         * */

        Node newNode = new Node(); // create a node
        newNode.data = data;       // assign data with the input parameter
        newNode.next = null;       // assign next pointer with null value
        newNode.prev = null;       // assign prev pointer with null value
        this.head = newNode;       // set head with newNode
        this.tail = newNode;       // set tail with newNode

        // message
        System.out.println("✅ : Double Linked List has created.");
        // displaying
        display();

    }

    public void insertFirst(String data) {
        /*
         * insertFirst(data)
         * → this is a method which is used for insert the new
         *   element of a linked list on first position
         *
         * → the visibility is public
         *
         * input : node's data
         * output: head → newNode
         * */

        Node newNode = new Node();  // create newNode node as new node
        newNode.data = data;        // assign the data parameter to newNode's data
        newNode.next = this.head;   // set newNode's next to the head
        newNode.prev = null;        // set newNode's prev to null, because the first element don't point anything
        this.head.prev = newNode;   // set the head's prev to newNode
        this.head = newNode;        // set the head to newNode

        // message
        System.out.println("✅ : The node has been inserted first.");
        // displaying
        display();

    }

    public void insertLast(String data) {
        /*
         * insertLast(data)
         * → this is a method which is used for insert the new
         *   element of a linked list on last position
         *
         * → the visibility is public
         *
         * input : node's data
         * output: tail → newNode
         * */

        Node newNode = new Node();  // create newNode node as new node
        newNode.data = data;        // assign the data parameter to newNode's data
        newNode.next = null;        // set newNode's next to null
        newNode.prev = this.tail;   // set newNode's prev to the tail of linked list
        this.tail.next = newNode;   // set the tail's next to newNode
        this.tail = newNode;        // set the tail to newNode

        // message
        System.out.println("✅ : The node has been inserted last.");
        // displaying
        display();

    }

    public void insertIn(String data, int position) {
        /*
         * insertIn(data, position)
         * → this is a method which is used for insert the new
         *   element of a linked list on n-position
         *
         * → the visibility is public
         *
         * input : node's data, position where u wanna add the new node
         * output: n-node → newNode
         * */

        if( position < 0 || position > count() ) {
            System.out.println("the position is out of range!");
        } else if( position == 1 ) {
            insertFirst(data);
        } else {
            Node curr = this.head;
            int count = 1;
            while( count < position - 1 ) {
                curr = curr.next;
                count++;
            }

            Node newNode = new Node();  // create newNode node as new node
            newNode.data = data;        // assign the data parameter to newNode's data
            newNode.next = curr.next;   // set newNode's next to curr's next
            newNode.prev = curr;        // set newNode's prev to curr
            curr.next.prev = newNode;   // set the curr's next's prev to newNode
            curr.next = newNode;        // set the head's prev to newNode

            // message
            System.out.println("✅ : The node has been inserted in position-"+position);
            // displaying
            display();
        }
    }

    private void display() {
        /*
         * display( )
         * → this is a void method which is used for displaying
         *   elements of a linked list
         *
         * → the visibility is private
         *
         * input : -
         * output: all element are displayed
         * */

        Node curr = this.head;     // create curr node as navigation
        while( curr != null ) {    // while curr node is not a null ( has data and next/prev point )
            System.out.print(curr.data + " | ");  // display the data
            curr = curr.next;      // curr node is reassigned with curr.next node
        }

        System.out.println();
    }

}
