package divide_conquer;

/**
 * Created by weizhi on 2/1/17.
 */
public class maximum_sub_array {
    public int maxSubArray(int[] nums){
        if (nums.length==0)
            return Integer.MIN_VALUE;
        int local_value = 0;
        int max_value = nums[0];
        for(int item:nums){
            if (local_value>=0){
                local_value = local_value + item;

            }
            else{
                local_value = item;
            }
            max_value = Math.max(local_value, max_value);


        }
        return max_value;


    }
}
