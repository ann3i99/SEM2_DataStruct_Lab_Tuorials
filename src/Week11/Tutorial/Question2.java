package Week11.Tutorial;

public class Question2 {
    public static void main(String[] args) {
        f(3);

    }

    public static int f(int n) {
        if (n == 0)
            return n;
        else
            return f(n+1) + n;
    }
}
