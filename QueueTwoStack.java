import java.util.NoSuchElementException;

public class QueueTwoStack<E> implements QueueADT<E> {
    
    StackLL<E> s1 ;
    StackLL<E> s2 ;

    public QueueTwoStack(){
        s1 =  new StackLL<>();
        s2 =  new StackLL<>();
    }

    public void enQueue(E item){
        shift2();
        s1.push(item);
    }

    public E deQueue() throws NoSuchElementException{
        shiftELement();
        if(s2.empty()){
            throw new NoSuchElementException("Empty!!");
        }
        E tmp = s2.peek();
        s2.pop();
        return tmp;
    }

    public E getFront() throws NoSuchElementException{
        shiftELement();
        if(s2.empty()){
            throw new NoSuchElementException("Empty!!");
        }
        return s2.peek();
    }

    public int size(){
        return s1.size() + s2.size();
    }

    public boolean isEmpty(){
        if(s1.empty() && s2.empty()){
            return true;
        }
        return false;
    }

    public boolean contains(E item){
        shiftELement();
        return s2.contains(item);
    }


    public void print(){
        shiftELement();
        s2.print();
    }



    public void shiftELement(){
        if(s2.empty() && !s1.empty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }

    }

    public void shift2(){
        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }


}
