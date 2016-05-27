package org.algorithm.array.sort.client;

import org.algorithm.array.sort.impl.MergeImproveSort;
import org.algorithm.array.sort.impl.MergeSort;
import org.algorithm.array.sort.interf.Sortable;
import org.utils.naga.containers.ArrayUtils;

public class SortClient {

    public static void main(String[] args) {
//        int[] array = {34, 23, 76, 56, 54, 12, 34, 65, 45, 9, 8, 7, 6, 5};
//        int[] array = {34, 23, 98, 76, 56, 45};
//        int[] array = {23, 34, 54, 56, 76, 98};
        int[] array = { 4, 3, 6, 5, 9, 0, 8, 1, 7, 2 };
        int cycleTimes = 1000000;
        
        {
            long startStamp = System.currentTimeMillis();
            Sortable sortable = new MergeSort();
            
            for (int i = 0; i < cycleTimes; i++) {
                array = new int[]{ 4, 3, 6, 5, 9, 0, 8, 1, 7, 2 };
                sortable.sort(array);
            }
            ArrayUtils.show(array);
            System.out.println("MergeSort 用时：" + (System.currentTimeMillis() - startStamp) + " ms");
        }
        
        System.out.println("-------------------------------------");
        
        {
            long startStamp = System.currentTimeMillis();
            Sortable sortable = new MergeImproveSort();
            
            for (int i = 0; i < cycleTimes; i++) {
                array = new int[]{ 4, 3, 6, 5, 9, 0, 8, 1, 7, 2 };
                sortable.sort(array);
            }
            ArrayUtils.show(array);
            System.out.println("MergeImproveSort 用时：" + (System.currentTimeMillis() - startStamp) + " ms");
        }
    }
}
