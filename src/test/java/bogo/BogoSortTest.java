package bogo;

import _tools.SortTools;
import interf.SortImpl;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 14:35 2019/03/14
 */
public class BogoSortTest {

    @Test
    public void test1() {
        int[] arr = new int[] { 34, 23, 76, 5 };

        System.out.println("正在测试 Bogo Sort");

        SortImpl sortable = new BogoSort();
        sortable.sort(arr);

        SortTools.printArray(arr);
    }
}
