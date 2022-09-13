public class TestQueueArr {
    public static void main(String[] args) {
        MyQueueArr<Integer> a = new MyQueueArr<>();

        a.enQueue(3);
        a.enQueue(9);
        a.enQueue(5);
        a.enQueue(8);
        a.enQueue(1);

        a.print();

        a.deQueue();
        a.print();

        System.out.println(a.getFront());

    }
}
