package Week6.Q2;

public class ANode<E> {
    E element;
    ANode<E> next;

    //default constructor
    public ANode() {}

    public ANode(E element){
        this.element = element;
        this.next = null;
    }


}
