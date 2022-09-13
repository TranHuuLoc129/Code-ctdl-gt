
import java.util.*;
public class BasicLinkedList <E> implements ListInterface {
    
    private ListNode <E> head = null;
    private int num_nodes = 0;

    public boolean isEmpty(){
        if (num_nodes==0) {
            return true;
       }
       return false;
    }

    public int size(){
        return num_nodes;
    }

    public E getFirst()throws NoSuchElementException{
        if(head==null){
            throw new NoSuchElementException("can't get from an emty list");

        }
        else{
            return head.getElement();
        }
    }

    public boolean contains(E item){
       for(ListNode <E> n = head; n!=null; n=n.getNext()){
        if(n.getElement().equals(item)){
            return true;
        }
       }

       return false;
    }

    public void addFirst(E item) {
		head = new ListNode <E> (item, head);
		num_nodes++;
	}


    public E removeFirst() throws NoSuchElementException {
		ListNode <E> ln;
		if (head == null) 
			throw new NoSuchElementException("can't remove from empty list");
		else { 
			ln = head;
			head = head.getNext();
			num_nodes--;
			return ln.getElement();
		}
	}


    public void addAfter(ListNode <E> current, E item) {
        if (current != null) { 
    //	current.setNext(new ListNode <E>(item,current.getNext()));
            ListNode<E> p = new ListNode<E>(item);
            p.setNext(current.getNext());
            current.setNext(p);
    
        } else { // insert item at front
            head = new ListNode <E> (item, head);
        }
        num_nodes++;
    }

    public E removeAfter(ListNode <E> current) 
	                  throws NoSuchElementException {
		E temp;
		if (current != null) {
			ListNode <E> nextPtr = current.getNext();
			if (nextPtr != null) {
				temp = nextPtr.getElement();
				current.setNext(nextPtr.getNext());
				num_nodes--;
				return temp;
			} else throw new NoSuchElementException("No next node to remove");
		} else { // if current is null, assume we want to remove head
			if (head != null) {
				temp = head.getElement();
				head = head.getNext(); 
				num_nodes--;
				return temp;
			} else throw new NoSuchElementException("No next node to remove");
		}
	}

    public E remove (E item) throws NoSuchElementException{
        E temp = null;
        ListNode <E> t = null;
        if (this.contains(item) == false){
            throw new NoSuchElementException("can't remove");
        }
        else {
            for(ListNode <E> n = head; n!= null; n=n.getNext()){
                if(n.getElement().equals(item)){
                    temp = n.getElement();
                    this.removeAfter(t);
                    return temp;
                }
                else{
                    t = n;
                }
            }
        }
        return temp;

    }


    public E remove1 (E item) throws NoSuchElementException{
        E temp = null;
        if(head == null){
            throw new NoSuchElementException("Can't remove");
        }else{
            ListNode <E> pre = null;
            ListNode <E> cur = head;
            if(cur.getElement().equals(item)){
                 return removeFirst();
            }
            else{
                for(int i=0 ; i<num_nodes-1; i++){
                    pre = cur;
                    cur = cur.getNext();
                    if( cur.getElement().equals(item)){
                        return removeAfter(pre);
                    }
                }
            }
        }
        return temp;
    }

    ///head , ....


    public void print() throws NoSuchElementException {
		if (head == null)
			throw new NoSuchElementException("Nothing to print...");

		ListNode <E> ln = head;
		System.out.print("List is: " + ln.getElement());
		for (int i=1; i < num_nodes; i++) {
			ln = ln.getNext();
			System.out.print(", " + ln.getElement());
		}
		System.out.println(".");
	}


}
