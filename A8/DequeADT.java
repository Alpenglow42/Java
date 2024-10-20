public interface DequeADT {

    void addFront(Object o);
    void addBack(Object o);
    Object removeFront();
    Object removeBack();

    Object peekFront();
    Object peekBack();
    boolean isFull();
    boolean isEmpty();
}
