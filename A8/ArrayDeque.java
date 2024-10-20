



public class ArrayDeque implements DequeADT {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] array;
    private int size;
    private int front;
    private int back;

    public ArrayDeque() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayDeque(int capacity) {
        array = new Object[capacity];
        size = 0;
        front = 0;
        back = 0;
    }

    @Override
    public void addFront(Object o) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full");
        }
        front = (front - 1 + array.length) % array.length;
        array[front] = o;
        size++;
    }

    @Override
    public void addBack(Object o) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full");
        }
        array[back] = o;
        back = (back + 1) % array.length;
        size++;
    }

    @Override
    public Object removeFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        Object removedElement = array[front];
        array[front] = null; // Optional: Helps in garbage collection
        front = (front + 1) % array.length;
        size--;
        return removedElement;
    }

    @Override
    public Object removeBack() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        back = (back - 1 + array.length) % array.length;
        Object removedElement = array[back];
        array[back] = null; // Optional: Helps in garbage collection
        size--;
        return removedElement;
    }

    @Override
    public Object peekFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return array[front];
    }

    @Override
    public Object peekBack() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return array[(back - 1 + array.length) % array.length];
    }

    @Override
    public boolean isFull() {
        if (size == array.length) {
            grow();
        }
        return size == array.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    protected void grow() {
        Object [] newArray = new Object[array.length *2];
        for (int i = 0; i < size; ++i) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

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
            sb.append(array[(front + i) % array.length]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

