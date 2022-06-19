package FinalsTestEx.QUESTION2;

import java.util.Scanner;
import java.util.ArrayList;

public class PrintPages {
    public static void main(String[] args) {
        SpecialLL<Integer> bookPage = new SpecialLL<>();
        ArrayList<Integer> selectedList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting page: ");
        int start = input.nextInt();
        System.out.print("Enter number of pages: ");
        int page = input.nextInt();
        for (int i = start; i < start + page; i++){
            bookPage.addLast(i);
        }
        bookPage.print();
        selectedList = bookPage.getEven();
        // insert multiple lines of code here
        System.out.println("Odd pages:");
        bookPage.printOdd();
        System.out.println();
        System.out.println("Even Pages: ");
        for (int i = selectedList.size() - 1; i >= 0; i--){
            System.out.print(" " + selectedList.get(i));
        }



    }
}
