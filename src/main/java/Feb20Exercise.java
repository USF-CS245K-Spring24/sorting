import java.util.Arrays;
import java.util.LinkedList;

public class Feb20Exercise {

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
            bins[i] = new LinkedList<>();

        // FILL IN CODE: iterate over elements of arr, and add each element
        // to the linked list of the correct "bin"

        // FILL IN CODE: iterate over bins, and place elements from each linked
        // list back into arr

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
        binSort(records, 6);
        System.out.println(Arrays.toString(records));
    }
}
