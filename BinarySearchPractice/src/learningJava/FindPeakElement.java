package learningJava;

class FindPeakElement {
    /**
     * @param : An integers array.
     * @return: return any of peek positions.
     */

    public static void main(String[] args) {
        // write your code here
        int[] array = {1, 2, 3, 2, 4, 2, 3, 2, 1};
        System.out.println(findPeak(array));
        System.out.println(findPeak2(array));
    }
    public static int findPeak(int[] A) {
        // write your code here
        int start = 1, end = A.length-2; // 1.答案在之间，2.不会出界
        while(start + 1 <  end) {
            int mid = (start + end) / 2;
            if(A[mid] < A[mid - 1]) {
                end = mid;
            } else if(A[mid] < A[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if(A[start] < A[end]) {
            return end;
        } else {
            return start;
        }
    }
    /** Self code **/
    public static int findPeak2(int[] nums){
        // 0 < 1 .... n-1 > n
        int start = 0, end = nums.length - 1;
        while (end - start >= 2){  // start mid end

            int mid = start + (end - start)/2; // start mid end
            if (nums[mid] < nums[mid + 1]){
                start = mid;
            }else if (nums[mid] < nums[mid - 1]){
                end = mid;
            } else{ // else mid > mid - 1 && mid > mid + 1
                start = mid;
                end = mid;
            }
        }
        if (start == end){
            return start;
        }
        return start + 1;
    }
}
