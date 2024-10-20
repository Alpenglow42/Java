



public class LinkedDequeTest {

    public static void main(String[] args) {
        LinkedDeque<Integer> deque = new LinkedDeque<>();
        int capacity = 3;

        //to test is full, uncomment to test
        //LinkedDeque<Integer> deque = new LinkedDeque<>(capacity);

        // Testing addFront and addBack operations
        deque.addFront(10);
        deque.addBack(20);
        deque.addFront(5);

        // Testing isFull operation
        System.out.println("Is the deque full? " + deque.isFull());

        // Testing toString() method
        System.out.println("Deque after add operations: " + deque);

        // Testing peek operations
        System.out.println("PeekFront operation result: " + deque.peekFront());
        System.out.println("PeekBack operation result: " + deque.peekBack());

        // Testing remove operations
        System.out.println("RemoveFront operation result: " + deque.removeFront());
        System.out.println("Deque after removeFront operation: " + deque);

        System.out.println("RemoveBack operation result: " + deque.removeBack());
        System.out.println("Deque after removeBack operation: " + deque);

        // Testing isEmpty operation
        System.out.println("Is the deque empty? " + deque.isEmpty());
    }
}

