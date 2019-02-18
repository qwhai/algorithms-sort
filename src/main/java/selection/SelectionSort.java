package selection;

import interf.SortImpl;

/**
 * 选择排序
 */
public class SelectionSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            select(arr, i);
        }
    }

    /**
     * 选择排序核心函数
     *
     * @param arr
     *      待排序数组
     * @param s
     *      切分数组的基准线
     */
    private void select(int[] arr, int s) {
        int min = arr[s];
        int j = s;
        for (int i = s; i < arr.length; i++) {
            if (arr[i] < min) {
                j = i;
                min = arr[j];
            }
        }

        if (j != s) swap(arr, j, s);
    }
}
