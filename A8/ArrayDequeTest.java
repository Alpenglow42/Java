public class ArrayDequeTest {

    public static void main(String[] args) {
        // Create an instance of ArrayDeque
        ArrayDeque deque = new ArrayDeque();

        // Test cases
        testAddFront(deque);
        testAddBack(deque);
        testRemoveFront(deque);
        testRemoveBack(deque);
        testPeekFront(deque);
        testPeekBack(deque);
        testGrow(deque);
        testShrink(deque);
    }

//    private static void printTestHeader(String testName, ArrayDeque deque) {
//        System.out.println("\n" + testName);
//        System.out.println("Before: " + ArrayDeque.toString());
//    }
//
//    private static void printTestResult(ArrayDeque deque) {
//        System.out.println("After: " + ArrayDeque.toString());
//    }

    private static void printTestHeader(String testName, ArrayDeque deque) {
        System.out.println("\n" + testName);
        System.out.println("Before: " + deque.toString());
    }

    private static void printTestResult(ArrayDeque deque) {
        System.out.println("After: " + deque.toString());
    }




    private static void testAddFront(ArrayDeque deque) {
        printTestHeader("Test AddFront", deque);
        deque.addFront(1);
        deque.addFront(2);
        deque.addFront(3);
        printTestResult(deque);
    }

    private static void testAddBack(ArrayDeque deque) {
        printTestHeader("Test AddBack", deque);
        deque.addBack(4);
        deque.addBack(5);
        deque.addBack(6);
        printTestResult(deque);
    }

    private static void testRemoveFront(ArrayDeque deque) {
        printTestHeader("Test RemoveFront", deque);
        Object removedFront1 = deque.removeFront();
        System.out.println("Removed Front: " + removedFront1);
        //deque.removeFront();
        printTestResult(deque);
    }

    private static void testRemoveBack(ArrayDeque deque) {
        printTestHeader("Test RemoveBack", deque);
        Object removedBack1 = deque.removeBack();
        System.out.println("Removed Back: " + removedBack1);
        //deque.removeBack();
        printTestResult(deque);
    }

    private static void testPeekFront(ArrayDeque deque) {
        printTestHeader("Test PeekFront", deque);
        System.out.println("Peek Front: " + deque.peekFront());
        printTestResult(deque);
    }

    private static void testPeekBack(ArrayDeque deque) {
        printTestHeader("Test PeekBack", deque);
        System.out.println("Peek Back: " + deque.peekBack());
        printTestResult(deque);
    }

    private static void testGrow(ArrayDeque deque) {
        printTestHeader("Test Grow", deque);
        deque.addFront(7);
        deque.addFront(8);
        deque.addFront(9);
        deque.addFront(10);
        deque.addFront(11);
        printTestResult(deque);
    }

    private static void testShrink(ArrayDeque deque) {
        printTestHeader("Test Shrink", deque);
        deque.removeBack();
        deque.removeBack();
        printTestResult(deque);
    }
}

