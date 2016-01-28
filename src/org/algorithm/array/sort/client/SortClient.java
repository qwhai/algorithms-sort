package org.algorithm.array.sort.client;

import org.algorithm.array.sort.impl.BubbleBothwaySort;
import org.algorithm.array.sort.impl.BubbleOptimiSort;
import org.algorithm.array.sort.impl.BubbleSort;
import org.algorithm.array.sort.impl.BubbleStandardSort;
import org.algorithm.array.sort.interf.Sortable;
import org.utils.naga.containers.ArrayUtils;

public class SortClient {

    public static void main(String[] args) {
//        int[] array = {34, 23, 76, 56, 54, 12, 34, 65, 45, 9, 8, 7, 6, 5};
//        int[] array = {34, 23, 98, 76, 56, 45};
//        int[] array = {23, 34, 54, 56, 76, 98};
        int[] array = {6, 5, 4, 3, 2, 1};
        Sortable sortable = new BubbleBothwaySort();
        array = sortable.sort(array);
        
//        ArrayUtils.show(array);
    }
}
