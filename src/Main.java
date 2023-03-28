import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[] {7,4,9,2,6,3,8,1,5,0};

        InsertSort myTest = new InsertSort(myArray);
        myTest.sort();
        System.out.println(myTest);

        int[] myOtherArray = new int[] {99,24,19,2,6,63,83,155,5,0};
        HeapSort testSort = new HeapSort(myOtherArray);
        testSort.sort();
        System.out.println(testSort);

    }

}