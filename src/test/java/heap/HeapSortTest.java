package heap;

import _tools.SortTools;
import interf.SortImpl;
import org.junit.Test;

public class HeapSortTest {

    @Test
    public void testSort() {
        int[] arr = new int[] { 34, 23, 76, 56, 54, 12, 34, 65, 45, 9, 8, 7, 6, 5 };

        System.out.println("正在测试 Heap Sort");

        SortImpl sortable = new HeapSort();
        sortable.sort(arr);

        SortTools.printArray(arr);
    }
}
