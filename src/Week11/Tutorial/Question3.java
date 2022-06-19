package Week11.Tutorial;

public class Question3 {
    public static void main(String[] args) {

        String str = "String";
        String reverseString = reverse(str);
        System.out.println(reverseString);
    }


    public static String reverse(String str) {
        if ((str==null)||(str.length() <= 1))
            return str;
        else
            return reverse(str.substring(1)) + str.charAt(0);           //str.substring(0,14)
        //substring method makes a new SUBstring from the og string
        //substring starts from index 1 not 0
        //substring(1) basically prints makes a new substring after the 1 index ie: S[1] + tring[2-6]
        //+ str.chart(0) takes the first letter of the string = S ---> TRING +S
        //recession loops again ---> (RING + T) + S
        // and again ((((ing) + r) + t) + S)
        // and again ng + i + r + t+ S
        // and again g + n + i + r + t + S
        // LAST ----> gnirtS
    }
}
