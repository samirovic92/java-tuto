package algorithme;

public class InsertionSort {

    public static void main(String[] args) {

        // ------------ Insertion  Sort ------------
        int[] intArrays = {18, 2, -1, 5, -10};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArrays.length; firstUnsortedIndex++) {
            int newElement = intArrays[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArrays[i - 1] > newElement; i--) {
                intArrays[i] = intArrays[i - 1];
            }
            intArrays[i] = newElement;
        }
        for (int a : intArrays) {
            System.out.println(a);
        }
    }
}
