package divide_conquer;

/**
 * Created by weizhi on 2/1/17.
 */
public class jump_index_2{
    public int jump(int[] nums){
        if (nums.length==0){
            return 0;
        }
        int local_max = nums[0];
        int arrayLength = nums.length;
        if (local_max>=arrayLength){
            return 1;
        }
        int count = 1;
        for (int i = 1; i<arrayLength; i++){
            int max_steps = Math.max(local_max-1,nums[i]);
            int left_length = arrayLength - i-1;
            if (local_max-1<=nums[i]){
                count +=1;

            }
            if (max_steps>=left_length){
                break;
            }

        }
        return count;
    }
}