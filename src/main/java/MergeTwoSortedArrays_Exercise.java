import java.util.Arrays;

public class MergeTwoSortedArrays_Exercise {
    /** Merge two sorted arrays into one sorted array in linear time
     *
     * @param arr1 sorted array 1
     * @param arr2 sorted array 2
     * @return  sorted array that has elements from arr1 and arr2
     */
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        // FILL IN CODE
        // initialize i, j, k
        // Repeat:
        // compare elements arr[i] and arr[j], and depending on
        // which one is smaller, place the element in result at index k,
        // and increment either i or j
        // Increment k

        return result;
    }


    /** Merge two sorted subarrays: the one that starts at index low and ends at mid=(low+high)/2,
     * and the other that starts at mid+1 and ends at high (inclusive)
     * @param arr array of integers
     * @param temp temporary array
     * @param low index of the first element in the sorted subarray 1
     * @param mid index of the last element in the sorted subarray 1
     * @param high index of the last element in the sorted subarray 2
     */
    public static void mergeSubarrays(int[] arr, int[] temp, int low, int mid, int high) {
        // Initialize i, j, k
        // while k <= high
        // compare elements and merge, filling the temp array
        // Once done, copy elements from the temp array back into arr.
        int i = low; // the index of the first subarray starts at low (and should go to mid)
        int j = mid + 1; // the index of the second subarray starts at mid+1 (and should go to high)
        int k = low; // index of the temp array
        // FILL IN CODE


    }

    public static void main(String[] args) {
        int[] arr1 = {1, 6, 8, 10, 100, 215};
        int[] arr2 =  {2, 4, 9, 14};
        int[] res = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(res));

        /*int[] arr = {1, 6, 8, 10, 100, 2, 4, 9, 14};
        int[] temp = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        mergeSubarrays(arr, temp, low, mid, high);
        System.out.println(Arrays.toString(arr));
         */
    }
}
