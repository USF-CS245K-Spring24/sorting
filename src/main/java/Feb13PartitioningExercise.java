import java.util.Arrays;

public class Feb13PartitioningExercise {
    /**
     * Pick the middle element of the array as the pivot.
     * Partition the input array (in linear time, in one pass) so that elements on the left of the pivot are smaller than pivot,
     * and elements that are larger than pivot (or equal to pivot) are on the right side of the pivot
     * @param arr input array
     */
    public static void partitionArray(int[] arr) {
        int n = arr.length;
        int midIndex = n / 2;
        int pivotElement = arr[midIndex];
        int i = 0;
        int j = n - 2;
        // FILL IN CODE

        // "Swap pivot out of the way" - swap pivot with the last element
        // Repeat until i and j overlap:
            // Repeat: Advance i if arr[i] < pivot
            // Repeat: Decrement j if arr[j] >= pivot
            // If i and j did not overlap, swap elements at i and j
        // Once i and j overlapped, swap the element at index i with the pivot

    }

    public static void main(String[] args) {
        int[] arr2 = {5, 9, 0, 1, 12, 6, 20, 4, 10, 3, 45};
        System.out.println(Arrays.toString(arr2));
        partitionArray(arr2); // 6 is the pivot in this example
        System.out.println(Arrays.toString(arr2));

    }
}
