package LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        /**
         * We just add three elements to the linked list.
         * Head is 0,
         * second is 1,
         * third is 2
         */
        linkedList.head = new LinkedList.Node(0);

        LinkedList.Node secondItem = new LinkedList.Node(1);
        LinkedList.Node thirdItem = new LinkedList.Node(2);

        /**
         *  linkedList.head        second              third
         *              |                |                  |
         *              |                |                  |
         *          +----+------+     +----+------+     +----+------+
         *          | 1  | null |     | 2  | null |     |  3 | null |
         *          +----+------+     +----+------+     +----+------+
         */

        linkedList.head.next = secondItem; // Links the first element with the second one.
        //The constructor of the node has the next set to null, but in the case of the head the constructor sets the next to the second item node. Therefore now the the constructor has the head set to 0 and next to 1.

        /**
         * Now the first head has reference to the second item.
         * basically head and second are linked.
         *
         *
         *     linkedList.head        second              third
         *             |                |                  |
         *             |                |                  |
         *         +----+------+     +----+------+     +----+------+
         *         | 1  |  o-------->| 2  | null |     |  3 | null |
         *         +----+------+     +----+------+     +----+------+
         */

        secondItem.next = thirdItem; //Link the second item to third one.
        //same as before the second item next is set to the third item. So it will look lie this 2 -> 3.

        /**
         * All three elements are linked.
         *
         *   linkedList.head        second              third
         *             |                |                  |
         *             |                |                  |
         *         +----+------+     +----+------+     +----+------+
         *         | 1  |  o-------->| 2  |  o-------->|  3 | null |
         *         +----+------+     +----+------+     +----+------+
         */

        linkedList.printList();

        //add 6 at the of the list.
        linkedList.append(6);

        //inserts 7 after second item.
        linkedList.insertAfter(secondItem.next, 7);

        linkedList.push(-2);    //adds -2 in front.

        linkedList.push(-4);     //adds -4 in front of -2.

        System.out.println("Created new linked list:");
        linkedList.printList();

        linkedList.deleteNode(1);       //delete the node with the value 1.

        System.out.println("After deletion");
        linkedList.printList();

        System.out.println("After deletion at a specific position");
        linkedList.deleteAtPosition(4);
        linkedList.printList();

        //Checking if Object.next.next returns anything.
        System.out.println(secondItem.next.next);
        System.out.println("------------------------------");

        //Checking the printNext
        System.out.println("Lets see if head.next.next return something");
        linkedList.printNext();

    }
}
