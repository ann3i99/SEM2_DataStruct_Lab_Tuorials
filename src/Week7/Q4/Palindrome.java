package Week7.Q4;

import java.util.Scanner;

/*Q4
        A string is a palindrome if it spells the same way forwards and backwards.
        Write a Java program that uses a Stack to determine if a string is a palindrome or not.
        Let your string be of maximum size 15 characters.
        Note however that the actual size may be 15 or less.

        */
public class Palindrome {
    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);
        MyStack<Character> palindromeStack = new MyStack<>();

        System.out.println("Enter a word: ");
        while(true){
            String  wordCheck = s.nextLine();
            //check if the word is more than 15 characters or not
            if(wordCheck.length()<=15){
                //then push to stack
                //push each character of the string to the stack
                for (int i = 0; i < wordCheck.length(); i++) {
                    palindromeStack.push(wordCheck.charAt(i));
                }
                String reverseInput = "";

                //check if stack is empty
                //1. pop all char into a stack
                //2. store that stack into a string this basically reverses the original string
                while(!palindromeStack.isEmpty()){
                    reverseInput += palindromeStack.pop();
                }

                //3. compare if it is the same with the og string
                if (wordCheck.equalsIgnoreCase(reverseInput)){
                    System.out.println("The word is Palindrome!!!!");
                } else
                    System.out.println("The word is NOT Palindrome!!!");

                break;

            }
            else{
                System.out.println("\nWord is more than 15 characters! Please re-enter value:");
            }
        }


    }
}
