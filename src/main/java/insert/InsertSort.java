package insert;

import interf.SortImpl;

/**
 * 插入排序
 */
public class InsertSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        if (null == arr || 1 >= arr.length) return;

        for (int i = 1; i < arr.length; i++) {
            insert(arr, i);
        }
    }

    private void insert(int[] arr, int i){
        int x = arr[i], j;
        for (j = i - 1; j >= 0; j--) {
            if (x < arr[j]){
                arr[j + 1] = arr[j];
            } else {
                break;
            }
        }

        arr[j + 1] = x;
    }
}
