package learningJava;

public class MaxNumInMountainSequence {
    /**
     * @param nums: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     *
     * Time complexity is log(n)
     */
    public int mountainSequence(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;

        while (end - start >= 2){

            int mid = start + (end - start)/2;
            // mid point at left part
            if (nums[mid] > nums[mid + 1]){
                end = mid;
            }
            // mid point at right part
            if (nums[mid] < nums[mid + 1]){
                start = mid;
            }
        }
        if (nums[start] > nums[end]){
            return nums[start];
        }

        return nums[end];
    }
}