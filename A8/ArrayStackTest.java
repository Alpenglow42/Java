




public class ArrayStackTest {

    public static void main(String[] args) {
        testArrayStack();
    }

    private static void printTestHeader(String testName, ArrayStack stack) {
        System.out.println("\n" + testName);
        System.out.println("Before: " + stack.toString());
    }

    private static void printTestResult(ArrayStack stack) {
        System.out.println("After: " + stack.toString());
    }

    private static void testArrayStack() {
        System.out.println("ArrayStack Test: Pushing, Popping, and Growing");

        // Test 1: Pushing and popping from an empty stack
        ArrayStack stack1 = new ArrayStack();
        printTestHeader("Test 1 (empty stack)", stack1);
        stack1.push(5);
        //stack1.pop();
        Object poppedValue1 = stack1.pop();
        System.out.println("Popped value: " + poppedValue1);
        printTestResult(stack1);

        // Test 2: Pushing and popping from a stack with 1 item
        ArrayStack stack2 = new ArrayStack();
        stack2.push(10);
        printTestHeader("Test 2 (stack with 1 item)", stack2);
        stack2.pop();
        printTestResult(stack2);

        // Test 3: Pushing and popping from a stack with more items
        ArrayStack stack3 = new ArrayStack();
        stack3.push(15);
        stack3.push(20);
        stack3.push(25);
        printTestHeader("Test 3 (stack with more items)", stack3);
        stack3.pop();
        stack3.pop();
        printTestResult(stack3);

        // Test 4: Testing grow method
        ArrayStack stack4 = new ArrayStack(2);
        stack4.push(30);
        stack4.push(35);
        stack4.push(40);
        printTestHeader("Test 4 (stack with grow method)", stack4);
        stack4.push(45);
        printTestResult(stack4);

        // Test 5: Testing shrink method
        ArrayStack stack5 = new ArrayStack(10);
        stack5.push(55);
        stack5.push(60);
        printTestHeader("Test 5 (stack with shrink method)", stack5);
        stack5.pop();
        printTestResult(stack5);

        // Test 5a: Test exception handling for shrink method
        try {
            stack5.pop();
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        printTestResult(stack5);

        // Test 6: Testing peek method
        ArrayStack stack6 = new ArrayStack();
        stack6.push(10);
        stack6.push(20);
        stack6.push(30);
        printTestHeader("Test 6 (stack with peek method)", stack6);
        // Call peek to see the top element without removing it
        System.out.println("Top element in the stack: " + stack6.peek());
        printTestResult(stack6);

//        // uncomment out to test error handling
//        //test 6a.) empty stack peek, should cause error
//        stack6.pop();
//        stack6.pop();
//        stack6.pop();
//        System.out.println("Stack representation after peek: " + stack6.peek());

//
//        // Test 7: Testing toString method
//        ArrayStack stack7 = new ArrayStack();
//        stack7.push(10);
//        stack7.push(20);
//        stack7.pop();
//        stack7.push(30);
//        System.out.println("Stack representation after operations: " + stack7.toString());



    }
}