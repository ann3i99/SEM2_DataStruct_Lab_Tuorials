package Week12.Lab;

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {10,34,2,56,7,67,88,42};
        InsertionSortSmallest(arr);
        System.out.println("Ascending order: ");
        for (int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void InsertionSortSmallest(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            /** insert arr[i] into a sorted subarr arr[0..i-1] so that
             arr[0..i] is sorted. */
            int currentElement = arr[i];
            int k; // k = index 0 = 10
            for (k = i - 1; k >= 0 && arr[k] > currentElement; k--) {       //K = 2-1=1
                arr[k + 1] = arr[k];        //arr[2]=arr[1]  2,34,34,56,7,67,88,42
                                            // NOW K =0  arr[1]=arr[0]

                //i = 2; arr[i] = 2 = currentElement
                //k = 1, arr[k] = 34
                //during for loop, since arr[k]>arr[i]
                //value of arr[k] will move to arr[k+1] //basically pushing it to the right
                //k--, now k = 0, arr[k] = 10
                //during for loop, since arr[k]>arr[i]
                //value of arr[k] will move to arr[k+1]
                //k--, now k = -1, so for loop stop since it's no longer k>= 0
            }
            //k is now -1

            // Insert the current element into arr[k+1]
            //to go back to arr[0]
            //store back value 2 into arr at index 0
            arr[k + 1] = currentElement;
        }
    }

}
