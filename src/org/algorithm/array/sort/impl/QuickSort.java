package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;

/**
 * <p>
 * 快速排序算法
 * </p>
 * 2016年1月19日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class QuickSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        sortCore(array, 0, array.length - 1);
        return array;
    }
    
    /*
     * 排序的核心算法
     * 
     * @param array
     *      待排序数组
     * @param startIndex
     *      开始位置
     * @param endIndex
     *      结束位置
     */
    private void sortCore(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        
        int boundary = boundary(array, startIndex, endIndex);
        
        sortCore(array, startIndex, boundary - 1);
        sortCore(array, boundary + 1, endIndex);
    }
    
    /*
     * 交换并返回分界点
     * 
     * @param array
     *      待排序数组
     * @param startIndex
     *      开始位置
     * @param endIndex
     *      结束位置
     * @return
     *      分界点
     */
    private int boundary(int[] array, int startIndex, int endIndex) {
        int standard = array[startIndex]; // 定义标准
        int leftIndex = startIndex; // 左指针
        int rightIndex = endIndex; // 右指针
        
        while(leftIndex < rightIndex) {
            while(leftIndex < rightIndex && array[rightIndex] >= standard) {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];
            
            while(leftIndex < rightIndex && array[leftIndex] <= standard) {
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
        }
        
        array[leftIndex] = standard;
        return leftIndex;
    }

}
