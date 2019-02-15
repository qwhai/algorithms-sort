
import bubble.BubbleSort;
import insert.InsertSort;
import interf.SortImpl;
import parity.ParitySort;
import quick.QuickSort;

public class SortClient {
    public static void main(String[] args) {
        int[] array = { 34, 23, 76, 56, 54, 12, 34, 65, 45, 9, 8, 7, 6, 5 };
        //int[] array = { 3, 2, 1 };

        SortImpl sortable = new QuickSort();
        sortable.sort(array);

        printArray(array);
    }

    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append((0 == i ? "" : ", ") + arr[i]);
        }

        System.out.println("[" + sb.toString() + "]");
    }
}