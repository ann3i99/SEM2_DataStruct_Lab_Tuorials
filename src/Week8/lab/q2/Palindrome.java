package Week8.lab.q2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String before = scanner.nextLine();

        //push the string in reverse order into the queue
        MyQueue<Character> queue = new MyQueue<>();
        for (int i = before.length() - 1; i >= 0; i--) {
            queue.enqueue(before.charAt(i));
        }

        //after is for the reversed word
        //dequeue the queue based on first in first out
        String after = "";
        while (!queue.isEmpty()) {
            after += queue.dequeue().toString();
        }

        //compare if before string is same with after string
        if (before.equalsIgnoreCase(after)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}

