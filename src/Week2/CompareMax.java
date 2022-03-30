package Week2;

//LAB QUESTION 3
//In a class called CompareMax, create a generic static method called maximum where the generic
//type extends the Comparable interface, which receives three parameters. Find the maximum of
//three values invoked by the main method.

public class CompareMax {
    public static <T extends Comparable> void maximum(T a, T b, T c) {
        if ((a.compareTo(b) > 0) && (a.compareTo(c) > 0))                   // a>b && a>c
            System.out.println("Max is " + a);
        else if ((b.compareTo(a) > 0) && (b.compareTo(c) > 0))              // b>a && b>c
            System.out.println("Max is "+ b);
        else
            System.out.println("Max is "+ c);
    }

    public static void main(String[] args) {
        maximum(3, 6, 1);
        maximum("a", "b", "c");
    }
}
