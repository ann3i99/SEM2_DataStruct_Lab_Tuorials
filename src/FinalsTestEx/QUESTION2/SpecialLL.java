package FinalsTestEx.QUESTION2;

import java.util.ArrayList;

public class SpecialLL<E> {
    Node<E> head, tail;
    int size =0;

    public SpecialLL(){}

    public int getSize(){
        return size;
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail == null)
            tail = head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void printOdd(){
        Node<E> current = head;
        for (int i = 1; i<=size; i++) {
            if (i % 2 != 0) {
                System.out.print(current.element + " ");
            }
            current = current.next;
        }
    }

    public ArrayList<E> getEven(){
        ArrayList<E> list = new ArrayList<>();
        Node<E> current = head;

        for (int i = 1; i<= size; i++) {
            if (i % 2 == 0) {
                //add newer element to the front (index 0) of the array list
                list.add(0, current.element);
            }
        current = current.next;
        }
        return list;
    }

    public void print(){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            System.out.println(current.element + "");
            current = current.next;
        }
        System.out.println();
    }
}
