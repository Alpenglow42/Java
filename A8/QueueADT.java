public interface QueueADT {
    Object peek();
    Object dequeue();
    void enqueue(Object o);
    boolean isEmpty();
    boolean isFull();
}
