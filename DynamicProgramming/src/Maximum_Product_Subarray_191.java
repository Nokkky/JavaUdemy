
public class Maximum_Product_Subarray_191 {
    /**
     *
     * @return: An integer
     */

    // maximum subarray
    // f[n] = max {f[n-1] * n , n}
    //

    public static void main(String[] args){

        int[] array = {-3, 1, -2};
        System.out.println(maxProduct(array));
    }
    public static int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];

        int[] maxProduct = new int[nums.length];
        int[] minProduct = new int[nums.length];
        maxProduct[0] = nums[0];
        minProduct[0] = nums[0];

        for (int i = 1; i < nums.length; i++){

            // find the max product result


            if (maxProduct[i-1] * nums[i] > minProduct[i-1] * nums[i]){

                maxProduct[i] = maxProduct[i-1] * nums[i];
                minProduct[i] = minProduct[i-1] * nums[i];

            }else{
                minProduct[i] = maxProduct[i-1] * nums[i];
                maxProduct[i] = minProduct[i-1] * nums[i];
            }

            if (max < maxProduct[i]){
                max = maxProduct[i];
            }

            if (min > minProduct[i]){
                min = minProduct[i];
            }

        }

        if (max < min){
            max = min;
        }

        return max;
    }
}