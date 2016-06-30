package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;
import org.core.utils.containers.ArrayUtils;

/**
 * <p>
 * 初级版冒泡排序(单向冒泡)
 * [简单的交换排序]
 * </p>
 * 2016年1月19日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class SampleSwapSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i] > array[j]) {
                    ArrayUtils.swap(array, i, j);
                }
            }
            ArrayUtils.show(array);
        }
        
        return array;
    }
    
}
