package learningJava;

public class QuickSort {

    public static void main(String[] args) {
        // write your code here
        // partition
        // swap
        // less than
        int[] array = {3, 3, 2, 3};
        quickSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
//        assert isSorted(array);
    }

    public static void quickSort(int[] array, int lo, int hi){
        if (hi <= lo) return;
        // pivotIndex = 3
        int pivotIndex = partition(array, lo, hi);
        quickSort(array,lo,pivotIndex - 1);
        quickSort(array, pivotIndex + 1, hi);
    }

    public static int partition(int[] array, int lo, int hi){
        // i = lo ,j = hi because we need to scan all position.
        int i = lo;
        int j = hi; // why?
        int pivot = array[lo];
        while(true){
            while (i < hi) {
                // Find position that array[i] > pivot
                if (!lessOrEqual(array[i], pivot)) break;
                i++;
            }
            while (lo < j) {
                // Find position that array[j] < pivot
                if (!lessOrEqual(pivot, array[j])) break;
                j--;
            };
            // if we have scanned all array we finish the partition process.
            if (i >= j) break;
            // if we do not scan all array, do partition.
            exch(array, i, j);
        }
        // put the pivot element at right position
            // because we use a[lo] as pivot, we put smaller or equal element to left.
        exch(array, lo, j);

        return j;
    }

    public static boolean lessOrEqual(int smaller, int larger){
        return (smaller <= larger);
    }

    public static void exch(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
