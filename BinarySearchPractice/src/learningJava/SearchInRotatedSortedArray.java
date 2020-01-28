package learningJava;

public class SearchInRotatedSortedArray {
    /**
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0) return -1;

        // each time decrease the problem size to half;
        int start = 0, end = A.length - 1;
        // 1. position of mid
        // 2. position of target
        // move start -> mid
        //  [start mid target end] target > mid
        // move end -> mid
        //  [start target mid end]
        while (end - start >=2){
            int mid = start + (end - start)/2; //
            //
            if (A[mid] == target) return mid;

            // mid at lower part.
            if (A[mid] <= A[end]){

                if (A[mid] < target && target <= A[end]){
                    start = mid;
                }else{
                    end = mid;
                };
                // (A[mid] > A[end]) mid at upper part
            }else {

                if ( target >= A[start] && target < A[mid]){
                    end = mid;
                }else {
                    start = mid;
                }
            };
        }

        if (A[start] == target) return start;
        if (A[end] == target) return end;
        return -1;
    }
}
