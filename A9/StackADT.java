public interface StackADT<T> {

    void push(T o);
    T pop();

    T peek();
    boolean isEmpty();
    boolean isFull();
}
