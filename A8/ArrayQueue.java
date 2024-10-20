public class ArrayQueue implements QueueADT {

    public static final int DEFAULT_SIZE = 10;

    Object[] data;
    int next;

    public ArrayQueue() {
        this(DEFAULT_SIZE);
    }

    public ArrayQueue(int size) {
        data = new Object[size];
        next = 0;
    }

    public Object peek() {
        return data[0];
    }

    public Object dequeue() {
        if(isEmpty()) {
            return null;
        }
        Object o = data[0];
        data[0] = null;
        for(int i = 0; i < next - 1; ++i) {
            data[i] = data[i + 1];
            data[i + 1] = null;
        }
        next--;
        return o;
    }

    public void enqueue(Object o) {
        if(next == data.length) {
            grow();
        }
        data[next] = o;
        next++;
    }

    public boolean isEmpty() {
        return next == 0;
    }

    public boolean isFull() {
        return false; //automatically grows
    }

    protected void grow() {
        Object[] newData = new Object[data.length * 2];
        for(int i = 0; i < next; ++i) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayQueue, current capacity is " + data.length + " (" + next + " objects, front to back):\n");
        for(int i = 0; i < next; ++i) {
            sb.append(data[i]).append("\n");
        }
        return sb.toString();
    }
}
