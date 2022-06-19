package Week11.Lab;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
        System.out.println(substituteAI("a"));
    }

    //example String: "fama"

    public static String substituteAI (String str) {

        if(str.length() == 0 ) {
            return "";
            // return Character.toString(str.charAt(0));
        } else {
            if (str.charAt(0)=='a')
                //recursive method
                //if the char at that index == a then it will print i instead of a + the remaining string using substring from 1
                // ex: ama  --> i + ma
                return 'i' + substituteAI(str.substring(1));

            //recursive method again
            //if the char is not == a then it will take that value at index 0 + remaining string using substring from 1
            // ex: fama --> f + ama
            return str.charAt(0) + substituteAI(str.substring(1));

            // will repeat until  --- > f + i + m + i

        }

    }
}
