import java.util.*;
public class MyDoubleLinkedList<Double> {
    
    private int num_node;
    private DoubleNode<Double> head;

    public MyDoubleLinkedList(){
        num_node = 0;
        head = null;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public int size(){
        return num_node;
    }

    public Double getFirst() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException("Empty !!");
        }
        else{
            return head.getElement();
        }
    }

    public DoubleNode<Double> getHead(){
        return head;
    }

    public boolean contains(Double item){
        if(isEmpty()){
            return false;
        }
        else{
            DoubleNode<Double> tmp = head;
            while(tmp!=null){
                if(tmp.getElement().equals(item)){
                    return true;
                }
                tmp = tmp.getNext();
            }
            return false;
        }
    }

    public void add(Double item){
        DoubleNode<Double> newNode = new DoubleNode<Double>(item);
        newNode.setNext(head);
        head = newNode;
        num_node++;

    }

    public Double  remove(Double item){
        Double temp = null;
        if(isEmpty()){
            throw new NoSuchElementException("Can't remove");
        }
        else{
            DoubleNode<Double> pre = null;
            DoubleNode<Double> cur = head;
            if(cur.getElement().equals(item)){
                temp = head.getElement();
                head = head.getNext();
                num_node--;
                return temp;
            }
            else{
                for(int i =0;i<num_node-1;i++){
                    pre = cur;
                    cur = cur.getNext();
                    if(cur.getElement().equals(item)){
                        temp = cur.getElement();
                        pre.setNext(cur.getNext());
                        num_node--;
                        return temp;
                    }
                }
                return temp;
            }

        }


    }

    public boolean find(Double item) throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException("Empty!!");
        }
        else{
            DoubleNode<Double> tmp ;
            for(tmp = head; tmp!=null; tmp=tmp.getNext()){
                if(tmp.getElement().equals(item)){
                    return true;
                }
            }

            return false;
        }
    }


    public void print(){
        if(isEmpty()){
            System.out.println("Empty!!");
        }
        else{
            System.out.print("List: ");
            DoubleNode<Double> tmp = head;
            while(tmp!=null){
                System.out.print(tmp.getElement()+" ");
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }



}
