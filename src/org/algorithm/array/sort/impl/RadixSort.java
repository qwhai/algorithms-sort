package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;

/**
 * <p>
 * 基数排序/桶排序
 * </p>
 * 2016年1月19日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class RadixSort implements Sortable {
    
    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        int maxLength = maxLength(array);
        
        return sortCore(array, 0, maxLength);
    }

    private int[] sortCore(int[] array, int digit, int maxLength) {
        if (digit >= maxLength) {
            return array;
        }
        
        final int radix = 10; // 基数
        int arrayLength = array.length;
        int[] count = new int[radix];
        int[] bucket = new int[arrayLength];
        
        // 统计将数组中的数字分配到桶中后，各个桶中的数字个数
        for (int i = 0; i < arrayLength; i++) {
            count[getDigit(array[i], digit)]++;
        }
        
        // 将各个桶中的数字个数，转化成各个桶中最后一个数字的下标索引
        for (int i = 1; i < radix; i++) {
            count[i] = count[i] + count[i - 1];
        }
        
        // 将原数组中的数字分配给辅助数组bucket
        for (int i = arrayLength - 1; i >= 0; i--) {
            int number = array[i];
            int d = getDigit(number, digit);
            
            bucket[count[d] - 1] = number;
            
            count[d]--;
        }
        
        return sortCore(bucket, digit + 1, maxLength);
    }
    
    /*
     * 一个数组中最数字的位数
     * 
     * @param array
     * @return
     */
    private int maxLength(int[] array) {
        int maxLength = 0;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            int currentLength = length(array[i]);
            if (maxLength < currentLength) {
                maxLength = currentLength;
            }
        }
        
        return maxLength;
    }
    
    /*
     * 计算一个数字共有多少位
     * 
     * @param number
     * @return
     */
    private int length(int number) {
        return String.valueOf(number).length();
    }
    
    /*
     * 获取x这个数的d位数上的数字
     * 比如获取123的0位数，结果返回3
     * 
     * @param x
     * @param d
     * @return
     */
    private int getDigit(int x, int d) {
        int a[] = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
        return ((x / a[d]) % 10);
    }
}
