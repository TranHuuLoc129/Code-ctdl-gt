public class Node <E> {


    private E data;
    private Node<E> next;

    public Node(){
        data = null;
        next = null;
    }

    public Node(E data){
        this.data = data;
        this.next = null;
    }

    public Node(E item, Node<E> n){
        this.data = item;
        next = n;
    }

    public void setNext(Node<E> n){
        this.next = n;
    }

    public E getData(){
        return this.data;
    }

    public Node<E> getNext(){
        return next;
    }

}