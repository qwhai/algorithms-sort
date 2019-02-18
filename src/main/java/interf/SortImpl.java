package interf;

public class SortImpl implements Sortable {

    @Override
    public void sort(int[] array) { }

    /**
     * 交换数组中的两个元素
     * 注：此种方法有一个缺陷，i 不可与 j 相等
     *
     * @param array
     *      待排序数组
     * @param i
     *      索引 i
     * @param j
     *      索引 j
     */
    protected void swap(int[] array, int i, int j){
        array[i] += array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
