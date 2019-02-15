package shell;

import interf.SortImpl;

/**
 * Shell 排序
 */
public class ShellSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        int step = arr.length;

        do {
            step = step / 3 + 1;
            insert(arr, step);
        } while (step > 1);
    }

    /**
     * 内部参数释义
     *  i 分组内索引
     *  j 插入排序中的分界线索引
     *  k 插入排序分界线索引之前的索引
     *
     * @param arr
     *      待排序数组
     * @param step
     *      分组步长
     */
    private void insert(int[] arr, int step) {
        for (int i = 0; i < step; i++) {
            for (int j = i + step; j < arr.length; j += step) {
                int x = arr[j], k;
                for (k = j - step; k >= 0; k -= step) {
                    if (x < arr[k]) {
                        arr[k + step] = arr[k]; // or coding like this -> swap(arr, k, k + step);
                    } else {
                        break;
                    }
                }

                arr[k + step] = x;
            }
        }
    }
}
