package id.college;

public class CircularSingleLinkedList {

    // properties
    public Node head;
    public Node tail;

    // constructor
    public CircularSingleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // methods

    public int count() {
        /*
         * count()
         * → this is a method which is used for returning
         *   sum of nodes in linked list
         *
         * → the visibility is public
         *
         * input : -
         * output: sum of nodes
         *
         * */

        Node curr = this.head;     // create curr node as navigation
        int count = 0;             // create counter variable then set to zero, because we will do math's addition operation
        while( curr.next != head ) {    // while curr is not null
            count++;               // do increment to counter variable
            curr = curr.next;      // set curr to curr.next
        }
        if (curr != null) count++;

        return count;              // return counter variable

    }

    public void createSingleLinkedList(String data) {
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
        this.head = newNode;       // set head with newNode
        this.head.next = tail;
        this.tail = newNode;       // set tail with newNode
        this.tail.next = head;

        // message
        System.out.println("✅ : Single Linked List has created.");
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
        this.head = newNode;        // set the head to newNode
        this.tail.next = this.head; // set the tail's next to new head

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
        newNode.next = this.head;   // set newNode's next to null
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

        if (position < 0) {
            System.out.println("the position is out of range!");
        } else if (position == 1) {
            insertFirst(data);
        } else if(position > count()) {
            insertLast(data);
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
            curr.next = newNode;        // set the head's prev to newNode

            // message
            System.out.println("✅ : The node has been inserted in position-"+position);
            // displaying
            display();
        }
    }

    public void deleteFirst() {
        /*
         * deleteFirst( )
         * → this is a method which is used for delete the
         *   element of a linked list on first position
         *
         * → the visibility is public
         *
         * input : -
         * output: first element deleted
         * */

        Node del = this.head;       // create del node as copy of curr head node
        this.head = del.next;       // set the head to del's next
        del = null;                 // delete node del
        this.tail.next = this.head; // set tail's next to new head

        // message
        System.out.println("✅ : The node has been delete first.");
        // displaying
        display();
    }

    public void deleteLast() {
        /*
         * deleteLast( )
         * → this is a method which is used for delete the
         *   element of a linked list on last position
         *
         * → the visibility is public
         *
         * input : -
         * output: last element deleted
         * */

        Node del = this.tail;       // create del node as copy of curr tail node
        Node before = this.head;    // create before node as before node of deleted node
        while( before.next != tail ) {
            before = before.next;
        }
        this.tail = before;
        this.tail.next = this.head;
        del = null;                 // delete node del

        // message
        System.out.println("✅ : The node has been delete last.");
        // displaying
        display();
    }

    public void deleteIn(int position) {
        /*
         * deleteIn(position)
         * → this is a method which is used for delete the
         *   element of a linked list on -=position
         *
         * → the visibility is public
         *
         * input : -
         * output: n element deleted
         * */

        // conditions
        if( position < 0 || position > count() ) {  // if position is less than 0 or greater than sum of nodes
            System.out.println("position is out of range");
        } else if( position == 1 ) {        // if position is one
            deleteFirst();
        } else if( position == count() ) {  // if position is same like the sum of nodes
            deleteLast();
        } else {
            Node curr = this.head;          // create node curr as a navigation
            Node before;
            int counter = 1;                // create counter variable

            while( counter < position ) {   // looping
//                before = curr;
                curr = curr.next;           // set curr node to curr's next
                counter++;                  // increment the counter
            }

            curr = null;                    // set curr to null ( delete it )

            // message
            System.out.println("✅ : The node has been delete in position-"+position);
            // displaying
            display();
        }

    }

    public void destroy() {
        /*
         * destroy( )
         * → this is a void method which is used for deleting all
         *   element of a linked list
         *
         * → the visibility is public
         *
         * input : -
         * output: all element are deleted
         * */

//        Node curr = this.head;
//        Node del;
//        while( curr.next != head ) {
//            del = curr;
//            curr = curr.next;
//            del = null;
//            this.head = curr;
//            this.tail.next = this.head;
//        }

        this.head = null;
        this.tail = null;

        // message
        System.out.println("✅ : The node has been destroyed.");

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
        while( curr.next != head ) {    // while curr node is not a null ( has data and next/prev point )
            System.out.print(curr.data + " | ");  // display the data
            curr = curr.next;      // curr node is reassigned with curr.next node
        } System.out.print(curr.data + " | ");

        System.out.println();
    }


}
