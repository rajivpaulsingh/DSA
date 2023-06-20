package datastructures.queue;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(2);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();

        myQueue.enqueue(3);
        myQueue.printQueue();

        System.out.println(("Dequeue node: " + myQueue.dequeue().value));
        System.out.println(("Dequeue node: " + myQueue.dequeue().value));
        System.out.println(("Dequeue node: " + myQueue.dequeue()));
    }
}
