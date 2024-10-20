public class LinkedQueue<T> implements QueueADT<T>{

    SinglyLinkedNode<T> front, back;

    public LinkedQueue() {
        front = null;
        back = null;
    }

    public T peek() {
        return front.data;
    }

    public T dequeue() {
        if(isEmpty()) {
            return null;
        }
        T data = front.data;
        front = front.next;
        if(front == null)
            back = null;
        return data;
    }

    public void enqueue(T o) {
        SinglyLinkedNode<T> node = new SinglyLinkedNode<>();
        node.data = o;
        if(back != null) {
            back.next = node;
        } else {
            front = node;
        }
        back = node;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SinglyLinkedNode<T> node = front;
        sb.append("Queue Contents:\n");
        while(node != null) {
            sb.append(node.data).append("\n");
            node = node.next;
        }
        return sb.toString();
    }
}
