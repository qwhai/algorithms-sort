package org.algorithm.array.sort.client;

import org.algorithm.array.sort.impl.SelectInsert;
import org.algorithm.array.sort.interf.Sortable;
import org.utils.naga.containers.ArrayUtils;

public class SortClient {

    public static void main(String[] args) {
        int[] array = {34, 23, 98, 76, 56, 54, 90, 12, 34, 65, 45, 78};
        Sortable sortable = new SelectInsert();
        array = sortable.sort(array);
        
        ArrayUtils.show(array);
    }
}
