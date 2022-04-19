package Week6.Q1;

public class SNode<E> {
    E element;
    SNode<E> next;

    //default constructor
    public SNode() {}

    public SNode(E element){
        this.element = element;
        this.next = null;
    }

}
