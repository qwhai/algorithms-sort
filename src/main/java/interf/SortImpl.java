package interf;

public class SortImpl implements Sortable {

    @Override
    public void sort(int[] arr) { }

    /**
     * 交换数组中的两个元素
     * 注：此种方法有一个缺陷，i 不可与 j 相等
     *
     * @param arr
     *      待排序数组
     * @param i
     *      索引 i
     * @param j
     *      索引 j
     */
    protected void swap(int[] arr, int i, int j){
        arr[i] += arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
