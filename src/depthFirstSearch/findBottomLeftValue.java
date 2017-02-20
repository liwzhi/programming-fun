package depthFirstSearch;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizhi on 2/20/17.
 */
public class findBottomLeftValue {

    /*
    DFS solution

 */
    int result = 0;
    int depth = 0;
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        result = root.val;
        help(root, 0);
        return result;

    }
    public void help(TreeNode root, int localDepth){
        if(root.left==null && root.right==null){
            if(depth<localDepth){
                result = root.val;
                depth = localDepth;
            }
        }
        if(root.left!=null){
            help(root.left, localDepth +1);

        }

        if(root.right!=null){
            help(root.right, localDepth +1);

        }
    }
    /*
        BFS solution

     */
    public int bfsFindBottomLeftValue(TreeNode root){

        if(root==null){
            return Integer.MIN_VALUE;
        }
        List<TreeNode> currLevel = new ArrayList<TreeNode>();
        int result = root.val;
        currLevel.add(root);
        while(currLevel.size()>0){
            List<TreeNode> nextLevel = new ArrayList<TreeNode>();
            List<Integer> value = new ArrayList<Integer>();
            for(TreeNode item:currLevel){
                if(item.left!=null){
                    nextLevel.add(item.left);
                    value.add(item.left.val);
                }
                if(item.right!=null){
                    nextLevel.add(item.right);
                    value.add(item.right.val);
                }
            }
            if(value.size()>0){
                result = value.get(0);
            }
            currLevel = nextLevel;

        }
        return result;
    }
}


