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

    // 对数组进行分组的核心模块
    private void sortCore(int[] array) {
        int length = array.length;
        
        int groupSize = 1;
        while(groupSize < length) {
            for (int i = 0; i < length; i += (groupSize * 2)) {
                int low = i;
                int hight = Math.min(i + groupSize * 2 - 1, length - 1);
                merge(array, low, low + groupSize - 1, hight);
            }
            groupSize *= 2;
        }
        
        // 对分组中的奇数情况进行另外处理
        if (groupSize / 2 < length) {
            int low = 0;
            int hight = length - 1;
            merge(array, low, groupSize / 2 - 1, hight);
        }
    }
    
    // 合并的核心模块
    private void merge(int[] array, int low, int mid, int hight) {
        if (low >= hight) {
            return;
        }
        
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
        
        // 继续合并前半段数组中未被合并的部分
        while (index1 <= mid) {
            auxArray[i] = array[index1];
            index1++;
            i++;
        }
        
        // 继续合并后半段数组中未被合并的部分
        while (index2 <= hight) {
            auxArray[i] = array[index2];
            index2++;
            i++;
        }
        
        // 将合并好的序列写回到数组中
        for (int j = 0; j < auxArray.length; j++) {
            array[low + j] = auxArray[j];
        }
    }
}
