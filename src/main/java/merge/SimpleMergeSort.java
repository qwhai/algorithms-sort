package merge;

import interf.SortImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 弱分治归并
 */
public class SimpleMergeSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        List<List<Integer>> list = transform(arr); // 这里没有使用二维数组的原因是：可能存在长度不等的子数组
        merge(list, arr);
    }

    /**
     * 基于递归的核心合并算法
     */
    private void merge(List<List<Integer>> list, int[] result) {
        if (list.size() == 1) {
            for (int i = 0; i < list.get(0).size(); i++) {
                result[i] = list.get(0).get(i);
            }
            return;
        }

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            lists.add((list.size() == i + 1) ? list.get(i) : merge2(list.get(i), list.get(i + 1)));
        }

        merge(lists, result);
    }

    /**
     * 合并两个有序 List
     *
     * @param l1
     *      有序 List l1
     * @param l2
     *      有序 List l2
     * @return
     *      有序序列
     */
    private List<Integer> merge2(List<Integer> l1, List<Integer> l2) {
        List<Integer> l3 = new ArrayList<>();
        int i1 = 0, i2 = 0;
        while (i1 < l1.size() && i2 < l2.size()) {
            int e1 = l1.get(i1), e2 = l2.get(i2);
            l3.add(e1 < e2 ? e1 : e2);
            i1 += e1 < e2 ? 1 : 0;
            i2 += e1 < e2 ? 0 : 1;
        }

        append(l3, i1 == l1.size() ? l2 : l1, i1 == l1.size() ? i2 : i1);

        return l3;
    }

    /**
     * 从 l2 的第 start 位开始，追加到 l1 的末尾
     *
     * @param l1
     *      有序 List
     * @param l2
     *      有序 List
     * @param start
     *      起始位置
     */
    private void append(List<Integer> l1, List<Integer> l2, int start) {
        for (; start < l2.size(); start++) {
            l1.add(l2.get(start));
        }
    }

    /**
     * 将一维数组转换成 n 组只包含一个数字List 的 List组
     *
     * @param arr
     *      待转换数组
     * @return
     *      只包含一个数字List 的 List组
     */
    private List<List<Integer>> transform(int[] arr) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i : arr) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            lists.add(list);
        }

        return lists;
    }
}
