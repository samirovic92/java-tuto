package algorithme;

import java.util.stream.Stream;

public class SelectionSort {

    public static void main(String[] args) {

        // ------------ Selection  Sort ------------
        int[] intArrays = {18, 2, -1, 5, -10};
        for (int lastUnsortedIndex = intArrays.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArrays[i] > intArrays[largest]){
                    largest = i;
                }
            }
            swap(intArrays, largest, lastUnsortedIndex);
        }
        for (int a : intArrays) {
            System.out.println(a);
        }
    }

    private static void swap(int[] intArrays, int i , int j) {
        int tmp = intArrays[i];
        intArrays[i] = intArrays[j];
        intArrays[j] = tmp;
    }
}
