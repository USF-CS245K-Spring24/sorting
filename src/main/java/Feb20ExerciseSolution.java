import java.util.*;

public class Feb20ExerciseSolution {
    /**
     * Bin sort implementation - first adds each element to the linked list
     * for the correct "bin", then uses array of bins to sort arr.
     * @param arr input array of records
     * @param maxValue largest value of the key; all keys are from 0 to maxValue.
     */
    public static void binSort(Elem[] arr, int maxValue) {
        int i;
        // create bins and empty linked list for each bin.
        LinkedList<Elem>[] bins = new LinkedList[maxValue+1];
        for (i = 0; i <= maxValue; i++)
            bins[i] = new LinkedList<Elem>();

        // Iterate over elements of arr, and add each element
        // to the linked list of the correct "bin"
        for (i = 0; i < arr.length; i++)
            bins[arr[i].getKey()].add(arr[i]); //here we assume the add method is efficient

        // Iterate over bins, and place elements from each linked
        // list back into arr
        int k = 0;
        for (i = 0; i <= maxValue; i++) {
            LinkedList<Elem> llist = bins[i];
            Iterator<Elem> it = llist.iterator();
            while (it.hasNext()) {
                arr[k] = it.next();
                k++;
            }
        }

    }

    public static void bucketSort(Elem[] arr, int maxKey, int numBuckets) {
        LinkedList[] buckets = new LinkedList[numBuckets];

        // Compute the range of each bucket
        int bucketRange = maxKey / numBuckets + 1;
        // Add elements to the array of buckets
        for (int i = 0; i < arr.length; i++) {
            int bucketId = arr[i].getKey() / bucketRange; // index of the bucket where array[i] should go
            if (buckets[bucketId] == null)
                buckets[bucketId] = new LinkedList(); // initialize, if the list did not exist
            buckets[bucketId].add(arr[i]);
        }

        // Put elements back into the array
        int k = 0;
        for (int i = 0; i < numBuckets; i++) {
            if (buckets[i] != null) {
                Collections.sort(buckets[i]);
                Iterator<Elem> it = buckets[i].iterator();
                while (it.hasNext()) {
                        arr[k] = it.next();
                        k++;
                }
            }
        }

    }

    public static void main(String[] args) {
        Elem[] records = {
                new Elem(6, "red"),
                new Elem(1, "blue"),
                new Elem(6, "yellow"),
                new Elem(2, "black"),
                new Elem(1, "brown"),
                new Elem(6, "orange"),
                new Elem(0, "green"),
                new Elem(6, "gray")};
        //binSort(records, 6);
        bucketSort(records, 6, 3);
        System.out.println(Arrays.toString(records));
    }
}
