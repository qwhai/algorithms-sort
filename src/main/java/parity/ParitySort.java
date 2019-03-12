package parity;

import interf.SortImpl;

/**
 * 奇偶排序算法
 */
public class ParitySort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        if (null == arr || 1 >= arr.length) return;

        boolean order = false;
        while (!order){
            order = true;

            for(int i = 0; i < arr.length; i+=2){
                if (i + 1 >= arr.length) { break; }
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    order = false;
                }
            }

            for(int i = 1; i < arr.length; i+=2){
                if (i + 1 >= arr.length) { break; }
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    order = false;
                }
            }
        }
    }
}
