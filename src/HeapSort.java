import java.util.Arrays;

public class HeapSort {

    private final int[] array;

    public HeapSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        for (int i = array.length - 1; i >= 0 ; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }
        if (largest != rootIndex) {
            int tmp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = tmp;

            heapify(array, heapSize, largest);
        }


    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
