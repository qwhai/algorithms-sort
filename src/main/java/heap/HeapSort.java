package heap;

import interf.SortImpl;

/**
 * 堆排序
 * (大顶堆 / 基于递归)
 */
public class HeapSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        if (null == arr || 1 >= arr.length) return;

        int boundary = arr.length - 1;
        build(arr); // 构建初始大顶堆

        swap(arr, 0, boundary); // 保存当前堆顶到末尾

        while (--boundary >= 0) {
            adjust(arr, 0, boundary); // 调整每个子堆为大顶堆
            swap(arr, 0, boundary); // 保存当前堆顶到末尾
        }
    }

    /**
     * 构建原始大顶堆
     */
    private void build(int[] arr) {
        int n = arr.length / 2; // 从最后一个非叶子节点开始
        for (int i = n - 1; i >= 0 ; i--) {
            adjust(arr, i, arr.length - 1);
        }
    }

    /**
     * 调整子顶堆为大顶堆
     */
    private void adjust(int[] arr, int top, int boundary) {
        fix(arr, top, 2 * top + 1, boundary);
        fix(arr, top, 2 * top + 2, boundary);
    }

    /**
     * 与子节点比较，并调整子顶堆为大顶堆
     */
    private void fix(int[] arr, int top, int sub, int boundary) {
        if (sub > boundary) return;
        if (arr[top] < arr[sub]) {
            swap(arr, top, sub);
            adjust(arr, sub, boundary);
        }
    }
}
