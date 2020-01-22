package learningJava;

public class BinarySearch {

    /** HashSet space complexity is high**/

    public static void main(String[] arg){
        int[] array = {3,4,5,8,8,8,8,10,13,14};
        int target = 8;

//        int result = binarySearchRecursion(array, 0, array.length - 1, target);
//        if (array[result] == target){
//            System.out.println("Find target number at " + result);
//        }else {
//            System.out.println("Not find.");
//        }

        System.out.println(binarySearch(array,target));

    }

    public static int binarySearchRecursion(int[] array, int start, int end, int target){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if (array[mid] == target){
            return mid;
        }
        if (array[mid] < target){
            start = mid + 1;
        }
        if (array[mid] > target){
            end = mid - 1;
        }
        return binarySearchRecursion(array, start, end, target);
    }

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
                return moveForward(nums, mid, target);
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
            return moveForward(nums, start, target);
        }
        if (nums[end] == target) {
            return moveForward(nums, end, target);
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

}

