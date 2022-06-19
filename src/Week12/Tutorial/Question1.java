package Week12.Tutorial;

public class Question1 {
    public static void main(String[] args) {
        int array[] = {12,14,24,45,67,87};
        int key = 45;

        int low = 0;                        // low =0   3
        int high = array.length-1;          // =5

        while (high>=low){                  // 5>=0     5 >=3
            int mid = (low+high)/2;         // MID = 2      mid = 4
            if (key < array[mid])           //45 < 24 wrong  45<67
                high = mid -1;                              // high = 3
            else if (key == array[mid])     // 45 == 24 wrong
                System.out.println(mid);
            else
                low = mid +1;               // low = 3

        }
        System.out.println(-1-low);

    }
}
