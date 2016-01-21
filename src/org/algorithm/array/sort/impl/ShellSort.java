package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;

/**
 * <p>
 * 希尔排序算法
 * </p>
 * 2016年1月20日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class ShellSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        core(array);
        
        return array;
    }

    // 希尔排序的核心模块
    private void core(int[] array) {
        int arrayLength = array.length;
        int step = arrayLength / 2;
        do {
            for (int i = 0; i < step; i++) {
                insert(array, i, step);
            }
            step /= 2;
        } while (step > 0);
    }
    
    // 希尔排序的直接插入排序
    private void insert(int[] array, int offset, int step) {
        int groupCount = array.length / step + (array.length % step > offset ? 1 : 0);
        for (int i = 1; i < groupCount; i++) {
            int nextIndex = offset + step * i;
            int waitInsert = array[nextIndex];
            
            while(nextIndex - step >= 0 && waitInsert < array[nextIndex - step]) {
                array[nextIndex] = array[nextIndex - step];
                nextIndex -= step;
            }
            
            array[nextIndex] = waitInsert;
        }
    }
}
