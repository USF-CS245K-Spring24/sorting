import java.util.Arrays;

public class Feb8Sorting01ExerciseSolution {

    /**
     * Sort the given array of 0s and 1s in linear time and one pass
     * @param arr input array
     */
    public static void sort01(int[] arr) {
        // FILL IN CODE
        int i = 0; // starts at the beginning
        int j = arr.length - 1; // starts at the end
        while (i < j) {
            while ((i < j) && (arr[i] == 0))
                 i++;
            while ((i < j) && (arr[j] == 1))
                j--;
            if (i < j) {
                arr[i] = 0;
                arr[j] = 1;
            }
        }
        


    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        sort01(arr);
        System.out.println(Arrays.toString(arr));
    }
}
