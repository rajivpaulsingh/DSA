package datastructures.recursion;

public class Main {

    public static void main(String[] args) {
        methodOne();
    }

    public static void methodOne() {
        methodTwo();
        System.out.println("One");
    }

    private static void methodTwo() {
        methodThree();
        System.out.println("Two");
    }

    private static void methodThree() {
        System.out.println("Three");
    }
}
