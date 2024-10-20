



import java.util.EmptyStackException;

public class LinkedDeque<T> implements DequeADT<T> {

    private Node<T> front;
    private Node<T> back;
    private int size;

    //to test is full method, uncomment
    //private final int capacity;

    //to test is full method, uncomment
    //to test is full method, uncomment

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }



    @Override
    public void addFront(T o) {
        Node<T> newNode = new Node<>(o);
        if (isEmpty()) {
            front = back = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    @Override
    public void addBack(T o) {
        Node<T> newNode = new Node<>(o);
        if (isEmpty()) {
            front = back = newNode;
        } else {
            newNode.prev = back;
            back.next = newNode;
            back = newNode;
        }
        size++;
    }

    @Override
    public T removeFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T data = front.data;
        if (front == back) {
            front = back = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return data;
    }

    @Override
    public T removeBack() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T data = back.data;
        if (front == back) {
            front = back = null;
        } else {
            back = back.prev;
            back.next = null;
        }
        size--;
        return data;
    }

    @Override
    public T peekFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return front.data;
    }

    @Override
    public T peekBack() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return back.data;
    }

    @Override
    public boolean isFull() {
        // Assuming the linked structure doesn't have a predefined maximum capacity
        return false;

        //so we can test is Full, uncomment out to test
        //return size == capacity;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = front;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}

