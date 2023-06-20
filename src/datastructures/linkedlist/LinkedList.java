package datastructures.linkedlist;

import java.util.*;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

     class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }
    }

    public LinkedList(int val) {
        Node newNode = new Node(val);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
         head = null;
         tail = null;
         length = 0;
    }
    public void append(int value) {
         Node newNode = new Node(value);

         if(length == 0) {
             head = newNode;
             tail = newNode;
         } else {
             tail.next = newNode;
             tail = newNode;
         }
         length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeLast() {
         if(length == 0) return null;

         Node temp = head;
         Node pre = head;

         while(temp.next != null) {
             pre = temp;
             temp = temp.next;
         }
         tail = pre;
         tail.next = null;
         length--;

         if(length == 0) {
             head = null;
             tail = null;
         }

         return temp;
    }

    public Node removeFirst() {
         if(length == 0) return null;

         Node temp = head;
         head = head.next;
         temp.next = null;
         length--;

         if(length == 0) {
             tail = null;
         }

         return temp;
    }

    public Node get(int index) {
         if(index < 0 || index >= length) {
             return null;
         }

         Node temp = head;
         for(int i = 0; i < index; i++) {
             temp = temp.next;
         }

         return temp;
    }

    public boolean set(int index, int value) {
         Node temp = get(index);
         if(temp != null) {
             temp.value = value;
             return true;
         }

         return false;
    }

    public boolean insert(int index, int value) {
         if(index < 0 || index >= length) {
             return false;
         }

         if(index == 0) {
             prepend(value);
             return true;
         }

         if(index == length) {
             append(value);
             return true;
         }

         Node newNode = new Node(value);
         Node temp = get(index - 1);

         newNode.next = temp.next;
         temp.next = newNode;
         length++;
         return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) {
            return null;
        }

        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node pre = get(index - 1);
        Node temp = pre.next;

        pre.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    /*
     * LL Coding Exercises
     */

    // 1. Find the middle node
    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 2. Has loop?
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // 3. Find Kth element from the end
    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < k; i++) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    // 4. Reverse linked list between indexes
    public void reverseBetween(int m, int n) {
        if (head == null) return;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }

        Node current = prev.next;
        for (int i = 0; i < n - m; i++) {
            Node temp = current.next;
            current.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        head = dummy.next;
    }

    // 5. Partition list
    public void partitionList(int x) {
        if (head == null) return;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;

        head = dummy1.next;
    }

    // 6. Remove duplicates
    public void removeDuplicates() {
        Set<Integer> set = new HashSet<>();

        Node pre = null;
        Node current = head;

        while (current != null) {
            if (set.contains(current.value)) {
                pre.next = current.next;
                length -= 1;
            } else {
                set.add(current.value);
                pre = current;
            }
            current = current.next;
        }
    }

}
