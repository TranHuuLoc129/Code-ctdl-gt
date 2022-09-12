public class DoubleNode <Double> {
    
    Double element;
    DoubleNode<Double> next;

    public DoubleNode(Double item){
        element = item;
        next = null;
    }

    public DoubleNode(Double item, DoubleNode<Double> n){
        element = item;
        next = n;
    }

    public void setNext(DoubleNode<Double> n){
        next = n;
    }

    public void setElement(Double item){
        element = item;
    }

    public DoubleNode<Double> getNext(){
        return next;
    }

    public Double getElement(){
        return element;
    }

}
