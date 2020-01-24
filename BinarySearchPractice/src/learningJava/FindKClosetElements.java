package learningJava;

public class FindKClosetElements {
    /**
     * @param A: an integer array
     * @param target: An integer
     * @param k: An integer
     * @return: an integer array
     */
    public int[] kClosestNumbers(int[] A, int target, int k) {
        // write your code
        int start = 0, end = A.length - 1;
        while(end - start >= 2){
            int mid = start + (end - start)/2; // start < mid < end;

            if (A[mid] == target){
                start = mid;
                end = mid + 1;
                break;
            };
            if (A[mid] > target){
                end = mid;
            };
            if (A[mid] < target){
                start = mid;
            };

        };

        // A[start] <= target <= A[end]
        int countNumber = 0;
        int[] ans = new int[k];
        // Find k closest numbers.
        while (countNumber <= k-1 ){

            // store the smller and closer number first. A[start]
            int difStart = Integer.MAX_VALUE, difEnd = Integer.MAX_VALUE;

            if (start >= 0){
                difStart = target - A[start];
            }
            if (end <= A.length -1){
                difEnd = A[end] - target;
            }

            if (difStart <= difEnd){
                ans[countNumber] = A[start];
                start--;
            }else{
                ans[countNumber] = A[end];
                end++;
            }

            countNumber ++;
        }

        return ans;
    }
}
