

import java.util.EmptyStackException;

public class LinkedStackTest {

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();

        // Testing push operation
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Testing toString() method
        System.out.println("Stack after push operations: " + stack);

        // Testing peek operation
        System.out.println("Peek operation result: " + stack.peek());

        // Testing pop operation
        System.out.println("Pop operation result: " + stack.pop());
        System.out.println("Stack after pop operation: " + stack);

        // Testing isEmpty and isFull operations
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Is the stack full? " + stack.isFull());

        // Testing pop operations on empty stack (should throw EmptyStackException)
        try {
            System.out.println("Pop operation on empty stack: " + stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException: Stack is empty.");
        }
    }
}

