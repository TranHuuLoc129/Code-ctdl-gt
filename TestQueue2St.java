public class TestQueue2St {
    public static void main(String[] args) {
        QueueTwoStack<Integer> q = new QueueTwoStack<>();

        q.enQueue(4);
        q.enQueue(7);
        q.enQueue(1);
        q.enQueue(3);

        q.print();

        q.deQueue();
        q.print();

        q.enQueue(23);
        q.print();
        
    }
}
