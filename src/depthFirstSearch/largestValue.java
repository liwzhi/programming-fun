package depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizhi on 2/20/17.
 */
public class largestValue {
    public List<Integer> largetValue(TreeNode root){
        if(root==null){
            return null;
        }
        List<Integer> result = new ArrayList<Integer>();
        List<TreeNode> currLevel = new ArrayList<TreeNode>();
        currLevel.add(root);
        result.add(root.val);

        while(currLevel.size()>0){
            List<TreeNode> nextLevel = new ArrayList<TreeNode>();
            boolean flag = false;
            int maxValue = Integer.MIN_VALUE;
            for(TreeNode item:currLevel){
                flag = true;
                if(item.left!=null){
                    nextLevel.add(item.left);
                    maxValue = Math.max(item.left.val, maxValue);
                }
                if(item.right!=null){
                    nextLevel.add(item.right);
                    maxValue = Math.max(item.right.val, maxValue);
                }

            }
            if(flag){
                result.add(maxValue);
            }
            currLevel = nextLevel;


        }
        return result;
    }
}
