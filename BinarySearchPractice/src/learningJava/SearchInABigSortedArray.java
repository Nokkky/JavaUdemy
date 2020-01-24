package learningJava;

public class SearchInABigSortedArray {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return: An integer which is the first index of target.
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {

        // write your code here
        int start = 0, end = 1;
        int Max = 2_147_483_647;
        // First find the range is [end/2, end] -> array[end/2] < target && array[end] >= target;
        while (reader.get(end) < target && reader.get(end) != Max){
            start = end;
            end *= 2;
        };
        // assert the end pointer is valid.
        while (reader.get(end) == Max){
            end--;
        };
        // using binary search find first target at (start end].
        while (end - start >= 2){
            int mid = start + (end - start)/2;
            if (reader.get(mid) >= target){
                end = mid;
            };
            if (reader.get(mid) < target){
                start = mid;
            };
        };

        if (reader.get(start) == target){
            return start;
        };
        if (reader.get(end) == target){
            return end;
        };

        return -1;

    }
}
