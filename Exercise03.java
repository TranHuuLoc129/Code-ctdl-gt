public class TestIntegerLL {
    public static void main(String[] args) {
        IntegerLinkedList<Integer> a = new IntegerLinkedList<Integer>();
        
        a.addFirst(4);
        a.addFirst(5);
        a.addFirst(8);
        a.addFirst(7);
        a.addFirst(9);

        a.print();
    
        System.out.println("Count even number: "+ a.countEven());
        System.out.println("Count prime: " +a.countPrime());
        a.addBeforeEven(3);
        a.print();
        System.out.println("Max: "+ a.findMax());

        System.out.println("Them truoc so chan dau tien: ");
        a.addBeforeEven(12);
        a.print();

        System.out.println("Sap xep: ");
        a.sort();
        a.print();


        System.out.println("Dao nguoc: ");
        a.reverseList();
        a.print();

    }
}
