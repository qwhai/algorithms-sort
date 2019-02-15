package parity;

import interf.SortImpl;

/**
 * 奇偶排序算法
 */
public class ParitySort extends SortImpl {

    @Override
    public void sort(int[] array) {
        if (null == array || 1 >= array.length) return;

        boolean order = false;
        while (!order){
            order = true;

            for(int i = 0; i < array.length; i+=2){
                if (i + 1 >= array.length) { break; }
                if (array[i] > array[i+1]){
                    swap(array, i, i+1);
                    order = false;
                }
            }

            for(int i = 1; i < array.length; i+=2){
                if (i + 1 >= array.length) { break; }
                if (array[i] > array[i+1]){
                    swap(array, i, i+1);
                    order = false;
                }
            }
        }
    }
}
