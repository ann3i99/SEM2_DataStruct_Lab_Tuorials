package Week11.Tutorial;

public class Question5 {
    public static void main(String[] args) {
        printDigit(4567);
    }

    public static void printDigit (int n) {
        int digit = n % 10;
        //use mod to Divide the number by 10 to get the last number at the back
        //ex: 4567/10 == 456.7 --> take digit 7
        // here digit == 7
        if (n == 0)
            System.out.println(n);
        else {
            //recursion method
            printDigit(n / 10);
            // 4567/10 == 456.7 BUT CANNOT READ DECIMAL SO  n == 456
            System.out.print(digit + " ");
            //7 + "_"
        }
    }
}