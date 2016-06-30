package org.algorithm.array.sort.impl;

import org.core.utils.containers.ArrayUtils;
import org.core.utils.sort.interf.Sortable;

/**
 * <p>
 * 堆排序策略
 * </p>
 * 2015年12月15日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/
 *      lemon_tree12138</a>
 * @version 0.1.1
 */
public class HeapSort_0 implements Sortable {

    public static void main(String[] args) {
        int[] array = {34, 23, 76, 56, 54, 12, 34, 65, 45, 9, 8, 7, 6, 5};
        HeapSort_0 sort = new HeapSort_0();
        sort.sort(array);
        
        ArrayUtils.show(array);
    }
    
    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        MaxHeap h = new MaxHeap();
        h.init(array);

        for (int i = 0; i < array.length; i++) {
            h.remove();
        }

        System.arraycopy(h.queue, 1, array, 0, array.length);

        return array;
    }

    /**
     * <p>
     * 最大堆
     * </p>
     * 2015年12月15日
     * 
     * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
     * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
     * @version 0.1
     */
    private static class MaxHeap {

        void init(int[] data) {
            this.queue = new int[data.length + 1];
            for (int i = 0; i < data.length; i++) {
                queue[++size] = data[i];
                fixUp(size);
            }
        }

        private int size = 0;

        private int[] queue;

        public void remove() {
            ArrayUtils.swap(queue, 1, size--);
            fixDown(1);
        }

        // fixdown
        private void fixDown(int k) {
            int j;
            while ((j = k << 1) <= size) {
                if (j < size && queue[j] < queue[j + 1]) {
                    j++;
                }

                // 不用交换
                if (queue[k] > queue[j]) {
                    break;
                }

                ArrayUtils.swap(queue, j, k);
                k = j;
            }
        }

        private void fixUp(int k) {
            while (k > 1) {
                int j = k >> 1;
                if (queue[j] > queue[k]) {
                    break;
                }

                ArrayUtils.swap(queue, j, k);
                k = j;
            }
        }
    }
}
