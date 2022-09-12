public class TestFraction {
    public static void main(String[] args) {
        MyLinkedList <Fraction> fracList = new MyLinkedList<>();

        fracList.addFirst(new Fraction(1,2));
        fracList.addFirst(new Fraction(3,2));
        fracList.addFirst(new Fraction(1,6));
        fracList.addFirst(new Fraction(7,6));
        fracList.print();

        //remove last
        fracList.removeLast();
        fracList.print();

        //add last
        fracList.addLast(new Fraction(5,7));
        fracList.print();
        
    }
}
