package bogo;

import interf.SortImpl;

import java.util.Random;

/**
 * @Author: Q-WHai
 * @Date: Created in 17:30 2019/03/13
 */
public class BogoSort extends SortImpl {

    @Override
    public void sort(int[] arr) {
        if (null == arr) return;
        int[] result = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            result[j] = arr[j];
        }

        boolean f;
        do {
            result = bogo(result);
            f = sorted(result);
        } while (!f);

        for (int j = 0; j < result.length; j++) {
            arr[j] = result[j];
        }
    }

    private int[] bogo(int[] arr) {
        Random random = new Random();
        int[] result = new int[arr.length];
        int i = 0, boundary = arr.length;
        while (0 < boundary) {
            int index = random.nextInt(boundary);
            result[i] = arr[index];
            move(arr, index, boundary);
            i++; boundary--;
        }

        return result;
    }

    private boolean sorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }

        return true;
    }

    private void move(int[] arr, int i, int boundary) {
        for (int j = i + 1; j < boundary; j++) {
            arr[j - 1] = arr[j];
        }
    }
}
