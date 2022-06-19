package Week11.Lab;

public class Question3 {
    public static void main(String[] args) {
        System.out.println(exponent(10,3));
    }

    //x is base, m is the exponent
    public static long exponent(int x, int m) {
        if(m == 0){
            return 1;
        }
        else{
            return (long) (x * exponent(x, m-1));

            //x * exponent(x, m-1);
            // 1: 10 * ex(10, 3-1) ------------------->  10 * ex(10, 2)
            // 2: 10 * (10 * ex(10, 2-1) ------------->  10 * (10 * ex(10, 1)
            // 3: 10 * (10 * (10 * ex(10, 1-1)))  ---->  10 * (10 * (10 * ex(10, 0)))


            //  10 * (10 * (10 * 1))
            // 10 * (10 * 10)
            // 10 * 100
            // 1000

        }
    }

}
