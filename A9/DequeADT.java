public interface DequeADT<T> {

    void addFront(T o);
    void addBack(T o);
    T removeFront();
    T removeBack();

    T peekFront();
    T peekBack();
    boolean isFull();
    boolean isEmpty();
}
