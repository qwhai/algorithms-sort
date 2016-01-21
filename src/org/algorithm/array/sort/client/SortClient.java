package org.algorithm.array.sort.client;

import org.algorithm.array.sort.impl.MergeSort;
import org.algorithm.array.sort.interf.Sortable;
import org.utils.naga.containers.ArrayUtils;

public class SortClient {

    public static void main(String[] args) {
        int[] array = {34, 23, 76, 56, 54, 12, 34, 65, 45, 9, 8, 7, 6, 5};
//        int[] array = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Sortable sortable = new MergeSort();
        array = sortable.sort(array);
        
        ArrayUtils.show(array);
    }
}
