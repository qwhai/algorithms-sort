package interf;

public class SortImpl implements Sortable {

    @Override
    public void sort(int[] array) { }

    protected void swap(int[] array, int i, int j){
        array[i] += array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
