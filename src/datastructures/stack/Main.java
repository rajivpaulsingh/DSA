package datastructures.stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();

        myStack.push(1);
        myStack.push(2);
        myStack.printStack();

        System.out.println("Popped node: " + myStack.pop().value);
        myStack.printStack();
    }
}
