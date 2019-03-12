package quick;

import interf.SortImpl;

/**
 * 快速排序
 *
 * 数据结构 	        不定
 * 最差时间复杂度 	O(n^2)
 * 最优时间复杂度 	O(n*log n)
 * 平均时间复杂度 	O(n*log n)
 * 最差空间复杂度 	根据实现的方式不同而不同
 */
public class QuickSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        if (null == arr || 1 >= arr.length) { return; }

        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int start, int end){
        if (start >= end) { return; }

        int boundary = findBoundary(arr, start, end);

        sort(arr, start, boundary - 1);
        sort(arr, boundary + 1, end);
    }

    private int findBoundary(int[] arr, int start, int end){
        int pivot = arr[start]; // 以第一个元素作为基准
        int l = start, r = end;

        while (l < r){
            while (l < r && pivot <= arr[r]) { r--; }
            arr[l] = arr[r];

            while (l < r && arr[l] <= pivot) { l++; }
            arr[r] = arr[l];
        }

        arr[l] = pivot;
        return l;
    }
}
