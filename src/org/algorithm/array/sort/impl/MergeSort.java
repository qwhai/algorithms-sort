package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;

/**
 * <p>
 * 归并排序算法
 * </p>
 * 2016年1月20日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class MergeSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        sortCore(array);
        
        return array;
    }

    private void sortCore(int[] array) {
        int length = array.length;
        merge(array, 0, length / 2, length - 1);
    }
    
    // 合并的核心算法
    private void merge(int[] array, int low, int mid, int hight) {
        int[] auxArray = new int[hight - low + 1];
        int index1 = low;
        int index2 = mid + 1;
        
        int i = 0;
        while(index1 <= mid && index2 <= hight) {
            if (array[index1] <= array[index2]) {
                auxArray[i] = array[index1];
                index1++;
                i++;
            } else {
                auxArray[i] = array[index2];
                index2++;
                i++;
            }
        }
        
        while (index1 <= mid) {
            auxArray[i++] = array[index1];
        }
        
        while (index2 <= hight) {
            auxArray[i++] = array[index2];
        }
        
        for (int j = 0; j < auxArray.length; j++) {
            array[low + j] = auxArray[j];
        }
    }
}
