package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("Linkedin list: ");
        myLinkedList.printList();

        System.out.println("Removed last node: " + myLinkedList.removeLast().value);

        myLinkedList.prepend(1);
        myLinkedList.printList();

        System.out.println("Removed first node: " + myLinkedList.removeFirst().value);

        System.out.println("Node at index 0 is: " + myLinkedList.get(0).value);

        System.out.println("Changed value at index 0: " + myLinkedList.set(0, 4));
        myLinkedList.printList();

        System.out.println("Insert value at index 1: " + myLinkedList.insert(1, 5));
        myLinkedList.printList();

        System.out.println("Removed value at index 1: " + myLinkedList.remove(1).value);
        myLinkedList.printList();

        myLinkedList.append(6);

        myLinkedList.reverse();
        myLinkedList.printList();

        myLinkedList.append(7);
        myLinkedList.append(8);

        //LL Coding exercises
        System.out.println("Final Linked List: ");
        myLinkedList.printList();

        // 1. Find the middle element
        System.out.println("Middle element is: " + myLinkedList.findMiddleNode().value);

        // 2. Does linked list has cycle
        System.out.println("Linked list cycle? " + myLinkedList.hasLoop());

        // 3. Find kth element from the end
        System.out.println("Kth (3rd) element from the end: " + myLinkedList.findKthFromEnd(3).value);

        // 4. Reverse linked list between indexes
        myLinkedList.reverseBetween(2, 4);
        myLinkedList.printList();

        // 5. Partition list
        System.out.println("Partition list by index 3: ");
        myLinkedList.partitionList(3);
        myLinkedList.printList();

        // 6. Remove duplicates
        myLinkedList.removeDuplicates();
    }
}
