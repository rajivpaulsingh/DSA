package datastructures.queue;

import java.util.ArrayList;

public class QueueUsingArrayList {
    private ArrayList<Integer> queue;

    public QueueUsingArrayList() {
        queue = new ArrayList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {

        QueueUsingArrayList queue = new QueueUsingArrayList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue peek: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued item: " + queue.dequeue());
        }
    }
}
