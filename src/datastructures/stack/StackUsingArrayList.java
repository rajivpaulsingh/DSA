package datastructures.stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    private final ArrayList<Integer> stack;

    public StackUsingArrayList() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int item) {
        stack.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {

        StackUsingArrayList stack = new StackUsingArrayList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped item: " + stack.pop());
        }
    }
}

