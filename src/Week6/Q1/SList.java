package Week6.Q1;

public class SList <E>  {

    SNode<E> head;
    SNode<E> tail;
    private int size;

    public SList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Append a new element at the end of the list.
    public void appendEnd(E e){
        //if there's nothing in the list
        if(tail == null){
            head = tail = new SNode<>(e);
        }
        //if there's already a node in the list
        else{
            tail.next = new SNode<>(e);
            tail= tail.next; //point tail to the new node
        }
        size++;
        System.out.println("Added: " + e);
    }

    //Display all values from the list in a successive order.
    public void display(){
        SNode<E> temp = head;
        for (int i =0; i<size; i++){
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    //Eliminate the first element in the list.
    public E removeInitial(){
        if(head == null){ //empty list
            //throw new NoSuchElementException();
            return null;
        }
            SNode<E> temp = head;
            head = head.next; //point head to the next node
            if(head == null){       //size ==0
                tail = null;
            }
            size--;
            System.out.println(temp.element + " was removed.");
            return temp.element;
    }

    //Search for an element and returns true if this list contains the searched element
    public boolean contains(E e){
        SNode<E> temp = head;
        for(int i = 0; i < size; i++){
            if(e.equals(temp.element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //Empty all elements in the list and return a statement that reports that the list is
    //empty.
    public void clear(){
        size = 0;
        head = null;
        tail = null;
        System.out.println("List is clear.");
    }


}
