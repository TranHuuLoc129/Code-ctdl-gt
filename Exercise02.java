public class TestRemoveCurr {
    public static void main(String[] args) {
        MyLinkedList <Integer> myLL = new MyLinkedList<>();

        myLL.addFirst(3);
        myLL.addFirst(4);
        myLL.addFirst(9);
        myLL.addFirst(8);
        myLL.addFirst(1);

        myLL.print();

        Node<Integer> a = new Node<Integer>(4);
        myLL.removeCurr(a);
        myLL.print();

    }
}
