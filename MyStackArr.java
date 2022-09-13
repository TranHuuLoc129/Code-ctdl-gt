import java.util.EmptyStackException;

public class MyStackArr<E> implements StackADT<E> {
    
    
    private E[] arr;
    private int top;
    private int maxSize;
 //   private int realSize;
    private final int SIZE = 1000;

    public MyStackArr(){
        arr = (E[]) new Object[SIZE];
        top = -1;
        maxSize = SIZE;
       // realSize = SIZE;
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        if(top < 0){
            return true;
        }
        return false;
    }

    @Override
    public E peek() throws EmptyStackException {
        // TODO Auto-generated method stub
        if(empty()){
            throw new EmptyStackException();
        }
        else{
            return arr[top];
        }
        
    }

    @Override
    public E pop() throws EmptyStackException {
        // TODO Auto-generated method stub
        E temp = null;
        if(empty()){
            throw new EmptyStackException();
        }
        else{
            temp = arr[top];
            top--;
           // realSize--;
            return temp;
        }
        
    }

    
    public void push(E item){
        if(top >= maxSize -1){
            enlargeArr();
        }
        top++;
        arr[top] = item;
    }




    @Override
    public int size() {
        // TODO Auto-generated method stub
        return top + 1 ;
    }

    @Override
    public boolean contains(Object item) {
        // TODO Auto-generated method stub
        for(int i = top ; i>=0 ; i--){
            if(arr[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        if(empty()){
            System.out.println("Stack is empty !!!");
        }
        else{
            for(int i = 0 ; i<= top ; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    
    public void enlargeArr(){
        int newSize = maxSize*2;
        E[] x = (E[]) new Object[newSize];
        for(int j = 0; j<=top;j++){
            x[j] = arr[j];
        }

        maxSize = newSize;
        arr = x;
    }

    
}
