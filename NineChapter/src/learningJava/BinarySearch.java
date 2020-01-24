package learningJava;

public class BinarySearch {

    /** HashSet space complexity is high**/

    public static void main(String[] arg){
        int[] array = {4};
        int target = 3;
        System.out.println(findPosition(array, target));
    }
    /** return random posotion of target number **/
    public static int findPosition(int[] nums, int target) {
        // write your code here
        if (nums == null) return -1;
        if (nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;

        while( end - start >= 2){

            // find the middle position Number
            int mid = start + (end - start)/2; // start < mid < end;

            if (nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid;
            }
            if(nums[mid] > target){
                end = mid;
            }
        }

        if(nums[start] == target){
            return start;
        }
        if(nums[end] == target){
            return end;
        }
        return -1;
    }
    /** return last position of target number **/
    public int lastPosition(int[] nums, int target) {
        // write your code here
        if (nums == null) return -1;
        if (nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;
        while(end - start >= 2){
            int mid = start + (end - start)/2; // start < mid < end;
            if (nums[mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }
        if (nums[end] == target){
            return end;
        }
        if (nums[start] == target){
            return start;
        }
        return -1;
    }

    /** return first position of target number **/
    // similar to lastPosition.

    /** Recursion version of binarySearch **/
    public static int binarySearchRecursion(int[] nums, int start, int end, int target){
        if (end - start < 2){
            if (nums[end] == target){
                return end;
            };
            if(nums[start] == target){
                return start;
            }
            return -1;
        }
        int mid = start + (end - start)/2;

        if (nums[mid] > target){
            end = mid;
        }else{
            start = mid;
        }
        return binarySearchRecursion(nums, start, end, target);
    }

    /** template form NineChapter **/
    public static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        int position;
        // 要点1: start + 1 < end
        while (start + 1 < end) {
            // 要点2：start + (end - start) / 2
            int mid = start + (end - start) / 2;
            // 要点3：=, <, > 分开讨论，mid 不+1也不-1
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid;
            }
            if (nums[mid] > target) {
                end = mid;
            }
        }

        // 要点4: 循环结束后，单独处理start和end
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }

        return -1;
    }

    /** Naive code for findFirstPosition
    public static int findFirstPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        int position;
        // 要点1: start + 1 < end
        while (start + 1 < end) {
            // 要点2：start + (end - start) / 2
            int mid = start + (end - start) / 2;
            // 要点3：=, <, > 分开讨论，mid 不+1也不-1
            if (nums[mid] == target) {
                end = mid;
            }
            if (nums[mid] < target) {
                start = mid;
            }
            if (nums[mid] > target) {
                end = mid;
            }
        }

        // 要点4: 循环结束后，单独处理start和end
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }

        return -1;
    }

    public static int moveForward(int[] nums, int position, int target){
        if (nums[position] == target) {
            while (position - 1 >= 0){
                if (nums[position - 1] != target) {
                    break;
                }
                position--;
            };
        }
        return position;
    }
    **/

}

