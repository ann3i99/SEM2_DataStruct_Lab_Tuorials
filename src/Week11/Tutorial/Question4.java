package Week11.Tutorial;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n){
        if (n == 1)
            return 1;
        else
            return n + sum(n-1);
            // 5 + (5-1) --> 5 + 4
            // 5 + 4 + (4-1) --> 5 + 4 + 3
            // 5 + 4 + 3 + (3-1)  --> 5 + 4 + 3 + 2
            // 5 + 4 + 3 + 2 + (2-1) --> 5+4+3+2+!
            // now n==1 so will return 1 and end program
    }
}
