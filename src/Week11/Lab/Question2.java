package Week11.Lab;

public class Question2 {
    public static void main(String[] args) {
        permutation("", "ABC");
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));

            // FIRST RECURSION
            // PREFIX: empty + str.charAt(1)             STR: str.substring(0,0) + str.substring(0+1, 3) -- >(1,3)
            // PREFIX : __ + A                           STR:  A + BC

            // NEXT RECESSION
            // PREFIX:
        }


//    public static void permuteString(String prefix, String str){
//        if(str.length() == 0){
//            System.out.println(str);
//        }
//        else{
//            char firstChar = str.charAt(0);
//            //str.substring(1)
//        }
//    }


    }
}
