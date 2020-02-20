package algorithme;

public class BubbleSort {

    public static void main(String[] args) {

        // ------------ Bubble Sort ------------
        int[] intArrays = new int[]{18, 2, -1, 5, -10};
        for (int lastUnsortedIndex = intArrays.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if ( intArrays[i] > intArrays[i + 1]) {
                    swap(intArrays,  i ,  i+1);
                }
            }
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
