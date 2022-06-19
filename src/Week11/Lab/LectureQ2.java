package Week11.Lab;

public class LectureQ2 {
    public static void main(String[] args) {
        permuteString("","ABC");

    }

    public static void permuteString( String begStr, String endStr){
        if (endStr.length()<=1)
            System.out.println(begStr+endStr);
            //Round 3: Output = ABC
        else
            for (int i = 0; i<endStr.length(); i++){

                String newString = endStr.substring(0,i) + endStr.substring(i+1);
                //  Round 1:    "" + BC  --> newString = BC
                //  Round 2:    "" + C   --> newString = C
                //  Round 3:    -

                permuteString(begStr+endStr.charAt(i),newString);
                // Round 1: "" + A ,   BC --> begStr: A, endStr: BC
                // Round 2: A + B , C     --> begStr: AB, endStr: C
                // Round 3: -





            }
    }
}
