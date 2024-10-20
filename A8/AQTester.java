public class AQTester {

    public static void main(String[] args) {
        QueueADT aq = new ArrayQueue(5);

        System.out.println("ArrayQueue Test: Created empty structure");
        System.out.println(aq);

        System.out.println("ArrayQueue Test: Remove from empty queue");
        System.out.println(aq.dequeue());
        System.out.println(aq);

        System.out.println("ArrayQueue Test: Adding some items");
        aq.enqueue(11);
        aq.enqueue(12);
        System.out.println(aq);

        System.out.println("ArrayQueue Test: Adding more items, testing grow()");
        aq.enqueue(13);
        aq.enqueue(14);
        aq.enqueue(15);
        aq.enqueue(16);
        aq.enqueue(17);
        aq.enqueue(18);
        aq.enqueue(19);
        aq.enqueue(22);
        aq.enqueue(44);
        System.out.println(aq);

    }
}
