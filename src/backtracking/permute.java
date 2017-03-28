package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizhi on 3/2/17.
 */
public class permute {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length==0){
            return result;

        }
        List<Boolean> flag = new ArrayList<Boolean>();
        for(int i=0;i<nums.length; i++){
            flag.add(true);
        }
        List<Integer> currResult = new ArrayList<Integer>();
        return recursion(nums, result, currResult, flag);

    }
    public List<List<Integer>> recursion(int[] nums, List<List<Integer>> result, List<Integer> currResult, List<Boolean> flag){
        if(currResult.size()==nums.length){
            result.add(currResult);
        }
        if(currResult.size()<nums.length){
            for(int i= 0; i<nums.length; i++){
                if (flag.get(i)){
                    currResult.add(nums[i]);
                    flag.add(i, false);
                    recursion(nums, result, currResult, flag);
                    flag.add(i, true);
                    currResult.remove(i);
                }

            }
        }
        return result;
    }
}
