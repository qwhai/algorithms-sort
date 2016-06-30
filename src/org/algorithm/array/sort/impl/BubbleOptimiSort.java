package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;
import org.core.utils.containers.ArrayUtils;

/**
 * <p>
 * 冒泡排序算法优化版
 * </p>
 * 2016年1月27日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class BubbleOptimiSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        core(array);
        
        return array;
    }

    private void core(int[] array) {
        
        boolean status = true; // 记录是否发生交换信息
        int arrayLength = array.length;
        
        for (int i = 0; i < arrayLength && status; i++) {
            status = false;
            for (int j = arrayLength - 2; j >= i; j--) {
                if (array[j] > array[j + 1]) {
                    ArrayUtils.swap(array, j, j + 1);
                    ArrayUtils.show(array);
                    status = true;
                }
            }
        }
    }
}
