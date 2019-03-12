package heap;

import interf.SortImpl;

/**
 * 堆排序
 * (大顶堆)
 */
public class HeapSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        // TODO
        if (null == arr || 1 >= arr.length) return;

        adjust(arr, 0, arr.length);
    }

    private void adjust(int[] arr, int top, int b) {
        // TODO
    }

    private void fix(int[] arr, int top, int b) {
        // TODO
    }

    private int[] seek(int[] arr) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }
}
