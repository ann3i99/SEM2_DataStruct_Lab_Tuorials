package Week12.Lab;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {45,7,2,8,19,3};
        selectionSortSmallest(arr);
        System.out.println("Ascending order: ");
        for (int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
        //System.out.println(selectionSortSmallest(arr));

        System.out.println();

        selectionSortLargest(arr);
        System.out.println("Descending order: ");
         for( int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    public static void selectionSortSmallest(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum in the arr[i..arr.length-1]
            int currentMin = arr[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > arr[j]) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            // Swap arr[i] with arr[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }

    }

    public static void selectionSortLargest(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the maximum in the arr[i..arr.length-1]
            //ex arr = 2,4,6,5

            int currentMax = arr[i]; // currentmax = arr[0] = 2
            int currentMaxIndex = i; // currentmazindex = 0
            for (int j = i + 1; j < arr.length; j++) { //j = 1 (index 1 is 4)
                if (currentMax < arr[j]) {  //{2,4,6,5}  2 < 4
                    currentMax = arr[j];    //NEW  currentmax = arr[j] = 4
                    currentMaxIndex = j;    //currentmaxindex = 1
                }
            }
            // Swap arr[i] with arr[currentMinIndex] if necessary;
            if (currentMaxIndex != i) {
                //if index 0 is not the largest value rn, make it so that the largest value will be
                //placed at index 0 instead
                arr[currentMaxIndex] = arr[i]; //swap 4 to index of 2
                arr[i] = currentMax;
            }
        }
    }



}
