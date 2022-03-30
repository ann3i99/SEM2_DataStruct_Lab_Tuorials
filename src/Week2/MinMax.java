package Week2;

//LAB QUESTION 4
//Provide a declaration and implementation of the generic method minmax() that takes in an array
//of generic type and returns a string with the following format: Min = <minValue> Max =
//<maxValue>. For instance,
//Integer[] intArr = {5, 3, 7, 1, 4, 9, 8, 2};
//String[] strArr = {“red”, “blue”, “orange”, “tan”};
//String intStr = minmax(intArr); //intStr = “Min = 1 Max = 9
//String str = minmax(strArr); //str= “Min = blue Max = tan

public class MinMax {

    public static <T extends Comparable> String minmax(T[] array){
        T min = array[0];
        T max = array[0];

        for (int i=0; i< array.length; i++){
            if (min.compareTo(array[i])>0)          // min > array[i]
                min = array[i];
            else if (max.compareTo(array[i])<0)     // max < array[i]
                max = array[i];
        }
        return "Min = " + min + " Max = " + max;
    }

    public static void main(String[] args) {
        Integer[] intArr = {5,3,7,1,4,9,8,2};
        String[] strArr = {"red", "blue", "orange", "tan"};

        String intStr = minmax(intArr);                     //intStr = “Min = 1 Max = 9
        System.out.println(intStr);

        String strstr = minmax(strArr);                     //str= “Min = blue Max = tan
        System.out.println(strstr);
    }

}
