import java.util.*;

public class MyLinkedList <E> implements ListInterface<E>{


    private int num_node;
    private Node<E> head;

    public MyLinkedList(){
       num_node = 0;
        head = null;
    }



    public void addFirst(E item){
        Node<E> temp = new Node<E>(item);
        temp.setNext(head);
        head = temp;
        num_node++;
    }


    public void print(){
        if(isEmpty()){
            System.out.println("Empty!!!");
        }
        else{
            Node<E> t = head;
            System.out.print("Linked list: ");
            while(t!=null){
                System.out.print(t.getElement()+" ");
                t = t.getNext();
        }

            System.out.println();
        }
        
    }


    public int size(){
        return num_node;
    }

    public boolean isEmpty(){
        if(num_node == 0){
            return true;
        }
        return false;
    }

    public Node<E> getHead(){
        return head;
    }

    public boolean contains(E item){
        Node<E> temp = head;

        while(temp!=null){
            if(temp.getElement().equals(item)){
                return true;
            }

            temp = temp.getNext();
        }

        return false;
    }

    public E removeFirst() throws NoSuchElementException{
        if(!isEmpty()){
            E value = head.getElement();
            head = head.getNext();
            num_node--;
            return value;
        }
        else{
            throw new NoSuchElementException("Empty!!!");
        }
    }

    public E getFirst() throws NoSuchElementException{
        if(!isEmpty()){
            return head.getElement();
        }
        else{
            throw new NoSuchElementException("Empty!!!");
        }
    }

    public E removeAfter(Node <E> curr) throws NoSuchElementException {
        if(curr != null){
            Node<E> nPtr = curr.getNext();
            if(nPtr == null){
                throw new NoSuchElementException("Can't remove");
            }
            else{
                E temp = nPtr.getElement();
                curr.setNext(nPtr.getNext());
                num_node--;

                return temp;
            }
        }
        else{
            throw new NoSuchElementException("Can't remove");
        }
    }


    public E removeLast() throws NoSuchElementException {
        if(!isEmpty()){
            Node<E> front = head;
            Node <E> back = head.getNext();
            while(back.getNext()!=null){
                front = front.getNext();
                back = back.getNext();
            }

            return removeAfter(front);
            

        }
        else{
            throw new NoSuchElementException("Can't remove");
        }
    }


    public void addLast (E item)  throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        else{
           Node<E> tmp = head;
           while(tmp.getNext() != null){
              tmp= tmp.getNext();

           } 

           Node<E> newNode = new Node<E> (item);
           tmp.setNext(newNode);
        }
    }

    public void addAfter(Node<E> curr, E item) throws NoSuchElementException{
        if(curr == null){
            addFirst(item);
        }
        else{
            Node<E> newNode = new Node<E> (item, curr.getNext());
            curr.setNext(newNode);
            num_node++;

        }
    }


    public void setNumNode(int i){
        num_node = i;
    }


    //Exercise 02
    public E removeCurr(Node<E> curr) throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        else{
            if(curr == null){
                throw new NoSuchElementException("Can't remove");
            }else{
                E item = null;
                Node<E> tmp = head;
                while(tmp.getNext().getElement() != curr.getElement()){
                    tmp = tmp.getNext();
                }
                item = tmp.getNext().getElement();
                removeAfter(tmp);
                return item;
            }
        }
    }


}