import java.util.Arrays;

public class InsertSort {
    private final int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }


    public void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }

        }

    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
