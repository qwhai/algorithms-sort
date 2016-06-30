package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;
import org.core.utils.containers.ArrayUtils;

/**
 * <p>
 * 冒泡排序(双向冒泡)
 * </p>
 * 2016年1月19日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class BubbleBothwaySort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        core(array);
        
        return array;
    }

    private void core(int[] array) {
        int arrayLength = array.length;
        
        int preIndex = 0;
        int backIndex = arrayLength - 1;
        while(preIndex < backIndex) {
            preSort(array, arrayLength, preIndex);
            preIndex++;
            
            ArrayUtils.show(array);
            if (preIndex >= backIndex) {
                break;
            }
            
            backSort(array, backIndex);
            backIndex--;
            
            ArrayUtils.show(array);
        }
    }
    
    // 从前向后排序
    private void preSort(int[] array, int length, int preIndex) {
        for (int i = preIndex + 1; i < length; i++) {
            if (array[preIndex] > array[i]) {
                ArrayUtils.swap(array, preIndex, i);
            }
        }
    }
    
    // 从后向前排序
    private void backSort(int[] array, int backIndex) {
        for (int i = backIndex - 1; i >= 0; i--) {
            if (array[i] > array[backIndex]) {
                ArrayUtils.swap(array, i, backIndex);
            }
        }
    }
}
