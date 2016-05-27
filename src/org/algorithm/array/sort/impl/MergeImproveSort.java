package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;

/**
 * <p>
 * 归并排序算法的改进版（强分治归并）
 * </p>
 * Create Date: 2016年5月26日
 * Last Modify: 2016年5月26日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
public class MergeImproveSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        sortCore(array, 0, array.length - 1);
        
        return array;
    }

    /**
     * 对数组进行分组的核心模块
     * 
     * @param array
     *      待排序数组
     * @param start
     *      开始位置
     * @param end
     *      结束位置（end 为 数组可达下标）
     */
    private void sortCore(int[] array, int start, int end) {
//        System.err.println("[ " + start + ", " + end + " ]");
        if (start == end) {
            return;
        } else {
            int middle = (start + end) / 2;
            sortCore(array, start, middle);
            sortCore(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }
    
    /**
     * 合并的核心模块
     * 
     * @param array
     *      待排序数组
     * @param low
     *      开始位置
     * @param mid
     *      中间位置
     * @param hight
     *      结束位置（end 为 数组可达下标）
     */
    private void merge(int[] array, int low, int mid, int hight) {
//        System.err.println("[ " + low + ", " + mid + ", " + hight + " ]");
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
