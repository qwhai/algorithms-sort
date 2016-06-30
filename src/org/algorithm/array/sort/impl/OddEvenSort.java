package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;
import org.core.utils.containers.ArrayUtils;

/**
 * <p>
 * 奇偶排序算法
 * </p>
 * <p>
 * https://en.wikipedia.org/wiki/Odd%E2%80%93even_sort
 * </p>
 * 2016年1月21日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class OddEvenSort implements Sortable {

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
        boolean oddSorted = false;
        boolean evenSorted = false;
        
        while(!oddSorted || !evenSorted) {
            int base = 0;
            oddSorted = true;
            evenSorted = true;
            
            for (int i = base; i < arrayLength - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    ArrayUtils.swap(array, i, i + 1);
                    oddSorted = false;
                }
            }
            
            base = 1;
            for (int i = base; i < arrayLength - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    ArrayUtils.swap(array, i, i + 1);
                    evenSorted = false;
                }
            }
        }
    }
}
