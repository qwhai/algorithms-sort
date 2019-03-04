package bubble;

import interf.SortImpl;

/**
 * 双向冒泡排序
 */
public class TwowayBubbleSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            sortLeft(arr, left);
            left++;

            if (left >= right) break;

            sortRight(arr, right);
            right--;
        }
    }

    private void sortLeft(int[] arr, int i) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                swap(arr, i, j);
            }
        }
    }

    private void sortRight(int[] arr, int i) {
        for (int j = i - 1; j >= 1; j--) {
            if (arr[j] > arr[i]) {
                swap(arr, j, i);
            }
        }
    }
}
