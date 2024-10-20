public interface QueueADT<T> {
    T peek();
    T dequeue();
    void enqueue(T o);
    boolean isEmpty();
    boolean isFull();
}
