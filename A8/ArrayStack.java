



public class ArrayStack implements StackADT{



    private static final int DEFAULT_CAPACITY = 5;
    private Object[] array;
    private int size;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int capacity) {
        array = new Object[capacity];
        size = 0;
    }
    // should I use grow in my push??
    @Override
    public void push(Object o) {
        if (isFull()) {
            // You can choose to resize the array or throw an exception
            throw new IllegalStateException("Stack is full");
        }
        array[size++] = o;
    }

//    @Override
//    public Object pop() {
//        if (isEmpty()) {
//            // You can choose to throw an exception or return null
//            throw new IllegalStateException("Stack is empty");
//        }
//        Object poppedElement = array[--size];
//        array[size] = null; // Optional: Helps in garbage collection
//        return poppedElement;
//    }

//    @Override //new
//    public Object pop() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Stack is empty, cannot pop from empty stack");
//        }
//        Object poppedElement = array[--size];
//        array[size] = null; // Optional: Helps in garbage collection
//
//        // Check if the size is less than half of the array length
//        if (size < array.length / 2) {
//            shrink();
//
//        }
//
//        return poppedElement;
//    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty, cannot pop from empty stack");
        }

        Object poppedElement = array[--size];
        array[size] = null; // Optional: Helps in garbage collection

        // Check if the size is less than half of the array length
        if (size < array.length / 2 || array.length == 1) {

            shrink();
        }
//        } else  {
//            throw new IllegalStateException("Stack is empty, cannot pop from empty stack");
//        }

        return poppedElement;
    }




    @Override
    public Object peek() {
        if (isEmpty()) {
            // You can choose to throw an exception or return null
            throw new IllegalStateException("Stack is empty, nothing to see trying pushing to stack");
        }
        return array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        if (size == array.length) {
            grow();
        }
        return size == array.length;
    }

//    public void enqueue(Object o) {
//        if (isFull()) {
//            grow();
//        }
//        array[size] = 0 ;
//        size++;
//    }

    protected void grow() {
        Object [] newArray = new Object[array.length *2];
        for (int i = 0; i < size; ++i) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

 // need to make sure default for size is 5 and not to shrink beyond it
    protected void shrink() {
        int newCapacity = array.length / 2;

        if (isEmpty() || size < newCapacity) {
            // Don't shrink below the current size or if the array is empty
            return;
        }

        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; ++i) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}



