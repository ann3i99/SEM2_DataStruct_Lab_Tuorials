package Week2;

//QUESTION 2

import java.util.List;

public class MyArray {

    public static <T> void listAll(T[] array){
        for (int i=0; i< array.length; i++)
            System.out.print(array[i]+ " ");

        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        String[] names = {"Jane", "Bob", "Tom"};
        Character[] alphabet = {'a', 'b', 'c'};
        MyArray.listAll(numbers);
        MyArray.listAll(names);
        MyArray.listAll(alphabet);

    }
}
