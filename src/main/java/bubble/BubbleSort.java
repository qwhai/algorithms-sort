package bubble;

import interf.SortImpl;

/**
 * 冒泡排序
 */
public class BubbleSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        if (null == arr) return;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }
}
