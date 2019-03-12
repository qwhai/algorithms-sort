package _tools;

public class SortTools {

    public static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append((0 == i ? "" : ", ") + arr[i]);
        }

        System.out.println("[" + sb.toString() + "]");
    }

}
