import java.util.*;
public class IntegerLinkedList<Integer> extends MyLinkedList<Integer> {  //int linked list

    public IntegerLinkedList(){}
    
    public int countEven() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("Empty !!!");
        }
        else{
            int d = 0;
            for(Node<Integer> tmp = getHead() ; tmp != null; tmp = tmp.getNext()){
                 if ( (int)tmp.getElement()%2 == 0){
                     d++;
                 }
            }

            return d;
        }

    }

    public boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i = 2 ; i<n; i++){
                if(n%i == 0){
                    return false;
                }
            }
        }

        return true;
        
        
    }

    public int countPrime() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("Empty !!!");
        }
        else{
            int d = 0;
            for(Node<Integer> tmp = getHead(); tmp!=null; tmp=tmp.getNext()){
                if(isPrime((int)tmp.getElement())){
                    d++;
                }
            }

            return d;
        }
    }

    
    
    public void addBeforeEven(Integer item){
        if(isEmpty()){
            System.out.println("Empty!!");
        }
        else{
            if(countEven() == 0){
                System.out.println("There is no even number");

            }
            else{
                Node<Integer> tmp = getHead();
                Node<Integer> pre = null;
                for(int i = 0; i<size() ; i++){
                    if((int)tmp.getElement() %2 ==0){
                        Node<Integer> n = new Node<Integer>(item);
                        n.setNext(tmp);
                        pre.setNext(n);
                        setNumNode(size()+1);
                        break;
                    }
                    else{
                        pre = tmp;
                        tmp=tmp.getNext();
                    }
                }
            }
        }
    }

    public Integer findMax() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException("Empty !!!");
        }
        else{
            Node<Integer> tmp = getHead();
            Integer max = tmp.getElement();
            while(tmp != null){
                if((int)tmp.getElement() > (int)max){
                    max = tmp.getElement();
                }
                tmp=tmp.getNext();
            }

            return max;

        }
    }

    public void sort(){
        if(isEmpty()){
            System.out.println("Empty!!");
        }
        else{
            for(Node<Integer> p1 = getHead(); p1!=null; p1= p1.getNext()){
                for(Node<Integer> p2 = p1.getNext() ; p2!=null; p2=p2.getNext()){
                    if((int)p1.getElement() >(int) p2.getElement()){
                        Integer tmp = p1.getElement();
                        p1.setElement(p2.getElement());
                        p2.setElement(tmp);
                    }
                }
            }
        }
    }


    
    public void reverseList(){
        if(isEmpty()){
            System.out.println("Empty!!!");
        }
        else{
            Node <Integer> start = getHead();
            Node <Integer> end = getHead();
            while(end.getNext() != null){
                end=end.getNext();
            }
            int p =0;
            int e = size() -1;
            while(p<e){
                Integer tmp = start.getElement();
                start.setElement(end.getElement());
                end.setElement(tmp);
                start = start.getNext();

                end = getHead();
                int d =0;
                while( d != e-1){
                    d++;
                    end = end.getNext();
                }
                
                p++;
                e--;
            }
        }
    }



    
}

