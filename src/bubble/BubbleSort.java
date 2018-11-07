package bubble;

import interf.SortImpl;

/**
 * 冒泡排序
 */
public class BubbleSort extends SortImpl {

    @Override
    public void sort(int[] array) {
        if (null == array) return;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }
}
