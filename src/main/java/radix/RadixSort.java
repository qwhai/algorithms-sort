package radix;

import interf.SortImpl;

/**
 * 基数排序
 */
public class RadixSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        int maxDigit = maxDigit(arr);
        for (int i = 0; i < maxDigit; i++) {
            sort(arr, i);
        }
    }

    /**
     * 核心函数
     *
     * @param arr
     *      待排数组
     * @param d
     *      待比较的位置
     */
    private void sort(int[] arr, int d) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (getDigit(arr[i], d) > getDigit(arr[j], d)){
                    swap(arr, i, j);
                }
            }
        }
    }

    /**
     * 一个数组中最大数字的位数
     *
     * @param arr
     *      待判断数组
     * @return
     *      最大的数字位数
     */
    private int maxDigit(int[] arr) {
        int maxLength = 0;
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            int currentLength = length(arr[i]);
            if (maxLength < currentLength)
            {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

    /**
     * 计算一个数字共有多少位
     *
     * @param num
     *      待判断的数字
     * @return
     *      数字的位数
     */
    private int length(int num) {
        return String.valueOf(num).length();
    }

    /**
     * 获取 x 这个数的 d 位数上的数字
     * 比如获取 123 的 0 位数，结果返回 3
     *
     * @param x
     *      待计算数字
     * @param d
     *      第 d 位
     * @return
     *      第 d 位上的数字，不足返回 0
     */
    private int getDigit(int x, int d) {
        int a[] = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
        return ((x / a[d]) % 10);
    }
}
