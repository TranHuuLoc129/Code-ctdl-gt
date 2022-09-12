public class Node <E>{

    private E data;
    private Node<E> next;

    public Node(E item){
        data = item;
        next = null;
    }

    public Node(E item, Node<E> n){
        data = item;
        next = n;
    }

    public void setNext(Node<E> n){
        next = n;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setElement(E item){
        data = item;
    }

    public E getElement(){
        return data;
    }

}