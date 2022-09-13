public class TestStackArr{
    public static void main(String[] args) {
       MyStackArr<Integer> a = new MyStackArr<>();

        a.push(2);
        a.push(8);
        a.push(3);
        a.push(9);
        a.push(1);

        a.print();

        System.out.println(a.empty());
        System.out.println(a.contains(5));

        a.pop();
        System.out.println(a.size());

        System.out.println(a.peek());

        
        a.print();
        
    }
}
