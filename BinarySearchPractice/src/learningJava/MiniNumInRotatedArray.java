package learningJava;

public class MiniNumInRotatedArray {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;

        while (end - start >= 2){

            int mid = start + (end - start)/2; // start < mid < end

            if (nums[mid] <= nums[end] ){
                end = mid;
            }
            if (nums[mid] > nums[end]){
                start = mid;
            }
        }

        if (nums[start]< nums[end]) return nums[start];

        return nums[end];

    }
}
