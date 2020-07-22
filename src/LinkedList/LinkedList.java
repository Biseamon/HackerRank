package LinkedList;

public class LinkedList {

    Node head; //head of the list

    static class Node{

        int data;   // node's data
        Node next;     //link to the next node.

        Node(int data){
            this.data = data;
            next = null;
        }

    }

    public void printList(){

        Node node =  head;
        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }

    }

    public void printNext() {

        Node current = head;

        try {
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next.next;
            }
        }catch (NullPointerException e){
            System.out.println("List ends here: " + e.getMessage());
        }
    }

    //push a new Node with a different value in the place of the head.
    //Basically adds a new item at the front.
    public void push(int new_item){

        //Creates a new node for a substitution.
        Node new_node = new Node(new_item);

        //set the next value of the new node to the head. Basically links the new created node
        //to the head of the list.
        new_node.next = head;

        //And now actually sets the head to be the new created node.
        head = new_node;

    }

    //Insert the new Node after the given previous node.
    public void insertAfter(Node previousNode, int new_data){

        if (previousNode == null){
            System.out.println("The given previous node cannot be null");
        }

        //Creates a new Node and sets its value to a new data.
        Node new_node = new Node(new_data);

        //links the new node to previous node. But. The previous node can be any existing node in the list.
        new_node.next = previousNode.next;

        //Sets the previous node linked to the new Node.
        previousNode.next = new_node;

    }

    //Adds an item at the end of the list.
    public void append(int new_data){

        Node new_node = new Node(new_data); //New node with a value and null next.

        //if the head is null, hence the linked list is null, adds the new node at the front and returns.
        if (head == null){
            head = new_node;
            return;
        }

        new_node.next = null; // Will make the new node to be the last one as it is not referring to any next.

        //new node set to be the last has heads value.
        Node last = head;
        while  (last.next != null){
            last = last.next;     //iterates through the list
        }

        last.next = new_node;    //sets the last one to the new Node created earlier.
        return;

    }

    //delete the node corresponding to a key.
    public void deleteNode(int key){

        /**
         *   Temporary Node is set to be head.
         *   Previous one is atm null.
         */
        Node temp = head, prev = null;


        /**
         * if temp Node is not null, therefore there is a head and head's data is equal to the key
         * then set the head to the next node. Therefore the head will be replaced with the next value
         * in the list.
         */
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        /**
         * But if the temp is still not null, yet the head is not the key,
         * previous get the temp value, which is the head. Therefore, the list will start at 0.
         * The iteration is stopped until the condition is false. This is done by checking the list
         * through the temp = temp.next;
         */
        while (temp != null && temp.data != key) {
            prev = temp;   //head - 0
            temp = temp.next;      // head + next + next + next ...
        }

        //If there is no head at all return.
        if (temp == null){
           return;
        }

        //remove from the list.
        prev.next = temp.next;

    }

    public void deleteAtPosition(int pos){

        //Head of the list is null then return...
        if (head == null){
            return;
        }

        //temporary node set to be head == 0 position in the list.
        Node temp = head;

        //if position is 0 head links to the next value because we delete the head.
        if(pos == 0){
            head = temp.next;
            return;
        }

        //if the head is not null we iterate through the list until we find the position.
        //The iteration start from the head == temp and adds up one per each iteration == temp.next.
        for (int i = 0; temp != null && i < pos - 1; i++) {
             temp = temp.next;
        }

        //if  the position is bigger the the list return.
        if (temp == null || temp.next == null){
            return;
        }

        //here we delete the node as temp ->,
        //and yet we store a pointer to the next node to be deleted.
        Node nextNode = temp.next.next;

        //Unlink the deleted node from the list.
        temp.next = nextNode;

    }

}
