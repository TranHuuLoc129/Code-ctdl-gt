public class TestDouble {
    public static void main(String[] args) {
        MyDoubleLinkedList<Double> douLL = new MyDoubleLinkedList<>();
        douLL.add(3.4);
        douLL.add(7.4);
        douLL.add(2.7);


        douLL.print();


        System.out.println("find : "+douLL.find(7.4));
        System.out.println("find : "+douLL.find(1.4));


        System.out.println("Remove: ");
        douLL.remove(3.4);
        douLL.print();




    }
}
