package Week5;

public class MyLinkedList<E> {

    Nodee<E> head = null;
    Nodee<E> tail = null;

    public MyLinkedList(Nodee<E> head, Nodee<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Nodee<E> getHead() {
        return head;
    }

    public void setHead(Nodee<E> head) {
        this.head = head;
    }

    public Nodee<E> getTail() {
        return tail;
    }

    public void setTail(Nodee<E> tail) {
        this.tail = tail;
    }
}
