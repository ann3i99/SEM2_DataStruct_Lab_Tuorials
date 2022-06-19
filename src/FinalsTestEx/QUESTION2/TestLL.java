package FinalsTestEx.QUESTION2;

public class TestLL {
    public static void main(String[] args) {

        SpecialLL<Character> list = new SpecialLL<>();

        //a. append the following
        list.addFirst('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');
        list.addLast('f');

        //a. Print odd nodes
        list.printOdd();
        System.out.println();
        System.out.println(list.getEven());


//        //d. Retrieve the number of elements in the list.
//        System.out.println("Size is: " + list.getSize());
//        //System.out.println(list.getSize());
//        System.out.println("Current size: " + list.getSize());
//        list.print();

    }
}
