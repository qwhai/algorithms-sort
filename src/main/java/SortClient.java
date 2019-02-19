
import bubble.BubbleSort;
import insert.InsertSort;
import interf.SortImpl;
import parity.ParitySort;
import quick.QuickSort;
import shell.ShellSort;
import selection.SelectionSort;
import radix.RadixSort;
import merge.SimpleMergeSort;

public class SortClient {

    public static void main(String[] args) {
        testSimpleMerge();
        testRadix();
        testSelection();
        testBubble();
        testInsert();
        testParity();
        testQuick();
        testShell();
    }

    private static void testSimpleMerge() {
        int[] array = reset();
        System.out.println("正在测试 Simple Merge Sort");

        SortImpl sortable = new SimpleMergeSort();
        sortable.sort(array);

        printArray(array);
    }

    private static void testRadix() {
        int[] array = reset();
        System.out.println("正在测试 Radix Sort");

        SortImpl sortable = new RadixSort();
        sortable.sort(array);

        printArray(array);
    }

    private static void testBubble() {
        int[] array = reset();
        System.out.println("正在测试 Bubble Sort");

        SortImpl sortable = new BubbleSort();
        sortable.sort(array);

        printArray(array);
    }

    private static void testInsert() {
        int[] array = reset();
        System.out.println("正在测试 Insert Sort");

        SortImpl sortable = new InsertSort();
        sortable.sort(array);

        printArray(array);
    }

    private static void testParity() {
        int[] array = reset();
        System.out.println("正在测试 Parity Sort");

        SortImpl sortable = new ParitySort();
        sortable.sort(array);

        printArray(array);
    }

    private static void testQuick() {
        int[] array = reset();
        System.out.println("正在测试 Quick Sort");

        SortImpl sortable = new QuickSort();
        sortable.sort(array);

        printArray(array);
    }

    private static void testShell() {
        int[] array = reset();
        System.out.println("正在测试 Shell Sort");

        SortImpl sortable = new ShellSort();
        sortable.sort(array);

        printArray(array);
    }

    private static void testSelection() {
        int[] array = reset();
        System.out.println("正在测试 Selection Sort");

        SortImpl sortable = new SelectionSort();
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

    private static int[] reset() {
        return new int[] { 34, 23, 76, 56, 54, 12, 34, 65, 45, 9, 8, 7, 6, 5 };
    }
}