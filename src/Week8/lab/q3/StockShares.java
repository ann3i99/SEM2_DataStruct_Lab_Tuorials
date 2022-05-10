package Week8.lab.q3;

import Week8.lab.q1.MyQueue;
import java.util.Scanner;

public class StockShares {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //create queue for shares and price
        MyQueue<String> shareQueue = new MyQueue<>();
        MyQueue<String> priceQueue = new MyQueue<>();

        //get user input  if want to buy or sell
        System.out.println("Enter your query (In format 'Buy / sell x shares at $y each ') : ");
        String userInput = s.nextLine();





    }
}
