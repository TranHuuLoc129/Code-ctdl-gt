public class ListNode <E> {
    private E element;
    private ListNode <E> next;

    public ListNode (E item){
        element = item;
        next =null;
    }

    public ListNode(E item, ListNode <E> n){
        element = item;
        next = n;
    }

    public ListNode <E> getNext(){
        return next;
    }

    public E getElement(){
        return element;
    }

    public void setNext(ListNode <E> n){
        next = n;
    }

}
