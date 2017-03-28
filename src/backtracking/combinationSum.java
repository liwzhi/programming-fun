package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizhi on 2/21/17.
 */
public class combinationSum {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> currList = new ArrayList<Integer>();
        backTracking(candidates, target, currList, 0);
        return result;

    }
    public void backTracking(int[] candidates, int target, List<Integer> currList, int currSum){
        if(target == currSum){
            result.add(currList);
        }

        if(target>currSum){
            for(int i = 0; i< candidates.length; i++){
                int item = candidates[i];
                currList.add(item);
                backTracking(candidates, target, currList, currSum + item);
                currList.remove(currList.size()-1);
            }
        }

    }
}
