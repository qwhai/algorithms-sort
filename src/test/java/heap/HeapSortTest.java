package heap;

import _tools.SortTools;
import interf.SortImpl;
import org.apache.log4j.Logger;
import org.junit.Test;

public class HeapSortTest {

    private final Logger logger = Logger.getLogger(HeapSort.class);

    @Test
    public void testSort1() {
        int[] arr = new int[] { 34, 23, 76, 56, 54, 12, 34, 65, 45, 9, 8, 7, 6, 5 };

        logger.info("正在测试 Heap Sort");

        SortImpl sortable = new HeapSort();
        sortable.sort(arr);

        logger.info("排序结束，结果：");
        SortTools.printArray(arr);
    }

    @Test
    public void testSort2() {
        int[] arr = new int[] { 16, 7, 3, 20, 17, 8 };

        logger.info("正在测试 Heap Sort");

        SortImpl sortable = new HeapSort();
        sortable.sort(arr);

        logger.info("排序结束，结果：");
        SortTools.printArray(arr);
    }
}
