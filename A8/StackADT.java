public interface StackADT {

    void push(Object o);
    Object pop();

    Object peek();
    boolean isEmpty();
    boolean isFull();
}
