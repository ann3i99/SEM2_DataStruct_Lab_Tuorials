package Week5;

//QUESTION 1
/**
public class Node<T> {

    //1A
    Node<Character> node1 = new Node<>('a');
    Node<Character> node2 = new Node<>('z');

    Node<String> head = null;
    Node<String> tail = null;

    public Node(T a) {}

    //1c
    //head.next = tail;

    //1g
    public void addFirst(Character c) {
        Node<Character> firstNode = new Node<Character>('b');
        firstNode.next = head;
        head = firstNode;
        size ++;
        if (tail == null)
            tail = head;
    }

    public void addLast(E e) {
        if (tail == null) { //no node exist
            head = tail = new Node<>(e);
        }
        else {
            tail.next = new Node<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }
        size++;
    }

    public void add(int index, E e) {
        if (index == 0) addFirst(e);            //since requested to add at index 0
        else if (index >= size) addLast(e);     //since requested to add at index=size
        else {
            Node<E> current = head;             //set head to be a current node
             for (int i = 1; i < index; i++)    //traverse & stop before requested index
                 current = current.next;
             Node<E> temp = current.next;        //hold reference current.next
             current.next = new Node<>(e);       //current.next point to new node (refer α)
             (current.next).next = temp;            //get the reference from temp (refer β)
             size++;
             }
         }

    public E removeFirst() {
        if (size == 0) return null; // no node then return null
        else {
            Node<E> temp = head; // copy head to temp node before delete
            head = head.next; //set new head
            size--; //reduce size
            if (head == null) tail = null; //in case of head=null
            return temp.element; //to know what we delete
        }
    }





H
 hiii



}
**/