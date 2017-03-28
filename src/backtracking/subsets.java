//package backtracking;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by weizhi on 2/21/17.
// */
//public class subsets {
//    public List<List<Integer>> subsets(int[] nums){
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        if(nums.length==0) {
//            return result;
//        }
//
//
//    }
//
//    public List<List<Integer>> help(int[] nums, List<List<Integer>> result, List<Integer> currResult, int start){
//        if(!result.containsAll(currResult)){
//            result.add(currResult);
//        }
//
//        for(int i=start; i<nums.length; i++) {
//            int item = nums[i];
//         help(nums, result, currResult.add(5), start +1);
//        }
//    }
//}
