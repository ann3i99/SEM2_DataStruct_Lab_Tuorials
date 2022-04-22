package Week7.Q5;

import java.util.Scanner;

public class TowerOfHanoi {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //create 3 stacks to represent the 2 tower of hanoi
        MyStack<Integer> source = new MyStack<>();
        MyStack<Integer> auxiliary = new MyStack<>();
        MyStack<Integer> destination = new MyStack<>();

        System.out.println("Number of disks?:");
        int diskNum = s.nextInt();

        //add n number of disk to stack A
        for (int i = diskNum; i > 0; i--){
            source.push(i);
        }

        //total of  2^n – 1 moves are required
        int moves = (int) Math.pow(2, diskNum) - 1;
    }

}
