package depthFirstSearch;

/**
 * Created by weizhi on 2/20/17.
 */
public class findTargetSumWays {
    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        return countTarget(nums, S, 0);

    }
    public int countTarget(int[] nums, int S, int depth){
        if(depth==nums.length){
            if(S == 0){
                count +=1;
            }

        }
        if (depth<nums.length){
            countTarget(nums, S + nums[depth], depth +1);
            countTarget(nums, S - nums[depth], depth +1);
        }
        return count;
    }

}
