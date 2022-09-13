import java.util.NoSuchElementException;

public class MyQueueArr<E> implements QueueADT<E> {

    private E[] arr;
    private int front, back;
    private int maxSize;
    private final int SIZE = 1000;

    public MyQueueArr(){
        arr = (E[]) new Object[SIZE];
        front = 0;
        back = 0;
        maxSize = SIZE;
    }

    @Override
    public void enQueue(E item) {

        if(((back+1)% maxSize)%maxSize == front){
            if(!elargeArr()){
                System.out.println("not ..");
                return;
            }
        }
        arr[back] = item;
        back = (back +1)%maxSize;
    }

    private boolean elargeArr(){
        int newSize = maxSize*2;
        E[] x = (E[]) new Object[newSize];
        if(x==null){
            return false;
        }
        else{
            for(int j=0 ; j<maxSize ; j++){
                x[j] = arr[(front + j)%maxSize];
            }

            front =0 ;
            back = maxSize -1;
            maxSize = newSize;
            arr = x;

            return true;

        }
        
    }

    @Override
    public E deQueue() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("Empty!!!");
        }
        else{
            E tmp = arr[front];
            arr[front] = null;
            front = (front +1) % maxSize;
            return tmp;
         }
    }

    @Override
    public int size() {
        return maxSize;
    }

    @Override
    public boolean contains(E item) {
        for(int i = front; i<=back ; i++){
            if(arr[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Empty!!");
        }
        else{
            for(int i = front; i<back ; i++){
                System.out.print(arr[i] + " ");
        }
            System.out.println();
        }
        
    }

    @Override
    public boolean isEmpty() {
        if(front==back){
            return true;
        }
        return false;
    }

    @Override
    public E getFront() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        else{
            return arr[front];
        }
    }

}
